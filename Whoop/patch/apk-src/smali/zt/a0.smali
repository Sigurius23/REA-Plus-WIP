.class public final Lzt/a0;
.super Landroid/os/Binder;
.source "SourceFile"


# instance fields
.field public final f:Lzd3/t;


# direct methods
.method public constructor <init>(Lzd3/t;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    iput-object p1, p0, Lzt/a0;->f:Lzd3/t;

    return-void
.end method


# virtual methods
.method public final a(Lzt/b0;)V
    .locals 4

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    const-string v1, "FirebaseMessaging"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "service received new intent via bind strategy"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p1, Lzt/b0;->a:Landroid/content/Intent;

    iget-object v1, p0, Lzt/a0;->f:Lzd3/t;

    iget-object v1, v1, Lzd3/t;->a:Ljava/lang/Object;

    check-cast v1, Lzt/h;

    invoke-static {v1, v0}, Lzt/h;->a(Lzt/h;Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Landroidx/profileinstaller/b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroidx/profileinstaller/b;-><init>(I)V

    new-instance v2, Lvd1/c;

    const/4 v3, 0x6

    invoke-direct {v2, p1, v3}, Lvd1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcq/d;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/SecurityException;

    const-string v0, "Binding only allowed within app"

    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
