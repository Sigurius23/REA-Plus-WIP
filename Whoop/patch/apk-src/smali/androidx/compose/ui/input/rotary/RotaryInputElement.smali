.class final Landroidx/compose/ui/input/rotary/RotaryInputElement;
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
        "Landroidx/compose/ui/input/rotary/RotaryInputElement;",
        "La3/h1;",
        "Lw2/a;",
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


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Lw2/a;

    sget-object v1, Lb3/r;->y:Lb3/r;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iput-object v1, v0, Lw2/a;->O:Lb3/r;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Landroidx/compose/ui/input/rotary/RotaryInputElement;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    sget-object v0, Lb3/r;->y:Lb3/r;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    sget-object v0, Lb3/r;->y:Lb3/r;

    const-string v1, "onRotaryScrollEvent"

    invoke-virtual {p1, v1}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Lw2/a;

    sget-object v0, Lb3/r;->y:Lb3/r;

    iput-object v0, p1, Lw2/a;->O:Lb3/r;

    return-void
.end method
