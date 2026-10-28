.class public final Llive/hms/video/sdk/NoiseCancellationReportingUseCase;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0013\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\u00082\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u001a\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001eR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Llive/hms/video/sdk/NoiseCancellationReportingUseCase;",
        "",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "hmsTrackSettings",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;",
        "ncStatusChecker",
        "Lkotlin/Function1;",
        "Llive/hms/video/events/AnalyticsEvent;",
        "Ll83/a0;",
        "sendRealtimeEvent",
        "<init>",
        "(Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;Lkotlin/jvm/functions/Function1;)V",
        "",
        "isNcEnabledInTrackSettings",
        "()Z",
        "isWebrtcPeer",
        "peerJoined",
        "(ZLlive/hms/video/media/settings/HMSTrackSettings;)V",
        "enabled",
        "noiseCancellationState",
        "(Z)V",
        "getReport",
        "()Llive/hms/video/events/AnalyticsEvent;",
        "reset",
        "()V",
        "wasWebrtcPeer",
        "joined",
        "localPeerRoleChanged",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;",
        "Lkotlin/jvm/functions/Function1;",
        "",
        "TAG",
        "Ljava/lang/String;",
        "",
        "startTime",
        "J",
        "duration",
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
.field private final TAG:Ljava/lang/String;

.field private duration:J

.field private final hmsTrackSettings:Llive/hms/video/media/settings/HMSTrackSettings;

.field private final ncStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

.field private final sendRealtimeEvent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private startTime:J


# direct methods
.method public constructor <init>(Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/settings/HMSTrackSettings;",
            "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "hmsTrackSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ncStatusChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sendRealtimeEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->hmsTrackSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    iput-object p2, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->ncStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    iput-object p3, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->sendRealtimeEvent:Lkotlin/jvm/functions/Function1;

    const-string p1, "NCReportingUseCase"

    iput-object p1, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->TAG:Ljava/lang/String;

    return-void
.end method

.method private final isNcEnabledInTrackSettings()Z
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->hmsTrackSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSTrackSettings;->getAudioSettings()Llive/hms/video/media/settings/HMSAudioTrackSettings;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getEnableNoiseCancellation()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method


# virtual methods
.method public final getReport()Llive/hms/video/events/AnalyticsEvent;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->noiseCancellationState(Z)V

    iget-wide v0, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->duration:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    sget-object v2, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v2, v0, v1}, Llive/hms/video/events/AnalyticsEventFactory;->noiseCancellationStats(J)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " Generating event "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final localPeerRoleChanged(Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V
    .locals 2

    invoke-direct {p0}, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->isNcEnabledInTrackSettings()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p3, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Local peer role changed wasWebrtc: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isWebrtc: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->noiseCancellationState(Z)V

    return-void

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->noiseCancellationState(Z)V

    :cond_1
    return-void

    :cond_2
    iget-object p1, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->TAG:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Local peer role changed, ignoring since NC is not enabled by default or join: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final noiseCancellationState(Z)V
    .locals 8

    iget-object v0, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NC "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->ncStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    invoke-virtual {v0}, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->isNoiseCancellationAvailable()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;

    move-result-object v0

    sget-object v1, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$Available;->INSTANCE:Llive/hms/video/factories/noisecancellation/AvailabilityStatus$Available;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    if-eqz p1, :cond_1

    iget-wide v2, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->startTime:J

    cmp-long v2, v2, v0

    if-nez v2, :cond_2

    :cond_1
    if-nez p1, :cond_3

    iget-wide v2, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->startTime:J

    cmp-long v2, v2, v0

    if-nez v2, :cond_3

    :cond_2
    :goto_0
    return-void

    :cond_3
    if-eqz p1, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->startTime:J

    goto :goto_1

    :cond_4
    iget-wide v2, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->duration:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->startTime:J

    sub-long/2addr v4, v6

    add-long/2addr v4, v2

    iput-wide v4, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->duration:J

    iput-wide v0, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->startTime:J

    :goto_1
    iget-object v0, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->sendRealtimeEvent:Lkotlin/jvm/functions/Function1;

    sget-object v1, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v1, p1}, Llive/hms/video/events/AnalyticsEventFactory;->noiseCancellationStats(Z)Llive/hms/video/events/AnalyticsEvent;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final peerJoined(ZLlive/hms/video/media/settings/HMSTrackSettings;)V
    .locals 1

    const-string v0, "hmsTrackSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSTrackSettings;->getAudioSettings()Llive/hms/video/media/settings/HMSAudioTrackSettings;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getEnableNoiseCancellation()Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->TAG:Ljava/lang/String;

    const-string v0, "Enabling noise cancellation from join"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p2}, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->noiseCancellationState(Z)V

    :cond_0
    return-void
.end method

.method public final reset()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->TAG:Ljava/lang/String;

    const-string v1, "Resetting all values"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->startTime:J

    iput-wide v0, p0, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->duration:J

    return-void
.end method
