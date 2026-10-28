.class public final Li20/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Z

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lx1/b;Lx1/b;Lx1/b;Ljava/lang/String;ZLg2/i;Lc93/a;I)V
    .locals 0

    .line 1
    iput p9, p0, Li20/c1;->w:I

    iput-object p1, p0, Li20/c1;->x:Ljava/lang/Object;

    iput-object p2, p0, Li20/c1;->y:Ljava/lang/Object;

    iput-object p3, p0, Li20/c1;->z:Lc93/m;

    iput-object p4, p0, Li20/c1;->E:Lc93/m;

    iput-object p5, p0, Li20/c1;->F:Ljava/lang/Object;

    iput-boolean p6, p0, Li20/c1;->G:Z

    iput-object p7, p0, Li20/c1;->H:Ljava/lang/Object;

    iput-object p8, p0, Li20/c1;->I:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lq3/y;ZLq3/g0;Lj0/i;Lc93/m;Lc93/m;Li2/a1;Lg1/y1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Li20/c1;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li20/c1;->x:Ljava/lang/Object;

    iput-boolean p2, p0, Li20/c1;->G:Z

    iput-object p3, p0, Li20/c1;->F:Ljava/lang/Object;

    iput-object p4, p0, Li20/c1;->y:Ljava/lang/Object;

    iput-object p5, p0, Li20/c1;->z:Lc93/m;

    iput-object p6, p0, Li20/c1;->E:Lc93/m;

    iput-object p7, p0, Li20/c1;->H:Ljava/lang/Object;

    iput-object p8, p0, Li20/c1;->I:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    move-object/from16 v0, p0

    iget v1, v0, Li20/c1;->w:I

    iget-object v2, v0, Li20/c1;->E:Lc93/m;

    iget-object v3, v0, Li20/c1;->z:Lc93/m;

    const/4 v4, 0x0

    const/16 v5, 0x12

    const/4 v6, 0x2

    const/4 v7, 0x4

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    iget-object v9, v0, Li20/c1;->I:Ljava/lang/Object;

    iget-object v10, v0, Li20/c1;->H:Ljava/lang/Object;

    iget-object v11, v0, Li20/c1;->y:Ljava/lang/Object;

    iget-object v12, v0, Li20/c1;->F:Ljava/lang/Object;

    iget-object v13, v0, Li20/c1;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lc93/m;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v15, v3, 0x6

    if-nez v15, :cond_1

    move-object v15, v2

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_0

    move v6, v7

    :cond_0
    or-int/2addr v3, v6

    :cond_1
    and-int/lit8 v6, v3, 0x13

    if-eq v6, v5, :cond_2

    const/4 v4, 0x1

    :cond_2
    and-int/lit8 v5, v3, 0x1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v15, Lg1/i8;->a:Lg1/i8;

    check-cast v13, Lq3/y;

    iget-object v4, v13, Lq3/y;->a:Ll3/g;

    iget-object v4, v4, Ll3/g;->x:Ljava/lang/String;

    move-object/from16 v20, v12

    check-cast v20, Lq3/g0;

    move-object/from16 v21, v11

    check-cast v21, Lj0/i;

    move-object/from16 v25, v10

    check-cast v25, Li2/a1;

    move-object/from16 v26, v9

    check-cast v26, Lg1/y1;

    shl-int/lit8 v3, v3, 0x3

    and-int/lit8 v29, v3, 0x70

    const/16 v30, 0x6000

    const/16 v31, 0x2000

    iget-boolean v3, v0, Li20/c1;->G:Z

    const/16 v19, 0x0

    const/16 v22, 0x0

    iget-object v5, v0, Li20/c1;->z:Lc93/m;

    iget-object v6, v0, Li20/c1;->E:Lc93/m;

    const/16 v27, 0x0

    move-object/from16 v17, v1

    move-object/from16 v28, v2

    move/from16 v18, v3

    move-object/from16 v16, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    invoke-virtual/range {v15 .. v31}, Lg1/i8;->c(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/y1;Ll0/k1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_0

    :cond_3
    move-object/from16 v28, v2

    invoke-virtual/range {v28 .. v28}, Lp1/q;->X()V

    :goto_0
    return-object v8

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ll0/k1;

    move-object/from16 v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    move-object/from16 v14, p3

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v14

    const-string v15, "it"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v15, v14, 0x6

    if-nez v15, :cond_5

    move-object v15, v4

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4

    move v6, v7

    :cond_4
    or-int/2addr v14, v6

    :cond_5
    and-int/lit8 v6, v14, 0x13

    if-ne v6, v5, :cond_7

    move-object v5, v4

    check-cast v5, Lp1/q;

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_2

    :cond_7
    :goto_1
    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v14, Li20/c1;

    move-object v15, v13

    check-cast v15, Ljava/lang/String;

    move-object/from16 v16, v11

    check-cast v16, Lx1/b;

    move-object/from16 v17, v3

    check-cast v17, Lx1/b;

    move-object/from16 v18, v2

    check-cast v18, Lx1/b;

    move-object/from16 v19, v12

    check-cast v19, Ljava/lang/String;

    move-object/from16 v21, v10

    check-cast v21, Lg2/i;

    move-object/from16 v22, v9

    check-cast v22, Lc93/a;

    const/16 v23, 0x0

    iget-boolean v2, v0, Li20/c1;->G:Z

    move/from16 v20, v2

    invoke-direct/range {v14 .. v23}, Li20/c1;-><init>(Ljava/lang/String;Lx1/b;Lx1/b;Lx1/b;Ljava/lang/String;ZLg2/i;Lc93/a;I)V

    const v2, 0x4da2d270    # 3.4146253E8f

    invoke-static {v2, v4, v14}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x180

    const/4 v5, 0x0

    invoke-static {v1, v5, v2, v4, v3}, Li20/l1;->j(Landroidx/compose/ui/Modifier;Lb2/f;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_2
    return-object v8

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    move-object/from16 v6, p3

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    const-string v7, "$this$ScrollableColumn"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v6, 0x11

    const/16 v6, 0x10

    if-ne v1, v6, :cond_9

    move-object v1, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v40, v8

    goto/16 :goto_5

    :cond_9
    :goto_3
    sget-object v1, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v1

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    sget-object v1, Ld40/p;->f:Ld40/g;

    iget v1, v1, Ld40/g;->b:F

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v1

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    check-cast v13, Ljava/lang/String;

    check-cast v11, Lx1/b;

    check-cast v3, Lx1/b;

    check-cast v2, Lx1/b;

    check-cast v12, Ljava/lang/String;

    check-cast v10, Lg2/i;

    check-cast v9, Lc93/a;

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v14, v5, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    invoke-static {v5}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v14

    move-object v4, v5

    check-cast v4, Lp1/q;

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v40, v8

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    move-object/from16 p2, v12

    iget-boolean v12, v4, Lp1/q;->S:Z

    if-eqz v12, :cond_a

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v5, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v5, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-nez v7, :cond_b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    :cond_b
    invoke-static {v14, v4, v14, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v5, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v4, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/h9;

    iget-object v1, v1, Lg1/h9;->d:Ll3/v0;

    const/16 v6, 0x8

    int-to-float v6, v6

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v19, v6

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v16

    move-object v6, v15

    const/16 v38, 0x0

    const v39, 0xfffc

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x30

    move-object/from16 v35, v1

    move-object/from16 v36, v5

    move-object v15, v13

    invoke-static/range {v15 .. v39}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v36

    const/4 v5, 0x6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    sget-object v8, Ll0/z;->a:Ll0/z;

    invoke-virtual {v11, v8, v1, v7}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v8, v1, v7}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v8, v1, v3}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    const/16 v3, 0x10

    int-to-float v3, v3

    const/4 v5, 0x1

    invoke-static {v6, v2, v3, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const v2, 0x4715560f

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_d

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_e

    :cond_d
    new-instance v3, Li20/b1;

    const/4 v5, 0x1

    invoke-direct {v3, v10, v9, v5}, Li20/b1;-><init>(Lg2/i;Lc93/a;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v17, v3

    check-cast v17, Lc93/a;

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    const/16 v24, 0xc00

    const/16 v25, 0xf0

    iget-boolean v2, v0, Li20/c1;->G:Z

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v15, p2

    move-object/from16 v23, v1

    move/from16 v16, v2

    invoke-static/range {v15 .. v25}, Lio/sentry/config/a;->i(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    :goto_5
    return-object v40

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
