package p105e1;

/* JADX INFO: renamed from: e1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12514a {

    /* JADX INFO: renamed from: a */
    public static final long f42720a = m35162a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f42721b = 0;

    /* JADX INFO: renamed from: a */
    public static long m35162a(float f13, float f14) {
        return (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static String m35163b(long j7) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j7 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j7 & 4294967295L)) + ')';
    }
}
