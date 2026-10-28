.class public final Ld5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# instance fields
.field public final synthetic w:Lcom/whoop/ui/home/redesign/view/MainActivity;


# direct methods
.method public constructor <init>(Ld5/c;Lcom/whoop/ui/home/redesign/view/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ld5/b;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    return-void
.end method


# virtual methods
.method public final onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 3

    invoke-static {p2}, Lcom/mapbox/maps/l;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p2}, Lcom/mapbox/maps/l;->f(Ljava/lang/Object;)Landroid/window/SplashScreenView;

    move-result-object p1

    invoke-static {}, Ld5/a;->b()Landroid/view/WindowInsets$Builder;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object p2

    const-string v0, "Builder().build()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/Rect;

    const/high16 v1, -0x80000000

    const v2, 0x7fffffff

    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p1}, Landroid/window/SplashScreenView;->getRootView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->computeSystemWindowInsets(Landroid/view/WindowInsets;Landroid/graphics/Rect;)Landroid/view/WindowInsets;

    move-result-object p1

    if-ne p2, p1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result p1

    :cond_0
    iget-object p1, p0, Ld5/b;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    :cond_1
    return-void
.end method

.method public final onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    return-void
.end method
