.class public Lh5/j1;
.super Lh5/i1;
.source "SourceFile"


# instance fields
.field public m:Lv4/b;


# direct methods
.method public constructor <init>(Lh5/q1;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lh5/i1;-><init>(Lh5/q1;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lh5/j1;->m:Lv4/b;

    return-void
.end method

.method public constructor <init>(Lh5/q1;Lh5/j1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lh5/i1;-><init>(Lh5/q1;Lh5/i1;)V

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lh5/j1;->m:Lv4/b;

    .line 5
    iget-object p1, p2, Lh5/j1;->m:Lv4/b;

    iput-object p1, p0, Lh5/j1;->m:Lv4/b;

    return-void
.end method


# virtual methods
.method public b()Lh5/q1;
    .locals 2

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lh5/q1;->h(Landroid/view/View;Landroid/view/WindowInsets;)Lh5/q1;

    move-result-object v0

    return-object v0
.end method

.method public c()Lh5/q1;
    .locals 2

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lh5/q1;->h(Landroid/view/View;Landroid/view/WindowInsets;)Lh5/q1;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lv4/b;
    .locals 4

    iget-object v0, p0, Lh5/j1;->m:Lv4/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v0

    invoke-static {v1, v2, v3, v0}, Lv4/b;->b(IIII)Lv4/b;

    move-result-object v0

    iput-object v0, p0, Lh5/j1;->m:Lv4/b;

    :cond_0
    iget-object v0, p0, Lh5/j1;->m:Lv4/b;

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public u(Lv4/b;)V
    .locals 0

    iput-object p1, p0, Lh5/j1;->m:Lv4/b;

    return-void
.end method
