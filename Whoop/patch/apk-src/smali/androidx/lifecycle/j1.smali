.class public Landroidx/lifecycle/j1;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/j1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/lifecycle/j1;",
        "Landroid/app/Fragment;",
        "<init>",
        "()V",
        "androidx/lifecycle/d2",
        "a",
        "androidx/lifecycle/h1",
        "lifecycle-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic x:I


# instance fields
.field public w:Landroidx/lifecycle/d2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/v;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "getActivity(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Landroidx/lifecycle/h1;->a(Landroid/app/Activity;Landroidx/lifecycle/v;)V

    :cond_0
    return-void
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    sget-object p1, Landroidx/lifecycle/v;->ON_CREATE:Landroidx/lifecycle/v;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/j1;->a(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    sget-object v0, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/j1;->a(Landroidx/lifecycle/v;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/lifecycle/j1;->w:Landroidx/lifecycle/d2;

    return-void
.end method

.method public final onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    sget-object v0, Landroidx/lifecycle/v;->ON_PAUSE:Landroidx/lifecycle/v;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/j1;->a(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    iget-object v0, p0, Landroidx/lifecycle/j1;->w:Landroidx/lifecycle/d2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/lifecycle/d2;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/ProcessLifecycleOwner;

    invoke-virtual {v0}, Landroidx/lifecycle/ProcessLifecycleOwner;->a()V

    :cond_0
    sget-object v0, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/j1;->a(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final onStart()V
    .locals 3

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, Landroidx/lifecycle/j1;->w:Landroidx/lifecycle/d2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/lifecycle/d2;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/ProcessLifecycleOwner;

    iget v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->w:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->w:I

    if-ne v1, v2, :cond_0

    iget-boolean v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->z:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    sget-object v2, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->z:Z

    :cond_0
    sget-object v0, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/j1;->a(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    sget-object v0, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/j1;->a(Landroidx/lifecycle/v;)V

    return-void
.end method
