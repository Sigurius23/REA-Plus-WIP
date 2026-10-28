.class public final Lcom/iterable/iterableapi/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iterable/iterableapi/f;


# instance fields
.field public w:Lcom/iterable/iterableapi/k;

.field public x:Lwe/o;


# virtual methods
.method public final a()V
    .locals 11

    iget-object v0, p0, Lcom/iterable/iterableapi/c0;->x:Lwe/o;

    iget-object v1, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/d0;

    iget-object v1, v1, Lcom/iterable/iterableapi/d0;->a:Ljava/util/Date;

    if-eqz v1, :cond_6

    iget-object v1, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_4

    iget-object v1, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/d0;

    iget-object v1, v1, Lcom/iterable/iterableapi/d0;->a:Ljava/util/Date;

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v5, Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_3

    const-string v5, "toString(...)"

    invoke-static {v5}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v6}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_2

    iget-object v6, v6, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-virtual {v6, v7}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    const-string v9, "id"

    invoke-virtual {v8, v9, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "start"

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v9

    invoke-virtual {v8, v5, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "end"

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v9

    invoke-virtual {v8, v1, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "session"

    invoke-virtual {v7, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    const-string v2, "impressions"

    invoke-virtual {v7, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "deviceInfo"

    invoke-virtual {v6}, Lcom/google/crypto/tink/internal/l0;->O()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v7, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "embedded-messaging/events/session"

    invoke-virtual {v6, v1, v7}, Lcom/google/crypto/tink/internal/l0;->f0(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lr;->t(Ljava/lang/Object;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    throw v3

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_1

    :cond_2
    const-string v1, "trackEmbeddedSession: sessionStartTime and sessionEndTime must be set"

    const-string v2, "IterableApi"

    invoke-static {v2, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    new-instance v1, Lcom/iterable/iterableapi/d0;

    invoke-direct {v1, v3}, Lcom/iterable/iterableapi/d0;-><init>(Ljava/util/Date;)V

    iput-object v1, v0, Lwe/o;->x:Ljava/lang/Object;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, v0, Lwe/o;->w:Ljava/lang/Object;

    return-void

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lr;->t(Ljava/lang/Object;)V

    throw v3

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lr;->t(Ljava/lang/Object;)V

    throw v3

    :cond_5
    return-void

    :cond_6
    const-string v0, "EmbeddedSessionManager"

    const-string v1, "Embedded session ended without start"

    invoke-static {v0, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b()V
    .locals 3

    invoke-static {}, Ldt/b;->F()V

    iget-object v0, p0, Lcom/iterable/iterableapi/c0;->x:Lwe/o;

    iget-object v1, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/d0;

    iget-object v1, v1, Lcom/iterable/iterableapi/d0;->a:Ljava/util/Date;

    if-eqz v1, :cond_0

    const-string v0, "EmbeddedSessionManager"

    const-string v1, "Embedded session started twice"

    invoke-static {v0, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/iterable/iterableapi/d0;

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-direct {v1, v2}, Lcom/iterable/iterableapi/d0;-><init>(Ljava/util/Date;)V

    iput-object v1, v0, Lwe/o;->x:Ljava/lang/Object;

    :goto_0
    const-string v0, "IterableEmbeddedManager"

    const-string v1, "Calling start session"

    invoke-static {v0, v1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/c0;->w:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
