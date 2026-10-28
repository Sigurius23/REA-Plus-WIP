.class public final Lf63/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le63/d;

.field public final b:Lv53/c;


# direct methods
.method public constructor <init>(Le63/d;Lv53/c;)V
    .locals 2

    const-string v0, "client"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf63/j;->a:Le63/d;

    iput-object p2, p0, Lf63/j;->b:Lv53/c;

    iget-object p1, p1, Le63/d;->f:Lo63/f;

    sget-object p2, Ly53/e;->a:Lo63/a;

    invoke-virtual {p1, p2}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, La63/q;

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La63/q;

    iget-object v0, p0, Lf63/j;->b:Lv53/c;

    invoke-static {v0, p2}, La63/r;->b(Lv53/c;La63/q;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Consider installing "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " plugin because the request requires it to be installed"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    return-void
.end method


# virtual methods
.method public final a(Lf63/c;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lf63/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf63/g;

    iget v1, v0, Lf63/g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf63/g;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf63/g;

    invoke-direct {v0, p0, p2}, Lf63/g;-><init>(Lf63/j;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lf63/g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf63/g;->z:I

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

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p2

    sget-object v2, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p2, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p2, Lbc3/u;

    invoke-interface {p2}, Lbc3/u;->complete()Z

    :try_start_0
    invoke-virtual {p1}, Lf63/c;->b()Lio/ktor/utils/io/q;

    move-result-object p1

    const-string v2, "<this>"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lio/ktor/utils/io/m;

    new-instance v2, Ljava/util/concurrent/CancellationException;

    const-string v4, "Channel has been cancelled"

    invoke-direct {v2, v4}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    iput-object p2, v0, Lf63/g;->w:Lbc3/u;

    iput v3, v0, Lf63/g;->z:I

    invoke-interface {p2, v0}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(Landroidx/room/z1;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lf63/h;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf63/h;

    iget v1, v0, Lf63/h;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf63/h;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf63/h;

    invoke-direct {v0, p0, p2}, Lf63/h;-><init>(Lf63/j;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lf63/h;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf63/h;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, v0, Lf63/h;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :cond_2
    iget-object p1, v0, Lf63/h;->w:Ljava/lang/Object;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :cond_3
    iget-object p1, v0, Lf63/h;->x:Ljava/lang/Object;

    check-cast p1, Lf63/c;

    iget-object v2, v0, Lf63/h;->w:Ljava/lang/Object;

    check-cast v2, Lf63/j;

    :try_start_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    goto :goto_3

    :cond_4
    iget-object p1, v0, Lf63/h;->x:Ljava/lang/Object;

    check-cast p1, Lc93/m;

    iget-object v2, v0, Lf63/h;->w:Ljava/lang/Object;

    check-cast v2, Lf63/j;

    :try_start_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_4
    iput-object p0, v0, Lf63/h;->w:Ljava/lang/Object;

    iput-object p1, v0, Lf63/h;->x:Ljava/lang/Object;

    iput v7, v0, Lf63/h;->E:I

    invoke-virtual {p0, v0}, Lf63/j;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_4

    :cond_6
    move-object v2, p0

    :goto_1
    check-cast p2, Lf63/c;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    iput-object v2, v0, Lf63/h;->w:Ljava/lang/Object;

    iput-object p2, v0, Lf63/h;->x:Ljava/lang/Object;

    iput v6, v0, Lf63/h;->E:I

    invoke-interface {p1, p2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_2
    :try_start_6
    iput-object p2, v0, Lf63/h;->w:Ljava/lang/Object;

    iput-object v3, v0, Lf63/h;->x:Ljava/lang/Object;

    iput v5, v0, Lf63/h;->E:I

    invoke-virtual {v2, p1, v0}, Lf63/j;->a(Lf63/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_8
    return-object p2

    :catchall_1
    move-exception p1

    :goto_3
    iput-object p1, v0, Lf63/h;->w:Ljava/lang/Object;

    iput-object v3, v0, Lf63/h;->x:Ljava/lang/Object;

    iput v4, v0, Lf63/h;->E:I

    invoke-virtual {v2, p2, v0}, Lf63/j;->a(Lf63/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    :goto_5
    throw p1
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_0

    :goto_6
    invoke-static {p1}, Lg63/b;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1
.end method

.method public final c(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lf63/i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf63/i;

    iget v1, v0, Lf63/i;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf63/i;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf63/i;

    invoke-direct {v0, p0, p1}, Lf63/i;-><init>(Lf63/j;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lf63/i;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf63/i;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, Le63/d;

    invoke-direct {p1}, Le63/d;-><init>()V

    iget-object v2, p0, Lf63/j;->a:Le63/d;

    invoke-virtual {p1, v2}, Le63/d;->b(Le63/d;)V

    iget-object v2, p0, Lf63/j;->b:Lv53/c;

    iput v3, v0, Lf63/i;->y:I

    invoke-virtual {v2, p1, v0}, Lv53/c;->b(Le63/d;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lw53/b;

    invoke-virtual {p1}, Lw53/b;->d()Lf63/c;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    invoke-static {p1}, Lg63/b;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HttpStatement["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lf63/j;->a:Le63/d;

    iget-object v1, v1, Le63/d;->a:Li63/z;

    invoke-virtual {v1}, Li63/z;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
