.class final Landroidx/compose/material3/ThumbElement;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/material3/ThumbElement;",
        "La3/h1;",
        "Ll1/q4;",
        "material3"
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
.field public final w:Lj0/i;

.field public final x:Z

.field public final y:Ld0/i1;


# direct methods
.method public constructor <init>(Lj0/i;ZLd0/i1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/material3/ThumbElement;->w:Lj0/i;

    iput-boolean p2, p0, Landroidx/compose/material3/ThumbElement;->x:Z

    iput-object p3, p0, Landroidx/compose/material3/ThumbElement;->y:Ld0/i1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ll1/q4;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/material3/ThumbElement;->w:Lj0/i;

    iput-object v1, v0, Ll1/q4;->O:Lj0/i;

    iget-boolean v1, p0, Landroidx/compose/material3/ThumbElement;->x:Z

    iput-boolean v1, v0, Ll1/q4;->P:Z

    iget-object v1, p0, Landroidx/compose/material3/ThumbElement;->y:Ld0/i1;

    iput-object v1, v0, Ll1/q4;->Q:Ld0/i1;

    const/high16 v1, 0x7fc00000    # Float.NaN

    iput v1, v0, Ll1/q4;->U:F

    iput v1, v0, Ll1/q4;->V:F

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/material3/ThumbElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/material3/ThumbElement;

    iget-object v0, p0, Landroidx/compose/material3/ThumbElement;->w:Lj0/i;

    iget-object v1, p1, Landroidx/compose/material3/ThumbElement;->w:Lj0/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Landroidx/compose/material3/ThumbElement;->x:Z

    iget-boolean v1, p1, Landroidx/compose/material3/ThumbElement;->x:Z

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/material3/ThumbElement;->y:Ld0/i1;

    iget-object p1, p1, Landroidx/compose/material3/ThumbElement;->y:Ld0/i1;

    invoke-virtual {v0, p1}, Ld0/i1;->equals(Ljava/lang/Object;)Z

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
    .locals 3

    iget-object v0, p0, Landroidx/compose/material3/ThumbElement;->w:Lj0/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Landroidx/compose/material3/ThumbElement;->x:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/material3/ThumbElement;->y:Ld0/i1;

    invoke-virtual {v1}, Ld0/i1;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "switchThumb"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    const-string v0, "interactionSource"

    iget-object v1, p0, Landroidx/compose/material3/ThumbElement;->w:Lj0/i;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/compose/material3/ThumbElement;->x:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "checked"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animationSpec"

    iget-object v1, p0, Landroidx/compose/material3/ThumbElement;->y:Ld0/i1;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ThumbElement(interactionSource="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/material3/ThumbElement;->w:Lj0/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", checked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/material3/ThumbElement;->x:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", animationSpec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/material3/ThumbElement;->y:Ld0/i1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, Ll1/q4;

    iget-object v0, p0, Landroidx/compose/material3/ThumbElement;->w:Lj0/i;

    iput-object v0, p1, Ll1/q4;->O:Lj0/i;

    iget-boolean v0, p1, Ll1/q4;->P:Z

    iget-boolean v1, p0, Landroidx/compose/material3/ThumbElement;->x:Z

    if-eq v0, v1, :cond_0

    invoke-static {p1}, La3/g;->i(La3/c0;)V

    :cond_0
    iput-boolean v1, p1, Ll1/q4;->P:Z

    iget-object v0, p0, Landroidx/compose/material3/ThumbElement;->y:Ld0/i1;

    iput-object v0, p1, Ll1/q4;->Q:Ld0/i1;

    iget-object v0, p1, Ll1/q4;->T:Ld0/e;

    if-nez v0, :cond_1

    iget v0, p1, Ll1/q4;->V:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p1, Ll1/q4;->V:F

    invoke-static {v0}, Ld0/f;->a(F)Ld0/e;

    move-result-object v0

    iput-object v0, p1, Ll1/q4;->T:Ld0/e;

    :cond_1
    iget-object v0, p1, Ll1/q4;->S:Ld0/e;

    if-nez v0, :cond_2

    iget v0, p1, Ll1/q4;->U:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p1, Ll1/q4;->U:F

    invoke-static {v0}, Ld0/f;->a(F)Ld0/e;

    move-result-object v0

    iput-object v0, p1, Ll1/q4;->S:Ld0/e;

    :cond_2
    return-void
.end method
