.class final Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;
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
        "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;",
        "La3/h1;",
        "La1/k;",
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
.field public final w:Lro/i;

.field public final x:Ls83/i;

.field public final y:Lkotlin/jvm/functions/Function1;

.field public final z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lro/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->w:Lro/i;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->x:Ls83/i;

    iput-object p3, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 5

    new-instance v0, La1/k;

    iget-object v1, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->z:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->w:Lro/i;

    iget-object v4, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->x:Ls83/i;

    invoke-direct {v0, v3, v4, v1, v2}, La1/k;-><init>(Lro/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;

    iget-object v0, p1, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->w:Lro/i;

    iget-object v1, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->w:Lro/i;

    if-eq v1, v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->x:Ls83/i;

    iget-object v1, p1, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->x:Ls83/i;

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p1, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->y:Lkotlin/jvm/functions/Function1;

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->z:Lkotlin/jvm/functions/Function1;

    iget-object p1, p1, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->z:Lkotlin/jvm/functions/Function1;

    if-eq v0, p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->w:Lro/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->x:Ls83/i;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->y:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->z:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 0

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, La1/k;

    iget-object v0, p1, La1/k;->Q:Lro/i;

    const/4 v1, 0x0

    iput-object v1, v0, Lro/i;->x:Ljava/lang/Object;

    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->w:Lro/i;

    iput-object v0, p1, La1/k;->Q:Lro/i;

    iput-object p1, v0, Lro/i;->x:Ljava/lang/Object;

    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->x:Ls83/i;

    iput-object v0, p1, La1/k;->R:Ls83/i;

    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->y:Lkotlin/jvm/functions/Function1;

    iput-object v0, p1, La1/k;->S:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;->z:Lkotlin/jvm/functions/Function1;

    iput-object v0, p1, La1/k;->T:Lkotlin/jvm/functions/Function1;

    return-void
.end method
