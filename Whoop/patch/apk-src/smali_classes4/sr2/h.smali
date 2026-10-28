.class public final synthetic Lsr2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lsr2/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsr2/h;->w:I

    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Lsr2/n;->G(Lxf3/c;Luf3/a;)Lcom/whoop/community/data/network/ChatApi;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1, p2}, Lsr2/n;->l(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipApi;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1, p2}, Lsr2/n;->A(Lxf3/c;Luf3/a;)Lor2/h1;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1, p2}, Lsr2/n;->C(Lxf3/c;Luf3/a;)Le50/a;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1, p2}, Lsr2/j;->r(Lxf3/c;Luf3/a;)Lcom/whoop/data/onboarding/OnboardingStatusDao;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {p1, p2}, Lsr2/j;->v(Lxf3/c;Luf3/a;)Lnp0/h;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1, p2}, Lsr2/j;->d(Lxf3/c;Luf3/a;)Lai1/a;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {p1, p2}, Lsr2/j;->o(Lxf3/c;Luf3/a;)Lrf2/a;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1, p2}, Lsr2/j;->c(Lxf3/c;Luf3/a;)Lrk2/c;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1, p2}, Lsr2/j;->f(Lxf3/c;Luf3/a;)Lx90/a;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1, p2}, Lsr2/j;->e(Lxf3/c;Luf3/a;)Luh1/a;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1, p2}, Lsr2/j;->j(Lxf3/c;Luf3/a;)Lfx2/a;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1, p2}, Lsr2/j;->w(Lxf3/c;Luf3/a;)Llm2/a;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {p1, p2}, Lsr2/j;->q(Lxf3/c;Luf3/a;)Lor2/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1, p2}, Lsr2/j;->n(Lxf3/c;Luf3/a;)Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1, p2}, Lsr2/j;->t(Lxf3/c;Luf3/a;)Lcom/whoop/data/local/room/PersistentWhoopDatabase;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-static {p1, p2}, Lsr2/j;->m(Lxf3/c;Luf3/a;)Ltr2/l;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {p1, p2}, Lsr2/j;->x(Lxf3/c;Luf3/a;)Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-static {p1, p2}, Lsr2/j;->p(Lxf3/c;Luf3/a;)Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-static {p1, p2}, Lsr2/j;->k(Lxf3/c;Luf3/a;)Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1, p2}, Lsr2/j;->i(Lxf3/c;Luf3/a;)Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-static {p1, p2}, Lsr2/j;->a(Lxf3/c;Luf3/a;)Lrr2/o;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-static {p1, p2}, Lsr2/j;->l(Lxf3/c;Luf3/a;)Lwe1/j;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-static {p1, p2}, Lsr2/j;->h(Lxf3/c;Luf3/a;)Lwe1/b;

    move-result-object p1

    return-object p1

    :pswitch_17
    invoke-static {p1, p2}, Lsr2/j;->u(Lxf3/c;Luf3/a;)Lji0/a;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {p1, p2}, Lsr2/j;->g(Lxf3/c;Luf3/a;)Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    move-result-object p1

    return-object p1

    :pswitch_19
    invoke-static {p1, p2}, Lsr2/j;->s(Lxf3/c;Luf3/a;)Laa2/e;

    move-result-object p1

    return-object p1

    :pswitch_1a
    invoke-static {p1, p2}, Lsr2/j;->b(Lxf3/c;Luf3/a;)Lcom/whoop/data/local/room/WhoopDatabase;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1, p2}, Lsr2/i;->a(Lxf3/c;Luf3/a;)Lct0/b;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1, p2}, Lsr2/i;->b(Lxf3/c;Luf3/a;)Lts0/a;

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
