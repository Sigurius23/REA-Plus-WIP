package co;

import android.graphics.PointF;
import android.util.Log;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: co.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C4855c {

    /* JADX INFO: renamed from: a */
    public static final Pattern f20188a = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: b */
    public static final Pattern f20189b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f20190c;

    /* JADX INFO: renamed from: d */
    public static final Pattern f20191d;

    static {
        int i13 = AbstractC24567y.f95875a;
        Locale locale = Locale.US;
        f20189b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f20190c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f20191d = Pattern.compile("\\\\an(\\d+)");
    }

    /* JADX INFO: renamed from: a */
    public static PointF m15495a(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f20189b.matcher(str);
        Matcher matcher2 = f20190c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                StringBuilder sb4 = new StringBuilder(str.length() + 82);
                sb4.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                sb4.append(str);
                sb4.append("'");
                Log.i("SsaStyle.Overrides", sb4.toString());
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f13 = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f13, Float.parseFloat(strGroup2.trim()));
    }
}
