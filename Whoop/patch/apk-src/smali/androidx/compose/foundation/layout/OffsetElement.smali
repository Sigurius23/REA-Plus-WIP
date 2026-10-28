.class final Landroidx/compose/foundation/layout/OffsetElement;
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
        "Landroidx/compose/foundation/layout/OffsetElement;",
        "La3/h1;",
        "Ll0/g1;",
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

.field public final y:Z

.field public final z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(FFZLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/OffsetElement;->w:F

    iput p2, p0, Landroidx/compose/foundation/layout/OffsetElement;->x:F

    iput-boolean p3, p0, Landroidx/compose/foundation/layout/OffsetElement;->y:Z

    iput-object p4, p0, Landroidx/compose/foundation/layout/OffsetElement;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ll0/g1;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget v1, p0, Landroidx/compose/foundation/layout/OffsetElement;->w:F

    iput v1, v0, Ll0/g1;->O:F

    iget v1, p0, Landroidx/compose/foundation/layout/OffsetElement;->x:F

    iput v1, v0, Ll0/g1;->P:F

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/OffsetElement;->y:Z

    iput-boolean v1, v0, Ll0/g1;->Q:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/OffsetElement;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/OffsetElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    iget v0, p0, Landroidx/compose/foundation/layout/OffsetElement;->w:F

    iget v1, p1, Landroidx/compose/foundation/layout/OffsetElement;->w:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Landroidx/compose/foundation/layout/OffsetElement;->x:F

    iget v1, p1, Landroidx/compose/foundation/layout/OffsetElement;->x:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/OffsetElement;->y:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/layout/OffsetElement;->y:Z

    if-ne v0, p1, :cond_3

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Landroidx/compose/foundation/layout/OffsetElement;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/foundation/layout/OffsetElement;->x:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/OffsetElement;->y:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/OffsetElement;->z:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OffsetModifierElement(x="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/compose/foundation/layout/OffsetElement;->w:F

    const-string v2, ", y="

    invoke-static {v1, v2, v0}, Lev/n;->s(FLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget v1, p0, Landroidx/compose/foundation/layout/OffsetElement;->x:F

    const-string v2, ", rtlAware="

    invoke-static {v1, v2, v0}, Lev/n;->s(FLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/OffsetElement;->y:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 5

    check-cast p1, Ll0/g1;

    iget v0, p1, Ll0/g1;->O:F

    iget v1, p0, Landroidx/compose/foundation/layout/OffsetElement;->w:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/layout/OffsetElement;->x:F

    iget-boolean v3, p0, Landroidx/compose/foundation/layout/OffsetElement;->y:Z

    if-eqz v0, :cond_0

    iget v0, p1, Ll0/g1;->P:F

    invoke-static {v0, v2}, Ly3/f;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Ll0/g1;->Q:Z

    if-eq v0, v3, :cond_1

    :cond_0
    invoke-static {p1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, La3/n0;->u0(Z)V

    :cond_1
    iput v1, p1, Ll0/g1;->O:F

    iput v2, p1, Ll0/g1;->P:F

    iput-boolean v3, p1, Ll0/g1;->Q:Z

    return-void
.end method
