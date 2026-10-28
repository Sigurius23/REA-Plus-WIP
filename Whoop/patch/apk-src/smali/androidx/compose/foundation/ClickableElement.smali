.class final Landroidx/compose/foundation/ClickableElement;
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
        "Landroidx/compose/foundation/ClickableElement;",
        "La3/h1;",
        "Lf0/w;",
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
.field public final E:Ljava/lang/String;

.field public final F:Li3/i;

.field public final G:Lc93/a;

.field public final w:Lj0/i;

.field public final x:Lf0/v0;

.field public final y:Z

.field public final z:Z


# direct methods
.method public constructor <init>(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/ClickableElement;->w:Lj0/i;

    iput-object p2, p0, Landroidx/compose/foundation/ClickableElement;->x:Lf0/v0;

    iput-boolean p3, p0, Landroidx/compose/foundation/ClickableElement;->y:Z

    iput-boolean p4, p0, Landroidx/compose/foundation/ClickableElement;->z:Z

    iput-object p5, p0, Landroidx/compose/foundation/ClickableElement;->E:Ljava/lang/String;

    iput-object p6, p0, Landroidx/compose/foundation/ClickableElement;->F:Li3/i;

    iput-object p7, p0, Landroidx/compose/foundation/ClickableElement;->G:Lc93/a;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 8

    new-instance v0, Lf0/w;

    iget-object v6, p0, Landroidx/compose/foundation/ClickableElement;->F:Li3/i;

    iget-object v7, p0, Landroidx/compose/foundation/ClickableElement;->G:Lc93/a;

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->w:Lj0/i;

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->x:Lf0/v0;

    iget-boolean v3, p0, Landroidx/compose/foundation/ClickableElement;->y:Z

    iget-boolean v4, p0, Landroidx/compose/foundation/ClickableElement;->z:Z

    iget-object v5, p0, Landroidx/compose/foundation/ClickableElement;->E:Ljava/lang/String;

    invoke-direct/range {v0 .. v7}, Lf0/h;-><init>(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const-class v0, Landroidx/compose/foundation/ClickableElement;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    check-cast p1, Landroidx/compose/foundation/ClickableElement;

    iget-object v0, p0, Landroidx/compose/foundation/ClickableElement;->w:Lj0/i;

    iget-object v1, p1, Landroidx/compose/foundation/ClickableElement;->w:Lj0/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/foundation/ClickableElement;->x:Lf0/v0;

    iget-object v1, p1, Landroidx/compose/foundation/ClickableElement;->x:Lf0/v0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-boolean v0, p0, Landroidx/compose/foundation/ClickableElement;->y:Z

    iget-boolean v1, p1, Landroidx/compose/foundation/ClickableElement;->y:Z

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget-boolean v0, p0, Landroidx/compose/foundation/ClickableElement;->z:Z

    iget-boolean v1, p1, Landroidx/compose/foundation/ClickableElement;->z:Z

    if-eq v0, v1, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Landroidx/compose/foundation/ClickableElement;->E:Ljava/lang/String;

    iget-object v1, p1, Landroidx/compose/foundation/ClickableElement;->E:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Landroidx/compose/foundation/ClickableElement;->F:Li3/i;

    iget-object v1, p1, Landroidx/compose/foundation/ClickableElement;->F:Li3/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Landroidx/compose/foundation/ClickableElement;->G:Lc93/a;

    iget-object p1, p1, Landroidx/compose/foundation/ClickableElement;->G:Lc93/a;

    if-eq v0, p1, :cond_9

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_9
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->w:Lj0/i;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Landroidx/compose/foundation/ClickableElement;->x:Lf0/v0;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lf0/v0;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Landroidx/compose/foundation/ClickableElement;->y:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-boolean v3, p0, Landroidx/compose/foundation/ClickableElement;->z:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-object v3, p0, Landroidx/compose/foundation/ClickableElement;->E:Ljava/lang/String;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Landroidx/compose/foundation/ClickableElement;->F:Li3/i;

    if-eqz v3, :cond_3

    iget v0, v3, Li3/i;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    :cond_3
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Landroidx/compose/foundation/ClickableElement;->G:Lc93/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "clickable"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/compose/foundation/ClickableElement;->z:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "enabled"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "onClick"

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->G:Lc93/a;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "onClickLabel"

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->E:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "role"

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->F:Li3/i;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "interactionSource"

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->w:Lj0/i;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "indicationNodeFactory"

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->x:Lf0/v0;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 8

    move-object v0, p1

    check-cast v0, Lf0/w;

    iget-object v6, p0, Landroidx/compose/foundation/ClickableElement;->F:Li3/i;

    iget-object v7, p0, Landroidx/compose/foundation/ClickableElement;->G:Lc93/a;

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->w:Lj0/i;

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->x:Lf0/v0;

    iget-boolean v3, p0, Landroidx/compose/foundation/ClickableElement;->y:Z

    iget-boolean v4, p0, Landroidx/compose/foundation/ClickableElement;->z:Z

    iget-object v5, p0, Landroidx/compose/foundation/ClickableElement;->E:Ljava/lang/String;

    invoke-virtual/range {v0 .. v7}, Lf0/h;->j1(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V

    return-void
.end method
