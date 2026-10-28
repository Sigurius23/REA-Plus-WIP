.class public abstract Ly11/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a-\u0010\u0015\u001a\u00020\u00042\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001b\"\u0014\u0010\"\u001a\u00020\r8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001b\u00a8\u0006#"
    }
    d2 = {
        "Ly11/d;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "o",
        "(Ly11/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Ly11/f;",
        "barData",
        "",
        "showGradient",
        "k",
        "(Ly11/f;ZLandroidx/compose/runtime/Composer;I)V",
        "",
        "barSum",
        "m",
        "(Ly11/f;FLandroidx/compose/runtime/Composer;I)V",
        "",
        "Ly11/e;",
        "segments",
        "segmentSum",
        "h",
        "(Ljava/util/List;FZLandroidx/compose/runtime/Composer;I)V",
        "q",
        "(Ly11/d;Landroidx/compose/runtime/Composer;I)V",
        "Ly3/f;",
        "a",
        "F",
        "BAR_HEIGHT",
        "b",
        "RADIUS_OF_CARD",
        "c",
        "RADIUS_OF_BAR",
        "d",
        "MIN_BAR_WIDTH",
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

.field private static final b:F

.field private static final c:F

.field private static final d:F = 0.4f


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float v1, v0, v0

    sput v1, Ly11/c;->a:F

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float/2addr v1, v0

    sput v1, Ly11/c;->b:F

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v1

    mul-float/2addr v1, v0

    sput v1, Ly11/c;->c:F

    return-void
.end method

.method public static synthetic a(Ly11/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ly11/c;->s(Ly11/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly11/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ly11/c;->p(Ly11/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly11/f;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ly11/c;->l(Ly11/f;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly11/c;->r(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/util/List;FZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ly11/c;->j(Ljava/util/List;FZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Z[Ll83/k;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ly11/c;->i(Z[Ll83/k;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ly11/f;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ly11/c;->n(Ly11/f;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ljava/util/List;FZLandroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ly11/e;",
            ">;FZ",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p4

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    const v5, -0x7b7012bc

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v3, 0x6

    const/4 v6, 0x2

    const/4 v7, 0x4

    if-nez v5, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    and-int/lit8 v8, v3, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v4, v1}, Lp1/q;->d(F)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_3
    and-int/lit16 v8, v3, 0x180

    const/16 v9, 0x100

    if-nez v8, :cond_5

    invoke-virtual {v4, v2}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v9

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v5, v8

    :cond_5
    and-int/lit16 v8, v5, 0x93

    const/16 v10, 0x92

    if-eq v8, v10, :cond_6

    const/4 v8, 0x1

    goto :goto_4

    :cond_6
    const/4 v8, 0x0

    :goto_4
    and-int/lit8 v10, v5, 0x1

    invoke-virtual {v4, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_19

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    sget-object v13, Lx81/d;->a:Lx81/d;

    const/4 v14, 0x6

    invoke-virtual {v13, v4, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->s()J

    move-result-wide v11

    const v15, 0x3f19999a    # 0.6f

    invoke-static {v15, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v11

    new-instance v15, Li2/x;

    invoke-direct {v15, v11, v12}, Li2/x;-><init>(J)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v10, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v10, 0x3f000000    # 0.5f

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v13, v4, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->V0()J

    move-result-wide v12

    new-instance v15, Li2/x;

    invoke-direct {v15, v12, v13}, Li2/x;-><init>(J)V

    new-instance v12, Ll83/k;

    invoke-direct {v12, v10, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v11, v12}, [Ll83/k;

    move-result-object v10

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget v15, Ly11/c;->a:F

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget v15, Ly11/c;->c:F

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v15

    invoke-static {v13, v15}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    and-int/lit16 v5, v5, 0x380

    if-ne v5, v9, :cond_7

    const/4 v5, 0x1

    goto :goto_5

    :cond_7
    const/4 v5, 0x0

    :goto_5
    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v5, v9

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_8

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v9, v5, :cond_9

    :cond_8
    new-instance v9, Las1/f;

    const/16 v5, 0x9

    invoke-direct {v9, v2, v10, v5}, Las1/f;-><init>(ZLjava/lang/Object;I)V

    invoke-virtual {v4, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v13, v9}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide/high16 v9, 0x3fd0000000000000L    # 0.25

    double-to-float v9, v9

    int-to-float v7, v7

    mul-float/2addr v9, v7

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v9, Lb2/e;->J:Lb2/l;

    invoke-static {v7, v9, v4, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v9, v4, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v4, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v4, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v9, v4, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v4, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, -0x69030334

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    move-object v5, v0

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_18

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly11/e;

    cmpl-float v9, v1, v8

    if-lez v9, :cond_d

    invoke-interface {v7}, Ly11/e;->a()F

    move-result v9

    div-float/2addr v9, v1

    goto :goto_8

    :cond_d
    move v9, v8

    :goto_8
    cmpl-float v10, v9, v8

    if-lez v10, :cond_17

    const v10, 0x76666dc4

    invoke-virtual {v4, v10}, Lp1/q;->e0(I)V

    instance-of v10, v7, Ly11/e$a;

    const-string v15, "invalid weight; must be greater than zero"

    const-wide/16 v16, 0x0

    if-eqz v10, :cond_10

    const v10, 0x76674702

    invoke-virtual {v4, v10}, Lp1/q;->e0(I)V

    const v18, 0x7f7fffff    # Float.MAX_VALUE

    float-to-double v13, v9

    cmpl-double v13, v13, v16

    if-lez v13, :cond_e

    goto :goto_9

    :cond_e
    invoke-static {v15}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v14, v9, v18

    if-lez v14, :cond_f

    move/from16 v9, v18

    :cond_f
    const/4 v14, 0x1

    invoke-direct {v13, v9, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v13}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    check-cast v7, Ly11/e$a;

    invoke-virtual {v7}, Ly11/e$a;->b()Ly81/f;

    move-result-object v7

    const/4 v13, 0x0

    invoke-virtual {v7, v4, v13}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v9, v14, v15, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7, v4, v13}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    const/4 v10, 0x6

    goto/16 :goto_c

    :cond_10
    const v18, 0x7f7fffff    # Float.MAX_VALUE

    instance-of v7, v7, Ly11/e$b;

    if-eqz v7, :cond_16

    const v7, 0x766cc146

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    float-to-double v13, v9

    cmpl-double v7, v13, v16

    if-lez v7, :cond_11

    goto :goto_a

    :cond_11
    invoke-static {v15}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v13, v9, v18

    if-lez v13, :cond_12

    move/from16 v9, v18

    :cond_12
    const/4 v14, 0x1

    invoke-direct {v7, v9, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v7}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lb2/e;->w:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v9, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v13, v4, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v4, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-eqz v8, :cond_13

    invoke-virtual {v4, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_b
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v4, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v4, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-nez v9, :cond_14

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_15

    :cond_14
    invoke-static {v13, v4, v13, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v4, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v10, 0x6

    invoke-static {v7, v8, v4, v10, v6}, Lzy0/f;->c(Landroidx/compose/ui/Modifier;Li2/a1;Landroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x1

    invoke-virtual {v4, v14}, Lp1/q;->q(Z)V

    const/4 v13, 0x0

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_16
    const/4 v13, 0x0

    const v0, 0xc13d1fe

    invoke-static {v0, v4, v13}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_17
    move v10, v14

    const/4 v13, 0x0

    const v7, 0x76721b92

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    :goto_d
    move v14, v10

    const/4 v8, 0x0

    goto/16 :goto_7

    :cond_18
    const/4 v13, 0x0

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    const/4 v14, 0x1

    invoke-virtual {v4, v14}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_19
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v4

    if-eqz v4, :cond_1a

    new-instance v5, Lg41/c;

    invoke-direct {v5, v0, v1, v2, v3}, Lg41/c;-><init>(Ljava/util/List;FZI)V

    iput-object v5, v4, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final i(Z[Ll83/k;Lk2/c;)Ll83/a0;
    .locals 10

    const-string v2, "$this$drawWithContent"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p2

    check-cast v2, La3/p0;

    invoke-virtual {v2}, La3/p0;->a()V

    if-eqz p0, :cond_0

    sget-object v3, Li2/t;->b:Li2/s;

    array-length v2, p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [Ll83/k;

    const-wide/16 v7, 0x0

    const/16 v9, 0xe

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v9}, Li2/s;->e(Li2/s;[Ll83/k;JJI)Li2/k0;

    move-result-object v0

    const/4 v8, 0x3

    const/16 v9, 0x3e

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    move-object v0, p2

    invoke-static/range {v0 .. v9}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Ljava/util/List;FZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ly11/c;->h(Ljava/util/List;FZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ly11/f;ZLandroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    sget-object v3, Lb2/e;->w:Lb2/m;

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    const v5, 0xb0877f6

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v2, 0x6

    const/4 v6, 0x2

    const/4 v7, 0x4

    if-nez v5, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v8, v2, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v4, v1}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_3
    and-int/lit8 v8, v5, 0x13

    const/16 v9, 0x12

    const/4 v11, 0x1

    if-eq v8, v9, :cond_4

    move v8, v11

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    :goto_3
    and-int/lit8 v9, v5, 0x1

    invoke-virtual {v4, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-virtual {v0}, Ly11/f;->a()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const-wide/16 v12, 0x0

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly11/e;

    invoke-interface {v9}, Ly11/e;->a()F

    move-result v9

    float-to-double v14, v9

    add-double/2addr v12, v14

    goto :goto_4

    :cond_5
    double-to-float v8, v12

    const/4 v9, 0x0

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v8, v9, v12}, Le93/b;->m(FFF)F

    move-result v8

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    int-to-float v14, v11

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v15, v14

    invoke-static {v12, v15, v9, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v7, v7

    mul-float/2addr v14, v7

    invoke-static {v14}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v12, 0x6

    invoke-static {v7, v9, v4, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v14, v4, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_5
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v4, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v4, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-nez v11, :cond_7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    :cond_7
    invoke-static {v9, v4, v9, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v4, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly11/f;->e()Z

    move-result v6

    if-eqz v6, :cond_c

    const v6, -0x1d86d603

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    and-int/lit8 v6, v5, 0xe

    invoke-static {v0, v8, v4, v6}, Ly11/c;->m(Ly11/f;FLandroidx/compose/runtime/Composer;I)V

    invoke-static {v8, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v10, 0x0

    invoke-static {v3, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v13, v4, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v4, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_a

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    invoke-static {v10, v4, v10, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v4, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly11/f;->a()Ljava/util/List;

    move-result-object v3

    shl-int/lit8 v5, v5, 0x3

    and-int/lit16 v5, v5, 0x380

    invoke-static {v3, v8, v1, v4, v5}, Ly11/c;->h(Ljava/util/List;FZLandroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    const/4 v10, 0x0

    invoke-virtual {v4, v10}, Lp1/q;->q(Z)V

    const/4 v3, 0x1

    goto :goto_8

    :cond_c
    const/4 v10, 0x0

    const v6, -0x1d834763

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    invoke-static {v8, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v3, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v13, v4, Lp1/q;->S:Z

    if-eqz v13, :cond_d

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v4, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v10, v4, v10, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v4, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly11/f;->a()Ljava/util/List;

    move-result-object v3

    shl-int/lit8 v6, v5, 0x3

    and-int/lit16 v6, v6, 0x380

    invoke-static {v3, v8, v1, v4, v6}, Ly11/c;->h(Ljava/util/List;FZLandroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    and-int/lit8 v5, v5, 0xe

    invoke-static {v0, v8, v4, v5}, Ly11/c;->m(Ly11/f;FLandroidx/compose/runtime/Composer;I)V

    const/4 v10, 0x0

    invoke-virtual {v4, v10}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_11

    new-instance v4, Lam0/b;

    const/16 v5, 0x10

    invoke-direct {v4, v0, v1, v2, v5}, Lam0/b;-><init>(Ljava/lang/Object;ZII)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final l(Ly11/f;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ly11/c;->k(Ly11/f;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Ly11/f;FLandroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x129512de

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->d(F)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit8 v6, v4, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_4

    move v6, v9

    goto :goto_3

    :cond_4
    move v6, v8

    :goto_3
    and-int/2addr v4, v9

    invoke-virtual {v3, v4, v6}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_c

    sget v4, Ly11/c;->d:F

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v1, v4, v6}, Le93/b;->m(FFF)F

    move-result v4

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Lb2/e;->z:Lb2/m;

    invoke-static {v10, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v11, v3, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_5

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v3, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v3, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-nez v15, :cond_6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v11, v3, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v3, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Ll0/m;->g:Ll0/h;

    sget-object v11, Lb2/e;->K:Lb2/l;

    const/16 v15, 0x36

    invoke-static {v7, v11, v3, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_8

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v3, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_9

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v5, v3, v5, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v3, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly11/f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v3, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v3, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->s()Lb91/a;

    move-result-object v23

    invoke-virtual {v5, v3, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v9

    const/high16 v15, 0x3f800000    # 1.0f

    float-to-double v11, v15

    const-wide/16 v13, 0x0

    cmpl-double v7, v11, v13

    if-lez v7, :cond_b

    goto :goto_6

    :cond_b
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v7, v15, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v11, 0x2

    int-to-float v11, v11

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v20, v11, v12

    const/16 v21, 0x0

    const/16 v22, 0xb

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v7

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v27, 0xc00

    const v28, 0x2dff8

    move-object/from16 v25, v3

    move-object v3, v4

    move-object v4, v7

    move v11, v8

    const-wide/16 v7, 0x0

    move v12, v6

    move-wide/from16 v32, v9

    move-object v10, v5

    move-wide/from16 v5, v32

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move v14, v11

    const/4 v11, 0x0

    move/from16 v16, v12

    move-object v15, v13

    const-wide/16 v12, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v20, v16

    move/from16 v19, v17

    const-wide/16 v16, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v24, v20

    const/16 v20, 0x2

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v29, v22

    const/16 v22, 0x0

    move/from16 v30, v24

    const/16 v24, 0x0

    move-object/from16 v31, v26

    const/16 v26, 0x0

    move/from16 v1, v29

    move-object/from16 v0, v31

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual/range {p0 .. p0}, Ly11/f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v3, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/4 v12, 0x6

    invoke-virtual {v0, v3, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->D()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v3, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v5

    const v28, 0x2dffa

    const/4 v4, 0x0

    const-wide/16 v12, 0x0

    const/16 v20, 0x1

    move-object v3, v1

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Lbd1/s;

    const/4 v3, 0x4

    move-object/from16 v4, p0

    move/from16 v5, p1

    invoke-direct {v1, v4, v5, v2, v3}, Lbd1/s;-><init>(Lm91/u;FII)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final n(Ly11/f;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ly11/c;->m(Ly11/f;FLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Ly11/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, Lp1/q;

    const v2, 0x73712333

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v0, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_2

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :cond_4
    :goto_3
    and-int/lit8 v6, v2, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    and-int/lit8 v7, v2, 0x1

    invoke-virtual {v0, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_b

    if-eqz v4, :cond_6

    sget-object v4, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_6
    move-object v4, p1

    :goto_5
    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x3

    int-to-float v6, v6

    int-to-float v3, v3

    mul-float/2addr v6, v3

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v3, v6, v0, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v0, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v6, v0, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x10a8911a

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Ly11/d;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly11/f;

    invoke-virtual {p0}, Ly11/d;->c()Z

    move-result v6

    invoke-static {v5, v6, v0, v8}, Ly11/c;->k(Ly11/f;ZLandroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :cond_a
    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    and-int/lit8 v2, v2, 0xe

    invoke-static {p0, v0, v2}, Ly11/c;->q(Ly11/d;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    move-object v3, v4

    goto :goto_8

    :cond_b
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v3, p1

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Lwq1/b;

    const/16 v5, 0xf

    move-object v1, p0

    move v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lwq1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final p(Ly11/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ly11/c;->o(Ly11/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ly11/d;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x51ce600a

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v6, v5, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    move v6, v8

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-virtual {v0}, Ly11/d;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_e

    const v3, -0x20e3b663

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v3, v2, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->r()J

    move-result-wide v9

    sget v3, Ly11/c;->b:F

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v9, v10, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v9, v9

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v9, v10

    invoke-static {v9, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v12, v2, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-eqz v14, :cond_3

    invoke-virtual {v2, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v2, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v2, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v2, Lp1/q;->S:Z

    if-nez v15, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    :cond_4
    invoke-static {v10, v2, v10, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v2, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v3, v5

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v2, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v2, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v2, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v15, v2, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v2, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v2, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v2, Lp1/q;->S:Z

    if-nez v3, :cond_7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    invoke-static {v4, v2, v4, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v2, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x31cfb601

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ly11/d;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v28

    :goto_5
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly11/s;

    sget-object v4, Lb2/e;->K:Lb2/l;

    sget-object v5, Ll0/m;->g:Ll0/h;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v9, 0x36

    invoke-static {v5, v4, v2, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v9, v2, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v2, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v2, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_6
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v2, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v2, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-nez v9, :cond_a

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    invoke-static {v5, v2, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v2, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v4, Ln21/d;

    invoke-direct {v4}, Ln21/d;-><init>()V

    invoke-virtual {v3}, Ly11/s;->a()Ln21/e;

    move-result-object v5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v7, v9, :cond_c

    new-instance v7, Lxl0/b;

    const/16 v9, 0x16

    invoke-direct {v7, v9}, Lxl0/b;-><init>(I)V

    invoke-virtual {v2, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    invoke-virtual {v4, v5, v7, v2, v9}, Ln21/d;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3}, Ly11/s;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v2, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v2, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->E()Lb91/a;

    move-result-object v22

    invoke-virtual {v3}, Ly11/s;->a()Ln21/e;

    move-result-object v3

    invoke-virtual {v3}, Ln21/e;->m()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v2, v8}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    const/16 v26, 0x0

    const v27, 0x2fff8

    move v3, v6

    const-wide/16 v6, 0x0

    move v5, v8

    const/4 v8, 0x0

    move-object/from16 v24, v2

    move-object v2, v4

    move-wide/from16 v31, v9

    move v10, v5

    move-wide/from16 v4, v31

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v14, v3

    move-object v3, v11

    move v13, v12

    const-wide/16 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    move/from16 v18, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move/from16 v30, v25

    const/16 v25, 0x30

    move/from16 v1, v30

    const/4 v0, 0x1

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    move-object/from16 v0, p0

    move v8, v1

    move-object v11, v3

    move/from16 v6, v29

    goto/16 :goto_5

    :cond_d
    move v1, v8

    const/4 v0, 0x1

    invoke-static {v2, v1, v0, v0, v1}, Lb9/y;->B(Lp1/q;ZZZZ)V

    goto :goto_7

    :cond_e
    move v1, v8

    const v0, -0x20d3d4e8

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_f
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_10

    new-instance v1, Lwr0/y;

    const/4 v2, 0x4

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lwr0/y;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final r(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Ly11/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ly11/c;->q(Ly11/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
