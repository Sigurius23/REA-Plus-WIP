.class public final synthetic Lvv1/c;
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

    iput p2, p0, Lvv1/c;->w:I

    iput-object p1, p0, Lvv1/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lvv1/c;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x60

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    iget-object v0, v0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    const-string v1, "StripeAnalyticsRequestV2Storage"

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/feedbacksurvey/view/FeedbackSurveyFragment;

    invoke-static {v0}, Lcom/whoop/feedbacksurvey/view/FeedbackSurveyFragment;->y(Lcom/whoop/feedbacksurvey/view/FeedbackSurveyFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/entitlements/ui/NotFoundFragment;

    invoke-static {v0}, Lcom/whoop/entitlements/ui/NotFoundFragment;->A(Lcom/whoop/entitlements/ui/NotFoundFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/time/Duration;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "applying clock skew "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v2

    invoke-static {v2, v3}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " to client"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    sget-object v1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->Companion:Lcom/stripe/hcaptcha/config/a;

    invoke-virtual {v1}, Lcom/stripe/hcaptcha/config/a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    sget-object v2, Lw40/b;->a:Lad3/r;

    const-string v2, "serializer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lw40/b;->a:Lad3/r;

    invoke-virtual {v2, v1, v0}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Ly40/a;

    iget-object v0, v0, Ly40/a;->w:Landroid/content/Context;

    :try_start_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getPackageCodePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Ly40/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v2, Lw40/b;->a:Lad3/r;

    sget-object v2, Lw40/b;->a:Lad3/r;

    invoke-virtual {v2, v1, v0}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "JSDI"

    const-string v1, "Cannot build debugInfo"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "[]"

    :goto_0
    return-object v0

    :pswitch_5
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/CommunityManageTeamFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityManageTeamFragment;->F(Lcom/whoop/community/CommunityManageTeamFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/CommunityFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityFragment;->H(Lcom/whoop/community/CommunityFragment;)Lcom/whoop/domain/model/teams/Team;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->y(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lx6/d;

    iget-object v0, v5, Lx6/d;->x:Lwr1/f;

    invoke-virtual {v0}, Lwr1/f;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    new-instance v3, Lkotlin/jvm/internal/f0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/f0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v2, v5, Lx6/d;->z:Ljava/lang/Object;

    monitor-enter v2

    :try_start_1
    iget-wide v8, v5, Lx6/d;->F:J

    sub-long v8, v6, v8

    iput-wide v8, v3, Lkotlin/jvm/internal/f0;->w:J

    iget v0, v5, Lx6/d;->E:I

    int-to-long v8, v0

    const-wide/32 v10, 0x3b9aca00

    div-long/2addr v10, v8

    iput-wide v10, v4, Lkotlin/jvm/internal/f0;->w:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    iget-object v0, v5, Lx6/d;->w:Lbc3/c0;

    new-instance v2, Lf0/c;

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lf0/c;-><init>(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/f0;Lx6/d;JLq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v1, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :pswitch_9
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lz10/e;

    invoke-virtual {v0}, Lz10/e;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lwz/y;

    invoke-virtual {v0}, Lwz/y;->n()Ld00/l;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lwz/e1;

    iget-object v1, v0, Lwz/e1;->b:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/f;

    iget-object v4, v4, Leb/f;->a:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lm83/g0;->W(I)I

    move-result v3

    const/16 v4, 0x10

    if-ge v3, v4, :cond_1

    move v3, v4

    :cond_1
    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "{"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "}"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    iget-object v0, v0, Lwz/e1;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lwz/n1;->c(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lwx/g;

    iget-object v0, v0, Lwx/g;->w:Ljava/lang/String;

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/attestation/AttestationActivity;

    iget-object v0, v0, Lcom/stripe/android/attestation/AttestationActivity;->w:Ll8/d;

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;

    invoke-static {v0}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->A(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/streaks/view/StreaksFragment;

    invoke-static {v0}, Lcom/whoop/streaks/view/StreaksFragment;->z(Lcom/whoop/streaks/view/StreaksFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lwe/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Canonical request:\n"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lwe/j;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj93/a0;

    invoke-interface {v0}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lwc/p0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to load token using token provider for sso-session: `"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lwc/p0;->E:Ljava/lang/String;

    invoke-static {v1, v0, v3}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lwd/m;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Assuming role `"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lwd/m;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lce/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Loading credentials from profile `"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lce/j;->a()Lce/k;

    move-result-object v0

    iget-object v0, v0, Lce/k;->a:Ljava/lang/String;

    invoke-static {v1, v0, v3}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lwc/w;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to load token using token provider for login-session: `"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lwc/w;->w:Ljava/lang/String;

    invoke-static {v1, v0, v3}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lve/e;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "obtained credentials from container metadata service; expiration="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lve/e;->a()Lug/b;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v1, Lug/t;->w:Lug/t;

    invoke-virtual {v0, v1}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/achievements/view/AchievementsFragment;

    invoke-static {v0}, Lcom/whoop/achievements/view/AchievementsFragment;->y(Lcom/whoop/achievements/view/AchievementsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lw01/h;

    invoke-static {v0}, Lw01/g;->n(Lw01/h;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/debug/whoopble/WhoopBleDebugFragment;

    invoke-static {v0}, Lcom/whoop/debug/whoopble/WhoopBleDebugFragment;->z(Lcom/whoop/debug/whoopble/WhoopBleDebugFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/k1;

    const-string v1, "STRIPE_ANALYTICS_LOCAL_SESSION"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvx/c;

    if-eqz v2, :cond_6

    instance-of v3, v2, Lvx/b;

    if-eqz v3, :cond_4

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    sget-object v3, Lyy/c;->g:Ljava/util/UUID;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sput-object v2, Lyy/c;->g:Ljava/util/UUID;

    new-instance v3, Lvx/b;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "toString(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v2}, Lvx/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    instance-of v0, v2, Lvx/a;

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lvv2/a;

    invoke-static {v0}, Lvv2/e;->j(Lvv2/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lvv1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    invoke-static {v0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->D(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;)Luf3/a;

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
