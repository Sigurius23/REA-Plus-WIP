.class public final Landroidx/compose/foundation/gestures/DraggableElement;
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
        "Landroidx/compose/foundation/gestures/DraggableElement;",
        "La3/h1;",
        "Lh0/m1;",
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


# static fields
.field public static final I:Lgm1/b;


# instance fields
.field public final E:Z

.field public final F:Lkotlin/jvm/functions/Function3;

.field public final G:Lkotlin/jvm/functions/Function3;

.field public final H:Z

.field public final w:Lh0/n1;

.field public final x:Lh0/d2;

.field public final y:Z

.field public final z:Lj0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgm1/b;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lgm1/b;-><init>(I)V

    sput-object v0, Landroidx/compose/foundation/gestures/DraggableElement;->I:Lgm1/b;

    return-void
.end method

.method public constructor <init>(Lh0/n1;Lh0/d2;ZLj0/i;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->w:Lh0/n1;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->x:Lh0/d2;

    iput-boolean p3, p0, Landroidx/compose/foundation/gestures/DraggableElement;->y:Z

    iput-object p4, p0, Landroidx/compose/foundation/gestures/DraggableElement;->z:Lj0/i;

    iput-boolean p5, p0, Landroidx/compose/foundation/gestures/DraggableElement;->E:Z

    iput-object p6, p0, Landroidx/compose/foundation/gestures/DraggableElement;->F:Lkotlin/jvm/functions/Function3;

    iput-object p7, p0, Landroidx/compose/foundation/gestures/DraggableElement;->G:Lkotlin/jvm/functions/Function3;

    iput-boolean p8, p0, Landroidx/compose/foundation/gestures/DraggableElement;->H:Z

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 5

    new-instance v0, Lh0/m1;

    sget-object v1, Landroidx/compose/foundation/gestures/DraggableElement;->I:Lgm1/b;

    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->y:Z

    iget-object v3, p0, Landroidx/compose/foundation/gestures/DraggableElement;->z:Lj0/i;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/DraggableElement;->x:Lh0/d2;

    invoke-direct {v0, v1, v2, v3, v4}, Lh0/f1;-><init>(Lkotlin/jvm/functions/Function1;ZLj0/i;Lh0/d2;)V

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->w:Lh0/n1;

    iput-object v1, v0, Lh0/m1;->Z:Lh0/n1;

    iput-object v4, v0, Lh0/m1;->a0:Lh0/d2;

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->E:Z

    iput-boolean v1, v0, Lh0/m1;->b0:Z

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->F:Lkotlin/jvm/functions/Function3;

    iput-object v1, v0, Lh0/m1;->c0:Lkotlin/jvm/functions/Function3;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->G:Lkotlin/jvm/functions/Function3;

    iput-object v1, v0, Lh0/m1;->d0:Lkotlin/jvm/functions/Function3;

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->H:Z

    iput-boolean v1, v0, Lh0/m1;->e0:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    const-class v2, Landroidx/compose/foundation/gestures/DraggableElement;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    check-cast p1, Landroidx/compose/foundation/gestures/DraggableElement;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->w:Lh0/n1;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->w:Lh0/n1;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->x:Lh0/d2;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->x:Lh0/d2;

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->y:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->y:Z

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->z:Lj0/i;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->z:Lj0/i;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->E:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->E:Z

    if-eq v2, v3, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->F:Lkotlin/jvm/functions/Function3;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->F:Lkotlin/jvm/functions/Function3;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->G:Lkotlin/jvm/functions/Function3;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->G:Lkotlin/jvm/functions/Function3;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    :cond_9
    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->H:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/gestures/DraggableElement;->H:Z

    if-eq v2, p1, :cond_a

    return v1

    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/gestures/DraggableElement;->w:Lh0/n1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->x:Lh0/d2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/DraggableElement;->y:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->z:Lj0/i;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->E:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->F:Lkotlin/jvm/functions/Function3;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/DraggableElement;->G:Lkotlin/jvm/functions/Function3;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->H:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "draggable"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "orientation"

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->x:Lh0/d2;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->y:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "enabled"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->H:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "reverseDirection"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "interactionSource"

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->z:Lj0/i;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->E:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "startDragImmediately"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "onDragStarted"

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->F:Lkotlin/jvm/functions/Function3;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "onDragStopped"

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->G:Lkotlin/jvm/functions/Function3;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "state"

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->w:Lh0/n1;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 6

    move-object v0, p1

    check-cast v0, Lh0/m1;

    iget-object p1, v0, Lh0/m1;->Z:Lh0/n1;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->w:Lh0/n1;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x1

    if-nez p1, :cond_0

    iput-object v1, v0, Lh0/m1;->Z:Lh0/n1;

    move p1, v2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, v0, Lh0/m1;->a0:Lh0/d2;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/DraggableElement;->x:Lh0/d2;

    if-eq v1, v4, :cond_1

    iput-object v4, v0, Lh0/m1;->a0:Lh0/d2;

    move p1, v2

    :cond_1
    iget-boolean v1, v0, Lh0/m1;->e0:Z

    iget-boolean v3, p0, Landroidx/compose/foundation/gestures/DraggableElement;->H:Z

    if-eq v1, v3, :cond_2

    iput-boolean v3, v0, Lh0/m1;->e0:Z

    move v5, v2

    goto :goto_1

    :cond_2
    move v5, p1

    :goto_1
    iget-object p1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->F:Lkotlin/jvm/functions/Function3;

    iput-object p1, v0, Lh0/m1;->c0:Lkotlin/jvm/functions/Function3;

    iget-object p1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->G:Lkotlin/jvm/functions/Function3;

    iput-object p1, v0, Lh0/m1;->d0:Lkotlin/jvm/functions/Function3;

    iget-boolean p1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->E:Z

    iput-boolean p1, v0, Lh0/m1;->b0:Z

    sget-object v1, Landroidx/compose/foundation/gestures/DraggableElement;->I:Lgm1/b;

    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->y:Z

    iget-object v3, p0, Landroidx/compose/foundation/gestures/DraggableElement;->z:Lj0/i;

    invoke-virtual/range {v0 .. v5}, Lh0/f1;->i1(Lkotlin/jvm/functions/Function1;ZLj0/i;Lh0/d2;Z)V

    return-void
.end method
