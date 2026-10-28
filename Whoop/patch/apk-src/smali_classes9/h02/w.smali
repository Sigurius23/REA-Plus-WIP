.class public abstract Lh02/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lh02/x;",
        "state",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lh02/x;Landroidx/compose/runtime/Composer;II)V",
        "native-store_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lh02/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lh02/w;->c(Landroidx/compose/ui/Modifier;Lh02/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lh02/x;Landroidx/compose/runtime/Composer;II)V
    .locals 57

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v0, 0x4271dcfe

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v6, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    or-int v5, p3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p3

    :goto_1
    and-int/lit8 v7, p3, 0x30

    const/16 v29, 0x20

    if-nez v7, :cond_4

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move/from16 v7, v29

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_4
    and-int/lit8 v7, v5, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_5

    move v7, v10

    goto :goto_3

    :cond_5
    move v7, v9

    :goto_3
    and-int/2addr v5, v10

    invoke-virtual {v6, v5, v7}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_30

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v5

    goto :goto_4

    :cond_6
    move-object v0, v4

    :goto_4
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v11, v3

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v13, v11, v12

    invoke-static {v13}, Ll0/m;->i(F)Ll0/k;

    move-result-object v13

    sget-object v14, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x6

    invoke-static {v13, v14, v6, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    move/from16 v16, v8

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_7

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v6, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v6, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    invoke-static {v3, v6, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lh02/x;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_a

    const v3, -0x4ccecfb5

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lh02/x;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v6, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v4, v6, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->P()Lb91/a;

    move-result-object v23

    invoke-virtual {v4, v6, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->w()J

    move-result-wide v7

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v27, v4, 0x12

    const v28, 0x2fffa

    const/4 v4, 0x0

    move-object v13, v5

    move-object/from16 v25, v6

    move-wide v5, v7

    const-wide/16 v7, 0x0

    move v14, v9

    const/4 v9, 0x0

    move/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    move-object/from16 v20, v13

    const-wide/16 v12, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v24, v16

    move/from16 v26, v17

    const-wide/16 v16, 0x0

    move/from16 v30, v18

    const/16 v18, 0x0

    move/from16 v31, v19

    const/16 v19, 0x0

    move-object/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v24

    const/16 v24, 0x0

    move/from16 v36, v26

    const/16 v26, 0x0

    move-object/from16 v2, v32

    move/from16 v1, v33

    move-object/from16 v32, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    move-object/from16 v32, v0

    move-object v2, v5

    move v1, v9

    move/from16 v30, v11

    move/from16 v31, v12

    move/from16 v34, v15

    move/from16 v35, v16

    const/high16 v0, 0x3f800000    # 1.0f

    const v3, -0x4ccbccf2

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    :goto_6
    const v3, -0x4cccbe85

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lh02/x;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v33

    :goto_7
    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lh02/u;

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v14, 0x1

    int-to-float v4, v14

    mul-float v4, v4, v31

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/16 v7, 0x36

    invoke-static {v4, v5, v6, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-eqz v9, :cond_b

    invoke-virtual {v6, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_8
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v6, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v6, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-nez v7, :cond_c

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    :cond_c
    invoke-static {v5, v6, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v6, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v15, 0x4

    int-to-float v3, v15

    mul-float v11, v30, v3

    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v13}, Lh02/u;->a()Lkd1/o;

    move-result-object v3

    sget v7, Lkd1/o;->a:I

    const/4 v8, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v3

    move-object/from16 v25, v6

    const/16 v11, 0x1b0

    const/16 v12, 0x78

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v9

    const/4 v9, 0x0

    move-object/from16 v10, v25

    invoke-static/range {v3 .. v12}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v10

    invoke-virtual {v13}, Lh02/u;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v6, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v6, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v4, v6, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->w()J

    move-result-wide v4

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v27, v7, 0x12

    const v28, 0x2fffa

    move-object/from16 v25, v6

    move-wide v5, v4

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v37, v15

    const/4 v15, 0x0

    move/from16 v36, v17

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move/from16 v0, v36

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    goto/16 :goto_7

    :cond_e
    const/4 v0, 0x1

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lh02/x;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2f

    const v2, -0x4cbfc224

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lh02/x;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_f

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_2e

    :cond_f
    sget v2, Ll3/g;->E:I

    invoke-virtual/range {p1 .. p1}, Lh02/x;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "<ContentHandlerReplacementTag />"

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x3f

    sget-object v4, Ll3/s;->a:Ll3/q;

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v4}, Landroid/text/Html;->fromHtml(Ljava/lang/String;ILandroid/text/Html$ImageGetter;Landroid/text/Html$TagHandler;)Landroid/text/Spanned;

    move-result-object v2

    new-instance v3, Ll3/d;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-direct {v3, v4}, Ll3/d;-><init>(I)V

    instance-of v4, v2, Ll3/g;

    iget-object v7, v3, Ll3/d;->w:Ljava/lang/StringBuilder;

    if-eqz v4, :cond_10

    move-object v4, v2

    check-cast v4, Ll3/g;

    invoke-virtual {v3, v4}, Ll3/d;->c(Ll3/g;)V

    goto :goto_9

    :cond_10
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    :goto_9
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    const-class v7, Ljava/lang/Object;

    invoke-interface {v2, v1, v4, v7}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v4

    array-length v7, v4

    move v9, v1

    :goto_a
    if-ge v9, v7, :cond_2d

    aget-object v8, v4, v9

    invoke-interface {v2, v8}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v10

    invoke-interface {v2, v8}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v11

    invoke-static {v10, v11}, Lj93/l0;->f(II)J

    move-result-wide v10

    sget v12, Ll3/u0;->c:I

    shr-long v12, v10, v29

    long-to-int v12, v12

    const-wide v13, 0xffffffffL

    and-long/2addr v10, v13

    long-to-int v10, v10

    instance-of v11, v8, Landroid/text/style/AbsoluteSizeSpan;

    if-nez v11, :cond_19

    instance-of v11, v8, Landroid/text/style/AlignmentSpan;

    iget-object v13, v3, Ll3/d;->y:Ljava/util/ArrayList;

    const/4 v15, 0x3

    if-eqz v11, :cond_15

    check-cast v8, Landroid/text/style/AlignmentSpan;

    invoke-interface {v8}, Landroid/text/style/AlignmentSpan;->getAlignment()Landroid/text/Layout$Alignment;

    move-result-object v8

    if-nez v8, :cond_11

    const/4 v8, -0x1

    goto :goto_b

    :cond_11
    sget-object v11, Ll3/r;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v11, v8

    :goto_b
    if-eq v8, v0, :cond_13

    const/4 v11, 0x2

    if-eq v8, v11, :cond_14

    if-eq v8, v15, :cond_12

    const/high16 v15, -0x80000000

    goto :goto_c

    :cond_12
    move/from16 v15, v34

    goto :goto_c

    :cond_13
    const/4 v11, 0x2

    const/4 v15, 0x5

    :cond_14
    :goto_c
    new-instance v8, Ll3/b0;

    const/16 v14, 0x1fe

    invoke-direct {v8, v15, v5, v14}, Ll3/b0;-><init>(ILw3/q;I)V

    new-instance v14, Ll3/c;

    const/4 v15, 0x0

    const/16 v18, 0x8

    move-object/from16 v19, v8

    move/from16 v17, v10

    move/from16 v16, v12

    invoke-direct/range {v14 .. v19}, Ll3/c;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_14

    :cond_15
    move v11, v12

    move v12, v10

    move v10, v11

    const/4 v11, 0x2

    instance-of v14, v8, Ll3/j;

    if-eqz v14, :cond_17

    check-cast v8, Ll3/j;

    iget-object v14, v8, Ll3/j;->a:Ljava/lang/String;

    iget-object v8, v8, Ll3/j;->b:Ljava/lang/String;

    new-instance v15, Ll3/c;

    new-instance v5, Ll3/o0;

    invoke-direct {v5, v8}, Ll3/o0;-><init>(Ljava/lang/String;)V

    invoke-direct {v15, v10, v12, v5, v14}, Ll3/c;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    :goto_d
    const/4 v5, 0x0

    goto/16 :goto_14

    :cond_17
    instance-of v5, v8, Landroid/text/style/BackgroundColorSpan;

    if-eqz v5, :cond_18

    new-instance v35, Ll3/m0;

    check-cast v8, Landroid/text/style/BackgroundColorSpan;

    invoke-virtual {v8}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    move-result v5

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v50

    const/16 v53, 0x0

    const v54, 0xf7ff

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v52, 0x0

    invoke-direct/range {v35 .. v54}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v35

    invoke-virtual {v3, v5, v10, v12}, Ll3/d;->a(Ll3/m0;II)V

    goto :goto_d

    :cond_18
    instance-of v5, v8, Ll3/m;

    if-eqz v5, :cond_1a

    sget-wide v14, Ll3/l;->d:J

    check-cast v8, Ll3/m;

    iget v5, v8, Ll3/m;->b:I

    invoke-static {v14, v15}, Lv63/c;->a(J)V

    const-wide v16, 0xff00000000L

    move/from16 v18, v12

    and-long v11, v14, v16

    invoke-static {v14, v15}, Ly3/o;->c(J)F

    move-result v14

    int-to-float v5, v5

    mul-float/2addr v14, v5

    invoke-static {v14, v11, v12}, Lv63/c;->j(FJ)J

    move-result-wide v11

    iget-object v5, v8, Ll3/m;->a:Ll3/l;

    new-instance v8, Ll3/b0;

    new-instance v14, Lw3/q;

    invoke-direct {v14, v11, v12, v11, v12}, Lw3/q;-><init>(JJ)V

    const/16 v11, 0x1f7

    invoke-direct {v8, v1, v14, v11}, Ll3/b0;-><init>(ILw3/q;I)V

    new-instance v14, Ll3/c;

    const/4 v15, 0x0

    move/from16 v17, v18

    const/16 v18, 0x8

    move-object/from16 v19, v8

    move/from16 v16, v10

    invoke-direct/range {v14 .. v19}, Ll3/c;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v14, Ll3/c;

    move-object/from16 v19, v5

    invoke-direct/range {v14 .. v19}, Ll3/c;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_e
    const/4 v5, 0x0

    :cond_19
    const/4 v11, 0x2

    goto/16 :goto_14

    :cond_1a
    instance-of v5, v8, Landroid/text/style/ForegroundColorSpan;

    if-eqz v5, :cond_1b

    new-instance v35, Ll3/m0;

    check-cast v8, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {v8}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    move-result v5

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v36

    const/16 v53, 0x0

    const v54, 0xfffe

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    invoke-direct/range {v35 .. v54}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v35

    invoke-virtual {v3, v5, v10, v12}, Ll3/d;->a(Ll3/m0;II)V

    goto :goto_e

    :cond_1b
    instance-of v5, v8, Landroid/text/style/RelativeSizeSpan;

    if-eqz v5, :cond_1c

    new-instance v35, Ll3/m0;

    check-cast v8, Landroid/text/style/RelativeSizeSpan;

    invoke-virtual {v8}, Landroid/text/style/RelativeSizeSpan;->getSizeChange()F

    move-result v5

    const-wide v13, 0x200000000L

    invoke-static {v5, v13, v14}, Lv63/c;->j(FJ)J

    move-result-wide v38

    const/16 v53, 0x0

    const v54, 0xfffd

    const-wide/16 v36, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    invoke-direct/range {v35 .. v54}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v35

    invoke-virtual {v3, v5, v10, v12}, Ll3/d;->a(Ll3/m0;II)V

    goto :goto_e

    :cond_1c
    instance-of v5, v8, Landroid/text/style/StrikethroughSpan;

    if-eqz v5, :cond_1d

    new-instance v35, Ll3/m0;

    const/16 v53, 0x0

    const v54, 0xefff

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    sget-object v52, Lw3/l;->d:Lw3/l;

    invoke-direct/range {v35 .. v54}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v35

    invoke-virtual {v3, v5, v10, v12}, Ll3/d;->a(Ll3/m0;II)V

    goto/16 :goto_e

    :cond_1d
    instance-of v5, v8, Landroid/text/style/StyleSpan;

    if-eqz v5, :cond_21

    check-cast v8, Landroid/text/style/StyleSpan;

    invoke-virtual {v8}, Landroid/text/style/StyleSpan;->getStyle()I

    move-result v5

    if-eq v5, v0, :cond_20

    const/4 v11, 0x2

    if-eq v5, v11, :cond_1f

    if-eq v5, v15, :cond_1e

    const/4 v5, 0x0

    goto/16 :goto_f

    :cond_1e
    new-instance v35, Ll3/m0;

    sget-object v40, Lp3/r;->I:Lp3/r;

    new-instance v5, Lp3/n;

    invoke-direct {v5, v0}, Lp3/n;-><init>(I)V

    const/16 v53, 0x0

    const v54, 0xfff3

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    move-object/from16 v41, v5

    invoke-direct/range {v35 .. v54}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v35

    goto :goto_f

    :cond_1f
    new-instance v36, Ll3/m0;

    new-instance v5, Lp3/n;

    invoke-direct {v5, v0}, Lp3/n;-><init>(I)V

    const/16 v54, 0x0

    const v55, 0xfff7

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const-wide/16 v51, 0x0

    const/16 v53, 0x0

    move-object/from16 v42, v5

    invoke-direct/range {v36 .. v55}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v36

    goto :goto_f

    :cond_20
    const/4 v11, 0x2

    new-instance v37, Ll3/m0;

    sget-object v42, Lp3/r;->I:Lp3/r;

    const/16 v55, 0x0

    const v56, 0xfffb

    const-wide/16 v38, 0x0

    const-wide/16 v40, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const-wide/16 v52, 0x0

    const/16 v54, 0x0

    invoke-direct/range {v37 .. v56}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v37

    :goto_f
    if-eqz v5, :cond_16

    invoke-virtual {v3, v5, v10, v12}, Ll3/d;->a(Ll3/m0;II)V

    goto/16 :goto_d

    :cond_21
    const/4 v11, 0x2

    instance-of v5, v8, Landroid/text/style/SubscriptSpan;

    if-eqz v5, :cond_22

    new-instance v35, Ll3/m0;

    new-instance v5, Lw3/a;

    const/high16 v8, -0x41000000    # -0.5f

    invoke-direct {v5, v8}, Lw3/a;-><init>(F)V

    const/16 v53, 0x0

    const v54, 0xfeff

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    move-object/from16 v47, v5

    invoke-direct/range {v35 .. v54}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v35

    invoke-virtual {v3, v5, v10, v12}, Ll3/d;->a(Ll3/m0;II)V

    goto/16 :goto_d

    :cond_22
    instance-of v5, v8, Landroid/text/style/SuperscriptSpan;

    if-eqz v5, :cond_23

    new-instance v35, Ll3/m0;

    new-instance v5, Lw3/a;

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct {v5, v8}, Lw3/a;-><init>(F)V

    const/16 v53, 0x0

    const v54, 0xfeff

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    move-object/from16 v47, v5

    invoke-direct/range {v35 .. v54}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v35

    invoke-virtual {v3, v5, v10, v12}, Ll3/d;->a(Ll3/m0;II)V

    goto/16 :goto_d

    :cond_23
    instance-of v5, v8, Landroid/text/style/TypefaceSpan;

    if-eqz v5, :cond_2b

    check-cast v8, Landroid/text/style/TypefaceSpan;

    invoke-virtual {v8}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    move-result-object v5

    const-string v13, "cursive"

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_24

    sget-object v5, Lp3/i;->E:Lp3/t;

    :goto_10
    move-object/from16 v43, v5

    goto :goto_13

    :cond_24
    const-string v13, "monospace"

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_25

    sget-object v5, Lp3/i;->z:Lp3/t;

    goto :goto_10

    :cond_25
    const-string v13, "sans-serif"

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_26

    sget-object v5, Lp3/i;->x:Lp3/t;

    goto :goto_10

    :cond_26
    const-string v13, "serif"

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_27

    sget-object v5, Lp3/i;->y:Lp3/t;

    goto :goto_10

    :cond_27
    invoke-virtual {v8}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2a

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_28

    goto :goto_12

    :cond_28
    invoke-static {v5, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v5

    sget-object v8, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_29

    invoke-static {v8, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_29

    goto :goto_11

    :cond_29
    const/4 v5, 0x0

    :goto_11
    if-eqz v5, :cond_2a

    new-instance v8, Lq30/u0;

    const/16 v13, 0x14

    invoke-direct {v8, v5, v13}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    new-instance v5, Lp3/u;

    invoke-direct {v5, v8}, Lp3/u;-><init>(Lq30/u0;)V

    goto :goto_10

    :cond_2a
    :goto_12
    const/4 v5, 0x0

    goto :goto_10

    :goto_13
    new-instance v35, Ll3/m0;

    const/16 v53, 0x0

    const v54, 0xffdf

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    invoke-direct/range {v35 .. v54}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v35

    invoke-virtual {v3, v5, v10, v12}, Ll3/d;->a(Ll3/m0;II)V

    goto/16 :goto_d

    :cond_2b
    instance-of v5, v8, Landroid/text/style/UnderlineSpan;

    if-eqz v5, :cond_2c

    new-instance v35, Ll3/m0;

    const/16 v53, 0x0

    const v54, 0xefff

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    sget-object v52, Lw3/l;->c:Lw3/l;

    invoke-direct/range {v35 .. v54}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v35

    invoke-virtual {v3, v5, v10, v12}, Ll3/d;->a(Ll3/m0;II)V

    goto/16 :goto_d

    :cond_2c
    instance-of v5, v8, Landroid/text/style/URLSpan;

    if-eqz v5, :cond_16

    check-cast v8, Landroid/text/style/URLSpan;

    invoke-virtual {v8}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_16

    new-instance v8, Ll3/u;

    const/4 v14, 0x0

    invoke-direct {v8, v5, v14, v14}, Ll3/u;-><init>(Ljava/lang/String;Ll3/s0;Li20/z0;)V

    move-object v5, v14

    new-instance v14, Ll3/c;

    const/4 v15, 0x0

    const/16 v18, 0x8

    move-object/from16 v19, v8

    move/from16 v16, v10

    move/from16 v17, v12

    invoke-direct/range {v14 .. v19}, Ll3/c;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_14
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_a

    :cond_2d
    invoke-virtual {v3}, Ll3/d;->k()Ll3/g;

    move-result-object v3

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v3, Ll3/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-static {v2, v6, v4}, Lte0/d;->t(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v24

    invoke-virtual {v2, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->w()J

    move-result-wide v4

    const/16 v27, 0x0

    const v28, 0x1fffa

    move-object/from16 v25, v6

    move-wide v5, v4

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    invoke-static/range {v3 .. v28}, Lg1/f9;->c(Ll3/g;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_2f
    const v2, -0x4cb964f2

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, v32

    goto :goto_16

    :cond_30
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v1, v4

    :goto_16
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_31

    new-instance v0, Lfc0/e;

    const/16 v5, 0xb

    move-object/from16 v2, p1

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_31
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lh02/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lh02/w;->b(Landroidx/compose/ui/Modifier;Lh02/x;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
