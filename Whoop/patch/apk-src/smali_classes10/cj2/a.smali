.class public final synthetic Lcj2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcj2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcj2/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->d(Ltb/a;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->a(Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->d(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->a(Ltb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    invoke-static {p1}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->m(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    invoke-static {p1}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->g(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    invoke-static {p1}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->a(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    invoke-static {p1}, Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt;->d(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    invoke-static {p1}, Lcom/whoop/bot/settings/CoachSettingsCoachingModeKt;->b(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    invoke-static {p1}, Lcom/whoop/bot/settings/CoachSettingsActivityRecommendationContentKt;->b(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lcom/whoop/ai/chat/domain/formwidget/g;->a(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ly81/i;

    invoke-static {p1}, Lcm2/x;->a(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Luz0/h;

    invoke-static {p1}, Lcm0/d;->c(Luz0/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {p1}, Lcm0/d;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lck2/a;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {p1}, Lck1/m;->a(Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lck1/j;->e(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/io/File;

    invoke-static {p1}, Lck1/j;->c(Ljava/io/File;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->y(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-static {p1}, Lck1/i;->p(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1}, Lck1/i;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lvj1/a;

    invoke-static {p1}, Lck1/i;->b(Lvj1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lvj1/a;

    invoke-static {p1}, Lck1/f;->f(Lvj1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lzj1/a;

    invoke-static {p1}, Lck1/f;->h(Lzj1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lak1/b;

    invoke-static {p1}, Lck1/f;->e(Lak1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lck1/d;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;

    invoke-static {p1}, Lcj2/b;->a(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;)Ldj2/b;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lcj2/b;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lcj2/b;->d(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lcj2/b;->c(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

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
