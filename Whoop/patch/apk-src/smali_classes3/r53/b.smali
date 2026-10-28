.class public final Lr53/b;
.super Lr53/c;
.source "SourceFile"


# instance fields
.field public final E:Lr53/f;

.field public final F:I

.field public final G:I


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Lr53/f;IILandroid/graphics/Rect;Lr53/a;)V
    .locals 1

    filled-new-array {p2}, [Lr53/f;

    move-result-object v0

    invoke-direct {p0, p1, p5, v0, p6}, Lr53/c;-><init>(Ljava/nio/ByteBuffer;Landroid/graphics/Rect;[Lr53/f;Ljava/lang/Runnable;)V

    iput-object p2, p0, Lr53/b;->E:Lr53/f;

    iput p3, p0, Lr53/b;->F:I

    iput p4, p0, Lr53/b;->G:I

    return-void
.end method


# virtual methods
.method public final b(IIII)I
    .locals 0

    mul-int/2addr p2, p4

    shl-int/lit8 p1, p3, 0x2

    add-int/2addr p2, p1

    return p2
.end method

.method public final h()Landroid/graphics/Bitmap;
    .locals 6

    iget-object v0, p0, Lr53/c;->w:Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lr53/c;->x:[Lr53/f;

    array-length v2, v0

    move v3, v1

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v5, v0, v3

    iget-object v5, v5, Lr53/f;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lr53/c;->w:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lr53/c;->x:[Lr53/f;

    array-length v3, v2

    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    iget-object v5, v5, Lr53/f;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const-string v3, "config"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, p0, Lr53/b;->F:I

    iget v4, p0, Lr53/b;->G:I

    invoke-static {v3, v4, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    const-string v3, "createBitmap(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v2, v0}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    return-object v2
.end method
