.class final Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;
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
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;",
        "La3/h1;",
        "Lp0/v0;",
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
.field public final w:Lc93/a;

.field public final x:Lp0/s0;

.field public final y:Lh0/d2;

.field public final z:Z


# direct methods
.method public constructor <init>(Lc93/a;Lp0/s0;Lh0/d2;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->w:Lc93/a;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->x:Lp0/s0;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->y:Lh0/d2;

    iput-boolean p4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->z:Z

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 5

    new-instance v0, Lp0/v0;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->y:Lh0/d2;

    iget-boolean v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->z:Z

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->w:Lc93/a;

    iget-object v4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->x:Lp0/s0;

    invoke-direct {v0, v3, v4, v1, v2}, Lp0/v0;-><init>(Lc93/a;Lp0/s0;Lh0/d2;Z)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;

    iget-object v1, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->w:Lc93/a;

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->w:Lc93/a;

    if-eq v2, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->x:Lp0/s0;

    iget-object v2, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->x:Lp0/s0;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->y:Lh0/d2;

    iget-object v2, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->y:Lh0/d2;

    if-eq v1, v2, :cond_4

    goto :goto_0

    :cond_4
    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->z:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->z:Z

    if-eq v1, p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->w:Lc93/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->x:Lp0/s0;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->y:Lh0/d2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->z:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 0

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, Lp0/v0;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->w:Lc93/a;

    iput-object v0, p1, Lp0/v0;->O:Lc93/a;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->x:Lp0/s0;

    iput-object v0, p1, Lp0/v0;->P:Lp0/s0;

    iget-object v0, p1, Lp0/v0;->Q:Lh0/d2;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->y:Lh0/d2;

    if-eq v0, v1, :cond_0

    iput-object v1, p1, Lp0/v0;->Q:Lh0/d2;

    invoke-static {p1}, La3/g;->j(La3/j2;)V

    :cond_0
    iget-boolean v0, p1, Lp0/v0;->R:Z

    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->z:Z

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iput-boolean v1, p1, Lp0/v0;->R:Z

    invoke-virtual {p1}, Lp0/v0;->X0()V

    invoke-static {p1}, La3/g;->j(La3/j2;)V

    return-void
.end method
