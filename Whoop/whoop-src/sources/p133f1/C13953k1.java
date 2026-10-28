package p133f1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p027b3.C2386i;
import p027b3.C2428q1;
import p027b3.InterfaceC2433r1;
import p163g1.C14947a0;
import p294l3.C23283u0;
import p412q3.C29891y;
import p505ts.AbstractC34132o;
import p510u0.EnumC34318g0;
import p558vp.AbstractC36259c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import se.AbstractC32410a;

/* JADX INFO: renamed from: f1.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13953k1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49737w = 0;

    /* JADX INFO: renamed from: x */
    public int f49738x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f49739y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f49740z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13953k1(C13977s1 c13977s1, boolean z4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49740z = c13977s1;
        this.f49739y = z4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f49737w) {
            case 0:
                return new C13953k1((C13977s1) this.f49740z, this.f49739y, interfaceC30057d);
            default:
                return new C13953k1(this.f49739y, (C14947a0) this.f49740z, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f49737w) {
            case 0:
                break;
        }
        return ((C13953k1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f49737w) {
            case 0:
                C13977s1 c13977s1 = (C13977s1) this.f49740z;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f49738x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (!C23283u0.m67357c(c13977s1.m39783m().f122126b)) {
                        InterfaceC2433r1 interfaceC2433r1 = c13977s1.f49852h;
                        if (interfaceC2433r1 != null) {
                            C2428q1 c2428q1M101029f0 = AbstractC32410a.m101029f0(AbstractC36259c.m115676V(c13977s1.m39783m()));
                            this.f49738x = 1;
                            ((C2386i) interfaceC2433r1).m7389a(c2428q1M101029f0);
                            if (c23454a0 == enumC31071a) {
                                return enumC31071a;
                            }
                        }
                    }
                    return c23454a0;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                if (this.f49739y) {
                    int iM67359e = C23283u0.m67359e(c13977s1.m39783m().f122126b);
                    C29891y c29891yM39774e = C13977s1.m39774e(c13977s1.m39783m().f122125a, AbstractC21478l0.m60431f(iM67359e, iM67359e));
                    c13977s1.f49847c.invoke(c29891yM39774e);
                    c13977s1.f49867w = new C23283u0(c29891yM39774e.f122126b);
                    c13977s1.m39786p(EnumC34318g0.f144086w);
                }
                return c23454a0;
            default:
                C14947a0 c14947a0 = (C14947a0) this.f49740z;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f49738x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    boolean zBooleanValue = ((Boolean) c14947a0.f55770g.getValue()).booleanValue();
                    boolean z4 = this.f49739y;
                    if (z4 != zBooleanValue) {
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        this.f49738x = 1;
                        if (AbstractC5583n.m16788n(c14947a0, boolValueOf, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13953k1(boolean z4, C14947a0 c14947a0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49739y = z4;
        this.f49740z = c14947a0;
    }
}
