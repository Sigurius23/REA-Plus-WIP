.class final Landroidx/compose/ui/graphics/GraphicsLayerElement;
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
        "Landroidx/compose/ui/graphics/GraphicsLayerElement;",
        "La3/h1;",
        "Li2/b1;",
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
.field public final E:F

.field public final F:F

.field public final G:F

.field public final H:F

.field public final I:J

.field public final J:Li2/a1;

.field public final K:Z

.field public final L:Lal/a;

.field public final M:J

.field public final N:J

.field public final O:I

.field public final w:F

.field public final x:F

.field public final y:F

.field public final z:F


# direct methods
.method public constructor <init>(FFFFFFFFJLi2/a1;ZLal/a;JJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:F

    iput p2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->x:F

    iput p3, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->y:F

    iput p4, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->z:F

    iput p5, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->E:F

    iput p6, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->F:F

    iput p7, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->G:F

    iput p8, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->H:F

    iput-wide p9, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->I:J

    iput-object p11, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->J:Li2/a1;

    iput-boolean p12, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->K:Z

    iput-object p13, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->L:Lal/a;

    iput-wide p14, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->M:J

    move-wide/from16 p1, p16

    iput-wide p1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->N:J

    move/from16 p1, p18

    iput p1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->O:I

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 3

    new-instance v0, Li2/b1;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:F

    iput v1, v0, Li2/b1;->O:F

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->x:F

    iput v1, v0, Li2/b1;->P:F

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->y:F

    iput v1, v0, Li2/b1;->Q:F

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->z:F

    iput v1, v0, Li2/b1;->R:F

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->E:F

    iput v1, v0, Li2/b1;->S:F

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->F:F

    iput v1, v0, Li2/b1;->T:F

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->G:F

    iput v1, v0, Li2/b1;->U:F

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->H:F

    iput v1, v0, Li2/b1;->V:F

    const/high16 v1, 0x41000000    # 8.0f

    iput v1, v0, Li2/b1;->W:F

    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->I:J

    iput-wide v1, v0, Li2/b1;->X:J

    iget-object v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->J:Li2/a1;

    iput-object v1, v0, Li2/b1;->Y:Li2/a1;

    iget-boolean v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->K:Z

    iput-boolean v1, v0, Li2/b1;->Z:Z

    iget-object v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->L:Lal/a;

    iput-object v1, v0, Li2/b1;->a0:Lal/a;

    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->M:J

    iput-wide v1, v0, Li2/b1;->b0:J

    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->N:J

    iput-wide v1, v0, Li2/b1;->c0:J

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->O:I

    iput v1, v0, Li2/b1;->d0:I

    const/4 v1, 0x3

    iput v1, v0, Li2/b1;->e0:I

    new-instance v1, La3/m1;

    const/16 v2, 0xf

    invoke-direct {v1, v0, v2}, La3/m1;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Li2/b1;->f0:La3/m1;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;

    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:F

    iget v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_1

    :cond_2
    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->x:F

    iget v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->x:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_1

    :cond_3
    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->y:F

    iget v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->y:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_1

    :cond_4
    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->z:F

    iget v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->z:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_1

    :cond_5
    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->E:F

    iget v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->E:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_1

    :cond_6
    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->F:F

    iget v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->F:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_1

    :cond_7
    const/4 v0, 0x0

    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_8

    goto/16 :goto_1

    :cond_8
    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->G:F

    iget v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->G:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_1

    :cond_9
    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->H:F

    iget v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->H:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_1

    :cond_a
    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_1

    :cond_b
    iget-wide v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->I:J

    iget-wide v2, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->I:J

    invoke-static {v0, v1, v2, v3}, Li2/e1;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_1

    :cond_c
    iget-object v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->J:Li2/a1;

    iget-object v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->J:Li2/a1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_1

    :cond_d
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->K:Z

    iget-boolean v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->K:Z

    if-eq v0, v1, :cond_e

    goto :goto_1

    :cond_e
    iget-object v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->L:Lal/a;

    iget-object v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->L:Lal/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_1

    :cond_f
    iget-wide v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->M:J

    iget-wide v2, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->M:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_1

    :cond_10
    iget-wide v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->N:J

    iget-wide v2, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->N:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_1

    :cond_11
    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->O:I

    iget p1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->O:I

    if-ne v0, p1, :cond_12

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_12
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->x:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->y:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->z:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->E:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->F:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->G:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->H:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    sget v2, Li2/e1;->c:I

    iget-wide v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->I:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->J:Li2/a1;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->K:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->L:Lal/a;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    sget v2, Li2/x;->o:I

    iget-wide v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->M:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->N:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->O:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    const/4 v2, 0x3

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 4

    const-string v0, "graphicsLayer"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "scaleX"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->x:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "scaleY"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->y:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "alpha"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->z:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "translationX"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->E:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "translationY"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->F:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "shadowElevation"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "rotationX"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->G:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "rotationY"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->H:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "rotationZ"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "cameraDistance"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Li2/e1;

    iget-wide v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->I:J

    invoke-direct {v1, v2, v3}, Li2/e1;-><init>(J)V

    const-string v2, "transformOrigin"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "shape"

    iget-object v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->J:Li2/a1;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->K:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "clip"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "renderEffect"

    iget-object v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->L:Lal/a;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Li2/x;

    iget-wide v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->M:J

    invoke-direct {v1, v2, v3}, Li2/x;-><init>(J)V

    const-string v2, "ambientShadowColor"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Li2/x;

    iget-wide v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->N:J

    invoke-direct {v1, v2, v3}, Li2/x;-><init>(J)V

    const-string v2, "spotShadowColor"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Li2/d0;

    iget v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->O:I

    invoke-direct {v1, v2}, Li2/d0;-><init>(I)V

    const-string v2, "compositingStrategy"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Li2/o;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "blendMode"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "colorFilter"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GraphicsLayerElement(scaleX="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", scaleY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->x:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", translationX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->z:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", translationY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->E:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", shadowElevation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->F:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", rotationX=0.0, rotationY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->G:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", rotationZ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->H:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", cameraDistance=8.0, transformOrigin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->I:J

    invoke-static {v1, v2}, Li2/e1;->d(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->J:Li2/a1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->K:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", renderEffect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->L:Lal/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ambientShadowColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->M:J

    const-string v3, ", spotShadowColor="

    invoke-static {v1, v2, v3, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->N:J

    const-string v3, ", compositingStrategy="

    invoke-static {v1, v2, v3, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->O:I

    invoke-static {v1}, Li2/d0;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blendMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x3

    invoke-static {v1}, Li2/o;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colorFilter=null)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, Li2/b1;

    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:F

    iput v0, p1, Li2/b1;->O:F

    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->x:F

    iput v0, p1, Li2/b1;->P:F

    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->y:F

    iput v0, p1, Li2/b1;->Q:F

    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->z:F

    iput v0, p1, Li2/b1;->R:F

    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->E:F

    iput v0, p1, Li2/b1;->S:F

    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->F:F

    iput v0, p1, Li2/b1;->T:F

    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->G:F

    iput v0, p1, Li2/b1;->U:F

    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->H:F

    iput v0, p1, Li2/b1;->V:F

    const/high16 v0, 0x41000000    # 8.0f

    iput v0, p1, Li2/b1;->W:F

    iget-wide v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->I:J

    iput-wide v0, p1, Li2/b1;->X:J

    iget-object v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->J:Li2/a1;

    iput-object v0, p1, Li2/b1;->Y:Li2/a1;

    iget-boolean v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->K:Z

    iput-boolean v0, p1, Li2/b1;->Z:Z

    iget-object v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->L:Lal/a;

    iput-object v0, p1, Li2/b1;->a0:Lal/a;

    iget-wide v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->M:J

    iput-wide v0, p1, Li2/b1;->b0:J

    iget-wide v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->N:J

    iput-wide v0, p1, Li2/b1;->c0:J

    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->O:I

    iput v0, p1, Li2/b1;->d0:I

    const/4 v0, 0x3

    iput v0, p1, Li2/b1;->e0:I

    const/4 v0, 0x2

    invoke-static {p1, v0}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_0

    iget-object p1, p1, Li2/b1;->f0:La3/m1;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/compose/ui/node/NodeCoordinator;->F1(Lkotlin/jvm/functions/Function1;Z)V

    :cond_0
    return-void
.end method
