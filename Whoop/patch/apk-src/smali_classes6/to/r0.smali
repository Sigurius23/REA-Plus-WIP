.class public abstract Lto/r0;
.super Lto/h;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final E:Lcom/google/android/gms/common/GoogleApiAvailability;

.field public volatile x:Z

.field public final y:Ljava/util/concurrent/atomic/AtomicReference;

.field public final z:Ljp/d;


# direct methods
.method public constructor <init>(Lto/i;Lcom/google/android/gms/common/GoogleApiAvailability;)V
    .locals 2

    invoke-direct {p0, p1}, Lto/h;-><init>(Lto/i;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lto/r0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljp/d;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ljp/d;-><init>(Landroid/os/Looper;I)V

    iput-object p1, p0, Lto/r0;->z:Ljp/d;

    iput-object p2, p0, Lto/r0;->E:Lcom/google/android/gms/common/GoogleApiAvailability;

    return-void
.end method


# virtual methods
.method public final c(IILandroid/content/Intent;)V
    .locals 4

    iget-object v0, p0, Lto/r0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lto/p0;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p1, v3, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lto/r0;->E:Lcom/google/android/gms/common/GoogleApiAvailability;

    invoke-virtual {p0}, Lto/h;->a()Landroid/app/Activity;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lto/r0;->k()V

    return-void

    :cond_1
    if-eqz v1, :cond_6

    iget-object p2, v1, Lto/p0;->b:Lcom/google/android/gms/common/a;

    iget p2, p2, Lcom/google/android/gms/common/a;->x:I

    const/16 p3, 0x12

    if-ne p2, p3, :cond_5

    if-ne p1, p3, :cond_5

    goto :goto_1

    :cond_2
    const/4 p1, -0x1

    if-ne p2, p1, :cond_3

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lto/r0;->k()V

    return-void

    :cond_3
    if-nez p2, :cond_5

    if-eqz v1, :cond_6

    const/16 p1, 0xd

    if-eqz p3, :cond_4

    const-string p2, "<<ResolutionFailureErrorDetail>>"

    invoke-virtual {p3, p2, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    :cond_4
    new-instance p2, Lcom/google/android/gms/common/a;

    iget-object p3, v1, Lto/p0;->b:Lcom/google/android/gms/common/a;

    invoke-virtual {p3}, Lcom/google/android/gms/common/a;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, v3, p1, v2, p3}, Lcom/google/android/gms/common/a;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V

    iget p1, v1, Lto/p0;->a:I

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p0, p2, p1}, Lto/r0;->j(Lcom/google/android/gms/common/a;I)V

    return-void

    :cond_5
    :goto_0
    if-eqz v1, :cond_6

    iget-object p1, v1, Lto/p0;->b:Lcom/google/android/gms/common/a;

    iget p2, v1, Lto/p0;->a:I

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lto/r0;->j(Lcom/google/android/gms/common/a;I)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 3

    if-eqz p1, :cond_1

    const-string v0, "resolving_error"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/a;

    const-string v1, "failed_status"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "failed_resolution"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/app/PendingIntent;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/a;-><init>(ILandroid/app/PendingIntent;)V

    const-string v1, "failed_client_id"

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    new-instance v1, Lto/p0;

    invoke-direct {v1, v0, p1}, Lto/p0;-><init>(Lcom/google/android/gms/common/a;I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object p1, p0, Lto/r0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lto/r0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/p0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lto/p0;->b:Lcom/google/android/gms/common/a;

    const-string v2, "resolving_error"

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "failed_client_id"

    iget v0, v0, Lto/p0;->a:I

    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget v0, v1, Lcom/google/android/gms/common/a;->x:I

    const-string v2, "failed_status"

    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, v1, Lcom/google/android/gms/common/a;->y:Landroid/app/PendingIntent;

    const-string v1, "failed_resolution"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lto/r0;->x:Z

    return-void
.end method

.method public i()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lto/r0;->x:Z

    return-void
.end method

.method public abstract j(Lcom/google/android/gms/common/a;I)V
.end method

.method public abstract k()V
.end method

.method public final l(Lcom/google/android/gms/common/a;I)V
    .locals 2

    new-instance v0, Lto/p0;

    invoke-direct {v0, p1, p2}, Lto/p0;-><init>(Lcom/google/android/gms/common/a;I)V

    :cond_0
    iget-object p1, p0, Lto/r0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-virtual {p1, p2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p1, Lds/s;

    const/16 p2, 0x11

    const/4 v1, 0x0

    invoke-direct {p1, p0, v0, v1, p2}, Lds/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    iget-object p2, p0, Lto/r0;->z:Ljp/d;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 3

    new-instance p1, Lcom/google/android/gms/common/a;

    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/common/a;-><init>(ILandroid/app/PendingIntent;)V

    iget-object v0, p0, Lto/r0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lto/p0;

    if-nez v2, :cond_0

    const/4 v2, -0x1

    goto :goto_0

    :cond_0
    iget v2, v2, Lto/p0;->a:I

    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, v2}, Lto/r0;->j(Lcom/google/android/gms/common/a;I)V

    return-void
.end method
