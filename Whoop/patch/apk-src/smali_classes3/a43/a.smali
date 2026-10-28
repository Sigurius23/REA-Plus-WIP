.class public final La43/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La43/b;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lio/sentry/internal/debugmeta/c;


# direct methods
.method public constructor <init>(Ljava/util/List;Lio/sentry/internal/debugmeta/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La43/a;->a:Ljava/util/List;

    iput-object p2, p0, La43/a;->b:Lio/sentry/internal/debugmeta/c;

    return-void
.end method


# virtual methods
.method public final a(La1/h;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, p0, La43/a;->a:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_7

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx43/a;

    iget v5, v2, Lx43/a;->a:I

    const/4 v6, 0x0

    packed-switch v5, :pswitch_data_0

    iget-object v2, v2, Lx43/a;->b:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg53/m;

    instance-of v5, v2, Lg53/c;

    if-nez v5, :cond_3

    instance-of v5, v2, Lg53/d;

    if-nez v5, :cond_3

    instance-of v2, v2, Lg53/g;

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v2, v6

    goto/16 :goto_6

    :cond_3
    :goto_0
    move v2, v4

    goto/16 :goto_6

    :pswitch_0
    iget-object v2, v2, Lx43/a;->b:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/j3;

    if-eqz v2, :cond_3

    check-cast v2, Lt23/b4;

    iget-object v2, v2, Lt23/b4;->U:Lt23/g1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "[hasActiveOrRingingCall] active: "

    :try_start_0
    iget-object v7, v2, Lt23/g1;->f:Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_4

    move v7, v4

    goto :goto_1

    :cond_4
    move v7, v6

    :goto_1
    iget-object v8, v2, Lt23/g1;->e:Lec3/h2;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_5

    move v8, v4

    goto :goto_2

    :cond_5
    move v8, v6

    :goto_2
    if-nez v7, :cond_7

    if-eqz v8, :cond_6

    goto :goto_3

    :cond_6
    move v9, v6

    goto :goto_4

    :cond_7
    :goto_3
    move v9, v4

    :goto_4
    invoke-virtual {v2}, Lt23/g1;->a()Lb23/k;

    move-result-object v2

    iget-object v10, v2, Lb23/k;->c:Lb23/e;

    sget-object v11, Lb23/g;->y:Lb23/g;

    iget-object v12, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v10, v11, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    iget-object v10, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ", ringing: "

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v10, v11, v2, v5, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v2

    sget-object v5, Lb23/i;->a:Lb23/i;

    sget-object v5, Lb23/i;->d:Lb23/e;

    sget-object v7, Lb23/g;->F:Lb23/g;

    const-string v8, "SafeCall"

    invoke-interface {v5, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    sget-object v5, Lb23/i;->c:Lb23/j;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v9

    const-string v10, "Exception occurred: "

    invoke-static {v10, v9}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v5, v7, v8, v9, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    move v9, v6

    :cond_9
    :goto_5
    if-nez v9, :cond_2

    goto/16 :goto_0

    :goto_6
    if-nez v2, :cond_1

    move v4, v6

    :cond_a
    :goto_7
    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    const-string v5, "Video:LifecycleHandler"

    invoke-interface {v1, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v6, "[stopped] shouldDisconnect: "

    invoke-static {v6, v4}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v2, v5, v6, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    if-eqz v4, :cond_e

    iget-object v1, p0, La43/a;->b:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v1}, Lio/sentry/internal/debugmeta/c;->t()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->z:Lb23/g;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    iget-object v4, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    const-string v6, "[onStop] no args"

    invoke-interface {v4, v5, v2, v6, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    invoke-virtual {v1}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object v1

    sget-object v2, Lg53/u;->a:Lg53/u;

    invoke-virtual {v1, v2, p1}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_d

    goto :goto_8

    :cond_d
    move-object p1, v0

    :goto_8
    if-ne p1, v1, :cond_e

    return-object p1

    :cond_e
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Le;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, p0, La43/a;->a:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx43/a;

    iget v4, v2, Lx43/a;->a:I

    const/4 v5, 0x0

    packed-switch v4, :pswitch_data_0

    iget-object v2, v2, Lx43/a;->b:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg53/m;

    instance-of v4, v2, Lg53/f;

    if-nez v4, :cond_3

    instance-of v4, v2, Lg53/g;

    if-nez v4, :cond_3

    instance-of v4, v2, Lg53/h;

    if-nez v4, :cond_3

    instance-of v4, v2, Lg53/e;

    if-nez v4, :cond_3

    instance-of v2, v2, Lg53/i;

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v2, v5

    goto :goto_1

    :cond_3
    :goto_0
    :pswitch_0
    move v2, v3

    :goto_1
    if-nez v2, :cond_1

    move v3, v5

    :cond_4
    :goto_2
    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    const-string v4, "Video:LifecycleHandler"

    invoke-interface {v1, v2, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v5, 0x0

    if-eqz v1, :cond_5

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v6, "[resume] shouldConnect: "

    invoke-static {v6, v3}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v2, v4, v6, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    if-eqz v3, :cond_8

    iget-object v1, p0, La43/a;->b:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v1}, Lio/sentry/internal/debugmeta/c;->t()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->x:Lb23/g;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    const-string v6, "[onResume] no args"

    invoke-interface {v3, v4, v2, v6, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    invoke-virtual {v1}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object v1

    sget-object v2, Lg53/t;->a:Lg53/t;

    invoke-virtual {v1, v2, p1}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    move-object p1, v0

    :goto_3
    if-ne p1, v1, :cond_8

    return-object p1

    :cond_8
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
