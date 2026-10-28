package com.mapbox.maps.renderer;

import c93.InterfaceC4339a;
import java.util.concurrent.locks.ReentrantLock;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class MapboxRenderThread$destroy$1$1$1 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ MapboxRenderThread this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRenderThread$destroy$1$1$1(MapboxRenderThread mapboxRenderThread) {
        super(0);
        this.this$0 = mapboxRenderThread;
    }

    @Override // c93.InterfaceC4339a
    public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
        m134120invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m134120invoke() throws Throwable {
        boolean z4;
        this.this$0.surfaceProcessingLock.lock();
        boolean z13 = true;
        try {
            if (this.this$0.getEglContextMadeCurrent()) {
                z4 = true;
            } else {
                this.this$0.destroyCondition.signal();
                this.this$0.surfaceProcessingLock.unlock();
                z4 = false;
            }
            try {
                if (this.this$0.nativeRenderCreated) {
                    MapboxRenderThread.releaseAll$default(this.this$0, false, 1, null);
                }
                this.this$0.getRenderHandlerThread().clearRenderEventQueue();
                this.this$0.fpsManager.destroy();
                this.this$0.getEglCore().clearRendererStateListeners$maps_sdk_release();
                this.this$0.mapboxRenderer.setMap$maps_sdk_release(null);
                this.this$0.getRenderHandlerThread().stop();
                if (z4) {
                    this.this$0.destroyCondition.signal();
                    this.this$0.surfaceProcessingLock.unlock();
                    return;
                }
                ReentrantLock reentrantLock = this.this$0.surfaceProcessingLock;
                MapboxRenderThread mapboxRenderThread = this.this$0;
                reentrantLock.lock();
                try {
                    mapboxRenderThread.createCondition.signal();
                    reentrantLock.unlock();
                    ReentrantLock reentrantLock2 = this.this$0.surfaceProcessingLock;
                    MapboxRenderThread mapboxRenderThread2 = this.this$0;
                    reentrantLock2.lock();
                    try {
                        mapboxRenderThread2.destroyCondition.signal();
                    } finally {
                        reentrantLock2.unlock();
                    }
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            } catch (Throwable th4) {
                boolean z14 = z4;
                th = th4;
                z13 = z14;
                if (z13) {
                    this.this$0.destroyCondition.signal();
                    this.this$0.surfaceProcessingLock.unlock();
                } else {
                    ReentrantLock reentrantLock3 = this.this$0.surfaceProcessingLock;
                    MapboxRenderThread mapboxRenderThread3 = this.this$0;
                    reentrantLock3.lock();
                    try {
                        mapboxRenderThread3.createCondition.signal();
                        reentrantLock3.unlock();
                        ReentrantLock reentrantLock4 = this.this$0.surfaceProcessingLock;
                        MapboxRenderThread mapboxRenderThread4 = this.this$0;
                        reentrantLock4.lock();
                        try {
                            mapboxRenderThread4.destroyCondition.signal();
                        } finally {
                            reentrantLock4.unlock();
                        }
                    } catch (Throwable th5) {
                        reentrantLock3.unlock();
                        throw th5;
                    }
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
