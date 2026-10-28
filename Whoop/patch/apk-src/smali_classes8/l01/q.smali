.class public final synthetic Ll01/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ll01/q;->w:I

    iput-object p2, p0, Ll01/q;->x:Ljava/lang/Object;

    iput-object p3, p0, Ll01/q;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Ll01/q;->w:I

    iput-object p1, p0, Ll01/q;->y:Ljava/lang/Object;

    iput-object p2, p0, Ll01/q;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Ll01/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Lji2/c;

    invoke-static {v0, v1}, Lmi2/c;->k(Lkotlin/jvm/functions/Function1;Lji2/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Lld1/c;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lmh0/h;

    invoke-static {v0, v1}, Lmh0/i;->b(Lld1/c;Lmh0/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Lzr2/a;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Lmf0/e;->e(Lzr2/a;Lp1/c1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Llq0/d;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Landroid/net/ConnectivityManager;

    sget-object v2, Lmc/g;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lmc/g;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    sget-object v3, Lmc/i;->a:Ljava/lang/String;

    const-string v4, "NetworkRequestConstraintController unregister shared callback"

    invoke-virtual {v0, v3, v4}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lmc/g;->a:Lmc/g;

    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    const/4 v0, 0x0

    sput-boolean v0, Lmc/g;->f:Z

    const/4 v1, 0x0

    sput-object v1, Lmc/g;->d:Landroid/net/NetworkCapabilities;

    sput-boolean v0, Lmc/g;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v2

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_1
    monitor-exit v2

    throw v0

    :pswitch_3
    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Lqt0/b;

    invoke-static {v0, v1}, Lm22/d;->b(Lkotlin/jvm/functions/Function1;Lqt0/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Ll1/x4;

    new-instance v2, Lm1/j;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v2, v1, v4, v3}, Lm1/j;-><init>(Ll1/x4;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v0, v4, v4, v2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_5
    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Ljz1/c$a;

    invoke-static {v0, v1}, Llz1/b;->j(Lkotlin/jvm/functions/Function1;Ljz1/c$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Llm1/d;

    invoke-static {v0, v1}, Llm1/c;->c(Lkotlin/jvm/functions/Function1;Llm1/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/SignatureChecker;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/utils/HMSAgentOs;

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSAgentOs;->b(Llive/hms/video/sdk/SignatureChecker;Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/transport/HMSTransport;

    invoke-static {v0, v1}, Llive/hms/video/transport/HMSTransport;->a(Landroid/content/Context;Llive/hms/video/transport/HMSTransport;)Llive/hms/video/factories/HMSPeerConnectionFactory;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/plugin/video/HMSVideoPlugin;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lhms/webrtc/VideoFrame;

    invoke-static {v0, v1}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->a(Llive/hms/video/plugin/video/HMSVideoPlugin;Lhms/webrtc/VideoFrame;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    invoke-static {v0, v1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->a(Landroid/content/Context;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    invoke-static {v0, v1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;->b(Lkotlin/jvm/functions/Function1;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/stories/OnboardingStoriesDebugFragment;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->F(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Llg2/b;

    invoke-static {v0, v1}, Llg2/c;->d(Lkotlin/jvm/functions/Function1;Llg2/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Llf0/r2;

    invoke-static {v0, v1}, Llf0/q2;->c(Lkotlin/jvm/functions/Function1;Llf0/r2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Lld0/s;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Llf0/h2;->a(Lld0/s;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Lld0/i;

    invoke-static {v0, v1}, Llf0/b2;->a(Lkotlin/jvm/functions/Function1;Lld0/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Llf0/d1;

    invoke-static {v0, v1}, Llf0/c1;->b(Lkotlin/jvm/functions/Function1;Llf0/d1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Llf0/h0;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Llf0/i0;->b(Llf0/h0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Lld0/a;

    invoke-static {v0, v1}, Llf0/a;->a(Lkotlin/jvm/functions/Function1;Lld0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Ljc0/d$d;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Llc0/j;->h(Ljc0/d$d;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Ljc0/d$c$a;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Llc0/j;->i(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Lf70/q0;

    invoke-static {v0, v1}, Ll80/n;->g(Lkotlin/jvm/functions/Function1;Lf70/q0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Lz1/p;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lj72/d;

    invoke-static {v0, v1}, Ll72/i;->g(Lz1/p;Lj72/d;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v1, Lj72/c;

    invoke-static {v0, v1}, Ll72/e;->c(Lkotlin/jvm/functions/Function1;Lj72/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Lj72/b;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Ll72/d;->b(Lj72/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Lj32/j;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Ll32/b;

    invoke-static {v0, v1}, Ll32/c;->b(Lj32/j;Ll32/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Ll1/w3;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, v0, Ll1/w3;->e:Lm1/g;

    iget-object v2, v2, Lm1/g;->d:Lkotlin/jvm/functions/Function1;

    sget-object v3, Ll1/x3;->y:Ll1/x3;

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Ll1/k2;

    const/4 v3, 0x7

    const/4 v4, 0x0

    invoke-direct {v2, v0, v4, v3}, Ll1/k2;-><init>(Ll1/w3;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {v1, v4, v4, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Ll01/q;->x:Ljava/lang/Object;

    check-cast v0, Ll01/s;

    iget-object v1, p0, Ll01/q;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Ll01/r;->c(Ll01/s;Lkotlin/jvm/functions/Function1;)Ll83/a0;

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
