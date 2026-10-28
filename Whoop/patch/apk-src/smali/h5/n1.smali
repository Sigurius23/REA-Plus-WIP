.class public final Lh5/n1;
.super Lh5/l1;
.source "SourceFile"


# static fields
.field public static final q:Lh5/q1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lh5/q1;->h(Landroid/view/View;Landroid/view/WindowInsets;)Lh5/q1;

    move-result-object v0

    sput-object v0, Lh5/n1;->q:Lh5/q1;

    return-void
.end method

.method public constructor <init>(Lh5/q1;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lh5/l1;-><init>(Lh5/q1;Landroid/view/WindowInsets;)V

    return-void
.end method

.method public constructor <init>(Lh5/q1;Lh5/n1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lh5/l1;-><init>(Lh5/q1;Lh5/l1;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public g(I)Lv4/b;
    .locals 1

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, Lh5/p1;->a(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lv4/b;->c(Landroid/graphics/Insets;)Lv4/b;

    move-result-object p1

    return-object p1
.end method

.method public h(I)Lv4/b;
    .locals 1

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, Lh5/p1;->a(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->getInsetsIgnoringVisibility(I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lv4/b;->c(Landroid/graphics/Insets;)Lv4/b;

    move-result-object p1

    return-object p1
.end method

.method public q(I)Z
    .locals 1

    iget-object v0, p0, Lh5/i1;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, Lh5/p1;->a(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->isVisible(I)Z

    move-result p1

    return p1
.end method
