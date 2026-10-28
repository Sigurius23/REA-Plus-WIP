.class public abstract Ls4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final a(Landroid/content/Context;Lq83/j;)Lty/a;
    .locals 9

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lty/a;

    new-instance v2, Lpg3/p;

    invoke-direct {v2, p0, p1}, Lpg3/p;-><init>(Landroid/content/Context;Lq83/j;)V

    new-instance v3, Lq30/u0;

    invoke-direct {v3, p0}, Lq30/u0;-><init>(Landroid/content/Context;)V

    new-instance v4, Lab/i0;

    const/4 v0, 0x0

    const/16 v5, 0x1e

    invoke-direct {v4, p1, v0, v5}, Lab/i0;-><init>(Lq83/j;Lqy/d;I)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "getApplicationContext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lb20/f;

    new-instance v0, Lyy/j;

    sget-object v6, Lbc3/q0;->a:Lkc3/e;

    sget-object v6, Lkc3/d;->w:Lkc3/d;

    invoke-static {v6}, Ls93/k;->c(Ljava/lang/Object;)V

    sget-object v7, Lqy/e;->b:Lqy/d;

    invoke-direct {v0, v7, v6}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v6, Lb10/b;

    new-instance v7, Lal0/f;

    const/4 v8, 0x1

    invoke-direct {v7, p0, v8}, Lal0/f;-><init>(Landroid/content/Context;I)V

    sget-object v8, Lm83/a0;->w:Lm83/a0;

    invoke-direct {v6, p0, v8, v7}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-direct {v5, v0, v6}, Lb20/f;-><init>(Lyy/j;Lyy/c;)V

    new-instance v7, Lux/f0;

    const/4 p0, 0x0

    invoke-direct {v7, p0}, Lux/f0;-><init>(I)V

    move-object v6, p1

    invoke-direct/range {v1 .. v7}, Lty/a;-><init>(Lpg3/p;Lq30/u0;Lab/i0;Lb20/f;Lq83/j;Lux/f0;)V

    return-object v1
.end method

