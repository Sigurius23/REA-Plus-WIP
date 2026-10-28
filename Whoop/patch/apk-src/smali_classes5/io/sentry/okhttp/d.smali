.class public final Lio/sentry/okhttp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# instance fields
.field public final w:Lio/sentry/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v0

    const-string v1, "maven:io.sentry:sentry-okhttp"

    const-string v2, "8.41.0"

    invoke-virtual {v0, v1, v2}, Lio/sentry/l5;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    new-instance v0, Lio/sentry/l0;

    const/16 v1, 0x1f4

    const/16 v2, 0x257

    invoke-direct {v0, v1, v2}, Lio/sentry/l0;-><init>(II)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    const-string v0, ".*"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lio/sentry/i4;->a:Lio/sentry/i4;

    iput-object v0, p0, Lio/sentry/okhttp/d;->w:Lio/sentry/d1;

    const-string v0, "OkHttp"

    invoke-static {v0}, Ljc/x;->i(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Lio/sentry/okhttp/d;Lud3/x0;)Lxl/a;
    .locals 7

    const-string v0, "resp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/sentry/okhttp/d;->w:Lio/sentry/d1;

    invoke-interface {p0}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object p0

    invoke-virtual {p0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p0

    const-string v0, "getLogger(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lud3/x0;->G:Lud3/a1;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {v0}, Lud3/a1;->k()Lud3/h0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, v0, Lud3/h0;->a:Ljava/lang/String;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    move-object v2, v1

    :goto_0
    const v3, 0x25800

    int-to-long v3, v3

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    invoke-virtual {p1, v3, v4}, Lud3/x0;->i(J)Lud3/z0;

    move-result-object p1

    invoke-virtual {p1}, Lud3/a1;->h()[B

    move-result-object p1

    if-eqz v0, :cond_1

    sget-object v3, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v3}, Lud3/h0;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_2

    const-string v0, "UTF-8"

    :cond_2
    invoke-static {p1, v2, v0, p0}, Ls2/e;->t([BLjava/lang/String;Ljava/lang/String;Lio/sentry/v0;)Lxl/a;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :goto_2
    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to read http response body for Network Details: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v2}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p0, v0, p1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-object v1
.end method

.method public static c(Lud3/d0;)Ljava/util/LinkedHashMap;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p0}, Lud3/d0;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "; "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final b(Lud3/o0;Ljava/lang/Integer;Lud3/x0;JLio/sentry/util/network/e;)V
    .locals 7

    iget-object v0, p1, Lud3/o0;->a:Lud3/e0;

    iget-object v0, v0, Lud3/e0;->i:Ljava/lang/String;

    iget-object v1, p1, Lud3/o0;->b:Ljava/lang/String;

    new-instance v2, Lio/sentry/e;

    invoke-direct {v2}, Lio/sentry/e;-><init>()V

    invoke-static {v0}, Landroidx/room/c1;->H(Ljava/lang/String;)La3/p;

    move-result-object v0

    const-string v3, "http"

    iput-object v3, v2, Lio/sentry/e;->E:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/e;->G:Ljava/lang/String;

    iget-object v3, v0, La3/p;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_0

    const-string v4, "url"

    invoke-virtual {v2, v3, v4}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "method"

    invoke-virtual {v2, v1, v3}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v3, "http.query"

    invoke-virtual {v2, v1, v3}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iget-object v0, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v1, "http.fragment"

    invoke-virtual {v2, v0, v1}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    if-eqz p2, :cond_5

    const-string v1, "status_code"

    invoke-virtual {v2, p2, v1}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sget-object v3, Lio/sentry/util/b;->a:Lio/sentry/l0;

    iget v4, v3, Lio/sentry/l0;->a:I

    if-lt v1, v4, :cond_3

    iget v3, v3, Lio/sentry/l0;->b:I

    if-gt v1, v3, :cond_3

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sget-object v1, Lio/sentry/util/b;->b:Lio/sentry/l0;

    iget v3, v1, Lio/sentry/l0;->a:I

    if-lt p2, v3, :cond_4

    iget v1, v1, Lio/sentry/l0;->b:I

    if-gt p2, v1, :cond_4

    sget-object p2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    goto :goto_0

    :cond_4
    move-object p2, v0

    :goto_0
    iput-object p2, v2, Lio/sentry/e;->I:Lio/sentry/n5;

    :cond_5
    iget-object p2, p1, Lud3/o0;->d:Lud3/v0;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lud3/v0;->contentLength()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    goto :goto_1

    :cond_6
    move-object p2, v0

    :goto_1
    new-instance v1, Lio/sentry/okhttp/c;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lio/sentry/okhttp/c;-><init>(Lio/sentry/e;I)V

    const-wide/16 v3, -0x1

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v5, v5, v3

    if-eqz v5, :cond_7

    invoke-virtual {v1, p2}, Lio/sentry/okhttp/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    if-eqz p3, :cond_8

    iget-object p2, p3, Lud3/x0;->G:Lud3/a1;

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lud3/a1;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :cond_8
    new-instance p2, Lio/sentry/okhttp/c;

    const/4 v1, 0x1

    invoke-direct {p2, v2, v1}, Lio/sentry/okhttp/c;-><init>(Lio/sentry/e;I)V

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v1, v5, v3

    if-eqz v1, :cond_9

    invoke-virtual {p2, v0}, Lio/sentry/okhttp/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    new-instance p2, Lio/sentry/g0;

    invoke-direct {p2}, Lio/sentry/g0;-><init>()V

    const-string v0, "okHttp:request"

    invoke-virtual {p2, p1, v0}, Lio/sentry/g0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_a

    const-string p1, "okHttp:response"

    invoke-virtual {p2, p3, p1}, Lio/sentry/g0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_a
    if-eqz p6, :cond_b

    const-string p1, "sentry:replayNetworkDetails"

    invoke-virtual {p2, p6, p1}, Lio/sentry/g0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    const-string p1, "http.start_timestamp"

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v2, p3, p1}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p3, "http.end_timestamp"

    invoke-virtual {v2, p1, p3}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/okhttp/d;->w:Lio/sentry/d1;

    invoke-interface {p1, v2, p2}, Lio/sentry/d1;->i(Lio/sentry/e;Lio/sentry/g0;)V

    return-void
