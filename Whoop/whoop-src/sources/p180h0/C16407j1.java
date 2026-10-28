package p180h0;

import l83.C23454a0;
import p181h2.C16617b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16407j1 extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63062w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16407j1(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f63062w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f63062w) {
            case 0:
                long j7 = ((C16617b) obj2).f63937a;
                C16407j1 c16407j1 = new C16407j1(3, 0, (InterfaceC30057d) obj3);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c16407j1.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                ((Number) obj2).floatValue();
                C16407j1 c16407j2 = new C16407j1(3, 1, (InterfaceC30057d) obj3);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c16407j2.invokeSuspend(c23454a1);
                return c23454a1;
            default:
                ((Number) obj).intValue();
                new C16407j1(3, 2, (InterfaceC30057d) obj3).invokeSuspend(C23454a0.f92919a);
                return Boolean.FALSE;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f63062w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.FALSE;
        }
    }
}
