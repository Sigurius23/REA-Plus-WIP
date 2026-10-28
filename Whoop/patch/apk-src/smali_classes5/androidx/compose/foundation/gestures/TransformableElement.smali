.class final Landroidx/compose/foundation/gestures/TransformableElement;
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
        "Landroidx/compose/foundation/gestures/TransformableElement;",
        "La3/h1;",
        "Lh0/z3;",
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
.field public final w:Lh0/a4;

.field public final x:Lgo1/a;


# direct methods
.method public constructor <init>(Lh0/a4;Lgo1/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableElement;->w:Lh0/a4;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/TransformableElement;->x:Lgo1/a;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 3

    new-instance v0, Lh0/z3;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableElement;->w:Lh0/a4;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/TransformableElement;->x:Lgo1/a;

    invoke-direct {v0, v1, v2}, Lh0/z3;-><init>(Lh0/a4;Lgo1/a;)V

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
    const-class v1, Landroidx/compose/foundation/gestures/TransformableElement;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    goto :goto_0

    :cond_2
    check-cast p1, Landroidx/compose/foundation/gestures/TransformableElement;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableElement;->w:Lh0/a4;

    iget-object v2, p1, Landroidx/compose/foundation/gestures/TransformableElement;->w:Lh0/a4;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableElement;->x:Lgo1/a;

    iget-object p1, p1, Landroidx/compose/foundation/gestures/TransformableElement;->x:Lgo1/a;

    if-eq v1, p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/gestures/TransformableElement;->w:Lh0/a4;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/gestures/TransformableElement;->x:Lgo1/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    const/4 v0, 0x0

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "transformable"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    const-string v0, "state"

    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableElement;->w:Lh0/a4;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "canPan"

    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableElement;->x:Lgo1/a;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabled"

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lockRotationOnZoomPan"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 3

    check-cast p1, Lh0/z3;

    iget-object v0, p0, Landroidx/compose/foundation/gestures/TransformableElement;->x:Lgo1/a;

    iput-object v0, p1, Lh0/z3;->R:Lgo1/a;

    iget-object v0, p1, Lh0/z3;->Q:Lh0/a4;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableElement;->w:Lh0/a4;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lh0/z3;->S:Z

    if-ne v0, v2, :cond_0

    return-void

    :cond_0
    iput-object v1, p1, Lh0/z3;->Q:Lh0/a4;

    iput-boolean v2, p1, Lh0/z3;->S:Z

    iget-object p1, p1, Lh0/z3;->W:Lu2/h0;

    invoke-virtual {p1}, Lu2/h0;->Z0()V

    return-void
.end method
