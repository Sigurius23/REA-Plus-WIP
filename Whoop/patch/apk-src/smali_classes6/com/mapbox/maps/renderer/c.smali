.class public final synthetic Lcom/mapbox/maps/renderer/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLcq/i;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/mapbox/maps/renderer/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/c;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/mapbox/maps/renderer/c;->x:Z

    iput-object p3, p0, Lcom/mapbox/maps/renderer/c;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/mapbox/maps/MapView$OnSnapshotReady;Lcom/mapbox/maps/renderer/MapboxRenderer;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/mapbox/maps/renderer/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Lcom/mapbox/maps/renderer/c;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lcom/mapbox/maps/renderer/c;->x:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/mapbox/maps/renderer/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/c;->y:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/c;->z:Ljava/lang/Object;

    check-cast v1, Lcq/i;

    iget-boolean v2, p0, Lcom/mapbox/maps/renderer/c;->x:Z

    invoke-static {v0, v2, v1}, Le3/b;->a(Landroid/content/Context;ZLcq/i;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/c;->y:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapView$OnSnapshotReady;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/c;->z:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/maps/renderer/MapboxRenderer;

    iget-boolean v2, p0, Lcom/mapbox/maps/renderer/c;->x:Z

    invoke-static {v0, v1, v2}, Lcom/mapbox/maps/renderer/MapboxRenderer;->b(Lcom/mapbox/maps/MapView$OnSnapshotReady;Lcom/mapbox/maps/renderer/MapboxRenderer;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
