.class public final Lb4/i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public y:J

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p5, p0, Lb4/i;->w:I

    iput-wide p1, p0, Lb4/i;->y:J

    iput-object p3, p0, Lb4/i;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLq83/d;I)V
    .locals 0

    .line 2
    iput p5, p0, Lb4/i;->w:I

    iput-object p1, p0, Lb4/i;->z:Ljava/lang/Object;

    iput-wide p2, p0, Lb4/i;->y:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lt23/b4;Lq83/d;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lb4/i;->w:I

    .line 3
    iput-object p1, p0, Lb4/i;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    iget p1, p0, Lb4/i;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lb4/i;

    iget-wide v1, p0, Lb4/i;->y:J

    iget-object p1, p0, Lb4/i;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lu2/g0;

    const/4 v5, 0x6

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lb4/i;-><init>(JLjava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_0
    move-object v5, p2

    new-instance p1, Lb4/i;

    iget-object p2, p0, Lb4/i;->z:Ljava/lang/Object;

    check-cast p2, Lt23/b4;

    invoke-direct {p1, p2, v5}, Lb4/i;-><init>(Lt23/b4;Lq83/d;)V

    return-object p1

    :pswitch_1
    move-object v5, p2

    new-instance v1, Lb4/i;

    iget-object p1, p0, Lb4/i;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ls23/d;

    iget-wide v3, p0, Lb4/i;->y:J

    const/4 v6, 0x4

    invoke-direct/range {v1 .. v6}, Lb4/i;-><init>(Ljava/lang/Object;JLq83/d;I)V

    return-object v1

    :pswitch_2
    move-object v5, p2

    new-instance v1, Lb4/i;

    iget-wide v2, p0, Lb4/i;->y:J

    iget-object p1, p0, Lb4/i;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lt23/n0;

    const/4 v6, 0x3

    invoke-direct/range {v1 .. v6}, Lb4/i;-><init>(JLjava/lang/Object;Lq83/d;I)V

    return-object v1

    :pswitch_3
    move-object v5, p2

    new-instance v1, Lb4/i;

    iget-object p1, p0, Lb4/i;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lh0/k;

    iget-wide v3, p0, Lb4/i;->y:J

    const/4 v6, 0x2

    invoke-direct/range {v1 .. v6}, Lb4/i;-><init>(Ljava/lang/Object;JLq83/d;I)V

    return-object v1

    :pswitch_4
    move-object v5, p2

    new-instance v1, Lb4/i;

    iget-object p1, p0, Lb4/i;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ld0/e;

    iget-wide v3, p0, Lb4/i;->y:J

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Lb4/i;-><init>(Ljava/lang/Object;JLq83/d;I)V

    return-object v1

    :pswitch_5
    move-object v5, p2

    new-instance v1, Lb4/i;

    iget-object p1, p0, Lb4/i;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lb4/l;

    iget-wide v3, p0, Lb4/i;->y:J

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lb4/i;-><init>(Ljava/lang/Object;JLq83/d;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, Lb4/i;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lb4/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb4/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb4/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lb4/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb4/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb4/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lb4/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb4/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb4/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lb4/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb4/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb4/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lb4/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb4/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb4/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lb4/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb4/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb4/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0, p1, p2}, Lb4/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb4/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb4/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lb4/i;->w:I

    const/4 v1, 0x2

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Lb4/i;->z:Ljava/lang/Object;

    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    iget-wide v6, p0, Lb4/i;->y:J

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v8, p0, Lb4/i;->x:I

    const-wide/16 v9, 0x8

    if-eqz v8, :cond_2

    if-eq v8, v5, :cond_1

    if-ne v8, v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sub-long v11, v6, v9

    iput v5, p0, Lb4/i;->x:I

    invoke-static {v11, v12, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iput v1, p0, Lb4/i;->x:I

    invoke-static {v9, v10, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    move-object v2, v0

    goto :goto_3

    :cond_4
    :goto_2
    check-cast v3, Lu2/g0;

    iget-object p1, v3, Lu2/g0;->y:Lbc3/m;

    if-eqz p1, :cond_5

    new-instance v0, Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;

    invoke-direct {v0, v6, v7}, Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;-><init>(J)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_5
    :goto_3
    return-object v2

    :pswitch_0
    check-cast v3, Lt23/b4;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lb4/i;->x:I

    const-string v6, "Error to connect user"

    const/4 v7, 0x3

    if-eqz v0, :cond_9

    if-eq v0, v5, :cond_8

    if-eq v0, v1, :cond_7

    if-ne v0, v7, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    iget-wide v0, p0, Lb4/i;->y:J

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lio/getstream/video/android/core/socket/ErrorResponse; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_7

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_8

    :cond_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v3, Lt23/b4;->W:Lbc3/j0;

    if-eqz p1, :cond_a

    iput v5, p0, Lb4/i;->x:I

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_a

    goto :goto_a

    :cond_a
    :goto_4
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object p1, v3, Lt23/b4;->d0:Lf53/k;

    iget-object v0, v3, Lt23/b4;->I:Ld33/c;

    invoke-virtual {v0}, Ld33/c;->a()Lio/getstream/video/android/model/User;

    move-result-object v0

    iput-wide v4, p0, Lb4/i;->y:J

    iput v1, p0, Lb4/i;->x:I

    invoke-virtual {p1, v0, p0}, Lf53/k;->i(Lio/getstream/video/android/model/User;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_b

    goto :goto_a

    :cond_b
    move-wide v0, v4

    :goto_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    new-instance p1, Ln23/g;

    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, v4, v5}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catch Lio/getstream/video/android/core/socket/ErrorResponse; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_6
    move-object v2, p1

    goto :goto_a

    :goto_7
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    invoke-direct {v1, v6, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    move-object v2, v0

    goto :goto_a

    :goto_8
    invoke-virtual {p1}, Lio/getstream/video/android/core/socket/ErrorResponse;->getCode()I

    move-result v0

    sget-object v1, Lu33/e;->y:Lt9/p;

    const/16 v1, 0x28

    if-ne v0, v1, :cond_d

    iput v7, p0, Lb4/i;->x:I

    invoke-static {v3, p0}, Lt23/b4;->k(Lt23/b4;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_c

    goto :goto_a

    :cond_c
    :goto_9
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    const-string v1, "Initialize error. Token expired."

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    goto :goto_6

    :cond_d
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    invoke-direct {v1, v6, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    move-object p1, v0

    goto :goto_6

    :goto_a
    return-object v2

    :pswitch_1
    check-cast v3, Ls23/d;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb4/i;->x:I

    const/4 v6, 0x0

    if-eqz v1, :cond_f

    if-ne v1, v5, :cond_e

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_b

    :catch_1
    move-exception v0

    move-object p1, v0

    goto/16 :goto_d

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_10
    :goto_b
    :try_start_3
    iget-object p1, v3, Ls23/d;->c:Ls23/e;

    sget-object v1, Ls23/e;->y:Ls23/e;

    if-ne p1, v1, :cond_15

    iget-object p1, v3, Ls23/d;->h:Landroid/media/MediaRecorder;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Landroid/media/MediaRecorder;->getMaxAmplitude()I

    move-result p1

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_c

    :cond_11
    move-object v1, v6

    :goto_c
    if-eqz v1, :cond_13

    const/16 p1, 0x14

    int-to-double v7, p1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-double v9, p1

    invoke-static {v9, v10}, Ljava/lang/Math;->log10(D)D

    move-result-wide v9

    mul-double/2addr v7, v9

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-float p1, p1

    const v4, 0x46fffe00    # 32767.0f

    div-float/2addr p1, v4

    invoke-virtual {v3}, Ls23/d;->c()Lb23/k;

    move-result-object v4

    iget-object v9, v4, Lb23/k;->c:Lb23/e;

    iget-object v10, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_12

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "[pollMaxAmplitude] maxAmplitude: "

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, ", db: "

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, ", normalized: "

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v11, v10, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_12
    iget-object v4, v3, Ls23/d;->k:Ljava/util/ArrayList;

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, p1}, Ljava/lang/Float;-><init>(F)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, v3, Ls23/d;->n:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    if-eqz p1, :cond_13

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;->a:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-static {p1, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->e(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;I)V

    :cond_13
    iget-wide v7, p0, Lb4/i;->y:J

    iput v5, p0, Lb4/i;->x:I

    invoke-static {v7, v8, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-ne p1, v0, :cond_10

    move-object v2, v0

    goto :goto_f

    :goto_d
    invoke-virtual {v3}, Ls23/d;->c()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_15

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_14

    goto :goto_e

    :cond_14
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    :goto_e
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v5, "Could not start poll max amplitude: "

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v4, v3, p1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_15
    :goto_f
    return-object v2

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb4/i;->x:I

    if-eqz v1, :cond_17

    if-ne v1, v5, :cond_16

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_10

    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v6, p0, Lb4/i;->y:J

    iput v5, p0, Lb4/i;->x:I

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_18

    move-object v2, v0

    goto :goto_11

    :cond_18
    :goto_10
    check-cast v3, Lt23/n0;

    invoke-virtual {v3}, Lt23/n0;->invoke()Ljava/lang/Object;

    :goto_11
    return-object v2

    :pswitch_3
    check-cast v3, Lh0/k;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v6, p0, Lb4/i;->x:I

    if-eqz v6, :cond_1b

    if-eq v6, v5, :cond_1a

    if-ne v6, v1, :cond_19

    goto :goto_12

    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1a
    :goto_12
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_16

    :cond_1b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v6, p0, Lb4/i;->y:J

    invoke-virtual {v3}, Lh0/k;->k1()Z

    move-result p1

    if-eqz p1, :cond_1c

    const/high16 p1, -0x40800000    # -1.0f

    :goto_13
    invoke-static {p1, v6, v7}, Ly3/q;->h(FJ)J

    move-result-wide v6

    goto :goto_14

    :cond_1c
    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_13

    :goto_14
    iget-object p1, v3, Lh0/k;->a0:Lh0/d2;

    sget-object v1, Lh0/d2;->w:Lh0/d2;

    if-ne p1, v1, :cond_1d

    invoke-static {v6, v7}, Ly3/q;->e(J)F

    move-result p1

    goto :goto_15

    :cond_1d
    invoke-static {v6, v7}, Ly3/q;->d(J)F

    move-result p1

    :goto_15
    iput v5, p0, Lb4/i;->x:I

    invoke-static {v3, p1, p0}, Lh0/k;->j1(Lh0/k;FLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1e

    move-object v2, v0

    :cond_1e
    :goto_16
    return-object v2

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb4/i;->x:I

    if-eqz v1, :cond_20

    if-ne v1, v5, :cond_1f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_17

    :cond_1f
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_20
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Ld0/e;

    iget-wide v6, p0, Lb4/i;->y:J

    move-wide v7, v6

    new-instance v6, Lh2/b;

    invoke-direct {v6, v7, v8}, Lh2/b;-><init>(J)V

    sget-object v7, Lf1/s0;->d:Ld0/i1;

    iput v5, p0, Lb4/i;->x:I

    const/4 v8, 0x0

    const/16 v10, 0xc

    move-object v9, p0

    move-object v5, v3

    invoke-static/range {v5 .. v10}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_21

    move-object v2, v0

    :cond_21
    :goto_17
    return-object v2

    :pswitch_5
    move-object v9, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v9, Lb4/i;->x:I

    if-eqz v1, :cond_23

    if-ne v1, v5, :cond_22

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_18

    :cond_22
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_23
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v3, Lb4/l;

    iget-object p1, v3, Lb4/l;->w:Lt2/d;

    iget-wide v3, v9, Lb4/i;->y:J

    iput v5, v9, Lb4/i;->x:I

    invoke-virtual {p1, v3, v4, p0}, Lt2/d;->b(JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_24

    move-object v2, v0

    :cond_24
    :goto_18
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
