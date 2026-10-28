.class public final Lvm/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvm/h;


# virtual methods
.method public final a(Lsn/z;Lrm/c0;)Lty/c;
    .locals 2

    iget-object p1, p2, Lrm/c0;->O:Lvm/c;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lty/c;

    new-instance p2, Lcom/google/android/exoplayer2/drm/DrmSession$DrmSessionException;

    new-instance v0, Lcom/google/android/exoplayer2/drm/UnsupportedDrmException;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const/16 v1, 0x1771

    invoke-direct {p2, v1, v0}, Lcom/google/android/exoplayer2/drm/DrmSession$DrmSessionException;-><init>(ILjava/lang/Exception;)V

    const/16 v0, 0xc

    invoke-direct {p1, p2, v0}, Lty/c;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method

.method public final b(Lrm/c0;)I
    .locals 0

    iget-object p1, p1, Lrm/c0;->O:Lvm/c;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Landroid/os/Looper;Lsm/f;)V
    .locals 0

    return-void
.end method
