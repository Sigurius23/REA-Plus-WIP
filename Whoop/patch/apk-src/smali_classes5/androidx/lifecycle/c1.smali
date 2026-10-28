.class public final Landroidx/lifecycle/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Landroidx/viewpager2/adapter/b;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/lifecycle/c1;->w:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/c1;->x:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/c1;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/f0;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/c1;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/lifecycle/c1;->x:Ljava/lang/Object;

    .line 3
    sget-object v0, Landroidx/lifecycle/f;->c:Landroidx/lifecycle/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 4
    iget-object v1, v0, Landroidx/lifecycle/f;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/d;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/f;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Landroidx/lifecycle/d;

    move-result-object v1

    .line 6
    :goto_0
    iput-object v1, p0, Landroidx/lifecycle/c1;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/viewpager2/adapter/i;Landroidx/viewpager2/adapter/j;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/lifecycle/c1;->w:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/c1;->y:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/c1;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 3

    iget v0, p0, Landroidx/lifecycle/c1;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Landroidx/lifecycle/c1;->x:Ljava/lang/Object;

    check-cast p2, Landroid/os/Handler;

    iget-object v0, p0, Landroidx/lifecycle/c1;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/viewpager2/adapter/b;

    invoke-virtual {p2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object p2, p0, Landroidx/lifecycle/c1;->x:Ljava/lang/Object;

    check-cast p2, Landroidx/viewpager2/adapter/j;

    iget-object v0, p0, Landroidx/lifecycle/c1;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/viewpager2/adapter/i;

    invoke-virtual {v0}, Landroidx/viewpager2/adapter/i;->shouldDelayFragmentTransactions()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    iget-object p1, p2, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    check-cast p1, Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p2}, Landroidx/viewpager2/adapter/i;->placeFragmentInViewHolder(Landroidx/viewpager2/adapter/j;)V

    :cond_2
    :goto_0
    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/lifecycle/c1;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/d;

    iget-object v0, v0, Landroidx/lifecycle/d;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Landroidx/lifecycle/c1;->x:Ljava/lang/Object;

    invoke-static {v1, p1, p2, v2}, Landroidx/lifecycle/d;->a(Ljava/util/List;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;Ljava/lang/Object;)V

    sget-object v1, Landroidx/lifecycle/v;->ON_ANY:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0, p1, p2, v2}, Landroidx/lifecycle/d;->a(Ljava/util/List;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
