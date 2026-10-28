.class public final Lg1/g4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq3/y;ZLq3/g0;Lj0/i;Lc93/m;Li2/a1;Lg1/y1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg1/g4;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/g4;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lg1/g4;->x:Z

    iput-object p3, p0, Lg1/g4;->z:Ljava/lang/Object;

    iput-object p4, p0, Lg1/g4;->E:Ljava/lang/Object;

    iput-object p5, p0, Lg1/g4;->F:Ljava/lang/Object;

    iput-object p6, p0, Lg1/g4;->G:Ljava/lang/Object;

    iput-object p7, p0, Lg1/g4;->H:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ZLjava/util/List;Lg40/m3;Lg2/s;Lp1/t2;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg1/g4;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg1/g4;->x:Z

    iput-object p2, p0, Lg1/g4;->y:Ljava/lang/Object;

    iput-object p3, p0, Lg1/g4;->z:Ljava/lang/Object;

    iput-object p4, p0, Lg1/g4;->E:Ljava/lang/Object;

    iput-object p5, p0, Lg1/g4;->F:Ljava/lang/Object;

    iput-object p6, p0, Lg1/g4;->G:Ljava/lang/Object;

    iput-object p7, p0, Lg1/g4;->H:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    move-object/from16 v0, p0

    iget v1, v0, Lg1/g4;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, v0, Lg1/g4;->H:Ljava/lang/Object;

    iget-object v4, v0, Lg1/g4;->G:Ljava/lang/Object;

    iget-object v5, v0, Lg1/g4;->F:Ljava/lang/Object;

    iget-object v6, v0, Lg1/g4;->E:Ljava/lang/Object;

    iget-object v7, v0, Lg1/g4;->z:Ljava/lang/Object;

    iget-object v8, v0, Lg1/g4;->y:Ljava/lang/Object;

    const/4 v9, 0x0

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v15, p2

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v11, p3

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    sget-object v12, Lb2/e;->M:Lb2/k;

    const-string v13, "$this$ScrollableColumn"

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v11, 0x11

    const/16 v11, 0x10

    if-ne v1, v11, :cond_1

    move-object v1, v15

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v13

    if-nez v13, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v37, v2

    goto/16 :goto_11

    :cond_1
    :goto_0
    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    sget-object v14, Ld40/p;->f:Ld40/g;

    iget v14, v14, Ld40/g;->b:F

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v14

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    check-cast v8, Ljava/util/List;

    check-cast v7, Lg40/m3;

    check-cast v6, Lg2/s;

    check-cast v5, Lp1/t2;

    check-cast v4, Ljava/lang/Integer;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget-object v10, Ll0/m;->c:Ll0/g;

    invoke-static {v10, v12, v15, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    invoke-static {v15}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v9

    move-object v1, v15

    check-cast v1, Lp1/q;

    move-object/from16 v37, v2

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v15, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p3, v4

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    move-object/from16 v38, v5

    iget-boolean v5, v1, Lp1/q;->S:Z

    if-eqz v5, :cond_2

    invoke-virtual {v1, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v15, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v15, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    move-object/from16 v19, v8

    iget-boolean v8, v1, Lp1/q;->S:Z

    if-nez v8, :cond_3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v16, v12

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_2

    :cond_3
    move-object/from16 v16, v12

    :goto_2
    invoke-static {v9, v1, v9, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v15, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v9, 0x8

    int-to-float v9, v9

    const/4 v14, 0x0

    move-object/from16 v39, v3

    const/4 v3, 0x1

    invoke-static {v12, v14, v9, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v14, 0x0

    invoke-static {v3, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    invoke-static {v15}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v14

    move-object/from16 v20, v10

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v15, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v1}, Lp1/q;->i0()V

    move/from16 v40, v9

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v1, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v15, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-nez v3, :cond_6

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    :cond_6
    invoke-static {v14, v1, v14, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v15, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v3

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v9, Lb30/w2;

    const/16 v10, 0xf

    invoke-direct {v9, v10, v6, v7}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, 0x102e2f50

    invoke-static {v6, v15, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    move-object/from16 v6, v16

    const/16 v16, 0x6000

    const/4 v9, 0x0

    const/16 v17, 0xc

    move-object v10, v13

    const/4 v13, 0x0

    move-object v12, v11

    move-object v11, v3

    move-object v3, v12

    move-object v12, v7

    const/16 v7, 0x10

    invoke-static/range {v11 .. v17}, Lg40/j4;->e(Landroidx/compose/ui/Modifier;Lg40/m3;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    const/4 v11, 0x1

    invoke-virtual {v1, v11}, Lp1/q;->q(Z)V

    iget-boolean v11, v0, Lg1/g4;->x:Z

    if-eqz v11, :cond_8

    const v2, -0x629a9031

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v14, 0x6

    const/16 v16, 0x2

    const-wide/16 v11, 0x0

    invoke-static/range {v11 .. v16}, Lds/q;->e(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    const/4 v14, 0x0

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    :goto_4
    const/4 v12, 0x1

    goto/16 :goto_10

    :cond_8
    invoke-interface/range {v38 .. v38}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_19

    const v11, -0x6e88fb85

    invoke-virtual {v1, v11}, Lp1/q;->e0(I)V

    if-nez v19, :cond_9

    const/4 v14, 0x0

    goto/16 :goto_f

    :cond_9
    const v11, -0x6e88f642

    invoke-virtual {v1, v11}, Lp1/q;->e0(I)V

    move-object/from16 v11, v19

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_17

    move/from16 v11, v40

    const/4 v12, 0x1

    invoke-static {v10, v9, v11, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v17, 0x6

    const/16 v18, 0xe

    move-object v11, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v7, v40

    invoke-static/range {v11 .. v18}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v16

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v11

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object/from16 v12, v20

    const/4 v14, 0x0

    invoke-static {v12, v6, v15, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    invoke-static {v15}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v13

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v15, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    invoke-virtual {v1, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v15, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-nez v3, :cond_b

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v13, v1, v13, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v15, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x36937617

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    move-object/from16 v8, v19

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz30/b;

    iget-object v4, v3, Lz30/b;->a:Landroid/text/SpannableString;

    iget-object v5, v3, Lz30/b;->b:Landroid/text/SpannableString;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v11, -0x188d8cdc

    invoke-virtual {v1, v11}, Lp1/q;->e0(I)V

    move-object/from16 v11, v39

    invoke-virtual {v1, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_e

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v13, v12, :cond_d

    goto :goto_7

    :cond_d
    const/4 v12, 0x1

    goto :goto_8

    :cond_e
    :goto_7
    new-instance v13, Li01/d;

    const/4 v12, 0x1

    invoke-direct {v13, v11, v3, v12}, Li01/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v1, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    check-cast v13, Lc93/a;

    const/4 v14, 0x0

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    const/4 v3, 0x7

    const/4 v9, 0x0

    invoke-static {v8, v14, v9, v13, v3}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v9, 0x0

    invoke-static {v3, v9, v7, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Ll0/m;->c:Ll0/g;

    invoke-static {v8, v6, v15, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    invoke-static {v15}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v9

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v15, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v14, v1, Lp1/q;->S:Z

    if-eqz v14, :cond_f

    invoke-virtual {v1, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_9
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v15, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v15, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-nez v12, :cond_10

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_11

    :cond_10
    invoke-static {v9, v1, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v15, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v3, Lyb3/p;

    invoke-interface/range {v38 .. v38}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const-string v9, " "

    const-string v12, "|"

    const/4 v14, 0x0

    invoke-static {v8, v9, v12, v14}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lyb3/q;->x:Lyb3/q;

    invoke-direct {v3, v8, v14}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    invoke-static {v4, v3}, Lyb3/p;->b(Ljava/lang/CharSequence;Lyb3/p;)Lx83/h;

    move-result-object v3

    invoke-static {v3}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v3, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lyb3/k;

    check-cast v9, Lyb3/n;

    invoke-virtual {v9}, Lyb3/n;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_12
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_13
    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Ljava/lang/String;

    invoke-static {v12}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_13

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_14
    invoke-virtual {v4}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v8, "toString(...)"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    const-string v12, "<b>"

    const-string v13, "</b>"

    invoke-static {v12, v9, v13}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x0

    invoke-static {v4, v9, v12, v14}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    goto :goto_c

    :cond_15
    const/4 v3, 0x0

    const/16 v16, 0x6

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v39, v11

    move-object v14, v15

    move v15, v3

    move-object v11, v4

    invoke-static/range {v11 .. v16}, Lup/d;->n(Ljava/lang/String;Ljava/util/Map;Ll3/m0;Landroidx/compose/runtime/Composer;II)Ll3/g;

    move-result-object v11

    move-object v15, v14

    invoke-static {v15}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v3

    iget-wide v13, v3, Ld40/n;->d:J

    invoke-static {v15}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v3

    iget-object v3, v3, Lg1/h9;->i:Ll3/v0;

    const/16 v35, 0x0

    const v36, 0x1fffa

    move-object/from16 v32, v15

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    move-object/from16 v33, v32

    move-object/from16 v32, v3

    invoke-static/range {v11 .. v36}, Lg1/f9;->c(Ll3/g;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v33

    invoke-virtual {v5}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v15}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v3

    iget-wide v13, v3, Ld40/n;->d:J

    invoke-static {v15}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v3

    iget-object v3, v3, Lg1/h9;->i:Ll3/v0;

    const v35, 0xfffa

    move-object/from16 v32, v15

    const-wide/16 v15, 0x0

    const/16 v33, 0x0

    move-object/from16 v31, v3

    invoke-static/range {v11 .. v35}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    const/16 v17, 0x0

    const/16 v18, 0xf

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    invoke-static/range {v11 .. v18}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v16

    goto/16 :goto_6

    :cond_16
    const/4 v3, 0x1

    const/4 v14, 0x0

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_17
    const/4 v3, 0x1

    const/4 v14, 0x0

    :goto_d
    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    const v2, -0x6e87a612

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    if-nez p3, :cond_18

    goto :goto_e

    :cond_18
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2, v15, v14}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v11

    const/16 v7, 0x10

    int-to-float v2, v7

    const/4 v9, 0x0

    invoke-static {v10, v9, v2, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "AutocompleteAttributionDrawable"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v19, 0x30

    const/16 v20, 0x78

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v32, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v32

    invoke-static/range {v11 .. v20}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x0

    :goto_e
    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    goto/16 :goto_4

    :cond_19
    const/4 v14, 0x0

    const v2, -0x6263fc27

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    goto/16 :goto_4

    :goto_10
    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    :goto_11
    return-object v37

    :pswitch_0
    move-object/from16 v37, v2

    move v14, v9

    const/4 v12, 0x1

    move-object/from16 v15, p1

    check-cast v15, Lc93/m;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v9, v2, 0x6

    if-nez v9, :cond_1b

    move-object v9, v1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    const/4 v9, 0x4

    goto :goto_12

    :cond_1a
    const/4 v9, 0x2

    :goto_12
    or-int/2addr v2, v9

    :cond_1b
    and-int/lit8 v9, v2, 0x13

    const/16 v10, 0x12

    if-eq v9, v10, :cond_1c

    move v9, v12

    goto :goto_13

    :cond_1c
    move v9, v14

    :goto_13
    and-int/lit8 v10, v2, 0x1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_1d

    sget-object v13, Lg1/i8;->a:Lg1/i8;

    check-cast v8, Lq3/y;

    iget-object v8, v8, Lq3/y;->a:Ll3/g;

    iget-object v14, v8, Ll3/g;->x:Ljava/lang/String;

    move-object/from16 v18, v7

    check-cast v18, Lq3/g0;

    move-object/from16 v19, v6

    check-cast v19, Lj0/i;

    move-object/from16 v22, v5

    check-cast v22, Lc93/m;

    move-object/from16 v25, v4

    check-cast v25, Li2/a1;

    move-object v10, v3

    check-cast v10, Lg1/y1;

    new-instance v7, Lg1/f4;

    const/4 v12, 0x0

    iget-boolean v8, v0, Lg1/g4;->x:Z

    move-object/from16 v9, v19

    move-object/from16 v11, v25

    invoke-direct/range {v7 .. v12}, Lg1/f4;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move/from16 v16, v8

    const v3, -0xb0c70be

    invoke-static {v3, v1, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v28

    shl-int/lit8 v2, v2, 0x3

    and-int/lit8 v30, v2, 0x70

    const/16 v31, 0x2000

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v29, v1

    move-object/from16 v26, v10

    invoke-virtual/range {v13 .. v31}, Lg1/i8;->b(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/e8;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_14

    :cond_1d
    move-object/from16 v29, v1

    invoke-virtual/range {v29 .. v29}, Lp1/q;->X()V

    :goto_14
    return-object v37

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
