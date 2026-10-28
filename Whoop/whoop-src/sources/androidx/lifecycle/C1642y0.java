package androidx.lifecycle;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.C3023j1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import hc3.AbstractC17182o;
import kc3.C22365e;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.lifecycle.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1642y0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ EnumC1635w f6335E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC32275i f6336F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6337w;

    /* JADX INFO: renamed from: x */
    public int f6338x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f6339y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC1638x f6340z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1642y0(AbstractC1638x abstractC1638x, EnumC1635w enumC1635w, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f6337w = i13;
        switch (i13) {
            case 1:
                this.f6340z = abstractC1638x;
                this.f6335E = enumC1635w;
                this.f6336F = (AbstractC32275i) interfaceC4351m;
                super(2, interfaceC30057d);
                break;
            default:
                this.f6340z = abstractC1638x;
                this.f6335E = enumC1635w;
                this.f6336F = (AbstractC32275i) interfaceC4351m;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f6337w) {
            case 0:
                C1642y0 c1642y0 = new C1642y0(this.f6340z, this.f6335E, this.f6336F, interfaceC30057d, 0);
                c1642y0.f6339y = obj;
                return c1642y0;
            default:
                C1642y0 c1642y1 = new C1642y0(this.f6340z, this.f6335E, this.f6336F, interfaceC30057d, 1);
                c1642y1.f6339y = obj;
                return c1642y1;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f6337w) {
            case 0:
                break;
        }
        return ((C1642y0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r7v0, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th3;
        C1644z c1644z;
        switch (this.f6337w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f6338x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1644z = (C1644z) this.f6339y;
                    try {
                        AbstractC34132o.m107864I(obj);
                        c1644z.m5047a();
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        c1644z.m5047a();
                        throw th3;
                    }
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) ((InterfaceC2994c0) this.f6339y).getCoroutineContext().get(C3023j1.f12041w);
                if (interfaceC3027k1 == null) {
                    throw new IllegalStateException("when[State] methods should have a parent job");
                }
                C1639x0 c1639x0 = new C1639x0();
                C1644z c1644z2 = new C1644z(this.f6340z, this.f6335E, c1639x0.f6330w, interfaceC3027k1);
                try {
                    ?? r10 = this.f6336F;
                    this.f6339y = c1644z2;
                    this.f6338x = 1;
                    obj = AbstractC3006f0.m8705K(c1639x0, r10, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                    c1644z = c1644z2;
                    c1644z.m5047a();
                    return obj;
                } catch (Throwable th5) {
                    th3 = th5;
                    c1644z = c1644z2;
                    c1644z.m5047a();
                    throw th3;
                }
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f6338x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f6339y;
                    C22365e c22365e = AbstractC3050q0.f12077a;
                    AbstractC3069w1 abstractC3069w1Mo8825s = AbstractC17182o.f65999a.mo8825s();
                    C1586g1 c1586g1 = new C1586g1(this.f6340z, this.f6335E, interfaceC2994c0, this.f6336F, null);
                    this.f6338x = 1;
                    if (AbstractC3006f0.m8705K(abstractC3069w1Mo8825s, c1586g1, this) == enumC31071a2) {
                        return enumC31071a2;
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
}
