.class public final Lc0/v0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lc0/v0;->w:I

    iput-object p1, p0, Lc0/v0;->x:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lc0/v0;->w:I

    const/4 v1, 0x0

    const/16 v2, 0x20

    const-wide v3, 0xffffffffL

    iget-object v5, p0, Lc0/v0;->x:Lkotlin/jvm/functions/Function1;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/q;

    check-cast p1, Lc0/x;

    invoke-virtual {p1}, Lc0/x;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    const-string v1, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lgb/h;

    sget v1, Leb/n0;->K:I

    invoke-static {v0}, Lts/o;->y(Leb/n0;)Lxb3/i;

    move-result-object v0

    invoke-interface {v0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/n0;

    goto :goto_0

    :cond_0
    if-eqz v5, :cond_1

    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc0/r1;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_0
    check-cast p1, Ly3/l;

    iget-wide v6, p1, Ly3/l;->a:J

    and-long/2addr v6, v3

    long-to-int p1, v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-long v0, v1

    shl-long/2addr v0, v2

    int-to-long v5, p1

    and-long v2, v5, v3

    or-long/2addr v0, v2

    new-instance p1, Ly3/j;

    invoke-direct {p1, v0, v1}, Ly3/j;-><init>(J)V

    return-object p1

    :pswitch_1
    check-cast p1, Ly3/l;

    iget-wide v6, p1, Ly3/l;->a:J

    shr-long/2addr v6, v2

    long-to-int p1, v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-long v5, p1

    shl-long/2addr v5, v2

    int-to-long v0, v1

    and-long/2addr v0, v3

    or-long/2addr v0, v5

    new-instance p1, Ly3/j;

    invoke-direct {p1, v0, v1}, Ly3/j;-><init>(J)V

    return-object p1

    :pswitch_2
    check-cast p1, Ly3/l;

    iget-wide v6, p1, Ly3/l;->a:J

    and-long/2addr v6, v3

    long-to-int p1, v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-long v0, v1

    shl-long/2addr v0, v2

    int-to-long v5, p1

    and-long v2, v5, v3

    or-long/2addr v0, v2

    new-instance p1, Ly3/j;

    invoke-direct {p1, v0, v1}, Ly3/j;-><init>(J)V

    return-object p1

    :pswitch_3
    check-cast p1, Ly3/l;

    iget-wide v6, p1, Ly3/l;->a:J

    shr-long/2addr v6, v2

    long-to-int p1, v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-long v5, p1

    shl-long/2addr v5, v2

    int-to-long v0, v1

    and-long/2addr v0, v3

    or-long/2addr v0, v5

    new-instance p1, Ly3/j;

    invoke-direct {p1, v0, v1}, Ly3/j;-><init>(J)V

    return-object p1

    :pswitch_4
    check-cast p1, Ly3/l;

    iget-wide v0, p1, Ly3/l;->a:J

    shr-long v6, v0, v2

    long-to-int p1, v6

    and-long/2addr v0, v3

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    int-to-long v5, p1

    shl-long v1, v5, v2

    int-to-long v5, v0

    and-long/2addr v3, v5

    or-long v0, v1, v3

    new-instance p1, Ly3/l;

    invoke-direct {p1, v0, v1}, Ly3/l;-><init>(J)V

    return-object p1

    :pswitch_5
    check-cast p1, Ly3/l;

    iget-wide v0, p1, Ly3/l;->a:J

    shr-long v6, v0, v2

    long-to-int p1, v6

    and-long/2addr v0, v3

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    int-to-long v5, p1

    shl-long v1, v5, v2

    int-to-long v5, v0

    and-long/2addr v3, v5

    or-long v0, v1, v3

    new-instance p1, Ly3/l;

    invoke-direct {p1, v0, v1}, Ly3/l;-><init>(J)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
