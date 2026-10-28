.class public final Lio/getstream/chat/android/client/api2/mapping/SocketErrorMappingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "toDomain",
        "Lio/getstream/chat/android/client/socket/SocketErrorMessage;",
        "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;",
        "Lio/getstream/chat/android/client/socket/ErrorResponse;",
        "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;",
        "Lio/getstream/chat/android/client/socket/ErrorDetail;",
        "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse$ErrorDetail;",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toDomain(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse$ErrorDetail;)Lio/getstream/chat/android/client/socket/ErrorDetail;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    new-instance v0, Lio/getstream/chat/android/client/socket/ErrorDetail;

    .line 18
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse$ErrorDetail;->getCode()I

    move-result v1

    .line 19
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse$ErrorDetail;->getMessages()Ljava/util/List;

    move-result-object p0

    .line 20
    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/client/socket/ErrorDetail;-><init>(ILjava/util/List;)V

    return-object v0
.end method

.method public static final toDomain(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;)Lio/getstream/chat/android/client/socket/ErrorResponse;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;->getCode()I

    move-result v2

    .line 5
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;->getMessage()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;->getStatusCode()I

    move-result v4

    .line 7
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;->getException_fields()Ljava/util/Map;

    move-result-object v5

    .line 8
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;->getMore_info()Ljava/lang/String;

    move-result-object v6

    .line 9
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;->getDetails()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 10
    new-instance v7, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 12
    check-cast v1, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse$ErrorDetail;

    .line 13
    invoke-static {v1}, Lio/getstream/chat/android/client/api2/mapping/SocketErrorMappingKt;->toDomain(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse$ErrorDetail;)Lio/getstream/chat/android/client/socket/ErrorDetail;

    move-result-object v1

    .line 14
    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 15
    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/socket/ErrorResponse;

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/client/socket/ErrorResponse;-><init>(ILjava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/util/List;)V

    .line 16
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;->getDuration()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lio/getstream/chat/android/client/socket/ErrorResponse;->setDuration(Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toDomain(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;)Lio/getstream/chat/android/client/socket/SocketErrorMessage;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lio/getstream/chat/android/client/socket/SocketErrorMessage;

    .line 2
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;->getError()Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lio/getstream/chat/android/client/api2/mapping/SocketErrorMappingKt;->toDomain(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;)Lio/getstream/chat/android/client/socket/ErrorResponse;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 3
    :goto_0
    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/socket/SocketErrorMessage;-><init>(Lio/getstream/chat/android/client/socket/ErrorResponse;)V

    return-object v0
.end method
