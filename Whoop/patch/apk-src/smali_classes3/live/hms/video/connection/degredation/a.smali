.class public final synthetic Llive/hms/video/connection/degredation/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Llive/hms/video/connection/degredation/a;->w:I

    iput-object p1, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Llive/hms/video/connection/degredation/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lnq0/i;

    invoke-static {v0}, Lnq0/i;->y(Lnq0/i;)Landroidx/lifecycle/v0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/logsymptoms/view/LogSymptomsFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/logsymptoms/view/LogSymptomsFragment;->y(Lcom/whoop/hormonalinsights/logsymptoms/view/LogSymptomsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingIntakeFragment;

    invoke-static {v0}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingIntakeFragment;->y(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingIntakeFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;

    invoke-static {v0}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->y(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;

    invoke-static {v0}, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;->y(Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;

    invoke-static {v0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->C(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lnk1/d;

    invoke-static {v0}, Lnk1/c;->g(Lnk1/d;)Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/clinicalinsights/view/ClinicalInsightsFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/clinicalinsights/view/ClinicalInsightsFragment;->z(Lcom/whoop/advancedlabs/clinicalinsights/view/ClinicalInsightsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;

    invoke-static {v0}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->z(Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;)Ln42/f;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lb3/x2;

    if-eqz v0, :cond_0

    check-cast v0, Lb3/x1;

    invoke-virtual {v0}, Lb3/x1;->a()V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_9
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Ld1/j;

    iget-object v0, v0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :pswitch_a
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lm1/x;

    invoke-interface {v0}, Lm1/x;->invoke()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    goto :goto_0

    :cond_1
    const v1, 0x3e99999a    # 0.3f

    :goto_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;

    invoke-static {v0}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->y(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;)Lmw1/b;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lmq0/e;

    invoke-static {v0}, Lmq0/e;->H(Lmq0/e;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lmp0/z0;

    invoke-static {v0}, Lmp0/z0;->E(Lmp0/z0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lmp0/k0;

    invoke-static {v0}, Lmp0/k0;->E(Lmp0/k0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lmp0/h0;

    invoke-static {v0}, Lmp0/h0;->H(Lmp0/h0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/coaching/sleepcoach/wizard/e;

    invoke-static {v0}, Lcom/whoop/coaching/sleepcoach/wizard/e;->E(Lcom/whoop/coaching/sleepcoach/wizard/e;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/SwitchCompat;

    invoke-static {v0}, Lmp0/b0;->N(Landroidx/appcompat/widget/SwitchCompat;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/coaching/sleepcoach/wizard/d;

    invoke-static {v0}, Lcom/whoop/coaching/sleepcoach/wizard/d;->M(Lcom/whoop/coaching/sleepcoach/wizard/d;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/debug/IterableToolDebugFragment;

    invoke-static {v0}, Lcom/whoop/ui/debug/IterableToolDebugFragment;->J(Lcom/whoop/ui/debug/IterableToolDebugFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Ln41/b;

    invoke-static {v0}, Lm41/e;->f(Ln41/b;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/motiontrackingsandbox/view/MotionTrackingSandboxFragment;

    invoke-static {v0}, Lcom/whoop/motiontrackingsandbox/view/MotionTrackingSandboxFragment;->z(Lcom/whoop/motiontrackingsandbox/view/MotionTrackingSandboxFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/coaching/sleepcoach/harvard/view/OptimalSleepView;

    invoke-static {v0}, Lcom/whoop/coaching/sleepcoach/harvard/view/OptimalSleepView;->a(Lcom/whoop/coaching/sleepcoach/harvard/view/OptimalSleepView;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/videoview/ZoomPanManager;

    invoke-static {v0}, Llive/hms/videoview/ZoomPanManager;->a(Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/matrix/MatrixManager;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/models/PeerSearchResponse;

    invoke-static {v0}, Llive/hms/video/sdk/models/PeerSearchResponse;->a(Llive/hms/video/sdk/models/PeerSearchResponse;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/media/capturers/camera/CameraControl;

    invoke-static {v0}, Llive/hms/video/media/capturers/camera/CameraControl;->a(Llive/hms/video/media/capturers/camera/CameraControl;)Landroid/os/Handler;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/factories/SafeVariable;

    invoke-static {v0}, Llive/hms/video/factories/SafeVariable;->c(Llive/hms/video/factories/SafeVariable;)Landroid/os/Handler;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->c(Llive/hms/video/factories/HMSPeerConnectionFactory;)Llive/hms/video/media/capturers/HMSWavCapturer;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Llive/hms/video/connection/degredation/a;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;

    invoke-static {v0}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->a(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;)Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
