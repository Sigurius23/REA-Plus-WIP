package ze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: ze3.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC40599c {

    /* JADX INFO: renamed from: a */
    public static final HashMap f174950a;

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(AbstractC40599c.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        f174950a = map;
                        return;
                    } else if (line.length() != 0) {
                        int iIndexOf = line.indexOf("=");
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th5) {
                            th3.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                throw new IllegalStateException("Failed reading data for HTML named character references", e);
            }
        } catch (IOException e5) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m131678a(String str) {
        int i13;
        if (str.startsWith("&") && str.endsWith(";")) {
            String strSubstring = str.substring(1, str.length() - 1);
            if (strSubstring.startsWith("#")) {
                String strSubstring2 = strSubstring.substring(1);
                if (strSubstring2.startsWith("x") || strSubstring2.startsWith("X")) {
                    strSubstring2 = strSubstring2.substring(1);
                    i13 = 16;
                } else {
                    i13 = 10;
                }
                try {
                    int i14 = Integer.parseInt(strSubstring2, i13);
                    return i14 == 0 ? "�" : new String(Character.toChars(i14));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = (String) f174950a.get(strSubstring);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }
}
