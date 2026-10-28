package com.mapbox.maps.util;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: com.mapbox.maps.util.CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class C5559xf6a78dfe extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ CoreGesturesHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5559xf6a78dfe(CoreGesturesHandler coreGesturesHandler) {
        super(0);
        this.this$0 = coreGesturesHandler;
    }

    @Override // c93.InterfaceC4339a
    public /* bridge */ /* synthetic */ Object invoke() {
        m134135invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m134135invoke() {
        this.this$0.gestureAnimationStarted = false;
        if (this.this$0.isSetCenterAltitudeModeNeeded()) {
            this.this$0.mapCameraManagerDelegate.setCenterAltitudeMode(this.this$0.cachedCenterAltitudeMode);
        }
        this.this$0.mapTransformDelegate.setGestureInProgress(false);
    }
}
