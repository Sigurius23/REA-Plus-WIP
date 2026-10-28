.class final Landroidx/compose/ui/platform/TestTagElement;
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
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/ui/platform/TestTagElement;",
        "La3/h1;",
        "Lb3/y2;",
        "",
        "tag",
        "<init>",
        "(Ljava/lang/String;)V",
        "create",
        "()Lb3/y2;",
        "node",
        "Ll83/a0;",
        "update",
        "(Lb3/y2;)V",
        "Lb3/l2;",
        "inspectableProperties",
        "(Lb3/l2;)V",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "Ljava/lang/String;",
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
.field private final tag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/TestTagElement;->tag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic create()Lb2/v;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/TestTagElement;->create()Lb3/y2;

    move-result-object v0

    return-object v0
.end method

.method public create()Lb3/y2;
    .locals 2

    .line 2
    new-instance v0, Lb3/y2;

    iget-object v1, p0, Landroidx/compose/ui/platform/TestTagElement;->tag:Ljava/lang/String;

    .line 3
    invoke-direct {v0}, Lb2/v;-><init>()V

    iput-object v1, v0, Lb3/y2;->O:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/platform/TestTagElement;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/TestTagElement;->tag:Ljava/lang/String;

    check-cast p1, Landroidx/compose/ui/platform/TestTagElement;

    iget-object p1, p1, Landroidx/compose/ui/platform/TestTagElement;->tag:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/TestTagElement;->tag:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "testTag"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "tag"

    iget-object v1, p0, Landroidx/compose/ui/platform/TestTagElement;->tag:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic update(Lb2/v;)V
    .locals 0

    .line 1
    check-cast p1, Lb3/y2;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/TestTagElement;->update(Lb3/y2;)V

    return-void
.end method

.method public update(Lb3/y2;)V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/TestTagElement;->tag:Ljava/lang/String;

    .line 3
    iput-object v0, p1, Lb3/y2;->O:Ljava/lang/String;

    return-void
.end method
