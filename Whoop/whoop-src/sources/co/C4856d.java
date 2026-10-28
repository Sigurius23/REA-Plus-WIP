package co;

import android.graphics.Color;
import android.util.Log;
import p309lo.AbstractC24543a;
import p550vd.AbstractC35903f;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: co.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C4856d {

    /* JADX INFO: renamed from: a */
    public final String f20192a;

    /* JADX INFO: renamed from: b */
    public final int f20193b;

    /* JADX INFO: renamed from: c */
    public final Integer f20194c;

    /* JADX INFO: renamed from: d */
    public final float f20195d;

    /* JADX INFO: renamed from: e */
    public final boolean f20196e;

    /* JADX INFO: renamed from: f */
    public final boolean f20197f;

    /* JADX INFO: renamed from: g */
    public final boolean f20198g;

    /* JADX INFO: renamed from: h */
    public final boolean f20199h;

    public C4856d(String str, int i13, Integer num, float f13, boolean z4, boolean z13, boolean z14, boolean z15) {
        this.f20192a = str;
        this.f20193b = i13;
        this.f20194c = num;
        this.f20195d = f13;
        this.f20196e = z4;
        this.f20197f = z13;
        this.f20198g = z14;
        this.f20199h = z15;
    }

    /* JADX INFO: renamed from: a */
    public static int m15496a(String str) {
        boolean z4;
        try {
            int i13 = Integer.parseInt(str.trim());
            switch (i13) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z4 = true;
                    break;
                default:
                    z4 = false;
                    break;
            }
            if (z4) {
                return i13;
            }
        } catch (NumberFormatException unused) {
        }
        String strValueOf = String.valueOf(str);
        Log.w("SsaStyle", strValueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(strValueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15497b(String str) {
        try {
            int i13 = Integer.parseInt(str);
            return i13 == 1 || i13 == -1;
        } catch (NumberFormatException e5) {
            StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(33, str));
            sb4.append("Failed to parse boolean value: '");
            sb4.append(str);
            sb4.append("'");
            AbstractC24543a.m71564F("SsaStyle", sb4.toString(), e5);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Integer m15498c(String str) {
        try {
            long j7 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC24543a.m71569e(j7 <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC35903f.m114016k(((j7 >> 24) & 255) ^ 255), AbstractC35903f.m114016k(j7 & 255), AbstractC35903f.m114016k((j7 >> 8) & 255), AbstractC35903f.m114016k((j7 >> 16) & 255)));
        } catch (IllegalArgumentException e5) {
            StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(36, str));
            sb4.append("Failed to parse color expression: '");
            sb4.append(str);
            sb4.append("'");
            AbstractC24543a.m71564F("SsaStyle", sb4.toString(), e5);
            return null;
        }
    }
}
