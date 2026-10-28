package p241j3;

import java.util.Arrays;
import p000.AbstractC11266d;
import p026b2.AbstractC2316v;
import p636y3.C39178j;

/* JADX INFO: renamed from: j3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C21266c {

    /* JADX INFO: renamed from: a */
    public final long f81193a;

    /* JADX INFO: renamed from: b */
    public final long f81194b;

    /* JADX INFO: renamed from: c */
    public final long f81195c;

    /* JADX INFO: renamed from: d */
    public final long f81196d;

    /* JADX INFO: renamed from: e */
    public final long f81197e;

    /* JADX INFO: renamed from: f */
    public final float[] f81198f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2316v f81199g;

    public C21266c(long j7, long j13, long j14, long j15, long j16, AbstractC2316v abstractC2316v, float[] fArr) {
        this.f81193a = j7;
        this.f81194b = j13;
        this.f81195c = j14;
        this.f81196d = j15;
        this.f81197e = j16;
        this.f81198f = fArr;
        this.f81199g = abstractC2316v;
    }

    /* JADX INFO: renamed from: a */
    public final float m59676a(int i13, int i14, int i15, int i16) {
        long j7 = this.f81193a;
        int i17 = (int) (j7 >> 32);
        int iMin = Math.min(Math.max(i17, i13), i15);
        int i18 = (int) j7;
        int iMin2 = Math.min(Math.max(i18, i14), i16);
        long j13 = this.f81194b;
        int i19 = (int) (j13 >> 32);
        int iMax = Math.max(Math.min(i19, i15), i13);
        int i24 = (int) j13;
        return Math.max((Math.max(Math.min(i24, i16), i14) - iMin2) * (iMax - iMin), 0) / Math.min((i16 - i14) * (i15 - i13), (i24 - i18) * (i19 - i17));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && C21266c.class == obj.getClass()) {
                C21266c c21266c = (C21266c) obj;
                if (this.f81193a == c21266c.f81193a && this.f81194b == c21266c.f81194b && this.f81197e == c21266c.f81197e && C39178j.m124792b(this.f81195c, c21266c.f81195c) && C39178j.m124792b(this.f81196d, c21266c.f81196d)) {
                    float[] fArr = c21266c.f81198f;
                    float[] fArr2 = this.f81198f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr2.equals(fArr);
                    }
                    if (zEquals && this.f81199g.equals(c21266c.f81199g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f81193a) * 31, this.f81194b, 31), this.f81197e, 31), this.f81195c, 31), this.f81196d, 31);
        float[] fArr = this.f81198f;
        return this.f81199g.hashCode() + ((iM30451e + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
