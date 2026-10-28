.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ.\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000e2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0080@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J6\u0010\u0016\u001a\u00020\u00132\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000eH\u0080@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J$\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000e2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000eH\u0080@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;",
        "",
        "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;",
        "repository",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;)V",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Thread;",
        "sort",
        "",
        "queryId",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Ljava/lang/String;",
        "",
        "getLocalThreadsOrder$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;",
        "getLocalThreadsOrder",
        "order",
        "Ll83/a0;",
        "setLocalThreadsOrder$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "setLocalThreadsOrder",
        "ids",
        "getLocalThreads$stream_chat_android_client_release",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "getLocalThreads",
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
.field private final repository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;->repository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    return-void
.end method

.method private final queryId(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final getLocalThreads$stream_chat_android_client_release(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;->repository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->selectThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getLocalThreadsOrder$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;->queryId(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;->repository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    invoke-interface {p2, p1, p3}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->selectThreadOrder(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setLocalThreadsOrder$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;",
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

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;->queryId(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;->repository:Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    invoke-interface {p2, p1, p3, p4}, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;->insertThreadOrder(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
