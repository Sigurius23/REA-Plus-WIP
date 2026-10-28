.class public final La53/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lqx/i0;

    invoke-direct {v0}, Lqx/i0;-><init>()V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/OffsetDateTimeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/OffsetDateTimeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/LocalDateTimeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/LocalDateTimeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/LocalDateAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/LocalDateAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/UUIDAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/UUIDAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/ByteArrayAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/ByteArrayAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/URIAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/URIAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/BigDecimalAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/BigDecimalAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/infrastructure/BigIntegerAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/infrastructure/BigIntegerAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/video/android/core/socket/common/parser2/adapters/DateAdapter;

    invoke-direct {v1}, Lio/getstream/video/android/core/socket/common/parser2/adapters/DateAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$addAdapter$1;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$addAdapter$1;-><init>(Lio/getstream/video/android/core/socket/common/parser2/adapters/DateAdapter;)V

    const-class v1, Ljava/util/Date;

    invoke-virtual {v0, v1, v2}, Lqx/i0;->b(Ljava/lang/reflect/Type;Lcom/squareup/moshi/JsonAdapter;)V

    new-instance v1, Lio/getstream/android/video/generated/models/VideoEventAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/VideoEventAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$1;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$1;-><init>(Lio/getstream/android/video/generated/models/VideoEventAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$DefaultDeviceAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$DefaultDeviceAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$2;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$2;-><init>(Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$DefaultDeviceAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$DefaultDeviceAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$DefaultDeviceAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$3;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$3;-><init>(Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$DefaultDeviceAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$PushProviderAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$PushProviderAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$4;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$4;-><init>(Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$PushProviderAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode$ModeAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$5;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$5;-><init>(Lio/getstream/android/video/generated/models/NoiseCancellationSettings$Mode$ModeAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/OwnCapability$OwnCapabilityAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/OwnCapability$OwnCapabilityAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$6;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$6;-><init>(Lio/getstream/android/video/generated/models/OwnCapability$OwnCapabilityAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$ModeAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$7;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$7;-><init>(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$ModeAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$QualityAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$QualityAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$8;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$8;-><init>(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$QualityAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$ModeAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$9;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$9;-><init>(Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$ModeAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$ModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$ModeAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$10;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$10;-><init>(Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$ModeAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$11;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$11;-><init>(Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$CameraFacingAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$CameraFacingAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$12;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$12;-><init>(Lio/getstream/android/video/generated/models/VideoSettingsRequest$CameraFacing$CameraFacingAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing$CameraFacingAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing$CameraFacingAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$13;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$13;-><init>(Lio/getstream/android/video/generated/models/VideoSettingsResponse$CameraFacing$CameraFacingAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/LayoutSettingsRequest$Name$NameAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/LayoutSettingsRequest$Name$NameAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$14;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$14;-><init>(Lio/getstream/android/video/generated/models/LayoutSettingsRequest$Name$NameAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$QualityAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$QualityAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$15;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$15;-><init>(Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$QualityAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/RTMPSettingsRequest$Quality$QualityAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/RTMPSettingsRequest$Quality$QualityAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$16;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$16;-><init>(Lio/getstream/android/video/generated/models/RTMPSettingsRequest$Quality$QualityAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$ClosedCaptionModeAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$ClosedCaptionModeAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$17;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$17;-><init>(Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$ClosedCaptionModeAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$LanguageAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$LanguageAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$18;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$18;-><init>(Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$LanguageAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$LanguageAdapter;

    invoke-direct {v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$LanguageAdapter;-><init>()V

    new-instance v2, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$19;

    invoke-direct {v2, v1}, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$19;-><init>(Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$LanguageAdapter;)V

    invoke-virtual {v0, v2}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v1, Lsx/c;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, v0, Lqx/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lqx/l0;

    invoke-direct {v1, v0}, Lqx/l0;-><init>(Lqx/i0;)V

    return-object v1
.end method
