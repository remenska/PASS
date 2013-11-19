package info.remenska.PASS.actions;

import java.util.Iterator;
import java.util.List;

import info.remenska.PASS.wizards.CapturePropertyWizard;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.uml2.uml.Model;

import com.ibm.xtools.modeler.ui.UMLModeler;

public class OpenResourceManagerViewActionDelegate implements
		IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	public static final String ID = "info.remenska.PASS.views.ResourceManagerView";

	@Override
	public void run(IAction action) {
//		
//		IWorkbenchPage page = window.getActivePage();
//		
//		try {
//			page.showView(ID);
//			
//		} catch (PartInitException e){
//			
//		}
// Hmmm let's change it to show the wizard instead of the view :)
		List selectedElements = UMLModeler.getUMLUIHelper()
				.getSelectedElements();
		Model model = null;
		for (Iterator iter = selectedElements.iterator(); iter.hasNext();) {

			EObject eObject = (EObject) iter.next();
			String eClassName = eObject.eClass().getName();
			System.out.print(eClassName + " : ");

			if (eObject instanceof Model) {
				// System.out.println("You selected the right thing: " +
				// ((Model) eObject).getName());
				model = ((Model) eObject);
			}
		}
		if (model == null) {
			System.out
					.println("Please select a UML model and open it, before attempting to run PASS. "); //$NON-NLS-1$
//			System.exit(0);
		} else {
			CapturePropertyWizard wizard = new CapturePropertyWizard();
			WizardDialog dialog = new WizardDialog(window.getShell(),
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
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		this.window = window; // cache the window object in which action delegate is operating
	}

}
