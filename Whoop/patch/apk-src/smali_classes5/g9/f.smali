.class public final Lg9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/h;


# virtual methods
.method public final a(Lu8/p;)I
    .locals 0

    iget-object p1, p1, Lu8/p;->r:Lu8/l;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Landroid/os/Looper;Lc9/n;)V
    .locals 0

    return-void
.end method

.method public final c(Lg9/d;Lu8/p;)Le10/k0;
    .locals 2

    iget-object p1, p2, Lu8/p;->r:Lu8/l;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Le10/k0;

    new-instance p2, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    new-instance v0, Landroidx/media3/exoplayer/drm/UnsupportedDrmException;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const/16 v1, 0x1771

    invoke-direct {p2, v1, v0}, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;-><init>(ILjava/lang/Throwable;)V

    const/16 v0, 0x15

    invoke-direct {p1, p2, v0}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method
