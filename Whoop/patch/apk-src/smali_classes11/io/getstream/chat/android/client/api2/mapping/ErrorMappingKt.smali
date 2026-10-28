.class public final Lio/getstream/chat/android/client/api2/mapping/ErrorMappingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "toDomain",
        "Lio/getstream/chat/android/client/errors/ChatError;",
        "Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;",
        "Lio/getstream/chat/android/client/errors/ChatErrorDetail;",
        "Lio/getstream/chat/android/client/api2/model/dto/ErrorDetailDto;",
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
.method public static final toDomain(Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;)Lio/getstream/chat/android/client/errors/ChatError;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;->getCode()I

    move-result v2

    .line 2
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;->getMessage()Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;->getStatusCode()I

    move-result v4

    .line 4
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;->getException_fields()Ljava/util/Map;

    move-result-object v5

    .line 5
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;->getMore_info()Ljava/lang/String;

    move-result-object v6

    .line 6
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;->getDetails()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 7
    new-instance v7, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 9
    check-cast v1, Lio/getstream/chat/android/client/api2/model/dto/ErrorDetailDto;

    .line 10
    invoke-static {v1}, Lio/getstream/chat/android/client/api2/mapping/ErrorMappingKt;->toDomain(Lio/getstream/chat/android/client/api2/model/dto/ErrorDetailDto;)Lio/getstream/chat/android/client/errors/ChatErrorDetail;

    move-result-object v1

    .line 11
    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/errors/ChatError;

    const/4 v8, 0x0

    const/16 v9, 0x40

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/errors/ChatError;-><init>(ILjava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;->getDuration()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lio/getstream/chat/android/client/errors/ChatError;->setDuration(Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toDomain(Lio/getstream/chat/android/client/api2/model/dto/ErrorDetailDto;)Lio/getstream/chat/android/client/errors/ChatErrorDetail;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorDetail;

    .line 15
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/dto/ErrorDetailDto;->getCode()I

    move-result v1

    .line 16
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/dto/ErrorDetailDto;->getMessages()Ljava/util/List;

    move-result-object p0

    .line 17
    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/client/errors/ChatErrorDetail;-><init>(ILjava/util/List;)V

    return-object v0
.end method
