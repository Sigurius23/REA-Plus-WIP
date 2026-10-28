.class public final synthetic Lkk1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkk1/b;->w:I

    iput-object p1, p0, Lkk1/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, Lkk1/b;->w:I

    iput-object p1, p0, Lkk1/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lkk1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lmp0/h0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lmp0/h0;->K(Lmp0/h0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;->G(Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Ll1/g1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lmf0/e;->q(Ll1/g1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/pairing/ui/view/PairingFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/pairing/ui/view/PairingFragment;->E(Lcom/whoop/pairing/ui/view/PairingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lm00/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Lbi/g;->e(Lm00/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/motiontrackingsandbox/view/MotionTrackingSandboxFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/motiontrackingsandbox/view/MotionTrackingSandboxFragment;->y(Lcom/whoop/motiontrackingsandbox/view/MotionTrackingSandboxFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Llw1/i;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Llw1/h;->b(Llw1/i;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/training/hrsettings/view/fragment/HrSettingsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/training/hrsettings/view/fragment/HrSettingsFragment;->y(Lcom/whoop/training/hrsettings/view/fragment/HrSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/transport/HMSTransport;

    check-cast p1, Llive/hms/video/transport/models/TransportState;

    check-cast p2, Llive/hms/video/error/HMSException;

    invoke-static {v0, p1, p2}, Llive/hms/video/transport/HMSTransport;->b(Llive/hms/video/transport/HMSTransport;Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/strava/view/StravaFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/strava/view/StravaFragment;->A(Lcom/whoop/strava/view/StravaFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/stories/OnboardingStoriesDebugFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->H(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Llf0/l2;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Llf0/k2;->b(Llf0/l2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Llf0/w1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Llf0/v1;->b(Llf0/w1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lld0/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Llf0/b;->d(Lld0/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;->D(Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/view/HormonalContextFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/feature/hormonalcontext/view/HormonalContextFragment;->y(Lcom/whoop/advancedlabs/feature/hormonalcontext/view/HormonalContextFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;->z(Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;->A(Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Li7/g;

    check-cast p1, Landroid/graphics/RectF;

    check-cast p2, Landroid/graphics/RectF;

    invoke-static {p1}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object p1

    invoke-static {p2}, Li2/w0;->K(Landroid/graphics/RectF;)Lh2/c;

    move-result-object p2

    iget v0, v0, Li7/g;->w:I

    packed-switch v0, :pswitch_data_1

    invoke-virtual {p1}, Lh2/c;->d()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lh2/c;->a(J)Z

    move-result p1

    goto :goto_0

    :pswitch_12
    invoke-virtual {p1, p2}, Lh2/c;->j(Lh2/c;)Z

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Ll1/w3;

    check-cast p1, Ly3/l;

    check-cast p2, Ly3/a;

    iget-wide v1, p2, Ly3/a;->a:J

    invoke-static {v1, v2}, Ly3/a;->h(J)I

    move-result p2

    int-to-float p2, p2

    new-instance v1, Lm1/b0;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v3, Ll1/x3;->w:Ll1/x3;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v4, p1, Ly3/l;->a:J

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v4, v4

    int-to-float v4, v4

    const/4 v5, 0x2

    int-to-float v8, v5

    div-float v8, p2, v8

    cmpl-float v4, v4, v8

    if-lez v4, :cond_0

    iget-boolean v4, v0, Ll1/w3;->a:Z

    if-nez v4, :cond_0

    sget-object v4, Ll1/x3;->y:Ll1/x3;

    const/high16 v8, 0x40000000    # 2.0f

    div-float v8, p2, v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-interface {v2, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-wide v8, p1, Ly3/l;->a:J

    and-long/2addr v6, v8

    long-to-int p1, v6

    if-eqz p1, :cond_1

    sget-object v4, Ll1/x3;->x:Ll1/x3;

    int-to-float p1, p1

    sub-float/2addr p2, p1

    const/4 p1, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v2, v4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-direct {v1, v2}, Lm1/b0;-><init>(Ljava/util/Map;)V

    iget-object p1, v0, Ll1/w3;->e:Lm1/g;

    iget-object p1, p1, Lm1/g;->h:Lp1/f0;

    invoke-virtual {p1}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/x3;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_5

    const/4 p2, 0x1

    if-eq p1, p2, :cond_4

    if-ne p1, v5, :cond_3

    sget-object p1, Ll1/x3;->y:Ll1/x3;

    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Ll1/x3;->x:Ll1/x3;

    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    sget-object p1, Ll1/x3;->x:Ll1/x3;

    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    :goto_1
    move-object v3, p1

    :cond_5
    new-instance p1, Ll83/k;

    invoke-direct {p1, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Ll1/b2;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-virtual {v0, p1, p2}, Ll1/b2;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Ld0/i1;

    check-cast p1, Ly3/l;

    check-cast p2, Ly3/l;

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Ll03/h;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Ll03/h;->C(Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Ll01/s;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Ll01/r;->f(Ll01/s;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ll00/f;->k(Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lb2/f;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ly3/m;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1, p2}, Lb2/f;->a(IILy3/m;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->N(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/user/journey/view/UserJourneyFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/user/journey/view/UserJourneyFragment;->A(Lcom/whoop/user/journey/view/UserJourneyFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/views/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/ui/views/NewStrapSettingsBatteryIndicator;->f(Lcom/whoop/ui/views/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1d
    iget-object v0, p0, Lkk1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/healthspan/view/HealthspanFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/healthspan/view/HealthspanFragment;->D(Lcom/whoop/healthspan/view/HealthspanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
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

    :pswitch_data_1
    .packed-switch 0x16
        :pswitch_12
    .end packed-switch
.end method
