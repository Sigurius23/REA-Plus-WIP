.class public final synthetic Lq42/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lq42/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lq42/a;->w:I

    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Lqg1/b;->h(Lxf3/c;Luf3/a;)Lmg1/c;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1, p2}, Lqg1/b;->f(Lxf3/c;Luf3/a;)Lu92/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1, p2}, Lq82/a;->e(Lxf3/c;Luf3/a;)Lr82/a;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1, p2}, Lq82/a;->a(Lxf3/c;Luf3/a;)Lp82/b;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1, p2}, Lq82/a;->b(Lxf3/c;Luf3/a;)Lp82/a;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {p1, p2}, Lq82/a;->c(Lxf3/c;Luf3/a;)Lcom/whoop/sensorDataUpload/retrofit/SensorDataApi;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1, p2}, Lq60/a;->j(Lxf3/c;Luf3/a;)Lcom/whoop/achievements/celebration/c;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {p1, p2}, Lq60/a;->m(Lxf3/c;Luf3/a;)Lo60/c;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1, p2}, Lq60/a;->g(Lxf3/c;Luf3/a;)Lo60/a;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1, p2}, Lq60/a;->c(Lxf3/c;Luf3/a;)Lp60/a;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1, p2}, Lq60/a;->d(Lxf3/c;Luf3/a;)Ln60/c;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1, p2}, Lq60/a;->e(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1, p2}, Lq60/a;->s(Lxf3/c;Luf3/a;)Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {p1, p2}, Lq60/a;->k(Lxf3/c;Luf3/a;)Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1, p2}, Lq60/a;->a(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1, p2}, Lq60/a;->l(Lxf3/c;Luf3/a;)Lu60/b;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-static {p1, p2}, Lq60/a;->n(Lxf3/c;Luf3/a;)Lk60/b;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {p1, p2}, Lq60/a;->f(Lxf3/c;Luf3/a;)Lt60/a;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-static {p1, p2}, Lq60/a;->h(Lxf3/c;Luf3/a;)Lt60/c;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-static {p1, p2}, Lq60/a;->o(Lxf3/c;Luf3/a;)Lv60/a;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1, p2}, Lq60/a;->t(Lxf3/c;Luf3/a;)Lr60/d;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-static {p1, p2}, Lq60/a;->i(Lxf3/c;Luf3/a;)Lm60/a;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->i(Lxf3/c;Luf3/a;)Lcom/whoop/profile/navigation/ProfileActionRouter;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->a(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;

    move-result-object p1

    return-object p1

    :pswitch_17
    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->m(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/ProfileInteractor;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->j(Lxf3/c;Luf3/a;)Lu82/a;

    move-result-object p1

    return-object p1

    :pswitch_19
    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->o(Lxf3/c;Luf3/a;)Lu82/d;

    move-result-object p1

    return-object p1

    :pswitch_1a
    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->g(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->n(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->k(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/ProfileViewModel;

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
