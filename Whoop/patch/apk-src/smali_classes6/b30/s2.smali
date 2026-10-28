.class public final synthetic Lb30/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly3/c;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Ly3/c;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Lb30/s2;->w:I

    iput-object p1, p0, Lb30/s2;->x:Ly3/c;

    iput-object p2, p0, Lb30/s2;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lb30/s2;->w:I

    const/16 v1, 0x1c

    const/16 v2, 0x20

    const-string v3, "it"

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const-wide v5, 0xffffffffL

    iget-object v7, p0, Lb30/s2;->y:Lp1/c1;

    iget-object v8, p0, Lb30/s2;->x:Ly3/c;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly3/l;

    invoke-static {v8, v7, p1}, Lz50/d;->k(Ly3/c;Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly2/y;

    sget v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->G:I

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v0

    and-long/2addr v0, v5

    long-to-int p1, v0

    invoke-interface {v8, p1}, Ly3/c;->e0(I)F

    move-result p1

    new-instance v0, Ly3/f;

    invoke-direct {v0, p1}, Ly3/f;-><init>(F)V

    invoke-interface {v7, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v4

    :pswitch_1
    check-cast p1, Ly2/y;

    invoke-static {v8, v7, p1}, Lsv2/e;->a(Ly3/c;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ly3/l;

    invoke-static {v8, v7, p1}, Lqs1/a;->k(Ly3/c;Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ly3/l;

    invoke-static {v8, v7, p1}, Lg41/d;->b(Ly3/c;Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ly2/y;

    invoke-static {v8, v7, p1}, Lf11/d;->e(Ly3/c;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ly3/h;

    iget-wide v0, p1, Ly3/h;->a:J

    invoke-static {v0, v1}, Ly3/h;->c(J)F

    move-result v0

    invoke-interface {v8, v0}, Ly3/c;->F(F)I

    move-result v0

    iget-wide v9, p1, Ly3/h;->a:J

    invoke-static {v9, v10}, Ly3/h;->b(J)F

    move-result p1

    invoke-interface {v8, p1}, Ly3/c;->F(F)I

    move-result p1

    int-to-long v0, v0

    shl-long/2addr v0, v2

    int-to-long v2, p1

    and-long/2addr v2, v5

    or-long/2addr v0, v2

    new-instance p1, Ly3/l;

    invoke-direct {p1, v0, v1}, Ly3/l;-><init>(J)V

    invoke-interface {v7, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v4

    :pswitch_6
    check-cast p1, Lc93/a;

    new-instance v0, Laz1/b;

    const/16 v2, 0x17

    invoke-direct {v0, p1, v2}, Laz1/b;-><init>(Lc93/a;I)V

    new-instance p1, Lb30/s2;

    const/4 v2, 0x5

    invoke-direct {p1, v8, v7, v2}, Lb30/s2;-><init>(Ly3/c;Lp1/c1;I)V

    sget-object v2, Lf0/y0;->a:Li3/y;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v2, v1, :cond_0

    sget-object v1, Lf0/d1;->c:Lf0/d1;

    goto :goto_0

    :cond_0
    sget-object v1, Lf0/d1;->d:Lf0/d1;

    :goto_0
    new-instance v2, Landroidx/compose/foundation/MagnifierElement;

    invoke-direct {v2, v0, p1, v1}, Landroidx/compose/foundation/MagnifierElement;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lf0/h1;)V

    return-object v2

    :pswitch_7
    check-cast p1, Ly3/h;

    iget-wide v0, p1, Ly3/h;->a:J

    invoke-static {v0, v1}, Ly3/h;->c(J)F

    move-result v0

    invoke-interface {v8, v0}, Ly3/c;->F(F)I

    move-result v0

    iget-wide v9, p1, Ly3/h;->a:J

    invoke-static {v9, v10}, Ly3/h;->b(J)F

    move-result p1

    invoke-interface {v8, p1}, Ly3/c;->F(F)I

    move-result p1

    int-to-long v0, v0

    shl-long/2addr v0, v2

    int-to-long v2, p1

    and-long/2addr v2, v5

    or-long/2addr v0, v2

    new-instance p1, Ly3/l;

    invoke-direct {p1, v0, v1}, Ly3/l;-><init>(J)V

    invoke-interface {v7, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v4

    :pswitch_8
    check-cast p1, Lc93/a;

    new-instance v0, Laz1/b;

    const/16 v2, 0x16

    invoke-direct {v0, p1, v2}, Laz1/b;-><init>(Lc93/a;I)V

    new-instance p1, Lb30/s2;

    const/4 v2, 0x3

    invoke-direct {p1, v8, v7, v2}, Lb30/s2;-><init>(Ly3/c;Lp1/c1;I)V

    sget-object v2, Lf0/y0;->a:Li3/y;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v2, v1, :cond_1

    sget-object v1, Lf0/d1;->c:Lf0/d1;

    goto :goto_1

    :cond_1
    sget-object v1, Lf0/d1;->d:Lf0/d1;

    :goto_1
    new-instance v2, Landroidx/compose/foundation/MagnifierElement;

    invoke-direct {v2, v0, p1, v1}, Landroidx/compose/foundation/MagnifierElement;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lf0/h1;)V

    return-object v2

    :pswitch_9
    check-cast p1, Ly2/y;

    invoke-static {v8, v7, p1}, Lb72/b;->g(Ly3/c;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ly2/y;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v0

    and-long/2addr v0, v5

    long-to-int p1, v0

    invoke-interface {v8, p1}, Ly3/c;->e0(I)F

    move-result p1

    new-instance v0, Ly3/f;

    invoke-direct {v0, p1}, Ly3/f;-><init>(F)V

    invoke-interface {v7, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
