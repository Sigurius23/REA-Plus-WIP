package p524ui;

import bc3.AbstractC3006f0;
import bc3.C3075y1;
import l83.C23454a0;
import p108e4.AbstractC12682p;
import p390p1.C28633k1;
import p426qi.C30387i;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ui.e */
/* JADX INFO: loaded from: classes.dex */
public final class C34977e extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f147982E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f147983F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ AbstractC34987o f147984G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C30387i f147985H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ float f147986I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ boolean f147987J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ boolean f147988K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int f147989L;

    /* JADX INFO: renamed from: w */
    public int f147990w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34981i f147991x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f147992y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f147993z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34977e(C34981i c34981i, int i13, int i14, boolean z4, float f13, AbstractC34987o abstractC34987o, C30387i c30387i, float f14, boolean z13, boolean z14, int i15, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f147991x = c34981i;
        this.f147992y = i13;
        this.f147993z = i14;
        this.f147982E = z4;
        this.f147983F = f13;
        this.f147984G = abstractC34987o;
        this.f147985H = c30387i;
        this.f147986I = f14;
        this.f147987J = z13;
        this.f147988K = z14;
        this.f147989L = i15;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C34977e(this.f147991x, this.f147992y, this.f147993z, this.f147982E, this.f147983F, this.f147984G, this.f147985H, this.f147986I, this.f147987J, this.f147988K, this.f147989L, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C34977e) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC30063j interfaceC30063j;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f147990w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C34981i c34981i = this.f147991x;
        try {
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                c34981i.m110475m(this.f147992y);
                C28633k1 c28633k1 = c34981i.f148015w;
                C28633k1 c28633k2 = c34981i.f148017y;
                int i14 = this.f147993z;
                c28633k2.setValue(Integer.valueOf(i14));
                c34981i.f148018z.setValue(Boolean.valueOf(this.f147982E));
                C28633k1 c28633k3 = c34981i.f148005F;
                float f13 = this.f147983F;
                c28633k3.setValue(Float.valueOf(f13));
                c34981i.f148004E.setValue(this.f147984G);
                C28633k1 c28633k4 = c34981i.f148008I;
                C30387i c30387i = this.f147985H;
                c28633k4.setValue(c30387i);
                c34981i.m110476n(this.f147986I);
                c34981i.f148006G.setValue(Boolean.valueOf(this.f147987J));
                if (!this.f147988K) {
                    c34981i.f148011L.setValue(Long.MIN_VALUE);
                }
                if (c30387i == null) {
                    c28633k1.setValue(Boolean.FALSE);
                    return c23454a0;
                }
                if (Float.isInfinite(f13)) {
                    c34981i.m110476n(c34981i.m110471g());
                    c28633k1.setValue(Boolean.FALSE);
                    c34981i.m110475m(i14);
                    return c23454a0;
                }
                c28633k1.setValue(Boolean.TRUE);
                int iM35485e = AbstractC12682p.m35485e(this.f147989L);
                if (iM35485e == 0) {
                    interfaceC30063j = C30064k.f122676w;
                } else {
                    if (iM35485e != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC30063j = C3075y1.f12109w;
                }
                C34975d c34975d = new C34975d(this.f147989L, AbstractC3006f0.m8725s(getContext()), this.f147993z, this.f147992y, this.f147991x, null);
                this.f147990w = 1;
                if (AbstractC3006f0.m8705K(interfaceC30063j, c34975d, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC3006f0.m8721o(getContext());
            C34981i.m110468c(c34981i, false);
            return c23454a0;
        } catch (Throwable th3) {
            C34981i.m110468c(c34981i, false);
            throw th3;
        }
    }
}
