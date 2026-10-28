.class public final Llb/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/room/x1;
.implements Llb/b0;


# instance fields
.field public final a:Lg73/d;

.field public final b:Llb/h;

.field public final c:Z

.field public final d:Lm83/m;

.field public volatile e:Z


# direct methods
.method public constructor <init>(Lg73/d;Llb/h;Z)V
    .locals 1

    const-string v0, "connectionElementKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/a0;->a:Lg73/d;

    iput-object p2, p0, Llb/a0;->b:Llb/h;

    iput-boolean p3, p0, Llb/a0;->c:Z

    new-instance p1, Lm83/m;

    invoke-direct {p1}, Lm83/m;-><init>()V

    iput-object p1, p0, Llb/a0;->d:Lm83/m;

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Boolean;
    .locals 3

    iget-boolean v0, p0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_3

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    iget-object v0, p0, Llb/a0;->a:Lg73/d;

    invoke-interface {p1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    check-cast p1, Llb/a;

    if-eqz p1, :cond_2

    iget-object p1, p1, Llb/a;->x:Llb/a0;

    if-ne p1, p0, :cond_2

    iget-object p1, p0, Llb/a0;->d:Lm83/m;

    invoke-virtual {p1}, Lm83/m;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Llb/a0;->b:Llb/h;

    iget-object p1, p1, Llb/h;->w:Ltb/a;

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

    :cond_2
    const-string p1, "Attempted to use connection on a different coroutine"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_3
    const-string p1, "Connection is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final b(Landroidx/room/w1;Lc93/m;Ls83/i;)Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    invoke-interface {p3}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    iget-object v3, p0, Llb/a0;->a:Lg73/d;

    invoke-interface {v0, v3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Llb/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Llb/a;->x:Llb/a0;

    if-ne v0, p0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Llb/a0;->g(Landroidx/room/w1;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Attempted to use connection on a different coroutine"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Connection is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Llb/z;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Llb/z;

    iget v1, v0, Llb/z;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llb/z;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Llb/z;

    invoke-direct {v0, p0, p3}, Llb/z;-><init>(Llb/a0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Llb/z;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llb/z;->F:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llb/z;->y:Llb/h;

    iget-object p2, v0, Llb/z;->x:Lkotlin/jvm/functions/Function1;

    iget-object v0, v0, Llb/z;->w:Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p3, p1

    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p3, p0, Llb/a0;->e:Z

    const/16 v2, 0x15

    if-nez p3, :cond_5

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p3

    iget-object v5, p0, Llb/a0;->a:Lg73/d;

    invoke-interface {p3, v5}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p3

    check-cast p3, Llb/a;

    if-eqz p3, :cond_4

    iget-object p3, p3, Llb/a;->x:Llb/a0;

    if-ne p3, p0, :cond_4

    iget-object p3, p0, Llb/a0;->b:Llb/h;

    iput-object p1, v0, Llb/z;->w:Ljava/lang/String;

    iput-object p2, v0, Llb/z;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, v0, Llb/z;->y:Llb/h;

    iput v3, v0, Llb/z;->F:I

    iget-object v2, p3, Llb/h;->x:Lmc3/a;

    invoke-interface {v2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    :try_start_0
    new-instance v0, Llb/t;

    iget-object v1, p0, Llb/a0;->b:Llb/h;

    invoke-virtual {v1, p1}, Llb/h;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Llb/t;-><init>(Llb/a0;Ltb/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v0, v4}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {p3, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p2

    :try_start_4
    invoke-static {v0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    invoke-interface {p3, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1

    :cond_4
    const-string p1, "Attempted to use connection on a different coroutine"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v4

    :cond_5
    const-string p1, "Connection is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v4
.end method

.method public final d()Ltb/a;
    .locals 1

    iget-object v0, p0, Llb/a0;->b:Llb/h;

    return-object v0
.end method

.method public final e(Landroidx/room/w1;Ls83/c;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Llb/a0;->d:Lm83/m;

    const-string v1, "SAVEPOINT \'"

    instance-of v2, p2, Llb/w;

    if-eqz v2, :cond_0

    move-object v2, p2

    check-cast v2, Llb/w;

    iget v3, v2, Llb/w;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llb/w;->E:I

    goto :goto_0

    :cond_0
    new-instance v2, Llb/w;

    invoke-direct {v2, p0, p2}, Llb/w;-><init>(Llb/a0;Ls83/c;)V

    :goto_0
    iget-object p2, v2, Llb/w;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Llb/w;->E:I

    const/4 v5, 0x1

    iget-object v6, p0, Llb/a0;->b:Llb/h;

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object p1, v2, Llb/w;->x:Llb/h;

    iget-object v2, v2, Llb/w;->w:Landroidx/room/w1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v2, Llb/w;->w:Landroidx/room/w1;

    iput-object v6, v2, Llb/w;->x:Llb/h;

    iput v5, v2, Llb/w;->E:I

    iget-object p2, v6, Llb/h;->x:Lmc3/a;

    invoke-interface {p2, v2}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v3, :cond_3

    return-object v3

    :cond_3
    move-object p2, v6

    :goto_1
    const/4 v2, 0x0

    :try_start_0
    iget v3, v0, Lm83/m;->y:I

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_6

    if-eq p1, v5, :cond_5

    const/4 v1, 0x2

    if-ne p1, v1, :cond_4

    const-string p1, "BEGIN EXCLUSIVE TRANSACTION"

    invoke-static {p1, v6}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    const-string p1, "BEGIN IMMEDIATE TRANSACTION"

    invoke-static {p1, v6}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_2

    :cond_6
    const-string p1, "BEGIN DEFERRED TRANSACTION"

    invoke-static {p1, v6}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :goto_2
    new-instance p1, Llb/v;

    invoke-direct {p1, v3}, Llb/v;-><init>(I)V

    invoke-virtual {v0, p1}, Lm83/m;->addLast(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v2}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :goto_3
    invoke-interface {p2, v2}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final f(ZLs83/c;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Llb/a0;->d:Lm83/m;

    const-string v1, "ROLLBACK TRANSACTION TO SAVEPOINT \'"

    const-string v2, "RELEASE SAVEPOINT \'"

    instance-of v3, p2, Llb/x;

    if-eqz v3, :cond_0

    move-object v3, p2

    check-cast v3, Llb/x;

    iget v4, v3, Llb/x;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Llb/x;->E:I

    goto :goto_0

    :cond_0
    new-instance v3, Llb/x;

    invoke-direct {v3, p0, p2}, Llb/x;-><init>(Llb/a0;Ls83/c;)V

    :goto_0
    iget-object p2, v3, Llb/x;->y:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Llb/x;->E:I

    const/4 v6, 0x1

    iget-object v7, p0, Llb/a0;->b:Llb/h;

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-boolean p1, v3, Llb/x;->w:Z

    iget-object v3, v3, Llb/x;->x:Llb/h;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v7, v3, Llb/x;->x:Llb/h;

    iput-boolean p1, v3, Llb/x;->w:Z

    iput v6, v3, Llb/x;->E:I

    iget-object p2, v7, Llb/h;->x:Lmc3/a;

    invoke-interface {p2, v3}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v4, :cond_3

    return-object v4

    :cond_3
    move-object v3, v7

    :goto_1
    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-static {v0}, Lm83/s;->l1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb/v;

    const/16 v5, 0x27

    if-eqz p1, :cond_5

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "END TRANSACTION"

    invoke-static {p1, v7}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v4, Llb/v;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v7}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    const-string p1, "ROLLBACK TRANSACTION"

    invoke-static {p1, v7}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v4, Llb/v;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v7}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v3, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :cond_7
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not in a transaction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    invoke-interface {v3, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final g(Landroidx/room/w1;Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Llb/y;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Llb/y;

    iget v1, v0, Llb/y;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llb/y;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Llb/y;

    invoke-direct {v0, p0, p3}, Llb/y;-><init>(Llb/a0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Llb/y;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llb/y;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x5

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    const/4 p1, 0x4

    if-eq v2, p1, :cond_2

    if-eq v2, v4, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, v0, Llb/y;->x:Ljava/lang/Throwable;

    iget-object p2, v0, Llb/y;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Throwable;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_6

    :catch_0
    move-exception p3

    goto :goto_5

    :cond_2
    iget-object p1, v0, Llb/y;->w:Ljava/lang/Object;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_3
    iget p1, v0, Llb/y;->y:I

    :try_start_1
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object p2, p1

    goto :goto_3

    :cond_4
    iget-object p1, v0, Llb/y;->w:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lc93/m;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p1, :cond_6

    sget-object p1, Landroidx/room/w1;->w:Landroidx/room/w1;

    :cond_6
    iput-object p2, v0, Llb/y;->w:Ljava/lang/Object;

    iput v7, v0, Llb/y;->F:I

    invoke-virtual {p0, p1, v0}, Llb/a0;->e(Landroidx/room/w1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_1
    :try_start_2
    new-instance p1, Llb/u;

    invoke-direct {p1, p0}, Llb/u;-><init>(Llb/a0;)V

    const/4 p3, 0x0

    iput-object p3, v0, Llb/y;->w:Ljava/lang/Object;

    iput v7, v0, Llb/y;->y:I

    iput v6, v0, Llb/y;->F:I

    invoke-interface {p2, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p3, v1, :cond_8

    goto :goto_4

    :cond_8
    move p1, v7

    :goto_2
    if-eqz p1, :cond_9

    move v3, v7

    :cond_9
    iput-object p3, v0, Llb/y;->w:Ljava/lang/Object;

    iput v5, v0, Llb/y;->F:I

    invoke-virtual {p0, v3, v0}, Llb/a0;->f(ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_4

    :cond_a
    return-object p3

    :goto_3
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    :try_start_4
    iput-object p2, v0, Llb/y;->w:Ljava/lang/Object;

    iput-object p1, v0, Llb/y;->x:Ljava/lang/Throwable;

    iput v4, v0, Llb/y;->F:I

    invoke-virtual {p0, v3, v0}, Llb/a0;->f(ZLs83/c;)Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catch Landroid/database/SQLException; {:try_start_4 .. :try_end_4} :catch_0

    if-ne p2, v1, :cond_b

    :goto_4
    return-object v1

    :goto_5
    if-eqz p2, :cond_c

    invoke-static {p2, p3}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_b
    :goto_6
    throw p1

    :cond_c
    throw p3
.end method
