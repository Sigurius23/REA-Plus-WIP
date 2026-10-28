.class public final Landroidx/compose/foundation/layout/LayoutWeightElement;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/LayoutWeightElement;",
        "La3/h1;",
        "Ll0/d1;",
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

.field public final x:Z


# direct methods
.method public constructor <init>(FZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->w:F

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->x:Z

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ll0/d1;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget v1, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->w:F

    iput v1, v0, Ll0/d1;->O:F

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->x:Z

    iput-boolean v1, v0, Ll0/d1;->P:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    if-eqz v1, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_2

    return v1

    :cond_2
    iget v2, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->w:F

    iget v3, p1, Landroidx/compose/foundation/layout/LayoutWeightElement;->w:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_3

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->x:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/layout/LayoutWeightElement;->x:Z

    if-ne v2, p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->x:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "weight"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    iget v1, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->w:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v2}, Lb3/l2;->d(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v2, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->x:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "fill"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Ll0/d1;

    iget v0, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->w:F

    iput v0, p1, Ll0/d1;->O:F

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->x:Z

    iput-boolean v0, p1, Ll0/d1;->P:Z

    return-void
.end method
