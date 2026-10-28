.class final Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;
.super Lne3/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/api/models/ProgressRequestBody;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "CountingSink"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u000e\u001a\u0004\u0008\u0012\u0010\u0010\"\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;",
        "Lne3/r;",
        "Lne3/n0;",
        "delegate",
        "<init>",
        "(Lio/getstream/chat/android/client/api/models/ProgressRequestBody;Lne3/n0;)V",
        "Lne3/h;",
        "source",
        "",
        "byteCount",
        "Ll83/a0;",
        "write",
        "(Lne3/h;J)V",
        "total",
        "J",
        "getTotal",
        "()J",
        "uploaded",
        "getUploaded",
        "setUploaded",
        "(J)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/api/models/ProgressRequestBody;

.field private final total:J

.field private uploaded:J


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api/models/ProgressRequestBody;Lne3/n0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne3/n0;",
            ")V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;->this$0:Lio/getstream/chat/android/client/api/models/ProgressRequestBody;

    invoke-direct {p0, p2}, Lne3/r;-><init>(Lne3/n0;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/ProgressRequestBody;->contentLength()J

    move-result-wide p1

    iput-wide p1, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;->total:J

    return-void
.end method


# virtual methods
.method public final getTotal()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;->total:J

    return-wide v0
.end method

.method public final getUploaded()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;->uploaded:J

    return-wide v0
.end method

.method public final setUploaded(J)V
    .locals 0

    iput-wide p1, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;->uploaded:J

    return-void
.end method

.method public final write(Lne3/h;J)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lne3/r;->write(Lne3/h;J)V

    iget-wide v0, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;->uploaded:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;->uploaded:J

    iget-object p1, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;->this$0:Lio/getstream/chat/android/client/api/models/ProgressRequestBody;

    invoke-static {p1}, Lio/getstream/chat/android/client/api/models/ProgressRequestBody;->access$getCallback$p(Lio/getstream/chat/android/client/api/models/ProgressRequestBody;)Lio/getstream/chat/android/client/utils/ProgressCallback;

    move-result-object p1

    iget-wide p2, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;->uploaded:J

    iget-wide v0, p0, Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;->total:J

    invoke-interface {p1, p2, p3, v0, v1}, Lio/getstream/chat/android/client/utils/ProgressCallback;->onProgress(JJ)V

    return-void
.end method
