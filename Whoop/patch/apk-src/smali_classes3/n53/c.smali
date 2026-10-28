.class public abstract Ln53/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lorg/webrtc/MediaConstraints;

.field public static final b:Lorg/webrtc/MediaConstraints;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lorg/webrtc/MediaConstraints;

    invoke-direct {v0}, Lorg/webrtc/MediaConstraints;-><init>()V

    iget-object v1, v0, Lorg/webrtc/MediaConstraints;->optional:Ljava/util/List;

    new-instance v2, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string v3, "DtlsSrtpKeyAgreement"

    const-string v4, "true"

    invoke-direct {v2, v3, v4}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sput-object v0, Ln53/c;->a:Lorg/webrtc/MediaConstraints;

    new-instance v0, Lorg/webrtc/MediaConstraints;

    invoke-direct {v0}, Lorg/webrtc/MediaConstraints;-><init>()V

    iget-object v1, v0, Lorg/webrtc/MediaConstraints;->mandatory:Ljava/util/List;

    new-instance v2, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string v5, "IceRestart"

    invoke-direct {v2, v5, v4}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lorg/webrtc/MediaConstraints;->optional:Ljava/util/List;

    new-instance v2, Lorg/webrtc/MediaConstraints$KeyValuePair;

    invoke-direct {v2, v3, v4}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sput-object v0, Ln53/c;->b:Lorg/webrtc/MediaConstraints;

    return-void
.end method

.method public static final synthetic a(Lm5/k;)Lorg/webrtc/MediaConstraints;
    .locals 7

    new-instance v0, Lorg/webrtc/MediaConstraints;

    invoke-direct {v0}, Lorg/webrtc/MediaConstraints;-><init>()V

    invoke-virtual {p0}, Lm5/k;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lstream/video/sfu/models/AudioBitrateProfile;

    sget-object v1, Lstream/video/sfu/models/AudioBitrateProfile;->AUDIO_BITRATE_PROFILE_MUSIC_HIGH_QUALITY:Lstream/video/sfu/models/AudioBitrateProfile;

    const/4 v2, 0x1

    if-ne p0, v1, :cond_0

    move p0, v2

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    xor-int/2addr p0, v2

    new-instance v1, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string v2, "googEchoCancellation"

    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string v3, "googAutoGainControl"

    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string v4, "googHighpassFilter"

    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string v5, "googNoiseSuppression"

    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string v6, "googTypingNoiseDetection"

    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v5, v6, p0}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v1, v2, v3, v4, v5}, [Lorg/webrtc/MediaConstraints$KeyValuePair;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    iget-object v1, v0, Lorg/webrtc/MediaConstraints;->optional:Ljava/util/List;

    new-instance v2, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string v3, "DtlsSrtpKeyAgreement"

    const-string v4, "true"

    invoke-direct {v2, v3, v4}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method
