package p133f1;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f1.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13950j1 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49726w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13977s1 f49727x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13950j1(C13977s1 c13977s1, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f49726w = i13;
        this.f49727x = c13977s1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f49726w) {
            case 0:
                return new C13950j1(this.f49727x, interfaceC30057d, 0);
            case 1:
                return new C13950j1(this.f49727x, interfaceC30057d, 1);
            case 2:
                return new C13950j1(this.f49727x, interfaceC30057d, 2);
            default:
                return new C13950j1(this.f49727x, interfaceC30057d, 3);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f49726w) {
            case 0:
                C13950j1 c13950j1 = (C13950j1) create(interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c13950j1.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                C13950j1 c13950j2 = (C13950j1) create(interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c13950j2.invokeSuspend(c23454a1);
                return c23454a1;
            case 2:
                C13950j1 c13950j3 = (C13950j1) create(interfaceC30057d);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c13950j3.invokeSuspend(c23454a2);
                return c23454a2;
            default:
                C13950j1 c13950j4 = (C13950j1) create(interfaceC30057d);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c13950j4.invokeSuspend(c23454a3);
                return c23454a3;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f49726w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C13977s1 c13977s1 = this.f49727x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c13977s1.f49844B = false;
                break;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c13977s1.m39776f();
                break;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c13977s1.m39775d(c13977s1.f49844B);
                break;
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c13977s1.m39785o();
                break;
        }
        return c23454a0;
    }
}
