.class public final Lio/getstream/chat/android/ui/common/utils/AttachmentConstants;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/utils/AttachmentConstants;",
        "",
        "<init>",
        "()V",
        "MAX_UPLOAD_SIZE_IN_MB",
        "",
        "MAX_ATTACHMENTS_COUNT",
        "MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES",
        "",
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


# static fields
.field public static final $stable:I = 0x0

.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/utils/AttachmentConstants;

.field public static final MAX_ATTACHMENTS_COUNT:I = 0x1e

.field public static final MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES:J = 0xa00000L

.field public static final MAX_UPLOAD_SIZE_IN_MB:I = 0x64


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/AttachmentConstants;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/utils/AttachmentConstants;->INSTANCE:Lio/getstream/chat/android/ui/common/utils/AttachmentConstants;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
