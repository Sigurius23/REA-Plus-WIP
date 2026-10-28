.class public interface abstract Lio/getstream/chat/android/client/parser/ChatParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008`\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0001H&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ/\u0010\u0012\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00022\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010H&\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J5\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0018\"\u0008\u0008\u0000\u0010\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00022\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\"R\u0014\u0010%\u001a\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006&\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "",
        "",
        "moreInfo",
        "moreInfoTemplate",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "",
        "Lio/getstream/chat/android/client/socket/ErrorDetail;",
        "details",
        "buildDetailsTemplate",
        "(Ljava/util/List;)Ljava/lang/String;",
        "any",
        "toJson",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "T",
        "raw",
        "Ljava/lang/Class;",
        "clazz",
        "fromJson",
        "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;",
        "Lpg3/x0;",
        "builder",
        "configRetrofit",
        "(Lpg3/x0;)Lpg3/x0;",
        "Ln23/h;",
        "fromJsonOrError",
        "(Ljava/lang/String;Ljava/lang/Class;)Ln23/h;",
        "Lud3/x0;",
        "okHttpResponse",
        "Ln23/c;",
        "toError",
        "(Lud3/x0;)Ln23/c;",
        "Lud3/a1;",
        "errorResponseBody",
        "(Lud3/a1;)Ln23/c;",
        "getTag",
        "()Ljava/lang/String;",
        "tag",
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


# direct methods
.method private buildDetailsTemplate(Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/socket/ErrorDetail;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\nError details: "

    invoke-static {v0, p1}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method private getTag()Ljava/lang/String;
    .locals 1

    const-string v0, "Chat:ChatParser"

    return-object v0
.end method

.method private moreInfoTemplate(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\nMore information available at "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method


# virtual methods
.method public abstract configRetrofit(Lpg3/x0;)Lpg3/x0;
.end method

.method public abstract fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public fromJsonOrError(Ljava/lang/String;Ljava/lang/Class;)Ln23/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "raw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clazz"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ln23/g;

    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/client/parser/ChatParser;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    new-instance v1, Ln23/f;

    new-instance v2, Ln23/d;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "fromJsonOrError error parsing of "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " into "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2}, Ln23/f;-><init>(Ln23/e;)V

    return-object v1
.end method

.method public toError(Lud3/a1;)Ln23/c;
    .locals 6

    const-string v0, "errorResponseBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    :try_start_0
    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1

    const-class v0, Lio/getstream/chat/android/client/socket/ErrorResponse;

    invoke-interface {p0, p1, v0}, Lio/getstream/chat/android/client/parser/ChatParser;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/socket/ErrorResponse;

    .line 22
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ErrorResponse;->component1()I

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ErrorResponse;->component2()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ErrorResponse;->component3()I

    move-result v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ErrorResponse;->component5()Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/parser/ChatParser;->moreInfoTemplate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 24
    new-instance v1, Ln23/c;

    const/16 v3, 0x8

    invoke-direct {v1, p1, v0, v2, v3}, Ln23/c;-><init>(Ljava/lang/String;III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v3, p1

    .line 25
    sget-object p1, Lb23/i;->a:Lb23/i;

    .line 26
    sget-object p1, Lb23/i;->d:Lb23/e;

    .line 27
    sget-object v0, Lb23/g;->F:Lb23/g;

    const-string v1, "Chat:ChatParser"

    invoke-interface {p1, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 28
    sget-object p1, Lb23/i;->c:Lb23/j;

    .line 29
    const-string v2, "[toError] failed"

    .line 30
    invoke-interface {p1, v0, v1, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    :cond_0
    sget-object v0, Ln23/c;->e:Ln23/b;

    .line 32
    sget-object v1, Lio/getstream/chat/android/client/errors/ChatErrorCode;->NETWORK_FAILED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    .line 33
    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->fromChatErrorCode$default(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;ILjava/lang/Object;)Ln23/c;

    move-result-object p1

    return-object p1
.end method

.method public toError(Lud3/x0;)Ln23/c;
    .locals 13

    sget-object v1, Ln23/c;->e:Ln23/b;

    const-string v0, "okHttpResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v3, p1, Lud3/x0;->z:I

    const-wide v4, 0x7fffffffffffffffL

    .line 2
    :try_start_0
    invoke-virtual {p1, v4, v5}, Lud3/x0;->i(J)Lud3/z0;

    move-result-object p1

    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 4
    sget-object v2, Lio/getstream/chat/android/client/errors/ChatErrorCode;->NO_ERROR_BODY:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 5
    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->fromChatErrorCode$default(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;ILjava/lang/Object;)Ln23/c;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    .line 6
    :cond_0
    :try_start_1
    const-class v0, Lio/getstream/chat/android/client/socket/ErrorResponse;

    invoke-interface {p0, p1, v0}, Lio/getstream/chat/android/client/parser/ChatParser;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/socket/ErrorResponse;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 7
    :catchall_1
    :try_start_2
    new-instance v4, Lio/getstream/chat/android/client/socket/ErrorResponse;

    const/16 v11, 0x3f

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lio/getstream/chat/android/client/socket/ErrorResponse;-><init>(ILjava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, p1}, Lio/getstream/chat/android/client/socket/ErrorResponse;->setMessage(Ljava/lang/String;)V

    move-object v0, v4

    .line 8
    :goto_0
    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ErrorResponse;->getCode()I

    move-result p1

    .line 9
    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ErrorResponse;->getMessage()Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ErrorResponse;->getMoreInfo()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lio/getstream/chat/android/client/parser/ChatParser;->moreInfoTemplate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 11
    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ErrorResponse;->getDetails()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/parser/ChatParser;->buildDetailsTemplate(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 12
    new-instance v2, Ln23/c;

    const/16 v4, 0x8

    invoke-direct {v2, v0, p1, v3, v4}, Ln23/c;-><init>(Ljava/lang/String;III)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object p1, v2

    goto :goto_2

    .line 13
    :goto_1
    sget-object v0, Lb23/i;->a:Lb23/i;

    .line 14
    sget-object v0, Lb23/i;->d:Lb23/e;

    .line 15
    sget-object v2, Lb23/g;->F:Lb23/g;

    const-string v4, "Chat:ChatParser"

    invoke-interface {v0, v2, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16
    sget-object v0, Lb23/i;->c:Lb23/j;

    .line 17
    const-string v5, "[toError] failed"

    .line 18
    invoke-interface {v0, v2, v4, v5, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    :cond_1
    sget-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->NETWORK_FAILED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    .line 20
    invoke-static {v1, v0, v3, p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->fromChatErrorCode(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;)Ln23/c;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public abstract toJson(Ljava/lang/Object;)Ljava/lang/String;
.end method
