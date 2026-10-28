.class public final Lgj/m;
.super Lwe/o;
.source "SourceFile"


# instance fields
.field public E:Z

.field public F:J

.field public G:J

.field public final y:Ldc3/h;

.field public final z:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0x19

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lwe/o;-><init>(IZ)V

    const/4 v0, 0x0

    const/4 v1, 0x6

    const v2, 0x7fffffff

    invoke-static {v2, v1, v0}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v0

    iput-object v0, p0, Lgj/m;->y:Ldc3/h;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, -0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lgj/m;->z:Ljava/util/concurrent/atomic/AtomicLong;

    iput-wide v1, p0, Lgj/m;->G:J

    return-void
.end method

.method public static final d0(Lgj/m;Lgj/i;Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, v1, Lgj/j;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lgj/j;

    iget v3, v2, Lgj/j;->H:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lgj/j;->H:I

    goto :goto_0

    :cond_0
    new-instance v2, Lgj/j;

    invoke-direct {v2, v0, v1}, Lgj/j;-><init>(Lgj/m;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lgj/j;->F:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lgj/j;->H:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v0, v2, Lgj/j;->E:I

    iget-object v3, v2, Lgj/j;->y:Ljava/lang/Iterable;

    check-cast v3, Ljava/lang/Iterable;

    iget-object v4, v2, Lgj/j;->x:Ljk/a;

    iget-object v2, v2, Lgj/j;->w:Lgj/m;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_1
    iget v6, v2, Lgj/j;->E:I

    iget-object v0, v2, Lgj/j;->x:Ljk/a;

    iget-object v4, v2, Lgj/j;->w:Lgj/m;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v0

    move-object v0, v4

    goto/16 :goto_6

    :pswitch_2
    iget v6, v2, Lgj/j;->E:I

    iget-object v0, v2, Lgj/j;->x:Ljk/a;

    iget-object v4, v2, Lgj/j;->w:Lgj/m;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v1

    move-object v1, v0

    move-object v0, v4

    move-object/from16 v4, v16

    goto/16 :goto_5

    :pswitch_3
    iget v7, v2, Lgj/j;->E:I

    iget-object v0, v2, Lgj/j;->x:Ljk/a;

    iget-object v4, v2, Lgj/j;->w:Lgj/m;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v0

    move-object v0, v4

    goto/16 :goto_4

    :pswitch_4
    iget v0, v2, Lgj/j;->E:I

    iget-object v4, v2, Lgj/j;->x:Ljk/a;

    iget-object v6, v2, Lgj/j;->w:Lgj/m;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v6

    move v6, v0

    move-object/from16 v0, v16

    goto/16 :goto_3

    :pswitch_5
    iget v0, v2, Lgj/j;->E:I

    iget-object v4, v2, Lgj/j;->x:Ljk/a;

    iget-object v6, v2, Lgj/j;->w:Lgj/m;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v6

    move v6, v0

    move-object/from16 v0, v16

    goto/16 :goto_7

    :pswitch_6
    iget v6, v2, Lgj/j;->E:I

    iget-wide v9, v2, Lgj/j;->z:J

    iget-object v0, v2, Lgj/j;->x:Ljk/a;

    iget-object v4, v2, Lgj/j;->w:Lgj/m;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v4

    move-object v4, v0

    move-object/from16 v0, v16

    goto :goto_2

    :pswitch_7
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    iget-object v1, v1, Lgj/i;->a:Ljk/a;

    iget-object v4, v1, Ljk/a;->c:Ljava/lang/Long;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    iget-object v4, v1, Ljk/a;->e:Ljava/lang/Long;

    invoke-virtual {v1}, Ljk/a;->a()Ljava/lang/String;

    move-result-object v11

    const-string v12, "session_start"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    goto :goto_1

    :cond_1
    move-wide v11, v9

    :goto_1
    iput-object v0, v2, Lgj/j;->w:Lgj/m;

    iput-object v1, v2, Lgj/j;->x:Ljk/a;

    iput-wide v9, v2, Lgj/j;->z:J

    iput v6, v2, Lgj/j;->E:I

    iput v7, v2, Lgj/j;->H:I

    invoke-virtual {v0, v11, v12, v2}, Lgj/m;->f0(JLs83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_2

    goto/16 :goto_9

    :cond_2
    move-object v4, v1

    :goto_2
    iput-object v0, v2, Lgj/j;->w:Lgj/m;

    iput-object v4, v2, Lgj/j;->x:Ljk/a;

    iput v6, v2, Lgj/j;->E:I

    const/4 v1, 0x2

    iput v1, v2, Lgj/j;->H:I

    invoke-virtual {v0, v9, v10, v2}, Lgj/m;->e0(JLs83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    goto/16 :goto_9

    :cond_3
    invoke-virtual {v1}, Ljk/a;->a()Ljava/lang/String;

    move-result-object v4

    const-string v11, "session_end"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    invoke-virtual {v1}, Ljk/a;->a()Ljava/lang/String;

    move-result-object v4

    const-string v11, "dummy_enter_foreground"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    iput-object v0, v2, Lgj/j;->w:Lgj/m;

    iput-object v1, v2, Lgj/j;->x:Ljk/a;

    iput v7, v2, Lgj/j;->E:I

    const/4 v4, 0x3

    iput v4, v2, Lgj/j;->H:I

    invoke-virtual {v0, v9, v10, v2}, Lgj/m;->h0(JLs83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    goto/16 :goto_9

    :cond_4
    move-object v6, v4

    move-object v4, v1

    move-object v1, v6

    move v6, v7

    :goto_3
    move-object v8, v1

    check-cast v8, Ljava/lang/Iterable;

    iput-boolean v7, v0, Lgj/m;->E:Z

    goto :goto_7

    :cond_5
    invoke-virtual {v1}, Ljk/a;->a()Ljava/lang/String;

    move-result-object v4

    const-string v11, "dummy_exit_foreground"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    iput-object v0, v2, Lgj/j;->w:Lgj/m;

    iput-object v1, v2, Lgj/j;->x:Ljk/a;

    iput v7, v2, Lgj/j;->E:I

    const/4 v4, 0x4

    iput v4, v2, Lgj/j;->H:I

    invoke-virtual {v0, v9, v10, v2}, Lgj/m;->e0(JLs83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto/16 :goto_9

    :cond_6
    :goto_4
    iput-boolean v6, v0, Lgj/m;->E:Z

    move-object v4, v1

    move v6, v7

    goto :goto_7

    :cond_7
    iget-boolean v4, v0, Lgj/m;->E:Z

    if-nez v4, :cond_a

    iput-object v0, v2, Lgj/j;->w:Lgj/m;

    iput-object v1, v2, Lgj/j;->x:Ljk/a;

    iput v6, v2, Lgj/j;->E:I

    const/4 v4, 0x5

    iput v4, v2, Lgj/j;->H:I

    invoke-virtual {v0, v9, v10, v2}, Lgj/m;->h0(JLs83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_8

    goto/16 :goto_9

    :cond_8
    :goto_5
    move-object v8, v4

    check-cast v8, Ljava/lang/Iterable;

    :cond_9
    :goto_6
    move-object v4, v1

    goto :goto_7

    :cond_a
    iput-object v0, v2, Lgj/j;->w:Lgj/m;

    iput-object v1, v2, Lgj/j;->x:Ljk/a;

    iput v6, v2, Lgj/j;->E:I

    const/4 v4, 0x6

    iput v4, v2, Lgj/j;->H:I

    invoke-virtual {v0, v9, v10, v2}, Lgj/m;->e0(JLs83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_9

    goto/16 :goto_9

    :cond_b
    :goto_7
    if-nez v6, :cond_c

    iget-object v1, v4, Ljk/a;->e:Ljava/lang/Long;

    if-nez v1, :cond_c

    iget-object v1, v0, Lgj/m;->z:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v9

    new-instance v1, Ljava/lang/Long;

    invoke-direct {v1, v9, v10}, Ljava/lang/Long;-><init>(J)V

    iput-object v1, v4, Ljk/a;->e:Ljava/lang/Long;

    :cond_c
    iget-wide v9, v0, Lgj/m;->F:J

    const-wide/16 v11, 0x1

    if-eqz v8, :cond_e

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_d
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljk/a;

    iget-object v13, v7, Ljk/a;->d:Ljava/lang/Long;

    if-nez v13, :cond_d

    iget-wide v13, v0, Lgj/m;->F:J

    add-long/2addr v13, v11

    new-instance v15, Ljava/lang/Long;

    invoke-direct {v15, v13, v14}, Ljava/lang/Long;-><init>(J)V

    iput-object v15, v7, Ljk/a;->d:Ljava/lang/Long;

    iput-wide v13, v0, Lgj/m;->F:J

    goto :goto_8

    :cond_e
    if-nez v6, :cond_f

    iget-object v1, v4, Ljk/a;->d:Ljava/lang/Long;

    if-nez v1, :cond_f

    iget-wide v13, v0, Lgj/m;->F:J

    add-long/2addr v13, v11

    new-instance v1, Ljava/lang/Long;

    invoke-direct {v1, v13, v14}, Ljava/lang/Long;-><init>(J)V

    iput-object v1, v4, Ljk/a;->d:Ljava/lang/Long;

    iput-wide v13, v0, Lgj/m;->F:J

    :cond_f
    iget-wide v11, v0, Lgj/m;->F:J

    cmp-long v1, v11, v9

    if-lez v1, :cond_11

    invoke-virtual {v0}, Lwe/o;->G()Lgj/d;

    move-result-object v1

    invoke-virtual {v1}, Lgj/d;->f()Lik/b;

    move-result-object v1

    iget-wide v9, v0, Lgj/m;->F:J

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    iput-object v0, v2, Lgj/j;->w:Lgj/m;

    iput-object v4, v2, Lgj/j;->x:Ljk/a;

    move-object v9, v8

    check-cast v9, Ljava/lang/Iterable;

    iput-object v9, v2, Lgj/j;->y:Ljava/lang/Iterable;

    iput v6, v2, Lgj/j;->E:I

    const/4 v9, 0x7

    iput v9, v2, Lgj/j;->H:I

    sget-object v2, Lik/a;->x:Lik/a;

    invoke-interface {v1, v2, v7}, Lik/b;->b(Lik/a;Ljava/lang/String;)V

    if-ne v5, v3, :cond_10

    :goto_9
    return-object v3

    :cond_10
    move-object v2, v0

    move v0, v6

    move-object v3, v8

    :goto_a
    move v6, v0

    move-object v0, v2

    move-object v8, v3

    :cond_11
    if-eqz v8, :cond_12

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljk/a;

    invoke-super {v0, v2}, Lwe/o;->N(Ljk/a;)V

    goto :goto_b

    :cond_12
    if-nez v6, :cond_13

    invoke-super {v0, v4}, Lwe/o;->N(Ljk/a;)V

    :cond_13
    return-object v5

    :pswitch_data_0
    .packed-switch 0x0
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


# virtual methods
.method public final N(Ljk/a;)V
    .locals 2

    const-string v0, "incomingEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Ljk/a;->c:Ljava/lang/Long;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p1, Ljk/a;->c:Ljava/lang/Long;

    :cond_0
    new-instance v0, Lgj/i;

    invoke-direct {v0, p1}, Lgj/i;-><init>(Ljk/a;)V

    iget-object p1, p0, Lgj/m;->y:Ldc3/h;

    invoke-interface {p1, v0}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final e0(JLs83/c;)Ljava/lang/Object;
    .locals 4

    iget-object p3, p0, Lgj/m;->z:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ltz p3, :cond_0

    iput-wide p1, p0, Lgj/m;->G:J

    invoke-virtual {p0}, Lwe/o;->G()Lgj/d;

    move-result-object p1

    invoke-virtual {p1}, Lgj/d;->f()Lik/b;

    move-result-object p1

    iget-wide p2, p0, Lgj/m;->G:J

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    sget-object p3, Lik/a;->z:Lik/a;

    invoke-interface {p1, p3, p2}, Lik/b;->b(Lik/a;Ljava/lang/String;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    :cond_0
    return-object v0
.end method

.method public final f0(JLs83/c;)Ljava/lang/Object;
    .locals 0

    iget-object p3, p0, Lgj/m;->z:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    invoke-virtual {p0}, Lwe/o;->G()Lgj/d;

    move-result-object p1

    invoke-virtual {p1}, Lgj/d;->f()Lik/b;

    move-result-object p1

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    sget-object p3, Lik/a;->y:Lik/a;

    invoke-interface {p1, p3, p2}, Lik/b;->b(Lik/a;Ljava/lang/String;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final g0(JLs83/c;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    instance-of v4, v3, Lgj/k;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lgj/k;

    iget v5, v4, Lgj/k;->G:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lgj/k;->G:I

    goto :goto_0

    :cond_0
    new-instance v4, Lgj/k;

    invoke-direct {v4, v0, v3}, Lgj/k;-><init>(Lgj/m;Ls83/c;)V

    :goto_0
    iget-object v3, v4, Lgj/k;->E:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lgj/k;->G:I

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v6, :cond_3

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    iget-boolean v1, v4, Lgj/k;->z:Z

    iget-wide v5, v4, Lgj/k;->y:J

    iget-object v2, v4, Lgj/k;->x:Ljava/util/List;

    check-cast v2, Ljava/util/List;

    iget-object v4, v4, Lgj/k;->w:Lgj/m;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v1, v4, Lgj/k;->z:Z

    iget-wide v8, v4, Lgj/k;->y:J

    iget-object v2, v4, Lgj/k;->x:Ljava/util/List;

    check-cast v2, Ljava/util/List;

    iget-object v6, v4, Lgj/k;->w:Lgj/m;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v2

    move-object/from16 v16, v6

    move v6, v1

    move-wide v1, v8

    move-object/from16 v8, v16

    goto :goto_2

    :cond_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lwe/o;->G()Lgj/d;

    move-result-object v6

    iget-object v6, v6, Lgj/d;->a:Lgj/g;

    iget-object v6, v6, Lgj/g;->r:Ljava/util/Set;

    sget-object v9, Lgj/e;->w:Lgj/e;

    invoke-interface {v6, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v9, v0, Lgj/m;->z:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    cmp-long v10, v10, v12

    if-ltz v10, :cond_5

    new-instance v10, Ljk/a;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    const-string v11, "session_end"

    iput-object v11, v10, Ljk/a;->M:Ljava/lang/String;

    iget-wide v14, v0, Lgj/m;->G:J

    cmp-long v11, v14, v12

    if-lez v11, :cond_4

    new-instance v11, Ljava/lang/Long;

    invoke-direct {v11, v14, v15}, Ljava/lang/Long;-><init>(J)V

    goto :goto_1

    :cond_4
    const/4 v11, 0x0

    :goto_1
    iput-object v11, v10, Ljk/a;->c:Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v11

    new-instance v9, Ljava/lang/Long;

    invoke-direct {v9, v11, v12}, Ljava/lang/Long;-><init>(J)V

    iput-object v9, v10, Ljk/a;->e:Ljava/lang/Long;

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    iput-object v0, v4, Lgj/k;->w:Lgj/m;

    iput-object v3, v4, Lgj/k;->x:Ljava/util/List;

    iput-wide v1, v4, Lgj/k;->y:J

    iput-boolean v6, v4, Lgj/k;->z:Z

    iput v8, v4, Lgj/k;->G:I

    invoke-virtual {v0, v1, v2, v4}, Lgj/m;->f0(JLs83/c;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v5, :cond_6

    goto :goto_3

    :cond_6
    move-object v8, v0

    :goto_2
    iput-object v8, v4, Lgj/k;->w:Lgj/m;

    move-object v9, v3

    check-cast v9, Ljava/util/List;

    iput-object v9, v4, Lgj/k;->x:Ljava/util/List;

    iput-wide v1, v4, Lgj/k;->y:J

    iput-boolean v6, v4, Lgj/k;->z:Z

    iput v7, v4, Lgj/k;->G:I

    invoke-virtual {v8, v1, v2, v4}, Lgj/m;->e0(JLs83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_7

    :goto_3
    return-object v5

    :cond_7
    move-wide/from16 v16, v1

    move v1, v6

    move-wide/from16 v5, v16

    move-object v2, v3

    move-object v4, v8

    :goto_4
    if-eqz v1, :cond_8

    new-instance v1, Ljk/a;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v3, "session_start"

    iput-object v3, v1, Ljk/a;->M:Ljava/lang/String;

    new-instance v3, Ljava/lang/Long;

    invoke-direct {v3, v5, v6}, Ljava/lang/Long;-><init>(J)V

    iput-object v3, v1, Ljk/a;->c:Ljava/lang/Long;

    iget-object v3, v4, Lgj/m;->z:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    new-instance v5, Ljava/lang/Long;

    invoke-direct {v5, v3, v4}, Ljava/lang/Long;-><init>(J)V

    iput-object v5, v1, Ljk/a;->e:Ljava/lang/Long;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    return-object v2
.end method

.method public final h0(JLs83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lgj/l;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lgj/l;

    iget v1, v0, Lgj/l;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgj/l;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lgj/l;

    invoke-direct {v0, p0, p3}, Lgj/l;-><init>(Lgj/m;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lgj/l;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lgj/l;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lgj/m;->z:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long p3, v5, v7

    if-ltz p3, :cond_5

    invoke-virtual {p0}, Lwe/o;->G()Lgj/d;

    move-result-object p3

    iget-object p3, p3, Lgj/d;->a:Lgj/g;

    iget-wide v5, p3, Lgj/g;->k:J

    iget-wide v7, p0, Lgj/m;->G:J

    sub-long v7, p1, v7

    cmp-long p3, v7, v5

    if-gez p3, :cond_5

    iput v4, v0, Lgj/l;->y:I

    invoke-virtual {p0, p1, p2, v0}, Lgj/m;->e0(JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return-object p1

    :cond_5
    iput v3, v0, Lgj/l;->y:I

    invoke-virtual {p0, p1, p2, v0}, Lgj/m;->g0(JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    return-object p1
.end method
