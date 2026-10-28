package me;

import l83.C23454a0;
import p048ce.C4469j;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import vg.InterfaceC35967n;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: me.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C25467h extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99709w;

    /* JADX INFO: renamed from: x */
    public int f99710x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC35967n f99711y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25467h(InterfaceC35967n interfaceC35967n, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f99709w = i13;
        this.f99711y = interfaceC35967n;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f99709w) {
            case 0:
                return new C25467h(this.f99711y, interfaceC30057d, 0);
            default:
                return new C25467h(this.f99711y, interfaceC30057d, 1);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f99709w) {
            case 0:
                break;
        }
        return ((C25467h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f99709w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f99710x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f99710x = 1;
                    obj = AbstractC37926s0.m121482v(this.f99711y, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return ((C4469j) obj).m13961a();
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f99710x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f99710x = 1;
                Object objM121482v = AbstractC37926s0.m121482v(this.f99711y, this);
                return objM121482v == enumC31071a2 ? enumC31071a2 : objM121482v;
        }
    }
}
