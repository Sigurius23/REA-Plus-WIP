.class final Landroidx/compose/foundation/gestures/AnchoredDraggableElement;
.super La3/h1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "La3/h1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00030\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroidx/compose/foundation/gestures/AnchoredDraggableElement;",
        "T",
        "La3/h1;",
        "Lh0/k;",
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
.field public final w:Lh0/p;

.field public final x:Z

.field public final y:Lj0/i;

.field public final z:Lh0/o1;


# direct methods
.method public constructor <init>(Lh0/p;ZLj0/i;Lh0/o1;)V
    .locals 1

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->w:Lh0/p;

    iput-boolean p2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->x:Z

    iput-object p3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->y:Lj0/i;

    iput-object p4, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->z:Lh0/o1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 5

    new-instance v0, Lh0/k;

    sget-object v1, Lh0/d2;->w:Lh0/d2;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->y:Lj0/i;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->z:Lh0/o1;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->w:Lh0/p;

    iget-boolean v4, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->x:Z

    invoke-direct {v0, v3, v4, v1, v2}, Lh0/k;-><init>(Lh0/p;ZLj0/i;Lh0/o1;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;

    iget-object v0, p1, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->w:Lh0/p;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->w:Lh0/p;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Lh0/d2;->w:Lh0/d2;

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->x:Z

    iget-boolean v1, p1, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->x:Z

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->y:Lj0/i;

    iget-object v1, p1, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->y:Lj0/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->z:Lh0/o1;

    iget-object p1, p1, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->z:Lh0/o1;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->w:Lh0/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    sget-object v1, Lh0/d2;->w:Lh0/d2;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->x:Z

    const/16 v2, 0x3c1

    invoke-static {v1, v2, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->y:Lj0/i;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x745f

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->z:Lh0/o1;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 4

    const-string v0, "anchoredDraggable"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "state"

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->w:Lh0/p;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "orientation"

    sget-object v2, Lh0/d2;->w:Lh0/d2;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->x:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "enabled"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "reverseDirection"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v2, "interactionSource"

    iget-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->y:Lj0/i;

    invoke-virtual {v0, v3, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v2, "startDragImmediately"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v2, "overscrollEffect"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "flingBehavior"

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->z:Lh0/o1;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 4

    check-cast p1, Lh0/k;

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->y:Lj0/i;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->z:Lh0/o1;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->w:Lh0/p;

    iget-boolean v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;->x:Z

    invoke-virtual {p1, v2, v3, v0, v1}, Lh0/k;->l1(Lh0/p;ZLj0/i;Lh0/o1;)V

    return-void
.end method
