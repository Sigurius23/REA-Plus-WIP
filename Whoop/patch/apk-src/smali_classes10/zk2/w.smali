.class public abstract Lzk2/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u001a#\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a1\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u0011\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u000e\u00a8\u0006\u0014"
    }
    d2 = {
        "Ly81/f;",
        "backgroundColor",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "f",
        "(Ly81/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "horizontal",
        "top",
        "bottom",
        "j",
        "(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;",
        "a",
        "F",
        "getTrackSessionRadialGradientHeight",
        "()F",
        "TrackSessionRadialGradientHeight",
        "b",
        "RadialGradientRadius",
        "track-activity_release"
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x28

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lzk2/w;->a:F

    const/16 v0, 0x2d

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lzk2/w;->b:F

    return-void
.end method

.method public static synthetic a(Ly2/j1;IILy2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzk2/w;->m(Ly2/j1;IILy2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ly81/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p5}, Lzk2/w;->i(Ly81/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(JLl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzk2/w;->h(JLl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(FFFLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzk2/w;->l(FFFLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Ly81/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p5}, Lzk2/w;->g(Ly81/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ly81/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 8

    move-object v4, p2

    check-cast v4, Lp1/q;

    const v0, 0x28d5e0ac

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    if-nez p0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    :goto_0
    invoke-virtual {v4, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_5

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_3

    :cond_4
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v0, v3

    :cond_5
    :goto_4
    and-int/lit8 v3, v0, 0x13

    const/16 v5, 0x12

    if-eq v3, v5, :cond_6

    const/4 v3, 0x1

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    :goto_5
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v4, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_9

    if-eqz v1, :cond_7

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v2, v1

    goto :goto_6

    :cond_7
    move-object v2, p1

    :goto_6
    if-nez p0, :cond_8

    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Lfj1/k;

    const/4 v5, 0x1

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lfj1/k;-><init>(Ly81/f;Landroidx/compose/ui/Modifier;III)V

    :goto_7
    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_8
    move-object v7, v2

    and-int/lit8 v0, v0, 0xe

    invoke-virtual {p0, v4, v0}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v3, Lzk2/w;->a:F

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Lpp1/e;

    const/4 v5, 0x2

    invoke-direct {v3, v0, v1, v5}, Lpp1/e;-><init>(JI)V

    const v0, -0x9bded6a

    invoke-static {v0, v4, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0xc00

    const/4 v6, 0x6

    const/4 v1, 0x0

    move-object v0, v2

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v7

    goto :goto_8

    :cond_9
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v2, p1

    :goto_8
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Lfj1/k;

    const/4 v5, 0x2

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lfj1/k;-><init>(Ly81/f;Landroidx/compose/ui/Modifier;III)V

    goto :goto_7

    :cond_a
    return-void
.end method

.method private static final g(Ly81/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzk2/w;->f(Ly81/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(JLl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    const-string v0, "$this$BoxWithConstraints"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

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

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    and-int/2addr p4, v3

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_3

    sget-object p4, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p3, p4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ly3/c;

    check-cast p2, Landroidx/compose/foundation/layout/c;

    invoke-virtual {p2}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v0

    invoke-interface {p4, v0}, Ly3/c;->q0(F)F

    move-result v0

    invoke-virtual {p2}, Landroidx/compose/foundation/layout/c;->c()F

    move-result p2

    invoke-interface {p4, p2}, Ly3/c;->q0(F)F

    move-result p2

    sget-object v1, Lb2/t;->w:Lb2/t;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v1}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Li2/t;->b:Li2/s;

    const v4, 0x3e10f4d8

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const v5, 0x3ecccccd    # 0.4f

    invoke-static {v5, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide v5

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v4, 0x3f664e27

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v9, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide p0

    new-instance v6, Li2/x;

    invoke-direct {v6, p0, p1}, Li2/x;-><init>(J)V

    new-instance p0, Ll83/k;

    invoke-direct {p0, v4, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, p0}, [Ll83/k;

    move-result-object v4

    const p0, 0x3f78d5a9

    mul-float/2addr v0, p0

    const p0, -0x434ccccd    # -0.021875f

    mul-float/2addr p2, p0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v5, p2

    const/16 p2, 0x20

    shl-long/2addr p0, p2

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long/2addr v5, p0

    sget p0, Lzk2/w;->b:F

    invoke-interface {p4, p0}, Ly3/c;->q0(F)F

    move-result v7

    const/16 v8, 0x8

    invoke-static/range {v3 .. v8}, Li2/s;->h(Li2/s;[Ll83/k;JFI)Li2/u0;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x6

    invoke-static {v1, p0, p1, v9, p2}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p0, p3, v2}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2

    :cond_3
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ly81/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzk2/w;->f(Ly81/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "$this$removeParentPadding"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgb1/k;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, p2, p3}, Lgb1/k;-><init>(IFFF)V

    invoke-static {p0, v0}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static k(Landroidx/compose/ui/Modifier;FFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    int-to-float p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    int-to-float p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    int-to-float p3, v0

    :cond_2
    invoke-static {p0, p1, p2, p3}, Lzk2/w;->j(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final l(FFFLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 4

    const-string v0, "$this$layout"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p0}, Ly3/c;->F(F)I

    move-result p0

    invoke-interface {p3, p1}, Ly3/c;->F(F)I

    move-result p1

    invoke-interface {p3, p2}, Ly3/c;->F(F)I

    move-result p2

    iget-wide v0, p5, Ly3/a;->a:J

    invoke-static {v0, v1}, Ly3/a;->i(J)I

    move-result v0

    mul-int/lit8 v1, p0, 0x2

    add-int/2addr v1, v0

    iget-wide v2, p5, Ly3/a;->a:J

    invoke-static {v2, v3}, Ly3/a;->h(J)I

    move-result p5

    add-int/2addr p5, p1

    add-int/2addr p5, p2

    invoke-static {v1, v1, p5, p5}, Ly3/a;->a(IIII)J

    move-result-wide v0

    invoke-interface {p4, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    invoke-static {v2, v3}, Ly3/a;->i(J)I

    move-result p4

    invoke-static {v2, v3}, Ly3/a;->h(J)I

    move-result p5

    new-instance v0, Ll1/y1;

    const/4 v1, 0x2

    invoke-direct {v0, p2, p0, p1, v1}, Ll1/y1;-><init>(Ly2/j1;III)V

    sget-object p0, Lm83/z;->w:Lm83/z;

    invoke-interface {p3, p4, p5, p0, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Ly2/j1;IILy2/i1;)Ll83/a0;
    .locals 1

    const-string v0, "$this$layout"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    neg-int p1, p1

    neg-int p2, p2

    const/4 v0, 0x0

    invoke-virtual {p3, p0, p1, p2, v0}, Ly2/i1;->f(Ly2/j1;IIF)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
