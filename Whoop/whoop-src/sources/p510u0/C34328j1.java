package p510u0;

import a30.C0327u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import l83.C23454a0;
import p132f0.C13774c;
import p180h0.C16398h2;
import p181h2.C16617b;
import p238j0.InterfaceC21083i;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: u0.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34328j1 extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f144144E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC21083i f144145F;

    /* JADX INFO: renamed from: w */
    public int f144146w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ C16398h2 f144147x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ long f144148y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC2994c0 f144149z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34328j1(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC21083i interfaceC21083i, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f144149z = interfaceC2994c0;
        this.f144144E = interfaceC28601c1;
        this.f144145F = interfaceC21083i;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j7 = ((C16617b) obj2).f63937a;
        InterfaceC28601c1 interfaceC28601c1 = this.f144144E;
        InterfaceC21083i interfaceC21083i = this.f144145F;
        C34328j1 c34328j1 = new C34328j1(this.f144149z, interfaceC28601c1, interfaceC21083i, (InterfaceC30057d) obj3);
        c34328j1.f144147x = (C16398h2) obj;
        c34328j1.f144148y = j7;
        return c34328j1.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM46590f;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f144146w;
        InterfaceC2994c0 interfaceC2994c0 = this.f144149z;
        InterfaceC30057d interfaceC30057d = null;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C16398h2 c16398h2 = this.f144147x;
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C13774c(this.f144144E, this.f144148y, this.f144145F, (InterfaceC30057d) null, 7), 3);
            this.f144146w = 1;
            objM46590f = c16398h2.m46590f(this);
            if (objM46590f == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM46590f = obj;
        }
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C0327u(this.f144144E, ((Boolean) objM46590f).booleanValue(), this.f144145F, interfaceC30057d, 6), 3);
        return C23454a0.f92919a;
    }
}
