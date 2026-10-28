.class final Landroidx/compose/foundation/layout/FillElement;
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
        "Landroidx/compose/foundation/layout/FillElement;",
        "La3/h1;",
        "Ll0/h0;",
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
.field public final w:Ll0/f0;

.field public final x:F

.field public final y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll0/f0;FLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/FillElement;->w:Ll0/f0;

    iput p2, p0, Landroidx/compose/foundation/layout/FillElement;->x:F

    iput-object p3, p0, Landroidx/compose/foundation/layout/FillElement;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ll0/h0;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/layout/FillElement;->w:Ll0/f0;

    iput-object v1, v0, Ll0/h0;->O:Ll0/f0;

    iget v1, p0, Landroidx/compose/foundation/layout/FillElement;->x:F

    iput v1, v0, Ll0/h0;->P:F

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/layout/FillElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/layout/FillElement;

    iget-object v1, p1, Landroidx/compose/foundation/layout/FillElement;->w:Ll0/f0;

    iget-object v3, p0, Landroidx/compose/foundation/layout/FillElement;->w:Ll0/f0;

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Landroidx/compose/foundation/layout/FillElement;->x:F

    iget p1, p1, Landroidx/compose/foundation/layout/FillElement;->x:F

    cmpg-float p1, v1, p1

    if-nez p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/layout/FillElement;->w:Ll0/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/layout/FillElement;->x:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/layout/FillElement;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    iget v0, p0, Landroidx/compose/foundation/layout/FillElement;->x:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "fraction"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Ll0/h0;

    iget-object v0, p0, Landroidx/compose/foundation/layout/FillElement;->w:Ll0/f0;

    iput-object v0, p1, Ll0/h0;->O:Ll0/f0;

    iget v0, p0, Landroidx/compose/foundation/layout/FillElement;->x:F

    iput v0, p1, Ll0/h0;->P:F

    return-void
.end method
