.class public final Lt20/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lt20/c;

.field public final synthetic w:Lc93/a;

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lc93/a;ZILjava/lang/String;Ljava/lang/String;Lt20/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt20/q;->w:Lc93/a;

    iput-boolean p2, p0, Lt20/q;->x:Z

    iput p3, p0, Lt20/q;->y:I

    iput-object p4, p0, Lt20/q;->z:Ljava/lang/String;

    iput-object p5, p0, Lt20/q;->E:Ljava/lang/String;

    iput-object p6, p0, Lt20/q;->F:Lt20/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object v8, v0

    goto/16 :goto_9

    :cond_1
    :goto_0
    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v3, 0x38

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v2}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v2, 0xc

    int-to-float v2, v2

    const/4 v13, 0x1

    invoke-static {v1, v4, v2, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v1, 0x10

    int-to-float v15, v1

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/16 v1, 0x8

    int-to-float v1, v1

    const/16 v24, 0x0

    const/16 v25, 0xb

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v23, v1

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v3, Ll0/m;->g:Ll0/h;

    const/16 v4, 0x36

    invoke-static {v3, v2, v5, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    invoke-static {v5}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v6

    move-object v14, v5

    check-cast v14, Lp1/q;

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v9, v14, Lp1/q;->S:Z

    if-eqz v9, :cond_2

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v5, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-nez v10, :cond_3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    :cond_3
    invoke-static {v6, v14, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v5, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v23 .. v23}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    move-object/from16 v22, v5

    float-to-double v4, v11

    const-wide/16 v15, 0x0

    cmpl-double v4, v4, v15

    const-string v17, "invalid weight; must be greater than zero"

    if-lez v4, :cond_5

    goto :goto_2

    :cond_5
    invoke-static/range {v17 .. v17}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v18, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v5, v11, v18

    if-lez v5, :cond_6

    move/from16 v5, v18

    goto :goto_3

    :cond_6
    move v5, v11

    :goto_3
    invoke-direct {v4, v5, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v5, v22

    const/16 v10, 0x36

    invoke-static {v1, v2, v5, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    invoke-static {v5}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v2

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v13, v14, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v5, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v2, v14, v2, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v5, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget v1, v0, Lt20/q;->y:I

    const/4 v13, 0x0

    invoke-static {v1, v5, v13}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    const/16 v2, 0x18

    int-to-float v2, v2

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v9, 0x1b0

    const/16 v10, 0x78

    move v4, v2

    const/4 v2, 0x0

    move v6, v4

    const/4 v4, 0x0

    move-object/from16 v22, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move/from16 v26, v8

    move-object/from16 v8, v22

    invoke-static/range {v1 .. v10}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v8

    const-string v1, " \u2022\u2022\u2022\u2022 "

    iget-object v2, v0, Lt20/q;->z:Ljava/lang/String;

    iget-object v3, v0, Lt20/q;->E:Ljava/lang/String;

    invoke-static {v2, v1, v3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    iget-wide v3, v2, Ld40/n;->d:J

    iget-boolean v2, v0, Lt20/q;->x:Z

    if-nez v2, :cond_a

    const/high16 v6, 0x3f000000    # 0.5f

    goto :goto_5

    :cond_a
    move v6, v11

    :goto_5
    invoke-static {v6, v12}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    float-to-double v7, v11

    cmpl-double v7, v7, v15

    if-lez v7, :cond_b

    goto :goto_6

    :cond_b
    invoke-static/range {v17 .. v17}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v8, v11, v18

    if-lez v8, :cond_c

    move/from16 v11, v18

    :cond_c
    invoke-direct {v7, v11, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v6, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v24, 0x30

    const v25, 0x1f7f8

    move v7, v2

    move-object/from16 v22, v5

    move-object v2, v6

    const-wide/16 v5, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v15, v10

    const-wide/16 v10, 0x0

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    move/from16 v19, v15

    const-wide/16 v14, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x2

    move/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v27, v19

    const/16 v19, 0x0

    move-object/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v31, v28

    move-object/from16 v0, v30

    invoke-static/range {v1 .. v25}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v22

    const v1, 0x32cb04c0

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    move-object/from16 v8, p0

    iget-object v1, v8, Lt20/q;->F:Lt20/c;

    if-nez v1, :cond_d

    :goto_7
    const/4 v1, 0x0

    goto :goto_8

    :cond_d
    iget-object v2, v1, Lt20/c;->a:Ljava/lang/String;

    iget-boolean v3, v1, Lt20/c;->b:Z

    const/4 v6, 0x0

    const/16 v7, 0xa

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lio/sentry/config/a;->k(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :goto_8
    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    const/4 v9, 0x1

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    move/from16 v4, v26

    move-object/from16 v2, v31

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const v3, -0x3254ead0    # -3.5878656E8f

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    iget-object v3, v8, Lt20/q;->w:Lc93/a;

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_e

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v6, v4, :cond_f

    :cond_e
    new-instance v6, Lry2/g;

    const/4 v4, 0x7

    invoke-direct {v6, v3, v4}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lc93/a;

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    sget-object v4, Lt20/i;->a:Lx1/b;

    move-object v1, v6

    const/16 v6, 0x6030

    const/16 v7, 0x8

    move/from16 v3, v27

    invoke-static/range {v1 .. v7}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    :goto_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
