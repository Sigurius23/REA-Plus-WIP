.class final Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;
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
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;",
        "La3/h1;",
        "Lp0/n;",
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
.field public final w:Lp0/o;

.field public final x:Laj/d;

.field public final y:Lh0/d2;


# direct methods
.method public constructor <init>(Lp0/o;Laj/d;Lh0/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->w:Lp0/o;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->x:Laj/d;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->y:Lh0/d2;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Lp0/n;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->w:Lp0/o;

    iput-object v1, v0, Lp0/n;->O:Lp0/o;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->x:Laj/d;

    iput-object v1, v0, Lp0/n;->P:Laj/d;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->y:Lh0/d2;

    iput-object v1, v0, Lp0/n;->Q:Lh0/d2;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;

    iget-object v0, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->w:Lp0/o;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->w:Lp0/o;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->x:Laj/d;

    iget-object v1, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->x:Laj/d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->y:Lh0/d2;

    iget-object p1, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->y:Lh0/d2;

    if-eq v0, p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->w:Lp0/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->x:Laj/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    const/4 v0, 0x0

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->y:Lh0/d2;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 0

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Lp0/n;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->w:Lp0/o;

    iput-object v0, p1, Lp0/n;->O:Lp0/o;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->x:Laj/d;

    iput-object v0, p1, Lp0/n;->P:Laj/d;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;->y:Lh0/d2;

    iput-object v0, p1, Lp0/n;->Q:Lh0/d2;

    return-void
.end method
