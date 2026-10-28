.class public abstract Landroidx/fragment/app/r0;
.super Lg/l;
.source "SourceFile"

# interfaces
.implements Landroidx/core/app/ActivityCompat$OnRequestPermissionsResultCallback;
.implements Landroidx/core/app/ActivityCompat$RequestPermissionsRequestCodeValidator;


# static fields
.field static final LIFECYCLE_TAG:Ljava/lang/String; = "android:support:lifecycle"


# instance fields
.field mCreated:Z

.field final mFragmentLifecycleRegistry:Landroidx/lifecycle/i0;

.field final mFragments:Landroidx/fragment/app/v0;

.field mResumed:Z

.field mStopped:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lg/l;-><init>()V

    new-instance v0, Landroidx/fragment/app/q0;

    invoke-direct {v0, p0}, Landroidx/fragment/app/q0;-><init>(Landroidx/fragment/app/r0;)V

    new-instance v1, Landroidx/fragment/app/v0;

    invoke-direct {v1, v0}, Landroidx/fragment/app/v0;-><init>(Landroidx/fragment/app/q0;)V

    iput-object v1, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    new-instance v0, Landroidx/lifecycle/i0;

    invoke-direct {v0, p0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/g0;)V

    iput-object v0, p0, Landroidx/fragment/app/r0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/i0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/r0;->mStopped:Z

    invoke-virtual {p0}, Lg/l;->getSavedStateRegistry()Lpb/d;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/n0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/n0;-><init>(Ljava/lang/Object;I)V

    const-string v2, "android:support:lifecycle"

    invoke-virtual {v0, v2, v1}, Lpb/d;->c(Ljava/lang/String;Lpb/c;)V

    new-instance v0, Landroidx/fragment/app/o0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/o0;-><init>(Landroidx/fragment/app/r0;I)V

    invoke-virtual {p0, v0}, Lg/l;->addOnConfigurationChangedListener(Lg5/a;)V

    new-instance v0, Landroidx/fragment/app/o0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/o0;-><init>(Landroidx/fragment/app/r0;I)V

    invoke-virtual {p0, v0}, Lg/l;->addOnNewIntentListener(Lg5/a;)V

    new-instance v0, Landroidx/fragment/app/p0;

    invoke-direct {v0, p0}, Landroidx/fragment/app/p0;-><init>(Landroidx/fragment/app/r0;)V

    invoke-virtual {p0, v0}, Lg/l;->addOnContextAvailableListener(Li/b;)V

    return-void
.end method

