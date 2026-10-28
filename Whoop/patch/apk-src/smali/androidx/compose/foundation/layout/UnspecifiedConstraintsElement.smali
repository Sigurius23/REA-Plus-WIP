.class final Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;
.super La3/h1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La3/h1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;",
        "La3/h1;",
        "Ll0/y1;",
        "foundation-layout"
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
.field public final w:F

.field public final x:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->w:F

    iput p2, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->x:F

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ll0/y1;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget v1, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->w:F

    iput v1, v0, Ll0/y1;->O:F

    iget v1, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->x:F

    iput v1, v0, Ll0/y1;->P:F

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;

    iget v0, p1, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->w:F

    iget v1, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->w:F

    invoke-static {v1, v0}, Ly3/f;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->x:F

    iget p1, p1, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->x:F

    invoke-static {v0, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->x:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "defaultMinSize"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Ly3/f;

    iget v2, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->w:F

    invoke-direct {v1, v2}, Ly3/f;-><init>(F)V

    const-string v2, "minWidth"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    new-instance v0, Ly3/f;

    iget v1, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->x:F

    invoke-direct {v0, v1}, Ly3/f;-><init>(F)V

    const-string v1, "minHeight"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Ll0/y1;

    iget v0, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->w:F

    iput v0, p1, Ll0/y1;->O:F

    iget v0, p0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;->x:F

    iput v0, p1, Ll0/y1;->P:F

    return-void
.end method
