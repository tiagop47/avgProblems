package leetCode;

import java.util.List;


public class fourSum {

    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        // o m+1 e n+1 é pq precisamos de validar o CASO BASE
        boolean[][] tpBoolean = new boolean[m + 1][n + 1];

        // Caso base: strings vazias
        tpBoolean[0][0] = true;

        // Preencher para padrões com '*'
        for (int i = 1; i <= n; i++) {

            if (p.charAt(i - 1) == '*') {
                tpBoolean[0][i] = tpBoolean[0][i - 2];
            }
        }

        // Preencher a matriz
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    tpBoolean[i][j] = tpBoolean[i - 1][j - 1];

                } else if (p.charAt(j - 1) == '*') {
                    tpBoolean[i][j] = tpBoolean[i][j - 2] || (tpBoolean[i - 1][j] && (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.'));
                }
            }
        }
        return tpBoolean[m][n];
    }
}