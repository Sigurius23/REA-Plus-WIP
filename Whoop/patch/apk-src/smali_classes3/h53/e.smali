.class public final Lh53/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method public static final a(Lh53/e;Lx43/m;Lh53/d;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p0}, Lh53/e;->d()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[handleError] error: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v1, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v1, p1, Lx43/m;->a:Ln23/e;

    instance-of v2, v1, Ln23/c;

    if-eqz v2, :cond_f

    check-cast v1, Ln23/c;

    iget-object p1, p1, Lx43/m;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object v2, p0, Lh53/e;->m:Ljava/lang/Object;

    check-cast v2, Lqg3/d;

    sget-object v5, Lu33/e;->y:Lt9/p;

    iget v6, v1, Ln23/c;->b:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lu33/e;->z:Ljava/util/Set;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, p0, Lh53/e;->c:Ljava/lang/Object;

    check-cast v5, Lqg3/d;

    iget-object v5, v5, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v5, Le53/d;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, ""

    iput-object v7, v5, Le53/d;->a:Ljava/lang/Object;

    :cond_1
    const/16 v5, 0x3ef

    if-ne v6, v5, :cond_2

    goto :goto_0

    :cond_2
    const/16 v5, 0x3ee

    if-ne v6, v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v5, 0x2

    if-ne v6, v5, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x4

    if-ne v6, v5, :cond_5

    goto :goto_0

    :cond_5
    const/16 v5, 0x3ea

    if-ne v6, v5, :cond_a

    :goto_0
    invoke-virtual {p0}, Lh53/e;->d()Lb23/k;

    move-result-object p0

    iget-object p1, p0, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v7, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p1, v5, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lb23/k;->b:Lb23/j;

    iget-object p0, p0, Lb23/k;->a:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "One unrecoverable error happened. Error: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, ". Error code: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p1, v5, p0, v6, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    invoke-virtual {v2}, Lqg3/d;->r()Lb23/k;

    move-result-object p0

    iget-object p1, p0, Lb23/k;->c:Lb23/e;

    iget-object v5, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p1, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lb23/k;->b:Lb23/j;

    iget-object p0, p0, Lb23/k;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[onUnrecoverableError] error: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v3, p0, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-virtual {v2}, Lqg3/d;->s()Ly43/b;

    move-result-object p0

    new-instance p1, Li53/q;

    invoke-direct {p1, v1}, Li53/q;-><init>(Ln23/c;)V

    invoke-virtual {p0, p1, p2}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_8

    goto :goto_1

    :cond_8
    move-object p0, v0

    :goto_1
    if-ne p0, p1, :cond_9

    goto :goto_3

    :cond_9
    move-object p0, v0

    goto :goto_3

    :cond_a
    if-nez p1, :cond_b

    sget-object p1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    :cond_b
    invoke-virtual {v2}, Lqg3/d;->r()Lb23/k;

    move-result-object p0

    iget-object v5, p0, Lb23/k;->c:Lb23/e;

    iget-object v6, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v3, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    iget-object v5, p0, Lb23/k;->b:Lb23/j;

    iget-object p0, p0, Lb23/k;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[onNetworkError] error: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v3, p0, v6, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    invoke-virtual {v2}, Lqg3/d;->s()Ly43/b;

    move-result-object p0

    new-instance v2, Li53/m;

    invoke-direct {v2, v1, p1}, Li53/m;-><init>(Ln23/c;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    invoke-virtual {p0, v2, p2}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_d

    goto :goto_2

    :cond_d
    move-object p0, v0

    :goto_2
    if-ne p0, p1, :cond_9

    :goto_3
    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_e

    return-object p0

    :cond_e
    return-object v0

    :cond_f
    new-instance p2, Lf53/d;

    const/4 v1, 0x1

    invoke-direct {p2, p1, v1}, Lf53/d;-><init>(Lx43/m;I)V

    invoke-virtual {p0, p2}, Lh53/e;->c(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static final b(Lh53/e;Lv33/w;Ls83/c;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lh53/e;->m:Ljava/lang/Object;

    check-cast v0, Lqg3/d;

    instance-of v1, p2, Lh53/b;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lh53/b;

    iget v2, v1, Lh53/b;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lh53/b;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, Lh53/b;

    invoke-direct {v1, p0, p2}, Lh53/b;-><init>(Lh53/e;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lh53/b;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lh53/b;->E:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    iget-object p1, v1, Lh53/b;->x:Lv33/n;

    iget-object p0, v1, Lh53/b;->w:Lh53/e;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lv33/n;

    if-eqz p2, :cond_5

    move-object p2, p1

    check-cast p2, Lv33/n;

    iput-object p0, v1, Lh53/b;->w:Lh53/e;

    iput-object p2, v1, Lh53/b;->x:Lv33/n;

    iput v5, v1, Lh53/b;->E:I

    invoke-virtual {v0}, Lqg3/d;->r()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->z:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "[onConnected] client.id: \'"

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, "\'"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    invoke-interface {v3, v7, v6, v5, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {v0}, Lqg3/d;->s()Ly43/b;

    move-result-object v0

    new-instance v3, Li53/l;

    invoke-direct {v3, p2}, Li53/l;-><init>(Lv33/n;)V

    invoke-virtual {v0, v3, v1}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_4

    goto :goto_1

    :cond_4
    move-object p2, v4

    :goto_1
    if-ne p2, v2, :cond_6

    return-object v2

    :cond_5
    instance-of p2, p1, Lv33/v;

    if-eqz p2, :cond_6

    invoke-virtual {v0}, Lqg3/d;->s()Ly43/b;

    move-result-object p2

    iget-object p2, p2, Ly43/b;->d:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li53/j;

    instance-of p2, p2, Li53/a;

    if-eqz p2, :cond_6

    iget-object p2, p0, Lh53/e;->p:Ljava/lang/Object;

    check-cast p2, Lx43/h;

    invoke-virtual {p2}, Lx43/h;->a()V

    :cond_6
    :goto_2
    iget-object p0, p0, Lh53/e;->l:Ljava/lang/Object;

    check-cast p0, Ljava/util/LinkedHashSet;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx43/k;

    invoke-virtual {p2, p1}, Lx43/k;->h(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    return-object v4
.end method


# virtual methods
.method public c(Lkotlin/jvm/functions/Function1;)V
    .locals 8

    iget-object v0, p0, Lh53/e;->l:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashSet;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh53/e;->l:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashSet;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx43/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lt33/a;->a:Lbc3/w1;

    iget-object v4, p0, Lh53/e;->e:Ljava/lang/Object;

    check-cast v4, Lc53/a;

    new-instance v5, Lf53/b;

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct {v5, p1, v2, v7, v6}, Lf53/b;-><init>(Lkotlin/jvm/functions/Function1;Lx43/k;Lq83/d;I)V

    const/4 v2, 0x2

    invoke-static {v4, v3, v7, v5, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public d()Lb23/k;
    .locals 1

    iget-object v0, p0, Lh53/e;->j:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public e(Lv33/x;)Z
    .locals 5

    invoke-virtual {p0}, Lh53/e;->d()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[sendEvent] event: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lh53/e;->i:Ljava/lang/Object;

    check-cast v0, Lq/f;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lq/f;->C0(Lio/getstream/android/video/generated/models/VideoEvent;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
