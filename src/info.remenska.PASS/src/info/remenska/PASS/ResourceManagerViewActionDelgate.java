package info.remenska.PASS;

import info.remenska.PASS.wizards.CapturePropertyWizard;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;

import com.ibm.xtools.modeler.ui.UMLModeler;

public class ResourceManagerViewActionDelgate implements IViewActionDelegate {

	private IViewPart view;

	@Override
	public void run(IAction action) {

		//
		// MessageBox box = new
		// MessageBox(view.getSite().getShell(),SWT.ICON_INFORMATION);
		// box.setMessage("Hello you! You clicked view action!");
		// box.open();

		// InputDialog dialog = new
		// InputDialog(view.getSite().getShell(),"Let's try!",
		// "Please enter your name","",null);
		// if (dialog.open() == IStatus.OK){
		// String value = dialog.getValue();
		// MessageBox box = new
		// MessageBox(view.getSite().getShell(),SWT.ICON_INFORMATION);
		// box.setMessage("Hey there! You entered: " + value);
		// box.open();
		//
		// } else{
		//
		// MessageBox box = new
		// MessageBox(view.getSite().getShell(),SWT.ICON_INFORMATION);
		// box.setMessage("Bye!");
		// box.open();
		//
		// }

		List selectedElements = UMLModeler.getUMLUIHelper()
				.getSelectedElements();
		Model model = null;
		boolean profileApplied = false;
		for (Iterator iter = selectedElements.iterator(); iter.hasNext();) {

			EObject eObject = (EObject) iter.next();
			String eClassName = eObject.eClass().getName();
//			System.out.print(eClassName + " : ");
			if (eObject instanceof Model) {
				// System.out.println("You selected the right thing: " +
				// ((Model) eObject).getName());
				model = ((Model) eObject);
//				System.out.println(model.getAllAppliedProfiles());
				EList<Profile> appliedProfiles = model.getAllAppliedProfiles();
				for(Profile profile:appliedProfiles){
					if(profile.getName().equals("ProfilePropertySpecs"))
						profileApplied = true;
				}
			}
		}
		if (model == null) {
			System.out
					.println("Please select a UML model and open it, before attempting to run PASS. "); //$NON-NLS-1$
//			System.exit(0);
		} else if(!profileApplied){
			System.out.println("Pease apply the profile <ProfilePropertySpecs> to avoid problems when generating the SD. \n Consult the GitHub instructions on how to do it.");
		}
		
		else {
			CapturePropertyWizard wizard = new CapturePropertyWizard();
			WizardDialog dialog = new WizardDialog(view.getSite().getShell(),
					wizard);
			dialog.create();
			dialog.open();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IViewPart view) {
		this.view = view; // cache the view part, this will be used in run
							// action
							// to fetch the parent shell for dialog
	}

}
