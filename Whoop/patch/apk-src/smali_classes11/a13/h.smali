.class public final La13/h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La33/d;Lq83/d;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, La13/h;->w:I

    sget-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->x:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 1
    iput-object p1, p0, La13/h;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p3, p0, La13/h;->w:I

    iput-object p1, p0, La13/h;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, La13/h;->w:I

    iget-object v0, p0, La13/h;->x:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    new-instance p1, La13/h;

    check-cast v0, Lyf/u;

    const/16 v1, 0x17

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, La13/h;

    check-cast v0, Lx43/h;

    const/16 v1, 0x16

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, La13/h;

    check-cast v0, Ljava/lang/Process;

    const/16 v1, 0x15

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, La13/h;

    check-cast v0, Lth/e;

    const/16 v1, 0x14

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, La13/h;

    check-cast v0, Lt23/b4;

    const/16 v1, 0x13

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance p1, La13/h;

    check-cast v0, Lt23/s0;

    const/16 v1, 0x12

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance p1, La13/h;

    check-cast v0, Lcm/b;

    const/16 v1, 0x11

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_6
    new-instance p1, La13/h;

    check-cast v0, Lh40/k;

    const/16 v1, 0x10

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance p1, La13/h;

    check-cast v0, Ll1/x4;

    const/16 v1, 0xf

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    new-instance p1, La13/h;

    check-cast v0, Lab/h0;

    const/16 v1, 0xe

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance p1, La13/h;

    check-cast v0, Lh20/z4;

    const/16 v1, 0xd

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_a
    new-instance p1, La13/h;

    check-cast v0, Lfi/t;

    const/16 v1, 0xc

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_b
    new-instance p1, La13/h;

    check-cast v0, Lf1/p;

    const/16 v1, 0xb

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_c
    new-instance p1, La13/h;

    check-cast v0, Leh/e;

    const/16 v1, 0xa

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_d
    new-instance p1, La13/h;

    check-cast v0, La33/d;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->x:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-direct {p1, v0, p2}, La13/h;-><init>(La33/d;Lq83/d;)V

    return-object p1

    :pswitch_e
    new-instance p1, La13/h;

    check-cast v0, Ld30/v;

    const/16 v1, 0x8

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_f
    new-instance p1, La13/h;

    check-cast v0, Lcz/n0;

    const/4 v1, 0x7

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_10
    new-instance p1, La13/h;

    check-cast v0, Lc4/d0;

    const/4 v1, 0x6

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_11
    new-instance p1, La13/h;

    check-cast v0, Lb3/x2;

    const/4 v1, 0x5

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_12
    new-instance p1, La13/h;

    check-cast v0, Lp1/c1;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_13
    new-instance p1, La13/h;

    check-cast v0, Lb30/j0;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_14
    new-instance p1, La13/h;

    check-cast v0, Lb10/z0;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_15
    new-instance p1, La13/h;

    check-cast v0, Ljava/util/concurrent/Callable;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_16
    new-instance p1, La13/h;

    check-cast v0, La13/i;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La13/h;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_4
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_5
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_6
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_7
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_8
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_a
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_b
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_e
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_f
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_10
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_11
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_12
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_13
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_14
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_15
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-virtual {p0, p1, p2}, La13/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La13/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La13/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, La13/h;->w:I

    const/16 v1, 0x7d0

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lyf/u;

    :try_start_0
    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lyf/m;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lyf/m;

    goto :goto_0

    :cond_0
    new-instance v0, Lyf/b;

    invoke-static {p1}, Ls30/b;->x(Lyf/u;)Lne3/p0;

    move-result-object v1

    invoke-static {v1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v1

    invoke-direct {v0, v1}, Lyf/b;-><init>(Lne3/j0;)V

    :goto_0
    invoke-interface {v0}, Lyf/m;->n()[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_1
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-static {v1, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_1
    throw v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lx43/h;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v6, p1, Lx43/h;->h:J

    sub-long/2addr v0, v6

    iget-wide v6, p1, Lx43/h;->b:J

    cmp-long v0, v0, v6

    if-ltz v0, :cond_1

    invoke-virtual {p1}, Lx43/h;->c()V

    goto :goto_2

    :cond_1
    iget-object v0, p1, Lx43/h;->j:Lbc3/c2;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    iget-object v0, p1, Lx43/h;->c:Lc53/a;

    new-instance v1, Lx43/g;

    invoke-direct {v1, p1, v5, v4}, Lx43/g;-><init>(Lx43/h;Lq83/d;I)V

    new-instance v3, Lh0/l1;

    const-wide/16 v6, 0x3e8

    invoke-direct {v3, v6, v7, v1, v5}, Lh0/l1;-><init>(JLc93/m;Lq83/d;)V

    invoke-static {v0, v5, v5, v3, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p1, Lx43/h;->j:Lbc3/c2;

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Process;

    invoke-virtual {p1}, Ljava/lang/Process;->waitFor()I

    move-result p1

    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lth/e;

    iget-object v2, p1, Lth/e;->H:Ljava/lang/Object;

    monitor-enter v2

    :try_start_2
    iget-boolean v0, p1, Lth/e;->M:Z

    if-eqz v0, :cond_6

    iget-boolean v0, p1, Lth/e;->N:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v0, :cond_3

    goto :goto_5

    :cond_3
    :try_start_3
    invoke-virtual {p1}, Lth/e;->a0()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object p1, v0

    goto :goto_7

    :catch_0
    :try_start_4
    iput-boolean v3, p1, Lth/e;->O:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_3
    :try_start_5
    iget v0, p1, Lth/e;->J:I

    if-lt v0, v1, :cond_4

    move v4, v3

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {p1}, Lth/e;->o0()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_4

    :catch_1
    :try_start_6
    iput-boolean v3, p1, Lth/e;->P:Z

    new-instance v0, Lne3/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v0

    iput-object v0, p1, Lth/e;->K:Lne3/h0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :cond_5
    :goto_4
    monitor-exit v2

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    goto :goto_6

    :cond_6
    :goto_5
    :try_start_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    monitor-exit v2

    :goto_6
    return-object p1

    :goto_7
    monitor-exit v2

    throw p1

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lt23/b4;

    iget-object v0, p1, Lt23/b4;->S:Lt9/u;

    iget-object v0, v0, Lt9/u;->x:Ljava/lang/Object;

    check-cast v0, Lb30/m;

    iget-object p1, p1, Lt23/b4;->E:Ly33/c;

    iget-object p1, p1, Ly33/c;->j:Lf53/k;

    iget-object p1, p1, Lf53/k;->j:Lec3/h2;

    const-string v1, "videoSocketStateFlow"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v1, Lbc3/c2;

    if-eqz v1, :cond_7

    invoke-virtual {v1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_7
    iput-object v5, v0, Lb30/m;->E:Ljava/lang/Object;

    iget-object v1, v0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    const-string v3, ""

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v5, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    new-instance v3, Ls40/c0;

    const/16 v4, 0x1b

    invoke-direct {v3, p1, v0, v5, v4}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v5, v5, v3, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v0, Lb30/m;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lt23/s0;

    iget-object p1, p1, Lt23/s0;->W:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    sget-object v0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    if-eqz v0, :cond_8

    check-cast v0, Lt23/b4;

    iget-object v0, v0, Lt23/b4;->I:Ld33/c;

    invoke-virtual {v0}, Ld33/c;->a()Lio/getstream/video/android/model/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v0, p0, La13/h;->x:Ljava/lang/Object;

    check-cast v0, Lt23/s0;

    iget-object v0, v0, Lt23/s0;->W:Lec3/h2;

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v5, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lt23/s0;

    iget-object p1, p1, Lt23/s0;->F:Lec3/h2;

    sget-object v0, Lt23/b3;->a:Lt23/b3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v5, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lt23/s0;

    iget-object p1, p1, Lt23/s0;->b:Lt23/c0;

    new-instance v0, Lt23/g0;

    sget-object v1, Lt23/g3;->E:Lt23/g3;

    const-string v2, "LocalCallMissedEvent"

    invoke-direct {v0, v1, v2}, Lt23/g0;-><init>(Lt23/g3;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lt23/c0;->p(Lt23/i0;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lt23/s0;

    iget-object p1, p1, Lt23/s0;->a:Lt23/b4;

    iget-object p1, p1, Lt23/b4;->U:Lt23/g1;

    iget-object p1, p1, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance v0, Lio/getstream/video/android/model/StreamCallId;

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lt23/s0;

    iget-object p1, p1, Lt23/s0;->b:Lt23/c0;

    iget-object v1, p1, Lt23/c0;->b:Ljava/lang/String;

    iget-object v2, p1, Lt23/c0;->c:Ljava/lang/String;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lio/getstream/video/android/model/StreamCallId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lt23/s0;

    iget-object p1, p1, Lt23/s0;->a:Lt23/b4;

    iget-object p1, p1, Lt23/b4;->w:Landroid/content/Context;

    invoke-static {p1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object p1

    sget-object v1, Le43/i;->b:Le43/i;

    invoke-virtual {v0, v1}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationManagerCompat;->cancel(I)V

    goto :goto_8

    :cond_9
    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lt23/s0;

    iget-object v0, p1, Lt23/s0;->a:Lt23/b4;

    iget-object v0, v0, Lt23/b4;->U:Lt23/g1;

    iget-object p1, p1, Lt23/s0;->b:Lt23/c0;

    invoke-virtual {v0, p1}, Lt23/g1;->c(Lt23/c0;)V

    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lcm/b;

    sget-wide v0, Li2/x;->m:J

    sget-object v2, Lcm/d;->b:Lcm/c;

    check-cast p1, Lcm/a;

    invoke-virtual {p1, v0, v1, v2}, Lcm/a;->a(JLkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lh40/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Ll1/x4;

    invoke-virtual {p1}, Ll1/x4;->a()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lab/h0;

    invoke-virtual {p1}, Lab/h0;->q()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "app_version"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1}, Lab/h0;->q()Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v1, "sdk_app_id"

    invoke-interface {p1, v1, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v5, Ll30/a;

    invoke-direct {v5, p1, v0}, Ll30/a;-><init>(Ljava/lang/String;I)V

    :cond_a
    return-object v5

    :pswitch_9
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lh20/z4;

    iget-object p1, p1, Lh20/z4;->h:Lkotlin/jvm/internal/i;

    invoke-interface {p1, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lfi/t;

    iget-object v0, p1, Lfi/t;->z:Lfi/s;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lfi/s;->c()V

    :cond_b
    iput-object v5, p1, Lfi/t;->z:Lfi/s;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lf1/p;

    iget-object v0, p1, Lf1/p;->b:Landroid/content/Context;

    iget-object v1, p1, Lf1/p;->c:Lf1/s;

    const-class v2, Landroid/view/textclassifier/TextClassificationManager;

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/textclassifier/TextClassificationManager;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_d

    if-ne v1, v3, :cond_c

    const-string v1, "textview"

    goto :goto_9

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    const-string v1, "edittext"

    :goto_9
    new-instance v3, Landroid/view/textclassifier/TextClassificationContext$Builder;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0, v1}, Landroid/view/textclassifier/TextClassificationContext$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/textclassifier/TextClassificationContext$Builder;->build()Landroid/view/textclassifier/TextClassificationContext;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/view/textclassifier/TextClassificationManager;->createTextClassificationSession(Landroid/view/textclassifier/TextClassificationContext;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    iput-object v0, p1, Lf1/p;->f:Landroid/view/textclassifier/TextClassifier;

    return-object v0

    :pswitch_c
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Leh/e;

    monitor-enter p1

    :try_start_8
    iget-boolean v0, p1, Leh/e;->L:Z

    if-eqz v0, :cond_11

    iget-boolean v0, p1, Leh/e;->M:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    if-eqz v0, :cond_e

    goto :goto_c

    :cond_e
    :try_start_9
    invoke-virtual {p1}, Leh/e;->a0()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_a

    :catchall_3
    move-exception v0

    goto :goto_e

    :catch_2
    :try_start_a
    iput-boolean v3, p1, Leh/e;->N:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :goto_a
    :try_start_b
    iget v0, p1, Leh/e;->I:I

    if-lt v0, v1, :cond_f

    move v4, v3

    :cond_f
    if-eqz v4, :cond_10

    invoke-virtual {p1}, Leh/e;->o0()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    goto :goto_b

    :catch_3
    :try_start_c
    iput-boolean v3, p1, Leh/e;->O:Z

    new-instance v0, Lne3/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v0

    iput-object v0, p1, Leh/e;->J:Lne3/h0;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :cond_10
    :goto_b
    monitor-exit p1

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    goto :goto_d

    :cond_11
    :goto_c
    :try_start_d
    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    monitor-exit p1

    move-object p1, v0

    :goto_d
    return-object p1

    :goto_e
    monitor-exit p1

    throw v0

    :pswitch_d
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, La33/d;

    iget-object v0, p1, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Lyy/j;

    iget-object p1, p1, La33/d;->y:Ljava/lang/Object;

    check-cast p1, Lyy/c;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->v0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-virtual {p1, v1, v2}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Ld30/v;

    iget-object p1, p1, Ld30/v;->k:Lec3/h2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v5, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lcz/n0;

    invoke-virtual {p1}, Lcz/n0;->q()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lc4/d0;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lb3/x2;

    if-eqz p1, :cond_12

    check-cast p1, Lb3/x1;

    invoke-virtual {p1}, Lb3/x1;->a()V

    :cond_12
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lp1/c1;

    sget-object v0, Lb30/c4;->a:Lc0/l0;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_13
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Lb30/j0;

    iget-object p1, p1, Lb30/j0;->q:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lb30/b;

    const/4 v12, 0x0

    const/16 v13, 0x1bf

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lb30/b;->a(Lb30/b;Ljava/lang/String;Ls20/a;Ljava/util/List;Lq20/y;ZLt20/n;I)Lb30/b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v5, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_14
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ljava/io/File;

    iget-object v0, p0, La13/h;->x:Ljava/lang/Object;

    check-cast v0, Lb10/z0;

    iget-object v0, v0, Lb10/z0;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    const-string v1, "stripe_api_repository_cache"

    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/32 v0, 0xa00000

    invoke-static {p1, v0, v1}, Landroid/net/http/HttpResponseCache;->install(Ljava/io/File;J)Landroid/net/http/HttpResponseCache;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/Callable;

    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_16
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La13/h;->x:Ljava/lang/Object;

    check-cast p1, La13/i;

    iget-object v0, p1, La13/i;->x:Landroid/app/Activity;

    if-eqz v0, :cond_19

    const-string v1, "android.permission.POST_NOTIFICATIONS"

    const-string v2, "PnPermissionRequester"

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-ge v3, v4, :cond_13

    const-string v0, "[requestPermission] not supported on this version"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, La13/e;->x:La13/e;

    invoke-virtual {p1, v0}, La13/i;->a(La13/e;)V

    goto :goto_11

    :cond_13
    invoke-static {v0, v1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_14

    const-string v0, "[requestPermission] already granted"

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, La13/e;->x:La13/e;

    invoke-virtual {p1, v0}, La13/i;->a(La13/e;)V

    goto :goto_11

    :cond_14
    invoke-static {v0, v1}, Landroidx/core/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_15

    const-string v0, "[requestPermission] rationale requested"

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, La13/e;->z:La13/e;

    invoke-virtual {p1, v0}, La13/i;->a(La13/e;)V

    goto :goto_11

    :cond_15
    instance-of v3, v0, Lg/l;

    if-eqz v3, :cond_16

    check-cast v0, Lg/l;

    goto :goto_f

    :cond_16
    move-object v0, v5

    :goto_f
    if-eqz v0, :cond_17

    const v3, 0x1020002

    invoke-virtual {v0, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v3, "findViewById(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f0a0bfd

    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lj/d;

    if-eqz v3, :cond_17

    check-cast v0, Lj/d;

    goto :goto_10

    :cond_17
    move-object v0, v5

    :goto_10
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[requestPermission] launcher: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_18

    invoke-virtual {v0, v1, v5}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_18
    sget-object v0, La13/e;->w:La13/e;

    invoke-virtual {p1, v0}, La13/i;->a(La13/e;)V

    :cond_19
    :goto_11
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
