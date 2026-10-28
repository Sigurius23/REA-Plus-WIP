.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "getUserReactionOrientation",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;",
        "",
        "isOrientedTowardsStart",
        "",
        "isMine",
        "stream-chat-android-ui-components_release"
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
.method public static final getUserReactionOrientation(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;
    .locals 5

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;->values()[Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;->getValue()I

    move-result v4

    if-ne v4, p0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "No such alignment"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final isOrientedTowardsStart(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;Z)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;->START:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;

    if-eq p0, v0, :cond_2

    if-eqz p1, :cond_0

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;->BY_USER:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;

    if-eq p0, v0, :cond_2

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;->BY_USER_INVERTED:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/MessageOptionsUserReactionOrientation;

    if-ne p0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
