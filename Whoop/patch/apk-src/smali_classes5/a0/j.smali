.class public final La0/j;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public F:I

.field public G:I

.field public H:J

.field public I:I

.field public synthetic J:Ljava/lang/Object;

.field public K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic x:I

.field public y:[J

.field public z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    iput p3, p0, La0/j;->x:I

    iput-object p1, p0, La0/j;->L:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, La0/j;->x:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La0/j;

    iget-object v1, p0, La0/j;->L:Ljava/lang/Object;

    check-cast v1, Lr1/e;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p2, v2}, La0/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La0/j;->J:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, La0/j;

    iget-object v1, p0, La0/j;->L:Ljava/lang/Object;

    check-cast v1, La0/j1;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p2, v2}, La0/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La0/j;->J:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v0, La0/j;

    iget-object v1, p0, La0/j;->L:Ljava/lang/Object;

    check-cast v1, La0/k;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, La0/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La0/j;->J:Ljava/lang/Object;

    return-object v0

    :pswitch_2
    new-instance v0, La0/j;

    iget-object v1, p0, La0/j;->L:Ljava/lang/Object;

    check-cast v1, La0/k;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, La0/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La0/j;->J:Ljava/lang/Object;

    return-object v0

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

    iget v0, p0, La0/j;->x:I

    check-cast p1, Lxb3/j;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, La0/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La0/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La0/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, La0/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La0/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La0/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, La0/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La0/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La0/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, La0/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La0/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La0/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 26

    move-object/from16 v0, p0

    iget v1, v0, La0/j;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v8, v0, La0/j;->L:Ljava/lang/Object;

    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v10, 0x1

    const/16 v11, 0x8

    packed-switch v1, :pswitch_data_0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v15, v0, La0/j;->I:I

    if-eqz v15, :cond_1

    if-ne v15, v10, :cond_0

    iget v8, v0, La0/j;->G:I

    iget v9, v0, La0/j;->F:I

    const-wide/16 v15, 0x80

    iget-wide v3, v0, La0/j;->H:J

    const-wide/16 v17, 0xff

    iget v5, v0, La0/j;->E:I

    iget v6, v0, La0/j;->z:I

    const/16 v19, 0x7

    iget-object v7, v0, La0/j;->y:[J

    iget-object v12, v0, La0/j;->K:Ljava/lang/Object;

    check-cast v12, [Ljava/lang/Object;

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    iget-object v13, v0, La0/j;->J:Ljava/lang/Object;

    check-cast v13, Lxb3/j;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-wide/16 v15, 0x80

    const-wide/16 v17, 0xff

    const/16 v19, 0x7

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, La0/j;->J:Ljava/lang/Object;

    check-cast v3, Lxb3/j;

    check-cast v8, Lr1/e;

    iget-object v4, v8, Lr1/e;->w:La0/w0;

    iget-object v5, v4, La0/w0;->b:[Ljava/lang/Object;

    iget-object v4, v4, La0/w0;->a:[J

    array-length v6, v4

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_5

    const/4 v7, 0x0

    :goto_0
    aget-wide v8, v4, v7

    not-long v12, v8

    shl-long v12, v12, v19

    and-long/2addr v12, v8

    and-long v12, v12, v20

    cmp-long v12, v12, v20

    if-eqz v12, :cond_4

    sub-int v12, v7, v6

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    rsub-int/lit8 v12, v12, 0x8

    move-object v13, v3

    move/from16 v24, v7

    move-object v7, v4

    move-wide v3, v8

    move v9, v12

    const/4 v8, 0x0

    move-object v12, v5

    move/from16 v5, v24

    :goto_1
    if-ge v8, v9, :cond_3

    and-long v22, v3, v17

    cmp-long v14, v22, v15

    if-gez v14, :cond_2

    shl-int/lit8 v2, v5, 0x3

    add-int/2addr v2, v8

    aget-object v2, v12, v2

    iput-object v13, v0, La0/j;->J:Ljava/lang/Object;

    iput-object v12, v0, La0/j;->K:Ljava/lang/Object;

    iput-object v7, v0, La0/j;->y:[J

    iput v6, v0, La0/j;->z:I

    iput v5, v0, La0/j;->E:I

    iput-wide v3, v0, La0/j;->H:J

    iput v9, v0, La0/j;->F:I

    iput v8, v0, La0/j;->G:I

    iput v10, v0, La0/j;->I:I

    invoke-virtual {v13, v2, v0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v2, Lr83/a;->w:Lr83/a;

    move-object v2, v1

    goto :goto_3

    :cond_2
    :goto_2
    shr-long/2addr v3, v11

    add-int/2addr v8, v10

    goto :goto_1

    :cond_3
    if-ne v9, v11, :cond_5

    move-object v4, v7

    move-object v3, v13

    move v7, v5

    move-object v5, v12

    :cond_4
    if-eq v7, v6, :cond_5

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    :goto_3
    return-object v2

    :pswitch_0
    const-wide/16 v15, 0x80

    const-wide/16 v17, 0xff

    const/16 v19, 0x7

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, v0, La0/j;->I:I

    if-eqz v3, :cond_7

    if-ne v3, v10, :cond_6

    iget v3, v0, La0/j;->G:I

    iget v4, v0, La0/j;->F:I

    iget-wide v5, v0, La0/j;->H:J

    iget v7, v0, La0/j;->E:I

    iget v8, v0, La0/j;->z:I

    iget-object v9, v0, La0/j;->y:[J

    iget-object v12, v0, La0/j;->K:Ljava/lang/Object;

    check-cast v12, [Ljava/lang/Object;

    iget-object v13, v0, La0/j;->J:Ljava/lang/Object;

    check-cast v13, Lxb3/j;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, La0/j;->J:Ljava/lang/Object;

    check-cast v3, Lxb3/j;

    check-cast v8, La0/j1;

    iget-object v4, v8, La0/j1;->w:La0/v0;

    iget-object v5, v4, La0/v0;->c:[Ljava/lang/Object;

    iget-object v4, v4, La0/v0;->a:[J

    array-length v6, v4

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_b

    const/4 v7, 0x0

    :goto_4
    aget-wide v8, v4, v7

    not-long v12, v8

    shl-long v12, v12, v19

    and-long/2addr v12, v8

    and-long v12, v12, v20

    cmp-long v12, v12, v20

    if-eqz v12, :cond_a

    sub-int v12, v7, v6

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    rsub-int/lit8 v12, v12, 0x8

    move-object v13, v3

    const/4 v3, 0x0

    move-wide/from16 v24, v8

    move-object v9, v4

    move v8, v6

    move v4, v12

    move-object v12, v5

    move-wide/from16 v5, v24

    :goto_5
    if-ge v3, v4, :cond_9

    and-long v22, v5, v17

    cmp-long v14, v22, v15

    if-gez v14, :cond_8

    shl-int/lit8 v2, v7, 0x3

    add-int/2addr v2, v3

    aget-object v2, v12, v2

    iput-object v13, v0, La0/j;->J:Ljava/lang/Object;

    iput-object v12, v0, La0/j;->K:Ljava/lang/Object;

    iput-object v9, v0, La0/j;->y:[J

    iput v8, v0, La0/j;->z:I

    iput v7, v0, La0/j;->E:I

    iput-wide v5, v0, La0/j;->H:J

    iput v4, v0, La0/j;->F:I

    iput v3, v0, La0/j;->G:I

    iput v10, v0, La0/j;->I:I

    invoke-virtual {v13, v2, v0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v2, Lr83/a;->w:Lr83/a;

    move-object v2, v1

    goto :goto_7

    :cond_8
    :goto_6
    shr-long/2addr v5, v11

    add-int/2addr v3, v10

    goto :goto_5

    :cond_9
    if-ne v4, v11, :cond_b

    move v6, v8

    move-object v4, v9

    move-object v5, v12

    move-object v3, v13

    :cond_a
    if-eq v7, v6, :cond_b

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_b
    :goto_7
    return-object v2

    :pswitch_1
    const-wide/16 v15, 0x80

    const-wide/16 v17, 0xff

    const/16 v19, 0x7

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, v0, La0/j;->I:I

    if-eqz v3, :cond_d

    if-ne v3, v10, :cond_c

    iget v3, v0, La0/j;->G:I

    iget v4, v0, La0/j;->F:I

    iget-wide v5, v0, La0/j;->H:J

    iget v7, v0, La0/j;->E:I

    iget v8, v0, La0/j;->z:I

    iget-object v9, v0, La0/j;->y:[J

    iget-object v12, v0, La0/j;->K:Ljava/lang/Object;

    check-cast v12, [Ljava/lang/Object;

    iget-object v13, v0, La0/j;->J:Ljava/lang/Object;

    check-cast v13, Lxb3/j;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_a

    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, La0/j;->J:Ljava/lang/Object;

    check-cast v3, Lxb3/j;

    check-cast v8, La0/k;

    iget-object v4, v8, La0/k;->x:La0/v0;

    iget-object v5, v4, La0/v0;->b:[Ljava/lang/Object;

    iget-object v4, v4, La0/v0;->a:[J

    array-length v6, v4

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_11

    const/4 v7, 0x0

    :goto_8
    aget-wide v8, v4, v7

    not-long v12, v8

    shl-long v12, v12, v19

    and-long/2addr v12, v8

    and-long v12, v12, v20

    cmp-long v12, v12, v20

    if-eqz v12, :cond_10

    sub-int v12, v7, v6

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    rsub-int/lit8 v12, v12, 0x8

    move-object v13, v3

    const/4 v3, 0x0

    move-wide/from16 v24, v8

    move-object v9, v4

    move v8, v6

    move v4, v12

    move-object v12, v5

    move-wide/from16 v5, v24

    :goto_9
    if-ge v3, v4, :cond_f

    and-long v22, v5, v17

    cmp-long v14, v22, v15

    if-gez v14, :cond_e

    shl-int/lit8 v2, v7, 0x3

    add-int/2addr v2, v3

    aget-object v2, v12, v2

    iput-object v13, v0, La0/j;->J:Ljava/lang/Object;

    iput-object v12, v0, La0/j;->K:Ljava/lang/Object;

    iput-object v9, v0, La0/j;->y:[J

    iput v8, v0, La0/j;->z:I

    iput v7, v0, La0/j;->E:I

    iput-wide v5, v0, La0/j;->H:J

    iput v4, v0, La0/j;->F:I

    iput v3, v0, La0/j;->G:I

    iput v10, v0, La0/j;->I:I

    invoke-virtual {v13, v2, v0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v2, Lr83/a;->w:Lr83/a;

    move-object v2, v1

    goto :goto_b

    :cond_e
    :goto_a
    shr-long/2addr v5, v11

    add-int/2addr v3, v10

    goto :goto_9

    :cond_f
    if-ne v4, v11, :cond_11

    move v6, v8

    move-object v4, v9

    move-object v5, v12

    move-object v3, v13

    :cond_10
    if-eq v7, v6, :cond_11

    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    :cond_11
    :goto_b
    return-object v2

    :pswitch_2
    const-wide/16 v15, 0x80

    const-wide/16 v17, 0xff

    const/16 v19, 0x7

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, v0, La0/j;->I:I

    if-eqz v3, :cond_13

    if-ne v3, v10, :cond_12

    iget v3, v0, La0/j;->G:I

    iget v4, v0, La0/j;->F:I

    iget-wide v5, v0, La0/j;->H:J

    iget v7, v0, La0/j;->E:I

    iget v8, v0, La0/j;->z:I

    iget-object v9, v0, La0/j;->y:[J

    iget-object v12, v0, La0/j;->K:Ljava/lang/Object;

    check-cast v12, La0/k;

    iget-object v13, v0, La0/j;->J:Ljava/lang/Object;

    check-cast v13, Lxb3/j;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v24, v8

    move v8, v7

    move v7, v11

    move-object v11, v9

    move v9, v10

    move/from16 v10, v24

    goto/16 :goto_e

    :cond_12
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_13
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, La0/j;->J:Ljava/lang/Object;

    check-cast v3, Lxb3/j;

    check-cast v8, La0/k;

    iget-object v4, v8, La0/k;->x:La0/v0;

    iget-object v4, v4, La0/v0;->a:[J

    array-length v5, v4

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_17

    const/4 v6, 0x0

    :goto_c
    aget-wide v12, v4, v6

    move v7, v11

    not-long v10, v12

    shl-long v10, v10, v19

    and-long/2addr v10, v12

    and-long v10, v10, v20

    cmp-long v10, v10, v20

    if-eqz v10, :cond_16

    sub-int v10, v6, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    rsub-int/lit8 v11, v10, 0x8

    move v10, v11

    move-object v11, v4

    move v4, v10

    move v10, v5

    move-wide/from16 v24, v12

    move-object v13, v3

    move-object v12, v8

    const/4 v3, 0x0

    move v8, v6

    move-wide/from16 v5, v24

    :goto_d
    if-ge v3, v4, :cond_15

    and-long v22, v5, v17

    cmp-long v14, v22, v15

    if-gez v14, :cond_14

    shl-int/lit8 v2, v8, 0x3

    add-int/2addr v2, v3

    new-instance v7, La0/b0;

    iget-object v14, v12, La0/k;->x:La0/v0;

    iget-object v15, v14, La0/v0;->b:[Ljava/lang/Object;

    aget-object v15, v15, v2

    iget-object v14, v14, La0/v0;->c:[Ljava/lang/Object;

    aget-object v2, v14, v2

    invoke-direct {v7, v15, v2}, La0/b0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v13, v0, La0/j;->J:Ljava/lang/Object;

    iput-object v12, v0, La0/j;->K:Ljava/lang/Object;

    iput-object v11, v0, La0/j;->y:[J

    iput v10, v0, La0/j;->z:I

    iput v8, v0, La0/j;->E:I

    iput-wide v5, v0, La0/j;->H:J

    iput v4, v0, La0/j;->F:I

    iput v3, v0, La0/j;->G:I

    const/4 v9, 0x1

    iput v9, v0, La0/j;->I:I

    invoke-virtual {v13, v7, v0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v2, Lr83/a;->w:Lr83/a;

    move-object v2, v1

    goto :goto_10

    :cond_14
    const/4 v9, 0x1

    :goto_e
    shr-long/2addr v5, v7

    add-int/2addr v3, v9

    goto :goto_d

    :cond_15
    const/4 v9, 0x1

    if-ne v4, v7, :cond_17

    move v6, v8

    move v5, v10

    move-object v4, v11

    move-object v8, v12

    move-object v3, v13

    goto :goto_f

    :cond_16
    const/4 v9, 0x1

    :goto_f
    if-eq v6, v5, :cond_17

    add-int/lit8 v6, v6, 0x1

    move v11, v7

    move v10, v9

    goto :goto_c

    :cond_17
    :goto_10
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
