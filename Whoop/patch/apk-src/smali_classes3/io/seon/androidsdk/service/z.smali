.class public final synthetic Lio/seon/androidsdk/service/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/seon/androidsdk/service/t0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/seon/androidsdk/service/b0;


# direct methods
.method public synthetic constructor <init>(Lio/seon/androidsdk/service/b0;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/z;->a:I

    iput-object p1, p0, Lio/seon/androidsdk/service/z;->b:Lio/seon/androidsdk/service/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lio/seon/androidsdk/service/z;->a:I

    const/4 v1, -0x1

    const-string v2, "SHA-256"

    const-string v3, "UTF-8"

    const/4 v4, 0x0

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/seon/androidsdk/service/z;->b:Lio/seon/androidsdk/service/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1f

    if-ge v1, v6, :cond_2

    iget-object v0, v0, Lio/seon/androidsdk/service/b0;->f:Landroid/content/ClipboardManager;

    if-nez v0, :cond_0

    move-object v0, v5

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/ClipData;->getItemCount()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0, v4}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v5

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    iget-object v1, v0, Lio/seon/androidsdk/service/b0;->f:Landroid/content/ClipboardManager;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lio/seon/androidsdk/service/b0;->f:Landroid/content/ClipboardManager;

    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ClipDescription;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    :cond_3
    :try_start_1
    const-string v0, ""

    :goto_2
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lio/seon/androidsdk/service/o;->b([B)Ljava/lang/String;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    const-string v1, "PBHash"

    invoke-static {v1, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    return-object v5

    :pswitch_0
    iget-object v0, p0, Lio/seon/androidsdk/service/z;->b:Lio/seon/androidsdk/service/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_2
    iget-object v1, v0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    sget-object v2, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_6

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v1, v0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_7

    check-cast v1, Landroid/app/Activity;

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_5

    :cond_6
    invoke-static {}, Lio/seon/androidsdk/service/o;->k()Landroid/app/Activity;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    if-nez v1, :cond_8

    :cond_7
    const-string v0, "NO ACCESS"

    goto :goto_7

    :cond_8
    :goto_4
    :try_start_3
    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    iget-object v0, v0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f050006

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_a

    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v0

    if-eqz v0, :cond_b

    if-eq v0, v4, :cond_c

    if-eq v0, v3, :cond_d

    if-eq v0, v2, :cond_e

    goto :goto_6

    :cond_a
    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-eqz v0, :cond_e

    if-eq v0, v4, :cond_d

    if-eq v0, v3, :cond_c

    if-eq v0, v2, :cond_b

    goto :goto_6

    :cond_b
    const-string v0, "Landscape Left"

    goto :goto_7

    :cond_c
    const-string v0, "Portrait Upside Down"

    goto :goto_7

    :cond_d
    const-string v0, "Landscape Right"

    goto :goto_7

    :cond_e
    const-string v0, "Portrait"

    goto :goto_7

    :goto_5
    const-string v1, "DOrient"

    invoke-static {v1, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_6
    const-string v0, "NOT FOUND"

    :goto_7
    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/seon/androidsdk/service/z;->b:Lio/seon/androidsdk/service/b0;

    sget-object v1, Lio/seon/androidsdk/service/b0;->p:Lio/seon/androidsdk/service/r0;

    iget-object v2, v1, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, v1, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v4, v6

    iget-wide v6, v1, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v4, v4, v6

    if-gez v4, :cond_f

    iget-wide v4, v1, Lio/seon/androidsdk/service/r0;->b:J

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-nez v4, :cond_10

    :cond_f
    invoke-virtual {v0}, Lio/seon/androidsdk/service/b0;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v2, v1, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    :cond_10
    iget-object v0, v1, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    iget-object v0, v1, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/seon/androidsdk/service/z;->b:Lio/seon/androidsdk/service/b0;

    iget-object v4, v0, Lio/seon/androidsdk/service/b0;->i:Ljava/util/List;

    if-nez v4, :cond_11

    iget-object v4, v0, Lio/seon/androidsdk/service/b0;->h:Landroid/hardware/SensorManager;

    invoke-virtual {v4, v1}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lio/seon/androidsdk/service/b0;->i:Ljava/util/List;

    :cond_11
    iget-object v1, v0, Lio/seon/androidsdk/service/b0;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_12

    iget-object v0, v0, Lio/seon/androidsdk/service/b0;->i:Ljava/util/List;

    goto :goto_8

    :cond_12
    move-object v0, v5

    :goto_8
    if-nez v0, :cond_13

    goto :goto_a

    :cond_13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/Sensor;

    invoke-virtual {v4}, Landroid/hardware/Sensor;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_9

    :cond_14
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lio/seon/androidsdk/service/o;->b([B)Ljava/lang/String;

    move-result-object v5
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_a

    :catch_2
    move-exception v0

    const-string v1, "SHash"

    invoke-static {v1, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_a
    return-object v5

    :pswitch_3
    iget-object v0, p0, Lio/seon/androidsdk/service/z;->b:Lio/seon/androidsdk/service/b0;

    :try_start_6
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-ge v2, v3, :cond_15

    const/16 v3, 0x3ff

    sput v3, Lio/seon/androidsdk/service/k;->a:I

    goto :goto_b

    :cond_15
    const v3, 0xffff

    sput v3, Lio/seon/androidsdk/service/k;->a:I

    :goto_b
    iget-object v3, v0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    sget-object v5, Lio/seon/androidsdk/service/b0;->m:[Ljava/lang/String;

    invoke-static {v3}, Lio/seon/androidsdk/service/k;->a(Landroid/content/Context;)F

    move-result v3

    iget-object v0, v0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v5, "screen_brightness"

    const/high16 v6, -0x40800000    # -1.0f

    invoke-static {v0, v5, v6}, Landroid/provider/Settings$System;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result v0

    const/16 v5, 0x1c

    const/high16 v6, 0x3f800000    # 1.0f

    if-gt v2, v5, :cond_16

    sub-float/2addr v0, v6

    sub-float/2addr v3, v6

    div-float/2addr v0, v3

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v0, v2

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->intValue()I

    move-result v1

    goto :goto_e

    :cond_16
    sub-float/2addr v0, v6

    sub-float/2addr v3, v6

    div-float/2addr v0, v3

    const/high16 v2, 0x41400000    # 12.0f

    mul-float/2addr v0, v2

    cmpg-float v2, v0, v6

    if-gtz v2, :cond_17

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v0, v2

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v0, v2

    goto :goto_c

    :cond_17
    const v2, 0x3e91c020

    sub-float/2addr v0, v2

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    double-to-float v0, v2

    const v2, 0x3e371ff0

    mul-float/2addr v0, v2

    const v2, 0x3f0f564f

    add-float/2addr v0, v2

    :goto_c
    sget v2, Lio/seon/androidsdk/service/k;->a:I

    int-to-float v2, v2

    const/4 v3, 0x0

    sub-float/2addr v2, v3

    mul-float/2addr v2, v0

    add-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    float-to-double v2, v0

    sget v0, Lio/seon/androidsdk/service/k;->a:I

    int-to-double v5, v0

    cmpl-double v0, v2, v5

    if-lez v0, :cond_18

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    goto :goto_d

    :cond_18
    int-to-double v7, v4

    cmpg-double v0, v2, v7

    if-gez v0, :cond_19

    const-wide/16 v2, 0x0

    goto :goto_d

    :cond_19
    sub-double/2addr v2, v7

    div-double/2addr v2, v5

    :goto_d
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->intValue()I

    move-result v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    :catch_3
    :goto_e
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
