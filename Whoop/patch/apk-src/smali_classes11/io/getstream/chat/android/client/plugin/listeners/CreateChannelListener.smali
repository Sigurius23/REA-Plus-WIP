.class public interface abstract Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008g\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ<\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u00a6@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J5\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000e2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0015\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;",
        "",
        "",
        "channelType",
        "channelId",
        "Lio/getstream/chat/android/client/query/CreateChannelParams;",
        "params",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "Ll83/a0;",
        "onCreateChannelRequest",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "",
        "memberIds",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Channel;",
        "result",
        "onCreateChannelResult",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onCreateChannelPrecondition",
        "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;",
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
.method public abstract onCreateChannelPrecondition(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ln23/h;"
        }
    .end annotation
.end method

.method public abstract onCreateChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/query/CreateChannelParams;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onCreateChannelResult(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
