.class public final Lc0/w;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc0/x;


# direct methods
.method public synthetic constructor <init>(Lc0/x;I)V
    .locals 0

    iput p2, p0, Lc0/w;->w:I

    iput-object p1, p0, Lc0/w;->x:Lc0/x;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lc0/w;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lc0/w;->x:Lc0/x;

    iget-object v1, v0, Lc0/x;->e:La0/v0;

    iget-object v2, v0, Lc0/x;->a:Ld0/z1;

    iget-object v2, v2, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/t2;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/l;

    iget-wide v1, v1, Ly3/l;->a:J

    :goto_0
    move-wide v6, v1

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    goto :goto_0

    :goto_1
    int-to-long v1, p1

    const/16 p1, 0x20

    shl-long v3, v1, p1

    const-wide v9, 0xffffffffL

    and-long/2addr v1, v9

    or-long v4, v3, v1

    iget-object v3, v0, Lc0/x;->b:Lb2/h;

    sget-object v8, Ly3/m;->w:Ly3/m;

    invoke-interface/range {v3 .. v8}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v0

    and-long/2addr v0, v9

    long-to-int p1, v0

    neg-int p1, p1

    and-long v0, v6, v9

    long-to-int v0, v0

    add-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lc0/w;->x:Lc0/x;

    iget-object v1, v0, Lc0/x;->e:La0/v0;

    iget-object v2, v0, Lc0/x;->a:Ld0/z1;

    iget-object v2, v2, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/t2;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/l;

    iget-wide v1, v1, Ly3/l;->a:J

    :goto_2
    move-wide v6, v1

    goto :goto_3

    :cond_1
    const-wide/16 v1, 0x0

    goto :goto_2

    :goto_3
    int-to-long v1, p1

    const/16 v3, 0x20

    shl-long v3, v1, v3

    const-wide v9, 0xffffffffL

    and-long/2addr v1, v9

    or-long v4, v3, v1

    iget-object v3, v0, Lc0/x;->b:Lb2/h;

    sget-object v8, Ly3/m;->w:Ly3/m;

    invoke-interface/range {v3 .. v8}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v0

    and-long/2addr v0, v9

    long-to-int v0, v0

    neg-int v0, v0

    sub-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lc0/w;->x:Lc0/x;

    iget-object v1, v0, Lc0/x;->e:La0/v0;

    iget-object v2, v0, Lc0/x;->a:Ld0/z1;

    iget-object v2, v2, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/t2;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/l;

    iget-wide v1, v1, Ly3/l;->a:J

    :goto_4
    move-wide v6, v1

    goto :goto_5

    :cond_2
    const-wide/16 v1, 0x0

    goto :goto_4

    :goto_5
    int-to-long v1, p1

    const/16 p1, 0x20

    shl-long v3, v1, p1

    const-wide v8, 0xffffffffL

    and-long/2addr v1, v8

    or-long v4, v3, v1

    iget-object v3, v0, Lc0/x;->b:Lb2/h;

    sget-object v8, Ly3/m;->w:Ly3/m;

    invoke-interface/range {v3 .. v8}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v0

    shr-long/2addr v0, p1

    long-to-int v0, v0

    neg-int v0, v0

    shr-long v1, v6, p1

    long-to-int p1, v1

    add-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lc0/w;->x:Lc0/x;

    iget-object v1, v0, Lc0/x;->e:La0/v0;

    iget-object v2, v0, Lc0/x;->a:Ld0/z1;

    iget-object v2, v2, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/t2;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/l;

    iget-wide v1, v1, Ly3/l;->a:J

    :goto_6
    move-wide v6, v1

    goto :goto_7

    :cond_3
    const-wide/16 v1, 0x0

    goto :goto_6

    :goto_7
    int-to-long v1, p1

    const/16 v9, 0x20

    shl-long v3, v1, v9

    const-wide v10, 0xffffffffL

    and-long/2addr v1, v10

    or-long v4, v3, v1

    iget-object v3, v0, Lc0/x;->b:Lb2/h;

    sget-object v8, Ly3/m;->w:Ly3/m;

    invoke-interface/range {v3 .. v8}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v0

    shr-long/2addr v0, v9

    long-to-int v0, v0

    neg-int v0, v0

    sub-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
