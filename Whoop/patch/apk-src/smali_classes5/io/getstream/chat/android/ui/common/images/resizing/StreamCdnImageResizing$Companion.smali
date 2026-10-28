.class public final Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing$Companion;",
        "",
        "<init>",
        "()V",
        "defaultStreamCdnImageResizing",
        "Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final defaultStreamCdnImageResizing()Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;
    .locals 6

    new-instance v0, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;-><init>(ZFFLio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;)V

    return-object v0
.end method
