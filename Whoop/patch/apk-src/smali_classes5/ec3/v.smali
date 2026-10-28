.class public abstract synthetic Lec3/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvb1/a;

.field public static final b:Lds2/a;

.field public static final c:Lhc3/x;

.field public static final d:Lhc3/x;

.field public static final e:Lhc3/x;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lvb1/a;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lvb1/a;-><init>(I)V

    sput-object v0, Lec3/v;->a:Lvb1/a;

    new-instance v0, Lds2/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lds2/a;-><init>(I)V

    sput-object v0, Lec3/v;->b:Lds2/a;

    new-instance v0, Lhc3/x;

    const-string v1, "NO_VALUE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lec3/v;->c:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lec3/v;->d:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "PENDING"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lec3/v;->e:Lhc3/x;

    return-void
.end method

.method public static final A(Lec3/l;Lq83/d;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lfc3/b;->b:Lhc3/x;

    instance-of v1, p1, Lec3/z0;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lec3/z0;

    iget v2, v1, Lec3/z0;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lec3/z0;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lec3/z0;

    invoke-direct {v1, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v1, Lec3/z0;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lec3/z0;->z:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p0, v1, Lec3/z0;->x:Lec3/x0;

    iget-object v2, v1, Lec3/z0;->w:Lkotlin/jvm/internal/g0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p1

    iput-object v0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v3, Lec3/x0;

    const/4 v5, 0x0

    invoke-direct {v3, p1, v5}, Lec3/x0;-><init>(Lkotlin/jvm/internal/g0;I)V

    :try_start_1
    iput-object p1, v1, Lec3/z0;->w:Lkotlin/jvm/internal/g0;

    iput-object v3, v1, Lec3/z0;->x:Lec3/x0;

    iput v4, v1, Lec3/z0;->z:I

    invoke-interface {p0, v3, v1}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v2, :cond_3

    return-object v2

    :cond_3
    move-object v2, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v2, p1

    move-object p1, p0

    move-object p0, v3

    :goto_1
    iget-object v3, p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;->w:Ljava/lang/Object;

    if-ne v3, p0, :cond_5

    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object p0

    invoke-static {p0}, Lbc3/f0;->o(Lq83/j;)V

    :goto_2
    iget-object p0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eq p0, v0, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    throw p1
.end method

.method public static final B(Lec3/l;Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lec3/d1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/d1;

    iget v1, v0, Lec3/d1;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/d1;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/d1;

    invoke-direct {v0, p2}, Lec3/d1;-><init>(Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lec3/d1;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/d1;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lec3/d1;->x:Landroidx/room/x;

    iget-object p1, v0, Lec3/d1;->w:Lkotlin/jvm/internal/g0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p2

    new-instance v2, Landroidx/room/x;

    const/4 v4, 0x3

    invoke-direct {v2, v4, p1, p2}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    :try_start_1
    iput-object p2, v0, Lec3/d1;->w:Lkotlin/jvm/internal/g0;

    iput-object v2, v0, Lec3/d1;->x:Landroidx/room/x;

    iput v3, v0, Lec3/d1;->z:I

    invoke-interface {p0, v2, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    goto :goto_2

    :catch_1
    move-exception p0

    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    :goto_1
    iget-object v1, p2, Lkotlinx/coroutines/flow/internal/AbortFlowException;->w:Ljava/lang/Object;

    if-ne v1, p0, :cond_4

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p0

    invoke-static {p0}, Lbc3/f0;->o(Lq83/j;)V

    :goto_2
    iget-object p0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object p0

    :cond_4
    throw p2
.end method

.method public static final C(Lec3/l;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lec3/c1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lec3/c1;

    iget v1, v0, Lec3/c1;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/c1;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/c1;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lec3/c1;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/c1;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lec3/c1;->x:Lec3/x0;

    iget-object v1, v0, Lec3/c1;->w:Lkotlin/jvm/internal/g0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p1

    new-instance v2, Lec3/x0;

    const/4 v4, 0x1

    invoke-direct {v2, p1, v4}, Lec3/x0;-><init>(Lkotlin/jvm/internal/g0;I)V

    :try_start_1
    iput-object p1, v0, Lec3/c1;->w:Lkotlin/jvm/internal/g0;

    iput-object v2, v0, Lec3/c1;->x:Lec3/x0;

    iput v3, v0, Lec3/c1;->z:I

    invoke-interface {p0, v2, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v1, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    iget-object v2, p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;->w:Ljava/lang/Object;

    if-ne v2, p0, :cond_4

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p0

    invoke-static {p0}, Lbc3/f0;->o(Lq83/j;)V

    :goto_2
    iget-object p0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object p0

    :cond_4
    throw p1
.end method

.method public static final D(Lc93/m;Lec3/l;)Lch/o;
    .locals 2

    sget v0, Lec3/w0;->a:I

    new-instance v0, Landroidx/room/y;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, p0}, Landroidx/room/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p0, Lch/o;

    invoke-direct {p0, v0, v1}, Lch/o;-><init>(Lec3/l;I)V

    return-object p0
.end method

.method public static final E(ILc93/m;Lec3/l;)Lec3/l;
    .locals 7

    sget v0, Lec3/w0;->a:I

    new-instance v2, Lec3/a0;

    const/4 v0, 0x5

    invoke-direct {v2, v0, p1, p2}, Lec3/a0;-><init>(ILc93/m;Lec3/l;)V

    if-lez p0, :cond_1

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    new-instance p0, Lch/o;

    invoke-direct {p0, v2, p1}, Lch/o;-><init>(Lec3/l;I)V

    return-object p0

    :cond_0
    new-instance v1, Lfc3/f;

    const/4 v5, -0x2

    sget-object v6, Ldc3/a;->w:Ldc3/a;

    sget-object v4, Lq83/k;->w:Lq83/k;

    move v3, p0

    invoke-direct/range {v1 .. v6}, Lfc3/f;-><init>(Lec3/a0;ILq83/j;ILdc3/a;)V

    return-object v1

    :cond_1
    move v3, p0

    const-string p0, "Expected positive concurrency level, but had "

    invoke-static {v3, p0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final F(Lec3/l;Lq83/j;)Lec3/l;
    .locals 6

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Lq83/k;->w:Lq83/k;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, Lfc3/q;

    if-eqz v0, :cond_1

    check-cast p0, Lfc3/q;

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lfc3/b;->b(Lfc3/q;Lq83/j;ILdc3/a;I)Lec3/l;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lfc3/h;

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lfc3/h;-><init>(Lec3/l;Lq83/j;ILdc3/a;I)V

    return-object v0

    :cond_2
    move-object v2, p1

    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "Flow context cannot contain job in it. Had "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final G(Lec3/t1;Lq83/j;ILdc3/a;)Lec3/l;
    .locals 1

    if-eqz p2, :cond_0

    const/4 v0, -0x3

    if-ne p2, v0, :cond_1

    :cond_0
    sget-object v0, Ldc3/a;->w:Ldc3/a;

    if-ne p3, v0, :cond_1

    return-object p0

    :cond_1
    new-instance v0, Lfc3/h;

    invoke-direct {v0, p2, p3, p0, p1}, Lfc3/g;-><init>(ILdc3/a;Lec3/l;Lq83/j;)V

    return-object v0
.end method

.method public static final H(Lec3/l;Lbc3/c0;)Lbc3/k1;
    .locals 3

    new-instance v0, Landroidx/room/z1;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p0, 0x3

    invoke-static {p1, v2, v2, v0, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p0

    return-object p0
.end method

.method public static final I(Lc93/m;Lec3/l;)Lfc3/k;
    .locals 3

    sget v0, Lec3/w0;->a:I

    new-instance v0, La63/j;

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-direct {v0, p0, v1, v2}, La63/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs J([Lec3/l;)Lec3/h;
    .locals 4

    sget v0, Lec3/w0;->a:I

    invoke-static {p0}, Lm83/n;->V([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p0

    new-instance v0, Lec3/h;

    const/4 v1, -0x2

    sget-object v2, Ldc3/a;->w:Ldc3/a;

    sget-object v3, Lq83/k;->w:Lq83/k;

    invoke-direct {v0, p0, v3, v1, v2}, Lec3/h;-><init>(Ljava/lang/Iterable;Lq83/j;ILdc3/a;)V

    return-object v0
.end method

.method public static final K(Ldc3/w;)Lec3/g;
    .locals 2

    new-instance v0, Lec3/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lec3/g;-><init>(Ldc3/w;Z)V

    return-object v0
.end method

.method public static final L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;
    .locals 8

    invoke-static {p0, p3}, Lec3/v;->q(Lec3/l;I)Lso/o;

    move-result-object p0

    iget v0, p0, Lso/o;->a:I

    iget-object v1, p0, Lso/o;->c:Ljava/lang/Object;

    check-cast v1, Ldc3/a;

    invoke-static {p3, v0, v1}, Lec3/v;->a(IILdc3/a;)Lec3/w1;

    move-result-object v5

    iget-object p3, p0, Lso/o;->d:Ljava/lang/Object;

    check-cast p3, Lq83/j;

    iget-object p0, p0, Lso/o;->b:Ljava/lang/Object;

    move-object v4, p0

    check-cast v4, Lec3/l;

    sget-object p0, Lec3/z1;->a:Lec3/b2;

    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lbc3/d0;->w:Lbc3/d0;

    goto :goto_0

    :cond_0
    sget-object p0, Lbc3/d0;->z:Lbc3/d0;

    :goto_0
    new-instance v2, Landroidx/lifecycle/e1;

    const/4 v7, 0x0

    sget-object v6, Lec3/v;->c:Lhc3/x;

    move-object v3, p2

    invoke-direct/range {v2 .. v7}, Landroidx/lifecycle/e1;-><init>(Lec3/a2;Lec3/l;Lec3/o1;Ljava/lang/Object;Lq83/d;)V

    invoke-static {p1, p3, p0, v2}, Lbc3/f0;->y(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;)Lbc3/c2;

    move-result-object p0

    new-instance p1, Lec3/q1;

    invoke-direct {p1, v5, p0}, Lec3/q1;-><init>(Lec3/o1;Lbc3/k1;)V

    return-object p1
.end method

.method public static final M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;
    .locals 7

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lec3/v;->q(Lec3/l;I)Lso/o;

    move-result-object p0

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v3

    iget-object v0, p0, Lso/o;->d:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lq83/j;

    iget-object p0, p0, Lso/o;->b:Ljava/lang/Object;

    move-object v2, p0

    check-cast v2, Lec3/l;

    sget-object p0, Lec3/z1;->a:Lec3/b2;

    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lbc3/d0;->w:Lbc3/d0;

    goto :goto_0

    :cond_0
    sget-object p0, Lbc3/d0;->z:Lbc3/d0;

    :goto_0
    new-instance v0, Landroidx/lifecycle/e1;

    const/4 v5, 0x0

    move-object v1, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/e1;-><init>(Lec3/a2;Lec3/l;Lec3/o1;Ljava/lang/Object;Lq83/d;)V

    invoke-static {p1, v6, p0, v0}, Lbc3/f0;->y(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;)Lbc3/c2;

    move-result-object p0

    new-instance p1, Lec3/r1;

    invoke-direct {p1, v3, p0}, Lec3/r1;-><init>(Lec3/p1;Lbc3/k1;)V

    return-object p1
.end method

.method public static final N(Lec3/l;Lbc3/c0;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lec3/g1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/g1;

    iget v1, v0, Lec3/g1;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/g1;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/g1;

    invoke-direct {v0, p2}, Lec3/g1;-><init>(Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lec3/g1;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/g1;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p0, v3}, Lec3/v;->q(Lec3/l;I)Lso/o;

    move-result-object p0

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p2

    sget-object v2, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p2, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    check-cast p2, Lbc3/k1;

    new-instance v2, Lbc3/t;

    invoke-direct {v2, p2}, Lbc3/t;-><init>(Lbc3/k1;)V

    iget-object p2, p0, Lso/o;->d:Ljava/lang/Object;

    check-cast p2, Lq83/j;

    iget-object p0, p0, Lso/o;->b:Ljava/lang/Object;

    check-cast p0, Lec3/l;

    new-instance v4, La1/h;

    const/16 v5, 0x13

    const/4 v6, 0x0

    invoke-direct {v4, p0, v2, v6, v5}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p0, 0x2

    invoke-static {p1, p2, v6, v4, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iput v3, v0, Lec3/g1;->x:I

    invoke-virtual {v2, v0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ll83/n;

    iget-object p0, p2, Ll83/n;->w:Ljava/lang/Object;

    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final O(Lec3/l;J)La6/u;
    .locals 2

    new-instance v0, Lec3/u;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lec3/u;-><init>(Lec3/l;JLq83/d;)V

    new-instance p0, La6/u;

    invoke-direct {p0, v0}, La6/u;-><init>(Lkotlin/jvm/functions/Function3;)V

    return-object p0
.end method

.method public static final P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;
    .locals 7

    sget v0, Lec3/w0;->a:I

    new-instance v1, Lfc3/k;

    const/4 v5, -0x2

    sget-object v6, Ldc3/a;->w:Ldc3/a;

    sget-object v4, Lq83/k;->w:Lq83/k;

    move-object v3, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lfc3/k;-><init>(Lkotlin/jvm/functions/Function3;Lec3/l;Lq83/j;ILdc3/a;)V

    return-object v1
.end method

.method public static final a(IILdc3/a;)Lec3/w1;
    .locals 1

    if-ltz p0, :cond_4

    if-ltz p1, :cond_3

    if-gtz p0, :cond_1

    if-gtz p1, :cond_1

    sget-object v0, Ldc3/a;->w:Ldc3/a;

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    add-int/2addr p1, p0

    if-gez p1, :cond_2

    const p1, 0x7fffffff

    :cond_2
    new-instance v0, Lec3/w1;

    invoke-direct {v0, p0, p1, p2}, Lec3/w1;-><init>(IILdc3/a;)V

    return-object v0

    :cond_3
    const-string p0, "extraBufferCapacity cannot be negative, but was "

    invoke-static {p1, p0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string p1, "replay cannot be negative, but was "

    invoke-static {p0, p1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic b(IILdc3/a;I)Lec3/w1;
    .locals 2

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p0, v1

    :cond_0
    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_1

    move p1, v1

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    sget-object p2, Ldc3/a;->w:Ldc3/a;

    :cond_2
    invoke-static {p0, p1, p2}, Lec3/v;->a(IILdc3/a;)Lec3/w1;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/lang/Object;)Lec3/h2;
    .locals 1

    new-instance v0, Lec3/h2;

    if-nez p0, :cond_0

    sget-object p0, Lfc3/b;->b:Lhc3/x;

    :cond_0
    invoke-direct {v0, p0}, Lec3/h2;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final d(Lec3/m;Ljava/lang/Object;Ljava/lang/Object;Ls83/c;)V
    .locals 4

    instance-of v0, p3, Lec3/l0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lec3/l0;

    iget v1, v0, Lec3/l0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/l0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/l0;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lec3/l0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/l0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object p2, v0, Lec3/l0;->w:Ljava/lang/Object;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p2, v0, Lec3/l0;->w:Ljava/lang/Object;

    iput v3, v0, Lec3/l0;->y:I

    invoke-interface {p0, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-void

    :cond_3
    :goto_1
    new-instance p0, Lkotlinx/coroutines/flow/internal/AbortFlowException;

    invoke-direct {p0, p2}, Lkotlinx/coroutines/flow/internal/AbortFlowException;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method public static final e(Lec3/n2;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lec3/w;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lec3/w;

    iget v1, v0, Lec3/w;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/w;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/w;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lec3/w;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/w;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p2, v0, Lec3/w;->w:Ljava/lang/Throwable;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput-object p2, v0, Lec3/w;->w:Ljava/lang/Throwable;

    iput v3, v0, Lec3/w;->y:I

    invoke-interface {p1, p0, p2, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_2
    if-eqz p2, :cond_4

    if-eq p2, p0, :cond_4

    invoke-static {p0, p2}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_4
    throw p0
.end method

.method public static final f([Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 0

    long-to-int p1, p1

    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    and-int/2addr p1, p2

    aput-object p3, p0, p1

    return-void
.end method

.method public static final g(Lec3/o1;)Lec3/q1;
    .locals 2

    new-instance v0, Lec3/q1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lec3/q1;-><init>(Lec3/o1;Lbc3/k1;)V

    return-object v0
.end method

.method public static final h(Lec3/p1;)Lec3/r1;
    .locals 2

    new-instance v0, Lec3/r1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lec3/r1;-><init>(Lec3/p1;Lbc3/k1;)V

    return-object v0
.end method

.method public static i(Lec3/l;II)Lec3/l;
    .locals 7

    const/4 v0, 0x1

    and-int/2addr p2, v0

    const/4 v1, -0x2

    if-eqz p2, :cond_0

    move p1, v1

    :cond_0
    sget-object p2, Ldc3/a;->w:Ldc3/a;

    const/4 v2, -0x1

    if-gez p1, :cond_2

    if-eq p1, v1, :cond_2

    if-ne p1, v2, :cond_1

    goto :goto_0

    :cond_1
    const-string p0, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "

    invoke-static {p1, p0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-ne p1, v2, :cond_3

    sget-object p2, Ldc3/a;->x:Ldc3/a;

    const/4 p1, 0x0

    :cond_3
    move v4, p1

    move-object v5, p2

    instance-of p1, p0, Lfc3/q;

    if-eqz p1, :cond_4

    check-cast p0, Lfc3/q;

    const/4 p1, 0x0

    invoke-static {p0, p1, v4, v5, v0}, Lfc3/b;->b(Lfc3/q;Lq83/j;ILdc3/a;I)Lec3/l;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance v1, Lfc3/h;

    const/4 v3, 0x0

    const/4 v6, 0x2

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lfc3/h;-><init>(Lec3/l;Lq83/j;ILdc3/a;I)V

    return-object v1
.end method

.method public static final j(Lc93/m;)Lec3/c;
    .locals 4

    new-instance v0, Lec3/c;

    const/4 v1, -0x2

    sget-object v2, Ldc3/a;->w:Ldc3/a;

    sget-object v3, Lq83/k;->w:Lq83/k;

    invoke-direct {v0, p0, v3, v1, v2}, Lec3/c;-><init>(Lc93/m;Lq83/j;ILdc3/a;)V

    return-object v0
.end method

.method public static final k(Lec3/l;Lec3/m;Ls83/c;)Ljava/io/Serializable;
    .locals 5

    instance-of v0, p2, Lec3/c0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/c0;

    iget v1, v0, Lec3/c0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/c0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/c0;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/c0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/c0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lec3/c0;->w:Lkotlin/jvm/internal/g0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p2

    :try_start_1
    new-instance v2, Lec3/e0;

    const/4 v4, 0x0

    invoke-direct {v2, v4, p1, p2}, Lec3/e0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, v0, Lec3/c0;->w:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lec3/c0;->y:I

    invoke-interface {p0, v2, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return-object p0

    :catchall_1
    move-exception p1

    move-object p0, p2

    :goto_2
    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    if-eqz p0, :cond_4

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    :cond_4
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p2, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    check-cast p2, Lbc3/k1;

    if-eqz p2, :cond_7

    invoke-interface {p2}, Lbc3/k1;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {p2}, Lbc3/k1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_3

    :cond_6
    throw p1

    :cond_7
    :goto_3
    if-nez p0, :cond_8

    return-object p1

    :cond_8
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    if-eqz p2, :cond_9

    invoke-static {p0, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p0

    :cond_9
    invoke-static {p1, p0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final l(Lc93/m;)Lec3/h;
    .locals 4

    new-instance v0, Lec3/h;

    const/4 v1, -0x2

    sget-object v2, Ldc3/a;->w:Ldc3/a;

    sget-object v3, Lq83/k;->w:Lq83/k;

    invoke-direct {v0, p0, v3, v1, v2}, Lec3/h;-><init>(Lc93/m;Lq83/j;ILdc3/a;)V

    return-object v0
.end method

.method public static final m(Lec3/l;Lq83/d;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lfc3/s;->w:Lfc3/s;

    invoke-interface {p0, v0, p1}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1, p0}, Lec3/v;->I(Lc93/m;Lec3/l;)Lfc3/k;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p1, v0}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    invoke-static {p0, p2}, Lec3/v;->m(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lc93/o;)Landroidx/room/y;
    .locals 2

    const/4 v0, 0x4

    new-array v0, v0, [Lec3/l;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p1, 0x3

    aput-object p3, v0, p1

    new-instance p1, Landroidx/room/y;

    invoke-direct {p1, p0, v0, p4}, Landroidx/room/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static final p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [Lec3/l;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p1, 0x2

    aput-object p2, v0, p1

    new-instance p1, Lec3/j1;

    invoke-direct {p1, v0, p3, p0}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    return-object p1
.end method

.method public static final q(Lec3/l;I)Lso/o;
    .locals 7

    sget-object v0, Ldc3/l;->h:Ldc3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Ldc3/k;->b:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    sub-int/2addr v0, p1

    instance-of v1, p0, Lfc3/d;

    if-eqz v1, :cond_5

    move-object v1, p0

    check-cast v1, Lfc3/d;

    iget-object v2, v1, Lfc3/d;->y:Ldc3/a;

    invoke-virtual {v1}, Lfc3/d;->g()Lec3/l;

    move-result-object v3

    if-eqz v3, :cond_5

    new-instance p0, Lso/o;

    iget v4, v1, Lfc3/d;->x:I

    const/4 v5, -0x3

    if-eq v4, v5, :cond_1

    const/4 v5, -0x2

    if-eq v4, v5, :cond_1

    if-eqz v4, :cond_1

    move v0, v4

    goto :goto_1

    :cond_1
    sget-object v5, Ldc3/a;->w:Ldc3/a;

    const/4 v6, 0x0

    if-ne v2, v5, :cond_3

    if-nez v4, :cond_4

    :cond_2
    move v0, v6

    goto :goto_1

    :cond_3
    if-nez p1, :cond_2

    const/4 v0, 0x1

    :cond_4
    :goto_1
    iget-object p1, v1, Lfc3/d;->w:Lq83/j;

    invoke-direct {p0, v0, v2, v3, p1}, Lso/o;-><init>(ILdc3/a;Lec3/l;Lq83/j;)V

    return-object p0

    :cond_5
    new-instance p1, Lso/o;

    sget-object v1, Ldc3/a;->w:Ldc3/a;

    sget-object v2, Lq83/k;->w:Lq83/k;

    invoke-direct {p1, v0, v1, p0, v2}, Lso/o;-><init>(ILdc3/a;Lec3/l;Lq83/j;)V

    return-object p1
.end method

.method public static final r(Lec3/l;J)Lec3/l;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/d;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/whoop/data/local/room/dao/persistent/d;-><init>(JI)V

    new-instance p1, Lec3/s;

    const/4 p2, 0x0

    invoke-direct {p1, v0, p0, p2}, Lec3/s;-><init>(Lcom/whoop/data/local/room/dao/persistent/d;Lec3/l;Lq83/d;)V

    new-instance p0, La6/u;

    invoke-direct {p0, p1}, La6/u;-><init>(Lkotlin/jvm/functions/Function3;)V

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Debounce timeout should not be negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final s(Lc93/m;Lec3/l;)Lec3/j;
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0, p0}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    sget-object v0, Lec3/v;->a:Lvb1/a;

    invoke-static {p1, v0, p0}, Lec3/v;->u(Lec3/l;Lkotlin/jvm/functions/Function1;Lc93/m;)Lec3/j;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Lec3/l;)Lec3/l;
    .locals 2

    instance-of v0, p0, Lec3/f2;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    sget-object v0, Lec3/v;->a:Lvb1/a;

    sget-object v1, Lec3/v;->b:Lds2/a;

    invoke-static {p0, v0, v1}, Lec3/v;->u(Lec3/l;Lkotlin/jvm/functions/Function1;Lc93/m;)Lec3/j;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Lec3/l;Lkotlin/jvm/functions/Function1;Lc93/m;)Lec3/j;
    .locals 2

    instance-of v0, p0, Lec3/j;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lec3/j;

    iget-object v1, v0, Lec3/j;->x:Lkotlin/jvm/functions/Function1;

    if-ne v1, p1, :cond_0

    iget-object v1, v0, Lec3/j;->y:Lc93/m;

    if-ne v1, p2, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lec3/j;

    invoke-direct {v0, p0, p1, p2}, Lec3/j;-><init>(Lec3/l;Lkotlin/jvm/functions/Function1;Lc93/m;)V

    return-object v0
.end method

.method public static final v(Lec3/l;I)Lec3/h0;
    .locals 1

    if-ltz p1, :cond_0

    new-instance v0, Lec3/h0;

    invoke-direct {v0, p0, p1}, Lec3/h0;-><init>(Lec3/l;I)V

    return-object v0

    :cond_0
    const-string p0, "Drop count should be non-negative, but had "

    invoke-static {p1, p0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lec3/v;->y(Lec3/m;)V

    invoke-interface {p1, p0, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final x(Lec3/m;Ldc3/w;ZLq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lec3/q;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lec3/q;

    iget v1, v0, Lec3/q;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/q;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/q;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lec3/q;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/q;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    iget-boolean p2, v0, Lec3/q;->z:Z

    iget-object p0, v0, Lec3/q;->y:Ldc3/c;

    iget-object p1, v0, Lec3/q;->x:Ldc3/w;

    iget-object v2, v0, Lec3/q;->w:Lec3/m;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object p3, p0

    move-object p0, v2

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_4

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    iget-boolean p2, v0, Lec3/q;->z:Z

    iget-object p0, v0, Lec3/q;->y:Ldc3/c;

    iget-object p1, v0, Lec3/q;->x:Ldc3/w;

    iget-object v2, v0, Lec3/q;->w:Lec3/m;

    :try_start_1
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p0}, Lec3/v;->y(Lec3/m;)V

    :try_start_2
    invoke-interface {p1}, Ldc3/w;->iterator()Ldc3/c;

    move-result-object p3

    :goto_1
    iput-object p0, v0, Lec3/q;->w:Lec3/m;

    iput-object p1, v0, Lec3/q;->x:Ldc3/w;

    iput-object p3, v0, Lec3/q;->y:Ldc3/c;

    iput-boolean p2, v0, Lec3/q;->z:Z

    iput v4, v0, Lec3/q;->F:I

    invoke-virtual {p3, v0}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v5, v2

    move-object v2, p0

    move-object p0, p3

    move-object p3, v5

    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-virtual {p0}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object p3

    iput-object v2, v0, Lec3/q;->w:Lec3/m;

    iput-object p1, v0, Lec3/q;->x:Ldc3/w;

    iput-object p0, v0, Lec3/q;->y:Ldc3/c;

    iput-boolean p2, v0, Lec3/q;->z:Z

    iput v3, v0, Lec3/q;->F:I

    invoke-interface {v2, p3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p3, v1, :cond_1

    :goto_3
    return-object v1

    :cond_6
    if-eqz p2, :cond_7

    const/4 p0, 0x0

    invoke-interface {p1, p0}, Ldc3/w;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_7
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_4
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p3

    if-eqz p2, :cond_8

    invoke-static {p1, p0}, Lts/o;->f(Ldc3/w;Ljava/lang/Throwable;)V

    :cond_8
    throw p3
.end method

.method public static final y(Lec3/m;)V
    .locals 1

    instance-of v0, p0, Lec3/n2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, Lec3/n2;

    iget-object p0, p0, Lec3/n2;->w:Ljava/lang/Throwable;

    throw p0
.end method

.method public static final z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lfc3/b;->b:Lhc3/x;

    instance-of v1, p2, Lec3/a1;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lec3/a1;

    iget v2, v1, Lec3/a1;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lec3/a1;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lec3/a1;

    invoke-direct {v1, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v1, Lec3/a1;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lec3/a1;->z:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p0, v1, Lec3/a1;->x:Lec3/e0;

    iget-object p1, v1, Lec3/a1;->w:Lkotlin/jvm/internal/g0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p2

    iput-object v0, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v3, Lec3/e0;

    const/4 v5, 0x1

    invoke-direct {v3, v5, p1, p2}, Lec3/e0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    :try_start_1
    iput-object p2, v1, Lec3/a1;->w:Lkotlin/jvm/internal/g0;

    iput-object v3, v1, Lec3/a1;->x:Lec3/e0;

    iput v4, v1, Lec3/a1;->z:I

    invoke-interface {p0, v3, v1}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v2, :cond_3

    return-object v2

    :cond_3
    move-object p1, p2

    goto :goto_2

    :catch_1
    move-exception p0

    move-object p1, p2

    move-object p2, p0

    move-object p0, v3

    :goto_1
    iget-object v2, p2, Lkotlinx/coroutines/flow/internal/AbortFlowException;->w:Ljava/lang/Object;

    if-ne v2, p0, :cond_5

    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object p0

    invoke-static {p0}, Lbc3/f0;->o(Lq83/j;)V

    :goto_2
    iget-object p0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eq p0, v0, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element matching the predicate"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    throw p2
.end method
