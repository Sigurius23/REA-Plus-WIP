.class public final Lio/getstream/chat/android/client/api/models/ProgressRequestBody;
.super Lud3/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/models/ProgressRequestBody;",
        "Lud3/v0;",
        "delegate",
        "Lio/getstream/chat/android/client/utils/ProgressCallback;",
        "callback",
        "<init>",
        "(Lud3/v0;Lio/getstream/chat/android/client/utils/ProgressCallback;)V",
        "Lud3/h0;",
        "contentType",
        "()Lud3/h0;",
        "",
        "contentLength",
        "()J",
        "Lne3/i;",
        "sink",
        "Ll83/a0;",
        "writeTo",
        "(Lne3/i;)V",
        "Lud3/v0;",
        "Lio/getstream/chat/android/client/utils/ProgressCallback;",
        "CountingSink",
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
.field private final callback:Lio/getstream/chat/android/client/utils/ProgressCallback;

.field private final delegate:Lud3/v0;


# direct methods
.method public constructor <init>(Lud3/v0;Lio/getstream/chat/android/client/utils/ProgressCallback;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody;->delegate:Lud3/v0;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody;->callback:Lio/getstream/chat/android/client/utils/ProgressCallback;

    return-void
.end method

.method public static final synthetic access$getCallback$p(Lio/getstream/chat/android/client/api/models/ProgressRequestBody;)Lio/getstream/chat/android/client/utils/ProgressCallback;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody;->callback:Lio/getstream/chat/android/client/utils/ProgressCallback;

    return-object p0
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody;->delegate:Lud3/v0;

    invoke-virtual {v0}, Lud3/v0;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public final contentType()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody;->delegate:Lud3/v0;

    invoke-virtual {v0}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object v0

    return-object v0
.end method

.method public final writeTo(Lne3/i;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;-><init>(Lio/getstream/chat/android/client/api/models/ProgressRequestBody;Lne3/n0;)V

    invoke-static {v0}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody;->delegate:Lud3/v0;

    invoke-virtual {v0, p1}, Lud3/v0;->writeTo(Lne3/i;)V

    invoke-virtual {p1}, Lne3/h0;->flush()V

    return-void
.end method
