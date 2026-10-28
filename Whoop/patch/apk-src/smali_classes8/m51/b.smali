.class public abstract Lm51/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Lm51/a;",
        "state",
        "",
        "radiusScale",
        "b",
        "(Landroidx/compose/ui/Modifier;Lm51/a;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;",
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


# direct methods
.method public static synthetic a(JLm51/a;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm51/b;->c(JLm51/a;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lm51/a;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/high16 p2, 0x3f800000    # 1.0f

    :cond_0
    instance-of p5, p1, Lm51/a$c;

    const/4 v0, 0x0

    if-eqz p5, :cond_6

    check-cast p3, Lp1/q;

    const p2, 0x42feda14

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    move-object p2, p1

    check-cast p2, Lm51/a$c;

    invoke-virtual {p2}, Lm51/a$c;->a()Ly81/e;

    move-result-object p2

    invoke-interface {p2, p3, v0}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    invoke-virtual {p3, v1, v2}, Lp1/q;->f(J)Z

    move-result p2

    and-int/lit8 p5, p4, 0x70

    xor-int/lit8 p5, p5, 0x30

    const/16 v3, 0x20

    if-le p5, v3, :cond_1

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_2

    :cond_1
    and-int/lit8 p4, p4, 0x30

    if-ne p4, v3, :cond_3

    :cond_2
    const/4 p4, 0x1

    goto :goto_0

    :cond_3
    move p4, v0

    :goto_0
    or-int/2addr p2, p4

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p2, :cond_4

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p4, p2, :cond_5

    :cond_4
    new-instance p4, Lg1/d4;

    const/4 p2, 0x1

    invoke-direct {p4, v1, v2, p1, p2}, Lg1/d4;-><init>(JLjava/lang/Object;I)V

    invoke-virtual {p3, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p4, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, p4}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    return-object p0

    :cond_6
    instance-of p4, p1, Lm51/a$b;

    if-eqz p4, :cond_7

    check-cast p3, Lp1/q;

    const p4, -0x506b4e71

    invoke-virtual {p3, p4}, Lp1/q;->e0(I)V

    check-cast p1, Lm51/a$b;

    invoke-virtual {p1}, Lm51/a$b;->a()Ly81/e;

    move-result-object p4

    invoke-interface {p4, p3, v0}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide p4

    invoke-virtual {p1}, Lm51/a$b;->b()F

    move-result p1

    invoke-static {p0, p4, p5, p1, p2}, Lgb1/b0;->H(Landroidx/compose/ui/Modifier;JFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    return-object p0

    :cond_7
    instance-of p4, p1, Lm51/a$a;

    if-eqz p4, :cond_9

    check-cast p3, Lp1/q;

    const p4, -0x506b3c47

    invoke-virtual {p3, p4}, Lp1/q;->e0(I)V

    check-cast p1, Lm51/a$a;

    invoke-virtual {p1}, Lm51/a$a;->a()Ljava/util/List;

    move-result-object p4

    check-cast p4, Ljava/lang/Iterable;

    new-instance p5, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p4, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p5, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly81/e;

    invoke-interface {v1, p3, v0}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Lm51/a$a;->b()F

    move-result p1

    invoke-static {p0, p5, p1, p2}, Lgb1/b0;->Q0(Landroidx/compose/ui/Modifier;Ljava/util/List;FF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    return-object p0

    :cond_9
    const p0, -0x506b6970

    check-cast p3, Lp1/q;

    invoke-static {p0, p3, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0
.end method

.method private static final c(JLm51/a;Lk2/e;)Ll83/a0;
    .locals 11

    const-string v0, "$this$drawBehind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lm51/a$c;

    invoke-virtual {p2}, Lm51/a$c;->b()F

    move-result v7

    const/4 v9, 0x0

    const/16 v10, 0x76

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    move-wide v1, p0

    move-object v0, p3

    invoke-static/range {v0 .. v10}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
