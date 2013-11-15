*   **We followed this recipe to check for the property:**

        $ ./mcrl22lps -vfoblstack ExecutorsFrameworkNFM_bugFix_withMonitor.mcrl2 | ./lpsrewr > ExecutorsFrameworkNFM_bugFix_withMonitor.lps
        $ ./lps-reach --action=error --saturation=sat-like --save-sat-levels --mcrl2-readable-edge-labels --trace=witness.2.gcf --order=chain ExecutorsFrameworkNFM_bugFix_withMonitor.lps -rgs

    ...and here's the verdict:
        [...]
        lps-reach: visited 0 has 2850325 (~2.85e+06) states ( 847127 nodes )
        lps-reach: Exploration took 163709 group checks and 163709 next state calls
        lps-reach: reachability took 6500.790 real 6496.390 user 1.450 sys
        lps-reach: Action "error" not found
        lps-reach: state space has 2850325 (~2.85e+06) states
        lps-reach: ( 847127 final BDD nodes; 850181 peak nodes )

    See also the [mCRL2 site](http://www.mcrl2.org/release/user_manual/index.html) and the [LTSmin toolset one](http://fmt.cs.utwente.nl/tools/ltsmin/).