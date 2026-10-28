.class public final Ld33/f0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ld33/h1;

.field public final synthetic F:Lbc3/c0;

.field public w:Ld33/h1;

.field public x:Ljava/util/Iterator;

.field public y:I

.field public final synthetic z:Lio/getstream/android/video/generated/models/VideoEvent;


# direct methods
.method public constructor <init>(Lio/getstream/android/video/generated/models/VideoEvent;Ld33/h1;Lbc3/c0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ld33/f0;->z:Lio/getstream/android/video/generated/models/VideoEvent;

    iput-object p2, p0, Ld33/f0;->E:Ld33/h1;

    iput-object p3, p0, Ld33/f0;->F:Lbc3/c0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4

    new-instance v0, Ld33/f0;

    iget-object v1, p0, Ld33/f0;->E:Ld33/h1;

    iget-object v2, p0, Ld33/f0;->F:Lbc3/c0;

    iget-object v3, p0, Ld33/f0;->z:Lio/getstream/android/video/generated/models/VideoEvent;

    invoke-direct {v0, v3, v1, v2, p1}, Ld33/f0;-><init>(Lio/getstream/android/video/generated/models/VideoEvent;Ld33/h1;Lbc3/c0;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Ld33/f0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/f0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld33/f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    move-object/from16 v0, p0

    iget-object v1, v0, Ld33/f0;->E:Ld33/h1;

    iget-object v2, v1, Ld33/h1;->z:Lec3/h2;

    iget-object v3, v1, Ld33/h1;->P:Ljava/util/List;

    iget-object v8, v1, Ld33/h1;->A:Lec3/h2;

    iget-object v9, v1, Ld33/h1;->b:Lt23/c0;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v4, v0, Ld33/f0;->y:I

    sget-object v11, Ll83/a0;->a:Ll83/a0;

    const/4 v12, 0x0

    const/4 v7, 0x0

    iget-object v13, v0, Ld33/f0;->z:Lio/getstream/android/video/generated/models/VideoEvent;

    packed-switch v4, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v11

    :pswitch_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ll83/n;

    iget-object v1, v1, Ll83/n;->w:Ljava/lang/Object;

    return-object v11

    :pswitch_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v11

    :pswitch_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v11

    :pswitch_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_17

    :pswitch_5
    iget-object v1, v0, Ld33/f0;->x:Ljava/util/Iterator;

    iget-object v2, v0, Ld33/f0;->w:Ld33/h1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_16

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v11

    :pswitch_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v4, v13, Lv33/y;

    if-eqz v4, :cond_0

    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v4

    iget-object v14, v4, Lb23/k;->c:Lb23/e;

    iget-object v15, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v14, v5, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    const-string v14, "[onRtcEvent] event: SubscriberOfferEvent"

    invoke-interface {v4, v5, v15, v14, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    iget-object v14, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->x:Lb23/g;

    invoke-interface {v5, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[onRtcEvent] event: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v15, v14, v5, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    move-object v4, v13

    check-cast v4, Lv33/w;

    instance-of v5, v4, Lv33/n;

    const/4 v6, 0x4

    if-eqz v5, :cond_8

    move-object v2, v13

    check-cast v2, Lv33/n;

    iget-object v2, v2, Lv33/n;->a:Lstream/video/sfu/models/CallState;

    invoke-virtual {v2}, Lstream/video/sfu/models/CallState;->getParticipants()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lstream/video/sfu/models/Participant;

    iget-object v5, v9, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v5, v4}, Lt23/s0;->e(Lstream/video/sfu/models/Participant;)Lt23/g2;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object v2, v9, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v2, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lt23/g2;

    iget-object v9, v8, Lt23/g2;->a:Ljava/lang/String;

    invoke-virtual {v4, v9, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object v5, v2, Lt23/s0;->j:Lec3/h2;

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8, v4}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v7, v8}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lt23/g2;

    iget-object v9, v8, Lt23/g2;->s:Lec3/h2;

    invoke-virtual {v9}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    iget-object v2, v2, Lt23/s0;->y:Lec3/h2;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_6

    new-instance v5, Lc43/t;

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt23/g2;

    invoke-direct {v5, v4}, Lc43/t;-><init>(Lt23/g2;)V

    goto :goto_4

    :cond_6
    move-object v5, v7

    :goto_4
    invoke-virtual {v2, v5}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt23/g2;

    iget-object v3, v3, Lt23/g2;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Ld33/h1;->d(Ld33/h1;Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v1}, Ld33/h1;->t()Ly33/e;

    move-result-object v2

    iget-object v2, v2, Ly33/e;->e:Lh53/f;

    new-instance v3, Ld30/o;

    invoke-direct {v3, v1, v13, v7, v6}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v3}, Lx43/i;->a(Lx43/i;Lc93/m;)V

    return-object v11

    :cond_8
    instance-of v5, v4, Lv33/d;

    if-eqz v5, :cond_b

    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v10, "[changePublishOptions] ChangePublishOptionsEvent: "

    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, ", publisher: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v5, v4, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le33/n;

    if-eqz v1, :cond_a

    invoke-virtual {v9}, Lt23/c0;->h()Lt23/x1;

    move-result-object v2

    iget-object v2, v2, Lt23/x1;->e:Lt23/e1;

    iget-object v2, v2, Lt23/e1;->q:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    check-cast v13, Lv33/d;

    iget-object v3, v13, Lv33/d;->a:Lstream/video/sfu/event/ChangePublishOptions;

    invoke-virtual {v3}, Lstream/video/sfu/event/ChangePublishOptions;->getPublish_options()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Le33/n;->y(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ljava/util/List;)V

    return-object v11

    :cond_a
    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v11

    :cond_b
    instance-of v5, v4, Lv33/y;

    if-eqz v5, :cond_c

    check-cast v13, Lv33/y;

    const/4 v2, 0x1

    iput v2, v0, Ld33/f0;->y:I

    invoke-virtual {v1, v13, v0}, Ld33/h1;->v(Lv33/y;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_41

    goto/16 :goto_1a

    :cond_c
    instance-of v5, v4, Lv33/e;

    if-eqz v5, :cond_31

    check-cast v13, Lv33/e;

    iget-object v2, v13, Lv33/e;->a:Lstream/video/sfu/event/ChangePublishQuality;

    invoke-virtual {v2}, Lstream/video/sfu/event/ChangePublishQuality;->getVideo_senders()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object/from16 v34, v2

    move-object v2, v1

    move-object/from16 v1, v34

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_41

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lstream/video/sfu/event/VideoSender;

    iget-object v4, v2, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le33/n;

    if-eqz v4, :cond_30

    iput-object v2, v0, Ld33/f0;->w:Ld33/h1;

    iput-object v1, v0, Ld33/f0;->x:Ljava/util/Iterator;

    const/4 v5, 0x2

    iput v5, v0, Ld33/f0;->y:I

    invoke-virtual {v3}, Lstream/video/sfu/event/VideoSender;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v5

    invoke-virtual {v3}, Lstream/video/sfu/event/VideoSender;->getLayers()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v3}, Lstream/video/sfu/event/VideoSender;->getPublish_option_id()I

    move-result v8

    check-cast v6, Ljava/util/List;

    check-cast v6, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_d
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lstream/video/sfu/event/VideoLayerSetting;

    invoke-virtual {v14}, Lstream/video/sfu/event/VideoLayerSetting;->getActive()Z

    move-result v14

    if-eqz v14, :cond_d

    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_e
    invoke-virtual {v4}, Le33/u;->f()Lb23/k;

    move-result-object v6

    iget-object v13, v6, Lb23/k;->c:Lb23/e;

    iget-object v14, v6, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->z:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_10

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    invoke-virtual {v3}, Lstream/video/sfu/event/VideoSender;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v13

    if-eqz v13, :cond_f

    invoke-virtual {v13}, Lstream/video/sfu/models/Codec;->getName()Ljava/lang/String;

    move-result-object v13

    goto :goto_8

    :cond_f
    move-object v13, v7

    :goto_8
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v7, "Update publish quality ("

    invoke-direct {v12, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "-"

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "), requested layers by SFU: "

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-interface {v6, v15, v14, v5, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    iget-object v5, v4, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    new-instance v19, Lstream/video/sfu/models/PublishOption;

    invoke-virtual {v3}, Lstream/video/sfu/event/VideoSender;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v20

    invoke-virtual {v3}, Lstream/video/sfu/event/VideoSender;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v21

    iget v6, v4, Le33/n;->A:I

    new-instance v22, Lstream/video/sfu/models/VideoDimension;

    const/16 v26, 0x4

    const/16 v27, 0x0

    const/16 v23, 0x780

    const/16 v24, 0x438

    const/16 v25, 0x0

    invoke-direct/range {v22 .. v27}, Lstream/video/sfu/models/VideoDimension;-><init>(IILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lstream/video/sfu/event/VideoSender;->getPublish_option_id()I

    move-result v27

    const/16 v32, 0xf00

    const/16 v33, 0x0

    const/16 v23, 0x1e

    const/16 v24, 0x3

    const/16 v25, 0x3

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v26, v22

    move/from16 v22, v6

    invoke-direct/range {v19 .. v33}, Lstream/video/sfu/models/PublishOption;-><init>(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v19

    invoke-virtual {v5, v6}, Lio/sentry/internal/debugmeta/c;->r(Lstream/video/sfu/models/PublishOption;)Lorg/webrtc/RtpTransceiver;

    move-result-object v5

    if-eqz v5, :cond_11

    invoke-virtual {v5}, Lorg/webrtc/RtpTransceiver;->getSender()Lorg/webrtc/RtpSender;

    move-result-object v5

    if-eqz v5, :cond_11

    invoke-virtual {v5}, Lorg/webrtc/RtpSender;->track()Lorg/webrtc/MediaStreamTrack;

    move-result-object v6

    if-eqz v6, :cond_12

    invoke-virtual {v6}, Lorg/webrtc/MediaStreamTrack;->isDisposed()Z

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_12

    :cond_11
    const/4 v5, 0x0

    :cond_12
    if-nez v5, :cond_14

    invoke-virtual {v4}, Le33/u;->f()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_13

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v4, "Update publish quality, no video sender found."

    const/4 v7, 0x0

    invoke-interface {v3, v6, v5, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_13
    :goto_9
    move-object/from16 p1, v1

    move-object/from16 v19, v2

    goto/16 :goto_15

    :cond_14
    invoke-virtual {v5}, Lorg/webrtc/RtpSender;->getParameters()Lorg/webrtc/RtpParameters;

    move-result-object v6

    iget-object v7, v6, Lorg/webrtc/RtpParameters;->encodings:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-virtual {v4}, Le33/u;->f()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_13

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v4, "Update publish quality, No suitable video encoding quality found"

    const/4 v7, 0x0

    invoke-interface {v3, v6, v5, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_9

    :cond_15
    iget-object v7, v6, Lorg/webrtc/RtpParameters;->codecs:Ljava/util/List;

    const-string v8, "codecs"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/webrtc/RtpParameters$Codec;

    if-eqz v7, :cond_16

    iget-object v7, v7, Lorg/webrtc/RtpParameters$Codec;->name:Ljava/lang/String;

    invoke-static {v7}, Lj33/d;->c(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_16

    const/4 v7, 0x1

    goto :goto_a

    :cond_16
    const/4 v7, 0x0

    :goto_a
    iget-object v8, v6, Lorg/webrtc/RtpParameters;->encodings:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v12, 0x0

    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_26

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lorg/webrtc/RtpParameters$Encoding;

    if-eqz v7, :cond_18

    invoke-static {v9}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lstream/video/sfu/event/VideoLayerSetting;

    move-object/from16 p1, v1

    move-object/from16 v19, v2

    move-object v1, v14

    :cond_17
    const/4 v2, 0x1

    goto :goto_e

    :cond_18
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_c
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1a

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v19, v15

    check-cast v19, Lstream/video/sfu/event/VideoLayerSetting;

    move-object/from16 p1, v1

    invoke-virtual/range {v19 .. v19}, Lstream/video/sfu/event/VideoLayerSetting;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v19, v2

    iget-object v2, v13, Lorg/webrtc/RtpParameters$Encoding;->rid:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    goto :goto_d

    :cond_19
    move-object/from16 v1, p1

    move-object/from16 v2, v19

    goto :goto_c

    :cond_1a
    move-object/from16 p1, v1

    move-object/from16 v19, v2

    const/4 v15, 0x0

    :goto_d
    move-object v1, v15

    check-cast v1, Lstream/video/sfu/event/VideoLayerSetting;

    if-nez v1, :cond_17

    iget-object v1, v6, Lorg/webrtc/RtpParameters;->encodings:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1b

    invoke-static {v9}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lstream/video/sfu/event/VideoLayerSetting;

    goto :goto_e

    :cond_1b
    const/4 v1, 0x0

    :goto_e
    if-eqz v1, :cond_1c

    invoke-virtual {v1}, Lstream/video/sfu/event/VideoLayerSetting;->getActive()Z

    move-result v14

    if-ne v14, v2, :cond_1c

    const/4 v2, 0x1

    goto :goto_f

    :cond_1c
    const/4 v2, 0x0

    :goto_f
    iget-boolean v14, v13, Lorg/webrtc/RtpParameters$Encoding;->active:Z

    if-eq v2, v14, :cond_1d

    iput-boolean v2, v13, Lorg/webrtc/RtpParameters$Encoding;->active:Z

    const/4 v12, 0x1

    :cond_1d
    if-eqz v1, :cond_25

    invoke-virtual {v1}, Lstream/video/sfu/event/VideoLayerSetting;->getMax_framerate()I

    move-result v2

    invoke-virtual {v1}, Lstream/video/sfu/event/VideoLayerSetting;->getScale_resolution_down_by()F

    move-result v14

    float-to-double v14, v14

    move-object/from16 v20, v1

    invoke-virtual/range {v20 .. v20}, Lstream/video/sfu/event/VideoLayerSetting;->getMax_bitrate()I

    move-result v1

    move-object/from16 v21, v3

    invoke-virtual/range {v20 .. v20}, Lstream/video/sfu/event/VideoLayerSetting;->getScalability_mode()Ljava/lang/String;

    move-result-object v3

    const-wide/high16 v22, 0x3ff0000000000000L    # 1.0

    cmpl-double v20, v14, v22

    if-ltz v20, :cond_1f

    move-object/from16 v20, v4

    iget-object v4, v13, Lorg/webrtc/RtpParameters$Encoding;->scaleResolutionDownBy:Ljava/lang/Double;

    if-eqz v4, :cond_1e

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v22

    cmpl-double v4, v14, v22

    if-nez v4, :cond_1e

    goto :goto_10

    :cond_1e
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    iput-object v4, v13, Lorg/webrtc/RtpParameters$Encoding;->scaleResolutionDownBy:Ljava/lang/Double;

    const/4 v12, 0x1

    goto :goto_10

    :cond_1f
    move-object/from16 v20, v4

    :goto_10
    if-lez v1, :cond_21

    iget-object v4, v13, Lorg/webrtc/RtpParameters$Encoding;->maxBitrateBps:Ljava/lang/Integer;

    if-nez v4, :cond_20

    goto :goto_11

    :cond_20
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v1, v4, :cond_21

    :goto_11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v13, Lorg/webrtc/RtpParameters$Encoding;->maxBitrateBps:Ljava/lang/Integer;

    const/4 v12, 0x1

    :cond_21
    if-lez v2, :cond_23

    iget-object v1, v13, Lorg/webrtc/RtpParameters$Encoding;->maxFramerate:Ljava/lang/Integer;

    if-nez v1, :cond_22

    goto :goto_12

    :cond_22
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v2, v1, :cond_23

    :goto_12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v13, Lorg/webrtc/RtpParameters$Encoding;->maxFramerate:Ljava/lang/Integer;

    const/4 v12, 0x1

    :cond_23
    iget-object v1, v13, Lorg/webrtc/RtpParameters$Encoding;->scalabilityMode:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    iput-object v3, v13, Lorg/webrtc/RtpParameters$Encoding;->scalabilityMode:Ljava/lang/String;

    move-object/from16 v1, p1

    move-object/from16 v2, v19

    move-object/from16 v4, v20

    move-object/from16 v3, v21

    const/4 v12, 0x1

    goto/16 :goto_b

    :cond_24
    move-object/from16 v1, p1

    move-object/from16 v2, v19

    move-object/from16 v4, v20

    move-object/from16 v3, v21

    goto/16 :goto_b

    :cond_25
    move-object/from16 v1, p1

    move-object/from16 v2, v19

    goto/16 :goto_b

    :cond_26
    move-object/from16 p1, v1

    move-object/from16 v19, v2

    move-object/from16 v21, v3

    move-object/from16 v20, v4

    invoke-virtual/range {v21 .. v21}, Lstream/video/sfu/event/VideoSender;->getDegradation_preference()Lstream/video/sfu/models/DegradationPreference;

    move-result-object v1

    invoke-static {v1}, Lj33/b;->a(Lstream/video/sfu/models/DegradationPreference;)Lorg/webrtc/RtpParameters$DegradationPreference;

    move-result-object v1

    if-eqz v1, :cond_28

    iget-object v2, v6, Lorg/webrtc/RtpParameters;->degradationPreference:Lorg/webrtc/RtpParameters$DegradationPreference;

    if-eq v2, v1, :cond_28

    iput-object v1, v6, Lorg/webrtc/RtpParameters;->degradationPreference:Lorg/webrtc/RtpParameters$DegradationPreference;

    invoke-virtual/range {v20 .. v20}, Le33/u;->f()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v7, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_27

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "Update publish quality, applying degradationPreference="

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-interface {v2, v7, v4, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_27
    const/4 v12, 0x1

    :cond_28
    iget-object v1, v6, Lorg/webrtc/RtpParameters;->encodings:Ljava/util/List;

    const-string v2, "encodings"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_29
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lorg/webrtc/RtpParameters$Encoding;

    iget-boolean v4, v4, Lorg/webrtc/RtpParameters$Encoding;->active:Z

    if-eqz v4, :cond_29

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_2a
    if-nez v12, :cond_2b

    invoke-virtual/range {v20 .. v20}, Le33/u;->f()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2e

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Update publish quality, no change: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    invoke-interface {v1, v5, v4, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_15

    :cond_2b
    invoke-virtual {v5, v6}, Lorg/webrtc/RtpSender;->setParameters(Lorg/webrtc/RtpParameters;)Z

    invoke-virtual/range {v20 .. v20}, Le33/u;->f()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2c

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Update publish quality, enabled rids: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    invoke-interface {v1, v5, v4, v3, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2c
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2d
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/RtpParameters$Encoding;

    invoke-virtual/range {v20 .. v20}, Le33/u;->f()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->z:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2d

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lorg/webrtc/RtpParameters$Encoding;->rid:Ljava/lang/String;

    const-string v4, "Update publish quality, enabled rid: "

    invoke-static {v4, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    invoke-interface {v3, v6, v5, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_14

    :cond_2e
    :goto_15
    if-ne v11, v10, :cond_2f

    goto/16 :goto_1a

    :cond_2f
    move-object/from16 v1, p1

    move-object/from16 v2, v19

    goto :goto_16

    :cond_30
    move-object/from16 p1, v1

    move-object/from16 v19, v2

    :goto_16
    const/4 v7, 0x0

    const/4 v12, 0x0

    goto/16 :goto_6

    :cond_31
    instance-of v5, v4, Lv33/z;

    if-eqz v5, :cond_35

    move-object v12, v13

    check-cast v12, Lv33/z;

    iget-object v2, v12, Lv33/z;->d:Lstream/video/sfu/models/Participant;

    if-eqz v2, :cond_33

    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_32

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    iget-object v3, v12, Lv33/z;->b:Ljava/lang/String;

    const-string v6, "[TrackPublishedEvent] #orphaned-track; Participant info included, creating/updating participant for sessionId="

    invoke-static {v6, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    invoke-interface {v2, v5, v4, v3, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_32
    iget-object v2, v9, Lt23/c0;->p:Lt23/s0;

    iget-object v3, v12, Lv33/z;->d:Lstream/video/sfu/models/Participant;

    invoke-virtual {v2, v3}, Lt23/s0;->e(Lstream/video/sfu/models/Participant;)Lt23/g2;

    iget-object v2, v12, Lv33/z;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Ld33/h1;->d(Ld33/h1;Ljava/lang/String;)V

    :cond_33
    iget-object v2, v12, Lv33/z;->a:Ljava/lang/String;

    iget-object v3, v12, Lv33/z;->b:Ljava/lang/String;

    iget-object v4, v12, Lv33/z;->c:Lstream/video/sfu/models/TrackType;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v5, 0x1

    invoke-virtual/range {v1 .. v7}, Ld33/h1;->K(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;ZZZ)V

    iget-object v2, v12, Lv33/z;->c:Lstream/video/sfu/models/TrackType;

    sget-object v3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    if-ne v2, v3, :cond_34

    iget-object v2, v12, Lv33/z;->b:Ljava/lang/String;

    iget-object v3, v1, Ld33/h1;->c:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_34

    invoke-virtual {v9}, Lt23/c0;->h()Lt23/x1;

    move-result-object v2

    iget-object v2, v2, Lt23/x1;->f:Lt23/a2;

    iget-object v2, v2, Lt23/a2;->l:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lkotlin/jvm/internal/m;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_34

    iget-object v2, v12, Lv33/z;->c:Lstream/video/sfu/models/TrackType;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ld33/h1;->F(ZLstream/video/sfu/models/TrackType;)V

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le33/n;

    if-eqz v2, :cond_34

    iget-object v3, v12, Lv33/z;->c:Lstream/video/sfu/models/TrackType;

    const/4 v4, 0x3

    iput v4, v0, Ld33/f0;->y:I

    invoke-virtual {v2, v3}, Le33/n;->A(Lstream/video/sfu/models/TrackType;)V

    if-ne v11, v10, :cond_34

    goto/16 :goto_1a

    :cond_34
    :goto_17
    check-cast v13, Lv33/z;

    iget-object v2, v13, Lv33/z;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Ld33/h1;->d(Ld33/h1;Ljava/lang/String;)V

    return-object v11

    :cond_35
    instance-of v5, v4, Lv33/l;

    if-eqz v5, :cond_36

    check-cast v13, Lv33/l;

    iget-object v2, v13, Lv33/l;->a:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_18
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_41

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv33/m;

    iget-object v3, v2, Lv33/m;->a:Ljava/lang/String;

    move-object v4, v3

    iget-object v3, v2, Lv33/m;->b:Ljava/lang/String;

    move-object v5, v4

    iget-object v4, v2, Lv33/m;->c:Lstream/video/sfu/models/TrackType;

    const/4 v6, 0x1

    iget-boolean v7, v2, Lv33/m;->d:Z

    move-object v2, v5

    const/4 v5, 0x1

    invoke-virtual/range {v1 .. v7}, Ld33/h1;->K(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;ZZZ)V

    goto :goto_18

    :cond_36
    instance-of v5, v4, Lv33/a0;

    if-eqz v5, :cond_37

    check-cast v13, Lv33/a0;

    iget-object v2, v13, Lv33/a0;->a:Ljava/lang/String;

    iget-object v3, v13, Lv33/a0;->b:Ljava/lang/String;

    iget-object v4, v13, Lv33/a0;->c:Lstream/video/sfu/models/TrackType;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v1 .. v7}, Ld33/h1;->K(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;ZZZ)V

    return-object v11

    :cond_37
    instance-of v5, v4, Lv33/p;

    if-eqz v5, :cond_38

    check-cast v13, Lv33/p;

    iget-object v2, v13, Lv33/p;->a:Lstream/video/sfu/models/Participant;

    invoke-virtual {v2}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ld33/h1;->d(Ld33/h1;Ljava/lang/String;)V

    return-object v11

    :cond_38
    instance-of v5, v4, Lv33/q;

    if-eqz v5, :cond_3b

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le33/v0;

    if-eqz v3, :cond_39

    check-cast v13, Lv33/q;

    iget-object v4, v13, Lv33/q;->a:Lstream/video/sfu/models/Participant;

    const-string v5, "participant"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v3, Le33/v0;->J:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v3, Le33/v0;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    const-string v4, "<get-keys>(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Le33/e;

    const/4 v5, 0x2

    const/4 v7, 0x1

    invoke-direct {v4, v7, v5}, Le33/e;-><init>(II)V

    invoke-static {v3, v4, v7}, Lm83/s;->C0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Z)Z

    :cond_39
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Le33/v0;

    if-eqz v13, :cond_41

    iget-object v1, v1, Ld33/h1;->x:Lbi/p;

    iget-object v2, v9, Lt23/c0;->p:Lt23/s0;

    iget-object v2, v2, Lt23/s0;->v:Lj53/m;

    iget-object v2, v2, Lj53/m;->j:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/util/List;

    iget-object v2, v9, Lt23/c0;->p:Lt23/s0;

    iget-object v2, v2, Lt23/s0;->o:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Ljava/util/List;

    iput v6, v0, Ld33/f0;->y:I

    sget-object v2, Le33/v0;->Q:Lstream/video/sfu/models/VideoDimension;

    new-instance v12, Le33/t0;

    const/16 v18, 0x0

    const/4 v14, 0x0

    move-object/from16 v17, v1

    invoke-direct/range {v12 .. v18}, Le33/t0;-><init>(Le33/v0;ZLjava/util/List;Ljava/util/List;Lbi/p;Lq83/d;)V

    invoke-static {v12, v0}, Lvd/e;->X(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_3a

    goto :goto_19

    :cond_3a
    move-object v1, v11

    :goto_19
    if-ne v1, v10, :cond_41

    goto :goto_1a

    :cond_3b
    instance-of v2, v4, Lv33/k;

    if-eqz v2, :cond_3c

    check-cast v13, Lv33/k;

    const/4 v2, 0x5

    iput v2, v0, Ld33/f0;->y:I

    invoke-virtual {v1, v13, v0}, Ld33/h1;->u(Lv33/k;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_41

    goto :goto_1a

    :cond_3c
    instance-of v2, v4, Lv33/j;

    if-eqz v2, :cond_40

    move-object v2, v13

    check-cast v2, Lv33/j;

    iget-object v2, v2, Lv33/j;->a:Lstream/video/sfu/models/PeerType;

    sget-object v4, Ld33/e0;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    const/4 v7, 0x1

    if-eq v2, v7, :cond_3e

    const/4 v5, 0x2

    if-eq v2, v5, :cond_3d

    goto :goto_1b

    :cond_3d
    const/4 v2, 0x7

    iput v2, v0, Ld33/f0;->y:I

    invoke-virtual {v1, v0}, Ld33/h1;->y(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_41

    goto :goto_1a

    :cond_3e
    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le33/n;

    if-eqz v1, :cond_3f

    const/4 v2, 0x6

    iput v2, v0, Ld33/f0;->y:I

    const-string v2, "ICERestartEvent, peerType: PeerType.PEER_TYPE_PUBLISHER_UNSPECIFIED"

    invoke-virtual {v1, v2, v0}, Le33/n;->w(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_41

    :goto_1a
    return-object v10

    :cond_3f
    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v11

    :cond_40
    invoke-virtual {v1}, Ld33/h1;->s()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_41

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[onRtcEvent] skipped event: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    invoke-interface {v1, v4, v3, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_41
    :goto_1b
    return-object v11

    nop

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
