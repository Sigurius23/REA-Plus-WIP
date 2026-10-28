.class public final Lb30/z3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lb30/g4;ZZLc93/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb30/z3;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/z3;->x:Ljava/lang/String;

    iput-object p2, p0, Lb30/z3;->y:Ljava/lang/Object;

    iput-boolean p3, p0, Lb30/z3;->z:Z

    iput-boolean p4, p0, Lb30/z3;->E:Z

    iput-object p5, p0, Lb30/z3;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ZLc93/a;Lb30/g4;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb30/z3;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/z3;->z:Z

    iput-object p2, p0, Lb30/z3;->F:Ljava/lang/Object;

    iput-object p3, p0, Lb30/z3;->y:Ljava/lang/Object;

    iput-object p4, p0, Lb30/z3;->x:Ljava/lang/String;

    iput-boolean p5, p0, Lb30/z3;->E:Z

    return-void
.end method

.method public constructor <init>(ZLg40/p1;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb30/z3;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/z3;->z:Z

    iput-object p2, p0, Lb30/z3;->F:Ljava/lang/Object;

    iput-object p3, p0, Lb30/z3;->x:Ljava/lang/String;

    iput-boolean p4, p0, Lb30/z3;->E:Z

    iput-object p5, p0, Lb30/z3;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    move-object/from16 v0, p0

    iget v1, v0, Lb30/z3;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v4, p1

    check-cast v4, Lc93/m;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v3, v0, Lb30/z3;->F:Ljava/lang/Object;

    check-cast v3, Lg40/p1;

    const-string v5, "innerTextField"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    move-object v5, v1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v2, v5

    :cond_1
    and-int/lit8 v5, v2, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_2

    move-object v5, v1

    check-cast v5, Lp1/q;

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    move v5, v2

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    goto/16 :goto_4

    :goto_1
    sget-object v2, Lg1/i8;->a:Lg1/i8;

    move-object v15, v1

    check-cast v15, Lp1/q;

    const v1, -0x5c60ab8d

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v1, v6, :cond_4

    invoke-static {v15}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v1

    :cond_4
    check-cast v1, Lj0/i;

    const/4 v6, 0x0

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    invoke-static {v15}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v6

    iget-wide v6, v6, Ld40/n;->d:J

    iget-boolean v8, v0, Lb30/z3;->z:Z

    if-eqz v8, :cond_5

    iget-wide v9, v3, Lg40/p1;->d:J

    :goto_2
    move-wide v10, v9

    goto :goto_3

    :cond_5
    iget-wide v9, v3, Lg40/p1;->c:J

    goto :goto_2

    :goto_3
    invoke-static {v15}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v9

    iget-wide v12, v9, Ld40/n;->f:J

    move-object/from16 p2, v1

    move-object/from16 p1, v2

    iget-wide v1, v3, Lg40/p1;->c:J

    move-wide/from16 v16, v1

    iget-wide v1, v3, Lg40/p1;->b:J

    const-wide/16 v26, 0x0

    const v33, 0x7ff12

    move v3, v8

    const-wide/16 v8, 0x0

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    move-wide/from16 v18, v16

    move-wide/from16 v20, v16

    move-wide/from16 v30, v1

    move-wide/from16 v28, v1

    invoke-static/range {v6 .. v33}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v13

    move-object/from16 v15, v32

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v1, v1, v2}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v14

    new-instance v1, Lb30/x2;

    iget-object v6, v0, Lb30/z3;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    const/4 v7, 0x1

    invoke-direct {v1, v3, v6, v7}, Lb30/x2;-><init>(ZLjava/lang/Object;I)V

    const v3, -0x57c203ec

    invoke-static {v3, v15, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    shl-int/lit8 v1, v5, 0x3

    and-int/lit8 v1, v1, 0x70

    const v2, 0x6036c00

    or-int v16, v1, v2

    const/16 v17, 0x6c00

    const/16 v18, 0xec0

    iget-object v3, v0, Lb30/z3;->x:Ljava/lang/String;

    iget-boolean v5, v0, Lb30/z3;->E:Z

    const/4 v6, 0x1

    sget-object v7, Lq3/f0;->w:Lg40/h2;

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v2, p1

    move-object/from16 v8, p2

    invoke-virtual/range {v2 .. v18}, Lg1/i8;->c(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/y1;Ll0/k1;Landroidx/compose/runtime/Composer;III)V

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "$this$TextButton"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v2, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_7

    move-object v1, v7

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_6

    :cond_7
    :goto_5
    iget-object v1, v0, Lb30/z3;->y:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lb30/g4;

    iget-object v1, v0, Lb30/z3;->F:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lc93/a;

    const/4 v8, 0x0

    iget-object v2, v0, Lb30/z3;->x:Ljava/lang/String;

    iget-boolean v4, v0, Lb30/z3;->z:Z

    iget-boolean v5, v0, Lb30/z3;->E:Z

    invoke-static/range {v2 .. v8}, Lb30/c4;->b(Ljava/lang/String;Lb30/g4;ZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v4, v3, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_9

    move-object v4, v2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, 0x4

    goto :goto_7

    :cond_8
    move v4, v5

    :goto_7
    or-int/2addr v3, v4

    :cond_9
    and-int/lit8 v3, v3, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_b

    move-object v3, v2

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_d

    :cond_b
    :goto_8
    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x8

    int-to-float v4, v4

    const/4 v6, 0x0

    invoke-static {v3, v4, v6, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    iget-object v4, v0, Lb30/z3;->F:Ljava/lang/Object;

    check-cast v4, Lc93/a;

    iget-object v5, v0, Lb30/z3;->y:Ljava/lang/Object;

    check-cast v5, Lb30/g4;

    sget-object v6, Lb2/e;->w:Lb2/m;

    const/4 v7, 0x0

    invoke-static {v6, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    invoke-static {v2}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v8

    move-object v9, v2

    check-cast v9, Lp1/q;

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_c

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v2, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v2, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    :cond_d
    invoke-static {v8, v9, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v2, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x1

    const/4 v6, 0x6

    if-eqz v1, :cond_10

    const v1, -0x2255e62e

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    iget-boolean v1, v0, Lb30/z3;->z:Z

    if-eqz v1, :cond_f

    const v1, -0x22554a74

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-static {v4, v2, v6}, Lb30/c4;->e(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    const v1, -0x2253e1d6

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-static {v4, v2, v6}, Lb30/c4;->a(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_10
    const v1, -0x22520fbf

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    const v1, 0x7ac3941a

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    instance-of v1, v5, Lb30/e4;

    if-eqz v1, :cond_11

    iget-object v4, v0, Lb30/z3;->x:Ljava/lang/String;

    goto :goto_b

    :cond_11
    const v4, 0x7f1410bd

    invoke-static {v2, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    :goto_b
    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    xor-int/2addr v1, v3

    iget-boolean v5, v0, Lb30/z3;->E:Z

    invoke-static {v4, v1, v5, v2, v6}, Lb30/c4;->f(Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_d
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
