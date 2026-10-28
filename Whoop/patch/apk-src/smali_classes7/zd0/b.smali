.class public abstract Lzd0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aO\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001aC\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u000c2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e\u00b2\u0006\u000c\u0010\u001d\u001a\u00020\u00118\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lxd0/e;",
        "viewState",
        "",
        "source",
        "Lkotlin/Function1;",
        "Lkd0/a$c;",
        "Ll83/a0;",
        "onAnalyticsEvent",
        "Lwd0/a;",
        "onNavigationEvent",
        "x",
        "(Lxd0/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lxd0/e$c;",
        "o",
        "(Lxd0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lkd1/o;",
        "imageSource",
        "",
        "alpha",
        "m",
        "(Lkd1/o;FLandroidx/compose/runtime/Composer;I)V",
        "",
        "event",
        "C",
        "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V",
        "Ly3/f;",
        "a",
        "F",
        "backgroundImageGapHeight",
        "easedImageAlpha",
        "advanced-labs_release"
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

    const/16 v0, 0x78

    int-to-float v0, v0

    sput v0, Lzd0/b;->a:F

    return-void
.end method

.method private static final A(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lwd0/a$a;->a:Lwd0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lxd0/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lzd0/b;->x(Lxd0/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const-string v0, "onNavigationEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_0

    new-instance v0, Lwd0/a$b;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {v0, p1}, Lwd0/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzd0/b;->t(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxd0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lzd0/b;->w(Lxd0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lxd0/e$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzd0/b;->v(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lxd0/e$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxd0/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lzd0/b;->B(Lxd0/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzd0/b;->u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkd0/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzd0/b;->p(Lkd0/a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzd0/b;->A(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkd0/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzd0/b;->y(Lkd0/a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkd1/o;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzd0/b;->n(Lkd1/o;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lwd0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzd0/b;->q(Lwd0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ly3/c;Lf0/r1;)F
    .locals 0

    invoke-static {p0, p1}, Lzd0/b;->r(Ly3/c;Lf0/r1;)F

    move-result p0

    return p0
.end method

.method public static synthetic l(Lwd0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzd0/b;->z(Lwd0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lkd1/o;FLandroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v3, p2

    check-cast v3, Lp1/q;

    const p2, 0x747f1920

    invoke-virtual {v3, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_2

    and-int/lit8 p2, p3, 0x8

    if-nez p2, :cond_0

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    :goto_0
    if-eqz p2, :cond_1

    const/4 p2, 0x4

    goto :goto_1

    :cond_1
    const/4 p2, 0x2

    :goto_1
    or-int/2addr p2, p3

    goto :goto_2

    :cond_2
    move p2, p3

    :goto_2
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_4

    invoke-virtual {v3, p1}, Lp1/q;->d(F)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x20

    goto :goto_3

    :cond_3
    const/16 v0, 0x10

    :goto_3
    or-int/2addr p2, v0

    :cond_4
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x0

    const/4 v10, 0x1

    if-eq v0, v1, :cond_5

    move v0, v10

    goto :goto_4

    :cond_5
    move v0, v2

    :goto_4
    and-int/lit8 v1, p2, 0x1

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_6

    invoke-virtual {v3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v3, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v3, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v2, v3, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v3, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lkd1/o;->a:I

    and-int/lit8 p2, p2, 0xe

    or-int v4, v0, p2

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object p0

    move-object p2, v0

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->x:Lb2/m;

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v2, v0, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p1, v0}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v8, 0x6030

    const/16 v9, 0x68

    const/4 v1, 0x0

    move-object v7, v3

    const/4 v3, 0x0

    sget-object v4, Ly2/j;->d:Ly2/b1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v7

    invoke-virtual {v3, v10}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    move-object p2, p0

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_a

    new-instance v0, Lz72/e;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p1, p3, v1}, Lz72/e;-><init>(Lkd1/o;FII)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final n(Lkd1/o;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzd0/b;->m(Lkd1/o;FLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Lxd0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 61
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd0/e$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x6886d079

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v11, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit16 v10, v0, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    const/4 v2, 0x1

    if-eq v10, v12, :cond_8

    move v10, v2

    goto :goto_6

    :cond_8
    move v10, v13

    :goto_6
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v11, v12, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_27

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v10, :cond_9

    new-instance v5, Lzc1/h7;

    const/16 v6, 0xe

    invoke-direct {v5, v6}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v5, v6

    :goto_7
    if-eqz v7, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v10, :cond_b

    new-instance v6, Lzc1/h7;

    const/16 v7, 0xf

    invoke-direct {v6, v7}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v6, v9

    :goto_8
    invoke-static {v13, v11, v2}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v7

    sget-object v9, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v11, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly3/c;

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v12, v12, v16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v12, :cond_d

    if-ne v15, v10, :cond_e

    :cond_d
    new-instance v12, Lz72/c;

    const/4 v15, 0x1

    invoke-direct {v12, v9, v7, v15}, Lz72/c;-><init>(Ly3/c;Lf0/r1;I)V

    invoke-static {v12}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v15

    invoke-virtual {v11, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v15, Lp1/t2;

    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    move-object/from16 p1, v15

    sget-object v15, Lx81/d;->a:Lx81/d;

    move-object/from16 p2, v7

    sget v7, Lx81/d;->b:I

    invoke-virtual {v15, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ly81/i;->o()J

    move-result-wide v2

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v14, v2, v3, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    move-object v8, v10

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_f

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v11, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v11, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v21, v5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto :goto_a

    :cond_10
    move-object/from16 v21, v5

    :goto_a
    invoke-static {v9, v11, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lxd0/e$c;->d()Lkd1/o;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lzd0/b;->s(Lp1/t2;)F

    move-result v5

    sget v9, Lkd1/o;->a:I

    invoke-static {v2, v5, v11, v9}, Lzd0/b;->m(Lkd1/o;FLandroidx/compose/runtime/Composer;I)V

    invoke-static {v12}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    move/from16 p1, v7

    move-object/from16 v20, v8

    const/4 v7, 0x0

    invoke-static {v5, v9, v11, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move-object/from16 v23, v8

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v11}, Lp1/q;->i0()V

    move-object/from16 v24, v5

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-eqz v5, :cond_12

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    :goto_b
    move-object/from16 v5, v23

    goto :goto_c

    :cond_12
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_b

    :goto_c
    invoke-static {v11, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    :cond_13
    invoke-static {v7, v11, v7, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v11, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v25

    const/4 v5, 0x2

    int-to-float v7, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v27, v7, v5

    const/4 v7, 0x1

    int-to-float v8, v7

    mul-float v29, v8, v5

    const/16 v30, 0x5

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v25 .. v30}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v31, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v4}, Lxd0/e$c;->f()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v32

    sget-object v8, Lgz0/m0;->CARET_BACKWARD:Lgz0/m0;

    invoke-virtual {v8}, Lgz0/m0;->toWhoopIcon()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v34

    const v48, 0xfffa

    const/16 v49, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

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

    invoke-direct/range {v31 .. v49}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v8, v0, 0x380

    const/16 v2, 0x100

    if-ne v8, v2, :cond_15

    const/16 v18, 0x1

    goto :goto_d

    :cond_15
    const/16 v18, 0x0

    :goto_d
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move/from16 v32, v0

    move-object/from16 v0, v20

    if-nez v18, :cond_17

    if-ne v2, v0, :cond_16

    goto :goto_e

    :cond_16
    move-object/from16 v20, v0

    goto :goto_f

    :cond_17
    :goto_e
    new-instance v2, Lyk2/i;

    move-object/from16 v20, v0

    const/16 v0, 0x1d

    invoke-direct {v2, v6, v0}, Lyk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v2, Lc93/a;

    sget v0, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v0, v0, 0x3

    move-object/from16 v18, v7

    const/4 v7, 0x6

    or-int/2addr v0, v7

    move-object/from16 v25, v13

    const/16 v13, 0x34

    move/from16 v26, v7

    const/4 v7, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    move-object/from16 v30, v10

    const/4 v10, 0x0

    move-object/from16 v34, v1

    move-object/from16 v36, v3

    move/from16 v51, v5

    move-object/from16 v50, v6

    move/from16 v54, v8

    move-object/from16 v5, v18

    move-object/from16 v55, v20

    move-object/from16 v33, v21

    move-object/from16 v4, v25

    move/from16 v52, v27

    move-object/from16 v1, v28

    move/from16 v53, v29

    move-object/from16 v35, v30

    move-object/from16 v6, v31

    const/high16 v3, 0x3f800000    # 1.0f

    move-object v8, v2

    move-object v2, v12

    move v12, v0

    move-object/from16 v0, p2

    move-object/from16 p2, v15

    move-object/from16 v15, v24

    invoke-static/range {v5 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0x10

    int-to-float v9, v6

    const/4 v10, 0x7

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    float-to-double v6, v3

    const-wide/16 v12, 0x0

    cmpl-double v6, v6, v12

    if-lez v6, :cond_18

    :goto_10
    const/4 v7, 0x1

    goto :goto_11

    :cond_18
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_10

    :goto_11
    invoke-static {v5, v7, v3}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lgb1/c;->m(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v7, 0xe

    invoke-static {v5, v0, v7}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v7, 0x0

    invoke-static {v15, v1, v11, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_19

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_19
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v11, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v36

    invoke-static {v11, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_1a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1b

    :cond_1a
    move-object/from16 v8, v35

    goto :goto_14

    :cond_1b
    move-object/from16 v8, v35

    :goto_13
    move-object/from16 v7, v34

    goto :goto_15

    :goto_14
    invoke-static {v7, v11, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_13

    :goto_15
    invoke-static {v11, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v0, v51

    mul-float/2addr v9, v0

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v11, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lxd0/e$c;->c()Lxd0/b;

    move-result-object v9

    invoke-virtual {v9}, Lxd0/b;->b()Ljava/lang/String;

    move-result-object v9

    move/from16 v12, p1

    move-object/from16 v10, p2

    invoke-virtual {v10, v11, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->O()Lb91/a;

    move-result-object v25

    invoke-virtual {v10, v11, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v17

    move/from16 v19, v6

    move/from16 v13, v52

    move/from16 v15, v53

    invoke-static {v2, v13, v15}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v20, Lb91/a;->d:I

    shl-int/lit8 v29, v20, 0x12

    const v30, 0x2fff8

    move-object/from16 v36, v5

    move-object v5, v9

    move-object/from16 v20, v10

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move/from16 v21, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v22, v14

    const-wide/16 v14, 0x0

    const/16 v23, 0x20

    const/16 v16, 0x0

    move-object/from16 v34, v7

    move-object/from16 v35, v8

    move-wide/from16 v7, v17

    const/16 v17, 0x0

    move/from16 v24, v19

    const-wide/16 v18, 0x0

    move-object/from16 v26, v20

    const/16 v20, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v37, v22

    const/16 v22, 0x0

    move/from16 v38, v23

    const/16 v23, 0x0

    move/from16 v39, v24

    const/16 v24, 0x0

    move-object/from16 v40, v26

    const/16 v26, 0x0

    move/from16 v41, v28

    const/16 v28, 0x30

    move-object/from16 v59, v34

    move-object/from16 v58, v35

    move-object/from16 v57, v36

    move-object/from16 v56, v37

    move-object/from16 v3, v40

    move/from16 v0, v52

    move/from16 v60, v53

    move-object/from16 v35, v1

    move-object/from16 v34, v4

    move/from16 v1, v39

    move/from16 v4, v41

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    invoke-virtual/range {p0 .. p0}, Lxd0/e$c;->c()Lxd0/b;

    move-result-object v5

    invoke-virtual {v5}, Lxd0/b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v11, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v7

    const/4 v3, 0x2

    invoke-static {v2, v0, v1, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v11, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v11, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v1, 0x4

    int-to-float v1, v1

    move-object/from16 v3, v35

    move/from16 v4, v51

    const/4 v5, 0x6

    invoke-static {v4, v1, v3, v11, v5}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v1

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_1c

    move-object/from16 v7, v56

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_16
    move-object/from16 v7, v34

    goto :goto_17

    :cond_1c
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_16

    :goto_17
    invoke-static {v11, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v57

    invoke-static {v11, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_1d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    :cond_1d
    move-object/from16 v8, v58

    goto :goto_19

    :cond_1e
    :goto_18
    move-object/from16 v7, v59

    goto :goto_1a

    :goto_19
    invoke-static {v3, v11, v3, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_18

    :goto_1a
    invoke-static {v11, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x529d324e

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lxd0/e$c;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/u;

    move/from16 v4, v54

    const/16 v6, 0x100

    if-ne v4, v6, :cond_1f

    const/4 v13, 0x1

    goto :goto_1c

    :cond_1f
    const/4 v13, 0x0

    :goto_1c
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v8, v55

    if-nez v13, :cond_21

    if-ne v7, v8, :cond_20

    goto :goto_1d

    :cond_20
    move-object/from16 v10, v50

    goto :goto_1e

    :cond_21
    :goto_1d
    new-instance v7, Lwo1/h;

    const/16 v9, 0x19

    move-object/from16 v10, v50

    invoke-direct {v7, v10, v9}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1e
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    invoke-static {v3, v7, v11, v9, v9}, Lkf0/f;->P(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move/from16 v54, v4

    move-object/from16 v55, v8

    move-object/from16 v50, v10

    goto :goto_1b

    :cond_22
    move-object/from16 v10, v50

    move/from16 v4, v54

    move-object/from16 v8, v55

    const/16 v6, 0x100

    const/4 v9, 0x0

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    const/4 v7, 0x1

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v11, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v15, v60

    invoke-static {v1, v0, v15}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lxd0/e$c;->b()Lxd0/a;

    move-result-object v1

    invoke-virtual {v1}, Lxd0/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    and-int/lit8 v2, v32, 0x70

    const/16 v3, 0x20

    if-ne v2, v3, :cond_23

    const/4 v13, 0x1

    goto :goto_1f

    :cond_23
    move v13, v9

    :goto_1f
    if-ne v4, v6, :cond_24

    const/4 v9, 0x1

    :cond_24
    or-int v2, v13, v9

    move-object/from16 v4, p0

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_26

    if-ne v3, v8, :cond_25

    goto :goto_20

    :cond_25
    move-object/from16 v6, v33

    goto :goto_21

    :cond_26
    :goto_20
    new-instance v3, Lre1/k;

    const/16 v2, 0x1c

    move-object/from16 v6, v33

    invoke-direct {v3, v6, v10, v4, v2}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_21
    move-object/from16 v18, v3

    check-cast v18, Lc93/a;

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x12

    or-int/lit8 v20, v2, 0x6

    const/16 v21, 0x0

    const/16 v22, 0x1fbe

    move-object/from16 v33, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v50, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v5, v0

    move-object/from16 v19, v11

    move-object v11, v1

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v19

    const/4 v7, 0x1

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    move-object/from16 v6, v33

    move-object/from16 v5, v50

    goto :goto_22

    :cond_27
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v5, v9

    :goto_22
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_28

    new-instance v0, Lz51/n;

    const/4 v3, 0x3

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lz51/n;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method private static final p(Lkd0/a$c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lwd0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Ly3/c;Lf0/r1;)F
    .locals 4

    sget v0, Lzd0/b;->a:F

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v1

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v1, :cond_0

    move p0, v3

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p1

    invoke-interface {p0, p1}, Ly3/c;->e0(I)F

    move-result p0

    div-float/2addr p0, v0

    sub-float p0, v3, p0

    invoke-static {p0, v2, v3}, Le93/b;->m(FFF)F

    move-result p0

    :goto_0
    sget-object p1, Ld0/a0;->d:Ld0/v;

    invoke-virtual {p1, p0}, Ld0/v;->i(F)F

    move-result p0

    invoke-static {p0, v2, v3}, Le93/b;->m(FFF)F

    move-result p0

    return p0
.end method

.method private static final s(Lp1/t2;)F
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

.method private static final t(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lwd0/a$a;->a:Lwd0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lzd0/b;->C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lxd0/e$c;)Ll83/a0;
    .locals 1

    sget-object v0, Lkd0/a$w;->a:Lkd0/a$w;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lwd0/a$b;

    invoke-virtual {p2}, Lxd0/e$c;->b()Lxd0/a;

    move-result-object p2

    invoke-virtual {p2}, Lxd0/a;->b()Lcom/whoop/navigation/e;

    move-result-object p2

    invoke-direct {p0, p2}, Lwd0/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lxd0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lzd0/b;->o(Lxd0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final x(Lxd0/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd0/e;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x521e771c

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v4, p6, 0x2

    const/16 v6, 0x20

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v6

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    :goto_3
    and-int/lit8 v8, p6, 0x4

    const/16 v10, 0x100

    if-eqz v8, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v11, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v5, 0x180

    if-nez v11, :cond_5

    move-object/from16 v11, p2

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    move v12, v10

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v0, v12

    :goto_5
    and-int/lit8 v12, p6, 0x8

    const/16 v13, 0x800

    if-eqz v12, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v14, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v14, v5, 0xc00

    if-nez v14, :cond_8

    move-object/from16 v14, p3

    invoke-virtual {v9, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    move v15, v13

    goto :goto_6

    :cond_a
    const/16 v15, 0x400

    :goto_6
    or-int/2addr v0, v15

    :goto_7
    and-int/lit16 v15, v0, 0x493

    const/16 v2, 0x492

    const/4 v3, 0x0

    if-eq v15, v2, :cond_b

    const/4 v2, 0x1

    goto :goto_8

    :cond_b
    move v2, v3

    :goto_8
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v9, v15, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1f

    const/4 v2, 0x0

    if-eqz v4, :cond_c

    move-object v4, v2

    goto :goto_9

    :cond_c
    move-object v4, v7

    :goto_9
    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_d

    new-instance v8, Lzc1/h7;

    const/16 v11, 0xc

    invoke-direct {v8, v11}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object v11, v8

    :cond_e
    if-eqz v12, :cond_10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_f

    new-instance v8, Lzc1/h7;

    const/16 v12, 0xd

    invoke-direct {v8, v12}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_10
    move-object v8, v14

    :goto_a
    and-int/lit8 v12, v0, 0xe

    or-int/lit8 v14, v12, 0x30

    const-string v15, "advanced_labs_schedule_primer"

    invoke-static {v1, v15, v9, v14}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    instance-of v14, v1, Lxd0/e$b;

    if-eqz v14, :cond_14

    const v0, -0x4740b779

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ll0/m;->e:Ll0/h;

    sget-object v2, Lb2/e;->N:Lb2/k;

    const/16 v6, 0x36

    invoke-static {v0, v2, v9, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_11

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_11
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v9, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-nez v6, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    :cond_12
    invoke-static {v2, v9, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v0, Lsz0/p0$c;->f:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int v19, v0, v2

    const/16 v20, 0x0

    const/16 v21, 0xffc

    move-object v14, v8

    const/4 v8, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v2, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v18

    const/4 v8, 0x1

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_14
    move-object v14, v8

    const/4 v8, 0x1

    instance-of v15, v1, Lxd0/e$a;

    if-eqz v15, :cond_18

    const v6, -0x473ad37e

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    new-instance v17, Lsz0/p0$b;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lgy0/f;->P1:I

    const/4 v12, 0x2

    invoke-direct {v6, v10, v2, v12, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0x6

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v18, v6

    invoke-direct/range {v17 .. v22}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v15, Luv0/c;->E:I

    invoke-direct {v10, v15, v2, v12, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v0, v0, 0x1c00

    if-ne v0, v13, :cond_15

    goto :goto_c

    :cond_15
    move v8, v3

    :goto_c
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v8, :cond_16

    if-ne v0, v7, :cond_17

    :cond_16
    new-instance v0, Lyk2/i;

    const/16 v2, 0x1c

    invoke-direct {v0, v14, v2}, Lyk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v0, Lc93/a;

    sget v2, Lsz0/p0$b;->h:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int/2addr v2, v7

    sget v7, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v7, v7, 0x9

    or-int v19, v2, v7

    const/16 v20, 0x0

    const/16 v21, 0xfe4

    const/4 v8, 0x0

    move-object v7, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v2, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v18, v7

    move-object v7, v6

    move-object/from16 v6, v17

    const/16 v17, 0x0

    move-object/from16 v22, v10

    move-object v10, v0

    move-object/from16 v0, v18

    move-object/from16 v18, v9

    move-object/from16 v9, v22

    move-object/from16 v22, v2

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v18

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_18
    move-object/from16 v22, v14

    instance-of v13, v1, Lxd0/e$c;

    if-eqz v13, :cond_1e

    const v13, -0x47345e33

    invoke-virtual {v9, v13}, Lp1/q;->e0(I)V

    and-int/lit16 v13, v0, 0x380

    if-ne v13, v10, :cond_19

    move v10, v8

    goto :goto_d

    :cond_19
    move v10, v3

    :goto_d
    and-int/lit8 v13, v0, 0x70

    if-ne v13, v6, :cond_1a

    move v6, v8

    goto :goto_e

    :cond_1a
    move v6, v3

    :goto_e
    or-int/2addr v6, v10

    const/4 v10, 0x4

    if-ne v12, v10, :cond_1b

    goto :goto_f

    :cond_1b
    move v8, v3

    :goto_f
    or-int/2addr v6, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_1c

    if-ne v8, v7, :cond_1d

    :cond_1c
    new-instance v8, Lzd0/b$a;

    invoke-direct {v8, v11, v4, v1, v2}, Lzd0/b$a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lxd0/e;Lq83/d;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v8, Lc93/m;

    invoke-static {v9, v8, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v6, v1

    check-cast v6, Lxd0/e$c;

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v2, v0, 0x70

    or-int/2addr v2, v12

    and-int/lit16 v0, v0, 0x380

    or-int v10, v2, v0

    move-object v0, v11

    const/4 v11, 0x0

    move-object v7, v0

    move-object/from16 v8, v22

    invoke-static/range {v6 .. v11}, Lzd0/b;->o(Lxd0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v8

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_10
    move-object v3, v4

    move-object v4, v2

    move-object v2, v3

    move-object v3, v0

    goto :goto_11

    :cond_1e
    const v0, -0x445cf1b5

    invoke-static {v0, v9, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1f
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v2, v7

    move-object v3, v11

    move-object v4, v14

    :goto_11
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_20

    new-instance v0, Lw71/k;

    const/16 v7, 0x15

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lw71/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final y(Lkd0/a$c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lwd0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
