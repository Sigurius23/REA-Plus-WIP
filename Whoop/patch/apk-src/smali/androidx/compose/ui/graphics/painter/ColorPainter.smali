.class public final Landroidx/compose/ui/graphics/painter/ColorPainter;
.super Ln2/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/painter/ColorPainter;",
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
.field public final E:J

.field public F:F

.field public G:Li2/y;

.field public final H:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ln2/a;-><init>()V

    iput-wide p1, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->E:J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->F:F

    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide p1, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->H:J

    return-void
.end method


# virtual methods
.method public final b(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->F:F

    return-void
.end method

.method public final e(Li2/y;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->G:Li2/y;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/graphics/painter/ColorPainter;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/graphics/painter/ColorPainter;

    iget-wide v3, p1, Landroidx/compose/ui/graphics/painter/ColorPainter;->E:J

    iget-wide v5, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->E:J

    invoke-static {v5, v6, v3, v4}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->H:J

    return-wide v0
.end method

.method public final hashCode()I
    .locals 2

    sget v0, Li2/x;->o:I

    iget-wide v0, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->E:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public final i(Lk2/e;)V
    .locals 11

    iget v7, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->F:F

    iget-object v8, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->G:Li2/y;

    const/4 v9, 0x0

    const/16 v10, 0x56

    iget-wide v1, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->E:J

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v10}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ColorPainter(color="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Landroidx/compose/ui/graphics/painter/ColorPainter;->E:J

    invoke-static {v1, v2}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
