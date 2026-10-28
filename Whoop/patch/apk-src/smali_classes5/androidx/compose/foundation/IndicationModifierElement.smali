.class final Landroidx/compose/foundation/IndicationModifierElement;
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
        "Landroidx/compose/foundation/IndicationModifierElement;",
        "La3/h1;",
        "Lf0/u0;",
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
.field public final w:Lj0/i;

.field public final x:Lf0/v0;


# direct methods
.method public constructor <init>(Lf0/v0;Lj0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/compose/foundation/IndicationModifierElement;->w:Lj0/i;

    iput-object p1, p0, Landroidx/compose/foundation/IndicationModifierElement;->x:Lf0/v0;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 3

    new-instance v0, Lf0/u0;

    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->x:Lf0/v0;

    iget-object v2, p0, Landroidx/compose/foundation/IndicationModifierElement;->w:Lj0/i;

    invoke-interface {v1, v2}, Lf0/v0;->a(Lj0/i;)La3/n;

    move-result-object v1

    invoke-direct {v0}, La3/o;-><init>()V

    iput-object v1, v0, Lf0/u0;->Q:La3/n;

    invoke-virtual {v0, v1}, La3/o;->X0(La3/n;)La3/n;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/IndicationModifierElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/IndicationModifierElement;

    iget-object v1, p1, Landroidx/compose/foundation/IndicationModifierElement;->w:Lj0/i;

    iget-object v3, p0, Landroidx/compose/foundation/IndicationModifierElement;->w:Lj0/i;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->x:Lf0/v0;

    iget-object p1, p1, Landroidx/compose/foundation/IndicationModifierElement;->x:Lf0/v0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/IndicationModifierElement;->w:Lj0/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->x:Lf0/v0;

    invoke-interface {v1}, Lf0/v0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "indication"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    const-string v1, "interactionSource"

    iget-object v2, p0, Landroidx/compose/foundation/IndicationModifierElement;->w:Lj0/i;

    invoke-virtual {p1, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->x:Lf0/v0;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, Lf0/u0;

    iget-object v0, p0, Landroidx/compose/foundation/IndicationModifierElement;->x:Lf0/v0;

    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->w:Lj0/i;

    invoke-interface {v0, v1}, Lf0/v0;->a(Lj0/i;)La3/n;

    move-result-object v0

    iget-object v1, p1, Lf0/u0;->Q:La3/n;

    invoke-virtual {p1, v1}, La3/o;->Y0(La3/n;)V

    iput-object v0, p1, Lf0/u0;->Q:La3/n;

    invoke-virtual {p1, v0}, La3/o;->X0(La3/n;)La3/n;

    return-void
.end method
