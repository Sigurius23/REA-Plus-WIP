.class public final Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;
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
        "Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;",
        "La3/h1;",
        "Ln1/n;",
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
.field public final E:F

.field public final w:Z

.field public final x:Lc93/a;

.field public final y:Z

.field public final z:Ln1/o;


# direct methods
.method public constructor <init>(ZLc93/a;ZLn1/o;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->w:Z

    iput-object p2, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->x:Lc93/a;

    iput-boolean p3, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->y:Z

    iput-object p4, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->z:Ln1/o;

    iput p5, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->E:F

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 6

    new-instance v0, Ln1/n;

    iget-object v4, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->z:Ln1/o;

    iget v5, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->E:F

    iget-boolean v1, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->w:Z

    iget-object v2, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->x:Lc93/a;

    iget-boolean v3, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->y:Z

    invoke-direct/range {v0 .. v5}, Ln1/n;-><init>(ZLc93/a;ZLn1/o;F)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;

    iget-boolean v0, p1, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->w:Z

    iget-boolean v1, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->w:Z

    if-eq v1, v0, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->y:Z

    iget-boolean v1, p1, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->y:Z

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->x:Lc93/a;

    iget-object v1, p1, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->x:Lc93/a;

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->z:Ln1/o;

    iget-object v1, p1, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->z:Ln1/o;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->E:F

    iget p1, p1, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->E:F

    invoke-static {v0, p1}, Ly3/f;->b(FF)Z

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

    iget-boolean v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->y:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->x:Lc93/a;

    invoke-static {v0, v1, v2}, Lr;->d(IILc93/a;)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->z:Ln1/o;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->E:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "PullToRefreshModifierNode"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    iget-boolean v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "isRefreshing"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRefresh"

    iget-object v1, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->x:Lc93/a;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->y:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "enabled"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    iget-object v1, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->z:Ln1/o;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly3/f;

    iget v1, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->E:F

    invoke-direct {v0, v1}, Ly3/f;-><init>(F)V

    const-string v1, "threshold"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 4

    check-cast p1, Ln1/n;

    iget-object v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->x:Lc93/a;

    iput-object v0, p1, Ln1/n;->R:Lc93/a;

    iget-boolean v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->y:Z

    iput-boolean v0, p1, Ln1/n;->S:Z

    iget-object v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->z:Ln1/o;

    iput-object v0, p1, Ln1/n;->T:Ln1/o;

    iget v0, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->E:F

    iput v0, p1, Ln1/n;->U:F

    iget-boolean v0, p1, Ln1/n;->Q:Z

    iget-boolean v1, p0, Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;->w:Z

    if-eq v0, v1, :cond_0

    iput-boolean v1, p1, Ln1/n;->Q:Z

    invoke-virtual {p1}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, Ln1/k;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3, v2}, Ln1/k;-><init>(Ln1/n;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method
