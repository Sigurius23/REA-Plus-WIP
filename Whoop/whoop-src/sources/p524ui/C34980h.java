package p524ui;

import l83.C23454a0;
import p426qi.C30387i;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ui.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C34980h extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f147999E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C34981i f148000w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30387i f148001x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f148002y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f148003z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34980h(C34981i c34981i, C30387i c30387i, float f13, int i13, boolean z4, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f148000w = c34981i;
        this.f148001x = c30387i;
        this.f148002y = f13;
        this.f148003z = i13;
        this.f147999E = z4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C34980h(this.f148000w, this.f148001x, this.f148002y, this.f148003z, this.f147999E, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C34980h c34980h = (C34980h) create((InterfaceC30057d) obj);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c34980h.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        C30387i c30387i = this.f148001x;
        C34981i c34981i = this.f148000w;
        c34981i.f148008I.setValue(c30387i);
        c34981i.m110476n(this.f148002y);
        c34981i.m110475m(this.f148003z);
        c34981i.f148015w.setValue(Boolean.FALSE);
        if (this.f147999E) {
            c34981i.f148011L.setValue(Long.MIN_VALUE);
        }
        return C23454a0.f92919a;
    }
}
