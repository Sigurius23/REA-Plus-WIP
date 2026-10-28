.class public final synthetic Lsr2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lsr2/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsr2/m;->w:I

    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Lsr2/t;->b(Lxf3/c;Luf3/a;)Lfi0/c;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1, p2}, Lsr2/t;->d(Lxf3/c;Luf3/a;)Lgj/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1, p2}, Lsr2/t;->i(Lxf3/c;Luf3/a;)Lgj/g;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1, p2}, Lsr2/t;->c(Lxf3/c;Luf3/a;)Lz82/h;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1, p2}, Lsr2/t;->f(Lxf3/c;Luf3/a;)Lz82/b;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {p1, p2}, Lsr2/t;->g(Lxf3/c;Luf3/a;)Lrr2/c;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1, p2}, Lsr2/p;->a(Lxf3/c;Luf3/a;)Lsr2/y;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {p1, p2}, Lsr2/n;->s(Lxf3/c;Luf3/a;)Lin2/h;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1, p2}, Lsr2/n;->o(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/UsersPreferenceApi;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1, p2}, Lsr2/n;->k(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ActivityServiceApi;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1, p2}, Lsr2/n;->z(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ConfigurationApi;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1, p2}, Lsr2/n;->w(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/FeatureFlagsApi;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1, p2}, Lsr2/n;->i(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/CycleMetadataApi;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {p1, p2}, Lsr2/n;->j(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/RmaServiceApi;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1, p2}, Lsr2/n;->v(Lxf3/c;Luf3/a;)Li92/e;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1, p2}, Lsr2/n;->n(Lxf3/c;Luf3/a;)Lcom/whoop/data/remote/RemoteDataSource;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-static {p1, p2}, Lsr2/n;->H(Lxf3/c;Luf3/a;)Lcom/whoop/data/remote/api/FileDownloaderApi;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {p1, p2}, Lsr2/n;->J(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipV2Api;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-static {p1, p2}, Lsr2/n;->b(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ProfileApiService;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-static {p1, p2}, Lsr2/n;->I(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1, p2}, Lsr2/n;->F(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/LegacyTeamServiceApi;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-static {p1, p2}, Lsr2/n;->x(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/CommunityApi;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-static {p1, p2}, Lsr2/n;->D(Lxf3/c;Luf3/a;)Lcq0/b;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-static {p1, p2}, Lsr2/n;->m(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/UsersApi;

    move-result-object p1

    return-object p1

    :pswitch_17
    invoke-static {p1, p2}, Lsr2/n;->K(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipV0Api;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {p1, p2}, Lsr2/n;->f(Lxf3/c;Luf3/a;)Lhh/i;

    move-result-object p1

    return-object p1

    :pswitch_19
    invoke-static {p1, p2}, Lsr2/n;->E(Lxf3/c;Luf3/a;)Lcom/whoop/data/onboarding/OnboardingStatusApi;

    move-result-object p1

    return-object p1

    :pswitch_1a
    invoke-static {p1, p2}, Lsr2/n;->u(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/NotificationApi;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1, p2}, Lsr2/n;->a(Lxf3/c;Luf3/a;)Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1, p2}, Lsr2/n;->r(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/LanguageApi;

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
