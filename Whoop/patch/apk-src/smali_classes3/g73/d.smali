.class public final Lg73/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhn/j;
.implements Li9/j;
.implements Lio/sentry/clientreport/g;
.implements Lio/sentry/hints/i;
.implements Lng3/q;
.implements Lub3/a;
.implements Lq83/i;
.implements Llh/e;
.implements Lim/b;
.implements Lml/h;


# instance fields
.field public final synthetic w:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lg73/d;->w:I

    sget-object v0, Lk93/b;->w:Lk93/b;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 2
    iput p1, p0, Lg73/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;Landroid/widget/FrameLayout;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, Lg73/d;->w:I

    const-string v0, "internalImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "internalImageContainer"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljx/d;)V
    .locals 0

    const/16 p1, 0xf

    iput p1, p0, Lg73/d;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b()Lb23/k;
    .locals 1

    sget-object v0, Lh43/b;->E:Lg73/d;

    sget-object v0, Lh43/b;->F:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public static c(La30/w0;)Landroid/media/MediaCodec;
    .locals 2

    iget-object p0, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast p0, Li9/m;

    iget-object p0, p0, Li9/m;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "createCodec:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-static {p0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p0
.end method

.method public static f(Lhn/i;)Landroid/media/MediaCodec;
    .locals 3

    iget-object v0, p0, Lhn/i;->a:Lhn/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Lhn/i;->a:Lhn/l;

    iget-object p0, p0, Lhn/l;->a:Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "createCodec:"

    if-eqz v1, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Llo/a;->c(Ljava/lang/String;)V

    invoke-static {p0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p0

    invoke-static {}, Llo/a;->o()V

    return-object p0
.end method

.method public static g(Lc9/k;Lai/j;)Lbb/f;
    .locals 3

    iget-object p1, p1, Lai/j;->x:Ljava/lang/Object;

    check-cast p1, Ljava/io/IOException;

    instance-of v0, p1, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;

    iget p1, p1, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;->y:I

    const/16 v0, 0x193

    if-eq p1, v0, :cond_1

    const/16 v0, 0x194

    if-eq p1, v0, :cond_1

    const/16 v0, 0x19a

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1a0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1f4

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1f7

    if-ne p1, v0, :cond_2

    :cond_1
    iget p1, p0, Lc9/k;->x:I

    iget p0, p0, Lc9/k;->y:I

    sub-int/2addr p1, p0

    const/4 p0, 0x1

    if-le p1, p0, :cond_2

    new-instance p0, Lbb/f;

    const-wide/32 v0, 0xea60

    const/4 p1, 0x2

    const/4 v2, 0x2

    invoke-direct {p0, v2, v0, v1, p1}, Lbb/f;-><init>(IJI)V

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static i(Lai/j;)J
    .locals 3

    iget-object v0, p0, Lai/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/IOException;

    instance-of v1, v0, Lcom/google/android/exoplayer2/ParserException;

    if-nez v1, :cond_2

    instance-of v1, v0, Ljava/io/FileNotFoundException;

    if-nez v1, :cond_2

    instance-of v1, v0, Lcom/google/android/exoplayer2/upstream/HttpDataSource$CleartextNotPermittedException;

    if-nez v1, :cond_2

    instance-of v1, v0, Lcom/google/android/exoplayer2/upstream/Loader$UnexpectedLoaderException;

    if-nez v1, :cond_2

    sget v1, Lcom/google/android/exoplayer2/upstream/DataSourceException;->x:I

    :goto_0
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/google/android/exoplayer2/upstream/DataSourceException;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/google/android/exoplayer2/upstream/DataSourceException;

    iget v1, v1, Lcom/google/android/exoplayer2/upstream/DataSourceException;->w:I

    const/16 v2, 0x7d8

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget p0, p0, Lai/j;->w:I

    add-int/lit8 p0, p0, -0x1

    mul-int/lit16 p0, p0, 0x3e8

    const/16 v0, 0x1388

    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    int-to-long v0, p0

    return-wide v0

    :cond_2
    :goto_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public static m(Le43/g;Landroid/app/Application;Z)Le43/g;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    if-eqz v2, :cond_2

    iget-object v1, v0, Le43/g;->c:Le43/h;

    sget-object v3, Lh43/a;->w:Lh43/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    new-instance v1, Lg43/b;

    new-instance v4, La13/b;

    invoke-direct {v4}, La13/b;-><init>()V

    invoke-virtual {v2, v4}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v3

    const-string v5, "from(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, La33/d;

    new-instance v6, Lkr/e;

    const/16 v7, 0x19

    invoke-direct {v6, v7}, Lkr/e;-><init>(I)V

    invoke-direct {v5, v2, v6}, La33/d;-><init>(Landroid/app/Application;Lkr/e;)V

    new-instance v7, Lg43/k;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lg43/q;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    new-instance v10, Lg43/e;

    invoke-direct {v10, v7, v8}, Lg43/e;-><init>(Lg43/k;Lg43/q;)V

    new-instance v9, Lg43/n;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    const-string v11, "getApplicationContext(...)"

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v12, 0x7f140f06

    const v13, 0x7f140f05

    const v14, 0x7f140f07

    const/4 v15, 0x4

    invoke-static {v6, v12, v14, v13, v15}, Lg43/a;->b(Landroid/content/Context;IIII)Lg43/m;

    move-result-object v12

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v13, 0x7f140f22

    const v14, 0x7f140f20

    const v15, 0x7f140f21

    move-object/from16 v18, v1

    const/4 v1, 0x3

    invoke-static {v6, v15, v13, v14, v1}, Lg43/a;->b(Landroid/content/Context;IIII)Lg43/m;

    move-result-object v13

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v14, 0x7f140f28

    const v15, 0x7f140f26

    const v2, 0x7f140f27

    invoke-static {v6, v2, v14, v15, v1}, Lg43/a;->b(Landroid/content/Context;IIII)Lg43/m;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v6, 0x7f140f1a

    const v15, 0x7f140f19

    const v1, 0x7f140f1b

    move-object/from16 v19, v3

    const/4 v3, 0x4

    invoke-static {v2, v6, v1, v15, v3}, Lg43/a;->b(Landroid/content/Context;IIII)Lg43/m;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f140f18

    const v6, 0x7f140f17

    move-object/from16 v20, v4

    const/4 v4, 0x3

    invoke-static {v2, v3, v1, v6, v4}, Lg43/a;->b(Landroid/content/Context;IIII)Lg43/m;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f140f04

    const v6, 0x7f140f03

    const v11, 0x7f140f07

    invoke-static {v2, v3, v11, v6, v4}, Lg43/a;->b(Landroid/content/Context;IIII)Lg43/m;

    move-result-object v17

    move-object/from16 v16, v1

    move-object v11, v9

    invoke-direct/range {v11 .. v17}, Lg43/n;-><init>(Lg43/m;Lg43/m;Lg43/m;Lg43/m;Lg43/m;Lg43/m;)V

    move-object/from16 v2, p1

    move/from16 v6, p2

    move-object/from16 v1, v18

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    invoke-direct/range {v1 .. v10}, Lg43/j;-><init>(Landroid/app/Application;Landroidx/core/app/NotificationManagerCompat;La13/c;La33/d;ZLg43/k;Lg43/q;Lg43/n;Lg43/e;)V

    :cond_1
    move-object v5, v1

    iget-object v3, v0, Le43/g;->a:Ljava/util/List;

    iget-object v4, v0, Le43/g;->b:Lc93/a;

    iget-boolean v6, v0, Le43/g;->d:Z

    iget-object v7, v0, Le43/g;->e:Lc93/a;

    iget-boolean v8, v0, Le43/g;->f:Z

    iget-boolean v9, v0, Le43/g;->g:Z

    iget-object v10, v0, Le43/g;->h:Ljava/util/Set;

    iget-object v11, v0, Le43/g;->i:Lkotlin/jvm/functions/Function1;

    const-string v0, "pushDeviceGenerators"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestPermissionOnAppLaunch"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestPermissionOnDeviceRegistration"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationUpdateTriggers"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Le43/g;

    invoke-direct/range {v2 .. v11}, Le43/g;-><init>(Ljava/util/List;Lc93/a;Le43/h;ZLc93/a;ZZLjava/util/Set;Lkotlin/jvm/functions/Function1;)V

    return-object v2

    :cond_2
    return-object v0
.end method


# virtual methods
.method public a(Lhn/i;)Lhn/k;
    .locals 4

    iget v0, p0, Lg73/d;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, Lg73/d;->f(Lhn/i;)Landroid/media/MediaCodec;

    move-result-object v0

    const-string v1, "configureCodec"

    invoke-static {v1}, Llo/a;->c(Ljava/lang/String;)V

    iget-object v1, p1, Lhn/i;->b:Landroid/media/MediaFormat;

    iget-object v2, p1, Lhn/i;->d:Landroid/view/Surface;

    iget-object p1, p1, Lhn/i;->e:Landroid/media/MediaCrypto;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, p1, v3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    invoke-static {}, Llo/a;->o()V

    const-string p1, "startCodec"

    invoke-static {p1}, Llo/a;->c(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    invoke-static {}, Llo/a;->o()V

    new-instance p1, Lgm/r;

    invoke-direct {p1, v0}, Lgm/r;-><init>(Landroid/media/MediaCodec;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    :cond_0
    throw p1

    :pswitch_0
    sget v0, Llo/y;->a:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_3

    iget-object v0, p1, Lhn/i;->c:Lrm/c0;

    iget-object v0, v0, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v0}, Llo/m;->g(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_1

    const/16 v1, 0x2710

    if-lt v0, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "custom ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const-string v1, "?"

    goto :goto_1

    :pswitch_1
    const-string v1, "camera motion"

    goto :goto_1

    :pswitch_2
    const-string v1, "metadata"

    goto :goto_1

    :pswitch_3
    const-string v1, "image"

    goto :goto_1

    :pswitch_4
    const-string v1, "text"

    goto :goto_1

    :pswitch_5
    const-string v1, "video"

    goto :goto_1

    :pswitch_6
    const-string v1, "audio"

    goto :goto_1

    :pswitch_7
    const-string v1, "default"

    goto :goto_1

    :pswitch_8
    const-string v1, "unknown"

    goto :goto_1

    :pswitch_9
    const-string v1, "none"

    :goto_1
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, "Creating an asynchronous MediaCodec adapter for track type "

    if-eqz v2, :cond_2

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_2
    const-string v2, "DMCodecAdapterFactory"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lqg3/d;

    invoke-direct {v1, v0}, Lqg3/d;-><init>(I)V

    invoke-virtual {v1, p1}, Lqg3/d;->m(Lhn/i;)Lhn/c;

    move-result-object p1

    goto :goto_3

    :cond_3
    new-instance v0, Lg73/d;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    invoke-virtual {v0, p1}, Lg73/d;->a(Lhn/i;)Lhn/k;

    move-result-object p1

    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x2
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public d(Lio/sentry/clientreport/d;Lio/sentry/m;)V
    .locals 0

    return-void
.end method

.method public e(La30/w0;)Li9/k;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, Lg73/d;->c(La30/w0;)Landroid/media/MediaCodec;

    move-result-object v0

    const-string v1, "configureCodec"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v1, p1, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Landroid/view/Surface;

    if-nez v1, :cond_0

    iget-object v2, p1, La30/w0;->x:Ljava/lang/Object;

    check-cast v2, Li9/m;

    iget-boolean v2, v2, Li9/m;->h:Z

    if-eqz v2, :cond_0

    sget v2, Lx8/t;->a:I

    const/16 v3, 0x23

    if-lt v2, v3, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p1, La30/w0;->y:Ljava/lang/Object;

    check-cast v3, Landroid/media/MediaFormat;

    iget-object v4, p1, La30/w0;->F:Ljava/lang/Object;

    check-cast v4, Landroid/media/MediaCrypto;

    invoke-virtual {v0, v3, v1, v4, v2}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v1, "startCodec"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    new-instance v1, Li9/t;

    iget-object p1, p1, La30/w0;->G:Ljava/lang/Object;

    check-cast p1, Li9/i;

    invoke-direct {v1, v0, p1}, Li9/t;-><init>(Landroid/media/MediaCodec;Li9/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :goto_1
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    :cond_1
    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 15

    new-instance v0, Lng3/n;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lng3/n;-><init>(I)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget-object v7, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    const-string v8, "Null flags"

    if-eqz v7, :cond_4

    new-instance v2, Lmm/b;

    const-wide/16 v3, 0x7530

    const-wide/32 v5, 0x5265c00

    invoke-direct/range {v2 .. v7}, Lmm/b;-><init>(JJLjava/util/Set;)V

    sget-object v3, Ldm/d;->w:Ldm/d;

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v7, :cond_3

    new-instance v2, Lmm/b;

    const-wide/16 v3, 0x3e8

    const-wide/32 v5, 0x5265c00

    invoke-direct/range {v2 .. v7}, Lmm/b;-><init>(JJLjava/util/Set;)V

    sget-object v3, Ldm/d;->y:Ldm/d;

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v7, :cond_2

    sget-object v2, Lmm/c;->x:Lmm/c;

    filled-new-array {v2}, [Lmm/c;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v14

    if-eqz v14, :cond_1

    new-instance v9, Lmm/b;

    const-wide/32 v10, 0x5265c00

    const-wide/32 v12, 0x5265c00

    invoke-direct/range {v9 .. v14}, Lmm/b;-><init>(JJLjava/util/Set;)V

    sget-object v2, Ldm/d;->x:Ldm/d;

    invoke-virtual {v1, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    invoke-static {}, Ldm/d;->values()[Ldm/d;

    move-result-object v3

    array-length v3, v3

    if-lt v2, v3, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Lmm/a;

    invoke-direct {v2, v0, v1}, Lmm/a;-><init>(Lpm/a;Ljava/util/HashMap;)V

    return-object v2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not all priorities have been configured"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h(I)I
    .locals 1

    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    const/4 p1, 0x6

    return p1

    :cond_0
    const/4 p1, 0x3

    return p1
.end method

.method public isOnline()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public j(Ljava/lang/CharSequence;)Z
    .locals 0

    instance-of p1, p1, Landroid/text/PrecomputedText;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public k(Lio/sentry/clientreport/d;Lio/sentry/m;J)V
    .locals 0

    return-void
.end method

.method public l(Lng3/k;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg73/d;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-interface {p1, p0}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkg3/d;

    return-object p1

    :pswitch_0
    invoke-static {p1}, Ljg3/e;->r0(Lng3/k;)Ljg3/e;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public n(Lio/sentry/clientreport/d;Lio/sentry/c5;)V
    .locals 0

    return-void
.end method

.method public r(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 1

    sget-object v0, Lk93/b;->w:Lk93/b;

    check-cast p1, Lj93/d;

    invoke-virtual {v0, p1}, Lk93/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    return-object p1
.end method

.method public shutdown()V
    .locals 0

    return-void
.end method

.method public u(Lio/sentry/clientreport/d;Lcom/google/crypto/tink/internal/l0;)V
    .locals 0

    return-void
.end method

.method public y(Lcom/google/crypto/tink/internal/l0;)Lcom/google/crypto/tink/internal/l0;
    .locals 0

    return-object p1
.end method
