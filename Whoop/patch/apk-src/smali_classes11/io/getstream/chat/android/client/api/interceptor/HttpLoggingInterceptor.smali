.class public final Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;",
        "Lud3/g0;",
        "<init>",
        "()V",
        "Lne3/h;",
        "buffer",
        "Ljava/nio/charset/Charset;",
        "charset",
        "Ll83/a0;",
        "logRequestBody",
        "(Lne3/h;Ljava/nio/charset/Charset;)V",
        "Lud3/d0;",
        "headers",
        "",
        "bodyHasUnknownEncoding",
        "(Lud3/d0;)Z",
        "isProbablyUtf8",
        "(Lne3/h;)Z",
        "Lud3/f0;",
        "chain",
        "Lud3/x0;",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Chat:Http"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->logger$delegate:Ll83/h;

    return-void
.end method

.method private final bodyHasUnknownEncoding(Lud3/d0;)Z
    .locals 2

    const-string v0, "Content-Encoding"

    invoke-virtual {p1, v0}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const-string v1, "identity"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "gzip"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final isProbablyUtf8(Lne3/h;)Z
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    new-instance v2, Lne3/h;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-wide v3, p1, Lne3/h;->x:J

    const-wide/16 v5, 0x40

    cmp-long v1, v3, v5

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    move-wide v5, v3

    :goto_0
    const-wide/16 v3, 0x0

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lne3/h;->k(Lne3/h;JJ)V

    move p1, v0

    :goto_1
    const/16 v1, 0x10

    if-ge p1, v1, :cond_3

    invoke-virtual {v2}, Lne3/h;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Lne3/h;->T0()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    const/4 p1, 0x1

    return p1

    :catch_0
    :goto_3
    return v0
.end method

