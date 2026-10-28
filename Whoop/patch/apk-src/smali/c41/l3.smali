.class public final synthetic Lc41/l3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ld0/l0;I)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    iput p2, p0, Lc41/l3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/l3;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lc41/l3;->w:I

    iput-object p1, p0, Lc41/l3;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    iget v2, v1, Lc41/l3;->w:I

    const/4 v3, 0x0

    const/4 v8, 0x7

    const/16 v9, 0x8

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x1

    packed-switch v2, :pswitch_data_0

    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Lz1/v;

    move-object/from16 v3, p1

    check-cast v3, Ljava/util/Set;

    check-cast v0, Lz1/f;

    iget-object v0, v2, Lz1/v;->b:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    goto :goto_1

    :cond_0
    instance-of v5, v4, Ljava/util/Set;

    if-eqz v5, :cond_1

    new-array v5, v13, [Ljava/util/Set;

    aput-object v4, v5, v12

    aput-object v3, v5, v14

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    goto :goto_1

    :cond_1
    instance-of v5, v4, Ljava/util/List;

    if-eqz v5, :cond_5

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v5, v6}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v5

    :cond_2
    :goto_1
    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v2}, Lz1/v;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, v2, Lz1/v;->a:Lkotlin/jvm/functions/Function1;

    new-instance v3, Lm83/p;

    const/16 v4, 0x1c

    invoke-direct {v3, v2, v4}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v4, :cond_2

    goto :goto_0

    :cond_5
    const-string v0, "Unexpected notification"

    invoke-static {v0}, Lp1/r;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :pswitch_0
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ui/home/redesign/view/MainActivity;

    move-object/from16 v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v2, v3, v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->s(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Lsr2/l;

    move-object/from16 v3, p1

    check-cast v3, Lxf3/c;

    check-cast v0, Luf3/a;

    invoke-static {v2, v3, v0}, Lsr2/l;->a(Lsr2/l;Lxf3/c;Luf3/a;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Ldc3/h;

    move-object/from16 v3, p1

    check-cast v3, Ljava/util/Set;

    check-cast v0, Lz1/f;

    instance-of v0, v3, Lr1/e;

    const/4 v14, 0x4

    if-eqz v0, :cond_a

    move-object v0, v3

    check-cast v0, Lr1/e;

    iget-object v0, v0, Lr1/e;->w:La0/w0;

    iget-object v15, v0, La0/w0;->b:[Ljava/lang/Object;

    iget-object v0, v0, La0/w0;->a:[J

    const-wide/16 v16, 0x80

    array-length v4, v0

    sub-int/2addr v4, v13

    if-ltz v4, :cond_e

    move v5, v12

    const-wide/16 v18, 0xff

    :goto_2
    aget-wide v6, v0, v5

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    not-long v10, v6

    shl-long/2addr v10, v8

    and-long/2addr v10, v6

    and-long v10, v10, v20

    cmp-long v10, v10, v20

    if-eqz v10, :cond_9

    sub-int v10, v5, v4

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    rsub-int/lit8 v10, v10, 0x8

    move v11, v12

    :goto_3
    if-ge v11, v10, :cond_8

    and-long v22, v6, v18

    cmp-long v13, v22, v16

    if-gez v13, :cond_6

    shl-int/lit8 v13, v5, 0x3

    add-int/2addr v13, v11

    aget-object v13, v15, v13

    move/from16 v22, v8

    instance-of v8, v13, Lz1/a0;

    if-eqz v8, :cond_d

    check-cast v13, Lz1/a0;

    invoke-virtual {v13, v14}, Lz1/a0;->k(I)Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_5

    :cond_6
    move/from16 v22, v8

    :cond_7
    shr-long/2addr v6, v9

    add-int/lit8 v11, v11, 0x1

    move/from16 v8, v22

    goto :goto_3

    :cond_8
    move/from16 v22, v8

    if-ne v10, v9, :cond_e

    goto :goto_4

    :cond_9
    move/from16 v22, v8

    :goto_4
    if-eq v5, v4, :cond_e

    add-int/lit8 v5, v5, 0x1

    move/from16 v8, v22

    goto :goto_2

    :cond_a
    move-object v0, v3

    check-cast v0, Ljava/lang/Iterable;

    instance-of v4, v0, Ljava/util/Collection;

    if-eqz v4, :cond_b

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_6

    :cond_b
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lz1/a0;

    if-eqz v5, :cond_d

    check-cast v4, Lz1/a0;

    invoke-virtual {v4, v14}, Lz1/a0;->k(I)Z

    move-result v4

    if-eqz v4, :cond_c

    :cond_d
    :goto_5
    invoke-interface {v2, v3}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    move/from16 v22, v8

    const-wide/16 v16, 0x80

    const-wide/16 v18, 0xff

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Lp1/y1;

    move-object/from16 v4, p1

    check-cast v4, Ljava/util/Set;

    check-cast v0, Lz1/f;

    iget-object v5, v2, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v5

    :try_start_0
    iget-object v0, v2, Lp1/y1;->u:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/w1;

    sget-object v6, Lp1/w1;->E:Lp1/w1;

    invoke-virtual {v0, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_16

    iget-object v0, v2, Lp1/y1;->h:La0/w0;

    instance-of v3, v4, Lr1/e;

    if-eqz v3, :cond_13

    check-cast v4, Lr1/e;

    iget-object v3, v4, Lr1/e;->w:La0/w0;

    iget-object v4, v3, La0/w0;->b:[Ljava/lang/Object;

    iget-object v3, v3, La0/w0;->a:[J

    array-length v6, v3

    sub-int/2addr v6, v13

    if-ltz v6, :cond_15

    move v7, v12

    :goto_7
    aget-wide v10, v3, v7

    not-long v12, v10

    shl-long v12, v12, v22

    and-long/2addr v12, v10

    and-long v12, v12, v20

    cmp-long v12, v12, v20

    if-eqz v12, :cond_12

    sub-int v12, v7, v6

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    rsub-int/lit8 v12, v12, 0x8

    const/4 v13, 0x0

    :goto_8
    if-ge v13, v12, :cond_11

    and-long v23, v10, v18

    cmp-long v15, v23, v16

    if-gez v15, :cond_10

    shl-int/lit8 v15, v7, 0x3

    add-int/2addr v15, v13

    aget-object v15, v4, v15

    instance-of v8, v15, Lz1/a0;

    if-eqz v8, :cond_f

    move-object v8, v15

    check-cast v8, Lz1/a0;

    invoke-virtual {v8, v14}, Lz1/a0;->k(I)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_9

    :catchall_0
    move-exception v0

    goto :goto_b

    :cond_f
    invoke-virtual {v0, v15}, La0/w0;->a(Ljava/lang/Object;)Z

    :cond_10
    :goto_9
    shr-long/2addr v10, v9

    add-int/lit8 v13, v13, 0x1

    goto :goto_8

    :cond_11
    if-ne v12, v9, :cond_15

    :cond_12
    if-eq v7, v6, :cond_15

    add-int/lit8 v7, v7, 0x1

    const/4 v12, 0x0

    goto :goto_7

    :cond_13
    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Lz1/a0;

    if-eqz v6, :cond_14

    move-object v6, v4

    check-cast v6, Lz1/a0;

    invoke-virtual {v6, v14}, Lz1/a0;->k(I)Z

    move-result v6

    if-nez v6, :cond_14

    goto :goto_a

    :cond_14
    invoke-virtual {v0, v4}, La0/w0;->a(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_15
    invoke-virtual {v2}, Lp1/y1;->w()Lbc3/k;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_16
    monitor-exit v5

    if-eqz v3, :cond_17

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    check-cast v3, Lbc3/m;

    invoke-virtual {v3, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_17
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_b
    monitor-exit v5

    throw v0

    :pswitch_4
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Lx1/h;

    move-object/from16 v3, p1

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v3, v0, Lp1/i;

    if-eqz v3, :cond_19

    move-object v3, v0

    check-cast v3, Lp1/i;

    iget-object v4, v2, Lx1/h;->h:La0/w0;

    if-nez v4, :cond_18

    sget-object v4, La0/e1;->a:La0/w0;

    new-instance v4, La0/w0;

    invoke-direct {v4}, La0/w0;-><init>()V

    iput-object v4, v2, Lx1/h;->h:La0/w0;

    :cond_18
    invoke-virtual {v4, v3}, La0/w0;->k(Ljava/lang/Object;)V

    iget-object v4, v2, Lx1/h;->f:Lr1/c;

    invoke-virtual {v4, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_19
    instance-of v3, v0, Lp1/a2;

    if-eqz v3, :cond_1a

    move-object v3, v0

    check-cast v3, Lp1/a2;

    invoke-virtual {v2, v3}, Lx1/h;->e(Lp1/a2;)V

    :cond_1a
    instance-of v2, v0, Lp1/v1;

    if-eqz v2, :cond_1b

    check-cast v0, Lp1/v1;

    invoke-virtual {v0}, Lp1/v1;->d()V

    :cond_1b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/design/util/TextResource;

    move-object/from16 v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v2, v3, v0}, Lly0/e;->e(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lb2/h;

    move-object/from16 v2, p1

    check-cast v2, Ly3/l;

    move-object v8, v0

    check-cast v8, Ly3/m;

    const-wide/16 v4, 0x0

    iget-wide v6, v2, Ly3/l;->a:J

    invoke-interface/range {v3 .. v8}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v2

    new-instance v0, Ly3/j;

    invoke-direct {v0, v2, v3}, Ly3/j;-><init>(J)V

    return-object v0

    :pswitch_7
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/activation/view/ActivationFragment;

    move-object/from16 v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v2, v3, v0}, Lcom/whoop/activation/view/ActivationFragment;->D(Lcom/whoop/activation/view/ActivationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    move-object/from16 v3, p1

    check-cast v3, Lio/getstream/chat/android/models/User;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-static {v2, v3, v0}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->a(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    move-object/from16 v3, p1

    check-cast v3, Lio/getstream/chat/android/models/Message;

    check-cast v0, Lio/getstream/chat/android/models/Channel;

    invoke-static {v2, v3, v0}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->e(Landroid/content/Context;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Landroid/content/Intent;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Lht2/a;

    move-object/from16 v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v2, v3, v0}, Lht2/e;->p(Lht2/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Lh0/w2;

    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v5

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual {v4}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v3, Lh0/u2;

    const/4 v8, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v8}, Lh0/u2;-><init>(Ljava/lang/Object;FFLq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, v7, v7, v3, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_c
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Lfc3/t;

    move-object/from16 v4, p1

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    check-cast v0, Lq83/h;

    invoke-interface {v0}, Lq83/h;->getKey()Lq83/i;

    move-result-object v5

    iget-object v2, v2, Lfc3/t;->x:Lq83/j;

    invoke-interface {v2, v5}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    sget-object v6, Lbc3/j1;->w:Lbc3/j1;

    if-eq v5, v6, :cond_1d

    if-eq v0, v2, :cond_1c

    const/high16 v4, -0x80000000

    goto :goto_f

    :cond_1c
    add-int/lit8 v4, v4, 0x1

    goto :goto_f

    :cond_1d
    check-cast v2, Lbc3/k1;

    check-cast v0, Lbc3/k1;

    :goto_c
    if-nez v0, :cond_1e

    goto :goto_e

    :cond_1e
    if-ne v0, v2, :cond_1f

    goto :goto_d

    :cond_1f
    instance-of v5, v0, Lhc3/u;

    if-nez v5, :cond_21

    :goto_d
    move-object v3, v0

    :goto_e
    if-ne v3, v2, :cond_20

    if-nez v2, :cond_1c

    :goto_f
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", expected child of "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    check-cast v0, Lhc3/u;

    invoke-virtual {v0}, Lbc3/t1;->getParent()Lbc3/k1;

    move-result-object v0

    goto :goto_c

    :pswitch_d
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Ld0/l0;

    move-object/from16 v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v14}, Lp1/x;->L(I)I

    move-result v0

    invoke-virtual {v2, v3, v0}, Ld0/l0;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_e
    iget-object v2, v1, Lc41/l3;->x:Ljava/lang/Object;

    check-cast v2, Lc41/i3;

    move-object/from16 v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v2, v3, v0}, Lc41/m3;->f(Lc41/i3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
