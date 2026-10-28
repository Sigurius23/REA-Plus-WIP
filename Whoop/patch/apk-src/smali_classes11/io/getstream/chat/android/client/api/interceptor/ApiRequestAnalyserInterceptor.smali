.class public final Lio/getstream/chat/android/client/api/interceptor/ApiRequestAnalyserInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/interceptor/ApiRequestAnalyserInterceptor;",
        "Lud3/g0;",
        "Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;",
        "requestsAnalyser",
        "<init>",
        "(Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;)V",
        "Lio/getstream/chat/android/client/api/interceptor/StringOutputStream;",
        "stringOutputStream",
        "Lne3/h;",
        "buffer",
        "Ll83/a0;",
        "writeRequestBody",
        "(Lio/getstream/chat/android/client/api/interceptor/StringOutputStream;Lne3/h;)V",
        "Lud3/f0;",
        "chain",
        "Lud3/x0;",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
        "Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;",
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
.field private final requestsAnalyser:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;)V
    .locals 1

    const-string v0, "requestsAnalyser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/interceptor/ApiRequestAnalyserInterceptor;->requestsAnalyser:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;

    return-void
.end method

.method private final writeRequestBody(Lio/getstream/chat/android/client/api/interceptor/StringOutputStream;Lne3/h;)V
    .locals 4
    .annotation runtime Lio/getstream/chat/android/core/internal/StreamHandsOff;
        reason = "Request body shouldn\'t be written entirely as it might produce OutOfMemory exceptions when sending big files. The output will be limited to 1048576 bytes."
    .end annotation

    iget-wide v0, p2, Lne3/h;->x:J

    const-wide/32 v2, 0x100000

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-virtual {p2, p1, v0, v1}, Lne3/h;->s1(Ljava/io/OutputStream;J)V

    return-void
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 6

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    new-instance v1, Lne3/h;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lio/getstream/chat/android/client/api/interceptor/StringOutputStream;

    invoke-direct {v2}, Lio/getstream/chat/android/client/api/interceptor/StringOutputStream;-><init>()V

    iget-object v3, v0, Lud3/o0;->d:Lud3/v0;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v1}, Lud3/v0;->writeTo(Lne3/i;)V

    :cond_0
    invoke-direct {p0, v2, v1}, Lio/getstream/chat/android/client/api/interceptor/ApiRequestAnalyserInterceptor;->writeRequestBody(Lio/getstream/chat/android/client/api/interceptor/StringOutputStream;Lne3/h;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/interceptor/ApiRequestAnalyserInterceptor;->requestsAnalyser:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;

    iget-object v3, v0, Lud3/o0;->a:Lud3/e0;

    iget-object v3, v3, Lud3/e0;->i:Ljava/lang/String;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/api/interceptor/StringOutputStream;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    const-string v5, "body"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;->registerRequest(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1
.end method
