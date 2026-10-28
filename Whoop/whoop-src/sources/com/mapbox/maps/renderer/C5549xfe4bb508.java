package com.mapbox.maps.renderer;

import c93.InterfaceC4339a;
import com.mapbox.maps.MapboxLogger;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: com.mapbox.maps.renderer.MapboxRenderThread$queueRenderEvent$$inlined$renderPreparedGuardedRun$1 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "com/mapbox/maps/renderer/MapboxRenderThread$renderPreparedGuardedRun$1", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class C5549xfe4bb508 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ MapboxRenderThread this$0;
    final /* synthetic */ MapboxRenderThread this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5549xfe4bb508(MapboxRenderThread mapboxRenderThread, MapboxRenderThread mapboxRenderThread2) {
        super(0);
        this.this$0$inline_fun = mapboxRenderThread;
        this.this$0 = mapboxRenderThread2;
    }

    @Override // c93.InterfaceC4339a
    public /* bridge */ /* synthetic */ Object invoke() {
        m134126invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m134126invoke() {
        if (!this.this$0$inline_fun.setUpRenderThread(true)) {
            MapboxLogger.logI(this.this$0$inline_fun.TAG, "Setting up render thread failed, check logs above.");
        } else {
            MapboxRenderThread.postPrepareRenderFrame$default(this.this$0, 0L, 1, null);
            MapboxLogger.logI(this.this$0$inline_fun.TAG, "Setting up render thread was OK, map should render again!");
        }
    }
}
