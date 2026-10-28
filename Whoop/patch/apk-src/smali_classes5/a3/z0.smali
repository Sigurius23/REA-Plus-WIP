.class public final La3/z0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La3/z0;->w:I

    iput-object p2, p0, La3/z0;->x:Ljava/lang/Object;

    iput-object p3, p0, La3/z0;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/g0;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, La3/z0;->w:I

    .line 2
    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, La3/z0;->x:Ljava/lang/Object;

    iput-object p2, p0, La3/z0;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lmj/p;Lc93/a;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, La3/z0;->w:I

    .line 3
    iput-object p1, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/m;

    iput-object p2, p0, La3/z0;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    iget v0, p0, La3/z0;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lr5/e;

    invoke-virtual {v0}, Lr5/e;->f()Ljava/util/concurrent/Executor;

    move-result-object v1

    iget-object v2, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v2, Landroidx/credentials/exceptions/GetCredentialException;

    new-instance v4, Lr5/a;

    invoke-direct {v4, v0, v2, v3}, Lr5/a;-><init>(Lr5/e;Landroidx/credentials/exceptions/GetCredentialException;I)V

    invoke-interface {v1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lr5/e;

    invoke-virtual {v0}, Lr5/e;->f()Ljava/util/concurrent/Executor;

    move-result-object v1

    iget-object v3, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/g0;

    new-instance v4, Lr5/b;

    invoke-direct {v4, v2, v0, v3}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lr5/e;

    invoke-virtual {v0}, Lr5/e;->f()Ljava/util/concurrent/Executor;

    move-result-object v1

    iget-object v2, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v2, Lm5/o;

    new-instance v3, Lio/sentry/android/core/r0;

    const/16 v4, 0x1d

    invoke-direct {v3, v4, v0, v2}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lsj/f;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Lcom/amplitude/android/engagement/types/Action;

    invoke-virtual {v0, v1}, Lsj/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lj43/a;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lj43/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/m;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    const-string v0, "PlayServicesImpl"

    const-string v1, "During clear credential, signed out successfully!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Lm5/g;

    new-instance v2, Llr/e;

    const/4 v3, 0x7

    invoke-direct {v2, v1, v3}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_6
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Loj/g;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v0, v1}, Loj/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_7
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Loj/g;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v0, v1}, Loj/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_8
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lnf3/b;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v2, v0, Lnf3/b;->a:Lnf3/a;

    iget-boolean v0, v0, Lnf3/b;->b:Z

    invoke-virtual {v2, v1, v0}, Lnf3/a;->a(Ljava/util/List;Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_9
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lmj/p;

    iget-object v0, v0, Lmj/p;->k:Ljava/util/ArrayList;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/m;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_b
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Ll53/m;

    iget-object v1, v0, Ll53/m;->b:Ljava/util/List;

    iget-object v3, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ll53/m;->b:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v0, v2, v3}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :pswitch_c
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, La30/w0;

    iget-object v2, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v2, Landroid/net/Uri;

    if-eqz v2, :cond_4

    iget-object v4, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v4, Landroid/media/Ringtone;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/media/Ringtone;->isPlaying()Z

    move-result v4

    if-ne v4, v3, :cond_0

    iget-object v4, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v4, Landroid/media/Ringtone;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/media/Ringtone;->stop()V

    :cond_0
    iget-object v4, v0, La30/w0;->x:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    invoke-static {v4, v2}, Landroid/media/RingtoneManager;->getRingtone(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;

    move-result-object v2

    iput-object v2, v0, La30/w0;->F:Ljava/lang/Object;

    if-eqz v2, :cond_1

    new-instance v4, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v4}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v5, 0x6

    invoke-virtual {v4, v5}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    const/4 v5, 0x4

    invoke-virtual {v4, v5}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    invoke-virtual {v4}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/media/Ringtone;->setAudioAttributes(Landroid/media/AudioAttributes;)V

    :cond_1
    iget-object v2, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v2, Landroid/media/Ringtone;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/media/Ringtone;->isPlaying()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v2, Landroid/media/Ringtone;

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v2, v3}, Landroid/media/Ringtone;->setLooping(Z)V

    :goto_0
    iget-object v2, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v2, Landroid/media/Ringtone;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/media/Ringtone;->play()V

    :cond_3
    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[playWithRingtoneManager] Sound playing"

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_d
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, La30/w0;

    iget-object v2, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v2, Lt23/c0;

    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    const-string v6, "[stopCallServiceInternal]"

    invoke-interface {v4, v5, v3, v6, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    sget-object v3, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lt23/i3;->b:Lt23/j3;

    instance-of v4, v3, Lt23/b4;

    if-eqz v4, :cond_6

    check-cast v3, Lt23/b4;

    goto :goto_1

    :cond_6
    move-object v3, v1

    :goto_1
    if-eqz v3, :cond_b

    iget-object v4, v3, Lt23/b4;->K:Lbi/p;

    iget-object v6, v2, Lt23/c0;->b:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object v4

    iget-boolean v6, v4, Lj43/c;->a:Z

    if-eqz v6, :cond_b

    iget-object v3, v3, Lt23/b4;->w:Landroid/content/Context;

    iget-object v6, v0, La30/w0;->z:Ljava/lang/Object;

    check-cast v6, Lj43/g;

    new-instance v7, Lj43/j;

    invoke-direct {v7, v2, v4}, Lj43/j;-><init>(Lt23/c0;Lj43/c;)V

    invoke-virtual {v6, v3, v7}, Lj43/g;->b(Landroid/content/Context;Lj43/j;)Landroid/content/Intent;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object v6

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    iget-object v8, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v5, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    iget-object v7, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v4}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v8

    if-eqz v8, :cond_7

    invoke-virtual {v8}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_7
    move-object v8, v1

    :goto_2
    iget-object v2, v2, Lt23/c0;->v:Ljava/lang/String;

    const-string v9, "Building stop intent, class: "

    const-string v10, " for call_id: "

    invoke-static {v9, v8, v10, v2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v5, v6, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_a

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "key:"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", value="

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\n"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_9
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "toString(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_a

    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v7, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v5, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, " [maybeStopForegroundService], stop intent extras: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v5, v0, v6, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    invoke-virtual {v3, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_e
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/video/android/core/notifications/internal/service/CallService;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Lt23/c0;

    sget-object v2, Lio/getstream/video/android/core/notifications/internal/service/CallService;->I:Ll83/p;

    invoke-virtual {v0, v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->c(Lt23/c0;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_f
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "Received action "

    const-string v3, ", but: "

    invoke-static {v2, v0, v3, v1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_10
    new-instance v0, Lb2/z;

    iget-object v1, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v1, Li53/j;

    iget-object v2, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v2, Lqg3/d;

    const/16 v3, 0xd

    invoke-direct {v0, v3, v1, v2}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lz43/b;

    invoke-direct {v1}, Lz43/b;-><init>()V

    invoke-virtual {v0, v1}, Lb2/z;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Lz43/b;->a:Ljava/lang/Object;

    if-eqz v0, :cond_c

    new-instance v2, Ly43/b;

    iget-object v3, v1, Lz43/b;->b:Ljava/util/LinkedHashMap;

    iget-object v1, v1, Lz43/b;->c:Lkotlin/jvm/internal/m;

    invoke-direct {v2, v0, v3, v1}, Ly43/b;-><init>(Ljava/lang/Object;Ljava/util/Map;Lc93/m;)V

    return-object v2

    :cond_c
    const-string v0, "Initial state must be set!"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_11
    iget-object v0, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;

    iget-object v1, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    const-string v2, "call_cid"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lv8/b;->Y(Ljava/lang/String;)Ll83/k;

    move-result-object v2

    new-instance v3, Lio/getstream/video/android/model/StreamCallId;

    iget-object v4, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lio/getstream/video/android/model/StreamCallId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "type"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "call.ring"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-static {v0, v3, v1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->access$handleRingType(Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V

    goto :goto_4

    :cond_d
    const-string v4, "call.missed"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-static {v0, v3, v1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->access$handleMissedType(Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V

    goto :goto_4

    :cond_e
    const-string v4, "call.notification"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-static {v0, v3, v1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->access$handleNotificationType(Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V

    goto :goto_4

    :cond_f
    const-string v4, "call.live_started"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-static {v0, v3, v1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->access$handleLiveStartedType(Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V

    :cond_10
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_12
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lgb/q;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Leb/q;

    invoke-virtual {v0, v1, v2}, Lgb/q;->i(Leb/q;Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_13
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Lg2/x;

    invoke-virtual {v1}, Lg2/x;->Y0()Lg2/o;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_14
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lgv/d;

    new-instance v1, Lb30/q3;

    iget-object v2, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v2, Lfv/h;

    invoke-direct {v1, v2, v3}, Lb30/q3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lgv/d;->i(Lb30/q3;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_15
    iget-object v0, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v0, Lfv/h;

    iget-object v1, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v1, [Landroid/animation/ValueAnimator;

    array-length v3, v1

    move v4, v2

    :goto_5
    if-ge v4, v3, :cond_12

    aget-object v5, v1, v4

    instance-of v6, v5, Lgv/d;

    if-eqz v6, :cond_11

    check-cast v5, Lgv/d;

    sget-object v6, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v7, La3/z0;

    const/16 v8, 0x8

    invoke-direct {v7, v8, v5, v0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v7}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_11
    const-string v0, "Mbgl-CameraManager"

    const-string v1, "All animators must be CameraAnimator\'s to be registered!"

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_12
    iget-object v0, v0, Lfv/h;->w:Ljava/util/HashSet;

    new-instance v3, Ljava/util/ArrayList;

    array-length v4, v1

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, v1

    :goto_6
    if-ge v2, v4, :cond_13

    aget-object v5, v1, v2

    const-string v6, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.animator.CameraAnimator<*>"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lgv/d;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_13
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_16
    new-instance v0, Lb2/z;

    iget-object v1, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v1, Lg53/m;

    iget-object v2, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v2, Lio/sentry/internal/debugmeta/c;

    const/16 v3, 0xb

    invoke-direct {v0, v3, v1, v2}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lz43/b;

    invoke-direct {v1}, Lz43/b;-><init>()V

    invoke-virtual {v0, v1}, Lb2/z;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Lz43/b;->a:Ljava/lang/Object;

    if-eqz v0, :cond_14

    new-instance v2, Ly43/b;

    iget-object v3, v1, Lz43/b;->b:Ljava/util/LinkedHashMap;

    iget-object v1, v1, Lz43/b;->c:Lkotlin/jvm/internal/m;

    invoke-direct {v2, v0, v3, v1}, Ly43/b;-><init>(Ljava/lang/Object;Ljava/util/Map;Lc93/m;)V

    return-object v2

    :cond_14
    const-string v0, "Initial state must be set!"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_17
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_16

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/c;

    if-nez v0, :cond_15

    goto :goto_8

    :cond_15
    move-object v1, v0

    goto :goto_a

    :cond_16
    :goto_8
    iget-object v0, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v2

    iget-boolean v2, v2, Lb2/v;->N:Z

    if-eqz v2, :cond_17

    goto :goto_9

    :cond_17
    move-object v0, v1

    :goto_9
    if-eqz v0, :cond_18

    iget-wide v0, v0, Ly2/j1;->y:J

    invoke-static {v0, v1}, Lv63/b;->l(J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object v1

    :cond_18
    :goto_a
    return-object v1

    :pswitch_18
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Lcx/j;

    iget-object v2, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    const-string v3, "$grantResults"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "task"

    const-string v4, "android.permission.READ_MEDIA_VIDEO"

    const-string v5, "android.permission.READ_MEDIA_IMAGES"

    const-string v6, "pb"

    invoke-virtual {v0}, Lcx/j;->y()Z

    move-result v7

    if-eqz v7, :cond_54

    iget-object v7, v0, Lcx/j;->x:Lcx/k;

    if-eqz v7, :cond_53

    iget-object v7, v7, Lcx/k;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v7}, Ljava/util/Set;->clear()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_21

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_1c

    iget-object v9, v0, Lcx/j;->x:Lcx/k;

    if-eqz v9, :cond_1b

    iget-object v9, v9, Lcx/k;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v9, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v9, v0, Lcx/j;->x:Lcx/k;

    if-eqz v9, :cond_1a

    iget-object v9, v9, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-interface {v9, v10}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v9, v0, Lcx/j;->x:Lcx/k;

    if-eqz v9, :cond_19

    iget-object v9, v9, Lcx/k;->h:Ljava/util/LinkedHashSet;

    invoke-interface {v9, v10}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_19
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1a
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1b
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1c
    invoke-virtual {v0, v10}, Landroidx/fragment/app/m0;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1e

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v9, v0, Lcx/j;->x:Lcx/k;

    if-eqz v9, :cond_1d

    iget-object v9, v9, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-interface {v9, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_1d
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1e
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v9, v0, Lcx/j;->x:Lcx/k;

    if-eqz v9, :cond_20

    iget-object v9, v9, Lcx/k;->h:Ljava/util/LinkedHashSet;

    invoke-interface {v9, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v9, v0, Lcx/j;->x:Lcx/k;

    if-eqz v9, :cond_1f

    iget-object v9, v9, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-interface {v9, v10}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_1f
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_20
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_21
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x22

    if-lt v2, v9, :cond_32

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_31

    iget-object v2, v2, Lcx/k;->f:Ljava/util/LinkedHashSet;

    const-string v9, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"

    invoke-interface {v2, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_32

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_30

    iget-object v2, v2, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_24

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_23

    iget-object v2, v2, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_22

    iget-object v2, v2, Lcx/k;->j:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_22
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_23
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_24
    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_2f

    iget-object v2, v2, Lcx/k;->h:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_26

    iget-object v2, v2, Lcx/k;->h:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_25

    iget-object v2, v2, Lcx/k;->j:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_25
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_26
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_27
    :goto_c
    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_2e

    iget-object v2, v2, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2a

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_29

    iget-object v2, v2, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_28

    iget-object v2, v2, Lcx/k;->j:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_28
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_29
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2a
    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_2d

    iget-object v2, v2, Lcx/k;->h:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_32

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_2c

    iget-object v2, v2, Lcx/k;->h:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_2b

    iget-object v2, v2, Lcx/k;->j:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_2b
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2c
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2d
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2e
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2f
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_30
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_31
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_32
    :goto_d
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v0, Lcx/j;->x:Lcx/k;

    if-eqz v4, :cond_52

    iget-object v4, v4, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v4, v0, Lcx/j;->x:Lcx/k;

    if-eqz v4, :cond_51

    iget-object v4, v4, Lcx/k;->h:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_33
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_36

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v4}, Ls4/d;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_33

    iget-object v5, v0, Lcx/j;->x:Lcx/k;

    if-eqz v5, :cond_35

    iget-object v5, v5, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-interface {v5, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v5, v0, Lcx/j;->x:Lcx/k;

    if-eqz v5, :cond_34

    iget-object v5, v5, Lcx/k;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_34
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_35
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_36
    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_50

    iget-object v2, v2, Lcx/k;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    iget-object v4, v0, Lcx/j;->x:Lcx/k;

    if-eqz v4, :cond_4f

    iget-object v4, v4, Lcx/k;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v4

    if-ne v2, v4, :cond_38

    iget-object v0, v0, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_37

    check-cast v0, Lcx/a;

    invoke-virtual {v0}, Lcx/a;->a()V

    goto/16 :goto_14

    :cond_37
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_38
    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_4e

    iget-object v2, v2, Lcx/k;->m:Lax/a;

    if-nez v2, :cond_39

    goto :goto_f

    :cond_39
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3e

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_3d

    iget-object v2, v2, Lcx/k;->m:Lax/a;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, v0, Lcx/j;->y:Lcx/b;

    if-eqz v4, :cond_3c

    check-cast v4, Lcx/a;

    iget-object v4, v4, Lcx/a;->c:Lcx/c;

    new-instance v5, Ljava/util/ArrayList;

    iget-object v7, v0, Lcx/j;->x:Lcx/k;

    if-eqz v7, :cond_3b

    iget-object v7, v7, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v2, v4, v5}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_3a

    iget-object v2, v2, Lcx/k;->i:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v8}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_11

    :cond_3a
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3b
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3c
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3d
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3e
    :goto_f
    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_4d

    iget-object v2, v2, Lcx/k;->n:Lax/b;

    if-eqz v2, :cond_46

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_40

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_3f

    iget-object v2, v2, Lcx/k;->i:Ljava/util/LinkedHashSet;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    goto :goto_10

    :cond_3f
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_40
    :goto_10
    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_45

    iget-object v2, v2, Lcx/k;->i:Ljava/util/LinkedHashSet;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_44

    iget-object v2, v2, Lcx/k;->n:Lax/b;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, v0, Lcx/j;->y:Lcx/b;

    if-eqz v4, :cond_43

    check-cast v4, Lcx/a;

    iget-object v4, v4, Lcx/a;->d:Lcx/d;

    new-instance v5, Ljava/util/ArrayList;

    iget-object v7, v0, Lcx/j;->x:Lcx/k;

    if-eqz v7, :cond_42

    iget-object v7, v7, Lcx/k;->h:Ljava/util/LinkedHashSet;

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v2, v4, v5}, Lax/b;->e(Lcx/d;Ljava/util/ArrayList;)V

    :goto_11
    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_41

    goto :goto_12

    :cond_41
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_42
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_43
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_44
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_45
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_46
    :goto_12
    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_4c

    iget-object v2, v2, Lcx/k;->j:Ljava/util/LinkedHashSet;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_48

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Lcx/j;->x:Lcx/k;

    if-eqz v5, :cond_47

    iget-object v5, v5, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_47
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_48
    iget-object v2, v0, Lcx/j;->x:Lcx/k;

    if-eqz v2, :cond_4b

    iget-object v2, v2, Lcx/k;->j:Ljava/util/LinkedHashSet;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    iget-object v2, v0, Lcx/j;->y:Lcx/b;

    if-eqz v2, :cond_4a

    check-cast v2, Lcx/a;

    invoke-virtual {v2}, Lcx/a;->a()V

    iget-object v0, v0, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_49

    goto :goto_14

    :cond_49
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4a
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4b
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4c
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4d
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4e
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4f
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_50
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_51
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_52
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_53
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_54
    :goto_14
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_19
    iget-object v0, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v0, Lb3/h0;

    iget-object v1, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v1, Lb3/v2;

    iget-object v2, v1, Lb3/v2;->E:Li3/j;

    iget-object v3, v1, Lb3/v2;->F:Li3/j;

    iget-object v4, v1, Lb3/v2;->y:Ljava/lang/Float;

    iget-object v5, v1, Lb3/v2;->z:Ljava/lang/Float;

    const/4 v6, 0x0

    if-eqz v2, :cond_55

    if-eqz v4, :cond_55

    iget-object v7, v2, Li3/j;->a:Lc93/a;

    invoke-interface {v7}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    sub-float/2addr v7, v4

    goto :goto_15

    :cond_55
    move v7, v6

    :goto_15
    if-eqz v3, :cond_56

    if-eqz v5, :cond_56

    iget-object v4, v3, Li3/j;->a:Lc93/a;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    sub-float/2addr v4, v5

    goto :goto_16

    :cond_56
    move v4, v6

    :goto_16
    cmpg-float v5, v7, v6

    if-nez v5, :cond_57

    cmpg-float v4, v4, v6

    if-nez v4, :cond_57

    goto :goto_17

    :cond_57
    iget v4, v1, Lb3/v2;->w:I

    invoke-virtual {v0, v4}, Lb3/h0;->A(I)I

    move-result v4

    invoke-virtual {v0}, Lb3/h0;->t()La0/s;

    move-result-object v5

    iget v6, v0, Lb3/h0;->n:I

    invoke-virtual {v5, v6}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li3/q;

    if-eqz v5, :cond_58

    :try_start_1
    iget-object v6, v0, Lb3/h0;->p:Li5/f;

    if-eqz v6, :cond_58

    invoke-virtual {v0, v5}, Lb3/h0;->k(Li3/q;)Landroid/graphics/Rect;

    move-result-object v5

    iget-object v6, v6, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_58
    invoke-virtual {v0}, Lb3/h0;->t()La0/s;

    move-result-object v5

    iget v6, v0, Lb3/h0;->o:I

    invoke-virtual {v5, v6}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li3/q;

    if-eqz v5, :cond_59

    :try_start_2
    iget-object v6, v0, Lb3/h0;->q:Li5/f;

    if-eqz v6, :cond_59

    invoke-virtual {v0, v5}, Lb3/h0;->k(Li3/q;)Landroid/graphics/Rect;

    move-result-object v5

    iget-object v6, v6, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_59
    iget-object v5, v0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    invoke-virtual {v0}, Lb3/h0;->t()La0/s;

    move-result-object v5

    invoke-virtual {v5, v4}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li3/q;

    if-eqz v5, :cond_5c

    iget-object v5, v5, Li3/q;->a:Li3/p;

    if-eqz v5, :cond_5c

    iget-object v5, v5, Li3/p;->c:La3/n0;

    if-eqz v5, :cond_5c

    if-eqz v2, :cond_5a

    iget-object v6, v0, Lb3/h0;->s:La0/g0;

    invoke-virtual {v6, v4, v2}, La0/g0;->h(ILjava/lang/Object;)V

    :cond_5a
    if-eqz v3, :cond_5b

    iget-object v6, v0, Lb3/h0;->t:La0/g0;

    invoke-virtual {v6, v4, v3}, La0/g0;->h(ILjava/lang/Object;)V

    :cond_5b
    invoke-virtual {v0, v5}, Lb3/h0;->w(La3/n0;)V

    :cond_5c
    :goto_17
    if-eqz v2, :cond_5d

    iget-object v0, v2, Li3/j;->a:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    iput-object v0, v1, Lb3/v2;->y:Ljava/lang/Float;

    :cond_5d
    if-eqz v3, :cond_5e

    iget-object v0, v3, Li3/j;->a:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    iput-object v0, v1, Lb3/v2;->z:Ljava/lang/Float;

    :cond_5e
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1a
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Landroid/view/MotionEvent;

    invoke-static {v1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->b(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v1, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v1, Landroid/view/KeyEvent;

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->c(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/KeyEvent;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, La3/z0;->x:Ljava/lang/Object;

    check-cast v0, La3/c1;

    iget-object v1, v0, La3/c1;->F:La3/r0;

    iput v2, v1, La3/r0;->h:I

    iget-object v4, v1, La3/r0;->a:La3/n0;

    invoke-virtual {v4}, La3/n0;->M()Lr1/c;

    move-result-object v4

    iget-object v5, v4, Lr1/c;->w:[Ljava/lang/Object;

    iget v4, v4, Lr1/c;->y:I

    move v6, v2

    :goto_18
    const v7, 0x7fffffff

    if-ge v6, v4, :cond_60

    aget-object v8, v5, v6

    check-cast v8, La3/n0;

    invoke-virtual {v8}, La3/n0;->t()La3/r0;

    move-result-object v8

    iget-object v8, v8, La3/r0;->q:La3/c1;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v9, v8, La3/c1;->I:I

    iput v9, v8, La3/c1;->H:I

    iput v7, v8, La3/c1;->I:I

    iget-object v7, v8, La3/c1;->J:La3/j0;

    sget-object v9, La3/j0;->x:La3/j0;

    if-ne v7, v9, :cond_5f

    sget-object v7, La3/j0;->y:La3/j0;

    iput-object v7, v8, La3/c1;->J:La3/j0;

    :cond_5f
    add-int/lit8 v6, v6, 0x1

    goto :goto_18

    :cond_60
    iget-object v4, v1, La3/r0;->a:La3/n0;

    iget-object v1, v1, La3/r0;->a:La3/n0;

    invoke-virtual {v4}, La3/n0;->M()Lr1/c;

    move-result-object v4

    iget-object v5, v4, Lr1/c;->w:[Ljava/lang/Object;

    iget v4, v4, Lr1/c;->y:I

    move v6, v2

    :goto_19
    if-ge v6, v4, :cond_61

    aget-object v8, v5, v6

    check-cast v8, La3/n0;

    invoke-virtual {v8}, La3/n0;->t()La3/r0;

    move-result-object v8

    iget-object v8, v8, La3/r0;->q:La3/c1;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v8, v8, La3/c1;->S:La3/s0;

    iput-boolean v2, v8, La3/a;->d:Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_19

    :cond_61
    invoke-virtual {v0}, La3/c1;->J()Landroidx/compose/ui/node/a;

    move-result-object v4

    iget-object v4, v4, Landroidx/compose/ui/node/a;->q0:La3/w;

    if-eqz v4, :cond_63

    iget-boolean v4, v4, La3/w0;->K:Z

    invoke-virtual {v1}, La3/n0;->q()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v6

    move v8, v2

    :goto_1a
    if-ge v8, v6, :cond_63

    move-object v9, v5

    check-cast v9, Lr1/b;

    invoke-virtual {v9, v8}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La3/n0;

    iget-object v9, v9, La3/n0;->e0:La3/l1;

    iget-object v9, v9, La3/l1;->e:Ljava/lang/Object;

    check-cast v9, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v9}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v9

    if-eqz v9, :cond_62

    iput-boolean v4, v9, La3/w0;->K:Z

    :cond_62
    add-int/lit8 v8, v8, 0x1

    goto :goto_1a

    :cond_63
    iget-object v4, p0, La3/z0;->y:Ljava/lang/Object;

    check-cast v4, La3/x0;

    invoke-virtual {v4}, La3/x0;->O0()Ly2/s0;

    move-result-object v4

    invoke-interface {v4}, Ly2/s0;->b()V

    invoke-virtual {v0}, La3/c1;->J()Landroidx/compose/ui/node/a;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->q0:La3/w;

    if-eqz v0, :cond_65

    invoke-virtual {v1}, La3/n0;->q()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v4

    move v5, v2

    :goto_1b
    if-ge v5, v4, :cond_65

    move-object v6, v0

    check-cast v6, Lr1/b;

    invoke-virtual {v6, v5}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La3/n0;

    iget-object v6, v6, La3/n0;->e0:La3/l1;

    iget-object v6, v6, La3/l1;->e:Ljava/lang/Object;

    check-cast v6, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v6}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v6

    if-eqz v6, :cond_64

    iput-boolean v2, v6, La3/w0;->K:Z

    :cond_64
    add-int/lit8 v5, v5, 0x1

    goto :goto_1b

    :cond_65
    invoke-virtual {v1}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v4, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    move v5, v2

    :goto_1c
    if-ge v5, v0, :cond_67

    aget-object v6, v4, v5

    check-cast v6, La3/n0;

    invoke-virtual {v6}, La3/n0;->t()La3/r0;

    move-result-object v6

    iget-object v6, v6, La3/r0;->q:La3/c1;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v8, v6, La3/c1;->H:I

    iget v9, v6, La3/c1;->I:I

    if-eq v8, v9, :cond_66

    if-ne v9, v7, :cond_66

    invoke-virtual {v6, v3}, La3/c1;->C0(Z)V

    :cond_66
    add-int/lit8 v5, v5, 0x1

    goto :goto_1c

    :cond_67
    invoke-virtual {v1}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    :goto_1d
    if-ge v2, v0, :cond_68

    aget-object v3, v1, v2

    check-cast v3, La3/n0;

    invoke-virtual {v3}, La3/n0;->t()La3/r0;

    move-result-object v3

    iget-object v3, v3, La3/r0;->q:La3/c1;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, v3, La3/c1;->S:La3/s0;

    iget-boolean v4, v3, La3/a;->d:Z

    iput-boolean v4, v3, La3/a;->e:Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1d

    :cond_68
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

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
