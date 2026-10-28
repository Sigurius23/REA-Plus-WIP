.class public abstract Lvq0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroid/graphics/Bitmap;",
        "image",
        "a",
        "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;",
        "",
        "b",
        "(Landroid/graphics/Bitmap;)I",
        "community_release"
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
.method public static final a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 4

    const-string v0, "image"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v2

    const/high16 v3, 0x100000

    if-gt v2, v3, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0}, Lvq0/c;->b(Landroid/graphics/Bitmap;)I

    move-result v2

    div-int/2addr v0, v2

    div-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string v0, "createScaledBitmap(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final b(Landroid/graphics/Bitmap;)I
    .locals 1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result p0

    const v0, 0x100001

    if-gt v0, p0, :cond_0

    const v0, 0x500001

    if-ge p0, v0, :cond_0

    const/4 p0, 0x5

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method
