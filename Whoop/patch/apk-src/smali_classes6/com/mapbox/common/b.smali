.class public final synthetic Lcom/mapbox/common/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/Map$Entry;

.field public final synthetic y:Lcom/mapbox/bindgen/Expected;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lcom/mapbox/bindgen/Expected;I)V
    .locals 0

    iput p3, p0, Lcom/mapbox/common/b;->w:I

    iput-object p1, p0, Lcom/mapbox/common/b;->x:Ljava/util/Map$Entry;

    iput-object p2, p0, Lcom/mapbox/common/b;->y:Lcom/mapbox/bindgen/Expected;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcom/mapbox/common/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/common/b;->x:Ljava/util/Map$Entry;

    iget-object v1, p0, Lcom/mapbox/common/b;->y:Lcom/mapbox/bindgen/Expected;

    invoke-static {v0, v1}, Lcom/mapbox/common/LifecycleMonitorAndroid;->a(Ljava/util/Map$Entry;Lcom/mapbox/bindgen/Expected;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/common/b;->x:Ljava/util/Map$Entry;

    iget-object v1, p0, Lcom/mapbox/common/b;->y:Lcom/mapbox/bindgen/Expected;

    invoke-static {v0, v1}, Lcom/mapbox/common/LifecycleMonitorAndroid;->d(Ljava/util/Map$Entry;Lcom/mapbox/bindgen/Expected;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
