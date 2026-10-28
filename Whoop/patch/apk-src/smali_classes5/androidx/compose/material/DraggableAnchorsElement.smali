.class final Landroidx/compose/material/DraggableAnchorsElement;
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
        "Landroidx/compose/material/DraggableAnchorsElement;",
        "T",
        "La3/h1;",
        "Lg1/d2;",
        "material"
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
.field public final w:Lg1/a0;

.field public final x:Lej1/h;


# direct methods
.method public constructor <init>(Lg1/a0;Lej1/h;)V
    .locals 1

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/material/DraggableAnchorsElement;->w:Lg1/a0;

    iput-object p2, p0, Landroidx/compose/material/DraggableAnchorsElement;->x:Lej1/h;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 3

    new-instance v0, Lg1/d2;

    sget-object v1, Lh0/d2;->w:Lh0/d2;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v2, p0, Landroidx/compose/material/DraggableAnchorsElement;->w:Lg1/a0;

    iput-object v2, v0, Lg1/d2;->O:Lg1/a0;

    iget-object v2, p0, Landroidx/compose/material/DraggableAnchorsElement;->x:Lej1/h;

    iput-object v2, v0, Lg1/d2;->P:Lej1/h;

    iput-object v1, v0, Lg1/d2;->Q:Lh0/d2;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/material/DraggableAnchorsElement;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/material/DraggableAnchorsElement;

    iget-object v1, p1, Landroidx/compose/material/DraggableAnchorsElement;->w:Lg1/a0;

    iget-object v2, p0, Landroidx/compose/material/DraggableAnchorsElement;->w:Lg1/a0;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Landroidx/compose/material/DraggableAnchorsElement;->x:Lej1/h;

    iget-object p1, p1, Landroidx/compose/material/DraggableAnchorsElement;->x:Lej1/h;

    if-eq v1, p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    sget-object p1, Lh0/d2;->w:Lh0/d2;

    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/material/DraggableAnchorsElement;->w:Lg1/a0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/material/DraggableAnchorsElement;->x:Lej1/h;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    sget-object v0, Lh0/d2;->w:Lh0/d2;

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
    .locals 1

    check-cast p1, Lg1/d2;

    iget-object v0, p0, Landroidx/compose/material/DraggableAnchorsElement;->w:Lg1/a0;

    iput-object v0, p1, Lg1/d2;->O:Lg1/a0;

    iget-object v0, p0, Landroidx/compose/material/DraggableAnchorsElement;->x:Lej1/h;

    iput-object v0, p1, Lg1/d2;->P:Lej1/h;

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    iput-object v0, p1, Lg1/d2;->Q:Lh0/d2;

    return-void
.end method
