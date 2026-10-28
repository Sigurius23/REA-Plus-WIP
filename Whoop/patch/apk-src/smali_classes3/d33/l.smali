.class public final Ld33/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld33/h1;


# direct methods
.method public synthetic constructor <init>(Ld33/h1;I)V
    .locals 0

    iput p2, p0, Ld33/l;->w:I

    iput-object p1, p0, Ld33/l;->x:Ld33/h1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 10

    iget p2, p0, Ld33/l;->w:I

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    check-cast p1, Lv33/w;

    iget-object p2, p0, Ld33/l;->x:Ld33/h1;

    :try_start_0
    instance-of v0, p1, Lv33/e;

    if-eqz v0, :cond_0

    iget-object v0, p2, Ld33/h1;->n:Ll53/m;

    sget-object v1, Ll53/a;->x:[Ll53/a;

    const-string v1, "changePublishQuality"

    iget-object p2, p2, Ld33/h1;->v:Ld1/j;

    move-object v2, p1

    check-cast v2, Lv33/e;

    iget-object v2, v2, Lv33/e;->a:Lstream/video/sfu/event/ChangePublishQuality;

    invoke-virtual {p2, v2}, Ld1/j;->G(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2, v1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1

    :catch_0
    move-exception v0

    move-object p2, v0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lv33/d;

    if-eqz v0, :cond_1

    iget-object v0, p2, Ld33/h1;->n:Ll53/m;

    sget-object v1, Ll53/a;->x:[Ll53/a;

    const-string v1, "changePublishOptions"

    iget-object p2, p2, Ld33/h1;->v:Ld1/j;

    move-object v2, p1

    check-cast v2, Lv33/d;

    iget-object v2, v2, Lv33/d;->a:Lstream/video/sfu/event/ChangePublishOptions;

    invoke-virtual {v2}, Lstream/video/sfu/event/ChangePublishOptions;->getPublish_options()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p2, v2}, Ld1/j;->G(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2, v1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lv33/i;

    if-eqz v0, :cond_2

    iget-object v0, p2, Ld33/h1;->n:Ll53/m;

    sget-object v1, Ll53/a;->x:[Ll53/a;

    const-string v1, "goAway"

    iget-object p2, p2, Ld33/h1;->v:Ld1/j;

    invoke-virtual {p2, p1}, Ld1/j;->G(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2, v1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lv33/b;

    if-eqz v0, :cond_3

    iget-object v0, p2, Ld33/h1;->n:Ll53/m;

    sget-object v1, Ll53/a;->x:[Ll53/a;

    const-string v1, "callEnded"

    iget-object p2, p2, Ld33/h1;->v:Ld1/j;

    invoke-virtual {p2, p1}, Ld1/j;->G(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2, v1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    instance-of v0, p1, Lv33/h;

    if-eqz v0, :cond_4

    iget-object v0, p2, Ld33/h1;->n:Ll53/m;

    sget-object v1, Ll53/a;->x:[Ll53/a;

    const-string v1, "error"

    iget-object p2, p2, Ld33/h1;->v:Ld1/j;

    invoke-virtual {p2, p1}, Ld1/j;->G(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2, v1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    const-string v0, "SafeCall"

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Exception occurred: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v0, v3, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    iget-object p2, p0, Ld33/l;->x:Ld33/h1;

    iget-object v0, p2, Ld33/h1;->h:Lt23/b4;

    iget-object p2, p2, Ld33/h1;->b:Lt23/c0;

    iget-object p2, p2, Lt23/c0;->v:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lt23/b4;->o(Lio/getstream/android/video/generated/models/VideoEvent;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Li53/j;

    iget-object v1, p0, Ld33/l;->x:Ld33/h1;

    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object p2

    iget-object v0, v1, Ld33/h1;->R:Ljava/util/List;

    iget-object v2, v1, Ld33/h1;->g:Ljava/lang/String;

    iget-object v3, v1, Ld33/h1;->b:Lt23/c0;

    iget-object v4, p2, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v6, p2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    move v7, v4

    const/4 v4, 0x0

    if-eqz v7, :cond_5

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    iget-object v7, v3, Lt23/c0;->p:Lt23/s0;

    iget-object v7, v7, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "[stateJob] SFU socket: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " | connection: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " ("

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ")"

    invoke-static {v2, v7, v8}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p2, v5, v6, v7, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object p2, v1, Ld33/h1;->D:Lec3/h2;

    invoke-virtual {p2, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    instance-of p2, p1, Li53/a;

    const/4 v6, 0x3

    if-eqz p2, :cond_8

    iget-object p1, v3, Lt23/c0;->p:Lt23/s0;

    iget-object p1, p1, Lt23/s0;->g:Lec3/h2;

    sget-object p2, Lt23/h2;->a:Lt23/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v4, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, v3, Lt23/c0;->F:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    iget-object p1, v1, Ld33/h1;->G:Lbc3/c2;

    const/4 p2, 0x1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lbc3/t1;->isActive()Z

    move-result p1

    if-ne p1, p2, :cond_6

    goto :goto_2

    :cond_6
    iget-object p1, v1, Ld33/h1;->j:Lbc3/c0;

    new-instance v2, Ld33/d1;

    invoke-direct {v2, v1, v4}, Ld33/d1;-><init>(Ld33/h1;Lq83/d;)V

    invoke-static {p1, v4, v4, v2, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v1, Ld33/h1;->G:Lbc3/c2;

    :goto_2
    move-object p1, v0

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0}, Ljava/util/List;->clear()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/k;

    iget-object v2, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Lio/getstream/video/android/core/model/IceCandidate;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lc43/v;

    invoke-static {v1, v2, v0}, Ld33/h1;->f(Ld33/h1;Lio/getstream/video/android/core/model/IceCandidate;Lc43/v;)V

    goto :goto_3

    :cond_7
    iget-object p1, v3, Lt23/c0;->K:Lv23/a;

    iget-object p1, p1, Lv23/a;->c:Lb30/m;

    const/4 v0, 0x0

    invoke-virtual {p1, v4, v0, v4, p2}, Lb30/m;->G(Ljava/lang/String;ILjava/lang/String;Z)V

    goto/16 :goto_4

    :cond_8
    instance-of p2, p1, Li53/b;

    if-eqz p2, :cond_9

    iget-object p1, v3, Lt23/c0;->p:Lt23/s0;

    iget-object p1, p1, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt23/q2;

    instance-of p2, p1, Lt23/o2;

    if-nez p2, :cond_d

    instance-of p1, p1, Lt23/m2;

    if-nez p1, :cond_d

    iget-object p1, v3, Lt23/c0;->p:Lt23/s0;

    iget-object p1, p1, Lt23/s0;->g:Lec3/h2;

    sget-object p2, Lt23/k2;->a:Lt23/k2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v4, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_4

    :cond_9
    instance-of p2, p1, Li53/e;

    if-eqz p2, :cond_b

    check-cast p1, Li53/e;

    move-object p2, v2

    iget-object v2, p1, Li53/e;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object p1, p1, Li53/e;->a:Ln23/c;

    iget-object p1, p1, Ln23/c;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "SFU:"

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v5, v0, Lb23/k;->c:Lb23/e;

    iget-object v7, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v5, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v9, "[stateJob] SFU sent "

    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " for "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, v8, v7, p2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    iget-object p2, v3, Lt23/c0;->n:Lhc3/d;

    new-instance v0, La1/h;

    const/16 v5, 0xd

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p2, v4, v4, v0, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_4

    :cond_b
    move-object p2, v2

    instance-of p1, p1, Li53/h;

    if-eqz p1, :cond_d

    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->E:Lb23/g;

    invoke-interface {v0, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[stateJob] HealthMonitor detected event loss for "

    const-string v7, " \u2014 triggering reconnect"

    invoke-static {v0, p2, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v5, v2, p2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    iget-object p1, v3, Lt23/c0;->n:Lhc3/d;

    new-instance p2, Ld33/m;

    const/16 v0, 0xb

    invoke-direct {p2, v1, v4, v0}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    invoke-static {p1, v4, v4, p2, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_d
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/util/List;

    iget-object p2, p0, Ld33/l;->x:Ld33/h1;

    iget-object p2, p2, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le33/v0;

    if-eqz p2, :cond_13

    check-cast p1, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_e

    move v1, v2

    :cond_e
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/g2;

    iget-object v3, v1, Lt23/g2;->f:Ljava/lang/String;

    iget-object v1, v1, Lt23/g2;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_f
    const-string p1, "[setTrackLookupPrefixes] #sfu; #track; lookupPrefixes: "

    iget-object v1, p2, Le33/v0;->N:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_1
    invoke-virtual {p2}, Le33/u;->f()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_10

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v4, v5, v3, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_a

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_8

    :cond_10
    :goto_6
    iget-object p1, p2, Le33/v0;->L:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object p1, p2, Le33/v0;->L:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    iget-object p1, p2, Le33/v0;->N:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_12

    iget-object p1, p2, Le33/v0;->N:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/MediaStream;

    invoke-virtual {p2, v0}, Le33/v0;->o(Lorg/webrtc/MediaStream;)V

    goto :goto_7

    :cond_11
    iget-object p1, p2, Le33/v0;->N:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_9

    :goto_8
    :try_start_2
    const-string p2, "SafeCall"

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v2, p2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    sget-object v0, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception occurred: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, p2, v3, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_12
    :goto_9
    monitor-exit v1

    goto :goto_b

    :goto_a
    monitor-exit v1

    throw p1

    :cond_13
    :goto_b
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Le33/m0;

    const-string p2, ", trackType="

    iget-object v1, p1, Le33/m0;->a:Ljava/lang/String;

    iget-object p1, p1, Le33/m0;->b:Lstream/video/sfu/models/TrackType;

    iget-object v2, p0, Ld33/l;->x:Ld33/h1;

    invoke-virtual {v2}, Ld33/h1;->s()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->z:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_14

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "[removedStreams] #sfu; #track; #orphaned-track; Cleaning up orphaned tracks for sessionId="

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v5, v6, v4, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_14
    invoke-virtual {p1}, Lstream/video/sfu/models/TrackType;->getValue()I

    move-result v3

    const-string v4, ":"

    invoke-static {v3, v1, v4}, Lm4/a;->f(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v2, Ld33/h1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld33/s;

    if-eqz v3, :cond_15

    invoke-virtual {v2}, Ld33/h1;->s()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_15

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "[cleanupOrphanedTracksForSessionAndType] #orphaned-track; Removed orphaned track for sessionId="

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " due to stream removal, remaining orphaned="

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v5, v6, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_15
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Le33/l0;

    iget-object p2, p1, Le33/l0;->a:Ljava/lang/String;

    iget-object v1, p1, Le33/l0;->b:Lstream/video/sfu/models/TrackType;

    iget-object p1, p1, Le33/l0;->c:Lc43/g;

    iget-object v2, p0, Ld33/l;->x:Ld33/h1;

    invoke-virtual {v2}, Ld33/h1;->s()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_16

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "[streams] #sfu; #track; sessionId: "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", trackType: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", mediaStream: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v5, v6, v4, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_16
    invoke-virtual {v2, p2, v1, p1}, Ld33/h1;->G(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lc43/g;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
