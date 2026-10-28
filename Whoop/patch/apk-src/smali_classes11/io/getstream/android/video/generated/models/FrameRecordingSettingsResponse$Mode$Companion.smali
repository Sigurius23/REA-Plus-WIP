.class public final Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Companion;",
        "",
        "()V",
        "fromString",
        "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;",
        "s",
        "",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromString(Ljava/lang/String;)Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;
    .locals 2

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x2bbe7537

    if-eq v0, v1, :cond_4

    const v1, -0x2686b943

    if-eq v0, v1, :cond_2

    const v1, 0x10263a7c

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "disabled"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Disabled;->INSTANCE:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Disabled;

    return-object p1

    :cond_2
    const-string v0, "auto-on"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$AutoOn;->INSTANCE:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$AutoOn;

    return-object p1

    :cond_4
    const-string v0, "available"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_0
    new-instance v0, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Unknown;

    invoke-direct {v0, p1}, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Unknown;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_5
    sget-object p1, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Available;->INSTANCE:Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Available;

    return-object p1
.end method
