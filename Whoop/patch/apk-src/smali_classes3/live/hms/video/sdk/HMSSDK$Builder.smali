.class public final Llive/hms/video/sdk/HMSSDK$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/HMSSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001a\u0010\u0011J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0016\u00a2\u0006\u0004\u0008$\u0010\u0019J\r\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008&\u0010\'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010(R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010+R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0016\u0010.\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u00100R\u0016\u00101\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0016\u00103\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00100R\u0016\u00104\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00100\u00a8\u00065"
    }
    d2 = {
        "Llive/hms/video/sdk/HMSSDK$Builder;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "trackSettings",
        "setTrackSettings",
        "(Llive/hms/video/media/settings/HMSTrackSettings;)Llive/hms/video/sdk/HMSSDK$Builder;",
        "Llive/hms/video/media/settings/HMSLogSettings;",
        "hmsLogSettings",
        "setLogSettings",
        "(Llive/hms/video/media/settings/HMSLogSettings;)Llive/hms/video/sdk/HMSSDK$Builder;",
        "Llive/hms/video/utils/HMSLogger$LogLevel;",
        "hmsLogLevel",
        "setLogLevel",
        "(Llive/hms/video/utils/HMSLogger$LogLevel;)Llive/hms/video/sdk/HMSSDK$Builder;",
        "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;",
        "level",
        "setAnalyticEventLevel",
        "(Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;)Llive/hms/video/sdk/HMSSDK$Builder;",
        "",
        "shouldSkip",
        "shouldSkipPIIEvents",
        "(Z)Llive/hms/video/sdk/HMSSDK$Builder;",
        "setWebRtcLogLevel",
        "Llive/hms/video/sdk/models/FrameworkInfo;",
        "frameworkInfo",
        "setFrameworkInfo",
        "(Llive/hms/video/sdk/models/FrameworkInfo;)Llive/hms/video/sdk/HMSSDK$Builder;",
        "enable",
        "Ll83/a0;",
        "enableIceGatheringOnAnyAddressPorts",
        "(Z)V",
        "halt",
        "haltPreviewJoinForPermissionsRequest",
        "Llive/hms/video/sdk/HMSSDK;",
        "build",
        "()Llive/hms/video/sdk/HMSSDK;",
        "Landroid/content/Context;",
        "hmsSettings",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "Llive/hms/video/media/settings/HMSLogSettings;",
        "hmsWebRtcLogLevel",
        "Llive/hms/video/utils/HMSLogger$LogLevel;",
        "hmsAnalyticsEventLevel",
        "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;",
        "Z",
        "envFrameworkInfo",
        "Llive/hms/video/sdk/models/FrameworkInfo;",
        "haltPreviewJoinForPermissions",
        "iceGatheringOnAnyAddressPorts",
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
.field private final context:Landroid/content/Context;

.field private envFrameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

.field private haltPreviewJoinForPermissions:Z

.field private hmsAnalyticsEventLevel:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

.field private hmsLogSettings:Llive/hms/video/media/settings/HMSLogSettings;

.field private hmsSettings:Llive/hms/video/media/settings/HMSTrackSettings;

.field private hmsWebRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;

.field private iceGatheringOnAnyAddressPorts:Z

.field private shouldSkipPIIEvents:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->context:Landroid/content/Context;

    new-instance p1, Llive/hms/video/media/settings/HMSTrackSettings$Builder;

    invoke-direct {p1}, Llive/hms/video/media/settings/HMSTrackSettings$Builder;-><init>()V

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSTrackSettings$Builder;->build()Llive/hms/video/media/settings/HMSTrackSettings;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    new-instance v0, Llive/hms/video/media/settings/HMSLogSettings;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Llive/hms/video/media/settings/HMSLogSettings;-><init>(JZLlive/hms/video/utils/HMSLogger$LogLevel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsLogSettings:Llive/hms/video/media/settings/HMSLogSettings;

    sget-object p1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    invoke-virtual {p1}, Llive/hms/video/utils/HMSLogger;->getWebRtcLogLevel()Llive/hms/video/utils/HMSLogger$LogLevel;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsWebRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;

    sget-object p1, Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;->INFO:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsAnalyticsEventLevel:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    const/4 p1, 0x1

    iput-boolean p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->shouldSkipPIIEvents:Z

    new-instance v0, Llive/hms/video/sdk/models/FrameworkInfo;

    sget-object v1, Llive/hms/video/events/AgentType;->ANDROID_NATIVE:Llive/hms/video/events/AgentType;

    const/4 v5, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Llive/hms/video/sdk/models/FrameworkInfo;-><init>(Llive/hms/video/events/AgentType;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Llive/hms/video/sdk/HMSSDK$Builder;->envFrameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

    return-void
.end method


# virtual methods
.method public final build()Llive/hms/video/sdk/HMSSDK;
    .locals 10

    new-instance v0, Llive/hms/video/sdk/HMSSDK;

    iget-object v1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    iget-object v2, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsAnalyticsEventLevel:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    iget-object v3, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsWebRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;

    iget-boolean v4, p0, Llive/hms/video/sdk/HMSSDK$Builder;->shouldSkipPIIEvents:Z

    iget-object v5, p0, Llive/hms/video/sdk/HMSSDK$Builder;->context:Landroid/content/Context;

    iget-object v6, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsLogSettings:Llive/hms/video/media/settings/HMSLogSettings;

    iget-object v7, p0, Llive/hms/video/sdk/HMSSDK$Builder;->envFrameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

    iget-boolean v8, p0, Llive/hms/video/sdk/HMSSDK$Builder;->haltPreviewJoinForPermissions:Z

    iget-boolean v9, p0, Llive/hms/video/sdk/HMSSDK$Builder;->iceGatheringOnAnyAddressPorts:Z

    invoke-direct/range {v0 .. v9}, Llive/hms/video/sdk/HMSSDK;-><init>(Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/utils/HMSLogger$LogLevel;ZLandroid/content/Context;Llive/hms/video/media/settings/HMSLogSettings;Llive/hms/video/sdk/models/FrameworkInfo;ZZ)V

    return-object v0
.end method

.method public final enableIceGatheringOnAnyAddressPorts(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->iceGatheringOnAnyAddressPorts:Z

    return-void
.end method

.method public final haltPreviewJoinForPermissionsRequest(Z)Llive/hms/video/sdk/HMSSDK$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->haltPreviewJoinForPermissions:Z

    return-object p0
.end method

.method public final setAnalyticEventLevel(Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;)Llive/hms/video/sdk/HMSSDK$Builder;
    .locals 1

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsAnalyticsEventLevel:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    return-object p0
.end method

.method public final setFrameworkInfo(Llive/hms/video/sdk/models/FrameworkInfo;)Llive/hms/video/sdk/HMSSDK$Builder;
    .locals 1

    const-string v0, "frameworkInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->envFrameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

    return-object p0
.end method

.method public final setLogLevel(Llive/hms/video/utils/HMSLogger$LogLevel;)Llive/hms/video/sdk/HMSSDK$Builder;
    .locals 8
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "hmsLogLevel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/media/settings/HMSLogSettings;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Llive/hms/video/media/settings/HMSLogSettings;-><init>(JZLlive/hms/video/utils/HMSLogger$LogLevel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsLogSettings:Llive/hms/video/media/settings/HMSLogSettings;

    return-object p0
.end method

.method public final setLogSettings(Llive/hms/video/media/settings/HMSLogSettings;)Llive/hms/video/sdk/HMSSDK$Builder;
    .locals 1

    const-string v0, "hmsLogSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsLogSettings:Llive/hms/video/media/settings/HMSLogSettings;

    return-object p0
.end method

.method public final setTrackSettings(Llive/hms/video/media/settings/HMSTrackSettings;)Llive/hms/video/sdk/HMSSDK$Builder;
    .locals 1

    const-string v0, "trackSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    return-object p0
.end method

.method public final setWebRtcLogLevel(Llive/hms/video/utils/HMSLogger$LogLevel;)Llive/hms/video/sdk/HMSSDK$Builder;
    .locals 1

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->hmsWebRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;

    return-object p0
.end method

.method public final shouldSkipPIIEvents(Z)Llive/hms/video/sdk/HMSSDK$Builder;
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/sdk/HMSSDK$Builder;->shouldSkipPIIEvents:Z

    return-object p0
.end method
