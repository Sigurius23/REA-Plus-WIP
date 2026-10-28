.class public final Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOptionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u00a8\u0006\u0003"
    }
    d2 = {
        "defaultMessageModerationOptions",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;",
        "stream-chat-android-ui-common_release"
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
.method public static final defaultMessageModerationOptions()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;

    sget-object v1, Lio/getstream/chat/android/ui/common/state/messages/list/SendAnyway;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/SendAnyway;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lio/getstream/chat/android/ui/common/state/messages/list/EditMessage;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/EditMessage;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lio/getstream/chat/android/ui/common/state/messages/list/DeleteMessage;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/DeleteMessage;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
