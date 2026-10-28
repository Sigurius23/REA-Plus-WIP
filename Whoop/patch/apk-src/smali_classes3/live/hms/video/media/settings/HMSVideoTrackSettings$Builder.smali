.class public final Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/media/settings/HMSVideoTrackSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\u0008\u0008\u0001\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0012J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J)\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000e2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000\u00a2\u0006\u0002\u0008\u001dJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;",
        "",
        "<init>",
        "()V",
        "resolution",
        "Llive/hms/video/media/settings/HMSVideoResolution;",
        "codec",
        "Llive/hms/video/media/codec/HMSVideoCodec;",
        "initialState",
        "Llive/hms/video/media/settings/HMSTrackSettings$InitState;",
        "maxFrameRate",
        "",
        "maxBitRate",
        "disableAutoResize",
        "",
        "forceSoftwareDecoder",
        "forceSoftwareEncoder",
        "cameraFacing",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
        "isSimulcastFeatureFlagEnabled",
        "videoSimulcastLayersParams",
        "Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;",
        "screenShareSimulcastLayersParams",
        "degradationPreference",
        "Llive/hms/video/sdk/models/DegradationPreference;",
        "maxBitrate",
        "facing",
        "setDegradationPreference",
        "simulcast",
        "simulcast$lib_release",
        "build",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
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

.field private degradationPreference:Llive/hms/video/sdk/models/DegradationPreference;

.field private disableAutoResize:Z

.field private forceSoftwareDecoder:Z

.field private forceSoftwareEncoder:Z

.field private initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

.field private isSimulcastFeatureFlagEnabled:Z

.field private maxBitRate:I

.field private maxFrameRate:I

.field private resolution:Llive/hms/video/media/settings/HMSVideoResolution;

.field private screenShareSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;

.field private videoSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llive/hms/video/media/settings/HMSVideoResolution;

    const/16 v1, 0x140

    const/16 v2, 0xb4

    invoke-direct {v0, v1, v2}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    iput-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    sget-object v0, Llive/hms/video/media/codec/HMSVideoCodec;->VP8:Llive/hms/video/media/codec/HMSVideoCodec;

    iput-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    sget-object v0, Llive/hms/video/media/settings/HMSTrackSettings$InitState;->UNMUTED:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    iput-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    const/16 v0, 0x18

    iput v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxFrameRate:I

    const v0, 0x249f0

    iput v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxBitRate:I

    sget-object v0, Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;->FRONT:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    iput-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->cameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    sget-object v0, Llive/hms/video/sdk/models/DegradationPreference;->DEFAULT:Llive/hms/video/sdk/models/DegradationPreference;

    iput-object v0, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->degradationPreference:Llive/hms/video/sdk/models/DegradationPreference;

    return-void
.end method


# virtual methods
.method public final build()Llive/hms/video/media/settings/HMSVideoTrackSettings;
    .locals 11

    new-instance v0, Llive/hms/video/media/settings/HMSVideoTrackSettings;

    iget-object v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->cameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    iget-boolean v2, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->disableAutoResize:Z

    iget-object v3, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    iget-boolean v4, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->forceSoftwareDecoder:Z

    iget-boolean v5, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->forceSoftwareEncoder:Z

    iget-boolean v6, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->isSimulcastFeatureFlagEnabled:Z

    iget-object v7, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->videoSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;

    iget-object v8, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->screenShareSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;

    iget-object v9, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->degradationPreference:Llive/hms/video/sdk/models/DegradationPreference;

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v10}, Llive/hms/video/media/settings/HMSVideoTrackSettings;-><init>(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;ZLlive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/DegradationPreference;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->setCodec$lib_release(Llive/hms/video/media/codec/HMSVideoCodec;)V

    iget v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxBitRate:I

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->setMaxBitRate$lib_release(I)V

    iget v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxFrameRate:I

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->setMaxFrameRate$lib_release(I)V

    iget-object v1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    invoke-virtual {v0, v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->setResolution$lib_release(Llive/hms/video/media/settings/HMSVideoResolution;)V

    return-object v0
.end method

.method public final cameraFacing(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
    .locals 1

    const-string v0, "facing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->cameraFacing:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    return-object p0
.end method

.method public final codec(Llive/hms/video/media/codec/HMSVideoCodec;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
    .locals 1

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->codec:Llive/hms/video/media/codec/HMSVideoCodec;

    return-object p0
.end method

.method public final disableAutoResize(Z)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->disableAutoResize:Z

    return-object p0
.end method

.method public final forceSoftwareDecoder(Z)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->forceSoftwareDecoder:Z

    return-object p0
.end method

.method public final initialState(Llive/hms/video/media/settings/HMSTrackSettings$InitState;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
    .locals 1

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->initialState:Llive/hms/video/media/settings/HMSTrackSettings$InitState;

    return-object p0
.end method

.method public final maxBitrate(I)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
    .locals 0

    iput p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxBitRate:I

    return-object p0
.end method

.method public final maxFrameRate(I)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
    .locals 0

    iput p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxFrameRate:I

    return-object p0
.end method

.method public final resolution(Llive/hms/video/media/settings/HMSVideoResolution;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
    .locals 1

    const-string v0, "resolution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    return-object p0
.end method

.method public final setDegradationPreference(Llive/hms/video/sdk/models/DegradationPreference;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
    .locals 1

    const-string v0, "degradationPreference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->degradationPreference:Llive/hms/video/sdk/models/DegradationPreference;

    return-object p0
.end method

.method public final simulcast$lib_release(ZLlive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->isSimulcastFeatureFlagEnabled:Z

    iput-object p2, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->videoSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;

    iput-object p3, p0, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->screenShareSimulcastLayersParams:Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;

    return-object p0
.end method
