.class public abstract Leg2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aE\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001aE\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Leg2/k;",
        "step",
        "",
        "enabled",
        "isLoading",
        "isError",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "g",
        "(Leg2/k;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "k",
        "Li2/t;",
        "a",
        "Li2/t;",
        "smsSetupButtonBrush",
        "sms_release"
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
.field private static final a:Li2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    sget-object v0, Li2/t;->b:Li2/s;

    const-wide v1, 0xff8b62ffL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xff50d5ffL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/high16 v2, -0x3e100000    # -30.0f

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    const/high16 v4, 0x41f00000    # 30.0f

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    const/16 v6, 0x20

    shl-long/2addr v2, v6

    const-wide v7, 0xffffffffL

    and-long/2addr v4, v7

    or-long/2addr v2, v4

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    const/high16 v9, 0x43480000    # 200.0f

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    shl-long/2addr v4, v6

    and-long v6, v9, v7

    or-long/2addr v4, v6

    const/16 v6, 0x8

    invoke-static/range {v0 .. v6}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v0

    sput-object v0, Leg2/e;->a:Li2/t;

    return-void
.end method

.method public static synthetic a(Lc93/a;Lc31/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Leg2/e;->m(Lc93/a;Lc31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Leg2/k;ZZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Leg2/e;->n(Leg2/k;ZZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;Lc31/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Leg2/e;->i(Lc93/a;Lc31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Leg2/e;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Leg2/k;ZZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Leg2/e;->j(Leg2/k;ZZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Leg2/e;->l()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final g(Leg2/k;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leg2/k;",
            "ZZZ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v6, p6

    const-string v0, "step"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v2, -0x5171e81f

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v0, v2}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_1
    move v2, v6

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_2

    move/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    move/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_8

    move/from16 v9, p3

    invoke-virtual {v0, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v2, v10

    :goto_7
    and-int/lit8 v10, p7, 0x10

    const/16 v11, 0x4000

    if-eqz v10, :cond_c

    or-int/lit16 v2, v2, 0x6000

    :cond_b
    move-object/from16 v12, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v12, v6, 0x6000

    if-nez v12, :cond_b

    move-object/from16 v12, p4

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    move v13, v11

    goto :goto_8

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v2, v13

    :goto_9
    and-int/lit16 v13, v2, 0x2493

    const/16 v14, 0x2492

    const/4 v15, 0x0

    if-eq v13, v14, :cond_e

    const/4 v13, 0x1

    goto :goto_a

    :cond_e
    move v13, v15

    :goto_a
    and-int/lit8 v14, v2, 0x1

    invoke-virtual {v0, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_1a

    if-eqz v3, :cond_f

    const/16 v26, 0x1

    goto :goto_b

    :cond_f
    move/from16 v26, v4

    :goto_b
    if-eqz v5, :cond_10

    move v7, v15

    :cond_10
    if-eqz v8, :cond_11

    move v9, v15

    :cond_11
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_12

    new-instance v4, Leb1/a;

    const/16 v5, 0x16

    invoke-direct {v4, v5}, Leb1/a;-><init>(I)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lc93/a;

    move-object v12, v4

    :cond_13
    if-eqz v7, :cond_14

    sget-object v4, Lc31/d;->LOADING:Lc31/d;

    :goto_c
    move-object/from16 v17, v4

    goto :goto_d

    :cond_14
    invoke-virtual {v1}, Leg2/k;->getButtonState()Lc31/d;

    move-result-object v4

    goto :goto_c

    :goto_d
    invoke-virtual {v1}, Leg2/k;->getButtonText()Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v1}, Leg2/k;->getFilledCount()I

    move-result v24

    sget-object v22, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    const/4 v4, 0x0

    if-eqz v9, :cond_15

    move-object/from16 v29, v4

    goto :goto_e

    :cond_15
    sget-object v5, Leg2/e;->a:Li2/t;

    move-object/from16 v29, v5

    :goto_e
    if-eqz v9, :cond_16

    sget-object v4, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    :cond_16
    move-object/from16 v28, v4

    sget-object v19, Ly81/f;->BRAND_WHITE:Ly81/f;

    new-instance v16, Lc31/k;

    const v34, 0x1c518

    const/16 v35, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x64

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v30, v19

    invoke-direct/range {v16 .. v35}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v16

    const v5, 0xe000

    and-int/2addr v2, v5

    if-ne v2, v11, :cond_17

    const/4 v2, 0x1

    goto :goto_f

    :cond_17
    move v2, v15

    :goto_f
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_18

    if-ne v5, v3, :cond_19

    :cond_18
    new-instance v5, Laz1/b;

    const/16 v2, 0x10

    invoke-direct {v5, v12, v2}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget v2, Lc31/k;->r:I

    invoke-static {v4, v5, v0, v2, v15}, Lc31/j;->e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move/from16 v2, v26

    :goto_10
    move v3, v7

    move v4, v9

    move-object v5, v12

    goto :goto_11

    :cond_1a
    invoke-virtual {v0}, Lp1/q;->X()V

    move v2, v4

    goto :goto_10

    :goto_11
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1b

    new-instance v0, Leg2/d;

    const/4 v8, 0x0

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Leg2/d;-><init>(Leg2/k;ZZZLc93/a;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lc93/a;Lc31/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Leg2/k;ZZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Leg2/e;->g(Leg2/k;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Leg2/k;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leg2/k;",
            "ZZZ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v6, p6

    const-string v0, "step"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v2, 0x13a0f23d

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v0, v2}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_1
    move v2, v6

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_2

    move/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    move/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_8

    move/from16 v9, p3

    invoke-virtual {v0, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v2, v10

    :goto_7
    and-int/lit8 v10, p7, 0x10

    const/16 v11, 0x4000

    if-eqz v10, :cond_c

    or-int/lit16 v2, v2, 0x6000

    :cond_b
    move-object/from16 v12, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v12, v6, 0x6000

    if-nez v12, :cond_b

    move-object/from16 v12, p4

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    move v13, v11

    goto :goto_8

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v2, v13

    :goto_9
    and-int/lit16 v13, v2, 0x2493

    const/16 v14, 0x2492

    const/4 v15, 0x0

    if-eq v13, v14, :cond_e

    const/4 v13, 0x1

    goto :goto_a

    :cond_e
    move v13, v15

    :goto_a
    and-int/lit8 v14, v2, 0x1

    invoke-virtual {v0, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_1c

    if-eqz v3, :cond_f

    const/16 v26, 0x1

    goto :goto_b

    :cond_f
    move/from16 v26, v4

    :goto_b
    if-eqz v5, :cond_10

    move v7, v15

    :cond_10
    if-eqz v8, :cond_11

    move v9, v15

    :cond_11
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_12

    new-instance v4, Leb1/a;

    const/16 v5, 0x17

    invoke-direct {v4, v5}, Leb1/a;-><init>(I)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lc93/a;

    move-object v12, v4

    :cond_13
    if-eqz v7, :cond_14

    sget-object v4, Lc31/d;->LOADING:Lc31/d;

    :goto_c
    move-object/from16 v17, v4

    goto :goto_d

    :cond_14
    invoke-virtual {v1}, Leg2/k;->getButtonState()Lc31/d;

    move-result-object v4

    goto :goto_c

    :goto_d
    invoke-virtual {v1}, Leg2/k;->getButtonText()Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v1}, Leg2/k;->getFilledCount()I

    move-result v24

    sget-object v22, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    const/4 v4, 0x0

    if-nez v9, :cond_16

    if-nez v26, :cond_15

    goto :goto_e

    :cond_15
    sget-object v5, Leg2/e;->a:Li2/t;

    move-object/from16 v29, v5

    goto :goto_f

    :cond_16
    :goto_e
    move-object/from16 v29, v4

    :goto_f
    if-eqz v9, :cond_18

    sget-object v4, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    :cond_17
    :goto_10
    move-object/from16 v28, v4

    goto :goto_11

    :cond_18
    if-nez v26, :cond_17

    sget-object v4, Ly81/f;->BACKGROUND_DARK_ALT:Ly81/f;

    goto :goto_10

    :goto_11
    sget-object v19, Ly81/f;->BRAND_WHITE:Ly81/f;

    new-instance v16, Lc31/k;

    const v34, 0x1c518

    const/16 v35, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x64

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v30, v19

    invoke-direct/range {v16 .. v35}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v16

    const v5, 0xe000

    and-int/2addr v2, v5

    if-ne v2, v11, :cond_19

    const/4 v2, 0x1

    goto :goto_12

    :cond_19
    move v2, v15

    :goto_12
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_1a

    if-ne v5, v3, :cond_1b

    :cond_1a
    new-instance v5, Laz1/b;

    const/16 v2, 0x11

    invoke-direct {v5, v12, v2}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget v2, Lc31/k;->r:I

    invoke-static {v4, v5, v0, v2, v15}, Lc31/j;->e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move/from16 v2, v26

    :goto_13
    move v3, v7

    move v4, v9

    move-object v5, v12

    goto :goto_14

    :cond_1c
    invoke-virtual {v0}, Lp1/q;->X()V

    move v2, v4

    goto :goto_13

    :goto_14
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1d

    new-instance v0, Leg2/d;

    const/4 v8, 0x1

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Leg2/d;-><init>(Leg2/k;ZZZLc93/a;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final l()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lc93/a;Lc31/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Leg2/k;ZZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Leg2/e;->k(Leg2/k;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
