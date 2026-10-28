.class public abstract Lto/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final w:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lto/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/h;->w:Ljava/lang/Object;

    return-void
.end method

.method public static b(Landroid/app/Activity;)Lto/i;
    .locals 6

    const-string v0, "Activity must not be null"

    invoke-static {p0, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Landroidx/fragment/app/r0;

    if-eqz v0, :cond_3

    check-cast p0, Landroidx/fragment/app/r0;

    sget-object v0, Lto/u0;->x:Ljava/util/WeakHashMap;

    const-string v0, "SLifecycleFragmentImpl"

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    sget-object v2, Lto/u0;->x:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lto/u0;

    if-eqz v3, :cond_0

    return-object v3

    :cond_0
    :try_start_0
    invoke-virtual {v1, v0}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v3

    check-cast v3, Lto/u0;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroidx/fragment/app/m0;->isRemoving()Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    new-instance v3, Lto/u0;

    invoke-direct {v3}, Lto/u0;-><init>()V

    new-instance v4, Landroidx/fragment/app/a;

    invoke-direct {v4, v1}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    const/4 v1, 0x0

    const/4 v5, 0x1

    invoke-virtual {v4, v1, v3, v0, v5}, Landroidx/fragment/app/a;->d(ILandroidx/fragment/app/m0;Ljava/lang/String;I)V

    invoke-virtual {v4, v5, v5}, Landroidx/fragment/app/a;->k(ZZ)I

    :cond_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    const-string v0, "LifecycleFragmentImpl"

    sget-object v1, Lto/t0;->x:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lto/t0;

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    return-object v2

    :cond_5
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v2

    check-cast v2, Lto/t0;
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Landroid/app/Fragment;->isRemoving()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    new-instance v2, Lto/t0;

    invoke-direct {v2}, Lto/t0;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v3

    invoke-virtual {v3, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    :cond_7
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :catch_1
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final a()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lto/h;->w:Ljava/lang/Object;

    invoke-interface {v0}, Lto/i;->k()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Luo/w;->f(Ljava/lang/Object;)V

    return-object v0
.end method

.method public c(IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public abstract i()V
.end method
