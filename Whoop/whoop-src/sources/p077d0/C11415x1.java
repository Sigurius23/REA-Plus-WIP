package p077d0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c33.C3936c;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d0.x1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11415x1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f36612E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36613w = 1;

    /* JADX INFO: renamed from: x */
    public int f36614x;

    /* JADX INFO: renamed from: y */
    public float f36615y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f36616z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11415x1(C3936c c3936c, float f13, InterfaceC11372l interfaceC11372l, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f36616z = c3936c;
        this.f36615y = f13;
        this.f36612E = interfaceC11372l;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f36613w) {
            case 0:
                C11415x1 c11415x1 = new C11415x1((C11421z1) this.f36612E, interfaceC30057d);
                c11415x1.f36616z = obj;
                return c11415x1;
            default:
                return new C11415x1((C3936c) this.f36616z, this.f36615y, (InterfaceC11372l) this.f36612E, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f36613w) {
            case 0:
                break;
        }
        return ((C11415x1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        float fM30568p;
        InterfaceC2994c0 interfaceC2994c0;
        switch (this.f36613w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f36614x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f36616z;
                    fM30568p = AbstractC11348f.m30568p(interfaceC2994c1.getCoroutineContext());
                    interfaceC2994c0 = interfaceC2994c1;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fM30568p = this.f36615y;
                    interfaceC2994c0 = (InterfaceC2994c0) this.f36616z;
                    AbstractC34132o.m107864I(obj);
                }
                while (AbstractC3006f0.m8729w(interfaceC2994c0)) {
                    C11412w1 c11412w1 = new C11412w1((C11421z1) this.f36612E, fM30568p, 0);
                    this.f36616z = interfaceC2994c0;
                    this.f36615y = fM30568p;
                    this.f36614x = 1;
                    if (AbstractC28683x.m87268v(getContext()).mo7286k(c11412w1, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f36614x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11344e c11344e = (C11344e) ((C3936c) this.f36616z).f16071d;
                    Float f13 = new Float(this.f36615y);
                    InterfaceC11372l interfaceC11372l = (InterfaceC11372l) this.f36612E;
                    this.f36614x = 1;
                    if (C11344e.m30547d(c11344e, f13, interfaceC11372l, null, this, 12) == enumC31071a2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11415x1(C11421z1 c11421z1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f36612E = c11421z1;
    }
}
