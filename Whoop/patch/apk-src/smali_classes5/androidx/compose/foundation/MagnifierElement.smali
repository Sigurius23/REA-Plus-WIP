.class public final Landroidx/compose/foundation/MagnifierElement;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/MagnifierElement;",
        "La3/h1;",
        "Lf0/x0;",
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
.field public final w:Lkotlin/jvm/functions/Function1;

.field public final x:Lkotlin/jvm/functions/Function1;

.field public final y:Lf0/h1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lf0/h1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/MagnifierElement;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Landroidx/compose/foundation/MagnifierElement;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Landroidx/compose/foundation/MagnifierElement;->y:Lf0/h1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 4

    new-instance v0, Lf0/x0;

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->w:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Landroidx/compose/foundation/MagnifierElement;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Landroidx/compose/foundation/MagnifierElement;->y:Lf0/h1;

    invoke-direct {v0, v1, v2, v3}, Lf0/x0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lf0/h1;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 6

    iget-object v0, p0, Landroidx/compose/foundation/MagnifierElement;->w:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3c1

    const/high16 v1, 0x7fc00000    # Float.NaN

    const/16 v2, 0x1f

    invoke-static {v1, v0, v2}, Ld;->a(FII)I

    move-result v0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {v0, v4, v5, v2}, Ld;->e(IJI)I

    move-result v0

    invoke-static {v1, v0, v2}, Ld;->a(FII)I

    move-result v0

    invoke-static {v1, v0, v2}, Ld;->a(FII)I

    move-result v0

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, v2}, Lr;->e(Lkotlin/jvm/functions/Function1;II)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->y:Lf0/h1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 4

    const-string v0, "magnifier"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    const-string v0, "sourceCenter"

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->w:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "magnifierCenter"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x7fc00000    # Float.NaN

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "zoom"

    invoke-virtual {p1, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly3/h;

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-direct {v1, v2, v3}, Ly3/h;-><init>(J)V

    const-string v2, "size"

    invoke-virtual {p1, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    const-string v2, "cornerRadius"

    invoke-virtual {p1, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    const-string v0, "elevation"

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clippingEnabled"

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 9

    check-cast p1, Lf0/x0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lf0/x0;->Q:Lf0/h1;

    iget-object v1, p1, Lf0/x0;->R:Landroid/view/View;

    iget-object v2, p1, Lf0/x0;->S:Ly3/c;

    iget-object v3, p0, Landroidx/compose/foundation/MagnifierElement;->w:Lkotlin/jvm/functions/Function1;

    iput-object v3, p1, Lf0/x0;->O:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Landroidx/compose/foundation/MagnifierElement;->x:Lkotlin/jvm/functions/Function1;

    iput-object v3, p1, Lf0/x0;->P:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Landroidx/compose/foundation/MagnifierElement;->y:Lf0/h1;

    iput-object v3, p1, Lf0/x0;->Q:Lf0/h1;

    invoke-static {p1}, Ldp/d;->W(La3/n;)Landroid/view/View;

    move-result-object v4

    invoke-static {p1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v5

    iget-object v5, v5, La3/n0;->X:Ly3/c;

    iget-object v6, p1, Lf0/x0;->T:Le10/k0;

    if-eqz v6, :cond_2

    sget-object v6, Lf0/y0;->a:Li3/y;

    const/high16 v6, 0x7fc00000    # Float.NaN

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v3}, Lf0/h1;->b()Z

    move-result v7

    if-eqz v7, :cond_1

    :goto_0
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {v7, v8, v7, v8}, Ly3/h;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-static {v6, v6}, Ly3/f;->b(FF)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-static {v6, v6}, Ly3/f;->b(FF)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p1}, Lf0/x0;->Y0()V

    :cond_2
    invoke-virtual {p1}, Lf0/x0;->Z0()V

    return-void
.end method
