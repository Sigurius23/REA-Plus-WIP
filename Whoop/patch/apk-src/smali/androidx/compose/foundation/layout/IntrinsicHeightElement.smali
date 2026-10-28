.class final Landroidx/compose/foundation/layout/IntrinsicHeightElement;
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
        "Landroidx/compose/foundation/layout/IntrinsicHeightElement;",
        "La3/h1;",
        "Ll0/z0;",
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
.field public final w:Ll0/a1;


# direct methods
.method public constructor <init>(Ll0/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/IntrinsicHeightElement;->w:Ll0/a1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ll0/z0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc0/k1;-><init>(I)V

    iget-object v1, p0, Landroidx/compose/foundation/layout/IntrinsicHeightElement;->w:Ll0/a1;

    iput-object v1, v0, Ll0/z0;->P:Ll0/a1;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll0/z0;->Q:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/layout/IntrinsicHeightElement;

    if-eqz v1, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/IntrinsicHeightElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/layout/IntrinsicHeightElement;->w:Ll0/a1;

    iget-object p1, p1, Landroidx/compose/foundation/layout/IntrinsicHeightElement;->w:Ll0/a1;

    if-ne v1, p1, :cond_3

    return v0

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/layout/IntrinsicHeightElement;->w:Ll0/a1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x1

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

    check-cast p1, Ll0/z0;

    iget-object v0, p0, Landroidx/compose/foundation/layout/IntrinsicHeightElement;->w:Ll0/a1;

    iput-object v0, p1, Ll0/z0;->P:Ll0/a1;

    const/4 v0, 0x1

    iput-boolean v0, p1, Ll0/z0;->Q:Z

    return-void
.end method
