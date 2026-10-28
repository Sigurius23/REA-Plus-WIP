.class public interface abstract Lcom/whoop/community/data/network/ChatApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J.\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\rH\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J*\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000e\u001a\u00020\rH\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J0\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00190\u000f2\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0016H\u00a7@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0008\u0001\u0010\u001d\u001a\u00020\u0016H\u00a7@\u00a2\u0006\u0004\u0008\u001f\u0010 J*\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0008\u0001\u0010\u001d\u001a\u00020\u00162\u0008\u0008\u0001\u0010!\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\"\u0010#J*\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0008\u0001\u0010\u001d\u001a\u00020\u00162\u0008\u0008\u0001\u0010%\u001a\u00020$H\u00a7@\u00a2\u0006\u0004\u0008&\u0010\'J \u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0008\u0001\u0010\u000e\u001a\u00020(H\u00a7@\u00a2\u0006\u0004\u0008)\u0010*J\u0016\u0010,\u001a\u0008\u0012\u0004\u0012\u00020+0\u000fH\u00a7@\u00a2\u0006\u0004\u0008,\u0010\u0004\u00a8\u0006-\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/community/data/network/ChatApi;",
        "",
        "Lcom/whoop/community/data/network/ChatTokenResponseDto;",
        "getStreamToken",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lud3/i0;",
        "file",
        "",
        "channelId",
        "channelType",
        "Lcom/whoop/community/data/network/AttachmentResponseDto;",
        "uploadChatAttachment",
        "(Lud3/i0;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/community/data/network/MessageStatus;",
        "body",
        "Lpg3/v0;",
        "Ll83/a0;",
        "sendMessageStatus",
        "(Lcom/whoop/community/data/network/MessageStatus;Lq83/d;)Ljava/lang/Object;",
        "messageId",
        "sendUpdateMessageStatus",
        "(Ljava/lang/String;Lcom/whoop/community/data/network/MessageStatus;Lq83/d;)Ljava/lang/Object;",
        "",
        "offset",
        "limit",
        "",
        "Lcom/whoop/community/data/network/DataWidgetDto;",
        "getDataWidgets",
        "(IILq83/d;)Ljava/lang/Object;",
        "communityId",
        "Lcom/whoop/community/data/network/MemberNotificationSettingsDto;",
        "getNotificationSetting",
        "(ILq83/d;)Ljava/lang/Object;",
        "notificationSetting",
        "updateNotificationSetting",
        "(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "online",
        "updateUserOnlineStatus",
        "(IZLq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/community/data/network/ReportMessage;",
        "reportMessage",
        "(Lcom/whoop/community/data/network/ReportMessage;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/community/data/network/ChatUnreadCountDto;",
        "getUserUnreadMessageCount",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getDataWidgets(IILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ljava/util/List<",
            "Lcom/whoop/community/data/network/DataWidgetDto;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/chat/widgets"
    .end annotation
.end method

.method public abstract getNotificationSetting(ILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/community/data/network/MemberNotificationSettingsDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/communities/{communityId}/member"
    .end annotation
.end method

.method public abstract getStreamToken(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/community/data/network/ChatTokenResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/chat/token"
    .end annotation
.end method

.method public abstract getUserUnreadMessageCount(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/community/data/network/ChatUnreadCountDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/chat/unread-count"
    .end annotation
.end method

.method public abstract reportMessage(Lcom/whoop/community/data/network/ReportMessage;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/community/data/network/ReportMessage;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/community/data/network/ReportMessage;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "community-service/v1/chat/report"
    .end annotation
.end method

.method public abstract sendMessageStatus(Lcom/whoop/community/data/network/MessageStatus;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/community/data/network/MessageStatus;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/community/data/network/MessageStatus;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "community-service/v1/chat/message"
    .end annotation
.end method

.method public abstract sendUpdateMessageStatus(Ljava/lang/String;Lcom/whoop/community/data/network/MessageStatus;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "messageId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/community/data/network/MessageStatus;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/community/data/network/MessageStatus;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "community-service/v1/chat/message/{messageId}"
    .end annotation
.end method

.method public abstract updateNotificationSetting(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "notificationSetting"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "community-service/v1/communities/{communityId}/notifications/{notificationSetting}"
    .end annotation
.end method

.method public abstract updateUserOnlineStatus(IZLq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/s;
            value = "communityId"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lwg3/t;
            value = "online"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "community-service/v1/communities/{communityId}/status"
    .end annotation
.end method

.method public abstract uploadChatAttachment(Lud3/i0;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lud3/i0;
        .annotation runtime Lwg3/q;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "channelId"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "channelType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/i0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/community/data/network/AttachmentResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/l;
    .end annotation

    .annotation runtime Lwg3/o;
        value = "community-service/v1/chat/channel/{channelId}/image"
    .end annotation
.end method
