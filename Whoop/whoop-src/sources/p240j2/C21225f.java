package p240j2;

import p208i2.AbstractC17918w0;
import p208i2.C17919x;

/* JADX INFO: renamed from: j2.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C21225f extends C21226g {

    /* JADX INFO: renamed from: e */
    public final C21236q f81044e;

    /* JADX INFO: renamed from: f */
    public final C21236q f81045f;

    /* JADX INFO: renamed from: g */
    public final float[] f81046g;

    public C21225f(C21236q c21236q, C21236q c21236q2) {
        float[] fArrM59559g;
        super(c21236q2, c21236q, c21236q2, null);
        this.f81044e = c21236q;
        this.f81045f = c21236q2;
        float[] fArr = C21220a.f81009b.f81010a;
        C21238s c21238s = c21236q.f81071d;
        float[] fArr2 = c21236q.f81076i;
        C21238s c21238s2 = c21236q2.f81071d;
        float[] fArr3 = c21236q2.f81077j;
        if (AbstractC21229j.m59556d(c21238s, c21238s2)) {
            fArrM59559g = AbstractC21229j.m59559g(fArr3, fArr2);
        } else {
            float[] fArrM59561a = c21238s.m59561a();
            float[] fArrM59561a2 = c21238s2.m59561a();
            C21238s c21238s3 = AbstractC21229j.f81053b;
            fArrM59559g = AbstractC21229j.m59559g(AbstractC21229j.m59556d(c21238s2, c21238s3) ? fArr3 : AbstractC21229j.m59558f(AbstractC21229j.m59559g(AbstractC21229j.m59555c(fArr, fArrM59561a2, new float[]{0.964212f, 1.0f, 0.825188f}), c21236q2.f81076i)), AbstractC21229j.m59556d(c21238s, c21238s3) ? fArr2 : AbstractC21229j.m59559g(AbstractC21229j.m59555c(fArr, fArrM59561a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f81046g = fArrM59559g;
    }

    @Override // p240j2.C21226g
    /* JADX INFO: renamed from: a */
    public final long mo59552a(long j7) {
        float fM51547i = C17919x.m51547i(j7);
        float fM51546h = C17919x.m51546h(j7);
        float fM51544f = C17919x.m51544f(j7);
        float fM51543e = C17919x.m51543e(j7);
        C21232m c21232m = this.f81044e.f81083p;
        float fMo56647i = (float) c21232m.mo56647i(fM51547i);
        float fMo56647i2 = (float) c21232m.mo56647i(fM51546h);
        float fMo56647i3 = (float) c21232m.mo56647i(fM51544f);
        float[] fArr = this.f81046g;
        float f13 = (fArr[6] * fMo56647i3) + (fArr[3] * fMo56647i2) + (fArr[0] * fMo56647i);
        float f14 = (fArr[7] * fMo56647i3) + (fArr[4] * fMo56647i2) + (fArr[1] * fMo56647i);
        float f15 = (fArr[8] * fMo56647i3) + (fArr[5] * fMo56647i2) + (fArr[2] * fMo56647i);
        C21236q c21236q = this.f81045f;
        float fMo56647i4 = (float) c21236q.f81080m.mo56647i(f13);
        C21232m c21232m2 = c21236q.f81080m;
        return AbstractC17918w0.m51514b(fMo56647i4, (float) c21232m2.mo56647i(f14), (float) c21232m2.mo56647i(f15), fM51543e, c21236q);
    }
}
