.class public abstract Lbm0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000eH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u001d\u0010\u0019\u001a\u00020\u00062\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001a\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u0002*\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0002*\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008#\u0010\"\u001a\u0013\u0010$\u001a\u00020\u0002*\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008$\u0010\"\u00a8\u0006&\u00b2\u0006\u000e\u0010%\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lbm0/s;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "v",
        "(Lbm0/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lbm0/d;",
        "buttonState",
        "",
        "isSelected",
        "Lkotlin/Function0;",
        "onClickAction",
        "l",
        "(Lbm0/d;ZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Lbm0/c;",
        "targetZone",
        "t",
        "(Lbm0/c;Landroidx/compose/runtime/Composer;I)V",
        "",
        "Lbm0/b;",
        "subtitles",
        "q",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "Lkd1/o;",
        "icon",
        "",
        "title",
        "o",
        "(Lkd1/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "D",
        "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;",
        "E",
        "B",
        "selected",
        "bot_release"
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
.method private static final A(Lbm0/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lbm0/r;->v(Lbm0/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lb72/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lb72/a;-><init>(I)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final C(Lk2/c;)Ll83/a0;
    .locals 13

    const-string v0, "$this$drawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    new-instance v1, Lk2/i;

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    invoke-virtual {v0, v2}, La3/p0;->q0(F)F

    move-result v2

    const/4 v3, 0x2

    new-array v3, v3, [F

    fill-array-data v3, :array_0

    new-instance v6, Li2/k;

    new-instance v4, Landroid/graphics/DashPathEffect;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v6, v4}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v7, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lk2/i;-><init>(FFIILi2/t0;I)V

    sget-object v2, Ly81/f;->WHITE_50:Ly81/f;

    invoke-virtual {v2}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v2

    const/4 v4, 0x3

    int-to-float v4, v4

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-virtual {v0, v4}, La3/p0;->q0(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v6, v0

    const/16 v0, 0x20

    shl-long/2addr v4, v0

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    or-long v8, v4, v6

    const/4 v11, 0x0

    const/16 v12, 0xe6

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v10, v1

    move-object v1, p0

    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method

.method private static final D(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 4

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v1

    const/4 v2, 0x3

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v0, p0, v1, v2}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lb72/a;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lb72/a;-><init>(I)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final F(Lk2/c;)Ll83/a0;
    .locals 12

    const-string v0, "$this$drawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    new-instance v1, Lk2/i;

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    invoke-virtual {v0, v2}, La3/p0;->q0(F)F

    move-result v2

    const/4 v3, 0x2

    new-array v3, v3, [F

    fill-array-data v3, :array_0

    new-instance v6, Li2/k;

    new-instance v4, Landroid/graphics/DashPathEffect;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v6, v4}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v7, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lk2/i;-><init>(FFIILi2/t0;I)V

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v2

    const/4 v3, 0x3

    int-to-float v3, v3

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-virtual {v0, v3}, La3/p0;->q0(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    const/16 v0, 0x20

    shl-long/2addr v3, v0

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long v7, v3, v5

    const/4 v9, 0x0

    const/16 v11, 0xd6

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v10, v1

    move-object v1, p0

    invoke-static/range {v1 .. v11}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method

.method public static synthetic a(Lbm0/d;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lbm0/r;->n(Lbm0/d;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lbm0/s;Ljava/lang/String;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbm0/r;->z(Lkotlin/jvm/functions/Function1;Lbm0/s;Ljava/lang/String;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbm0/r;->s(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbm0/r;->w(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3, p4}, Lbm0/r;->p(Lkd1/o;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/util/List;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbm0/r;->r(Ljava/util/List;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lbm0/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbm0/r;->A(Lbm0/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lbm0/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbm0/r;->u(Lbm0/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbm0/r;->m(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbm0/r;->F(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbm0/r;->C(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lbm0/d;ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbm0/d;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, 0x3ac6f469

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v5, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v5

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_6

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v7

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :cond_6
    and-int/lit16 v6, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v6, v8, :cond_7

    move v6, v9

    goto :goto_5

    :cond_7
    move v6, v10

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v13, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_8

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v8

    int-to-float v11, v5

    mul-float/2addr v11, v11

    invoke-static {v11}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v6, v8, v11, v12, v5}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    :cond_8
    move-object/from16 v16, v6

    if-eqz v2, :cond_9

    const v5, -0x5b245a0c

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->V0()J

    move-result-wide v5

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v5, -0x5b2455ad

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-static {v5, v13, v6, v10}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v5

    :goto_6
    if-eqz v2, :cond_a

    const v8, -0x5b244d8d

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-static {v8, v13, v11, v10}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    goto :goto_7

    :cond_a
    const v8, -0x5b24494d

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-static {v8, v13, v11, v10}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    :goto_7
    if-eqz v2, :cond_b

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/a;->b()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :goto_8
    move-object/from16 v17, v8

    goto :goto_9

    :cond_b
    const/4 v8, 0x0

    goto :goto_8

    :goto_9
    if-eqz v2, :cond_c

    invoke-virtual {v1}, Lbm0/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    :goto_a
    move-object/from16 v18, v8

    goto :goto_b

    :cond_c
    invoke-virtual {v1}, Lbm0/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    goto :goto_a

    :goto_b
    sget-object v8, Lg1/v0;->a:Ll0/l1;

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v8, v13, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->X0()J

    move-result-wide v19

    invoke-virtual {v8, v13, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->W0()J

    move-result-wide v14

    move v8, v9

    move-wide/from16 v23, v14

    move v15, v10

    move-wide/from16 v9, v23

    const/4 v14, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move v1, v7

    move-wide v7, v11

    move-wide/from16 v11, v19

    invoke-static/range {v5 .. v15}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v12

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v1, :cond_d

    const/4 v9, 0x1

    goto :goto_c

    :cond_d
    move/from16 v9, v21

    :goto_c
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v9, :cond_e

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_f

    :cond_e
    new-instance v0, Lbm0/i;

    const/4 v8, 0x1

    invoke-direct {v0, v3, v8}, Lbm0/i;-><init>(Lc93/a;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v0, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v20, v1, 0x12

    const/16 v21, 0x0

    const/16 v22, 0x1f36

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v5, v16

    const/16 v16, 0x0

    move-object/from16 v8, v17

    const/16 v17, 0x0

    move-object/from16 v11, v18

    move-object/from16 v18, v0

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v19

    goto :goto_d

    :cond_10
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lar2/f;

    const/4 v5, 0x4

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final m(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lbm0/d;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lbm0/r;->l(Lbm0/d;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkd1/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v1, -0x37cf0c0c

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, p3, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int v1, p3, v1

    goto :goto_2

    :cond_2
    move/from16 v1, p3

    :goto_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v1, v3

    :cond_4
    move v15, v1

    and-int/lit8 v1, v15, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x1

    if-eq v1, v7, :cond_5

    move v1, v8

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    and-int/lit8 v3, v15, 0x1

    invoke-virtual {v12, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v4, v8

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v9, 0x6

    invoke-static {v4, v5, v12, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_6

    invoke-virtual {v12, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v12, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v12, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    :cond_7
    invoke-static {v5, v12, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x5

    int-to-float v1, v1

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v1, Lkd1/o;->a:I

    and-int/lit8 v2, v15, 0xe

    or-int v4, v1, v2

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v12

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v0, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v10

    const/16 v13, 0x1b0

    const/4 v14, 0x0

    move v3, v8

    const/4 v8, 0x0

    move/from16 v26, v7

    move-object v7, v1

    move/from16 v1, v26

    invoke-static/range {v7 .. v14}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v0, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    shr-int/lit8 v0, v15, 0x3

    and-int/lit8 v23, v0, 0xe

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v24, v0, 0x12

    const v25, 0x2fffa

    const/4 v1, 0x0

    move v0, v3

    move-wide v2, v4

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v22, v12

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v22

    const/4 v3, 0x1

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    move-object v0, v6

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_a

    new-instance v2, Lbm0/p;

    const/4 v3, 0x0

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v2, v4, v0, v5, v3}, Lbm0/p;-><init>(Lkd1/o;Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final p(Lkd1/o;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lbm0/r;->o(Lkd1/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbm0/b;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v7, p1

    check-cast v7, Lp1/q;

    const p1, 0xe7567d9

    invoke-virtual {v7, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x1

    if-eq v1, v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/2addr p1, v2

    invoke-virtual {v7, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->g:Ll0/h;

    new-instance p1, Lbm0/q;

    invoke-direct {p1, p0}, Lbm0/q;-><init>(Ljava/util/List;)V

    const v2, 0x47ebd554

    invoke-static {v2, v7, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v8, 0x180036

    const/16 v9, 0x3c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lbm0/o;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final r(Ljava/util/List;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    const-string v0, "$this$FlowRow"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbm0/b;

    int-to-float v4, v2

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v6, 0x6

    invoke-static {v4, v5, v3, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v3, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_2
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v3, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v3, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v3, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v3, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lbm0/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v3, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v3, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v6, v3, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v27, v10, 0x12

    const v28, 0x2fffa

    move-object/from16 v25, v3

    move-object v3, v4

    const/4 v4, 0x0

    move v10, v5

    move-object v11, v6

    move-wide v5, v8

    move v9, v7

    const-wide/16 v7, 0x0

    move v12, v9

    const/4 v9, 0x0

    move v13, v10

    const/4 v10, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move/from16 v16, v12

    move v15, v13

    const-wide/16 v12, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v20, v16

    move-object/from16 v19, v17

    const-wide/16 v16, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v26, v21

    const/16 v21, 0x0

    move-object/from16 v29, v22

    const/16 v22, 0x0

    move/from16 v30, v24

    const/16 v24, 0x0

    move/from16 v31, v26

    const/16 v26, 0x0

    move-object/from16 p0, v0

    move-object/from16 p2, v1

    move-object/from16 v0, v29

    move/from16 v1, v30

    move/from16 v2, v31

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual/range {p2 .. p2}, Lbm0/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v3, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v0, v3, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    const/4 v4, 0x0

    move-object v3, v2

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    move v2, v0

    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_4
    invoke-virtual {v3}, Lp1/q;->X()V

    :cond_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final s(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lbm0/r;->q(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lbm0/c;Landroidx/compose/runtime/Composer;I)V
    .locals 46

    move-object/from16 v0, p0

    sget-object v2, Lb2/e;->M:Lb2/k;

    move-object/from16 v3, p1

    check-cast v3, Lp1/q;

    const v4, 0xec10aba

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p2, 0x6

    const/4 v6, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    or-int v4, p2, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v7, v4, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v7, v6, :cond_2

    move v7, v8

    goto :goto_2

    :cond_2
    move v7, v9

    :goto_2
    and-int/2addr v4, v8

    invoke-virtual {v3, v4, v7}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_13

    sget-object v4, Ll0/m;->c:Ll0/g;

    invoke-static {v4, v2, v3, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_3

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v3, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v3, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-nez v15, :cond_4

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v7, v3, v7, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v7, v8

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v15, v7, v12

    const/16 v16, 0x7

    move v7, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v29, v7

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0}, Lbm0/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v12, v3, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v3, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v13, v3, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    sget v15, Lb91/a;->d:I

    shl-int/lit8 v27, v15, 0x12

    const v28, 0x2fff8

    move-object v15, v4

    move-object v4, v7

    move/from16 v16, v8

    const-wide/16 v7, 0x0

    move/from16 v19, v9

    const/4 v9, 0x0

    move-object/from16 v20, v10

    const/4 v10, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v25, v3

    move/from16 v22, v6

    move-object v3, v12

    move-wide/from16 v44, v13

    move-object v14, v5

    move-wide/from16 v5, v44

    const-wide/16 v12, 0x0

    move-object/from16 v24, v14

    const/4 v14, 0x0

    move-object/from16 v26, v15

    const/4 v15, 0x0

    move/from16 v31, v16

    move-object/from16 v30, v17

    const-wide/16 v16, 0x0

    move-object/from16 v32, v18

    const/16 v18, 0x0

    move/from16 v33, v19

    const/16 v19, 0x0

    move-object/from16 v34, v20

    const/16 v20, 0x0

    move-object/from16 v35, v21

    const/16 v21, 0x0

    move/from16 v36, v22

    const/16 v22, 0x0

    move-object/from16 v37, v24

    const/16 v24, 0x0

    move-object/from16 v38, v26

    const/16 v26, 0x30

    move-object/from16 v39, v30

    move-object/from16 v40, v32

    move-object/from16 v42, v34

    move-object/from16 v0, v35

    move/from16 v1, v36

    move-object/from16 v43, v37

    move-object/from16 v41, v38

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->w:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v5, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v3, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_6

    move-object/from16 v8, v39

    invoke-virtual {v3, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_4
    move-object/from16 v8, v40

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    goto :goto_4

    :goto_5
    invoke-static {v3, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v15, v41

    invoke-static {v3, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v3, Lp1/q;->S:Z

    if-nez v5, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    move-object/from16 v5, v42

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v14, v43

    goto :goto_8

    :goto_7
    invoke-static {v6, v3, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_6

    :goto_8
    invoke-static {v3, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lbm0/c;->a()Ljava/lang/Float;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_9

    const v4, 0x6df01d7e

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_9
    const v6, 0x6df01d7f

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    new-instance v6, Lp91/a;

    const/16 v11, 0xc

    const/4 v12, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const v8, 0x3f666666    # 0.9f

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v4, v5, v6}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v6, 0x41200000    # 10.0f

    invoke-static {v6, v4}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x0

    invoke-static {v4, v3, v6, v6}, Lbm0/a;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    :goto_9
    const v4, -0xcf7fea5

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lbm0/c;->c()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v30

    const/4 v9, 0x0

    :goto_a
    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v31, v9, 0x1

    if-ltz v9, :cond_11

    move-object/from16 v32, v4

    check-cast v32, Lbm0/t;

    invoke-virtual/range {p0 .. p0}, Lbm0/c;->c()Ljava/util/List;

    move-result-object v4

    const/4 v6, 0x0

    invoke-interface {v4, v6, v9}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v11, v5

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbm0/t;

    invoke-virtual {v6}, Lbm0/t;->a()F

    move-result v6

    add-float/2addr v11, v6

    goto :goto_b

    :cond_a
    invoke-virtual/range {v32 .. v32}, Lbm0/t;->a()F

    move-result v4

    add-float/2addr v4, v11

    invoke-virtual/range {p0 .. p0}, Lbm0/c;->c()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v6

    if-ge v9, v6, :cond_b

    invoke-virtual/range {v32 .. v32}, Lbm0/t;->a()F

    move-result v6

    const v7, 0x3ba3d70a    # 0.005f

    sub-float/2addr v6, v7

    :goto_c
    move v13, v6

    goto :goto_d

    :cond_b
    invoke-virtual/range {v32 .. v32}, Lbm0/t;->a()F

    move-result v6

    goto :goto_c

    :goto_d
    if-nez v9, :cond_c

    int-to-float v6, v1

    const/4 v7, 0x4

    int-to-float v8, v7

    mul-float/2addr v6, v8

    const/4 v8, 0x6

    invoke-static {v6, v5, v5, v6, v8}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v6

    goto :goto_e

    :cond_c
    const/4 v7, 0x4

    invoke-virtual/range {p0 .. p0}, Lbm0/c;->c()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v6

    if-ne v9, v6, :cond_d

    int-to-float v6, v1

    int-to-float v8, v7

    mul-float/2addr v6, v8

    const/16 v7, 0x9

    invoke-static {v5, v6, v6, v5, v7}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v6

    goto :goto_e

    :cond_d
    sget-object v6, Li2/w0;->a:Li2/v0;

    :goto_e
    sget-object v7, Ll0/m;->c:Ll0/g;

    const/4 v8, 0x0

    invoke-static {v7, v2, v3, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v3, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_e

    invoke-virtual {v3, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_e
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_f
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v3, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v3, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-nez v9, :cond_f

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    :cond_f
    invoke-static {v8, v3, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v3, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v7

    const/4 v8, 0x4

    int-to-float v9, v8

    mul-float/2addr v7, v9

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/16 v16, 0x1a

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move v10, v11

    invoke-virtual/range {v32 .. v32}, Lbm0/t;->b()Ly81/f;

    move-result-object v11

    const/4 v12, 0x0

    invoke-virtual {v11, v3, v12}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    invoke-static {v7, v13, v14, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v3, v12}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    mul-float v13, v6, v29

    const/4 v15, 0x0

    const/16 v16, 0xd

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object v11, v0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v17

    add-float v11, v10, v4

    int-to-float v4, v1

    div-float v18, v11, v4

    sget-object v34, Lp91/a;->e:Lp91/a$a;

    invoke-virtual/range {v34 .. v34}, Lp91/a$a;->b()Lp91/a;

    move-result-object v20

    const/16 v21, 0x2

    const/16 v22, 0x0

    const/16 v19, 0x0

    invoke-static/range {v17 .. v22}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v35, v18

    invoke-virtual/range {v32 .. v32}, Lbm0/t;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v3, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v3, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->F()Lb91/a;

    move-result-object v23

    invoke-virtual/range {v32 .. v32}, Lbm0/t;->b()Ly81/f;

    move-result-object v13

    const/4 v14, 0x0

    invoke-virtual {v13, v3, v14}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v15

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v27, v13, 0x12

    const v28, 0x2fff8

    move-object/from16 v25, v3

    move-object v3, v7

    move v13, v8

    const-wide/16 v7, 0x0

    move v14, v9

    const/4 v9, 0x0

    move/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    move/from16 v20, v13

    const-wide/16 v12, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move/from16 v22, v5

    move-wide/from16 v44, v15

    move/from16 v16, v6

    move-wide/from16 v5, v44

    const/4 v15, 0x0

    move/from16 v24, v16

    move/from16 v26, v17

    const-wide/16 v16, 0x0

    move-object/from16 v36, v18

    const/16 v18, 0x0

    move/from16 v37, v19

    const/16 v19, 0x0

    move/from16 v38, v20

    const/16 v20, 0x0

    move/from16 v39, v21

    const/16 v21, 0x0

    move/from16 v40, v22

    const/16 v22, 0x0

    move/from16 v41, v24

    const/16 v24, 0x0

    move/from16 v42, v26

    const/16 v26, 0x0

    move/from16 p1, v37

    move-object/from16 v37, v2

    move/from16 v2, p1

    move-object/from16 p1, v0

    move-object/from16 v0, v36

    move/from16 v1, v42

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    mul-float v13, v41, v39

    const/4 v15, 0x0

    const/16 v16, 0xd

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v11, p1

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v18

    move-object/from16 v39, v11

    invoke-virtual/range {v34 .. v34}, Lp91/a$a;->b()Lp91/a;

    move-result-object v21

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v20, 0x0

    move/from16 v19, v35

    invoke-static/range {v18 .. v23}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {v32 .. v32}, Lbm0/t;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v3, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->F()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v3, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v5

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

    move-object v3, v1

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    move/from16 v9, v31

    move-object/from16 v2, v37

    move-object/from16 v0, v39

    move/from16 v5, v40

    const/4 v1, 0x2

    goto/16 :goto_a

    :cond_11
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_12
    const/4 v0, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v6, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_10

    :cond_13
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v1, La41/i;

    const/16 v2, 0xa

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final u(Lbm0/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lbm0/r;->t(Lbm0/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final v(Lbm0/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbm0/s;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p0

    move/from16 v6, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x195266a6

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v1, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v0, 0x93

    const/16 v10, 0x92

    const/4 v12, 0x0

    if-eq v9, v10, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    move v9, v12

    :goto_6
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v11, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_1b

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_9

    move-object v4, v9

    goto :goto_7

    :cond_9
    move-object v4, v5

    :goto_7
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_a

    new-instance v7, Lb72/a;

    const/16 v8, 0x14

    invoke-direct {v7, v8}, Lb72/a;-><init>(I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, v7

    goto :goto_8

    :cond_b
    move-object/from16 v16, v8

    :goto_8
    invoke-virtual {v2}, Lbm0/s;->i()Z

    move-result v7

    invoke-virtual {v11, v7}, Lp1/q;->h(Z)Z

    move-result v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_c

    if-ne v8, v5, :cond_d

    :cond_c
    invoke-virtual {v2}, Lbm0/s;->i()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lp1/c1;

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v7, v11, v10}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v7

    const-string v10, "aim-activity-recs-tile-redesign"

    invoke-interface {v7, v10}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-static {v8}, Lbm0/r;->x(Lp1/c1;)Z

    move-result v10

    if-nez v10, :cond_e

    invoke-static {v9}, Lbm0/r;->B(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    goto :goto_9

    :cond_e
    if-eqz v7, :cond_f

    invoke-static {v9}, Lbm0/r;->E(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    goto :goto_9

    :cond_f
    invoke-static {v8}, Lbm0/r;->x(Lp1/c1;)Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-static {v9}, Lbm0/r;->D(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    goto :goto_9

    :cond_10
    invoke-static {v9}, Lbm0/r;->E(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    :goto_9
    invoke-virtual {v2}, Lbm0/s;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v9, v11, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    int-to-float v3, v3

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v3, v13

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v13

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v15

    const/4 v14, 0x3

    int-to-float v14, v14

    int-to-float v1, v1

    mul-float/2addr v14, v1

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    const v14, 0x3dcccccd    # 0.1f

    invoke-static {v14, v4, v15, v1}, Landroidx/compose/foundation/a;->a(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v1, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v13, v3, v11, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_11

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v11, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-nez v13, :cond_12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_13

    :cond_12
    invoke-static {v7, v11, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v11, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lbm0/s;->c()Lkd1/o;

    move-result-object v1

    sget v3, Lkd1/o;->a:I

    invoke-static {v1, v9, v11, v3}, Lbm0/r;->o(Lkd1/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2}, Lbm0/s;->f()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_14

    const v1, 0x527375dc

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lbm0/s;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v11, v12}, Lbm0/r;->q(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_14
    const v1, 0x52744092

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v2}, Lbm0/s;->g()Lbm0/c;

    move-result-object v1

    if-nez v1, :cond_15

    const v1, 0x5274bb5b

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    :goto_c
    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_15
    const v3, 0x5274bb5c

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-static {v1, v11, v12}, Lbm0/r;->t(Lbm0/c;Landroidx/compose/runtime/Composer;I)V

    goto :goto_c

    :goto_d
    invoke-virtual {v2}, Lbm0/s;->b()Lm91/u;

    move-result-object v7

    if-nez v7, :cond_16

    const v1, 0x52757df4

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    move-object v3, v8

    move-object v1, v9

    move v15, v10

    move v14, v12

    goto :goto_e

    :cond_16
    const v1, 0x52757df5

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    move v1, v12

    const/4 v12, 0x0

    const/16 v13, 0xe

    move-object v3, v8

    const/4 v8, 0x0

    move-object v14, v9

    const/4 v9, 0x0

    move v15, v10

    const/4 v10, 0x0

    move-object/from16 v17, v14

    move v14, v1

    move-object/from16 v1, v17

    invoke-static/range {v7 .. v13}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v2}, Lbm0/s;->a()Lbm0/d;

    move-result-object v7

    if-nez v7, :cond_17

    const v0, 0x5276a0d2

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    move-object v9, v4

    move-object/from16 v1, v16

    :goto_f
    const/4 v0, 0x1

    goto :goto_13

    :cond_17
    const v8, 0x5276a0d3

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-static {v3}, Lbm0/r;->x(Lp1/c1;)Z

    move-result v8

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit16 v0, v0, 0x380

    const/16 v10, 0x100

    if-ne v0, v10, :cond_18

    const/4 v12, 0x1

    goto :goto_10

    :cond_18
    move v12, v14

    :goto_10
    or-int v0, v9, v12

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v0, :cond_1a

    if-ne v9, v5, :cond_19

    goto :goto_11

    :cond_19
    move-object v0, v9

    move-object/from16 v1, v16

    move-object v9, v4

    goto :goto_12

    :cond_1a
    :goto_11
    new-instance v0, Lam2/d;

    const/4 v5, 0x1

    move-object v9, v4

    move-object v4, v3

    move-object v3, v1

    move-object/from16 v1, v16

    invoke-direct/range {v0 .. v5}, Lam2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    check-cast v0, Lc93/a;

    invoke-static {v7, v8, v0, v11, v15}, Lbm0/r;->l(Lbm0/d;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_13
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object v5, v1

    move-object v4, v9

    goto :goto_14

    :cond_1b
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v4, v5

    move-object v5, v8

    :goto_14
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, La01/e;

    const/16 v3, 0x13

    move/from16 v2, p5

    move v1, v6

    move-object/from16 v6, p0

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final w(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;)Z
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

.method private static final y(Lp1/c1;Z)V
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

.method private static final z(Lkotlin/jvm/functions/Function1;Lbm0/s;Ljava/lang/String;Lp1/c1;)Ll83/a0;
    .locals 9

    invoke-static {p3}, Lbm0/r;->x(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p3, v0}, Lbm0/r;->y(Lp1/c1;Z)V

    invoke-static {p3}, Lbm0/r;->x(Lp1/c1;)Z

    move-result v2

    invoke-virtual {p1}, Lbm0/s;->e()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Lnl0/d$a;

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-direct/range {v1 .. v8}, Lnl0/d$a;-><init>(ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
