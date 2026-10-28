.class final Lio/getstream/chat/android/client/scope/user/UserJobImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/u;
.implements Lio/getstream/chat/android/client/scope/user/UserJob;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u000c\u0012\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u000f\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J7\u0010\u0018\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0015H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J*\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u001a*\u00020\u00162\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u001f2\n\u0010\u001c\u001a\u0006\u0012\u0002\u0008\u00030\u001bH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u0096\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0018\u0010)\u001a\u00020$2\u0006\u0010(\u001a\u00020\'H\u0096\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0014\u0010-\u001a\u00060+j\u0002`,H\u0097\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020$H\u0096\u0001\u00a2\u0006\u0004\u0008/\u0010&J \u00101\u001a\u00020\u00102\u000e\u00100\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0096\u0001\u00a2\u0006\u0004\u00081\u00102J\u0010\u00101\u001a\u00020\u0010H\u0097\u0001\u00a2\u0006\u0004\u00081\u00103J\u001a\u00101\u001a\u00020$2\u0008\u00100\u001a\u0004\u0018\u00010\'H\u0097\u0001\u00a2\u0006\u0004\u00081\u0010*J\u0010\u00104\u001a\u00020\u0010H\u0096A\u00a2\u0006\u0004\u00084\u00105J*\u0010:\u001a\u0002092\u0018\u00108\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\'\u0012\u0004\u0012\u00020\u001006j\u0002`7H\u0096\u0001\u00a2\u0006\u0004\u0008:\u0010;J:\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0018\u00108\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\'\u0012\u0004\u0012\u00020\u001006j\u0002`7H\u0097\u0001\u00a2\u0006\u0004\u0008:\u0010>J\u0018\u0010A\u001a\u00020?2\u0006\u0010@\u001a\u00020?H\u0097\u0003\u00a2\u0006\u0004\u0008A\u0010BJ\u0018\u0010A\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020\u001fH\u0096\u0003\u00a2\u0006\u0004\u0008A\u0010DR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010ER\"\u0010\u0007\u001a\u0010\u0012\u000c\u0012\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010FR\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008H\u0010I\u001a\u0004\u0008J\u0010KR\u0016\u0010O\u001a\u0004\u0018\u00010?8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010NR\u0014\u0010P\u001a\u00020$8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010&R\u0014\u0010Q\u001a\u00020$8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010&R\u0014\u0010R\u001a\u00020$8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008R\u0010&R\u001a\u0010V\u001a\u0008\u0012\u0004\u0012\u00020?0S8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010UR\u0014\u0010Z\u001a\u00020W8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010YR\u0018\u0010\u001c\u001a\u0006\u0012\u0002\u0008\u00030\u001b8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008[\u0010\\\u00a8\u0006]"
    }
    d2 = {
        "Lio/getstream/chat/android/client/scope/user/UserJobImpl;",
        "Lbc3/u;",
        "Lio/getstream/chat/android/client/scope/user/UserJob;",
        "delegate",
        "Lkotlin/Function0;",
        "",
        "Lio/getstream/chat/android/models/UserId;",
        "getUserId",
        "<init>",
        "(Lbc3/u;Lc93/a;)V",
        "Lbc3/r;",
        "child",
        "Lbc3/p;",
        "attachChild",
        "(Lbc3/r;)Lbc3/p;",
        "userId",
        "Ll83/a0;",
        "cancelChildren",
        "(Ljava/lang/String;)V",
        "R",
        "initial",
        "Lkotlin/Function2;",
        "Lq83/h;",
        "operation",
        "fold",
        "(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;",
        "E",
        "Lq83/i;",
        "key",
        "get",
        "(Lq83/i;)Lq83/h;",
        "Lq83/j;",
        "minusKey",
        "(Lq83/i;)Lq83/j;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "complete",
        "()Z",
        "",
        "exception",
        "completeExceptionally",
        "(Ljava/lang/Throwable;)Z",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "getCancellationException",
        "()Ljava/util/concurrent/CancellationException;",
        "start",
        "cause",
        "cancel",
        "(Ljava/util/concurrent/CancellationException;)V",
        "()V",
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
        "context",
        "(Lq83/j;)Lq83/j;",
        "Lbc3/u;",
        "Lc93/a;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private final delegate:Lbc3/u;

.field private final getUserId:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Lbc3/u;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/u;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getUserId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    iput-object p2, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->getUserId:Lc93/a;

    const-string p1, "Chat:UserJob"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->logger$delegate:Ll83/h;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final attachChild(Lbc3/r;)Lbc3/p;
    .locals 3

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->getUserId:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    new-instance v2, Lio/getstream/chat/android/client/scope/user/UserChildJob;

    invoke-direct {v2, v0, p1}, Lio/getstream/chat/android/client/scope/user/UserChildJob;-><init>(Ljava/lang/String;Lbc3/r;)V

    invoke-interface {v1, v2}, Lbc3/k1;->attachChild(Lbc3/r;)Lbc3/p;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic cancel()V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0}, Lbc3/k1;->cancel()V

    return-void
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0, p1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final synthetic cancel(Ljava/lang/Throwable;)Z
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0, p1}, Lbc3/k1;->cancel(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final cancelChildren(Ljava/lang/String;)V
    .locals 8

    invoke-direct {p0}, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[cancelChildren] userId: \'"

    const-string v4, "\'"

    invoke-static {v3, p1, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0}, Lbc3/k1;->getChildren()Lxb3/i;

    move-result-object v0

    invoke-interface {v0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    instance-of v2, v1, Lio/getstream/chat/android/client/scope/user/UserChildJob;

    const-string v3, ")"

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/scope/user/UserChildJob;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/scope/user/UserChildJob;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->getLogger()Lb23/k;

    move-result-object v2

    invoke-virtual {v2}, Lb23/k;->c()Lb23/e;

    move-result-object v4

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Lb23/k;->a()Lb23/j;

    move-result-object v4

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[cancelChildren] skip child: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v5, v2, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->getLogger()Lb23/k;

    move-result-object v2

    invoke-virtual {v2}, Lb23/k;->c()Lb23/e;

    move-result-object v4

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v2}, Lb23/k;->a()Lb23/j;

    move-result-object v4

    invoke-virtual {v2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[cancelChildren] cancel child: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v5, v2, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto/16 :goto_0

    :cond_4
    return-void
.end method

.method public final complete()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0}, Lbc3/u;->complete()Z

    move-result v0

    return v0
.end method

.method public final completeExceptionally(Ljava/lang/Throwable;)Z
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0, p1}, Lbc3/u;->completeExceptionally(Ljava/lang/Throwable;)Z

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

    invoke-static {p0, p1, p2}, Le93/b;->B(Lq83/h;Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

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

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0}, Lq83/h;->getKey()Lq83/i;

    move-result-object v0

    return-object v0
.end method

.method public final getOnJoin()Llc3/c;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0}, Lbc3/k1;->getOnJoin()Llc3/c;

    move-result-object v0

    return-object v0
.end method

.method public final getParent()Lbc3/k1;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0}, Lbc3/k1;->getParent()Lbc3/k1;

    move-result-object v0

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

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0, p1, p2, p3}, Lbc3/k1;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final isActive()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0}, Lbc3/k1;->isActive()Z

    move-result v0

    return v0
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0}, Lbc3/k1;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public final isCompleted()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

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

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lbc3/k1;)Lbc3/k1;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    .line 1
    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0, p1}, Lbc3/k1;->plus(Lbc3/k1;)Lbc3/k1;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 1

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final start()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->delegate:Lbc3/u;

    invoke-interface {v0}, Lbc3/k1;->start()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;->getUserId:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "UserJob(userId="

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
