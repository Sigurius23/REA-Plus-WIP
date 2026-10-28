.class public final Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;",
        "Lud3/g0;",
        "Lkotlin/Function0;",
        "",
        "isAnonymous",
        "Lio/getstream/chat/android/client/utils/HeadersUtil;",
        "headersUtil",
        "<init>",
        "(Lc93/a;Lio/getstream/chat/android/client/utils/HeadersUtil;)V",
        "Lud3/f0;",
        "chain",
        "Lud3/x0;",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
        "Lc93/a;",
        "Lio/getstream/chat/android/client/utils/HeadersUtil;",
        "",
        "userAgent$delegate",
        "Ll83/h;",
        "getUserAgent",
        "()Ljava/lang/String;",
        "userAgent",
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
.field private final headersUtil:Lio/getstream/chat/android/client/utils/HeadersUtil;

.field private final isAnonymous:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final userAgent$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Lc93/a;Lio/getstream/chat/android/client/utils/HeadersUtil;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/utils/HeadersUtil;",
            ")V"
        }
    .end annotation

    const-string v0, "isAnonymous"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headersUtil"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;->isAnonymous:Lc93/a;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;->headersUtil:Lio/getstream/chat/android/client/utils/HeadersUtil;

    new-instance p1, La6/l0;

    const/16 p2, 0x12

    invoke-direct {p1, p0, p2}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;->userAgent$delegate:Ll83/h;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;->headersUtil:Lio/getstream/chat/android/client/utils/HeadersUtil;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/utils/HeadersUtil;->buildUserAgent()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getUserAgent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;->userAgent$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final userAgent_delegate$lambda$0(Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;->headersUtil:Lio/getstream/chat/android/client/utils/HeadersUtil;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/utils/HeadersUtil;->buildUserAgent()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 4

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;->isAnonymous:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "anonymous"

    goto :goto_0

    :cond_0
    const-string v0, "jwt"

    :goto_0
    check-cast p1, Lae3/i;

    iget-object v1, p1, Lae3/i;->e:Lud3/o0;

    invoke-virtual {v1}, Lud3/o0;->b()Lud3/n0;

    move-result-object v1

    const-string v2, "User-Agent"

    invoke-direct {p0}, Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;->getUserAgent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "Content-Type"

    const-string v3, "application/json"

    invoke-virtual {v1, v2, v3}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "stream-auth-type"

    invoke-virtual {v1, v2, v0}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;->headersUtil:Lio/getstream/chat/android/client/utils/HeadersUtil;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/utils/HeadersUtil;->buildSdkTrackingHeaders$stream_chat_android_client_release()Ljava/lang/String;

    move-result-object v0

    const-string v2, "X-Stream-Client"

    invoke-virtual {v1, v2, v0}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Cache-Control"

    const-string v2, "no-cache"

    invoke-virtual {v1, v0, v2}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lud3/o0;

    invoke-direct {v0, v1}, Lud3/o0;-><init>(Lud3/n0;)V

    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1
.end method
