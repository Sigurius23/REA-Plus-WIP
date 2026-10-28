.class public final Lh53/d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lh53/e;


# direct methods
.method public synthetic constructor <init>(Lh53/e;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lh53/d;->w:I

    iput-object p1, p0, Lh53/d;->z:Lh53/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lh53/d;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lh53/d;

    iget-object v1, p0, Lh53/d;->z:Lh53/e;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Lh53/d;-><init>(Lh53/e;Lq83/d;I)V

    iput-object p1, v0, Lh53/d;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lh53/d;

    iget-object v1, p0, Lh53/d;->z:Lh53/e;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lh53/d;-><init>(Lh53/e;Lq83/d;I)V

    iput-object p1, v0, Lh53/d;->y:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh53/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lx43/p;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh53/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh53/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh53/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Li53/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh53/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh53/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh53/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 47

    move-object/from16 v0, p0

    iget v1, v0, Lh53/d;->w:I

    packed-switch v1, :pswitch_data_0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh53/d;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v6, :cond_1

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lh53/d;->y:Ljava/lang/Object;

    check-cast v2, Lx43/p;

    instance-of v7, v2, Lx43/m;

    iget-object v8, v0, Lh53/d;->z:Lh53/e;

    if-eqz v7, :cond_3

    check-cast v2, Lx43/m;

    iput v6, v0, Lh53/d;->x:I

    invoke-static {v8, v2, v0}, Lh53/e;->a(Lh53/e;Lx43/m;Lh53/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_3

    :cond_3
    instance-of v6, v2, Lx43/n;

    if-eqz v6, :cond_6

    check-cast v2, Lx43/n;

    iget-object v2, v2, Lx43/n;->a:Lv33/w;

    instance-of v3, v2, Lv33/h;

    if-eqz v3, :cond_5

    check-cast v2, Lv33/h;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lv33/h;->a:Lstream/video/sfu/models/Error;

    if-eqz v3, :cond_4

    new-instance v4, Ln23/c;

    invoke-virtual {v3}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v7

    invoke-virtual {v7}, Lstream/video/sfu/models/ErrorCode;->getValue()I

    move-result v7

    invoke-virtual {v3}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v3

    invoke-virtual {v3}, Lstream/video/sfu/models/ErrorCode;->getValue()I

    move-result v3

    const/16 v9, 0x8

    invoke-direct {v4, v6, v7, v3, v9}, Ln23/c;-><init>(Ljava/lang/String;III)V

    goto :goto_1

    :cond_4
    sget-object v3, Lu33/e;->I:Lu33/e;

    const/4 v4, 0x0

    invoke-static {v3, v4, v5}, Ls4/a;->d(Lu33/e;Ljava/lang/Throwable;I)Ln23/c;

    move-result-object v4

    :goto_1
    new-instance v3, Lx43/m;

    iget-object v2, v2, Lv33/h;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    invoke-direct {v3, v4, v2}, Lx43/m;-><init>(Ln23/e;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    iput v5, v0, Lh53/d;->x:I

    invoke-static {v8, v3, v0}, Lh53/e;->a(Lh53/e;Lx43/m;Lh53/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_3

    :cond_5
    iput v4, v0, Lh53/d;->x:I

    invoke-static {v8, v2, v0}, Lh53/e;->b(Lh53/e;Lv33/w;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_3

    :cond_6
    new-instance v4, Lv33/b0;

    invoke-direct {v4, v2}, Lv33/b0;-><init>(Ljava/lang/Object;)V

    iput v3, v0, Lh53/d;->x:I

    invoke-static {v8, v4, v0}, Lh53/e;->b(Lh53/e;Lv33/w;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v1

    :pswitch_0
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh53/d;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    iget-object v5, v0, Lh53/d;->z:Lh53/e;

    if-eqz v2, :cond_9

    if-ne v2, v4, :cond_8

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lh53/d;->y:Ljava/lang/Object;

    check-cast v2, Li53/j;

    invoke-virtual {v5}, Lh53/e;->d()Lb23/k;

    move-result-object v6

    iget-object v7, v5, Lh53/e;->e:Ljava/lang/Object;

    check-cast v7, Lc53/a;

    iget-object v8, v5, Lh53/e;->p:Ljava/lang/Object;

    check-cast v8, Lx43/h;

    iget-object v9, v6, Lb23/k;->c:Lb23/e;

    iget-object v10, v6, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->z:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    const/4 v12, 0x0

    if-eqz v9, :cond_a

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v13, "[onSocketStateChanged] state: "

    invoke-direct {v9, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v11, v10, v9, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    instance-of v6, v2, Li53/a;

    if-eqz v6, :cond_c

    invoke-virtual {v8}, Lx43/h;->a()V

    new-instance v1, La0/a1;

    const/16 v4, 0x18

    invoke-direct {v1, v2, v4}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v1}, Lh53/e;->c(Lkotlin/jvm/functions/Function1;)V

    :cond_b
    :goto_4
    move-object v1, v3

    goto/16 :goto_c

    :cond_c
    instance-of v6, v2, Li53/b;

    const-string v9, "Connection close by client"

    const/16 v10, 0x3e8

    const/4 v11, 0x3

    if-eqz v6, :cond_1b

    check-cast v2, Li53/b;

    iget-object v2, v2, Li53/b;->a:Lx43/c;

    iget-object v6, v2, Lx43/c;->e:Lstream/video/sfu/event/JoinRequest;

    iput v4, v0, Lh53/d;->x:I

    invoke-virtual {v5}, Lh53/e;->d()Lb23/k;

    move-result-object v8

    iget-object v13, v8, Lb23/k;->c:Lb23/e;

    iget-object v14, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->y:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_d

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v4, "[connectUser] connectionConf: "

    invoke-direct {v13, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v8, v15, v14, v4, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    new-instance v4, Lh53/a;

    const/4 v8, 0x4

    invoke-direct {v4, v5, v12, v8}, Lh53/a;-><init>(Lh53/e;Lq83/d;I)V

    invoke-static {v7, v12, v12, v4, v11}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v4, v5, Lh53/e;->o:Ljava/lang/Object;

    check-cast v4, Lbc3/k1;

    if-eqz v4, :cond_e

    invoke-interface {v4, v12}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_e
    iget-object v4, v5, Lh53/e;->i:Ljava/lang/Object;

    check-cast v4, Lq/f;

    if-eqz v4, :cond_f

    const-string v8, "connectUser:cleanup"

    invoke-virtual {v4, v10, v8, v9}, Lq/f;->l0(ILjava/lang/String;Ljava/lang/String;)Z

    :cond_f
    iget-object v4, v5, Lh53/e;->g:Ljava/lang/Object;

    check-cast v4, Lz33/b;

    invoke-virtual {v4}, Lz33/b;->c()Z

    move-result v4

    const/4 v8, 0x1

    if-ne v4, v8, :cond_17

    iget-object v4, v5, Lh53/e;->h:Ljava/lang/Object;

    check-cast v4, Lb30/m;

    invoke-virtual {v6}, Lstream/video/sfu/event/JoinRequest;->getReconnect_details()Lstream/video/sfu/event/ReconnectDetails;

    move-result-object v9

    if-eqz v9, :cond_10

    :goto_5
    move/from16 v25, v8

    goto :goto_6

    :cond_10
    const/4 v8, 0x0

    goto :goto_5

    :goto_6
    iget-object v8, v4, Lb30/m;->E:Ljava/lang/Object;

    check-cast v8, Lso/q;

    iget-object v9, v4, Lb30/m;->F:Ljava/lang/Object;

    check-cast v9, La30/w0;

    iget-object v10, v9, La30/w0;->E:Ljava/lang/Object;

    check-cast v10, Lec3/r1;

    iget-object v10, v10, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v10}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lx23/f;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    if-eqz v10, :cond_11

    const/4 v11, 0x2

    if-eq v10, v11, :cond_11

    goto/16 :goto_7

    :cond_11
    iget-object v10, v4, Lb30/m;->z:Ljava/lang/Object;

    check-cast v10, Lz23/c;

    iget-object v11, v4, Lb30/m;->x:Ljava/lang/Object;

    move-object v14, v11

    check-cast v14, Ljava/lang/String;

    iget-object v4, v4, Lb30/m;->y:Ljava/lang/Object;

    move-object v15, v4

    check-cast v15, Ljava/lang/String;

    iget-object v4, v9, La30/w0;->y:Ljava/lang/Object;

    check-cast v4, Lec3/r1;

    iget-object v4, v4, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v4}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v8, v8, Lso/q;->x:Ljava/lang/Object;

    check-cast v8, Lec3/r1;

    iget-object v11, v8, Lec3/r1;->w:Lec3/f2;

    iget-object v8, v8, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v11}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lw23/h;

    iget-object v11, v11, Lw23/h;->b:Ljava/lang/String;

    if-nez v11, :cond_12

    const-string v11, "unknown"

    :cond_12
    move-object/from16 v33, v11

    invoke-interface {v8}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lw23/h;

    iget-object v11, v11, Lw23/h;->a:Ls93/k;

    if-nez v11, :cond_13

    sget-object v11, Lx23/e;->w:Lx23/e;

    :cond_13
    move-object/from16 v32, v11

    invoke-interface {v8}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lw23/h;

    iget-object v8, v8, Lw23/h;->e:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "sfuId"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "callType"

    invoke-static {v15, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v13, "toString(...)"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    iget-object v13, v10, Lz23/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v17, Lb33/d;->z:Lb33/d;

    move-object/from16 v16, v13

    new-instance v13, Lb33/j;

    const/16 v24, 0x0

    const/16 v26, 0x600

    move-object/from16 v22, v4

    move-object/from16 v23, v8

    move-object/from16 v4, v16

    move-object/from16 v21, v32

    move-object/from16 v20, v33

    move-object/from16 v16, v11

    invoke-direct/range {v13 .. v26}, Lb33/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/d;JLjava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/String;Lb33/i;ZI)V

    move-object/from16 v8, v16

    invoke-virtual {v4, v8, v13}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v10, Lz23/c;->a:La33/d;

    iget-object v10, v10, Lz23/c;->c:Lz23/a;

    sget-object v30, Lb33/g;->x:Lb33/g;

    invoke-static/range {v25 .. v25}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v42

    const/16 v45, 0x0

    const v46, 0x7f4f80

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    move-object/from16 v31, v8

    move-object/from16 v26, v10

    move-object/from16 v27, v14

    move-object/from16 v28, v15

    move-object/from16 v29, v17

    move-object/from16 v40, v22

    move-object/from16 v39, v23

    invoke-static/range {v26 .. v46}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v8

    move-object/from16 v10, v31

    invoke-virtual {v4, v8}, La33/d;->P(Lio/getstream/android/video/generated/models/ClientEvent;)V

    sget-object v4, Lx23/f;->x:Lx23/f;

    iget-object v8, v9, La30/w0;->z:Ljava/lang/Object;

    check-cast v8, Lec3/h2;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8, v12, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v4, v9, La30/w0;->F:Ljava/lang/Object;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v12, v10}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_7
    iget-object v4, v5, Lh53/e;->d:Ljava/lang/Object;

    check-cast v4, Lq/f;

    const-string v8, "#sfu"

    invoke-virtual {v4, v2, v8}, Lq/f;->n0(Lrb3/g;Ljava/lang/String;)Lq/f;

    move-result-object v4

    iget-object v8, v5, Lh53/e;->l:Ljava/lang/Object;

    check-cast v8, Ljava/util/LinkedHashSet;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lx43/k;

    invoke-virtual {v9}, Lx43/k;->e()V

    goto :goto_8

    :cond_14
    invoke-virtual {v5}, Lh53/e;->d()Lb23/k;

    move-result-object v8

    iget-object v9, v8, Lb23/k;->c:Lb23/e;

    iget-object v10, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_15

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v13, "[connectUser] send join request = "

    invoke-direct {v9, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v8, v11, v10, v6, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_15
    new-instance v6, Lv33/x;

    new-instance v13, Lstream/video/sfu/event/SfuRequest;

    iget-object v14, v2, Lx43/c;->e:Lstream/video/sfu/event/JoinRequest;

    const/16 v18, 0xe

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lstream/video/sfu/event/SfuRequest;-><init>(Lstream/video/sfu/event/JoinRequest;Lstream/video/sfu/event/HealthCheckRequest;Lstream/video/sfu/event/LeaveCallRequest;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v6, v13}, Lv33/x;-><init>(Lstream/video/sfu/event/SfuRequest;)V

    invoke-virtual {v4, v6}, Lq/f;->C0(Lio/getstream/android/video/generated/models/VideoEvent;)Z

    iget-object v2, v4, Lq/f;->z:Ljava/lang/Object;

    check-cast v2, Lec3/w1;

    invoke-static {v2}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v2

    new-instance v6, Lh53/d;

    const/4 v8, 0x1

    invoke-direct {v6, v5, v12, v8}, Lh53/d;-><init>(Lh53/e;Lq83/d;I)V

    new-instance v8, Lec3/j1;

    const/4 v9, 0x0

    invoke-direct {v8, v2, v6, v9}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v8, v7}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    move-result-object v2

    iput-object v2, v5, Lh53/e;->o:Ljava/lang/Object;

    iput-object v4, v5, Lh53/e;->i:Ljava/lang/Object;

    :cond_16
    move-object v2, v3

    goto :goto_a

    :cond_17
    if-nez v4, :cond_16

    iget-object v2, v5, Lh53/e;->m:Ljava/lang/Object;

    check-cast v2, Lqg3/d;

    invoke-virtual {v2}, Lqg3/d;->r()Lb23/k;

    move-result-object v4

    iget-object v6, v4, Lb23/k;->c:Lb23/e;

    iget-object v7, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_18

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    const-string v6, "[onNetworkNotAvailable] no args"

    invoke-interface {v4, v8, v7, v6, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_18
    invoke-virtual {v2}, Lqg3/d;->s()Ly43/b;

    move-result-object v2

    sget-object v4, Li53/n;->a:Li53/n;

    invoke-virtual {v2, v4, v0}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_19

    goto :goto_9

    :cond_19
    move-object v2, v3

    :goto_9
    if-ne v2, v1, :cond_16

    :goto_a
    if-ne v2, v1, :cond_1a

    goto/16 :goto_c

    :cond_1a
    :goto_b
    sget-object v1, Lh53/c;->w:Lh53/c;

    invoke-virtual {v5, v1}, Lh53/e;->c(Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_4

    :cond_1b
    instance-of v1, v2, Li53/i;

    if-eqz v1, :cond_b

    check-cast v2, Li53/i;

    instance-of v1, v2, Li53/c;

    const-string v4, "Connection closed to reconnect"

    const/16 v6, 0xfa2

    if-eqz v1, :cond_1d

    iget-object v1, v5, Lh53/e;->i:Ljava/lang/Object;

    check-cast v1, Lq/f;

    if-eqz v1, :cond_1c

    const-string v2, "SfuSocketState.Disconnected.DisconnectedByRequest"

    invoke-virtual {v1, v6, v2, v4}, Lq/f;->l0(ILjava/lang/String;Ljava/lang/String;)Z

    :cond_1c
    invoke-virtual {v8}, Lx43/h;->d()V

    new-instance v1, Lh53/a;

    const/4 v2, 0x1

    invoke-direct {v1, v5, v12, v2}, Lh53/a;-><init>(Lh53/e;Lq83/d;I)V

    invoke-static {v7, v12, v12, v1, v11}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto/16 :goto_4

    :cond_1d
    instance-of v1, v2, Li53/f;

    if-eqz v1, :cond_1f

    iget-object v1, v5, Lh53/e;->i:Ljava/lang/Object;

    check-cast v1, Lq/f;

    if-eqz v1, :cond_1e

    const-string v2, "SfuSocketState.Disconnected.NetworkDisconnected"

    invoke-virtual {v1, v6, v2, v4}, Lq/f;->l0(ILjava/lang/String;Ljava/lang/String;)Z

    :cond_1e
    invoke-virtual {v8}, Lx43/h;->d()V

    goto/16 :goto_4

    :cond_1f
    instance-of v1, v2, Li53/g;

    if-eqz v1, :cond_21

    iget-object v1, v5, Lh53/e;->i:Ljava/lang/Object;

    check-cast v1, Lq/f;

    if-eqz v1, :cond_20

    const-string v2, "SfuSocketState.Disconnected.Stopped"

    invoke-virtual {v1, v10, v2, v9}, Lq/f;->l0(ILjava/lang/String;Ljava/lang/String;)Z

    :cond_20
    invoke-virtual {v8}, Lx43/h;->d()V

    goto/16 :goto_4

    :cond_21
    instance-of v1, v2, Li53/d;

    if-eqz v1, :cond_23

    iget-object v1, v5, Lh53/e;->i:Ljava/lang/Object;

    check-cast v1, Lq/f;

    if-eqz v1, :cond_22

    const-string v2, "SfuSocketState.Disconnected.DisconnectedPermanently"

    invoke-virtual {v1, v10, v2, v9}, Lq/f;->l0(ILjava/lang/String;Ljava/lang/String;)Z

    :cond_22
    invoke-virtual {v8}, Lx43/h;->d()V

    new-instance v1, Lh53/a;

    const/4 v2, 0x2

    invoke-direct {v1, v5, v12, v2}, Lh53/a;-><init>(Lh53/e;Lq83/d;I)V

    invoke-static {v7, v12, v12, v1, v11}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto/16 :goto_4

    :cond_23
    instance-of v1, v2, Li53/e;

    if-eqz v1, :cond_24

    invoke-virtual {v8}, Lx43/h;->d()V

    goto/16 :goto_4

    :cond_24
    instance-of v1, v2, Li53/h;

    if-eqz v1, :cond_b

    iget-object v1, v5, Lh53/e;->i:Ljava/lang/Object;

    check-cast v1, Lq/f;

    if-eqz v1, :cond_25

    const-string v2, "SfuSocketState.Disconnected.WebSocketEventLost"

    invoke-virtual {v1, v6, v2, v4}, Lq/f;->l0(ILjava/lang/String;Ljava/lang/String;)Z

    :cond_25
    invoke-virtual {v8}, Lx43/h;->d()V

    goto/16 :goto_4

    :goto_c
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
