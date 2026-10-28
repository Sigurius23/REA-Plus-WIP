.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u00b7\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\"\u0010\u000b\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012$\u0010\r\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012$\u0010\u000f\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012$\u0010\u0011\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J&\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00072\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0017H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001e\u0010 \u001a\u00020\u00192\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u0017H\u0096@\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008#\u0010$J\u001e\u0010&\u001a\u00020\u00192\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0017H\u0096@\u00a2\u0006\u0004\u0008&\u0010!J\u001a\u0010\'\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\'\u0010\u001dJ$\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00172\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0017H\u0096@\u00a2\u0006\u0004\u0008)\u0010!J\u0018\u0010+\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008+\u0010\u001dJ\u0010\u0010,\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0004\u0008,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010/R0\u0010\u000b\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u00100R2\u0010\r\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u00100R2\u0010\u000f\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u00100R2\u0010\u0011\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u00100R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103\u00a8\u00064"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;",
        "threadDao",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;",
        "threadOrderDao",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "Lio/getstream/chat/android/models/Channel;",
        "getChannel",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "getDraftMessage",
        "",
        "cacheSize",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;Lc93/m;Lc93/m;Lc93/m;Lc93/m;I)V",
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
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;",
        "Lc93/m;",
        "Landroid/util/LruCache;",
        "cache",
        "Landroid/util/LruCache;",
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
.field private final cache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation
.end field

.field private final getChannel:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final getDraftMessage:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final getMessage:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final getUser:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final threadDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

.field private final threadOrderDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;Lc93/m;Lc93/m;Lc93/m;Lc93/m;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "I)V"
        }
    .end annotation

    const-string v0, "threadDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadOrderDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getUser"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getChannel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getDraftMessage"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadOrderDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getUser:Lc93/m;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getMessage:Lc93/m;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getChannel:Lc93/m;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getDraftMessage:Lc93/m;

    .line 8
    new-instance p1, Landroid/util/LruCache;

    invoke-direct {p1, p7}, Landroid/util/LruCache;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;Lc93/m;Lc93/m;Lc93/m;Lc93/m;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/16 v0, 0x3e8

    move v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move/from16 v8, p7

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;Lc93/m;Lc93/m;Lc93/m;Lc93/m;I)V

    return-void
.end method


