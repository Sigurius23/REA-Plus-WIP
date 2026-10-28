.class public Lh5/l1;
.super Lh5/k1;
.source "SourceFile"


# instance fields
.field public n:Lv4/b;

.field public o:Lv4/b;

.field public p:Lv4/b;


# direct methods
.method public constructor <init>(Lh5/q1;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lh5/k1;-><init>(Lh5/q1;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lh5/l1;->n:Lv4/b;

    .line 3
    iput-object p1, p0, Lh5/l1;->o:Lv4/b;

    .line 4
    iput-object p1, p0, Lh5/l1;->p:Lv4/b;

    return-void
.end method

.method public constructor <init>(Lh5/q1;Lh5/l1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lh5/k1;-><init>(Lh5/q1;Lh5/k1;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lh5/l1;->n:Lv4/b;

    .line 7
    iput-object p1, p0, Lh5/l1;->o:Lv4/b;

    .line 8
    iput-object p1, p0, Lh5/l1;->p:Lv4/b;

    return-void
.end method


# virtual methods
.method public i()Lv4/b;
    .locals 1

    iget-object v0, p0, Lh5/l1;->o:Lv4/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lv4/b;->c(Landroid/graphics/Insets;)Lv4/b;

    move-result-object v0

    iput-object v0, p0, Lh5/l1;->o:Lv4/b;

    :cond_0
    iget-object v0, p0, Lh5/l1;->o:Lv4/b;

    return-object v0
.end method

.method public k()Lv4/b;
    .locals 1

    iget-object v0, p0, Lh5/l1;->n:Lv4/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lv4/b;->c(Landroid/graphics/Insets;)Lv4/b;

    move-result-object v0

    iput-object v0, p0, Lh5/l1;->n:Lv4/b;

    :cond_0
    iget-object v0, p0, Lh5/l1;->n:Lv4/b;

    return-object v0
.end method

.method public m()Lv4/b;
    .locals 1

    iget-object v0, p0, Lh5/l1;->p:Lv4/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lv4/b;->c(Landroid/graphics/Insets;)Lv4/b;

    move-result-object v0

    iput-object v0, p0, Lh5/l1;->p:Lv4/b;

    :cond_0
    iget-object v0, p0, Lh5/l1;->p:Lv4/b;

    return-object v0
.end method

.method public n(IIII)Lh5/q1;
    .locals 1

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Lh5/q1;->h(Landroid/view/View;Landroid/view/WindowInsets;)Lh5/q1;

    move-result-object p1

    return-object p1
.end method

.method public u(Lv4/b;)V
    .locals 0

    return-void
.end method
