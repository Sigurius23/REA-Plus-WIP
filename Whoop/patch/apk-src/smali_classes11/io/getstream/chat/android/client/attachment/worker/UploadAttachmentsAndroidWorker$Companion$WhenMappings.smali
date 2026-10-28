.class public final synthetic Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion$WhenMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;->values()[Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;->CONNECTED:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;->UNMETERED:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v1, Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;->NOT_ROAMING:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v1, Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;->METERED:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    sput-object v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
