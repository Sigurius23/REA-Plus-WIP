.class public final Lcom/mapbox/maps/renderer/MapboxRenderThread$special$$inlined$observable$1;
.super Lf93/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/renderer/MapboxRenderThread;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;ZILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf93/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "com/mapbox/maps/renderer/MapboxRenderThread$special$$inlined$observable$1",
        "Lf93/b;",
        "Lj93/z;",
        "property",
        "oldValue",
        "newValue",
        "Ll83/a0;",
        "afterChange",
        "(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V",
        "kotlin-stdlib"
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
.field final synthetic this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/mapbox/maps/renderer/MapboxRenderThread;)V
    .locals 0

    iput-object p2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$special$$inlined$observable$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public afterChange(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/z;",
            "Lcom/mapbox/maps/renderer/OnFpsChangedListener;",
            "Lcom/mapbox/maps/renderer/OnFpsChangedListener;",
            ")V"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/mapbox/maps/renderer/OnFpsChangedListener;

    check-cast p2, Lcom/mapbox/maps/renderer/OnFpsChangedListener;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$special$$inlined$observable$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    new-instance v1, Lcom/mapbox/maps/renderer/RenderEvent;

    new-instance p1, Lcom/mapbox/maps/renderer/MapboxRenderThread$fpsChangedListener$2$1;

    invoke-direct {p1, v0, p3}, Lcom/mapbox/maps/renderer/MapboxRenderThread$fpsChangedListener$2$1;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V

    const/4 p2, 0x0

    invoke-direct {v1, p1, p2}, Lcom/mapbox/maps/renderer/RenderEvent;-><init>(Ljava/lang/Runnable;Z)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->postNonRenderEvent$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;Lcom/mapbox/maps/renderer/RenderEvent;JILjava/lang/Object;)V

    :cond_0
    return-void
.end method
