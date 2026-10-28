.class final Landroidx/compose/foundation/layout/SizeElement;
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
        "Landroidx/compose/foundation/layout/SizeElement;",
        "La3/h1;",
        "Ll0/v1;",
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
.field public final E:Z

.field public final F:Lb3/r;

.field public final w:F

.field public final x:F

.field public final y:F

.field public final z:F


# direct methods
.method public synthetic constructor <init>(FFFFIZ)V
    .locals 2

    and-int/lit8 v0, p5, 0x1

    const/high16 v1, 0x7fc00000    # Float.NaN

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_1

    move p2, v1

    :cond_1
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p5, v1

    :goto_0
    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move p5, p4

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFZ)V

    return-void
.end method

.method public constructor <init>(FFFFZ)V
    .locals 1

    sget-object v0, Lb3/r;->F:Lb3/r;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Landroidx/compose/foundation/layout/SizeElement;->w:F

    .line 3
    iput p2, p0, Landroidx/compose/foundation/layout/SizeElement;->x:F

    .line 4
    iput p3, p0, Landroidx/compose/foundation/layout/SizeElement;->y:F

    .line 5
    iput p4, p0, Landroidx/compose/foundation/layout/SizeElement;->z:F

    .line 6
    iput-boolean p5, p0, Landroidx/compose/foundation/layout/SizeElement;->E:Z

    .line 7
    iput-object v0, p0, Landroidx/compose/foundation/layout/SizeElement;->F:Lb3/r;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ll0/v1;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->w:F

    iput v1, v0, Ll0/v1;->O:F

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->x:F

    iput v1, v0, Ll0/v1;->P:F

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->y:F

    iput v1, v0, Ll0/v1;->Q:F

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->z:F

    iput v1, v0, Ll0/v1;->R:F

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/SizeElement;->E:Z

    iput-boolean v1, v0, Ll0/v1;->S:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/SizeElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/foundation/layout/SizeElement;

    iget v0, p1, Landroidx/compose/foundation/layout/SizeElement;->w:F

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->w:F

    invoke-static {v1, v0}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->x:F

    iget v1, p1, Landroidx/compose/foundation/layout/SizeElement;->x:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->y:F

    iget v1, p1, Landroidx/compose/foundation/layout/SizeElement;->y:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->z:F

    iget v1, p1, Landroidx/compose/foundation/layout/SizeElement;->z:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-boolean v0, p0, Landroidx/compose/foundation/layout/SizeElement;->E:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/layout/SizeElement;->E:Z

    if-eq v0, p1, :cond_6

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/foundation/layout/SizeElement;->x:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/layout/SizeElement;->y:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/layout/SizeElement;->z:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/SizeElement;->E:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/foundation/layout/SizeElement;->F:Lb3/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Ll0/v1;

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->w:F

    iput v0, p1, Ll0/v1;->O:F

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->x:F

    iput v0, p1, Ll0/v1;->P:F

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->y:F

    iput v0, p1, Ll0/v1;->Q:F

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->z:F

    iput v0, p1, Ll0/v1;->R:F

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/SizeElement;->E:Z

    iput-boolean v0, p1, Ll0/v1;->S:Z

    return-void
.end method
