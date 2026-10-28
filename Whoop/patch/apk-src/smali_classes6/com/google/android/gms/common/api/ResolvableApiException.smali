.class public Lcom/google/android/gms/common/api/ResolvableApiException;
.super Lcom/google/android/gms/common/api/ApiException;
.source "SourceFile"


# virtual methods
.method public final b()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    iget-object v0, v0, Lcom/google/android/gms/common/api/Status;->y:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public final c(Landroid/app/Activity;I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/common/api/Status;->f(Landroid/app/Activity;I)V

    return-void
.end method
