.class public abstract Lp31/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001aM\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a/\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u000c2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\r2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a;\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00112\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\r2\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\"\u001a\u0010\u0019\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001b\u00b2\u0006\u000e\u0010\u001a\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lp31/c;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onExpandedChange",
        "Lp31/d;",
        "onEvent",
        "y",
        "(Lp31/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lp31/h;",
        "Lkotlin/Function0;",
        "onDismiss",
        "t",
        "(Lp31/h;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lp31/b;",
        "Lkd1/l;",
        "o",
        "(Lp31/b;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Landroidx/compose/ui/Modifier;",
        "H",
        "()Landroidx/compose/ui/Modifier;",
        "fabTooltipBackgroundModifier",
        "expanded",
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
.field private static final a:Landroidx/compose/ui/Modifier;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const/4 v0, 0x5

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v2, v1

    mul-float v4, v0, v2

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    sget-wide v2, Li2/x;->b:J

    const v0, 0x3f19999a    # 0.6f

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v7

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v9

    const/4 v11, 0x4

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    invoke-static/range {v3 .. v11}, Le93/b;->a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    double-to-float v2, v2

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v5

    invoke-static {v0, v2, v3}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide v2, 0xcc000000L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v0, v2, v3, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Li2/t;->b:Li2/s;

    const-wide v2, 0xcc38444fL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v6, Li2/x;

    invoke-direct {v6, v2, v3}, Li2/x;-><init>(J)V

    const-wide v2, 0xff252d34L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v7, Li2/x;

    invoke-direct {v7, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v6, v7}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v3, 0xe

    const/4 v6, 0x0

    invoke-static {v5, v2, v6, v6, v3}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v2

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v0, v2, v3, v6, v1}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x1

    int-to-float v1, v1

    const v2, 0x44ffffff    # 2047.9999f

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v2

    new-instance v6, Li2/x;

    invoke-direct {v6, v2, v3}, Li2/x;-><init>(J)V

    const v2, 0xffffff

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v7

    new-instance v3, Li2/x;

    invoke-direct {v3, v7, v8}, Li2/x;-><init>(J)V

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v7

    new-instance v2, Li2/x;

    invoke-direct {v2, v7, v8}, Li2/x;-><init>(J)V

    filled-new-array {v6, v3, v2}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/16 v11, 0x16

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, 0x439d8000    # 315.0f

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lgb1/u;->b(Li2/s;Ljava/util/List;Ljava/util/List;IFZILjava/lang/Object;)Li2/t;

    move-result-object v2

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Lp31/f;->a:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method private static final A(Lp31/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lp1/c1;)Z
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

.method private static final C(Lp1/c1;Z)V
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

