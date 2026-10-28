.class public final Lt23/k0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lt23/s0;


# direct methods
.method public synthetic constructor <init>(Lt23/s0;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lt23/k0;->w:I

    iput-object p1, p0, Lt23/k0;->z:Lt23/s0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static final f(Lt23/s0;Ldc3/u;)V
    .locals 8

    iget-object v0, p0, Lt23/s0;->v:Lj53/m;

    iget-object v0, v0, Lj53/m;->j:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v6, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lt23/g2;

    iget-object v2, v2, Lt23/g2;->K:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/d2;

    if-eqz v2, :cond_0

    iget-boolean v2, v2, Lt23/d2;->c:Z

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v6

    :goto_0
    check-cast v1, Lt23/g2;

    if-eqz v1, :cond_2

    iget-object v0, v1, Lt23/g2;->K:Lec3/r1;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/d2;

    move-object v5, v0

    goto :goto_1

    :cond_2
    move-object v5, v6

    :goto_1
    iget-object v0, p0, Lt23/s0;->d:Lhc3/d;

    new-instance v2, Ln43/a;

    const/16 v7, 0x17

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v2 .. v7}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p0, 0x3

    invoke-static {v0, v6, v6, v2, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lt23/k0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lt23/k0;

    iget-object v1, p0, Lt23/k0;->z:Lt23/s0;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p2, v2}, Lt23/k0;-><init>(Lt23/s0;Lq83/d;I)V

    iput-object p1, v0, Lt23/k0;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lt23/k0;

    iget-object v1, p0, Lt23/k0;->z:Lt23/s0;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Lt23/k0;-><init>(Lt23/s0;Lq83/d;I)V

    iput-object p1, v0, Lt23/k0;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v0, Lt23/k0;

    iget-object v1, p0, Lt23/k0;->z:Lt23/s0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lt23/k0;-><init>(Lt23/s0;Lq83/d;I)V

    iput-object p1, v0, Lt23/k0;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lt23/k0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt23/k0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/k0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt23/k0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/k0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt23/k0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/k0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lt23/k0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/k0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/k0;->y:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    iget-object v1, p0, Lt23/k0;->z:Lt23/s0;

    iget-object v3, v1, Lt23/s0;->d:Lhc3/d;

    new-instance v4, Ls40/c0;

    const/4 v5, 0x7

    const/4 v6, 0x0

    invoke-direct {v4, v1, p1, v6, v5}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v3, v6, v6, v4, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v1, p0, Lt23/k0;->z:Lt23/s0;

    iget-object v3, v1, Lt23/s0;->b:Lt23/c0;

    new-instance v4, Lqm2/c;

    const/4 v5, 0x2

    invoke-direct {v4, v5, v1, p1}, Lqm2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, v3, Lt23/c0;->e:Ljava/util/Set;

    const-string v5, "subscriptions"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v1

    :try_start_0
    new-instance v5, Lt23/r1;

    invoke-direct {v5, v4}, Lt23/r1;-><init>(Lqm2/c;)V

    iget-object v3, v3, Lt23/c0;->e:Ljava/util/Set;

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object v1, p0, Lt23/k0;->z:Lt23/s0;

    invoke-virtual {v1}, Lt23/s0;->b()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    const-string v5, "[livestreamFlow] #track; no args"

    invoke-interface {v3, v4, v1, v5, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v1, p0, Lt23/k0;->z:Lt23/s0;

    invoke-static {v1, p1}, Lt23/k0;->f(Lt23/s0;Ldc3/u;)V

    sget-object v1, Lt23/n;->y:Lt23/n;

    iput v2, p0, Lt23/k0;->x:I

    invoke-static {p1, v1, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :pswitch_0
    iget-object v0, p0, Lt23/k0;->z:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->X:Lec3/h2;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lt23/k0;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_6

    if-eq v2, v4, :cond_5

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Lt23/k0;->y:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object v2, p0, Lt23/k0;->y:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_3

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/k0;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    :cond_7
    :goto_2
    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lbc3/f0;->x(Lq83/j;)Z

    move-result v2

    if-eqz v2, :cond_c

    iput-object p1, p0, Lt23/k0;->y:Ljava/lang/Object;

    iput v4, p0, Lt23/k0;->x:I

    const-wide/16 v5, 0x3e8

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    goto :goto_5

    :cond_8
    :goto_3
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/android/video/generated/models/CallSessionResponse;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getLiveStartedAt()Ljg3/i;

    move-result-object v2

    goto :goto_4

    :cond_9
    const/4 v2, 0x0

    :goto_4
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/android/video/generated/models/CallSessionResponse;

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getLiveEndedAt()Ljg3/i;

    move-result-object v5

    if-nez v5, :cond_b

    :cond_a
    invoke-static {}, Ljg3/i;->p0()Ljg3/i;

    move-result-object v5

    :cond_b
    if-eqz v2, :cond_7

    iget-object v6, v5, Ljg3/i;->F:Ljg3/e;

    iget-object v5, v5, Ljg3/i;->G:Ljg3/p;

    invoke-virtual {v6, v5}, Lkg3/b;->o0(Ljg3/p;)J

    move-result-wide v7

    iget-object v5, v6, Ljg3/e;->G:Ljg3/f;

    iget v5, v5, Ljg3/f;->I:I

    int-to-long v5, v5

    invoke-static {v7, v8, v5, v6}, Ljg3/c;->q0(JJ)Ljg3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljg3/c;->t0()J

    move-result-wide v5

    iget-object v7, v2, Ljg3/i;->F:Ljg3/e;

    iget-object v2, v2, Ljg3/i;->G:Ljg3/p;

    invoke-virtual {v7, v2}, Lkg3/b;->o0(Ljg3/p;)J

    move-result-wide v8

    iget-object v2, v7, Ljg3/e;->G:Ljg3/f;

    iget v2, v2, Ljg3/f;->I:I

    int-to-long v10, v2

    invoke-static {v8, v9, v10, v11}, Ljg3/c;->q0(JJ)Ljg3/c;

    move-result-object v2

    invoke-virtual {v2}, Ljg3/c;->t0()J

    move-result-wide v7

    sub-long/2addr v5, v7

    new-instance v2, Ljava/lang/Long;

    invoke-direct {v2, v5, v6}, Ljava/lang/Long;-><init>(J)V

    iput-object p1, p0, Lt23/k0;->y:Ljava/lang/Object;

    iput v3, p0, Lt23/k0;->x:I

    invoke-interface {p1, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_5

    :cond_c
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v1

    :pswitch_1
    iget-object v0, p0, Lt23/k0;->z:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->X:Lec3/h2;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lt23/k0;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_10

    if-eq v2, v4, :cond_f

    if-ne v2, v3, :cond_e

    iget-object v2, p0, Lt23/k0;->y:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_d
    move-object p1, v2

    goto :goto_6

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    iget-object v2, p0, Lt23/k0;->y:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_10
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/k0;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    :goto_6
    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lbc3/f0;->x(Lq83/j;)Z

    move-result v2

    if-eqz v2, :cond_16

    iput-object p1, p0, Lt23/k0;->y:Ljava/lang/Object;

    iput v4, p0, Lt23/k0;->x:I

    const-wide/16 v5, 0x3e8

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_11

    goto :goto_a

    :cond_11
    move-object v2, p1

    :goto_7
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/android/video/generated/models/CallSessionResponse;

    const/4 v5, 0x0

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getStartedAt()Ljg3/i;

    move-result-object p1

    goto :goto_8

    :cond_12
    move-object p1, v5

    :goto_8
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/android/video/generated/models/CallSessionResponse;

    if-eqz v6, :cond_13

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getEndedAt()Ljg3/i;

    move-result-object v6

    if-nez v6, :cond_14

    :cond_13
    invoke-static {}, Ljg3/i;->p0()Ljg3/i;

    move-result-object v6

    :cond_14
    if-nez p1, :cond_15

    goto :goto_9

    :cond_15
    iget-object v5, v6, Ljg3/i;->F:Ljg3/e;

    iget-object v6, v6, Ljg3/i;->G:Ljg3/p;

    invoke-virtual {v5, v6}, Lkg3/b;->o0(Ljg3/p;)J

    move-result-wide v6

    iget-object v5, v5, Ljg3/e;->G:Ljg3/f;

    iget v5, v5, Ljg3/f;->I:I

    int-to-long v8, v5

    invoke-static {v6, v7, v8, v9}, Ljg3/c;->q0(JJ)Ljg3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljg3/c;->t0()J

    move-result-wide v5

    iget-object v7, p1, Ljg3/i;->F:Ljg3/e;

    iget-object p1, p1, Ljg3/i;->G:Ljg3/p;

    invoke-virtual {v7, p1}, Lkg3/b;->o0(Ljg3/p;)J

    move-result-wide v8

    iget-object p1, v7, Ljg3/e;->G:Ljg3/f;

    iget p1, p1, Ljg3/f;->I:I

    int-to-long v10, p1

    invoke-static {v8, v9, v10, v11}, Ljg3/c;->q0(JJ)Ljg3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljg3/c;->t0()J

    move-result-wide v7

    sub-long/2addr v5, v7

    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v5, v6}, Ljava/lang/Long;-><init>(J)V

    move-object v5, p1

    :goto_9
    iput-object v2, p0, Lt23/k0;->y:Ljava/lang/Object;

    iput v3, p0, Lt23/k0;->x:I

    invoke-interface {v2, v5, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    goto :goto_a

    :cond_16
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_a
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
