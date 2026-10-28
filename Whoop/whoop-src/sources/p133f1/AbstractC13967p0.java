package p133f1;

import p209i3.C18043y;

/* JADX INFO: renamed from: f1.p0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13967p0 {

    /* JADX INFO: renamed from: a */
    public static final float f49803a;

    /* JADX INFO: renamed from: b */
    public static final float f49804b;

    /* JADX INFO: renamed from: c */
    public static final C18043y f49805c = new C18043y("SelectionHandleInfo");

    static {
        float f13 = 25;
        f49803a = f13;
        f49804b = f13;
    }

    /* JADX INFO: renamed from: a */
    public static final long m39745a(long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
