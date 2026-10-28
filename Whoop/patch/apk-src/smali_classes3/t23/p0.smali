.class public final Lt23/p0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lt23/s0;


# direct methods
.method public synthetic constructor <init>(Lt23/s0;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lt23/p0;->w:I

    iput-object p1, p0, Lt23/p0;->y:Lt23/s0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lt23/p0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lt23/p0;

    iget-object v0, p0, Lt23/p0;->y:Lt23/s0;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Lt23/p0;-><init>(Lt23/s0;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lt23/p0;

    iget-object v0, p0, Lt23/p0;->y:Lt23/s0;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lt23/p0;-><init>(Lt23/s0;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lt23/p0;

    iget-object v0, p0, Lt23/p0;->y:Lt23/s0;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lt23/p0;-><init>(Lt23/s0;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lt23/p0;

    iget-object v0, p0, Lt23/p0;->y:Lt23/s0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lt23/p0;-><init>(Lt23/s0;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lt23/p0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lt23/p0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/p0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lt23/p0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/p0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lt23/p0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/p0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lt23/p0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/p0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lt23/p0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt23/p0;->y:Lt23/s0;

    iget-object v1, v0, Lt23/s0;->b:Lt23/c0;

    iget-object v2, v0, Lt23/s0;->F:Lec3/h2;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lt23/p0;->x:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-eq v4, v6, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lt23/s0;->J:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/android/video/generated/models/CallSettingsResponse;

    const/4 v4, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getRing()Lio/getstream/android/video/generated/models/RingSettingsResponse;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/RingSettingsResponse;->getAutoCancelTimeoutMs()I

    move-result p1

    new-instance v7, Ljava/lang/Integer;

    invoke-direct {v7, p1}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_0

    :cond_3
    move-object v7, v4

    :goto_0
    if-eqz v7, :cond_8

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-lez p1, :cond_8

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long v7, p1

    iput v6, p0, Lt23/p0;->x:I

    invoke-static {v7, v8, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_4

    goto :goto_5

    :cond_4
    :goto_1
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lt23/a3;

    if-nez p1, :cond_5

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lt23/z2;

    if-eqz p1, :cond_9

    iget-object p1, v0, Lt23/s0;->a:Lt23/b4;

    iget-object p1, p1, Lt23/b4;->U:Lt23/g1;

    iget-object p1, p1, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_9

    :cond_5
    iget-object p1, v0, Lt23/s0;->B0:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    new-instance p1, Lc43/r;

    const-string v0, "timeout"

    invoke-direct {p1, v0}, Lc43/r;-><init>(Ljava/lang/String;)V

    iput v5, p0, Lt23/p0;->x:I

    invoke-virtual {v1, p1, p0}, Lt23/c0;->w(Ltx/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_6

    goto :goto_5

    :cond_6
    :goto_2
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lt23/a3;

    if-eqz p1, :cond_7

    const-string p1, "Outgoing call timed out with no answer"

    goto :goto_3

    :cond_7
    const-string p1, "Incoming call timed out with no answer"

    :goto_3
    new-instance v0, Lt23/g0;

    sget-object v2, Lt23/g3;->y:Lt23/g3;

    invoke-direct {v0, v2, p1}, Lt23/g0;-><init>(Lt23/g3;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lt23/c0;->p(Lt23/i0;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v0}, Lt23/s0;->b()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[startRingingTimer] No autoCancelTimeoutMs set - call ring with no timeout"

    invoke-interface {p1, v2, v1, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    :goto_4
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v3

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/p0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_b

    if-ne v1, v2, :cond_a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lt23/p0;->x:I

    const-wide/16 v1, 0x7d0

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    goto :goto_7

    :cond_c
    :goto_6
    iget-object p1, p0, Lt23/p0;->y:Lt23/s0;

    iget-object p1, p1, Lt23/s0;->z:Lec3/h2;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v0

    :pswitch_1
    iget-object v0, p0, Lt23/p0;->y:Lt23/s0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lt23/p0;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_e

    if-ne v2, v3, :cond_d

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lt23/s0;->b:Lt23/c0;

    iput v3, p0, Lt23/p0;->x:I

    const/16 v2, 0x3f

    invoke-static {p1, p0, v2}, Lt23/c0;->m(Lt23/c0;Ls83/c;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_f

    goto :goto_9

    :cond_f
    :goto_8
    const/4 p1, 0x0

    iput-object p1, v0, Lt23/s0;->r0:Lbc3/c2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_9
    return-object v1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/p0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_11

    if-ne v1, v2, :cond_10

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lt23/i3;->b:Lt23/j3;

    if-eqz p1, :cond_12

    check-cast p1, Lt23/b4;

    iget-object p1, p1, Lt23/b4;->U:Lt23/g1;

    if-eqz p1, :cond_12

    iget-object p1, p1, Lt23/g1;->i:Lbi/p;

    if-eqz p1, :cond_12

    iget-object v1, p0, Lt23/p0;->y:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->b:Lt23/c0;

    iget-object v1, v1, Lt23/c0;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object p1

    goto :goto_a

    :cond_12
    new-instance v3, Lj43/c;

    const/4 v8, 0x0

    const/16 v9, 0x3f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lj43/c;-><init>(ZILjava/lang/Class;ZLd43/a;I)V

    move-object p1, v3

    :goto_a
    iget-object v1, p1, Lj43/c;->f:Ld43/a;

    iget-object v1, v1, Ld43/a;->b:Ld43/c;

    iget-boolean v1, v1, Ld43/c;->a:Z

    if-eqz v1, :cond_15

    iget-object v1, p0, Lt23/p0;->y:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->b:Lt23/c0;

    iget-object v1, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->u0:Lro/i;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lt23/i3;->b:Lt23/j3;

    if-eqz v3, :cond_13

    check-cast v3, Lt23/b4;

    iget-object v3, v3, Lt23/b4;->U:Lt23/g1;

    if-eqz v3, :cond_13

    iget-object v3, v3, Lt23/g1;->i:Lbi/p;

    if-eqz v3, :cond_13

    iget-object v4, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v4, Lt23/c0;

    iget-object v4, v4, Lt23/c0;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object v3

    goto :goto_b

    :cond_13
    new-instance v4, Lj43/c;

    const/4 v9, 0x0

    const/16 v10, 0x3f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lj43/c;-><init>(ZILjava/lang/Class;ZLd43/a;I)V

    move-object v3, v4

    :goto_b
    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lt23/c0;

    iget-object v3, v3, Lj43/c;->f:Ld43/a;

    iget-object v3, v3, Ld43/a;->b:Ld43/c;

    iget-object v3, v3, Ld43/c;->c:Lq33/a;

    iput-object v3, v1, Lt23/c0;->w:Lq33/a;

    iget-object p1, p1, Lj43/c;->f:Ld43/a;

    iget-object p1, p1, Ld43/a;->b:Ld43/c;

    iget-wide v3, p1, Ld43/c;->b:J

    iput v2, p0, Lt23/p0;->x:I

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_14

    goto :goto_d

    :cond_14
    :goto_c
    iget-object p1, p0, Lt23/p0;->y:Lt23/s0;

    iget-object p1, p1, Lt23/s0;->b:Lt23/c0;

    iget-object p1, p1, Lt23/c0;->p:Lt23/s0;

    iget-object p1, p1, Lt23/s0;->u0:Lro/i;

    iget-object p1, p1, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Lt23/c0;

    const/4 v0, 0x0

    iput-object v0, p1, Lt23/c0;->w:Lq33/a;

    :cond_15
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_d
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
