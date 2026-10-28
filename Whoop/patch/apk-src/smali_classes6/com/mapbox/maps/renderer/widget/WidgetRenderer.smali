.class public interface abstract Lcom/mapbox/maps/renderer/widget/WidgetRenderer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000cH\'\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000cH\'\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\'\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\'\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/widget/WidgetRenderer;",
        "",
        "",
        "width",
        "height",
        "Ll83/a0;",
        "onSurfaceChanged",
        "(II)V",
        "prepare",
        "()V",
        "render",
        "release",
        "",
        "angleDegrees",
        "setRotation",
        "(F)V",
        "getRotation",
        "()F",
        "Lcom/mapbox/maps/renderer/widget/WidgetPosition;",
        "widgetPosition",
        "setPosition",
        "(Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V",
        "getPosition",
        "()Lcom/mapbox/maps/renderer/widget/WidgetPosition;",
        "",
        "getNeedRender",
        "()Z",
        "needRender",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getNeedRender()Z
.end method

.method public abstract getPosition()Lcom/mapbox/maps/renderer/widget/WidgetPosition;
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation
.end method

.method public abstract getRotation()F
.end method

.method public abstract onSurfaceChanged(II)V
.end method

.method public abstract prepare()V
.end method

.method public abstract release()V
.end method

.method public abstract render()V
.end method

.method public abstract setPosition(Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation
.end method

.method public abstract setRotation(F)V
.end method
