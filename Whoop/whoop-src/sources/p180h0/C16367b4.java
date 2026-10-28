package p180h0;

import e93.AbstractC12889b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p005a3.C0238p0;
import p014aj.C0929d;
import p077d0.C11344e;
import p077d0.C11368k;
import p077d0.C11380n;
import p208i2.AbstractC17911t;
import p208i2.C17885g;
import p208i2.C17891j;
import p208i2.C17903p;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p292l1.C23161q4;
import p329n0.C26065r;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22663d0;
import r51.AbstractC30937e;
import rz0.AbstractC31926e;

/* JADX INFO: renamed from: h0.b4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16367b4 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f62919w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f62920x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f62921y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f62922z;

    public /* synthetic */ C16367b4(float f13, Object obj, Object obj2, int i13) {
        this.f62919w = i13;
        this.f62920x = f13;
        this.f62921y = obj;
        this.f62922z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0087 A[PHI: r3
      0x0087: PHI (r3v7 float) = (r3v4 float), (r3v11 float) binds: [B:25:0x009c, B:18:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue;
        switch (this.f62919w) {
            case 0:
                C16379d4 c16379d4 = (C16379d4) this.f62921y;
                Function1 function1 = (Function1) this.f62922z;
                long jLongValue = ((Long) obj).longValue();
                if (c16379d4.f62976b == Long.MIN_VALUE) {
                    c16379d4.f62976b = jLongValue;
                }
                float f13 = c16379d4.f62979e;
                C11380n c11380n = new C11380n(f13);
                float f14 = this.f62920x;
                C11380n c11380n2 = C16379d4.f62974f;
                long jMo2197c = f14 == 0.0f ? c16379d4.f62975a.mo2197c(new C11380n(f13), c11380n2, c16379d4.f62977c) : AbstractC12889b.m36259Y((jLongValue - c16379d4.f62976b) / f14);
                float f15 = ((C11380n) c16379d4.f62975a.mo2202h(jMo2197c, c11380n, c11380n2, c16379d4.f62977c)).f36483a;
                c16379d4.f62977c = (C11380n) c16379d4.f62975a.mo2205m(jMo2197c, c11380n, c11380n2, c16379d4.f62977c);
                c16379d4.f62976b = jLongValue;
                float f16 = c16379d4.f62979e - f15;
                c16379d4.f62979e = f15;
                function1.invoke(Float.valueOf(f16));
                return C23454a0.f92919a;
            case 1:
                AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) this.f62921y;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                C11344e c11344e = ((C23161q4) this.f62922z).f91613S;
                AbstractC39101i1.m124624n(abstractC39104j1, (int) (c11344e != null ? ((Number) c11344e.m30549e()).floatValue() : this.f62920x), 0, abstractC39101i1);
                return C23454a0.f92919a;
            case 2:
                C22663d0 c22663d0 = (C22663d0) this.f62921y;
                C26065r c26065r = (C26065r) this.f62922z;
                C11368k c11368k = (C11368k) obj;
                float f17 = this.f62920x;
                float f18 = 0.0f;
                if (f17 > 0.0f) {
                    fFloatValue = ((Number) c11368k.f36440e.getValue()).floatValue();
                    if (fFloatValue <= f17) {
                        f17 = fFloatValue;
                    }
                    f18 = f17;
                } else if (f17 < 0.0f) {
                    fFloatValue = ((Number) c11368k.f36440e.getValue()).floatValue();
                    if (fFloatValue >= f17) {
                        f17 = fFloatValue;
                    }
                    f18 = f17;
                }
                float f19 = f18 - c22663d0.f89331w;
                if (f19 != c26065r.mo29373a(f19) || f18 != ((Number) c11368k.f36440e.getValue()).floatValue()) {
                    c11368k.m30599a();
                }
                c22663d0.f89331w += f19;
                return C23454a0.f92919a;
            case 3:
                return AbstractC30937e.m95158l((InterfaceC28670t2) this.f62921y, this.f62920x, (InterfaceC28601c1) this.f62922z, (InterfaceC26064q) obj);
            case 4:
                return AbstractC31926e.m99383r(this.f62920x, (C17891j) this.f62921y, (AbstractC17911t) this.f62922z, (InterfaceC22129c) obj);
            default:
                float f24 = this.f62920x;
                C17885g c17885g = (C17885g) this.f62921y;
                C17903p c17903p = (C17903p) this.f62922z;
                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj);
                c0238p0.m728a();
                C22128b c22128b = c0238p0.f815w;
                C0237p c0237p = c22128b.f85852x;
                long jM670A = c0237p.m670A();
                c0237p.m716w().mo51426q();
                try {
                    C0929d c0929d = (C0929d) c0237p.f812x;
                    c0929d.m2339B(f24, 0.0f);
                    c0929d.m2358v(45.0f, 0L);
                    c22128b.m63371e(c17885g, c17903p);
                    return C23454a0.f92919a;
                } finally {
                    AbstractC11266d.m30472z(c0237p, jM670A);
                }
        }
    }

    public /* synthetic */ C16367b4(Object obj, float f13, Object obj2, int i13) {
        this.f62919w = i13;
        this.f62921y = obj;
        this.f62920x = f13;
        this.f62922z = obj2;
    }

    public /* synthetic */ C16367b4(AbstractC39104j1 abstractC39104j1, C23161q4 c23161q4, float f13) {
        this.f62919w = 1;
        this.f62921y = abstractC39104j1;
        this.f62922z = c23161q4;
        this.f62920x = f13;
    }
}
