.class public final synthetic Lcom/mapbox/maps/renderer/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lcom/mapbox/maps/renderer/a;->w:I

    iput-object p1, p0, Lcom/mapbox/maps/renderer/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 1

    iget v0, p0, Lcom/mapbox/maps/renderer/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lcom/mapbox/maps/renderer/a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0, p1, p2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->a(Lcom/mapbox/maps/renderer/MapboxRenderThread;J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
