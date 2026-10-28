package p240j2;

import p208i2.C17919x;

/* JADX INFO: renamed from: j2.g */
/* JADX INFO: loaded from: classes.dex */
public class C21226g {

    /* JADX INFO: renamed from: a */
    public final AbstractC21222c f81047a;

    /* JADX INFO: renamed from: b */
    public final AbstractC21222c f81048b;

    /* JADX INFO: renamed from: c */
    public final AbstractC21222c f81049c;

    /* JADX INFO: renamed from: d */
    public final float[] f81050d;

    public C21226g(AbstractC21222c abstractC21222c, AbstractC21222c abstractC21222c2, AbstractC21222c abstractC21222c3, float[] fArr) {
        this.f81047a = abstractC21222c;
        this.f81048b = abstractC21222c2;
        this.f81049c = abstractC21222c3;
        this.f81050d = fArr;
    }

    /* JADX INFO: renamed from: a */
    public long mo59552a(long j7) {
        float fM51547i = C17919x.m51547i(j7);
        float fM51546h = C17919x.m51546h(j7);
        float fM51544f = C17919x.m51544f(j7);
        float fM51543e = C17919x.m51543e(j7);
        AbstractC21222c abstractC21222c = this.f81048b;
        long jMo59545d = abstractC21222c.mo59545d(fM51547i, fM51546h, fM51544f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo59545d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo59545d & 4294967295L));
        float fMo59546e = abstractC21222c.mo59546e(fM51547i, fM51546h, fM51544f);
        float[] fArr = this.f81050d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo59546e *= fArr[2];
        }
        float f13 = fIntBitsToFloat;
        float f14 = fIntBitsToFloat2;
        return this.f81049c.mo59547f(f13, f14, fMo59546e, fM51543e, this.f81047a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Illegal instructions before constructor call */
    public C21226g(AbstractC21222c abstractC21222c, AbstractC21222c abstractC21222c2, int i13) {
        float[] fArr;
        long j7 = abstractC21222c.f81017b;
        long j13 = AbstractC21221b.f81011a;
        AbstractC21222c abstractC21222cM59553a = AbstractC21221b.m59540a(j7, j13) ? AbstractC21229j.m59553a(abstractC21222c) : abstractC21222c;
        AbstractC21222c abstractC21222cM59553a2 = AbstractC21221b.m59540a(abstractC21222c2.f81017b, j13) ? AbstractC21229j.m59553a(abstractC21222c2) : abstractC21222c2;
        if (i13 == 3) {
            boolean zM59540a = AbstractC21221b.m59540a(abstractC21222c.f81017b, j13);
            boolean zM59540a2 = AbstractC21221b.m59540a(abstractC21222c2.f81017b, j13);
            if (!(zM59540a && zM59540a2) && (zM59540a || zM59540a2)) {
                C21238s c21238s = ((C21236q) (zM59540a ? abstractC21222c : abstractC21222c2)).f81071d;
                float[] fArrM59561a = AbstractC21229j.f81056e;
                float[] fArrM59561a2 = zM59540a ? c21238s.m59561a() : fArrM59561a;
                fArrM59561a = zM59540a2 ? c21238s.m59561a() : fArrM59561a;
                fArr = new float[]{fArrM59561a2[0] / fArrM59561a[0], fArrM59561a2[1] / fArrM59561a[1], fArrM59561a2[2] / fArrM59561a[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(abstractC21222c2, abstractC21222cM59553a, abstractC21222cM59553a2, fArr);
    }
}
