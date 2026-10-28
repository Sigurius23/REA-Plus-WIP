.class public abstract Lzt/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:Ljava/lang/Object;

.field public static c:Lbq/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lzt/z;->a:J

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lzt/z;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lzt/z;->c:Lbq/a;

    if-nez v0, :cond_0

    new-instance v0, Lbq/a;

    invoke-direct {v0, p0}, Lbq/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lzt/z;->c:Lbq/a;

    iget-object p0, v0, Lbq/a;->a:Ljava/lang/Object;

    monitor-enter p0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, v0, Lbq/a;->g:Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Intent;)V
    .locals 3

    sget-object v0, Lzt/z;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lzt/z;->c:Lbq/a;

    if-eqz v1, :cond_0

    const-string v1, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    sget-object p0, Lzt/z;->c:Lbq/a;

    invoke-virtual {p0}, Lbq/a;->c()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static c(Landroid/content/Context;Lzt/c0;Landroid/content/Intent;)V
    .locals 3

    sget-object v0, Lzt/z;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lzt/z;->a(Landroid/content/Context;)V

    const-string p0, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    const/4 v1, 0x0

    invoke-virtual {p2, p0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    const-string v1, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    const/4 v2, 0x1

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    if-nez p0, :cond_0

    sget-object p0, Lzt/z;->c:Lbq/a;

    sget-wide v1, Lzt/z;->a:J

    invoke-virtual {p0, v1, v2}, Lbq/a;->a(J)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p1, p2}, Lzt/c0;->b(Landroid/content/Intent;)Lcq/u;

    move-result-object p0

    new-instance p1, Lrm/p;

    const/16 v1, 0x1a

    invoke-direct {p1, p2, v1}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, p1}, Lcq/u;->addOnCompleteListener(Lcq/d;)Lcom/google/android/gms/tasks/Task;

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static d(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;
    .locals 4

    sget-object v0, Lzt/z;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lzt/z;->a(Landroid/content/Context;)V

    const-string v1, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    const-string v2, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    sget-object p1, Lzt/z;->c:Lbq/a;

    sget-wide v1, Lzt/z;->a:J

    invoke-virtual {p1, v1, v2}, Lbq/a;->a(J)V

    :cond_1
    monitor-exit v0

    return-object p0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
