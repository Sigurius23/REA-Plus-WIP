package com.whoop.profile.view;

import a81.InterfaceC0569t;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* synthetic */ class ProfileScreenKt$ProfileScreen$5$2$1 extends C22672i implements Function1 {
    public ProfileScreenKt$ProfileScreen$5$2$1(Object obj) {
        super(1, 0, ProfileScreenEventRouter.class, obj, "onGenericModalEvent", "onGenericModalEvent(Lcom/whoop/design/atomic/organism/modal/ModalEvent;)V");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC0569t) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(InterfaceC0569t p13) {
        AbstractC22676k.m65750j(p13, "p0");
        ((ProfileScreenEventRouter) this.receiver).onGenericModalEvent(p13);
    }
}
