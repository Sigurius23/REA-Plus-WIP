package p355o2;

import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p005a3.C0227m1;
import p005a3.C0237p;
import p014aj.C0929d;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.C17875c1;
import p208i2.C17891j;
import p208i2.C17896l0;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C27424b extends AbstractC27425b0 {

    /* JADX INFO: renamed from: b */
    public float[] f110482b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f110483c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f110484d = true;

    /* JADX INFO: renamed from: e */
    public long f110485e = C17919x.f69637n;

    /* JADX INFO: renamed from: f */
    public List f110486f;

    /* JADX INFO: renamed from: g */
    public boolean f110487g;

    /* JADX INFO: renamed from: h */
    public C17891j f110488h;

    /* JADX INFO: renamed from: i */
    public Function1 f110489i;

    /* JADX INFO: renamed from: j */
    public final C0227m1 f110490j;

    /* JADX INFO: renamed from: k */
    public String f110491k;

    /* JADX INFO: renamed from: l */
    public float f110492l;

    /* JADX INFO: renamed from: m */
    public float f110493m;

    /* JADX INFO: renamed from: n */
    public float f110494n;

    /* JADX INFO: renamed from: o */
    public float f110495o;

    /* JADX INFO: renamed from: p */
    public float f110496p;

    /* JADX INFO: renamed from: q */
    public float f110497q;

    /* JADX INFO: renamed from: r */
    public float f110498r;

    /* JADX INFO: renamed from: s */
    public boolean f110499s;

    public C27424b() {
        int i13 = AbstractC27433f0.f110561a;
        this.f110486f = C25271y.f99162w;
        this.f110487g = true;
        this.f110490j = new C0227m1(this, 24);
        this.f110491k = "";
        this.f110495o = 1.0f;
        this.f110496p = 1.0f;
        this.f110499s = true;
    }

    @Override // p355o2.AbstractC27425b0
    /* JADX INFO: renamed from: a */
    public final void mo82851a(InterfaceC22131e interfaceC22131e) {
        if (this.f110499s) {
            float[] fArrM51471a = this.f110482b;
            if (fArrM51471a == null) {
                fArrM51471a = C17896l0.m51471a();
                this.f110482b = fArrM51471a;
            } else {
                C17896l0.m51474d(fArrM51471a);
            }
            C17896l0.m51477g(fArrM51471a, this.f110497q + this.f110493m, this.f110498r + this.f110494n);
            float f13 = this.f110492l;
            if (fArrM51471a.length >= 16) {
                double d3 = ((double) f13) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d3);
                float fCos = (float) Math.cos(d3);
                float f14 = fArrM51471a[0];
                float f15 = fArrM51471a[4];
                float f16 = (fSin * f15) + (fCos * f14);
                float f17 = -fSin;
                float f18 = (f15 * fCos) + (f14 * f17);
                float f19 = fArrM51471a[1];
                float f24 = fArrM51471a[5];
                float f25 = (fSin * f24) + (fCos * f19);
                float f26 = (f24 * fCos) + (f19 * f17);
                float f27 = fArrM51471a[2];
                float f28 = fArrM51471a[6];
                float f29 = (fSin * f28) + (fCos * f27);
                float f34 = (f28 * fCos) + (f27 * f17);
                float f35 = fArrM51471a[3];
                float f36 = fArrM51471a[7];
                float f37 = (fSin * f36) + (fCos * f35);
                fArrM51471a[0] = f16;
                fArrM51471a[1] = f25;
                fArrM51471a[2] = f29;
                fArrM51471a[3] = f37;
                fArrM51471a[4] = f18;
                fArrM51471a[5] = f26;
                fArrM51471a[6] = f34;
                fArrM51471a[7] = (fCos * f36) + (f17 * f35);
            }
            C17896l0.m51475e(fArrM51471a, this.f110495o, this.f110496p);
            C17896l0.m51477g(fArrM51471a, -this.f110493m, -this.f110494n);
            this.f110499s = false;
        }
        if (this.f110487g) {
            if (!this.f110486f.isEmpty()) {
                C17891j c17891jM51478a = this.f110488h;
                if (c17891jM51478a == null) {
                    c17891jM51478a = AbstractC17897m.m51478a();
                    this.f110488h = c17891jM51478a;
                }
                AbstractC27422a.m82850d(this.f110486f, c17891jM51478a);
            }
            this.f110487g = false;
        }
        C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            C0929d c0929d = (C0929d) c0237pMo744t0.f812x;
            float[] fArr = this.f110482b;
            if (fArr != null) {
                ((C0237p) c0929d.f3422w).m716w().mo51428s(fArr);
            }
            C17891j c17891j = this.f110488h;
            if (!this.f110486f.isEmpty() && c17891j != null) {
                c0929d.m2344b(c17891j, 1);
            }
            ArrayList arrayList = this.f110483c;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((AbstractC27425b0) arrayList.get(i13)).mo82851a(interfaceC22131e);
            }
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }

    @Override // p355o2.AbstractC27425b0
    /* JADX INFO: renamed from: b */
    public final Function1 mo82852b() {
        return this.f110489i;
    }

    @Override // p355o2.AbstractC27425b0
    /* JADX INFO: renamed from: d */
    public final void mo82853d(C0227m1 c0227m1) {
        this.f110489i = c0227m1;
    }

    /* JADX INFO: renamed from: e */
    public final void m82854e(int i13, AbstractC27425b0 abstractC27425b0) {
        ArrayList arrayList = this.f110483c;
        if (i13 < arrayList.size()) {
            arrayList.set(i13, abstractC27425b0);
        } else {
            arrayList.add(abstractC27425b0);
        }
        m82856g(abstractC27425b0);
        abstractC27425b0.mo82853d(this.f110490j);
        m82857c();
    }

    /* JADX INFO: renamed from: f */
    public final void m82855f(long j7) {
        if (this.f110484d && j7 != 16) {
            long j13 = this.f110485e;
            if (j13 == 16) {
                this.f110485e = j7;
                return;
            }
            int i13 = AbstractC27433f0.f110561a;
            if (C17919x.m51547i(j13) == C17919x.m51547i(j7) && C17919x.m51546h(j13) == C17919x.m51546h(j7) && C17919x.m51544f(j13) == C17919x.m51544f(j7)) {
                return;
            }
            this.f110484d = false;
            this.f110485e = C17919x.f69637n;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m82856g(AbstractC27425b0 abstractC27425b0) {
        if (!(abstractC27425b0 instanceof C27434g)) {
            if (abstractC27425b0 instanceof C27424b) {
                C27424b c27424b = (C27424b) abstractC27425b0;
                if (c27424b.f110484d && this.f110484d) {
                    m82855f(c27424b.f110485e);
                    return;
                } else {
                    this.f110484d = false;
                    this.f110485e = C17919x.f69637n;
                    return;
                }
            }
            return;
        }
        C27434g c27434g = (C27434g) abstractC27425b0;
        AbstractC17911t abstractC17911t = c27434g.f110562b;
        if (this.f110484d && abstractC17911t != null) {
            if (abstractC17911t instanceof C17875c1) {
                m82855f(((C17875c1) abstractC17911t).f69559c);
            } else {
                this.f110484d = false;
                this.f110485e = C17919x.f69637n;
            }
        }
        AbstractC17911t abstractC17911t2 = c27434g.f110567g;
        if (this.f110484d && abstractC17911t2 != null) {
            if (abstractC17911t2 instanceof C17875c1) {
                m82855f(((C17875c1) abstractC17911t2).f69559c);
            } else {
                this.f110484d = false;
                this.f110485e = C17919x.f69637n;
            }
        }
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("VGroup: ");
        sb4.append(this.f110491k);
        ArrayList arrayList = this.f110483c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC27425b0 abstractC27425b0 = (AbstractC27425b0) arrayList.get(i13);
            sb4.append("\t");
            sb4.append(abstractC27425b0.toString());
            sb4.append("\n");
        }
        return sb4.toString();
    }
}
