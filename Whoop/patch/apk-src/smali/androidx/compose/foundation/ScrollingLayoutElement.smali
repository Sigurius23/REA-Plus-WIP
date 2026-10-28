.class public final Landroidx/compose/foundation/ScrollingLayoutElement;
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
        "Landroidx/compose/foundation/ScrollingLayoutElement;",
        "La3/h1;",
        "Lf0/o1;",
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
.field public final w:Lf0/r1;

.field public final x:Z


# direct methods
.method public constructor <init>(Lf0/r1;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->w:Lf0/r1;

    iput-boolean p2, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->x:Z

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Lf0/o1;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->w:Lf0/r1;

    iput-object v1, v0, Lf0/o1;->O:Lf0/r1;

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->x:Z

    iput-boolean v1, v0, Lf0/o1;->P:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Landroidx/compose/foundation/ScrollingLayoutElement;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Landroidx/compose/foundation/ScrollingLayoutElement;

    iget-object v0, p1, Landroidx/compose/foundation/ScrollingLayoutElement;->w:Lf0/r1;

    iget-object v1, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->w:Lf0/r1;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->x:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/ScrollingLayoutElement;->x:Z

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->w:Lf0/r1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->x:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "scroll"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "state"

    iget-object v2, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->w:Lf0/r1;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "reverseScrolling"

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    iget-boolean v0, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->x:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "isVertical"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Lf0/o1;

    iget-object v0, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->w:Lf0/r1;

    iput-object v0, p1, Lf0/o1;->O:Lf0/r1;

    iget-boolean v0, p0, Landroidx/compose/foundation/ScrollingLayoutElement;->x:Z

    iput-boolean v0, p1, Lf0/o1;->P:Z

    return-void
.end method
