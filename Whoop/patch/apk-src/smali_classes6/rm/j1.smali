.class public final Lrm/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    .line 20
    sget-object v0, Lv2/b;->w:Lv2/b;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lrm/j1;-><init>(ZLv2/b;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 p1, 0x1

    .line 31
    sget-object v0, Lv2/b;->x:Lv2/b;

    invoke-direct {p0, p1, v0}, Lrm/j1;-><init>(ZLv2/b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lrm/r;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lrm/j1;->d:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lrm/j1;->e:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lrm/j1;->f:Ljava/lang/Object;

    .line 5
    const-string p2, "audio"

    .line 6
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/media/AudioManager;

    .line 7
    invoke-static {p2}, Llo/a;->j(Ljava/lang/Object;)V

    iput-object p2, p0, Lrm/j1;->g:Ljava/lang/Object;

    const/4 p3, 0x3

    .line 8
    iput p3, p0, Lrm/j1;->b:I

    .line 9
    invoke-static {p2, p3}, Lrm/j1;->c(Landroid/media/AudioManager;I)I

    move-result p3

    iput p3, p0, Lrm/j1;->c:I

    .line 10
    iget p3, p0, Lrm/j1;->b:I

    .line 11
    sget v0, Llo/y;->a:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 12
    invoke-virtual {p2, p3}, Landroid/media/AudioManager;->isStreamMute(I)Z

    move-result p2

    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p2, p3}, Lrm/j1;->c(Landroid/media/AudioManager;I)I

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 14
    :goto_0
    iput-boolean p2, p0, Lrm/j1;->a:Z

    .line 15
    new-instance p2, Ld9/e;

    const/4 p3, 0x4

    invoke-direct {p2, p0, p3}, Ld9/e;-><init>(Ljava/lang/Object;I)V

    .line 16
    new-instance p3, Landroid/content/IntentFilter;

    const-string v0, "android.media.VOLUME_CHANGED_ACTION"

    invoke-direct {p3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 17
    :try_start_0
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 18
    iput-object p2, p0, Lrm/j1;->h:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 19
    const-string p2, "StreamVolumeManager"

    const-string p3, "Error registering stream volume receiver"

    invoke-static {p2, p3, p1}, Llo/a;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public constructor <init>(ZLv2/b;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-boolean p1, p0, Lrm/j1;->a:Z

    .line 23
    iput-object p2, p0, Lrm/j1;->d:Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 24
    sget-object p1, Lv2/b;->w:Lv2/b;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Lsq2 not (yet) supported for differential axes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :cond_1
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 p2, 0x3

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    const/4 p1, 0x2

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    move p1, p2

    :goto_1
    iput p1, p0, Lrm/j1;->b:I

    const/16 p1, 0x14

    .line 27
    new-array v0, p1, [Lv2/a;

    iput-object v0, p0, Lrm/j1;->e:Ljava/lang/Object;

    .line 28
    new-array v0, p1, [F

    iput-object v0, p0, Lrm/j1;->f:Ljava/lang/Object;

    .line 29
    new-array p1, p1, [F

    iput-object p1, p0, Lrm/j1;->g:Ljava/lang/Object;

    .line 30
    new-array p1, p2, [F

    iput-object p1, p0, Lrm/j1;->h:Ljava/lang/Object;

    return-void
.end method

.method public static c(Landroid/media/AudioManager;I)I
    .locals 3

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x3c

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Could not retrieve stream volume for stream type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "StreamVolumeManager"

    invoke-static {v2, v1, v0}, Llo/a;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public a(FJ)V
    .locals 3

    iget v0, p0, Lrm/j1;->c:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit8 v0, v0, 0x14

    iput v0, p0, Lrm/j1;->c:I

    iget-object v1, p0, Lrm/j1;->e:Ljava/lang/Object;

    check-cast v1, [Lv2/a;

    aget-object v2, v1, v0

    if-nez v2, :cond_0

    new-instance v2, Lv2/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-wide p2, v2, Lv2/a;->a:J

    iput p1, v2, Lv2/a;->b:F

    aput-object v2, v1, v0

    return-void

    :cond_0
    iput-wide p2, v2, Lv2/a;->a:J

    iput p1, v2, Lv2/a;->b:F

    return-void
.end method

.method public b(F)F
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    if-lez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "maximumVelocity should be a positive value. You specified="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    iget-boolean v3, v0, Lrm/j1;->a:Z

    iget-object v4, v0, Lrm/j1;->d:Ljava/lang/Object;

    check-cast v4, Lv2/b;

    iget-object v5, v0, Lrm/j1;->f:Ljava/lang/Object;

    check-cast v5, [F

    iget-object v6, v0, Lrm/j1;->g:Ljava/lang/Object;

    check-cast v6, [F

    iget v7, v0, Lrm/j1;->c:I

    iget-object v8, v0, Lrm/j1;->e:Ljava/lang/Object;

    check-cast v8, [Lv2/a;

    aget-object v9, v8, v7

    if-nez v9, :cond_1

    move/from16 v16, v2

    goto/16 :goto_9

    :cond_1
    const/4 v10, 0x0

    move-object v11, v9

    :goto_1
    aget-object v12, v8, v7

    if-nez v12, :cond_2

    move/from16 v16, v2

    move/from16 v17, v3

    const/4 v15, 0x1

    goto :goto_4

    :cond_2
    iget-wide v14, v9, Lv2/a;->a:J

    move/from16 v16, v2

    move/from16 v17, v3

    iget-wide v2, v12, Lv2/a;->a:J

    sub-long/2addr v14, v2

    long-to-float v14, v14

    move/from16 v18, v14

    const/4 v15, 0x1

    iget-wide v13, v11, Lv2/a;->a:J

    sub-long/2addr v2, v13

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    long-to-float v2, v2

    sget-object v3, Lv2/b;->w:Lv2/b;

    if-eq v4, v3, :cond_4

    if-eqz v17, :cond_3

    goto :goto_2

    :cond_3
    move-object v11, v9

    goto :goto_3

    :cond_4
    :goto_2
    move-object v11, v12

    :goto_3
    const/high16 v3, 0x42c80000    # 100.0f

    cmpl-float v3, v18, v3

    if-gtz v3, :cond_8

    const/high16 v3, 0x42200000    # 40.0f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_5

    goto :goto_4

    :cond_5
    iget v2, v12, Lv2/a;->b:F

    aput v2, v5, v10

    move/from16 v2, v18

    neg-float v2, v2

    aput v2, v6, v10

    const/16 v2, 0x14

    if-nez v7, :cond_6

    move v7, v2

    :cond_6
    sub-int/2addr v7, v15

    add-int/lit8 v10, v10, 0x1

    if-lt v10, v2, :cond_7

    goto :goto_4

    :cond_7
    move/from16 v2, v16

    move/from16 v3, v17

    goto :goto_1

    :cond_8
    :goto_4
    iget v2, v0, Lrm/j1;->b:I

    if-lt v10, v2, :cond_f

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_e

    if-ne v2, v15, :cond_d

    sub-int/2addr v10, v15

    aget v2, v6, v10

    move v3, v10

    move/from16 v4, v16

    :goto_5
    const/4 v7, 0x2

    if-lez v3, :cond_c

    add-int/lit8 v8, v3, -0x1

    aget v9, v6, v8

    cmpg-float v11, v2, v9

    if-nez v11, :cond_9

    goto :goto_7

    :cond_9
    if-eqz v17, :cond_a

    aget v8, v5, v8

    neg-float v8, v8

    goto :goto_6

    :cond_a
    aget v11, v5, v3

    aget v8, v5, v8

    sub-float v8, v11, v8

    :goto_6
    sub-float/2addr v2, v9

    div-float/2addr v8, v2

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v2

    int-to-float v7, v7

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v11

    mul-float/2addr v11, v7

    float-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v11

    double-to-float v7, v11

    mul-float/2addr v2, v7

    sub-float v2, v8, v2

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v7

    mul-float/2addr v7, v2

    add-float/2addr v4, v7

    if-ne v3, v10, :cond_b

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v4, v2

    :cond_b
    :goto_7
    add-int/lit8 v3, v3, -0x1

    move v2, v9

    goto :goto_5

    :cond_c
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v2

    int-to-float v3, v7

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    mul-float/2addr v4, v3

    float-to-double v3, v4

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    double-to-float v3, v3

    mul-float/2addr v2, v3

    goto :goto_8

    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_e
    :try_start_0
    iget-object v2, v0, Lrm/j1;->h:Ljava/lang/Object;

    check-cast v2, [F

    invoke-static {v6, v5, v10, v2}, Lsb3/a;->p([F[FI[F)V

    const/4 v15, 0x1

    aget v2, v2, v15
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move/from16 v2, v16

    :goto_8
    const/16 v3, 0x3e8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    goto :goto_9

    :cond_f
    move/from16 v2, v16

    :goto_9
    cmpg-float v3, v2, v16

    if-nez v3, :cond_10

    goto :goto_a

    :cond_10
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_11

    :goto_a
    move/from16 v2, v16

    goto :goto_c

    :cond_11
    cmpl-float v3, v2, v16

    if-lez v3, :cond_13

    cmpl-float v3, v2, v1

    if-lez v3, :cond_12

    goto :goto_b

    :cond_12
    move v1, v2

    :goto_b
    move v2, v1

    goto :goto_c

    :cond_13
    neg-float v1, v1

    cmpg-float v3, v2, v1

    if-gez v3, :cond_14

    goto :goto_b

    :cond_14
    :goto_c
    return v2
.end method

.method public d()V
    .locals 5

    iget-object v0, p0, Lrm/j1;->g:Ljava/lang/Object;

    check-cast v0, Landroid/media/AudioManager;

    iget v1, p0, Lrm/j1;->b:I

    invoke-static {v0, v1}, Lrm/j1;->c(Landroid/media/AudioManager;I)I

    move-result v1

    iget v2, p0, Lrm/j1;->b:I

    sget v3, Llo/y;->a:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_0

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->isStreamMute(I)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {v0, v2}, Lrm/j1;->c(Landroid/media/AudioManager;I)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Lrm/j1;->c:I

    if-ne v2, v1, :cond_3

    iget-boolean v2, p0, Lrm/j1;->a:Z

    if-eq v2, v0, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :goto_1
    iput v1, p0, Lrm/j1;->c:I

    iput-boolean v0, p0, Lrm/j1;->a:Z

    iget-object v2, p0, Lrm/j1;->f:Ljava/lang/Object;

    check-cast v2, Lrm/r;

    iget-object v2, v2, Lrm/r;->w:Lrm/u;

    iget-object v2, v2, Lrm/u;->M:Ld9/p;

    new-instance v3, Lrm/q;

    invoke-direct {v3, v1, v0}, Lrm/q;-><init>(IZ)V

    const/16 v0, 0x1e

    invoke-virtual {v2, v0, v3}, Ld9/p;->i(ILlo/h;)V

    return-void
.end method
