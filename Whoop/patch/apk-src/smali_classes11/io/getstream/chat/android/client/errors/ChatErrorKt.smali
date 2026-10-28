.class public final Lio/getstream/chat/android/client/errors/ChatErrorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\u001a1\u0010\u0008\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Ln23/b;",
        "Lio/getstream/chat/android/client/errors/ChatErrorCode;",
        "chatErrorCode",
        "",
        "statusCode",
        "",
        "cause",
        "Ln23/c;",
        "fromChatErrorCode",
        "(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;)Ln23/c;",
        "Ln23/e;",
        "",
        "isPermanent",
        "(Ln23/e;)Z",
        "",
        "message",
        "copyWithMessage",
        "(Ln23/e;Ljava/lang/String;)Ln23/e;",
        "extractCause",
        "(Ln23/e;)Ljava/lang/Throwable;",
        "HTTP_TOO_MANY_REQUESTS",
        "I",
        "HTTP_TIMEOUT",
        "HTTP_API_ERROR",
        "stream-chat-android-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final HTTP_API_ERROR:I = 0x1f4

.field private static final HTTP_TIMEOUT:I = 0x198

.field private static final HTTP_TOO_MANY_REQUESTS:I = 0x1ad


# direct methods
.method public static final copyWithMessage(Ln23/e;Ljava/lang/String;)Ln23/e;
    .locals 3
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ln23/a;

    if-eqz v0, :cond_0

    check-cast p0, Ln23/a;

    new-instance p0, Ln23/a;

    invoke-direct {p0, p1}, Ln23/a;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_0
    instance-of v0, p0, Ln23/c;

    if-eqz v0, :cond_1

    check-cast p0, Ln23/c;

    iget v0, p0, Ln23/c;->b:I

    iget v1, p0, Ln23/c;->c:I

    iget-object p0, p0, Ln23/c;->d:Ljava/lang/Throwable;

    new-instance v2, Ln23/c;

    invoke-direct {v2, p1, v0, v1, p0}, Ln23/c;-><init>(Ljava/lang/String;IILjava/lang/Throwable;)V

    return-object v2

    :cond_1
    instance-of v0, p0, Ln23/d;

    if-eqz v0, :cond_2

    check-cast p0, Ln23/d;

    iget-object p0, p0, Ln23/d;->b:Ljava/lang/Throwable;

    const-string v0, "cause"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln23/d;

    invoke-direct {v0, p1, p0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final extractCause(Ln23/e;)Ljava/lang/Throwable;
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ln23/a;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ln23/c;

    if-eqz v0, :cond_1

    check-cast p0, Ln23/c;

    iget-object p0, p0, Ln23/c;->d:Ljava/lang/Throwable;

    return-object p0

    :cond_1
    instance-of v0, p0, Ln23/d;

    if-eqz v0, :cond_2

    check-cast p0, Ln23/d;

    iget-object p0, p0, Ln23/d;->b:Ljava/lang/Throwable;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final fromChatErrorCode(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;)Ln23/c;
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "chatErrorCode"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ln23/c;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getCode()I

    move-result p1

    invoke-direct {p0, v0, p1, p2, p3}, Ln23/c;-><init>(Ljava/lang/String;IILjava/lang/Throwable;)V

    return-object p0
.end method

.method public static synthetic fromChatErrorCode$default(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;ILjava/lang/Object;)Ln23/c;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, -0x1

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->fromChatErrorCode(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;)Ln23/c;

    move-result-object p0

    return-object p0
.end method

.method public static final isPermanent(Ln23/e;)Z
    .locals 4
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ln23/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/16 v0, 0x1ad

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x198

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x1f4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v2, v3}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast p0, Ln23/c;

    iget v2, p0, Ln23/c;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object p0, p0, Ln23/c;->d:Ljava/lang/Throwable;

    instance-of v0, p0, Ljava/net/UnknownHostException;

    if-nez v0, :cond_2

    instance-of p0, p0, Ljava/net/ConnectException;

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    return v1
.end method
