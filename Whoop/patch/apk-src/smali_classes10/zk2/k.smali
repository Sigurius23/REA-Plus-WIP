.class public abstract Lzk2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\"\u0014\u0010\u000c\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lzk2/l;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "d",
        "(Lzk2/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "a",
        "F",
        "trackSessionLiveBottomContentToPagerSpacing",
        "b",
        "trackSessionLiveBottomContentMetricsTopSpacing",
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

    const-wide/high16 v0, 0x4016000000000000L    # 5.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lzk2/k;->a:F

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lzk2/k;->b:F

    return-void
.end method

.method public static synthetic a(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lzk2/k;->f(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lzk2/l;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzk2/k;->e(Lzk2/l;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lzk2/l;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzk2/k;->g(Lzk2/l;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lzk2/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 11

    move-object v4, p2

    check-cast v4, Lp1/q;

    const v0, -0x12617e88

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v7, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v7

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_4
    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_4

    :cond_5
    move v5, v9

    :goto_4
    and-int/2addr v0, v8

    invoke-virtual {v4, v0, v5}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_6

    move-object v2, v8

    goto :goto_5

    :cond_6
    move-object v2, p1

    :goto_5
    if-nez p0, :cond_7

    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Lzk2/j;

    const/4 v5, 0x0

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lzk2/j;-><init>(Lzk2/l;Landroidx/compose/ui/Modifier;III)V

    :goto_6
    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_7
    move-object v10, v2

    sget v0, Lzk2/k;->a:F

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v4, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {p0}, Lzk2/l;->a()Lm91/u;

    move-result-object v0

    if-nez v0, :cond_8

    const v0, 0x80777e

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_8
    const v1, 0x80777f

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    new-instance v2, Lzk2/a;

    const/4 v1, 0x2

    invoke-direct {v2, v1}, Lzk2/a;-><init>(I)V

    const/4 v5, 0x0

    const/16 v6, 0xa

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget v0, Lzk2/k;->b:F

    invoke-static {v8, v0, v4, v9}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    :goto_7
    invoke-virtual {p0}, Lzk2/l;->b()Ltk2/g;

    move-result-object v0

    invoke-virtual {v0}, Ltk2/g;->a()Ljava/util/List;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v2, v7

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const/4 v3, 0x0

    invoke-static {v1, v2, v3, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0, v1, v4, v9, v9}, Lzk2/q;->b(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v10

    goto :goto_8

    :cond_9
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v2, p1

    :goto_8
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Lzk2/j;

    const/4 v5, 0x1

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lzk2/j;-><init>(Lzk2/l;Landroidx/compose/ui/Modifier;III)V

    goto :goto_6

    :cond_a
    return-void
.end method

.method private static final e(Lzk2/l;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzk2/k;->d(Lzk2/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x4db73c44

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/high16 p0, 0x3f800000    # 1.0f

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x2

    int-to-float v0, p2

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1, p2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final g(Lzk2/l;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzk2/k;->d(Lzk2/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
