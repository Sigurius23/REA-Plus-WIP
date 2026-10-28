.class final Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;
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
        "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;",
        "La3/h1;",
        "La1/i;",
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
.field public final w:Ls83/i;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Ls83/i;

    iput-object p1, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;->w:Ls83/i;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, La1/i;

    iget-object v1, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;->w:Ls83/i;

    invoke-direct {v0, v1}, La1/i;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;

    iget-object p1, p1, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;->w:Ls83/i;

    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;->w:Ls83/i;

    if-eq v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;->w:Ls83/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "TextContextMenuGestures"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    const-string v0, "onPreShowContextMenu"

    iget-object v1, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;->w:Ls83/i;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, La1/i;

    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;->w:Ls83/i;

    iput-object v0, p1, La1/i;->Q:Ls83/i;

    return-void
.end method
