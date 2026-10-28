.class public final Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\"\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B;\u0012(\u0010\u0007\u001a$\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ.\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001e\u0010\u001a\u001a\u00020\u00112\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0003H\u0086@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR6\u0010\u0007\u001a$\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\"0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R&\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;",
        "",
        "Lkotlin/Function2;",
        "",
        "",
        "Lq83/d;",
        "Llive/hms/video/sessionstore/SetMetadataListenerResult;",
        "addKeyChangeListener",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lc93/m;Lbc3/c0;)V",
        "forKeys",
        "Llive/hms/video/sessionstore/HMSKeyChangeListener;",
        "keyChangeListener",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "hmsActionResultListener",
        "Ll83/a0;",
        "setKeyChangeListener",
        "(Ljava/util/List;Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;",
        "listener",
        "Lbc3/k1;",
        "removeKeyChangeListener",
        "(Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sessionstore/SessionMetadataResult;",
        "updates",
        "sendKeyChangeUpdates",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lc93/m;",
        "Lbc3/c0;",
        "Lmc3/a;",
        "keyChangeMutex",
        "Lmc3/a;",
        "",
        "",
        "keyToListenersMap",
        "Ljava/util/Map;",
        "listenerToKeysMap",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final addKeyChangeListener:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final keyChangeMutex:Lmc3/a;

.field private final keyToListenersMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Llive/hms/video/sessionstore/HMSKeyChangeListener;",
            ">;>;"
        }
    .end annotation
.end field

.field private final listenerToKeysMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Llive/hms/video/sessionstore/HMSKeyChangeListener;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lc93/m;Lbc3/c0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    const-string v0, "addKeyChangeListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->addKeyChangeListener:Lc93/m;

    iput-object p2, p0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->scope:Lbc3/c0;

    .line 2
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyChangeMutex:Lmc3/a;

    .line 3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyToListenersMap:Ljava/util/Map;

    .line 4
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->listenerToKeysMap:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lc93/m;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 5
    sget-object p2, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    :cond_0
    invoke-direct {p0, p1, p2}, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;-><init>(Lc93/m;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic access$getAddKeyChangeListener$p(Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;)Lc93/m;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->addKeyChangeListener:Lc93/m;

    return-object p0
.end method

.method public static synthetic removeKeyChangeListener$default(Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->removeKeyChangeListener(Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final removeKeyChangeListener(Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sessionstore/HMSKeyChangeListener;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Lbc3/k1;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;

    iget v1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;

    invoke-direct {v0, p0, p3}, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;-><init>(Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object p2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->L$2:Ljava/lang/Object;

    check-cast p2, Llive/hms/video/sdk/HMSActionResultListener;

    iget-object v1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->L$1:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/sessionstore/HMSKeyChangeListener;

    iget-object v0, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p3, p1

    move-object p1, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyChangeMutex:Lmc3/a;

    iput-object p0, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$1;->label:I

    invoke-interface {p3, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->listenerToKeysMap:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_6

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyToListenersMap:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    if-eqz v4, :cond_4

    invoke-static {p1, v4}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v4

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_4
    move-object v4, v1

    :goto_3
    if-eqz v4, :cond_5

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    iget-object v5, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyToListenersMap:Ljava/util/Map;

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    iget-object v4, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyToListenersMap:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    iget-object p1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyToListenersMap:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iget-object v2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->scope:Lbc3/c0;

    new-instance v3, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$2$2;

    invoke-direct {v3, v0, p1, p2, v1}, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$removeKeyChangeListener$2$2;-><init>(Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v2, v1, v1, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p3, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :goto_4
    invoke-interface {p3, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final sendKeyChangeUpdates(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sessionstore/SessionMetadataResult;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;

    iget v1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;

    invoke-direct {v0, p0, p2}, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;-><init>(Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyChangeMutex:Lmc3/a;

    iput-object p0, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$1;->label:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 v1, 0x0

    :try_start_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sessionstore/SessionMetadataResult;

    iget-object v3, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyToListenersMap:Ljava/util/Map;

    invoke-virtual {v2}, Llive/hms/video/sessionstore/SessionMetadataResult;->getKey()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    if-eqz v3, :cond_4

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llive/hms/video/sessionstore/HMSKeyChangeListener;

    iget-object v5, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->scope:Lbc3/c0;

    new-instance v6, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$2$1$1$1;

    invoke-direct {v6, v2, v4, v1}, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$sendKeyChangeUpdates$2$1$1$1;-><init>(Llive/hms/video/sessionstore/SessionMetadataResult;Llive/hms/video/sessionstore/HMSKeyChangeListener;Lq83/d;)V

    const/4 v4, 0x3

    invoke-static {v5, v1, v1, v6, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :goto_3
    invoke-interface {p2, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final setKeyChangeListener(Ljava/util/List;Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Llive/hms/video/sessionstore/HMSKeyChangeListener;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;

    iget v1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;

    invoke-direct {v0, p0, p4}, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;-><init>(Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object p2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->L$3:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Llive/hms/video/sdk/HMSActionResultListener;

    iget-object p2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->L$2:Ljava/lang/Object;

    check-cast p2, Llive/hms/video/sessionstore/HMSKeyChangeListener;

    iget-object v1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p4, p1

    move-object p1, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyChangeMutex:Lmc3/a;

    iput-object p0, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->L$3:Ljava/lang/Object;

    iput-object p4, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->L$4:Ljava/lang/Object;

    iput v3, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$1;->label:I

    invoke-interface {p4, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyToListenersMap:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v2, v3}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v2

    iget-object v3, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->listenerToKeysMap:Ljava/util/Map;

    invoke-interface {v3, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyToListenersMap:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    iget-object v5, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyToListenersMap:Ljava/util/Map;

    if-eqz v4, :cond_4

    invoke-static {p2, v4}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v4

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-static {p2}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    :goto_3
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    iget-object p1, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->keyToListenersMap:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-nez v2, :cond_6

    iget-object p2, v0, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;->scope:Lbc3/c0;

    new-instance v3, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$updateNeeded$1$2;

    invoke-direct {v3, v0, p1, p3, v1}, Llive/hms/video/sessionstore/SessionStoreKeyChangeManager$setKeyChangeListener$updateNeeded$1$2;-><init>(Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p2, v1, v1, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    invoke-interface {p4, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    if-eqz v2, :cond_7

    invoke-interface {p3}, Llive/hms/video/sdk/HMSActionResultListener;->onSuccess()V

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_4
    invoke-interface {p4, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
