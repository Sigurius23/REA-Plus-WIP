.class public final Lio/getstream/chat/android/client/api/interceptor/ProgressInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/interceptor/ProgressInterceptor;",
        "Lud3/g0;",
        "<init>",
        "()V",
        "Lud3/o0;",
        "request",
        "Lio/getstream/chat/android/client/utils/ProgressCallback;",
        "progressCallback",
        "wrapRequest",
        "(Lud3/o0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lud3/o0;",
        "Lud3/f0;",
        "chain",
        "Lud3/x0;",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final wrapRequest(Lud3/o0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lud3/o0;
    .locals 2

    invoke-virtual {p1}, Lud3/o0;->b()Lud3/n0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/api/models/ProgressRequestBody;

    iget-object p1, p1, Lud3/o0;->d:Lud3/v0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v1, p1, p2}, Lio/getstream/chat/android/client/api/models/ProgressRequestBody;-><init>(Lud3/v0;Lio/getstream/chat/android/client/utils/ProgressCallback;)V

    const-string p1, "POST"

    invoke-virtual {v0, p1, v1}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object p1
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 2

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    const-class v1, Lio/getstream/chat/android/client/utils/ProgressCallback;

    invoke-virtual {v0, v1}, Lud3/o0;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/utils/ProgressCallback;

    if-eqz v1, :cond_0

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/client/api/interceptor/ProgressInterceptor;->wrapRequest(Lud3/o0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lud3/o0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1
.end method
