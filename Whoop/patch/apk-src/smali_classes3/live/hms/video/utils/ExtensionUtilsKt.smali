.class public final Llive/hms/video/utils/ExtensionUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0000*\u00028\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00028\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a-\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u0008j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t`\n*\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000e*\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u008e\u0001\u0010!\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00112\u001c\u0010\u0014\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00122*\u0010\u0019\u001a&\u0008\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0012\u0012\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u0013\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00152\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0008\u0008\u0002\u0010 \u001a\u00020\u001fH\u0080@\u00a2\u0006\u0004\u0008!\u0010\"\u001a\u001b\u0010\'\u001a\u00020&*\u00020#2\u0008\u0010%\u001a\u0004\u0018\u00010$\u00a2\u0006\u0004\u0008\'\u0010(\u001a/\u0010+\u001a\u00020&\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u001c\u001a\u00020\u00012\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00000)H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010,\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006-"
    }
    d2 = {
        "T",
        "",
        "toJson",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "Lcom/google/gson/JsonObject;",
        "toJsonObject",
        "(Ljava/lang/Object;)Lcom/google/gson/JsonObject;",
        "Lorg/json/JSONObject;",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/collections/HashMap;",
        "toMap",
        "(Lorg/json/JSONObject;)Ljava/util/HashMap;",
        "Lorg/json/JSONArray;",
        "",
        "toList",
        "(Lorg/json/JSONArray;)Ljava/util/List;",
        "R",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "task",
        "Lkotlin/Function2;",
        "Llive/hms/video/transport/models/TransportFailureCategory;",
        "Lbc3/s;",
        "",
        "dependencyCheck",
        "tfcDependency",
        "Llive/hms/video/sdk/models/EVENT_TYPE;",
        "name",
        "Llive/hms/video/sdk/models/IRetryAttemptTracking;",
        "retryAttemptTracking",
        "",
        "maxRetryCount",
        "withRetry",
        "(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;)Ljava/lang/Object;",
        "Landroid/content/Context;",
        "Landroid/content/BroadcastReceiver;",
        "receiver",
        "Ll83/a0;",
        "safeUnregisterReceiver",
        "(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V",
        "Lkotlin/Function0;",
        "block",
        "traceTime",
        "(Ljava/lang/String;Lc93/a;)V",
        "lib_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final safeUnregisterReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static final toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    sget-object v0, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {v0}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toJson(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final toJsonObject(Ljava/lang/Object;)Lcom/google/gson/JsonObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/google/gson/JsonObject;"
        }
    .end annotation

    sget-object v0, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {v0}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object p0

    const-string v0, "getAsJsonObject(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final toList(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "get(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v4, v3, Lorg/json/JSONArray;

    if-eqz v4, :cond_0

    check-cast v3, Lorg/json/JSONArray;

    invoke-static {v3}, Llive/hms/video/utils/ExtensionUtilsKt;->toList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :cond_0
    instance-of v4, v3, Lorg/json/JSONObject;

    if-eqz v4, :cond_1

    check-cast v3, Lorg/json/JSONObject;

    invoke-static {v3}, Llive/hms/video/utils/ExtensionUtilsKt;->toMap(Lorg/json/JSONObject;)Ljava/util/HashMap;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static final toMap(Lorg/json/JSONObject;)Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "keys(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "get(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v4, v3, Lorg/json/JSONArray;

    if-eqz v4, :cond_0

    check-cast v3, Lorg/json/JSONArray;

    invoke-static {v3}, Llive/hms/video/utils/ExtensionUtilsKt;->toList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :cond_0
    instance-of v4, v3, Lorg/json/JSONObject;

    if-eqz v4, :cond_1

    check-cast v3, Lorg/json/JSONObject;

    invoke-static {v3}, Llive/hms/video/utils/ExtensionUtilsKt;->toMap(Lorg/json/JSONObject;)Ljava/util/HashMap;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static final traceTime(Ljava/lang/String;Lc93/a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-string p1, " Time taken (:"

    const-string v4, "): "

    invoke-static {p1, p0, v4}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    sub-long/2addr v2, v0

    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "ms thread name "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Profiling"

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static final withRetry(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/m;",
            "Llive/hms/video/transport/models/TransportFailureCategory;",
            "Llive/hms/video/sdk/models/EVENT_TYPE;",
            "Llive/hms/video/sdk/models/IRetryAttemptTracking;",
            "I",
            "Lq83/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p6, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$1;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$1;

    iget v1, v0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$1;

    invoke-direct {v0, p6}, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$1;-><init>(Lq83/d;)V

    :goto_0
    iget-object p6, v0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p6, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;

    invoke-direct {p6, p2, p1, p0, v4}, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;-><init>(Llive/hms/video/transport/models/TransportFailureCategory;Lc93/m;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    new-instance p0, Lec3/s1;

    invoke-direct {p0, p6}, Lec3/s1;-><init>(Lc93/m;)V

    sget-object p1, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    invoke-virtual {p1}, Llive/hms/video/utils/HMSCoroutineScope;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p0, p1}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    new-instance p1, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;

    invoke-direct {p1, p5, p4, p3, v4}, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;-><init>(ILlive/hms/video/sdk/models/IRetryAttemptTracking;Llive/hms/video/sdk/models/EVENT_TYPE;Lq83/d;)V

    new-instance p2, Lec3/a0;

    invoke-direct {p2, p0, p1}, Lec3/a0;-><init>(Lec3/l;Lc93/n;)V

    iput v3, v0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$1;->label:I

    invoke-static {p2, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p6, v1, :cond_3

    return-object v1

    :goto_1
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p6

    :cond_3
    :goto_2
    instance-of p0, p6, Ll83/m;

    if-nez p0, :cond_6

    if-eqz p0, :cond_4

    move-object p1, v4

    goto :goto_3

    :cond_4
    move-object p1, p6

    :goto_3
    if-eqz p1, :cond_6

    if-eqz p0, :cond_5

    goto :goto_4

    :cond_5
    move-object v4, p6

    :goto_4
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v4

    :cond_6
    invoke-static {p6}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    instance-of p0, p0, Llive/hms/video/error/HMSException;

    if-nez p0, :cond_a

    sget-object v0, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v1, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    invoke-static {p6}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_7

    goto :goto_6

    :cond_7
    :goto_5
    move-object v2, p0

    goto :goto_7

    :cond_8
    :goto_6
    const-string p0, "with retry caused an error"

    goto :goto_5

    :goto_7
    invoke-static {p6}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_9

    new-instance p0, Ljava/lang/UnknownError;

    invoke-direct {p0}, Ljava/lang/UnknownError;-><init>()V

    :cond_9
    move-object v3, p0

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p0

    throw p0

    :cond_a
    invoke-static {p6}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    throw p0
.end method

.method public static synthetic withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    sget-object p2, Llive/hms/video/transport/models/TransportFailureCategory;->SignalDisconnect:Llive/hms/video/transport/models/TransportFailureCategory;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x8

    const/4 p8, 0x0

    if-eqz p2, :cond_1

    move-object v3, p8

    goto :goto_0

    :cond_1
    move-object v3, p3

    :goto_0
    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_2

    move-object v4, p8

    goto :goto_1

    :cond_2
    move-object v4, p4

    :goto_1
    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_3

    const/4 p5, 0x2

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move v5, p5

    move-object v6, p6

    invoke-static/range {v0 .. v6}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
