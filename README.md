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

PASS is developed as an Eclipse plug-in, so you can easily install it by adding the .jar file to your ECLIPSE_HOME/plugins directory.

Launching PASS is easy:

![launch PASS](https://raw.github.com/remenska/PASS/master/screenshots/PASSlaunch.png)