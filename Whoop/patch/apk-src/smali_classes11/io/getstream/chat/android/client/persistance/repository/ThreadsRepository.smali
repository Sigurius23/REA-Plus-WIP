.class public interface abstract Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008g\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00a6@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001e\u0010\r\u001a\u00020\u00062\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004H\u00a6@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\u00062\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0004H\u00a6@\u00a2\u0006\u0004\u0008\u0014\u0010\u000eJ\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0015\u0010\nJ$\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00042\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00a6@\u00a2\u0006\u0004\u0008\u0017\u0010\u000eJ\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0019\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001c\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;",
        "",
        "",
        "id",
        "",
        "order",
        "Ll83/a0;",
        "insertThreadOrder",
        "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "selectThreadOrder",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Thread;",
        "threads",
        "insertThreads",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "upsertMessageInThread",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "messages",
        "upsertMessagesInThread",
        "selectThread",
        "ids",
        "selectThreads",
        "cid",
        "deleteChannelThreads",
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

.method public abstract deleteChannelThreads(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertThreadOrder(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectThread(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectThreadOrder(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract upsertMessageInThread(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract upsertMessagesInThread(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
