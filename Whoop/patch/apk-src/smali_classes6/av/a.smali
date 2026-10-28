.class public final Lav/a;
.super Lav/e;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final f:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lav/a;->e:I

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lav/e;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p2, p0, Lav/a;->f:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/mapbox/maps/CustomRasterSourceOptions;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lav/a;->e:I

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, Lav/e;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Lav/a;->f:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public final a(Lcom/mapbox/maps/MapboxStyleManager;)Lcom/mapbox/bindgen/Expected;
    .locals 2

    iget v0, p0, Lav/a;->e:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lav/a;->f:Ljava/io/Serializable;

    check-cast v0, Lcom/mapbox/maps/CustomRasterSourceOptions;

    iget-object v1, p0, Lav/e;->a:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleCustomRasterSource(Ljava/lang/String;Lcom/mapbox/maps/CustomRasterSourceOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lav/a;->f:Ljava/io/Serializable;

    check-cast v0, Lcom/mapbox/maps/CustomGeometrySourceOptions;

    iget-object v1, p0, Lav/e;->a:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleCustomGeometrySource(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lav/a;->e:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "custom-raster"

    return-object v0

    :pswitch_0
    const-string v0, "custom-geometry"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
