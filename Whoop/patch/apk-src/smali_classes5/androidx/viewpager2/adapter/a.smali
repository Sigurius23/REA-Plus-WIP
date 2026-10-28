.class public final Landroidx/viewpager2/adapter/a;
.super Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroidx/fragment/app/m0;

.field public final synthetic b:Landroid/widget/FrameLayout;

.field public final synthetic c:Landroidx/viewpager2/adapter/i;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/adapter/i;Landroidx/fragment/app/m0;Landroid/widget/FrameLayout;)V
    .locals 0

    iput-object p1, p0, Landroidx/viewpager2/adapter/a;->c:Landroidx/viewpager2/adapter/i;

    iput-object p2, p0, Landroidx/viewpager2/adapter/a;->a:Landroidx/fragment/app/m0;

    iput-object p3, p0, Landroidx/viewpager2/adapter/a;->b:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/adapter/a;->a:Landroidx/fragment/app/m0;

    if-ne p2, v0, :cond_0

    invoke-virtual {p1, p0}, Landroidx/fragment/app/o1;->m0(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;)V

    iget-object p1, p0, Landroidx/viewpager2/adapter/a;->c:Landroidx/viewpager2/adapter/i;

    iget-object p2, p0, Landroidx/viewpager2/adapter/a;->b:Landroid/widget/FrameLayout;

    invoke-virtual {p1, p3, p2}, Landroidx/viewpager2/adapter/i;->addViewToContainer(Landroid/view/View;Landroid/widget/FrameLayout;)V

    :cond_0
    return-void
.end method
