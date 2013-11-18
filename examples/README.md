*   **We followed this recipe to check for the property:**

        $ mcrl22lps -vfoblregular2 --timings=ExFrMon2.mcrl22lps ExecutorsFrameworkNFM_bugFix_withMonitor.mcrl2 | lpsrewr | lpssumelm -cv --timings=ExFrMon2.lpssumelm | lpsconstelm -vst --timings=ExFrMon2.lpsconstelm > ExFrMon2.lps; time lps2lts-sym --order=chain-prev --action=error --save-sat-levels --saturation=sat-like -rga ExFrMon2.lps

      ...and here's the verdict:

        [...]
        lps2lts-sym: Exploration took 233366 group checks and 233366 next state calls
        lps2lts-sym: reachability took 680.430 real 670.720 user 9.680 sys
        lps2lts-sym: Action "error" not found
        lps2lts-sym: state space has 2850325 (~2.85e+06) states, 2203731 BDD nodes

    See also the [mCRL2 site](http://www.mcrl2.org/release/user_manual/index.html) and the [LTSmin toolset one](http://fmt.cs.utwente.nl/tools/ltsmin/).