.method private static final D(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p2}, Lp31/f;->B(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p2, v0}, Lp31/f;->C(Lp1/c1;Z)V

    invoke-static {p2}, Lp31/f;->B(Lp1/c1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lp31/f;->B(Lp1/c1;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lp31/d$b;->a:Lp31/d$b;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lp31/c;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p4, 0x1

    move-object v7, p3

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-static {p2}, Lp31/f;->B(Lp1/c1;)Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p3, Lx81/d;->a:Lx81/d;

    invoke-static {p3}, Lyb0/f;->a(Lx81/d;)I

    move-result p3

    goto :goto_1

    :cond_1
    sget-object p3, Lx81/d;->a:Lx81/d;

    invoke-virtual {p3}, Lx81/d;->d()Lgz0/o0;

    move-result-object p3

    invoke-virtual {p3}, Lgz0/o0;->a()Lgz0/a;

    move-result-object p3

    invoke-virtual {p3}, Lgz0/a;->a()I

    move-result p3

    :goto_1
    invoke-static {p3, v7, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v4

    invoke-static {p2}, Lp31/f;->B(Lp1/c1;)Z

    move-result p3

    if-eqz p3, :cond_2

    const p3, -0x68e339d

    invoke-virtual {v7, p3}, Lp1/q;->e0(I)V

    sget p3, Lgy0/f;->h1:I

    :goto_2
    invoke-static {v7, p3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object v5, p3

    goto :goto_3

    :cond_2
    const p3, -0x68e2e7e

    invoke-virtual {v7, p3}, Lp1/q;->e0(I)V

    sget p3, Lgy0/f;->i1:I

    goto :goto_2

    :goto_3
    invoke-static {p2}, Lp31/f;->B(Lp1/c1;)Z

    move-result p3

    const/4 v0, 0x6

    if-eqz p3, :cond_3

    const p3, -0x68e2336

    invoke-virtual {v7, p3}, Lp1/q;->e0(I)V

    sget-object p3, Lx81/d;->a:Lx81/d;

    invoke-static {p3, v7, v0, v2}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    goto :goto_4

    :cond_3
    const p3, -0x68e1ef6

    invoke-virtual {v7, p3}, Lp1/q;->e0(I)V

    sget-object p3, Lx81/d;->a:Lx81/d;

    invoke-static {p3, v7, v0, v2}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    :goto_4
    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v6, 0x0

    move-object v9, v7

    move-wide v7, v0

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v7, v9

    invoke-static {p2}, Lp31/f;->B(Lp1/c1;)Z

    move-result p3

    if-eqz p3, :cond_6

    const p3, 0x34cb3c94

    invoke-virtual {v7, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lp31/c;->b()Ljava/util/List;

    move-result-object p3

    if-nez p3, :cond_4

    invoke-virtual {p0}, Lp31/c;->c()Z

    move-result p0

    const/4 p3, 0x0

    invoke-static {p0, v2, v3, p3}, Lp31/e;->b(ZZILjava/lang/Object;)Ljava/util/List;

    move-result-object p3

    :cond_4
    new-instance v4, Lp31/h;

    invoke-static {p2}, Lp31/f;->B(Lp1/c1;)Z

    move-result p0

    invoke-direct {v4, p3, p0, p1}, Lp31/h;-><init>(Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p0, p1, :cond_5

    new-instance p0, Lh01/i;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p2}, Lh01/i;-><init>(ILp1/c1;)V

    invoke-virtual {v7, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v5, p0

    check-cast v5, Lc93/a;

    const/16 v8, 0x30

    const/4 v9, 0x4

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp31/f;->t(Lp31/h;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    const p0, 0x34d18ac2

    invoke-virtual {v7, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lp31/f;->C(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lp31/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lp31/f;->y(Lp31/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final H()Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object v0, Lp31/f;->a:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public static synthetic a(Lp31/h;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lp31/f;->u(Lp31/h;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkd1/l;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lp31/f;->p(Lkd1/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp31/b;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lp31/f;->s(Lp31/b;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp31/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lp31/f;->G(Lp31/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp31/d;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lp31/f;->A(Lp31/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lp31/f;->z(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp31/b;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp31/f;->r(Lp31/b;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lp31/f;->D(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp31/h;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lp31/f;->x(Lp31/h;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lc93/a;Lp31/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lp31/f;->q(Lc93/a;Lp31/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lp31/h;Lkd1/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lp31/f;->w(Lp31/h;Lkd1/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lp31/c;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lp31/f;->E(Lp31/c;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lp31/h;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lp31/f;->v(Lp31/h;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lp31/f;->F(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lp31/b;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp31/b;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismiss"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x10f2114e

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v10, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v3, v4, 0x30

    const/16 v5, 0x20

    if-nez v3, :cond_3

    invoke-virtual {v10, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v5

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p5, 0x4

    const/16 v6, 0x100

    if-eqz v3, :cond_4

    or-int/lit16 v0, v0, 0x180

    goto :goto_4

    :cond_4
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v10, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v6

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :cond_6
    :goto_4
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v8, v9, :cond_7

    move v8, v12

    goto :goto_5

    :cond_7
    move v8, v11

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v10, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_f

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_8

    new-instance v3, Lov2/f;

    const/16 v7, 0x13

    invoke-direct {v3, v7}, Lov2/f;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_9
    move-object v3, p2

    :goto_6
    and-int/lit8 v7, v0, 0x70

    if-ne v7, v5, :cond_a

    move v5, v12

    goto :goto_7

    :cond_a
    move v5, v11

    :goto_7
    and-int/lit8 v7, v0, 0xe

    if-ne v7, v1, :cond_b

    move v1, v12

    goto :goto_8

    :cond_b
    move v1, v11

    :goto_8
    or-int/2addr v1, v5

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v6, :cond_c

    move v11, v12

    :cond_c
    or-int v0, v1, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_d

    if-ne v1, v8, :cond_e

    :cond_d
    new-instance v1, Ln0/j;

    const/16 v0, 0x10

    invoke-direct {v1, p1, p0, v3, v0}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v5, v1

    check-cast v5, Lc93/a;

    new-instance v0, Llz1/a;

    const/16 v1, 0xb

    invoke-direct {v0, p0, v1}, Llz1/a;-><init>(Ljava/lang/Object;I)V

    const v1, -0x4beb1735

    invoke-static {v1, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/high16 v11, 0x30000

    const/16 v12, 0x1e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f0;->b(Lc93/a;Landroidx/compose/ui/Modifier;ZLl0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_9

    :cond_f
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v3, p2

    :goto_9
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lot1/f;

    const/16 v6, 0xa

    move-object v1, p0

    move-object v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final p(Lkd1/l;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lc93/a;Lp31/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-virtual {p1}, Lp31/b;->a()Lkd1/l;

    move-result-object p0

    sget-object v0, Lkd1/l;->NONE:Lkd1/l;

    if-eq p0, v0, :cond_0

    invoke-virtual {p1}, Lp31/b;->a()Lkd1/l;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lp31/b;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    const-string v0, "$this$DropdownMenuItem"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lp31/b;->b()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v8, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v6

    int-to-float v4, v1

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v4, v5

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v9, 0x1b0

    const/4 v10, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lp31/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v8, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v5

    invoke-virtual {v0, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->m()Lb91/a;

    move-result-object v0

    invoke-virtual {v0}, Lb91/a;->d()Ll3/v0;

    move-result-object v9

    const/16 v0, 0xc

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v12

    const/16 v22, 0x0

    const v23, 0xfffffd

    const-wide/16 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v23

    const/16 v26, 0x0

    const v27, 0xfffa

    const/4 v4, 0x0

    move-object/from16 v24, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final s(Lp31/b;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lp31/f;->o(Lp31/b;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Lp31/h;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp31/h;",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismiss"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x46560363

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v3, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v6, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_4

    move-object/from16 v6, p2

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v10, 0x1

    if-eq v7, v8, :cond_7

    move v7, v10

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    :goto_5
    and-int/2addr v0, v10

    invoke-virtual {v9, v0, v7}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    if-eqz v5, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_8
    move-object v0, v6

    :goto_6
    sget-object v5, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v9, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lg1/c1;

    sget-wide v13, Li2/x;->m:J

    const-wide/16 v15, 0x0

    const/16 v17, 0x1fdf

    const-wide/16 v11, 0x0

    invoke-static/range {v10 .. v17}, Lg1/c1;->a(Lg1/c1;JJJI)Lg1/c1;

    move-result-object v5

    invoke-static {}, Lg1/m5;->a()Lp1/u2;

    move-result-object v6

    invoke-virtual {v9, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/l5;

    const/4 v7, 0x5

    int-to-float v8, v7

    int-to-float v3, v3

    mul-float/2addr v8, v3

    invoke-static {v8}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    const/4 v8, 0x0

    invoke-static {v6, v8, v3, v7}, Lg1/l5;->a(Lg1/l5;Lt0/i;Lt0/i;I)Lg1/l5;

    move-result-object v7

    new-instance v3, Ljp1/k;

    const/16 v6, 0xe

    invoke-direct {v3, v1, v0, v2, v6}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v6, -0x5e0938b7

    invoke-static {v6, v9, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/16 v10, 0xc00

    const/4 v11, 0x2

    const/4 v6, 0x0

    invoke-static/range {v5 .. v11}, Lio/sentry/config/a;->g(Lg1/c1;Lg1/h9;Lg1/l5;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v0

    goto :goto_7

    :cond_9
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v6

    :goto_7
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_a

    new-instance v0, Lot1/f;

    const/16 v6, 0x9

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final u(Lp31/h;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p4, 0x1

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lp31/h;->a()Z

    move-result v3

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    neg-float v4, v0

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v6, v0

    const/16 v0, 0x20

    shl-long/2addr v4, v0

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    or-long/2addr v6, v4

    sget-object v0, Lp31/f;->a:Landroidx/compose/ui/Modifier;

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    int-to-float v0, v2

    mul-float/2addr v0, v1

    invoke-static {p1, v0, v0}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance p1, Loq1/c;

    const/4 v0, 0x2

    move-object/from16 v4, p2

    invoke-direct {p1, v0, p0, v4}, Loq1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p0, 0x7393a77c

    invoke-static {p0, v11, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const v12, 0x180c00

    const/16 v13, 0x30

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v13}, Lg1/f0;->a(ZLc93/a;Landroidx/compose/ui/Modifier;JLf0/r1;Lc4/j0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lp31/h;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    const-string v0, "$this$DropdownMenu"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p4, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p2, v0, :cond_0

    move p2, v2

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    and-int/2addr p4, v2

    move-object v6, p3

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p0}, Lp31/h;->b()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move p3, v1

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    add-int/lit8 v0, p3, 0x1

    if-ltz p3, :cond_4

    move-object v3, p4

    check-cast v3, Lp31/b;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez p4, :cond_1

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne v4, p4, :cond_2

    :cond_1
    new-instance v4, Lno0/e0;

    const/16 p4, 0x1a

    invoke-direct {v4, p0, p4}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v5, v4

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Lp31/f;->o(Lp31/b;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p0}, Lp31/h;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, v2

    if-ge p3, p1, :cond_3

    const p1, 0x2fc338ad

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x2

    int-to-float p1, p1

    const/4 p3, 0x4

    int-to-float p3, p3

    sget-object p4, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p3, p4, v6, v1}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_2

    :cond_3
    const p1, 0x2fc47401

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    :goto_2
    move p3, v0

    move-object p1, v4

    goto :goto_1

    :cond_4
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_5
    invoke-virtual {v6}, Lp1/q;->X()V

    :cond_6
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lp31/h;Lkd1/l;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lp31/h;->c()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    new-instance v0, Lp31/d$a;

    invoke-direct {v0, p1}, Lp31/d$a;-><init>(Lkd1/l;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp31/h;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lp31/f;->t(Lp31/h;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final y(Lp31/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp31/c;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x36ffdd77

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, p6, 0x4

    const/16 v7, 0x100

    if-eqz v6, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v7

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit8 v9, p6, 0x8

    const/16 v11, 0x800

    if-eqz v9, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v12, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v5, 0xc00

    if-nez v12, :cond_8

    move-object/from16 v12, p3

    invoke-virtual {v10, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    move v13, v11

    goto :goto_6

    :cond_a
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v0, v13

    :goto_7
    and-int/lit16 v13, v0, 0x493

    const/16 v14, 0x492

    const/4 v15, 0x1

    const/4 v8, 0x0

    if-eq v13, v14, :cond_b

    move v13, v15

    goto :goto_8

    :cond_b
    move v13, v8

    :goto_8
    and-int/lit8 v14, v0, 0x1

    invoke-virtual {v10, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_18

    if-eqz v3, :cond_c

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_9

    :cond_c
    move-object v3, v4

    :goto_9
    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_d

    new-instance v6, Lnm1/g;

    const/16 v13, 0xc

    invoke-direct {v6, v13}, Lnm1/g;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v13, v6

    goto :goto_a

    :cond_e
    move-object/from16 v13, p2

    :goto_a
    if-eqz v9, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_f

    new-instance v6, Lnm1/g;

    const/16 v9, 0xd

    invoke-direct {v6, v9}, Lnm1/g;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v14, v6

    goto :goto_b

    :cond_10
    move-object v14, v12

    :goto_b
    invoke-virtual {v1}, Lp31/c;->d()Z

    move-result v6

    if-eqz v6, :cond_17

    const v6, 0x59510348

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_11

    invoke-virtual {v1}, Lp31/c;->a()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v6, Lp1/c1;

    and-int/lit16 v9, v0, 0x380

    if-ne v9, v7, :cond_12

    move v7, v15

    goto :goto_c

    :cond_12
    move v7, v8

    :goto_c
    and-int/lit16 v0, v0, 0x1c00

    if-ne v0, v11, :cond_13

    move v0, v15

    goto :goto_d

    :cond_13
    move v0, v8

    :goto_d
    or-int/2addr v0, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_14

    if-ne v7, v4, :cond_15

    :cond_14
    new-instance v7, Lc41/m;

    invoke-direct {v7, v13, v14, v6}, Lc41/m;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v7, Lc93/a;

    invoke-static {v6}, Lp31/f;->B(Lp1/c1;)Z

    move-result v0

    const/4 v4, 0x6

    if-eqz v0, :cond_16

    const v0, 0x767ead1e

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0, v10, v4, v8}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    goto :goto_e

    :cond_16
    const v0, 0x767eb101

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0, v10, v4, v8}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    :goto_e
    const/4 v0, 0x3

    int-to-float v0, v0

    int-to-float v2, v2

    invoke-static {v3, v0, v2, v11, v12}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v2, v15

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v2, Lg1/e7;

    const/4 v4, 0x2

    invoke-direct {v2, v1, v14, v6, v4}, Lg1/e7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v4, 0x2dcfe6e0

    invoke-static {v4, v10, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/16 v11, 0x6000

    const/16 v12, 0xc

    move v2, v8

    const/4 v8, 0x0

    move-object v6, v7

    move-object v7, v0

    invoke-static/range {v6 .. v12}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_17
    move v2, v8

    const v0, 0x59671c6b

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_f
    move-object v2, v3

    move-object v3, v13

    move-object v4, v14

    goto :goto_10

    :cond_18
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object v2, v4

    move-object v4, v12

    :goto_10
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v0, Lb11/c;

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lb11/c;-><init>(Lp31/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final z(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
