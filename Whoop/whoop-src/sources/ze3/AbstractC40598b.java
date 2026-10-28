package ze3;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p671z5.C40084b;

/* JADX INFO: renamed from: ze3.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC40598b {

    /* JADX INFO: renamed from: a */
    public static final Pattern f174946a = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: b */
    public static final Pattern f174947b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: c */
    public static final Pattern f174948c;

    /* JADX INFO: renamed from: d */
    public static final C40084b f174949d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f174948c = Pattern.compile("[ \t\r\n]+");
        f174949d = new C40084b();
    }

    /* JADX INFO: renamed from: a */
    public static String m131676a(String str) {
        String strTrim = str.trim();
        Locale locale = Locale.ROOT;
        return f174948c.matcher(strTrim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
    }

    /* JADX INFO: renamed from: b */
    public static String m131677b(String str) {
        if (!f174946a.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f174947b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb4.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            f174949d.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb4.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb4.append(AbstractC40599c.m131678a(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb4.append((CharSequence) str, iEnd, str.length());
        }
        return sb4.toString();
    }
}
