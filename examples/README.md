We followed this recipe to check for the property:
        $ ./mcrl22lps -vfoblstack ExecutorsFrameworkNFM_bugFix_withMonitor.mcrl2 | ./lpsrewr > ExecutorsFrameworkNFM_bugFix_withMonitor.lps
        $ ./lps-reach --action=error --saturation=sat-like --save-sat-levels --mcrl2-readable-edge-labels --trace=witness.2.gcf --order=chain ExecutorsFrameworkNFM_bugFix_withMonitor.lps -rgs


*   **Full Git Repository:**

    The full git repository is at: <https://github.com/altercation/solarized>
    Get it using the following command:

        $ git clone git://github.com/altercation/solarized.git
        $  ./lps-reach --action=error --saturation=sat-like --save-sat-levels --mcrl2-readable-edge-labels --trace=witness.2.gcf --order=chain ExecutorsFrameworkNFM_bugFix_withMonitor.lps -rgs
