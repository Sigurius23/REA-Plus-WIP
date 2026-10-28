.class public final Lch/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lch/t;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch/t;->x:Ljava/lang/Object;

    iput-object p2, p0, Lch/t;->y:Ljava/lang/Object;

    iput-object p3, p0, Lch/t;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lc93/m;Lx1/b;Lkotlin/jvm/functions/Function3;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lch/t;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch/t;->y:Ljava/lang/Object;

    iput-object p2, p0, Lch/t;->x:Ljava/lang/Object;

    iput-object p3, p0, Lch/t;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lch/t;->w:I

    iput-object p1, p0, Lch/t;->x:Ljava/lang/Object;

    iput-object p2, p0, Lch/t;->y:Ljava/lang/Object;

    iput-object p3, p0, Lch/t;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lch/t;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lc0/i0;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    const-string v3, "$this$AnimatedVisibility"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lch/t;->x:Ljava/lang/Object;

    check-cast v1, Lg40/z1;

    iget-object v3, v0, Lch/t;->y:Ljava/lang/Object;

    check-cast v3, Lg40/m3;

    iget-object v4, v0, Lch/t;->z:Ljava/lang/Object;

    check-cast v4, Ln00/c;

    const/16 v5, 0x8

    invoke-static {v1, v3, v4, v2, v5}, Lse/b;->n(Lg40/z1;Lg40/m3;Ln00/c;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ll0/u;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "$this$MinScreenHeightBox"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_1

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v1, v0, Lch/t;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lch/t;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lch/t;->z:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    invoke-static {v1, v3, v4, v2, v5}, Ltx/f;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    sget-object v4, Lb2/e;->K:Lb2/l;

    iget-object v5, v0, Lch/t;->y:Ljava/lang/Object;

    check-cast v5, Lc93/m;

    and-int/lit8 v6, v3, 0x6

    if-nez v6, :cond_3

    move-object v6, v2

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v6, 0x4

    goto :goto_2

    :cond_2
    const/4 v6, 0x2

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_4

    move v6, v9

    goto :goto_3

    :cond_4
    move v6, v8

    :goto_3
    and-int/2addr v3, v9

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_10

    const/high16 v3, 0x3f800000    # 1.0f

    const/16 v10, 0x30

    if-nez v5, :cond_5

    const v5, -0x531c43e1

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lg1/n0;->c:Landroidx/compose/ui/Modifier;

    invoke-static {v2, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    const-wide/high16 p1, 0x3fe0000000000000L    # 0.5

    goto/16 :goto_7

    :cond_5
    const v11, -0x531b4386

    invoke-virtual {v2, v11}, Lp1/q;->e0(I)V

    sget-object v11, Lg1/n0;->d:Landroidx/compose/ui/Modifier;

    sget-object v12, Ll0/m;->a:Ll0/e;

    invoke-static {v12, v4, v2, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v13, v2, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v2, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    const-wide/high16 p1, 0x3fe0000000000000L    # 0.5

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-eqz v6, :cond_6

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v2, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v2, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v7, v2, Lp1/q;->S:Z

    if-nez v7, :cond_7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v13, v2, v13, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v2, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lg1/j1;->a:Lp1/b0;

    sget-object v7, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v2, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li2/x;

    iget-wide v11, v7, Li2/x;->a:J

    sget-object v7, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v2, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg1/c1;

    invoke-virtual {v7}, Lg1/c1;->i()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-static {v11, v12}, Li2/w0;->x(J)F

    move-result v7

    float-to-double v11, v7

    cmpl-double v7, v11, p1

    if-lez v7, :cond_a

    goto :goto_5

    :cond_9
    invoke-static {v11, v12}, Li2/w0;->x(J)F

    move-result v7

    float-to-double v11, v7

    cmpg-double v7, v11, p1

    if-gez v7, :cond_a

    :goto_5
    move v7, v3

    goto :goto_6

    :cond_a
    const v7, 0x3f5eb852    # 0.87f

    :goto_6
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v6, v7}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v6

    const/16 v7, 0x8

    invoke-static {v6, v5, v2, v7}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    :goto_7
    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-interface {v1, v5, v9, v3}, Ll0/s1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v3, v0, Lch/t;->x:Ljava/lang/Object;

    check-cast v3, Lx1/b;

    sget-object v5, Ll0/m;->a:Ll0/e;

    invoke-static {v5, v4, v2, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v2, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v2, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-eqz v8, :cond_b

    invoke-virtual {v2, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_8
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v2, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v2, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-nez v6, :cond_c

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    invoke-static {v5, v2, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v2, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/h9;

    iget-object v1, v1, Lg1/h9;->f:Ll3/v0;

    new-instance v4, Lb30/l4;

    const/4 v5, 0x6

    invoke-direct {v4, v3, v5}, Lb30/l4;-><init>(Lx1/b;I)V

    const v3, 0x47f11ae3

    invoke-static {v3, v2, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    invoke-static {v1, v3, v2, v10}, Lg1/f9;->a(Ll3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    sget-object v1, Lg1/j1;->a:Lp1/b0;

    sget-object v3, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v2, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    iget-wide v3, v3, Li2/x;->a:J

    sget-object v5, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v2, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/c1;

    invoke-virtual {v5}, Lg1/c1;->i()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-static {v3, v4}, Li2/w0;->x(J)F

    move-result v3

    float-to-double v3, v3

    cmpl-double v3, v3, p1

    if-lez v3, :cond_f

    goto :goto_9

    :cond_e
    invoke-static {v3, v4}, Li2/w0;->x(J)F

    move-result v3

    float-to-double v3, v3

    cmpg-double v3, v3, p1

    if-gez v3, :cond_f

    :goto_9
    const v3, 0x3f3d70a4    # 0.74f

    goto :goto_a

    :cond_f
    const v3, 0x3f19999a    # 0.6f

    :goto_a
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    new-instance v3, Lg1/m0;

    iget-object v4, v0, Lch/t;->z:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function3;

    const/4 v5, 0x0

    invoke-direct {v3, v5, v4}, Lg1/m0;-><init>(ILkotlin/jvm/functions/Function3;)V

    const v4, -0x3d9c0872

    invoke-static {v4, v2, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x38

    invoke-static {v1, v3, v2, v4}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_b

    :cond_10
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_b
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    move-object/from16 v3, p1

    check-cast v3, Lg0/c;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_12

    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    const/4 v4, 0x4

    goto :goto_c

    :cond_11
    const/4 v4, 0x2

    :goto_c
    or-int/2addr v2, v4

    :cond_12
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    if-eq v4, v5, :cond_13

    const/4 v4, 0x1

    goto :goto_d

    :cond_13
    move v4, v6

    :goto_d
    and-int/lit8 v5, v2, 0x1

    move-object v7, v1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_15

    iget-object v1, v0, Lch/t;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v7, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_14

    const-string v4, "Label must not be blank"

    invoke-static {v4}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_14
    iget-object v4, v0, Lch/t;->y:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Lkotlin/jvm/functions/Function3;

    iget-object v4, v0, Lch/t;->z:Ljava/lang/Object;

    move-object v6, v4

    check-cast v6, Lc93/a;

    shl-int/lit8 v2, v2, 0x6

    and-int/lit16 v8, v2, 0x380

    sget-object v4, Lb2/t;->w:Lb2/t;

    move-object v2, v1

    invoke-static/range {v2 .. v8}, Lg0/f;->c(Ljava/lang/String;Lg0/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_e

    :cond_15
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_e
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_3
    move-object/from16 v2, p1

    check-cast v2, Lch/r;

    move-object/from16 v10, p2

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v3, v1, 0xe

    if-nez v3, :cond_17

    move-object v3, v10

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    const/4 v3, 0x4

    goto :goto_f

    :cond_16
    const/4 v3, 0x2

    :goto_f
    or-int/2addr v1, v3

    :cond_17
    and-int/lit8 v3, v1, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_19

    move-object v3, v10

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_18

    goto :goto_10

    :cond_18
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_11

    :cond_19
    :goto_10
    iget-object v3, v2, Lch/r;->b:Lcoil/compose/AsyncImagePainter;

    iget-object v3, v3, Lcoil/compose/AsyncImagePainter;->Q:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lch/f;

    instance-of v4, v3, Lcoil/compose/AsyncImagePainter$State$Loading;

    const/4 v5, 0x0

    if-eqz v4, :cond_1a

    check-cast v10, Lp1/q;

    const v4, 0x67aed995

    invoke-virtual {v10, v4}, Lp1/q;->f0(I)V

    iget-object v4, v0, Lch/t;->x:Ljava/lang/Object;

    check-cast v4, Lx1/b;

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v2, v3, v10, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1a
    instance-of v4, v3, Lcoil/compose/AsyncImagePainter$State$Success;

    if-eqz v4, :cond_1b

    check-cast v10, Lp1/q;

    const v4, 0x67b045d5

    invoke-virtual {v10, v4}, Lp1/q;->f0(I)V

    iget-object v4, v0, Lch/t;->y:Ljava/lang/Object;

    check-cast v4, Lx1/b;

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v2, v3, v10, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1b
    instance-of v4, v3, Lcoil/compose/AsyncImagePainter$State$Error;

    if-eqz v4, :cond_1c

    check-cast v10, Lp1/q;

    const v4, 0x67b1a9d9

    invoke-virtual {v10, v4}, Lp1/q;->f0(I)V

    iget-object v4, v0, Lch/t;->z:Ljava/lang/Object;

    check-cast v4, Lx1/b;

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v2, v3, v10, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1c
    instance-of v3, v3, Lch/e;

    if-eqz v3, :cond_1d

    move-object v3, v10

    check-cast v3, Lp1/q;

    const v4, 0x67b2f8ac

    invoke-virtual {v3, v4}, Lp1/q;->f0(I)V

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    const/4 v9, 0x0

    and-int/lit8 v11, v1, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v11}, Lds/p;->o(Lch/r;Landroidx/compose/ui/Modifier;Ln2/a;Ljava/lang/String;Lb2/h;Ly2/k;FZLandroidx/compose/runtime/Composer;I)V

    :goto_11
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_1d
    check-cast v10, Lp1/q;

    const v1, -0x4e9df77

    invoke-virtual {v10, v1}, Lp1/q;->f0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
