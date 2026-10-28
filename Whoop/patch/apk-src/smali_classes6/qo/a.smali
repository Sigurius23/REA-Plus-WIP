.class public final Lqo/a;
.super Lcom/google/android/gms/common/api/h;
.source "SourceFile"


# static fields
.field public static a:I = 0x1


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 6

    sget-object v3, Ltp/h;->a:Lcom/google/android/gms/common/api/f;

    sget-object v4, Lcom/google/android/gms/common/api/c;->g:Lcom/google/android/gms/common/api/b;

    sget-object v5, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public c(Ltp/j;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Lq30/u0;

    const/16 v2, 0x1b

    invoke-direct {v1, p1, v2}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Le73/b;->e:Ljava/lang/Object;

    const/16 p1, 0x97a

    iput p1, v0, Le73/b;->d:I

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized d()I
    .locals 4

    monitor-enter p0

    :try_start_0
    sget v0, Lqo/a;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/h;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v1

    const v2, 0xbdfcb8

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;I)I

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x4

    sput v0, Lqo/a;->a:I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/common/GoogleApiAvailability;->getErrorResolutionIntent(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "com.google.android.gms.auth.api.fallback"

    invoke-static {v0, v1}, Ldp/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    sput v0, Lqo/a;->a:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    sput v0, Lqo/a;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    monitor-exit p0

    return v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
