.class public final Ljc/g0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ljc/i0;


# direct methods
.method public synthetic constructor <init>(Ljc/i0;Lq83/d;I)V
    .locals 0

    iput p3, p0, Ljc/g0;->w:I

    iput-object p1, p0, Ljc/g0;->y:Ljc/i0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Ljc/g0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljc/g0;

    iget-object v0, p0, Ljc/g0;->y:Ljc/i0;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Ljc/g0;-><init>(Ljc/i0;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ljc/g0;

    iget-object v0, p0, Ljc/g0;->y:Ljc/i0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Ljc/g0;-><init>(Ljc/i0;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljc/g0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ljc/g0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljc/g0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljc/g0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ljc/g0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljc/g0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljc/g0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Ljc/g0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ljc/g0;->x:I

    iget-object v2, p0, Ljc/g0;->y:Ljc/i0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/work/impl/WorkerStoppedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, v2, Ljc/i0;->n:Lbc3/l1;

    new-instance v1, Ljc/g0;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v4}, Ljc/g0;-><init>(Ljc/i0;Lq83/d;I)V

    iput v3, p0, Ljc/g0;->x:I

    invoke-static {p1, v1, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_4

    :cond_2
    :goto_0
    check-cast p1, Ljc/f0;
    :try_end_1
    .catch Landroidx/work/impl/WorkerStoppedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_1
    sget-object v0, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    const-string v3, "Unexpected error in WorkerWrapper"

    invoke-virtual {v1, v0, v3, p1}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Ljc/c0;

    invoke-direct {p1}, Ljc/c0;-><init>()V

    goto :goto_3

    :catch_1
    new-instance p1, Ljc/c0;

    invoke-direct {p1}, Ljc/c0;-><init>()V

    goto :goto_3

    :goto_2
    new-instance v0, Ljc/e0;

    iget p1, p1, Landroidx/work/impl/WorkerStoppedException;->w:I

    invoke-direct {v0, p1}, Ljc/e0;-><init>(I)V

    move-object p1, v0

    :goto_3
    iget-object v0, v2, Ljc/i0;->i:Landroidx/work/impl/WorkDatabase;

    new-instance v1, Lcom/iterable/iterableapi/m1;

    const/4 v3, 0x4

    invoke-direct {v1, v3, p1, v2}, Lcom/iterable/iterableapi/m1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroidx/room/z0;->runInTransaction(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    const-string p1, "runInTransaction(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_4
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ljc/g0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Ljc/g0;->x:I

    iget-object p1, p0, Ljc/g0;->y:Ljc/i0;

    invoke-static {p1, p0}, Ljc/i0;->a(Ljc/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    move-object p1, v0

    :cond_5
    :goto_5
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
