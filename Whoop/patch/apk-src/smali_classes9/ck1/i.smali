.class public abstract Lck1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001ai\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u00062\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a?\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u0006H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0010\"\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0010\u00a8\u0006\u0017"
    }
    d2 = {
        "Lak1/d$b;",
        "viewState",
        "Lak1/a;",
        "analyticsState",
        "",
        "source",
        "Lkotlin/Function1;",
        "Lak1/b;",
        "Ll83/a0;",
        "onViewEvent",
        "Lzj1/a;",
        "onNavigationEvent",
        "Lvj1/a;",
        "onAnalyticEvent",
        "r",
        "(Lak1/d$b;Lak1/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "F",
        "(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ly3/f;",
        "a",
        "gridItemPadding",
        "b",
        "screenHorizontalPadding",
        "health-monitor_release"
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
    .locals 1

    const/4 v0, 0x6

    int-to-float v0, v0

    sput v0, Lck1/i;->a:F

    const/16 v0, 0x14

    int-to-float v0, v0

    sput v0, Lck1/i;->b:F

    return-void
.end method

.method private static final A(La11/r;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x74338ab6

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget p0, Lck1/i;->b:F

    const/4 p2, 0x0

    const/4 v0, 0x2

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, p0, p2, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lm91/u;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lzj1/a$b;

    check-cast p1, La11/r;

    invoke-virtual {p1}, La11/r;->c()La11/b;

    move-result-object p1

    invoke-direct {p2, p1}, Lzj1/a$b;-><init>(La11/b;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x79ef9cdf

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    sget p2, Lck1/i;->b:F

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final D(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lak1/d$b;Lak1/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lck1/i;->r(Lak1/d$b;Lak1/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak1/d$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v6, p3

    check-cast v6, Lp1/q;

    const p3, 0x54cc40e

    invoke-virtual {v6, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, p4, 0x6

    if-nez p3, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    goto :goto_1

    :cond_1
    move p3, p4

    :goto_1
    and-int/lit8 v0, p4, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p3, v0

    :cond_3
    and-int/lit16 v0, p4, 0x180

    if-nez v0, :cond_5

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x100

    goto :goto_3

    :cond_4
    const/16 v0, 0x80

    :goto_3
    or-int/2addr p3, v0

    :cond_5
    and-int/lit16 v0, p3, 0x93

    const/16 v1, 0x92

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_6

    move v0, v3

    goto :goto_4

    :cond_6
    move v0, v2

    :goto_4
    and-int/2addr p3, v3

    invoke-virtual {v6, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-virtual {p0}, Lak1/d$b;->a()Lck1/n;

    move-result-object p3

    if-eqz p3, :cond_7

    move v0, v3

    goto :goto_5

    :cond_7
    move v0, v2

    :goto_5
    const/4 p3, 0x0

    const/4 v1, 0x3

    invoke-static {p3, v1}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v2

    invoke-static {p3, v1}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v3

    new-instance p3, La80/f;

    const/4 v1, 0x6

    invoke-direct {p3, p0, p1, p2, v1}, La80/f;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const v1, -0x4402c11a

    invoke-static {v1, v6, p3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const v7, 0x30d80

    const/16 v8, 0x12

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v8}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_8
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_9

    new-instance v0, Lj;

    const/16 v5, 0x1a

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final G(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string p5, "$this$AnimatedVisibility"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lak1/d$b;->a()Lck1/n;

    move-result-object v0

    const/4 p0, 0x0

    if-nez v0, :cond_0

    check-cast p4, Lp1/q;

    const p1, -0x7c84b857

    invoke-virtual {p4, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p4, p0}, Lp1/q;->q(Z)V

    goto/16 :goto_1

    :cond_0
    move-object v3, p4

    check-cast v3, Lp1/q;

    const p3, -0x7c84b856

    invoke-virtual {v3, p3}, Lp1/q;->e0(I)V

    sget-object p3, Lx81/d;->a:Lx81/d;

    sget p4, Lx81/d;->b:I

    invoke-virtual {p3, v3, p4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p3

    invoke-virtual {p3}, Ly81/i;->u()J

    move-result-wide p3

    sget-object p5, Li2/w0;->a:Li2/v0;

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, p3, p4, p5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    sget-object p4, Lb2/e;->w:Lb2/m;

    invoke-static {p4, p0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p4

    iget-wide v1, v3, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result p5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v3, p3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    sget-object v2, La3/l;->a:La3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-eqz v4, :cond_1

    invoke-virtual {v3, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_0
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v3, v2, p4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->f:La3/i;

    invoke-static {v3, p4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->j:La3/i;

    iget-boolean v1, v3, Lp1/q;->S:Z

    if-nez v1, :cond_2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {p5, v3, p5, p4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p4, La3/k;->d:La3/i;

    invoke-static {v3, p4, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    sget-object p5, Lp1/l;->a:Lp1/v0;

    if-nez p3, :cond_4

    if-ne p4, p5, :cond_5

    :cond_4
    new-instance p4, Lbf0/a;

    const/16 p3, 0x16

    invoke-direct {p4, p1, p3}, Lbf0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v1, p4

    check-cast v1, Lc93/a;

    invoke-virtual {v3, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p1, :cond_6

    if-ne p3, p5, :cond_7

    :cond_6
    new-instance p3, La61/a;

    const/16 p1, 0x13

    invoke-direct {p3, p2, p1}, La61/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v2, p3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget p1, Lcom/whoop/design/util/TextResource;->$stable:I

    sget p2, Lny0/p0;->o:I

    or-int v4, p1, p2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lck1/m;->g(Lck1/n;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 p1, 0x1

    invoke-virtual {v3, p1}, Lp1/q;->q(Z)V

    invoke-virtual {v3, p0}, Lp1/q;->q(Z)V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lak1/b$a;->a:Lak1/b$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzj1/a$c;

    invoke-direct {v0, p1}, Lzj1/a$c;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lck1/i;->F(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lc41/w2;Lak1/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lck1/i;->v(Lkotlin/jvm/functions/Function1;Lc41/w2;Lak1/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lvj1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lck1/i;->s(Lvj1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lck1/i;->I(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lck1/i;->G(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lck1/i;->J(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lck1/i;->C(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lck1/i;->z(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lck1/i;->t(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(La11/r;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lck1/i;->A(La11/r;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lc41/w2;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object v0, Ll0/t1;->a:Ll0/t1;

    invoke-static {v0, p1, p0, p2, p3}, Lck1/i;->u(Ll0/s1;ILc41/w2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;La11/r;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lck1/i;->B(Lkotlin/jvm/functions/Function1;Lm91/u;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lck1/i;->H(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ly71/o;Lkotlin/jvm/functions/Function1;Lak1/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lck1/i;->x(Lm91/u;Lkotlin/jvm/functions/Function1;Lak1/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ly71/o;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lck1/i;->w(Ly71/o;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ln71/q;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lck1/i;->y(Ln71/q;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lck1/i;->D(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lak1/d$b;Lak1/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lck1/i;->E(Lak1/d$b;Lak1/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lak1/d$b;Lak1/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 54
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak1/d$b;",
            "Lak1/a;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v5, p1

    move-object/from16 v0, p2

    move-object/from16 v4, p3

    move-object/from16 v8, p4

    move/from16 v9, p7

    sget-object v10, Lb2/e;->M:Lb2/k;

    const-string v2, "viewState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onViewEvent"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onNavigationEvent"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p6

    check-cast v15, Lp1/q;

    const v2, 0x77a681c0

    invoke-virtual {v15, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_1
    move v2, v9

    :goto_1
    and-int/lit8 v7, v9, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    :cond_3
    and-int/lit16 v7, v9, 0x180

    const/16 v11, 0x100

    if-nez v7, :cond_5

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v11

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v2, v7

    :cond_5
    and-int/lit16 v7, v9, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v2, v7

    :cond_7
    and-int/lit16 v7, v9, 0x6000

    if-nez v7, :cond_9

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_5

    :cond_8
    const/16 v7, 0x2000

    :goto_5
    or-int/2addr v2, v7

    :cond_9
    and-int/lit8 v7, p8, 0x20

    const/high16 v14, 0x30000

    move/from16 p6, v7

    const/high16 v7, 0x20000

    if-eqz p6, :cond_b

    or-int/2addr v2, v14

    :cond_a
    move-object/from16 v14, p5

    goto :goto_7

    :cond_b
    and-int/2addr v14, v9

    if-nez v14, :cond_a

    move-object/from16 v14, p5

    invoke-virtual {v15, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_c

    move/from16 v16, v7

    goto :goto_6

    :cond_c
    const/high16 v16, 0x10000

    :goto_6
    or-int v2, v2, v16

    :goto_7
    const v16, 0x12493

    and-int v12, v2, v16

    const v6, 0x12492

    const/4 v3, 0x0

    if-eq v12, v6, :cond_d

    const/4 v6, 0x1

    goto :goto_8

    :cond_d
    move v6, v3

    :goto_8
    and-int/lit8 v12, v2, 0x1

    invoke-virtual {v15, v12, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_3d

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz p6, :cond_f

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v6, :cond_e

    new-instance v12, Lcj2/a;

    const/16 v14, 0x8

    invoke-direct {v12, v14}, Lcj2/a;-><init>(I)V

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v12, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_f
    move-object v12, v14

    :goto_9
    const/high16 v14, 0x70000

    and-int/2addr v14, v2

    if-ne v14, v7, :cond_10

    const/16 v16, 0x1

    goto :goto_a

    :cond_10
    move/from16 v16, v3

    :goto_a
    and-int/lit16 v7, v2, 0x380

    if-ne v7, v11, :cond_11

    const/4 v7, 0x1

    goto :goto_b

    :cond_11
    move v7, v3

    :goto_b
    or-int v7, v16, v7

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v7, v11

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    move/from16 p5, v7

    const/4 v7, 0x0

    if-nez p5, :cond_12

    if-ne v11, v6, :cond_13

    :cond_12
    new-instance v11, Lck1/i$a;

    invoke-direct {v11, v12, v0, v5, v7}, Lck1/i$a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lak1/a;Lq83/d;)V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v11, Lc93/m;

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    invoke-static {v15, v11, v7}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v7, v2, 0xe

    shr-int/lit8 v11, v2, 0x6

    and-int/lit8 v16, v11, 0x70

    or-int v7, v7, v16

    and-int/lit16 v11, v11, 0x380

    or-int/2addr v7, v11

    invoke-static {v1, v4, v8, v15, v7}, Lck1/i;->F(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v7, Ll0/m;->c:Ll0/g;

    invoke-static {v7, v10, v15, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v3, v15, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v15, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-eqz v9, :cond_14

    invoke-virtual {v15, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_14
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_c
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v15, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v15, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    move-object/from16 v23, v11

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-nez v11, :cond_15

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v18, v12

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_16

    goto :goto_d

    :cond_15
    move-object/from16 v18, v12

    :goto_d
    invoke-static {v3, v15, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v15, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v11, 0xf

    int-to-float v11, v11

    const/16 v27, 0x0

    const/16 v28, 0xd

    const/16 v24, 0x0

    const/16 v26, 0x0

    move/from16 v25, v11

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    new-instance v12, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual/range {p0 .. p0}, Lak1/d$b;->e()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v32

    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-static {v13}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v34

    sget v13, Luv0/c;->E:I

    invoke-static {v15, v13}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v35

    const v48, 0xfff2

    const/16 v49, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    move-object/from16 v31, v12

    invoke-direct/range {v31 .. v49}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v13, 0xe000

    and-int/2addr v13, v2

    move-object/from16 v19, v11

    const/16 v11, 0x4000

    if-ne v13, v11, :cond_17

    const/16 v16, 0x1

    goto :goto_e

    :cond_17
    const/16 v16, 0x0

    :goto_e
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v16, :cond_19

    if-ne v11, v6, :cond_18

    goto :goto_f

    :cond_18
    move-object/from16 v31, v12

    goto :goto_10

    :cond_19
    :goto_f
    new-instance v11, Lbf0/a;

    move-object/from16 v31, v12

    const/16 v12, 0x17

    invoke-direct {v11, v8, v12}, Lbf0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    check-cast v11, Lc93/a;

    sget v12, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v12, v12, 0x3

    or-int/lit8 v12, v12, 0x6

    move/from16 v16, v14

    move-object v14, v11

    move-object/from16 v11, v19

    const/16 v19, 0x34

    move/from16 v25, v13

    const/4 v13, 0x0

    move-object/from16 v33, v15

    const/4 v15, 0x0

    move/from16 v26, v16

    const/16 v16, 0x0

    move-object/from16 v24, v6

    move-object/from16 v6, v23

    move/from16 v50, v25

    move/from16 v8, v26

    move-object/from16 v17, v33

    move-object/from16 v23, v18

    move/from16 v18, v12

    move-object/from16 v12, v31

    invoke-static/range {v11 .. v19}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v17

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v31

    const/4 v11, 0x4

    int-to-float v11, v11

    const/16 v35, 0x0

    const/16 v36, 0xd

    const/16 v32, 0x0

    const/16 v34, 0x0

    move/from16 v33, v11

    invoke-static/range {v31 .. v36}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static {v13, v15, v12}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v14

    const/16 v12, 0xe

    invoke-static {v11, v14, v12}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lak1/d$b;->d()Lep0/j;

    move-result-object v12

    sget v14, Lep0/j;->x:I

    shl-int/lit8 v16, v14, 0x3

    const/16 v17, 0x6

    move/from16 v30, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v18, v2

    move/from16 v2, v30

    const/16 v22, 0x1

    invoke-static/range {v11 .. v17}, Ldp0/d;->a(Landroidx/compose/ui/Modifier;Lep0/j;FZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v7, v10, v15, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v15, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_1a

    invoke-virtual {v15, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1a
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v15, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v15, Lp1/q;->S:Z

    if-nez v0, :cond_1b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    :cond_1b
    invoke-static {v2, v15, v2, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v15, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x2cc61254

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lak1/d$b;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lm91/u;

    instance-of v1, v11, Lbk1/c;

    if-eqz v1, :cond_2e

    const v1, 0x1a5cbf17

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    sget v1, Lck1/i;->b:F

    sget v3, Lck1/i;->a:F

    sub-float/2addr v1, v3

    const/4 v3, 0x2

    invoke-static {v6, v1, v2, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/4 v13, 0x0

    invoke-static {v2, v10, v15, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v15, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v15, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-eqz v9, :cond_1d

    invoke-virtual {v15, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1d
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_13
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v15, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v15, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v15, Lp1/q;->S:Z

    if-nez v4, :cond_1e

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1f

    :cond_1e
    invoke-static {v3, v15, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v15, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    check-cast v11, Lbk1/c;

    invoke-virtual {v11}, Lbk1/c;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    const/4 v3, 0x2

    invoke-static {v1, v3}, Lm83/s;->v0(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    move-result-object v1

    const v2, -0x41aa64f0

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v9, 0x0

    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v19, v9, 0x1

    if-ltz v9, :cond_2c

    move-object/from16 v20, v2

    check-cast v20, Ljava/util/List;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/a1;->w:Ll0/a1;

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->a:Ll0/e;

    sget-object v7, Lb2/e;->J:Lb2/l;

    const/4 v13, 0x0

    invoke-static {v4, v7, v15, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v11, v15, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-eqz v14, :cond_20

    invoke-virtual {v15, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_20
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_15
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v15, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v15, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-nez v11, :cond_21

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_22

    :cond_21
    invoke-static {v7, v15, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v15, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x6a19099e

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    move-object/from16 v2, v20

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    move v2, v13

    :goto_16
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_28

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v25, v2, 0x1

    if-ltz v2, :cond_27

    move-object v11, v4

    check-cast v11, Lc41/w2;

    mul-int/lit8 v4, v9, 0x2

    add-int/2addr v4, v2

    move/from16 v30, v13

    new-instance v13, Lck1/g;

    invoke-direct {v13, v4}, Lck1/g;-><init>(I)V

    const/high16 v2, 0x20000

    if-ne v8, v2, :cond_23

    move/from16 v12, v22

    goto :goto_17

    :cond_23
    move/from16 v12, v30

    :goto_17
    invoke-virtual {v15, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v12

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    move/from16 v7, v18

    and-int/lit16 v12, v7, 0x1c00

    const/16 v14, 0x800

    if-ne v12, v14, :cond_24

    move/from16 v12, v22

    goto :goto_18

    :cond_24
    move/from16 v12, v30

    :goto_18
    or-int/2addr v4, v12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v4, :cond_26

    move-object/from16 v4, v24

    if-ne v12, v4, :cond_25

    :goto_19
    move v12, v2

    goto :goto_1a

    :cond_25
    move-object/from16 v18, v12

    move v12, v2

    move-object/from16 v2, v18

    move-object/from16 v53, v4

    move/from16 v18, v7

    move-object v4, v11

    const/16 v24, 0x0

    const/high16 v29, 0x3f800000    # 1.0f

    move v11, v3

    move-object/from16 v3, v23

    move-object/from16 v23, v6

    goto :goto_1b

    :cond_26
    move-object/from16 v4, v24

    goto :goto_19

    :goto_1a
    new-instance v2, Lam2/s;

    move/from16 v18, v7

    const/16 v7, 0x9

    move-object/from16 v53, v4

    move-object v4, v11

    const/16 v24, 0x0

    const/high16 v29, 0x3f800000    # 1.0f

    move v11, v3

    move-object/from16 v3, v23

    move-object/from16 v23, v6

    move-object/from16 v6, p3

    invoke-direct/range {v2 .. v7}, Lam2/s;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget v16, Lc41/w2;->o:I

    const/16 v17, 0x2

    move v6, v12

    const/4 v12, 0x0

    move-object v11, v4

    move/from16 v51, v14

    move/from16 v7, v22

    move-object/from16 v4, v23

    move-object v14, v2

    move/from16 v2, v29

    invoke-static/range {v11 .. v17}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v23, v3

    move-object v6, v4

    move/from16 v2, v25

    move-object/from16 v24, v53

    const/4 v3, 0x2

    const/4 v13, 0x0

    goto/16 :goto_16

    :cond_27
    const/16 v24, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v24

    :cond_28
    move-object v4, v6

    move v9, v13

    move/from16 v7, v22

    move-object/from16 v3, v23

    move-object/from16 v53, v24

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v6, 0x20000

    const/16 v24, 0x0

    const/16 v51, 0x800

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v11

    if-ne v11, v7, :cond_2b

    const v11, -0x26e2ae6d

    invoke-virtual {v15, v11}, Lp1/q;->e0(I)V

    sget v11, Lck1/i;->a:F

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    float-to-double v12, v2

    const-wide/16 v16, 0x0

    cmpl-double v12, v12, v16

    if-lez v12, :cond_29

    goto :goto_1c

    :cond_29
    const-string v12, "invalid weight; must be greater than zero"

    invoke-static {v12}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1c
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v13, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v14, v2, v13

    if-lez v14, :cond_2a

    goto :goto_1d

    :cond_2a
    move v13, v2

    :goto_1d
    invoke-direct {v12, v13, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v11, v12}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v2, v11}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v15, v11}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_2b
    const v11, -0x26dceee5

    invoke-virtual {v15, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    move-object/from16 v23, v3

    move-object v6, v4

    move/from16 v22, v7

    move/from16 v9, v19

    move-object/from16 v24, v53

    const/4 v3, 0x2

    goto/16 :goto_14

    :cond_2c
    const/16 v24, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v24

    :cond_2d
    move-object v4, v6

    move/from16 v7, v22

    move-object/from16 v3, v23

    move-object/from16 v53, v24

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v6, 0x20000

    const/4 v9, 0x0

    const/16 v24, 0x0

    const/16 v51, 0x800

    invoke-static {v15, v9, v7, v9}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v5, p4

    move/from16 v29, v2

    move/from16 v19, v6

    move-object/from16 v1, v53

    const/16 v7, 0x4000

    const/16 v20, 0x2

    move-object v6, v4

    move/from16 v4, v50

    goto/16 :goto_25

    :cond_2e
    move-object v4, v6

    move/from16 v7, v22

    move-object/from16 v3, v23

    move-object/from16 v53, v24

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v6, 0x20000

    const/4 v9, 0x0

    const/16 v24, 0x0

    const/16 v51, 0x800

    instance-of v1, v11, Ly71/o;

    if-eqz v1, :cond_33

    const v1, 0x1a842443

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    move-object/from16 v23, v3

    move-object v3, v11

    check-cast v3, Ly71/o;

    new-instance v13, Lck1/h;

    const/4 v1, 0x0

    invoke-direct {v13, v1}, Lck1/h;-><init>(I)V

    invoke-virtual {v15, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-ne v8, v6, :cond_2f

    move v11, v7

    goto :goto_1f

    :cond_2f
    move v11, v9

    :goto_1f
    or-int/2addr v1, v11

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v1, v11

    move/from16 v11, v50

    const/16 v12, 0x4000

    if-ne v11, v12, :cond_30

    move v14, v7

    goto :goto_20

    :cond_30
    move v14, v9

    :goto_20
    or-int/2addr v1, v14

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v1, :cond_32

    move-object/from16 v1, v53

    if-ne v14, v1, :cond_31

    :goto_21
    move/from16 v29, v2

    goto :goto_22

    :cond_31
    move-object/from16 v5, p4

    move/from16 v29, v2

    move/from16 v19, v6

    move/from16 v22, v7

    move/from16 v25, v11

    const/16 v20, 0x2

    move-object v11, v3

    move-object/from16 v3, v23

    move-object/from16 v23, v4

    goto :goto_23

    :cond_32
    move-object/from16 v1, v53

    goto :goto_21

    :goto_22
    new-instance v2, Lam2/s;

    move/from16 v22, v7

    const/16 v7, 0xa

    move-object/from16 v19, v23

    move-object/from16 v23, v4

    move-object/from16 v4, v19

    move/from16 v19, v6

    const/16 v20, 0x2

    move-object/from16 v6, p4

    invoke-direct/range {v2 .. v7}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v5, v6

    move/from16 v25, v11

    move-object v11, v3

    move-object v3, v4

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v14, v2

    :goto_23
    check-cast v14, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x0

    const/16 v17, 0x2

    move/from16 v52, v12

    const/4 v12, 0x0

    move-object/from16 v6, v23

    move/from16 v4, v25

    move/from16 v7, v52

    invoke-static/range {v11 .. v17}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_25

    :cond_33
    move-object/from16 v5, p4

    move/from16 v29, v2

    move/from16 v19, v6

    move/from16 v22, v7

    move-object/from16 v1, v53

    const/16 v7, 0x4000

    const/16 v20, 0x2

    move-object v6, v4

    move/from16 v4, v50

    instance-of v2, v11, Ln71/q;

    if-eqz v2, :cond_35

    const v2, 0x1a94006a

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    check-cast v11, Ln71/q;

    invoke-static {}, Lck1/d;->c()Lm91/p;

    move-result-object v12

    new-instance v13, Lck1/h;

    const/4 v2, 0x1

    invoke-direct {v13, v2}, Lck1/h;-><init>(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_34

    new-instance v2, Lcj2/a;

    const/16 v14, 0x9

    invoke-direct {v2, v14}, Lcj2/a;-><init>(I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    move-object v14, v2

    check-cast v14, Lkotlin/jvm/functions/Function1;

    sget v2, Lm91/p;->b:I

    shl-int/lit8 v2, v2, 0x3

    or-int/lit16 v2, v2, 0xc00

    const/16 v17, 0x0

    move/from16 v16, v2

    invoke-static/range {v11 .. v17}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_25

    :cond_35
    instance-of v2, v11, La11/r;

    if-eqz v2, :cond_39

    const v2, 0x1a9a8535

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    move-object v2, v11

    check-cast v2, La11/r;

    invoke-static {}, Lck1/d;->c()Lm91/p;

    move-result-object v12

    new-instance v13, Lf;

    const/16 v14, 0x1c

    invoke-direct {v13, v14}, Lf;-><init>(I)V

    if-ne v4, v7, :cond_36

    move/from16 v14, v22

    goto :goto_24

    :cond_36
    move v14, v9

    :goto_24
    invoke-virtual {v15, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v11, v14

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v11, :cond_37

    if-ne v14, v1, :cond_38

    :cond_37
    new-instance v14, Lbe1/c;

    const/16 v11, 0xd

    invoke-direct {v14, v5, v2, v11}, Lbe1/c;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v15, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_38
    check-cast v14, Lkotlin/jvm/functions/Function1;

    sget v11, Lm91/p;->b:I

    shl-int/lit8 v16, v11, 0x3

    const/16 v17, 0x0

    move-object v11, v2

    invoke-static/range {v11 .. v17}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    goto :goto_25

    :cond_39
    const v2, 0x1aa3c649

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Lck1/d;->c()Lm91/p;

    move-result-object v12

    new-instance v13, Lf;

    const/16 v2, 0x1d

    invoke-direct {v13, v2}, Lf;-><init>(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3a

    new-instance v2, Lcj2/a;

    const/16 v14, 0xa

    invoke-direct {v2, v14}, Lcj2/a;-><init>(I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3a
    move-object v14, v2

    check-cast v14, Lkotlin/jvm/functions/Function1;

    sget v2, Lm91/p;->b:I

    shl-int/lit8 v2, v2, 0x3

    or-int/lit16 v2, v2, 0xc00

    const/16 v17, 0x0

    move/from16 v16, v2

    invoke-static/range {v11 .. v17}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    :goto_25
    move-object/from16 v5, p1

    move-object/from16 v24, v1

    move-object/from16 v23, v3

    move/from16 v50, v4

    goto/16 :goto_12

    :cond_3b
    move-object/from16 v5, p4

    move-object/from16 v3, v23

    const/4 v9, 0x0

    const/4 v11, 0x2

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lak1/d$b;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3c

    const v0, -0x6bae48c3

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    move/from16 v7, v22

    goto :goto_26

    :cond_3c
    const v1, -0x6bae48c2

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    sget v1, Lck1/i;->b:F

    invoke-static {v6, v1, v2, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v15, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->b()Lb91/a;

    move-result-object v31

    invoke-virtual {v1, v15, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v13

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v35, v1, 0x12

    const v36, 0x2fff8

    move-object/from16 v33, v15

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    move/from16 v7, v22

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x30

    move-object v11, v0

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v33

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    :goto_26
    const/16 v0, 0x14

    int-to-float v0, v0

    invoke-static {v0, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v15, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    move-object v6, v3

    goto :goto_27

    :cond_3d
    move-object v5, v8

    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v6, v14

    :goto_27
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_3e

    new-instance v0, Laz1/f;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Laz1/f;-><init>(Lak1/d$b;Lak1/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_3e
    return-void
.end method

.method private static final s(Lvj1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lzj1/a$a;->a:Lzj1/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Ll0/s1;ILc41/w2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string p4, "it"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const p2, 0x6c0db05

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lb2/t;->w:Lb2/t;

    sget p4, Lck1/i;->a:F

    invoke-static {p4, p2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "KeyMetricTile"

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 p2, 0x1

    const/high16 p4, 0x3f800000    # 1.0f

    invoke-interface {p0, p1, p2, p4}, Ll0/s1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p4, p0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;Lc41/w2;Lak1/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p4, Lvj1/a$f;

    invoke-virtual {p1}, Lc41/w2;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lc41/w2;->l()Lc41/x2;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lc41/x2;->b()Lhy0/b2;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {p4, v0, v1, p2}, Lvj1/a$f;-><init>(Ljava/lang/String;Lhy0/b2;Lak1/a;)V

    invoke-interface {p0, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lak1/b$e;

    invoke-direct {p0, p1}, Lak1/b$e;-><init>(Lc41/w2;)V

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Ly71/o;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x2b4c61c7

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    sget p2, Lck1/i;->b:F

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final x(Lm91/u;Lkotlin/jvm/functions/Function1;Lak1/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ly71/o;

    invoke-virtual {p0}, Ly71/o;->h()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p4

    sget-object v0, Lcom/whoop/navigation/AppScreen$p2;->w:Lcom/whoop/navigation/AppScreen$p2;

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    new-instance p4, Lvj1/a$d;

    invoke-direct {p4, p2}, Lvj1/a$d;-><init>(Lak1/a;)V

    invoke-interface {p1, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance p1, Lzj1/a$c;

    invoke-direct {p1, p0}, Lzj1/a$c;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Ln71/q;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x2f924574

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    return-object p0
.end method

.method private static final z(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
