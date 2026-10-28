.class public interface abstract Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008g\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u00a6@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ4\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u00a6@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J(\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u00a6@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u00a6@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J*\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J>\u0010\u0019\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001b\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;",
        "",
        "",
        "parentId",
        "Ln23/h;",
        "Ll83/a0;",
        "onGetRepliesPrecondition",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "limit",
        "onGetRepliesRequest",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "result",
        "onGetRepliesResult",
        "(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "firstId",
        "onGetRepliesMoreRequest",
        "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "onGetRepliesMoreResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "lastId",
        "onGetNewerRepliesRequest",
        "(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "onGetNewerRepliesResult",
        "(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
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


# direct methods
.method public static synthetic onGetRepliesPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Ln23/g;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public abstract onGetNewerRepliesRequest(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onGetNewerRepliesResult(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onGetRepliesMoreRequest(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onGetRepliesMoreResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public onGetRepliesPrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;->onGetRepliesPrecondition$suspendImpl(Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract onGetRepliesRequest(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onGetRepliesResult(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
