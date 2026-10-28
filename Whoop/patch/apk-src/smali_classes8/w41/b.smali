.class public abstract Lw41/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0001\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lw41/z;",
        "mapState",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "a",
        "(Lw41/z;)Lcom/google/android/gms/maps/model/LatLngBounds;",
        "Lw41/z$b;",
        "b",
        "(Lw41/z$b;)Lcom/google/android/gms/maps/model/LatLngBounds;",
        "",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "c",
        "(Lw41/z$b;)Ljava/util/List;",
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
.method public static final a(Lw41/z;)Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 1
    .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const-string v0, "mapState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lw41/z$b;

    if-eqz v0, :cond_0

    check-cast p0, Lw41/z$b;

    invoke-static {p0}, Lw41/b;->b(Lw41/z$b;)Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lw41/z$a;

    if-eqz v0, :cond_1

    check-cast p0, Lw41/z$a;

    invoke-static {p0}, Lx41/b;->a(Lw41/z$a;)Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b(Lw41/z$b;)Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 3

    const-string v0, "mapState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw41/z$b;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lw41/z$b;->f()Lw41/w;

    move-result-object p0

    invoke-static {p0}, Lw41/p;->a(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p0

    new-instance v0, Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-direct {v0, p0, p0}, Lcom/google/android/gms/maps/model/LatLngBounds;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    return-object v0

    :cond_0
    new-instance v0, Lwp/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    iput-wide v1, v0, Lwp/f;->a:D

    const-wide/high16 v1, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    iput-wide v1, v0, Lwp/f;->b:D

    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    iput-wide v1, v0, Lwp/f;->c:D

    iput-wide v1, v0, Lwp/f;->d:D

    invoke-virtual {p0}, Lw41/z$b;->d()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw41/w;

    invoke-static {v1}, Lw41/p;->a(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwp/f;->b(Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lwp/f;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lw41/z$b;)Ljava/util/List;
    .locals 2
    .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw41/z$b;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    const-string v0, "mapState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw41/z$b;->d()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw41/w;

    invoke-static {v1}, Lw41/p;->a(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
