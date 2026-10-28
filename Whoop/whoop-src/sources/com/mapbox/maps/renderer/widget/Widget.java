package com.mapbox.maps.renderer.widget;

import c93.InterfaceC4339a;
import com.mapbox.maps.MapboxExperimental;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lcom/mapbox/maps/renderer/widget/Widget;", "", "<init>", "()V", "Ll83/a0;", "triggerRepaint$maps_sdk_release", "triggerRepaint", "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "widgetPosition", "setPosition", "(Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V", "getPosition", "()Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "", "angleDegrees", "setRotation", "(F)V", "getRotation", "()F", "Lkotlin/Function0;", "action", "setTriggerRepaintAction$maps_sdk_release", "(Lc93/a;)V", "setTriggerRepaintAction", "triggerRepaintAction", "Lc93/a;", "Lcom/mapbox/maps/renderer/widget/WidgetRenderer;", "getRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/widget/WidgetRenderer;", "renderer", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@MapboxExperimental
public abstract class Widget {
    private InterfaceC4339a triggerRepaintAction;

    public abstract WidgetPosition getPosition();

    public abstract WidgetRenderer getRenderer$maps_sdk_release();

    public abstract float getRotation();

    public abstract void setPosition(WidgetPosition widgetPosition);

    public abstract void setRotation(float angleDegrees);

    public final /* synthetic */ void setTriggerRepaintAction$maps_sdk_release(InterfaceC4339a action) {
        this.triggerRepaintAction = action;
    }

    public final /* synthetic */ void triggerRepaint$maps_sdk_release() {
        InterfaceC4339a interfaceC4339a = this.triggerRepaintAction;
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
    }
}
