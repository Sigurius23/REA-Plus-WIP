.class public final synthetic Lcom/mapbox/maps/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/Style$OnStyleLoaded;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Luu/a;


# direct methods
.method public synthetic constructor <init>(Luu/a;I)V
    .locals 0

    iput p2, p0, Lcom/mapbox/maps/i;->w:I

    iput-object p1, p0, Lcom/mapbox/maps/i;->x:Luu/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStyleLoaded(Lcom/mapbox/maps/Style;)V
    .locals 1

    iget v0, p0, Lcom/mapbox/maps/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/maps/i;->x:Luu/a;

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxMap;->g(Luu/a;Lcom/mapbox/maps/Style;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/maps/i;->x:Luu/a;

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxMap;->a(Luu/a;Lcom/mapbox/maps/Style;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/mapbox/maps/i;->x:Luu/a;

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxMap;->r(Luu/a;Lcom/mapbox/maps/Style;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
