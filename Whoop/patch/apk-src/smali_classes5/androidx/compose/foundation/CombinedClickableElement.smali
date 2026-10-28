.class final Landroidx/compose/foundation/CombinedClickableElement;
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
        "Landroidx/compose/foundation/CombinedClickableElement;",
        "La3/h1;",
        "Lf0/c0;",
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
.field public final w:Lj0/i;

.field public final x:Lc93/a;

.field public final y:Lc93/a;


# direct methods
.method public constructor <init>(Lc93/a;Lc93/a;Lj0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Landroidx/compose/foundation/CombinedClickableElement;->w:Lj0/i;

    iput-object p1, p0, Landroidx/compose/foundation/CombinedClickableElement;->x:Lc93/a;

    iput-object p2, p0, Landroidx/compose/foundation/CombinedClickableElement;->y:Lc93/a;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 4

    new-instance v0, Lf0/c0;

    iget-object v1, p0, Landroidx/compose/foundation/CombinedClickableElement;->y:Lc93/a;

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->w:Lj0/i;

    iget-object v3, p0, Landroidx/compose/foundation/CombinedClickableElement;->x:Lc93/a;

    invoke-direct {v0, v3, v1, v2}, Lf0/c0;-><init>(Lc93/a;Lc93/a;Lj0/i;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const-class v1, Landroidx/compose/foundation/CombinedClickableElement;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    goto :goto_0

    :cond_2
    check-cast p1, Landroidx/compose/foundation/CombinedClickableElement;

    iget-object v1, p0, Landroidx/compose/foundation/CombinedClickableElement;->w:Lj0/i;

    iget-object v2, p1, Landroidx/compose/foundation/CombinedClickableElement;->w:Lj0/i;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/CombinedClickableElement;->x:Lc93/a;

    iget-object v2, p1, Landroidx/compose/foundation/CombinedClickableElement;->x:Lc93/a;

    if-eq v1, v2, :cond_4

    goto :goto_0

    :cond_4
    iget-object v1, p0, Landroidx/compose/foundation/CombinedClickableElement;->y:Lc93/a;

    iget-object p1, p1, Landroidx/compose/foundation/CombinedClickableElement;->y:Lc93/a;

    if-eq v1, p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/compose/foundation/CombinedClickableElement;->w:Lj0/i;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const/16 v2, 0x3c1

    mul-int/2addr v1, v2

    const/16 v3, 0x1f

    invoke-static {v1, v3, v0}, Lb9/y;->b(IIZ)I

    move-result v1

    const/16 v3, 0x745f

    const/4 v4, 0x1

    invoke-static {v1, v3, v4}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-object v3, p0, Landroidx/compose/foundation/CombinedClickableElement;->x:Lc93/a;

    invoke-static {v1, v2, v3}, Lr;->d(IILc93/a;)I

    move-result v1

    iget-object v3, p0, Landroidx/compose/foundation/CombinedClickableElement;->y:Lc93/a;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    invoke-static {v4}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 4

    const-string v0, "combinedClickable"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    const/4 v0, 0x0

    const-string v1, "indicationNodeFactory"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "interactionSource"

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->w:Lj0/i;

    invoke-virtual {p1, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "enabled"

    invoke-virtual {p1, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onClickLabel"

    invoke-virtual {p1, v0, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "role"

    invoke-virtual {p1, v0, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onClick"

    iget-object v3, p0, Landroidx/compose/foundation/CombinedClickableElement;->x:Lc93/a;

    invoke-virtual {p1, v3, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onDoubleClick"

    invoke-virtual {p1, v0, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onLongClick"

    iget-object v3, p0, Landroidx/compose/foundation/CombinedClickableElement;->y:Lc93/a;

    invoke-virtual {p1, v3, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onLongClickLabel"

    invoke-virtual {p1, v0, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hapticFeedbackEnabled"

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 8

    move-object v0, p1

    check-cast v0, Lf0/c0;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lf0/c0;->l0:Z

    iget-object v1, v0, Lf0/c0;->k0:Lc93/a;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, p1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget-object v3, p0, Landroidx/compose/foundation/CombinedClickableElement;->y:Lc93/a;

    if-nez v3, :cond_1

    move v4, p1

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    if-eq v1, v4, :cond_2

    invoke-virtual {v0}, Lf0/h;->d1()V

    invoke-static {v0}, La3/g;->j(La3/j2;)V

    move v2, p1

    :cond_2
    iput-object v3, v0, Lf0/c0;->k0:Lc93/a;

    iget-boolean v1, v0, Lf0/h;->V:Z

    const/4 v4, 0x1

    if-eq v1, v4, :cond_3

    goto :goto_2

    :cond_3
    move p1, v2

    :goto_2
    iget-object v1, p0, Landroidx/compose/foundation/CombinedClickableElement;->w:Lj0/i;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v7, p0, Landroidx/compose/foundation/CombinedClickableElement;->x:Lc93/a;

    invoke-virtual/range {v0 .. v7}, Lf0/h;->j1(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V

    if-eqz p1, :cond_4

    iget-object p1, v0, Lf0/h;->Z:Lu2/h0;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lu2/h0;->Z0()V

    :cond_4
    return-void
.end method
