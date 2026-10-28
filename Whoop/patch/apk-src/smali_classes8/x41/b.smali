.class public abstract Lx41/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lw41/z$a;",
        "mapState",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "a",
        "(Lw41/z$a;)Lcom/google/android/gms/maps/model/LatLngBounds;",
        "newBounds",
        "lastFittedBounds",
        "",
        "b",
        "(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/LatLngBounds;)Z",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lw41/z$a;)Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 3

    const-string v0, "mapState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lw41/p;->b(Lw41/z$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lw41/z$a;->c()Lw41/w;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lw41/p;->a(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    new-instance p0, Lcom/google/android/gms/maps/model/LatLng;

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1, v0, v1}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    :cond_1
    new-instance v0, Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-direct {v0, p0, p0}, Lcom/google/android/gms/maps/model/LatLngBounds;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    return-object v0

    :cond_2
    check-cast v0, Ljava/lang/Iterable;

    new-instance p0, Lwp/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    iput-wide v1, p0, Lwp/f;->a:D

    const-wide/high16 v1, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    iput-wide v1, p0, Lwp/f;->b:D

    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    iput-wide v1, p0, Lwp/f;->c:D

    iput-wide v1, p0, Lwp/f;->d:D

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw41/w;

    invoke-static {v1}, Lw41/p;->a(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {p0, v1}, Lwp/f;->b(Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lwp/f;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/LatLngBounds;)Z
    .locals 2
    .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const-string v0, "newBounds"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->w:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/model/LatLngBounds;->b(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->x:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/maps/model/LatLngBounds;->b(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    return v0
.end method
