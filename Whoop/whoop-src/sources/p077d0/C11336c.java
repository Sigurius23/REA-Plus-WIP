package p077d0;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11336c extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11344e f36323w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f36324x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11336c(C11344e c11344e, Object obj, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f36323w = c11344e;
        this.f36324x = obj;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C11336c(this.f36323w, this.f36324x, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C11336c c11336c = (C11336c) create((InterfaceC30057d) obj);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c11336c.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        C11344e c11344e = this.f36323w;
        C11344e.m30546b(c11344e);
        Object objM30545a = C11344e.m30545a(c11344e, this.f36324x);
        c11344e.f36343c.f36471x.setValue(objM30545a);
        c11344e.f36345e.setValue(objM30545a);
        return C23454a0.f92919a;
    }
}
