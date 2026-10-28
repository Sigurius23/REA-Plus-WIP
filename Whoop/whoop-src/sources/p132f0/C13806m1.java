package p132f0;

import l83.C23454a0;
import p002a0.C0039m0;
import p002a0.C0057v0;
import p098dt.AbstractC12350b;
import p390p1.C28612f0;
import p390p1.C28677v1;
import p390p1.C28679w;
import p390p1.InterfaceC28663s;
import p500tb.InterfaceC33687a;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr2.C34109g;
import v71.AbstractC35767h;

/* JADX INFO: renamed from: f0.m1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13806m1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49255w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f49256x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f49257y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f49258z;

    public /* synthetic */ C13806m1(Object obj, int i13, Object obj2, int i14) {
        this.f49255w = i14;
        this.f49257y = obj;
        this.f49256x = i13;
        this.f49258z = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC28663s interfaceC28663s;
        long[] jArr;
        InterfaceC28663s interfaceC28663s2;
        long[] jArr2;
        int i13;
        switch (this.f49255w) {
            case 0:
                C13812o1 c13812o1 = (C13812o1) this.f49257y;
                AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) this.f49258z;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                int iM87024x = c13812o1.f49281O.f49318a.m87024x();
                if (iM87024x < 0) {
                    iM87024x = 0;
                }
                int i14 = this.f49256x;
                if (iM87024x > i14) {
                    iM87024x = i14;
                }
                int i15 = -iM87024x;
                boolean z4 = c13812o1.f49282P;
                int i16 = z4 ? 0 : i15;
                if (!z4) {
                    i15 = 0;
                }
                abstractC39101i1.f168198w = true;
                AbstractC39101i1.m124625o(abstractC39104j1, i16, i15, abstractC39101i1);
                abstractC39101i1.f168198w = false;
                return C23454a0.f92919a;
            case 1:
                C28677v1 c28677v1 = (C28677v1) this.f49257y;
                C0039m0 c0039m0 = (C0039m0) this.f49258z;
                InterfaceC28663s interfaceC28663s3 = (InterfaceC28663s) obj;
                int i17 = c28677v1.f115983e;
                int i18 = this.f49256x;
                if (i17 == i18 && AbstractC22676k.m65745e(c0039m0, c28677v1.f115984f) && (interfaceC28663s3 instanceof C28679w)) {
                    long[] jArr3 = c0039m0.f114a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i19 = 0;
                        while (true) {
                            long j7 = jArr3[i19];
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i24 = 8;
                                int i25 = 8 - ((~(i19 - length)) >>> 31);
                                int i26 = 0;
                                while (i26 < i25) {
                                    if ((255 & j7) < 128) {
                                        int i27 = (i19 << 3) + i26;
                                        Object obj2 = c0039m0.f115b[i27];
                                        boolean z13 = c0039m0.f116c[i27] != i18;
                                        if (z13) {
                                            i13 = i24;
                                            C28679w c28679w = (C28679w) interfaceC28663s3;
                                            interfaceC28663s2 = interfaceC28663s3;
                                            C0057v0 c0057v0 = c28679w.f115989G;
                                            AbstractC12350b.m34560I(c0057v0, obj2, c28677v1);
                                            jArr2 = jArr3;
                                            if (obj2 instanceof C28612f0) {
                                                C28612f0 c28612f0 = (C28612f0) obj2;
                                                if (!c0057v0.m125c(c28612f0)) {
                                                    AbstractC12350b.m34561J(c28679w.f115992J, c28612f0);
                                                }
                                                C0057v0 c0057v1 = c28677v1.f115985g;
                                                if (c0057v1 != null) {
                                                    c0057v1.m133k(obj2);
                                                }
                                            }
                                        } else {
                                            interfaceC28663s2 = interfaceC28663s3;
                                            jArr2 = jArr3;
                                            i13 = i24;
                                        }
                                        if (z13) {
                                            c0039m0.m94g(i27);
                                        }
                                    } else {
                                        interfaceC28663s2 = interfaceC28663s3;
                                        jArr2 = jArr3;
                                        i13 = i24;
                                    }
                                    j7 >>= i13;
                                    i26++;
                                    i24 = i13;
                                    interfaceC28663s3 = interfaceC28663s2;
                                    jArr3 = jArr2;
                                }
                                interfaceC28663s = interfaceC28663s3;
                                jArr = jArr3;
                                if (i25 == i24) {
                                }
                            } else {
                                interfaceC28663s = interfaceC28663s3;
                                jArr = jArr3;
                            }
                            if (i19 != length) {
                                i19++;
                                interfaceC28663s3 = interfaceC28663s;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                return C23454a0.f92919a;
            case 2:
                return C34109g.m107828v((String) this.f49257y, (String) this.f49258z, this.f49256x, (InterfaceC33687a) obj);
            default:
                return AbstractC35767h.m113347o((Function1) this.f49257y, (Function1) this.f49258z, this.f49256x, obj);
        }
    }

    public /* synthetic */ C13806m1(Object obj, Object obj2, int i13, int i14) {
        this.f49255w = i14;
        this.f49257y = obj;
        this.f49258z = obj2;
        this.f49256x = i13;
    }
}
