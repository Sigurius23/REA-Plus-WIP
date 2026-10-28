.class public abstract Llp0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroid/graphics/Rect;",
        "b",
        "(Landroid/graphics/Rect;)Landroid/graphics/Rect;",
        "sleep-coach_release"
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
.method public static final synthetic a(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 0

    invoke-static {p0}, Llp0/k;->b(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 5

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p0, Landroid/graphics/Rect;->left:I

    iget v2, p0, Landroid/graphics/Rect;->top:I

    iget v3, p0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v4

    div-int/lit8 v4, v4, 0xa

    add-int/2addr v4, v3

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    invoke-direct {v0, v1, v2, v4, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method