.method public static m(Landroidx/fragment/app/o1;)Z
    .locals 6

    sget-object v0, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    iget-object p0, p0, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/a2;

    invoke-virtual {p0}, Landroidx/fragment/app/a2;->f()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/m0;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroidx/fragment/app/m0;->getHost()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->getChildFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v3

    invoke-static {v3}, Landroidx/fragment/app/r0;->m(Landroidx/fragment/app/o1;)Z

    move-result v3

    or-int/2addr v1, v3

    :cond_2
    iget-object v3, v2, Landroidx/fragment/app/m0;->mViewLifecycleOwner:Landroidx/fragment/app/l2;

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroidx/fragment/app/l2;->b()V

    iget-object v3, v3, Landroidx/fragment/app/l2;->E:Landroidx/lifecycle/i0;

    iget-object v3, v3, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    sget-object v5, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {v3, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-ltz v3, :cond_3

    iget-object v1, v2, Landroidx/fragment/app/m0;->mViewLifecycleOwner:Landroidx/fragment/app/l2;

    iget-object v1, v1, Landroidx/fragment/app/l2;->E:Landroidx/lifecycle/i0;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/i0;->i(Landroidx/lifecycle/w;)V

    move v1, v4

    :cond_3
    iget-object v3, v2, Landroidx/fragment/app/m0;->mLifecycleRegistry:Landroidx/lifecycle/i0;

    iget-object v3, v3, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    sget-object v5, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {v3, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-ltz v3, :cond_0

    iget-object v1, v2, Landroidx/fragment/app/m0;->mLifecycleRegistry:Landroidx/lifecycle/i0;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/i0;->i(Landroidx/lifecycle/w;)V

    move v1, v4

    goto :goto_0

    :cond_4
    return v1
.end method


# virtual methods
.method public final dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object v0, v0, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    iget-object v0, v0, Landroidx/fragment/app/o1;->f:Landroidx/fragment/app/z0;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/z0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p0, p4}, Landroidx/core/app/ComponentActivity;->shouldDumpInternalState([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/r0;->mCreated:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/r0;->mResumed:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/r0;->mStopped:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {p0}, Lo8/b;->a(Landroidx/lifecycle/g0;)Lo8/f;

    move-result-object v1

    invoke-virtual {v1, v0, p2, p3, p4}, Lo8/f;->c(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object v0, v0, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/o1;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public getSupportFragmentManager()Landroidx/fragment/app/o1;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object v0, v0, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    return-object v0
.end method

.method public getSupportLoaderManager()Lo8/b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lo8/b;->a(Landroidx/lifecycle/g0;)Lo8/f;

    move-result-object v0

    return-object v0
.end method

.method public markFragmentsCreated()V
    .locals 2

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    invoke-static {v0}, Landroidx/fragment/app/r0;->m(Landroidx/fragment/app/o1;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    invoke-virtual {v0}, Landroidx/fragment/app/v0;->a()V

    invoke-super {p0, p1, p2, p3}, Lg/l;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onAttachFragment(Landroidx/fragment/app/m0;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lg/l;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/r0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/i0;

    sget-object v0, Landroidx/lifecycle/v;->ON_CREATE:Landroidx/lifecycle/v;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    iget-object p1, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object p1, p1, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object p1, p1, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/o1;->J:Z

    iput-boolean v0, p1, Landroidx/fragment/app/o1;->K:Z

    iget-object v1, p1, Landroidx/fragment/app/o1;->Q:Landroidx/fragment/app/t1;

    iput-boolean v0, v1, Landroidx/fragment/app/t1;->F:Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/fragment/app/o1;->u(I)V

    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/r0;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/r0;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object v0, v0, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    invoke-virtual {v0}, Landroidx/fragment/app/o1;->l()V

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/i0;

    sget-object v1, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Lg/l;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object p1, p1, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object p1, p1, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/o1;->j(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/r0;->mResumed:Z

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object v0, v0, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/fragment/app/o1;->u(I)V

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/i0;

    sget-object v1, Landroidx/lifecycle/v;->ON_PAUSE:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public onPostResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->onResumeFragments()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    invoke-virtual {v0}, Landroidx/fragment/app/v0;->a()V

    invoke-super {p0, p1, p2, p3}, Lg/l;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    invoke-virtual {v0}, Landroidx/fragment/app/v0;->a()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/r0;->mResumed:Z

    iget-object v1, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object v1, v1, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object v1, v1, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/o1;->z(Z)Z

    return-void
.end method

.method public onResumeFragments()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/i0;

    sget-object v1, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object v0, v0, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/o1;->J:Z

    iput-boolean v1, v0, Landroidx/fragment/app/o1;->K:Z

    iget-object v2, v0, Landroidx/fragment/app/o1;->Q:Landroidx/fragment/app/t1;

    iput-boolean v1, v2, Landroidx/fragment/app/t1;->F:Z

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroidx/fragment/app/o1;->u(I)V

    return-void
.end method

.method public onStart()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    invoke-virtual {v0}, Landroidx/fragment/app/v0;->a()V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/r0;->mStopped:Z

    iget-boolean v1, p0, Landroidx/fragment/app/r0;->mCreated:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iput-boolean v2, p0, Landroidx/fragment/app/r0;->mCreated:Z

    iget-object v1, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object v1, v1, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object v1, v1, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    iput-boolean v0, v1, Landroidx/fragment/app/o1;->J:Z

    iput-boolean v0, v1, Landroidx/fragment/app/o1;->K:Z

    iget-object v3, v1, Landroidx/fragment/app/o1;->Q:Landroidx/fragment/app/t1;

    iput-boolean v0, v3, Landroidx/fragment/app/t1;->F:Z

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Landroidx/fragment/app/o1;->u(I)V

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object v1, v1, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object v1, v1, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    invoke-virtual {v1, v2}, Landroidx/fragment/app/o1;->z(Z)Z

    iget-object v1, p0, Landroidx/fragment/app/r0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/i0;

    sget-object v2, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    iget-object v1, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object v1, v1, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object v1, v1, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    iput-boolean v0, v1, Landroidx/fragment/app/o1;->J:Z

    iput-boolean v0, v1, Landroidx/fragment/app/o1;->K:Z

    iget-object v2, v1, Landroidx/fragment/app/o1;->Q:Landroidx/fragment/app/t1;

    iput-boolean v0, v2, Landroidx/fragment/app/t1;->F:Z

    const/4 v0, 0x5

    invoke-virtual {v1, v0}, Landroidx/fragment/app/o1;->u(I)V

    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    invoke-virtual {v0}, Landroidx/fragment/app/v0;->a()V

    return-void
.end method

.method public onStop()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/r0;->mStopped:Z

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->markFragmentsCreated()V

    iget-object v1, p0, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    iget-object v1, v1, Landroidx/fragment/app/v0;->a:Landroidx/fragment/app/q0;

    iget-object v1, v1, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    iput-boolean v0, v1, Landroidx/fragment/app/o1;->K:Z

    iget-object v2, v1, Landroidx/fragment/app/o1;->Q:Landroidx/fragment/app/t1;

    iput-boolean v0, v2, Landroidx/fragment/app/t1;->F:Z

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Landroidx/fragment/app/o1;->u(I)V

    iget-object v0, p0, Landroidx/fragment/app/r0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/i0;

    sget-object v1, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public setEnterSharedElementCallback(Landroidx/core/app/SharedElementCallback;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/app/ActivityCompat;->setEnterSharedElementCallback(Landroid/app/Activity;Landroidx/core/app/SharedElementCallback;)V

    return-void
.end method

.method public setExitSharedElementCallback(Landroidx/core/app/SharedElementCallback;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/app/ActivityCompat;->setExitSharedElementCallback(Landroid/app/Activity;Landroidx/core/app/SharedElementCallback;)V

    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/m0;Landroid/content/Intent;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/fragment/app/r0;->startActivityFromFragment(Landroidx/fragment/app/m0;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/m0;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    .line 2
    invoke-static {p0, p2, v0, p4}, Landroidx/core/app/ActivityCompat;->startActivityForResult(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p1, p2, p3, p4}, Landroidx/fragment/app/m0;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startIntentSenderFromFragment(Landroidx/fragment/app/m0;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/IntentSender$SendIntentException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    invoke-static/range {v1 .. v8}, Landroidx/core/app/ActivityCompat;->startIntentSenderForResult(Landroid/app/Activity;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void

    :cond_0
    invoke-virtual/range {p1 .. p8}, Landroidx/fragment/app/m0;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method

.method public supportFinishAfterTransition()V
    .locals 0

    invoke-static {p0}, Landroidx/core/app/ActivityCompat;->finishAfterTransition(Landroid/app/Activity;)V

    return-void
.end method

.method public supportPostponeEnterTransition()V
    .locals 0

    invoke-static {p0}, Landroidx/core/app/ActivityCompat;->postponeEnterTransition(Landroid/app/Activity;)V

    return-void
.end method

.method public supportStartPostponedEnterTransition()V
    .locals 0

    invoke-static {p0}, Landroidx/core/app/ActivityCompat;->startPostponedEnterTransition(Landroid/app/Activity;)V

    return-void
.end method

.method public final validateRequestPermissionsRequestCode(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method
