package com.amplitude.android.engagement.types;

import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import wc3.C37142g;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: com.amplitude.android.engagement.types.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C4949y extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public static final C4949y f20285w = new C4949y(0);

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37142g("com.amplitude.android.engagement.types.FormFactor", c22673i0.getOrCreateKotlinClass(FormFactor.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(BannerFormFactor.class), c22673i0.getOrCreateKotlinClass(ModalFormFactor.class), c22673i0.getOrCreateKotlinClass(PinFormFactor.class), c22673i0.getOrCreateKotlinClass(PopoverFormFactor.class), c22673i0.getOrCreateKotlinClass(TooltipFormFactor.class)}, new InterfaceC37138c[]{BannerFormFactor$$serializer.INSTANCE, ModalFormFactor$$serializer.INSTANCE, PinFormFactor$$serializer.INSTANCE, PopoverFormFactor$$serializer.INSTANCE, TooltipFormFactor$$serializer.INSTANCE}, new Annotation[0]);
    }
}
