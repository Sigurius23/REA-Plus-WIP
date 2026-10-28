.class public final Lio/sentry/android/replay/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/u3;


# static fields
.field public static final c:Ljava/lang/Object;

.field public static final d:Ljava/util/HashSet;


# instance fields
.field public a:Ljava/lang/String;

.field public final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ll83/i;->y:Ll83/i;

    sget-object v1, Lio/sentry/android/replay/a;->x:Lio/sentry/android/replay/a;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lio/sentry/android/replay/d;->c:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-string v1, "status_code"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "method"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "response_content_length"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "request_content_length"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "http.response_content_length"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "http.request_content_length"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sput-object v0, Lio/sentry/android/replay/d;->d:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Lio/sentry/q6;)V
    .locals 3

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/android/replay/b;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/replay/d;->b:Ljava/util/Map;

    new-instance v0, Lwe/o;

    invoke-virtual {p1}, Lio/sentry/q6;->getBeforeBreadcrumb()Lio/sentry/b6;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lwe/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    invoke-virtual {p1, v0}, Lio/sentry/q6;->setBeforeBreadcrumb(Lio/sentry/b6;)V

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/e;)Lio/sentry/rrweb/b;
    .locals 14

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, p1, Lio/sentry/e;->G:Ljava/lang/String;

    const-string v2, "http"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-wide v2, 0x408f400000000000L    # 1000.0

    const-string v4, "getData(...)"

    const/4 v5, 0x0

    if-eqz v1, :cond_14

    iget-object v0, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "url"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Ljava/lang/String;

    if-eqz v6, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_11

    :cond_1
    iget-object v0, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "http.start_timestamp"

    invoke-interface {v0, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2c

    iget-object v0, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "http.end_timestamp"

    invoke-interface {v0, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2c

    iget-object v0, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v5, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    new-instance v6, Lio/sentry/rrweb/l;

    invoke-direct {v6}, Lio/sentry/rrweb/l;-><init>()V

    invoke-virtual {p1}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    iput-wide v7, v6, Lio/sentry/rrweb/b;->x:J

    const-string v7, "resource.http"

    iput-object v7, v6, Lio/sentry/rrweb/l;->z:Ljava/lang/String;

    iget-object v7, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v7, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    iput-object v1, v6, Lio/sentry/rrweb/l;->E:Ljava/lang/String;

    instance-of v1, v0, Ljava/lang/Double;

    const-string v7, "null cannot be cast to non-null type kotlin.Long"

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    :goto_1
    div-double/2addr v0, v2

    goto :goto_2

    :cond_2
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    goto :goto_1

    :goto_2
    iput-wide v0, v6, Lio/sentry/rrweb/l;->F:D

    instance-of v0, v5, Ljava/lang/Double;

    if-eqz v0, :cond_3

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    :goto_3
    div-double/2addr v0, v2

    goto :goto_4

    :cond_3
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    goto :goto_3

    :goto_4
    iput-wide v0, v6, Lio/sentry/rrweb/l;->G:D

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, p0, Lio/sentry/android/replay/d;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/util/network/e;

    if-eqz v1, :cond_11

    iget-object v2, v1, Lio/sentry/util/network/e;->a:Ljava/lang/String;

    if-eqz v2, :cond_4

    const-string v3, "method"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v2, v1, Lio/sentry/util/network/e;->b:Ljava/lang/Integer;

    if-eqz v2, :cond_5

    const-string v3, "statusCode"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v2, v1, Lio/sentry/util/network/e;->c:Ljava/lang/Long;

    if-eqz v2, :cond_6

    const-string v3, "requestBodySize"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object v2, v1, Lio/sentry/util/network/e;->d:Ljava/lang/Long;

    if-eqz v2, :cond_7

    const-string v3, "responseBodySize"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v2, v1, Lio/sentry/util/network/e;->e:La3/p;

    const-string v3, "headers"

    const/16 v5, 0xa

    const-string v7, "warnings"

    const-string v8, "body"

    const-string v9, "size"

    if-eqz v2, :cond_c

    iget-object v10, v2, La3/p;->z:Ljava/lang/Object;

    check-cast v10, Ljava/util/LinkedHashMap;

    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v12, v2, La3/p;->x:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Long;

    if-eqz v12, :cond_8

    invoke-interface {v11, v9, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget-object v2, v2, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Lxl/a;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lxl/a;->r()Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v11, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lxl/a;->v()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_a

    check-cast v2, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lio/sentry/util/network/a;

    invoke-virtual {v13}, Lio/sentry/util/network/a;->getValue()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    invoke-interface {v11, v7, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    invoke-interface {v10}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_b

    invoke-interface {v11, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_c

    const-string v2, "request"

    invoke-interface {v0, v2, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    iget-object v1, v1, Lio/sentry/util/network/e;->f:La3/p;

    if-eqz v1, :cond_11

    iget-object v2, v1, La3/p;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashMap;

    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v11, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Long;

    if-eqz v11, :cond_d

    invoke-interface {v10, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    iget-object v1, v1, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Lxl/a;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lxl/a;->r()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v10, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lxl/a;->v()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_f

    check-cast v1, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/util/network/a;

    invoke-virtual {v5}, Lio/sentry/util/network/a;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_e
    invoke-interface {v10, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_10

    invoke-interface {v10, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    invoke-interface {v10}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11

    const-string v1, "response"

    invoke-interface {v0, v1, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    iget-object p1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_12
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lio/sentry/android/replay/d;->d:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v3, "body_size"

    const/4 v4, 0x0

    const-string v5, "content_length"

    invoke-static {v2, v5, v3, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    const-string v3, "."

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lio/sentry/android/replay/d;->c:Ljava/lang/Object;

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyb3/p;

    sget-object v4, Lio/sentry/android/replay/c;->x:Lio/sentry/android/replay/c;

    invoke-virtual {v3, v2, v4}, Lyb3/p;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_13
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    iput-object p1, v6, Lio/sentry/rrweb/l;->H:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v6

    :cond_14
    iget-object v1, p1, Lio/sentry/e;->E:Ljava/lang/String;

    const-string v6, "navigation"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v7, "state"

    if-eqz v1, :cond_15

    iget-object v1, p1, Lio/sentry/e;->G:Ljava/lang/String;

    const-string v8, "app.lifecycle"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "app."

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_8
    move-object v1, v5

    move-object v7, v1

    goto/16 :goto_10

    :cond_15
    iget-object v1, p1, Lio/sentry/e;->E:Ljava/lang/String;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    iget-object v1, p1, Lio/sentry/e;->G:Ljava/lang/String;

    const-string v8, "device.orientation"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    iget-object v6, p1, Lio/sentry/e;->G:Ljava/lang/String;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v4, "position"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v7, "landscape"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    const-string v7, "portrait"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2c

    :cond_16
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_17
    iget-object v1, p1, Lio/sentry/e;->E:Ljava/lang/String;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v7, "resumed"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v7, "to"

    if-eqz v1, :cond_1a

    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v4, "screen"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Ljava/lang/String;

    if-eqz v4, :cond_18

    check-cast v1, Ljava/lang/String;

    goto :goto_9

    :cond_18
    move-object v1, v5

    :goto_9
    if-eqz v1, :cond_19

    const/16 v4, 0x2e

    invoke-static {v4, v1, v1}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_a

    :cond_19
    move-object v1, v5

    goto :goto_a

    :cond_1a
    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Ljava/lang/String;

    if-eqz v4, :cond_19

    check-cast v1, Ljava/lang/String;

    :goto_a
    if-nez v1, :cond_1b

    goto/16 :goto_11

    :cond_1b
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    :cond_1c
    iget-object v1, p1, Lio/sentry/e;->G:Ljava/lang/String;

    const-string v6, "ui.click"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v6, "view.id"

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1d

    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v6, "view.tag"

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1d

    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v6, "view.class"

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :cond_1d
    instance-of v6, v1, Ljava/lang/String;

    if-eqz v6, :cond_1e

    check-cast v1, Ljava/lang/String;

    goto :goto_b

    :cond_1e
    move-object v1, v5

    :goto_b
    if-nez v1, :cond_1f

    goto/16 :goto_11

    :cond_1f
    iget-object v6, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v6}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const-string v6, "ui.tap"

    move-object v7, v5

    goto/16 :goto_10

    :cond_20
    iget-object v1, p1, Lio/sentry/e;->E:Ljava/lang/String;

    const-string v6, "system"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v6, "action"

    if-eqz v1, :cond_26

    iget-object v1, p1, Lio/sentry/e;->G:Ljava/lang/String;

    const-string v8, "network.event"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v6, "NETWORK_LOST"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_21

    const-string v1, "offline"

    goto :goto_d

    :cond_21
    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "network_type"

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v6, v1, Ljava/lang/String;

    if-eqz v6, :cond_22

    check-cast v1, Ljava/lang/String;

    goto :goto_c

    :cond_22
    move-object v1, v5

    :goto_c
    if-eqz v1, :cond_2c

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_23

    goto/16 :goto_11

    :cond_23
    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_d
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/sentry/android/replay/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_24

    goto/16 :goto_11

    :cond_24
    invoke-virtual {v0, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Ljava/lang/String;

    if-eqz v4, :cond_25

    check-cast v1, Ljava/lang/String;

    goto :goto_e

    :cond_25
    move-object v1, v5

    :goto_e
    iput-object v1, p0, Lio/sentry/android/replay/d;->a:Ljava/lang/String;

    const-string v6, "device.connectivity"

    goto/16 :goto_8

    :cond_26
    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v6, "BATTERY_CHANGED"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2a

    iget-object v1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_27
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_29

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "level"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_28

    const-string v8, "charging"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_27

    :cond_28
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v7, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    :cond_29
    invoke-interface {v0, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const-string v6, "device.battery"

    goto/16 :goto_8

    :cond_2a
    iget-object v6, p1, Lio/sentry/e;->G:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/e;->z:Ljava/lang/String;

    iget-object v7, p1, Lio/sentry/e;->I:Lio/sentry/n5;

    iget-object v8, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v8}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :goto_10
    if-eqz v6, :cond_2c

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_2b

    goto :goto_11

    :cond_2b
    new-instance v4, Lio/sentry/rrweb/a;

    invoke-direct {v4}, Lio/sentry/rrweb/a;-><init>()V

    invoke-virtual {p1}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    iput-wide v8, v4, Lio/sentry/rrweb/b;->x:J

    invoke-virtual {p1}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    long-to-double v8, v8

    div-double/2addr v8, v2

    iput-wide v8, v4, Lio/sentry/rrweb/a;->z:D

    const-string p1, "default"

    iput-object p1, v4, Lio/sentry/rrweb/a;->E:Ljava/lang/String;

    iput-object v6, v4, Lio/sentry/rrweb/a;->F:Ljava/lang/String;

    iput-object v1, v4, Lio/sentry/rrweb/a;->G:Ljava/lang/String;

    iput-object v7, v4, Lio/sentry/rrweb/a;->H:Lio/sentry/n5;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    iput-object p1, v4, Lio/sentry/rrweb/a;->I:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v4

    :cond_2c
    :goto_11
    return-object v5
.end method
