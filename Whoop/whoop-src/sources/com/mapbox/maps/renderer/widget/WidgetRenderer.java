package com.mapbox.maps.renderer.widget;

import com.mapbox.maps.MapboxExperimental;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H'¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lcom/mapbox/maps/renderer/widget/WidgetRenderer;", "", "", "width", "height", "Ll83/a0;", "onSurfaceChanged", "(II)V", "prepare", "()V", "render", "release", "", "angleDegrees", "setRotation", "(F)V", "getRotation", "()F", "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "widgetPosition", "setPosition", "(Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V", "getPosition", "()Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "", "getNeedRender", "()Z", "needRender", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface WidgetRenderer {
    boolean getNeedRender();

    @MapboxExperimental
    WidgetPosition getPosition();

    float getRotation();

    void onSurfaceChanged(int width, int height);

    void prepare();

    void release();

    void render();

    @MapboxExperimental
    void setPosition(WidgetPosition widgetPosition);

    void setRotation(float angleDegrees);
}
