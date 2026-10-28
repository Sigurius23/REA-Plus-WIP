.class public final Lg63/a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:[B

.field public F:J

.field public G:J

.field public H:I

.field public I:I

.field public synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Long;

.field public final synthetic L:Lio/ktor/utils/io/q;

.field public final synthetic M:Lkotlin/jvm/functions/Function3;

.field public w:Ljava/lang/Object;

.field public x:Lio/ktor/utils/io/q;

.field public y:Lkotlin/jvm/functions/Function3;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Lio/ktor/utils/io/q;Lkotlin/jvm/functions/Function3;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lg63/a;->K:Ljava/lang/Long;

    iput-object p2, p0, Lg63/a;->L:Lio/ktor/utils/io/q;

    iput-object p3, p0, Lg63/a;->M:Lkotlin/jvm/functions/Function3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4

    new-instance v0, Lg63/a;

    iget-object v1, p0, Lg63/a;->L:Lio/ktor/utils/io/q;

    iget-object v2, p0, Lg63/a;->M:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Lg63/a;->K:Ljava/lang/Long;

    invoke-direct {v0, v3, v1, v2, p2}, Lg63/a;-><init>(Ljava/lang/Long;Lio/ktor/utils/io/q;Lkotlin/jvm/functions/Function3;Lq83/d;)V

    iput-object p1, v0, Lg63/a;->J:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/ktor/utils/io/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg63/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg63/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg63/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg63/a;->I:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v8, :cond_3

    if-eq v2, v7, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v5, :cond_0

    iget-object v2, v1, Lg63/a;->w:Ljava/lang/Object;

    iget-object v0, v1, Lg63/a;->J:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lx63/f;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v9, v1, Lg63/a;->G:J

    iget-wide v11, v1, Lg63/a;->F:J

    iget-object v2, v1, Lg63/a;->E:[B

    iget-object v13, v1, Lg63/a;->z:Ljava/lang/Object;

    iget-object v14, v1, Lg63/a;->y:Lkotlin/jvm/functions/Function3;

    iget-object v15, v1, Lg63/a;->x:Lio/ktor/utils/io/q;

    const-wide/16 v16, 0x0

    iget-object v3, v1, Lg63/a;->w:Ljava/lang/Object;

    check-cast v3, Lx63/f;

    iget-object v4, v1, Lg63/a;->J:Ljava/lang/Object;

    check-cast v4, Lio/ktor/utils/io/u;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v8, v14

    move-object v14, v4

    move-wide v4, v11

    move-object v12, v8

    move v8, v6

    move-object v11, v15

    move-wide/from16 v18, v9

    move-object v9, v2

    move-object v2, v13

    move v13, v7

    move-wide/from16 v6, v18

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    move-object v2, v13

    goto/16 :goto_7

    :cond_2
    const-wide/16 v16, 0x0

    iget v2, v1, Lg63/a;->H:I

    iget-wide v3, v1, Lg63/a;->G:J

    iget-wide v9, v1, Lg63/a;->F:J

    iget-object v11, v1, Lg63/a;->E:[B

    iget-object v12, v1, Lg63/a;->z:Ljava/lang/Object;

    iget-object v13, v1, Lg63/a;->y:Lkotlin/jvm/functions/Function3;

    iget-object v14, v1, Lg63/a;->x:Lio/ktor/utils/io/q;

    iget-object v15, v1, Lg63/a;->w:Ljava/lang/Object;

    check-cast v15, Lx63/f;

    iget-object v5, v1, Lg63/a;->J:Ljava/lang/Object;

    check-cast v5, Lio/ktor/utils/io/u;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v8, v13

    move v13, v7

    move-object v7, v14

    move-object v14, v5

    move-wide v5, v9

    move-object v9, v11

    goto/16 :goto_3

    :catchall_2
    move-exception v0

    move-object v2, v12

    move-object v3, v15

    goto/16 :goto_7

    :cond_3
    const-wide/16 v16, 0x0

    iget-wide v2, v1, Lg63/a;->G:J

    iget-wide v4, v1, Lg63/a;->F:J

    iget-object v9, v1, Lg63/a;->E:[B

    iget-object v10, v1, Lg63/a;->z:Ljava/lang/Object;

    iget-object v11, v1, Lg63/a;->y:Lkotlin/jvm/functions/Function3;

    iget-object v12, v1, Lg63/a;->x:Lio/ktor/utils/io/q;

    iget-object v13, v1, Lg63/a;->w:Ljava/lang/Object;

    check-cast v13, Lx63/f;

    iget-object v14, v1, Lg63/a;->J:Ljava/lang/Object;

    check-cast v14, Lio/ktor/utils/io/u;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object/from16 v8, p1

    move-wide v6, v2

    move-object v2, v10

    move-object v3, v13

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v2, v10

    move-object v3, v13

    goto/16 :goto_7

    :cond_4
    const-wide/16 v16, 0x0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg63/a;->J:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/u;

    sget-object v3, Lx63/b;->a:Lx63/a;

    invoke-virtual {v3}, Lx63/d;->t0()Ljava/lang/Object;

    move-result-object v4

    :try_start_4
    move-object v5, v4

    check-cast v5, [B
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    iget-object v9, v1, Lg63/a;->K:Ljava/lang/Long;

    if-eqz v9, :cond_5

    :try_start_5
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_0

    :catchall_4
    move-exception v0

    move-object v2, v4

    goto/16 :goto_7

    :cond_5
    const-wide/16 v9, -0x1

    :goto_0
    iget-object v11, v1, Lg63/a;->L:Lio/ktor/utils/io/q;

    iget-object v12, v1, Lg63/a;->M:Lkotlin/jvm/functions/Function3;

    move-object v14, v2

    move-object v2, v4

    move-wide/from16 v6, v16

    move-wide/from16 v18, v9

    move-object v9, v5

    move-wide/from16 v4, v18

    :goto_1
    :try_start_6
    check-cast v11, Lio/ktor/utils/io/m;

    invoke-virtual {v11}, Lio/ktor/utils/io/m;->n()Z

    move-result v15

    if-nez v15, :cond_9

    iput-object v14, v1, Lg63/a;->J:Ljava/lang/Object;

    iput-object v3, v1, Lg63/a;->w:Ljava/lang/Object;

    iput-object v11, v1, Lg63/a;->x:Lio/ktor/utils/io/q;

    iput-object v12, v1, Lg63/a;->y:Lkotlin/jvm/functions/Function3;

    iput-object v2, v1, Lg63/a;->z:Ljava/lang/Object;

    iput-object v9, v1, Lg63/a;->E:[B

    iput-wide v4, v1, Lg63/a;->F:J

    iput-wide v6, v1, Lg63/a;->G:J

    iput v8, v1, Lg63/a;->I:I

    array-length v15, v9

    const/4 v8, 0x0

    invoke-virtual {v11, v9, v8, v15, v1}, Lio/ktor/utils/io/m;->s([BIILs83/c;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v0, :cond_6

    goto/16 :goto_5

    :cond_6
    move-object/from16 v18, v12

    move-object v12, v11

    move-object/from16 v11, v18

    :goto_2
    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    iget-object v15, v14, Lio/ktor/utils/io/u;->w:Lio/ktor/utils/io/m;

    iput-object v14, v1, Lg63/a;->J:Ljava/lang/Object;

    iput-object v3, v1, Lg63/a;->w:Ljava/lang/Object;

    iput-object v12, v1, Lg63/a;->x:Lio/ktor/utils/io/q;

    iput-object v11, v1, Lg63/a;->y:Lkotlin/jvm/functions/Function3;

    iput-object v2, v1, Lg63/a;->z:Ljava/lang/Object;

    iput-object v9, v1, Lg63/a;->E:[B

    iput-wide v4, v1, Lg63/a;->F:J

    iput-wide v6, v1, Lg63/a;->G:J

    iput v8, v1, Lg63/a;->H:I

    const/4 v13, 0x2

    iput v13, v1, Lg63/a;->I:I

    invoke-virtual {v15, v9, v8, v1}, Lio/ktor/utils/io/m;->M([BILs83/i;)Ljava/lang/Object;

    move-result-object v15
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-ne v15, v0, :cond_7

    goto/16 :goto_5

    :cond_7
    move-object v15, v3

    move-object/from16 v18, v12

    move-object v12, v2

    move v2, v8

    move-object v8, v11

    move-wide/from16 v19, v6

    move-object/from16 v7, v18

    move-wide v5, v4

    move-wide/from16 v3, v19

    :goto_3
    int-to-long v10, v2

    add-long v2, v3, v10

    :try_start_7
    new-instance v4, Ljava/lang/Long;

    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    new-instance v10, Ljava/lang/Long;

    invoke-direct {v10, v5, v6}, Ljava/lang/Long;-><init>(J)V

    iput-object v14, v1, Lg63/a;->J:Ljava/lang/Object;

    iput-object v15, v1, Lg63/a;->w:Ljava/lang/Object;

    iput-object v7, v1, Lg63/a;->x:Lio/ktor/utils/io/q;

    move-object v11, v8

    iput-object v11, v1, Lg63/a;->y:Lkotlin/jvm/functions/Function3;

    iput-object v12, v1, Lg63/a;->z:Ljava/lang/Object;

    iput-object v9, v1, Lg63/a;->E:[B

    iput-wide v5, v1, Lg63/a;->F:J

    iput-wide v2, v1, Lg63/a;->G:J

    const/4 v8, 0x3

    iput v8, v1, Lg63/a;->I:I

    invoke-interface {v11, v4, v10, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-ne v4, v0, :cond_8

    goto :goto_5

    :cond_8
    move-wide v4, v5

    move-object/from16 v18, v11

    move-object v11, v7

    move-wide v6, v2

    move-object v2, v12

    move-object v3, v15

    move-object/from16 v12, v18

    :goto_4
    const/4 v8, 0x1

    goto/16 :goto_1

    :cond_9
    :try_start_8
    invoke-virtual {v11}, Lio/ktor/utils/io/m;->m()Ljava/lang/Throwable;

    move-result-object v8

    iget-object v9, v14, Lio/ktor/utils/io/u;->w:Lio/ktor/utils/io/m;

    invoke-virtual {v9, v8}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)Z

    if-nez v8, :cond_a

    cmp-long v8, v6, v16

    if-nez v8, :cond_a

    new-instance v8, Ljava/lang/Long;

    invoke-direct {v8, v6, v7}, Ljava/lang/Long;-><init>(J)V

    new-instance v6, Ljava/lang/Long;

    invoke-direct {v6, v4, v5}, Ljava/lang/Long;-><init>(J)V

    iput-object v3, v1, Lg63/a;->J:Ljava/lang/Object;

    iput-object v2, v1, Lg63/a;->w:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v1, Lg63/a;->x:Lio/ktor/utils/io/q;

    iput-object v4, v1, Lg63/a;->y:Lkotlin/jvm/functions/Function3;

    iput-object v4, v1, Lg63/a;->z:Ljava/lang/Object;

    iput-object v4, v1, Lg63/a;->E:[B

    const/4 v4, 0x4

    iput v4, v1, Lg63/a;->I:I

    invoke-interface {v12, v8, v6, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-ne v4, v0, :cond_a

    :goto_5
    return-object v0

    :cond_a
    :goto_6
    invoke-interface {v3, v2}, Lx63/f;->a1(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_7
    invoke-interface {v3, v2}, Lx63/f;->a1(Ljava/lang/Object;)V

    throw v0
.end method
