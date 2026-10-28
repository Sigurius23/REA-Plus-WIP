.class public final Lae3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lae3/a;->w:I

    iput-object p1, p0, Lae3/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lud3/t;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lae3/a;->w:I

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lae3/a;->x:Ljava/lang/Object;

    return-void
.end method

.method public static c(Lud3/x0;I)I
    .locals 1

    iget-object p0, p0, Lud3/x0;->F:Lud3/d0;

    const-string v0, "Retry-After"

    invoke-virtual {p0, v0}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    if-nez p0, :cond_1

    return p1

    :cond_1
    const-string p1, "\\d+"

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    const-string v0, "compile(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "valueOf(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0

    :cond_2
    const p0, 0x7fffffff

    return p0
.end method


# virtual methods
.method public a(Lud3/x0;Lzd3/g;)Lud3/o0;
    .locals 11

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lzd3/g;->c()Lzd3/p;

    move-result-object v1

    iget-object v1, v1, Lzd3/p;->c:Lud3/b1;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    iget v2, p1, Lud3/x0;->z:I

    iget-object v3, p1, Lud3/x0;->w:Lud3/o0;

    iget-object v4, v3, Lud3/o0;->b:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/16 v7, 0x134

    const/16 v8, 0x133

    if-eq v2, v8, :cond_e

    if-eq v2, v7, :cond_e

    const/16 v9, 0x191

    if-eq v2, v9, :cond_d

    const/16 v9, 0x1a5

    if-eq v2, v9, :cond_a

    const/16 p2, 0x1f7

    if-eq v2, p2, :cond_8

    const/16 p2, 0x197

    if-eq v2, p2, :cond_6

    const/16 p2, 0x198

    if-eq v2, p2, :cond_1

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_2

    :cond_1
    iget-object v1, p0, Lae3/a;->x:Ljava/lang/Object;

    check-cast v1, Lud3/l0;

    iget-boolean v1, v1, Lud3/l0;->e:Z

    if-nez v1, :cond_2

    goto/16 :goto_2

    :cond_2
    iget-object v1, v3, Lud3/o0;->d:Lud3/v0;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lud3/v0;->isOneShot()Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_2

    :cond_3
    iget-object v1, p1, Lud3/x0;->K:Lud3/x0;

    if-eqz v1, :cond_4

    iget v1, v1, Lud3/x0;->z:I

    if-ne v1, p2, :cond_4

    goto/16 :goto_2

    :cond_4
    invoke-static {p1, v5}, Lae3/a;->c(Lud3/x0;I)I

    move-result p2

    if-lez p2, :cond_5

    goto/16 :goto_2

    :cond_5
    iget-object p1, p1, Lud3/x0;->w:Lud3/o0;

    return-object p1

    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p2, v1, Lud3/b1;->b:Ljava/net/Proxy;

    invoke-virtual {p2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p2

    sget-object v0, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne p2, v0, :cond_7

    iget-object p2, p0, Lae3/a;->x:Ljava/lang/Object;

    check-cast p2, Lud3/l0;

    iget-object p2, p2, Lud3/l0;->n:Lud3/c;

    invoke-interface {p2, v1, p1}, Lud3/c;->a(Lud3/b1;Lud3/x0;)Lud3/o0;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    iget-object v1, p1, Lud3/x0;->K:Lud3/x0;

    if-eqz v1, :cond_9

    iget v1, v1, Lud3/x0;->z:I

    if-ne v1, p2, :cond_9

    goto/16 :goto_2

    :cond_9
    const p2, 0x7fffffff

    invoke-static {p1, p2}, Lae3/a;->c(Lud3/x0;I)I

    move-result p2

    if-nez p2, :cond_14

    iget-object p1, p1, Lud3/x0;->w:Lud3/o0;

    return-object p1

    :cond_a
    iget-object v1, v3, Lud3/o0;->d:Lud3/v0;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lud3/v0;->isOneShot()Z

    move-result v1

    if-eqz v1, :cond_b

    goto/16 :goto_2

    :cond_b
    if-eqz p2, :cond_14

    iget-object v1, p2, Lzd3/g;->c:Lzd3/h;

    invoke-interface {v1}, Lzd3/h;->b()Lzd3/r;

    move-result-object v1

    iget-object v1, v1, Lzd3/r;->j:Lud3/a;

    iget-object v1, v1, Lud3/a;->h:Lud3/e0;

    iget-object v1, v1, Lud3/e0;->d:Ljava/lang/String;

    iget-object v2, p2, Lzd3/g;->d:Lae3/g;

    invoke-interface {v2}, Lae3/g;->j()Lae3/f;

    move-result-object v2

    invoke-interface {v2}, Lae3/f;->e()Lud3/b1;

    move-result-object v2

    iget-object v2, v2, Lud3/b1;->a:Lud3/a;

    iget-object v2, v2, Lud3/a;->h:Lud3/e0;

    iget-object v2, v2, Lud3/e0;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_2

    :cond_c
    invoke-virtual {p2}, Lzd3/g;->c()Lzd3/p;

    move-result-object p2

    monitor-enter p2

    :try_start_0
    iput-boolean v6, p2, Lzd3/p;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    iget-object p1, p1, Lud3/x0;->w:Lud3/o0;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_d
    iget-object p2, p0, Lae3/a;->x:Ljava/lang/Object;

    check-cast p2, Lud3/l0;

    iget-object p2, p2, Lud3/l0;->g:Lud3/c;

    invoke-interface {p2, v1, p1}, Lud3/c;->a(Lud3/b1;Lud3/x0;)Lud3/o0;

    move-result-object p1

    return-object p1

    :cond_e
    :pswitch_0
    const-string p2, "PROPFIND"

    iget-object v1, p0, Lae3/a;->x:Ljava/lang/Object;

    check-cast v1, Lud3/l0;

    iget-boolean v2, v1, Lud3/l0;->h:Z

    if-nez v2, :cond_f

    goto :goto_2

    :cond_f
    const-string v2, "Location"

    iget-object v3, p1, Lud3/x0;->F:Lud3/d0;

    invoke-virtual {v3, v2}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_10

    move-object v2, v0

    :cond_10
    iget-object v3, p1, Lud3/x0;->w:Lud3/o0;

    if-nez v2, :cond_11

    goto :goto_2

    :cond_11
    iget-object v9, v3, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9, v2}, Lud3/e0;->h(Ljava/lang/String;)Lcom/iterable/iterableapi/v;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-virtual {v2}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object v2

    goto :goto_1

    :cond_12
    move-object v2, v0

    :goto_1
    if-nez v2, :cond_13

    goto :goto_2

    :cond_13
    iget-object v9, v2, Lud3/e0;->a:Ljava/lang/String;

    iget-object v10, v3, Lud3/o0;->a:Lud3/e0;

    iget-object v10, v10, Lud3/e0;->a:Ljava/lang/String;

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_15

    iget-boolean v1, v1, Lud3/l0;->i:Z

    if-nez v1, :cond_15

    :cond_14
    :goto_2
    return-object v0

    :cond_15
    invoke-virtual {v3}, Lud3/o0;->b()Lud3/n0;

    move-result-object v1

    invoke-static {v4}, Lwb3/f;->X(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1a

    iget p1, p1, Lud3/x0;->z:I

    invoke-virtual {v4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_16

    if-eq p1, v7, :cond_16

    if-ne p1, v8, :cond_17

    :cond_16
    move v5, v6

    :cond_17
    invoke-virtual {v4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_18

    if-eq p1, v7, :cond_18

    if-eq p1, v8, :cond_18

    const-string p1, "GET"

    invoke-virtual {v1, p1, v0}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    goto :goto_3

    :cond_18
    if-eqz v5, :cond_19

    iget-object v0, v3, Lud3/o0;->d:Lud3/v0;

    :cond_19
    invoke-virtual {v1, v4, v0}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    :goto_3
    if-nez v5, :cond_1a

    const-string p1, "Transfer-Encoding"

    iget-object p2, v1, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    const-string p1, "Content-Length"

    iget-object p2, v1, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    const-string p1, "Content-Type"

    iget-object p2, v1, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    :cond_1a
    iget-object p1, v3, Lud3/o0;->a:Lud3/e0;

    invoke-static {p1, v2}, Lwd3/h;->a(Lud3/e0;Lud3/e0;)Z

    move-result p1

    if-nez p1, :cond_1b

    const-string p1, "Authorization"

    iget-object p2, v1, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    :cond_1b
    iput-object v2, v1, Lud3/n0;->a:Lud3/e0;

    new-instance p1, Lud3/o0;

    invoke-direct {p1, v1}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/io/IOException;Lzd3/o;Lud3/o0;)Z
    .locals 2

    instance-of v0, p1, Lokhttp3/internal/http2/ConnectionShutdownException;

    iget-object v1, p0, Lae3/a;->x:Ljava/lang/Object;

    check-cast v1, Lud3/l0;

    iget-boolean v1, v1, Lud3/l0;->e:Z

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    if-nez v0, :cond_2

    iget-object p3, p3, Lud3/o0;->d:Lud3/v0;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lud3/v0;->isOneShot()Z

    move-result p3

    if-nez p3, :cond_8

    :cond_1
    instance-of p3, p1, Ljava/io/FileNotFoundException;

    if-eqz p3, :cond_2

    goto :goto_2

    :cond_2
    instance-of p3, p1, Ljava/net/ProtocolException;

    if-eqz p3, :cond_3

    goto :goto_2

    :cond_3
    instance-of p3, p1, Ljava/io/InterruptedIOException;

    if-eqz p3, :cond_4

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_8

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_4
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p3, :cond_5

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p3

    instance-of p3, p3, Ljava/security/cert/CertificateException;

    if-eqz p3, :cond_5

    goto :goto_2

    :cond_5
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    :goto_0
    iget-object p1, p2, Lzd3/o;->S:Lzd3/g;

    if-eqz p1, :cond_8

    iget-boolean p1, p1, Lzd3/g;->f:Z

    const/4 p3, 0x1

    if-ne p1, p3, :cond_8

    iget-object p1, p2, Lzd3/o;->I:Lzd3/h;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p1}, Lzd3/h;->b()Lzd3/r;

    move-result-object p1

    iget-object p2, p2, Lzd3/o;->S:Lzd3/g;

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lzd3/g;->c()Lzd3/p;

    move-result-object p2

    goto :goto_1

    :cond_7
    const/4 p2, 0x0

    :goto_1
    invoke-virtual {p1, p2}, Lzd3/r;->a(Lzd3/p;)Z

    move-result p1

    if-eqz p1, :cond_8

    return p3

    :cond_8
    :goto_2
    const/4 p1, 0x0

    return p1
.end method

.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 43

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, Lae3/a;->w:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "networkResponse"

    const-string v5, "Content-Encoding"

    const-string v7, "Content-Length"

    const-string v8, "Content-Type"

    const-string v9, "cacheResponse"

    const-string v10, "Warning"

    const-string v11, "request"

    const-string v12, "chain"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v12, v0

    check-cast v12, Lae3/i;

    iget-object v14, v12, Lae3/i;->e:Lud3/o0;

    iget-object v12, v12, Lae3/i;->a:Lzd3/o;

    iget-object v13, v1, Lae3/a;->x:Ljava/lang/Object;

    check-cast v13, Lud3/g;

    if-eqz v13, :cond_0

    invoke-static {v14}, Ls93/k;->a(Lud3/o0;)Lud3/o0;

    invoke-virtual {v13, v14}, Lud3/g;->b(Lud3/o0;)Lud3/x0;

    move-result-object v15

    goto :goto_0

    :cond_0
    const/4 v15, 0x0

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    invoke-static {v14, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v14, Lud3/o0;->c:Lud3/d0;

    if-eqz v15, :cond_7

    iget-wide v3, v15, Lud3/x0;->L:J

    move-object/from16 v23, v7

    iget-wide v6, v15, Lud3/x0;->M:J

    move-wide/from16 v25, v3

    iget-object v3, v15, Lud3/x0;->F:Lud3/d0;

    invoke-virtual {v3}, Lud3/d0;->size()I

    move-result v4

    move-wide/from16 v27, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, -0x1

    :goto_1
    if-ge v6, v4, :cond_6

    move/from16 v35, v4

    invoke-virtual {v3, v6}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v36, v7

    invoke-virtual {v3, v6}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v37, v3

    const-string v3, "Date"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v7}, Lae3/e;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    move-object/from16 v30, v3

    move-object/from16 v33, v7

    :cond_1
    :goto_2
    move-object/from16 v7, v36

    goto :goto_3

    :cond_2
    const-string v3, "Expires"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v7}, Lae3/e;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    move-object v7, v3

    goto :goto_3

    :cond_3
    const-string v3, "Last-Modified"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {v7}, Lae3/e;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    move-object/from16 v29, v3

    move-object/from16 v32, v7

    goto :goto_2

    :cond_4
    const-string v3, "ETag"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object/from16 v31, v7

    goto :goto_2

    :cond_5
    const-string v3, "Age"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, -0x1

    invoke-static {v3, v7}, Lwd3/f;->q(ILjava/lang/String;)I

    move-result v4

    move/from16 v34, v4

    goto :goto_2

    :goto_3
    add-int/lit8 v6, v6, 0x1

    move/from16 v4, v35

    move-object/from16 v3, v37

    goto :goto_1

    :cond_6
    move-object/from16 v36, v7

    move-wide/from16 v3, v25

    move/from16 v6, v34

    goto :goto_4

    :cond_7
    move-object/from16 v23, v7

    const-wide/16 v3, 0x0

    const/4 v6, -0x1

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    :goto_4
    const-string v7, "If-None-Match"

    move-wide/from16 v25, v3

    const-string v3, "If-Modified-Since"

    if-nez v15, :cond_8

    new-instance v3, Lpg3/o;

    const/4 v4, 0x0

    invoke-direct {v3, v14, v4}, Lpg3/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_5
    move-object/from16 v37, v2

    move-object/from16 v25, v5

    move-object/from16 v34, v8

    goto/16 :goto_13

    :cond_8
    iget-object v4, v14, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v4}, Lud3/e0;->f()Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v4, v15, Lud3/x0;->E:Lud3/c0;

    if-nez v4, :cond_9

    new-instance v3, Lpg3/o;

    const/4 v4, 0x0

    invoke-direct {v3, v14, v4}, Lpg3/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    const/4 v4, 0x0

    invoke-static {v15, v14}, Lva3/d;->h(Lud3/x0;Lud3/o0;)Z

    move-result v20

    if-nez v20, :cond_a

    new-instance v3, Lpg3/o;

    invoke-direct {v3, v14, v4}, Lpg3/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v14}, Lud3/o0;->a()Lud3/h;

    move-result-object v4

    iget-boolean v1, v4, Lud3/h;->a:Z

    if-nez v1, :cond_1e

    invoke-virtual {v11, v3}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1e

    invoke-virtual {v11, v7}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    goto/16 :goto_12

    :cond_b
    invoke-virtual {v15}, Lud3/x0;->b()Lud3/h;

    move-result-object v1

    if-eqz v30, :cond_c

    invoke-virtual/range {v30 .. v30}, Ljava/util/Date;->getTime()J

    move-result-wide v34

    move-object/from16 v37, v2

    move-object/from16 v38, v3

    sub-long v2, v27, v34

    move-object/from16 v35, v7

    move-object/from16 v34, v8

    const-wide/16 v7, 0x0

    invoke-static {v7, v8, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v21

    move-wide/from16 v2, v21

    :goto_6
    const/4 v7, -0x1

    goto :goto_7

    :cond_c
    move-object/from16 v37, v2

    move-object/from16 v38, v3

    move-object/from16 v35, v7

    move-object/from16 v34, v8

    const-wide/16 v7, 0x0

    move-wide v2, v7

    goto :goto_6

    :goto_7
    if-eq v6, v7, :cond_d

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v8, v5

    int-to-long v5, v6

    invoke-virtual {v7, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    goto :goto_8

    :cond_d
    move-object v8, v5

    :goto_8
    sub-long v5, v27, v25

    move-wide/from16 v39, v2

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    move-wide/from16 v41, v5

    sub-long v5, v16, v27

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    add-long v2, v39, v41

    add-long/2addr v2, v5

    invoke-virtual {v15}, Lud3/x0;->b()Lud3/h;

    move-result-object v5

    iget v5, v5, Lud3/h;->c:I

    const/4 v7, -0x1

    if-eq v5, v7, :cond_e

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide/from16 v16, v2

    int-to-long v2, v5

    invoke-virtual {v6, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    :goto_9
    const-wide/16 v21, 0x0

    goto :goto_c

    :cond_e
    move-wide/from16 v16, v2

    if-eqz v36, :cond_11

    if-eqz v30, :cond_f

    invoke-virtual/range {v30 .. v30}, Ljava/util/Date;->getTime()J

    move-result-wide v27

    :cond_f
    invoke-virtual/range {v36 .. v36}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long v2, v2, v27

    const-wide/16 v21, 0x0

    cmp-long v5, v2, v21

    if-lez v5, :cond_10

    goto :goto_9

    :cond_10
    const-wide/16 v2, 0x0

    goto :goto_9

    :cond_11
    if-eqz v29, :cond_14

    iget-object v2, v15, Lud3/x0;->w:Lud3/o0;

    iget-object v2, v2, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v2}, Lud3/e0;->i()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_14

    if-eqz v30, :cond_12

    invoke-virtual/range {v30 .. v30}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    goto :goto_a

    :cond_12
    move-wide/from16 v2, v25

    :goto_a
    invoke-virtual/range {v29 .. v29}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    sub-long/2addr v2, v5

    const-wide/16 v21, 0x0

    cmp-long v5, v2, v21

    if-lez v5, :cond_13

    const/16 v5, 0xa

    int-to-long v5, v5

    div-long/2addr v2, v5

    goto :goto_c

    :cond_13
    :goto_b
    move-wide/from16 v2, v21

    goto :goto_c

    :cond_14
    const-wide/16 v21, 0x0

    goto :goto_b

    :goto_c
    iget v5, v4, Lud3/h;->c:I

    const/4 v7, -0x1

    if-eq v5, v7, :cond_15

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v25, v8

    int-to-long v7, v5

    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    goto :goto_d

    :cond_15
    move-object/from16 v25, v8

    :goto_d
    iget v5, v4, Lud3/h;->i:I

    const/4 v7, -0x1

    if-eq v5, v7, :cond_16

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v7, v5

    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    goto :goto_e

    :cond_16
    move-wide/from16 v7, v21

    :goto_e
    iget-boolean v5, v1, Lud3/h;->g:Z

    if-nez v5, :cond_17

    iget v4, v4, Lud3/h;->h:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_17

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide/from16 v26, v2

    int-to-long v2, v4

    invoke-virtual {v5, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    goto :goto_f

    :cond_17
    move-wide/from16 v26, v2

    move-wide/from16 v3, v21

    :goto_f
    iget-boolean v1, v1, Lud3/h;->a:Z

    if-nez v1, :cond_1a

    add-long v1, v16, v7

    add-long v3, v26, v3

    cmp-long v3, v1, v3

    if-gez v3, :cond_1a

    invoke-virtual {v15}, Lud3/x0;->h()Lud3/w0;

    move-result-object v3

    cmp-long v1, v1, v26

    if-ltz v1, :cond_18

    const-string v1, "110 HttpURLConnection \"Response is stale\""

    iget-object v2, v3, Lud3/w0;->f:Lkotlin/jvm/internal/k0;

    invoke-virtual {v2, v10, v1}, Lkotlin/jvm/internal/k0;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_18
    const-wide/32 v1, 0x5265c00

    cmp-long v1, v16, v1

    if-lez v1, :cond_19

    invoke-virtual {v15}, Lud3/x0;->b()Lud3/h;

    move-result-object v1

    iget v1, v1, Lud3/h;->c:I

    const/4 v7, -0x1

    if-ne v1, v7, :cond_19

    if-nez v36, :cond_19

    const-string v1, "113 HttpURLConnection \"Heuristic expiration\""

    iget-object v2, v3, Lud3/w0;->f:Lkotlin/jvm/internal/k0;

    invoke-virtual {v2, v10, v1}, Lkotlin/jvm/internal/k0;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_19
    new-instance v1, Lpg3/o;

    invoke-virtual {v3}, Lud3/w0;->a()Lud3/x0;

    move-result-object v2

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2}, Lpg3/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v3, v1

    goto :goto_13

    :cond_1a
    if-eqz v31, :cond_1b

    move-object/from16 v1, v31

    move-object/from16 v7, v35

    goto :goto_11

    :cond_1b
    if-eqz v29, :cond_1c

    move-object/from16 v1, v32

    :goto_10
    move-object/from16 v7, v38

    goto :goto_11

    :cond_1c
    if-eqz v30, :cond_1d

    move-object/from16 v1, v33

    goto :goto_10

    :goto_11
    invoke-virtual {v11}, Lud3/d0;->d()Lkotlin/jvm/internal/k0;

    move-result-object v2

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v7, v1}, Lkotlin/jvm/internal/k0;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v14}, Lud3/o0;->b()Lud3/n0;

    move-result-object v1

    invoke-virtual {v2}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lud3/n0;->d(Lud3/d0;)V

    new-instance v2, Lud3/o0;

    invoke-direct {v2, v1}, Lud3/o0;-><init>(Lud3/n0;)V

    new-instance v3, Lpg3/o;

    invoke-direct {v3, v2, v15}, Lpg3/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v4, 0x0

    goto :goto_13

    :cond_1d
    new-instance v3, Lpg3/o;

    const/4 v4, 0x0

    invoke-direct {v3, v14, v4}, Lpg3/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_13

    :cond_1e
    :goto_12
    move-object/from16 v37, v2

    move-object/from16 v25, v5

    move-object/from16 v34, v8

    const/4 v4, 0x0

    new-instance v3, Lpg3/o;

    invoke-direct {v3, v14, v4}, Lpg3/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_13
    iget-object v1, v3, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v1, Lud3/o0;

    if-eqz v1, :cond_1f

    invoke-virtual {v14}, Lud3/o0;->a()Lud3/h;

    move-result-object v1

    iget-boolean v1, v1, Lud3/h;->j:Z

    if-eqz v1, :cond_1f

    new-instance v3, Lpg3/o;

    invoke-direct {v3, v4, v4}, Lpg3/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1f
    iget-object v1, v3, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v1, Lud3/o0;

    iget-object v2, v3, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v2, Lud3/x0;

    if-eqz v13, :cond_20

    invoke-virtual {v13, v3}, Lud3/g;->m(Lpg3/o;)V

    :cond_20
    iget-object v3, v12, Lzd3/o;->E:Lud3/a0;

    if-nez v3, :cond_21

    sget-object v3, Lud3/a0;->NONE:Lud3/a0;

    :cond_21
    if-eqz v15, :cond_22

    if-nez v2, :cond_22

    iget-object v4, v15, Lud3/x0;->G:Lud3/a1;

    invoke-static {v4}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_22
    if-nez v1, :cond_23

    if-nez v2, :cond_23

    sget-object v20, Lud3/a1;->x:Lud3/z0;

    sget-object v30, Lud3/d1;->A:Lud3/t;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v15, Lud3/m0;->z:Lud3/m0;

    const-string v16, "Unsatisfiable Request (only-if-cached)"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v27

    new-instance v1, Lud3/d0;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-direct {v1, v0}, Lud3/d0;-><init>([Ljava/lang/String;)V

    new-instance v13, Lud3/x0;

    const/16 v17, 0x1f8

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, -0x1

    const/16 v29, 0x0

    move-object/from16 v19, v1

    invoke-direct/range {v13 .. v30}, Lud3/x0;-><init>(Lud3/o0;Lud3/m0;Ljava/lang/String;ILud3/c0;Lud3/d0;Lud3/a1;Lne3/o0;Lud3/x0;Lud3/x0;Lud3/x0;JJLzd3/g;Lud3/d1;)V

    invoke-virtual {v3, v12, v13}, Lud3/a0;->satisfactionFailure(Lud3/j;Lud3/x0;)V

    goto/16 :goto_20

    :cond_23
    if-nez v1, :cond_24

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lud3/x0;->h()Lud3/w0;

    move-result-object v0

    invoke-static {v2}, Lv63/h;->g(Lud3/x0;)Lud3/x0;

    move-result-object v1

    invoke-static {v1, v9}, Lud3/w0;->b(Lud3/x0;Ljava/lang/String;)V

    iput-object v1, v0, Lud3/w0;->j:Lud3/x0;

    invoke-virtual {v0}, Lud3/w0;->a()Lud3/x0;

    move-result-object v13

    invoke-virtual {v3, v12, v13}, Lud3/a0;->cacheHit(Lud3/j;Lud3/x0;)V

    goto/16 :goto_20

    :cond_24
    if-eqz v2, :cond_25

    invoke-virtual {v3, v12, v2}, Lud3/a0;->cacheConditionalHit(Lud3/j;Lud3/x0;)V

    goto :goto_14

    :cond_25
    if-eqz v13, :cond_26

    invoke-virtual {v3, v12}, Lud3/a0;->cacheMiss(Lud3/j;)V

    :cond_26
    :goto_14
    :try_start_0
    check-cast v0, Lae3/i;

    invoke-virtual {v0, v1}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_32

    iget v4, v0, Lud3/x0;->z:I

    const/16 v5, 0x130

    if-ne v4, v5, :cond_31

    invoke-virtual {v2}, Lud3/x0;->h()Lud3/w0;

    move-result-object v1

    iget-object v4, v2, Lud3/x0;->F:Lud3/d0;

    iget-object v5, v0, Lud3/x0;->F:Lud3/d0;

    new-instance v6, Lkotlin/jvm/internal/k0;

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    invoke-virtual {v4}, Lud3/d0;->size()I

    move-result v7

    move v11, v8

    :goto_15
    if-ge v11, v7, :cond_2d

    invoke-virtual {v4, v11}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4, v11}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v16

    if-eqz v16, :cond_28

    move-object/from16 v16, v4

    const-string v4, "1"

    invoke-static {v15, v4, v8}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_27

    move/from16 p1, v7

    move-object/from16 v4, v23

    move-object/from16 v8, v25

    move-object/from16 v7, v34

    goto :goto_19

    :cond_27
    :goto_16
    move-object/from16 v4, v23

    goto :goto_17

    :cond_28
    move-object/from16 v16, v4

    goto :goto_16

    :goto_17
    invoke-virtual {v4, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2a

    move-object/from16 v8, v25

    invoke-virtual {v8, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v17

    move/from16 p1, v7

    move-object/from16 v7, v34

    if-nez v17, :cond_2b

    invoke-virtual {v7, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_29

    goto :goto_18

    :cond_29
    invoke-static {v14}, Lva3/b;->g(Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_2b

    invoke-virtual {v5, v14}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    if-nez v17, :cond_2c

    goto :goto_18

    :cond_2a
    move/from16 p1, v7

    move-object/from16 v8, v25

    move-object/from16 v7, v34

    :cond_2b
    :goto_18
    invoke-virtual {v6, v14, v15}, Lkotlin/jvm/internal/k0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2c
    :goto_19
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v23, v4

    move-object/from16 v34, v7

    move-object/from16 v25, v8

    move-object/from16 v4, v16

    const/4 v8, 0x0

    move/from16 v7, p1

    goto :goto_15

    :cond_2d
    move-object/from16 v4, v23

    move-object/from16 v8, v25

    move-object/from16 v7, v34

    invoke-virtual {v5}, Lud3/d0;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_1a
    if-ge v11, v10, :cond_30

    invoke-virtual {v5, v11}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_2f

    invoke-virtual {v8, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_2f

    invoke-virtual {v7, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_2e

    goto :goto_1b

    :cond_2e
    invoke-static {v14}, Lva3/b;->g(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_2f

    invoke-virtual {v5, v11}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v6, v14, v15}, Lkotlin/jvm/internal/k0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2f
    :goto_1b
    add-int/lit8 v11, v11, 0x1

    goto :goto_1a

    :cond_30
    invoke-virtual {v6}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v4

    invoke-virtual {v1, v4}, Lud3/w0;->c(Lud3/d0;)V

    iget-wide v4, v0, Lud3/x0;->L:J

    iput-wide v4, v1, Lud3/w0;->l:J

    iget-wide v4, v0, Lud3/x0;->M:J

    iput-wide v4, v1, Lud3/w0;->m:J

    invoke-static {v2}, Lv63/h;->g(Lud3/x0;)Lud3/x0;

    move-result-object v4

    invoke-static {v4, v9}, Lud3/w0;->b(Lud3/x0;Ljava/lang/String;)V

    iput-object v4, v1, Lud3/w0;->j:Lud3/x0;

    invoke-static {v0}, Lv63/h;->g(Lud3/x0;)Lud3/x0;

    move-result-object v4

    move-object/from16 v5, v37

    invoke-static {v4, v5}, Lud3/w0;->b(Lud3/x0;Ljava/lang/String;)V

    iput-object v4, v1, Lud3/w0;->i:Lud3/x0;

    invoke-virtual {v1}, Lud3/w0;->a()Lud3/x0;

    move-result-object v1

    iget-object v0, v0, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->close()V

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v13}, Lud3/g;->k()V

    invoke-static {v2, v1}, Lud3/g;->s(Lud3/x0;Lud3/x0;)V

    invoke-virtual {v3, v12, v1}, Lud3/a0;->cacheHit(Lud3/j;Lud3/x0;)V

    move-object v13, v1

    goto/16 :goto_20

    :cond_31
    move-object/from16 v7, v34

    move-object/from16 v5, v37

    iget-object v4, v2, Lud3/x0;->G:Lud3/a1;

    invoke-static {v4}, Lwd3/f;->b(Ljava/io/Closeable;)V

    goto :goto_1c

    :cond_32
    move-object/from16 v7, v34

    move-object/from16 v5, v37

    :goto_1c
    invoke-virtual {v0}, Lud3/x0;->h()Lud3/w0;

    move-result-object v4

    if-eqz v2, :cond_33

    invoke-static {v2}, Lv63/h;->g(Lud3/x0;)Lud3/x0;

    move-result-object v6

    goto :goto_1d

    :cond_33
    const/4 v6, 0x0

    :goto_1d
    invoke-static {v6, v9}, Lud3/w0;->b(Lud3/x0;Ljava/lang/String;)V

    iput-object v6, v4, Lud3/w0;->j:Lud3/x0;

    invoke-static {v0}, Lv63/h;->g(Lud3/x0;)Lud3/x0;

    move-result-object v0

    invoke-static {v0, v5}, Lud3/w0;->b(Lud3/x0;Ljava/lang/String;)V

    iput-object v0, v4, Lud3/w0;->i:Lud3/x0;

    invoke-virtual {v4}, Lud3/w0;->a()Lud3/x0;

    move-result-object v0

    iget-object v4, v0, Lud3/x0;->G:Lud3/a1;

    if-eqz v13, :cond_37

    invoke-static {v0}, Lae3/h;->a(Lud3/x0;)Z

    move-result v5

    if-eqz v5, :cond_36

    invoke-static {v0, v1}, Lva3/d;->h(Lud3/x0;Lud3/o0;)Z

    move-result v5

    if-eqz v5, :cond_36

    invoke-virtual {v0}, Lud3/x0;->h()Lud3/w0;

    move-result-object v5

    iput-object v1, v5, Lud3/w0;->a:Lud3/o0;

    invoke-virtual {v5}, Lud3/w0;->a()Lud3/x0;

    move-result-object v1

    invoke-virtual {v13, v1}, Lud3/g;->h(Lud3/x0;)Lc33/c;

    move-result-object v1

    if-nez v1, :cond_34

    :goto_1e
    move-object v13, v0

    goto :goto_1f

    :cond_34
    invoke-virtual {v1}, Lc33/c;->c()Lud3/f;

    move-result-object v5

    invoke-virtual {v4}, Lud3/a1;->d1()Lne3/j;

    move-result-object v6

    invoke-static {v5}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v5

    new-instance v8, Lxd3/a;

    invoke-direct {v8, v6, v1, v5}, Lxd3/a;-><init>(Lne3/j;Lc33/c;Lne3/h0;)V

    iget-object v1, v0, Lud3/x0;->F:Lud3/d0;

    invoke-virtual {v1, v7}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_35

    const/4 v1, 0x0

    :cond_35
    invoke-virtual {v4}, Lud3/a1;->i()J

    move-result-wide v4

    invoke-virtual {v0}, Lud3/x0;->h()Lud3/w0;

    move-result-object v0

    new-instance v6, Lae3/j;

    invoke-static {v8}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v7

    invoke-direct {v6, v1, v4, v5, v7}, Lae3/j;-><init>(Ljava/lang/String;JLne3/j0;)V

    iput-object v6, v0, Lud3/w0;->g:Lud3/a1;

    invoke-virtual {v0}, Lud3/w0;->a()Lud3/x0;

    move-result-object v0

    goto :goto_1e

    :goto_1f
    if-eqz v2, :cond_38

    invoke-virtual {v3, v12}, Lud3/a0;->cacheMiss(Lud3/j;)V

    goto :goto_20

    :cond_36
    iget-object v2, v1, Lud3/o0;->b:Ljava/lang/String;

    invoke-static {v2}, Lwb3/f;->H(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_37

    :try_start_1
    invoke-virtual {v13, v1}, Lud3/g;->i(Lud3/o0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_37
    move-object v13, v0

    :cond_38
    :goto_20
    return-object v13

    :catchall_0
    move-exception v0

    if-eqz v15, :cond_39

    iget-object v1, v15, Lud3/x0;->G:Lud3/a1;

    invoke-static {v1}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_39
    throw v0

    :pswitch_0
    const-string v1, "chain"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lae3/i;

    iget-object v0, v1, Lae3/i;->e:Lud3/o0;

    iget-object v2, v1, Lae3/i;->a:Lzd3/o;

    sget-object v3, Lm83/y;->w:Lm83/y;

    move-object v6, v3

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    :goto_21
    const/4 v0, 0x1

    :goto_22
    const-string v8, "request"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v2, Lzd3/o;->L:Lzd3/g;

    if-nez v8, :cond_49

    monitor-enter v2

    :try_start_2
    iget-boolean v8, v2, Lzd3/o;->N:Z

    if-nez v8, :cond_48

    iget-boolean v8, v2, Lzd3/o;->M:Z

    if-nez v8, :cond_47

    iget-boolean v8, v2, Lzd3/o;->P:Z

    if-nez v8, :cond_47

    iget-boolean v8, v2, Lzd3/o;->O:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    if-nez v8, :cond_47

    monitor-exit v2

    if-eqz v0, :cond_3d

    new-instance v21, Lzd3/r;

    iget-object v0, v2, Lzd3/o;->w:Lud3/l0;

    iget-object v8, v0, Lud3/l0;->E:Lyd3/d;

    iget-object v9, v2, Lzd3/o;->z:Lzd3/q;

    iget v10, v0, Lud3/l0;->y:I

    iget v11, v0, Lud3/l0;->z:I

    iget v12, v1, Lae3/i;->f:I

    iget v13, v1, Lae3/i;->g:I

    iget v14, v0, Lud3/l0;->A:I

    iget-boolean v15, v0, Lud3/l0;->e:Z

    iget-boolean v5, v0, Lud3/l0;->f:Z

    move/from16 p1, v4

    iget-object v4, v3, Lud3/o0;->a:Lud3/e0;

    move-object/from16 v34, v3

    const-string v3, "url"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lud3/e0;->f()Z

    move-result v3

    if-eqz v3, :cond_3b

    iget-object v3, v0, Lud3/l0;->p:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v3, :cond_3a

    move-object/from16 v17, v3

    iget-object v3, v0, Lud3/l0;->t:Ljavax/net/ssl/HostnameVerifier;

    move-object/from16 v22, v3

    iget-object v3, v0, Lud3/l0;->u:Lud3/l;

    move-object/from16 v29, v3

    move-object/from16 v27, v17

    move-object/from16 v28, v22

    goto :goto_23

    :cond_3a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CLEARTEXT-only client"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3b
    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    :goto_23
    new-instance v31, Lud3/a;

    iget-object v3, v4, Lud3/e0;->d:Ljava/lang/String;

    iget v4, v4, Lud3/e0;->e:I

    move-object/from16 v23, v3

    iget-object v3, v0, Lud3/l0;->l:Lud3/v;

    move-object/from16 v25, v3

    iget-object v3, v0, Lud3/l0;->o:Ljavax/net/SocketFactory;

    move-object/from16 v26, v3

    iget-object v3, v0, Lud3/l0;->n:Lud3/c;

    move-object/from16 v30, v3

    iget-object v3, v0, Lud3/l0;->s:Ljava/util/List;

    move-object/from16 v17, v3

    iget-object v3, v0, Lud3/l0;->r:Ljava/util/List;

    iget-object v0, v0, Lud3/l0;->m:Ljava/net/ProxySelector;

    move-object/from16 v33, v0

    move-object/from16 v32, v3

    move/from16 v24, v4

    move-object/from16 v22, v31

    move-object/from16 v31, v17

    invoke-direct/range {v22 .. v33}, Lud3/a;-><init>(Ljava/lang/String;ILud3/v;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lud3/l;Lud3/c;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    move-object/from16 v31, v22

    iget-object v0, v2, Lzd3/o;->w:Lud3/l0;

    iget-object v0, v0, Lud3/l0;->D:Lzd3/t;

    move-object/from16 v32, v0

    move-object/from16 v33, v2

    move/from16 v30, v5

    move-object/from16 v22, v8

    move-object/from16 v23, v9

    move/from16 v24, v10

    move/from16 v25, v11

    move/from16 v26, v12

    move/from16 v27, v13

    move/from16 v28, v14

    move/from16 v29, v15

    invoke-direct/range {v21 .. v34}, Lzd3/r;-><init>(Lyd3/d;Lzd3/q;IIIIIZZLud3/a;Lzd3/t;Lzd3/o;Lud3/o0;)V

    move-object/from16 v0, v21

    move-object/from16 v3, v34

    iget-object v4, v2, Lzd3/o;->w:Lud3/l0;

    iget-boolean v5, v4, Lud3/l0;->f:Z

    if-eqz v5, :cond_3c

    new-instance v5, Lzd3/k;

    iget-object v4, v4, Lud3/l0;->E:Lyd3/d;

    invoke-direct {v5, v0, v4}, Lzd3/k;-><init>(Lzd3/r;Lyd3/d;)V

    goto :goto_24

    :cond_3c
    new-instance v5, Lzd3/x;

    invoke-direct {v5, v0}, Lzd3/x;-><init>(Lzd3/r;)V

    :goto_24
    iput-object v5, v2, Lzd3/o;->I:Lzd3/h;

    goto :goto_25

    :cond_3d
    move/from16 p1, v4

    :goto_25
    :try_start_3
    iget-boolean v0, v2, Lzd3/o;->R:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    if-nez v0, :cond_46

    :try_start_4
    invoke-virtual {v1, v3}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    invoke-virtual {v0}, Lud3/x0;->h()Lud3/w0;

    move-result-object v0

    iput-object v3, v0, Lud3/w0;->a:Lud3/o0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    if-eqz v7, :cond_3e

    :try_start_6
    invoke-static {v7}, Lv63/h;->g(Lud3/x0;)Lud3/x0;

    move-result-object v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_26

    :catchall_1
    move-exception v0

    const/4 v5, 0x1

    move-object/from16 v4, p0

    goto/16 :goto_2e

    :cond_3e
    const/4 v3, 0x0

    :goto_26
    :try_start_7
    iput-object v3, v0, Lud3/w0;->k:Lud3/x0;

    invoke-virtual {v0}, Lud3/w0;->a()Lud3/x0;

    move-result-object v7

    iget-object v0, v2, Lzd3/o;->L:Lzd3/g;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    move-object/from16 v4, p0

    :try_start_8
    invoke-virtual {v4, v7, v0}, Lae3/a;->a(Lud3/x0;Lzd3/g;)Lud3/o0;

    move-result-object v3

    if-nez v3, :cond_41

    if-eqz v0, :cond_40

    iget-boolean v0, v0, Lzd3/g;->e:Z

    if-eqz v0, :cond_40

    iget-boolean v0, v2, Lzd3/o;->K:Z

    if-nez v0, :cond_3f

    const/4 v1, 0x1

    iput-boolean v1, v2, Lzd3/o;->K:Z

    iget-object v0, v2, Lzd3/o;->F:Lzd3/n;

    invoke-virtual {v0}, Lne3/d;->j()Z

    goto :goto_28

    :cond_3f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_27
    const/4 v5, 0x1

    goto/16 :goto_2e

    :catchall_2
    move-exception v0

    goto :goto_27

    :cond_40
    :goto_28
    :try_start_9
    iget-object v0, v2, Lzd3/o;->E:Lud3/a0;

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v7, v1}, Lud3/a0;->followUpDecision(Lud3/j;Lud3/x0;Lud3/o0;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    const/4 v8, 0x0

    :goto_29
    invoke-virtual {v2, v8}, Lzd3/o;->f(Z)V

    goto :goto_2a

    :catchall_3
    move-exception v0

    const/4 v5, 0x0

    goto/16 :goto_2e

    :cond_41
    :try_start_a
    iget-object v0, v3, Lud3/o0;->d:Lud3/v0;

    if-eqz v0, :cond_42

    invoke-virtual {v0}, Lud3/v0;->isOneShot()Z

    move-result v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    if-eqz v0, :cond_42

    :try_start_b
    iget-object v0, v2, Lzd3/o;->E:Lud3/a0;

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v7, v1}, Lud3/a0;->followUpDecision(Lud3/j;Lud3/x0;Lud3/o0;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    const/4 v8, 0x0

    goto :goto_29

    :goto_2a
    return-object v7

    :cond_42
    :try_start_c
    iget-object v0, v7, Lud3/x0;->G:Lud3/a1;

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    add-int/lit8 v0, p1, 0x1

    const/16 v5, 0x14

    if-gt v0, v5, :cond_43

    iget-object v8, v2, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {v8, v2, v7, v3}, Lud3/a0;->followUpDecision(Lud3/j;Lud3/x0;Lud3/o0;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    const/4 v8, 0x1

    invoke-virtual {v2, v8}, Lzd3/o;->f(Z)V

    move v4, v0

    goto/16 :goto_21

    :cond_43
    :try_start_d
    iget-object v1, v2, Lzd3/o;->E:Lud3/a0;

    const/4 v8, 0x0

    invoke-virtual {v1, v2, v7, v8}, Lud3/a0;->followUpDecision(Lud3/j;Lud3/x0;Lud3/o0;)V

    new-instance v1, Ljava/net/ProtocolException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Too many follow-up requests: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    :catchall_4
    move-exception v0

    move-object/from16 v4, p0

    goto :goto_27

    :catch_1
    move-exception v0

    const/16 v5, 0x14

    const/4 v8, 0x0

    move-object/from16 v4, p0

    :try_start_e
    invoke-virtual {v4, v0, v2, v3}, Lae3/a;->b(Ljava/io/IOException;Lzd3/o;Lud3/o0;)Z

    move-result v9

    iget-object v10, v2, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {v10, v2, v0, v9}, Lud3/a0;->retryDecision(Lud3/j;Ljava/io/IOException;Z)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    if-nez v9, :cond_45

    :try_start_f
    sget-object v1, Lwd3/f;->a:[B

    const-string v1, "suppressed"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_44

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Exception;

    invoke-static {v0, v3}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_2b

    :cond_44
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    :cond_45
    :try_start_10
    check-cast v6, Ljava/util/Collection;

    invoke-static {v0, v6}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v6
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    const/4 v9, 0x1

    invoke-virtual {v2, v9}, Lzd3/o;->f(Z)V

    move/from16 v4, p1

    const/4 v0, 0x0

    goto/16 :goto_22

    :catchall_5
    move-exception v0

    :goto_2c
    const/4 v9, 0x1

    :goto_2d
    move v5, v9

    goto :goto_2e

    :cond_46
    move-object/from16 v4, p0

    const/4 v9, 0x1

    :try_start_11
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    :catchall_6
    move-exception v0

    goto :goto_2d

    :catchall_7
    move-exception v0

    move-object/from16 v4, p0

    goto :goto_2c

    :goto_2e
    invoke-virtual {v2, v5}, Lzd3/o;->f(Z)V

    throw v0

    :cond_47
    move-object/from16 v4, p0

    goto :goto_2f

    :catchall_8
    move-exception v0

    move-object/from16 v4, p0

    goto :goto_30

    :goto_2f
    :try_start_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_9
    move-exception v0

    goto :goto_30

    :cond_48
    move-object/from16 v4, p0

    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    :goto_30
    monitor-exit v2

    throw v0

    :cond_49
    move-object/from16 v4, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    move-object v4, v1

    const/4 v8, 0x0

    const/4 v9, 0x1

    const-string v1, "Content-Encoding"

    const-string v2, "User-Agent"

    iget-object v3, v4, Lae3/a;->x:Ljava/lang/Object;

    check-cast v3, Lud3/t;

    const-string v5, "gzip"

    const-string v6, "Accept-Encoding"

    const-string v7, "Connection"

    const-string v10, "Host"

    const-string v11, "Transfer-Encoding"

    const-string v12, "Content-Type"

    const-string v13, "Content-Length"

    const-string v14, "chain"

    invoke-static {v0, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lae3/i;

    iget-object v14, v0, Lae3/i;->e:Lud3/o0;

    invoke-virtual {v14}, Lud3/o0;->b()Lud3/n0;

    move-result-object v15

    iget-object v8, v14, Lud3/o0;->c:Lud3/d0;

    iget-object v9, v14, Lud3/o0;->a:Lud3/e0;

    iget-object v14, v14, Lud3/o0;->d:Lud3/v0;

    move-object/from16 v17, v3

    const-wide/16 v21, -0x1

    if-eqz v14, :cond_4c

    invoke-virtual {v14}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object v3

    if-eqz v3, :cond_4a

    iget-object v3, v3, Lud3/h0;->a:Ljava/lang/String;

    invoke-virtual {v15, v12, v3}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4a
    invoke-virtual {v14}, Lud3/v0;->contentLength()J

    move-result-wide v3

    cmp-long v14, v3, v21

    if-eqz v14, :cond_4b

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15, v13, v3}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v15, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {v3, v11}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    goto :goto_31

    :cond_4b
    const-string v3, "chunked"

    invoke-virtual {v15, v11, v3}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v15, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {v3, v13}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    :cond_4c
    :goto_31
    invoke-virtual {v8, v10}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4d

    const/4 v3, 0x0

    invoke-static {v9, v3}, Lwd3/h;->i(Lud3/e0;Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v10, v4}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_32

    :cond_4d
    const/4 v3, 0x0

    :goto_32
    invoke-virtual {v8, v7}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4e

    const-string v4, "Keep-Alive"

    invoke-virtual {v15, v7, v4}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4e
    invoke-virtual {v8, v6}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4f

    const-string v4, "Range"

    invoke-virtual {v8, v4}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4f

    invoke-virtual {v15, v6, v5}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v16, 0x1

    goto :goto_33

    :cond_4f
    move/from16 v16, v3

    :goto_33
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "url"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_50

    const-string v3, "okhttp/5.3.2"

    invoke-virtual {v15, v2, v3}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_50
    new-instance v2, Lud3/o0;

    invoke-direct {v2, v15}, Lud3/o0;-><init>(Lud3/n0;)V

    invoke-virtual {v0, v2}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object v0

    iget-object v3, v0, Lud3/x0;->F:Lud3/d0;

    iget-object v4, v2, Lud3/o0;->a:Lud3/e0;

    move-object/from16 v6, v17

    invoke-static {v6, v4, v3}, Lae3/h;->d(Lud3/t;Lud3/e0;Lud3/d0;)V

    invoke-virtual {v0}, Lud3/x0;->h()Lud3/w0;

    move-result-object v4

    iput-object v2, v4, Lud3/w0;->a:Lud3/o0;

    if-eqz v16, :cond_53

    invoke-virtual {v3, v1}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_51

    const/4 v2, 0x0

    :cond_51
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_53

    invoke-static {v0}, Lae3/h;->a(Lud3/x0;)Z

    move-result v2

    if-eqz v2, :cond_53

    iget-object v0, v0, Lud3/x0;->G:Lud3/a1;

    if-eqz v0, :cond_53

    new-instance v2, Lne3/v;

    invoke-virtual {v0}, Lud3/a1;->d1()Lne3/j;

    move-result-object v0

    invoke-direct {v2, v0}, Lne3/v;-><init>(Lne3/j;)V

    invoke-virtual {v3}, Lud3/d0;->d()Lkotlin/jvm/internal/k0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    invoke-virtual {v0}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v0

    invoke-virtual {v4, v0}, Lud3/w0;->c(Lud3/d0;)V

    invoke-virtual {v3, v12}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_52

    const/4 v0, 0x0

    :cond_52
    new-instance v1, Lae3/j;

    invoke-static {v2}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v2

    move-wide/from16 v5, v21

    invoke-direct {v1, v0, v5, v6, v2}, Lae3/j;-><init>(Ljava/lang/String;JLne3/j0;)V

    iput-object v1, v4, Lud3/w0;->g:Lud3/a1;

    :cond_53
    invoke-virtual {v4}, Lud3/w0;->a()Lud3/x0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
