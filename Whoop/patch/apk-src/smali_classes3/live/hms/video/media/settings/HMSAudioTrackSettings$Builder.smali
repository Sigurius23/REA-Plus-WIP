.class public final Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/media/settings/HMSAudioTrackSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bJ\u0015\u0010\u001b\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000cR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;",
        "",
        "<init>",
        "()V",
        "volume",
        "",
        "maxBitRate",
        "",
        "codec",
        "Llive/hms/video/media/codec/HMSAudioCodec;",
        "useHardwareAcousticEchoCanceler",
        "",
        "Ljava/lang/Boolean;",
        "initialState",
        "Llive/hms/video/media/settings/HMSTrackSettings$InitState;",
        "enableEchoCancellation",
        "enableNoiseSupression",
        "enableNoiseCancellation",
        "enableAutomaticGainControl",
        "disableInternalAudioManager",
        "phoneCallState",
        "Llive/hms/video/media/settings/PhoneCallState;",
        "audioMode",
        "Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;",
        "maxBitrate",
        "setPhoneCallMuteState",
        "setDisableInternalAudioManager",
        "setUseHardwareAcousticEchoCanceler",
        "(Ljava/lang/Boolean;)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;",
        "setAudioMode",
        "build",
        "Llive/hms/video/media/settings/HMSAudioTrackSettings;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private audioMode:Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;

.field private codec:Llive/hms/video/media/codec/HMSAudioCodec;

.field private disableInternalAudioManager:Z

.field private enableAutomaticGainControl:Z

.field private enableEchoCancellation:Z

.field private enableNoiseCancellation:Z

.field private enableNoiseSupression:Z

.field private initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

.field private maxBitRate:I

.field private phoneCallState:Llive/hms/video/media/settings/PhoneCallState;

.field private useHardwareAcousticEchoCanceler:Ljava/lang/Boolean;

.field private volume:D


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->volume:D

    const/16 v0, 0x7d00

    iput v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->maxBitRate:I

    sget-object v0, Llive/hms/video/media/codec/HMSAudioCodec;->OPUS:Llive/hms/video/media/codec/HMSAudioCodec;

    iput-object v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->codec:Llive/hms/video/media/codec/HMSAudioCodec;

    sget-object v0, Llive/hms/video/media/settings/HMSTrackSettings$InitState;->UNMUTED:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    iput-object v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    const/4 v0, 0x1

    iput-boolean v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableEchoCancellation:Z

    iput-boolean v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableNoiseSupression:Z

    iput-boolean v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableAutomaticGainControl:Z

    sget-object v0, Llive/hms/video/media/settings/PhoneCallState;->ENABLE_MUTE_ON_PHONE_CALL_RING:Llive/hms/video/media/settings/PhoneCallState;

    iput-object v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->phoneCallState:Llive/hms/video/media/settings/PhoneCallState;

    sget-object v0, Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;->HMSAUDIOMODEVOICE:Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;

    iput-object v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->audioMode:Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;

    return-void
.end method


# virtual methods
.method public final build()Llive/hms/video/media/settings/HMSAudioTrackSettings;
    .locals 13

    new-instance v0, Llive/hms/video/media/settings/HMSAudioTrackSettings;

    iget-wide v1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->volume:D

    iget-boolean v3, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->disableInternalAudioManager:Z

    iget-object v4, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->useHardwareAcousticEchoCanceler:Ljava/lang/Boolean;

    iget-object v5, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    iget-boolean v6, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableEchoCancellation:Z

    iget-object v11, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->audioMode:Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;

    sget-object v7, Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;->HMSAUDIOMODEMUSIC:Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;

    const/4 v8, 0x0

    if-eq v11, v7, :cond_1

    iget-boolean v9, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableNoiseCancellation:Z

    if-eqz v9, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v9, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableNoiseSupression:Z

    goto :goto_1

    :cond_1
    :goto_0
    move v9, v8

    :goto_1
    if-eq v11, v7, :cond_3

    iget-boolean v7, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableNoiseCancellation:Z

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_2
    iget-boolean v8, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableAutomaticGainControl:Z

    :cond_3
    :goto_2
    move v7, v9

    iget-object v9, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->phoneCallState:Llive/hms/video/media/settings/PhoneCallState;

    iget-boolean v10, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableNoiseCancellation:Z

    const/4 v12, 0x0

    invoke-direct/range {v0 .. v12}, Llive/hms/video/media/settings/HMSAudioTrackSettings;-><init>(DZLjava/lang/Boolean;Llive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/media/settings/PhoneCallState;ZLlive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->codec:Llive/hms/video/media/codec/HMSAudioCodec;

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->setCodec$lib_release(Llive/hms/video/media/codec/HMSAudioCodec;)V

    iget v1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->maxBitRate:I

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->setMaxBitrate$lib_release(I)V

    return-object v0
.end method

.method public final codec(Llive/hms/video/media/codec/HMSAudioCodec;)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 1

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->codec:Llive/hms/video/media/codec/HMSAudioCodec;

    return-object p0
.end method

.method public final enableAutomaticGainControl(Z)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableAutomaticGainControl:Z

    return-object p0
.end method

.method public final enableEchoCancellation(Z)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableEchoCancellation:Z

    return-object p0
.end method

.method public final enableNoiseCancellation(Z)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableNoiseCancellation:Z

    return-object p0
.end method

.method public final enableNoiseSupression(Z)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->enableNoiseSupression:Z

    return-object p0
.end method

.method public final initialState(Llive/hms/video/media/settings/HMSTrackSettings$InitState;)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 1

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    return-object p0
.end method

.method public final maxBitrate(I)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 0

    iput p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->maxBitRate:I

    return-object p0
.end method

.method public final setAudioMode(Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 1

    const-string v0, "audioMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->audioMode:Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;

    return-object p0
.end method

.method public final setDisableInternalAudioManager(Z)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->disableInternalAudioManager:Z

    return-object p0
.end method

.method public final setPhoneCallMuteState(Llive/hms/video/media/settings/PhoneCallState;)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 1

    const-string v0, "phoneCallState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->phoneCallState:Llive/hms/video/media/settings/PhoneCallState;

    return-object p0
.end method

.method public final setUseHardwareAcousticEchoCanceler(Ljava/lang/Boolean;)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->useHardwareAcousticEchoCanceler:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final volume(D)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 0

    iput-wide p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->volume:D

    return-object p0
.end method
