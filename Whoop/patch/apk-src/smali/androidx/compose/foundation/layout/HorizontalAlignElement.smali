.class public final Landroidx/compose/foundation/layout/HorizontalAlignElement;
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
        "Landroidx/compose/foundation/layout/HorizontalAlignElement;",
        "La3/h1;",
        "Ll0/u0;",
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
.field public final w:Lb2/f;


# direct methods
.method public constructor <init>(Lb2/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/HorizontalAlignElement;->w:Lb2/f;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ll0/u0;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/layout/HorizontalAlignElement;->w:Lb2/f;

    iput-object v1, v0, Ll0/u0;->O:Lb2/f;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/layout/HorizontalAlignElement;->w:Lb2/f;

    iget-object p1, p1, Landroidx/compose/foundation/layout/HorizontalAlignElement;->w:Lb2/f;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/HorizontalAlignElement;->w:Lb2/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 1

    const-string v0, "align"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/foundation/layout/HorizontalAlignElement;->w:Lb2/f;

    invoke-virtual {p1, v0}, Lb3/l2;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Ll0/u0;

    iget-object v0, p0, Landroidx/compose/foundation/layout/HorizontalAlignElement;->w:Lb2/f;

    iput-object v0, p1, Ll0/u0;->O:Lb2/f;

    return-void
.end method
