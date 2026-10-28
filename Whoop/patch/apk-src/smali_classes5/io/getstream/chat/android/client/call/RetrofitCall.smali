.class public final Lio/getstream/chat/android/client/call/RetrofitCall;
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
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ,\u0010\u0011\u001a\u00020\u00102\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c*\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J \u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c*\u0008\u0012\u0004\u0012\u00028\u00000\u0004H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ \u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c*\u0008\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000cH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00102\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000cH\u0096@\u00a2\u0006\u0004\u0008#\u0010$R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010&R\u0014\u0010\'\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "",
        "T",
        "Lo23/d;",
        "Lpg3/e;",
        "call",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "parser",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lpg3/e;Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V",
        "Ln23/h;",
        "result",
        "Lo23/a;",
        "callback",
        "Ll83/a0;",
        "notifyResult",
        "(Ln23/h;Lo23/a;Lq83/d;)Ljava/lang/Object;",
        "",
        "toFailedResult",
        "(Ljava/lang/Throwable;)Ln23/h;",
        "Ln23/e;",
        "toFailedError",
        "(Ljava/lang/Throwable;)Ln23/e;",
        "getResult",
        "(Lpg3/e;Lq83/d;)Ljava/lang/Object;",
        "Lpg3/v0;",
        "(Lpg3/v0;Lq83/d;)Ljava/lang/Object;",
        "cancel",
        "()V",
        "execute",
        "()Ln23/h;",
        "enqueue",
        "(Lo23/a;)V",
        "await",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lpg3/e;",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "callScope",
        "Lbc3/c0;",
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
.field private final call:Lpg3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpg3/e;"
        }
    .end annotation
.end field

.field private final callScope:Lbc3/c0;

.field private final parser:Lio/getstream/chat/android/client/parser/ChatParser;


# direct methods
.method public constructor <init>(Lpg3/e;Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg3/e;",
            "Lio/getstream/chat/android/client/parser/ChatParser;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/call/RetrofitCall;->call:Lpg3/e;

    iput-object p2, p0, Lio/getstream/chat/android/client/call/RetrofitCall;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    invoke-interface {p3}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    new-instance p2, Lbc3/e2;

    invoke-direct {p2, p1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-static {p3, p2}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/call/RetrofitCall;->callScope:Lbc3/c0;

    return-void
.end method

.method public static final synthetic access$getCall$p(Lio/getstream/chat/android/client/call/RetrofitCall;)Lpg3/e;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/call/RetrofitCall;->call:Lpg3/e;

    return-object p0
.end method

.method public static final synthetic access$getCallScope$p(Lio/getstream/chat/android/client/call/RetrofitCall;)Lbc3/c0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/call/RetrofitCall;->callScope:Lbc3/c0;

    return-object p0
.end method

.method public static final synthetic access$getParser$p(Lio/getstream/chat/android/client/call/RetrofitCall;)Lio/getstream/chat/android/client/parser/ChatParser;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/call/RetrofitCall;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    return-object p0
.end method

.method public static final synthetic access$getResult(Lio/getstream/chat/android/client/call/RetrofitCall;Lpg3/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/call/RetrofitCall;->getResult(Lpg3/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getResult(Lio/getstream/chat/android/client/call/RetrofitCall;Lpg3/v0;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/call/RetrofitCall;->getResult(Lpg3/v0;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$notifyResult(Lio/getstream/chat/android/client/call/RetrofitCall;Ln23/h;Lo23/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/call/RetrofitCall;->notifyResult(Ln23/h;Lo23/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toFailedResult(Lio/getstream/chat/android/client/call/RetrofitCall;Ljava/lang/Throwable;)Ln23/h;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->toFailedResult(Ljava/lang/Throwable;)Ln23/h;

    move-result-object p0

    return-object p0
.end method

.method private final getResult(Lpg3/e;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg3/e;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/call/RetrofitCall;->callScope:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;-><init>(Lio/getstream/chat/android/client/call/RetrofitCall;Lpg3/e;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final getResult(Lpg3/v0;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg3/v0<",
            "TT;>;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/call/RetrofitCall;->callScope:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;-><init>(Lpg3/v0;Lio/getstream/chat/android/client/call/RetrofitCall;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final notifyResult(Ln23/h;Lo23/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lo23/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/call/RetrofitCall$notifyResult$2;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p1, v2}, Lio/getstream/chat/android/client/call/RetrofitCall$notifyResult$2;-><init>(Lo23/a;Ln23/h;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final toFailedError(Ljava/lang/Throwable;)Ln23/e;
    .locals 10

    instance-of v0, p1, Lio/getstream/chat/android/client/errors/ChatRequestError;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/errors/ChatRequestError;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/errors/ChatRequestError;->getStreamCode()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lio/getstream/chat/android/client/errors/ChatRequestError;->getStatusCode()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    new-instance v3, Ln23/c;

    invoke-direct {v3, v2, v1, v0, p1}, Ln23/c;-><init>(Ljava/lang/String;IILjava/lang/Throwable;)V

    return-object v3

    :cond_0
    sget-object v5, Lio/getstream/chat/android/client/errors/ChatErrorCode;->NETWORK_FAILED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/4 v8, 0x2

    const/4 v9, 0x0

    sget-object v4, Ln23/c;->e:Ln23/b;

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v4 .. v9}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->fromChatErrorCode$default(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;ILjava/lang/Object;)Ln23/c;

    move-result-object p1

    return-object p1
.end method

.method private final toFailedResult(Ljava/lang/Throwable;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    new-instance v0, Ln23/f;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->toFailedError(Ljava/lang/Throwable;)Ln23/e;

    move-result-object p1

    invoke-direct {v0, p1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0
.end method


# virtual methods
.method public await(Lq83/d;)Ljava/lang/Object;
    .locals 2
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

    new-instance v0, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;-><init>(Lio/getstream/chat/android/client/call/RetrofitCall;Lq83/d;)V

    invoke-static {v0, p1}, Lo23/c;->b(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/call/RetrofitCall;->call:Lpg3/e;

    invoke-interface {v0}, Lpg3/e;->cancel()V

    iget-object v0, p0, Lio/getstream/chat/android/client/call/RetrofitCall;->callScope:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->l(Lq83/j;)V

    return-void
.end method

.method public enqueue()V
    .locals 0

    .line 1
    invoke-static {p0}, Lo23/f;->c(Lio/getstream/chat/android/client/call/RetrofitCall;)V

    return-void
.end method

.method public enqueue(Lo23/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/a;",
            ")V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/call/RetrofitCall;->callScope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/call/RetrofitCall$enqueue$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/call/RetrofitCall$enqueue$1;-><init>(Lio/getstream/chat/android/client/call/RetrofitCall;Lo23/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public execute()Ln23/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln23/h;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/call/RetrofitCall$execute$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/call/RetrofitCall$execute$1;-><init>(Lio/getstream/chat/android/client/call/RetrofitCall;Lq83/d;)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln23/h;

    return-object v0
.end method
