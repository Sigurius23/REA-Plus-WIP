.class public final synthetic Lq3/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic w:Landroid/view/Choreographer;


# direct methods
.method public synthetic constructor <init>(Landroid/view/Choreographer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/c0;->w:Landroid/view/Choreographer;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/renderer/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/mapbox/maps/renderer/a;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p0, Lq3/c0;->w:Landroid/view/Choreographer;

    invoke-virtual {p1, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method
