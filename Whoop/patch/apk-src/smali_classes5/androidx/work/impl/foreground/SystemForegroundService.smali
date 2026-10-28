.class public Landroidx/work/impl/foreground/SystemForegroundService;
.super Landroidx/lifecycle/j0;
.source "SourceFile"


# static fields
.field public static final E:Ljava/lang/String;


# instance fields
.field public x:Z

.field public y:Lpc/b;

.field public z:Landroid/app/NotificationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemFgService"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/foreground/SystemForegroundService;->E:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/lifecycle/j0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Landroidx/work/impl/foreground/SystemForegroundService;->z:Landroid/app/NotificationManager;

    new-instance v0, Lpc/b;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lpc/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/work/impl/foreground/SystemForegroundService;->y:Lpc/b;

    iget-object v1, v0, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    if-eqz v1, :cond_0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    sget-object v1, Lpc/b;->J:Ljava/lang/String;

    const-string v2, "A callback already exists."

    invoke-virtual {v0, v1, v2}, Lic/w;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iput-object p0, v0, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    return-void
.end method

.method public final onCreate()V
    .locals 0

    invoke-super {p0}, Landroidx/lifecycle/j0;->onCreate()V

    invoke-virtual {p0}, Landroidx/work/impl/foreground/SystemForegroundService;->a()V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/lifecycle/j0;->onDestroy()V

    iget-object v0, p0, Landroidx/work/impl/foreground/SystemForegroundService;->y:Lpc/b;

    invoke-virtual {v0}, Lpc/b;->f()V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    iget-boolean p2, p0, Landroidx/work/impl/foreground/SystemForegroundService;->x:Z

    sget-object v0, Landroidx/work/impl/foreground/SystemForegroundService;->E:Ljava/lang/String;

    if-eqz p2, :cond_0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p2

    const-string v1, "Re-initializing SystemForegroundService after a request to shut-down."

    invoke-virtual {p2, v0, v1}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/work/impl/foreground/SystemForegroundService;->y:Lpc/b;

    invoke-virtual {p2}, Lpc/b;->f()V

    invoke-virtual {p0}, Landroidx/work/impl/foreground/SystemForegroundService;->a()V

    const/4 p2, 0x0

    iput-boolean p2, p0, Landroidx/work/impl/foreground/SystemForegroundService;->x:Z

    :cond_0
    if-eqz p1, :cond_4

    iget-object p2, p0, Landroidx/work/impl/foreground/SystemForegroundService;->y:Lpc/b;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lpc/b;->J:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ACTION_START_FOREGROUND"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "KEY_WORKSPEC_ID"

    if-eqz v3, :cond_1

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Started foreground service "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v1, v0}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iget-object v0, p2, Lpc/b;->x:Lsc/a;

    new-instance v1, Lds/s;

    const/16 v2, 0xc

    const/4 v3, 0x0

    invoke-direct {v1, p2, p3, v3, v2}, Lds/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-interface {v0, v1}, Lsc/a;->a(Ljava/lang/Runnable;)V

    invoke-virtual {p2, p1}, Lpc/b;->e(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    const-string v3, "ACTION_NOTIFY"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p2, p1}, Lpc/b;->e(Landroid/content/Intent;)V

    goto :goto_0

    :cond_2
    const-string v3, "ACTION_CANCEL_WORK"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Stopping foreground work for "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v1, v0}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_4

    iget-object p2, p2, Lpc/b;->w:Ljc/v;

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljc/v;->f(Ljava/util/UUID;)Lic/f0;

    goto :goto_0

    :cond_3
    const-string p1, "ACTION_STOP_FOREGROUND"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p1

    const-string v2, "Stopping foreground service"

    invoke-virtual {p1, v1, v2}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p2, Lpc/b;->I:Landroidx/work/impl/foreground/SystemForegroundService;

    if-eqz p1, :cond_4

    const/4 p2, 0x1

    iput-boolean p2, p1, Landroidx/work/impl/foreground/SystemForegroundService;->x:Z

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    const-string v2, "Shutting down."

    invoke-virtual {v1, v0, v2}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/app/Service;->stopForeground(Z)V

    invoke-virtual {p1, p3}, Landroid/app/Service;->stopSelf(I)V

    :cond_4
    :goto_0
    const/4 p1, 0x3

    return p1
.end method

.method public final onTimeout(I)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/work/impl/foreground/SystemForegroundService;->y:Lpc/b;

    const/16 v1, 0x800

    invoke-virtual {v0, p1, v1}, Lpc/b;->g(II)V

    return-void
.end method

.method public final onTimeout(II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/work/impl/foreground/SystemForegroundService;->y:Lpc/b;

    invoke-virtual {v0, p1, p2}, Lpc/b;->g(II)V

    return-void
.end method
