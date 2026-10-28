.class public abstract Lre1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001aG\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/educationModels/MediaHeader;",
        "mediaHeader",
        "Lf0/r1;",
        "scrollState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onCtaClick",
        "Lkotlin/Function2;",
        "",
        "onShareClick",
        "f",
        "(Lcom/whoop/educationModels/MediaHeader;Lf0/r1;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "education_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0}, Lre1/l;->g(Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lre1/l;->j(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/educationModels/MediaHeader;Lf0/r1;Lc93/a;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lre1/l;->k(Lcom/whoop/educationModels/MediaHeader;Lf0/r1;Lc93/a;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Li2/k0;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lre1/l;->h(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/m;Ljava/lang/String;Lcom/whoop/educationModels/MediaHeader;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lre1/l;->i(Lc93/m;Ljava/lang/String;Lcom/whoop/educationModels/MediaHeader;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/educationModels/MediaHeader;Lf0/r1;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/educationModels/MediaHeader;",
            "Lf0/r1;",
            "Lc93/a;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    move/from16 v9, p5

    const-string v3, "mediaHeader"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "scrollState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onCtaClick"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onShareClick"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v3, 0x275124f0

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v9, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v9

    goto :goto_2

    :cond_2
    move v3, v9

    :goto_2
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit16 v4, v9, 0x180

    if-nez v4, :cond_6

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_4

    :cond_5
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v3, v4

    :cond_6
    and-int/lit16 v4, v9, 0xc00

    if-nez v4, :cond_8

    invoke-virtual {v13, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x800

    goto :goto_5

    :cond_7
    const/16 v4, 0x400

    :goto_5
    or-int/2addr v3, v4

    :cond_8
    move v14, v3

    and-int/lit16 v3, v14, 0x493

    const/16 v4, 0x492

    const/4 v5, 0x0

    if-eq v3, v4, :cond_9

    const/4 v3, 0x1

    goto :goto_6

    :cond_9
    move v3, v5

    :goto_6
    and-int/lit8 v4, v14, 0x1

    invoke-virtual {v13, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_2b

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move-object/from16 v17, v4

    iget-wide v3, v13, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-eqz v5, :cond_a

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_7
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v13, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v13, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-nez v15, :cond_b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v3, v13, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v13, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v17

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v3, 0x4c

    int-to-float v3, v3

    move-object/from16 v17, v4

    move-object/from16 v21, v11

    const/4 v4, 0x4

    int-to-float v11, v4

    mul-float/2addr v3, v11

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move/from16 v22, v11

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v15, v11, :cond_d

    new-instance v15, Lr61/h;

    const/16 v4, 0xd

    invoke-direct {v15, v4}, Lr61/h;-><init>(I)V

    invoke-virtual {v13, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v15}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v4, v6

    const/4 v6, 0x6

    move-object v15, v7

    const/4 v7, 0x0

    move-object/from16 v24, v4

    const/4 v4, 0x0

    move-object/from16 v25, v5

    const/4 v5, 0x0

    move-object/from16 v23, v3

    move-object v3, v2

    move-object/from16 v2, v23

    move-object/from16 v37, v17

    move-object/from16 v36, v25

    const/16 v23, 0x4

    invoke-static/range {v2 .. v7}, Lue1/b;->c(Landroidx/compose/ui/Modifier;Lf0/r1;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v25, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/educationModels/MediaHeader;->getImageUrl()Ljava/lang/String;

    move-result-object v26

    sget v27, Lie1/b;->e:I

    const/16 v30, 0xc

    const/16 v31, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v25 .. v31}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v3, v14

    sget v14, Lkd1/o$c;->f:I

    move-object v4, v15

    const/4 v15, 0x3

    move-object v5, v11

    const/4 v11, 0x0

    move-object v6, v12

    const/4 v12, 0x0

    move-object/from16 v16, v2

    move-object/from16 v39, v5

    move-object/from16 v7, v21

    move/from16 v2, v22

    const/16 v9, 0x800

    move-object v5, v4

    move v4, v3

    move-object v3, v10

    move-object/from16 v10, v25

    invoke-static/range {v10 .. v15}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v10

    move-object/from16 v32, v13

    const/16 v18, 0x6030

    const/16 v19, 0x68

    const/4 v13, 0x0

    sget-object v14, Ly2/j;->a:Ly2/b1;

    const/4 v15, 0x0

    move-object/from16 v12, v16

    const/16 v16, 0x0

    move-object/from16 v17, v32

    invoke-static/range {v10 .. v19}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v17

    const-wide/high16 v10, 0x4004000000000000L    # 2.5

    double-to-float v10, v10

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float v17, v10, v11

    const/16 v20, 0x0

    const/16 v21, 0xa

    const/16 v18, 0x0

    move/from16 v19, v17

    move-object/from16 v16, v24

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move-object/from16 v12, v16

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x0

    invoke-static {v14, v15, v13, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    move-object v15, v10

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v13}, Lp1/q;->i0()V

    move/from16 v16, v11

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_e

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_8
    move-object/from16 v11, v36

    goto :goto_9

    :cond_e
    invoke-virtual {v13}, Lp1/q;->s0()V

    goto :goto_8

    :goto_9
    invoke-static {v13, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_10

    :cond_f
    move-object/from16 v10, v37

    goto :goto_a

    :cond_10
    move-object/from16 v10, v37

    goto :goto_b

    :goto_a
    invoke-static {v9, v13, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_b
    invoke-static {v13, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v9, 0x25

    int-to-float v9, v9

    mul-float/2addr v9, v2

    invoke-static {v9, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v13, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lcom/whoop/educationModels/MediaHeader;->getTitle()Ljava/lang/String;

    move-result-object v9

    const/4 v14, 0x0

    invoke-static {v9, v13, v14}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v14, v13, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lb91/d;->P()Lb91/a;

    move-result-object v30

    invoke-virtual {v14, v13, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ly81/i;->y()J

    move-result-wide v17

    sget v19, Lb91/a;->d:I

    shl-int/lit8 v34, v19, 0x12

    const v35, 0x2fffa

    move-object/from16 v36, v11

    const/4 v11, 0x0

    move-object/from16 v19, v14

    move/from16 v20, v15

    const-wide/16 v14, 0x0

    move/from16 v21, v16

    const/16 v16, 0x0

    move-object/from16 v24, v12

    move-object/from16 v32, v13

    move-wide/from16 v12, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v22, v19

    move/from16 v23, v20

    const-wide/16 v19, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    move-object/from16 v28, v24

    const-wide/16 v23, 0x0

    move/from16 v29, v25

    const/16 v25, 0x0

    move-object/from16 v31, v26

    const/16 v26, 0x0

    move/from16 v33, v27

    const/16 v27, 0x0

    move-object/from16 v37, v28

    const/16 v28, 0x0

    move/from16 v40, v29

    const/16 v29, 0x0

    move-object/from16 v41, v31

    const/16 v31, 0x0

    move/from16 v42, v33

    const/16 v33, 0x0

    move-object/from16 v0, v36

    move-object/from16 v36, v5

    move-object v5, v10

    move-object v10, v9

    move-object v9, v0

    move-object/from16 v1, v37

    move-object/from16 v0, v41

    move/from16 v8, v42

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v32

    const/4 v10, 0x3

    int-to-float v10, v10

    invoke-static {v10, v2, v1, v13}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v14, Lb2/e;->K:Lb2/l;

    sget-object v15, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v15, v14, v13, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v14

    move/from16 v18, v11

    move-object/from16 v17, v12

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    move/from16 v37, v2

    move-object/from16 v2, v17

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v13}, Lp1/q;->i0()V

    move/from16 v17, v10

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_11

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v13, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_13

    :cond_12
    invoke-static {v11, v13, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v13, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v2, v15

    const/high16 v11, 0x3f800000    # 1.0f

    float-to-double v14, v11

    const-wide/16 v10, 0x0

    cmpl-double v10, v14, v10

    if-lez v10, :cond_14

    const/4 v15, 0x1

    goto :goto_d

    :cond_14
    const/4 v15, 0x0

    :goto_d
    if-nez v15, :cond_15

    const-string v10, "invalid weight; must be greater than zero"

    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_15
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v12, 0x1

    invoke-direct {v11, v10, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/educationModels/MediaHeader;->getSubText()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_16

    const-string v10, ""

    :cond_16
    const/4 v14, 0x0

    invoke-static {v10, v13, v14}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v13, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->r()Lb91/a;

    move-result-object v30

    const/high16 v12, 0x3f000000    # 0.5f

    invoke-static {v0, v13, v8, v12}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v14

    or-int/lit8 v34, v34, 0x30

    const v35, 0x2f7f8

    move-object/from16 v32, v13

    move-wide v12, v14

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const-wide/16 v23, 0x0

    move/from16 v26, v25

    const/16 v25, 0x2

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v28, v27

    const/16 v27, 0x0

    move/from16 v29, v28

    const/16 v28, 0x0

    move/from16 v31, v29

    const/16 v29, 0x0

    move/from16 v33, v31

    const/16 v31, 0x0

    move/from16 v38, v33

    const/16 v33, 0x0

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v32

    sget-object v10, Lb2/e;->J:Lb2/l;

    const/4 v14, 0x0

    invoke-static {v2, v10, v13, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_17

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_17
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v13, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-nez v2, :cond_18

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    :cond_18
    invoke-static {v10, v13, v10, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v13, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/educationModels/MediaHeader;->getShareEnabled()Z

    move-result v2

    if-eqz v2, :cond_23

    const v2, 0x67a802b3

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/educationModels/MediaHeader;->getShareLink()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1a

    const v2, -0x72a7ac52

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    move-object/from16 v22, v0

    move-object/from16 v24, v1

    move-object/from16 v1, v39

    move-object/from16 v0, p3

    goto/16 :goto_16

    :cond_1a
    const v10, -0x72a7ac51

    invoke-virtual {v13, v10}, Lp1/q;->e0(I)V

    new-instance v10, Lny0/o;

    sget-object v15, Lny0/q$a;->f:Lny0/q$a;

    sget v16, Lgy0/a;->W2:I

    const/16 v25, 0x3fc

    const/16 v26, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object v14, v10

    invoke-direct/range {v14 .. v26}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/educationModels/MediaHeader;->getCtaIcon()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_1c

    mul-float v19, v38, v40

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v24, v16

    if-nez v1, :cond_1b

    goto :goto_f

    :cond_1b
    move-object v12, v1

    goto :goto_10

    :cond_1c
    move-object/from16 v24, v1

    :goto_f
    move-object/from16 v12, v24

    :goto_10
    sget v1, Lie1/c;->e:I

    invoke-static {v13, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    and-int/lit16 v1, v4, 0x1c00

    const/16 v14, 0x800

    if-ne v1, v14, :cond_1d

    const/4 v15, 0x1

    goto :goto_11

    :cond_1d
    const/4 v15, 0x0

    :goto_11
    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v15

    and-int/lit8 v14, v4, 0xe

    const/4 v15, 0x4

    if-eq v14, v15, :cond_20

    and-int/lit8 v14, v4, 0x8

    if-eqz v14, :cond_1e

    move-object/from16 v14, p0

    invoke-virtual {v13, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_1f

    goto :goto_12

    :cond_1e
    move-object/from16 v14, p0

    :cond_1f
    const/4 v15, 0x0

    goto :goto_13

    :cond_20
    move-object/from16 v14, p0

    :goto_12
    const/4 v15, 0x1

    :goto_13
    or-int/2addr v1, v15

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v1, :cond_22

    move-object/from16 v1, v39

    if-ne v15, v1, :cond_21

    goto :goto_14

    :cond_21
    move-object/from16 v22, v0

    move-object/from16 v16, v10

    move-object/from16 v0, p3

    goto :goto_15

    :cond_22
    move-object/from16 v1, v39

    :goto_14
    new-instance v15, Lre1/k;

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v22, v0

    move-object/from16 v0, p3

    invoke-direct {v15, v0, v2, v14, v10}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    check-cast v15, Lc93/a;

    move-object/from16 v10, v16

    sget v16, Lny0/o;->k:I

    const/16 v17, 0x8

    move-object/from16 v32, v13

    const/4 v13, 0x0

    move-object v14, v15

    move-object/from16 v15, v32

    invoke-static/range {v10 .. v17}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v15

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_23
    move-object/from16 v22, v0

    move-object/from16 v24, v1

    move-object/from16 v1, v39

    const/4 v14, 0x0

    move-object/from16 v0, p3

    const v2, -0x729e7072

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/educationModels/MediaHeader;->getPodcastPicker()Lcom/whoop/educationModels/PodcastPicker;

    move-result-object v2

    if-nez v2, :cond_24

    const v1, -0x729d5973

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    move-object/from16 v4, p2

    const/4 v12, 0x1

    goto/16 :goto_1c

    :cond_24
    const v2, -0x729d5972

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    and-int/lit16 v2, v4, 0x380

    const/16 v4, 0x100

    if-ne v2, v4, :cond_25

    const/4 v15, 0x1

    goto :goto_18

    :cond_25
    const/4 v15, 0x0

    :goto_18
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v15, :cond_27

    if-ne v2, v1, :cond_26

    goto :goto_19

    :cond_26
    move-object/from16 v4, p2

    goto :goto_1a

    :cond_27
    :goto_19
    new-instance v2, Lot1/e;

    const/16 v1, 0x18

    move-object/from16 v4, p2

    invoke-direct {v2, v4, v1}, Lot1/e;-><init>(Lc93/a;I)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    move-object/from16 v20, v2

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v24

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "MediaHeaderPlayButton"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v15, v36

    const/4 v14, 0x0

    invoke-static {v15, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_28

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1b

    :cond_28
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1b
    invoke-static {v13, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-nez v2, :cond_29

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2a

    :cond_29
    invoke-static {v10, v13, v10, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2a
    invoke-static {v13, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v22

    invoke-virtual {v1, v13, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->X()J

    move-result-wide v2

    const v5, 0x3e19999a    # 0.15f

    invoke-static {v5, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v10

    invoke-virtual {v1, v13, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X()J

    move-result-wide v1

    sget v14, Lie1/b;->c:I

    mul-float v15, v40, v37

    const/16 v17, 0xc00

    const/16 v18, 0x0

    move-object/from16 v16, v13

    move-wide v12, v1

    invoke-static/range {v10 .. v18}, Lp21/e;->x(JJIFLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v16

    const/4 v12, 0x1

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    :goto_1c
    invoke-static {v13, v12, v12, v12, v12}, Lb9/y;->B(Lp1/q;ZZZZ)V

    goto :goto_1d

    :cond_2b
    move-object v4, v0

    move-object v0, v8

    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_1d
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_2c

    new-instance v0, Lr90/b;

    const/4 v6, 0x2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move-object v3, v4

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v6}, Lr90/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_2c
    return-void
.end method

.method private static final g(Lf2/d;)Lf2/g;
    .locals 5

    const-string v0, "$this$drawWithCache"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xff101518L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0xe

    invoke-static {v0, v1, v2, v2, v3}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    new-instance v1, Lnq2/c;

    const/4 v2, 0x4

    invoke-direct {v1, v0, v2}, Lnq2/c;-><init>(Li2/k0;I)V

    invoke-virtual {p0, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Li2/t;Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    const/4 v9, 0x0

    const/16 v10, 0x7e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lc93/m;Ljava/lang/String;Lcom/whoop/educationModels/MediaHeader;)Ll83/a0;
    .locals 0

    invoke-virtual {p2}, Lcom/whoop/educationModels/MediaHeader;->getTitle()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/educationModels/MediaHeader;Lf0/r1;Lc93/a;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lre1/l;->f(Lcom/whoop/educationModels/MediaHeader;Lf0/r1;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
