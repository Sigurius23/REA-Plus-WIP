.class public final Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api/state/QueryThreadsState;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010$\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\rJ\u001d\u0010\u0015\u001a\u00020\u000b2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0011H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u000b2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0011H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u000b2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0011H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u000b2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0000\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010%\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010(\u001a\u00020\u000b2\u0008\u0010&\u001a\u0004\u0018\u00010\u001aH\u0000\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u001aH\u0000\u00a2\u0006\u0004\u0008*\u0010\u001dJ\u000f\u0010-\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008,\u0010$J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008/\u0010\rJ\u000f\u00102\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u00081\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u00105R \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00106\u001a\u0004\u00087\u00108R0\u0010;\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000509j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0005`:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R$\u0010>\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0011\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010?R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010?R \u0010B\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010?R$\u0010D\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0C\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u0010?R\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010?R&\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00110F8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010G\u001a\u0004\u0008H\u0010IR \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0F8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010G\u001a\u0004\u0008J\u0010IR \u0010K\u001a\u0008\u0012\u0004\u0012\u00020\t0F8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008K\u0010G\u001a\u0004\u0008L\u0010IR\"\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0F8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010G\u001a\u0004\u0008M\u0010IR&\u0010N\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0C0F8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008N\u0010G\u001a\u0004\u0008O\u0010IR \u0010P\u001a\u0008\u0012\u0004\u0012\u00020\t0F8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008P\u0010G\u001a\u0004\u0008Q\u0010IR\u001d\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050R8F\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010T\u00a8\u0006V"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;",
        "Lio/getstream/chat/android/client/api/state/QueryThreadsState;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Thread;",
        "sort",
        "<init>",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V",
        "",
        "loading",
        "Ll83/a0;",
        "setLoading$stream_chat_android_client_release",
        "(Z)V",
        "setLoading",
        "setLoadingMore$stream_chat_android_client_release",
        "setLoadingMore",
        "",
        "threads",
        "setThreads$stream_chat_android_client_release",
        "(Ljava/util/List;)V",
        "setThreads",
        "insertThreadsIfAbsent$stream_chat_android_client_release",
        "insertThreadsIfAbsent",
        "upsertThreads$stream_chat_android_client_release",
        "upsertThreads",
        "",
        "threadId",
        "deleteThread$stream_chat_android_client_release",
        "(Ljava/lang/String;)V",
        "deleteThread",
        "messageId",
        "deleteMessageFromThread$stream_chat_android_client_release",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "deleteMessageFromThread",
        "clearThreads$stream_chat_android_client_release",
        "()V",
        "clearThreads",
        "next",
        "setNext$stream_chat_android_client_release",
        "setNext",
        "id",
        "addUnseenThreadId$stream_chat_android_client_release",
        "addUnseenThreadId",
        "clearUnseenThreadIds$stream_chat_android_client_release",
        "clearUnseenThreadIds",
        "error",
        "setLoadingError$stream_chat_android_client_release",
        "setLoadingError",
        "destroy$stream_chat_android_client_release",
        "destroy",
        "Lio/getstream/chat/android/models/FilterObject;",
        "getFilter",
        "()Lio/getstream/chat/android/models/FilterObject;",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "getSort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Ljava/util/LinkedHashMap;",
        "Lkotlin/collections/LinkedHashMap;",
        "_threadMap",
        "Ljava/util/LinkedHashMap;",
        "Lec3/p1;",
        "_threads",
        "Lec3/p1;",
        "_loading",
        "_loadingMore",
        "_next",
        "",
        "_unseenThreadIds",
        "_loadingError",
        "Lec3/f2;",
        "Lec3/f2;",
        "getThreads",
        "()Lec3/f2;",
        "getLoading",
        "loadingMore",
        "getLoadingMore",
        "getNext",
        "unseenThreadIds",
        "getUnseenThreadIds",
        "loadingError",
        "getLoadingError",
        "",
        "getThreadMap",
        "()Ljava/util/Map;",
        "threadMap",
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
.field private _loading:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _loadingError:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _loadingMore:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _next:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _threadMap:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation
.end field

.field private _threads:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _unseenThreadIds:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final filter:Lio/getstream/chat/android/models/FilterObject;

.field private final loading:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final loadingError:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final loadingMore:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final next:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final sort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation
.end field

.field private final threads:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final unseenThreadIds:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->filter:Lio/getstream/chat/android/models/FilterObject;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threads:Lec3/p1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loading:Lec3/p1;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loadingMore:Lec3/p1;

    const/4 p2, 0x0

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_next:Lec3/p1;

    sget-object p2, Lm83/a0;->w:Lm83/a0;

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_unseenThreadIds:Lec3/p1;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loadingError:Lec3/p1;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threads:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->threads:Lec3/f2;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loading:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->loading:Lec3/f2;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loadingMore:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->loadingMore:Lec3/f2;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_next:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->next:Lec3/f2;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_unseenThreadIds:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->unseenThreadIds:Lec3/f2;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loadingError:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->loadingError:Lec3/f2;

    return-void
.end method


# virtual methods
.method public final addUnseenThreadId$stream_chat_android_client_release(Ljava/lang/String;)V
    .locals 4

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_unseenThreadIds:Lec3/p1;

    if-eqz v0, :cond_1

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/Set;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_1
    return-void
.end method

.method public final clearThreads$stream_chat_android_client_release()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threads:Lec3/p1;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "<get-values>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v0, Lec3/h2;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final clearUnseenThreadIds$stream_chat_android_client_release()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_unseenThreadIds:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final deleteMessageFromThread$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "messageId"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Thread;

    if-nez v4, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v4}, Lio/getstream/chat/android/models/Thread;->getLatestReplies()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, -0x1

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    move v5, v7

    :goto_1
    if-le v5, v7, :cond_4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Thread;->getLatestReplies()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const v23, 0x3bfff

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v2

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/models/Thread;->copy$default(Lio/getstream/chat/android/models/Thread;ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Thread;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threads:Lec3/p1;

    if-eqz v1, :cond_4

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    const-string v3, "<get-values>(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v1, Lec3/h2;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    return-void
.end method

.method public final deleteThread$stream_chat_android_client_release(Ljava/lang/String;)V
    .locals 2

    const-string v0, "threadId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threads:Lec3/p1;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast p1, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final destroy$stream_chat_android_client_release()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threads:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loading:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loadingMore:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_next:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_unseenThreadIds:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loadingError:Lec3/p1;

    return-void
.end method

.method public final getFilter()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final getLoading()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->loading:Lec3/f2;

    return-object v0
.end method

.method public final getLoadingError()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->loadingError:Lec3/f2;

    return-object v0
.end method

.method public final getLoadingMore()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->loadingMore:Lec3/f2;

    return-object v0
.end method

.method public final getNext()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->next:Lec3/f2;

    return-object v0
.end method

.method public final getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final getThreadMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public final getThreads()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->threads:Lec3/f2;

    return-object v0
.end method

.method public final getUnseenThreadIds()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->unseenThreadIds:Lec3/f2;

    return-object v0
.end method

.method public final insertThreadsIfAbsent$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)V"
        }
    .end annotation

    const-string v0, "threads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Thread;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threads:Lec3/p1;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast p1, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final setLoading$stream_chat_android_client_release(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loading:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setLoadingError$stream_chat_android_client_release(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loadingError:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setLoadingMore$stream_chat_android_client_release(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_loadingMore:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setNext$stream_chat_android_client_release(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_next:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final setThreads$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)V"
        }
    .end annotation

    const-string v0, "threads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->upsertThreads$stream_chat_android_client_release(Ljava/util/List;)V

    return-void
.end method

.method public final upsertThreads$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)V"
        }
    .end annotation

    const-string v0, "threads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threads:Lec3/p1;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->_threadMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast p1, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
