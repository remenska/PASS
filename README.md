PASS
=========

## Property ASSistant

Developing correct concurrent software is challenging. Design errors 
can result in deadlocks, race conditions and livelocks, and discovering these is
difficult. Approaches for automatically generating formal models from system
designs have been proposed and successfully used in industry. A serious obstacle
for an industrial uptake of rigorous analysis techniques such as model checking is
the steep learning curve associated to the languages—typically temporal logics—
used for specifying the application-specific properties to be checked. To bring the
process of correctly eliciting functional properties closer to software engineers,
we introduce PASS, a Property ASSistant wizard as part of a UML-based front-end to the mCRL2 toolset. PASS instantiates pattern templates using three notations: a natural language summary, a μ-calculus formula and a UML sequence diagram depicting the desired behavior. Most approaches to date have focused on LTL, which is a state-based formalism. Conversely, μ-calculus is event-based, making it a good match for sequence diagrams, where communication between components is depicted. 
Last but not least, we automatically generate monitors based on a mu-calculus formula, which can be used for property-driven on-the-fly model
checking using the standard state-space exploration facilities of mCRL2. 


PASS is developed as an Eclipse plug-in (only around 5k loc), so you can easily install it by adding the .jar file to your ECLIPSE_HOME/plugins directory.

Launching PASS is easy:

![launch PASS](https://raw.github.com/remenska/PASS/master/screenshots/PASSlaunch.png)

But before you do that, perhaps add the ProfilePropSpec.epx profile to your model:

Select the model, go to the Properties tab, and click on "Add Profile":

![Add Profile](https://raw.github.com/remenska/PASS/master/screenshots/AddProfile.png)

Just select the profile from a file (ProfilePropSpec.epx is in this repository), click OK,  and you're done!

![Select Profile](https://raw.github.com/remenska/PASS/master/screenshots/SelectProfile.png)


Screenshots
-----------

Click to view.

[![mutt dark](https://raw.github.com/remenska/PASS/master/screenshots/thumbnails/Introduction.png)](https://raw.github.com/remenska/PASS/master/screenshots/Introduction.png)
[![mutt dark](https://raw.github.com/remenska/PASS/master/screenshots/thumbnails/ScopeSelection.png/)](https://raw.github.com/remenska/PASS/master/screenshots/ScopeSelection.png)
[![mutt dark](https://raw.github.com/remenska/PASS/master/screenshots/thumbnails/PasspopupWin.png)](https://raw.github.com/remenska/PASS/master/screenshots/PasspopupWin.png)
[![mutt dark](https://raw.github.com/remenska/PASS/master/screenshots/thumbnails/Summary.png)](https://raw.github.com/remenska/PASS/master/screenshots/Summary.png)
[![mutt dark](https://raw.github.com/remenska/PASS/master/screenshots/thumbnails/GeneratedSequenceDiagram.png)](https://raw.github.com/remenska/PASS/master/screenshots/GeneratedSequenceDiagram.png)

See also the [mCRL2 site](http://www.mcrl2.org/release/user_manual/index.html) and the [LTSmin toolset one](http://fmt.cs.utwente.nl/tools/ltsmin/).

#### Q: I don't care about UML. I already have the model and just want to get a formula and a monitor for my property. I don't know how to construct it.

A: OK, we have a solution: use [PASS Web Start](http://www.nikhef.nl/~danielar/PASSWebStart/PASSWebStart.jnlp). It's work in progress. For now it should work with Linux, all you need is J2SE1.5+. Please report any feedback to: remenska nospam gmail.com
