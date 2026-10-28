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

/* JADX INFO: renamed from: me.a */
/* JADX INFO: loaded from: classes.dex */
public final class C25460a extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public int f99694w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC35967n f99695x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25460a(InterfaceC35967n interfaceC35967n, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f99695x = interfaceC35967n;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C25460a(this.f99695x, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C25460a) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f99694w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            this.f99694w = 1;
            obj = AbstractC37926s0.m121482v(this.f99695x, this);
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
    }
}
