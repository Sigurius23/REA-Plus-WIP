.class public interface abstract Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u00002\u00020\u0001JU\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nH&\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000f\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;",
        "",
        "Lo23/d;",
        "Lio/getstream/chat/android/models/Channel;",
        "originalCall",
        "",
        "channelType",
        "channelId",
        "",
        "memberIds",
        "",
        "extraData",
        "Lo23/q;",
        "onCreateChannelError",
        "(Lo23/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/q;",
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


# virtual methods
.method public abstract onCreateChannelError(Lo23/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/d;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lo23/q;"
        }
    .end annotation
.end method
