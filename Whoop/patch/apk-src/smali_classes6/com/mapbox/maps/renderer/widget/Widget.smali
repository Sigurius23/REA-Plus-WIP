.class public abstract Lcom/mapbox/maps/renderer/widget/Widget;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/mapbox/maps/MapboxExperimental;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001B\t\u0008\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/widget/Widget;",
        "",
        "<init>",
        "()V",
        "Ll83/a0;",
        "triggerRepaint$maps_sdk_release",
        "triggerRepaint",
        "Lcom/mapbox/maps/renderer/widget/WidgetPosition;",
        "widgetPosition",
        "setPosition",
        "(Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V",
        "getPosition",
        "()Lcom/mapbox/maps/renderer/widget/WidgetPosition;",
        "",
        "angleDegrees",
        "setRotation",
        "(F)V",
        "getRotation",
        "()F",
        "Lkotlin/Function0;",
        "action",
        "setTriggerRepaintAction$maps_sdk_release",
        "(Lc93/a;)V",
        "setTriggerRepaintAction",
        "triggerRepaintAction",
        "Lc93/a;",
        "Lcom/mapbox/maps/renderer/widget/WidgetRenderer;",
        "getRenderer$maps_sdk_release",
        "()Lcom/mapbox/maps/renderer/widget/WidgetRenderer;",
        "renderer",
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


# instance fields
.field private triggerRepaintAction:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getPosition()Lcom/mapbox/maps/renderer/widget/WidgetPosition;
.end method

.method public abstract getRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/widget/WidgetRenderer;
.end method

.method public abstract getRotation()F
.end method

.method public abstract setPosition(Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V
.end method

.method public abstract setRotation(F)V
.end method

.method public final synthetic setTriggerRepaintAction$maps_sdk_release(Lc93/a;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/renderer/widget/Widget;->triggerRepaintAction:Lc93/a;

    return-void
.end method

.method public final synthetic triggerRepaint$maps_sdk_release()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/widget/Widget;->triggerRepaintAction:Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
