.class public final Lt23/z0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:Ljava/lang/Throwable;

.field public x:I

.field public final synthetic y:Lt23/e1;


# direct methods
.method public constructor <init>(Lt23/e1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lt23/z0;->y:Lt23/e1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1

    new-instance p1, Lt23/z0;

    iget-object v0, p0, Lt23/z0;->y:Lt23/e1;

    invoke-direct {p1, v0, p2}, Lt23/z0;-><init>(Lt23/e1;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt23/z0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/z0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/z0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    iget-object v2, v1, Lt23/z0;->y:Lt23/e1;

    iget-object v0, v2, Lt23/e1;->p:Lec3/h2;

    const-string v3, "[flip] isFront: "

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v1, Lt23/z0;->x:I

    const-string v6, "[flip] finally, wait to settle"

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const-wide/16 v11, 0x1f4

    const/4 v13, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v10, :cond_2

    if-eq v5, v9, :cond_1

    if-eq v5, v8, :cond_1

    if-eq v5, v7, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, v1, Lt23/z0;->w:Ljava/lang/Throwable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_d

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_2
    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v5, p1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lt23/e1;->g()Lb23/k;

    move-result-object v5

    iget-object v14, v5, Lb23/k;->c:Lb23/e;

    iget-object v15, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v14, v7, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_4

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    const-string v14, "[flip] launched"

    invoke-interface {v5, v7, v15, v14, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :try_start_1
    iput v10, v1, Lt23/z0;->x:I

    invoke-static {v2, v1}, Lt23/e1;->a(Lt23/e1;Lt23/z0;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_5

    goto/16 :goto_c

    :cond_5
    :goto_0
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v2}, Lt23/e1;->g()Lb23/k;

    move-result-object v7

    iget-object v10, v7, Lb23/k;->c:Lb23/e;

    iget-object v14, v7, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->x:Lb23/g;

    invoke-interface {v10, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_6

    iget-object v7, v7, Lb23/k;->b:Lb23/j;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v7, v15, v14, v3, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    if-eqz v5, :cond_7

    sget-object v3, Lt23/x0;->a:Lt23/x0;

    goto :goto_1

    :cond_7
    sget-object v3, Lt23/w0;->a:Lt23/w0;

    :goto_1
    iget-object v5, v2, Lt23/e1;->m:Lec3/h2;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v13, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v5, v2, Lt23/e1;->d:Ljava/util/List;

    if-eqz v5, :cond_12

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Lt23/v0;

    iget-object v10, v10, Lt23/v0;->e:Lt23/y0;

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_2

    :cond_9
    move-object v7, v13

    :goto_2
    check-cast v7, Lt23/v0;

    iget-object v3, v2, Lt23/e1;->n:Lec3/h2;

    invoke-virtual {v3, v7}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v3, v2, Lt23/e1;->r:Lec3/h2;

    if-eqz v7, :cond_a

    iget-object v5, v7, Lt23/v0;->c:Ljava/util/List;

    if-eqz v5, :cond_a

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    goto :goto_3

    :cond_a
    move-object v5, v13

    :goto_3
    if-nez v5, :cond_b

    sget-object v5, Lm83/y;->w:Lm83/y;

    :cond_b
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v13, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v7, :cond_c

    iget-object v3, v7, Lt23/v0;->c:Ljava/util/List;

    goto :goto_4

    :cond_c
    move-object v3, v13

    :goto_4
    iget-object v5, v2, Lt23/e1;->a:Lt23/x1;

    iget-object v5, v5, Lt23/x1;->b:Lt23/c0;

    iget-object v5, v5, Lt23/c0;->p:Lt23/s0;

    iget-object v5, v5, Lt23/s0;->J:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/android/video/generated/models/CallSettingsResponse;

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getVideo()Lio/getstream/android/video/generated/models/VideoSettingsResponse;

    move-result-object v5

    goto :goto_5

    :cond_d
    move-object v5, v13

    :goto_5
    invoke-virtual {v2, v3, v5}, Lt23/e1;->i(Ljava/util/List;Lio/getstream/android/video/generated/models/VideoSettingsResponse;)Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    move-result-object v3

    invoke-virtual {v0, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_f

    iget-object v3, v2, Lt23/e1;->f:Lorg/webrtc/Camera2Capturer;

    if-eqz v3, :cond_e

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v5, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget v5, v5, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v7, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget v7, v7, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget-object v0, v0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->framerate:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    iget v0, v0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    invoke-virtual {v3, v5, v7, v0}, Lorg/webrtc/Camera2Capturer;->changeCaptureFormat(III)V

    goto :goto_6

    :cond_e
    const-string v0, "videoCapturer"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_f
    :goto_6
    invoke-virtual {v2}, Lt23/e1;->g()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_10

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-interface {v0, v7, v5, v6, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    iput v9, v1, Lt23/z0;->x:I

    invoke-static {v11, v12, v1}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_11

    goto :goto_c

    :cond_11
    :goto_7
    iput-object v13, v2, Lt23/e1;->t:Lbc3/c2;

    goto :goto_a

    :cond_12
    :try_start_2
    const-string v0, "devices"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_8
    :try_start_3
    invoke-virtual {v2}, Lt23/e1;->g()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->F:Lb23/g;

    iget-object v9, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v7, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_13

    iget-object v5, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    const-string v9, "[flip] failed"

    invoke-interface {v5, v7, v3, v9, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v0

    goto :goto_b

    :cond_13
    :goto_9
    invoke-virtual {v2}, Lt23/e1;->g()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_14

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-interface {v0, v7, v5, v6, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_14
    iput v8, v1, Lt23/z0;->x:I

    invoke-static {v11, v12, v1}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_11

    goto :goto_c

    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_b
    invoke-virtual {v2}, Lt23/e1;->g()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v7, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->x:Lb23/g;

    invoke-interface {v5, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_15

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-interface {v3, v8, v7, v6, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_15
    iput-object v0, v1, Lt23/z0;->w:Ljava/lang/Throwable;

    const/4 v3, 0x4

    iput v3, v1, Lt23/z0;->x:I

    invoke-static {v11, v12, v1}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_16

    :goto_c
    return-object v4

    :cond_16
    :goto_d
    iput-object v13, v2, Lt23/e1;->t:Lbc3/c2;

    throw v0
.end method
