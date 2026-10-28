.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryThreadsListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ&\u0010\u000f\u001a\u00020\t2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryThreadsListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;",
        "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;",
        "threadsRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;)V",
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
        "request",
        "Ln23/h;",
        "Ll83/a0;",
        "onQueryThreadsPrecondition",
        "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;",
        "onQueryThreadsRequest",
        "Lio/getstream/chat/android/models/QueryThreadsResult;",
        "result",
        "onQueryThreadsResult",
        "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;",
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


# instance fields
.field private final threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;)V
    .locals 1

    const-string v0, "threadsRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryThreadsListenerDatabase;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    return-void
.end method


# virtual methods
.method public final onQueryThreadsPrecondition(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final onQueryThreadsRequest(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onQueryThreadsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryThreadsListenerDatabase;->threadsRepository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/QueryThreadsResult;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/QueryThreadsResult;->getThreads()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1, p3}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->insertThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v0
.end method
