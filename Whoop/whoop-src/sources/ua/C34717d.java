package ua;

import android.graphics.Color;
import p550vd.AbstractC35903f;
import p555vl.AbstractC36095b;
import p607x8.AbstractC38046a;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ua.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C34717d {

    /* JADX INFO: renamed from: a */
    public final String f146244a;

    /* JADX INFO: renamed from: b */
    public final int f146245b;

    /* JADX INFO: renamed from: c */
    public final Integer f146246c;

    /* JADX INFO: renamed from: d */
    public final Integer f146247d;

    /* JADX INFO: renamed from: e */
    public final float f146248e;

    /* JADX INFO: renamed from: f */
    public final boolean f146249f;

    /* JADX INFO: renamed from: g */
    public final boolean f146250g;

    /* JADX INFO: renamed from: h */
    public final boolean f146251h;

    /* JADX INFO: renamed from: i */
    public final boolean f146252i;

    /* JADX INFO: renamed from: j */
    public final int f146253j;

    public C34717d(String str, int i13, Integer num, Integer num2, float f13, boolean z4, boolean z13, boolean z14, boolean z15, int i14) {
        this.f146244a = str;
        this.f146245b = i13;
        this.f146246c = num;
        this.f146247d = num2;
        this.f146248e = f13;
        this.f146249f = z4;
        this.f146250g = z13;
        this.f146251h = z14;
        this.f146252i = z15;
        this.f146253j = i14;
    }

    /* JADX INFO: renamed from: a */
    public static int m109640a(String str) {
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
        AbstractC36095b.m114693u("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m109641b(String str) {
        try {
            int i13 = Integer.parseInt(str);
            return i13 == 1 || i13 == -1;
        } catch (NumberFormatException e5) {
            AbstractC38046a.m121827v("SsaStyle", "Failed to parse boolean value: '" + str + "'", e5);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Integer m109642c(String str) {
        try {
            long j7 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC35849g.m113802d(j7 <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC35903f.m114016k(((j7 >> 24) & 255) ^ 255), AbstractC35903f.m114016k(j7 & 255), AbstractC35903f.m114016k((j7 >> 8) & 255), AbstractC35903f.m114016k((j7 >> 16) & 255)));
        } catch (IllegalArgumentException e5) {
            AbstractC38046a.m121827v("SsaStyle", "Failed to parse color expression: '" + str + "'", e5);
            return null;
        }
    }
}
