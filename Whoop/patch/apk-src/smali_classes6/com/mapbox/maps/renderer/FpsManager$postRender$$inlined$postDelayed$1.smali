.class public final Lcom/mapbox/maps/renderer/FpsManager$postRender$$inlined$postDelayed$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/renderer/FpsManager;->postRender()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "run",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mapbox/maps/renderer/FpsManager;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/renderer/FpsManager;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/renderer/FpsManager$postRender$$inlined$postDelayed$1;->this$0:Lcom/mapbox/maps/renderer/FpsManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/FpsManager$postRender$$inlined$postDelayed$1;->this$0:Lcom/mapbox/maps/renderer/FpsManager;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/FpsManager;->access$onRenderingPaused(Lcom/mapbox/maps/renderer/FpsManager;)V

    return-void
.end method
