.class final Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;
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
        "Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;",
        "La3/h1;",
        "Lr0/d;",
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
.field public final w:Lr0/a;


# direct methods
.method public constructor <init>(Lr0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->w:Lr0/a;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Lr0/d;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->w:Lr0/a;

    iput-object v1, v0, Lr0/d;->O:Lr0/a;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;

    iget-object p1, p1, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->w:Lr0/a;

    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->w:Lr0/a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->w:Lr0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "bringIntoViewRequester"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->w:Lr0/a;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, Lr0/d;

    iget-object v0, p1, Lr0/d;->O:Lr0/a;

    instance-of v1, v0, Lr0/c;

    if-eqz v1, :cond_0

    check-cast v0, Lr0/c;

    iget-object v0, v0, Lr0/c;->a:Lr1/c;

    invoke-virtual {v0, p1}, Lr1/c;->k(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->w:Lr0/a;

    instance-of v1, v0, Lr0/c;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lr0/c;

    iget-object v1, v1, Lr0/c;->a:Lr1/c;

    invoke-virtual {v1, p1}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_1
    iput-object v0, p1, Lr0/d;->O:Lr0/a;

    return-void
.end method
