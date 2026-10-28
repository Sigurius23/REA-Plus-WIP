.class public final Lav/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lav/b;->w:I

    iput-object p1, p0, Lav/b;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lav/b;->w:I

    const/16 v1, 0x29

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    iget-object v6, p0, Lav/b;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v6, Leu/f;

    new-instance v0, Landroidx/credentials/exceptions/CreateCredentialUnsupportedException;

    const-string v1, "Your device doesn\'t support credential manager"

    invoke-direct {v0, v1}, Landroidx/credentials/exceptions/CreateCredentialUnsupportedException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Leu/f;->a(Ljava/lang/Object;)V

    return-object v5

    :pswitch_0
    check-cast v6, Lpb/f;

    move-object v0, v6

    check-cast v0, Landroidx/lifecycle/f2;

    const-string v1, "storeOwner"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljf3/a;

    invoke-interface {v0}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v0

    const-string v2, "storeOwner.viewModelStore"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0, v6}, Ljf3/a;-><init>(Landroidx/lifecycle/e2;Lpb/f;)V

    return-object v1

    :pswitch_1
    const-string v0, "Encoder doesn\'t support the provided bitRate: "

    check-cast v6, Lio/sentry/android/replay/video/d;

    iget-object v1, v6, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/replay/video/a;

    iget-object v2, v6, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    check-cast v2, Lio/sentry/q6;

    iget-object v4, v1, Lio/sentry/android/replay/video/a;->f:Ljava/lang/String;

    iget v5, v1, Lio/sentry/android/replay/video/a;->e:I

    :try_start_0
    iget-object v6, v6, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v6, Landroid/media/MediaCodec;

    invoke-virtual {v6}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    move-result-object v6

    invoke-virtual {v6, v4}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v6

    invoke-virtual {v6}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v6

    invoke-virtual {v6}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    sget-object v8, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", the value will be clamped to the closest one"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v7, v8, v0, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v6}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v0

    const-string v3, "clamp(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v6, "Could not retrieve MediaCodec info"

    invoke-interface {v2, v3, v6, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget v0, v1, Lio/sentry/android/replay/video/a;->b:I

    iget v2, v1, Lio/sentry/android/replay/video/a;->c:I

    invoke-static {v4, v0, v2}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v0

    const-string v2, "createVideoFormat(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "color-format"

    const v3, 0x7f000789

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v2, "bitrate"

    invoke-virtual {v0, v2, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget v1, v1, Lio/sentry/android/replay/video/a;->d:I

    int-to-float v1, v1

    const-string v2, "frame-rate"

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    const-string v1, "i-frame-interval"

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    return-object v0

    :pswitch_2
    new-instance v0, Landroid/graphics/Canvas;

    check-cast v6, Lio/sentry/android/replay/util/c;

    iget-object v1, v6, Lio/sentry/android/replay/util/c;->w:Ljava/lang/Object;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    return-object v0

    :pswitch_3
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    check-cast v6, Lio/sentry/android/replay/screenshot/c;

    iget-object v1, v6, Lio/sentry/android/replay/screenshot/c;->d:Lio/sentry/android/replay/w;

    iget v2, v1, Lio/sentry/android/replay/w;->c:F

    iget v1, v1, Lio/sentry/android/replay/w;->d:F

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    return-object v0

    :pswitch_4
    new-instance v0, Lio/sentry/j0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lio/sentry/j0;-><init>(I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lio/sentry/android/replay/util/d;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v6, Lio/sentry/android/replay/capture/c;

    iget-object v2, v6, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/q6;

    invoke-direct {v1, v0, v2}, Lio/sentry/android/replay/util/d;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lio/sentry/q6;)V

    return-object v1

    :pswitch_5
    check-cast v6, Lio/sentry/android/replay/v;

    iget-object v0, v6, Lio/sentry/android/replay/v;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-object v5

    :pswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "AmplitudeEngagement.sdk#screen(screenName="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Ljava/lang/String;

    invoke-static {v0, v6, v1}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "AmplitudeEngagement.sdk#handlePreviewLinkIntent(intent="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Landroid/content/Intent;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v6, Lh53/e;

    iget-object v0, v6, Lh53/e;->g:Ljava/lang/Object;

    check-cast v0, Lz33/b;

    invoke-virtual {v0}, Lz33/b;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v6, Lg2/x;

    invoke-virtual {v6}, Lg2/x;->Y0()Lg2/o;

    return-object v5

    :pswitch_a
    check-cast v6, Lg/z;

    invoke-virtual {v6}, Lg/z;->d()V

    return-object v5

    :pswitch_b
    check-cast v6, Lg/l;

    invoke-virtual {v6}, Lg/l;->reportFullyDrawn()V

    return-object v5

    :pswitch_c
    check-cast v6, Lfv/h;

    sget-object v0, Lfv/h;->W:[Lj93/z;

    invoke-virtual {v6}, Lfv/h;->e()V

    return-object v5

    :pswitch_d
    check-cast v6, Landroid/animation/AnimatorSet;

    invoke-virtual {v6}, Landroid/animation/AnimatorSet;->start()V

    return-object v5

    :pswitch_e
    check-cast v6, Lf53/j;

    iget-object v0, v6, Lf53/j;->g:Lz33/b;

    invoke-virtual {v0}, Lz33/b;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_f
    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    check-cast v6, Lew/d;

    new-instance v1, La6/i1;

    invoke-direct {v1, v0}, La6/i1;-><init>(Lne3/h;)V

    invoke-virtual {v6, v1}, Lew/d;->a(Ljava/io/OutputStream;)V

    iget-wide v0, v0, Lne3/h;->x:J

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v6, Lew/b;

    iget-object v0, v6, Lew/b;->w:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_1

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v6, "ROOT"

    const-string v7, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v5, v6, v3, v5, v7}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_1
    move-object v3, v4

    :goto_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-object v1

    :pswitch_11
    check-cast v6, Leu/k0;

    invoke-virtual {v6}, Leu/k0;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v6, Leu/g0;

    invoke-virtual {v6}, Leu/g0;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_13
    check-cast v6, Lc4/l;

    invoke-virtual {v6}, Lc4/l;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_14
    check-cast v6, Le8/e;

    invoke-static {}, Landroidx/health/platform/client/proto/m2;->x()Landroidx/health/platform/client/proto/l2;

    move-result-object v0

    iget-object v1, v6, Le8/e;->x:Ljava/lang/String;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/m2;

    invoke-static {v2, v1}, Landroidx/health/platform/client/proto/m2;->p(Landroidx/health/platform/client/proto/m2;Ljava/lang/String;)V

    iget v1, v6, Le8/e;->y:I

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/m2;

    invoke-static {v2, v1}, Landroidx/health/platform/client/proto/m2;->q(Landroidx/health/platform/client/proto/m2;I)V

    iget-object v1, v6, Le8/e;->z:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/m2;

    invoke-static {v2, v1}, Landroidx/health/platform/client/proto/m2;->r(Landroidx/health/platform/client/proto/m2;Ljava/lang/String;)V

    :cond_3
    iget-boolean v1, v6, Le8/e;->E:Z

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/m2;

    invoke-static {v2, v1}, Landroidx/health/platform/client/proto/m2;->s(Landroidx/health/platform/client/proto/m2;Z)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/m2;

    return-object v0

    :pswitch_15
    new-instance v0, Lcom/squareup/wire/s;

    check-cast v6, Lcom/squareup/wire/v;

    iget-object v1, v6, Lcom/squareup/wire/v;->f:Ljava/lang/Object;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lne3/h;

    invoke-direct {v0, v1}, Lcom/squareup/wire/s;-><init>(Lne3/i;)V

    return-object v0

    :pswitch_16
    check-cast v6, Ld53/b;

    iget-object v0, v6, Ld53/b;->w:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_17
    check-cast v6, Lc4/f0;

    invoke-static {v6}, Lc4/f0;->i(Lc4/f0;)Ly2/y;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ly2/y;->g()Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v4, v0

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v6}, Lc4/f0;->getPopupContentSize-bOM6tXw()Ly3/l;

    move-result-object v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    move v2, v3

    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    check-cast v6, La33/d;

    iget-object v1, v6, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/c1;

    invoke-static {v0, v1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    return-object v0

    :pswitch_19
    check-cast v6, Lbc3/t;

    invoke-virtual {v6, v5}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1a
    check-cast v6, Lh0/o1;

    instance-of v0, v6, Lx03/i;

    if-eqz v0, :cond_6

    check-cast v6, Lx03/i;

    goto :goto_4

    :cond_6
    move-object v6, v4

    :goto_4
    if-eqz v6, :cond_7

    iget-object v0, v6, Lx03/i;->f:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    :cond_7
    return-object v4

    :pswitch_1b
    check-cast v6, Lb3/x0;

    iget-object v0, v6, Lb3/x0;->y:Lbc3/c0;

    invoke-static {v0, v4}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-object v5

    :pswitch_1c
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    check-cast v6, Lav/e;

    new-instance v1, Lyu/a;

    invoke-virtual {v6}, Lav/e;->e()Ljava/lang/String;

    move-result-object v2

    const-string v3, "type"

    invoke-direct {v1, v3, v2}, Lyu/a;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
