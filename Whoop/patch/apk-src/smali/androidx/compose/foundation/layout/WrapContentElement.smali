.class final Landroidx/compose/foundation/layout/WrapContentElement;
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
        "Landroidx/compose/foundation/layout/WrapContentElement;",
        "La3/h1;",
        "Ll0/h2;",
        "foundation-layout"
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
.field public final E:Ljava/lang/String;

.field public final w:Ll0/f0;

.field public final x:Z

.field public final y:Lc93/m;

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll0/f0;ZLc93/m;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->w:Ll0/f0;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->x:Z

    iput-object p3, p0, Landroidx/compose/foundation/layout/WrapContentElement;->y:Lc93/m;

    iput-object p4, p0, Landroidx/compose/foundation/layout/WrapContentElement;->z:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/compose/foundation/layout/WrapContentElement;->E:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ll0/h2;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->w:Ll0/f0;

    iput-object v1, v0, Ll0/h2;->O:Ll0/f0;

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->x:Z

    iput-boolean v1, v0, Ll0/h2;->P:Z

    iget-object v1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->y:Lc93/m;

    iput-object v1, v0, Ll0/h2;->Q:Lc93/m;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    const-class v2, Landroidx/compose/foundation/layout/WrapContentElement;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    check-cast p1, Landroidx/compose/foundation/layout/WrapContentElement;

    iget-object v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->w:Ll0/f0;

    iget-object v3, p1, Landroidx/compose/foundation/layout/WrapContentElement;->w:Ll0/f0;

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->x:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/layout/WrapContentElement;->x:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->z:Ljava/lang/Object;

    iget-object p1, p1, Landroidx/compose/foundation/layout/WrapContentElement;->z:Ljava/lang/Object;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->w:Ll0/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->x:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->z:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "align"

    iget-object v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->z:Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->x:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "unbounded"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Ll0/h2;

    iget-object v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->w:Ll0/f0;

    iput-object v0, p1, Ll0/h2;->O:Ll0/f0;

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->x:Z

    iput-boolean v0, p1, Ll0/h2;->P:Z

    iget-object v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->y:Lc93/m;

    iput-object v0, p1, Ll0/h2;->Q:Lc93/m;

    return-void
.end method
