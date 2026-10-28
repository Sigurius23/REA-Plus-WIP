.class public Lio/getstream/video/android/core/notifications/internal/service/CallService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lio/getstream/video/android/core/notifications/internal/service/CallService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "g73/d",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final I:Ll83/p;

.field public static final J:Lc53/b;


# instance fields
.field public final E:Lxl/a;

.field public final F:Lhc3/d;

.field public final G:Lgm/r;

.field public final H:Lj43/g;

.field public final w:Ll83/p;

.field public final x:Lio/sentry/internal/debugmeta/c;

.field public final y:Lj43/g;

.field public final z:Lxl/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg73/d;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    const-string v1, "CallService"

    invoke-static {v0, v1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    sput-object v0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->I:Ll83/p;

    new-instance v0, Lc53/b;

    const/4 v1, 0x1

    sget-object v2, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {v0, v2, v1}, Lc53/b;-><init>(Lq83/i;I)V

    sput-object v0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->J:Lc53/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const-string v0, "CallService"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->w:Ll83/p;

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    const/16 v1, 0x1c

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/internal/debugmeta/c;-><init>(IB)V

    iput-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->x:Lio/sentry/internal/debugmeta/c;

    new-instance v0, Lj43/g;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lj43/g;-><init>(I)V

    iput-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->y:Lj43/g;

    new-instance v0, Lxl/a;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, Lxl/a;-><init>(I)V

    iput-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    new-instance v2, Lxl/a;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lxl/a;-><init>(I)V

    iput-object v2, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->E:Lxl/a;

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lkc3/d;->w:Lkc3/d;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v2, v4, v3, v1, v3}, Lbc3/z;->limitedParallelism$default(Lbc3/z;ILjava/lang/String;ILjava/lang/Object;)Lbc3/z;

    move-result-object v1

    sget-object v2, Lio/getstream/video/android/core/notifications/internal/service/CallService;->J:Lc53/b;

    invoke-virtual {v1, v2}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v2

    invoke-interface {v1, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    invoke-static {v1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->F:Lhc3/d;

    new-instance v2, Lgm/r;

    invoke-direct {v2, v0, v1}, Lgm/r;-><init>(Lxl/a;Lhc3/d;)V

    iput-object v2, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->G:Lgm/r;

    new-instance v0, Lj43/g;

    invoke-direct {v0, v4}, Lj43/g;-><init>(I)V

    iput-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->H:Lj43/g;

    return-void
.end method


# virtual methods
.method public final a()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->w:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final b()V
    .locals 14

    const-string v1, "Exception occurred: "

    const-string v2, "SafeCall"

    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    iget-object v3, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v6

    const-string v7, "[internalStopServiceGracefully] hashcode: "

    invoke-static {v6, v7}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v4, v0, v6, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(I)V

    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    invoke-virtual {v0}, Lxl/a;->s()Lio/getstream/video/android/model/StreamCallId;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v3, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->G:Lgm/r;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v6

    const-string v7, "from(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v3, Lgm/r;->z:Ljava/lang/Object;

    check-cast v7, Ll83/p;

    invoke-virtual {v7}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb23/k;

    iget-object v8, v7, Lb23/k;->c:Lb23/e;

    iget-object v9, v7, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v4, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    iget-object v8, v7, Lb23/k;->b:Lb23/j;

    iget-object v7, v7, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v0}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result v9

    const-string v10, "[cancelNotifications], notificationId via hashcode: "

    invoke-static {v9, v10}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v4, v7, v9, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {v0}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result v7

    invoke-virtual {v6, v7}, Landroidx/core/app/NotificationManagerCompat;->cancel(I)V

    iget-object v7, v3, Lgm/r;->x:Ljava/lang/Object;

    check-cast v7, Lxl/a;

    iget-object v7, v7, Lxl/a;->y:Ljava/lang/Object;

    check-cast v7, Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm43/b;

    iget-object v7, v7, Lm43/b;->b:Ljava/lang/Integer;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    iget-object v3, v3, Lgm/r;->z:Ljava/lang/Object;

    check-cast v3, Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb23/k;

    iget-object v8, v3, Lb23/k;->c:Lb23/e;

    iget-object v9, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v4, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    iget-object v8, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    const-string v9, "[cancelNotifications], notificationId from stateController: "

    invoke-static {v7, v9}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v4, v3, v9, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {v6, v7}, Landroidx/core/app/NotificationManagerCompat;->cancel(I)V

    :cond_3
    :try_start_0
    sget-object v3, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lt23/i3;->b:Lt23/j3;

    instance-of v4, v3, Lt23/b4;

    if-eqz v4, :cond_4

    check-cast v3, Lt23/b4;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_4
    move-object v3, v5

    :goto_0
    if-eqz v3, :cond_5

    iget-object v3, v3, Lt23/b4;->H:Lh43/b;

    if-eqz v3, :cond_5

    iget-object v3, v3, Lh43/b;->x:Le43/g;

    if-eqz v3, :cond_5

    iget-object v3, v3, Le43/g;->c:Le43/h;

    goto :goto_1

    :cond_5
    move-object v3, v5

    :goto_1
    instance-of v4, v3, Lg43/j;

    if-eqz v4, :cond_6

    check-cast v3, Lg43/j;

    goto :goto_2

    :cond_6
    move-object v3, v5

    :goto_2
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v3, v3, Lg43/j;->I:Lg43/e;

    invoke-virtual {v3, v0}, Lg43/e;->a(Lio/getstream/video/android/model/StreamCallId;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    move-exception v0

    :try_start_2
    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v4, v2, v6, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :goto_3
    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v4, v2, v1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    :goto_4
    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    :cond_8
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lm43/b;

    iget-boolean v2, v6, Lm43/b;->e:Z

    if-nez v2, :cond_9

    move-object v2, v5

    goto :goto_5

    :cond_9
    iget-object v2, v6, Lm43/b;->d:Li43/b;

    const/4 v12, 0x0

    const/16 v13, 0x27

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lm43/b;->a(Lm43/b;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/Integer;La30/w0;Li43/b;ZLjava/lang/Long;I)Lm43/b;

    move-result-object v6

    :goto_5
    invoke-virtual {v0, v1, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    if-nez v2, :cond_a

    goto :goto_6

    :cond_a
    :try_start_3
    invoke-virtual {p0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :goto_6
    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    iget-object v0, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm43/b;

    iget-object v0, v0, Lm43/b;->c:La30/w0;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, La30/w0;->I()V

    :cond_b
    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->F:Lhc3/d;

    invoke-static {v0, v5}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return-void
.end method

.method public final c(Lt23/c0;)V
    .locals 5

    iget-object p1, p1, Lt23/c0;->v:Ljava/lang/String;

    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[removeIncomingCall] call_cid:"

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    invoke-virtual {v0}, Lxl/a;->s()Lio/getstream/video/android/model/StreamCallId;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v4

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, v4}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->e(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final d(Lt23/c0;Lio/getstream/video/android/model/StreamCallId;Landroid/app/Notification;Le43/m;Ljava/lang/String;)V
    .locals 7

    iget-object p1, p1, Lt23/c0;->p:Lt23/s0;

    iget-object v0, p1, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_1

    :cond_0
    if-eqz p4, :cond_1

    invoke-virtual {p2, p4}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    goto :goto_0

    :cond_1
    move-object p4, v1

    :goto_0
    if-eqz p4, :cond_2

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result p2

    :goto_1
    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object p4

    iget-object v0, p4, Lb23/k;->c:Lb23/e;

    iget-object v2, p4, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p4, p4, Lb23/k;->b:Lb23/j;

    iget-object v0, p1, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[startForegroundForCall] trigger="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", call.state.notificationId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", notificationId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", hashcode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p4, v3, v2, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {p1, p2, p3}, Lt23/s0;->i(ILandroid/app/Notification;)V

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    const-string p4, "getBaseContext(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->x:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p4, p1, p5}, Lio/sentry/internal/debugmeta/c;->u(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    invoke-static {p0, p2, p3, p5, p1}, Lvd/e;->g0(Landroid/app/Service;ILandroid/app/Notification;Ljava/lang/String;I)Ln23/h;

    sget-object p1, Lj43/d;->w:Lj43/d;

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[stopServiceGracefully] source: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v4, v3, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    iget-object p1, p1, Lxl/a;->y:Ljava/lang/Object;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm43/b;

    iget-object p1, p1, Lm43/b;->f:Ljava/lang/Long;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v3, v1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v1

    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object p1

    iget-object v3, p1, Lb23/k;->c:Lb23/e;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v3, "[stopServiceGracefully] differenceInSeconds: "

    invoke-static {v1, v2, v3}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v5, v4, v3, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    const-wide/16 v3, 0x2

    cmp-long p1, v1, v3

    if-ltz p1, :cond_2

    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->b()V

    return-void

    :cond_2
    new-instance p1, Lj43/b;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lj43/b;-><init>(Lio/getstream/video/android/core/notifications/internal/service/CallService;I)V

    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->E:Lxl/a;

    iget-object v1, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    iget-object v2, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v2, Landroidx/fragment/app/m;

    if-eqz v2, :cond_3

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_3
    new-instance v2, Landroidx/fragment/app/m;

    const/16 v5, 0x19

    invoke-direct {v2, p1, v5}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v0, Lxl/a;->y:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 12

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    iget-object v2, v2, Lxl/a;->x:Ljava/lang/Object;

    check-cast v2, Lec3/h2;

    :cond_0
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lm43/b;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const/16 v11, 0x1f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lm43/b;->a(Lm43/b;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/Integer;La30/w0;Li43/b;ZLjava/lang/Long;I)Lm43/b;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void
.end method

.method public final onDestroy()V
    .locals 8

    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v4

    iget-object v5, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    invoke-virtual {v5}, Lxl/a;->s()Lio/getstream/video/android/model/StreamCallId;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v3

    :goto_0
    const-string v6, "[onDestroy], hashcode: "

    const-string v7, ", call_cid: "

    invoke-static {v4, v6, v7, v5}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v2, v0, v4, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    iget-object v0, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm43/b;

    iget-object v0, v0, Lm43/b;->c:La30/w0;

    if-eqz v0, :cond_4

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object v1

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    const-string v5, "[cleanAudioResources] Cleaning audio resources"

    invoke-interface {v4, v2, v1, v5, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v1, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Landroid/media/Ringtone;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/media/Ringtone;->isPlaying()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    iget-object v1, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Landroid/media/Ringtone;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/media/Ringtone;->stop()V

    :cond_3
    iput-object v3, v0, La30/w0;->F:Ljava/lang/Object;

    iget-object v1, v0, La30/w0;->z:Ljava/lang/Object;

    check-cast v1, Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V

    iput-object v3, v0, La30/w0;->E:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_3

    :goto_2
    monitor-exit v0

    throw v1

    :cond_4
    :goto_3
    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->E:Lxl/a;

    iget-object v1, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/m;

    if-eqz v1, :cond_5

    iget-object v2, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_5
    iput-object v3, v0, Lxl/a;->y:Ljava/lang/Object;

    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->F:Lhc3/d;

    invoke-static {v0, v3}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v9, 0x0

    if-eqz v3, :cond_0

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[onStartCommand], intent = "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", flags:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v6, p2

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", startId:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v6, p3

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v2, v5, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v9

    :goto_0
    if-eqz v3, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "key:"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", value="

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[onStartCommand], intent extras: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v5, v2, v4, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v2, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    const-class v3, Lio/getstream/video/android/model/StreamCallId;

    const-string v4, "io.getstream.video.android.intent-extra.call_cid"

    if-eqz v0, :cond_4

    invoke-static {v0, v4, v3}, Ls4/g;->h(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/video/android/model/StreamCallId;

    goto :goto_2

    :cond_4
    move-object v5, v9

    :goto_2
    const-string v6, "io.getstream.video.android.core.stop_service"

    const/4 v11, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0, v6, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v7

    goto :goto_3

    :cond_5
    move v7, v11

    :goto_3
    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v8

    iget-object v10, v8, Lb23/k;->c:Lb23/e;

    sget-object v12, Lb23/g;->y:Lb23/g;

    iget-object v13, v8, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v10, v12, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_8

    iget-object v10, v8, Lb23/k;->b:Lb23/j;

    iget-object v8, v8, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v14

    invoke-virtual {v2}, Lxl/a;->s()Lio/getstream/video/android/model/StreamCallId;

    move-result-object v15

    if-eqz v15, :cond_6

    const/4 v15, 0x1

    goto :goto_4

    :cond_6
    move v15, v11

    :goto_4
    invoke-virtual {v2}, Lxl/a;->s()Lio/getstream/video/android/model/StreamCallId;

    move-result-object v13

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    if-eqz v7, :cond_7

    const/4 v13, 0x1

    goto :goto_5

    :cond_7
    move v13, v11

    :goto_5
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v9, "[shouldStopService]: service hashcode: "

    invoke-direct {v11, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", serviceState.currentCallId!=null : "

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v9, ", serviceState.currentCallId == intentCallId && shouldStopService : "

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x0

    invoke-interface {v10, v12, v8, v9, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    iget-object v8, v2, Lxl/a;->y:Ljava/lang/Object;

    check-cast v8, Lec3/h2;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm43/b;

    iget-object v8, v8, Lm43/b;->a:Lio/getstream/video/android/model/StreamCallId;

    const/4 v11, 0x2

    if-eqz v8, :cond_b

    invoke-virtual {v2}, Lxl/a;->s()Lio/getstream/video/android/model/StreamCallId;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    if-eqz v7, :cond_b

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v12, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    if-eqz v5, :cond_9

    invoke-virtual {v5}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_9
    const/4 v3, 0x0

    :goto_6
    const-string v4, "[shouldStopService]: true, call_cid:"

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    invoke-interface {v2, v12, v0, v3, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_7

    :cond_a
    const/4 v9, 0x0

    :goto_7
    invoke-virtual {v1, v9}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->e(Ljava/lang/String;)V

    return v11

    :cond_b
    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v2

    iget-object v7, v2, Lb23/k;->c:Lb23/e;

    iget-object v8, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v12, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_d

    iget-object v7, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    if-eqz v5, :cond_c

    invoke-virtual {v5}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object v5

    goto :goto_8

    :cond_c
    const/4 v5, 0x0

    :goto_8
    const-string v8, "[shouldStopService]: false, call_cid:"

    invoke-static {v8, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v9, 0x0

    invoke-interface {v7, v12, v2, v5, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    if-eqz v0, :cond_e

    invoke-static {v0, v4, v3}, Ls4/g;->h(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/video/android/model/StreamCallId;

    goto :goto_9

    :cond_e
    const/4 v2, 0x0

    :goto_9
    if-eqz v0, :cond_f

    const/4 v5, 0x0

    invoke-virtual {v0, v6, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v6

    goto :goto_a

    :cond_f
    const/4 v6, 0x0

    :goto_a
    if-eqz v6, :cond_10

    if-eqz v2, :cond_10

    sget-object v5, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lt23/i3;->b:Lt23/j3;

    if-eqz v5, :cond_10

    invoke-virtual {v2}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v7

    check-cast v5, Lt23/b4;

    invoke-virtual {v5, v6, v7}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object v5

    iget-object v6, v5, Lt23/c0;->p:Lt23/s0;

    iget-object v6, v6, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    instance-of v6, v6, Lt23/y2;

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v7

    iget-object v8, v7, Lb23/k;->c:Lb23/e;

    iget-object v9, v7, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v12, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_11

    iget-object v8, v7, Lb23/k;->b:Lb23/j;

    iget-object v7, v7, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v2}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object v2

    iget-object v5, v5, Lt23/c0;->p:Lt23/s0;

    iget-object v5, v5, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    const-string v9, ", call_id: "

    const-string v10, ", ringing state: "

    const-string v13, "[isIntentForExpiredCall] isCallExpired:"

    invoke-static {v13, v9, v2, v10, v6}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v9, ", "

    invoke-static {v2, v9, v5}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v9, 0x0

    invoke-interface {v8, v12, v7, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_b

    :cond_10
    const/4 v6, 0x0

    :cond_11
    :goto_b
    if-eqz v6, :cond_12

    return v11

    :cond_12
    if-eqz v0, :cond_14

    const-string v2, "io.getstream.video.android.core.notifications.internal.service.CallService.call_trigger"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_13

    goto :goto_c

    :cond_13
    invoke-static {v0, v4, v3}, Ls4/g;->h(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/video/android/model/StreamCallId;

    if-nez v3, :cond_15

    :cond_14
    :goto_c
    const/4 v7, 0x0

    goto :goto_e

    :cond_15
    sget-object v4, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lt23/i3;->b:Lt23/j3;

    instance-of v5, v4, Lt23/b4;

    if-eqz v5, :cond_16

    check-cast v4, Lt23/b4;

    goto :goto_d

    :cond_16
    const/4 v4, 0x0

    :goto_d
    if-nez v4, :cond_17

    goto :goto_c

    :cond_17
    const-string v5, "io.getstream.video.android.intent-extra.call_displayname"

    invoke-virtual {v0, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lm43/a;

    invoke-direct {v6, v4, v3, v2, v5}, Lm43/a;-><init>(Lt23/b4;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v6

    :goto_e
    const/4 v13, 0x3

    if-nez v7, :cond_19

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_18

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v4, "Failed to extract required parameters from intent"

    const/4 v9, 0x0

    invoke-interface {v2, v3, v0, v4, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_f

    :cond_18
    const/4 v9, 0x0

    :goto_f
    invoke-virtual {v1, v9}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->e(Ljava/lang/String;)V

    return v13

    :cond_19
    sget-object v5, Le43/k;->b:Le43/k;

    sget-object v2, Le43/l;->b:Le43/l;

    iget-object v3, v7, Lm43/a;->b:Lio/getstream/video/android/model/StreamCallId;

    :try_start_0
    sget-object v4, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lt23/i3;->b:Lt23/j3;

    instance-of v6, v4, Lt23/b4;

    if-eqz v6, :cond_1a

    check-cast v4, Lt23/b4;

    goto :goto_10

    :cond_1a
    const/4 v4, 0x0

    :goto_10
    if-nez v4, :cond_1c

    :cond_1b
    const/4 v4, 0x0

    goto :goto_11

    :cond_1c
    iget-object v4, v4, Lt23/b4;->H:Lh43/b;

    iget-object v4, v4, Lh43/b;->x:Le43/g;

    iget-object v4, v4, Le43/g;->c:Le43/h;

    instance-of v6, v4, Lg43/j;

    if-eqz v6, :cond_1b

    check-cast v4, Lg43/j;

    :goto_11
    if-eqz v4, :cond_21

    sget-object v6, Lt23/i3;->b:Lt23/j3;

    instance-of v8, v6, Lt23/b4;

    if-eqz v8, :cond_1d

    check-cast v6, Lt23/b4;

    goto :goto_12

    :cond_1d
    const/4 v6, 0x0

    :goto_12
    if-nez v6, :cond_1e

    const/4 v6, 0x0

    goto :goto_13

    :cond_1e
    iget-object v6, v6, Lt23/b4;->H:Lh43/b;

    iget-object v6, v6, Lh43/b;->x:Le43/g;

    :goto_13
    if-eqz v6, :cond_1f

    iget-object v6, v6, Le43/g;->h:Ljava/util/Set;

    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_14

    :catch_0
    move-exception v0

    goto :goto_15

    :cond_1f
    const/4 v6, 0x0

    :goto_14
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_21

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v6

    iget-object v8, v6, Lb23/k;->c:Lb23/e;

    iget-object v9, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v12, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_20

    iget-object v8, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    const-string v9, "[maybeHandleMediaIntent] Handling media intent"

    const/4 v10, 0x0

    invoke-interface {v8, v12, v6, v9, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_20
    iget-object v6, v4, Lg43/j;->I:Lg43/e;

    iget-object v8, v4, Lg43/j;->w:Landroid/app/Application;

    iget-object v4, v4, Lg43/j;->H:Lg43/n;

    iget-object v4, v4, Lg43/n;->b:Lg43/m;

    iget-object v4, v4, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v6, v8, v3, v4}, Lg43/e;->b(Landroid/app/Application;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;)Landroid/support/v4/media/session/p;

    move-result-object v3

    invoke-static {v3, v0}, Lt8/a;->a(Landroid/support/v4/media/session/p;Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_16

    :goto_15
    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    const-string v6, "SafeCall"

    invoke-interface {v3, v4, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_21

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v8

    const-string v9, "Exception occurred: "

    invoke-static {v9, v8}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3, v4, v6, v8, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_21
    :goto_16
    iget-object v0, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->H:Lj43/g;

    iget-object v3, v7, Lm43/a;->c:Ljava/lang/String;

    iget-object v4, v7, Lm43/a;->a:Lt23/b4;

    iget-object v6, v7, Lm43/a;->b:Lio/getstream/video/android/model/StreamCallId;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Le43/i;->b:Le43/i;

    invoke-virtual {v6}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v8, v9}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object v4

    iget-object v4, v4, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v8

    const-string v9, "remove_call"

    const-string v10, "ongoing_call"

    const-string v12, "outgoing_call"

    const-string v14, "incoming_call"

    sparse-switch v8, :sswitch_data_0

    goto :goto_17

    :sswitch_0
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    goto :goto_17

    :cond_22
    iget-object v3, v4, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_23

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_18

    :cond_23
    invoke-virtual {v6, v2}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v3

    goto :goto_18

    :sswitch_1
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_24

    goto :goto_17

    :cond_24
    iget-object v3, v4, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_25

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_18

    :cond_25
    invoke-virtual {v6, v5}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v3

    goto :goto_18

    :sswitch_2
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_26

    goto :goto_17

    :cond_26
    invoke-virtual {v6, v0}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v3

    goto :goto_18

    :sswitch_3
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    :goto_17
    invoke-virtual {v6}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result v3

    goto :goto_18

    :cond_27
    iget-object v3, v4, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_28

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_18

    :cond_28
    invoke-virtual {v6, v0}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v3

    :goto_18
    iget-object v4, v7, Lm43/a;->a:Lt23/b4;

    iget-object v6, v7, Lm43/a;->c:Ljava/lang/String;

    iget-object v8, v7, Lm43/a;->b:Lio/getstream/video/android/model/StreamCallId;

    iget-object v4, v4, Lt23/b4;->H:Lh43/b;

    iget-object v4, v4, Lh43/b;->z:Le43/h;

    invoke-interface {v4, v6, v8}, Lg43/p;->j(Ljava/lang/String;Lio/getstream/video/android/model/StreamCallId;)Landroid/app/Notification;

    move-result-object v4

    const-string v15, "getBaseContext(...)"

    if-eqz v4, :cond_29

    iget-object v8, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->x:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v11

    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v11, v6}, Lio/sentry/internal/debugmeta/c;->u(Landroid/content/Context;Ljava/lang/String;)I

    move-result v8

    invoke-static {v1, v3, v4, v6, v8}, Lvd/e;->g0(Landroid/app/Service;ILandroid/app/Notification;Ljava/lang/String;I)Ln23/h;

    :cond_29
    iget-object v4, v7, Lm43/a;->a:Lt23/b4;

    iget-object v6, v7, Lm43/a;->b:Lio/getstream/video/android/model/StreamCallId;

    invoke-virtual {v6}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v6

    iget-object v8, v7, Lm43/a;->b:Lio/getstream/video/android/model/StreamCallId;

    invoke-virtual {v8}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v6, v8}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object v4

    iget-object v6, v7, Lm43/a;->c:Ljava/lang/String;

    invoke-virtual {v6, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v8, "getApplicationContext(...)"

    if-nez v6, :cond_2c

    iget-object v6, v7, Lm43/a;->a:Lt23/b4;

    iget-object v11, v7, Lm43/a;->b:Lio/getstream/video/android/model/StreamCallId;

    iget-object v13, v7, Lm43/a;->c:Ljava/lang/String;

    iget-object v6, v6, Lt23/b4;->N:Lt9/p;

    move-object/from16 p1, v15

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v15

    invoke-static {v15, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v15, v4}, Lt9/p;->g(Landroid/content/Context;Lt23/c0;)Ll83/k;

    move-result-object v6

    iget-object v15, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Ljava/util/Set;

    move-object/from16 v18, v6

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v6

    move/from16 v19, v3

    iget-object v3, v6, Lb23/k;->c:Lb23/e;

    move-object/from16 v20, v4

    sget-object v4, Lb23/g;->y:Lb23/g;

    move-object/from16 v21, v14

    iget-object v14, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2a

    iget-object v3, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    move-object/from16 v25, v18

    check-cast v25, Ljava/lang/Iterable;

    const/16 v29, 0x0

    const/16 v30, 0x3f

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-static/range {v25 .. v30}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v22, v0

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v23, v9

    const-string v9, "[verifyPermissions] hasPermissions: "

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v9, ", missingPermissions: "

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    invoke-interface {v3, v4, v6, v0, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_19

    :cond_2a
    move-object/from16 v22, v0

    move-object/from16 v23, v9

    :goto_19
    if-nez v15, :cond_2d

    new-instance v0, Ljava/lang/IllegalStateException;

    move-object/from16 v2, v18

    check-cast v2, Ljava/lang/Iterable;

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\n                CallService attempted to start without required permissions: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".\n                call_id: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", trigger: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n                Ensure all required permissions are granted before calling Call.join().\n                "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2b

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "Make sure all required permissions are granted!"

    invoke-interface {v2, v5, v4, v3, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2b
    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->e(Ljava/lang/String;)V

    const/4 v11, 0x2

    goto/16 :goto_3b

    :cond_2c
    move-object/from16 v22, v0

    move/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v23, v9

    move-object/from16 v21, v14

    move-object/from16 p1, v15

    :cond_2d
    iget-object v0, v7, Lm43/a;->c:Ljava/lang/String;

    iget-object v3, v7, Lm43/a;->a:Lt23/b4;

    iget-object v4, v7, Lm43/a;->b:Lio/getstream/video/android/model/StreamCallId;

    iget-object v6, v7, Lm43/a;->d:Ljava/lang/String;

    iget-object v9, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->H:Lj43/g;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v11

    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v30, Lm83/z;->w:Lm83/z;

    invoke-virtual {v9}, Lj43/g;->c()Lb23/k;

    move-result-object v8

    iget-object v13, v8, Lb23/k;->c:Lb23/e;

    sget-object v14, Lb23/g;->y:Lb23/g;

    iget-object v15, v8, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v13, v14, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    const-string v15, ", callId: "

    if-eqz v13, :cond_2e

    iget-object v13, v8, Lb23/k;->b:Lb23/j;

    iget-object v8, v8, Lb23/k;->a:Ljava/lang/String;

    move-object/from16 v18, v9

    invoke-virtual {v4}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v9

    const-string v1, "[getNotificationPair] trigger: "

    move-object/from16 v31, v7

    const-string v7, ", callDisplayName: "

    invoke-static {v1, v0, v15, v9, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v9, 0x0

    invoke-interface {v13, v14, v8, v1, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1a

    :cond_2e
    move-object/from16 v31, v7

    move-object/from16 v18, v9

    :goto_1a
    invoke-virtual {v4}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v1, v7}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object v1

    iget-object v1, v1, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v7

    const/16 v13, 0xc

    sparse-switch v7, :sswitch_data_1

    :goto_1b
    move-object/from16 v9, v21

    move-object/from16 v11, v22

    move-object/from16 v8, v23

    goto/16 :goto_21

    :sswitch_4
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2f

    goto :goto_1b

    :cond_2f
    invoke-virtual/range {v18 .. v18}, Lj43/g;->c()Lb23/k;

    move-result-object v0

    iget-object v6, v0, Lb23/k;->c:Lb23/e;

    iget-object v7, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v14, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_30

    iget-object v6, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v7, "[getNotificationPair] Creating outgoing call notification"

    const/4 v9, 0x0

    invoke-interface {v6, v14, v0, v7, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_30
    iget-object v0, v1, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_31

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1c

    :cond_31
    invoke-virtual {v4, v2}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v0

    :goto_1c
    new-instance v1, Ll83/k;

    new-instance v6, Lt23/a3;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lt23/a3;-><init>(Z)V

    const v7, 0x7f140f2a

    invoke-virtual {v11, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v28

    iget-object v3, v3, Lt23/b4;->H:Lh43/b;

    iget-object v3, v3, Lh43/b;->z:Le43/h;

    const/16 v29, 0x1

    move-object/from16 v25, v3

    move-object/from16 v27, v4

    move-object/from16 v26, v6

    invoke-interface/range {v25 .. v30}, Lg43/p;->g(Lt23/d3;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1d
    move-object/from16 v9, v21

    move-object/from16 v11, v22

    move-object/from16 v8, v23

    :goto_1e
    move-object/from16 v22, v2

    move-object/from16 v23, v5

    goto/16 :goto_26

    :sswitch_5
    move-object/from16 v7, v30

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_32

    goto :goto_1b

    :cond_32
    invoke-virtual/range {v18 .. v18}, Lj43/g;->c()Lb23/k;

    move-result-object v0

    iget-object v8, v0, Lb23/k;->c:Lb23/e;

    iget-object v9, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v14, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_33

    iget-object v8, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v9, "[getNotificationPair] Creating ongoing call notification"

    const/4 v11, 0x0

    invoke-interface {v8, v14, v0, v9, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_33
    iget-object v0, v1, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_34

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1f

    :cond_34
    invoke-virtual {v4, v5}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v0

    :goto_1f
    new-instance v1, Ll83/k;

    invoke-static {v3, v4, v6, v7, v13}, Lg43/p;->d(Lg43/p;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;I)Landroid/app/Notification;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1d

    :sswitch_6
    move-object/from16 v8, v23

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    move-object/from16 v9, v21

    move-object/from16 v11, v22

    goto :goto_21

    :cond_35
    invoke-virtual/range {v18 .. v18}, Lj43/g;->c()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v14, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_36

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v3, "[getNotificationPair] Removing incoming call notification"

    const/4 v9, 0x0

    invoke-interface {v1, v14, v0, v3, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_20

    :cond_36
    const/4 v9, 0x0

    :goto_20
    new-instance v1, Ll83/k;

    move-object/from16 v11, v22

    invoke-virtual {v4, v11}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v22, v2

    move-object/from16 v23, v5

    move-object/from16 v9, v21

    goto/16 :goto_26

    :sswitch_7
    move-object/from16 v9, v21

    move-object/from16 v11, v22

    move-object/from16 v8, v23

    move-object/from16 v7, v30

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-nez v21, :cond_38

    :goto_21
    invoke-virtual/range {v18 .. v18}, Lj43/g;->c()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    sget-object v6, Lb23/g;->E:Lb23/g;

    iget-object v7, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_37

    iget-object v3, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    const-string v7, "[getNotificationPair] Unknown trigger: "

    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v7, 0x0

    invoke-interface {v3, v6, v1, v0, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_22

    :cond_37
    const/4 v7, 0x0

    :goto_22
    new-instance v1, Ll83/k;

    invoke-virtual {v4}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1e

    :cond_38
    iget-object v0, v3, Lt23/b4;->U:Lt23/g1;

    iget-object v0, v0, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_39

    const/16 v29, 0x1

    goto :goto_23

    :cond_39
    const/16 v29, 0x0

    :goto_23
    invoke-virtual/range {v18 .. v18}, Lj43/g;->c()Lb23/k;

    move-result-object v0

    iget-object v13, v0, Lb23/k;->c:Lb23/e;

    move-object/from16 v22, v2

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v13, v14, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3a

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v13, "[getNotificationPair] Creating incoming call notification"

    move-object/from16 v23, v5

    const/4 v5, 0x0

    invoke-interface {v2, v14, v0, v13, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_24

    :cond_3a
    move-object/from16 v23, v5

    :goto_24
    iget-object v0, v1, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_3b

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_25

    :cond_3b
    invoke-virtual {v4, v11}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v0

    :goto_25
    new-instance v1, Ll83/k;

    new-instance v2, Lt23/z2;

    const/4 v5, 0x0

    invoke-direct {v2, v5}, Lt23/z2;-><init>(Z)V

    iget-object v3, v3, Lt23/b4;->H:Lh43/b;

    iget-object v3, v3, Lh43/b;->z:Le43/h;

    move-object/from16 v26, v2

    move-object/from16 v25, v3

    move-object/from16 v27, v4

    move-object/from16 v28, v6

    move-object/from16 v30, v7

    invoke-interface/range {v25 .. v30}, Lg43/p;->g(Lt23/d3;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_26
    invoke-virtual/range {v18 .. v18}, Lj43/g;->c()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v14, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3d

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    iget-object v3, v1, Ll83/k;->w:Ljava/lang/Object;

    if-eqz v3, :cond_3c

    const/4 v3, 0x1

    goto :goto_27

    :cond_3c
    const/4 v3, 0x0

    :goto_27
    iget-object v4, v1, Ll83/k;->x:Ljava/lang/Object;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[getNotificationPair] Generated notification: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", notificationId: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    invoke-interface {v2, v14, v0, v3, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3d
    iget-object v0, v1, Ll83/k;->w:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/app/Notification;

    move-object/from16 v7, v31

    iget-object v3, v7, Lm43/a;->b:Lio/getstream/video/android/model/StreamCallId;

    iget-object v6, v7, Lm43/a;->c:Ljava/lang/String;

    sget-object v0, Lj43/d;->w:Lj43/d;

    invoke-virtual/range {p0 .. p0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3e

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    move-object/from16 v5, v20

    iget-object v13, v5, Lt23/c0;->p:Lt23/s0;

    iget-object v13, v13, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v13}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v18, v0

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    move-object/from16 v20, v4

    new-instance v4, Ljava/lang/StringBuilder;

    move-object/from16 v33, v7

    const-string v7, "[logHandleStart] trigger="

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", call.state.notificationId="

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", notificationId="

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v7, v19

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v13, ", hashcode="

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    invoke-interface {v2, v14, v1, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_28

    :cond_3e
    move-object/from16 v18, v0

    move-object/from16 v33, v7

    move/from16 v7, v19

    move-object/from16 v5, v20

    move-object/from16 v20, v4

    :goto_28
    if-nez v20, :cond_44

    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_40

    invoke-virtual/range {p0 .. p0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3f

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v4, "[handleNullNotification], Could not get notification for trigger: "

    invoke-static {v4, v6, v15, v3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v11, 0x0

    invoke-interface {v1, v2, v0, v3, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3f
    sget-object v0, Lj43/d;->y:Lj43/d;

    move-object/from16 v1, p0

    :goto_29
    move-object/from16 v11, p1

    move-object v2, v5

    goto/16 :goto_32

    :cond_40
    move-object/from16 v1, p0

    iget-object v0, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    invoke-virtual {v0}, Lxl/a;->s()Lio/getstream/video/android/model/StreamCallId;

    move-result-object v0

    if-eqz v0, :cond_41

    invoke-virtual {v0}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_2a

    :cond_41
    const/4 v0, 0x0

    :goto_2a
    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_42

    invoke-virtual {v1, v5}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->c(Lt23/c0;)V

    move-object/from16 v11, p1

    move-object v2, v5

    :goto_2b
    move-object/from16 v0, v18

    goto/16 :goto_32

    :cond_42
    iget-object v0, v5, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_43

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2c

    :cond_43
    invoke-virtual {v3, v11}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v0

    :goto_2c
    invoke-static {v1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroidx/core/app/NotificationManagerCompat;->cancel(I)V

    sget-object v0, Lj43/d;->x:Lj43/d;

    goto :goto_29

    :cond_44
    move-object/from16 v1, p0

    iget-object v0, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    :goto_2d
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Lm43/b;

    const/16 v31, 0x0

    const/16 v32, 0x3e

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v26, v3

    invoke-static/range {v25 .. v32}, Lm43/b;->a(Lm43/b;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/Integer;La30/w0;Li43/b;ZLjava/lang/Long;I)Lm43/b;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5e

    iget-object v0, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->G:Lgm/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v2, Lhc3/d;

    new-instance v3, Lh20/i0;

    const/16 v4, 0x13

    const/4 v11, 0x0

    invoke-direct {v3, v5, v0, v11, v4}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v4, 0x3

    invoke-static {v2, v11, v11, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v2, -0x310b9d29

    if-eq v0, v2, :cond_49

    const v2, -0x11069f5e

    if-eq v0, v2, :cond_47

    const v2, 0x54f4351

    if-eq v0, v2, :cond_45

    :goto_2e
    move-object v2, v5

    move-object/from16 v4, v20

    move-object/from16 v3, v26

    goto :goto_30

    :cond_45
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_46

    goto :goto_2e

    :cond_46
    move-object v2, v5

    move-object/from16 v4, v20

    move-object/from16 v5, v22

    move-object/from16 v3, v26

    invoke-virtual/range {v1 .. v6}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->d(Lt23/c0;Lio/getstream/video/android/model/StreamCallId;Landroid/app/Notification;Le43/m;Ljava/lang/String;)V

    sget-object v0, Lj43/d;->w:Lj43/d;

    move-object/from16 v1, p0

    :goto_2f
    move-object/from16 v11, p1

    goto/16 :goto_2b

    :cond_47
    move-object v2, v5

    move-object/from16 v4, v20

    move-object/from16 v3, v26

    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_48

    goto :goto_30

    :cond_48
    move-object/from16 v1, p0

    move-object/from16 v5, v23

    invoke-virtual/range {v1 .. v6}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->d(Lt23/c0;Lio/getstream/video/android/model/StreamCallId;Landroid/app/Notification;Le43/m;Ljava/lang/String;)V

    sget-object v0, Lj43/d;->w:Lj43/d;

    goto :goto_2f

    :cond_49
    move-object v2, v5

    move-object/from16 v4, v20

    move-object/from16 v3, v26

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4a

    :goto_30
    const/4 v5, 0x0

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->d(Lt23/c0;Lio/getstream/video/android/model/StreamCallId;Landroid/app/Notification;Le43/m;Ljava/lang/String;)V

    sget-object v0, Lj43/d;->w:Lj43/d;

    goto :goto_2f

    :cond_4a
    move-object/from16 v1, p0

    sget-object v0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    if-eqz v0, :cond_4c

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    sget-object v8, Lb23/g;->y:Lb23/g;

    iget-object v10, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v8, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4b

    iget-object v6, v5, Lb23/k;->b:Lb23/j;

    iget-object v5, v5, Lb23/k;->a:Ljava/lang/String;

    const-string v10, "[showIncomingCall] notificationId: "

    invoke-static {v7, v10}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-interface {v6, v8, v5, v10, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4b
    check-cast v0, Lt23/b4;

    iget-object v5, v0, Lt23/b4;->U:Lt23/g1;

    iget-object v5, v5, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4d

    iget-object v0, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->G:Lgm/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3, v7, v4}, Lgm/r;->L(Lio/getstream/video/android/core/notifications/internal/service/CallService;Lio/getstream/video/android/model/StreamCallId;ILandroid/app/Notification;)V

    :cond_4c
    move-object/from16 v11, p1

    goto :goto_31

    :cond_4d
    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object v0

    iget-object v0, v0, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {v0, v7, v4}, Lt23/s0;->i(ILandroid/app/Notification;)V

    iget-object v0, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->x:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v5

    move-object/from16 v11, p1

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v5, v9}, Lio/sentry/internal/debugmeta/c;->u(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-static {v1, v7, v4, v9, v0}, Lvd/e;->g0(Landroid/app/Service;ILandroid/app/Notification;Ljava/lang/String;I)Ln23/h;

    move-result-object v0

    instance-of v5, v0, Ln23/g;

    if-nez v5, :cond_50

    instance-of v5, v0, Ln23/f;

    if-eqz v5, :cond_4f

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    sget-object v8, Lb23/g;->F:Lb23/g;

    iget-object v10, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v8, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4e

    iget-object v6, v5, Lb23/k;->b:Lb23/j;

    iget-object v5, v5, Lb23/k;->a:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v12, "[showIncomingCall] Failed to start foreground: "

    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    invoke-interface {v6, v8, v5, v0, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4e
    iget-object v0, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->G:Lgm/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3, v7, v4}, Lgm/r;->L(Lio/getstream/video/android/core/notifications/internal/service/CallService;Lio/getstream/video/android/model/StreamCallId;ILandroid/app/Notification;)V

    goto :goto_31

    :cond_4f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_50
    :goto_31
    sget-object v0, Lj43/d;->w:Lj43/d;

    goto/16 :goto_2b

    :goto_32
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_54

    const/4 v3, 0x1

    if-eq v0, v3, :cond_53

    const/4 v13, 0x2

    if-ne v0, v13, :cond_52

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_51

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v4, "Foreground service did not start!"

    const/4 v9, 0x0

    invoke-interface {v2, v3, v0, v4, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_33

    :cond_51
    const/4 v9, 0x0

    :goto_33
    invoke-virtual {v1, v9}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->e(Ljava/lang/String;)V

    const/4 v11, 0x3

    goto/16 :goto_3b

    :cond_52
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_53
    const/4 v13, 0x2

    :goto_34
    move v11, v13

    goto/16 :goto_3b

    :cond_54
    move-object/from16 v6, v33

    const/4 v13, 0x2

    iget-object v0, v6, Lm43/a;->a:Lt23/b4;

    iget-object v3, v6, Lm43/a;->c:Ljava/lang/String;

    iget-object v14, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    iget-object v4, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->y:Lj43/g;

    iget-object v12, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->F:Lhc3/d;

    new-instance v5, Lj43/a;

    const/4 v7, 0x0

    invoke-direct {v5, v1, v7}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "scope"

    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v15, v2, Lt23/c0;->n:Lhc3/d;

    new-instance v4, Lh20/i0;

    const/16 v6, 0x12

    const/4 v10, 0x0

    invoke-direct {v4, v2, v5, v10, v6}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v5, 0x3

    invoke-static {v12, v10, v10, v4, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v4, Ll43/b;

    invoke-direct {v4, v0, v10, v7}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    invoke-static {v12, v10, v10, v4, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_55

    new-instance v8, Lt23/z2;

    invoke-direct {v8, v7}, Lt23/z2;-><init>(Z)V

    move/from16 v24, v5

    new-instance v5, Lay/u;

    move-object/from16 v16, v10

    const/16 v10, 0x9

    move-object v6, v0

    move-object v7, v2

    move-object/from16 v9, v16

    move/from16 v4, v24

    invoke-direct/range {v5 .. v10}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v12, v9, v9, v5, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_35

    :cond_55
    move-object v9, v10

    :goto_35
    iget-object v3, v0, Lt23/b4;->b0:La30/w0;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "player"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v14, Lxl/a;->x:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Lec3/h2;

    :goto_36
    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v25, v4

    check-cast v25, Lm43/b;

    const/16 v31, 0x0

    const/16 v32, 0x3b

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v28, v3

    invoke-static/range {v25 .. v32}, Lm43/b;->a(Lm43/b;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/Integer;La30/w0;Li43/b;ZLjava/lang/Long;I)Lm43/b;

    move-result-object v3

    invoke-virtual {v5, v4, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5d

    invoke-virtual {v1}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_57

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    iget-object v6, v14, Lxl/a;->y:Ljava/lang/Object;

    check-cast v6, Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm43/b;

    iget-object v6, v6, Lm43/b;->c:La30/w0;

    if-eqz v6, :cond_56

    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_37

    :cond_56
    move-object v6, v9

    :goto_37
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[initializeService] soundPlayer\'s hashcode: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v3, v6, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_57
    new-instance v3, La00/g;

    iget-object v4, v14, Lxl/a;->y:Ljava/lang/Object;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm43/b;

    iget-object v4, v4, Lm43/b;->c:La30/w0;

    invoke-direct {v3, v2, v4, v0, v12}, La00/g;-><init>(Lt23/c0;La30/w0;Lt23/b4;Lhc3/d;)V

    new-instance v4, Lj43/b;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lj43/b;-><init>(Lio/getstream/video/android/core/notifications/internal/service/CallService;I)V

    new-instance v6, Ln20/j;

    const/4 v7, 0x1

    invoke-direct {v6, v3, v4, v9, v7}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {v15, v9, v9, v6, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v6, Lgm/r;

    invoke-direct {v6, v2, v0, v12}, Lgm/r;-><init>(Lt23/c0;Lt23/b4;Lhc3/d;)V

    new-instance v4, Lj43/b;

    invoke-direct {v4, v1, v7}, Lj43/b;-><init>(Lio/getstream/video/android/core/notifications/internal/service/CallService;I)V

    new-instance v8, La3/z0;

    const/16 v7, 0xe

    invoke-direct {v8, v7, v1, v2}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move v7, v5

    new-instance v5, Ln43/a;

    const/4 v10, 0x0

    move/from16 v16, v7

    move-object v7, v4

    invoke-direct/range {v5 .. v10}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object v8, v9

    invoke-static {v15, v8, v8, v5, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v4, Lkd/f;

    const/16 v7, 0xc

    invoke-direct {v4, v6, v8, v7}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v15, v8, v8, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-boolean v4, v0, Lt23/b4;->J:Z

    if-eqz v4, :cond_58

    new-instance v18, La30/w0;

    iget-object v4, v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->x:Lio/sentry/internal/debugmeta/c;

    new-instance v5, Lc2/q;

    invoke-direct {v5, v1, v3}, Lc2/q;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v20, v0

    move-object/from16 v19, v2

    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-object/from16 v21, v12

    invoke-direct/range {v18 .. v23}, La30/w0;-><init>(Lt23/c0;Lt23/b4;Lhc3/d;Lio/sentry/internal/debugmeta/c;Lc2/q;)V

    move-object/from16 v0, v18

    move-object/from16 v2, v21

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ln43/c;

    const/4 v6, 0x1

    invoke-direct {v5, v0, v4, v8, v6}, Ln43/c;-><init>(La30/w0;Landroid/content/Context;Lq83/d;I)V

    invoke-static {v2, v8, v8, v5, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_38

    :cond_58
    move-object v2, v12

    const/4 v6, 0x1

    :goto_38
    new-instance v0, Li43/b;

    invoke-direct {v0, v2}, Li43/b;-><init>(Lhc3/d;)V

    iget-object v2, v14, Lxl/a;->x:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Lec3/h2;

    move/from16 v11, v16

    :cond_59
    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lm43/b;

    iget-boolean v5, v3, Lm43/b;->e:Z

    if-eqz v5, :cond_5a

    goto :goto_39

    :cond_5a
    const/16 v23, 0x0

    const/16 v24, 0x27

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x1

    move-object/from16 v21, v0

    move-object/from16 v17, v3

    invoke-static/range {v17 .. v24}, Lm43/b;->a(Lm43/b;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/Integer;La30/w0;Li43/b;ZLjava/lang/Long;I)Lm43/b;

    move-result-object v3

    move v11, v6

    :goto_39
    invoke-virtual {v4, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_59

    if-nez v11, :cond_5b

    goto :goto_3a

    :cond_5b
    :try_start_1
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    const-string v3, "android.intent.action.SCREEN_ON"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v3, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v3, "android.intent.action.USER_PRESENT"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3a

    :catch_1
    :cond_5c
    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lm43/b;

    const/4 v11, 0x0

    const/16 v12, 0x27

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lm43/b;->a(Lm43/b;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/Integer;La30/w0;Li43/b;ZLjava/lang/Long;I)Lm43/b;

    move-result-object v2

    invoke-virtual {v4, v0, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5c

    :goto_3a
    goto/16 :goto_34

    :goto_3b
    return v11

    :cond_5d
    move-object/from16 v3, v28

    goto/16 :goto_36

    :cond_5e
    const/4 v13, 0x2

    const/16 v21, 0xc

    const/16 v24, 0x3

    move-object/from16 v3, v26

    goto/16 :goto_2d

    :sswitch_data_0
    .sparse-switch
        -0x310b9d29 -> :sswitch_3
        -0x118712c7 -> :sswitch_2
        -0x11069f5e -> :sswitch_1
        0x54f4351 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x310b9d29 -> :sswitch_7
        -0x118712c7 -> :sswitch_6
        -0x11069f5e -> :sswitch_5
        0x54f4351 -> :sswitch_4
    .end sparse-switch
.end method

.method public final onTaskRemoved(Landroid/content/Intent;)V
    .locals 9

    invoke-super {p0, p1}, Landroid/app/Service;->onTaskRemoved(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->E:Lb23/g;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    const-string v3, "[onTaskRemoved]"

    invoke-interface {v0, v1, p1, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->y:Lj43/g;

    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->F:Lhc3/d;

    iget-object v1, p0, Lio/getstream/video/android/core/notifications/internal/service/CallService;->z:Lxl/a;

    invoke-virtual {v1}, Lxl/a;->s()Lio/getstream/video/android/model/StreamCallId;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "scope"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_5

    sget-object v3, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lt23/i3;->b:Lt23/j3;

    if-eqz v3, :cond_5

    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v1

    check-cast v3, Lt23/b4;

    invoke-virtual {v3, v4, v1}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object v1

    iget-object v3, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v3, v3, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt23/d3;

    instance-of v4, v3, Lt23/a3;

    const/4 v5, 0x3

    if-eqz v4, :cond_1

    new-instance v3, Ll43/a;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p1, v2, v4}, Ll43/a;-><init>(Lt23/c0;Lj43/g;Lq83/d;I)V

    invoke-static {v0, v2, v2, v3, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto/16 :goto_0

    :cond_1
    instance-of v4, v3, Lt23/z2;

    if-eqz v4, :cond_4

    iget-object v3, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v3, v3, Lt23/s0;->x:Ln53/e;

    iget-object v3, v3, Ln53/e;->y:Ll83/e;

    check-cast v3, Lkotlin/jvm/internal/m;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1}, Lj43/g;->c()Lb23/k;

    move-result-object v4

    iget-object v6, v4, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->z:Lb23/g;

    iget-object v8, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, v4, Lb23/k;->b:Lb23/j;

    iget-object v4, v4, Lb23/k;->a:Ljava/lang/String;

    const-string v8, "[handleIncomingCallTaskRemoved] Total members: "

    invoke-static {v3, v8}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v7, v4, v8, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    const/4 v4, 0x2

    if-ne v3, v4, :cond_3

    new-instance v3, Ll43/a;

    const/4 v4, 0x1

    invoke-direct {v3, v1, p1, v2, v4}, Ll43/a;-><init>(Lt23/c0;Lj43/g;Lq83/d;I)V

    invoke-static {v0, v2, v2, v3, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_3
    new-instance v0, Lt23/g0;

    sget-object v3, Lt23/g3;->w:Lt23/g3;

    const-string v4, "App removed from recents for (incoming call)"

    invoke-direct {v0, v3, v4}, Lt23/g0;-><init>(Lt23/g3;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lt23/c0;->p(Lt23/i0;)V

    invoke-virtual {p1}, Lj43/g;->c()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v7, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    const-string v1, "[handleIncomingCallTaskRemoved] Ended incoming call for me"

    invoke-interface {v0, v7, p1, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_4
    new-instance v0, Lt23/g0;

    sget-object v4, Lt23/g3;->w:Lt23/g3;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "App removed from recents for ringing state: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v4, v3}, Lt23/g0;-><init>(Lt23/g3;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lt23/c0;->p(Lt23/i0;)V

    invoke-virtual {p1}, Lj43/g;->c()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->z:Lb23/g;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    const-string v3, "[onTaskRemoved] Ended ongoing call for me"

    invoke-interface {v0, v1, p1, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_0
    invoke-virtual {p0, v2}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->e(Ljava/lang/String;)V

    return-void
.end method

.method public final onTimeout(I)V
    .locals 4

    invoke-super {p0, p1}, Landroid/app/Service;->onTimeout(I)V

    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->a()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->E:Lb23/g;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[onTimeout] Timeout received from the system, service will stop."

    invoke-interface {p1, v1, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p0, v3}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->e(Ljava/lang/String;)V

    return-void
.end method