# virtual methods
.method public final clear(Lq83/d;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$clear$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$clear$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$clear$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$clear$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$clear$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$clear$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$clear$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$clear$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    invoke-virtual {p1}, Landroid/util/LruCache;->evictAll()V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$clear$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadOrderDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$clear$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannelThreads(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;->deleteThreads(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertThreadOrder(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 2
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadOrderDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;

    invoke-direct {v1, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v1, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;->insertThreadOrder(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Thread;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Thread;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;->toEntity(Lio/getstream/chat/android/models/Thread;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    invoke-interface {p1, v0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;->insertThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final selectThread(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;->label:I

    const/4 v7, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    invoke-virtual {p2, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Thread;

    if-nez p2, :cond_7

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    iput-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;->L$0:Ljava/lang/Object;

    iput v3, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;->label:I

    invoke-interface {p2, p1, v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;->selectThread(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    move-object v1, p2

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    if-eqz v1, :cond_6

    move p2, v2

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getUser:Lc93/m;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getMessage:Lc93/m;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getChannel:Lc93/m;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getDraftMessage:Lc93/m;

    iput-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;->L$0:Ljava/lang/Object;

    iput p2, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThread$1;->label:I

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    :goto_4
    check-cast p2, Lio/getstream/chat/android/models/Thread;

    goto :goto_5

    :cond_6
    move-object p2, v7

    :goto_5
    if-nez p2, :cond_7

    return-object v7

    :cond_7
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    invoke-virtual {v0, p1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final selectThreadOrder(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreadOrder$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreadOrder$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreadOrder$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreadOrder$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreadOrder$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreadOrder$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreadOrder$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreadOrder$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreadOrder$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadOrderDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreadOrder$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreadOrder$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;->selectThreadOrder(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;->getOrder()Ljava/util/List;

    move-result-object v3

    :cond_4
    if-nez v3, :cond_5

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_5
    return-object v3
.end method

.method public final selectThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 17
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

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$2:I

    iget v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$1:I

    iget v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$0:I

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$8:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$5:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$4:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$3:Ljava/lang/Object;

    check-cast v12, Ljava/util/Collection;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$2:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$0:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$4:I

    iget v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$3:I

    iget v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$2:I

    iget v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$1:I

    iget v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$0:I

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$8:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$5:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$4:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$3:Ljava/lang/Object;

    check-cast v14, Ljava/util/Collection;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$2:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$1:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$0:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v14

    move-object v14, v2

    move v2, v4

    move v4, v10

    move v10, v12

    move-object v12, v15

    move v15, v11

    move-object v11, v13

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v9, v7

    move v10, v9

    move v11, v10

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    invoke-virtual {v13, v12}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lio/getstream/chat/android/models/Thread;

    if-nez v13, :cond_7

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$4:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$6:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$7:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$8:Ljava/lang/Object;

    iput v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$0:I

    iput v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$1:I

    iput v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$2:I

    iput v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$3:I

    iput v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$4:I

    iput v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->label:I

    invoke-interface {v13, v12, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;->selectThread(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_4

    goto :goto_3

    :cond_4
    move v14, v11

    move-object v11, v1

    move-object v1, v12

    move-object v12, v4

    move v4, v14

    move-object v14, v2

    move v2, v7

    move v15, v10

    move v10, v9

    move v9, v2

    :goto_2
    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    if-eqz v1, :cond_6

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getUser:Lc93/m;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getMessage:Lc93/m;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getChannel:Lc93/m;

    move-object/from16 v16, v13

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getDraftMessage:Lc93/m;

    iput-object v8, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$0:Ljava/lang/Object;

    iput-object v8, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$1:Ljava/lang/Object;

    iput-object v8, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$2:Ljava/lang/Object;

    iput-object v12, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$3:Ljava/lang/Object;

    iput-object v8, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$4:Ljava/lang/Object;

    iput-object v11, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$5:Ljava/lang/Object;

    iput-object v8, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$6:Ljava/lang/Object;

    iput-object v8, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$7:Ljava/lang/Object;

    iput-object v8, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->L$8:Ljava/lang/Object;

    iput v10, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$0:I

    iput v15, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$1:I

    iput v4, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$2:I

    iput v9, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$3:I

    iput v2, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->I$4:I

    iput v5, v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$selectThreads$1;->label:I

    move-object v9, v1

    move-object v2, v11

    move-object v1, v12

    move-object v11, v6

    move-object v12, v7

    move v6, v10

    move-object/from16 v10, v16

    invoke-static/range {v9 .. v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_5

    :goto_3
    return-object v3

    :cond_5
    move-object v12, v1

    move-object v11, v2

    move v10, v6

    move-object v1, v7

    move-object v2, v14

    move v9, v15

    :goto_4
    move-object v13, v1

    check-cast v13, Lio/getstream/chat/android/models/Thread;

    move v1, v10

    move v10, v9

    move v9, v1

    move-object v1, v11

    move v11, v4

    move-object v4, v12

    goto :goto_5

    :cond_6
    move v6, v10

    move-object v2, v11

    move-object v1, v12

    move v11, v4

    move v9, v6

    move-object v13, v8

    move v10, v15

    move-object v4, v1

    move-object v1, v2

    move-object v2, v14

    :cond_7
    :goto_5
    if-eqz v13, :cond_8

    invoke-interface {v4, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_8
    const/4 v6, 0x1

    const/4 v7, 0x0

    goto/16 :goto_1

    :cond_9
    check-cast v4, Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Thread;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_a
    check-cast v4, Ljava/util/List;

    return-object v4
.end method

.method public final upsertMessageInThread(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 12
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->label:I

    const/4 v7, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    const/4 v9, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v3, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    iget-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Thread;

    iget-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Thread;

    iget-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p2

    move-object p2, p1

    move-object p1, v1

    move-object v1, v11

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_5

    return-object v8

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    invoke-virtual {v1, p2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Thread;

    if-nez v1, :cond_9

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    iput-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$0:Ljava/lang/Object;

    iput-object p2, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$1:Ljava/lang/Object;

    iput v3, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->label:I

    invoke-interface {v1, p2, v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;->selectThread(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    goto :goto_5

    :cond_6
    :goto_2
    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    if-eqz v1, :cond_8

    move v3, v2

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getUser:Lc93/m;

    move v4, v3

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getMessage:Lc93/m;

    move v5, v4

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getChannel:Lc93/m;

    move v10, v5

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getDraftMessage:Lc93/m;

    iput-object p1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$0:Ljava/lang/Object;

    iput-object p2, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$1:Ljava/lang/Object;

    iput v10, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->label:I

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    goto :goto_5

    :cond_7
    move-object v11, v1

    move-object v1, p1

    move-object p1, p2

    move-object p2, v11

    :goto_3
    check-cast p2, Lio/getstream/chat/android/models/Thread;

    move-object v11, p2

    move-object p2, p1

    move-object p1, v1

    move-object v1, v11

    goto :goto_4

    :cond_8
    move-object v1, v9

    :goto_4
    if-nez v1, :cond_9

    return-object v8

    :cond_9
    invoke-static {v1, p1}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->upsertReply(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Thread;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    invoke-virtual {v1, p2, p1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;->toEntity(Lio/getstream/chat/android/models/Thread;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    move-result-object p1

    iput-object v9, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$0:Ljava/lang/Object;

    iput-object v9, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$1:Ljava/lang/Object;

    iput-object v9, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$2:Ljava/lang/Object;

    iput-object v9, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->L$3:Ljava/lang/Object;

    iput v7, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessageInThread$1;->label:I

    invoke-interface {p2, p1, v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;->insertThread(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    :goto_5
    return-object v0

    :cond_a
    :goto_6
    return-object v8
.end method

.method public final upsertMessagesInThread(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 19
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->label:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/16 v11, 0xa

    const/4 v12, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v9, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$7:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$6:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$5:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->I$1:I

    iget v5, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->I$0:I

    iget-object v9, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$11:Ljava/lang/Object;

    check-cast v9, Ljava/util/Collection;

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$10:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$8:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$7:Ljava/lang/Object;

    check-cast v14, Ljava/util/Collection;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$6:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$5:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$4:Ljava/lang/Object;

    check-cast v15, Ljava/util/Set;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$3:Ljava/lang/Object;

    check-cast v15, Ljava/util/Set;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$2:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    iget-object v7, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/util/Set;

    iget-object v7, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$0:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v18, v3

    move v10, v8

    move v3, v1

    move-object v1, v7

    move-object v7, v13

    move-object v13, v15

    goto/16 :goto_6

    :cond_3
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/util/Set;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v1

    move-object v1, v5

    goto/16 :goto_4

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-static {v5}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_7

    goto/16 :goto_f

    :cond_7
    move-object v5, v2

    check-cast v5, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    invoke-virtual {v14, v13}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lio/getstream/chat/android/models/Thread;

    if-eqz v13, :cond_8

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v7, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v5, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v14}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    invoke-static {v5}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v2, v5}, Ldt/b;->z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_b

    sget-object v2, Lm83/y;->w:Lm83/y;

    goto/16 :goto_7

    :cond_b
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    check-cast v2, Ljava/util/Collection;

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$0:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$1:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$2:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$3:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$4:Ljava/lang/Object;

    iput v9, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->label:I

    invoke-interface {v5, v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;->selectThreads(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_c

    goto/16 :goto_e

    :cond_c
    :goto_4
    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v9, v5

    move-object v13, v7

    move v5, v10

    move-object v7, v2

    move v2, v5

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    move-object v15, v14

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getUser:Lc93/m;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getMessage:Lc93/m;

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getChannel:Lc93/m;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->getDraftMessage:Lc93/m;

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$0:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$1:Ljava/lang/Object;

    iput-object v13, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$2:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$3:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$4:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$5:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$6:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$7:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$8:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$9:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$10:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$11:Ljava/lang/Object;

    iput v5, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->I$0:I

    iput v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->I$1:I

    iput v10, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->I$2:I

    const/4 v10, 0x2

    iput v10, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->label:I

    move-object/from16 v18, v3

    move-object/from16 v17, v8

    move-object v3, v13

    move-object/from16 v13, v16

    move-object/from16 v16, v11

    invoke-static/range {v13 .. v18}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_d

    goto/16 :goto_e

    :cond_d
    move-object v13, v3

    move-object v14, v9

    move v3, v2

    move-object v2, v8

    :goto_6
    check-cast v2, Lio/getstream/chat/android/models/Thread;

    invoke-interface {v9, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v3

    move v8, v10

    move-object v9, v14

    move-object/from16 v3, v18

    const/4 v10, 0x0

    const/16 v11, 0xa

    goto :goto_5

    :cond_e
    move-object/from16 v18, v3

    move-object v3, v13

    move-object v2, v9

    check-cast v2, Ljava/util/List;

    move-object v7, v3

    move-object/from16 v3, v18

    :goto_7
    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_f
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_f

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_11

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    check-cast v10, Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_12
    check-cast v7, Ljava/util/Collection;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v7, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    new-instance v5, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_13

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_13

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/models/Message;

    invoke-static {v7, v9}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->upsertReply(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Thread;

    move-result-object v7

    goto :goto_b

    :cond_13
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_14
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Thread;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->cache:Landroid/util/LruCache;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8, v2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :cond_15
    new-instance v1, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Thread;

    invoke-static {v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;->toEntity(Lio/getstream/chat/android/models/Thread;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_16
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;->threadDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$0:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$2:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$3:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$4:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$5:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$6:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$7:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$8:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$9:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$10:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->L$11:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository$upsertMessagesInThread$1;->label:I

    invoke-interface {v2, v1, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;->insertThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_17

    :goto_e
    return-object v4

    :cond_17
    :goto_f
    return-object v6
.end method
