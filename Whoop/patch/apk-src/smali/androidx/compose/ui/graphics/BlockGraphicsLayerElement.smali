.class final Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;
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
        "Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;",
        "La3/h1;",
        "Li2/q;",
        "ui_release"
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
.field public final w:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->w:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Li2/q;

    iget-object v1, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->w:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1}, Li2/q;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;

    iget-object p1, p1, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->w:Lkotlin/jvm/functions/Function1;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->w:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "graphicsLayer"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "block"

    iget-object v1, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->w:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, Li2/q;

    iget-object v0, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->w:Lkotlin/jvm/functions/Function1;

    iput-object v0, p1, Li2/q;->O:Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x2

    invoke-static {p1, v0}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_0

    iget-object p1, p1, Li2/q;->O:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/compose/ui/node/NodeCoordinator;->F1(Lkotlin/jvm/functions/Function1;Z)V

    :cond_0
    return-void
.end method
