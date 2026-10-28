package p077d0;

import a20.C0162b;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d0.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11334b1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C11350f1 f36313E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C11421z1 f36314F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ float f36315G;

    /* JADX INFO: renamed from: w */
    public int f36316w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f36317x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f36318y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f36319z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11334b1(Object obj, Object obj2, C11350f1 c11350f1, C11421z1 c11421z1, float f13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f36318y = obj;
        this.f36319z = obj2;
        this.f36313E = c11350f1;
        this.f36314F = c11421z1;
        this.f36315G = f13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C11334b1 c11334b1 = new C11334b1(this.f36318y, this.f36319z, this.f36313E, this.f36314F, this.f36315G, interfaceC30057d);
        c11334b1.f36317x = obj;
        return c11334b1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C11334b1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f36316w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C11350f1 c11350f1 = this.f36313E;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f36317x;
            Object obj2 = this.f36318y;
            Object obj3 = this.f36319z;
            InterfaceC30057d interfaceC30057d = null;
            if (AbstractC22676k.m65745e(obj2, obj3)) {
                c11350f1.f36390O = null;
                if (AbstractC22676k.m65745e(c11350f1.f36395z.getValue(), obj2)) {
                    return c23454a0;
                }
            } else {
                C11350f1.m30577H0(c11350f1);
            }
            boolean zM65745e = AbstractC22676k.m65745e(obj2, obj3);
            float f13 = this.f36315G;
            if (!zM65745e) {
                C11421z1 c11421z1 = this.f36314F;
                c11421z1.m30674p(obj2);
                c11421z1.m30672n(0L);
                c11350f1.f36394y.setValue(obj2);
                c11421z1.m30668j(f13);
            }
            c11350f1.m30586Q0(f13);
            if (c11350f1.f36389N.m105h()) {
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C0162b(c11350f1, interfaceC30057d, 12), 3);
            } else {
                c11350f1.f36388M = Long.MIN_VALUE;
            }
            this.f36316w = 1;
            if (C11350f1.m30580K0(c11350f1, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        c11350f1.m30585P0();
        return c23454a0;
    }
}
