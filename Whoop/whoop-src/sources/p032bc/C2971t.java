package p032bc;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Arrays;
import p009a8.RunnableC0533c;
import p012ab.C0682h0;
import p168g6.C15524e;
import p168g6.C15525f;
import p168g6.C15526g;

/* JADX INFO: renamed from: bc.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C2971t extends AbstractC2975x {

    /* JADX INFO: renamed from: a */
    public long f11895a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f11896b;

    /* JADX INFO: renamed from: c */
    public boolean f11897c;

    /* JADX INFO: renamed from: d */
    public C15525f f11898d;

    /* JADX INFO: renamed from: e */
    public final C0682h0 f11899e;

    /* JADX INFO: renamed from: f */
    public RunnableC0533c f11900f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2942c0 f11901g;

    public C2971t(C2942c0 c2942c0) {
        this.f11901g = c2942c0;
        C0682h0 c0682h0 = new C0682h0(3, (byte) 0);
        long[] jArr = new long[20];
        c0682h0.f2433y = jArr;
        c0682h0.f2434z = new float[20];
        c0682h0.f2432x = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f11899e = c0682h0;
    }

    @Override // p032bc.AbstractC2975x, p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: d */
    public final void mo8573d(AbstractC2974w abstractC2974w) {
        this.f11897c = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m8641g() {
        if (this.f11898d != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f13 = this.f11895a;
        C0682h0 c0682h0 = this.f11899e;
        int i13 = c0682h0.f2432x;
        float[] fArr = (float[]) c0682h0.f2434z;
        long[] jArr = (long[]) c0682h0.f2433y;
        char c3 = 20;
        int i14 = (i13 + 1) % 20;
        c0682h0.f2432x = i14;
        jArr[i14] = jCurrentAnimationTimeMillis;
        fArr[i14] = f13;
        C15524e c15524e = new C15524e();
        float fSqrt = 0.0f;
        c15524e.f58198a = 0.0f;
        this.f11898d = new C15525f(c15524e);
        C15526g c15526g = new C15526g();
        c15526g.f58221b = 1.0f;
        int i15 = 0;
        c15526g.f58222c = false;
        c15526g.m43711a(200.0f);
        C15525f c15525f = this.f11898d;
        c15525f.f58217m = c15526g;
        c15525f.f58206b = this.f11895a;
        c15525f.f58207c = true;
        ArrayList arrayList = c15525f.f58216l;
        if (c15525f.f58210f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        C15525f c15525f2 = this.f11898d;
        int i16 = c0682h0.f2432x;
        long j7 = Long.MIN_VALUE;
        if (i16 != 0 || jArr[i16] != Long.MIN_VALUE) {
            long j13 = jArr[i16];
            long j14 = j13;
            while (true) {
                long j15 = jArr[i16];
                if (j15 == j7) {
                    break;
                }
                float f14 = j13 - j15;
                float fAbs = Math.abs(j15 - j14);
                if (f14 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i16 == 0) {
                    i16 = 20;
                }
                i16--;
                i15++;
                if (i15 >= 20) {
                    break;
                }
                j14 = j15;
                j7 = Long.MIN_VALUE;
            }
            if (i15 >= 2) {
                float f15 = 1000.0f;
                if (i15 == 2) {
                    int i17 = c0682h0.f2432x;
                    int i18 = i17 == 0 ? 19 : i17 - 1;
                    float f16 = jArr[i17] - jArr[i18];
                    if (f16 != 0.0f) {
                        fSqrt = ((fArr[i17] - fArr[i18]) / f16) * 1000.0f;
                    }
                } else {
                    int i19 = c0682h0.f2432x;
                    int i24 = ((i19 - i15) + 21) % 20;
                    int i25 = (i19 + 21) % 20;
                    long j16 = jArr[i24];
                    float f17 = fArr[i24];
                    int i26 = i24 + 1;
                    int i27 = i26 % 20;
                    float f18 = 0.0f;
                    while (i27 != i25) {
                        long j17 = jArr[i27];
                        float f19 = fSqrt;
                        int i28 = i25;
                        float f24 = j17 - j16;
                        if (f24 != f19) {
                            float f25 = fArr[i27];
                            float f26 = (f25 - f17) / f24;
                            float fAbs2 = (Math.abs(f26) * (f26 - ((float) (Math.sqrt(2.0f * Math.abs(f18)) * ((double) Math.signum(f18)))))) + f18;
                            if (i27 == i26) {
                                fAbs2 *= 0.5f;
                            }
                            f18 = fAbs2;
                            f17 = f25;
                            j16 = j17;
                        }
                        i27 = (i27 + 1) % 20;
                        fSqrt = f19;
                        i25 = i28;
                        c3 = c3;
                        f15 = f15;
                    }
                    fSqrt = ((float) (Math.sqrt(Math.abs(f18) * 2.0f) * ((double) Math.signum(f18)))) * f15;
                }
            }
        }
        c15525f2.f58205a = fSqrt;
        C15525f c15525f3 = this.f11898d;
        c15525f3.f58211g = this.f11901g.f11930X + 1;
        c15525f3.f58212h = -1.0f;
        c15525f3.f58214j = 4.0f;
        C2970s c2970s = new C2970s(this);
        ArrayList arrayList2 = c15525f3.f58215k;
        if (arrayList2.contains(c2970s)) {
            return;
        }
        arrayList2.add(c2970s);
    }
}
