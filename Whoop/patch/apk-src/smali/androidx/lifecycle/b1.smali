.class public final Landroidx/lifecycle/b1;
.super Landroidx/lifecycle/o;
.source "SourceFile"


# instance fields
.field final synthetic this$0:Landroidx/lifecycle/ProcessLifecycleOwner;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/ProcessLifecycleOwner;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/b1;->this$0:Landroidx/lifecycle/ProcessLifecycleOwner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string p2, "activity"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-ge p2, v0, :cond_0

    sget p2, Landroidx/lifecycle/j1;->x:I

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const-string p2, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {p1, p2}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/lifecycle/j1;

    iget-object p2, p0, Landroidx/lifecycle/b1;->this$0:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object p2, p2, Landroidx/lifecycle/ProcessLifecycleOwner;->H:Landroidx/lifecycle/d2;

    iput-object p2, p1, Landroidx/lifecycle/j1;->w:Landroidx/lifecycle/d2;

    :cond_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/b1;->this$0:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->x:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->x:I

    if-nez v0, :cond_0

    iget-object v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->E:Landroid/os/Handler;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->G:Landroidx/lifecycle/z0;

    const-wide/16 v1, 0x2bc

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string p2, "activity"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Landroidx/lifecycle/b1$a;

    iget-object v0, p0, Landroidx/lifecycle/b1;->this$0:Landroidx/lifecycle/ProcessLifecycleOwner;

    invoke-direct {p2, v0}, Landroidx/lifecycle/b1$a;-><init>(Landroidx/lifecycle/ProcessLifecycleOwner;)V

    invoke-static {p1, p2}, Landroidx/lifecycle/a1;->a(Landroid/app/Activity;Landroidx/lifecycle/b1$a;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/b1;->this$0:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->w:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->w:I

    if-nez v0, :cond_0

    iget-boolean v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    sget-object v1, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->z:Z

    :cond_0
    return-void
.end method