.method public static b(JLed3/a;[Lwm/s;)V
    .locals 10

    :goto_0
    invoke-virtual {p2}, Led3/a;->a()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_d

    const/4 v0, 0x0

    move v2, v0

    :cond_0
    invoke-virtual {p2}, Led3/a;->a()I

    move-result v3

    const/16 v4, 0xff

    const/4 v5, -0x1

    if-nez v3, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Led3/a;->y()I

    move-result v3

    add-int/2addr v2, v3

    if-eq v3, v4, :cond_0

    move v3, v2

    :goto_1
    move v2, v0

    :cond_2
    invoke-virtual {p2}, Led3/a;->a()I

    move-result v6

    if-nez v6, :cond_3

    move v2, v5

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Led3/a;->y()I

    move-result v6

    add-int/2addr v2, v6

    if-eq v6, v4, :cond_2

    :goto_2
    iget v4, p2, Led3/a;->b:I

    add-int/2addr v4, v2

    if-eq v2, v5, :cond_b

    invoke-virtual {p2}, Led3/a;->a()I

    move-result v5

    if-le v2, v5, :cond_4

    goto :goto_6

    :cond_4
    const/4 v5, 0x4

    if-ne v3, v5, :cond_c

    const/16 v3, 0x8

    if-lt v2, v3, :cond_c

    invoke-virtual {p2}, Led3/a;->y()I

    move-result v2

    invoke-virtual {p2}, Led3/a;->D()I

    move-result v3

    const/16 v5, 0x31

    if-ne v3, v5, :cond_5

    invoke-virtual {p2}, Led3/a;->i()I

    move-result v6

    goto :goto_3

    :cond_5
    move v6, v0

    :goto_3
    invoke-virtual {p2}, Led3/a;->y()I

    move-result v7

    const/16 v8, 0x2f

    if-ne v3, v8, :cond_6

    invoke-virtual {p2, v1}, Led3/a;->L(I)V

    :cond_6
    const/16 v9, 0xb5

    if-ne v2, v9, :cond_8

    if-eq v3, v5, :cond_7

    if-ne v3, v8, :cond_8

    :cond_7
    const/4 v2, 0x3

    if-ne v7, v2, :cond_8

    move v2, v1

    goto :goto_4

    :cond_8
    move v2, v0

    :goto_4
    if-ne v3, v5, :cond_a

    const v3, 0x47413934

    if-ne v6, v3, :cond_9

    goto :goto_5

    :cond_9
    move v1, v0

    :goto_5
    and-int/2addr v2, v1

    :cond_a
    if-eqz v2, :cond_c

    invoke-static {p0, p1, p2, p3}, Ls4/d;->c(JLed3/a;[Lwm/s;)V

    goto :goto_7

    :cond_b
    :goto_6
    const-string v0, "CeaUtil"

    const-string v1, "Skipping remainder of malformed SEI NAL unit."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget v4, p2, Led3/a;->c:I

    :cond_c
    :goto_7
    invoke-virtual {p2, v4}, Led3/a;->K(I)V

    goto/16 :goto_0

    :cond_d
    return-void
.end method

.method public static c(JLed3/a;[Lwm/s;)V
    .locals 10

    invoke-virtual {p2}, Led3/a;->y()I

    move-result v0

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    and-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Led3/a;->L(I)V

    mul-int/lit8 v6, v0, 0x3

    iget v0, p2, Led3/a;->b:I

    array-length v1, p3

    const/4 v2, 0x0

    move v9, v2

    :goto_0
    if-ge v9, v1, :cond_1

    aget-object v2, p3, v9

    invoke-virtual {p2, v0}, Led3/a;->K(I)V

    invoke-interface {v2, v6, p2}, Lwm/s;->c(ILed3/a;)V

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, p0, v3

    if-eqz v3, :cond_0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x1

    move-wide v3, p0

    invoke-interface/range {v2 .. v8}, Lwm/s;->d(JIIILwm/r;)V

    goto :goto_1

    :cond_0
    move-wide v3, p0

    :goto_1
    add-int/lit8 v9, v9, 0x1

    move-wide p0, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;
    .locals 9

    const-string v0, "throwable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/core/exception/StripeException;

    return-object p0

    :cond_0
    instance-of v0, p0, Lorg/json/JSONException;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/stripe/android/core/exception/APIException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    const/4 v3, 0x7

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v6, p0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/exception/APIException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    return-object v1

    :cond_1
    move-object v6, p0

    nop

    instance-of p0, v6, Ljava/io/IOException;

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    sget p0, Lcom/stripe/android/core/exception/APIConnectionException;->F:I

    move-object p0, v6

    check-cast p0, Ljava/io/IOException;

    invoke-static {p0, v0}, Ls4/a;->a(Ljava/io/IOException;Ljava/lang/String;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of p0, v6, Ljava/lang/IllegalArgumentException;

    if-eqz p0, :cond_3

    new-instance v2, Lcom/stripe/android/core/exception/InvalidRequestException;

    move-object v7, v6

    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    const/4 v4, 0x7

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    return-object v2

    :cond_3
    new-instance p0, Lcom/stripe/android/core/exception/GenericStripeException;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "android."

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "java."

    invoke-static {v2, v3, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_5
    invoke-direct {p0, v0, v6}, Lcom/stripe/android/core/exception/GenericStripeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public static e(Landroid/content/Context;)[Ljava/io/File;
    .locals 0

    invoke-virtual {p0}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p0, Lx6/a;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lx6/a;

    iget v1, v0, Lx6/a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx6/a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx6/a;

    invoke-direct {v0, p0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p0, v0, Lx6/a;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx6/a;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget-object v2, v0, Lx6/a;->z:Ldc3/c;

    iget-object v6, v0, Lx6/a;->y:Ldc3/w;

    iget-object v7, v0, Lx6/a;->x:Lvd1/c;

    iget-object v8, v0, Lx6/a;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    :try_start_0
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p0, 0x6

    invoke-static {v5, p0, v4}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v6

    new-instance p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v2, Lx30/j1;

    const/4 v7, 0x3

    invoke-direct {v2, v7, p0, v6}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object v7, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v7

    :try_start_1
    sget-object v8, Lz1/l;->i:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    invoke-static {v2, v8}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    sput-object v8, Lz1/l;->i:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    monitor-exit v7

    invoke-static {}, Lz1/l;->a()V

    new-instance v7, Lvd1/c;

    const/4 v8, 0x3

    invoke-direct {v7, v2, v8}, Lvd1/c;-><init>(Ljava/lang/Object;I)V

    :try_start_2
    new-instance v2, Ldc3/c;

    invoke-direct {v2, v6}, Ldc3/c;-><init>(Ldc3/h;)V

    move-object v8, p0

    :cond_3
    :goto_1
    iput-object v8, v0, Lx6/a;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object v7, v0, Lx6/a;->x:Lvd1/c;

    iput-object v6, v0, Lx6/a;->y:Ldc3/w;

    iput-object v2, v0, Lx6/a;->z:Ldc3/c;

    iput v5, v0, Lx6/a;->F:I

    invoke-virtual {v2, v0}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-virtual {v2}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll83/a0;

    invoke-virtual {v8, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object p0, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    sget-object v9, Lz1/l;->j:Lz1/a;

    iget-object v9, v9, Lz1/b;->h:La0/w0;

    if-eqz v9, :cond_5

    invoke-virtual {v9}, La0/w0;->h()Z

    move-result v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v9, v5, :cond_5

    move v9, v5

    goto :goto_3

    :cond_5
    move v9, v3

    :goto_3
    :try_start_4
    monitor-exit p0

    if-eqz v9, :cond_3

    invoke-static {}, Lz1/l;->a()V

    goto :goto_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_6
    :try_start_5
    invoke-interface {v6, v4}, Ldc3/w;->cancel(Ljava/util/concurrent/CancellationException;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    invoke-virtual {v7}, Lvd1/c;->a()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_2
    move-exception p0

    goto :goto_5

    :goto_4
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_7
    invoke-static {v6, p0}, Lts/o;->f(Ldc3/w;Ljava/lang/Throwable;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_5
    invoke-virtual {v7}, Lvd1/c;->a()V

    throw p0

    :catchall_4
    move-exception p0

    monitor-exit v7

    throw p0
.end method

.method public static g(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final h(Lb2/v;Lkotlin/jvm/functions/Function1;)Lj3/d;
    .locals 5

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget v1, v0, La3/n0;->x:I

    invoke-static {v0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getRectManager()Lj3/b;

    move-result-object v0

    iget-object v2, v0, Lj3/b;->b:Lj3/e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lj3/e;->a:La0/g0;

    new-instance v4, Lj3/d;

    invoke-direct {v4, v2, v1, p0, p1}, Lj3/d;-><init>(Lj3/e;ILb2/v;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-virtual {v3, v1, v4}, La0/g0;->h(ILjava/lang/Object;)V

    move-object p0, v4

    :cond_0
    check-cast p0, Lj3/d;

    if-eq p0, v4, :cond_2

    :goto_0
    iget-object p1, p0, Lj3/d;->d:Lj3/d;

    if-eqz p1, :cond_1

    move-object p0, p1

    goto :goto_0

    :cond_1
    iput-object v4, p0, Lj3/d;->d:Lj3/d;

    :cond_2
    const/4 p0, 0x1

    iput-boolean p0, v0, Lj3/b;->d:Z

    invoke-virtual {v0}, Lj3/b;->k()V

    return-object v4
.end method

.method public static final i(I)V
    .locals 2

    new-instance v0, Lkotlinx/serialization/SerializationException;

    const-string v1, "An unknown field for index "

    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static j(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 8

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    instance-of v2, p0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v2, :cond_0

    move-object v3, p0

    check-cast v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v3

    if-nez v3, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz v2, :cond_3

    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    const/4 v2, 0x1

    invoke-static {p0, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "bitmap is null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v4, v2, Landroid/graphics/Rect;->top:I

    iget v5, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {p0, v7, v7, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, v3, v4, v5, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    return-object v6
.end method

.method public static final k(Ll3/x0;)Landroid/text/style/TtsSpan;
    .locals 1

    instance-of v0, p0, Ll3/x0;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/text/style/TtsSpan$VerbatimBuilder;

    iget-object p0, p0, Ll3/x0;->a:Ljava/lang/String;

    invoke-direct {v0, p0}, Landroid/text/style/TtsSpan$VerbatimBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
