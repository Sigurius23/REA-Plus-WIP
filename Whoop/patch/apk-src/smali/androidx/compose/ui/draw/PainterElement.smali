.class final Landroidx/compose/ui/draw/PainterElement;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0082\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/draw/PainterElement;",
        "La3/h1;",
        "Landroidx/compose/ui/draw/PainterNode;",
        "Ln2/a;",
        "painter",
        "Ln2/a;",
        "getPainter",
        "()Ln2/a;",
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
.field private final painter:Ln2/a;

.field public final w:Lb2/h;

.field public final x:Ly2/k;

.field public final y:F

.field public final z:Li2/y;


# direct methods
.method public constructor <init>(Ln2/a;Lb2/h;Ly2/k;FLi2/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/draw/PainterElement;->painter:Ln2/a;

    iput-object p2, p0, Landroidx/compose/ui/draw/PainterElement;->w:Lb2/h;

    iput-object p3, p0, Landroidx/compose/ui/draw/PainterElement;->x:Ly2/k;

    iput p4, p0, Landroidx/compose/ui/draw/PainterElement;->y:F

    iput-object p5, p0, Landroidx/compose/ui/draw/PainterElement;->z:Li2/y;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 6

    new-instance v0, Landroidx/compose/ui/draw/PainterNode;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->painter:Ln2/a;

    iget v4, p0, Landroidx/compose/ui/draw/PainterElement;->y:F

    iget-object v5, p0, Landroidx/compose/ui/draw/PainterElement;->z:Li2/y;

    iget-object v2, p0, Landroidx/compose/ui/draw/PainterElement;->w:Lb2/h;

    iget-object v3, p0, Landroidx/compose/ui/draw/PainterElement;->x:Ly2/k;

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/draw/PainterNode;-><init>(Ln2/a;Lb2/h;Ly2/k;FLi2/y;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/draw/PainterElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/ui/draw/PainterElement;

    iget-object v0, p0, Landroidx/compose/ui/draw/PainterElement;->painter:Ln2/a;

    iget-object v1, p1, Landroidx/compose/ui/draw/PainterElement;->painter:Ln2/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/draw/PainterElement;->w:Lb2/h;

    iget-object v1, p1, Landroidx/compose/ui/draw/PainterElement;->w:Lb2/h;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/draw/PainterElement;->x:Ly2/k;

    iget-object v1, p1, Landroidx/compose/ui/draw/PainterElement;->x:Ly2/k;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget v0, p0, Landroidx/compose/ui/draw/PainterElement;->y:F

    iget v1, p1, Landroidx/compose/ui/draw/PainterElement;->y:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Landroidx/compose/ui/draw/PainterElement;->z:Li2/y;

    iget-object p1, p1, Landroidx/compose/ui/draw/PainterElement;->z:Li2/y;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/draw/PainterElement;->painter:Ln2/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/ui/draw/PainterElement;->w:Lb2/h;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/ui/draw/PainterElement;->x:Ly2/k;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/ui/draw/PainterElement;->y:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->z:Li2/y;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "paint"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "painter"

    iget-object v2, p0, Landroidx/compose/ui/draw/PainterElement;->painter:Ln2/a;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "sizeToIntrinsics"

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "alignment"

    iget-object v2, p0, Landroidx/compose/ui/draw/PainterElement;->w:Lb2/h;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "contentScale"

    iget-object v2, p0, Landroidx/compose/ui/draw/PainterElement;->x:Ly2/k;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->y:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "alpha"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "colorFilter"

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->z:Li2/y;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PainterElement(painter="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->painter:Ln2/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeToIntrinsics=true, alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->w:Lb2/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->x:Ly2/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", colorFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->z:Li2/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 4

    check-cast p1, Landroidx/compose/ui/draw/PainterNode;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroidx/compose/ui/draw/PainterNode;->X0()Ln2/a;

    move-result-object v0

    invoke-virtual {v0}, Ln2/a;->h()J

    move-result-wide v0

    iget-object v2, p0, Landroidx/compose/ui/draw/PainterElement;->painter:Ln2/a;

    invoke-virtual {v2}, Ln2/a;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lh2/e;->b(JJ)Z

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->painter:Ln2/a;

    invoke-virtual {p1, v1}, Landroidx/compose/ui/draw/PainterNode;->c1(Ln2/a;)V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->w:Lb2/h;

    iput-object v1, p1, Landroidx/compose/ui/draw/PainterNode;->O:Lb2/h;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->x:Ly2/k;

    iput-object v1, p1, Landroidx/compose/ui/draw/PainterNode;->P:Ly2/k;

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->y:F

    iput v1, p1, Landroidx/compose/ui/draw/PainterNode;->Q:F

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->z:Li2/y;

    iput-object v1, p1, Landroidx/compose/ui/draw/PainterNode;->R:Li2/y;

    if-nez v0, :cond_0

    invoke-static {p1}, La3/g;->i(La3/c0;)V

    :cond_0
    invoke-static {p1}, La3/g;->h(La3/r;)V

    return-void
.end method
