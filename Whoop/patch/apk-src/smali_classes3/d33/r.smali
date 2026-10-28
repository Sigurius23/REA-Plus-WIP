.class public final Ld33/r;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld33/h1;


# direct methods
.method public synthetic constructor <init>(Ld33/h1;I)V
    .locals 0

    iput p2, p0, Ld33/r;->w:I

    iput-object p1, p0, Ld33/r;->x:Ld33/h1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ld33/r;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x3

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    iget-object v0, v0, Ld33/h1;->h:Lt23/b4;

    iget-object v0, v0, Lt23/b4;->E:Ly33/c;

    iget-object v0, v0, Ly33/c;->h:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz33/b;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object v3

    iget-object v4, v0, Ld33/h1;->b:Lt23/c0;

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    sget-object v6, Lb23/g;->y:Lb23/g;

    iget-object v7, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-object v5, v4, Lt23/c0;->p:Lt23/s0;

    iget-object v5, v5, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "[createPublisher] rejoin attempt, connection state: "

    invoke-static {v5, v8}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v6, v7, v5, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v3, v4, Lt23/c0;->p:Lt23/s0;

    iget-object v3, v3, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lt23/o2;

    if-nez v3, :cond_1

    iget-object v3, v4, Lt23/c0;->n:Lhc3/d;

    new-instance v4, Ld33/m;

    const/4 v5, 0x6

    invoke-direct {v4, v0, v1, v5}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    invoke-static {v3, v1, v1, v4, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->z:Lb23/g;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v5, "[cleanup] #sfu; #track; no args"

    invoke-interface {v3, v4, v0, v5, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    iget-object v3, v0, Ld33/h1;->j:Lbc3/c0;

    new-instance v4, Ld33/m;

    invoke-direct {v4, v0, v1, v2}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    invoke-static {v3, v1, v1, v4, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    iget-object v0, v0, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le33/v0;

    if-eqz v0, :cond_3

    iget-object v3, v0, Le33/v0;->K:Ln53/x1;

    invoke-virtual {v3}, Ln53/x1;->b()V

    iget-object v3, v0, Le33/v0;->J:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v3, v0, Le33/v0;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, v0, Le33/v0;->G:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    :cond_3
    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    :try_start_0
    iget-object v3, v0, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le33/v0;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Le33/u;->b()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_4
    :goto_0
    iget-object v0, v0, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le33/n;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Le33/n;->p()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    const-string v5, "SafeCall"

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    const-string v7, "Exception occurred: "

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v4, v5, v6, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    iget-object v0, v0, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    iget-object v0, v0, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    iget-object v0, v0, Ld33/h1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v3, p0, Ld33/r;->x:Ld33/h1;

    iget-object v4, v0, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->E:Lb23/g;

    iget-object v6, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    iget-object v3, v3, Ld33/h1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v3

    const-string v6, "[cleanup] #orphaned-track; Clearing "

    const-string v7, " orphaned tracks that were never reconciled"

    invoke-static {v3, v6, v7}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v5, v0, v3, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    iget-object v0, v0, Ld33/h1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    :cond_7
    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    iget-object v3, v0, Ld33/h1;->j:Lbc3/c0;

    new-instance v4, Ld33/m;

    const/4 v5, 0x4

    invoke-direct {v4, v0, v1, v5}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    invoke-static {v3, v1, v1, v4, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    iget-object v0, v0, Ld33/h1;->H:Lhc3/d;

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    iget-object v0, v0, Ld33/h1;->i:Lbc3/u;

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ld33/r;->x:Ld33/h1;

    iget-object v0, v0, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->h()Lt23/x1;

    move-result-object v0

    iget-object v0, v0, Lt23/x1;->f:Lt23/a2;

    iget-object v0, v0, Lt23/a2;->l:Ln53/e;

    iget-object v0, v0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lkotlin/jvm/internal/m;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
