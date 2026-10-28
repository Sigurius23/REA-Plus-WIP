.class public abstract Lw41/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lw41/w;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "a",
        "(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;",
        "Lw41/z$a;",
        "",
        "b",
        "(Lw41/z$a;)Ljava/util/List;",
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
.method public static final a(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0}, Lw41/w;->a()D

    move-result-wide v1

    invoke-virtual {p0}, Lw41/w;->b()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method public static final b(Lw41/z$a;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw41/z$a;",
            ")",
            "Ljava/util/List<",
            "Lw41/w;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw41/z$a;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lw41/z$a;->c()Lw41/w;

    move-result-object p0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw41/w;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p0}, Lw41/w;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    check-cast v0, Ljava/util/Collection;

    invoke-static {p0, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method
