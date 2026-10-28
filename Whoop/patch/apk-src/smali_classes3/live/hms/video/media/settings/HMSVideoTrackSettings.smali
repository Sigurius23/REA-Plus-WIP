.class public final Llive/hms/video/media/settings/HMSVideoTrackSettings;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/events/IAnalyticsPropertiesProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;,
        Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0002@ABW\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J)\u00108\u001a\u001e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;0<j\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;`9H\u0016\u00a2\u0006\u0002\u0010=J\u0006\u0010>\u001a\u00020?R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0017R\u0014\u0010\n\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000cX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R$\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020)@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R$\u00100\u001a\u00020/2\u0006\u0010\"\u001a\u00020/@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R$\u00105\u001a\u00020/2\u0006\u0010\"\u001a\u00020/@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00086\u00102\"\u0004\u00087\u00104\u00a8\u0006B"
    }
    d2 = {
        "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "Llive/hms/video/events/IAnalyticsPropertiesProvider;",
        "cameraFacing",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
        "disableAutoResize",
        "",
        "initialState",
        "Llive/hms/video/media/settings/HMSTrackSettings$InitState;",
        "forceSoftwareDecoder",
        "forceSoftwareEncoder",
        "isSimulcastFeatureFlagEnabled",
        "videoSimulcastLayersParams",
        "Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;",
        "screenShareSimulcastLayersParams",
        "degradationPreference",
        "Llive/hms/video/sdk/models/DegradationPreference;",
        "<init>",
        "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;ZLlive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/DegradationPreference;)V",
        "getCameraFacing",
        "()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
        "setCameraFacing",
        "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)V",
        "getDisableAutoResize",
        "()Z",
        "getInitialState",
        "()Llive/hms/video/media/settings/HMSTrackSettings$InitState;",
        "getForceSoftwareDecoder",
        "getForceSoftwareEncoder",
        "isSimulcastFeatureFlagEnabled$lib_release",
        "getVideoSimulcastLayersParams$lib_release",
        "()Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;",
        "getScreenShareSimulcastLayersParams$lib_release",
        "getDegradationPreference",
        "()Llive/hms/video/sdk/models/DegradationPreference;",
        "value",
        "Llive/hms/video/media/settings/HMSVideoResolution;",
        "resolution",
        "getResolution",
        "()Llive/hms/video/media/settings/HMSVideoResolution;",
        "setResolution$lib_release",
        "(Llive/hms/video/media/settings/HMSVideoResolution;)V",
        "Llive/hms/video/media/codec/HMSVideoCodec;",
        "codec",
        "getCodec",
        "()Llive/hms/video/media/codec/HMSVideoCodec;",
        "setCodec$lib_release",
        "(Llive/hms/video/media/codec/HMSVideoCodec;)V",
        "",
        "maxFrameRate",
        "getMaxFrameRate",
        "()I",
        "setMaxFrameRate$lib_release",
        "(I)V",
        "maxBitRate",
        "getMaxBitRate",
        "setMaxBitRate$lib_release",
        "toAnalyticsProperties",
        "Lkotlin/collections/HashMap;",
        "",
        "",
        "Ljava/util/HashMap;",
        "()Ljava/util/HashMap;",
        "builder",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;",
        "CameraFacing",
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
.field private cameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

.field private codec:Llive/hms/video/media/codec/HMSVideoCodec;

.field private final degradationPreference:Llive/hms/video/sdk/models/DegradationPreference;

.field private final disableAutoResize:Z

.field private final forceSoftwareDecoder:Z

.field private final forceSoftwareEncoder:Z

.field private final initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

.field private final isSimulcastFeatureFlagEnabled:Z

.field private maxBitRate:I

.field private maxFrameRate:I

.field private resolution:Llive/hms/video/media/settings/HMSVideoResolution;

.field private final screenShareSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;

.field private final videoSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;


# direct methods
.method private constructor <init>(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;ZLlive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/DegradationPreference;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->cameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    .line 4
    iput-boolean p2, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->disableAutoResize:Z

    .line 5
    iput-object p3, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    .line 6
    iput-boolean p4, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->forceSoftwareDecoder:Z

    .line 7
    iput-boolean p5, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->forceSoftwareEncoder:Z

    .line 8
    iput-boolean p6, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->isSimulcastFeatureFlagEnabled:Z

    .line 9
    iput-object p7, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->videoSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;

    .line 10
    iput-object p8, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->screenShareSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;

    .line 11
    iput-object p9, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->degradationPreference:Llive/hms/video/sdk/models/DegradationPreference;

    .line 12
    new-instance p1, Llive/hms/video/media/settings/HMSVideoResolution;

    const/16 p2, 0x140

    const/16 p3, 0xb4

    invoke-direct {p1, p2, p3}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    .line 13
    sget-object p1, Llive/hms/video/media/codec/HMSVideoCodec;->VP8:Llive/hms/video/media/codec/HMSVideoCodec;

    iput-object p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    const/16 p1, 0x18

    .line 14
    iput p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->maxFrameRate:I

    const p1, 0x249f0

    .line 15
    iput p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->maxBitRate:I

    return-void
.end method

.method public synthetic constructor <init>(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;ZLlive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/DegradationPreference;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p10, 0x4

    if-eqz v0, :cond_0

    .line 16
    sget-object p3, Llive/hms/video/media/settings/HMSTrackSettings$InitState;->UNMUTED:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    .line 17
    invoke-direct/range {v0 .. v9}, Llive/hms/video/media/settings/HMSVideoTrackSettings;-><init>(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;ZLlive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/DegradationPreference;)V

    return-void
.end method

.method public synthetic constructor <init>(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;ZLlive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/DegradationPreference;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Llive/hms/video/media/settings/HMSVideoTrackSettings;-><init>(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;ZLlive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/DegradationPreference;)V

    return-void
.end method


# virtual methods
.method public final builder()Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
    .locals 2

    new-instance v0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    invoke-direct {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;-><init>()V

    iget-object v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->resolution(Llive/hms/video/media/settings/HMSVideoResolution;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->codec(Llive/hms/video/media/codec/HMSVideoCodec;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    iget v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->maxFrameRate:I

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxFrameRate(I)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    iget v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->maxBitRate:I

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxBitrate(I)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->cameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->cameraFacing(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    iget-boolean v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->disableAutoResize:Z

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->disableAutoResize(Z)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    iget-boolean v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->forceSoftwareDecoder:Z

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->forceSoftwareDecoder(Z)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final getCameraFacing()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->cameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    return-object v0
.end method

.method public final getCodec()Llive/hms/video/media/codec/HMSVideoCodec;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    return-object v0
.end method

.method public final getDegradationPreference()Llive/hms/video/sdk/models/DegradationPreference;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->degradationPreference:Llive/hms/video/sdk/models/DegradationPreference;

    return-object v0
.end method

.method public final getDisableAutoResize()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->disableAutoResize:Z

    return v0
.end method

.method public final getForceSoftwareDecoder()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->forceSoftwareDecoder:Z

    return v0
.end method

.method public final getForceSoftwareEncoder()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->forceSoftwareEncoder:Z

    return v0
.end method

.method public final getInitialState()Llive/hms/video/media/settings/HMSTrackSettings$InitState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    return-object v0
.end method

.method public final getMaxBitRate()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->maxBitRate:I

    return v0
.end method

.method public final getMaxFrameRate()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->maxFrameRate:I

    return v0
.end method

.method public final getResolution()Llive/hms/video/media/settings/HMSVideoResolution;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    return-object v0
.end method

.method public final getScreenShareSimulcastLayersParams$lib_release()Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->screenShareSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;

    return-object v0
.end method

.method public final getVideoSimulcastLayersParams$lib_release()Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->videoSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;

    return-object v0
.end method

.method public final isSimulcastFeatureFlagEnabled$lib_release()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->isSimulcastFeatureFlagEnabled:Z

    return v0
.end method

.method public final setCameraFacing(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->cameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    return-void
.end method

.method public final setCodec$lib_release(Llive/hms/video/media/codec/HMSVideoCodec;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    return-void
.end method

.method public final setMaxBitRate$lib_release(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->maxBitRate:I

    return-void
.end method

.method public final setMaxFrameRate$lib_release(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->maxFrameRate:I

    return-void
.end method

.method public final setResolution$lib_release(Llive/hms/video/media/settings/HMSVideoResolution;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    return-void
.end method

.method public toAnalyticsProperties()Ljava/util/HashMap;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSVideoResolution;->getWidth()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "width"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSVideoResolution;->getHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "height"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->maxBitRate:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "video_bitrate"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->maxFrameRate:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v5, "framerate"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    new-instance v5, Ll83/k;

    const-string v6, "video_codec"

    invoke-direct {v5, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->disableAutoResize:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v6, Ll83/k;

    const-string v7, "disable_auto_resize"

    invoke-direct {v6, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->forceSoftwareDecoder:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v7, Ll83/k;

    const-string v8, "force_software_decoder"

    invoke-direct {v7, v8, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings;->degradationPreference:Llive/hms/video/sdk/models/DegradationPreference;

    new-instance v8, Ll83/k;

    const-string v9, "degradation_preference"

    invoke-direct {v8, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v1 .. v8}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->V([Ll83/k;)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method
