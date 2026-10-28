.class public Lh5/f1;
.super Lh5/h1;
.source "SourceFile"


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lh5/h1;-><init>()V

    .line 2
    invoke-static {}, Ld5/a;->b()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, Lh5/f1;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lh5/q1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lh5/h1;-><init>(Lh5/q1;)V

    .line 4
    invoke-virtual {p1}, Lh5/q1;->g()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, Landroid/support/v4/media/session/m;->c(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Ld5/a;->b()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lh5/f1;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()Lh5/q1;
    .locals 3

    invoke-virtual {p0}, Lh5/h1;->a()V

    iget-object v0, p0, Lh5/f1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lh5/q1;->h(Landroid/view/View;Landroid/view/WindowInsets;)Lh5/q1;

    move-result-object v0

    iget-object v1, p0, Lh5/h1;->b:[Lv4/b;

    iget-object v2, v0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v2, v1}, Lh5/o1;->r([Lv4/b;)V

    return-object v0
.end method

.method public d(Lv4/b;)V
    .locals 1

    iget-object v0, p0, Lh5/f1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lv4/b;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setMandatorySystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public e(Lv4/b;)V
    .locals 1

    iget-object v0, p0, Lh5/f1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lv4/b;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public f(Lv4/b;)V
    .locals 1

    iget-object v0, p0, Lh5/f1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lv4/b;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public g(Lv4/b;)V
    .locals 1

    iget-object v0, p0, Lh5/f1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lv4/b;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public h(Lv4/b;)V
    .locals 1

    iget-object v0, p0, Lh5/f1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lv4/b;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setTappableElementInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
