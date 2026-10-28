.class public final Lpc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmc/f;
.implements Ljc/d;


# static fields
.field public static final J:Ljava/lang/String;


# instance fields
.field public final E:Ljava/util/LinkedHashMap;

.field public final F:Ljava/util/HashMap;

.field public final G:Ljava/util/HashMap;

.field public final H:Lmc/h;

.field public I:Landroidx/work/impl/foreground/SystemForegroundService;

.field public final w:Ljc/v;

.field public final x:Lsc/a;

.field public final y:Ljava/lang/Object;

.field public z:Lqc/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemFgDispatcher"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpc/b;->J:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lpc/b;->y:Ljava/lang/Object;

    invoke-static {p1}, Ljc/v;->g(Landroid/content/Context;)Ljc/v;

    move-result-object p1

    iput-object p1, p0, Lpc/b;->w:Ljc/v;

    iget-object v0, p1, Ljc/v;->d:Lsc/a;

    iput-object v0, p0, Lpc/b;->x:Lsc/a;

    const/4 v0, 0x0

    iput-object v0, p0, Lpc/b;->z:Lqc/j;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lpc/b;->E:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lpc/b;->G:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lpc/b;->F:Ljava/util/HashMap;

    new-instance v0, Lmc/h;

    iget-object v1, p1, Ljc/v;->j:Loc/i;

    invoke-direct {v0, v1}, Lmc/h;-><init>(Loc/i;)V

    iput-object v0, p0, Lpc/b;->H:Lmc/h;

    iget-object p1, p1, Ljc/v;->f:Ljc/g;

    invoke-virtual {p1, p0}, Ljc/g;->a(Ljc/d;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lqc/j;Lic/m;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Landroidx/work/impl/foreground/SystemForegroundService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "ACTION_START_FOREGROUND"

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "KEY_WORKSPEC_ID"

    iget-object v1, p1, Lqc/j;->a:Ljava/lang/String;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "KEY_GENERATION"

    iget p1, p1, Lqc/j;->b:I

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "KEY_NOTIFICATION_ID"

    iget p1, p2, Lic/m;->a:I

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "KEY_FOREGROUND_SERVICE_TYPE"

    iget p1, p2, Lic/m;->b:I

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "KEY_NOTIFICATION"

    iget-object p1, p2, Lic/m;->c:Landroid/app/Notification;

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Landroidx/work/impl/foreground/SystemForegroundService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "ACTION_STOP_FOREGROUND"

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method


# virtual methods
.method public final b(Lqc/j;Z)V
    .locals 7

    iget-object p2, p0, Lpc/b;->y:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lpc/b;->F:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqc/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpc/b;->G:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lpc/b;->E:Ljava/util/LinkedHashMap;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lic/m;

    iget-object v0, p0, Lpc/b;->z:Lqc/j;

    invoke-virtual {p1, v0}, Lqc/j;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lpc/b;->E:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_5

    iget-object v0, p0, Lpc/b;->E:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqc/j;

    iput-object v0, p0, Lpc/b;->z:Lqc/j;

    iget-object v0, p0, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lic/m;

    iget-object v1, p0, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    iget v2, v0, Lic/m;->a:I

    iget v3, v0, Lic/m;->b:I

    iget-object v4, v0, Lic/m;->c:Landroid/app/Notification;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1f

    if-lt v5, v6, :cond_3

    invoke-static {v1, v2, v4, v3}, La4/a;->D(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    goto :goto_2

    :cond_3
    const/16 v6, 0x1d

    if-lt v5, v6, :cond_4

    invoke-static {v1, v2, v4, v3}, La4/a;->C(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1, v2, v4}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :goto_2
    iget-object v1, p0, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    iget v0, v0, Lic/m;->a:I

    iget-object v1, v1, Landroidx/work/impl/foreground/SystemForegroundService;->z:Landroid/app/NotificationManager;

    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->cancel(I)V

    goto :goto_3

    :cond_5
    iput-object v1, p0, Lpc/b;->z:Lqc/j;

    :cond_6
    :goto_3
    iget-object v0, p0, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    if-eqz p2, :cond_7

    if-eqz v0, :cond_7

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    sget-object v2, Lpc/b;->J:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Removing Notification (id: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p2, Lic/m;->a:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", workSpecId: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", notificationType: "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p2, Lic/m;->b:I

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget p1, p2, Lic/m;->a:I

    iget-object p2, v0, Landroidx/work/impl/foreground/SystemForegroundService;->z:Landroid/app/NotificationManager;

    invoke-virtual {p2, p1}, Landroid/app/NotificationManager;->cancel(I)V

    :cond_7
    return-void

    :goto_4
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d(Lqc/q;Lmc/c;)V
    .locals 4

    instance-of v0, p2, Lmc/b;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lqc/q;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Constraints unmet for WorkSpec "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lpc/b;->J:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lhg3/i;->P(Lqc/q;)Lqc/j;

    move-result-object p1

    check-cast p2, Lmc/b;

    iget p2, p2, Lmc/b;->a:I

    iget-object v0, p0, Lpc/b;->w:Ljc/v;

    iget-object v1, v0, Ljc/v;->d:Lsc/a;

    new-instance v2, Lrc/i;

    iget-object v0, v0, Ljc/v;->f:Ljc/g;

    new-instance v3, Ljc/l;

    invoke-direct {v3, p1}, Ljc/l;-><init>(Lqc/j;)V

    const/4 p1, 0x1

    invoke-direct {v2, v0, v3, p1, p2}, Lrc/i;-><init>(Ljc/g;Ljc/l;ZI)V

    invoke-interface {v1, v2}, Lsc/a;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final e(Landroid/content/Intent;)V
    .locals 9

    iget-object v0, p0, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    if-eqz v0, :cond_6

    const-string v0, "KEY_NOTIFICATION_ID"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "KEY_FOREGROUND_SERVICE_TYPE"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "KEY_WORKSPEC_ID"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "KEY_GENERATION"

    invoke-virtual {p1, v4, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    new-instance v5, Lqc/j;

    invoke-direct {v5, v3, v4}, Lqc/j;-><init>(Ljava/lang/String;I)V

    const-string v4, "KEY_NOTIFICATION"

    invoke-virtual {p1, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/app/Notification;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v4

    const-string v6, ", workSpecId: "

    const-string v7, ", notificationType :"

    const-string v8, "Notifying with (id:"

    invoke-static {v0, v8, v6, v3, v7}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ")"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lpc/b;->J:Ljava/lang/String;

    invoke-virtual {v4, v6, v3}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_5

    new-instance v3, Lic/m;

    invoke-direct {v3, v0, p1, v2}, Lic/m;-><init>(ILandroid/app/Notification;I)V

    iget-object v2, p0, Lpc/b;->E:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lpc/b;->z:Lqc/j;

    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lic/m;

    const/16 v6, 0x1d

    if-nez v4, :cond_0

    iput-object v5, p0, Lpc/b;->z:Lqc/j;

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    iget-object v3, v3, Landroidx/work/impl/foreground/SystemForegroundService;->z:Landroid/app/NotificationManager;

    invoke-virtual {v3, v0, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v6, :cond_2

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lic/m;

    iget v0, v0, Lic/m;->b:I

    or-int/2addr v1, v0

    goto :goto_0

    :cond_1
    new-instance v3, Lic/m;

    iget p1, v4, Lic/m;->a:I

    iget-object v0, v4, Lic/m;->c:Landroid/app/Notification;

    invoke-direct {v3, p1, v0, v1}, Lic/m;-><init>(ILandroid/app/Notification;I)V

    goto :goto_1

    :cond_2
    move-object v3, v4

    :goto_1
    iget-object p1, p0, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    iget v0, v3, Lic/m;->a:I

    iget v1, v3, Lic/m;->b:I

    iget-object v2, v3, Lic/m;->c:Landroid/app/Notification;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-lt v3, v4, :cond_3

    invoke-static {p1, v0, v2, v1}, La4/a;->D(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    return-void

    :cond_3
    if-lt v3, v6, :cond_4

    invoke-static {p1, v0, v2, v1}, La4/a;->C(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    return-void

    :cond_4
    invoke-virtual {p1, v0, v2}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Notification passed in the intent was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "handleNotify was called on the destroyed dispatcher"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p0, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    iget-object v1, p0, Lpc/b;->y:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lpc/b;->G:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc3/k1;

    invoke-interface {v3, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lpc/b;->w:Ljc/v;

    iget-object v0, v0, Ljc/v;->f:Ljc/g;

    iget-object v2, v0, Ljc/g;->k:Ljava/lang/Object;

    monitor-enter v2

    :try_start_1
    iget-object v0, v0, Ljc/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v2

    return-void

    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final g(II)V
    .locals 7

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Foreground service timed out, FGS type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lpc/b;->J:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lpc/b;->E:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lic/m;

    iget v3, v3, Lic/m;->b:I

    if-ne v3, p2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqc/j;

    iget-object v3, p0, Lpc/b;->w:Ljc/v;

    iget-object v4, v3, Ljc/v;->d:Lsc/a;

    new-instance v5, Lrc/i;

    iget-object v3, v3, Ljc/v;->f:Ljc/g;

    new-instance v6, Ljc/l;

    invoke-direct {v6, v1}, Ljc/l;-><init>(Lqc/j;)V

    const/16 v1, -0x80

    invoke-direct {v5, v3, v6, v2, v1}, Lrc/i;-><init>(Ljc/g;Ljc/l;ZI)V

    invoke-interface {v4, v5}, Lsc/a;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    if-eqz p2, :cond_2

    iput-boolean v2, p2, Landroidx/work/impl/foreground/SystemForegroundService;->x:Z

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/foreground/SystemForegroundService;->E:Ljava/lang/String;

    const-string v3, "Shutting down."

    invoke-virtual {v0, v1, v3}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Landroid/app/Service;->stopForeground(Z)V

    invoke-virtual {p2, p1}, Landroid/app/Service;->stopSelf(I)V

    :cond_2
    return-void
.end method
