package p133f1;

import ev2.C13693b;
import p077d0.C11351f2;
import p077d0.C11362i1;
import p077d0.C11384o;
import p181h2.C16617b;

/* JADX INFO: renamed from: f1.s0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13976s0 {

    /* JADX INFO: renamed from: a */
    public static final C11384o f49839a = new C11384o(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final C11351f2 f49840b = new C11351f2(new C13693b(23), new C13693b(24));

    /* JADX INFO: renamed from: c */
    public static final long f49841c;

    /* JADX INFO: renamed from: d */
    public static final C11362i1 f49842d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f49841c = jFloatToRawIntBits;
        f49842d = new C11362i1(new C16617b(jFloatToRawIntBits), 3);
    }
}
