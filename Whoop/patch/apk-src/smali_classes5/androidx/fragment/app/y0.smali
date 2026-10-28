.class public final Landroidx/fragment/app/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic w:Landroidx/fragment/app/z1;

.field public final synthetic x:Landroidx/fragment/app/z0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/z0;Landroidx/fragment/app/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/y0;->x:Landroidx/fragment/app/z0;

    iput-object p2, p0, Landroidx/fragment/app/y0;->w:Landroidx/fragment/app/z1;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/y0;->w:Landroidx/fragment/app/z1;

    iget-object v0, p1, Landroidx/fragment/app/z1;->c:Landroidx/fragment/app/m0;

    invoke-virtual {p1}, Landroidx/fragment/app/z1;->k()V

    iget-object p1, v0, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/fragment/app/y0;->x:Landroidx/fragment/app/z0;

    iget-object v0, v0, Landroidx/fragment/app/z0;->w:Landroidx/fragment/app/o1;

    invoke-static {p1, v0}, Landroidx/fragment/app/s;->j(Landroid/view/ViewGroup;Landroidx/fragment/app/o1;)Landroidx/fragment/app/s;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/s;->i()V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
