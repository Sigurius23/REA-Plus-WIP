.class public final Lwc/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/f;


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Lyc/a;

.field public final G:Lab/h0;

.field public final w:Ljava/lang/String;

.field public final x:J

.field public final y:Lvg/n;

.field public final z:Lug/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lvg/n;Lug/a;Ljava/lang/String;Lyc/a;)V
    .locals 3

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v0, 0x12c

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    const-string v2, "loginSessionName"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "platformProvider"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "clock"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "cacheDirectory"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "client"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/f0;->w:Ljava/lang/String;

    iput-wide v0, p0, Lwc/f0;->x:J

    iput-object p2, p0, Lwc/f0;->y:Lvg/n;

    iput-object p3, p0, Lwc/f0;->z:Lug/a;

    iput-object p4, p0, Lwc/f0;->E:Ljava/lang/String;

    iput-object p5, p0, Lwc/f0;->F:Lyc/a;

    new-instance p1, Lab/h0;

    const/16 p2, 0x11

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lab/h0;-><init>(IB)V

    iput-object p1, p0, Lwc/f0;->G:Lab/h0;

    return-void
.end method

.method public static final a(Lwc/f0;Ls83/c;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lwc/f0;->z:Lug/a;

    instance-of v1, p1, Lwc/b0;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lwc/b0;

    iget v2, v1, Lwc/b0;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lwc/b0;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lwc/b0;

    invoke-direct {v1, p0, p1}, Lwc/b0;-><init>(Lwc/f0;Ls83/c;)V

    :goto_0
    iget-object p1, v1, Lwc/b0;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lwc/b0;->z:I

    const/4 v4, 0x0

    const-string v5, "log<T> cannot be used on an anonymous object"

    const-class v6, Lwc/f0;

    const/4 v7, 0x1

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v7, :cond_2

    if-ne v3, v8, :cond_1

    iget-object v2, v1, Lwc/b0;->w:Lwc/x;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwc/f0;->w:Ljava/lang/String;

    iget-object v3, p0, Lwc/f0;->y:Lvg/n;

    iget-object v10, p0, Lwc/f0;->E:Ljava/lang/String;

    iput v7, v1, Lwc/b0;->z:I

    invoke-static {p1, v3, v10, v1}, Lrj/o;->A(Ljava/lang/String;Lvg/n;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lwc/x;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v3

    iget-object v7, p1, Lwc/x;->f:Lug/b;

    iget-wide v10, p0, Lwc/f0;->x:J

    invoke-virtual {v7, v10, v11}, Lug/b;->c(J)Lug/b;

    move-result-object v7

    invoke-virtual {v3, v7}, Lug/b;->a(Lug/b;)I

    move-result v3

    if-gez v3, :cond_6

    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lwc/y;

    invoke-direct {v1, p0, v4}, Lwc/y;-><init>(Lwc/f0;I)V

    sget-object p0, Log/b;->z:Log/b;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v0, p0, v2, v9, v1}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-object p1

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :try_start_1
    iput-object p1, v1, Lwc/b0;->w:Lwc/x;

    iput v8, v1, Lwc/b0;->z:I

    invoke-virtual {p0, p1, v1}, Lwc/f0;->c(Lwc/x;Ls83/c;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v3, v2, :cond_7

    :goto_2
    return-object v2

    :cond_7
    move-object v2, p1

    move-object p1, v3

    :goto_3
    :try_start_2
    check-cast p1, Lwc/x;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_1
    move-exception v2

    move-object v12, v2

    move-object v2, p1

    move-object p1, v12

    :goto_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v0

    iget-object v3, v2, Lwc/x;->f:Lug/b;

    invoke-virtual {v0, v3}, Lug/b;->a(Lug/b;)I

    move-result v0

    if-gez v0, :cond_8

    goto :goto_5

    :cond_8
    move-object v2, v9

    :goto_5
    if-eqz v2, :cond_a

    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    new-instance v0, Lwc/z;

    invoke-direct {v0, v2, p0, v4}, Lwc/z;-><init>(Lwc/x;Lwc/f0;I)V

    sget-object p0, Log/b;->z:Log/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-static {p1, p0, v1, v9, v0}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-object v2

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    invoke-virtual {p0, v9, p1}, Lwc/f0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v9
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lwc/d0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/d0;

    iget v1, v0, Lwc/d0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/d0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/d0;

    invoke-direct {v0, p0, p2}, Lwc/d0;-><init>(Lwc/f0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/d0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/d0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, La33/c;

    const/16 v2, 0xd

    const/4 v4, 0x0

    invoke-direct {p2, p0, p1, v4, v2}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Lwc/d0;->y:I

    iget-object p1, p0, Lwc/f0;->G:Lab/h0;

    invoke-virtual {p1, p2, v0}, Lab/h0;->v(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lwc/x;

    iget-object v0, p2, Lwc/x;->a:Ljava/lang/String;

    iget-object v1, p2, Lwc/x;->b:Ljava/lang/String;

    iget-object v2, p2, Lwc/x;->c:Ljava/lang/String;

    iget-object v3, p2, Lwc/x;->f:Lug/b;

    const-string v4, "LOGIN"

    iget-object v5, p2, Lwc/x;->d:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Ls93/h;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;)Lve/e;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lwc/x;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lwc/a0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/a0;

    iget v1, v0, Lwc/a0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/a0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/a0;

    invoke-direct {v0, p0, p2}, Lwc/a0;-><init>(Lwc/f0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/a0;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/a0;->E:I

    const/4 v3, 0x1

    const-string v4, "log<T> cannot be used on an anonymous object"

    const-class v5, Lwc/f0;

    const/4 v6, 0x2

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v6, :cond_1

    iget-object p1, v0, Lwc/a0;->x:Ljava/lang/Object;

    iget-object v1, v0, Lwc/a0;->w:Lwc/x;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lwc/a0;->w:Lwc/x;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    new-instance v2, Lwc/y;

    invoke-direct {v2, p0, v3}, Lwc/y;-><init>(Lwc/f0;I)V

    sget-object v8, Log/b;->z:Log/b;

    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v9, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-interface {v9}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_b

    invoke-static {p2, v8, v9, v7, v2}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    :try_start_1
    iput-object p1, v0, Lwc/a0;->w:Lwc/x;

    iput v3, v0, Lwc/a0;->E:I

    invoke-virtual {p0, p1, v0}, Lwc/f0;->d(Lwc/x;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_5

    :cond_4
    :goto_1
    check-cast p2, Lwc/x;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    move-object v10, p2

    move-object p2, p1

    move-object p1, v10

    goto :goto_4

    :goto_3
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    goto :goto_2

    :goto_4
    instance-of v2, p1, Ll83/m;

    if-nez v2, :cond_6

    move-object v2, p1

    check-cast v2, Lwc/x;

    iput-object p2, v0, Lwc/a0;->w:Lwc/x;

    iput-object p1, v0, Lwc/a0;->x:Ljava/lang/Object;

    iput v6, v0, Lwc/a0;->E:I

    invoke-virtual {p0, v2, v0}, Lwc/f0;->f(Lwc/x;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    :goto_5
    return-object v1

    :cond_5
    move-object v1, p2

    :goto_6
    move-object p2, v1

    :cond_6
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    iget-object p1, p0, Lwc/f0;->z:Lug/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object p1

    iget-object v2, p2, Lwc/x;->f:Lug/b;

    invoke-virtual {p1, v2}, Lug/b;->a(Lug/b;)I

    move-result p1

    if-ltz p1, :cond_9

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    new-instance p2, Lw91/l;

    const/16 v0, 0x11

    invoke-direct {p2, v0}, Lw91/l;-><init>(I)V

    sget-object v0, Log/b;->w:Log/b;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {p1, v0, v2, v1, p2}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    invoke-virtual {p0, v7, v1}, Lwc/f0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v7

    :cond_9
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    new-instance v0, Lwc/z;

    invoke-direct {v0, p2, p0, v3}, Lwc/z;-><init>(Lwc/x;Lwc/f0;I)V

    sget-object v1, Log/b;->z:Log/b;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-static {p1, v1, v2, v7, v0}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    move-object p1, p2

    :goto_7
    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Lwc/x;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lwc/c0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/c0;

    iget v1, v0, Lwc/c0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/c0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/c0;

    invoke-direct {v0, p0, p2}, Lwc/c0;-><init>(Lwc/f0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/c0;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/c0;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwc/c0;->x:Lyc/a;

    iget-object v0, v0, Lwc/c0;->w:Lwc/x;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p2, "<this>"

    iget-object v2, p0, Lwc/f0;->F:Lyc/a;

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, v2, Lyc/a;->w:Lyc/f;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lyc/e;

    invoke-direct {v2}, Lyc/e;-><init>()V

    iget-object v4, p2, Lyc/f;->y:Ljava/lang/String;

    const-string v5, "<set-?>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v2, Lyc/e;->c:Ljava/lang/String;

    iget-object v4, p2, Lyc/f;->z:Ljava/lang/String;

    iput-object v4, v2, Lyc/e;->d:Ljava/lang/String;

    iget-object v4, p2, Lyc/f;->E:Lff/a;

    iput-object v4, v2, Lyc/e;->e:Lff/a;

    iget-object v4, p2, Lyc/f;->F:Ljava/util/List;

    iput-object v4, v2, Lyc/e;->f:Ljava/util/List;

    iget-object v4, p2, Lyc/f;->G:Lm83/y;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v2, Lyc/e;->g:Lm83/y;

    iget-object v4, p2, Lyc/f;->H:Lve/f;

    iput-object v4, v2, Lyc/e;->h:Lve/f;

    iget-object v4, p2, Lyc/f;->I:Lkr/e;

    iput-object v4, v2, Lyc/e;->i:Lkr/e;

    iget-object v4, p2, Lyc/f;->J:Lcg/o;

    iput-object v4, v2, Lyc/e;->j:Lcg/o;

    iget-object v4, p2, Lyc/f;->w:Lad3/z;

    iget-object v4, v4, Lad3/z;->x:Ljava/lang/Object;

    check-cast v4, Lpf/a;

    iget-object v5, v2, Lyc/e;->a:Lzt/q;

    invoke-virtual {v5, v4}, Lzt/q;->G(Lpf/a;)V

    iget-object v4, p2, Lyc/f;->K:Ljava/util/ArrayList;

    invoke-static {v4}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, v2, Lyc/e;->k:Ljava/util/ArrayList;

    iget-object v4, p2, Lyc/f;->L:Lcf/e;

    iput-object v4, v2, Lyc/e;->l:Lcf/e;

    iget-object v4, p2, Lyc/f;->M:Lgg/g;

    iput-object v4, v2, Lyc/e;->m:Lgg/g;

    iget-object v4, p2, Lyc/f;->x:Laj/d;

    iget-object v4, v4, Laj/d;->w:Ljava/lang/Object;

    check-cast v4, Leg/o;

    invoke-virtual {v2, v4}, Lyc/e;->h(Leg/o;)V

    iget-object v4, p2, Lyc/f;->N:Lmg/h;

    iput-object v4, v2, Lyc/e;->n:Lmg/h;

    iget-boolean v4, p2, Lyc/f;->O:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v2, Lyc/e;->o:Ljava/lang/Boolean;

    iget-boolean v4, p2, Lyc/f;->P:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v2, Lyc/e;->p:Ljava/lang/Boolean;

    iget-object v4, p2, Lyc/f;->Q:Ljava/lang/String;

    iput-object v4, v2, Lyc/e;->q:Ljava/lang/String;

    iget-object p2, p2, Lyc/f;->R:Lfd/a;

    iput-object p2, v2, Lyc/e;->r:Lfd/a;

    iget-object p2, v2, Lyc/e;->k:Ljava/util/ArrayList;

    new-instance v4, Lwc/d;

    iget-object v5, p1, Lwc/x;->j:Ljava/lang/String;

    invoke-direct {v4, v5}, Lwc/d;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance p2, Lyc/f;

    invoke-direct {p2, v2}, Lyc/f;-><init>(Lyc/e;)V

    new-instance v2, Lyc/a;

    invoke-direct {v2, p2}, Lyc/a;-><init>(Lyc/f;)V

    :try_start_1
    new-instance p2, Lro/i;

    const/16 v4, 0xc

    invoke-direct {p2, v4}, Lro/i;-><init>(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v4, Lcd/a;

    invoke-direct {v4, v3}, Lcd/a;-><init>(I)V

    iget-object v5, p1, Lwc/x;->i:Ljava/lang/String;

    iput-object v5, v4, Lcd/a;->b:Ljava/lang/String;

    const-string v5, "refresh_token"

    iput-object v5, v4, Lcd/a;->c:Ljava/lang/String;

    iget-object v5, p1, Lwc/x;->g:Ljava/lang/String;

    iput-object v5, v4, Lcd/a;->d:Ljava/lang/String;

    new-instance v5, Lcd/d;

    invoke-direct {v5, v4}, Lcd/d;-><init>(Lcd/a;)V

    iput-object v5, p2, Lro/i;->x:Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    new-instance v4, Lcd/c;

    invoke-direct {v4, p2}, Lcd/c;-><init>(Lro/i;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    iput-object p1, v0, Lwc/c0;->w:Lwc/x;

    iput-object v2, v0, Lwc/c0;->x:Lyc/a;

    iput v3, v0, Lwc/c0;->E:I

    invoke-virtual {v2, v4, v0}, Lyc/a;->b(Lcd/c;Lwc/c0;)Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v3, p1

    move-object p1, v2

    :goto_1
    :try_start_5
    check-cast p2, Lcd/e;

    iget-object p2, p2, Lcd/e;->a:Lcd/f;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p2, Lcd/f;->a:Lcd/b;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, v0, Lcd/b;->a:Ljava/lang/String;

    iget-object v0, p2, Lcd/f;->a:Lcd/b;

    iget-object v5, v0, Lcd/b;->b:Ljava/lang/String;

    iget-object v6, v0, Lcd/b;->c:Ljava/lang/String;

    iget-object v0, p0, Lwc/f0;->z:Lug/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v0

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    iget v1, p2, Lcd/f;->b:I

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v1, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lug/b;->d(J)Lug/b;

    move-result-object v7

    iget-object v8, p2, Lcd/f;->d:Ljava/lang/String;

    invoke-static/range {v3 .. v8}, Lwc/x;->a(Lwc/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;)Lwc/x;

    move-result-object p2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-object p2

    :catchall_1
    move-exception v0

    move-object p2, v0

    :goto_2
    move-object p1, v2

    goto :goto_7

    :catch_1
    move-exception v0

    move-object p2, v0

    :goto_3
    move-object p1, v2

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object p1, v0

    :goto_4
    move-object p2, p1

    goto :goto_2

    :catch_2
    move-exception v0

    move-object p1, v0

    :goto_5
    move-object p2, p1

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :catch_3
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :goto_6
    :try_start_6
    instance-of v0, p2, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;

    if-eqz v0, :cond_8

    move-object v0, p2

    check-cast v0, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;

    iget-object v0, v0, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;->z:Lcd/n;

    instance-of v1, v0, Lcd/g;

    const/4 v2, 0x0

    if-nez v1, :cond_7

    instance-of v1, v0, Lcd/l;

    if-nez v1, :cond_6

    instance-of v1, v0, Lcd/m;

    if-nez v1, :cond_5

    instance-of v0, v0, Lcd/h;

    if-eqz v0, :cond_4

    const-string v0, "Unable to refresh credentials due to insufficient permissions. You may be missing permission for the \'CreateOAuth2Token\' action."

    invoke-virtual {p0, v0, p2}, Lwc/f0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_4
    throw p2

    :cond_5
    const-string v0, "Unable to refresh credentials because of a change in your password. Please reauthenticate with your new password."

    invoke-virtual {p0, v0, p2}, Lwc/f0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_6
    const-string v0, "Your session has expired. Please reauthenticate."

    invoke-virtual {p0, v0, p2}, Lwc/f0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_7
    const-string v0, "Unable to complete the login process due to an expired authorization code. Please reauthenticate using \'aws login\'."

    invoke-virtual {p0, v0, p2}, Lwc/f0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_8
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_7
    :try_start_7
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_8

    :catchall_4
    move-exception v0

    move-object p1, v0

    invoke-static {p2, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_8
    throw p2
.end method

.method public final e(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/InvalidLoginTokenException;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Login token for login-session: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lwc/f0;->w:Ljava/lang/String;

    const-string v2, " is expired"

    invoke-static {v1, v2, p1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    const-string v1, "message"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, p2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final f(Lwc/x;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lwc/e0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/e0;

    iget v1, v0, Lwc/e0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/e0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/e0;

    invoke-direct {v0, p0, p2}, Lwc/e0;-><init>(Lwc/f0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/e0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/e0;->z:I

    const/16 v3, 0xc

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lwc/e0;->w:Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception p2

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lwc/f0;->w:Ljava/lang/String;

    invoke-static {p2}, Lrj/o;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, Lwc/f0;->E:Ljava/lang/String;

    filled-new-array {v2, p2}, [Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, Lwc/f0;->y:Lvg/n;

    invoke-static {v2, p2}, Lwc/z0;->b(Lvg/n;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v2}, Lx30/s0;->z(Ljava/lang/String;Lvg/n;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "token"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Le73/b;

    invoke-direct {v2, v5}, Le73/b;-><init>(Z)V

    invoke-virtual {v2}, Le73/b;->f()V

    const-string v6, "accessToken"

    invoke-virtual {v2, v6}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2}, Le73/b;->f()V

    iget-object v6, p1, Lwc/x;->a:Ljava/lang/String;

    const-string v7, "accessKeyId"

    invoke-virtual {v2, v7}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Le73/b;->r(Ljava/lang/String;)V

    iget-object v6, p1, Lwc/x;->b:Ljava/lang/String;

    const-string v7, "secretAccessKey"

    invoke-virtual {v2, v7}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Le73/b;->r(Ljava/lang/String;)V

    iget-object v6, p1, Lwc/x;->c:Ljava/lang/String;

    const-string v7, "sessionToken"

    invoke-virtual {v2, v7}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Le73/b;->r(Ljava/lang/String;)V

    iget-object v6, p1, Lwc/x;->d:Ljava/lang/String;

    const-string v7, "accountId"

    invoke-virtual {v2, v7}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Le73/b;->r(Ljava/lang/String;)V

    iget-object v6, p1, Lwc/x;->f:Lug/b;

    sget-object v7, Lug/t;->w:Lug/t;

    invoke-virtual {v6, v7}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    const-string v7, "expiresAt"

    invoke-virtual {v2, v7}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Le73/b;->r(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v2}, Le73/b;->k()V

    iget-object v6, p1, Lwc/x;->e:Ljava/lang/String;

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    const-string v7, "tokenType"

    invoke-virtual {v2, v7}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Le73/b;->r(Ljava/lang/String;)V

    :goto_2
    iget-object v6, p1, Lwc/x;->g:Ljava/lang/String;

    const-string v7, "refreshToken"

    invoke-virtual {v2, v7}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Le73/b;->r(Ljava/lang/String;)V

    iget-object v6, p1, Lwc/x;->h:Ljava/lang/String;

    if-nez v6, :cond_5

    goto :goto_3

    :cond_5
    const-string v7, "idToken"

    invoke-virtual {v2, v7}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Le73/b;->r(Ljava/lang/String;)V

    :goto_3
    iget-object v6, p1, Lwc/x;->i:Ljava/lang/String;

    const-string v7, "clientId"

    invoke-virtual {v2, v7}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Le73/b;->r(Ljava/lang/String;)V

    iget-object p1, p1, Lwc/x;->j:Ljava/lang/String;

    const-string v6, "dpopKey"

    invoke-virtual {v2, v6}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Le73/b;->r(Ljava/lang/String;)V

    invoke-virtual {v2}, Le73/b;->k()V

    invoke-virtual {v2}, Le73/b;->l()[B

    move-result-object p1

    :try_start_1
    iput-object p2, v0, Lwc/e0;->w:Ljava/lang/String;

    iput v5, v0, Lwc/e0;->z:I

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lkc3/d;->w:Lkc3/d;

    new-instance v5, Lo23/p;

    const/4 v6, 0x0

    invoke-direct {v5, p2, p1, v6, v3}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v5, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    move-object p1, v4

    :goto_4
    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_5
    return-object v4

    :goto_6
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    goto :goto_7

    :catch_1
    move-exception p1

    goto :goto_6

    :goto_7
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lar0/a;

    invoke-direct {v1, p1, v3}, Lar0/a;-><init>(Ljava/lang/String;I)V

    sget-object p1, Log/b;->z:Log/b;

    const-class v2, Lwc/f0;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "log<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {v0, p1, v2, p2, v1}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    throw p2
.end method
