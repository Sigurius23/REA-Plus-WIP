package com.mapbox.maps.renderer;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "run", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class MapboxRenderThread$fpsChangedListener$2$1 implements Runnable {
    final /* synthetic */ OnFpsChangedListener $new;
    final /* synthetic */ MapboxRenderThread this$0;

    public MapboxRenderThread$fpsChangedListener$2$1(MapboxRenderThread mapboxRenderThread, OnFpsChangedListener onFpsChangedListener) {
        this.this$0 = mapboxRenderThread;
        this.$new = onFpsChangedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.this$0.fpsManager.setFpsChangedListener$maps_sdk_release(this.$new);
    }
}
