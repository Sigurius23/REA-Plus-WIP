.class public abstract Li11/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0099\u0001\u0010\u0017\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u0081\u0001\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "isLoading",
        "Ll0/i;",
        "arrangement",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "backButtonEnabled",
        "forwardButtonEnabled",
        "",
        "backDate",
        "forwardDate",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "previousInteraction",
        "nextInteraction",
        "labelInteraction",
        "Li11/g;",
        "dateStrip",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "clickEvent",
        "q",
        "(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "j",
        "(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "a",
        "F",
        "MIN_LABEL_WIDTH",
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


# static fields
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x28

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Li11/e;->a:F

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/Long;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Li11/e;->r(Ljava/lang/String;Ljava/lang/Long;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Li11/e;->l(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Li11/e;->o(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p15}, Li11/e;->p(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p17}, Li11/e;->t(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Li11/e;->s(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Li11/e;->k(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li11/e;->n(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Ll83/a0;
    .locals 1

    invoke-static {}, Li11/e;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ll0/i;",
            "Z",
            "Lcom/whoop/design/util/TextResource;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p13

    move-object/from16 v0, p12

    check-cast v0, Lp1/q;

    const v5, -0x2eb3cf4c

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v13, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v13

    goto :goto_1

    :cond_1
    move v5, v13

    :goto_1
    and-int/lit8 v15, v13, 0x30

    const/16 v16, 0x10

    if-nez v15, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    const/16 v15, 0x20

    goto :goto_2

    :cond_2
    move/from16 v15, v16

    :goto_2
    or-int/2addr v5, v15

    :cond_3
    and-int/lit16 v15, v13, 0x180

    if-nez v15, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_4

    const/16 v15, 0x100

    goto :goto_3

    :cond_4
    const/16 v15, 0x80

    :goto_3
    or-int/2addr v5, v15

    :cond_5
    and-int/lit16 v15, v13, 0xc00

    if-nez v15, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_6

    const/16 v15, 0x800

    goto :goto_4

    :cond_6
    const/16 v15, 0x400

    :goto_4
    or-int/2addr v5, v15

    :cond_7
    and-int/lit16 v15, v13, 0x6000

    if-nez v15, :cond_9

    move/from16 v15, p4

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_8

    const/16 v17, 0x4000

    goto :goto_5

    :cond_8
    const/16 v17, 0x2000

    :goto_5
    or-int v5, v5, v17

    goto :goto_6

    :cond_9
    move/from16 v15, p4

    :goto_6
    const/high16 v17, 0x30000

    and-int v17, v13, v17

    move/from16 v6, p5

    if-nez v17, :cond_b

    invoke-virtual {v0, v6}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_a

    const/high16 v17, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v17, 0x10000

    :goto_7
    or-int v5, v5, v17

    :cond_b
    const/high16 v17, 0x180000

    and-int v17, v13, v17

    if-nez v17, :cond_d

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_c

    const/high16 v17, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v17, 0x80000

    :goto_8
    or-int v5, v5, v17

    :cond_d
    const/high16 v17, 0xc00000

    and-int v17, v13, v17

    if-nez v17, :cond_f

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_e

    const/high16 v17, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v17, 0x400000

    :goto_9
    or-int v5, v5, v17

    :cond_f
    const/high16 v17, 0x6000000

    and-int v17, v13, v17

    const/high16 v33, 0x8000000

    if-nez v17, :cond_12

    and-int v17, v13, v33

    if-nez v17, :cond_10

    invoke-virtual {v0, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    goto :goto_a

    :cond_10
    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    :goto_a
    if-eqz v17, :cond_11

    const/high16 v17, 0x4000000

    goto :goto_b

    :cond_11
    const/high16 v17, 0x2000000

    :goto_b
    or-int v5, v5, v17

    :cond_12
    const/high16 v17, 0x30000000

    and-int v17, v13, v17

    const/high16 v39, 0x40000000    # 2.0f

    if-nez v17, :cond_15

    and-int v17, v13, v39

    if-nez v17, :cond_13

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    goto :goto_c

    :cond_13
    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    :goto_c
    if-eqz v17, :cond_14

    const/high16 v17, 0x20000000

    goto :goto_d

    :cond_14
    const/high16 v17, 0x10000000

    :goto_d
    or-int v5, v5, v17

    :cond_15
    and-int/lit8 v17, p14, 0x6

    if-nez v17, :cond_18

    and-int/lit8 v17, p14, 0x8

    if-nez v17, :cond_16

    invoke-virtual {v0, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    goto :goto_e

    :cond_16
    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    :goto_e
    if-eqz v17, :cond_17

    const/16 v17, 0x4

    goto :goto_f

    :cond_17
    const/16 v17, 0x2

    :goto_f
    or-int v17, p14, v17

    goto :goto_10

    :cond_18
    move/from16 v17, p14

    :goto_10
    and-int/lit8 v18, p14, 0x30

    if-nez v18, :cond_1a

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_19

    const/16 v16, 0x20

    :cond_19
    or-int v17, v17, v16

    :cond_1a
    move/from16 v16, v17

    const v17, 0x12492493

    and-int v14, v5, v17

    const v3, 0x12492492

    move/from16 v40, v5

    if-ne v14, v3, :cond_1c

    and-int/lit8 v3, v16, 0x13

    const/16 v14, 0x12

    if-eq v3, v14, :cond_1b

    goto :goto_11

    :cond_1b
    const/4 v3, 0x0

    goto :goto_12

    :cond_1c
    :goto_11
    const/4 v3, 0x1

    :goto_12
    and-int/lit8 v14, v40, 0x1

    invoke-virtual {v0, v14, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3e

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-interface {v5, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v3, Lb2/e;->K:Lb2/l;

    and-int/lit8 v1, v40, 0x70

    or-int/lit16 v1, v1, 0x180

    move/from16 v17, v1

    const/4 v1, 0x3

    shr-int/lit8 v17, v17, 0x3

    and-int/lit8 v17, v17, 0xe

    const/16 v37, 0x30

    or-int/lit8 v1, v17, 0x30

    invoke-static {v2, v3, v0, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v0, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_1d

    invoke-virtual {v0, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_13
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-nez v15, :cond_1e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v15, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1f

    :cond_1e
    invoke-static {v2, v0, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Ll0/t1;->a:Ll0/t1;

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    invoke-virtual {v5, v14, v15, v8}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v4, v0, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    move-object/from16 v42, v4

    move-object/from16 v41, v5

    iget-wide v4, v0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v0, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_20

    invoke-virtual {v0, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_20
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v0, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_21

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_22

    :cond_21
    invoke-static {v4, v0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v0, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v17, Lny0/o;

    sget-object v18, Lny0/q$c;->f:Lny0/q$c;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/i0;->e()I

    move-result v19

    const/16 v28, 0x3dc

    const/16 v29, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move/from16 v23, p4

    invoke-direct/range {v17 .. v29}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v18

    sget v5, Lgy0/f;->R0:I

    const/4 v15, 0x0

    invoke-static {v5, v0, v15}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    const-string v10, "DateSelector_Left_Button"

    invoke-static {v14, v10}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    and-int/lit8 v11, v16, 0x70

    const/16 v15, 0x20

    if-ne v11, v15, :cond_23

    const/4 v15, 0x1

    goto :goto_15

    :cond_23
    const/4 v15, 0x0

    :goto_15
    const/high16 v16, 0xe000000

    move-object/from16 v43, v4

    and-int v4, v40, v16

    move-object/from16 v16, v5

    const/high16 v5, 0x4000000

    if-eq v4, v5, :cond_25

    and-int v4, v40, v33

    if-eqz v4, :cond_24

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    goto :goto_16

    :cond_24
    const/4 v4, 0x0

    goto :goto_17

    :cond_25
    :goto_16
    const/4 v4, 0x1

    :goto_17
    or-int/2addr v4, v15

    const/high16 v5, 0x380000

    and-int v5, v40, v5

    const/high16 v15, 0x100000

    if-ne v5, v15, :cond_26

    const/4 v5, 0x1

    goto :goto_18

    :cond_26
    const/4 v5, 0x0

    :goto_18
    or-int/2addr v4, v5

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_27

    if-ne v5, v15, :cond_28

    :cond_27
    new-instance v5, Li11/c;

    const/4 v4, 0x0

    invoke-direct {v5, v12, v9, v7, v4}, Li11/c;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    move-object/from16 v18, v5

    check-cast v18, Lc93/a;

    const/16 v20, 0x0

    const/16 v21, 0x8

    move-object v4, v14

    move-object/from16 v14, v17

    const/16 v17, 0x0

    move-object/from16 v5, v16

    move-object/from16 v16, v10

    move-object v10, v15

    move-object v15, v5

    move-object/from16 v19, v0

    const/high16 v0, 0x20000000

    const/4 v5, 0x4

    invoke-static/range {v14 .. v21}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v19

    const/4 v15, 0x1

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    const/high16 v15, 0x41000000    # 8.0f

    move-object/from16 v5, v41

    const/4 v0, 0x0

    invoke-virtual {v5, v4, v0, v15}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget v0, Li11/e;->a:F

    move-object/from16 v17, v4

    const/4 v4, 0x0

    const/4 v7, 0x2

    invoke-static {v15, v0, v4, v7}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-nez p10, :cond_29

    const v4, -0x2ab2b9b4

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    move-object/from16 v7, p10

    move-object/from16 v15, v17

    goto :goto_1b

    :cond_29
    const v4, -0x2ab2b9b3

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    const/16 v15, 0x20

    if-ne v11, v15, :cond_2a

    const/4 v4, 0x1

    :goto_19
    move-object/from16 v7, p10

    goto :goto_1a

    :cond_2a
    const/4 v4, 0x0

    goto :goto_19

    :goto_1a
    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v4, v15

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v4, :cond_2b

    if-ne v15, v10, :cond_2c

    :cond_2b
    new-instance v15, Lcw2/b;

    const/4 v4, 0x2

    invoke-direct {v15, v12, v7, v4}, Lcw2/b;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;I)V

    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    move-object/from16 v21, v15

    check-cast v21, Lc93/a;

    const/16 v22, 0xf

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 p12, v4

    move-object/from16 v15, v17

    const/4 v4, 0x0

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    move-object/from16 v4, p12

    :goto_1b
    if-nez v4, :cond_2d

    move-object v4, v15

    :cond_2d
    invoke-interface {v0, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->N:Lb2/k;

    move/from16 v7, v37

    invoke-static {v8, v4, v14, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move/from16 p12, v11

    iget-wide v11, v14, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v14, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-eqz v12, :cond_2e

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_2e
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v14, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-nez v4, :cond_2f

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_30

    :cond_2f
    invoke-static {v7, v14, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_30
    invoke-static {v14, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x6

    if-eqz p2, :cond_33

    const v4, -0x5562f347

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    const-string v4, "DateSelectorLottieLoading"

    invoke-static {v15, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v0, v0

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v0, v7

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v4, Lgy0/e;->d:I

    invoke-static {v4}, Lv41/r0$d;->b(I)I

    move-result v4

    invoke-static {v4}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v10, :cond_31

    new-instance v7, Lhb1/l;

    const/16 v11, 0x1a

    invoke-direct {v7, v11}, Lhb1/l;-><init>(I)V

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    move-object/from16 v19, v7

    check-cast v19, Lc93/a;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v10, :cond_32

    new-instance v7, Lhu1/g;

    const/16 v11, 0xa

    invoke-direct {v7, v11}, Lhu1/g;-><init>(I)V

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_32
    move-object/from16 v20, v7

    check-cast v20, Lkotlin/jvm/functions/Function1;

    const v24, 0x1b0006

    const/16 v25, 0x19c

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v23, v15

    move-object v15, v4

    move-object/from16 v4, v23

    move-object/from16 v23, v14

    move-object v14, v0

    invoke-static/range {v14 .. v25}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v23

    const/4 v15, 0x0

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    :goto_1d
    const/4 v0, 0x1

    goto/16 :goto_1e

    :cond_33
    move-object v4, v15

    const v7, -0x555c763c

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    const-string v7, "DateSelector_Label"

    invoke-static {v4, v7}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v14, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->L()Lb91/a;

    move-result-object v11

    invoke-virtual {v11}, Lb91/a;->d()Ll3/v0;

    move-result-object v34

    invoke-virtual {v7, v14, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v16

    shr-int/lit8 v11, v40, 0x9

    and-int/lit8 v11, v11, 0xe

    move-object/from16 v12, p3

    invoke-static {v12, v14, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v14, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->L()Lb91/a;

    move-result-object v0

    invoke-virtual {v0}, Lb91/a;->d()Ll3/v0;

    move-result-object v0

    iget-object v0, v0, Ll3/v0;->a:Ll3/m0;

    move-object v7, v11

    iget-wide v11, v0, Ll3/m0;->b:J

    const/high16 v0, 0x3fc00000    # 1.5f

    move-object/from16 v18, v7

    const/16 v7, 0x30

    invoke-static {v11, v12, v0, v14, v7}, Lkd1/s;->a(JFLandroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    new-instance v0, Lw3/k;

    const/4 v7, 0x3

    invoke-direct {v0, v7}, Lw3/k;-><init>(I)V

    const/16 v37, 0x0

    const v38, 0xfdf0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    move-object/from16 v26, v0

    move-object/from16 v35, v14

    move-object/from16 v14, v18

    move-wide/from16 v18, v11

    invoke-static/range {v14 .. v38}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v35

    const/4 v15, 0x0

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    goto :goto_1d

    :goto_1e
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v5, v4, v15, v0}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v5, v42

    invoke-static {v8, v5, v14, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_34

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1f

    :cond_34
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1f
    invoke-static {v14, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_35

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    :cond_35
    invoke-static {v7, v14, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_36
    invoke-static {v14, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v18, Lny0/o;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/i0;->n()I

    move-result v20

    const/16 v29, 0x3dc

    const/16 v30, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move/from16 v24, p5

    move-object/from16 v19, v43

    invoke-direct/range {v18 .. v30}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lgy0/f;->h2:I

    const/4 v15, 0x0

    invoke-static {v0, v14, v15}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "DateSelector_Right_Button"

    invoke-static {v4, v1}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    move/from16 v1, p12

    const/16 v2, 0x20

    if-ne v1, v2, :cond_37

    const/4 v1, 0x1

    goto :goto_20

    :cond_37
    move v1, v15

    :goto_20
    const/high16 v2, 0x70000000

    and-int v2, v40, v2

    const/high16 v3, 0x20000000

    if-eq v2, v3, :cond_3a

    and-int v2, v40, v39

    if-eqz v2, :cond_38

    move-object/from16 v2, p9

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_39

    goto :goto_21

    :cond_38
    move-object/from16 v2, p9

    :cond_39
    move v3, v15

    goto :goto_22

    :cond_3a
    move-object/from16 v2, p9

    :goto_21
    const/4 v3, 0x1

    :goto_22
    or-int/2addr v1, v3

    const/high16 v3, 0x1c00000

    and-int v3, v40, v3

    const/high16 v4, 0x800000

    if-ne v3, v4, :cond_3b

    const/4 v5, 0x1

    goto :goto_23

    :cond_3b
    move v5, v15

    :goto_23
    or-int/2addr v1, v5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_3d

    if-ne v3, v10, :cond_3c

    goto :goto_24

    :cond_3c
    move-object/from16 v8, p7

    move-object/from16 v12, p11

    goto :goto_25

    :cond_3d
    :goto_24
    new-instance v3, Li11/c;

    const/4 v1, 0x1

    move-object/from16 v8, p7

    move-object/from16 v12, p11

    invoke-direct {v3, v12, v2, v8, v1}, Li11/c;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_25
    check-cast v3, Lc93/a;

    const/16 v20, 0x0

    const/16 v21, 0x8

    const/16 v17, 0x0

    move-object v15, v0

    move-object/from16 v19, v14

    move-object/from16 v14, v18

    move-object/from16 v18, v3

    invoke-static/range {v14 .. v21}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v19

    const/4 v15, 0x1

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    goto :goto_26

    :cond_3e
    move-object v14, v0

    move-object v2, v10

    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_26
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_3f

    new-instance v0, Li11/d;

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v11, p10

    move/from16 v13, p13

    move/from16 v14, p14

    move-object v10, v2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v14}, Li11/d;-><init>(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_3f
    return-void
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ll83/a0;
    .locals 0

    if-nez p1, :cond_0

    move-object p1, p2

    :cond_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ll83/a0;
    .locals 0

    if-nez p1, :cond_0

    move-object p1, p2

    :cond_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    or-int/lit8 v0, p12, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v14

    invoke-static/range {p13 .. p13}, Lp1/x;->L(I)I

    move-result v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p14

    invoke-static/range {v1 .. v15}, Li11/e;->j(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final q(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Ll0/i;",
            "Lcom/whoop/design/util/TextResource;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Li11/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v3, p3

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v0, p8

    move-object/from16 v1, p9

    move-object/from16 v2, p10

    move-object/from16 v11, p12

    move/from16 v15, p14

    move/from16 v4, p15

    move/from16 v5, p16

    const-string v8, "text"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "backDate"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "forwardDate"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "clickEvent"

    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p13

    check-cast v12, Lp1/q;

    const v8, -0x16e8da33

    invoke-virtual {v12, v8}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v8, v5, 0x1

    if-eqz v8, :cond_0

    or-int/lit8 v13, v15, 0x6

    move v14, v13

    move-object/from16 v13, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v13, v15, 0x6

    if-nez v13, :cond_2

    move-object/from16 v13, p0

    invoke-virtual {v12, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    const/4 v14, 0x4

    goto :goto_0

    :cond_1
    const/4 v14, 0x2

    :goto_0
    or-int/2addr v14, v15

    goto :goto_1

    :cond_2
    move-object/from16 v13, p0

    move v14, v15

    :goto_1
    and-int/lit8 v16, v5, 0x2

    const/16 v17, 0x10

    const/16 v18, 0x20

    if-eqz v16, :cond_3

    or-int/lit8 v14, v14, 0x30

    move/from16 v9, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v19, v15, 0x30

    move/from16 v9, p1

    if-nez v19, :cond_5

    invoke-virtual {v12, v9}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_4

    move/from16 v19, v18

    goto :goto_2

    :cond_4
    move/from16 v19, v17

    :goto_2
    or-int v14, v14, v19

    :cond_5
    :goto_3
    and-int/lit8 v19, v5, 0x4

    const/16 v20, 0x80

    move/from16 v21, v8

    if-eqz v19, :cond_7

    or-int/lit16 v14, v14, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v15, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_8

    const/16 v23, 0x100

    goto :goto_4

    :cond_8
    move/from16 v23, v20

    :goto_4
    or-int v14, v14, v23

    :goto_5
    and-int/lit16 v10, v15, 0xc00

    if-nez v10, :cond_a

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_6

    :cond_9
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v14, v10

    :cond_a
    and-int/lit16 v10, v15, 0x6000

    if-nez v10, :cond_c

    move/from16 v10, p4

    invoke-virtual {v12, v10}, Lp1/q;->h(Z)Z

    move-result v24

    if-eqz v24, :cond_b

    const/16 v24, 0x4000

    goto :goto_7

    :cond_b
    const/16 v24, 0x2000

    :goto_7
    or-int v14, v14, v24

    goto :goto_8

    :cond_c
    move/from16 v10, p4

    :goto_8
    const/high16 v24, 0x30000

    and-int v24, v15, v24

    move/from16 v3, p5

    if-nez v24, :cond_e

    invoke-virtual {v12, v3}, Lp1/q;->h(Z)Z

    move-result v24

    if-eqz v24, :cond_d

    const/high16 v24, 0x20000

    goto :goto_9

    :cond_d
    const/high16 v24, 0x10000

    :goto_9
    or-int v14, v14, v24

    :cond_e
    const/high16 v24, 0x180000

    and-int v24, v15, v24

    if-nez v24, :cond_10

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    const/high16 v24, 0x100000

    goto :goto_a

    :cond_f
    const/high16 v24, 0x80000

    :goto_a
    or-int v14, v14, v24

    :cond_10
    const/high16 v24, 0xc00000

    and-int v24, v15, v24

    if-nez v24, :cond_12

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_11

    const/high16 v24, 0x800000

    goto :goto_b

    :cond_11
    const/high16 v24, 0x400000

    :goto_b
    or-int v14, v14, v24

    :cond_12
    and-int/lit16 v3, v5, 0x100

    const/high16 v24, 0x6000000

    if-eqz v3, :cond_13

    :goto_c
    or-int v14, v14, v24

    goto :goto_e

    :cond_13
    and-int v24, v15, v24

    if-nez v24, :cond_16

    const/high16 v24, 0x8000000

    and-int v24, v15, v24

    if-nez v24, :cond_14

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    goto :goto_d

    :cond_14
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v24

    :goto_d
    if-eqz v24, :cond_15

    const/high16 v24, 0x4000000

    goto :goto_c

    :cond_15
    const/high16 v24, 0x2000000

    goto :goto_c

    :cond_16
    :goto_e
    and-int/lit16 v0, v5, 0x200

    const/high16 v24, 0x30000000

    if-eqz v0, :cond_17

    :goto_f
    or-int v14, v14, v24

    goto :goto_11

    :cond_17
    and-int v24, v15, v24

    if-nez v24, :cond_1a

    const/high16 v24, 0x40000000    # 2.0f

    and-int v24, v15, v24

    if-nez v24, :cond_18

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    goto :goto_10

    :cond_18
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v24

    :goto_10
    if-eqz v24, :cond_19

    const/high16 v24, 0x20000000

    goto :goto_f

    :cond_19
    const/high16 v24, 0x10000000

    goto :goto_f

    :cond_1a
    :goto_11
    move/from16 v24, v0

    and-int/lit16 v0, v5, 0x400

    if-eqz v0, :cond_1b

    or-int/lit8 v25, v4, 0x6

    goto :goto_14

    :cond_1b
    and-int/lit8 v25, v4, 0x6

    if-nez v25, :cond_1e

    and-int/lit8 v25, v4, 0x8

    if-nez v25, :cond_1c

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v25

    goto :goto_12

    :cond_1c
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v25

    :goto_12
    if-eqz v25, :cond_1d

    const/16 v25, 0x4

    goto :goto_13

    :cond_1d
    const/16 v25, 0x2

    :goto_13
    or-int v25, v4, v25

    goto :goto_14

    :cond_1e
    move/from16 v25, v4

    :goto_14
    move/from16 v26, v0

    and-int/lit16 v0, v5, 0x800

    if-eqz v0, :cond_20

    or-int/lit8 v25, v25, 0x30

    :cond_1f
    move/from16 v27, v0

    move-object/from16 v0, p11

    goto :goto_15

    :cond_20
    and-int/lit8 v27, v4, 0x30

    if-nez v27, :cond_1f

    move/from16 v27, v0

    move-object/from16 v0, p11

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_21

    move/from16 v17, v18

    :cond_21
    or-int v25, v25, v17

    :goto_15
    and-int/lit16 v0, v4, 0x180

    if-nez v0, :cond_23

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    const/16 v20, 0x100

    :cond_22
    or-int v25, v25, v20

    :cond_23
    move/from16 v0, v25

    const v17, 0x12492493

    and-int v1, v14, v17

    const v2, 0x12492492

    if-ne v1, v2, :cond_25

    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    if-eq v1, v2, :cond_24

    goto :goto_16

    :cond_24
    const/4 v1, 0x0

    goto :goto_17

    :cond_25
    :goto_16
    const/4 v1, 0x1

    :goto_17
    and-int/lit8 v2, v14, 0x1

    invoke-virtual {v12, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_36

    move/from16 v25, v0

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v1, v0

    if-eqz v21, :cond_26

    goto :goto_18

    :cond_26
    move-object v0, v13

    :goto_18
    if-eqz v16, :cond_27

    const/4 v2, 0x0

    goto :goto_19

    :cond_27
    move v2, v9

    :goto_19
    if-eqz v19, :cond_28

    sget-object v8, Ll0/m;->g:Ll0/h;

    :cond_28
    move-object v13, v0

    move-object v0, v1

    move-object v1, v8

    const/16 v16, 0x0

    if-eqz v3, :cond_29

    move-object/from16 v8, v16

    goto :goto_1a

    :cond_29
    move-object/from16 v8, p8

    :goto_1a
    if-eqz v24, :cond_2a

    move-object/from16 v9, v16

    goto :goto_1b

    :cond_2a
    move-object/from16 v9, p9

    :goto_1b
    if-eqz v26, :cond_2b

    move-object/from16 v10, v16

    goto :goto_1c

    :cond_2b
    move-object/from16 v10, p10

    :goto_1c
    if-eqz v27, :cond_2c

    move-object/from16 v18, v16

    goto :goto_1d

    :cond_2c
    move-object/from16 v18, p11

    :goto_1d
    const/high16 v3, 0x70000000

    const/high16 v19, 0xe000000

    const/high16 v20, 0x1c00000

    const/high16 v21, 0x380000

    const/high16 v24, 0x70000

    const v26, 0xe000

    if-nez v18, :cond_2d

    const v0, -0x339d3a3

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v14, 0xe

    shr-int/lit8 v15, v14, 0x3

    and-int/lit8 v15, v15, 0x70

    or-int/2addr v0, v15

    shl-int/lit8 v15, v14, 0x3

    and-int/lit16 v15, v15, 0x380

    or-int/2addr v0, v15

    and-int/lit16 v15, v14, 0x1c00

    or-int/2addr v0, v15

    and-int v15, v14, v26

    or-int/2addr v0, v15

    and-int v15, v14, v24

    or-int/2addr v0, v15

    and-int v15, v14, v21

    or-int/2addr v0, v15

    and-int v15, v14, v20

    or-int/2addr v0, v15

    sget v15, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    shl-int/lit8 v16, v15, 0x18

    or-int v0, v0, v16

    and-int v16, v14, v19

    or-int v0, v0, v16

    shl-int/lit8 v16, v15, 0x1b

    or-int v0, v0, v16

    and-int/2addr v3, v14

    or-int/2addr v0, v3

    and-int/lit8 v3, v25, 0xe

    or-int/2addr v3, v15

    shr-int/lit8 v14, v25, 0x3

    and-int/lit8 v14, v14, 0x70

    or-int/2addr v14, v3

    move-object v3, v13

    move v13, v0

    move-object v0, v3

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-static/range {v0 .. v14}, Li11/e;->j(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v8

    const/4 v5, 0x0

    move-object v8, v1

    move-object v1, v0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    move-object/from16 v20, v1

    move v13, v2

    move-object/from16 v21, v4

    move-object v14, v8

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    goto/16 :goto_22

    :cond_2d
    move-object v4, v8

    const/4 v5, 0x0

    move-object v8, v1

    move-object v1, v13

    const v6, -0x331203d

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-interface {v6, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v11, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move/from16 p1, v3

    move-object/from16 p0, v4

    iget-wide v3, v12, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_2e

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1e

    :cond_2e
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1e
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v12, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_2f

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_30

    :cond_2f
    invoke-static {v3, v12, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_30
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v3, v14, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x6

    shl-int/lit8 v4, v14, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    and-int/lit16 v4, v14, 0x1c00

    or-int/2addr v3, v4

    and-int v4, v14, v26

    or-int/2addr v3, v4

    and-int v4, v14, v24

    or-int/2addr v3, v4

    and-int v4, v14, v21

    or-int/2addr v3, v4

    and-int v4, v14, v20

    or-int/2addr v3, v4

    sget v4, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    shl-int/lit8 v5, v4, 0x18

    or-int/2addr v3, v5

    and-int v5, v14, v19

    or-int/2addr v3, v5

    shl-int/lit8 v5, v4, 0x1b

    or-int/2addr v3, v5

    and-int v5, v14, p1

    or-int v13, v3, v5

    and-int/lit8 v3, v25, 0xe

    or-int/2addr v3, v4

    shr-int/lit8 v4, v25, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int v14, v3, v4

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v11, p12

    move-object/from16 v20, v1

    move-object v1, v8

    const/4 v15, 0x2

    move-object/from16 v8, p0

    invoke-static/range {v0 .. v14}, Li11/e;->j(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v14, v1

    move v13, v2

    move-object/from16 v21, v8

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    int-to-float v1, v15

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {v1, v2, v0, v12}, Ld;->w(FFLb2/t;Lp1/q;)V

    const-string v1, "DateSelectorDateStrip"

    invoke-static {v0, v1}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {v18 .. v18}, Li11/g;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_31

    new-instance v2, Lg1/w8;

    const/16 v4, 0x1b

    invoke-direct {v2, v4}, Lg1/w8;-><init>(I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    check-cast v2, Lc93/m;

    invoke-virtual/range {v18 .. v18}, Li11/g;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v4

    if-nez v4, :cond_32

    const v3, 0x675a7084

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    :goto_1f
    move-object/from16 v4, v16

    goto :goto_21

    :cond_32
    const v5, 0x675a7085

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    move/from16 v5, v25

    and-int/lit16 v6, v5, 0x380

    const/16 v7, 0x100

    if-ne v6, v7, :cond_33

    const/4 v6, 0x1

    goto :goto_20

    :cond_33
    const/4 v6, 0x0

    :goto_20
    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_34

    if-ne v7, v3, :cond_35

    :cond_34
    new-instance v7, Lcw2/b;

    const/4 v3, 0x1

    invoke-direct {v7, v11, v4, v3}, Lcw2/b;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_35
    move-object/from16 v16, v7

    check-cast v16, Lc93/a;

    const/4 v3, 0x0

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    move/from16 v25, v5

    goto :goto_1f

    :goto_21
    invoke-virtual/range {v18 .. v18}, Li11/g;->b()Lgz0/m0;

    move-result-object v5

    invoke-virtual/range {v18 .. v18}, Li11/g;->d()Lgz0/m0;

    move-result-object v6

    shl-int/lit8 v3, v25, 0x3

    and-int/lit16 v3, v3, 0x1c00

    const v7, 0xc00180

    or-int v9, v3, v7

    const/4 v10, 0x0

    const-string v7, "DateSelector_DayPill"

    move-object v3, v11

    move-object v8, v12

    invoke-static/range {v0 .. v10}, Lh11/f;->h(Landroidx/compose/ui/Modifier;Ljava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    :goto_22
    move-object v8, v12

    move v2, v13

    move-object v3, v14

    move-object/from16 v12, v18

    move-object/from16 v1, v20

    move-object/from16 v9, v21

    move-object/from16 v10, v22

    move-object/from16 v11, v23

    goto :goto_23

    :cond_36
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object v3, v8

    move v2, v9

    move-object v8, v12

    move-object v1, v13

    move-object/from16 v9, p8

    move-object/from16 v12, p11

    :goto_23
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_37

    move-object v4, v0

    new-instance v0, Li11/b;

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v13, p12

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v29, v4

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v16}, Li11/b;-><init>(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;III)V

    move-object/from16 v4, v29

    iput-object v0, v4, Lp1/v1;->d:Lc93/m;

    :cond_37
    return-void
.end method

.method private static final r(Ljava/lang/String;Ljava/lang/Long;)Ll83/a0;
    .locals 0

    const-string p1, "<unused var>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 18

    or-int/lit8 v0, p13, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v15

    invoke-static/range {p14 .. p14}, Lp1/x;->L(I)I

    move-result v16

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v17, p15

    move-object/from16 v14, p16

    invoke-static/range {v1 .. v17}, Li11/e;->q(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
