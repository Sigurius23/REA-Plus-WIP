package lb;

import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33689c;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: lb.m */
/* JADX INFO: loaded from: classes.dex */
public final class C23570m extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C23571n f93476w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f93477x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f93478y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23570m(C23571n c23571n, String str, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f93476w = c23571n;
        this.f93477x = str;
        this.f93478y = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C23570m(this.f93476w, this.f93477x, this.f93478y, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C23570m) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        InterfaceC33689c interfaceC33689cMo68212g1 = this.f93476w.f93480b.mo68212g1(this.f93477x);
        try {
            Object objInvoke = this.f93478y.invoke(interfaceC33689cMo68212g1);
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return objInvoke;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }
}
