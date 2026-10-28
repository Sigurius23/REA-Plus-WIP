.class public final Lrv/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrv/m;


# direct methods
.method public synthetic constructor <init>(Lrv/m;I)V
    .locals 0

    iput p2, p0, Lrv/d;->w:I

    iput-object p1, p0, Lrv/d;->x:Lrv/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5

    iget p2, p0, Lrv/d;->w:I

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    const/4 v1, 0x0

    iget-object v2, p0, Lrv/d;->x:Lrv/m;

    const/4 v3, 0x1

    packed-switch p2, :pswitch_data_0

    check-cast p1, Lcom/mapbox/common/location/Location;

    invoke-virtual {p1}, Lcom/mapbox/common/location/Location;->getHorizontalAccuracy()Ljava/lang/Double;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    new-array v4, v3, [D

    aput-wide p1, v4, v1

    iget-object p1, v2, Lrv/m;->y:Lrv/r;

    if-eqz p1, :cond_0

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object p2

    invoke-virtual {p1, p2}, Lrv/r;->f([D)V

    :cond_0
    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    new-array v4, v3, [D

    aput-wide p1, v4, v1

    iget-object p1, v2, Lrv/m;->y:Lrv/r;

    if-eqz p1, :cond_1

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {p1, p2, v1}, Lrv/r;->d(Lrv/r;[DI)V

    :cond_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