.method private final logRequestBody(Lne3/h;Ljava/nio/charset/Charset;)V
    .locals 8
    .annotation runtime Lio/getstream/chat/android/core/internal/StreamHandsOff;
        reason = "Request body shouldn\'t be log entirely as it might produce OutOfMemory exceptions when sending big files. The log will be limited to 1048576 bytes."
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-wide v4, p1, Lne3/h;->x:J

    const-wide/32 v6, 0x100000

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-virtual {p1, v4, v5, p2}, Lne3/h;->M0(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {v0, v2, v3, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "chain"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lae3/i;

    iget-object v2, v0, Lae3/i;->e:Lud3/o0;

    sget-boolean v3, Lb23/i;->b:Z

    if-nez v3, :cond_0

    invoke-virtual {v0, v2}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v3, v2, Lud3/o0;->d:Lud3/v0;

    iget-object v4, v2, Lud3/o0;->b:Ljava/lang/String;

    iget-object v5, v0, Lae3/i;->d:Lzd3/g;

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lzd3/g;->c()Lzd3/p;

    move-result-object v5

    goto :goto_0

    :cond_1
    move-object v5, v6

    :goto_0
    iget-object v7, v2, Lud3/o0;->a:Lud3/e0;

    const-string v8, ""

    const-string v9, " "

    if-eqz v5, :cond_2

    iget-object v5, v5, Lzd3/p;->g:Lud3/m0;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v8

    :goto_1
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "--> "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "-byte body)"

    const-string v10, " ("

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lud3/v0;->contentLength()J

    move-result-wide v11

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_3
    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v11

    iget-object v12, v11, Lb23/k;->c:Lb23/e;

    iget-object v13, v11, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->z:Lb23/g;

    invoke-interface {v12, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    iget-object v11, v11, Lb23/k;->b:Lb23/j;

    invoke-interface {v11, v14, v13, v5, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    const-string v5, "-byte body omitted)"

    const-string v11, "--> END "

    if-nez v3, :cond_6

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v7, v3, Lb23/k;->c:Lb23/e;

    iget-object v12, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v14, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-static {v11, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v14, v12, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    move-object v13, v9

    move-object v9, v8

    goto/16 :goto_4

    :cond_6
    iget-object v12, v2, Lud3/o0;->c:Lud3/d0;

    invoke-direct {v1, v12}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->bodyHasUnknownEncoding(Lud3/d0;)Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v7, v3, Lb23/k;->c:Lb23/e;

    iget-object v12, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v14, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v7, " (encoded body omitted)"

    invoke-static {v11, v4, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v14, v12, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v3}, Lud3/v0;->isDuplex()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v7, v3, Lb23/k;->c:Lb23/e;

    iget-object v12, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v14, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v7, " (duplex request body omitted)"

    invoke-static {v11, v4, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v14, v12, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_8
    invoke-virtual {v3}, Lud3/v0;->isOneShot()Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v7, v3, Lb23/k;->c:Lb23/e;

    iget-object v12, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v14, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v7, " (one-shot body omitted)"

    invoke-static {v11, v4, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v14, v12, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_9
    new-instance v12, Lne3/h;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v12}, Lud3/v0;->writeTo(Lne3/i;)V

    invoke-virtual {v3}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object v13

    if-eqz v13, :cond_a

    sget-object v15, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v13, v15}, Lud3/h0;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v13

    if-nez v13, :cond_b

    :cond_a
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v15, "UTF_8"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v15

    iget-object v6, v15, Lb23/k;->c:Lb23/e;

    move-object/from16 v16, v3

    iget-object v3, v15, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v14, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_c

    iget-object v6, v15, Lb23/k;->b:Lb23/j;

    const/4 v15, 0x0

    invoke-interface {v6, v14, v3, v8, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    invoke-direct {v1, v12}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->isProbablyUtf8(Lne3/h;)Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-direct {v1, v12, v13}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->logRequestBody(Lne3/h;Ljava/nio/charset/Charset;)V

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v6, v3, Lb23/k;->c:Lb23/e;

    iget-object v12, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v14, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_d

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    move-object v6, v8

    move-object v13, v9

    invoke-virtual/range {v16 .. v16}, Lud3/v0;->contentLength()J

    move-result-wide v8

    invoke-static {v11, v4, v8, v9, v10}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v15, 0x0

    invoke-interface {v3, v14, v12, v4, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_d
    move-object v6, v8

    move-object v13, v9

    :cond_e
    :goto_3
    move-object v9, v6

    goto :goto_4

    :cond_f
    move-object v6, v8

    move-object v13, v9

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v7, v3, Lb23/k;->c:Lb23/e;

    iget-object v8, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v14, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_e

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    move-object v9, v6

    invoke-virtual/range {v16 .. v16}, Lud3/v0;->contentLength()J

    move-result-wide v6

    const-string v12, " (binary "

    invoke-static {v11, v4, v6, v7, v12}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v15, 0x0

    invoke-interface {v3, v14, v8, v4, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    :try_start_0
    invoke-virtual {v0, v2}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long/2addr v6, v3

    invoke-virtual {v2, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    iget-object v4, v0, Lud3/x0;->G:Lud3/a1;

    iget-object v6, v0, Lud3/x0;->F:Lud3/d0;

    iget-object v7, v0, Lud3/x0;->y:Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lud3/a1;->i()J

    move-result-wide v11

    const-wide/16 v15, -0x1

    cmp-long v8, v11, v15

    if-eqz v8, :cond_10

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v11, "-byte"

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    :cond_10
    const-string v8, "unknown-length"

    :goto_5
    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v11

    iget-object v12, v11, Lb23/k;->c:Lb23/e;

    iget-object v15, v11, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v12, v14, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_12

    iget-object v11, v11, Lb23/k;->b:Lb23/j;

    iget v12, v0, Lud3/x0;->z:I

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v16

    if-nez v16, :cond_11

    move-object v7, v9

    :goto_6
    move-object/from16 v16, v4

    goto :goto_7

    :cond_11
    invoke-virtual {v13, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_6

    :goto_7
    iget-object v4, v0, Lud3/x0;->w:Lud3/o0;

    iget-object v4, v4, Lud3/o0;->a:Lud3/e0;

    move-object/from16 v17, v0

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v18, v9

    const-string v9, "<-- "

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "ms, "

    invoke-static {v0, v10, v2, v3, v4}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    const-string v2, " body)"

    invoke-static {v8, v2, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v11, v14, v15, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_12
    move-object/from16 v17, v0

    move-object/from16 v16, v4

    move-object/from16 v18, v9

    :goto_8
    invoke-static/range {v17 .. v17}, Lae3/h;->a(Lud3/x0;)Z

    move-result v0

    if-nez v0, :cond_13

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v14, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_19

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "<-- END HTTP"

    const/4 v15, 0x0

    invoke-interface {v0, v14, v3, v2, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v17

    :cond_13
    invoke-direct {v1, v6}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->bodyHasUnknownEncoding(Lud3/d0;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v14, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_19

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "<-- END HTTP (encoded body omitted)"

    const/4 v15, 0x0

    invoke-interface {v0, v14, v3, v2, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v17

    :cond_14
    invoke-virtual/range {v16 .. v16}, Lud3/a1;->d1()Lne3/j;

    move-result-object v0

    const-wide v2, 0x7fffffffffffffffL

    invoke-interface {v0, v2, v3}, Lne3/j;->request(J)Z

    invoke-interface {v0}, Lne3/j;->f()Lne3/h;

    move-result-object v0

    const-string v2, "Content-Encoding"

    invoke-virtual {v6, v2}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "gzip"

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_15

    iget-wide v2, v0, Lne3/h;->x:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Lne3/v;

    invoke-virtual {v0}, Lne3/h;->i()Lne3/h;

    move-result-object v0

    invoke-direct {v3, v0}, Lne3/v;-><init>(Lne3/j;)V

    :try_start_1
    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v3}, Lne3/h;->N0(Lne3/p0;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v3}, Lne3/v;->close()V

    goto :goto_9

    :catchall_0
    move-exception v0

    move-object v2, v0

    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v3, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_15
    const/4 v2, 0x0

    :goto_9
    invoke-direct {v1, v0}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->isProbablyUtf8(Lne3/h;)Z

    move-result v3

    if-nez v3, :cond_17

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v14, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_16

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    move-object/from16 v6, v18

    const/4 v15, 0x0

    invoke-interface {v2, v14, v4, v6, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_16
    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v14, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_19

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    iget-wide v6, v0, Lne3/h;->x:J

    const-string v0, "<-- END HTTP (binary "

    invoke-static {v6, v7, v0, v5}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v15, 0x0

    invoke-interface {v2, v14, v4, v0, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v17

    :cond_17
    const-string v3, "<-- END HTTP ("

    if-eqz v2, :cond_18

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    iget-object v6, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v14, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_19

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    iget-wide v7, v0, Lne3/h;->x:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "-byte, "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "-gzipped-byte body omitted)"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v15, 0x0

    invoke-interface {v4, v14, v6, v0, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v17

    :cond_18
    const/4 v15, 0x0

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v14, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_19

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    iget-wide v7, v0, Lne3/h;->x:J

    invoke-static {v7, v8, v3, v5}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v14, v6, v0, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_19
    return-object v17

    :catch_0
    move-exception v0

    invoke-direct {v1}, Lio/getstream/chat/android/client/api/interceptor/HttpLoggingInterceptor;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1a

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    sget-object v3, Lb23/g;->z:Lb23/g;

    const-string v5, "<-- HTTP FAILED: "

    invoke-static {v0, v5}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v15, 0x0

    invoke-interface {v2, v3, v4, v5, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1a
    throw v0
.end method
