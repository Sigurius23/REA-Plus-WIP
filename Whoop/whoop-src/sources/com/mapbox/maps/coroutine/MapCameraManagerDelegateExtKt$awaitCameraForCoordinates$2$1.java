package com.mapbox.maps.coroutine;

import com.mapbox.maps.CameraOptions;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
public /* synthetic */ class MapCameraManagerDelegateExtKt$awaitCameraForCoordinates$2$1 extends C22672i implements Function1 {
    public MapCameraManagerDelegateExtKt$awaitCameraForCoordinates$2$1(Object obj) {
        super(1, 1, AbstractC30060g.class, obj, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CameraOptions) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(CameraOptions p13) {
        AbstractC22676k.m65750j(p13, "p0");
        ((InterfaceC30057d) this.receiver).resumeWith(p13);
    }
}
