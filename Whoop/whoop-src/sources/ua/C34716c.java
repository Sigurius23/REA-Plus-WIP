package ua;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: ua.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C34716c {

    /* JADX INFO: renamed from: a */
    public static final Pattern f146240a = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: b */
    public static final Pattern f146241b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f146242c;

    /* JADX INFO: renamed from: d */
    public static final Pattern f146243d;

    static {
        int i13 = AbstractC38065t.f163031a;
        Locale locale = Locale.US;
        f146241b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f146242c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f146243d = Pattern.compile("\\\\an(\\d+)");
    }

    /* JADX INFO: renamed from: a */
    public static PointF m109639a(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f146241b.matcher(str);
        Matcher matcher2 = f146242c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                AbstractC38046a.m121818m("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
