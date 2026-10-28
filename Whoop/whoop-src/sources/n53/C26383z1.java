package n53;

import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q40.C29967e;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: n53.z1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26383z1 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f104831w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13062m f104832x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f104833y;

    public /* synthetic */ C26383z1(InterfaceC13062m interfaceC13062m, Function1 function1, int i13) {
        this.f104831w = i13;
        this.f104832x = interfaceC13062m;
        this.f104833y = function1;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        C26380y1 c26380y1;
        C29967e c29967e;
        switch (this.f104831w) {
            case 0:
                if (interfaceC30057d instanceof C26380y1) {
                    c26380y1 = (C26380y1) interfaceC30057d;
                    int i13 = c26380y1.f104826x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c26380y1.f104826x = i13 - Integer.MIN_VALUE;
                    } else {
                        c26380y1 = new C26380y1(this, interfaceC30057d);
                    }
                } else {
                    c26380y1 = new C26380y1(this, interfaceC30057d);
                }
                Object obj2 = c26380y1.f104825w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c26380y1.f104826x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    Object objInvoke = this.f104833y.invoke(obj);
                    c26380y1.f104826x = 1;
                    if (this.f104832x.emit(objInvoke, c26380y1) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            default:
                if (interfaceC30057d instanceof C29967e) {
                    c29967e = (C29967e) interfaceC30057d;
                    int i15 = c29967e.f122391x;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c29967e.f122391x = i15 - Integer.MIN_VALUE;
                    } else {
                        c29967e = new C29967e(this, interfaceC30057d);
                    }
                } else {
                    c29967e = new C29967e(this, interfaceC30057d);
                }
                Object obj3 = c29967e.f122390w;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = c29967e.f122391x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    Object objInvoke2 = this.f104833y.invoke(obj);
                    c29967e.f122391x = 1;
                    if (this.f104832x.emit(objInvoke2, c29967e) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj3);
                }
                return C23454a0.f92919a;
        }
    }
}
