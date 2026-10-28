.class final Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0083\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;",
        "La3/h1;",
        "Lp0/g1;",
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
.field public final w:Lp0/l0;


# direct methods
.method public constructor <init>(Lp0/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;->w:Lp0/l0;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Lp0/g1;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;->w:Lp0/l0;

    iput-object v1, v0, Lp0/g1;->O:Lp0/l0;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;->w:Lp0/l0;

    iget-object p1, p1, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;->w:Lp0/l0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;->w:Lp0/l0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 1

    const-string v0, "traversablePrefetchState"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;->w:Lp0/l0;

    iput-object v0, p1, Lb3/l2;->b:Ljava/lang/Object;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TraversablePrefetchStateModifierElement(prefetchState="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;->w:Lp0/l0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Lp0/g1;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;->w:Lp0/l0;

    iput-object v0, p1, Lp0/g1;->O:Lp0/l0;

    return-void
.end method
