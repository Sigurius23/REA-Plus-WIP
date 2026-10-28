.class public abstract Lzc1/s8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/s8;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 47

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x5e96891c

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/lit8 v4, p1, 0x1

    invoke-virtual {v1, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x4

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, v1, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v1, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v1, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v1, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v1, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v3, "Single value with background"

    const/4 v5, 0x6

    invoke-static {v3, v1, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v3, "12%"

    move-object/from16 v16, v1

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v5, v3

    sget-object v3, Lhy0/b2;->POSITIVE:Lhy0/b2;

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/lit16 v6, v6, 0x1b0

    const/16 v18, 0x0

    const/16 v19, 0x7ff8

    move v7, v2

    const/4 v2, 0x1

    move-object v8, v4

    const/4 v4, 0x0

    move-object v9, v5

    const/4 v5, 0x0

    move/from16 v17, v6

    const/4 v6, 0x0

    move v10, v7

    const/4 v7, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move v13, v10

    const/4 v10, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move-object/from16 v23, v21

    move-object/from16 v0, v22

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v21, v3

    move-object/from16 v1, v16

    const/16 v2, 0xa

    int-to-float v2, v2

    move-object v4, v1

    move-object/from16 v3, v23

    invoke-static {v3, v2, v4, v0}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v14, v3

    sget-object v3, Lhy0/b2;->NEGATIVE:Lhy0/b2;

    move v5, v2

    const/4 v2, 0x1

    move-object/from16 v16, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v23, v14

    const/4 v14, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v24, v22

    move-object/from16 v25, v23

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v22, v3

    move-object/from16 v1, v16

    move/from16 v2, v24

    move-object/from16 v3, v25

    invoke-static {v3, v2, v1, v0}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v14, v3

    sget-object v3, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    move v5, v2

    const/4 v2, 0x1

    move-object v1, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v23, v14

    const/4 v14, 0x0

    move/from16 v24, v15

    const/4 v15, 0x0

    move-object/from16 v27, v23

    move/from16 v26, v24

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v23, v3

    move-object/from16 v1, v16

    move/from16 v2, v26

    move-object/from16 v3, v27

    invoke-static {v3, v2, v1, v0}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v14, v3

    sget-object v3, Lhy0/b2;->POSITIVE_WITH_COLOR:Lhy0/b2;

    move v5, v2

    const/4 v2, 0x1

    move-object v1, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move/from16 v24, v15

    const/4 v15, 0x0

    move/from16 v28, v24

    move-object/from16 v29, v25

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move/from16 v2, v28

    move-object/from16 v3, v29

    invoke-static {v3, v2, v1, v0}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v14, v3

    sget-object v3, Lhy0/b2;->NEGATIVE_WITH_COLOR:Lhy0/b2;

    move v5, v2

    const/4 v2, 0x1

    move-object v1, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move/from16 v24, v15

    const/4 v15, 0x0

    move/from16 v30, v24

    move-object/from16 v31, v25

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move/from16 v2, v30

    move-object/from16 v3, v31

    invoke-static {v3, v2, v1, v0}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v14, v3

    sget-object v3, Lhy0/b2;->POSITIVE_GREEN:Lhy0/b2;

    move v5, v2

    const/4 v2, 0x1

    move-object v1, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move/from16 v24, v15

    const/4 v15, 0x0

    move/from16 v32, v24

    move-object/from16 v33, v25

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move/from16 v2, v32

    move-object/from16 v3, v33

    invoke-static {v3, v2, v1, v0}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v14, v3

    sget-object v3, Lhy0/b2;->NEGATIVE_YELLOW:Lhy0/b2;

    move v5, v2

    const/4 v2, 0x1

    move-object v1, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move/from16 v24, v15

    const/4 v15, 0x0

    move-object/from16 v26, v0

    move/from16 v0, v24

    move-object/from16 v34, v25

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move-object/from16 v2, v34

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v3, "Range value with background"

    const/4 v4, 0x6

    invoke-static {v3, v1, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v3, "within 94-95%"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v4, v3

    sget-object v3, Lhy0/b2;->POSITIVE_RANGE:Lhy0/b2;

    move-object v14, v2

    const/4 v2, 0x1

    move-object v5, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move-object/from16 v24, v15

    const/4 v15, 0x0

    move-object/from16 v35, v24

    move-object/from16 v36, v25

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v24, v3

    move-object/from16 v1, v16

    move-object/from16 v2, v35

    move-object/from16 v3, v36

    invoke-static {v3, v0, v1, v2}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v14, v3

    sget-object v3, Lhy0/b2;->CONCERN_RANGE:Lhy0/b2;

    const/4 v2, 0x1

    move-object v1, v4

    const/4 v4, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move-object/from16 v38, v25

    move-object/from16 v37, v35

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v25, v3

    move-object/from16 v1, v16

    move-object/from16 v2, v37

    move-object/from16 v3, v38

    invoke-static {v3, v0, v1, v2}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v14, v3

    sget-object v3, Lhy0/b2;->ALERT_RANGE:Lhy0/b2;

    move-object/from16 v35, v2

    const/4 v2, 0x1

    move-object v1, v4

    const/4 v4, 0x0

    move-object/from16 v31, v14

    const/4 v14, 0x0

    move-object/from16 v39, v31

    move-object/from16 v37, v35

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v27, v3

    move-object/from16 v1, v16

    move-object/from16 v2, v39

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v3, "Single value without background"

    const/4 v4, 0x6

    invoke-static {v3, v1, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v14, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v3, v14

    const/4 v14, 0x0

    move-object/from16 v40, v3

    move-object/from16 v3, v21

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move-object/from16 v2, v26

    move-object/from16 v3, v40

    invoke-static {v3, v0, v1, v2}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v15, v2

    const/4 v2, 0x0

    move-object v1, v4

    const/4 v4, 0x0

    move-object/from16 v26, v15

    const/4 v15, 0x0

    move-object/from16 v42, v3

    move-object/from16 v3, v22

    move-object/from16 v41, v26

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move-object/from16 v15, v41

    move-object/from16 v2, v42

    invoke-static {v2, v0, v1, v15}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move-object v14, v2

    const/4 v2, 0x0

    move-object/from16 v31, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v1, v3

    move-object/from16 v3, v23

    move-object/from16 v43, v31

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move-object/from16 v2, v43

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v3, "Range value without background"

    const/4 v4, 0x6

    invoke-static {v3, v1, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v14, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v3, v14

    const/4 v14, 0x0

    move-object/from16 v44, v3

    move-object/from16 v3, v24

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move-object/from16 v2, v37

    move-object/from16 v3, v44

    invoke-static {v3, v0, v1, v2}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object/from16 v35, v2

    const/4 v2, 0x0

    move-object v1, v4

    const/4 v4, 0x0

    move-object/from16 v46, v3

    move-object/from16 v3, v25

    move-object/from16 v45, v35

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    move-object/from16 v2, v45

    move-object/from16 v14, v46

    invoke-static {v14, v0, v1, v2}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v14, 0x0

    move-object/from16 v3, v27

    move-object v1, v0

    invoke-static/range {v1 .. v19}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v16

    const/4 v7, 0x1

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Lzc1/t7;

    const/16 v2, 0x1a

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/t7;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/s8;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
