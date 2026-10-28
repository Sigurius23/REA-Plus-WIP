.class public final Lx20/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final x:Lx20/a;

.field public static final y:Lx20/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lx20/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx20/a;-><init>(I)V

    sput-object v0, Lx20/a;->x:Lx20/a;

    new-instance v0, Lx20/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lx20/a;-><init>(I)V

    sput-object v0, Lx20/a;->y:Lx20/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lx20/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    move-object/from16 v0, p0

    iget v1, v0, Lx20/a;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ll0/k1;

    move-object/from16 v10, p2

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "paddingValues"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_1

    move-object v4, v10

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v3, v4

    :cond_1
    and-int/lit8 v3, v3, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    move-object v3, v10

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object/from16 v32, v2

    goto/16 :goto_b

    :cond_3
    :goto_1
    const/high16 v13, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x0

    invoke-static {v4, v5, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    invoke-static {v10}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v7

    move-object v14, v10

    check-cast v14, Lp1/q;

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_2
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v10, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-nez v12, :cond_5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    :cond_5
    invoke-static {v7, v14, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v10, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 p2, v7

    float-to-double v6, v13

    const-wide/16 v28, 0x0

    cmpl-double v1, v6, v28

    const-string v30, "invalid weight; must be greater than zero"

    if-lez v1, :cond_7

    goto :goto_3

    :cond_7
    invoke-static/range {v30 .. v30}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v31, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v6, v13, v31

    if-lez v6, :cond_8

    move/from16 v6, v31

    goto :goto_4

    :cond_8
    move v6, v13

    :goto_4
    const/4 v15, 0x1

    invoke-direct {v1, v6, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v1, Lb2/e;->N:Lb2/k;

    invoke-static {v13, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v7, 0x7f070572

    invoke-static {v10, v7}, Lup/d;->u(Landroidx/compose/runtime/Composer;I)F

    move-result v7

    const/4 v12, 0x0

    invoke-static {v6, v12, v7, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v7

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v7, 0x30

    invoke-static {v4, v1, v10, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    invoke-static {v10}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v10, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_7

    :cond_a
    :goto_6
    move-object/from16 v1, p2

    goto :goto_8

    :cond_b
    :goto_7
    invoke-static {v4, v14, v4, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_6

    :goto_8
    invoke-static {v10, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x7f080843

    const/4 v4, 0x0

    invoke-static {v1, v10, v4}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    sget v7, Lx20/y;->a:F

    const/4 v8, 0x7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v16, v3

    const/16 v11, 0x1b0

    const/16 v12, 0x78

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, v1

    invoke-static/range {v3 .. v12}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const v1, 0x7f141101

    invoke-static {v10, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v9, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v14, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/h9;

    iget-object v11, v3, Lg1/h9;->d:Ll3/v0;

    sget v7, Lx20/y;->b:F

    const/4 v8, 0x7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v3, v16

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move v3, v15

    new-instance v15, Lw3/k;

    const/4 v5, 0x3

    invoke-direct {v15, v5}, Lw3/k;-><init>(I)V

    const/16 v26, 0x0

    const v27, 0xfdfc

    move v7, v5

    const-wide/16 v5, 0x0

    move v12, v7

    const-wide/16 v7, 0x0

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v24, v10

    const/4 v10, 0x0

    move-object/from16 v23, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    move/from16 v17, v13

    const-wide/16 v12, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v16

    move/from16 v21, v17

    const-wide/16 v16, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v25, v19

    const/16 v19, 0x0

    move-object/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v22

    const/16 v22, 0x0

    move-object/from16 v35, v25

    const/16 v25, 0x30

    move-object v3, v1

    move-object/from16 v0, v32

    move-object/from16 v1, v35

    move-object/from16 v32, v2

    move/from16 v2, v34

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v24

    const v3, 0x7f141100

    invoke-static {v10, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    new-instance v15, Lw3/k;

    invoke-direct {v15, v2}, Lw3/k;-><init>(I)V

    invoke-virtual {v1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/h9;

    iget-object v0, v0, Lg1/h9;->i:Ll3/v0;

    iget-object v0, v0, Ll3/v0;->a:Ll3/m0;

    iget-wide v4, v0, Ll3/m0;->b:J

    invoke-static {v4, v5}, Lv63/c;->a(J)V

    const-wide v6, 0xff00000000L

    and-long/2addr v6, v4

    const v0, 0x3fa66666    # 1.3f

    invoke-static {v4, v5, v6, v7, v0}, Ld13/a;->d(JJF)J

    move-result-wide v16

    const v27, 0x1f9fe

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v24

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v4, v0

    cmpl-double v2, v4, v28

    if-lez v2, :cond_c

    goto :goto_9

    :cond_c
    invoke-static/range {v30 .. v30}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v4, v0, v31

    if-lez v4, :cond_d

    move/from16 v13, v31

    goto :goto_a

    :cond_d
    move v13, v0

    :goto_a
    invoke-direct {v2, v13, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    :goto_b
    return-object v32

    :pswitch_0
    move-object/from16 v32, v2

    move-object/from16 v0, p1

    check-cast v0, Ll0/s1;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "$this$TextButton"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, v2, 0x11

    const/16 v2, 0x10

    if-ne v0, v2, :cond_f

    move-object v0, v1

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_c

    :cond_e
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_d

    :cond_f
    :goto_c
    const v0, 0x7f1410fd

    invoke-static {v1, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const/16 v24, 0x0

    const v25, 0x1fffe

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, v1

    move-object v1, v0

    invoke-static/range {v1 .. v25}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_d
    return-object v32

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
