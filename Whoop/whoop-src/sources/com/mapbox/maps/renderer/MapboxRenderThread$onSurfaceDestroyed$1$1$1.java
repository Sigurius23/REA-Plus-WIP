package com.mapbox.maps.renderer;

import android.view.Choreographer;
import c93.InterfaceC4339a;
import java.util.concurrent.locks.ReentrantLock;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class MapboxRenderThread$onSurfaceDestroyed$1$1$1 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ MapboxRenderThread this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRenderThread$onSurfaceDestroyed$1$1$1(MapboxRenderThread mapboxRenderThread) {
        super(0);
        this.this$0 = mapboxRenderThread;
    }

    @Override // c93.InterfaceC4339a
    public /* bridge */ /* synthetic */ Object invoke() {
        m134122invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m134122invoke() {
        this.this$0.setAwaitingNextVsync$maps_sdk_release(false);
        Choreographer.getInstance().removeFrameCallback(this.this$0);
        ReentrantLock reentrantLock = this.this$0.surfaceProcessingLock;
        MapboxRenderThread mapboxRenderThread = this.this$0;
        reentrantLock.lock();
        try {
            if (mapboxRenderThread.nativeRenderCreated && (mapboxRenderThread.mapboxRenderer instanceof MapboxTextureViewRenderer)) {
                MapboxRenderThread.releaseAll$default(mapboxRenderThread, false, 1, null);
                mapboxRenderThread.getRenderHandlerThread().clearRenderEventQueue();
            } else {
                mapboxRenderThread.releaseEglSurface();
            }
            mapboxRenderThread.fpsManager.onSurfaceDestroyed();
            mapboxRenderThread.destroyCondition.signal();
        } finally {
            reentrantLock.unlock();
        }
    }
}
