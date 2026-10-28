.class public final Landroidx/compose/material3/IndicatorLineElement;
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
        "Landroidx/compose/material3/IndicatorLineElement;",
        "La3/h1;",
        "Ll1/t1;",
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
.field public final w:Z

.field public final x:Lj0/i;

.field public final y:Ll1/e4;

.field public final z:Li2/a1;


# direct methods
.method public constructor <init>(ZLj0/i;Ll1/e4;Li2/a1;)V
    .locals 1

    sget-object v0, Ll1/h4;->a:Ll1/h4;

    sget-object v0, Ll1/h4;->a:Ll1/h4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Landroidx/compose/material3/IndicatorLineElement;->w:Z

    iput-object p2, p0, Landroidx/compose/material3/IndicatorLineElement;->x:Lj0/i;

    iput-object p3, p0, Landroidx/compose/material3/IndicatorLineElement;->y:Ll1/e4;

    iput-object p4, p0, Landroidx/compose/material3/IndicatorLineElement;->z:Li2/a1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 5

    new-instance v0, Ll1/t1;

    sget-object v1, Ll1/h4;->a:Ll1/h4;

    sget-object v1, Ll1/h4;->a:Ll1/h4;

    iget-boolean v1, p0, Landroidx/compose/material3/IndicatorLineElement;->w:Z

    iget-object v2, p0, Landroidx/compose/material3/IndicatorLineElement;->x:Lj0/i;

    iget-object v3, p0, Landroidx/compose/material3/IndicatorLineElement;->y:Ll1/e4;

    iget-object v4, p0, Landroidx/compose/material3/IndicatorLineElement;->z:Li2/a1;

    invoke-direct {v0, v1, v2, v3, v4}, Ll1/t1;-><init>(ZLj0/i;Ll1/e4;Li2/a1;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/material3/IndicatorLineElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/material3/IndicatorLineElement;

    iget-boolean v0, p0, Landroidx/compose/material3/IndicatorLineElement;->w:Z

    iget-boolean v1, p1, Landroidx/compose/material3/IndicatorLineElement;->w:Z

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/material3/IndicatorLineElement;->x:Lj0/i;

    iget-object v1, p1, Landroidx/compose/material3/IndicatorLineElement;->x:Lj0/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/material3/IndicatorLineElement;->y:Ll1/e4;

    iget-object v1, p1, Landroidx/compose/material3/IndicatorLineElement;->y:Ll1/e4;

    invoke-virtual {v0, v1}, Ll1/e4;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroidx/compose/material3/IndicatorLineElement;->z:Li2/a1;

    iget-object p1, p1, Landroidx/compose/material3/IndicatorLineElement;->z:Li2/a1;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    sget p1, Ll1/h4;->e:F

    invoke-static {p1, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    sget p1, Ll1/h4;->d:F

    invoke-static {p1, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-nez p1, :cond_7

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_7
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-boolean v0, p0, Landroidx/compose/material3/IndicatorLineElement;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Landroidx/compose/material3/IndicatorLineElement;->x:Lj0/i;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Landroidx/compose/material3/IndicatorLineElement;->y:Ll1/e4;

    invoke-virtual {v0}, Ll1/e4;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Landroidx/compose/material3/IndicatorLineElement;->z:Li2/a1;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    sget v2, Ll1/h4;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    sget v1, Ll1/h4;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "indicatorLine"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    iget-boolean v0, p0, Landroidx/compose/material3/IndicatorLineElement;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "enabled"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isError"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactionSource"

    iget-object v1, p0, Landroidx/compose/material3/IndicatorLineElement;->x:Lj0/i;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colors"

    iget-object v1, p0, Landroidx/compose/material3/IndicatorLineElement;->y:Ll1/e4;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textFieldShape"

    iget-object v1, p0, Landroidx/compose/material3/IndicatorLineElement;->z:Li2/a1;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Ll1/h4;->e:F

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    const-string v0, "focusedIndicatorLineThickness"

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Ll1/h4;->d:F

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    const-string v0, "unfocusedIndicatorLineThickness"

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IndicatorLineElement(enabled="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/compose/material3/IndicatorLineElement;->w:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isError=false, interactionSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/material3/IndicatorLineElement;->x:Lj0/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/material3/IndicatorLineElement;->y:Ll1/e4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textFieldShape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/material3/IndicatorLineElement;->z:Li2/a1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", focusedIndicatorLineThickness="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Ll1/h4;->e:F

    const-string v2, ", unfocusedIndicatorLineThickness="

    invoke-static {v1, v2, v0}, Lev/n;->s(FLjava/lang/String;Ljava/lang/StringBuilder;)V

    sget v1, Ll1/h4;->d:F

    invoke-static {v1}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 8

    check-cast p1, Ll1/t1;

    sget v0, Ll1/h4;->e:F

    sget v1, Ll1/h4;->d:F

    iget-boolean v2, p1, Ll1/t1;->Q:Z

    iget-boolean v3, p0, Landroidx/compose/material3/IndicatorLineElement;->w:Z

    const/4 v4, 0x1

    if-eq v2, v3, :cond_0

    iput-boolean v3, p1, Ll1/t1;->Q:Z

    move v2, v4

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p1, Ll1/t1;->R:Lj0/i;

    iget-object v5, p0, Landroidx/compose/material3/IndicatorLineElement;->x:Lj0/i;

    if-eq v3, v5, :cond_2

    iput-object v5, p1, Ll1/t1;->R:Lj0/i;

    iget-object v3, p1, Ll1/t1;->V:Lbc3/c2;

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    invoke-virtual {p1}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v3

    new-instance v6, Ll1/s1;

    const/4 v7, 0x3

    invoke-direct {v6, p1, v5, v7}, Ll1/s1;-><init>(Ll1/t1;Lq83/d;I)V

    invoke-static {v3, v5, v5, v6, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v3

    iput-object v3, p1, Ll1/t1;->V:Lbc3/c2;

    :cond_2
    iget-object v3, p1, Ll1/t1;->W:Ll1/e4;

    iget-object v5, p0, Landroidx/compose/material3/IndicatorLineElement;->y:Ll1/e4;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    iput-object v5, p1, Ll1/t1;->W:Ll1/e4;

    move v2, v4

    :cond_3
    iget-object v3, p1, Ll1/t1;->Y:Li2/a1;

    iget-object v5, p0, Landroidx/compose/material3/IndicatorLineElement;->z:Li2/a1;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v2, p1, Ll1/t1;->Y:Li2/a1;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    iput-object v5, p1, Ll1/t1;->Y:Li2/a1;

    iget-object v2, p1, Ll1/t1;->a0:Lf2/c;

    invoke-virtual {v2}, Lf2/c;->X0()V

    :cond_4
    move v2, v4

    :cond_5
    iget v3, p1, Ll1/t1;->S:F

    invoke-static {v3, v0}, Ly3/f;->b(FF)Z

    move-result v3

    if-nez v3, :cond_6

    iput v0, p1, Ll1/t1;->S:F

    move v2, v4

    :cond_6
    iget v0, p1, Ll1/t1;->T:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_7

    iput v1, p1, Ll1/t1;->T:F

    goto :goto_1

    :cond_7
    move v4, v2

    :goto_1
    if-eqz v4, :cond_8

    invoke-virtual {p1}, Ll1/t1;->b1()V

    :cond_8
    return-void
.end method
