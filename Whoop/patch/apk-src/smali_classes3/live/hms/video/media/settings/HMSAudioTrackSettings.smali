.class public final Llive/hms/video/media/settings/HMSAudioTrackSettings;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/events/IAnalyticsPropertiesProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;,
        Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u00029:B_\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J)\u00101\u001a\u001e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020405j\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204`2H\u0016\u00a2\u0006\u0002\u00106J\u0006\u00107\u001a\u000208R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0016R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R$\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020%@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R$\u0010,\u001a\u00020+2\u0006\u0010$\u001a\u00020+@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100\u00a8\u0006;"
    }
    d2 = {
        "Llive/hms/video/media/settings/HMSAudioTrackSettings;",
        "Llive/hms/video/events/IAnalyticsPropertiesProvider;",
        "volume",
        "",
        "disableInternalAudioManager",
        "",
        "useHardwareAcousticEchoCanceler",
        "initialState",
        "Llive/hms/video/media/settings/HMSTrackSettings$InitState;",
        "enableEchoCancellation",
        "enableNoiseSupression",
        "enableAutomaticGainControl",
        "phoneCallState",
        "Llive/hms/video/media/settings/PhoneCallState;",
        "enableNoiseCancellation",
        "audioMode",
        "Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;",
        "<init>",
        "(DZLjava/lang/Boolean;Llive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/media/settings/PhoneCallState;ZLlive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;)V",
        "getVolume",
        "()D",
        "getDisableInternalAudioManager",
        "()Z",
        "getUseHardwareAcousticEchoCanceler",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getInitialState",
        "()Llive/hms/video/media/settings/HMSTrackSettings$InitState;",
        "getEnableEchoCancellation",
        "getEnableNoiseSupression",
        "getEnableAutomaticGainControl",
        "getPhoneCallState",
        "()Llive/hms/video/media/settings/PhoneCallState;",
        "getEnableNoiseCancellation",
        "getAudioMode",
        "()Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;",
        "value",
        "",
        "maxBitrate",
        "getMaxBitrate",
        "()I",
        "setMaxBitrate$lib_release",
        "(I)V",
        "Llive/hms/video/media/codec/HMSAudioCodec;",
        "codec",
        "getCodec",
        "()Llive/hms/video/media/codec/HMSAudioCodec;",
        "setCodec$lib_release",
        "(Llive/hms/video/media/codec/HMSAudioCodec;)V",
        "toAnalyticsProperties",
        "Lkotlin/collections/HashMap;",
        "",
        "",
        "Ljava/util/HashMap;",
        "()Ljava/util/HashMap;",
        "builder",
        "Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;",
        "HMSAudioMode",
        "Builder",
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
.field private final audioMode:Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;

.field private codec:Llive/hms/video/media/codec/HMSAudioCodec;

.field private final disableInternalAudioManager:Z

.field private final enableAutomaticGainControl:Z

.field private final enableEchoCancellation:Z

.field private final enableNoiseCancellation:Z

.field private final enableNoiseSupression:Z

.field private final initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

.field private maxBitrate:I

.field private final phoneCallState:Llive/hms/video/media/settings/PhoneCallState;

.field private final useHardwareAcousticEchoCanceler:Ljava/lang/Boolean;

.field private final volume:D


# direct methods
.method private constructor <init>(DZLjava/lang/Boolean;Llive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/media/settings/PhoneCallState;ZLlive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->volume:D

    .line 4
    iput-boolean p3, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->disableInternalAudioManager:Z

    .line 5
    iput-object p4, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->useHardwareAcousticEchoCanceler:Ljava/lang/Boolean;

    .line 6
    iput-object p5, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    .line 7
    iput-boolean p6, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->enableEchoCancellation:Z

    .line 8
    iput-boolean p7, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->enableNoiseSupression:Z

    .line 9
    iput-boolean p8, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->enableAutomaticGainControl:Z

    .line 10
    iput-object p9, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->phoneCallState:Llive/hms/video/media/settings/PhoneCallState;

    .line 11
    iput-boolean p10, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->enableNoiseCancellation:Z

    .line 12
    iput-object p11, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->audioMode:Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;

    const/16 p1, 0x7d00

    .line 13
    iput p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->maxBitrate:I

    .line 14
    sget-object p1, Llive/hms/video/media/codec/HMSAudioCodec;->OPUS:Llive/hms/video/media/codec/HMSAudioCodec;

    iput-object p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->codec:Llive/hms/video/media/codec/HMSAudioCodec;

    return-void
.end method

.method public synthetic constructor <init>(DZLjava/lang/Boolean;Llive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/media/settings/PhoneCallState;ZLlive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    .line 15
    sget-object v1, Llive/hms/video/media/settings/HMSTrackSettings$InitState;->UNMUTED:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v7, p5

    :goto_0
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_1

    .line 16
    sget-object v0, Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;->HMSAUDIOMODEVOICE:Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;

    move-object v13, v0

    :goto_1
    move-object v2, p0

    move-wide v3, p1

    move/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    move/from16 v12, p10

    goto :goto_2

    :cond_1
    move-object/from16 v13, p11

    goto :goto_1

    .line 17
    :goto_2
    invoke-direct/range {v2 .. v13}, Llive/hms/video/media/settings/HMSAudioTrackSettings;-><init>(DZLjava/lang/Boolean;Llive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/media/settings/PhoneCallState;ZLlive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;)V

    return-void
.end method

.method public synthetic constructor <init>(DZLjava/lang/Boolean;Llive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/media/settings/PhoneCallState;ZLlive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Llive/hms/video/media/settings/HMSAudioTrackSettings;-><init>(DZLjava/lang/Boolean;Llive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/media/settings/PhoneCallState;ZLlive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;)V

    return-void
.end method


# virtual methods
.method public final builder()Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;
    .locals 3

    new-instance v0, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;

    invoke-direct {v0}, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;-><init>()V

    iget-wide v1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->volume:D

    invoke-virtual {v0, v1, v2}, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->volume(D)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;

    move-result-object v0

    iget v1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->maxBitrate:I

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->maxBitrate(I)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->codec:Llive/hms/video/media/codec/HMSAudioCodec;

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->codec(Llive/hms/video/media/codec/HMSAudioCodec;)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->useHardwareAcousticEchoCanceler:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->setUseHardwareAcousticEchoCanceler(Ljava/lang/Boolean;)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->phoneCallState:Llive/hms/video/media/settings/PhoneCallState;

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;->setPhoneCallMuteState(Llive/hms/video/media/settings/PhoneCallState;)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final getAudioMode()Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->audioMode:Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;

    return-object v0
.end method

.method public final getCodec()Llive/hms/video/media/codec/HMSAudioCodec;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->codec:Llive/hms/video/media/codec/HMSAudioCodec;

    return-object v0
.end method

.method public final getDisableInternalAudioManager()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->disableInternalAudioManager:Z

    return v0
.end method

.method public final getEnableAutomaticGainControl()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->enableAutomaticGainControl:Z

    return v0
.end method

.method public final getEnableEchoCancellation()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->enableEchoCancellation:Z

    return v0
.end method

.method public final getEnableNoiseCancellation()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->enableNoiseCancellation:Z

    return v0
.end method

.method public final getEnableNoiseSupression()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->enableNoiseSupression:Z

    return v0
.end method

.method public final getInitialState()Llive/hms/video/media/settings/HMSTrackSettings$InitState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    return-object v0
.end method

.method public final getMaxBitrate()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->maxBitrate:I

    return v0
.end method

.method public final getPhoneCallState()Llive/hms/video/media/settings/PhoneCallState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->phoneCallState:Llive/hms/video/media/settings/PhoneCallState;

    return-object v0
.end method

.method public final getUseHardwareAcousticEchoCanceler()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->useHardwareAcousticEchoCanceler:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getVolume()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->volume:D

    return-wide v0
.end method

.method public final setCodec$lib_release(Llive/hms/video/media/codec/HMSAudioCodec;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->codec:Llive/hms/video/media/codec/HMSAudioCodec;

    return-void
.end method

.method public final setMaxBitrate$lib_release(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->maxBitrate:I

    return-void
.end method

.method public toAnalyticsProperties()Ljava/util/HashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->maxBitrate:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "audio_bitrate"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Llive/hms/video/media/settings/HMSAudioTrackSettings;->codec:Llive/hms/video/media/codec/HMSAudioCodec;

    new-instance v2, Ll83/k;

    const-string v3, "audio_codec"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->V([Ll83/k;)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method
