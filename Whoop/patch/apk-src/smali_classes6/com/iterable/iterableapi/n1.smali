.class public final synthetic Lcom/iterable/iterableapi/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/iterable/iterableapi/n1;->w:I

    iput-object p2, p0, Lcom/iterable/iterableapi/n1;->x:Ljava/lang/Object;

    iput-object p3, p0, Lcom/iterable/iterableapi/n1;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/16 v0, 0x8

    iput v0, p0, Lcom/iterable/iterableapi/n1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/n1;->y:Ljava/lang/Object;

    iput-object p2, p0, Lcom/iterable/iterableapi/n1;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcom/iterable/iterableapi/n1;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/iterable/iterableapi/n1;->y:Ljava/lang/Object;

    iget-object v4, p0, Lcom/iterable/iterableapi/n1;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Ljava/util/zip/ZipInputStream;

    check-cast v3, Ljava/lang/String;

    invoke-static {v2, v4, v3}, Lqi/l;->h(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lqi/b0;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v3, Ljava/lang/String;

    check-cast v4, Ljava/lang/String;

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {v0}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v0

    invoke-static {v0, v4}, Lqi/l;->e(Lne3/y;Ljava/lang/String;)Lqi/b0;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v4, Ljava/io/InputStream;

    check-cast v3, Ljava/lang/String;

    invoke-static {v4}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v0

    invoke-static {v0, v3}, Lqi/l;->e(Lne3/y;Ljava/lang/String;)Lqi/b0;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v4, Lcom/airbnb/lottie/LottieAnimationView;

    check-cast v3, Ljava/lang/String;

    iget-boolean v0, v4, Lcom/airbnb/lottie/LottieAnimationView;->J:Z

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lqi/l;->a:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "asset_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v3, v1}, Lqi/l;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lqi/b0;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3, v2}, Lqi/l;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lqi/b0;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_3
    check-cast v4, Lio/sentry/android/core/ScreenshotEventProcessor;

    check-cast v3, Landroid/graphics/Bitmap;

    iget-object v0, v4, Lio/sentry/android/core/ScreenshotEventProcessor;->w:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_4

    :cond_1
    :try_start_0
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v3, v5, v1, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v3

    if-gtz v3, :cond_2

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v5, "Screenshot is 0 bytes, not attaching the image."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v3, v5, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v1

    goto :goto_3

    :catchall_1
    move-exception v1

    goto :goto_1

    :cond_2
    :try_start_3
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v2, v1

    goto :goto_4

    :goto_1
    :try_start_5
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v3

    :try_start_6
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_3
    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "Compressing bitmap failed."

    invoke-interface {v0, v3, v4, v1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    return-object v2

    :pswitch_4
    check-cast v4, Lio/sentry/j1;

    check-cast v3, Lio/sentry/s5;

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_7
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/OutputStreamWriter;

    sget-object v5, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    invoke-interface {v4, v1, v3}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :try_start_9
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    return-object v2

    :catchall_3
    move-exception v1

    goto :goto_6

    :catchall_4
    move-exception v2

    :try_start_a
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception v1

    :try_start_b
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :goto_6
    :try_start_c
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    goto :goto_7

    :catchall_6
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v1

    :pswitch_5
    check-cast v4, Lio/sentry/j1;

    check-cast v3, Lio/sentry/clientreport/b;

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_d
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/OutputStreamWriter;

    sget-object v5, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    :try_start_e
    invoke-interface {v4, v1, v3}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    :try_start_f
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    return-object v2

    :catchall_7
    move-exception v1

    goto :goto_9

    :catchall_8
    move-exception v2

    :try_start_10
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    goto :goto_8

    :catchall_9
    move-exception v1

    :try_start_11
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :goto_9
    :try_start_12
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    goto :goto_a

    :catchall_a
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v1

    :pswitch_6
    check-cast v4, Lio/sentry/j1;

    check-cast v3, Lio/sentry/w5;

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_13
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/OutputStreamWriter;

    sget-object v5, Lio/sentry/c5;->d:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    :try_start_14
    invoke-interface {v4, v1, v3}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    :try_start_15
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    return-object v2

    :catchall_b
    move-exception v1

    goto :goto_c

    :catchall_c
    move-exception v2

    :try_start_16
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    goto :goto_b

    :catchall_d
    move-exception v1

    :try_start_17
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    :goto_c
    :try_start_18
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_e

    goto :goto_d

    :catchall_e
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v1

    :pswitch_7
    check-cast v4, Lhms/webrtc/audio/WebRtcAudioRecord;

    check-cast v3, Landroid/media/AudioRecord;

    invoke-static {v4, v3}, Lhms/webrtc/audio/WebRtcAudioRecord;->a(Lhms/webrtc/audio/WebRtcAudioRecord;Landroid/media/AudioRecord;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v4, Lcom/iterable/iterableapi/z;

    check-cast v3, Ljava/lang/String;

    const-string v0, "$it"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v3, :cond_3

    goto :goto_e

    :cond_3
    :try_start_19
    sget-object v0, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v2, "this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "AES/GCM/NoPadding"

    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    invoke-static {}, Lcom/iterable/iterableapi/z;->c()Ljavax/crypto/SecretKey;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v2, v4, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-virtual {v2}, Ljavax/crypto/Cipher;->getIV()[B

    move-result-object v3

    invoke-virtual {v2, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    array-length v2, v3

    const/4 v5, 0x2

    add-int/2addr v2, v5

    array-length v6, v0

    add-int/2addr v2, v6

    new-array v2, v2, [B

    aput-byte v4, v2, v1

    array-length v6, v3

    int-to-byte v6, v6

    aput-byte v6, v2, v4

    array-length v4, v3

    invoke-static {v3, v1, v2, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v3, v3

    add-int/2addr v3, v5

    array-length v4, v0

    invoke-static {v0, v1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_0

    :goto_e
    return-object v2

    :catch_0
    move-exception v0

    const-string v1, "IterableDataEncryptor"

    const-string v2, "Encryption failed"

    invoke-static {v1, v2, v0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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
