.class public final Ld30/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld00/l;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld30/e1;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld30/e1;->z:Ljava/lang/Object;

    iput-object p2, p0, Ld30/e1;->x:Ljava/lang/Object;

    iput-object p3, p0, Ld30/e1;->E:Ljava/lang/Object;

    iput-object p4, p0, Ld30/e1;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Ld30/e1;->w:I

    iput-object p1, p0, Ld30/e1;->z:Ljava/lang/Object;

    iput-object p2, p0, Ld30/e1;->x:Ljava/lang/Object;

    iput-object p3, p0, Ld30/e1;->y:Ljava/lang/Object;

    iput-object p4, p0, Ld30/e1;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lq00/i0;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ld30/e1;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld30/e1;->z:Ljava/lang/Object;

    iput-object p2, p0, Ld30/e1;->y:Ljava/lang/Object;

    iput-object p3, p0, Ld30/e1;->x:Ljava/lang/Object;

    iput-object p4, p0, Ld30/e1;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Ld30/e1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    iget-object p3, p0, Ld30/e1;->x:Ljava/lang/Object;

    move-object v4, p3

    check-cast v4, Lu0/s0;

    iget-object p3, p0, Ld30/e1;->z:Ljava/lang/Object;

    check-cast p3, Li2/t;

    iget-object v0, p0, Ld30/e1;->y:Ljava/lang/Object;

    check-cast v0, Lq3/y;

    check-cast p2, Lp1/q;

    const v1, -0x5097aed    # -6.4000205E35f

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lb3/v1;->w:Lp1/u2;

    invoke-virtual {p2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p2, v1}, Lp1/q;->h(Z)Z

    move-result v2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_0

    if-ne v3, v5, :cond_1

    :cond_0
    new-instance v3, Ld1/f;

    invoke-direct {v3, v1}, Ld1/f;-><init>(Z)V

    invoke-virtual {p2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v1, v3

    check-cast v1, Ld1/f;

    instance-of v2, p3, Li2/c1;

    const/4 v7, 0x0

    if-eqz v2, :cond_2

    move-object v2, p3

    check-cast v2, Li2/c1;

    iget-wide v2, v2, Li2/c1;->c:J

    const-wide/16 v8, 0x10

    cmp-long v2, v2, v8

    if-nez v2, :cond_2

    move v2, v7

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    :goto_0
    sget-object v3, Lb3/v1;->t:Lp1/u2;

    invoke-virtual {p2, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb3/m3;

    check-cast v3, Lb3/n2;

    iget-object v3, v3, Lb3/n2;->c:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v4}, Lu0/s0;->b()Z

    move-result v3

    if-eqz v3, :cond_7

    iget-wide v8, v0, Lq3/y;->b:J

    invoke-static {v8, v9}, Ll3/u0;->c(J)Z

    move-result v3

    if-eqz v3, :cond_7

    if-eqz v2, :cond_7

    const v2, -0x2a2b68da

    invoke-virtual {p2, v2}, Lp1/q;->e0(I)V

    iget-object v2, v0, Lq3/y;->a:Ll3/g;

    iget-wide v8, v0, Lq3/y;->b:J

    new-instance v3, Ll3/u0;

    invoke-direct {v3, v8, v9}, Ll3/u0;-><init>(J)V

    invoke-virtual {p2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_3

    if-ne v8, v5, :cond_4

    :cond_3
    new-instance v8, Lsz/q;

    const/4 v6, 0x0

    const/4 v9, 0x7

    invoke-direct {v8, v1, v6, v9}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v8, Lc93/m;

    invoke-static {v2, v3, v8, p2}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Ld30/e1;->E:Ljava/lang/Object;

    check-cast v3, Lq3/r;

    invoke-virtual {p2, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v2

    invoke-virtual {p2, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {p2, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p3, v0

    iget-object v0, p0, Ld30/e1;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lq3/r;

    iget-object v0, p0, Ld30/e1;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lq3/y;

    iget-object v0, p0, Ld30/e1;->z:Ljava/lang/Object;

    check-cast v0, Li2/t;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez p3, :cond_5

    if-ne v6, v5, :cond_6

    :cond_5
    move-object v5, v0

    new-instance v0, Lpp2/d;

    const/4 v6, 0x5

    invoke-direct/range {v0 .. v6}, Lpp2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v0

    :cond_6
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v6}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, v7}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_7
    const p1, -0x2a0caad9

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v7}, Lp1/q;->q(Z)V

    sget-object p1, Lb2/t;->w:Lb2/t;

    :goto_1
    invoke-virtual {p2, v7}, Lp1/q;->q(Z)V

    return-object p1

    :pswitch_0
    check-cast p1, Ll0/y;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    iget-object v0, p0, Ld30/e1;->E:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/e1;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, p0, Ld30/e1;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const-string v3, "$this$showBottomSheetContent"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 p3, 0x10

    if-ne p1, p3, :cond_9

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_3

    :cond_9
    :goto_2
    sget-object p1, Lb2/t;->w:Lb2/t;

    const-string p3, "wallet_screen_add_payment_method_sheet"

    invoke-static {p1, p3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    iget-object p3, p0, Ld30/e1;->z:Ljava/lang/Object;

    check-cast p3, Lq00/i0;

    iget-object p3, p3, Lq00/i0;->m:Ljava/util/List;

    check-cast p2, Lp1/q;

    const v3, 0x7548ba02

    invoke-virtual {p2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {p2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_b

    :cond_a
    new-instance v4, Lno0/j0;

    const/16 v3, 0x10

    invoke-direct {v4, v2, v1, v0, v3}, Lno0/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    const/4 v0, 0x6

    invoke-static {p1, p3, v4, p2, v0}, Lio/sentry/config/a;->a(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ll0/u;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-string p3, "$this$MinScreenHeightBox"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p2, 0x11

    const/16 p2, 0x10

    if-ne p1, p2, :cond_d

    move-object p1, v4

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_c

    goto :goto_4

    :cond_c
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_5

    :cond_d
    :goto_4
    iget-object p1, p0, Ld30/e1;->z:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Ld00/l;

    iget-object p1, p0, Ld30/e1;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lc93/a;

    iget-object p1, p0, Ld30/e1;->E:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lc93/a;

    iget-object p1, p0, Ld30/e1;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Ltx/f;->n(Ld00/l;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ll0/s1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    iget-object v0, p0, Ld30/e1;->E:Ljava/lang/Object;

    check-cast v0, Lh20/l;

    iget-object v1, p0, Ld30/e1;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const-string v2, "$this$SavedPaymentMethodRowButton"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 p3, 0x10

    if-ne p1, p3, :cond_f

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_e

    goto :goto_6

    :cond_e
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_7

    :cond_f
    :goto_6
    iget-object p1, p0, Ld30/e1;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ld30/o0;

    iget-object p1, p0, Ld30/e1;->x:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lc93/a;

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p1, -0x7dfdcefc

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_10

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p2, p1, :cond_11

    :cond_10
    new-instance p2, Ld30/a1;

    const/4 p1, 0x1

    invoke-direct {p2, v1, v0, p1}, Ld30/a1;-><init>(Lkotlin/jvm/functions/Function1;Lh20/l;I)V

    invoke-virtual {v6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v5, p2

    check-cast v5, Lc93/a;

    const/4 p1, 0x0

    invoke-virtual {v6, p1}, Lp1/q;->q(Z)V

    const/4 v7, 0x0

    const/4 v2, 0x0

    invoke-static/range {v2 .. v7}, Ls2/e;->f(ZLd30/o0;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
