.class public final Lio/sentry/android/replay/video/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    .line 21
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    .line 22
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    .line 23
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    .line 24
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    .line 25
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    .line 26
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    return-void

    .line 27
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance p1, Lag/e;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lag/e;-><init>(I)V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    .line 29
    new-instance p1, Lag/e;

    invoke-direct {p1, v0}, Lag/e;-><init>(I)V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    .line 30
    new-instance p1, Lag/e;

    invoke-direct {p1, v0}, Lag/e;-><init>(I)V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    .line 31
    new-instance p1, Lag/e;

    invoke-direct {p1, v0}, Lag/e;-><init>(I)V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    .line 32
    sget-object p1, Luf/p;->d:Luf/p;

    .line 33
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    .line 34
    new-instance p1, Leg/o;

    .line 35
    new-instance v0, Lae3/k;

    new-instance v1, Leg/k;

    invoke-direct {v1}, Leg/k;-><init>()V

    invoke-direct {v0, v1}, Lae3/k;-><init>(Leg/k;)V

    .line 36
    invoke-direct {p1, v0}, Leg/o;-><init>(Lae3/k;)V

    .line 37
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    .line 38
    sget-object p1, Lgg/h;->x:Lgg/h;

    .line 39
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    return-void

    .line 40
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    .line 42
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    .line 43
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    .line 44
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 45
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    .line 46
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lio/sentry/q6;Lio/sentry/android/replay/video/a;)V
    .locals 2

    .line 1
    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    .line 5
    sget-object p1, Ll83/i;->y:Ll83/i;

    sget-object v0, Lio/sentry/android/replay/video/c;->w:Lio/sentry/android/replay/video/c;

    invoke-static {p1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    .line 6
    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    const-string v0, "c2.android.avc.encoder"

    invoke-static {v0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p2, Lio/sentry/android/replay/video/a;->f:Ljava/lang/String;

    .line 9
    invoke-static {v0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0

    .line 10
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 11
    iput-object v0, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    .line 12
    new-instance v0, Lav/b;

    const/16 v1, 0x1b

    invoke-direct {v0, p0, v1}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    .line 13
    new-instance p1, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    .line 14
    new-instance p1, Lio/sentry/android/replay/video/b;

    .line 15
    iget-object v0, p2, Lio/sentry/android/replay/video/a;->a:Ljava/io/File;

    .line 16
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getAbsolutePath(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iget p2, p2, Lio/sentry/android/replay/video/a;->d:I

    int-to-float p2, p2

    .line 18
    invoke-direct {p1, v0, p2}, Lio/sentry/android/replay/video/b;-><init>(Ljava/lang/String;F)V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B
    .locals 1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    if-nez p2, :cond_0

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    :goto_0
    const/4 p2, 0x0

    :try_start_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    return-object p2

    :cond_1
    invoke-static {p0}, Lse/a;->y(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/io/CharConversionException;

    const-string p2, "can\'t read keyset; the pref value "

    const-string v0, " is not a valid hex string"

    invoke-static {p2, p1, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "keysetName cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f([B)Lfs/f;
    .locals 2

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object p0

    invoke-static {v0, p0}, Lvs/u3;->G(Ljava/io/ByteArrayInputStream;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/u3;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    invoke-static {p0}, Lfs/h;->a(Lvs/u3;)Lfs/h;

    move-result-object p0

    new-instance v0, Lfs/f;

    iget-object p0, p0, Lfs/h;->a:Lvs/u3;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->y()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object p0

    check-cast p0, Lvs/r3;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lfs/f;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    throw p0
.end method


# virtual methods
.method public declared-synchronized a()Lps/a;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    check-cast v0, Lvs/p3;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v1, Lfs/f;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->e()[B

    move-result-object v0

    invoke-static {v0}, Lfs/b;->b([B)Lfs/k;

    move-result-object v0

    new-instance v1, Lfs/f;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lfs/f;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_0
    :goto_0
    sget-object v0, Lps/a;->b:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lio/sentry/android/replay/video/d;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lio/sentry/android/replay/video/d;->h()Lps/b;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lio/sentry/android/replay/video/d;->d()Lfs/f;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lio/sentry/android/replay/video/d;->g([B)Lfs/f;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lio/sentry/android/replay/video/d;->f([B)Lfs/f;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    :goto_2
    new-instance v1, Lps/a;

    invoke-direct {v1, p0}, Lps/a;-><init>(Lio/sentry/android/replay/video/d;)V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    return-object v1

    :goto_3
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    throw v1

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "keysetName cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_4
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public b(Z)V
    .locals 12

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/video/b;

    iget-object v1, p0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v1, Landroid/media/MediaCodec$BufferInfo;

    iget-object v2, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v2, Landroid/media/MediaCodec;

    iget-object v3, p0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    check-cast v3, Lio/sentry/q6;

    invoke-virtual {v3}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v4

    iget-boolean v4, v4, Lio/sentry/u6;->n:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v6, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[Encoder]: drainCodec("

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v8, 0x29

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v8, v5, [Ljava/lang/Object;

    invoke-interface {v4, v6, v7, v8}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {v3}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v4

    iget-boolean v4, v4, Lio/sentry/u6;->n:Z

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v6, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v7, "[Encoder]: sending EOS to encoder"

    new-array v8, v5, [Ljava/lang/Object;

    invoke-interface {v4, v6, v7, v8}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v2}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    :cond_2
    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v4

    :cond_3
    :goto_0
    const-wide/32 v6, 0x186a0

    invoke-virtual {v2, v1, v6, v7}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_5

    if-nez p1, :cond_4

    goto/16 :goto_2

    :cond_4
    invoke-virtual {v3}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v6

    iget-boolean v6, v6, Lio/sentry/u6;->n:Z

    if-eqz v6, :cond_3

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v6

    sget-object v7, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v8, "[Encoder]: no output available, spinning to await EOS"

    new-array v9, v5, [Ljava/lang/Object;

    invoke-interface {v6, v7, v8, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    const/4 v7, -0x3

    if-ne v6, v7, :cond_6

    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v4

    goto :goto_0

    :cond_6
    const/4 v7, -0x2

    if-ne v6, v7, :cond_9

    iget-boolean v6, v0, Lio/sentry/android/replay/video/b;->c:Z

    if-nez v6, :cond_8

    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v6

    const-string v7, "getOutputFormat(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v7

    iget-boolean v7, v7, Lio/sentry/u6;->n:Z

    if-eqz v7, :cond_7

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    sget-object v8, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "[Encoder]: encoder output format changed: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-array v10, v5, [Ljava/lang/Object;

    invoke-interface {v7, v8, v9, v10}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    iget-object v7, v0, Lio/sentry/android/replay/video/b;->b:Landroid/media/MediaMuxer;

    invoke-virtual {v7, v6}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result v6

    iput v6, v0, Lio/sentry/android/replay/video/b;->d:I

    invoke-virtual {v7}, Landroid/media/MediaMuxer;->start()V

    const/4 v6, 0x1

    iput-boolean v6, v0, Lio/sentry/android/replay/video/b;->c:Z

    goto :goto_0

    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "format changed twice"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    if-gez v6, :cond_a

    invoke-virtual {v3}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v7

    iget-boolean v7, v7, Lio/sentry/u6;->n:Z

    if-eqz v7, :cond_3

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    sget-object v8, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v9, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "

    invoke-static {v6, v9}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v9, v5, [Ljava/lang/Object;

    invoke-interface {v7, v8, v6, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_a
    if-eqz v4, :cond_11

    aget-object v7, v4, v6

    if-eqz v7, :cond_11

    iget v8, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v8, v8, 0x2

    if-eqz v8, :cond_c

    invoke-virtual {v3}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v8

    iget-boolean v8, v8, Lio/sentry/u6;->n:Z

    if-eqz v8, :cond_b

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v8

    sget-object v9, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v10, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG"

    new-array v11, v5, [Ljava/lang/Object;

    invoke-interface {v8, v9, v10, v11}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_b
    iput v5, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    :cond_c
    iget v8, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-eqz v8, :cond_e

    iget-boolean v8, v0, Lio/sentry/android/replay/video/b;->c:Z

    if-eqz v8, :cond_d

    iget-wide v8, v0, Lio/sentry/android/replay/video/b;->a:J

    iget v10, v0, Lio/sentry/android/replay/video/b;->e:I

    add-int/lit8 v11, v10, 0x1

    iput v11, v0, Lio/sentry/android/replay/video/b;->e:I

    int-to-long v10, v10

    mul-long/2addr v8, v10

    iput-wide v8, v0, Lio/sentry/android/replay/video/b;->f:J

    iput-wide v8, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-object v8, v0, Lio/sentry/android/replay/video/b;->b:Landroid/media/MediaMuxer;

    iget v9, v0, Lio/sentry/android/replay/video/b;->d:I

    invoke-virtual {v8, v9, v7, v1}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    invoke-virtual {v3}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v7

    iget-boolean v7, v7, Lio/sentry/u6;->n:Z

    if-eqz v7, :cond_e

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    sget-object v8, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "[Encoder]: sent "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v10, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    const-string v11, " bytes to muxer"

    invoke-static {v9, v10, v11}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-array v10, v5, [Ljava/lang/Object;

    invoke-interface {v7, v8, v9, v10}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_d
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "muxer hasn\'t started"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_1
    invoke-virtual {v2, v6, v5}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    iget v6, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v6, v6, 0x4

    if-eqz v6, :cond_3

    invoke-virtual {v3}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-boolean v0, v0, Lio/sentry/u6;->n:Z

    if-eqz v0, :cond_10

    if-nez p1, :cond_f

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "[Encoder]: reached end of stream unexpectedly"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_f
    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "[Encoder]: end of stream reached"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_10
    :goto_2
    return-void

    :cond_11
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "encoderOutputBuffer "

    const-string v1, " was null"

    invoke-static {v6, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Landroid/graphics/Bitmap;)V
    .locals 4

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "MANUFACTURER"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "xiaomi"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    const-string v1, "motorola"

    invoke-static {v0, v1, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lio/sentry/android/replay/util/f;->SOC_MANUFACTURER:Lio/sentry/android/replay/util/f;

    invoke-static {v0}, Lio/sentry/android/replay/util/h;->a(Lio/sentry/android/replay/util/f;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "spreadtrum"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v0}, Lio/sentry/android/replay/util/h;->a(Lio/sentry/android/replay/util/f;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "unisoc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v0, Landroid/view/Surface;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v3

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, p0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v0, Landroid/view/Surface;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v3}, Landroid/view/Surface;->lockCanvas(Landroid/graphics/Rect;)Landroid/graphics/Canvas;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_3

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_3
    iget-object p1, p0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast p1, Landroid/view/Surface;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v0}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    :cond_4
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lio/sentry/android/replay/video/d;->b(Z)V

    return-void
.end method

.method public d()Lfs/f;
    .locals 5

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v0, Lfs/f;

    if-eqz v0, :cond_6

    new-instance v0, Lfs/f;

    invoke-static {}, Lvs/u3;->F()Lvs/r3;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lfs/f;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v1, Lfs/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, v1, Lfs/f;->b:Ljava/lang/Object;

    check-cast v1, Lfs/k;

    instance-of v2, v1, Lcom/google/crypto/tink/internal/r;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/google/crypto/tink/internal/r;

    iget-object v1, v1, Lcom/google/crypto/tink/internal/r;->a:Lcom/google/crypto/tink/internal/l0;

    iget-object v1, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Lvs/p3;

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->h(Lfs/k;)Lcom/google/crypto/tink/internal/n0;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/l0;

    iget-object v1, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Lvs/p3;

    :goto_0
    invoke-virtual {v0, v1}, Lfs/f;->a(Lvs/p3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    invoke-virtual {v0}, Lfs/f;->c()Lfs/h;

    move-result-object v1

    iget-object v1, v1, Lfs/h;->a:Lvs/u3;

    invoke-static {v1}, Lfs/r;->a(Lvs/u3;)Lvs/y3;

    move-result-object v1

    invoke-virtual {v1}, Lvs/y3;->B()Lvs/x3;

    move-result-object v1

    invoke-virtual {v1}, Lvs/x3;->D()I

    move-result v1

    monitor-enter v0

    const/4 v2, 0x0

    :goto_1
    :try_start_1
    iget-object v3, v0, Lfs/f;->b:Ljava/lang/Object;

    check-cast v3, Lvs/r3;

    iget-object v3, v3, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v3, Lvs/u3;

    invoke-virtual {v3}, Lvs/u3;->C()I

    move-result v3

    if-ge v2, v3, :cond_5

    iget-object v3, v0, Lfs/f;->b:Ljava/lang/Object;

    check-cast v3, Lvs/r3;

    iget-object v3, v3, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v3, Lvs/u3;

    invoke-virtual {v3, v2}, Lvs/u3;->B(I)Lvs/t3;

    move-result-object v3

    invoke-virtual {v3}, Lvs/t3;->E()I

    move-result v4

    if-ne v4, v1, :cond_4

    invoke-virtual {v3}, Lvs/t3;->G()Lvs/n3;

    move-result-object v2

    sget-object v3, Lvs/n3;->y:Lvs/n3;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v0, Lfs/f;->b:Ljava/lang/Object;

    check-cast v2, Lvs/r3;

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v2, v2, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v2, Lvs/u3;

    invoke-static {v2, v1}, Lvs/u3;->z(Lvs/u3;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    new-instance v1, Lqg3/d;

    iget-object v2, p0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    iget-object v3, p0, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lqg3/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lfs/f;->c()Lfs/h;

    move-result-object v2

    iget-object v4, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v4, Lps/b;

    if-eqz v4, :cond_1

    :try_start_2
    invoke-virtual {v2, v1, v4}, Lfs/h;->e(Lqg3/d;Lps/b;)V

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v2, v2, Lfs/h;->a:Lvs/u3;

    iget-object v1, v1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences$Editor;

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/a;->e()[B

    move-result-object v2

    invoke-static {v2}, Lse/a;->K([B)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to write to SharedPreferences"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_2
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    :try_start_3
    new-instance v2, Ljava/security/GeneralSecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "cannot set key as primary because it\'s not enabled: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    :cond_5
    new-instance v2, Ljava/security/GeneralSecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "key not found: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2

    :goto_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "cannot read or generate keyset"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g([B)Lfs/f;
    .locals 3

    :try_start_0
    new-instance v0, Lps/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lps/c;->c(Ljava/lang/String;)Lps/b;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    new-instance v0, Lfs/f;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfs/f;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v1, Lps/b;

    invoke-static {v0, v1}, Lfs/h;->c(Lfs/f;Lps/b;)Lfs/h;

    move-result-object v0

    new-instance v1, Lfs/f;

    iget-object v0, v0, Lfs/h;->a:Lvs/u3;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->y()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    check-cast v0, Lvs/r3;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, Lfs/f;-><init>(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    :try_start_2
    invoke-static {p1}, Lio/sentry/android/replay/video/d;->f([B)Lfs/f;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    return-object p1

    :catch_2
    throw v0

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    :goto_1
    :try_start_3
    invoke-static {p1}, Lio/sentry/android/replay/video/d;->f([B)Lfs/f;

    move-result-object p1

    const-string v1, "a"

    const-string v2, "cannot use Android Keystore, it\'ll be disabled"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    return-object p1

    :catch_5
    throw v0
.end method

.method public h()Lps/b;
    .locals 6

    const-string v0, "cannot use Android Keystore, it\'ll be disabled"

    const-string v1, "a"

    new-instance v2, Lps/c;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lps/c;->a(Ljava/lang/String;)Z

    move-result v4
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    iget-object v5, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v5}, Lps/c;->c(Ljava/lang/String;)Lps/b;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/ProviderException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    :goto_0
    if-eqz v4, :cond_0

    invoke-static {v1, v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v3

    :cond_0
    new-instance v0, Ljava/security/KeyStoreException;

    iget-object v1, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v3, "the master key "

    const-string v4, " exists but is unusable"

    invoke-static {v3, v1, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception v2

    goto :goto_1

    :catch_3
    move-exception v2

    :goto_1
    invoke-static {v1, v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v3
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p0, v1}, Lio/sentry/android/replay/video/d;->b(Z)V

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v0, Landroid/view/Surface;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/video/b;

    iget-object v0, v0, Lio/sentry/android/replay/video/b;->b:Landroid/media/MediaMuxer;

    invoke-virtual {v0}, Landroid/media/MediaMuxer;->stop()V

    invoke-virtual {v0}, Landroid/media/MediaMuxer;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    iget-object v1, p0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    check-cast v1, Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Failed to properly release video encoder"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v0, Lu40/h;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu40/h;->reset()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public k(Luf/p;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    return-void
.end method

.method public l(Luf/f;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    return-void
.end method

.method public m(Lgg/g;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    return-void
.end method

.method public n(Leg/o;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    return-void
.end method

.method public o()V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    check-cast v0, Lu40/g;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v3, p0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx40/b;

    invoke-interface {v2, v0}, Lx40/b;->onSuccess(Ljava/lang/Object;)V

    move v2, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/HCaptchaException;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx40/a;

    invoke-interface {v2, v0}, Lx40/a;->e(Lcom/stripe/hcaptcha/HCaptchaException;)V

    move v2, v1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    iput-object v0, p0, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public p(Lvs/p3;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 1

    const-string v0, "android-keystore://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "key URI must start with android-keystore://"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public r(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "need an Android context"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
