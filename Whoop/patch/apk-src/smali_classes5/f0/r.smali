.class public final synthetic Lf0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lf0/r;->w:I

    iput-object p4, p0, Lf0/r;->y:Ljava/lang/Object;

    iput-object p5, p0, Lf0/r;->z:Ljava/lang/Object;

    iput-wide p2, p0, Lf0/r;->x:J

    iput-object p6, p0, Lf0/r;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(J[FLkotlin/jvm/internal/e0;Lkotlin/jvm/internal/d0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lf0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lf0/r;->x:J

    iput-object p3, p0, Lf0/r;->y:Ljava/lang/Object;

    iput-object p4, p0, Lf0/r;->z:Ljava/lang/Object;

    iput-object p5, p0, Lf0/r;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g0;Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;JLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, Lf0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/r;->z:Ljava/lang/Object;

    iput-object p2, p0, Lf0/r;->y:Ljava/lang/Object;

    iput-wide p3, p0, Lf0/r;->x:J

    iput-object p5, p0, Lf0/r;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lus1/b;Ljava/util/List;Ljava/lang/String;J)V
    .locals 1

    .line 4
    const/4 v0, 0x4

    iput v0, p0, Lf0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/r;->y:Ljava/lang/Object;

    iput-object p2, p0, Lf0/r;->z:Ljava/lang/Object;

    iput-object p3, p0, Lf0/r;->E:Ljava/lang/Object;

    iput-wide p4, p0, Lf0/r;->x:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v1, p0

    iget v0, v1, Lf0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lf0/r;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lus1/b;

    iget-object v0, v1, Lf0/r;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    iget-object v0, v1, Lf0/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-wide v5, v1, Lf0/r;->x:J

    move-object/from16 v7, p1

    check-cast v7, Ltb/a;

    invoke-static/range {v2 .. v7}, Lus1/b;->h(Lus1/b;Ljava/util/List;Ljava/lang/String;JLtb/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, v1, Lf0/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v0, v1, Lf0/r;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    iget-object v0, v1, Lf0/r;->E:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v7, p1

    check-cast v7, Landroid/text/Editable;

    iget-wide v4, v1, Lf0/r;->x:J

    invoke-static/range {v2 .. v7}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->J(Lkotlin/jvm/internal/g0;Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;JLkotlin/jvm/functions/Function1;Landroid/text/Editable;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, v1, Lf0/r;->y:Ljava/lang/Object;

    check-cast v0, Lm1/x;

    iget-object v2, v1, Lf0/r;->z:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    iget-wide v4, v1, Lf0/r;->x:J

    iget-object v3, v1, Lf0/r;->E:Ljava/lang/Object;

    move-object v15, v3

    check-cast v15, Li2/s0;

    move-object/from16 v3, p1

    check-cast v3, Lk2/e;

    invoke-interface {v0}, Lm1/x;->invoke()F

    move-result v0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v0}, Ljava/lang/Math;->min(FF)F

    move-result v7

    const v8, 0x3ecccccd    # 0.4f

    sub-float/2addr v7, v8

    const/4 v9, 0x0

    invoke-static {v7, v9}, Ljava/lang/Math;->max(FF)F

    move-result v7

    const/4 v10, 0x5

    int-to-float v10, v10

    mul-float/2addr v7, v10

    const/4 v10, 0x3

    int-to-float v10, v10

    div-float/2addr v7, v10

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sub-float/2addr v0, v6

    const/high16 v10, 0x40000000    # 2.0f

    invoke-static {v0, v9, v10}, Le93/b;->m(FFF)F

    move-result v0

    float-to-double v11, v0

    const/4 v9, 0x2

    int-to-double v13, v9

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v11

    double-to-float v9, v11

    const/4 v11, 0x4

    int-to-float v11, v11

    div-float/2addr v9, v11

    sub-float/2addr v0, v9

    const v9, 0x3f4ccccd    # 0.8f

    mul-float/2addr v9, v7

    const/high16 v11, -0x41800000    # -0.25f

    mul-float/2addr v8, v7

    add-float/2addr v8, v11

    add-float/2addr v8, v0

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr v8, v0

    const/16 v0, 0x168

    int-to-float v0, v0

    mul-float v11, v8, v0

    add-float/2addr v9, v8

    mul-float/2addr v9, v0

    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v0

    new-instance v6, Ld0/f0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput v9, v6, Ld0/f0;->w:F

    iput v0, v6, Ld0/f0;->x:F

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v12

    invoke-interface {v3}, Lk2/e;->B0()J

    move-result-wide v13

    invoke-interface {v3}, Lk2/e;->t0()La3/p;

    move-result-object v2

    move-wide/from16 v16, v4

    invoke-virtual {v2}, La3/p;->A()J

    move-result-wide v4

    invoke-virtual {v2}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->q()V

    :try_start_0
    iget-object v0, v2, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    invoke-virtual {v0, v8, v13, v14}, Laj/d;->v(FJ)V

    sget v0, Ln1/h;->b:F

    invoke-interface {v3, v0}, Ly3/c;->q0(F)F

    move-result v0

    sget v7, Ln1/h;->a:F

    invoke-interface {v3, v7}, Ly3/c;->q0(F)F

    move-result v8

    div-float/2addr v8, v10

    add-float/2addr v8, v0

    invoke-interface {v3}, Lk2/e;->d()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljc/x;->L(J)J

    move-result-wide v13

    invoke-static {v8, v13, v14}, Lhg3/i;->i(FJ)Lh2/c;

    move-result-object v0

    sub-float/2addr v9, v11

    move v10, v9

    invoke-virtual {v0}, Lh2/c;->f()J

    move-result-wide v8

    move-object v13, v6

    move v14, v10

    move v6, v11

    invoke-virtual {v0}, Lh2/c;->e()J

    move-result-wide v10

    new-instance v18, Lk2/i;

    invoke-interface {v3, v7}, Ly3/c;->q0(F)F

    move-result v19

    const/16 v23, 0x0

    const/16 v24, 0x1a

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v18 .. v24}, Lk2/i;-><init>(FFIILi2/t0;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move v7, v14

    const/16 v14, 0x300

    move-wide/from16 v25, v4

    move-wide/from16 v4, v16

    move-object/from16 v16, v13

    move-object/from16 v13, v18

    :try_start_1
    invoke-static/range {v3 .. v14}, Lk2/e;->P(Lk2/e;JFFJJFLk2/i;I)V

    move-wide v6, v4

    move v8, v12

    move-object v4, v15

    move-object/from16 v9, v16

    move-object v5, v0

    invoke-static/range {v3 .. v9}, Ln1/h;->b(Lk2/e;Li2/s0;Lh2/c;JFLd0/f0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-wide/from16 v3, v25

    invoke-static {v2, v3, v4}, Ld;->z(La3/p;J)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    move-wide/from16 v3, v25

    goto :goto_0

    :catchall_1
    move-exception v0

    move-wide v3, v4

    :goto_0
    invoke-static {v2, v3, v4}, Ld;->z(La3/p;J)V

    throw v0

    :pswitch_2
    iget-object v0, v1, Lf0/r;->y:Ljava/lang/Object;

    check-cast v0, [F

    iget-object v2, v1, Lf0/r;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/e0;

    iget-object v3, v1, Lf0/r;->E:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/d0;

    move-object/from16 v4, p1

    check-cast v4, Ll3/y;

    iget v5, v4, Ll3/y;->b:I

    iget-object v6, v4, Ll3/y;->a:Ll3/a;

    iget v7, v4, Ll3/y;->c:I

    iget-wide v8, v1, Lf0/r;->x:J

    invoke-static {v8, v9}, Ll3/u0;->f(J)I

    move-result v10

    if-le v5, v10, :cond_0

    iget v5, v4, Ll3/y;->b:I

    goto :goto_1

    :cond_0
    invoke-static {v8, v9}, Ll3/u0;->f(J)I

    move-result v5

    :goto_1
    invoke-static {v8, v9}, Ll3/u0;->e(J)I

    move-result v10

    if-ge v7, v10, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {v8, v9}, Ll3/u0;->e(J)I

    move-result v7

    :goto_2
    invoke-virtual {v4, v5}, Ll3/y;->d(I)I

    move-result v5

    invoke-virtual {v4, v7}, Ll3/y;->d(I)I

    move-result v4

    invoke-static {v5, v4}, Lj93/l0;->f(II)J

    move-result-wide v4

    iget v7, v2, Lkotlin/jvm/internal/e0;->w:I

    iget-object v8, v6, Ll3/a;->d:Lm3/m;

    invoke-static {v4, v5}, Ll3/u0;->f(J)I

    move-result v9

    invoke-static {v4, v5}, Ll3/u0;->e(J)I

    move-result v10

    iget-object v11, v8, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v11}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v12

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-ltz v9, :cond_2

    goto :goto_3

    :cond_2
    const-string v13, "startOffset must be > 0"

    invoke-static {v13}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_3
    if-ge v9, v12, :cond_3

    goto :goto_4

    :cond_3
    const-string v13, "startOffset must be less than text length"

    invoke-static {v13}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_4
    if-le v10, v9, :cond_4

    goto :goto_5

    :cond_4
    const-string v13, "endOffset must be greater than startOffset"

    invoke-static {v13}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_5
    if-gt v10, v12, :cond_5

    goto :goto_6

    :cond_5
    const-string v12, "endOffset must be smaller or equal to text length"

    invoke-static {v12}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_6
    sub-int v12, v10, v9

    mul-int/lit8 v12, v12, 0x4

    array-length v13, v0

    sub-int/2addr v13, v7

    if-lt v13, v12, :cond_6

    goto :goto_7

    :cond_6
    const-string v12, "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4"

    invoke-static {v12}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_7
    invoke-virtual {v11, v9}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v12

    add-int/lit8 v13, v10, -0x1

    invoke-virtual {v11, v13}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v13

    new-instance v14, Lh3/g;

    invoke-direct {v14, v8}, Lh3/g;-><init>(Lm3/m;)V

    if-gt v12, v13, :cond_c

    :goto_8
    invoke-virtual {v11, v12}, Landroid/text/Layout;->getLineStart(I)I

    move-result v15

    move-object/from16 v16, v0

    invoke-virtual {v8, v12}, Lm3/m;->f(I)I

    move-result v0

    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    move-result v15

    invoke-static {v10, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v8, v12}, Lm3/m;->g(I)F

    move-result v17

    invoke-virtual {v8, v12}, Lm3/m;->e(I)F

    move-result v18

    move-wide/from16 v19, v4

    invoke-virtual {v11, v12}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_7

    move v4, v5

    goto :goto_9

    :cond_7
    const/4 v4, 0x0

    :goto_9
    if-ge v15, v0, :cond_b

    invoke-virtual {v11, v15}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v21

    if-eqz v4, :cond_8

    if-nez v21, :cond_8

    move/from16 v22, v0

    const/4 v0, 0x0

    invoke-virtual {v14, v15, v0, v0, v5}, Lh3/g;->a(IZZZ)F

    move-result v21

    add-int/lit8 v0, v15, 0x1

    invoke-virtual {v14, v0, v5, v5, v5}, Lh3/g;->a(IZZZ)F

    move-result v0

    move/from16 p1, v4

    move v4, v0

    :goto_a
    const/4 v0, 0x0

    goto :goto_b

    :cond_8
    move/from16 v22, v0

    if-eqz v4, :cond_9

    if-eqz v21, :cond_9

    const/4 v0, 0x0

    invoke-virtual {v14, v15, v0, v0, v0}, Lh3/g;->a(IZZZ)F

    move-result v21

    move/from16 p1, v4

    add-int/lit8 v4, v15, 0x1

    invoke-virtual {v14, v4, v5, v5, v0}, Lh3/g;->a(IZZZ)F

    move-result v4

    move/from16 v27, v21

    move/from16 v21, v4

    move/from16 v4, v27

    goto :goto_b

    :cond_9
    move/from16 p1, v4

    const/4 v0, 0x0

    if-nez p1, :cond_a

    if-eqz v21, :cond_a

    invoke-virtual {v14, v15, v0, v0, v5}, Lh3/g;->a(IZZZ)F

    move-result v4

    add-int/lit8 v0, v15, 0x1

    invoke-virtual {v14, v0, v5, v5, v5}, Lh3/g;->a(IZZZ)F

    move-result v0

    move/from16 v21, v0

    goto :goto_a

    :cond_a
    invoke-virtual {v14, v15, v0, v0, v0}, Lh3/g;->a(IZZZ)F

    move-result v21

    add-int/lit8 v4, v15, 0x1

    invoke-virtual {v14, v4, v5, v5, v0}, Lh3/g;->a(IZZZ)F

    move-result v4

    :goto_b
    aput v21, v16, v7

    add-int/lit8 v21, v7, 0x1

    aput v17, v16, v21

    add-int/lit8 v21, v7, 0x2

    aput v4, v16, v21

    add-int/lit8 v4, v7, 0x3

    aput v18, v16, v4

    add-int/lit8 v7, v7, 0x4

    add-int/lit8 v15, v15, 0x1

    move/from16 v4, p1

    move/from16 v0, v22

    goto :goto_9

    :cond_b
    if-eq v12, v13, :cond_d

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, v16

    move-wide/from16 v4, v19

    goto/16 :goto_8

    :cond_c
    move-object/from16 v16, v0

    move-wide/from16 v19, v4

    :cond_d
    iget v0, v2, Lkotlin/jvm/internal/e0;->w:I

    invoke-static/range {v19 .. v20}, Ll3/u0;->d(J)I

    move-result v4

    mul-int/lit8 v4, v4, 0x4

    add-int/2addr v4, v0

    iget v0, v2, Lkotlin/jvm/internal/e0;->w:I

    :goto_c
    if-ge v0, v4, :cond_e

    add-int/lit8 v5, v0, 0x1

    aget v7, v16, v5

    iget v8, v3, Lkotlin/jvm/internal/d0;->w:F

    add-float/2addr v7, v8

    aput v7, v16, v5

    add-int/lit8 v5, v0, 0x3

    aget v7, v16, v5

    add-float/2addr v7, v8

    aput v7, v16, v5

    add-int/lit8 v0, v0, 0x4

    goto :goto_c

    :cond_e
    iput v4, v2, Lkotlin/jvm/internal/e0;->w:I

    iget v0, v3, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {v6}, Ll3/a;->b()F

    move-result v2

    add-float/2addr v2, v0

    iput v2, v3, Lkotlin/jvm/internal/d0;->w:F

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, v1, Lf0/r;->y:Ljava/lang/Object;

    check-cast v0, Lh2/c;

    iget-object v2, v1, Lf0/r;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-wide v5, v1, Lf0/r;->x:J

    iget-object v3, v1, Lf0/r;->E:Ljava/lang/Object;

    move-object v10, v3

    check-cast v10, Li2/y;

    move-object/from16 v3, p1

    check-cast v3, Lk2/c;

    check-cast v3, La3/p0;

    invoke-virtual {v3}, La3/p0;->a()V

    iget v13, v0, Lh2/c;->a:F

    iget v14, v0, Lh2/c;->b:F

    iget-object v15, v3, La3/p0;->w:Lk2/b;

    iget-object v0, v15, Lk2/b;->x:La3/p;

    iget-object v0, v0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    invoke-virtual {v0, v13, v14}, Laj/d;->B(FF)V

    :try_start_2
    iget-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Li2/g;

    const/4 v11, 0x0

    const/16 v12, 0x37a

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v12}, Lk2/e;->K0(Lk2/e;Li2/g;JJFLi2/y;II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v0, v15, Lk2/b;->x:La3/p;

    iget-object v0, v0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    neg-float v2, v13

    neg-float v3, v14

    invoke-virtual {v0, v2, v3}, Laj/d;->B(FF)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_2
    move-exception v0

    iget-object v2, v15, Lk2/b;->x:La3/p;

    iget-object v2, v2, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Laj/d;

    neg-float v3, v13

    neg-float v4, v14

    invoke-virtual {v2, v3, v4}, Laj/d;->B(FF)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
