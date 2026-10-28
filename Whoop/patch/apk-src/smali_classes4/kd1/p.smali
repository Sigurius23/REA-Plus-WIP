.class public abstract Lkd1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001aA\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001aC\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\"\u001d\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "",
        "Lkd1/o;",
        "k",
        "(I)Lkd1/o;",
        "",
        "l",
        "(Ljava/lang/String;)Lkd1/o;",
        "Lkotlin/Function1;",
        "Lcoil/compose/AsyncImagePainter$State$Success;",
        "Ll83/a0;",
        "onSuccess",
        "Lmh/h;",
        "builder",
        "Ln2/a;",
        "i",
        "(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;",
        "Lkd1/o$c;",
        "source",
        "Lcoil/compose/AsyncImagePainter;",
        "g",
        "(Lkd1/o$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;",
        "",
        "f",
        "(Lkd1/o;)Z",
        "Lp1/t1;",
        "a",
        "Lp1/t1;",
        "e",
        "()Lp1/t1;",
        "LocalUseSoftwareBitmaps",
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
.field private static final a:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj02/w;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lj02/w;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lkd1/p;->a:Lp1/t1;

    return-void
.end method

.method public static synthetic a(Lkd1/m;Ljava/lang/Object;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkd1/p;->h(Lkd1/m;Ljava/lang/Object;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkd1/p;->j(Lmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Z
    .locals 1

    invoke-static {}, Lkd1/p;->d()Z

    move-result v0

    return v0
.end method

.method private static final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static final e()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lkd1/p;->a:Lp1/t1;

    return-object v0
.end method

.method public static final f(Lkd1/o;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lkd1/o$c;

    if-nez v0, :cond_0

    instance-of p0, p0, Lkd1/o$a;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final g(Lkd1/o$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd1/o$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Lcoil/compose/AsyncImagePainter;"
        }
    .end annotation

    and-int/lit8 p4, p5, 0x4

    const/4 p5, 0x0

    if-eqz p4, :cond_0

    move-object p2, p5

    :cond_0
    invoke-static {}, Lkd1/n;->c()Lp1/t1;

    move-result-object p4

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lkd1/m;

    sget-object v0, Lkd1/p;->a:Lp1/t1;

    invoke-virtual {p3, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    new-instance v1, Lmh/h;

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-direct {v1, v3}, Lmh/h;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lkd1/o$c;->a()Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lmh/h;->c:Ljava/lang/Object;

    invoke-virtual {p0}, Lkd1/o$c;->d()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lmh/h;->r:Ljava/lang/Integer;

    invoke-virtual {p0}, Lkd1/o$c;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lmh/h;->s:Ljava/lang/Integer;

    invoke-virtual {p0}, Lkd1/o$c;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lmh/h;->t:Ljava/lang/Integer;

    new-instance v3, Ldh/s;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Lmh/h;->h:Ldh/i;

    if-eqz v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, v1, Lmh/h;->n:Ljava/lang/Boolean;

    :cond_1
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lmh/h;->a()Lmh/j;

    move-result-object p1

    invoke-virtual {p3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lbh/a;->a(Landroid/content/Context;)Lbh/e;

    move-result-object v0

    const v1, 0x7f996210

    invoke-virtual {p3, v1}, Lp1/q;->f0(I)V

    new-instance v1, Lch/l;

    sget-object v2, Lch/k;->b:Lqt/e;

    invoke-direct {v1, p1, v2, v0}, Lch/l;-><init>(Ljava/lang/Object;Lqt/e;Lbh/e;)V

    sget-object p1, Lch/v;->b:Lnh/e;

    sget-object p1, Lcoil/compose/AsyncImagePainter;->T:La11/g;

    invoke-static {p2, p5}, Lch/v;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lch/u;

    move-result-object p2

    sget-object v0, Ly2/j;->b:Ly2/b1;

    invoke-static {v1, p1, p2, v0, p3}, Lch/k;->b(Lch/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly2/k;Landroidx/compose/runtime/Composer;)Lcoil/compose/AsyncImagePainter;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p3, p2}, Lp1/q;->q(Z)V

    if-eqz p4, :cond_7

    invoke-virtual {p0}, Lkd1/o$c;->a()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_7

    const p0, -0x49fb1f35

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p0, v0, :cond_2

    new-instance p0, Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p3, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p3, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    if-ne v2, v0, :cond_4

    :cond_3
    new-instance v2, Lbp0/n;

    const/16 v1, 0x16

    invoke-direct {v2, v1, p4, p0}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, v2, p3}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    iget-object v1, p1, Lcoil/compose/AsyncImagePainter;->Q:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lch/f;

    invoke-virtual {p3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p3, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_5

    if-ne v3, v0, :cond_6

    :cond_5
    new-instance v3, Lkd1/p$a;

    invoke-direct {v3, v1, p4, p0, p5}, Lkd1/p$a;-><init>(Lch/f;Lkd1/m;Ljava/lang/Object;Lq83/d;)V

    invoke-virtual {p3, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lc93/m;

    invoke-static {p3, v3, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p3, p2}, Lp1/q;->q(Z)V

    return-object p1

    :cond_7
    const p0, -0x49f20b8a

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, p2}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method private static final h(Lkd1/m;Ljava/lang/Object;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lkd1/m;->d(Ljava/lang/Object;)V

    new-instance p2, Lkd1/p$b;

    invoke-direct {p2, p0, p1}, Lkd1/p$b;-><init>(Lkd1/m;Ljava/lang/Object;)V

    return-object p2
.end method

.method public static final i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd1/o;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Ln2/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    move-object v2, p1

    and-int/lit8 p1, p5, 0x2

    sget-object p5, Lp1/l;->a:Lp1/v0;

    if-eqz p1, :cond_2

    move-object p1, p3

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p5, :cond_1

    new-instance p2, Lji0/b;

    const/16 v0, 0x18

    invoke-direct {p2, v0}, Lji0/b;-><init>(I)V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_2
    move-object v1, p2

    instance-of p1, p0, Lkd1/o$c;

    const/4 p2, 0x0

    if-eqz p1, :cond_3

    move-object v3, p3

    check-cast v3, Lp1/q;

    const p1, -0x76fbf137

    invoke-virtual {v3, p1}, Lp1/q;->e0(I)V

    move-object v0, p0

    check-cast v0, Lkd1/o$c;

    and-int/lit8 p0, p4, 0xe

    shr-int/lit8 p1, p4, 0x3

    and-int/lit8 p1, p1, 0x70

    or-int/2addr p0, p1

    shl-int/lit8 p1, p4, 0x3

    and-int/lit16 p1, p1, 0x380

    or-int v4, p0, p1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkd1/p;->g(Lkd1/o$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;

    move-result-object p0

    invoke-virtual {v3, p2}, Lp1/q;->q(Z)V

    return-object p0

    :cond_3
    instance-of p1, p0, Lkd1/o$a;

    if-eqz p1, :cond_4

    check-cast p3, Lp1/q;

    const p1, -0x76fbe5bc

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    check-cast p0, Lkd1/o$a;

    invoke-virtual {p0}, Lkd1/o$a;->a()I

    move-result p0

    invoke-static {p0, p3, p2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object p0

    invoke-virtual {p3, p2}, Lp1/q;->q(Z)V

    return-object p0

    :cond_4
    sget-object p1, Lkd1/o$b;->b:Lkd1/o$b;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    check-cast p3, Lp1/q;

    const p0, -0x687f4bd6

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p5, :cond_5

    new-instance p0, Landroidx/compose/ui/graphics/painter/ColorPainter;

    sget-wide p4, Li2/x;->m:J

    invoke-direct {p0, p4, p5}, Landroidx/compose/ui/graphics/painter/ColorPainter;-><init>(J)V

    invoke-virtual {p3, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p0, Landroidx/compose/ui/graphics/painter/ColorPainter;

    invoke-virtual {p3, p2}, Lp1/q;->q(Z)V

    return-object p0

    :cond_6
    const p0, -0x76fbf55d

    check-cast p3, Lp1/q;

    invoke-static {p0, p3, p2}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0
.end method

.method private static final j(Lmh/h;)Ll83/a0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(I)Lkd1/o;
    .locals 1

    new-instance v0, Lkd1/o$a;

    invoke-direct {v0, p0}, Lkd1/o$a;-><init>(I)V

    return-object v0
.end method

.method public static final l(Ljava/lang/String;)Lkd1/o;
    .locals 7

    new-instance v0, Lkd1/o$c;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
