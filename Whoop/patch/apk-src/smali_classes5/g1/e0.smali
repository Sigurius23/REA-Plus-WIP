.class public final Lg1/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Lp1/c1;Lx1/b;Lb1/c;Lc93/a;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lg1/e0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/e0;->E:Ljava/lang/Object;

    iput-object p2, p0, Lg1/e0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lg1/e0;->x:Ljava/lang/Object;

    iput-object p4, p0, Lg1/e0;->z:Ljava/lang/Object;

    iput-object p5, p0, Lg1/e0;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p6, p0, Lg1/e0;->w:I

    iput-object p1, p0, Lg1/e0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lg1/e0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lg1/e0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lg1/e0;->E:Ljava/lang/Object;

    iput-object p5, p0, Lg1/e0;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lp1/c1;Ln00/c;Lg40/z1;Lp1/c1;Lg40/m3;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lg1/e0;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/e0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lg1/e0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lg1/e0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lg1/e0;->E:Ljava/lang/Object;

    iput-object p5, p0, Lg1/e0;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, Lg1/e0;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_0

    move v3, v6

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    and-int/2addr v2, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Lg1/e0;->E:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lg1/e0;->y:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v4, v7, :cond_1

    new-instance v4, Lyb0/e;

    const/16 v7, 0x9

    invoke-direct {v4, v7, v3}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v4}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v3, v0, Lg1/e0;->x:Ljava/lang/Object;

    check-cast v3, Lx1/b;

    iget-object v4, v0, Lg1/e0;->z:Ljava/lang/Object;

    check-cast v4, Lb1/c;

    iget-object v7, v0, Lg1/e0;->F:Ljava/lang/Object;

    check-cast v7, Lc93/a;

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v9, v1, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-eqz v12, :cond_2

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v1, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v1, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-nez v10, :cond_3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    :cond_3
    invoke-static {v9, v1, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v1, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x6

    invoke-virtual {v4, v7, v1, v2}, Lb1/c;->b(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v3, v0, Lg1/e0;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    iget-object v4, v0, Lg1/e0;->y:Ljava/lang/Object;

    check-cast v4, Lp1/c1;

    iget-object v5, v0, Lg1/e0;->x:Ljava/lang/Object;

    check-cast v5, Ln00/c;

    const/4 v6, 0x3

    and-int/2addr v2, v6

    const/4 v7, 0x2

    if-ne v2, v7, :cond_7

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_7
    :goto_3
    const/4 v2, 0x4

    int-to-float v2, v2

    sget-object v7, Lb2/t;->w:Lb2/t;

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v7, v8, v2, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v14, v1

    check-cast v14, Lp1/q;

    const v1, 0x63df9f2d

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_8

    if-ne v10, v11, :cond_9

    :cond_8
    new-instance v10, Ljs2/e;

    const/16 v1, 0x10

    invoke-direct {v10, v1, v4}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    invoke-static {v2, v10}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    iget-boolean v2, v5, Ln00/c;->f:Z

    iget-boolean v10, v5, Ln00/c;->c:Z

    xor-int/2addr v2, v9

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object v13, v0, Lg1/e0;->z:Ljava/lang/Object;

    check-cast v13, Lg40/z1;

    iget-object v13, v13, Lg40/z1;->a:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    if-nez v13, :cond_a

    move v15, v9

    goto :goto_4

    :cond_a
    move v15, v1

    :goto_4
    if-eqz v10, :cond_b

    const/4 v13, 0x6

    :goto_5
    move/from16 v17, v13

    goto :goto_6

    :cond_b
    const/4 v13, 0x7

    goto :goto_5

    :goto_6
    iget-object v13, v0, Lg1/e0;->z:Ljava/lang/Object;

    check-cast v13, Lg40/z1;

    const/16 v16, 0x0

    const/16 v19, 0x40

    move-object/from16 v18, v11

    move-object v11, v13

    const/4 v13, 0x0

    move/from16 v20, v10

    move v10, v2

    move/from16 v2, v20

    move-object/from16 v20, v14

    move v14, v4

    move-object/from16 v4, v18

    move-object/from16 v18, v20

    invoke-static/range {v10 .. v19}, Ldp/d;->f(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;ILandroidx/compose/runtime/Composer;I)V

    move-object/from16 v14, v18

    const v10, 0x63dfe0cb

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    const/16 v10, 0x8

    if-eqz v2, :cond_e

    const v2, 0x63dff26c

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v2, :cond_c

    if-ne v11, v4, :cond_d

    :cond_c
    new-instance v11, Ljs2/e;

    const/16 v2, 0x11

    invoke-direct {v11, v2, v3}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    invoke-static {v7, v11}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v4, v10

    invoke-static {v2, v8, v4, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    iget-object v3, v0, Lg1/e0;->F:Ljava/lang/Object;

    move-object v11, v3

    check-cast v11, Lg40/m3;

    new-instance v3, Lb30/w2;

    const/16 v4, 0x18

    invoke-direct {v3, v4, v5, v11}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, -0x2b6abb06

    invoke-static {v4, v14, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/16 v15, 0x6000

    const/16 v16, 0x8

    move/from16 v20, v10

    move-object v10, v2

    move/from16 v2, v20

    invoke-static/range {v10 .. v16}, Lg40/j4;->e(Landroidx/compose/ui/Modifier;Lg40/m3;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_e
    move v2, v10

    :goto_7
    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v10, v2

    const/16 v1, 0x10

    int-to-float v12, v1

    const/4 v13, 0x5

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lh00/h0;->E:Lh00/h0;

    const/16 v3, 0x36

    invoke-static {v2, v1, v6, v14, v3}, Lv8/b;->e(Lh00/h0;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    :goto_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v3, v0, Lg1/e0;->x:Ljava/lang/Object;

    check-cast v3, Ll1/g1;

    and-int/lit8 v4, v2, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v4, v5, :cond_f

    move v4, v6

    goto :goto_9

    :cond_f
    const/4 v4, 0x0

    :goto_9
    and-int/2addr v2, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_14

    move-object v2, v3

    check-cast v2, Ll1/h1;

    invoke-virtual {v2}, Ll1/h1;->b()Ljava/lang/Long;

    move-result-object v5

    move-object v4, v3

    check-cast v4, Ll1/h1;

    iget-object v6, v4, Ll1/h1;->e:Lp1/k1;

    invoke-virtual {v6}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm1/r;

    iget-wide v6, v6, Lm1/r;->e:J

    invoke-virtual {v2}, Ll1/h1;->a()I

    move-result v8

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_10

    if-ne v9, v10, :cond_11

    :cond_10
    new-instance v9, Ll1/s0;

    const/4 v2, 0x1

    invoke-direct {v9, v3, v2}, Ll1/s0;-><init>(Ll1/g1;I)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v2, :cond_12

    if-ne v11, v10, :cond_13

    :cond_12
    new-instance v11, Ll1/s0;

    const/4 v2, 0x2

    invoke-direct {v11, v3, v2}, Ll1/s0;-><init>(Ll1/g1;I)V

    invoke-virtual {v1, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v10, v11

    check-cast v10, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lg1/e0;->y:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Lm1/o;

    iget-object v12, v4, Ll1/h1;->a:Li93/j;

    iget-object v2, v0, Lg1/e0;->z:Ljava/lang/Object;

    move-object v13, v2

    check-cast v13, Ll1/e0;

    iget-object v2, v4, Ll1/h1;->d:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ll1/n3;

    iget-object v2, v0, Lg1/e0;->E:Ljava/lang/Object;

    move-object v15, v2

    check-cast v15, Ll1/y;

    iget-object v2, v0, Lg1/e0;->F:Ljava/lang/Object;

    move-object/from16 v16, v2

    check-cast v16, Lg2/s;

    const/16 v18, 0x0

    move-object/from16 v17, v1

    invoke-static/range {v5 .. v18}, Ll1/f1;->k(Ljava/lang/Long;JILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Lg2/s;Landroidx/compose/runtime/Composer;I)V

    goto :goto_a

    :cond_14
    move-object/from16 v17, v1

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    :goto_a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_15

    move v3, v5

    goto :goto_b

    :cond_15
    move v3, v6

    :goto_b
    and-int/2addr v2, v5

    move-object v12, v1

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_22

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    iget-object v4, v0, Lg1/e0;->x:Ljava/lang/Object;

    check-cast v4, Lc93/m;

    iget-object v7, v0, Lg1/e0;->y:Ljava/lang/Object;

    check-cast v7, Lc93/m;

    iget-object v8, v0, Lg1/e0;->z:Ljava/lang/Object;

    check-cast v8, Lc93/m;

    iget-object v9, v0, Lg1/e0;->E:Ljava/lang/Object;

    check-cast v9, Ll1/y;

    iget-object v10, v0, Lg1/e0;->F:Ljava/lang/Object;

    check-cast v10, Ll3/v0;

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v13, v12, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-eqz v5, :cond_16

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_16
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v12, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v12, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_17

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    :cond_17
    invoke-static {v13, v12, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v12, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v4, :cond_19

    if-eqz v7, :cond_19

    sget-object v3, Ll0/m;->g:Ll0/h;

    :goto_d
    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_e

    :cond_19
    if-eqz v4, :cond_1a

    sget-object v3, Ll0/m;->a:Ll0/e;

    goto :goto_d

    :cond_1a
    sget-object v3, Ll0/m;->b:Ll0/e;

    goto :goto_d

    :goto_e
    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x30

    invoke-static {v3, v6, v12, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move-object v6, v14

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v17, v6

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_1b

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v12, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_1c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    :cond_1c
    move-object/from16 v6, v17

    invoke-static {v13, v12, v13, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v12, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v4, :cond_1e

    const v1, -0x1ec1f78c

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    new-instance v1, Lg1/e;

    const/4 v2, 0x5

    invoke-direct {v1, v2, v4}, Lg1/e;-><init>(ILc93/m;)V

    const v2, -0x2c002c84

    invoke-static {v2, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x30

    invoke-static {v10, v1, v12, v2}, Ll1/o4;->a(Ll3/v0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x0

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_1e
    const/4 v1, 0x0

    const v2, -0x1ebf1046

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_10
    if-nez v7, :cond_1f

    const v2, -0x1ebe782f

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    :goto_11
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    goto :goto_12

    :cond_1f
    const v2, 0xf863e30

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v7, v12, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_11

    :goto_12
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    if-nez v8, :cond_21

    if-nez v4, :cond_21

    if-eqz v7, :cond_20

    goto :goto_14

    :cond_20
    const v2, -0xeeaf02a

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_13
    const/4 v2, 0x1

    goto :goto_15

    :cond_21
    :goto_14
    const v1, -0xeec3300

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    iget-wide v8, v9, Ll1/y;->x:J

    const/4 v11, 0x0

    const/4 v13, 0x3

    const/4 v7, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v13}, Ll1/k3;->d(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x0

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_13

    :goto_15
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_22
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_16
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_23

    move v3, v5

    goto :goto_17

    :cond_23
    const/4 v3, 0x0

    :goto_17
    and-int/2addr v2, v5

    move-object v9, v1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_24

    iget-object v1, v0, Lg1/e0;->x:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ld0/q0;

    iget-object v1, v0, Lg1/e0;->y:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lp1/c1;

    iget-object v1, v0, Lg1/e0;->z:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lf0/r1;

    iget-object v1, v0, Lg1/e0;->E:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Landroidx/compose/ui/Modifier;

    iget-object v1, v0, Lg1/e0;->F:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function3;

    const/16 v10, 0x30

    invoke-static/range {v4 .. v10}, Lg1/o3;->a(Ld0/q0;Lp1/c1;Lf0/r1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_18

    :cond_24
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_18
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
