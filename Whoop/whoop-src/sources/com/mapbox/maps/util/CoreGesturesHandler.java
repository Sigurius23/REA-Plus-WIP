package com.mapbox.maps.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import c93.InterfaceC4339a;
import com.mapbox.maps.MapCenterAltitudeMode;
import com.mapbox.maps.threading.AnimationThreadController;
import l83.C23454a0;
import mv.InterfaceC25962a;
import mv.InterfaceC25969h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/mapbox/maps/util/CoreGesturesHandler;", "", "Lmv/h;", "mapTransformDelegate", "Lmv/a;", "mapCameraManagerDelegate", "<init>", "(Lmv/h;Lmv/a;)V", "", "isSetCenterAltitudeModeNeeded", "()Z", "Ll83/a0;", "notifyCoreGestureStarted", "()V", "notifyCoreTouchEnded", "Lmv/h;", "Lmv/a;", "gestureAnimationStarted", "Z", "gestureStarted", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "cachedCenterAltitudeMode", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "Landroid/animation/AnimatorListenerAdapter;", "coreGestureAnimatorHandler", "Landroid/animation/AnimatorListenerAdapter;", "getCoreGestureAnimatorHandler", "()Landroid/animation/AnimatorListenerAdapter;", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class CoreGesturesHandler {
    private MapCenterAltitudeMode cachedCenterAltitudeMode;
    private final AnimatorListenerAdapter coreGestureAnimatorHandler;
    private boolean gestureAnimationStarted;
    private boolean gestureStarted;
    private final InterfaceC25962a mapCameraManagerDelegate;
    private final InterfaceC25969h mapTransformDelegate;

    /* JADX INFO: renamed from: com.mapbox.maps.util.CoreGesturesHandler$notifyCoreGestureStarted$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55611 extends AbstractC22680m implements InterfaceC4339a {
        public C55611() {
            super(0);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134137invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134137invoke() {
            CoreGesturesHandler coreGesturesHandler = CoreGesturesHandler.this;
            coreGesturesHandler.cachedCenterAltitudeMode = coreGesturesHandler.mapCameraManagerDelegate.getCenterAltitudeMode();
            CoreGesturesHandler.this.gestureStarted = true;
            CoreGesturesHandler.this.mapTransformDelegate.setGestureInProgress(true);
            if (CoreGesturesHandler.this.isSetCenterAltitudeModeNeeded()) {
                CoreGesturesHandler.this.mapCameraManagerDelegate.setCenterAltitudeMode(MapCenterAltitudeMode.SEA);
            }
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.util.CoreGesturesHandler$notifyCoreTouchEnded$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55621 extends AbstractC22680m implements InterfaceC4339a {
        public C55621() {
            super(0);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134138invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134138invoke() {
            if (CoreGesturesHandler.this.isSetCenterAltitudeModeNeeded()) {
                CoreGesturesHandler.this.mapCameraManagerDelegate.setCenterAltitudeMode(CoreGesturesHandler.this.cachedCenterAltitudeMode);
            }
            CoreGesturesHandler.this.mapTransformDelegate.setGestureInProgress(false);
            CoreGesturesHandler.this.gestureStarted = false;
        }
    }

    public CoreGesturesHandler(InterfaceC25969h mapTransformDelegate, InterfaceC25962a mapCameraManagerDelegate) {
        AbstractC22676k.m65750j(mapTransformDelegate, "mapTransformDelegate");
        AbstractC22676k.m65750j(mapCameraManagerDelegate, "mapCameraManagerDelegate");
        this.mapTransformDelegate = mapTransformDelegate;
        this.mapCameraManagerDelegate = mapCameraManagerDelegate;
        this.cachedCenterAltitudeMode = mapCameraManagerDelegate.getCenterAltitudeMode();
        this.coreGestureAnimatorHandler = new AnimatorListenerAdapter() { // from class: com.mapbox.maps.util.CoreGesturesHandler$coreGestureAnimatorHandler$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                AbstractC22676k.m65750j(animation, "animation");
                super.onAnimationEnd(animation);
                AnimationThreadController.INSTANCE.postOnMainThread(new C5559xf6a78dfe(this.this$0));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                AbstractC22676k.m65750j(animation, "animation");
                super.onAnimationStart(animation);
                AnimationThreadController.INSTANCE.postOnMainThread(new C5560xd9ca8645(this.this$0));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSetCenterAltitudeModeNeeded() {
        return this.cachedCenterAltitudeMode != MapCenterAltitudeMode.SEA;
    }

    public final AnimatorListenerAdapter getCoreGestureAnimatorHandler() {
        return this.coreGestureAnimatorHandler;
    }

    public final void notifyCoreGestureStarted() {
        if (this.gestureStarted) {
            return;
        }
        AnimationThreadController.INSTANCE.postOnMainThread(new C55611());
    }

    public final void notifyCoreTouchEnded() {
        if (!this.gestureStarted || this.gestureAnimationStarted) {
            return;
        }
        AnimationThreadController.INSTANCE.postOnMainThread(new C55621());
    }
}
