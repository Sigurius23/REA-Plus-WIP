.class public final synthetic Lcom/mapbox/maps/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/Style$OnStyleLoaded;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lcom/mapbox/maps/a;->w:I

    iput-object p1, p0, Lcom/mapbox/maps/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStyleLoaded(Lcom/mapbox/maps/Style;)V
    .locals 2

    iget v0, p0, Lcom/mapbox/maps/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/maps/a;->x:Ljava/lang/Object;

    check-cast v0, Lo52/w;

    invoke-static {v0, p1}, Lo52/w;->G(Lo52/w;Lcom/mapbox/maps/Style;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/maps/a;->x:Ljava/lang/Object;

    check-cast v0, Lov/n;

    const-string v1, "style"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lov/n;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/mapbox/maps/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxMap;->c(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/Style;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/mapbox/maps/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapController;

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapController;->c(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/Style;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
