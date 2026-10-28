.class public final Llb/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/room/x1;
.implements Llb/b0;


# instance fields
.field public final a:Lkotlin/jvm/internal/i;

.field public final b:Ltb/a;

.field public final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public d:Landroidx/room/w1;


# direct methods
.method public constructor <init>(Lc93/m;Ltb/a;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lkotlin/jvm/internal/i;

    iput-object p1, p0, Llb/n;->a:Lkotlin/jvm/internal/i;

    iput-object p2, p0, Llb/n;->b:Ltb/a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Llb/n;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Boolean;
    .locals 0

    iget-object p1, p0, Llb/n;->d:Landroidx/room/w1;

    if-nez p1, :cond_1

    iget-object p1, p0, Llb/n;->b:Ltb/a;

    invoke-interface {p1}, Ltb/a;->v()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroidx/room/w1;Lc93/m;Ls83/i;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lh0/n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lh0/n;-><init>(Llb/n;Landroidx/room/w1;Lc93/m;Lq83/d;)V

    iget-object p1, p0, Llb/n;->a:Lkotlin/jvm/internal/i;

    invoke-interface {p1, v0, p3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Llb/l;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Llb/l;

    iget v1, v0, Llb/l;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llb/l;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Llb/l;

    invoke-direct {v0, p0, p3}, Llb/l;-><init>(Llb/n;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Llb/l;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llb/l;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p2, v0, Llb/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object p1, v0, Llb/l;->w:Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Llb/l;->w:Ljava/lang/String;

    iput-object p2, v0, Llb/l;->x:Lkotlin/jvm/functions/Function1;

    iput v4, v0, Llb/l;->E:I

    invoke-virtual {p0, v0}, Llb/n;->a(Lq83/d;)Ljava/lang/Boolean;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    const/4 v2, 0x0

    if-eqz p3, :cond_6

    new-instance p3, Llb/m;

    invoke-direct {p3, p0, p1, p2, v2}, Llb/m;-><init>(Llb/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object v2, v0, Llb/l;->w:Ljava/lang/String;

    iput-object v2, v0, Llb/l;->x:Lkotlin/jvm/functions/Function1;

    iput v3, v0, Llb/l;->E:I

    iget-object p1, p0, Llb/n;->a:Lkotlin/jvm/internal/i;

    invoke-interface {p1, p3, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1

    :cond_6
    iget-object p3, p0, Llb/n;->b:Ltb/a;

    invoke-interface {p3, p1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    :try_start_0
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object p2

    :catchall_0
    move-exception p2

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p3

    invoke-static {p1, p2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p3
.end method

.method public final d()Ltb/a;
    .locals 1

    iget-object v0, p0, Llb/n;->b:Ltb/a;

    return-object v0
.end method

.method public final e(Landroidx/room/w1;Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Llb/k;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Llb/k;

    iget v1, v0, Llb/k;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llb/k;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Llb/k;

    invoke-direct {v0, p0, p3}, Llb/k;-><init>(Llb/n;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Llb/k;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llb/k;->z:I

    const-string v3, "ROLLBACK TRANSACTION"

    const/4 v4, 0x0

    iget-object v5, p0, Llb/n;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v6, 0x1

    iget-object v7, p0, Llb/n;->b:Ltb/a;

    if-eqz v2, :cond_2

    if-ne v2, v6, :cond_1

    iget v6, v0, Llb/k;->w:I

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    if-eqz p3, :cond_5

    if-eq p3, v6, :cond_4

    const/4 v2, 0x2

    if-ne p3, v2, :cond_3

    const-string p3, "BEGIN EXCLUSIVE TRANSACTION"

    invoke-static {p3, v7}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    const-string p3, "BEGIN IMMEDIATE TRANSACTION"

    invoke-static {p3, v7}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_1

    :cond_5
    const-string p3, "BEGIN DEFERRED TRANSACTION"

    invoke-static {p3, v7}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :goto_1
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p3

    if-lez p3, :cond_6

    iput-object p1, p0, Llb/n;->d:Landroidx/room/w1;

    :cond_6
    :try_start_1
    new-instance p1, Llb/j;

    invoke-direct {p1, p0}, Llb/j;-><init>(Llb/n;)V

    iput v6, v0, Llb/k;->w:I

    iput v6, v0, Llb/k;->z:I

    invoke-interface {p2, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p3, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_8

    iput-object v4, p0, Llb/n;->d:Landroidx/room/w1;

    :cond_8
    if-eqz v6, :cond_9

    const-string p1, "END TRANSACTION"

    invoke-static {p1, v7}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-object p3

    :cond_9
    invoke-static {v3, v7}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-object p3

    :goto_3
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p2

    :try_start_3
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p3

    if-nez p3, :cond_a

    iput-object v4, p0, Llb/n;->d:Landroidx/room/w1;

    goto :goto_4

    :catch_0
    move-exception p3

    goto :goto_5

    :cond_a
    :goto_4
    invoke-static {v3, v7}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V
    :try_end_3
    .catch Landroid/database/SQLException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_6

    :goto_5
    invoke-static {p1, p3}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_6
    throw p2
.end method
