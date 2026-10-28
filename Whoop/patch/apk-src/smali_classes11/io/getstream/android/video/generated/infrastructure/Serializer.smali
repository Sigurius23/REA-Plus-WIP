.class public final Lio/getstream/android/video/generated/infrastructure/Serializer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u0012\u0004\u0008\t\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008R!\u0010\u0010\u001a\u00020\n8FX\u0087\u0084\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u0012\u0004\u0008\u000f\u0010\u0003\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/android/video/generated/infrastructure/Serializer;",
        "",
        "<init>",
        "()V",
        "Lqx/i0;",
        "moshiBuilder",
        "Lqx/i0;",
        "getMoshiBuilder",
        "()Lqx/i0;",
        "getMoshiBuilder$annotations",
        "Lqx/l0;",
        "moshi$delegate",
        "Ll83/h;",
        "getMoshi",
        "()Lqx/l0;",
        "getMoshi$annotations",
        "moshi",
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


# static fields
.field public static final INSTANCE:Lio/getstream/android/video/generated/infrastructure/Serializer;

.field private static final moshi$delegate:Ll83/h;

.field private static final moshiBuilder:Lqx/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/android/video/generated/infrastructure/Serializer;

    invoke-direct {v0}, Lio/getstream/android/video/generated/infrastructure/Serializer;-><init>()V

    sput-object v0, Lio/getstream/android/video/generated/infrastructure/Serializer;->INSTANCE:Lio/getstream/android/video/generated/infrastructure/Serializer;

    new-instance v0, Lqx/i0;

    invoke-direct {v0}, Lqx/i0;-><init>()V

    new-instance v1, Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$DefaultDeviceAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$DefaultDeviceAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$DefaultDeviceAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$DefaultDeviceAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallRecordingFailedEvent$RecordingType$RecordingTypeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/CallRecordingFailedEvent$RecordingType$RecordingTypeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$RecordingTypeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/CallRecordingReadyEvent$RecordingType$RecordingTypeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallRecordingStartedEvent$RecordingType$RecordingTypeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/CallRecordingStartedEvent$RecordingType$RecordingTypeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent$RecordingType$RecordingTypeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent$RecordingType$RecordingTypeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$PushProviderAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$PushProviderAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest$Mode$ModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest$Quality$QualityAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest$Quality$QualityAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$ModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest$Mode$ModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/IndividualRecordingSettingsResponse$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/IndividualRecordingSettingsResponse$Mode$ModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels$ChannelsAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest$Channels$ChannelsAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps$FpsAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/IngressSourceRequest$Fps$FpsAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec$CodecAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/IngressVideoLayerRequest$Codec$CodecAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/LayoutSettingsRequest$Name$NameAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/LayoutSettingsRequest$Name$NameAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode$ModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/OwnCapability$OwnCapabilityAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/OwnCapability$OwnCapabilityAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$QualityAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$QualityAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/RTMPSettingsRequest$Quality$QualityAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/RTMPSettingsRequest$Quality$QualityAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$ModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/RawRecordingSettingsResponse$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/RawRecordingSettingsResponse$Mode$ModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$ModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$QualityAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$QualityAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$LanguageAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$LanguageAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$LanguageAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$LanguageAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$ClosedCaptionModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$ClosedCaptionModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$LanguageAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$LanguageAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$ModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$LanguageAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$LanguageAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$ModeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$CameraFacingAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$CameraFacingAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing$CameraFacingAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing$CameraFacingAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/VideoEventAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/VideoEventAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/BigDecimalAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/BigDecimalAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/BigIntegerAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/BigIntegerAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/ByteArrayAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/ByteArrayAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/URIAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/URIAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/UUIDAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/UUIDAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/OffsetDateTimeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/OffsetDateTimeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/LocalDateAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/LocalDateAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/LocalDateTimeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/LocalDateTimeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lsx/c;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, v0, Lqx/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sput-object v0, Lio/getstream/android/video/generated/infrastructure/Serializer;->moshiBuilder:Lqx/i0;

    sget-object v0, Lio/getstream/android/video/generated/infrastructure/Serializer$moshi$2;->INSTANCE:Lio/getstream/android/video/generated/infrastructure/Serializer$moshi$2;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lio/getstream/android/video/generated/infrastructure/Serializer;->moshi$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final getMoshi()Lqx/l0;
    .locals 2

    sget-object v0, Lio/getstream/android/video/generated/infrastructure/Serializer;->moshi$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lqx/l0;

    return-object v0
.end method

.method public static synthetic getMoshi$annotations()V
    .locals 0

    return-void
.end method

.method public static final getMoshiBuilder()Lqx/i0;
    .locals 1

    sget-object v0, Lio/getstream/android/video/generated/infrastructure/Serializer;->moshiBuilder:Lqx/i0;

    return-object v0
.end method

.method public static synthetic getMoshiBuilder$annotations()V
    .locals 0

    return-void
.end method
