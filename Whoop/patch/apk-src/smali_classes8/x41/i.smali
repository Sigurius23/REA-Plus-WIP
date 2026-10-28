.class public abstract Lx41/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lw41/z;",
        "mapState",
        "",
        "isStartActivityRevampEnabled",
        "hasExternalControls",
        "Lw41/x;",
        "a",
        "(Lw41/z;ZZ)Lw41/x;",
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
.method public static final a(Lw41/z;ZZ)Lw41/x;
    .locals 8
    .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const-string v0, "mapState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    instance-of p1, p0, Lw41/z$a;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p0, Lw41/z$a;

    invoke-virtual {p0}, Lw41/z$a;->d()Lw41/x$a;

    move-result-object p0

    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    if-eqz p2, :cond_2

    new-instance v0, Lw41/x$a;

    const/4 p0, 0x2

    int-to-float p0, p0

    const/16 p1, 0x8

    int-to-float p1, p1

    mul-float v1, p0, p1

    const/4 p0, 0x0

    int-to-float p0, p0

    mul-float v3, p0, p1

    const/16 p0, 0x10

    int-to-float p0, p0

    mul-float v4, p0, p1

    const/4 v5, 0x0

    move v2, v1

    invoke-direct/range {v0 .. v5}, Lw41/x$a;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance v1, Lw41/x$a;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lw41/x$a;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method
