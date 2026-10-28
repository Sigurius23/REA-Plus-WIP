.class public final Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequestKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000c\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\n\u0010\u0008\u001a\u00020\u0006*\u00020\u0007\u001a\u000c\u0010\t\u001a\u00020\u0006*\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "MESSAGE_LIMIT",
        "",
        "CHANNEL_LIMIT",
        "MEMBER_LIMIT",
        "WATCHER_LIMIT",
        "isFirstPage",
        "",
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "isRequestingMoreThanLastMessage",
        "isNotFirstPage",
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


# static fields
.field private static final CHANNEL_LIMIT:I = 0x1e

.field private static final MEMBER_LIMIT:I = 0x1e

.field private static final MESSAGE_LIMIT:I = 0x1e

.field private static final WATCHER_LIMIT:I = 0x1e


# direct methods
.method public static final isFirstPage(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->getChannelOffset()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isNotFirstPage(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequestKt;->isFirstPage(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final isRequestingMoreThanLastMessage(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequestKt;->isFirstPage(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->getMessageLimit()I

    move-result v0

    if-gt v0, v1, :cond_1

    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequestKt;->isNotFirstPage(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->getMessageLimit()I

    move-result p0

    if-lez p0, :cond_2

    :cond_1
    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method
