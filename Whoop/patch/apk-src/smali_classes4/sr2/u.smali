.class public final synthetic Lsr2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lsr2/u;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsr2/u;->w:I

    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Lsr2/a0;->m(Lxf3/c;Luf3/a;)Lrq0/k;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1, p2}, Lsr2/a0;->q(Lxf3/c;Luf3/a;)Loq0/k;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1, p2}, Lsr2/a0;->d(Lxf3/c;Luf3/a;)Lrq0/b0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1, p2}, Lsr2/a0;->k(Lxf3/c;Luf3/a;)Lrq0/y;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1, p2}, Lsr2/a0;->r(Lxf3/c;Luf3/a;)Lea2/d0;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {p1, p2}, Lsr2/a0;->o(Lxf3/c;Luf3/a;)Lhc2/a;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1, p2}, Lsr2/a0;->u(Lxf3/c;Luf3/a;)Lhc2/l;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {p1, p2}, Lsr2/a0;->f(Lxf3/c;Luf3/a;)Lqq0/d;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1, p2}, Lsr2/a0;->t(Lxf3/c;Luf3/a;)Lpq0/c;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1, p2}, Lsr2/a0;->z(Lxf3/c;Luf3/a;)Lpq0/f;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1, p2}, Lsr2/a0;->G(Lxf3/c;Luf3/a;)Lwm2/b;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1, p2}, Lsr2/a0;->s(Lxf3/c;Luf3/a;)Lgp0/a;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1, p2}, Lsr2/a0;->j(Lxf3/c;Luf3/a;)Lj02/e;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {p1, p2}, Lsr2/x;->a(Lxf3/c;Luf3/a;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1, p2}, Lsr2/w;->B(Lxf3/c;Luf3/a;)Lvr2/e;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1, p2}, Lsr2/w;->q(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-static {p1, p2}, Lsr2/w;->g(Lxf3/c;Luf3/a;)Lod1/c;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {p1, p2}, Lsr2/w;->Q(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/SettingsLandingRepository;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-static {p1, p2}, Lsr2/w;->D(Lxf3/c;Luf3/a;)Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-static {p1, p2}, Lsr2/w;->k(Lxf3/c;Luf3/a;)Lod1/p;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1, p2}, Lsr2/w;->s(Lxf3/c;Luf3/a;)Li92/a;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-static {p1, p2}, Lsr2/w;->h(Lxf3/c;Luf3/a;)Lga0/c;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-static {p1, p2}, Lsr2/w;->l(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-static {p1, p2}, Lsr2/w;->m(Lxf3/c;Luf3/a;)Lcom/whoop/service/store/SessionStore;

    move-result-object p1

    return-object p1

    :pswitch_17
    invoke-static {p1, p2}, Lsr2/w;->G(Lxf3/c;Luf3/a;)Z

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {p1, p2}, Lsr2/w;->c(Lxf3/c;Luf3/a;)Z

    move-result p1

    goto :goto_0

    :pswitch_19
    invoke-static {p1, p2}, Lsr2/w;->O(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/UserRepository;

    move-result-object p1

    return-object p1

    :pswitch_1a
    invoke-static {p1, p2}, Lsr2/w;->o(Lxf3/c;Luf3/a;)Leq1/a;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1, p2}, Lsr2/w;->M(Lxf3/c;Luf3/a;)Lse2/d;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1, p2}, Lsr2/w;->L(Lxf3/c;Luf3/a;)Lia0/a;

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
