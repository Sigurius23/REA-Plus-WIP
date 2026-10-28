.class public final Lto/a0;
.super Lto/r0;
.source "SourceFile"


# instance fields
.field public F:Lcq/i;


# direct methods
.method public static m(Landroid/app/Activity;)Lto/a0;
    .locals 3

    invoke-static {p0}, Lto/h;->b(Landroid/app/Activity;)Lto/i;

    move-result-object p0

    const-class v0, Lto/a0;

    const-string v1, "GmsAvailabilityHelper"

    invoke-interface {p0, v0, v1}, Lto/i;->d(Ljava/lang/Class;Ljava/lang/String;)Lto/h;

    move-result-object v0

    check-cast v0, Lto/a0;

    if-eqz v0, :cond_1

    iget-object p0, v0, Lto/a0;->F:Lcq/i;

    iget-object p0, p0, Lcq/i;->a:Lcq/u;

    invoke-virtual {p0}, Lcq/u;->isComplete()Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Lcq/i;

    invoke-direct {p0}, Lcq/i;-><init>()V

    iput-object p0, v0, Lto/a0;->F:Lcq/i;

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, Lto/a0;

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Lto/r0;-><init>(Lto/i;Lcom/google/android/gms/common/GoogleApiAvailability;)V

    new-instance v2, Lcq/i;

    invoke-direct {v2}, Lcq/i;-><init>()V

    iput-object v2, v0, Lto/a0;->F:Lcq/i;

    invoke-interface {p0, v1, v0}, Lto/i;->o(Ljava/lang/String;Lto/h;)V

    return-object v0
.end method


# virtual methods
.method public final e()V
    .locals 3

    iget-object v0, p0, Lto/a0;->F:Lcq/i;

    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Host activity was destroyed before Google Play services could be made available."

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final j(Lcom/google/android/gms/common/a;I)V
    .locals 5

    iget-object p2, p1, Lcom/google/android/gms/common/a;->z:Ljava/lang/String;

    if-nez p2, :cond_0

    const-string p2, "Error connecting to Google Play services"

    :cond_0
    iget-object v0, p0, Lto/a0;->F:Lcq/i;

    new-instance v1, Lcom/google/android/gms/common/api/ApiException;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    iget v3, p1, Lcom/google/android/gms/common/a;->x:I

    iget-object v4, p1, Lcom/google/android/gms/common/a;->y:Landroid/app/PendingIntent;

    invoke-direct {v2, v3, p2, v4, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcq/i;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public final k()V
    .locals 5

    iget-object v0, p0, Lto/h;->w:Ljava/lang/Object;

    invoke-interface {v0}, Lto/i;->k()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lto/a0;->F:Lcq/i;

    new-instance v2, Lcom/google/android/gms/common/api/ApiException;

    new-instance v3, Lcom/google/android/gms/common/api/Status;

    const/16 v4, 0x8

    invoke-direct {v3, v4, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v2}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    iget-object v2, p0, Lto/r0;->E:Lcom/google/android/gms/common/GoogleApiAvailability;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lto/a0;->F:Lcq/i;

    invoke-virtual {v0, v1}, Lcq/i;->d(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v2, p0, Lto/a0;->F:Lcq/i;

    iget-object v2, v2, Lcq/i;->a:Lcq/u;

    invoke-virtual {v2}, Lcq/u;->isComplete()Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, Lcom/google/android/gms/common/a;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/common/a;-><init>(ILandroid/app/PendingIntent;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v2, v0}, Lto/r0;->l(Lcom/google/android/gms/common/a;I)V

    :cond_2
    return-void
.end method

.method public final n()Lcq/u;
    .locals 1

    iget-object v0, p0, Lto/a0;->F:Lcq/i;

    iget-object v0, v0, Lcq/i;->a:Lcq/u;

    return-object v0
.end method
