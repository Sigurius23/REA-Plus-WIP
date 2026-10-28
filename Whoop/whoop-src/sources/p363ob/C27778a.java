package p363ob;

import androidx.room.InterfaceC1837v1;
import c93.InterfaceC4351m;
import l83.C23454a0;
import lb.InterfaceC23559b0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ob.a */
/* JADX INFO: loaded from: classes.dex */
public final class C27778a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111983w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f111984x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f111985y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27778a(int i13, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f111983w = i13;
        this.f111985y = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f111983w) {
            case 0:
                C27778a c27778a = new C27778a(0, this.f111985y, interfaceC30057d);
                c27778a.f111984x = obj;
                return c27778a;
            default:
                C27778a c27778a2 = new C27778a(1, this.f111985y, interfaceC30057d);
                c27778a2.f111984x = obj;
                return c27778a2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1837v1 interfaceC1837v1 = (InterfaceC1837v1) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f111983w) {
            case 0:
                break;
        }
        return ((C27778a) create(interfaceC1837v1, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f111983w;
        Function1 function1 = this.f111985y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC1837v1 interfaceC1837v1 = (InterfaceC1837v1) this.f111984x;
                AbstractC22676k.m65748h(interfaceC1837v1, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return function1.invoke(((InterfaceC23559b0) interfaceC1837v1).mo68206d());
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC1837v1 interfaceC1837v2 = (InterfaceC1837v1) this.f111984x;
                AbstractC22676k.m65748h(interfaceC1837v2, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return function1.invoke(((InterfaceC23559b0) interfaceC1837v2).mo68206d());
        }
    }
}
