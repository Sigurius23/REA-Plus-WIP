.class public interface abstract Lio/getstream/chat/android/client/scope/user/UserJob;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/scope/user/UserJob$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0010\u0008\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0008\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/scope/user/UserJob;",
        "Lbc3/u;",
        "",
        "Lio/getstream/chat/android/models/UserId;",
        "userId",
        "Ll83/a0;",
        "cancelChildren",
        "(Ljava/lang/String;)V",
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
.method public static synthetic cancelChildren$default(Lio/getstream/chat/android/client/scope/user/UserJob;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, Lio/getstream/chat/android/client/scope/user/UserJob;->cancelChildren(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancelChildren"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract synthetic attachChild(Lbc3/r;)Lbc3/p;
.end method

.method public abstract synthetic cancel()V
    .annotation runtime Ll83/c;
    .end annotation
.end method

.method public abstract synthetic cancel(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract synthetic cancel(Ljava/lang/Throwable;)Z
    .annotation runtime Ll83/c;
    .end annotation
.end method

.method public abstract cancelChildren(Ljava/lang/String;)V
.end method

.method public abstract synthetic complete()Z
.end method

.method public abstract synthetic completeExceptionally(Ljava/lang/Throwable;)Z
.end method

.method public abstract synthetic fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
.end method

.method public abstract synthetic get(Lq83/i;)Lq83/h;
.end method

.method public abstract synthetic getCancellationException()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract synthetic getChildren()Lxb3/i;
.end method

.method public abstract synthetic getKey()Lq83/i;
.end method

.method public abstract synthetic getOnJoin()Llc3/c;
.end method

.method public abstract synthetic getParent()Lbc3/k1;
.end method

.method public abstract synthetic invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;
.end method

.method public abstract synthetic invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;
.end method

.method public abstract synthetic isActive()Z
.end method

.method public abstract synthetic isCancelled()Z
.end method

.method public abstract synthetic isCompleted()Z
.end method

.method public abstract synthetic join(Lq83/d;)Ljava/lang/Object;
.end method

.method public abstract synthetic minusKey(Lq83/i;)Lq83/j;
.end method

.method public abstract synthetic plus(Lbc3/k1;)Lbc3/k1;
    .annotation runtime Ll83/c;
    .end annotation
.end method

.method public abstract synthetic plus(Lq83/j;)Lq83/j;
.end method

.method public abstract synthetic start()Z
.end method
