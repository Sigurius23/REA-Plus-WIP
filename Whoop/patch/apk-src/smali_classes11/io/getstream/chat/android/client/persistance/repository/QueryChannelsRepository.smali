.class public interface abstract Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008g\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\r\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;",
        "",
        "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
        "queryChannelsSpec",
        "Ll83/a0;",
        "insertQueryChannels",
        "(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "identifier",
        "selectBy",
        "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;",
        "clear",
        "(Lq83/d;)Ljava/lang/Object;",
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
.method public abstract clear(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertQueryChannels(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectBy(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
