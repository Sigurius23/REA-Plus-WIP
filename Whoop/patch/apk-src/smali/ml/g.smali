.class public final Lml/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final H:Ljc/b;


# instance fields
.field public final E:Ljc/b;

.field public final F:La0/g;

.field public final G:La0/g;

.field public volatile w:Lcom/bumptech/glide/h;

.field public final x:Ljava/util/HashMap;

.field public final y:Ljava/util/HashMap;

.field public final z:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljc/b;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ljc/b;-><init>(I)V

    sput-object v0, Lml/g;->H:Ljc/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lml/g;->x:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lml/g;->y:Ljava/util/HashMap;

    new-instance v0, La0/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    iput-object v0, p0, Lml/g;->F:La0/g;

    new-instance v0, La0/g;

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    iput-object v0, p0, Lml/g;->G:La0/g;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v0, Lml/g;->H:Ljc/b;

    iput-object v0, p0, Lml/g;->E:Ljc/b;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lml/g;->z:Landroid/os/Handler;

    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lml/g;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Landroid/app/FragmentManager;La0/g;)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Fragment;

    invoke-virtual {v0}, Landroid/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/app/Fragment;->getChildFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-static {v0, p1}, Lml/g;->b(Landroid/app/FragmentManager;La0/g;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static c(Ljava/util/List;Ljava/util/Map;)V
    .locals 2

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/m0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getView()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getView()Landroid/view/View;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getChildFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/a2;

    invoke-virtual {v0}, Landroidx/fragment/app/a2;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0, p1}, Lml/g;->c(Ljava/util/List;Ljava/util/Map;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public static k(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p0}, Lml/g;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final d(Landroid/app/Activity;Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lcom/bumptech/glide/h;
    .locals 2

    invoke-virtual {p0, p2, p3, p4}, Lml/g;->i(Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lml/f;

    move-result-object p2

    invoke-virtual {p2}, Lml/f;->b()Lcom/bumptech/glide/h;

    move-result-object p3

    if-nez p3, :cond_0

    invoke-static {p1}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object p3

    invoke-virtual {p2}, Lml/f;->a()Lb5/d;

    move-result-object p4

    invoke-virtual {p2}, Lml/f;->c()Lla/b;

    move-result-object v0

    iget-object v1, p0, Lml/g;->E:Ljc/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/bumptech/glide/h;

    invoke-direct {v1, p3, p4, v0, p1}, Lcom/bumptech/glide/h;-><init>(Lcom/bumptech/glide/b;Lml/c;Lml/h;Landroid/content/Context;)V

    invoke-virtual {p2, v1}, Lml/f;->f(Lcom/bumptech/glide/h;)V

    return-object v1

    :cond_0
    return-object p3
.end method

.method public final e(Landroid/app/Activity;)Lcom/bumptech/glide/h;
    .locals 3

    invoke-static {}, Ltl/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lml/g;->f(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1}, Lml/g;->k(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {p0, p1, v0, v1, v2}, Lml/g;->d(Landroid/app/Activity;Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load for a destroyed activity"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Landroid/content/Context;)Lcom/bumptech/glide/h;
    .locals 5

    if-eqz p1, :cond_5

    sget-object v0, Ltl/l;->a:[C

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    instance-of v0, p1, Landroid/app/Application;

    if-nez v0, :cond_2

    instance-of v0, p1, Landroidx/fragment/app/r0;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/fragment/app/r0;

    invoke-virtual {p0, p1}, Lml/g;->h(Landroidx/fragment/app/r0;)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lml/g;->e(Landroid/app/Activity;)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lml/g;->f(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, p0, Lml/g;->w:Lcom/bumptech/glide/h;

    if-nez v0, :cond_4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lml/g;->w:Lcom/bumptech/glide/h;

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v0

    iget-object v1, p0, Lml/g;->E:Ljc/b;

    new-instance v2, Lg73/a;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Lg73/a;-><init>(I)V

    new-instance v4, Lg73/d;

    invoke-direct {v4, v3}, Lg73/d;-><init>(I)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/bumptech/glide/h;

    invoke-direct {v1, v0, v2, v4, p1}, Lcom/bumptech/glide/h;-><init>(Lcom/bumptech/glide/b;Lml/c;Lml/h;Landroid/content/Context;)V

    iput-object v1, p0, Lml/g;->w:Lcom/bumptech/glide/h;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_4
    :goto_2
    iget-object p1, p0, Lml/g;->w:Lcom/bumptech/glide/h;

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load on a null Context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Landroidx/fragment/app/m0;)Lcom/bumptech/glide/h;
    .locals 3

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "You cannot start a load on a fragment before it is attached or after it is destroyed"

    invoke-static {v0, v1}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ltl/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lml/g;->f(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getChildFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->isVisible()Z

    move-result v2

    invoke-virtual {p0, v1, v0, p1, v2}, Lml/g;->l(Landroid/content/Context;Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Z)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1
.end method

.method public final h(Landroidx/fragment/app/r0;)Lcom/bumptech/glide/h;
    .locals 3

    invoke-static {}, Ltl/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lml/g;->f(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1}, Lml/g;->k(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {p0, p1, v0, v1, v2}, Lml/g;->l(Landroid/content/Context;Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Z)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load for a destroyed activity"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 5

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 p1, 0x0

    const/4 v1, 0x0

    move-object v0, p1

    goto :goto_1

    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/o1;

    iget-object v0, p0, Lml/g;->y:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    move-object v4, v0

    move-object v0, p1

    move-object p1, v4

    goto :goto_1

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/app/FragmentManager;

    iget-object v0, p0, Lml/g;->x:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_2

    if-nez p1, :cond_2

    const/4 p1, 0x5

    const-string v2, "RMRetriever"

    invoke-static {v2, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v3, "Failed to remove expected request manager fragment, manager: "

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return v1
.end method

.method public final i(Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lml/f;
    .locals 3

    const-string v0, "com.bumptech.glide.manager"

    invoke-virtual {p1, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    check-cast v1, Lml/f;

    if-nez v1, :cond_2

    iget-object v1, p0, Lml/g;->x:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lml/f;

    if-nez v2, :cond_1

    new-instance v2, Lml/f;

    invoke-direct {v2}, Lml/f;-><init>()V

    invoke-virtual {v2, p2}, Lml/f;->e(Landroid/app/Fragment;)V

    if-eqz p3, :cond_0

    invoke-virtual {v2}, Lml/f;->a()Lb5/d;

    move-result-object p2

    invoke-virtual {p2}, Lb5/d;->b()V

    :cond_0
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p2

    invoke-virtual {p2, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object p2, p0, Lml/g;->z:Landroid/os/Handler;

    const/4 p3, 0x1

    invoke-virtual {p2, p3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_1
    return-object v2

    :cond_2
    return-object v1
.end method

.method public final j(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Z)Lml/i;
    .locals 3

    const-string v0, "com.bumptech.glide.manager"

    invoke-virtual {p1, v0}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v1

    check-cast v1, Lml/i;

    if-nez v1, :cond_2

    iget-object v1, p0, Lml/g;->y:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lml/i;

    if-nez v2, :cond_1

    new-instance v2, Lml/i;

    invoke-direct {v2}, Lml/i;-><init>()V

    invoke-virtual {v2, p2}, Lml/i;->C(Landroidx/fragment/app/m0;)V

    if-eqz p3, :cond_0

    invoke-virtual {v2}, Lml/i;->y()Lb5/d;

    move-result-object p2

    invoke-virtual {p2}, Lb5/d;->b()V

    :cond_0
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Landroidx/fragment/app/a;

    invoke-direct {p2, p1}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    const/4 p3, 0x0

    const/4 v1, 0x1

    invoke-virtual {p2, p3, v2, v0, v1}, Landroidx/fragment/app/a;->d(ILandroidx/fragment/app/m0;Ljava/lang/String;I)V

    invoke-virtual {p2, v1, v1}, Landroidx/fragment/app/a;->k(ZZ)I

    iget-object p2, p0, Lml/g;->z:Landroid/os/Handler;

    const/4 p3, 0x2

    invoke-virtual {p2, p3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_1
    return-object v2

    :cond_2
    return-object v1
.end method

.method public final l(Landroid/content/Context;Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Z)Lcom/bumptech/glide/h;
    .locals 2

    invoke-virtual {p0, p2, p3, p4}, Lml/g;->j(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Z)Lml/i;

    move-result-object p2

    invoke-virtual {p2}, Lml/i;->z()Lcom/bumptech/glide/h;

    move-result-object p3

    if-nez p3, :cond_0

    invoke-static {p1}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object p3

    invoke-virtual {p2}, Lml/i;->y()Lb5/d;

    move-result-object p4

    invoke-virtual {p2}, Lml/i;->A()Lla/b;

    move-result-object v0

    iget-object v1, p0, Lml/g;->E:Ljc/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/bumptech/glide/h;

    invoke-direct {v1, p3, p4, v0, p1}, Lcom/bumptech/glide/h;-><init>(Lcom/bumptech/glide/b;Lml/c;Lml/h;Landroid/content/Context;)V

    invoke-virtual {p2, v1}, Lml/i;->D(Lcom/bumptech/glide/h;)V

    return-object v1

    :cond_0
    return-object p3
.end method
