.class public final Le33/p0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Le33/v0;

.field public w:Le33/v0;

.field public x:Lorg/webrtc/SessionDescription;

.field public y:I

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Le33/v0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Le33/p0;->z:Ljava/lang/String;

    iput-object p2, p0, Le33/p0;->E:Le33/v0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Le33/p0;

    iget-object v1, p0, Le33/p0;->z:Ljava/lang/String;

    iget-object v2, p0, Le33/p0;->E:Le33/v0;

    invoke-direct {v0, v1, v2, p1}, Le33/p0;-><init>(Ljava/lang/String;Le33/v0;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Le33/p0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le33/p0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Le33/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v1, p0

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v0, v1, Le33/p0;->y:I

    const-string v4, "description"

    const/4 v5, 0x4

    const/4 v6, 0x3

    const-string v7, "unknown"

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v9, :cond_3

    if-eq v0, v8, :cond_2

    if-eq v0, v6, :cond_1

    if-ne v0, v5, :cond_0

    iget-object v2, v1, Le33/p0;->w:Le33/v0;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p1

    move-object/from16 v17, v7

    goto/16 :goto_19

    :catchall_0
    move-exception v0

    move-object/from16 v17, v7

    goto/16 :goto_1b

    :catch_0
    move-exception v0

    goto/16 :goto_1e

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Le33/p0;->x:Lorg/webrtc/SessionDescription;

    iget-object v6, v1, Le33/p0;->w:Le33/v0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v2

    move-object/from16 v21, v4

    move-object/from16 v17, v7

    move-object/from16 v2, p1

    goto/16 :goto_14

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_3

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Lorg/webrtc/SessionDescription;

    sget-object v10, Lorg/webrtc/SessionDescription$Type;->OFFER:Lorg/webrtc/SessionDescription$Type;

    iget-object v11, v1, Le33/p0;->z:Ljava/lang/String;

    invoke-direct {v0, v10, v11}, Lorg/webrtc/SessionDescription;-><init>(Lorg/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    iget-object v10, v1, Le33/p0;->E:Le33/v0;

    iput v9, v1, Le33/p0;->y:I

    invoke-virtual {v10, v0, v1}, Le33/u;->l(Lorg/webrtc/SessionDescription;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_5

    :goto_0
    move-object v3, v2

    goto/16 :goto_18

    :cond_5
    :goto_1
    check-cast v0, Ln23/h;

    iget-object v10, v1, Le33/p0;->E:Le33/v0;

    instance-of v11, v0, Ln23/g;

    if-nez v11, :cond_8

    instance-of v12, v0, Ln23/f;

    if-eqz v12, :cond_7

    move-object v12, v0

    check-cast v12, Ln23/f;

    iget-object v12, v12, Ln23/f;->a:Ln23/e;

    iget-object v13, v10, Le33/v0;->A:Ll53/m;

    invoke-virtual {v12}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_6

    move-object v12, v7

    :cond_6
    const-string v14, "negotiate-error-setremotedescription"

    invoke-virtual {v13, v12, v14}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v10, Le33/v0;->B:Ld33/b0;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8
    :goto_2
    iget-object v10, v1, Le33/p0;->E:Le33/v0;

    if-eqz v11, :cond_a

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Ll83/a0;

    iput v8, v1, Le33/p0;->y:I

    sget-object v0, Ln53/c;->a:Lorg/webrtc/MediaConstraints;

    invoke-virtual {v10, v0, v1}, Le33/u;->c(Lorg/webrtc/MediaConstraints;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_9

    goto :goto_0

    :cond_9
    :goto_3
    check-cast v0, Ln23/h;

    goto :goto_4

    :cond_a
    instance-of v8, v0, Ln23/f;

    if-eqz v8, :cond_2f

    :goto_4
    iget-object v8, v1, Le33/p0;->E:Le33/v0;

    iget-object v10, v1, Le33/p0;->z:Ljava/lang/String;

    instance-of v11, v0, Ln23/g;

    if-eqz v11, :cond_1c

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/SessionDescription;

    iget-boolean v11, v8, Le33/v0;->z:Z

    if-eqz v11, :cond_1b

    new-instance v11, Lorg/webrtc/SessionDescription;

    sget-object v12, Lorg/webrtc/SessionDescription$Type;->ANSWER:Lorg/webrtc/SessionDescription$Type;

    iget-object v13, v0, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerSdp"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v10}, Lyb3/r;->m0(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v15, 0x0

    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v16
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    const-string v3, "stereo=1"

    const-string v6, "a=fmtp:"

    const-string v14, " "

    move-object/from16 v17, v7

    const-string v7, ":"

    move-object/from16 v18, v10

    const-string v10, "opus"

    move-object/from16 v19, v13

    const-string v13, "a=rtpmap:"

    move/from16 v20, v15

    const-string v15, "m="

    move-object/from16 v21, v4

    const-string v4, "m=audio"

    move-object/from16 v22, v2

    const-string v2, "a=mid:"

    if-eqz v16, :cond_10

    :try_start_2
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v1, v16

    check-cast v1, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object/from16 v16, v8

    const/4 v8, 0x0

    :try_start_3
    invoke-static {v1, v4, v8}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object/from16 v1, p0

    move-object/from16 v8, v16

    move-object/from16 v7, v17

    move-object/from16 v10, v18

    move-object/from16 v13, v19

    move-object/from16 v4, v21

    move-object/from16 v2, v22

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v9, 0x0

    const/4 v15, 0x1

    goto :goto_5

    :cond_b
    invoke-static {v1, v15, v8}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_c

    move-object/from16 v1, p0

    move v15, v8

    move-object/from16 v8, v16

    move-object/from16 v7, v17

    move-object/from16 v10, v18

    move-object/from16 v13, v19

    move-object/from16 v4, v21

    move-object/from16 v2, v22

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v9, 0x0

    goto :goto_5

    :cond_c
    if-eqz v20, :cond_e

    invoke-static {v1, v2, v8}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-static {v1, v2}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_d
    :goto_6
    move-object/from16 v1, p0

    move-object/from16 v8, v16

    move-object/from16 v7, v17

    move-object/from16 v10, v18

    move-object/from16 v13, v19

    move/from16 v15, v20

    move-object/from16 v4, v21

    move-object/from16 v2, v22

    const/4 v6, 0x3

    goto :goto_5

    :catch_1
    move-exception v0

    :goto_7
    move-object/from16 v20, v11

    goto/16 :goto_e

    :cond_e
    if-eqz v20, :cond_f

    const/4 v8, 0x0

    invoke-static {v1, v13, v8}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-static {v1, v10, v8}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-static {v1, v7, v1}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v14}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_6

    :cond_f
    if-eqz v20, :cond_d

    if-eqz v9, :cond_d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v8, 0x0

    invoke-static {v1, v2, v8}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {v1, v3, v8}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_d

    if-eqz v5, :cond_d

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :catch_2
    move-exception v0

    move-object/from16 v16, v8

    goto :goto_7

    :cond_10
    move-object/from16 v16, v8

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_11

    move-object/from16 v20, v11

    goto/16 :goto_f

    :cond_11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {v19 .. v19}, Lyb3/r;->m0(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-object/from16 v18, v5

    :goto_8
    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_9
    const/4 v9, 0x0

    :goto_a
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_19

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move/from16 v23, v8

    move-object/from16 v8, v20

    check-cast v8, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-object/from16 v20, v11

    const/4 v11, 0x0

    :try_start_4
    invoke-static {v8, v4, v11}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v24

    const/16 v11, 0xa

    if-eqz v24, :cond_12

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object/from16 v11, v20

    const/4 v5, 0x0

    const/4 v8, 0x1

    goto :goto_9

    :catch_3
    move-exception v0

    goto/16 :goto_e

    :cond_12
    const/4 v11, 0x0

    invoke-static {v8, v15, v11}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v25

    if-eqz v25, :cond_13

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0xa

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object/from16 v11, v20

    goto :goto_8

    :cond_13
    if-eqz v23, :cond_14

    const/4 v11, 0x0

    invoke-static {v8, v2, v11}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v25

    if-eqz v25, :cond_14

    invoke-static {v8, v2}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_b
    move-object/from16 v11, v20

    move/from16 v8, v23

    goto :goto_a

    :cond_14
    if-eqz v23, :cond_15

    const/4 v11, 0x0

    invoke-static {v8, v13, v11}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v25

    if-eqz v25, :cond_15

    invoke-static {v8, v10, v11}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v25

    if-eqz v25, :cond_15

    invoke-static {v8, v7, v8}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v14}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_b

    :cond_15
    if-eqz v23, :cond_17

    invoke-static {v0, v9}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_17

    if-eqz v5, :cond_17

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v25, v0

    const/4 v0, 0x0

    invoke-static {v8, v11, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-static {v8, v3, v0}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v11

    if-nez v11, :cond_16

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ";stereo=1"

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_c

    :cond_16
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_c

    :cond_17
    move-object/from16 v25, v0

    const/4 v0, 0x0

    :cond_18
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0xa

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_c
    move-object/from16 v11, v20

    move/from16 v8, v23

    move-object/from16 v0, v25

    goto/16 :goto_a

    :cond_19
    move-object/from16 v20, v11

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lyb3/r;->Q0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :goto_d
    move-object/from16 v1, v20

    goto :goto_10

    :catch_4
    move-exception v0

    move-object/from16 v22, v2

    move-object/from16 v21, v4

    move-object/from16 v17, v7

    move-object/from16 v16, v8

    move-object/from16 v20, v11

    move-object/from16 v19, v13

    :goto_e
    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    const-string v3, "SafeCall"

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1a

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Exception occurred: "

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1a
    :goto_f
    move-object/from16 v13, v19

    goto :goto_d

    :goto_10
    invoke-direct {v1, v12, v13}, Lorg/webrtc/SessionDescription;-><init>(Lorg/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    move-object/from16 v2, v16

    iget-object v0, v2, Le33/v0;->A:Ll53/m;

    sget-object v2, Ll53/a;->x:[Ll53/a;

    const-string v2, "createAnswer"

    iget-object v3, v1, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_11

    :cond_1b
    move-object/from16 v22, v2

    move-object/from16 v21, v4

    move-object/from16 v17, v7

    :goto_11
    new-instance v1, Ln23/g;

    invoke-direct {v1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_12
    move-object/from16 v1, p0

    goto :goto_13

    :cond_1c
    move-object/from16 v22, v2

    move-object/from16 v21, v4

    move-object/from16 v17, v7

    instance-of v1, v0, Ln23/f;

    if-eqz v1, :cond_2e

    goto :goto_12

    :goto_13
    iget-object v6, v1, Le33/p0;->E:Le33/v0;

    instance-of v2, v0, Ln23/g;

    if-eqz v2, :cond_23

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/SessionDescription;

    iput-object v6, v1, Le33/p0;->w:Le33/v0;

    iput-object v0, v1, Le33/p0;->x:Lorg/webrtc/SessionDescription;

    const/4 v2, 0x3

    iput v2, v1, Le33/p0;->y:I

    invoke-virtual {v6, v0, v1}, Le33/u;->k(Lorg/webrtc/SessionDescription;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v3, v22

    if-ne v2, v3, :cond_1d

    goto/16 :goto_18

    :cond_1d
    :goto_14
    check-cast v2, Ln23/h;

    instance-of v4, v2, Ln23/g;

    if-nez v4, :cond_20

    instance-of v5, v2, Ln23/f;

    if-eqz v5, :cond_1f

    move-object v5, v2

    check-cast v5, Ln23/f;

    iget-object v5, v5, Ln23/f;->a:Ln23/e;

    iget-object v6, v6, Le33/v0;->A:Ll53/m;

    invoke-virtual {v5}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1e

    move-object/from16 v5, v17

    :cond_1e
    const-string v7, "negotiate-error-setlocaldescription"

    invoke-virtual {v6, v5, v7}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_15

    :cond_1f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_20
    :goto_15
    if-eqz v4, :cond_21

    check-cast v2, Ln23/g;

    iget-object v2, v2, Ln23/g;->a:Ljava/lang/Object;

    check-cast v2, Ll83/a0;

    new-instance v2, Ln23/g;

    invoke-direct {v2, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    :goto_16
    move-object v0, v2

    goto :goto_17

    :cond_21
    instance-of v0, v2, Ln23/f;

    if-eqz v0, :cond_22

    goto :goto_16

    :cond_22
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_23
    move-object/from16 v3, v22

    instance-of v2, v0, Ln23/f;

    if-eqz v2, :cond_2d

    :goto_17
    iget-object v2, v1, Le33/p0;->E:Le33/v0;

    instance-of v4, v0, Ln23/g;

    if-eqz v4, :cond_29

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/SessionDescription;

    new-instance v4, Lstream/video/sfu/signal/SendAnswerRequest;

    sget-object v5, Lstream/video/sfu/models/PeerType;->PEER_TYPE_SUBSCRIBER:Lstream/video/sfu/models/PeerType;

    iget-object v6, v0, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    move-object/from16 v7, v21

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v2, Le33/v0;->w:Ljava/lang/String;

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lstream/video/sfu/signal/SendAnswerRequest;-><init>(Lstream/video/sfu/models/PeerType;Ljava/lang/String;Ljava/lang/String;ILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :try_start_5
    iget-object v0, v2, Le33/v0;->x:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object v2, v1, Le33/p0;->w:Le33/v0;

    const/4 v5, 0x0

    iput-object v5, v1, Le33/p0;->x:Lorg/webrtc/SessionDescription;

    const/4 v5, 0x4

    iput v5, v1, Le33/p0;->y:I

    invoke-interface {v0, v4, v1}, Lio/getstream/video/android/core/api/SignalServerService;->sendAnswer(Lstream/video/sfu/signal/SendAnswerRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_24

    :goto_18
    return-object v3

    :cond_24
    :goto_19
    new-instance v3, Ln23/g;

    invoke-direct {v3, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_1a
    move-object v0, v3

    goto :goto_1c

    :catchall_1
    move-exception v0

    :goto_1b
    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    const-string v5, "SafeApiCall"

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_25

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    const-string v7, "API call failed: "

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v4, v5, v6, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_25
    new-instance v3, Ln23/f;

    new-instance v4, Ln23/d;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_26

    const-string v5, "API call failed"

    :cond_26
    invoke-direct {v4, v5, v0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v3, v4}, Ln23/f;-><init>(Ln23/e;)V

    goto :goto_1a

    :goto_1c
    instance-of v3, v0, Ln23/g;

    if-nez v3, :cond_2a

    instance-of v3, v0, Ln23/f;

    if-eqz v3, :cond_28

    move-object v3, v0

    check-cast v3, Ln23/f;

    iget-object v3, v3, Ln23/f;->a:Ln23/e;

    iget-object v2, v2, Le33/v0;->A:Ll53/m;

    invoke-virtual {v3}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_27

    move-object/from16 v7, v17

    goto :goto_1d

    :cond_27
    move-object v7, v3

    :goto_1d
    const-string v3, "negotiate-error-sendanswer"

    invoke-virtual {v2, v7, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1f

    :cond_28
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :goto_1e
    throw v0

    :cond_29
    instance-of v2, v0, Ln23/f;

    if-eqz v2, :cond_2c

    :cond_2a
    :goto_1f
    iget-object v2, v1, Le33/p0;->E:Le33/v0;

    invoke-virtual {v2}, Le33/u;->f()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2b

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Subscriber negotiate: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v3, v4, v2, v5, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2b
    invoke-virtual {v0}, Ln23/h;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2e
    move-object/from16 v1, p0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
