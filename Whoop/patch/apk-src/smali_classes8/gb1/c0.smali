.class public abstract Lgb1/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u0014\u0010\u0008\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f\u00b2\u0006\u000c\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "",
        "active",
        "c",
        "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;",
        "Li2/x;",
        "a",
        "J",
        "shimmerBase",
        "",
        "b",
        "Ljava/util/List;",
        "shimmerColors",
        "",
        "progress",
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
.field private static final a:J

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const v0, 0x26ffffff

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v0

    sput-wide v0, Lgb1/c0;->a:J

    sget-wide v0, Li2/x;->f:J

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    const v3, 0x3e19999a    # 0.15f

    invoke-static {v3, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v5, v6, v2}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lgb1/c0;->b:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lgb1/c0;->e(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/t2;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgb1/c0;->g(Lp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance p1, Leg2/a;

    const/16 v0, 0x1b

    invoke-direct {p1, v0}, Leg2/a;-><init>(I)V

    invoke-static {p0, p1}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-static {p0, p1}, Lgb1/c0;->c(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 8

    const-string p2, "$this$composed"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x7aba1f21

    invoke-virtual {v5, p1}, Lp1/q;->e0(I)V

    const-string p1, "whoopShimmer"

    const/4 p2, 0x0

    invoke-static {p1, v5, p2}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v0

    sget-object p1, Ld0/b0;->c:Lb23/h;

    const/4 v1, 0x2

    const/16 v2, 0x5dc

    invoke-static {v2, p2, p1, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p1

    sget-object v1, Ld0/v0;->w:Ld0/v0;

    const/4 v2, 0x4

    invoke-static {p1, v1, v2}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v3

    const/16 v6, 0x71b8

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const-string v4, "whoopShimmerProgress"

    invoke-static/range {v0 .. v7}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object p1

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_0

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_1

    :cond_0
    new-instance v1, Lgb1/m;

    const/4 v0, 0x3

    invoke-direct {v1, p1, v0}, Lgb1/m;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, v1}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {v5, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final f(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final g(Lp1/t2;Lk2/e;)Ll83/a0;
    .locals 14

    const-string v0, "$this$drawBehind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-wide v2, Lgb1/c0;->a:J

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v6

    const/4 v10, 0x0

    const/16 v11, 0x7a

    const-wide/16 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v11}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v1, v3

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    add-float/2addr v1, v0

    const v0, 0x3e99999a    # 0.3f

    mul-float/2addr v0, v1

    const/4 v3, 0x2

    int-to-float v3, v3

    mul-float/2addr v3, v0

    add-float/2addr v3, v1

    neg-float v1, v0

    invoke-static {p0}, Lgb1/c0;->f(Lp1/t2;)F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v3, v1

    sget-object v7, Li2/t;->b:Li2/s;

    sget-object v8, Lgb1/c0;->b:Ljava/util/List;

    sub-float v1, v3, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v9, v4

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v11, v1

    shl-long/2addr v9, v2

    and-long/2addr v11, v5

    or-long/2addr v9, v11

    add-float/2addr v3, v0

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long/2addr v0, v2

    and-long v2, v3, v5

    or-long v11, v0, v2

    const/16 v13, 0x8

    invoke-static/range {v7 .. v13}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v2

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v5

    const/4 v9, 0x0

    const/16 v10, 0x7a

    const-wide/16 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
