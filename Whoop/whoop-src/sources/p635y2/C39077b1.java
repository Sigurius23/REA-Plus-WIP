package p635y2;

/* JADX INFO: renamed from: y2.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C39077b1 implements InterfaceC39146x1, InterfaceC39105k {

    /* JADX INFO: renamed from: x */
    public static final C39077b1 f168132x = new C39077b1(0);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f168133w;

    public /* synthetic */ C39077b1(int i13) {
        this.f168133w = i13;
    }

    @Override // p635y2.InterfaceC39105k
    /* JADX INFO: renamed from: a */
    public long mo124615a(long j7, long j13) {
        switch (this.f168133w) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j13 >> 32)) / Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)) / Float.intBitsToFloat((int) (j7 & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i13 = AbstractC39122p1.f168258a;
                return jFloatToRawIntBits;
            case 2:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) / Float.intBitsToFloat((int) (j7 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) / Float.intBitsToFloat((int) (j7 & 4294967295L));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i14 = AbstractC39122p1.f168258a;
                return jFloatToRawIntBits2;
            case 3:
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j13 & 4294967295L)) / Float.intBitsToFloat((int) (j7 & 4294967295L));
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                int i15 = AbstractC39122p1.f168258a;
                return jFloatToRawIntBits3;
            case 4:
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j13 >> 32)) / Float.intBitsToFloat((int) (j7 >> 32));
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                int i16 = AbstractC39122p1.f168258a;
                return jFloatToRawIntBits4;
            case 5:
                float fM124658d = AbstractC39125q1.m124658d(j7, j13);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fM124658d)) << 32) | (((long) Float.floatToRawIntBits(fM124658d)) & 4294967295L);
                int i17 = AbstractC39122p1.f168258a;
                return jFloatToRawIntBits5;
            default:
                if (Float.intBitsToFloat((int) (j7 >> 32)) <= Float.intBitsToFloat((int) (j13 >> 32)) && Float.intBitsToFloat((int) (j7 & 4294967295L)) <= Float.intBitsToFloat((int) (j13 & 4294967295L))) {
                    long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i18 = AbstractC39122p1.f168258a;
                    return jFloatToRawIntBits6;
                }
                float fM124658d2 = AbstractC39125q1.m124658d(j7, j13);
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(fM124658d2)) << 32) | (((long) Float.floatToRawIntBits(fM124658d2)) & 4294967295L);
                int i19 = AbstractC39122p1.f168258a;
                return jFloatToRawIntBits7;
        }
    }

    @Override // p635y2.InterfaceC39146x1
    /* JADX INFO: renamed from: b */
    public void mo30740b(C39143w1 c39143w1) {
        c39143w1.clear();
    }

    @Override // p635y2.InterfaceC39146x1
    /* JADX INFO: renamed from: n */
    public boolean mo30745n(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.f168133w) {
            case 7:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
