.class final Landroidx/compose/foundation/gestures/ScrollableElement;
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
        "Landroidx/compose/foundation/gestures/ScrollableElement;",
        "La3/h1;",
        "Lh0/w2;",
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
.field public final E:Lj0/i;

.field public final w:Lh0/x2;

.field public final x:Lh0/d2;

.field public final y:Z

.field public final z:Z


# direct methods
.method public constructor <init>(Lh0/x2;Lh0/d2;ZZLj0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->w:Lh0/x2;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->x:Lh0/d2;

    iput-boolean p3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->y:Z

    iput-boolean p4, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->z:Z

    iput-object p5, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->E:Lj0/i;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 9

    new-instance v0, Lh0/w2;

    iget-object v6, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->E:Lj0/i;

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->x:Lh0/d2;

    iget-object v5, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->w:Lh0/x2;

    iget-boolean v7, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->y:Z

    iget-boolean v8, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->z:Z

    invoke-direct/range {v0 .. v8}, Lh0/w2;-><init>(Lf0/k;Lh0/s;Lh0/o1;Lh0/d2;Lh0/x2;Lj0/i;ZZ)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/gestures/ScrollableElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/foundation/gestures/ScrollableElement;

    iget-object v0, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->w:Lh0/x2;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->w:Lh0/x2;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->x:Lh0/d2;

    iget-object v1, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->x:Lh0/d2;

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->y:Z

    iget-boolean v1, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->y:Z

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->z:Z

    iget-boolean v1, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->z:Z

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->E:Lj0/i;

    iget-object p1, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->E:Lj0/i;

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
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->w:Lh0/x2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->x:Lh0/d2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    const/16 v0, 0x3c1

    mul-int/2addr v2, v0

    iget-boolean v3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->y:Z

    invoke-static {v2, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v2

    iget-boolean v3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->z:Z

    invoke-static {v2, v0, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->E:Lj0/i;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "scrollable"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    const-string v0, "orientation"

    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->x:Lh0/d2;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->w:Lh0/x2;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const-string v1, "overscrollEffect"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->y:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "enabled"

    invoke-virtual {p1, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->z:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "reverseDirection"

    invoke-virtual {p1, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "flingBehavior"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "interactionSource"

    iget-object v2, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->E:Lj0/i;

    invoke-virtual {p1, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "bringIntoViewSpec"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 9

    move-object v0, p1

    check-cast v0, Lh0/w2;

    iget-object v6, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->E:Lj0/i;

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->x:Lh0/d2;

    iget-object v5, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->w:Lh0/x2;

    iget-boolean v7, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->y:Z

    iget-boolean v8, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->z:Z

    invoke-virtual/range {v0 .. v8}, Lh0/w2;->j1(Lf0/k;Lh0/s;Lh0/o1;Lh0/d2;Lh0/x2;Lj0/i;ZZ)V

    return-void
.end method
