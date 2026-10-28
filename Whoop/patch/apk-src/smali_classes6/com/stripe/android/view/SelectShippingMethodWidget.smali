.class public final Lcom/stripe/android/view/SelectShippingMethodWidget;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\n\u0008\u0001\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/view/SelectShippingMethodWidget;",
        "Landroid/widget/FrameLayout;",
        "Lkotlin/Function1;",
        "Ly00/j6;",
        "Ll83/a0;",
        "callback",
        "setShippingMethodSelectedCallback",
        "(Lkotlin/jvm/functions/Function1;)V",
        "",
        "shippingMethods",
        "setShippingMethods",
        "(Ljava/util/List;)V",
        "shippingMethod",
        "setSelectedShippingMethod",
        "(Ly00/j6;)V",
        "getSelectedShippingMethod",
        "()Ly00/j6;",
        "selectedShippingMethod",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final w:Ls40/z0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Ls40/z0;

    invoke-direct {p2}, Landroidx/recyclerview/widget/i1;-><init>()V

    new-instance v0, Ls32/d;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ls32/d;-><init>(I)V

    iput-object v0, p2, Ls40/z0;->a:Lkotlin/jvm/functions/Function1;

    sget-object v0, Lm83/y;->w:Lm83/y;

    iput-object v0, p2, Ls40/z0;->b:Ljava/util/List;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/i1;->setHasStableIds(Z)V

    iput-object p2, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->w:Ls40/z0;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v1, 0x7f0d0663

    invoke-virtual {p1, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const p1, 0x7f0a0b58

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/u1;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/NullPointerException;

    const-string v0, "Missing required view with ID: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final getSelectedShippingMethod()Ly00/j6;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->w:Ls40/z0;

    iget-object v1, v0, Ls40/z0;->b:Ljava/util/List;

    iget v0, v0, Ls40/z0;->c:I

    invoke-static {v0, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/j6;

    return-object v0
.end method

.method public final setSelectedShippingMethod(Ly00/j6;)V
    .locals 2

    const-string v0, "shippingMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->w:Ls40/z0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Ls40/z0;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {v0, p1}, Ls40/z0;->a(I)V

    return-void
.end method

.method public final setShippingMethodSelectedCallback(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->w:Ls40/z0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Ls40/z0;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setShippingMethods(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly00/j6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "shippingMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->w:Ls40/z0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ls40/z0;->a(I)V

    iput-object p1, v0, Ls40/z0;->b:Ljava/util/List;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void
.end method
