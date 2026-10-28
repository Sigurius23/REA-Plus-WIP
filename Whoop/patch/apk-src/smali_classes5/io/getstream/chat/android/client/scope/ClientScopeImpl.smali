.class final Lio/getstream/chat/android/client/scope/ClientScopeImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/scope/ClientScope;
.implements Lbc3/c0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0008\u001a\u00020\u00058\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/client/scope/ClientScopeImpl;",
        "Lio/getstream/chat/android/client/scope/ClientScope;",
        "Lbc3/c0;",
        "<init>",
        "()V",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "coroutineContext",
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
.field private final synthetic $$delegate_0:Lbc3/c0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v1

    invoke-static {v0, v1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v0

    new-instance v1, Lo23/r;

    invoke-direct {v1}, Lo23/r;-><init>()V

    invoke-interface {v0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/scope/ClientScopeImpl;->$$delegate_0:Lbc3/c0;

    return-void
.end method


# virtual methods
.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/ClientScopeImpl;->$$delegate_0:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    return-object v0
.end method
