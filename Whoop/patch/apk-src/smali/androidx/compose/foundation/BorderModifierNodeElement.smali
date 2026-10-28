.class public final Landroidx/compose/foundation/BorderModifierNodeElement;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0081\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/BorderModifierNodeElement;",
        "La3/h1;",
        "Lf0/s;",
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

.field public final x:Li2/t;

.field public final y:Li2/a1;


# direct methods
.method public constructor <init>(FLi2/t;Li2/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->w:F

    iput-object p2, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->x:Li2/t;

    iput-object p3, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->y:Li2/a1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 4

    new-instance v0, Lf0/s;

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->x:Li2/t;

    iget-object v2, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->y:Li2/a1;

    iget v3, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->w:F

    invoke-direct {v0, v3, v1, v2}, Lf0/s;-><init>(FLi2/t;Li2/a1;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/BorderModifierNodeElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/foundation/BorderModifierNodeElement;

    iget v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->w:F

    iget v1, p1, Landroidx/compose/foundation/BorderModifierNodeElement;->w:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->x:Li2/t;

    iget-object v1, p1, Landroidx/compose/foundation/BorderModifierNodeElement;->x:Li2/t;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->y:Li2/a1;

    iget-object p1, p1, Landroidx/compose/foundation/BorderModifierNodeElement;->y:Li2/a1;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->x:Li2/t;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->y:Li2/a1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 5

    const-string v0, "border"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Ly3/f;

    iget v2, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->w:F

    invoke-direct {v1, v2}, Ly3/f;-><init>(F)V

    const-string v2, "width"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->x:Li2/t;

    instance-of v1, v0, Li2/c1;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v1

    check-cast v0, Li2/c1;

    iget-wide v2, v0, Li2/c1;->c:J

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    const-string v4, "color"

    invoke-virtual {v1, v0, v4}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p1, v0}, Lb3/l2;->d(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v1

    const-string v2, "brush"

    invoke-virtual {v1, v0, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "shape"

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->y:Li2/a1;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BorderModifierNodeElement(width="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->w:F

    const-string v2, ", brush="

    invoke-static {v1, v2, v0}, Lev/n;->s(FLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->x:Li2/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->y:Li2/a1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 3

    check-cast p1, Lf0/s;

    iget v0, p1, Lf0/s;->R:F

    iget-object v1, p1, Lf0/s;->U:Lf2/c;

    iget v2, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->w:F

    invoke-static {v0, v2}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_0

    iput v2, p1, Lf0/s;->R:F

    invoke-virtual {v1}, Lf2/c;->X0()V

    :cond_0
    iget-object v0, p1, Lf0/s;->S:Li2/t;

    iget-object v2, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->x:Li2/t;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object v2, p1, Lf0/s;->S:Li2/t;

    invoke-virtual {v1}, Lf2/c;->X0()V

    :cond_1
    iget-object v0, p1, Lf0/s;->T:Li2/a1;

    iget-object v2, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->y:Li2/a1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object v2, p1, Lf0/s;->T:Li2/a1;

    invoke-virtual {v1}, Lf2/c;->X0()V

    :cond_2
    return-void
.end method
