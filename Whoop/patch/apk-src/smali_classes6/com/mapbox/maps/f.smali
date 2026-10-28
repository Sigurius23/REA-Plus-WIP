.class public final synthetic Lcom/mapbox/maps/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/Cancelable;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/mapbox/maps/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget v0, p0, Lcom/mapbox/maps/f;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lfv/h;->W:[Lj93/z;

    return-void

    :pswitch_0
    invoke-static {}, Lcom/mapbox/maps/MapboxMap;->d()V

    return-void

    :pswitch_1
    invoke-static {}, Lcom/mapbox/maps/MapboxMap;->k()V

    return-void

    :pswitch_2
    invoke-static {}, Lcom/mapbox/maps/MapboxMap;->l()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
