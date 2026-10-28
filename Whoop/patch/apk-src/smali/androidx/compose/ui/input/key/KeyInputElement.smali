.class final Landroidx/compose/ui/input/key/KeyInputElement;
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
        "Landroidx/compose/ui/input/key/KeyInputElement;",
        "La3/h1;",
        "Ls2/g;",
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
.field public final w:Lkotlin/jvm/functions/Function1;

.field public final x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Landroidx/compose/ui/input/key/KeyInputElement;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ls2/g;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->w:Lkotlin/jvm/functions/Function1;

    iput-object v1, v0, Ls2/g;->O:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->x:Lkotlin/jvm/functions/Function1;

    iput-object v1, v0, Ls2/g;->P:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/input/key/KeyInputElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/input/key/KeyInputElement;

    iget-object v1, p1, Landroidx/compose/ui/input/key/KeyInputElement;->w:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Landroidx/compose/ui/input/key/KeyInputElement;->w:Lkotlin/jvm/functions/Function1;

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->x:Lkotlin/jvm/functions/Function1;

    iget-object p1, p1, Landroidx/compose/ui/input/key/KeyInputElement;->x:Lkotlin/jvm/functions/Function1;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->w:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Landroidx/compose/ui/input/key/KeyInputElement;->x:Lkotlin/jvm/functions/Function1;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/input/key/KeyInputElement;->w:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    const-string v1, "onKeyEvent"

    invoke-virtual {p1, v1}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/input/key/KeyInputElement;->x:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_1

    const-string v1, "onPreviewKeyEvent"

    invoke-virtual {p1, v1}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Ls2/g;

    iget-object v0, p0, Landroidx/compose/ui/input/key/KeyInputElement;->w:Lkotlin/jvm/functions/Function1;

    iput-object v0, p1, Ls2/g;->O:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Landroidx/compose/ui/input/key/KeyInputElement;->x:Lkotlin/jvm/functions/Function1;

    iput-object v0, p1, Ls2/g;->P:Lkotlin/jvm/functions/Function1;

    return-void
.end method
