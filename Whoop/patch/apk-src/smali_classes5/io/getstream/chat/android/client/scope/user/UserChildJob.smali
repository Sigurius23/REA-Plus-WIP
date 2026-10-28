.class final Lio/getstream/chat/android/client/scope/user/UserChildJob;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/r;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0097\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u000c2\u000e\u0010\u0016\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0096\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0017\u001a\u00020\u000cH\u0097\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0019J\u001a\u0010\u0017\u001a\u00020\u00132\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0097\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0001H\u0097\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000cH\u0096A\u00a2\u0006\u0004\u0008 \u0010!J*\u0010&\u001a\u00020%2\u0018\u0010$\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000c0\"j\u0002`#H\u0096\u0001\u00a2\u0006\u0004\u0008&\u0010\'J:\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0018\u0010$\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000c0\"j\u0002`#H\u0097\u0001\u00a2\u0006\u0004\u0008&\u0010*J\u0018\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0097\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0018\u0010-\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0096\u0003\u00a2\u0006\u0004\u0008-\u00101J*\u00106\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u00103*\u0002022\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00028\u000004H\u0096\u0003\u00a2\u0006\u0004\u00086\u00107J>\u0010=\u001a\u00028\u0000\"\n\u0008\u0000\u00109*\u0004\u0018\u0001082\u0006\u0010:\u001a\u00028\u00002\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00028\u00000;H\u0096\u0001\u00a2\u0006\u0004\u0008=\u0010>J\u001c\u0010?\u001a\u00020/2\n\u00105\u001a\u0006\u0012\u0002\u0008\u000304H\u0096\u0001\u00a2\u0006\u0004\u0008?\u0010@R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010A\u001a\u0004\u0008B\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010CR\u0016\u0010F\u001a\u0004\u0018\u00010+8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010ER\u0014\u0010G\u001a\u00020\u00138\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010\u0015R\u0014\u0010H\u001a\u00020\u00138\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010\u0015R\u0014\u0010I\u001a\u00020\u00138\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010\u0015R\u001a\u0010M\u001a\u0008\u0012\u0004\u0012\u00020+0J8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010LR\u0014\u0010Q\u001a\u00020N8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008O\u0010PR\u0018\u00105\u001a\u0006\u0012\u0002\u0008\u0003048\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008R\u0010S\u00a8\u0006T"
    }
    d2 = {
        "Lio/getstream/chat/android/client/scope/user/UserChildJob;",
        "Lbc3/r;",
        "",
        "Lio/getstream/chat/android/models/UserId;",
        "userId",
        "delegate",
        "<init>",
        "(Ljava/lang/String;Lbc3/r;)V",
        "toString",
        "()Ljava/lang/String;",
        "Lbc3/b2;",
        "parentJob",
        "Ll83/a0;",
        "parentCancelled",
        "(Lbc3/b2;)V",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "getCancellationException",
        "()Ljava/util/concurrent/CancellationException;",
        "",
        "start",
        "()Z",
        "cause",
        "cancel",
        "(Ljava/util/concurrent/CancellationException;)V",
        "()V",
        "",
        "(Ljava/lang/Throwable;)Z",
        "child",
        "Lbc3/p;",
        "attachChild",
        "(Lbc3/r;)Lbc3/p;",
        "join",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lkotlin/Function1;",
        "Lkotlinx/coroutines/CompletionHandler;",
        "handler",
        "Lbc3/s0;",
        "invokeOnCompletion",
        "(Lkotlin/jvm/functions/Function1;)Lbc3/s0;",
        "onCancelling",
        "invokeImmediately",
        "(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;",
        "Lbc3/k1;",
        "other",
        "plus",
        "(Lbc3/k1;)Lbc3/k1;",
        "Lq83/j;",
        "context",
        "(Lq83/j;)Lq83/j;",
        "Lq83/h;",
        "E",
        "Lq83/i;",
        "key",
        "get",
        "(Lq83/i;)Lq83/h;",
        "",
        "R",
        "initial",
        "Lkotlin/Function2;",
        "operation",
        "fold",
        "(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;",
        "minusKey",
        "(Lq83/i;)Lq83/j;",
        "Ljava/lang/String;",
        "getUserId",
        "Lbc3/r;",
        "getParent",
        "()Lbc3/k1;",
        "parent",
        "isActive",
        "isCompleted",
        "isCancelled",
        "Lxb3/i;",
        "getChildren",
        "()Lxb3/i;",
        "children",
        "Llc3/c;",
        "getOnJoin",
        "()Llc3/c;",
        "onJoin",
        "getKey",
        "()Lq83/i;",
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
.field private final delegate:Lbc3/r;

.field private final userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbc3/r;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->userId:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    return-void
.end method


# virtual methods
.method public final attachChild(Lbc3/r;)Lbc3/p;
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->attachChild(Lbc3/r;)Lbc3/p;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic cancel()V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->cancel()V

    return-void
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final synthetic cancel(Ljava/lang/Throwable;)Z
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->cancel(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lc93/m;",
            ")TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1, p2}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lq83/h;",
            ">(",
            "Lq83/i;",
            ")TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object v0

    return-object v0
.end method

.method public final getChildren()Lxb3/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxb3/i;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->getChildren()Lxb3/i;

    move-result-object v0

    return-object v0
.end method

.method public final getKey()Lq83/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq83/i;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0}, Lq83/h;->getKey()Lq83/i;

    move-result-object v0

    return-object v0
.end method

.method public final getOnJoin()Llc3/c;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->getOnJoin()Llc3/c;

    move-result-object v0

    return-object v0
.end method

.method public final getParent()Lbc3/k1;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->getParent()Lbc3/k1;

    move-result-object v0

    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lbc3/s0;"
        }
    .end annotation

    .line 1
    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lbc3/s0;"
        }
    .end annotation

    .line 2
    const-string v0, "handler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1, p2, p3}, Lbc3/k1;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final isActive()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->isActive()Z

    move-result v0

    return v0
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public final isCompleted()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->isCompleted()Z

    move-result v0

    return v0
.end method

.method public final join(Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/i;",
            ")",
            "Lq83/j;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1}, Lq83/j;->minusKey(Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final parentCancelled(Lbc3/b2;)V
    .locals 1

    const-string v0, "parentJob"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/r;->parentCancelled(Lbc3/b2;)V

    return-void
.end method

.method public final plus(Lbc3/k1;)Lbc3/k1;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    .line 1
    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->plus(Lbc3/k1;)Lbc3/k1;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 1

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final start()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->delegate:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->start()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserChildJob;->userId:Ljava/lang/String;

    const-string v1, "UserChildJob(userId=\'"

    const-string v2, "\')"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
