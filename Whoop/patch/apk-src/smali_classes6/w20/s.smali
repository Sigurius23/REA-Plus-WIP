.class public final Lw20/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic w:J

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lg2/s;

.field public final synthetic z:Lw20/z;


# direct methods
.method public constructor <init>(JLkotlin/jvm/functions/Function1;Lg2/s;Lw20/z;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lw20/s;->w:J

    iput-object p3, p0, Lw20/s;->x:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lw20/s;->y:Lg2/s;

    iput-object p5, p0, Lw20/s;->z:Lw20/z;

    iput-boolean p6, p0, Lw20/s;->E:Z

    iput-object p7, p0, Lw20/s;->F:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_7

    :cond_1
    :goto_0
    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/a1;->w:Ll0/a1;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->a:Ll0/e;

    sget-object v3, Lb2/e;->J:Lb2/l;

    const/4 v13, 0x0

    invoke-static {v2, v3, v6, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    invoke-static {v6}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v3

    move-object v14, v6

    check-cast v14, Lp1/q;

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_2

    invoke-virtual {v14, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-nez v8, :cond_3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    :cond_3
    invoke-static {v3, v14, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v15, 0x3f000000    # 0.5f

    float-to-double v8, v15

    const-wide/16 v26, 0x0

    cmpl-double v1, v8, v26

    const-string v28, "invalid weight; must be greater than zero"

    if-lez v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-static/range {v28 .. v28}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v29, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v8, v15, v29

    if-lez v8, :cond_6

    move/from16 v8, v29

    goto :goto_3

    :cond_6
    move v8, v15

    :goto_3
    const/4 v9, 0x1

    invoke-direct {v1, v8, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, Li2/w0;->a:Li2/v0;

    iget-wide v9, v0, Lw20/s;->w:J

    invoke-static {v1, v9, v10, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    invoke-static {v6}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v9

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v14, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v6, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-nez v8, :cond_8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    invoke-static {v9, v14, v9, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v6, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    sget-object v8, Lb2/e;->z:Lb2/m;

    invoke-virtual {v1, v12, v8}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v8, 0xc

    int-to-float v8, v8

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v8, 0x6

    int-to-float v8, v8

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    sget-object v9, Lb2/e;->K:Lb2/l;

    const/16 v11, 0x36

    invoke-static {v8, v9, v6, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    invoke-static {v6}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v9

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_a

    invoke-virtual {v14, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v6, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    invoke-static {v9, v14, v9, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v6, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v11, v0, Lw20/s;->z:Lw20/z;

    iget-object v1, v11, Lw20/z;->b:Ly00/i;

    iget v1, v1, Ly00/i;->y:I

    invoke-static {v1, v6, v13}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    const/16 v9, 0x30

    const/16 v10, 0x7c

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v17, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, v17

    invoke-static/range {v1 .. v10}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    const v1, 0x7f1410a8

    iget-object v2, v0, Lw20/s;->F:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2, v6}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v2

    iget-object v2, v2, Lg1/h9;->i:Ll3/v0;

    const-string v3, "TEST_TAG_CVC_LAST_FOUR"

    invoke-static {v12, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v24, 0x0

    const v25, 0xfffc

    move-object/from16 v21, v2

    move-object v2, v3

    const-wide/16 v3, 0x0

    move-object/from16 v17, v6

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v18, v11

    const-wide/16 v10, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move-object/from16 v22, v14

    move/from16 v23, v15

    const-wide/16 v14, 0x0

    const/16 v30, 0x36

    const/16 v16, 0x0

    move-object/from16 v31, v22

    move-object/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v32, v18

    const/16 v18, 0x0

    move-object/from16 v33, v19

    const/16 v19, 0x0

    move/from16 v34, v20

    const/16 v20, 0x0

    move/from16 v35, v23

    const/16 v23, 0x30

    move-object/from16 v0, v31

    move-object/from16 v37, v32

    move-object/from16 v36, v33

    invoke-static/range {v1 .. v25}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v17, v22

    const/4 v13, 0x1

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    int-to-float v1, v13

    move-object/from16 v9, v36

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static/range {v17 .. v17}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    iget-wide v2, v2, Ld40/n;->b:J

    const/4 v7, 0x6

    const/16 v8, 0xc

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v6, v17

    invoke-static/range {v1 .. v8}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    sget-object v1, Lc2/n;->I:Lc2/n;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const v2, 0x5a769af0    # 1.73533E16f

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    move-object/from16 v14, p0

    iget-object v15, v14, Lw20/s;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_d

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_e

    :cond_d
    new-instance v3, Lv41/b0;

    const/16 v2, 0xf

    invoke-direct {v3, v15, v2}, Lv41/b0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    const/16 v4, 0x36

    invoke-static {v9, v1, v3, v6, v4}, Lug/m;->n(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v3, 0x3f000000    # 0.5f

    float-to-double v4, v3

    cmpl-double v4, v4, v26

    if-lez v4, :cond_f

    goto :goto_6

    :cond_f
    invoke-static/range {v28 .. v28}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v5, v3, v29

    if-lez v5, :cond_10

    move/from16 v3, v29

    :cond_10
    invoke-direct {v4, v3, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v1, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v3, v14, Lw20/s;->y:Lg2/s;

    invoke-static {v1, v3}, Landroidx/compose/ui/focus/a;->b(Landroidx/compose/ui/Modifier;Lg2/s;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v3, "TEST_TAG_CVC_FIELD"

    invoke-static {v1, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    move-object/from16 v1, v37

    iget-object v3, v1, Lw20/z;->a:Ljava/lang/String;

    invoke-static {v6}, Lg1/l3;->b(Landroidx/compose/runtime/Composer;)Lg1/l5;

    move-result-object v4

    iget-object v4, v4, Lg1/l5;->c:Lt0/i;

    const/4 v11, 0x0

    const/16 v12, 0x1f

    move-object/from16 v32, v1

    const/4 v1, 0x0

    move/from16 v34, v2

    move-object v5, v3

    const-wide/16 v2, 0x0

    move-object v8, v4

    move-object v7, v5

    const-wide/16 v4, 0x0

    move-object/from16 v17, v6

    move-object v9, v7

    const-wide/16 v6, 0x0

    move-object/from16 v18, v8

    move-object v10, v9

    const-wide/16 v8, 0x0

    move-object/from16 v13, v17

    move-object/from16 v17, v10

    move-object v10, v13

    move-object/from16 v38, v32

    move/from16 v13, v34

    invoke-static/range {v1 .. v12}, Lg40/j4;->d(Lg40/e1;JJJJLandroidx/compose/runtime/Composer;II)Lg1/y1;

    move-result-object v1

    move-object v6, v10

    new-instance v10, Lu0/r0;

    const/16 v2, 0x8

    const/16 v3, 0x7b

    invoke-direct {v10, v13, v2, v13, v3}, Lu0/r0;-><init>(IIII)V

    new-instance v2, Lw20/r;

    const/4 v3, 0x0

    move-object/from16 v4, v38

    invoke-direct {v2, v4, v3}, Lw20/r;-><init>(Lw20/z;I)V

    const v3, -0xa50b53f

    invoke-static {v3, v6, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    new-instance v3, Lw20/r;

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Lw20/r;-><init>(Lw20/z;I)V

    const v4, -0x76ffeffc

    invoke-static {v4, v6, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/16 v19, 0x6180

    const v20, 0x3adb0

    iget-boolean v4, v14, Lw20/s;->E:Z

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v22, v6

    move-object v6, v2

    move-object v2, v15

    move-object/from16 v15, v18

    const/high16 v18, 0x30180000

    move-object/from16 v3, v16

    move-object/from16 v16, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v22

    invoke-static/range {v1 .. v20}, Lg1/u8;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;III)V

    const/4 v13, 0x1

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
