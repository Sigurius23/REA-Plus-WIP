.class public final Lfv/f;
.super Lf93/b;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lfv/h;


# direct methods
.method public synthetic constructor <init>(Lfv/h;I)V
    .locals 0

    iput p2, p0, Lfv/f;->w:I

    iput-object p1, p0, Lfv/f;->x:Lfv/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final afterChange(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lfv/f;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Double;

    check-cast p2, Ljava/lang/Double;

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {p2, v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Double;D)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lfv/f;->x:Lfv/h;

    iget-object p1, p1, Lfv/h;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lov/d;

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    invoke-virtual {p2, p3}, Lov/d;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :pswitch_0
    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Double;

    check-cast p2, Ljava/lang/Double;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {p2, v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Double;D)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lfv/f;->x:Lfv/h;

    iget-object p1, p1, Lfv/h;->H:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lov/d;

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    invoke-virtual {p2, p3}, Lov/d;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    return-void

    :pswitch_1
    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/mapbox/maps/ScreenCoordinate;

    check-cast p2, Lcom/mapbox/maps/ScreenCoordinate;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lfv/f;->x:Lfv/h;

    iget-object p1, p1, Lfv/h;->G:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_3
    :goto_2
    return-void

    :pswitch_2
    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/mapbox/maps/EdgeInsets;

    check-cast p2, Lcom/mapbox/maps/EdgeInsets;

    if-eqz p3, :cond_4

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lfv/f;->x:Lfv/h;

    iget-object p1, p1, Lfv/h;->F:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lov/d;

    invoke-virtual {p2, p3}, Lov/d;->a(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    return-void

    :pswitch_3
    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Double;

    check-cast p2, Ljava/lang/Double;

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {p2, v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Double;D)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lfv/f;->x:Lfv/h;

    iget-object p1, p1, Lfv/h;->E:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lov/d;

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    invoke-virtual {p2, p3}, Lov/d;->a(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    return-void

    :pswitch_4
    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/mapbox/geojson/Point;

    check-cast p2, Lcom/mapbox/geojson/Point;

    if-eqz p3, :cond_6

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lfv/f;->x:Lfv/h;

    iget-object p1, p1, Lfv/h;->z:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lov/d;

    invoke-virtual {p2, p3}, Lov/d;->a(Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
