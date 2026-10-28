.class public final Landroidx/fragment/app/q0;
.super Landroidx/fragment/app/x0;
.source "SourceFile"

# interfaces
.implements Ls4/j;
.implements Ls4/k;
.implements Landroidx/core/app/OnMultiWindowModeChangedProvider;
.implements Landroidx/core/app/OnPictureInPictureModeChangedProvider;
.implements Landroidx/lifecycle/f2;
.implements Lg/b0;
.implements Lj/k;
.implements Lpb/f;
.implements Landroidx/fragment/app/u1;
.implements Lh5/k;


# instance fields
.field public final synthetic E:Landroidx/fragment/app/r0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/r0;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-direct {p0, p1}, Landroidx/fragment/app/x0;-><init>(Landroidx/fragment/app/r0;)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V
    .locals 0

    iget-object p1, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/r0;->onAttachFragment(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public final addMenuProvider(Lh5/o;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0, p1}, Lg/l;->addMenuProvider(Lh5/o;)V

    return-void
.end method

.method public final addOnConfigurationChangedListener(Lg5/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0, p1}, Lg/l;->addOnConfigurationChangedListener(Lg5/a;)V

    return-void
.end method

.method public final addOnMultiWindowModeChangedListener(Lg5/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0, p1}, Lg/l;->addOnMultiWindowModeChangedListener(Lg5/a;)V

    return-void
.end method

.method public final addOnPictureInPictureModeChangedListener(Lg5/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0, p1}, Lg/l;->addOnPictureInPictureModeChangedListener(Lg5/a;)V

    return-void
.end method

.method public final addOnTrimMemoryListener(Lg5/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0, p1}, Lg/l;->addOnTrimMemoryListener(Lg5/a;)V

    return-void
.end method

.method public final b(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getActivityResultRegistry()Lj/j;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0}, Lg/l;->getActivityResultRegistry()Lj/j;

    move-result-object v0

    return-object v0
.end method

.method public final getLifecycle()Landroidx/lifecycle/x;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    iget-object v0, v0, Landroidx/fragment/app/r0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/i0;

    return-object v0
.end method

.method public final getOnBackPressedDispatcher()Lg/z;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object v0

    return-object v0
.end method

.method public final getSavedStateRegistry()Lpb/d;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0}, Lg/l;->getSavedStateRegistry()Lpb/d;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/e2;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0}, Lg/l;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v0

    return-object v0
.end method

.method public final removeMenuProvider(Lh5/o;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0, p1}, Lg/l;->removeMenuProvider(Lh5/o;)V

    return-void
.end method

.method public final removeOnConfigurationChangedListener(Lg5/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0, p1}, Lg/l;->removeOnConfigurationChangedListener(Lg5/a;)V

    return-void
.end method

.method public final removeOnMultiWindowModeChangedListener(Lg5/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0, p1}, Lg/l;->removeOnMultiWindowModeChangedListener(Lg5/a;)V

    return-void
.end method

.method public final removeOnPictureInPictureModeChangedListener(Lg5/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0, p1}, Lg/l;->removeOnPictureInPictureModeChangedListener(Lg5/a;)V

    return-void
.end method

.method public final removeOnTrimMemoryListener(Lg5/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q0;->E:Landroidx/fragment/app/r0;

    invoke-virtual {v0, p1}, Lg/l;->removeOnTrimMemoryListener(Lg5/a;)V

    return-void
.end method
