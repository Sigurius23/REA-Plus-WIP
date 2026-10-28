.class public abstract Lzi0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a-\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\'\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\"&\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006&\u00b2\u0006\u000c\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\"\u001a\u00020\u00138\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010#\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010$\u001a\u00020\u00138\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010%\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lti0/e;",
        "contentState",
        "Lkotlin/Function1;",
        "Lri0/b;",
        "Ll83/a0;",
        "action",
        "Landroidx/compose/ui/Modifier;",
        "contentModifier",
        "r",
        "(Lti0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lm91/o;",
        "itemWrapper",
        "",
        "onEvent",
        "o",
        "(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "firstVisibleItemIndex",
        "firstVisibleItemScrollOffset",
        "",
        "fadeRampPx",
        "L",
        "(IIF)F",
        "Ly3/f;",
        "a",
        "F",
        "navBarBlurFadeRamp",
        "",
        "Ll83/k;",
        "b",
        "[Ll83/k;",
        "navBarScrimStops",
        "",
        "isToolbarTransparent",
        "navBarBlurProgress",
        "heroHeight",
        "scrollOffset",
        "itemHeight",
        "arch-v2_release"
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

.field private static final b:[Ll83/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/k;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x32

    int-to-float v0, v0

    sput v0, Lzi0/a;->a:F

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const v1, 0x3f0ccccd    # 0.55f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x3f266666    # 0.65f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3f333333    # 0.7f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const v3, 0x3f051eb8    # 0.52f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x3f400000    # 0.75f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v4, v5, v6, v3}, [Ll83/k;

    move-result-object v0

    sput-object v0, Lzi0/a;->b:[Ll83/k;

    return-void
.end method

.method private static final A(Lp1/t2;)F
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

.method private static final B(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzi0/a;->y(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lti0/e;Lti0/g;FLkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$LazyColumn"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lti0/e;->d()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lri0/e$a;

    new-instance v2, Lcom/whoop/bot/settings/g;

    invoke-direct {v2, p2, v0, p3}, Lcom/whoop/bot/settings/g;-><init>(FLri0/e$a;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lx1/b;

    const v3, 0x69b46733

    invoke-direct {v0, v2, v1, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p4, v2, v0, v1}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    new-instance p0, Lvv2/d;

    const/16 p2, 0x14

    invoke-direct {p0, p2, p1, p3}, Lvv2/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lx1/b;

    const p2, 0x34b6be14

    invoke-direct {p1, p0, v1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p0, 0x2

    const-string p2, "pagination_control"

    invoke-static {p4, p2, p1, p0}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(FLri0/e$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 2

    const-string v0, "$this$item"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p3, p5, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p3, v0, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    and-int/2addr p5, v1

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p5, p3}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, Lr71/b;->z()Lp1/t1;

    move-result-object p3

    new-instance p5, Ly3/f;

    invoke-direct {p5, p0}, Ly3/f;-><init>(F)V

    invoke-virtual {p3, p5}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p0

    new-instance p3, Lx30/f1;

    const/16 p5, 0xd

    invoke-direct {p3, p5, p1, p2}, Lx30/f1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, 0x1315ba73

    invoke-static {p1, p4, p3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p1

    const/16 p2, 0x38

    invoke-static {p0, p1, p4, p2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lri0/e$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p3, v2

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_c

    const p3, -0x5b6f0c4e

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lri0/e$a;->a()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_b

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm91/o;

    invoke-virtual {p2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_1

    if-ne v5, v6, :cond_2

    :cond_1
    invoke-static {v3, p2}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v5

    :cond_2
    check-cast v5, Lp1/a1;

    invoke-virtual {p2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_3

    if-ne v7, v6, :cond_4

    :cond_3
    new-instance v7, Lfc0/f;

    const/16 v4, 0x11

    invoke-direct {v7, v5, v4}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {p2, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v7}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, p2, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {p2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v11, p2, Lp1/q;->S:Z

    if-eqz v11, :cond_5

    invoke-virtual {p2, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_2
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {p2, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {p2, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, p2, Lp1/q;->S:Z

    if-nez v9, :cond_6

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v8, p2, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {p2, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {p2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_8

    if-ne v7, v6, :cond_9

    :cond_8
    new-instance v7, La81/j;

    const/4 v4, 0x7

    invoke-direct {v7, p1, v0, v4}, La81/j;-><init>(Lkotlin/jvm/functions/Function1;Lm91/o;I)V

    invoke-virtual {p2, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v4, Lm91/o;->c:I

    invoke-static {v0, v7, p2, v4, v3}, Lzi0/a;->o(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p2, v2}, Lp1/q;->q(Z)V

    invoke-static {v5}, Lzi0/a;->F(Lp1/a1;)I

    move-result v0

    if-lez v0, :cond_a

    const v0, -0x316fc479

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0, v0, v1, p2, v3}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto/16 :goto_1

    :cond_a
    const v0, -0x316df2fd

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_1

    :cond_b
    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    invoke-virtual {p0}, Lri0/e$a;->b()Lpi0/b;

    move-result-object p0

    invoke-virtual {p0}, Lpi0/b;->getSpacing-D9Ej5fM()F

    move-result p0

    invoke-static {p0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p2, p0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_3

    :cond_c
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final G(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final H(Lp1/a1;Ly3/l;)Ll83/a0;
    .locals 4

    iget-wide v0, p1, Ly3/l;->a:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    invoke-static {p0, p1}, Lzi0/a;->G(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lri0/b$j;

    invoke-virtual {p1}, Lm91/o;->e()Lm91/u;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Lri0/b$j;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 2

    const-string v0, "$this$item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p4, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p2, v0, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    and-int/2addr p4, v1

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    sget p2, Lcom/whoop/navigation/models/ApiRequest;->$stable:I

    invoke-static {p0, p1, p3, p2}, Lzi0/c;->e(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lti0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lzi0/a;->r(Lti0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final L(IIF)F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    if-lez p0, :cond_0

    return v0

    :cond_0
    int-to-float p0, p1

    div-float/2addr p0, p2

    const/4 p1, 0x0

    invoke-static {p0, p1, v0}, Le93/b;->m(FFF)F

    move-result p0

    return p0
.end method

.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzi0/a;->p(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lti0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lzi0/a;->K(Lti0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzi0/a;->q(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/a1;Ly3/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzi0/a;->H(Lp1/a1;Ly3/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lti0/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzi0/a;->w(Lkotlin/jvm/functions/Function1;Lti0/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzi0/a;->J(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lri0/e$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzi0/a;->E(Lri0/e$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ln0/u;Lp1/a1;)F
    .locals 0

    invoke-static {p0, p1}, Lzi0/a;->z(Ln0/u;Lp1/a1;)F

    move-result p0

    return p0
.end method

.method public static synthetic i(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzi0/a;->B(Lp1/a1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(FLri0/e$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzi0/a;->D(FLri0/e$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ln0/u;F)F
    .locals 0

    invoke-static {p0, p1}, Lzi0/a;->u(Ln0/u;F)F

    move-result p0

    return p0
.end method

.method public static synthetic l(Lti0/e;Lti0/g;FLkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzi0/a;->C(Lti0/e;Lti0/g;FLkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzi0/a;->I(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lti0/e;)Z
    .locals 0

    invoke-static {p0}, Lzi0/a;->s(Lti0/e;)Z

    move-result p0

    return p0
.end method

.method public static final o(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/o;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v1, "itemWrapper"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const v1, 0x717987d1

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, p3, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, p3

    goto :goto_2

    :cond_2
    move v1, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_5

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v1, v5

    :cond_5
    :goto_4
    and-int/lit8 v5, v1, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_5

    :cond_6
    const/4 v5, 0x0

    :goto_5
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v4, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_9

    if-eqz v2, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_7

    new-instance v2, Lzc1/h7;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v3, v2

    goto :goto_6

    :cond_8
    move-object v3, p1

    :goto_6
    sget v2, Lm91/o;->c:I

    and-int/lit8 v5, v1, 0xe

    or-int/2addr v2, v5

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int v5, v2, v1

    const/4 v6, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v3

    goto :goto_7

    :cond_9
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v2, p1

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Lbj0/a;

    const/4 v5, 0x3

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lbj0/a;-><init>(Lm91/o;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final p(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzi0/a;->o(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final r(Lti0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lti0/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v7, p1

    move/from16 v1, p4

    sget-object v0, Lb2/e;->x:Lb2/m;

    const-string v2, "contentState"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "action"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v2, 0x1cff78e3

    invoke-virtual {v11, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v2, v2, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_3

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v2, v9

    :goto_4
    and-int/lit16 v9, v2, 0x93

    const/16 v10, 0x92

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v9, v10, :cond_7

    move v9, v14

    goto :goto_5

    :cond_7
    move v9, v15

    :goto_5
    and-int/lit8 v10, v2, 0x1

    invoke-virtual {v11, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_2e

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_8

    move-object/from16 v5, v16

    goto :goto_6

    :cond_8
    move-object v5, v8

    :goto_6
    invoke-virtual {v4}, Lti0/e;->c()Lri0/a;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Lri0/a;->a()Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_9

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    xor-int/2addr v8, v14

    if-ne v8, v14, :cond_9

    move/from16 v22, v14

    goto :goto_7

    :cond_9
    move/from16 v22, v15

    :goto_7
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    const/4 v9, 0x6

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v8, v10, :cond_a

    new-instance v8, Lyy/b0;

    invoke-direct {v8, v4, v9}, Lyy/b0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v8}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v8

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v23, v8

    check-cast v23, Lp1/t2;

    const/4 v8, 0x3

    invoke-static {v15, v15, v11, v8}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v12

    invoke-virtual {v4}, Lti0/e;->g()Lti0/g;

    move-result-object v13

    sget-object v8, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v11, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/c;

    sget v9, Lzi0/a;->a:F

    invoke-interface {v8, v9}, Ly3/c;->q0(F)F

    move-result v8

    invoke-virtual {v11, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v9, :cond_b

    if-ne v6, v10, :cond_c

    :cond_b
    new-instance v6, Lcp0/e0;

    invoke-direct {v6, v12, v8, v14}, Lcp0/e0;-><init>(Ljava/lang/Object;FI)V

    invoke-static {v6}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v6

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v25, v6

    check-cast v25, Lp1/t2;

    invoke-virtual {v4}, Lti0/e;->h()Lti0/h;

    move-result-object v6

    invoke-static {v6}, Lti0/i;->a(Lti0/h;)Z

    move-result v29

    invoke-virtual {v4}, Lti0/e;->h()Lti0/h;

    move-result-object v6

    invoke-static {v6}, Lti0/i;->b(Lti0/h;)Z

    move-result v27

    sget v6, Ln1/h;->a:F

    new-array v6, v15, [Ljava/lang/Object;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v10, :cond_d

    new-instance v8, Lmq2/a;

    const/16 v9, 0x14

    invoke-direct {v8, v9}, Lmq2/a;-><init>(I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lc93/a;

    sget-object v9, Ln1/o;->b:Lp0/n0;

    const/16 v15, 0x180

    invoke-static {v6, v9, v8, v11, v15}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v30, v6

    check-cast v30, Ln1/o;

    invoke-virtual {v4}, Lti0/e;->j()Lep0/j;

    move-result-object v6

    if-eqz v6, :cond_e

    invoke-virtual {v6}, Lep0/j;->x()Z

    move-result v6

    if-ne v6, v14, :cond_e

    if-eqz v22, :cond_e

    move/from16 v32, v14

    goto :goto_8

    :cond_e
    const/16 v32, 0x0

    :goto_8
    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v6

    invoke-virtual {v11, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v8, "arch-v2-section-padding"

    invoke-interface {v6, v8}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v6

    invoke-virtual {v4}, Lti0/e;->e()Ll0/k1;

    move-result-object v8

    if-eqz v6, :cond_f

    goto :goto_9

    :cond_f
    const/4 v8, 0x0

    :goto_9
    if-nez v8, :cond_10

    int-to-float v3, v3

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v3, v6

    new-instance v8, Ll0/l1;

    invoke-direct {v8, v3, v3, v3, v3}, Ll0/l1;-><init>(FFFF)V

    :cond_10
    move-object v9, v8

    invoke-virtual {v4}, Lti0/e;->j()Lep0/j;

    move-result-object v3

    if-nez v22, :cond_11

    move-object v8, v3

    :goto_a
    move-object v6, v12

    goto :goto_b

    :cond_11
    const/4 v8, 0x0

    goto :goto_a

    :goto_b
    sget v12, Lep0/j;->x:I

    move-object v3, v13

    const/4 v13, 0x4

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object v14, v6

    move-object v6, v3

    move-object v3, v14

    move-object/from16 v14, v16

    move-object/from16 v15, v17

    const/16 v33, 0x3

    invoke-static/range {v8 .. v13}, Ldp0/d;->f(Lep0/j;Ll0/k1;ZLandroidx/compose/runtime/Composer;II)Ll0/k1;

    move-result-object v35

    move/from16 v36, v12

    sget-object v8, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v11, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/m;

    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v8

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    and-int/lit8 v12, v2, 0x70

    const/16 v13, 0x20

    if-ne v12, v13, :cond_12

    const/16 v16, 0x1

    goto :goto_c

    :cond_12
    const/16 v16, 0x0

    :goto_c
    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    const/16 v9, 0xe

    if-nez v16, :cond_13

    if-ne v13, v15, :cond_14

    :cond_13
    new-instance v13, Lyo1/b;

    invoke-direct {v13, v9, v7, v4}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v28, v13

    check-cast v28, Lc93/a;

    sget v31, Ln1/g;->c:F

    new-instance v26, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;

    invoke-direct/range {v26 .. v31}, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;-><init>(ZLc93/a;ZLn1/o;F)V

    move-object/from16 v13, v26

    invoke-interface {v10, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, Lb2/e;->w:Lb2/m;

    const/4 v9, 0x0

    invoke-static {v13, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    move-object/from16 v28, v6

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 v31, v2

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-eqz v2, :cond_15

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_d
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v11, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v11, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    move/from16 v38, v8

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move/from16 v39, v12

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    goto :goto_e

    :cond_16
    move/from16 v39, v12

    :goto_e
    invoke-static {v6, v11, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v4}, Lti0/e;->b()Lti0/l;

    move-result-object v12

    const/4 v8, 0x6

    invoke-static {v9, v12, v11, v8}, Lti0/k;->a(Landroidx/compose/ui/Modifier;Lti0/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static/range {v23 .. v23}, Lzi0/a;->t(Lp1/t2;)Z

    move-result v12

    if-eqz v12, :cond_18

    invoke-static/range {v25 .. v25}, Lzi0/a;->v(Lp1/t2;)F

    move-result v19

    const/16 v20, 0x3

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v14

    invoke-static/range {v16 .. v21}, Lgb1/l;->e(Landroidx/compose/ui/Modifier;FFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    goto :goto_f

    :cond_18
    move-object v12, v14

    :goto_f
    invoke-interface {v9, v12}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v12, 0x0

    invoke-static {v13, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-object v12, v9

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11}, Lp1/q;->i0()V

    move-object/from16 v16, v14

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_19

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_19
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v11, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_1a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1b

    :cond_1a
    invoke-static {v8, v11, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v11, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lti0/e;->a()Lkd1/o;

    move-result-object v9

    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    if-nez v9, :cond_1c

    const v9, -0x5696a247

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    move-object/from16 v18, v0

    move-object/from16 v17, v3

    move-object/from16 p2, v6

    move-object v14, v8

    move-object v0, v10

    move v3, v12

    move-object/from16 v43, v15

    move-object/from16 v4, v16

    move/from16 v40, v39

    const/high16 v6, 0x3f800000    # 1.0f

    const/16 v24, 0x20

    goto/16 :goto_12

    :cond_1c
    const/4 v12, 0x0

    const v13, -0x5696a246

    invoke-virtual {v11, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v15, :cond_1d

    invoke-static {v12, v11}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v13

    :cond_1d
    check-cast v13, Lp1/a1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v15, :cond_1e

    new-instance v14, Lyo1/b;

    const/16 v12, 0xf

    invoke-direct {v14, v12, v3, v13}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v14}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v14

    invoke-virtual {v11, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v14, Lp1/t2;

    invoke-static {v14}, Lzi0/a;->A(Lp1/t2;)F

    move-result v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v15, :cond_1f

    new-instance v14, Lfc0/f;

    move-object/from16 v17, v3

    const/16 v3, 0x12

    invoke-direct {v14, v13, v3}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {v11, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_11

    :cond_1f
    move-object/from16 v17, v3

    :goto_11
    check-cast v14, Lkotlin/jvm/functions/Function1;

    sget v3, Lkd1/o;->a:I

    shl-int/lit8 v3, v3, 0x3

    const/16 v13, 0x6006

    or-int/2addr v3, v13

    move-object v13, v15

    const/4 v15, 0x2

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 p2, v18

    move-object/from16 v18, v0

    move-object/from16 v0, p2

    move-object/from16 p2, v6

    move-object/from16 v43, v13

    move-object/from16 v4, v16

    move/from16 v40, v39

    const/high16 v6, 0x3f800000    # 1.0f

    const/16 v24, 0x20

    move-object v13, v11

    move v11, v12

    move-object v12, v14

    move v14, v3

    const/4 v3, 0x0

    invoke-static/range {v8 .. v15}, Lxi0/a;->f(Ll0/u;Lkd1/o;Ly3/f;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v14, v8

    move-object v11, v13

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    :goto_12
    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lti0/e;->j()Lep0/j;

    move-result-object v9

    const/4 v15, 0x3

    shl-int/lit8 v10, v36, 0x3

    const/16 v34, 0x6

    or-int/lit8 v12, v10, 0x6

    const/4 v13, 0x2

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Ldp0/f;->b(Landroidx/compose/ui/Modifier;Lep0/j;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lti0/e;->b()Lti0/l;

    move-result-object v9

    sget-object v10, Lti0/l;->DEFAULT:Lti0/l;

    if-ne v9, v10, :cond_20

    invoke-virtual/range {p0 .. p0}, Lti0/e;->a()Lkd1/o;

    move-result-object v9

    if-nez v9, :cond_20

    invoke-static {v4}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    move-object/from16 v9, v16

    goto :goto_13

    :cond_20
    move-object v9, v4

    :goto_13
    invoke-interface {v8, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static/range {v23 .. v23}, Lzi0/a;->t(Lp1/t2;)Z

    move-result v9

    if-nez v9, :cond_21

    invoke-static {v4}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-interface {v8, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    goto :goto_14

    :cond_21
    invoke-interface {v8, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    :goto_14
    invoke-interface {v8, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v11, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_22

    invoke-virtual {v11, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_22
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v11, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_24

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto :goto_17

    :cond_23
    :goto_16
    move-object/from16 v0, p2

    goto :goto_18

    :cond_24
    :goto_17
    invoke-static {v10, v11, v10, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_16

    :goto_18
    invoke-static {v11, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v23 .. v23}, Lzi0/a;->t(Lp1/t2;)Z

    move-result v0

    if-nez v0, :cond_25

    const v0, 0xc28dc9d

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    move/from16 v37, v6

    invoke-virtual/range {p0 .. p0}, Lti0/e;->f()Lri0/f;

    move-result-object v6

    shl-int/lit8 v0, v31, 0x3

    and-int/lit16 v9, v0, 0x380

    const/4 v10, 0x1

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v7, p1

    move-object v8, v11

    move-object/from16 v0, v16

    move/from16 v13, v24

    move-object/from16 v1, v28

    move/from16 v2, v37

    invoke-static/range {v5 .. v10}, Lui0/p;->i(Landroidx/compose/ui/Modifier;Lri0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v7

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    goto :goto_19

    :cond_25
    move-object v0, v5

    move v2, v6

    move/from16 v13, v24

    move-object/from16 v1, v28

    move-object/from16 v5, p1

    const v6, 0xc2bbc61

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    :goto_19
    float-to-double v6, v2

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_26

    goto :goto_1a

    :cond_26
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1a
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v7, 0x1

    invoke-direct {v6, v2, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v22, :cond_27

    invoke-static {v4, v8, v7, v9}, Lgb1/c;->m(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    goto :goto_1b

    :cond_27
    invoke-static {v4, v8, v9, v15, v9}, Lgb1/c;->i(Landroidx/compose/ui/Modifier;FLc93/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    :goto_1b
    invoke-interface {v6, v10}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v42, v9

    sget-object v9, Lb2/e;->N:Lb2/k;

    move-object/from16 v7, p0

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    move/from16 v12, v38

    invoke-virtual {v11, v12}, Lp1/q;->d(F)Z

    move-result v16

    or-int v10, v10, v16

    move/from16 v8, v40

    if-ne v8, v13, :cond_28

    const/4 v8, 0x1

    goto :goto_1c

    :cond_28
    move v8, v3

    :goto_1c
    or-int/2addr v8, v10

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_29

    move-object/from16 v13, v43

    if-ne v10, v13, :cond_2a

    :cond_29
    new-instance v10, Lis0/h0;

    invoke-direct {v10, v7, v1, v12, v5}, Lis0/h0;-><init>(Lti0/e;Lti0/g;FLkotlin/jvm/functions/Function1;)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    move-object v13, v10

    check-cast v13, Lkotlin/jvm/functions/Function1;

    move/from16 v41, v15

    const/high16 v15, 0x30000

    const/16 v16, 0x1d8

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v1, v14

    move-object v14, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v5, v6

    move-object/from16 v6, v17

    move-object/from16 v7, v35

    invoke-static/range {v5 .. v16}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v14

    invoke-virtual/range {p0 .. p0}, Lti0/e;->c()Lri0/a;

    move-result-object v6

    shl-int/lit8 v5, v31, 0x3

    and-int/lit16 v10, v5, 0x380

    const/4 v11, 0x1

    const/4 v5, 0x0

    move-object/from16 v7, p1

    move-object v9, v14

    move/from16 v8, v32

    invoke-static/range {v5 .. v11}, Lui0/g;->h(Landroidx/compose/ui/Modifier;Lri0/a;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    move-object v11, v9

    const/4 v7, 0x1

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    invoke-static/range {v23 .. v23}, Lzi0/a;->t(Lp1/t2;)Z

    move-result v5

    if-eqz v5, :cond_2c

    const v5, -0x174e3e98

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {}, Lgb1/l;->c()F

    move-result v5

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v12, v18

    invoke-virtual {v1, v2, v12}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Li2/t;->b:Li2/s;

    sget-object v6, Lzi0/a;->b:[Ll83/k;

    new-instance v7, Ljava/util/ArrayList;

    array-length v8, v6

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    array-length v8, v6

    move v15, v3

    :goto_1d
    if-ge v15, v8, :cond_2b

    aget-object v9, v6, v15

    iget-object v13, v9, Ll83/k;->w:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    iget-object v9, v9, Ll83/k;->x:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    move-object v14, v4

    sget-wide v3, Li2/x;->b:J

    invoke-static/range {v25 .. v25}, Lzi0/a;->v(Lp1/t2;)F

    move-result v16

    mul-float v9, v9, v16

    invoke-static {v9, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v9, Li2/x;

    invoke-direct {v9, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v13, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    move-object v4, v14

    const/4 v3, 0x0

    goto :goto_1d

    :cond_2b
    move-object v14, v4

    new-array v4, v3, [Ll83/k;

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ll83/k;

    array-length v6, v4

    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ll83/k;

    const/16 v6, 0xe

    const/4 v7, 0x0

    invoke-static {v5, v4, v7, v7, v6}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v4

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-static {v2, v4, v9, v7, v8}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v11, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v14, v12}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lti0/e;->f()Lri0/f;

    move-result-object v6

    move v9, v10

    const/4 v10, 0x0

    move-object/from16 v7, p1

    move-object v8, v11

    invoke-static/range {v5 .. v10}, Lui0/p;->i(Landroidx/compose/ui/Modifier;Lri0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_2c
    move-object v14, v4

    move-object/from16 v12, v18

    const v2, -0x1740ae3b

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    :goto_1e
    if-eqz v29, :cond_2d

    const v2, -0x173ff8d5

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    sget-object v5, Ln1/g;->a:Ln1/g;

    invoke-virtual {v1, v14, v12}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v9, 0x0

    move-object v14, v11

    const-wide/16 v11, 0x0

    move/from16 v7, v27

    move-object/from16 v6, v30

    invoke-virtual/range {v5 .. v15}, Ln1/g;->a(Ln1/o;ZLandroidx/compose/ui/Modifier;JJFLandroidx/compose/runtime/Composer;I)V

    move-object v11, v14

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    :goto_1f
    const/4 v7, 0x1

    goto :goto_20

    :cond_2d
    const/4 v12, 0x0

    const v1, -0x173bd63b

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    goto :goto_1f

    :goto_20
    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    move-object v5, v0

    goto :goto_21

    :cond_2e
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v5, v8

    :goto_21
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_2f

    new-instance v0, Lz51/n;

    const/4 v3, 0x4

    move-object/from16 v4, p0

    move-object/from16 v6, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lz51/n;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final s(Lti0/e;)Z
    .locals 0

    invoke-virtual {p0}, Lti0/e;->f()Lri0/f;

    move-result-object p0

    invoke-static {p0}, Lui0/p;->v(Lri0/f;)Z

    move-result p0

    return p0
.end method

.method private static final t(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
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

.method private static final u(Ln0/u;F)F
    .locals 1

    iget-object v0, p0, Ln0/u;->e:Ll2/a;

    iget-object v0, v0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    iget-object p0, p0, Ln0/u;->e:Ll2/a;

    iget-object p0, p0, Ll2/a;->c:Ljava/lang/Object;

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    invoke-static {v0, p0, p1}, Lzi0/a;->L(IIF)F

    move-result p0

    return p0
.end method

.method private static final v(Lp1/t2;)F
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

.method private static final w(Lkotlin/jvm/functions/Function1;Lti0/e;)Ll83/a0;
    .locals 6

    new-instance v0, Lri0/b$u;

    invoke-virtual {p1}, Lti0/e;->i()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lri0/b$u;-><init>(ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/ReloadAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final y(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final z(Ln0/u;Lp1/a1;)F
    .locals 4

    iget-object v0, p0, Ln0/u;->e:Ll2/a;

    iget-object v0, v0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Ln0/u;->e:Ll2/a;

    iget-object p0, p0, Ll2/a;->c:Ljava/lang/Object;

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    :goto_0
    int-to-float p0, p0

    return p0

    :cond_0
    invoke-static {p1}, Lzi0/a;->x(Lp1/a1;)I

    move-result p1

    invoke-virtual {p0}, Ln0/u;->h()Ln0/n;

    move-result-object p0

    invoke-virtual {p0}, Ln0/n;->e()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p0, v0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    goto :goto_0
.end method
