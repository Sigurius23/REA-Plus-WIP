.class final Landroidx/compose/ui/layout/OnVisibilityChangedElement;
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
        "Landroidx/compose/ui/layout/OnVisibilityChangedElement;",
        "La3/h1;",
        "Ly2/f1;",
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
.field public final w:Ly2/w;

.field public final x:Lch0/i;


# direct methods
.method public constructor <init>(Ly2/w;Lch0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->w:Ly2/w;

    iput-object p2, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->x:Lch0/i;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 3

    new-instance v0, Ly2/f1;

    iget-object v1, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->w:Ly2/w;

    iget-object v2, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->x:Lch0/i;

    invoke-direct {v0, v1, v2}, Ly2/f1;-><init>(Ly2/w;Lch0/i;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_4

    const-class v0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Landroidx/compose/ui/layout/OnVisibilityChangedElement;

    iget-object v0, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->w:Ly2/w;

    iget-object v1, p1, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->w:Ly2/w;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->x:Lch0/i;

    iget-object p1, p1, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->x:Lch0/i;

    if-eq v0, p1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->w:Ly2/w;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->x:Lch0/i;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "onViewportVisibilityChanged"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "minDurationMs"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "minFractionVisible"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewportRef"

    iget-object v1, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->w:Ly2/w;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    iget-object v1, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->x:Lch0/i;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, Ly2/f1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->x:Lch0/i;

    iput-object v0, p1, Ly2/f1;->O:Lch0/i;

    iget-object v0, p0, Landroidx/compose/ui/layout/OnVisibilityChangedElement;->w:Ly2/w;

    iput-object v0, p1, Ly2/f1;->P:Ly2/w;

    invoke-virtual {p1}, Ly2/f1;->Z0()V

    iget-object v0, p1, Ly2/f1;->U:Lj3/c;

    if-eqz v0, :cond_0

    iget-object v1, p1, Ly2/f1;->V:Lj3/c;

    invoke-virtual {p1, v0, v1}, Ly2/f1;->X0(Lj3/c;Lj3/c;)V

    :cond_0
    return-void
.end method
