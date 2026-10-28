.class final Landroidx/compose/foundation/lazy/ParentSizeElement;
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
        "Landroidx/compose/foundation/lazy/ParentSizeElement;",
        "La3/h1;",
        "Ln0/y;",
        "foundation_release"
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

.field public final x:Lp1/t2;

.field public final y:Lp1/t2;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(FLp1/h1;Lp1/h1;Ljava/lang/String;I)V
    .locals 2

    and-int/lit8 v0, p5, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p2, v1

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    move-object p3, v1

    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->w:F

    iput-object p2, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->x:Lp1/t2;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->y:Lp1/t2;

    iput-object p4, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->z:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ln0/y;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->w:F

    iput v1, v0, Ln0/y;->O:F

    iget-object v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->x:Lp1/t2;

    iput-object v1, v0, Ln0/y;->P:Lp1/t2;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->y:Lp1/t2;

    iput-object v1, v0, Ln0/y;->Q:Lp1/t2;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/lazy/ParentSizeElement;

    iget v1, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;->w:F

    iget v3, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->w:F

    cmpg-float v1, v3, v1

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->x:Lp1/t2;

    iget-object v3, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;->x:Lp1/t2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->y:Lp1/t2;

    iget-object p1, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;->y:Lp1/t2;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->x:Lp1/t2;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->y:Lp1/t2;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->z:Ljava/lang/String;

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->w:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p1, Lb3/l2;->b:Ljava/lang/Object;

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Ln0/y;

    iget v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->w:F

    iput v0, p1, Ln0/y;->O:F

    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->x:Lp1/t2;

    iput-object v0, p1, Ln0/y;->P:Lp1/t2;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->y:Lp1/t2;

    iput-object v0, p1, Ln0/y;->Q:Lp1/t2;

    return-void
.end method
