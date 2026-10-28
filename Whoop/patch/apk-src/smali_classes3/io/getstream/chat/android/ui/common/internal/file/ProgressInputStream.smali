.class final Lio/getstream/chat/android/ui/common/internal/file/ProgressInputStream;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0012R&\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/internal/file/ProgressInputStream;",
        "Ljava/io/FilterInputStream;",
        "Ljava/io/InputStream;",
        "delegate",
        "",
        "totalBytes",
        "Lkotlin/Function2;",
        "Ll83/a0;",
        "onProgress",
        "<init>",
        "(Ljava/io/InputStream;JLc93/m;)V",
        "",
        "b",
        "",
        "off",
        "len",
        "read",
        "([BII)I",
        "J",
        "Lc93/m;",
        "bytesRead",
        "stream-chat-android-ui-common_release"
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
.field private bytesRead:J

.field private final onProgress:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final totalBytes:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;JLc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "J",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onProgress"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    iput-wide p2, p0, Lio/getstream/chat/android/ui/common/internal/file/ProgressInputStream;->totalBytes:J

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/internal/file/ProgressInputStream;->onProgress:Lc93/m;

    return-void
.end method


# virtual methods
.method public final read([BII)I
    .locals 3

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_0

    iget-wide p2, p0, Lio/getstream/chat/android/ui/common/internal/file/ProgressInputStream;->bytesRead:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lio/getstream/chat/android/ui/common/internal/file/ProgressInputStream;->bytesRead:J

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ProgressInputStream;->onProgress:Lc93/m;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iget-wide v1, p0, Lio/getstream/chat/android/ui/common/internal/file/ProgressInputStream;->totalBytes:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {v0, p2, p3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return p1
.end method
