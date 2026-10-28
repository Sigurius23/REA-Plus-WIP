.class public final synthetic Lp02/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lp02/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lp02/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->d(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->l(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->c(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->h(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/ProfileApi;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lcom/whoop/profile/di/ProfileModule;->b(Lxf3/c;Luf3/a;)Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ly1/b;

    check-cast p2, Lq3/y;

    iget-object v0, p2, Lq3/y;->a:Ll3/g;

    sget-object v1, Ll3/l0;->a:Lp0/n0;

    invoke-static {v0, v1, p1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v0

    iget-wide v1, p2, Lq3/y;->b:J

    new-instance p2, Ll3/u0;

    invoke-direct {p2, v1, v2}, Ll3/u0;-><init>(J)V

    sget-object v1, Ll3/l0;->p:Lp0/n0;

    invoke-static {p2, v1, p1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpw2/a;->a(Lxf3/c;Luf3/a;)Lqw2/c;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpw2/a;->c(Lxf3/c;Luf3/a;)Ltw2/c;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpw2/a;->b(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/domain/model/User;

    check-cast p2, Lcom/whoop/domain/model/User;

    invoke-static {p1, p2}, Lpr2/a;->a(Lcom/whoop/domain/model/User;Lcom/whoop/domain/model/User;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpi2/a;->a(Lxf3/c;Luf3/a;)Lti2/f;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpi2/a;->d(Lxf3/c;Luf3/a;)Lvi2/b;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpi2/a;->c(Lxf3/c;Luf3/a;)Loi2/b;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpi2/a;->g(Lxf3/c;Luf3/a;)Lqi2/c;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpi2/a;->b(Lxf3/c;Luf3/a;)Lcom/whoop/streaks/domain/StreaksApi;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpi2/a;->h(Lxf3/c;Luf3/a;)Lsi2/a;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpi2/a;->f(Lxf3/c;Luf3/a;)Lad3/c;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpi2/a;->e(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpf1/a;->c(Lxf3/c;Luf3/a;)Lj02/l0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpf1/a;->h(Lxf3/c;Luf3/a;)Lj02/b0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpf1/a;->i(Lxf3/c;Luf3/a;)Lor2/b1;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpf1/a;->b(Lxf3/c;Luf3/a;)Lym2/g;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpf1/a;->g(Lxf3/c;Luf3/a;)Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpf1/a;->e(Lxf3/c;Luf3/a;)Lcom/whoop/data/interactor/ExportedMetricsInteractor;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpf1/a;->d(Lxf3/c;Luf3/a;)Lcom/whoop/data/room/CachedStrapPacketDatabase;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lpf1/a;->a(Lxf3/c;Luf3/a;)Lcom/whoop/ui/DensityBucket;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p2, Ll83/a0;

    check-cast p1, La3/n0;

    const/4 p2, 0x1

    iput-boolean p2, p1, La3/n0;->d0:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lp02/b;->f(Lxf3/c;Luf3/a;)Lhb1/f;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lp02/b;->g(Lxf3/c;Luf3/a;)Ls02/a;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lp02/b;->a(Lxf3/c;Luf3/a;)Lt02/a;

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
