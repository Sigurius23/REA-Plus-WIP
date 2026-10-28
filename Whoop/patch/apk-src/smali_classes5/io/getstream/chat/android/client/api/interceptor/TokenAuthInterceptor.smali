.class public final Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\'\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0015R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;",
        "Lud3/g0;",
        "Lio/getstream/chat/android/client/token/TokenManager;",
        "tokenManager",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "parser",
        "Lkotlin/Function0;",
        "",
        "isAnonymous",
        "<init>",
        "(Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/parser/ChatParser;Lc93/a;)V",
        "Lud3/o0;",
        "request",
        "addTokenHeader",
        "(Lud3/o0;)Lud3/o0;",
        "Lud3/f0;",
        "chain",
        "Lud3/x0;",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
        "Lio/getstream/chat/android/client/token/TokenManager;",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "Lc93/a;",
        "Companion",
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


# static fields
.field public static final AUTH_HEADER:Ljava/lang/String; = "Authorization"

.field public static final Companion:Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor$Companion;


# instance fields
.field private final isAnonymous:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final parser:Lio/getstream/chat/android/client/parser/ChatParser;

.field private final tokenManager:Lio/getstream/chat/android/client/token/TokenManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->Companion:Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/parser/ChatParser;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/token/TokenManager;",
            "Lio/getstream/chat/android/client/parser/ChatParser;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "tokenManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAnonymous"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    iput-object p3, p0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->isAnonymous:Lc93/a;

    return-void
.end method

.method private final addTokenHeader(Lud3/o0;)Lud3/o0;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    invoke-interface {v0}, Lio/getstream/chat/android/client/token/TokenManager;->getToken()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Lud3/o0;->b()Lud3/n0;

    move-result-object p1

    const-string v1, "Authorization"

    invoke-virtual {p1, v1, v0}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lud3/o0;

    invoke-direct {v1, p1}, Lud3/o0;-><init>(Lud3/n0;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    new-instance v1, Lio/getstream/chat/android/client/errors/ChatRequestError;

    sget-object v2, Lio/getstream/chat/android/client/errors/ChatErrorCode;->INVALID_TOKEN:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getDescription()Ljava/lang/String;

    move-result-object v3

    const-string v4, ": \'"

    const-string v5, "\'"

    invoke-static {v3, v4, v0, v5}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getCode()I

    move-result v2

    const/4 v3, -0x1

    invoke-direct {v1, v0, v2, v3, p1}, Lio/getstream/chat/android/client/errors/ChatRequestError;-><init>(Ljava/lang/String;IILjava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 7

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->isAnonymous:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    invoke-interface {v0}, Lio/getstream/chat/android/client/token/TokenManager;->hasTokenProvider()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    invoke-interface {v0}, Lio/getstream/chat/android/client/token/TokenManager;->ensureTokenLoaded()V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->addTokenHeader(Lud3/o0;)Lud3/o0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object v1

    iget-boolean v2, v1, Lud3/x0;->Q:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    invoke-interface {v2, v1}, Lio/getstream/chat/android/client/parser/ChatParser;->toError(Lud3/x0;)Ln23/c;

    move-result-object v2

    invoke-virtual {v2}, Ln23/c;->d()I

    move-result v3

    sget-object v4, Lio/getstream/chat/android/client/errors/ChatErrorCode;->TOKEN_EXPIRED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-virtual {v4}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getCode()I

    move-result v4

    if-ne v3, v4, :cond_1

    iget-object v2, p0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    invoke-interface {v2}, Lio/getstream/chat/android/client/token/TokenManager;->expireToken()V

    iget-object v2, p0, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    invoke-interface {v2}, Lio/getstream/chat/android/client/token/TokenManager;->loadSync()Ljava/lang/String;

    invoke-virtual {v1}, Lud3/x0;->close()V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/api/interceptor/TokenAuthInterceptor;->addTokenHeader(Lud3/o0;)Lud3/o0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lio/getstream/chat/android/client/errors/ChatRequestError;

    invoke-virtual {v2}, Ln23/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Ln23/c;->d()I

    move-result v1

    invoke-virtual {v2}, Ln23/c;->e()I

    move-result v3

    invoke-virtual {v2}, Ln23/c;->c()Ljava/lang/Throwable;

    move-result-object v2

    invoke-direct {p1, v0, v1, v3, v2}, Lio/getstream/chat/android/client/errors/ChatRequestError;-><init>(Ljava/lang/String;IILjava/lang/Throwable;)V

    throw p1

    :cond_2
    return-object v1

    :cond_3
    sget-object p1, Lio/getstream/chat/android/client/errors/ChatErrorCode;->UNDEFINED_TOKEN:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getCode()I

    move-result v2

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatRequestError;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/errors/ChatRequestError;-><init>(Ljava/lang/String;IILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method
