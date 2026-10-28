.class public abstract Lwz0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a#\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a=\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0016H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\"\u0017\u0010\"\u001a\u00020\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006)\u00b2\u0006\u000e\u0010\u001a\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010#\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010$\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010%\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\'\u001a\u00020&8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010(\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lwz0/e;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "k",
        "(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Lwz0/f;",
        "steps",
        "",
        "Lv41/r0;",
        "S",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/Set;",
        "resource",
        "",
        "playToken",
        "",
        "frozen",
        "Lkotlin/Function0;",
        "onFinished",
        "A",
        "(Landroidx/compose/ui/Modifier;Lv41/r0;IZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "play",
        "T",
        "(Lwz0/e;I)I",
        "Ly3/f;",
        "a",
        "F",
        "R",
        "()F",
        "DEFAULT_ANIMATED_SEQUENCE_HEIGHT",
        "completed",
        "animationFinished",
        "minimumDurationElapsed",
        "Lv41/s;",
        "loadingState",
        "atEnd",
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
    .locals 1

    const/16 v0, 0xc8

    int-to-float v0, v0

    sput v0, Lwz0/d;->a:F

    return-void
.end method

.method private static final A(Landroidx/compose/ui/Modifier;Lv41/r0;IZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lv41/r0;",
            "IZ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move/from16 v0, p3

    move-object/from16 v2, p4

    move/from16 v3, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v4, 0x64a7a3b2

    invoke-virtual {v12, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v5, v3

    :goto_1
    and-int/lit8 v6, v3, 0x30

    if-nez v6, :cond_4

    and-int/lit8 v6, v3, 0x40

    if-nez v6, :cond_2

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_2
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v3, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_6

    move/from16 v6, p2

    invoke-virtual {v12, v6}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v7

    goto :goto_4

    :cond_5
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v5, v8

    goto :goto_5

    :cond_6
    move/from16 v6, p2

    :goto_5
    and-int/lit16 v8, v3, 0xc00

    if-nez v8, :cond_8

    invoke-virtual {v12, v0}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x800

    goto :goto_6

    :cond_7
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v5, v8

    :cond_8
    and-int/lit16 v8, v3, 0x6000

    if-nez v8, :cond_a

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x4000

    goto :goto_7

    :cond_9
    const/16 v8, 0x2000

    :goto_7
    or-int/2addr v5, v8

    :cond_a
    and-int/lit16 v8, v5, 0x2493

    const/16 v10, 0x2492

    const/16 v16, 0x0

    const/16 v17, 0x1

    if-eq v8, v10, :cond_b

    move/from16 v8, v17

    goto :goto_8

    :cond_b
    move/from16 v8, v16

    :goto_8
    and-int/lit8 v10, v5, 0x1

    invoke-virtual {v12, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1a

    and-int/lit16 v8, v5, 0x380

    if-ne v8, v7, :cond_c

    move/from16 v10, v17

    goto :goto_9

    :cond_c
    move/from16 v10, v16

    :goto_9
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v10, :cond_d

    if-ne v11, v13, :cond_e

    :cond_d
    sget-object v10, Lv41/s;->LOADING:Lv41/s;

    invoke-static {v10}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v10, v11

    check-cast v10, Lp1/c1;

    invoke-static {v10}, Lwz0/d;->B(Lp1/c1;)Lv41/s;

    move-result-object v11

    if-ne v8, v7, :cond_f

    move/from16 v7, v17

    goto :goto_a

    :cond_f
    move/from16 v7, v16

    :goto_a
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v12, v8}, Lp1/q;->e(I)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_10

    if-ne v8, v13, :cond_11

    :cond_10
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v7, v8

    check-cast v7, Lp1/c1;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    const/4 v11, 0x0

    if-eqz v0, :cond_12

    goto :goto_b

    :cond_12
    move-object v8, v11

    :goto_b
    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_13

    if-ne v15, v13, :cond_14

    :cond_13
    new-instance v15, Lq12/c;

    const/16 v14, 0x1c

    invoke-direct {v15, v14, v10}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v12, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v14, :cond_15

    if-ne v9, v13, :cond_16

    :cond_15
    new-instance v9, Luz1/g;

    const/16 v14, 0xf

    invoke-direct {v9, v14, v7}, Luz1/g;-><init>(ILp1/c1;)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v9, Lc93/a;

    const/high16 v14, 0x180000

    and-int/lit8 v18, v5, 0xe

    or-int v14, v18, v14

    and-int/lit8 v18, v5, 0x70

    or-int v14, v14, v18

    move-object/from16 v18, v13

    move v13, v14

    const/4 v14, 0x0

    move-object/from16 v19, v10

    move-object v10, v15

    const/16 v15, 0x2bc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move/from16 v20, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object/from16 v21, v7

    const/4 v7, 0x0

    move-object/from16 v22, v11

    move-object v11, v9

    const/4 v9, 0x0

    move-object/from16 v0, p0

    move-object/from16 v23, v18

    invoke-static/range {v0 .. v15}, Lv41/q0;->l(Landroidx/compose/ui/Modifier;Lv41/r0;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IZLjava/lang/Float;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v21 .. v21}, Lwz0/d;->E(Lp1/c1;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static/range {v19 .. v19}, Lwz0/d;->B(Lp1/c1;)Lv41/s;

    move-result-object v2

    move-object/from16 v8, v21

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v11, v19

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    const v4, 0xe000

    and-int v4, v20, v4

    const/16 v5, 0x4000

    if-ne v4, v5, :cond_17

    move/from16 v16, v17

    :cond_17
    or-int v3, v3, v16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_19

    move-object/from16 v3, v23

    if-ne v4, v3, :cond_18

    goto :goto_c

    :cond_18
    move-object/from16 v5, p4

    goto :goto_d

    :cond_19
    :goto_c
    new-instance v4, Lwz0/d$c;

    move-object/from16 v5, p4

    const/4 v3, 0x0

    invoke-direct {v4, v5, v8, v11, v3}, Lwz0/d$c;-><init>(Lc93/a;Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v4, Lc93/m;

    invoke-static {v0, v1, v2, v4, v12}, Lp1/x;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    goto :goto_e

    :cond_1a
    move-object v5, v2

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1b

    new-instance v0, Lry2/h;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lry2/h;-><init>(Landroidx/compose/ui/Modifier;Lv41/r0;IZLc93/a;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final B(Lp1/c1;)Lv41/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lv41/s;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv41/s;

    return-object p0
.end method

.method private static final C(Landroidx/compose/ui/Modifier;Lv41/r0;IZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lwz0/d;->A(Landroidx/compose/ui/Modifier;Lv41/r0;IZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/c1;Lv41/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lv41/s;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final E(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final F(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final G(Lp1/c1;Lv41/s;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lwz0/d;->D(Lp1/c1;Lv41/s;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lwz0/d;->F(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic I(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lwz0/d;->n(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic J(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lwz0/d;->o(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic K(Lp1/c1;)I
    .locals 0

    invoke-static {p0}, Lwz0/d;->t(Lp1/c1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic L(Lp1/c1;I)V
    .locals 0

    invoke-static {p0, p1}, Lwz0/d;->u(Lp1/c1;I)V

    return-void
.end method

.method public static final synthetic M(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lwz0/d;->w(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic N(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lwz0/d;->x(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic O(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lwz0/d;->y(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic P(Lp1/c1;)Lv41/s;
    .locals 0

    invoke-static {p0}, Lwz0/d;->B(Lp1/c1;)Lv41/s;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic Q(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lwz0/d;->E(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final R()F
    .locals 1

    sget v0, Lwz0/d;->a:F

    return v0
.end method

.method private static final S(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lwz0/f;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/Set<",
            "Lv41/r0;",
            ">;"
        }
    .end annotation

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_0

    if-ne v0, v1, :cond_2

    :cond_0
    move-object p2, p0

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwz0/f;

    invoke-virtual {v2}, Lwz0/f;->b()Lv41/r0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Ljava/util/List;

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_3

    if-ne p2, v1, :cond_4

    :cond_3
    new-instance p2, Lz1/s;

    invoke-direct {p2}, Lz1/s;-><init>()V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast p2, Lz1/s;

    const p0, -0x4102fe60

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv41/r0;

    const v2, -0x213b71b6

    invoke-virtual {p1, v2, v0}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-static {v0}, Lv41/p;->u(Lv41/r0;)Lui/y;

    move-result-object v2

    const/16 v3, 0x3e

    invoke-static {v2, p1, v1, v3}, Lq83/g;->T(Lui/y;Lp1/q;II)Lui/r;

    move-result-object v2

    iget-object v2, v2, Lui/r;->E:Lp1/f0;

    invoke-virtual {v2}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, v0, v2}, Lz1/s;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    iget-object p0, p2, Lz1/s;->y:Lz1/m;

    return-object p0
.end method

.method private static final T(Lwz0/e;I)I
    .locals 1

    invoke-virtual {p0}, Lwz0/e;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, Lwz0/e;->c()Li51/a;

    move-result-object p0

    invoke-static {p1, v0, p0}, Lwz0/a;->c(IILi51/a;)I

    move-result p0

    return p0
.end method

.method public static synthetic a(Lwz0/e;Lp1/c1;Lp1/c1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lwz0/d;->p(Lwz0/e;Lp1/c1;Lp1/c1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lv41/r0;IZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lwz0/d;->C(Landroidx/compose/ui/Modifier;Lv41/r0;IZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwz0/d;->q(ILp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Lv41/s;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwz0/d;->G(Lp1/c1;Lv41/s;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwz0/d;->H(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwz0/d;->l(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lwz0/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lwz0/d;->r(Lwz0/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwz0/d;->s(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Lp1/c1;
    .locals 1

    invoke-static {}, Lwz0/d;->m()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()Lp1/c1;
    .locals 1

    invoke-static {}, Lwz0/d;->v()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method public static final k(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lwz0/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x43ff3c4e

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v5, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v5, 0x93

    const/16 v8, 0x92

    const/4 v14, 0x0

    if-eq v6, v8, :cond_7

    const/4 v6, 0x1

    goto :goto_4

    :cond_7
    move v6, v14

    :goto_4
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v11, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_21

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_8

    move-object v1, v6

    :cond_8
    invoke-virtual {v2}, Lwz0/e;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_22

    new-instance v0, Lwz0/c;

    const/4 v6, 0x0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lwz0/c;-><init>(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;III)V

    :goto_5
    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_9
    invoke-virtual {v2}, Lwz0/e;->e()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v11, v14}, Lwz0/d;->S(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v2}, Lwz0/e;->e()Ljava/util/List;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v4, v8, :cond_a

    new-instance v4, Lwr1/f;

    const/16 v9, 0xb

    invoke-direct {v4, v9}, Lwr1/f;-><init>(I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lc93/a;

    const/16 v9, 0x30

    invoke-static {v3, v4, v11, v9}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/c1;

    invoke-virtual {v2}, Lwz0/e;->e()Ljava/util/List;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v8, :cond_b

    new-instance v10, Lwr1/f;

    const/16 v15, 0xc

    invoke-direct {v10, v15}, Lwr1/f;-><init>(I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v10, Lc93/a;

    invoke-static {v4, v10, v11, v9}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp1/c1;

    invoke-static {v3}, Lwz0/d;->t(Lp1/c1;)I

    move-result v9

    invoke-static {v2, v9}, Lwz0/d;->T(Lwz0/e;I)I

    move-result v9

    invoke-virtual {v2}, Lwz0/e;->e()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwz0/f;

    invoke-virtual {v10}, Lwz0/f;->b()Lv41/r0;

    move-result-object v15

    invoke-interface {v0, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10}, Lwz0/f;->c()Ljava/lang/Long;

    move-result-object v15

    invoke-static {v15, v0}, Lwz0/a;->a(Ljava/lang/Long;Z)Ljava/lang/Long;

    move-result-object v15

    invoke-static {v3}, Lwz0/d;->t(Lp1/c1;)I

    move-result v12

    invoke-virtual {v11, v12}, Lp1/q;->e(I)Z

    move-result v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_c

    if-ne v13, v8, :cond_d

    :cond_c
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v13, Lp1/c1;

    invoke-static {v3}, Lwz0/d;->t(Lp1/c1;)I

    move-result v12

    invoke-virtual {v11, v12}, Lp1/q;->e(I)Z

    move-result v12

    invoke-virtual {v11, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v12, v12, v17

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v12, :cond_e

    if-ne v14, v8, :cond_10

    :cond_e
    if-nez v15, :cond_f

    const/4 v12, 0x1

    goto :goto_6

    :cond_f
    const/4 v12, 0x0

    :goto_6
    invoke-static {v12, v11}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v14

    :cond_10
    check-cast v14, Lp1/c1;

    invoke-static {v3}, Lwz0/d;->t(Lp1/c1;)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    invoke-virtual {v11, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    or-int v18, v18, v19

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v18, :cond_12

    if-ne v7, v8, :cond_11

    goto :goto_7

    :cond_11
    move-object/from16 p0, v1

    goto :goto_8

    :cond_12
    :goto_7
    new-instance v7, Lwz0/d$a;

    move-object/from16 p0, v1

    const/4 v1, 0x0

    invoke-direct {v7, v15, v14, v1}, Lwz0/d$a;-><init>(Ljava/lang/Long;Lp1/c1;Lq83/d;)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    check-cast v7, Lc93/m;

    invoke-static {v12, v15, v7, v11}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-static {v3}, Lwz0/d;->t(Lp1/c1;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v13}, Lwz0/d;->y(Lp1/c1;)Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v14}, Lwz0/d;->n(Lp1/c1;)Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-static {v4}, Lwz0/d;->w(Lp1/c1;)Z

    move-result v18

    move-object/from16 v20, v6

    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    filled-new-array {v1, v7, v12, v15, v6}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v11, v9}, Lp1/q;->e(I)Z

    move-result v6

    or-int/2addr v1, v6

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v1, v6

    invoke-virtual {v11, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v1, v6

    invoke-virtual {v11, v0}, Lp1/q;->h(Z)Z

    move-result v6

    or-int/2addr v1, v6

    invoke-virtual {v11, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v1, v6

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v1, v6

    and-int/lit16 v5, v5, 0x380

    const/16 v6, 0x100

    if-ne v5, v6, :cond_13

    const/4 v5, 0x1

    goto :goto_9

    :cond_13
    const/4 v5, 0x0

    :goto_9
    or-int/2addr v1, v5

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_14

    if-ne v5, v8, :cond_15

    :cond_14
    move v1, v9

    move-object v9, v3

    move v3, v0

    goto :goto_a

    :cond_15
    move-object v9, v2

    move-object v15, v3

    move-object v7, v13

    move-object/from16 v14, v20

    move-object/from16 v13, p0

    goto :goto_b

    :goto_a
    new-instance v0, Lwz0/d$b;

    move-object v6, v4

    move-object v4, v10

    const/4 v10, 0x0

    move-object/from16 v5, p2

    move-object v7, v13

    move-object v8, v14

    move-object/from16 v14, v20

    move-object/from16 v13, p0

    invoke-direct/range {v0 .. v10}, Lwz0/d$b;-><init>(ILwz0/e;ZLwz0/f;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

    move-object v15, v9

    move-object v9, v2

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :goto_b
    check-cast v5, Lc93/m;

    invoke-static {v12, v5, v11}, Lp1/x;->j([Ljava/lang/Object;Lc93/m;Lp1/q;)V

    sget-object v0, Ld0/b0;->a:Ld0/v;

    const/16 v12, 0x258

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v12, v2, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v3

    const-string v1, "AnimatedSequence"

    invoke-static {v13, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    const/4 v4, 0x3

    int-to-float v4, v4

    const/4 v5, 0x4

    int-to-float v5, v5

    const/16 v6, 0x36

    invoke-static {v4, v5, v2, v11, v6}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v2

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_16

    invoke-virtual {v11, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_16
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_c
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v11, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v11, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_17

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v16, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_18

    goto :goto_d

    :cond_17
    move-object/from16 v16, v3

    :goto_d
    invoke-static {v4, v11, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v12, La3/k;->d:La3/i;

    invoke-static {v11, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "AnimatedSequenceAnimation"

    invoke-static {v14, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lwz0/e;->f()Ly3/f;

    move-result-object v3

    if-eqz v3, :cond_19

    iget v3, v3, Ly3/f;->w:F

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-nez v3, :cond_1a

    :cond_19
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    :cond_1a
    invoke-interface {v1, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lwz0/e;->a()F

    move-result v3

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->w:Lb2/m;

    move-object/from16 v18, v13

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-object/from16 v19, v3

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_1b

    invoke-virtual {v11, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_1b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v11, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_1c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    :cond_1c
    invoke-static {v3, v11, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v11, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15}, Lwz0/d;->t(Lp1/c1;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, Lno0/h;

    const/16 v4, 0x1a

    invoke-direct {v3, v9, v15, v7, v4}, Lno0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v4, 0x6c8f31b4

    invoke-static {v4, v11, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v7, 0x6c00

    move-object v4, v8

    const/4 v8, 0x2

    move-object v10, v2

    const/4 v2, 0x0

    move-object v13, v4

    const-string v4, "AnimatedSequenceLottie"

    move-object v9, v5

    move-object v5, v3

    move-object/from16 v3, v16

    move-object/from16 v16, v15

    move-object v15, v9

    move-object v9, v10

    move-object v10, v6

    move-object v6, v11

    move-object v11, v9

    move-object/from16 v9, v19

    invoke-static/range {v1 .. v8}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    const/16 v1, 0x258

    const/4 v2, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v4, v0, v2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    invoke-static {v14, v0, v2}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_1e

    invoke-virtual {v6, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1e
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v6, v13, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_1f

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    :cond_1f
    invoke-static {v2, v6, v2, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    invoke-static {v6, v12, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Lwz0/d;->t(Lp1/c1;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v0, Lvv2/d;

    const/4 v2, 0x6

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    invoke-direct {v0, v2, v9, v10}, Lvv2/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x2b4420eb

    invoke-static {v2, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x6c00

    const/4 v8, 0x2

    const/4 v2, 0x0

    const-string v4, "AnimatedSequenceContent"

    invoke-static/range {v1 .. v8}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, v18

    goto :goto_10

    :cond_21
    move-object v9, v2

    move-object v10, v3

    move-object v6, v11

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_22

    new-instance v0, Lwz0/c;

    const/4 v6, 0x1

    move/from16 v4, p4

    move/from16 v5, p5

    move-object v2, v9

    move-object v3, v10

    invoke-direct/range {v0 .. v6}, Lwz0/c;-><init>(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;III)V

    goto/16 :goto_5

    :cond_22
    return-void
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lwz0/d;->k(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m()Lp1/c1;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final n(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final o(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final p(Lwz0/e;Lp1/c1;Lp1/c1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v3, p5, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p3}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p5, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p5

    :goto_1
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_2

    move v5, v8

    goto :goto_2

    :cond_2
    move v5, v7

    :goto_2
    and-int/lit8 v6, v3, 0x1

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_7

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {p0}, Lwz0/e;->e()Ljava/util/List;

    move-result-object v6

    invoke-static {p0, p3}, Lwz0/d;->T(Lwz0/e;I)I

    move-result v11

    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwz0/f;

    invoke-virtual {v6}, Lwz0/f;->b()Lv41/r0;

    move-result-object v6

    invoke-virtual {p0}, Lwz0/e;->c()Li51/a;

    move-result-object v10

    sget-object v11, Li51/a;->OFF:Li51/a;

    if-ne v10, v11, :cond_3

    move v10, v3

    move v3, v8

    goto :goto_3

    :cond_3
    move v10, v3

    move v3, v7

    :goto_3
    and-int/lit8 v11, v10, 0xe

    if-ne v11, v4, :cond_4

    move v7, v8

    :cond_4
    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v7

    invoke-virtual {v9, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_5

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v7, v4, :cond_6

    :cond_5
    new-instance v7, La41/h;

    invoke-direct {v7, p3, p1, p2}, La41/h;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v4, v7

    check-cast v4, Lc93/a;

    shl-int/lit8 v0, v10, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v0, v0, 0x6

    move v2, p3

    move-object v1, v6

    move v6, v0

    move-object v0, v5

    move-object v5, v9

    invoke-static/range {v0 .. v6}, Lwz0/d;->A(Landroidx/compose/ui/Modifier;Lv41/r0;IZLc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_7
    move-object v5, v9

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q(ILp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lwz0/d;->t(Lp1/c1;)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    invoke-static {p2, p0}, Lwz0/d;->z(Lp1/c1;Z)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lwz0/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p2}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p4, v0

    :cond_1
    and-int/lit8 v0, p4, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v3

    :goto_1
    and-int/2addr p4, v2

    move-object v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p0}, Lwz0/e;->e()Ljava/util/List;

    move-result-object p3

    invoke-static {p0, p2}, Lwz0/d;->T(Lwz0/e;I)I

    move-result p0

    invoke-interface {p3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwz0/f;

    invoke-virtual {p0}, Lwz0/f;->a()Lm91/o;

    move-result-object v4

    if-nez v4, :cond_3

    const p0, -0x12cc1c3d

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_3
    const p0, -0x12cc1c3c

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v4 .. v10}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lwz0/d;->k(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lp1/c1;)I
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

.method private static final u(Lp1/c1;I)V
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

.method private static final v()Lp1/c1;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final w(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final x(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final y(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final z(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
