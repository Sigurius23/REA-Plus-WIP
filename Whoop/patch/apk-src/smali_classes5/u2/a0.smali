.class public final Lu2/a0;
.super Lu2/e;
.source "SourceFile"


# virtual methods
.method public final Y0(Lu2/o;)V
    .locals 1

    sget-object v0, Lb3/v1;->u:Lp1/u2;

    invoke-static {p0, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/p;

    if-eqz v0, :cond_0

    check-cast v0, Lb3/x;

    iput-object p1, v0, Lb3/x;->a:Lu2/o;

    :cond_0
    return-void
.end method

.method public final a1(I)Z
    .locals 1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic f()Ljava/lang/Object;
    .locals 1

    const-string v0, "androidx.compose.ui.input.pointer.StylusHoverIcon"

    return-object v0
.end method
