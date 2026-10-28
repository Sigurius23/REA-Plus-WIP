.class public final Lt23/a2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt23/x1;

.field public final b:Lt23/l;

.field public final c:Ll83/p;

.field public d:Lc33/e;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public f:Landroid/media/AudioManager;

.field public g:Ld9/c;

.field public final h:Lec3/h2;

.field public final i:Lec3/h2;

.field public final j:Lec3/h2;

.field public final k:Lec3/h2;

.field public final l:Ln53/e;

.field public final m:Lec3/h2;

.field public n:Lc33/l;

.field public final o:Lec3/h2;

.field public final p:Lec3/h2;

.field public final q:Lec3/h2;

.field public final r:Lec3/h2;


# direct methods
.method public constructor <init>(Lt23/x1;Lt23/l;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/a2;->a:Lt23/x1;

    iput-object p2, p0, Lt23/a2;->b:Lt23/l;

    const-string p1, "Media:MicrophoneManager"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt23/a2;->c:Ll83/p;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lt23/a2;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lt23/a2;->h:Lec3/h2;

    const/4 p2, 0x0

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lt23/a2;->i:Lec3/h2;

    sget-object v0, Lt23/p1;->a:Lt23/p1;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lt23/a2;->j:Lec3/h2;

    iput-object v0, p0, Lt23/a2;->k:Lec3/h2;

    sget-object v1, Lt23/l0;->Q:Lt23/l0;

    invoke-static {v0, v1}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    iput-object v0, p0, Lt23/a2;->l:Ln53/e;

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lt23/a2;->m:Lec3/h2;

    iput-object p2, p0, Lt23/a2;->o:Lec3/h2;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/a2;->p:Lec3/h2;

    iput-object p1, p0, Lt23/a2;->q:Lec3/h2;

    sget-object p1, Lstream/video/sfu/models/AudioBitrateProfile;->AUDIO_BITRATE_PROFILE_VOICE_STANDARD_UNSPECIFIED:Lstream/video/sfu/models/AudioBitrateProfile;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/a2;->r:Lec3/h2;

    return-void
.end method

.method public static a(Lt23/a2;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lm5/k;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lt23/a2;->b(Lc93/a;Z)V

    return-void
.end method


# virtual methods
.method public final b(Lc93/a;Z)V
    .locals 7

    const-string v0, "[setup] Calling start on instance "

    monitor-enter p0

    :try_start_0
    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Lt23/a2;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    iget-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Lc93/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    :goto_0
    iput-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object p1, p0, Lt23/a2;->a:Lt23/x1;

    iget-object p1, p1, Lt23/x1;->a:Landroid/content/Context;

    const-class v3, Landroid/media/AudioManager;

    invoke-static {p1, v3}, Ls4/c;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Lt23/a2;->f:Landroid/media/AudioManager;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    const/4 v5, 0x1

    if-lt v3, v4, :cond_3

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v5}, Landroid/media/AudioManager;->setAllowedCapturePolicy(I)V

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lt23/a2;->e()V

    iget-object p1, p0, Lt23/a2;->b:Lt23/l;

    invoke-virtual {p1}, Lt23/l;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-eq p1, v5, :cond_9

    iget-object p1, p0, Lt23/a2;->d:Lc33/e;

    if-nez p1, :cond_9

    new-instance p1, Lc33/e;

    new-instance v3, Lc33/c;

    iget-object v4, p0, Lt23/a2;->a:Lt23/x1;

    iget-object v4, v4, Lt23/x1;->a:Landroid/content/Context;

    const-class v5, Lz40/a;

    const-class v6, Lz40/d;

    filled-new-array {v5, v6}, [Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    if-eqz p2, :cond_4

    const-class p2, Lz40/c;

    const-class v6, Lz40/b;

    filled-new-array {p2, v6}, [Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    goto :goto_2

    :cond_4
    const-class p2, Lz40/b;

    const-class v6, Lz40/c;

    filled-new-array {p2, v6}, [Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    :goto_2
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {v5, p2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    new-instance v5, Lc4/q;

    const/16 v6, 0x9

    invoke-direct {v5, v6, p0, v1}, Lc4/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v3, v4, p2, v5}, Lc33/c;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lc4/q;)V

    invoke-direct {p1, v3}, Lc33/e;-><init>(Lc33/c;)V

    iput-object p1, p0, Lt23/a2;->d:Lc33/e;

    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p2, v1, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    iget-object v3, p0, Lt23/a2;->d:Lc33/e;

    if-eqz v3, :cond_5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v1, p1, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_5
    const-string p1, "audioHandler"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    :goto_3
    iget-object p1, p0, Lt23/a2;->d:Lc33/e;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lc33/e;->a()Lbc3/c0;

    move-result-object p2

    if-nez p2, :cond_7

    goto :goto_4

    :cond_7
    new-instance v0, Lc33/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v2, v1}, Lc33/d;-><init>(Lc33/e;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {p2, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_4

    :cond_8
    const-string p1, "audioHandler"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_9
    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    sget-object v0, Lb23/g;->y:Lb23/g;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p2, v0, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    iget-object p2, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    const-string v3, "[MediaManager#setup] Usage is MEDIA or audioHandle is already initialized"

    invoke-interface {p2, v0, p1, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    iget-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Lc93/a;

    if-eqz p1, :cond_b

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_b
    :goto_4
    monitor-exit p0

    return-void

    :goto_5
    monitor-exit p0

    throw p1
.end method

.method public final c()Lb23/k;
    .locals 1

    iget-object v0, p0, Lt23/a2;->c:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final d(Lc33/l;)V
    .locals 8

    iget-object v0, p0, Lt23/a2;->a:Lt23/x1;

    iget-object v1, v0, Lt23/x1;->g:Lt23/h3;

    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->z:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "selecting device "

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v4, v5, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v2, Lj43/a;

    const/16 v3, 0xa

    invoke-direct {v2, p1, v3}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    iget-object v3, p0, Lt23/a2;->d:Lc33/e;

    if-eqz v3, :cond_1

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "Audio handler not initialized. Ensure calling setup(), before using the handler."

    const/4 v7, 0x0

    invoke-interface {v2, v5, v4, v3, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    iget-object v2, p0, Lt23/a2;->m:Lec3/h2;

    invoke-virtual {v2, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, v0, Lt23/x1;->b:Lt23/c0;

    iget-object v0, v0, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Lc33/j;

    if-nez v0, :cond_3

    iget-object v2, v1, Lt23/h3;->f:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lkotlin/jvm/internal/m;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    iget-object v2, v1, Lt23/h3;->d:Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lt23/n1;->a:Lt23/n1;

    invoke-virtual {v2, v6, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_3
    if-eqz v0, :cond_4

    iget-object v0, v1, Lt23/h3;->d:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lt23/o1;->a:Lt23/o1;

    invoke-virtual {v0, v6, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_4
    instance-of v0, p1, Lc33/h;

    if-nez v0, :cond_5

    instance-of v0, p1, Lc33/k;

    if-nez v0, :cond_5

    iput-object p1, p0, Lt23/a2;->n:Lc33/l;

    :cond_5
    return-void
.end method

.method public final e()V
    .locals 5

    iget-object v0, p0, Lt23/a2;->g:Ld9/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[setupUsbDeviceDetection] Already set up"

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lt23/a2;->f:Landroid/media/AudioManager;

    if-nez v0, :cond_1

    iget-object v0, p0, Lt23/a2;->a:Lt23/x1;

    iget-object v0, v0, Lt23/x1;->a:Landroid/content/Context;

    const-class v2, Landroid/media/AudioManager;

    invoke-static {v0, v2}, Ls4/c;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    :cond_1
    iput-object v0, p0, Lt23/a2;->f:Landroid/media/AudioManager;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[setupUsbDeviceDetection] AudioManager not available"

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    new-instance v2, Ld9/c;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Ld9/c;-><init>(Ljava/lang/Object;I)V

    iput-object v2, p0, Lt23/a2;->g:Ld9/c;

    invoke-virtual {v0, v2, v1}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->z:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[setupUsbDeviceDetection] Registered AudioDeviceCallback"

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-virtual {p0}, Lt23/a2;->f()V

    return-void
.end method

.method public final f()V
    .locals 10

    iget-object v0, p0, Lt23/a2;->f:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    goto/16 :goto_b

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    move-result-object v0

    const-string v2, "getDevices(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v0, v4

    sget-object v6, Lc33/m;->b:Ljava/util/List;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v6, Lc33/m;->b:Ljava/util/List;

    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->isSource()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/media/AudioDeviceInfo;

    new-instance v5, Lc33/m;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v5, v4}, Lc33/m;-><init>(Landroid/media/AudioDeviceInfo;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->z:Lb23/g;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    const/4 v6, 0x0

    if-eqz v4, :cond_5

    iget-object v4, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lc33/m;

    invoke-virtual {v9}, Lc33/m;->a()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v9, "[updateUsbDeviceList] Found "

    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " USB input devices: "

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v5, v2, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object v2, p0, Lt23/a2;->h:Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v6, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v2, p0, Lt23/a2;->i:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_11

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_11

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc33/m;

    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->z:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v0}, Lc33/m;->a()Ljava/lang/String;

    move-result-object v5

    const-string v7, "[updateUsbDeviceList] Auto-selecting USB device: "

    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v2, v5, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lc33/m;->a()Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_7
    move-object v5, v6

    :goto_3
    const-string v7, "[selectUsbDevice] Selecting USB device: "

    invoke-static {v7, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v2, v5, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    iget-object v2, p0, Lt23/a2;->a:Lt23/x1;

    iget-object v2, v2, Lt23/x1;->b:Lt23/c0;

    invoke-virtual {v2}, Lt23/c0;->j()Le33/j0;

    move-result-object v2

    if-eqz v0, :cond_9

    iget-object v3, v0, Lc33/m;->a:Landroid/media/AudioDeviceInfo;

    goto :goto_4

    :cond_9
    move-object v3, v6

    :goto_4
    const-string v5, "[setPreferredAudioInputDevice] ADM not yet initialized, queuing preference: "

    const-string v7, "[setPreferredAudioInputDevice] Set preferred input device: "

    :try_start_0
    iget-object v8, v2, Le33/j0;->p:Lorg/webrtc/audio/JavaAudioDeviceModule;

    if-eqz v8, :cond_b

    invoke-virtual {v8, v3}, Lorg/webrtc/audio/JavaAudioDeviceModule;->setPreferredInputDevice(Landroid/media/AudioDeviceInfo;)V

    invoke-virtual {v2}, Le33/j0;->a()Lb23/k;

    move-result-object v1

    iget-object v5, v1, Lb23/k;->c:Lb23/e;

    iget-object v8, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v4, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d

    iget-object v5, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    move-result-object v3

    goto :goto_5

    :catch_0
    move-exception v1

    goto :goto_9

    :cond_a
    move-object v3, v6

    :goto_5
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v5, v4, v1, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_7

    :cond_b
    iput-object v3, v2, Le33/j0;->q:Landroid/media/AudioDeviceInfo;

    iput-boolean v1, v2, Le33/j0;->r:Z

    invoke-virtual {v2}, Le33/j0;->a()Lb23/k;

    move-result-object v1

    iget-object v7, v1, Lb23/k;->c:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    iget-object v9, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v8, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_d

    iget-object v7, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    move-result-object v3

    goto :goto_6

    :cond_c
    move-object v3, v6

    :goto_6
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v7, v8, v1, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_d
    :goto_7
    iget-object v1, p0, Lt23/a2;->i:Lec3/h2;

    invoke-virtual {v1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lc33/m;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_8

    :cond_e
    move-object v0, v6

    :goto_8
    const-string v3, "[selectUsbDevice] Successfully selected USB device: "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v4, v1, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :goto_9
    invoke-virtual {v2}, Le33/j0;->a()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_f

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v5, "[setPreferredAudioInputDevice] Failed to set preferred device: "

    invoke-static {v5, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v4, v2, v1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    invoke-virtual {p0}, Lt23/a2;->c()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lc33/m;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_a

    :cond_10
    move-object v0, v6

    :goto_a
    const-string v3, "[selectUsbDevice] Failed to select USB device: "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v4, v1, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_11
    :goto_b
    return-void
.end method
