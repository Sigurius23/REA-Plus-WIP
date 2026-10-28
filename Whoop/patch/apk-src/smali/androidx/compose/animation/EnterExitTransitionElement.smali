.class final Landroidx/compose/animation/EnterExitTransitionElement;
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
        "Landroidx/compose/animation/EnterExitTransitionElement;",
        "La3/h1;",
        "Lc0/b1;",
        "animation"
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
.field public final E:Lc0/c1;

.field public final F:Lc0/e1;

.field public final G:Lc93/a;

.field public final H:Lc0/r0;

.field public final w:Ld0/z1;

.field public final x:Ld0/s1;

.field public final y:Ld0/s1;

.field public final z:Ld0/s1;


# direct methods
.method public constructor <init>(Ld0/z1;Ld0/s1;Ld0/s1;Ld0/s1;Lc0/c1;Lc0/e1;Lc93/a;Lc0/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->w:Ld0/z1;

    iput-object p2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->x:Ld0/s1;

    iput-object p3, p0, Landroidx/compose/animation/EnterExitTransitionElement;->y:Ld0/s1;

    iput-object p4, p0, Landroidx/compose/animation/EnterExitTransitionElement;->z:Ld0/s1;

    iput-object p5, p0, Landroidx/compose/animation/EnterExitTransitionElement;->E:Lc0/c1;

    iput-object p6, p0, Landroidx/compose/animation/EnterExitTransitionElement;->F:Lc0/e1;

    iput-object p7, p0, Landroidx/compose/animation/EnterExitTransitionElement;->G:Lc93/a;

    iput-object p8, p0, Landroidx/compose/animation/EnterExitTransitionElement;->H:Lc0/r0;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 9

    new-instance v0, Lc0/b1;

    iget-object v7, p0, Landroidx/compose/animation/EnterExitTransitionElement;->G:Lc93/a;

    iget-object v8, p0, Landroidx/compose/animation/EnterExitTransitionElement;->H:Lc0/r0;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->w:Ld0/z1;

    iget-object v2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->x:Ld0/s1;

    iget-object v3, p0, Landroidx/compose/animation/EnterExitTransitionElement;->y:Ld0/s1;

    iget-object v4, p0, Landroidx/compose/animation/EnterExitTransitionElement;->z:Ld0/s1;

    iget-object v5, p0, Landroidx/compose/animation/EnterExitTransitionElement;->E:Lc0/c1;

    iget-object v6, p0, Landroidx/compose/animation/EnterExitTransitionElement;->F:Lc0/e1;

    invoke-direct/range {v0 .. v8}, Lc0/b1;-><init>(Ld0/z1;Ld0/s1;Ld0/s1;Ld0/s1;Lc0/c1;Lc0/e1;Lc93/a;Lc0/r0;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/animation/EnterExitTransitionElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/animation/EnterExitTransitionElement;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->w:Ld0/z1;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->w:Ld0/z1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->x:Ld0/s1;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->x:Ld0/s1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->y:Ld0/s1;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->y:Ld0/s1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->z:Ld0/s1;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->z:Ld0/s1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->E:Lc0/c1;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->E:Lc0/c1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->F:Lc0/e1;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->F:Lc0/e1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->G:Lc93/a;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->G:Lc93/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->H:Lc0/r0;

    iget-object p1, p1, Landroidx/compose/animation/EnterExitTransitionElement;->H:Lc0/r0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->w:Ld0/z1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Landroidx/compose/animation/EnterExitTransitionElement;->x:Ld0/s1;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Landroidx/compose/animation/EnterExitTransitionElement;->y:Ld0/s1;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Landroidx/compose/animation/EnterExitTransitionElement;->z:Ld0/s1;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->E:Lc0/c1;

    invoke-virtual {v2}, Lc0/c1;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->F:Lc0/e1;

    invoke-virtual {v0}, Lc0/e1;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->G:Lc93/a;

    invoke-static {v0, v1, v2}, Lr;->d(IILc93/a;)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->H:Lc0/r0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "enterExitTransition"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "transition"

    iget-object v2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->w:Ld0/z1;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "sizeAnimation"

    iget-object v2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->x:Ld0/s1;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "offsetAnimation"

    iget-object v2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->y:Ld0/s1;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "slideAnimation"

    iget-object v2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->z:Ld0/s1;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "enter"

    iget-object v2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->E:Lc0/c1;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "exit"

    iget-object v2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->F:Lc0/e1;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "graphicsLayerBlock"

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->H:Lc0/r0;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EnterExitTransitionElement(transition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->w:Ld0/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeAnimation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->x:Ld0/s1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offsetAnimation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->y:Ld0/s1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", slideAnimation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->z:Ld0/s1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->E:Lc0/c1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", exit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->F:Lc0/e1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->G:Lc93/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", graphicsLayerBlock="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->H:Lc0/r0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Lc0/b1;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->w:Ld0/z1;

    iput-object v0, p1, Lc0/b1;->P:Ld0/z1;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->x:Ld0/s1;

    iput-object v0, p1, Lc0/b1;->Q:Ld0/s1;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->y:Ld0/s1;

    iput-object v0, p1, Lc0/b1;->R:Ld0/s1;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->z:Ld0/s1;

    iput-object v0, p1, Lc0/b1;->S:Ld0/s1;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->E:Lc0/c1;

    iput-object v0, p1, Lc0/b1;->T:Lc0/c1;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->F:Lc0/e1;

    iput-object v0, p1, Lc0/b1;->U:Lc0/e1;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->G:Lc93/a;

    iput-object v0, p1, Lc0/b1;->V:Lc93/a;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->H:Lc0/r0;

    iput-object v0, p1, Lc0/b1;->W:Lc0/r0;

    return-void
.end method
