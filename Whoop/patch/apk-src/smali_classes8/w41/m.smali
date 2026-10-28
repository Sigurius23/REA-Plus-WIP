.class public abstract Lw41/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0008*\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u001a\u0010\u0010\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000b\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Ly3/f;",
        "mapWidth",
        "a",
        "(F)F",
        "b",
        "Lw41/x;",
        "c",
        "(F)Lw41/x;",
        "Ll0/k1;",
        "d",
        "(Lw41/x;)Ll0/k1;",
        "F",
        "getMAP_BACKGROUND_LOGO_STRIP_MIN",
        "()F",
        "MAP_BACKGROUND_LOGO_STRIP_MIN",
        "getMAP_BACKGROUND_LOGO_STRIP_MAX",
        "MAP_BACKGROUND_LOGO_STRIP_MAX",
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


# static fields
.field private static final a:F

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xc

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lw41/m;->a:F

    const/16 v0, 0xf

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lw41/m;->b:F

    return-void
.end method

.method public static final a(F)F
    .locals 2
    .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const v0, 0x3e6147ae    # 0.22f

    mul-float/2addr p0, v0

    sget v0, Lw41/m;->a:F

    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-gez v1, :cond_0

    return v0

    :cond_0
    sget v0, Lw41/m;->b:F

    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-lez v1, :cond_1

    return v0

    :cond_1
    return p0
.end method

.method public static final b(F)F
    .locals 2
    .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-static {p0}, Lw41/m;->a(F)F

    move-result v0

    sub-float/2addr p0, v0

    const/4 v0, 0x0

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    cmpg-float v1, p0, v0

    if-gez v1, :cond_0

    return v0

    :cond_0
    return p0
.end method

.method public static final c(F)Lw41/x;
    .locals 1
    .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    sget-object v0, Lw41/x$b;->e:Lw41/x$b$a;

    invoke-virtual {v0, p0}, Lw41/x$b$a;->a(F)Lw41/x$b;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lw41/x;)Ll0/k1;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw41/x;->c()F

    move-result v0

    invoke-virtual {p0}, Lw41/x;->d()F

    move-result v1

    invoke-virtual {p0}, Lw41/x;->b()F

    move-result v2

    invoke-virtual {p0}, Lw41/x;->a()F

    move-result p0

    new-instance v3, Ll0/l1;

    invoke-direct {v3, v0, v1, v2, p0}, Ll0/l1;-><init>(FFFF)V

    return-object v3
.end method
