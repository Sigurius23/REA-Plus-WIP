.class final Landroidx/compose/foundation/ScrollingContainerElement;
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
        "Landroidx/compose/foundation/ScrollingContainerElement;",
        "La3/h1;",
        "Lf0/s1;",
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

.field public final F:Lh0/s;

.field public final G:Z

.field public final H:Lf0/k;

.field public final w:Lh0/x2;

.field public final x:Lh0/d2;

.field public final y:Z

.field public final z:Lh0/o1;


# direct methods
.method public constructor <init>(Lf0/k;Lh0/s;Lh0/o1;Lh0/d2;Lh0/x2;Lj0/i;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lh0/x2;

    iput-object p4, p0, Landroidx/compose/foundation/ScrollingContainerElement;->x:Lh0/d2;

    iput-boolean p7, p0, Landroidx/compose/foundation/ScrollingContainerElement;->y:Z

    iput-object p3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->z:Lh0/o1;

    iput-object p6, p0, Landroidx/compose/foundation/ScrollingContainerElement;->E:Lj0/i;

    iput-object p2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->F:Lh0/s;

    iput-boolean p8, p0, Landroidx/compose/foundation/ScrollingContainerElement;->G:Z

    iput-object p1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->H:Lf0/k;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Lf0/s1;

    invoke-direct {v0}, La3/o;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lh0/x2;

    iput-object v1, v0, Lf0/s1;->Q:Lh0/x2;

    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->x:Lh0/d2;

    iput-object v1, v0, Lf0/s1;->R:Lh0/d2;

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->y:Z

    iput-boolean v1, v0, Lf0/s1;->S:Z

    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->z:Lh0/o1;

    iput-object v1, v0, Lf0/s1;->T:Lh0/o1;

    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->E:Lj0/i;

    iput-object v1, v0, Lf0/s1;->U:Lj0/i;

    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->F:Lh0/s;

    iput-object v1, v0, Lf0/s1;->V:Lh0/s;

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->G:Z

    iput-boolean v1, v0, Lf0/s1;->W:Z

    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->H:Lf0/k;

    iput-object v1, v0, Lf0/s1;->X:Lf0/k;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_a

    const-class v0, Landroidx/compose/foundation/ScrollingContainerElement;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Landroidx/compose/foundation/ScrollingContainerElement;

    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lh0/x2;

    iget-object v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lh0/x2;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->x:Lh0/d2;

    iget-object v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->x:Lh0/d2;

    if-eq v0, v1, :cond_3

    goto :goto_1

    :cond_3
    iget-boolean v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->y:Z

    iget-boolean v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->y:Z

    if-eq v0, v1, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->z:Lh0/o1;

    iget-object v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->z:Lh0/o1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->E:Lj0/i;

    iget-object v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->E:Lj0/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->F:Lh0/s;

    iget-object v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->F:Lh0/s;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    iget-boolean v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->G:Z

    iget-boolean v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->G:Z

    if-eq v0, v1, :cond_8

    goto :goto_1

    :cond_8
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->H:Lf0/k;

    iget-object p1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->H:Lf0/k;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_1

    :cond_9
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_a
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lh0/x2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->x:Lh0/d2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->y:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->z:Lh0/o1;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->E:Lj0/i;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->F:Lh0/s;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->G:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->H:Lf0/k;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_3
    add-int/2addr v0, v2

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "scrollingContainer"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "state"

    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lh0/x2;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "orientation"

    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->x:Lh0/d2;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->y:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "enabled"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "reverseScrolling"

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "flingBehavior"

    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->z:Lh0/o1;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "interactionSource"

    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->E:Lj0/i;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "bringIntoViewSpec"

    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->F:Lh0/s;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->G:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "useLocalOverscrollFactory"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "overscrollEffect"

    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->H:Lf0/k;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 9

    move-object v0, p1

    check-cast v0, Lf0/s1;

    iget-object v6, p0, Landroidx/compose/foundation/ScrollingContainerElement;->E:Lj0/i;

    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->F:Lh0/s;

    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->H:Lf0/k;

    iget-object v3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->z:Lh0/o1;

    iget-object v4, p0, Landroidx/compose/foundation/ScrollingContainerElement;->x:Lh0/d2;

    iget-object v5, p0, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lh0/x2;

    iget-boolean v7, p0, Landroidx/compose/foundation/ScrollingContainerElement;->G:Z

    iget-boolean v8, p0, Landroidx/compose/foundation/ScrollingContainerElement;->y:Z

    invoke-virtual/range {v0 .. v8}, Lf0/s1;->c1(Lf0/k;Lh0/s;Lh0/o1;Lh0/d2;Lh0/x2;Lj0/i;ZZ)V

    return-void
.end method
