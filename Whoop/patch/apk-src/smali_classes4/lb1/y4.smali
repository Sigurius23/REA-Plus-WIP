.class public final synthetic Llb1/y4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llb1/y4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llb1/y4;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/design/models/items/KeyStatisticModel;

    invoke-static {p1}, Llb1/a5;->N(Lcom/whoop/design/models/items/KeyStatisticModel;)Lc41/x5;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/design/models/items/MetricStatusTileModel;

    invoke-static {p1}, Llb1/a5;->z(Lcom/whoop/design/models/items/MetricStatusTileModel;)Lc41/h3;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/design/models/items/StatusTileModel;

    invoke-static {p1}, Llb1/a5;->q(Lcom/whoop/design/models/items/StatusTileModel;)Lc41/i5;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/design/models/items/SupportActionTileModel;

    invoke-static {p1}, Llb1/a5;->i(Lcom/whoop/design/models/items/SupportActionTileModel;)Lc41/l5;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/design/models/items/HorizontalMetricTileModel;

    invoke-static {p1}, Llb1/a5;->K(Lcom/whoop/design/models/items/HorizontalMetricTileModel;)Lc41/l2;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Llb1/a5;->Q(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Llb1/a5;->P(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/design/models/items/ActivityModel;

    invoke-static {p1}, Llb1/a5;->T(Lcom/whoop/design/models/items/ActivityModel;)Lc41/w;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/design/models/items/WhoopCoachVowModel;

    invoke-static {p1}, Llb1/a5;->d(Lcom/whoop/design/models/items/WhoopCoachVowModel;)Ls01/d;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/design/models/items/VowCtaModel;

    invoke-static {p1}, Llb1/a5;->Y(Lcom/whoop/design/models/items/VowCtaModel;)Lc41/t0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;

    invoke-static {p1}, Llb1/a5;->u(Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;)Lk01/e;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/design/models/items/SleepPlannerCardModel;

    invoke-static {p1}, Llb1/a5;->g(Lcom/whoop/design/models/items/SleepPlannerCardModel;)Lj01/d;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/design/models/items/VowModel;

    invoke-static {p1}, Llb1/a5;->w(Lcom/whoop/design/models/items/VowModel;)Lk51/c;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/design/models/items/HealthMonitorModel;

    invoke-static {p1}, Llb1/a5;->V(Lcom/whoop/design/models/items/HealthMonitorModel;)Lc41/e2;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lcom/whoop/design/models/items/StepperComponentModel;

    invoke-static {p1}, Llb1/a5;->U(Lcom/whoop/design/models/items/StepperComponentModel;)Lv31/g;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/design/models/items/ContributorTileModel;

    invoke-static {p1}, Llb1/a5;->o(Lcom/whoop/design/models/items/ContributorTileModel;)Lc41/i1;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lcom/whoop/design/models/items/MenuItemModel;

    invoke-static {p1}, Llb1/a5;->S(Lcom/whoop/design/models/items/MenuItemModel;)Ly71/o;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/design/models/items/MiniMonitorCardModel;

    invoke-static {p1}, Llb1/a5;->W(Lcom/whoop/design/models/items/MiniMonitorCardModel;)Lc41/i3;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lcom/whoop/design/models/items/SplitContainerCardModel;

    invoke-static {p1}, Llb1/a5;->r(Lcom/whoop/design/models/items/SplitContainerCardModel;)Lc41/e5;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/design/models/items/GlassTileModel;

    invoke-static {p1}, Llb1/a5;->C(Lcom/whoop/design/models/items/GlassTileModel;)Lc41/z1;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/design/models/items/ProfileInfoTileListModel;

    invoke-static {p1}, Llb1/a5;->m(Lcom/whoop/design/models/items/ProfileInfoTileListModel;)Lc41/p4;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/design/models/items/ProfileInfoTileModel;

    invoke-static {p1}, Llb1/a5;->J(Lcom/whoop/design/models/items/ProfileInfoTileModel;)Lc41/r4;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/design/models/items/HeartRateZone;

    invoke-static {p1}, Llb1/a5;->L(Lcom/whoop/design/models/items/HeartRateZone;)Ly11/l;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/design/models/items/PlanTileModel;

    invoke-static {p1}, Llb1/a5;->b0(Lcom/whoop/design/models/items/PlanTileModel;)Lg41/e;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lcom/whoop/design/models/items/HealthMonitorCardModel;

    invoke-static {p1}, Llb1/a5;->y(Lcom/whoop/design/models/items/HealthMonitorCardModel;)Lc21/d;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/design/models/items/ItemsCardModel;

    invoke-static {p1}, Llb1/a5;->f(Lcom/whoop/design/models/items/ItemsCardModel;)Lv71/i;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lcom/whoop/design/models/items/HeaderItemsCardModel;

    invoke-static {p1}, Llb1/a5;->t(Lcom/whoop/design/models/items/HeaderItemsCardModel;)Lm71/d;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lcom/whoop/design/models/items/TitleTileModel;

    invoke-static {p1}, Llb1/a5;->s(Lcom/whoop/design/models/items/TitleTileModel;)Lc41/r5;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lcom/whoop/design/models/items/ListItemTileModel;

    invoke-static {p1}, Llb1/a5;->Z(Lcom/whoop/design/models/items/ListItemTileModel;)Lc41/c3;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;

    invoke-static {p1}, Llb1/a5;->E(Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;)Lt71/f;

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
