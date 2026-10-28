.class public final synthetic Lh20/d4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lh20/k4;


# direct methods
.method public synthetic constructor <init>(Lh20/k4;I)V
    .locals 0

    iput p2, p0, Lh20/d4;->w:I

    iput-object p1, p0, Lh20/d4;->x:Lh20/k4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lh20/d4;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lw20/l;

    const-string v0, "cvcRecollectionData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh20/d4;->x:Lh20/k4;

    iget-object v1, v0, Lh20/k4;->h0:Lw20/a0;

    iget-object v2, p1, Lw20/l;->a:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    move-object v4, v2

    iget-object v5, p1, Lw20/l;->b:Ly00/i;

    iget-object p1, v0, Le30/c;->L:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv00/c0;

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p1, Lv00/c0;->w:Ly00/c8;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ly00/c8;->q0()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    move v6, v2

    const-string p1, "cardBrand"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v0, Le30/c;->Q:Lec3/r1;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v8

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "processing"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lw20/b0;

    invoke-direct/range {v3 .. v8}, Lw20/b0;-><init>(Ljava/lang/String;Ly00/i;ZLec3/r1;Ln8/a;)V

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v1, Lh20/i0;

    const/4 v2, 0x2

    const/4 v4, 0x0

    invoke-direct {v1, v3, v0, v4, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {p1, v4, v4, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object p1, v0, Le30/c;->M:Lr20/d;

    new-instance v0, Lr20/i;

    invoke-direct {v0, v3}, Lr20/i;-><init>(Lw20/b0;)V

    invoke-virtual {p1, v0}, Lr20/d;->e(Lr20/s;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lq20/e0;

    sget-object v0, Lh20/f4;->w:Lh20/f4;

    iget-object v1, p0, Lh20/d4;->x:Lh20/k4;

    iget-object v2, v1, Lh20/k4;->l0:Lh20/f4;

    const/4 v3, 0x0

    if-eq v2, v0, :cond_2

    move-object p1, v3

    :cond_2
    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    instance-of v0, p1, Lq20/b0;

    if-eqz v0, :cond_5

    new-instance v0, La30/i1;

    check-cast p1, Lq20/b0;

    iget-object p1, p1, Lq20/e0;->a:Lq20/d0;

    if-eqz p1, :cond_4

    iget-object v3, p1, Lq20/d0;->a:Lzy/c;

    :cond_4
    invoke-direct {v0, v3}, La30/i1;-><init>(Lzy/c;)V

    move-object v3, v0

    goto :goto_1

    :cond_5
    instance-of v0, p1, Lq20/c0;

    if-eqz v0, :cond_8

    iget-object p1, v1, Le30/c;->z:Landroidx/lifecycle/k1;

    const-string v0, "IN_PROGRESS_PAYMENT_SELECTION"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq20/y;

    instance-of v0, p1, Lq20/m;

    if-eqz v0, :cond_6

    check-cast p1, Lq20/m;

    goto :goto_0

    :cond_6
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_7

    iget-object p1, p1, Lq20/m;->x:Lwz/h0;

    if-eqz p1, :cond_7

    sget-object v0, Lwz/h0;->w:Lwz/h0;

    if-eq p1, v0, :cond_7

    new-instance p1, La30/i1;

    invoke-direct {p1, v3}, La30/i1;-><init>(Lzy/c;)V

    move-object v3, p1

    goto :goto_1

    :cond_7
    sget-object v3, La30/j1;->a:La30/j1;

    goto :goto_1

    :cond_8
    instance-of v0, p1, Lq20/a0;

    if-eqz v0, :cond_9

    new-instance v3, La30/h1;

    check-cast p1, Lq20/a0;

    iget-object p1, p1, Lq20/a0;->b:Lh02/n0;

    invoke-direct {v3, p1}, La30/h1;-><init>(Lh02/n0;)V

    :goto_1
    return-object v3

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    check-cast p1, Lq20/e0;

    sget-object v0, Lh20/f4;->x:Lh20/f4;

    iget-object v1, p0, Lh20/d4;->x:Lh20/k4;

    iget-object v1, v1, Lh20/k4;->l0:Lh20/f4;

    if-eq v1, v0, :cond_a

    const/4 p1, 0x0

    :cond_a
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
