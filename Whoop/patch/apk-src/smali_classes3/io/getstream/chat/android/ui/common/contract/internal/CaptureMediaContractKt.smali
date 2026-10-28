.class public final Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContractKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002\u00a8\u0006\u0002"
    }
    d2 = {
        "takeIfCaptured",
        "Ljava/io/File;",
        "stream-chat-android-ui-common_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$takeIfCaptured(Ljava/io/File;)Ljava/io/File;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContractKt;->takeIfCaptured(Ljava/io/File;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method private static final takeIfCaptured(Ljava/io/File;)Ljava/io/File;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    return-object p0

    :cond_0
    return-object v0
.end method
