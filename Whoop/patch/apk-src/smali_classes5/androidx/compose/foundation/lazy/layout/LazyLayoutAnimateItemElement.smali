.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0081\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;",
        "La3/h1;",
        "Lp0/j;",
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
.field public final w:Ld0/c0;

.field public final x:Ld0/i1;

.field public final y:Ld0/c0;


# direct methods
.method public constructor <init>(Ld0/c0;Ld0/i1;Ld0/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->w:Ld0/c0;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->x:Ld0/i1;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->y:Ld0/c0;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Lp0/j;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->w:Ld0/c0;

    iput-object v1, v0, Lp0/j;->O:Ld0/c0;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->x:Ld0/i1;

    iput-object v1, v0, Lp0/j;->P:Ld0/i1;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->y:Ld0/c0;

    iput-object v1, v0, Lp0/j;->Q:Ld0/c0;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->w:Ld0/c0;

    iget-object v1, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->w:Ld0/c0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->x:Ld0/i1;

    iget-object v1, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->x:Ld0/i1;

    invoke-virtual {v0, v1}, Ld0/i1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->y:Ld0/c0;

    iget-object p1, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->y:Ld0/c0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

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

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->w:Ld0/c0;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->x:Ld0/i1;

    invoke-virtual {v2}, Ld0/i1;->hashCode()I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->y:Ld0/c0;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    return v2
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "animateItem"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    const-string v0, "fadeInSpec"

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->w:Ld0/c0;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placementSpec"

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->x:Ld0/i1;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fadeOutSpec"

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->y:Ld0/c0;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LazyLayoutAnimateItemElement(fadeInSpec="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->w:Ld0/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placementSpec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->x:Ld0/i1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fadeOutSpec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->y:Ld0/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Lp0/j;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->w:Ld0/c0;

    iput-object v0, p1, Lp0/j;->O:Ld0/c0;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->x:Ld0/i1;

    iput-object v0, p1, Lp0/j;->P:Ld0/i1;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;->y:Ld0/c0;

    iput-object v0, p1, Lp0/j;->Q:Ld0/c0;

    return-void
.end method
