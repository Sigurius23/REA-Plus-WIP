.class public final Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;
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
        "Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;",
        "La3/h1;",
        "Li2/q;",
        "ui_release"
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

.field public final w:F

.field public final x:Li2/a1;

.field public final y:Z

.field public final z:J


# direct methods
.method public constructor <init>(FLi2/a1;ZJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->w:F

    iput-object p2, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->x:Li2/a1;

    iput-boolean p3, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->y:Z

    iput-wide p4, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->z:J

    iput-wide p6, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->E:J

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 3

    new-instance v0, Li2/q;

    new-instance v1, La3/m1;

    const/16 v2, 0xc

    invoke-direct {v1, p0, v2}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Li2/q;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    iget v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->w:F

    iget v1, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->w:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->x:Li2/a1;

    iget-object v1, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->x:Li2/a1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->y:Z

    iget-boolean v1, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->y:Z

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget-wide v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->z:J

    iget-wide v2, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->z:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-wide v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->E:J

    iget-wide v2, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->E:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_6

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->x:Li2/a1;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->y:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    sget v2, Li2/x;->o:I

    iget-wide v2, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->z:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->E:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 4

    const-string v0, "shadow"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Ly3/f;

    iget v2, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->w:F

    invoke-direct {v1, v2}, Ly3/f;-><init>(F)V

    const-string v2, "elevation"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "shape"

    iget-object v2, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->x:Li2/a1;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->y:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "clip"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Li2/x;

    iget-wide v2, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->z:J

    invoke-direct {v1, v2, v3}, Li2/x;-><init>(J)V

    const-string v2, "ambientColor"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    new-instance v0, Li2/x;

    iget-wide v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->E:J

    invoke-direct {v0, v1, v2}, Li2/x;-><init>(J)V

    const-string v1, "spotColor"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ShadowGraphicsLayerElement(elevation="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->w:F

    const-string v2, ", shape="

    invoke-static {v1, v2, v0}, Lev/n;->s(FLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->x:Li2/a1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->y:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", ambientColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->z:J

    const-string v3, ", spotColor="

    invoke-static {v1, v2, v3, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->E:J

    invoke-static {v1, v2}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, Li2/q;

    new-instance v0, La3/m1;

    const/16 v1, 0xc

    invoke-direct {v0, p0, v1}, La3/m1;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p1, Li2/q;->O:Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x2

    invoke-static {p1, v0}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_0

    iget-object p1, p1, Li2/q;->O:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/compose/ui/node/NodeCoordinator;->F1(Lkotlin/jvm/functions/Function1;Z)V

    :cond_0
    return-void
.end method
