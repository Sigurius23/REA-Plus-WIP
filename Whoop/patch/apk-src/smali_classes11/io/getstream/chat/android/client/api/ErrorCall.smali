.class public final Lio/getstream/chat/android/client/api/ErrorCall;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo23/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo23/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\n2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\rH\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/ErrorCall;",
        "",
        "T",
        "Lo23/d;",
        "Lbc3/c0;",
        "scope",
        "Ln23/e;",
        "e",
        "<init>",
        "(Lbc3/c0;Ln23/e;)V",
        "Ll83/a0;",
        "cancel",
        "()V",
        "Ln23/h;",
        "execute",
        "()Ln23/h;",
        "Lo23/a;",
        "callback",
        "enqueue",
        "(Lo23/a;)V",
        "await",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lbc3/c0;",
        "Ln23/e;",
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
.field private final e:Ln23/e;

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Ln23/e;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/ErrorCall;->scope:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/ErrorCall;->e:Ln23/e;

    return-void
.end method

.method public static final synthetic access$getE$p(Lio/getstream/chat/android/client/api/ErrorCall;)Ln23/e;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/api/ErrorCall;->e:Ln23/e;

    return-object p0
.end method


# virtual methods
.method public final await(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ErrorCall;->scope:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/api/ErrorCall$await$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/client/api/ErrorCall$await$2;-><init>(Lio/getstream/chat/android/client/api/ErrorCall;Lq83/d;)V

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final cancel()V
    .locals 0

    return-void
.end method

.method public final enqueue()V
    .locals 2

    .line 2
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/api/ErrorCall;->enqueue(Lo23/a;)V

    return-void
.end method

.method public final enqueue(Lo23/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/a;",
            ")V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/api/ErrorCall;->scope:Lbc3/c0;

    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/api/ErrorCall$enqueue$1;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p0, v3}, Lio/getstream/chat/android/client/api/ErrorCall$enqueue$1;-><init>(Lo23/a;Lio/getstream/chat/android/client/api/ErrorCall;Lq83/d;)V

    const/4 p1, 0x2

    invoke-static {v0, v1, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final execute()Ln23/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln23/h;"
        }
    .end annotation

    new-instance v0, Ln23/f;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ErrorCall;->e:Ln23/e;

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0
.end method
