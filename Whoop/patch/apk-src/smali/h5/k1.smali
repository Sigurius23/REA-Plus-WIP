.class public Lh5/k1;
.super Lh5/j1;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lh5/q1;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lh5/j1;-><init>(Lh5/q1;Landroid/view/WindowInsets;)V

    return-void
.end method

.method public constructor <init>(Lh5/q1;Lh5/k1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lh5/j1;-><init>(Lh5/q1;Lh5/j1;)V

    return-void
.end method


# virtual methods
.method public a()Lh5/q1;
    .locals 2

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeDisplayCutout()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lh5/q1;->h(Landroid/view/View;Landroid/view/WindowInsets;)Lh5/q1;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh5/k1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh5/k1;

    iget-object v1, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    iget-object v3, p1, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lh5/i1;->g:Lv4/b;

    iget-object p1, p1, Lh5/i1;->g:Lv4/b;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public f()Lh5/h;
    .locals 2

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Lh5/h;

    invoke-direct {v1, v0}, Lh5/h;-><init>(Landroid/view/DisplayCutout;)V

    return-object v1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->hashCode()I

    move-result v0

    return v0
.end method
