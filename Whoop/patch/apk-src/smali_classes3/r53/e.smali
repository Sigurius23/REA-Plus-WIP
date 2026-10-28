.class public final Lr53/e;
.super Lr53/c;
.source "SourceFile"


# instance fields
.field public final E:Lr53/f;

.field public final F:Lr53/f;

.field public final G:Lr53/f;

.field public final H:I

.field public final I:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;Lr53/f;Lr53/f;Lr53/f;IILandroid/graphics/Rect;Lr53/a;)V
    .locals 1

    filled-new-array {p2, p3, p4}, [Lr53/f;

    move-result-object v0

    invoke-direct {p0, p1, p7, v0, p8}, Lr53/c;-><init>(Ljava/nio/ByteBuffer;Landroid/graphics/Rect;[Lr53/f;Ljava/lang/Runnable;)V

    iput-object p2, p0, Lr53/e;->E:Lr53/f;

    iput-object p3, p0, Lr53/e;->F:Lr53/f;

    iput-object p4, p0, Lr53/e;->G:Lr53/f;

    iput p5, p0, Lr53/e;->H:I

    iput p6, p0, Lr53/e;->I:I

    return-void
.end method


# virtual methods
.method public final b(IIII)I
    .locals 0

    if-nez p1, :cond_0

    mul-int/2addr p2, p4

    add-int/2addr p2, p3

    return p2

    :cond_0
    add-int/lit8 p3, p3, 0x1

    shr-int/lit8 p1, p3, 0x1

    add-int/lit8 p4, p4, 0x1

    shr-int/lit8 p3, p4, 0x1

    mul-int/2addr p2, p3

    add-int/2addr p2, p1

    return p2
.end method

.method public final h(Lr53/b;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, Lr53/c;->y:Landroid/graphics/Rect;

    iget-object v3, v0, Lr53/c;->y:Landroid/graphics/Rect;

    filled-new-array {v3, v2}, [Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v5

    const/4 v6, 0x2

    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Landroid/graphics/Rect;

    const-string v7, "other"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v8, v4

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    if-ge v10, v8, :cond_0

    aget-object v11, v4, v10

    invoke-virtual {v11}, Landroid/graphics/Rect;->width()I

    move-result v11

    invoke-static {v5, v11}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v3, v2}, [Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/graphics/Rect;

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v2

    move v7, v9

    :goto_1
    if-ge v7, v5, :cond_1

    aget-object v8, v2, v7

    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    move-result v8

    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    move-result v3

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v23

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v24

    sget-object v10, Lio/github/crow_misia/libyuv/Yuv;->INSTANCE:Lio/github/crow_misia/libyuv/Yuv;

    iget-object v2, v0, Lr53/e;->E:Lr53/f;

    iget-object v11, v2, Lr53/f;->b:Ljava/nio/ByteBuffer;

    iget v12, v2, Lr53/f;->a:I

    invoke-static {v0, v9}, Lds/p;->N(Lr53/c;I)I

    move-result v13

    iget-object v2, v0, Lr53/e;->F:Lr53/f;

    iget-object v14, v2, Lr53/f;->b:Ljava/nio/ByteBuffer;

    iget v15, v2, Lr53/f;->a:I

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lds/p;->N(Lr53/c;I)I

    move-result v16

    iget-object v2, v0, Lr53/e;->G:Lr53/f;

    iget-object v3, v2, Lr53/f;->b:Ljava/nio/ByteBuffer;

    iget v2, v2, Lr53/f;->a:I

    invoke-static {v0, v6}, Lds/p;->N(Lr53/c;I)I

    move-result v19

    iget-object v4, v1, Lr53/b;->E:Lr53/f;

    iget-object v5, v4, Lr53/f;->b:Ljava/nio/ByteBuffer;

    iget v4, v4, Lr53/f;->a:I

    invoke-static {v1, v9}, Lds/p;->N(Lr53/c;I)I

    move-result v22

    move/from16 v18, v2

    move-object/from16 v17, v3

    move/from16 v21, v4

    move-object/from16 v20, v5

    invoke-virtual/range {v10 .. v24}, Lio/github/crow_misia/libyuv/Yuv;->convertI420ToABGR(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IIII)V

    return-void
.end method
