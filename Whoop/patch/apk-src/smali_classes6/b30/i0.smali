.class public final synthetic Lb30/i0;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Lb30/i0;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lg2/h;)V
    .locals 8

    const/4 v0, 0x6

    iput v0, p0, Lb30/i0;->w:I

    const-string v7, "invalidateNodes()V"

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 2
    const-class v4, Lg2/h;

    const-string v6, "invalidateNodes"

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    iget v1, v0, Lb30/i0;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    invoke-virtual {v1}, Lp00/o;->g()V

    iget-object v2, v1, Lp00/o;->J:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object v1, v1, Lp00/o;->z:Lyz/b;

    const/4 v2, 0x0

    sget-object v3, Lyz/c;->P:Lyz/c;

    invoke-virtual {v1, v3, v2}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lo00/b;

    iget-object v1, v1, Lo00/b;->K:Lec3/r1;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb30/m0;

    if-eqz v1, :cond_0

    sget-object v2, Lb30/g1;->a:Lb30/g1;

    invoke-virtual {v1, v2}, Lb30/m0;->b(Lb30/h1;)V

    :cond_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lo00/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Lm00/c;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Lm00/c;-><init>(Lo00/b;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {v2, v4, v4, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lwz/y;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Lwz/v;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v3, v1, v5, v4}, Lwz/v;-><init>(Lwz/y;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v2, v5, v5, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_3
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Ln00/k;

    iget-object v2, v1, Ln00/k;->N:Lec3/h2;

    :cond_1
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ln00/c;

    const-string v11, "it"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/16 v10, 0xbf

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Ln00/c;->a(Ln00/c;ZLn00/d;ZLzy/c;Ljava/lang/String;I)Ln00/c;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v3

    new-instance v4, Landroidx/room/y0;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Landroidx/room/y0;-><init>(Ln00/k;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {v3, v5, v5, v4, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ln00/c;

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/16 v9, 0xdf

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Ln00/c;->a(Ln00/c;ZLn00/d;ZLzy/c;Ljava/lang/String;I)Ln00/c;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_4
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lm00/d;

    iget-object v1, v1, Lm00/d;->J:Lec3/h2;

    :cond_3
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lm00/a;

    const/4 v7, 0x0

    const/16 v8, 0x6f

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm00/a;->a(Lm00/a;Lh00/o0;ZLy00/d5;Lzy/c;I)Lm00/a;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_5
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lm00/d;

    iget-object v2, v1, Lm00/d;->J:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm00/a;

    iget-object v2, v2, Lm00/a;->f:Ly00/d5;

    const/4 v3, 0x0

    if-nez v2, :cond_4

    iget-object v1, v1, Lm00/d;->E:Lqy/d;

    const-string v2, "PaymentMethodViewModel: onPayClicked without paymentMethodCreateParams"

    invoke-virtual {v1, v2, v3}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_4
    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v4

    new-instance v5, Lm00/c;

    invoke-direct {v5, v1, v2, v3}, Lm00/c;-><init>(Lm00/d;Ly00/d5;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {v4, v3, v3, v5, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_6
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Ll00/i;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Ll00/h;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, v1, v4, v5}, Ll00/h;-><init>(Ll00/i;ZLq83/d;)V

    const/4 v1, 0x3

    invoke-static {v2, v5, v5, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_7
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Ll00/i;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Ll00/h;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, v1, v4, v5}, Ll00/h;-><init>(Ll00/i;ZLq83/d;)V

    const/4 v1, 0x3

    invoke-static {v2, v5, v5, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_8
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lj00/h;

    iget-object v1, v1, Lj00/h;->H:Lec3/h2;

    :cond_5
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lj00/k;

    const/4 v7, 0x0

    const/16 v8, 0xf7f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lj00/k;->a(Lj00/k;Lj00/i0;ZZLn00/d;I)Lj00/k;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_9
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lj00/h;

    iget-object v2, v1, Lj00/h;->H:Lec3/h2;

    :cond_6
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lj00/k;

    iget-boolean v5, v4, Lj00/k;->i:Z

    const/4 v10, 0x1

    xor-int/lit8 v6, v5, 0x1

    const/4 v8, 0x0

    const/16 v9, 0x6ff

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lj00/k;->a(Lj00/k;Lj00/i0;ZZLn00/d;I)Lj00/k;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj00/k;

    iget-boolean v2, v2, Lj00/k;->i:Z

    if-eqz v2, :cond_7

    iget-boolean v2, v1, Lj00/h;->U:Z

    if-nez v2, :cond_7

    iput-boolean v10, v1, Lj00/h;->U:Z

    iget-object v1, v1, Lj00/h;->z:Lyz/b;

    const/4 v2, 0x0

    sget-object v3, Lyz/c;->K:Lyz/c;

    invoke-virtual {v1, v3, v2}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    :cond_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_a
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Li20/v0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Li20/o0;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v3, v1, v5, v4}, Li20/o0;-><init>(Li20/v0;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v2, v5, v5, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_b
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Li20/v0;

    invoke-virtual {v1}, Li20/v0;->g()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_c
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Li20/v0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Li20/o0;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v3, v1, v5, v4}, Li20/o0;-><init>(Li20/v0;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v2, v5, v5, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_d
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Li20/v0;

    invoke-virtual {v1}, Li20/v0;->g()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_e
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Li20/v0;

    invoke-virtual {v1}, Li20/v0;->g()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_f
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lr20/d;

    invoke-virtual {v1}, Lr20/d;->b()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_10
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lh20/k4;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lq20/m;

    sget-object v3, Lwz/h0;->w:Lwz/h0;

    const/4 v4, 0x0

    const/4 v5, 0x6

    invoke-direct {v2, v3, v4, v4, v5}, Lq20/m;-><init>(Lwz/h0;Lwz/u0;Ly00/j0;I)V

    sget-object v3, Lh20/f4;->w:Lh20/f4;

    invoke-virtual {v1, v2, v3}, Lh20/k4;->C(Lq20/y;Lh20/f4;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_11
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lh20/k4;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lq20/j;->x:Lq20/j;

    sget-object v3, Lh20/f4;->w:Lh20/f4;

    invoke-virtual {v1, v2, v3}, Lh20/k4;->C(Lq20/y;Lh20/f4;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_12
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lh20/k4;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Lh20/e4;

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-direct {v3, v1, v5, v4}, Lh20/e4;-><init>(Lh20/k4;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v2, v5, v5, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_13
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lh20/k4;

    invoke-virtual {v1}, Lh20/k4;->w()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_14
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lh20/w0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, La20/b;

    const/16 v4, 0x1b

    const/4 v5, 0x0

    invoke-direct {v3, v1, v5, v4}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v2, v5, v5, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_15
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lh20/w0;

    invoke-virtual {v1}, Lh20/w0;->w()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_16
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lg2/h;

    iget-object v2, v1, Lg2/h;->c:La0/w0;

    iget-object v3, v1, Lg2/h;->d:La0/w0;

    iget-object v4, v1, Lg2/h;->a:Lg2/l;

    iget-object v5, v4, Lg2/l;->h:Lg2/x;

    const/16 v13, 0x8

    if-nez v5, :cond_b

    iget-object v5, v3, La0/w0;->b:[Ljava/lang/Object;

    iget-object v15, v3, La0/w0;->a:[J

    const-wide/16 v16, 0x80

    array-length v6, v15

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_18

    const/4 v7, 0x0

    const-wide/16 v18, 0xff

    :goto_1
    aget-wide v8, v15, v7

    const/16 v20, 0x7

    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    not-long v10, v8

    shl-long v10, v10, v20

    and-long/2addr v10, v8

    and-long v10, v10, v21

    cmp-long v10, v10, v21

    if-eqz v10, :cond_a

    sub-int v10, v7, v6

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    rsub-int/lit8 v10, v10, 0x8

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v10, :cond_9

    and-long v23, v8, v18

    cmp-long v12, v23, v16

    if-gez v12, :cond_8

    shl-int/lit8 v12, v7, 0x3

    add-int/2addr v12, v11

    aget-object v12, v5, v12

    check-cast v12, Lg2/e;

    sget-object v14, Lg2/w;->z:Lg2/w;

    invoke-interface {v12, v14}, Lg2/e;->k(Lg2/w;)V

    :cond_8
    shr-long/2addr v8, v13

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_9
    if-ne v10, v13, :cond_18

    :cond_a
    if-eq v7, v6, :cond_18

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_b
    const-wide/16 v16, 0x80

    const-wide/16 v18, 0xff

    const/16 v20, 0x7

    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    iget-boolean v6, v5, Lb2/v;->N:Z

    if-eqz v6, :cond_18

    invoke-virtual {v2, v5}, La0/w0;->c(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v5}, Lg2/x;->a1()V

    :cond_c
    invoke-virtual {v5}, Lg2/x;->Z0()Lg2/w;

    move-result-object v6

    iget-object v7, v5, Lb2/v;->w:Lb2/v;

    iget-boolean v7, v7, Lb2/v;->N:Z

    if-nez v7, :cond_d

    const-string v7, "visitAncestors called on an unattached node"

    invoke-static {v7}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_d
    iget-object v7, v5, Lb2/v;->w:Lb2/v;

    invoke-static {v5}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v5

    const/4 v8, 0x0

    :goto_3
    if-eqz v5, :cond_14

    iget-object v9, v5, La3/n0;->e0:La3/l1;

    iget-object v9, v9, La3/l1;->g:Ljava/lang/Object;

    check-cast v9, Lb2/v;

    iget v9, v9, Lb2/v;->z:I

    and-int/lit16 v9, v9, 0x1400

    if-eqz v9, :cond_12

    :goto_4
    if-eqz v7, :cond_12

    iget v9, v7, Lb2/v;->y:I

    and-int/lit16 v10, v9, 0x1400

    if-eqz v10, :cond_11

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_e

    add-int/lit8 v8, v8, 0x1

    :cond_e
    instance-of v9, v7, Lg2/e;

    if-eqz v9, :cond_11

    invoke-virtual {v3, v7}, La0/w0;->c(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    goto :goto_6

    :cond_f
    const/4 v9, 0x1

    if-gt v8, v9, :cond_10

    move-object v9, v7

    check-cast v9, Lg2/e;

    invoke-interface {v9, v6}, Lg2/e;->k(Lg2/w;)V

    goto :goto_5

    :cond_10
    move-object v9, v7

    check-cast v9, Lg2/e;

    sget-object v10, Lg2/w;->x:Lg2/w;

    invoke-interface {v9, v10}, Lg2/e;->k(Lg2/w;)V

    :goto_5
    invoke-virtual {v3, v7}, La0/w0;->l(Ljava/lang/Object;)Z

    :cond_11
    :goto_6
    iget-object v7, v7, Lb2/v;->E:Lb2/v;

    goto :goto_4

    :cond_12
    invoke-virtual {v5}, La3/n0;->G()La3/n0;

    move-result-object v5

    if-eqz v5, :cond_13

    iget-object v7, v5, La3/n0;->e0:La3/l1;

    if-eqz v7, :cond_13

    iget-object v7, v7, La3/l1;->f:Ljava/lang/Object;

    check-cast v7, La3/l2;

    goto :goto_3

    :cond_13
    const/4 v7, 0x0

    goto :goto_3

    :cond_14
    iget-object v5, v3, La0/w0;->b:[Ljava/lang/Object;

    iget-object v6, v3, La0/w0;->a:[J

    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_18

    const/4 v8, 0x0

    :goto_7
    aget-wide v9, v6, v8

    not-long v11, v9

    shl-long v11, v11, v20

    and-long/2addr v11, v9

    and-long v11, v11, v21

    cmp-long v11, v11, v21

    if-eqz v11, :cond_17

    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    rsub-int/lit8 v11, v11, 0x8

    const/4 v12, 0x0

    :goto_8
    if-ge v12, v11, :cond_16

    and-long v14, v9, v18

    cmp-long v14, v14, v16

    if-gez v14, :cond_15

    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v12

    aget-object v14, v5, v14

    check-cast v14, Lg2/e;

    sget-object v15, Lg2/w;->z:Lg2/w;

    invoke-interface {v14, v15}, Lg2/e;->k(Lg2/w;)V

    :cond_15
    shr-long/2addr v9, v13

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_16
    if-ne v11, v13, :cond_18

    :cond_17
    if-eq v8, v7, :cond_18

    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_18
    iget-object v5, v4, Lg2/l;->h:Lg2/x;

    if-eqz v5, :cond_19

    iget-object v5, v4, Lg2/l;->c:Lg2/x;

    invoke-virtual {v5}, Lg2/x;->Z0()Lg2/w;

    move-result-object v5

    sget-object v6, Lg2/w;->z:Lg2/w;

    if-ne v5, v6, :cond_1a

    :cond_19
    invoke-virtual {v4}, Lg2/l;->e()V

    :cond_1a
    invoke-virtual {v2}, La0/w0;->b()V

    invoke-virtual {v3}, La0/w0;->b()V

    const/4 v2, 0x0

    iput-boolean v2, v1, Lg2/h;->e:Z

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_17
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lh20/z4;

    invoke-virtual {v1}, Lh20/z4;->e()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_18
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lk20/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lk20/k;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lk20/k;-><init>(I)V

    invoke-static {v1, v2}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_19
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1a
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Le30/c;

    invoke-virtual {v1}, Le30/c;->t()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1b
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lh20/z4;

    invoke-virtual {v1}, Lh20/z4;->e()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1c
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Le30/c;

    invoke-virtual {v1}, Le30/c;->g()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
