.class public abstract Lx21/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0097\u0001\u0010\u0011\u001a\u00020\t2\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00082\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00002\u0016\u0008\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0008H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001ak\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00082\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\u00062\u0016\u0008\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0008H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018\u00b2\u0006\u000e\u0010\u0017\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "textResource",
        "",
        "currentValue",
        "minimumValue",
        "maximumValue",
        "",
        "isButtonEnabled",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onNumberChanged",
        "onSavedClicked",
        "updateValue",
        "showButton",
        "trailingText",
        "",
        "formatter",
        "i",
        "(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "Lx21/a;",
        "pickerState",
        "k",
        "(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "selectedNumber",
        "design_release"
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
.method public static synthetic a(ILkotlin/jvm/functions/Function1;)Ljava/lang/String;
    .locals 0

    invoke-static {p1, p0}, Lx21/d;->p(Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p1, p0}, Lx21/d;->q(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lx21/d;->t(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;Landroid/content/Context;)Landroid/widget/NumberPicker;
    .locals 0

    invoke-static/range {p0 .. p5}, Lx21/d;->n(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;Landroid/content/Context;)Landroid/widget/NumberPicker;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lp1/c1;Landroid/widget/NumberPicker;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lx21/d;->o(Lkotlin/jvm/functions/Function1;Lp1/c1;Landroid/widget/NumberPicker;II)V

    return-void
.end method

.method public static synthetic f(Lx21/a;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lx21/d;->s(Lx21/a;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(ZLx21/a;Landroid/widget/NumberPicker;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lx21/d;->r(ZLx21/a;Landroid/widget/NumberPicker;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p15}, Lx21/d;->j(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "IIIZ",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "ZZ",
            "Lcom/whoop/design/util/TextResource;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move/from16 v12, p12

    move/from16 v14, p14

    const-string v0, "onNumberChanged"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSavedClicked"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p11

    check-cast v6, Lp1/q;

    const v0, 0x4223a7ce

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v12, 0x6

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v12

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    move v5, v12

    :goto_1
    and-int/lit8 v7, v12, 0x30

    if-nez v7, :cond_3

    move/from16 v7, p1

    invoke-virtual {v6, v7}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    goto :goto_3

    :cond_3
    move/from16 v7, p1

    :goto_3
    and-int/lit16 v8, v12, 0x180

    if-nez v8, :cond_5

    move/from16 v8, p2

    invoke-virtual {v6, v8}, Lp1/q;->e(I)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_4

    :cond_4
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v5, v9

    goto :goto_5

    :cond_5
    move/from16 v8, p2

    :goto_5
    and-int/lit16 v9, v12, 0xc00

    if-nez v9, :cond_7

    move/from16 v9, p3

    invoke-virtual {v6, v9}, Lp1/q;->e(I)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_6

    :cond_6
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v5, v10

    goto :goto_7

    :cond_7
    move/from16 v9, p3

    :goto_7
    and-int/lit16 v10, v12, 0x6000

    if-nez v10, :cond_9

    move/from16 v10, p4

    invoke-virtual {v6, v10}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_8

    :cond_8
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v5, v11

    goto :goto_9

    :cond_9
    move/from16 v10, p4

    :goto_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v12

    if-nez v11, :cond_b

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/high16 v11, 0x20000

    goto :goto_a

    :cond_a
    const/high16 v11, 0x10000

    :goto_a
    or-int/2addr v5, v11

    :cond_b
    const/high16 v11, 0x180000

    and-int/2addr v11, v12

    if-nez v11, :cond_d

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x100000

    goto :goto_b

    :cond_c
    const/high16 v11, 0x80000

    :goto_b
    or-int/2addr v5, v11

    :cond_d
    and-int/lit16 v11, v14, 0x80

    const/high16 v13, 0xc00000

    if-eqz v11, :cond_f

    or-int/2addr v5, v13

    :cond_e
    move/from16 v13, p7

    goto :goto_d

    :cond_f
    and-int/2addr v13, v12

    if-nez v13, :cond_e

    move/from16 v13, p7

    invoke-virtual {v6, v13}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x800000

    goto :goto_c

    :cond_10
    const/high16 v15, 0x400000

    :goto_c
    or-int/2addr v5, v15

    :goto_d
    and-int/lit16 v15, v14, 0x100

    const/high16 v16, 0x6000000

    if-eqz v15, :cond_11

    or-int v5, v5, v16

    move/from16 v3, p8

    goto :goto_f

    :cond_11
    and-int v16, v12, v16

    move/from16 v3, p8

    if-nez v16, :cond_13

    invoke-virtual {v6, v3}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x4000000

    goto :goto_e

    :cond_12
    const/high16 v16, 0x2000000

    :goto_e
    or-int v5, v5, v16

    :cond_13
    :goto_f
    const/high16 v16, 0x30000000

    and-int v16, v12, v16

    if-nez v16, :cond_16

    and-int/lit16 v4, v14, 0x200

    if-nez v4, :cond_14

    move-object/from16 v4, p9

    invoke-virtual {v6, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_15

    const/high16 v17, 0x20000000

    goto :goto_10

    :cond_14
    move-object/from16 v4, p9

    :cond_15
    const/high16 v17, 0x10000000

    :goto_10
    or-int v5, v5, v17

    goto :goto_11

    :cond_16
    move-object/from16 v4, p9

    :goto_11
    and-int/lit16 v0, v14, 0x400

    if-eqz v0, :cond_17

    or-int/lit8 v17, p13, 0x6

    move/from16 v22, v17

    move/from16 v17, v0

    move-object/from16 v0, p10

    goto :goto_13

    :cond_17
    and-int/lit8 v17, p13, 0x6

    if-nez v17, :cond_19

    move/from16 v17, v0

    move-object/from16 v0, p10

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_18

    const/16 v18, 0x4

    goto :goto_12

    :cond_18
    const/16 v18, 0x2

    :goto_12
    or-int v18, p13, v18

    move/from16 v22, v18

    goto :goto_13

    :cond_19
    move/from16 v17, v0

    move-object/from16 v0, p10

    move/from16 v22, p13

    :goto_13
    const v18, 0x12492493

    and-int v0, v5, v18

    const v1, 0x12492492

    const/16 v18, 0x0

    const/16 v19, 0x1

    if-ne v0, v1, :cond_1b

    and-int/lit8 v0, v22, 0x3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1a

    goto :goto_14

    :cond_1a
    move/from16 v0, v18

    goto :goto_15

    :cond_1b
    :goto_14
    move/from16 v0, v19

    :goto_15
    and-int/lit8 v1, v5, 0x1

    invoke-virtual {v6, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-virtual {v6}, Lp1/q;->Z()V

    and-int/lit8 v0, v12, 0x1

    const v1, -0x70000001

    if-eqz v0, :cond_1e

    invoke-virtual {v6}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_16

    :cond_1c
    invoke-virtual {v6}, Lp1/q;->X()V

    and-int/lit16 v0, v14, 0x200

    if-eqz v0, :cond_1d

    and-int/2addr v5, v1

    :cond_1d
    move-object/from16 v21, v4

    move v0, v5

    move-object/from16 v5, p10

    move v4, v3

    move v3, v13

    goto :goto_19

    :cond_1e
    :goto_16
    if-eqz v11, :cond_1f

    goto :goto_17

    :cond_1f
    move/from16 v18, v13

    :goto_17
    if-eqz v15, :cond_20

    goto :goto_18

    :cond_20
    move/from16 v19, v3

    :goto_18
    and-int/lit16 v0, v14, 0x200

    if-eqz v0, :cond_21

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    and-int/2addr v5, v1

    move-object v4, v0

    :cond_21
    if-eqz v17, :cond_22

    const/4 v0, 0x0

    move v3, v5

    move-object v5, v0

    move v0, v3

    move-object/from16 v21, v4

    move/from16 v3, v18

    move/from16 v4, v19

    goto :goto_19

    :cond_22
    move-object/from16 v21, v4

    move v0, v5

    move/from16 v3, v18

    move/from16 v4, v19

    move-object/from16 v5, p10

    :goto_19
    invoke-virtual {v6}, Lp1/q;->r()V

    sget-object v15, Lx21/a;->g:Lx21/a$a;

    move-object/from16 v16, p0

    move/from16 v17, v7

    move/from16 v18, v8

    move/from16 v19, v9

    move/from16 v20, v10

    invoke-virtual/range {v15 .. v21}, Lx21/a$a;->a(Lcom/whoop/design/util/TextResource;IIIZLcom/whoop/design/util/TextResource;)Lx21/a;

    move-result-object v1

    shr-int/lit8 v0, v0, 0xc

    const v7, 0xfff0

    and-int/2addr v0, v7

    shl-int/lit8 v7, v22, 0xf

    const/high16 v8, 0x70000

    and-int/2addr v7, v8

    or-int/2addr v7, v0

    const/4 v8, 0x0

    move-object v0, v1

    move-object/from16 v1, p5

    invoke-static/range {v0 .. v8}, Lx21/d;->k(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v8, v3

    move v9, v4

    move-object v11, v5

    move-object/from16 v10, v21

    goto :goto_1a

    :cond_23
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object/from16 v11, p10

    move v9, v3

    move-object v10, v4

    move v8, v13

    :goto_1a
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_24

    new-instance v0, Lx21/b;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v13, p13

    invoke-direct/range {v0 .. v14}, Lx21/b;-><init>(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method private static final j(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v13

    invoke-static/range {p12 .. p12}, Lp1/x;->L(I)I

    move-result v14

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v15, p13

    move-object/from16 v12, p14

    invoke-static/range {v1 .. v15}, Lx21/d;->i(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx21/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v7, p2

    move/from16 v8, p7

    move-object/from16 v3, p6

    check-cast v3, Lp1/q;

    const v0, 0x6c3f674e

    invoke-virtual {v3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v3, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    goto :goto_3

    :cond_3
    move-object/from16 v4, p1

    :goto_3
    and-int/lit16 v6, v8, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_4

    :cond_4
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :cond_5
    and-int/lit8 v6, p8, 0x8

    if-eqz v6, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move/from16 v11, p3

    goto :goto_6

    :cond_7
    and-int/lit16 v11, v8, 0xc00

    if-nez v11, :cond_6

    move/from16 v11, p3

    invoke-virtual {v3, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x800

    goto :goto_5

    :cond_8
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v0, v12

    :goto_6
    and-int/lit8 v12, p8, 0x10

    if-eqz v12, :cond_a

    or-int/lit16 v0, v0, 0x6000

    :cond_9
    move/from16 v13, p4

    goto :goto_8

    :cond_a
    and-int/lit16 v13, v8, 0x6000

    if-nez v13, :cond_9

    move/from16 v13, p4

    invoke-virtual {v3, v13}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x4000

    goto :goto_7

    :cond_b
    const/16 v14, 0x2000

    :goto_7
    or-int/2addr v0, v14

    :goto_8
    and-int/lit8 v14, p8, 0x20

    const/high16 v16, 0x30000

    if-eqz v14, :cond_c

    or-int v0, v0, v16

    move-object/from16 v9, p5

    goto :goto_a

    :cond_c
    and-int v16, v8, v16

    move-object/from16 v9, p5

    if-nez v16, :cond_e

    invoke-virtual {v3, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/high16 v16, 0x20000

    goto :goto_9

    :cond_d
    const/high16 v16, 0x10000

    :goto_9
    or-int v0, v0, v16

    :cond_e
    :goto_a
    const v16, 0x12493

    and-int v10, v0, v16

    const v15, 0x12492

    move/from16 v18, v6

    if-eq v10, v15, :cond_f

    const/4 v10, 0x1

    goto :goto_b

    :cond_f
    const/4 v10, 0x0

    :goto_b
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v3, v15, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_26

    if-eqz v18, :cond_10

    const/4 v11, 0x0

    :cond_10
    if-eqz v12, :cond_11

    const/16 v36, 0x1

    goto :goto_c

    :cond_11
    move/from16 v36, v13

    :goto_c
    if-eqz v14, :cond_12

    const/4 v9, 0x0

    :cond_12
    move-object/from16 v37, v9

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v9, v10, :cond_13

    invoke-virtual {v1}, Lx21/a;->a()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v3, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v38, v9

    check-cast v38, Lp1/c1;

    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    int-to-float v14, v2

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v15, v14

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, Lb2/e;->N:Lb2/k;

    const/16 v9, 0x36

    invoke-static {v14, v14, v15, v3, v9}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v9

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v2, v3, Lp1/q;->S:Z

    if-eqz v2, :cond_14

    invoke-virtual {v3, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_14
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_d
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v3, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v3, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_15

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_16

    :cond_15
    invoke-static {v5, v3, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v3, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lx21/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v5, 0x6

    if-eqz v2, :cond_17

    const v2, 0x22049627

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lx21/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v6, 0x0

    invoke-static {v2, v3, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v3, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v29

    invoke-virtual {v2, v3, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v18

    const/16 v33, 0x0

    const v34, 0x2fffa

    move-object v2, v10

    const/4 v10, 0x0

    move v6, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/high16 v20, 0x20000

    const/16 v16, 0x0

    const/16 v21, 0x800

    const/16 v17, 0x0

    move/from16 v22, v11

    move-object/from16 v23, v12

    move-wide/from16 v11, v18

    const-wide/16 v18, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    move-object/from16 v27, v23

    const-wide/16 v22, 0x0

    move/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move/from16 v31, v26

    const/16 v26, 0x0

    move-object/from16 v32, v27

    const/16 v27, 0x0

    move/from16 v39, v28

    const/16 v28, 0x0

    move/from16 v40, v30

    const/16 v30, 0x0

    move-object/from16 v41, v32

    const/16 v32, 0x0

    move/from16 p4, v6

    move-object v6, v2

    move/from16 v2, p4

    move/from16 p4, v31

    move-object/from16 v31, v3

    move-object/from16 v3, v41

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v31

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_17
    move-object v6, v10

    move/from16 p4, v11

    move v2, v14

    const/4 v9, 0x0

    move-object v10, v3

    move-object v3, v12

    const v11, 0x22076bde

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v1}, Lx21/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static {v11, v10, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x23

    int-to-float v12, v12

    mul-float/2addr v12, v2

    invoke-static {v12, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    and-int/lit8 v2, v0, 0x70

    const/16 v13, 0x20

    if-ne v2, v13, :cond_18

    const/4 v2, 0x1

    goto :goto_f

    :cond_18
    move v2, v9

    :goto_f
    and-int/lit8 v13, v0, 0xe

    const/4 v14, 0x4

    if-ne v13, v14, :cond_19

    const/4 v15, 0x1

    goto :goto_10

    :cond_19
    move v15, v9

    :goto_10
    or-int/2addr v2, v15

    const/high16 v15, 0x70000

    and-int/2addr v15, v0

    const/high16 v5, 0x20000

    if-ne v15, v5, :cond_1a

    const/4 v5, 0x1

    goto :goto_11

    :cond_1a
    move v5, v9

    :goto_11
    or-int/2addr v2, v5

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_1b

    if-ne v5, v6, :cond_1c

    :cond_1b
    move v2, v0

    goto :goto_12

    :cond_1c
    move/from16 v11, p4

    move v9, v0

    move-object/from16 v42, v3

    move v15, v14

    move-object/from16 v21, v37

    move-object/from16 v4, v38

    const/16 v35, 0x1

    move-object v14, v6

    move-object v6, v1

    goto :goto_13

    :goto_12
    new-instance v0, Lpp2/d;

    move-object v5, v6

    const/16 v6, 0x9

    move v9, v2

    move-object/from16 v42, v3

    move-object v3, v4

    move v15, v14

    move-object/from16 v2, v37

    move-object/from16 v4, v38

    const/16 v35, 0x1

    move-object v14, v5

    move-object v5, v11

    move/from16 v11, p4

    invoke-direct/range {v0 .. v6}, Lpp2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v6, v1

    move-object/from16 v21, v2

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :goto_13
    move-object v0, v5

    check-cast v0, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v1, v9, 0x1c00

    const/16 v2, 0x800

    if-ne v1, v2, :cond_1d

    move/from16 v1, v35

    goto :goto_14

    :cond_1d
    const/4 v1, 0x0

    :goto_14
    if-ne v13, v15, :cond_1e

    move/from16 v2, v35

    goto :goto_15

    :cond_1e
    const/4 v2, 0x0

    :goto_15
    or-int/2addr v1, v2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1f

    if-ne v2, v14, :cond_20

    :cond_1f
    new-instance v2, Las1/f;

    const/16 v1, 0x8

    invoke-direct {v2, v11, v6, v1}, Las1/f;-><init>(ZLjava/lang/Object;I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v1, v4

    const/16 v4, 0x30

    const/4 v5, 0x0

    move-object v3, v10

    move-object v10, v1

    move-object v1, v12

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    if-eqz v36, :cond_25

    const v0, 0x2223b65d

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    move-object/from16 v1, v42

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lny0/v;->TextMedium:Lny0/v;

    sget v2, Lgy0/f;->A2:I

    invoke-static {v3, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lx21/a;->f()Z

    move-result v12

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v4, v3, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->a()J

    move-result-wide v4

    if-ne v13, v15, :cond_21

    move/from16 v13, v35

    goto :goto_16

    :cond_21
    const/4 v13, 0x0

    :goto_16
    and-int/lit16 v9, v9, 0x380

    const/16 v15, 0x100

    if-ne v9, v15, :cond_22

    move/from16 v9, v35

    goto :goto_17

    :cond_22
    const/4 v9, 0x0

    :goto_17
    or-int/2addr v9, v13

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v9, :cond_23

    if-ne v13, v14, :cond_24

    :cond_23
    new-instance v13, Lre1/k;

    const/16 v9, 0x14

    invoke-direct {v13, v6, v7, v10, v9}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v3, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object/from16 v17, v13

    check-cast v17, Lc93/a;

    const/16 v19, 0x36

    const/16 v20, 0x60

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v9, v0

    move-object v10, v1

    move-object/from16 v18, v3

    move-wide v13, v4

    move/from16 v26, v11

    move/from16 v0, v35

    move-object v11, v2

    invoke-static/range {v9 .. v20}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v9, 0x0

    invoke-virtual {v3, v9}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_25
    move/from16 v26, v11

    move/from16 v0, v35

    const/4 v9, 0x0

    const v1, 0x222ac3fe

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v9}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    move-object/from16 v6, v21

    move/from16 v4, v26

    move/from16 v5, v36

    goto :goto_19

    :cond_26
    move-object v6, v1

    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v6, v9

    move v4, v11

    move v5, v13

    :goto_19
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_27

    new-instance v0, Lb01/n;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v7

    move v7, v8

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lb01/n;-><init>(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final l(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final m(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final n(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;Landroid/content/Context;)Landroid/widget/NumberPicker;
    .locals 3

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lgy0/g;->c:I

    new-instance v1, Landroid/widget/NumberPicker;

    new-instance v2, Lq/d;

    invoke-direct {v2, p5, v0}, Lq/d;-><init>(Landroid/content/Context;I)V

    invoke-direct {v1, v2}, Landroid/widget/NumberPicker;-><init>(Landroid/content/Context;)V

    new-instance p5, Lhe2/b;

    const/4 v0, 0x2

    invoke-direct {p5, p2, p3, v0}, Lhe2/b;-><init>(Ljava/lang/Object;Lp1/c1;I)V

    invoke-virtual {v1, p5}, Landroid/widget/NumberPicker;->setOnValueChangedListener(Landroid/widget/NumberPicker$OnValueChangeListener;)V

    invoke-virtual {p0}, Lx21/a;->c()I

    move-result p2

    invoke-virtual {v1, p2}, Landroid/widget/NumberPicker;->setMinValue(I)V

    invoke-virtual {p0}, Lx21/a;->b()I

    move-result p2

    invoke-virtual {v1, p2}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    const/4 p2, 0x0

    invoke-virtual {v1, p2}, Landroid/widget/NumberPicker;->setWrapSelectorWheel(Z)V

    invoke-virtual {p0}, Lx21/a;->a()I

    move-result p3

    invoke-virtual {v1, p3}, Landroid/widget/NumberPicker;->setValue(I)V

    const/high16 p3, 0x60000

    invoke-virtual {v1, p3}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    if-eqz p1, :cond_2

    new-instance p3, Lx21/c;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p4}, Lx21/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, p3}, Landroid/widget/NumberPicker;->setFormatter(Landroid/widget/NumberPicker$Formatter;)V

    invoke-virtual {p0}, Lx21/a;->c()I

    move-result p1

    invoke-virtual {p0}, Lx21/a;->b()I

    move-result p3

    if-gt p1, p3, :cond_1

    :goto_0
    invoke-virtual {p0}, Lx21/a;->c()I

    move-result p4

    sub-int p4, p1, p4

    invoke-virtual {v1, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_0

    instance-of p5, p4, Landroid/widget/EditText;

    if-eqz p5, :cond_0

    check-cast p4, Landroid/widget/EditText;

    new-array p5, p2, [Landroid/text/InputFilter;

    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    :cond_0
    if-eq p1, p3, :cond_1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    new-instance p0, Lx21/c;

    const/4 p1, 0x1

    invoke-direct {p0, p4, p1}, Lx21/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, p0}, Landroid/widget/NumberPicker;->setFormatter(Landroid/widget/NumberPicker$Formatter;)V

    return-object v1
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Lp1/c1;Landroid/widget/NumberPicker;II)V
    .locals 0

    invoke-static {p1, p4}, Lx21/d;->m(Lp1/c1;I)V

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final q(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final r(ZLx21/a;Landroid/widget/NumberPicker;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lx21/a;->a()I

    move-result p0

    invoke-virtual {p2, p0}, Landroid/widget/NumberPicker;->setValue(I)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lx21/a;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lx21/a;->f()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p2}, Lx21/d;->l(Lp1/c1;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lx21/d;->k(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