.end method

.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "baggage"

    const-string v3, "chain"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lkotlin/jvm/internal/g0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    move-object v4, v0

    check-cast v4, Lae3/i;

    iget-object v5, v4, Lae3/i;->a:Lzd3/o;

    iget-object v4, v4, Lae3/i;->e:Lud3/o0;

    iput-object v4, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v4, v4, Lud3/o0;->a:Lud3/e0;

    iget-object v4, v4, Lud3/e0;->i:Ljava/lang/String;

    invoke-static {v4}, Landroidx/room/c1;->H(Ljava/lang/String;)La3/p;

    move-result-object v4

    iget-object v6, v4, La3/p;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_0

    const-string v6, "unknown"

    :cond_0
    iget-object v7, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v7, Lud3/o0;

    iget-object v7, v7, Lud3/o0;->b:Ljava/lang/String;

    sget-object v8, Lio/sentry/okhttp/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v8, v5}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    const/4 v10, 0x0

    iget-object v11, v1, Lio/sentry/okhttp/d;->w:Lio/sentry/d1;

    if-eqz v9, :cond_3

    invoke-virtual {v8, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    :cond_1
    move-object v5, v10

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_3
    sget-boolean v5, Lio/sentry/util/i;->a:Z

    if-eqz v5, :cond_4

    invoke-interface {v11}, Lio/sentry/d1;->m()Lio/sentry/n1;

    move-result-object v5

    goto :goto_0

    :cond_4
    invoke-interface {v11}, Lio/sentry/d1;->f()Lio/sentry/l1;

    move-result-object v5

    :goto_0
    if-eqz v5, :cond_1

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "http.client"

    invoke-interface {v5, v7, v6}, Lio/sentry/l1;->w(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/l1;

    move-result-object v5

    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    if-eqz v5, :cond_5

    invoke-interface {v5}, Lio/sentry/l1;->t()Lio/sentry/e7;

    move-result-object v8

    goto :goto_2

    :cond_5
    move-object v8, v10

    :goto_2
    const-string v9, "auto.http.okhttp"

    if-nez v8, :cond_6

    goto :goto_3

    :cond_6
    iput-object v9, v8, Lio/sentry/e7;->I:Ljava/lang/String;

    :goto_3
    if-nez v5, :cond_7

    goto :goto_4

    :cond_7
    iget-object v8, v4, La3/p;->y:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_8

    const-string v12, "http.query"

    invoke-interface {v5, v8, v12}, Lio/sentry/l1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_8
    iget-object v4, v4, La3/p;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_9

    const-string v8, "http.fragment"

    invoke-interface {v5, v4, v8}, Lio/sentry/l1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    :goto_4
    iget-object v4, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Lud3/o0;

    iget-object v8, v4, Lud3/o0;->a:Lud3/e0;

    iget-object v8, v8, Lud3/e0;->i:Ljava/lang/String;

    iget-object v4, v4, Lud3/o0;->b:Ljava/lang/String;

    invoke-interface {v11}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v12

    invoke-virtual {v12}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v12

    iget-object v12, v12, Lio/sentry/u6;->q:Ljava/util/List;

    invoke-interface {v11}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v13

    invoke-virtual {v13}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v13

    iget-object v13, v13, Lio/sentry/u6;->r:Ljava/util/List;

    if-eqz v13, :cond_b

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_a
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    if-eqz v14, :cond_a

    invoke-virtual {v8, v14}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_a

    goto :goto_5

    :cond_b
    if-nez v12, :cond_c

    goto :goto_5

    :cond_c
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_d
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_e

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    if-eqz v13, :cond_d

    invoke-virtual {v8, v13}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_d

    new-instance v8, Lio/sentry/util/network/e;

    invoke-direct {v8, v4}, Lio/sentry/util/network/e;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :cond_e
    :goto_5
    move-object v8, v10

    :goto_6
    :try_start_0
    iget-object v4, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Lud3/o0;

    invoke-virtual {v4}, Lud3/o0;->b()Lud3/n0;

    move-result-object v4

    invoke-interface {v11}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v12

    invoke-virtual {v12}, Lio/sentry/q6;->getIgnoredSpanOrigins()Ljava/util/List;

    move-result-object v12

    invoke-static {v9, v12}, Lio/sentry/util/l;->a(Ljava/lang/String;Ljava/util/List;)Z

    move-result v9

    if-nez v9, :cond_10

    iget-object v9, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v12, v9

    check-cast v12, Lud3/o0;

    iget-object v12, v12, Lud3/o0;->a:Lud3/e0;

    iget-object v12, v12, Lud3/e0;->i:Ljava/lang/String;

    check-cast v9, Lud3/o0;

    iget-object v9, v9, Lud3/o0;->c:Lud3/d0;

    invoke-virtual {v9, v2}, Lud3/d0;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    invoke-static {v11, v12, v9, v5}, Lwb3/f;->f0(Lio/sentry/d1;Ljava/lang/String;Ljava/util/List;Lio/sentry/l1;)La3/p;

    move-result-object v9

    if-eqz v9, :cond_10

    iget-object v12, v9, La3/p;->x:Ljava/lang/Object;

    check-cast v12, Lio/sentry/w6;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v13, "sentry-trace"

    invoke-virtual {v12}, Lio/sentry/w6;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v13, v12}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v12, v9, La3/p;->y:Ljava/lang/Object;

    check-cast v12, Lhc3/x;

    if-eqz v12, :cond_f

    iget-object v13, v4, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {v13, v2}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    iget-object v12, v12, Lhc3/x;->b:Ljava/lang/String;

    invoke-virtual {v4, v2, v12}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object v2, v10

    move-object v4, v2

    goto/16 :goto_e

    :catch_0
    move-exception v0

    move-object v2, v10

    move-object v4, v2

    goto/16 :goto_d

    :cond_f
    :goto_7
    iget-object v2, v9, La3/p;->z:Ljava/lang/Object;

    check-cast v2, La3/p;

    if-eqz v2, :cond_10

    const-string v9, "traceparent"

    invoke-virtual {v2}, La3/p;->B()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v9, v2}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_10
    iget-object v2, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lud3/o0;

    iget-object v2, v2, Lud3/o0;->d:Lud3/v0;

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lud3/v0;->contentLength()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object v13, v2

    goto :goto_8

    :cond_11
    move-object v13, v10

    :goto_8
    if-eqz v8, :cond_12

    iget-object v12, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-interface {v11}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v2

    iget-boolean v14, v2, Lio/sentry/u6;->s:Z

    new-instance v15, Lic/o;

    invoke-direct {v15, v4, v3, v1}, Lic/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v11}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v2

    iget-object v2, v2, Lio/sentry/u6;->t:Ljava/util/List;

    new-instance v9, Li5/c;

    invoke-direct {v9, v1}, Li5/c;-><init>(Lio/sentry/okhttp/d;)V

    move-object/from16 v16, v2

    move-object/from16 v17, v9

    invoke-static/range {v12 .. v17}, Ldt/b;->m(Ljava/lang/Object;Ljava/lang/Long;ZLio/sentry/util/network/c;Ljava/util/List;Lio/sentry/util/network/d;)La3/p;

    move-result-object v2

    iput-object v2, v8, Lio/sentry/util/network/e;->e:La3/p;

    iget-object v2, v2, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    iput-object v2, v8, Lio/sentry/util/network/e;->c:Ljava/lang/Long;

    :cond_12
    new-instance v2, Lud3/o0;

    invoke-direct {v2, v4}, Lud3/o0;-><init>(Lud3/n0;)V

    iput-object v2, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lae3/i;

    invoke-virtual {v0, v2}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget v0, v4, Lud3/x0;->z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    if-eqz v5, :cond_13

    :try_start_2
    const-string v9, "http.response.status_code"

    invoke-interface {v5, v2, v9}, Lio/sentry/l1;->o(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v0

    goto/16 :goto_e

    :catch_1
    move-exception v0

    goto/16 :goto_d

    :cond_13
    :goto_9
    if-nez v5, :cond_14

    goto :goto_a

    :cond_14
    :try_start_3
    invoke-static {v0}, Lio/sentry/i7;->fromHttpStatusCode(I)Lio/sentry/i7;

    move-result-object v9

    invoke-interface {v5, v9}, Lio/sentry/l1;->a(Lio/sentry/i7;)V

    :goto_a
    iget-object v9, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v9, Lud3/o0;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v8, :cond_16

    iget-object v9, v4, Lud3/x0;->G:Lud3/a1;

    if-eqz v9, :cond_15

    invoke-virtual {v9}, Lud3/a1;->i()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    :cond_15
    move-object v13, v10

    invoke-interface {v11}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v9

    invoke-virtual {v9}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v9

    iget-boolean v14, v9, Lio/sentry/u6;->s:Z

    new-instance v15, Lcom/whoop/data/repositories/c;

    const/16 v9, 0xd

    invoke-direct {v15, v1, v9}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v11}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v9

    invoke-virtual {v9}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v9

    iget-object v9, v9, Lio/sentry/u6;->u:Ljava/util/List;

    new-instance v10, Lio/sentry/okhttp/b;

    invoke-direct {v10, v1}, Lio/sentry/okhttp/b;-><init>(Lio/sentry/okhttp/d;)V

    move-object v12, v4

    move-object/from16 v16, v9

    move-object/from16 v17, v10

    invoke-static/range {v12 .. v17}, Ldt/b;->m(Ljava/lang/Object;Ljava/lang/Long;ZLio/sentry/util/network/c;Ljava/util/List;Lio/sentry/util/network/d;)La3/p;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v8, Lio/sentry/util/network/e;->b:Ljava/lang/Integer;

    iput-object v4, v8, Lio/sentry/util/network/e;->f:La3/p;

    iget-object v0, v4, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    iput-object v0, v8, Lio/sentry/util/network/e;->d:Ljava/lang/Long;

    goto :goto_b

    :cond_16
    move-object v12, v4

    :goto_b
    iget-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lud3/o0;

    if-nez v5, :cond_17

    goto :goto_c

    :cond_17
    invoke-interface {v5}, Lio/sentry/l1;->g()V

    :goto_c
    iget-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lud3/o0;

    move-object v3, v2

    move-wide v5, v6

    move-object v7, v8

    move-object v4, v12

    move-object v2, v0

    invoke-virtual/range {v1 .. v7}, Lio/sentry/okhttp/d;->b(Lud3/o0;Ljava/lang/Integer;Lud3/x0;JLio/sentry/util/network/e;)V

    return-object v12

    :catchall_2
    move-exception v0

    move-object v12, v4

    goto :goto_e

    :catch_2
    move-exception v0

    move-object v12, v4

    goto :goto_d

    :catchall_3
    move-exception v0

    move-object v12, v4

    move-object v2, v10

    goto :goto_e

    :catch_3
    move-exception v0

    move-object v12, v4

    move-object v2, v10

    :goto_d
    if-eqz v5, :cond_18

    :try_start_4
    invoke-interface {v5, v0}, Lio/sentry/l1;->m(Ljava/io/IOException;)V

    sget-object v9, Lio/sentry/i7;->INTERNAL_ERROR:Lio/sentry/i7;

    invoke-interface {v5, v9}, Lio/sentry/l1;->a(Lio/sentry/i7;)V

    :cond_18
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_e
    if-eqz v4, :cond_1a

    if-eqz v8, :cond_1a

    iget v9, v4, Lud3/x0;->z:I

    iget-object v12, v4, Lud3/x0;->G:Lud3/a1;

    if-eqz v12, :cond_19

    invoke-virtual {v12}, Lud3/a1;->i()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    :cond_19
    move-object v13, v10

    invoke-interface {v11}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v10

    invoke-virtual {v10}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v10

    iget-boolean v14, v10, Lio/sentry/u6;->s:Z

    new-instance v15, Lcom/whoop/data/repositories/c;

    const/16 v10, 0xd

    invoke-direct {v15, v1, v10}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v11}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v10

    invoke-virtual {v10}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v10

    iget-object v10, v10, Lio/sentry/u6;->u:Ljava/util/List;

    new-instance v11, Lio/sentry/okhttp/b;

    invoke-direct {v11, v1}, Lio/sentry/okhttp/b;-><init>(Lio/sentry/okhttp/d;)V

    move-object v12, v4

    move-object/from16 v16, v10

    move-object/from16 v17, v11

    invoke-static/range {v12 .. v17}, Ldt/b;->m(Ljava/lang/Object;Ljava/lang/Long;ZLio/sentry/util/network/c;Ljava/util/List;Lio/sentry/util/network/d;)La3/p;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iput-object v9, v8, Lio/sentry/util/network/e;->b:Ljava/lang/Integer;

    iput-object v4, v8, Lio/sentry/util/network/e;->f:La3/p;

    iget-object v4, v4, La3/p;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Long;

    iput-object v4, v8, Lio/sentry/util/network/e;->d:Ljava/lang/Long;

    goto :goto_f

    :cond_1a
    move-object v12, v4

    :goto_f
    iget-object v4, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Lud3/o0;

    if-nez v5, :cond_1b

    goto :goto_10

    :cond_1b
    invoke-interface {v5}, Lio/sentry/l1;->g()V

    :goto_10
    iget-object v3, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Lud3/o0;

    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move-wide v5, v6

    move-object v7, v8

    move-object v4, v12

    invoke-virtual/range {v1 .. v7}, Lio/sentry/okhttp/d;->b(Lud3/o0;Ljava/lang/Integer;Lud3/x0;JLio/sentry/util/network/e;)V

    throw v0
.end method
