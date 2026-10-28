.class public final Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;
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
        "Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;",
        "La3/h1;",
        "Lu2/a0;",
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
.field public final w:La3/q;


# direct methods
.method public constructor <init>(La3/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;->w:La3/q;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 3

    new-instance v0, Lu2/a0;

    sget-object v1, Lu0/n0;->b:Lu2/a;

    iget-object v2, p0, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;->w:La3/q;

    invoke-direct {v0, v1, v2}, Lu2/e;-><init>(Lu2/a;La3/q;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;

    sget-object v0, Lu0/n0;->b:Lu2/a;

    invoke-virtual {v0, v0}, Lu2/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;->w:La3/q;

    iget-object p1, p1, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;->w:La3/q;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/16 v0, 0x3fe

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;->w:La3/q;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, La3/q;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "stylusHoverIcon"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    const-string v0, "icon"

    sget-object v1, Lu0/n0;->b:Lu2/a;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overrideDescendants"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "touchBoundsExpansion"

    iget-object v1, p0, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;->w:La3/q;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StylusHoverIconModifierElement(icon="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lu0/n0;->b:Lu2/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", overrideDescendants=false, touchBoundsExpansion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;->w:La3/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, Lu2/a0;

    sget-object v0, Lu0/n0;->b:Lu2/a;

    iget-object v1, p1, Lu2/e;->P:Lu2/a;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iput-object v0, p1, Lu2/e;->P:Lu2/a;

    iget-boolean v0, p1, Lu2/e;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lu2/e;->Z0()V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;->w:La3/q;

    iput-object v0, p1, Lu2/e;->O:La3/q;

    return-void
.end method
