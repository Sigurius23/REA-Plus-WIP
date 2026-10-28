.class final Landroidx/compose/foundation/layout/BoxChildDataElement;
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
        "Landroidx/compose/foundation/layout/BoxChildDataElement;",
        "La3/h1;",
        "Ll0/o;",
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
.field public final w:Lb2/h;

.field public final x:Z


# direct methods
.method public constructor <init>(Lb2/h;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->w:Lb2/h;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->x:Z

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ll0/o;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->w:Lb2/h;

    iput-object v1, v0, Ll0/o;->O:Lb2/h;

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->x:Z

    iput-boolean v1, v0, Ll0/o;->P:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/BoxChildDataElement;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/BoxChildDataElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->w:Lb2/h;

    iget-object v1, p1, Landroidx/compose/foundation/layout/BoxChildDataElement;->w:Lb2/h;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->x:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/layout/BoxChildDataElement;->x:Z

    if-ne v0, p1, :cond_3

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->w:Lb2/h;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->x:Z

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
    .locals 1

    check-cast p1, Ll0/o;

    iget-object v0, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->w:Lb2/h;

    iput-object v0, p1, Ll0/o;->O:Lb2/h;

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->x:Z

    iput-boolean v0, p1, Ll0/o;->P:Z

    return-void
.end method
