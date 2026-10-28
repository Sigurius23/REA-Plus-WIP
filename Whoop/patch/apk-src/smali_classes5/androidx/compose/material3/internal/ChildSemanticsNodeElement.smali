.class public final Landroidx/compose/material3/internal/ChildSemanticsNodeElement;
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
        "Landroidx/compose/material3/internal/ChildSemanticsNodeElement;",
        "La3/h1;",
        "Lm1/s;",
        "material3"
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
.field public final w:Lkx1/b;


# direct methods
.method public constructor <init>(Lkx1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/material3/internal/ChildSemanticsNodeElement;->w:Lkx1/b;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Lm1/s;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/material3/internal/ChildSemanticsNodeElement;->w:Lkx1/b;

    iput-object v1, v0, Lm1/s;->O:Lkx1/b;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Landroidx/compose/material3/internal/ChildSemanticsNodeElement;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Landroidx/compose/material3/internal/ChildSemanticsNodeElement;

    iget-object p1, p1, Landroidx/compose/material3/internal/ChildSemanticsNodeElement;->w:Lkx1/b;

    iget-object v0, p0, Landroidx/compose/material3/internal/ChildSemanticsNodeElement;->w:Lkx1/b;

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/material3/internal/ChildSemanticsNodeElement;->w:Lkx1/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "childSemantics"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    const-string v0, "properties"

    iget-object v1, p0, Landroidx/compose/material3/internal/ChildSemanticsNodeElement;->w:Lkx1/b;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Lm1/s;

    iget-object v0, p0, Landroidx/compose/material3/internal/ChildSemanticsNodeElement;->w:Lkx1/b;

    iput-object v0, p1, Lm1/s;->O:Lkx1/b;

    invoke-static {p1}, La3/g;->j(La3/j2;)V

    return-void
.end method
