.class public abstract Lh/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    sput-object v0, Lh/f;->a:Landroid/view/ViewGroup$LayoutParams;

    return-void
.end method

.method public static a(Lg/l;Lx1/b;)V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Landroidx/compose/ui/platform/ComposeView;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/compose/ui/platform/ComposeView;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, v2}, Lb3/a;->setParentCompositionContext(Lp1/t;)V

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lc93/m;)V

    return-void

    :cond_1
    new-instance v0, Landroidx/compose/ui/platform/ComposeView;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v2, v1}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {v0, v2}, Lb3/a;->setParentCompositionContext(Lp1/t;)V

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lc93/m;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-static {p1, p0}, Landroidx/lifecycle/o1;->n(Landroid/view/View;Landroidx/lifecycle/g0;)V

    :cond_2
    invoke-static {p1}, Landroidx/lifecycle/o1;->h(Landroid/view/View;)Landroidx/lifecycle/f2;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-static {p1, p0}, Landroidx/lifecycle/o1;->o(Landroid/view/View;Landroidx/lifecycle/f2;)V

    :cond_3
    invoke-static {p1}, Lts/o;->t(Landroid/view/View;)Lpb/f;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-static {p1, p0}, Lts/o;->G(Landroid/view/View;Lpb/f;)V

    :cond_4
    sget-object p1, Lh/f;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v0, p1}, Lg/l;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
