.class public final Landroidx/compose/ui/graphics/painter/BitmapPainter;
.super Ln2/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/painter/BitmapPainter;",
        "Ln2/a;",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final E:Li2/g;

.field public final F:J

.field public G:I

.field public final H:J

.field public I:F

.field public J:Li2/y;


# direct methods
.method public constructor <init>(Li2/g;)V
    .locals 6

    .line 1
    iget-object v0, p1, Li2/g;->a:Landroid/graphics/Bitmap;

    .line 2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 3
    iget-object v1, p1, Li2/g;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-long v2, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    int-to-long v0, v1

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    .line 4
    invoke-direct {p0, p1, v0, v1}, Landroidx/compose/ui/graphics/painter/BitmapPainter;-><init>(Li2/g;J)V

    return-void
.end method

.method public constructor <init>(Li2/g;J)V
    .locals 3

    .line 5
    invoke-direct {p0}, Ln2/a;-><init>()V

    .line 6
    iput-object p1, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->E:Li2/g;

    .line 7
    iput-wide p2, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->F:J

    const/4 v0, 0x1

    .line 8
    iput v0, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->G:I

    const-wide/16 v0, 0x0

    long-to-int v2, v0

    if-ltz v2, :cond_0

    long-to-int v0, v0

    if-ltz v0, :cond_0

    const/16 v0, 0x20

    shr-long v0, p2, v0

    long-to-int v0, v0

    if-ltz v0, :cond_0

    const-wide v1, 0xffffffffL

    and-long/2addr v1, p2

    long-to-int v1, v1

    if-ltz v1, :cond_0

    .line 9
    iget-object v2, p1, Li2/g;->a:Landroid/graphics/Bitmap;

    .line 10
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-gt v0, v2, :cond_0

    .line 11
    iget-object p1, p1, Li2/g;->a:Landroid/graphics/Bitmap;

    .line 12
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    if-gt v1, p1, :cond_0

    .line 13
    iput-wide p2, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->H:J

    const/high16 p1, 0x3f800000    # 1.0f

    .line 14
    iput p1, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->I:F

    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->I:F

    return-void
.end method

.method public final e(Li2/y;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->J:Li2/y;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    iget-object v0, p1, Landroidx/compose/ui/graphics/painter/BitmapPainter;->E:Li2/g;

    iget-object v1, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->E:Li2/g;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v0, 0x0

    invoke-static {v0, v1, v0, v1}, Ly3/j;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-wide v0, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->F:J

    iget-wide v2, p1, Landroidx/compose/ui/graphics/painter/BitmapPainter;->F:J

    invoke-static {v0, v1, v2, v3}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget v0, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->G:I

    iget p1, p1, Landroidx/compose/ui/graphics/painter/BitmapPainter;->G:I

    if-ne v0, p1, :cond_5

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->H:J

    invoke-static {v0, v1}, Lv63/b;->l(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->E:Li2/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->F:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->G:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i(Lk2/e;)V
    .locals 14

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v1, v3

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-long v3, v0

    shl-long v2, v3, v2

    int-to-long v0, v1

    and-long/2addr v0, v5

    or-long v8, v2, v0

    iget v10, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->I:F

    iget-object v11, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->J:Li2/y;

    iget v12, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->G:I

    const/16 v13, 0x148

    iget-object v5, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->E:Li2/g;

    iget-wide v6, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->F:J

    move-object v4, p1

    invoke-static/range {v4 .. v13}, Lk2/e;->K0(Lk2/e;Li2/g;JJFLi2/y;II)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BitmapPainter(image="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->E:Li2/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", srcOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ly3/j;->e(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", srcSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->F:J

    invoke-static {v1, v2}, Ly3/l;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", filterQuality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->G:I

    if-nez v1, :cond_0

    const-string v1, "None"

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const-string v1, "Low"

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    const-string v1, "Medium"

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    const-string v1, "High"

    goto :goto_0

    :cond_3
    const-string v1, "Unknown"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
