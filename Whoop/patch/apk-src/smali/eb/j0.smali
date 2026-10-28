.class public final Leb/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/content/Intent;

.field public c:Leb/r0;

.field public final d:Ljava/util/ArrayList;

.field public e:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/j0;->a:Landroid/content/Context;

    .line 2
    sget-object v0, Leb/c;->z:Leb/c;

    invoke-static {p1, v0}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object v0

    .line 3
    sget-object v1, Leb/c;->E:Leb/c;

    invoke-static {v0, v1}, Lxb3/k;->B(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lxb3/k;->s(Lxb3/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 5
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_1

    .line 7
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    :cond_1
    :goto_0
    const p1, 0x10008000

    .line 8
    invoke-virtual {v1, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iput-object v1, p0, Leb/j0;->b:Landroid/content/Intent;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Leb/j0;->d:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Leb/a0;)V
    .locals 1

    .line 10
    iget-object v0, p1, Leb/a0;->a:Landroid/content/Context;

    .line 11
    invoke-direct {p0, v0}, Leb/j0;-><init>(Landroid/content/Context;)V

    .line 12
    invoke-virtual {p1}, Leb/a0;->k()Leb/r0;

    move-result-object p1

    iput-object p1, p0, Leb/j0;->c:Leb/r0;

    return-void
.end method

.method public static f(Leb/j0;I)V
    .locals 3

    iget-object v0, p0, Leb/j0;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v1, Leb/g0;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Leb/g0;-><init>(ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Leb/j0;->c:Leb/r0;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Leb/j0;->h()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(ILandroid/os/Bundle;)V
    .locals 1

    new-instance v0, Leb/g0;

    invoke-direct {v0, p1, p2}, Leb/g0;-><init>(ILandroid/os/Bundle;)V

    iget-object p1, p0, Leb/j0;->d:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Leb/j0;->c:Leb/r0;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Leb/j0;->h()V

    :cond_0
    return-void
.end method

.method public final b()Landroid/app/PendingIntent;
    .locals 6

    iget-object v0, p0, Leb/j0;->e:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    mul-int/lit8 v3, v3, 0x1f

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_1

    :cond_0
    move v4, v1

    :goto_1
    add-int/2addr v3, v4

    goto :goto_0

    :cond_1
    move v3, v1

    :cond_2
    iget-object v0, p0, Leb/j0;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/g0;

    iget v4, v2, Leb/g0;->a:I

    mul-int/lit8 v3, v3, 0x1f

    add-int/2addr v3, v4

    iget-object v2, v2, Leb/g0;->b:Landroid/os/Bundle;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    mul-int/lit8 v3, v3, 0x1f

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_3

    :cond_4
    move v5, v1

    :goto_3
    add-int/2addr v3, v5

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Leb/j0;->c()Landroidx/core/app/TaskStackBuilder;

    move-result-object v0

    const/high16 v1, 0xc000000

    invoke-virtual {v0, v3, v1}, Landroidx/core/app/TaskStackBuilder;->getPendingIntent(II)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final c()Landroidx/core/app/TaskStackBuilder;
    .locals 9

    iget-object v0, p0, Leb/j0;->c:Leb/r0;

    if-eqz v0, :cond_6

    iget-object v0, p0, Leb/j0;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    iget-object v5, p0, Leb/j0;->a:Landroid/content/Context;

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/g0;

    iget v7, v4, Leb/g0;->a:I

    iget-object v4, v4, Leb/g0;->b:Landroid/os/Bundle;

    invoke-virtual {p0, v7}, Leb/j0;->d(I)Leb/n0;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-virtual {v8, v3}, Leb/n0;->d(Leb/n0;)[I

    move-result-object v3

    array-length v5, v3

    :goto_1
    if-ge v6, v5, :cond_0

    aget v7, v3, v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    move-object v3, v8

    goto :goto_0

    :cond_1
    sget v0, Leb/n0;->K:I

    invoke-static {v5, v7}, Lts/o;->x(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Navigation destination "

    const-string v3, " cannot be found in the navigation graph "

    invoke-static {v2, v0, v3}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Leb/j0;->c:Leb/r0;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lm83/s;->C1(Ljava/util/Collection;)[I

    move-result-object v0

    const-string v1, "android-support-nav:controller:deepLinkIds"

    iget-object v3, p0, Leb/j0;->b:Landroid/content/Intent;

    invoke-virtual {v3, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    const-string v0, "android-support-nav:controller:deepLinkArgs"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    invoke-static {v5}, Landroidx/core/app/TaskStackBuilder;->create(Landroid/content/Context;)Landroidx/core/app/TaskStackBuilder;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Landroidx/core/app/TaskStackBuilder;->addNextIntentWithParentStack(Landroid/content/Intent;)Landroidx/core/app/TaskStackBuilder;

    move-result-object v0

    const-string v1, "create(context).addNextI\u2026rentStack(Intent(intent))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/core/app/TaskStackBuilder;->getIntentCount()I

    move-result v1

    :goto_2
    if-ge v6, v1, :cond_4

    invoke-virtual {v0, v6}, Landroidx/core/app/TaskStackBuilder;->editIntentAt(I)Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v4, "android-support-nav:controller:deepLinkIntent"

    invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call setDestination() or addDestination() before constructing the deep link"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call setGraph() before constructing the deep link"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(I)Leb/n0;
    .locals 3

    new-instance v0, Lm83/m;

    invoke-direct {v0}, Lm83/m;-><init>()V

    iget-object v1, p0, Leb/j0;->c:Leb/r0;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lm83/m;->addLast(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lm83/m;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/n0;

    iget v2, v1, Leb/n0;->H:I

    if-ne v2, p1, :cond_1

    return-object v1

    :cond_1
    instance-of v2, v1, Leb/r0;

    if-eqz v2, :cond_0

    check-cast v1, Leb/r0;

    new-instance v2, Leb/q0;

    invoke-direct {v2, v1}, Leb/q0;-><init>(Leb/r0;)V

    :goto_0
    invoke-virtual {v2}, Leb/q0;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Leb/q0;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/n0;

    invoke-virtual {v0, v1}, Lm83/m;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    iput-object p1, p0, Leb/j0;->e:Landroid/os/Bundle;

    iget-object v0, p0, Leb/j0;->b:Landroid/content/Intent;

    const-string v1, "android-support-nav:controller:deepLinkExtras"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-void
.end method

.method public final g(I)V
    .locals 3

    new-instance v0, Leb/v0;

    new-instance v1, Leb/i0;

    invoke-direct {v1}, Leb/i0;-><init>()V

    iget-object v2, p0, Leb/j0;->a:Landroid/content/Context;

    invoke-direct {v0, v2, v1}, Leb/v0;-><init>(Landroid/content/Context;Leb/j1;)V

    invoke-virtual {v0, p1}, Leb/v0;->b(I)Leb/r0;

    move-result-object p1

    iput-object p1, p0, Leb/j0;->c:Leb/r0;

    invoke-virtual {p0}, Leb/j0;->h()V

    return-void
.end method

.method public final h()V
    .locals 4

    iget-object v0, p0, Leb/j0;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/g0;

    iget v1, v1, Leb/g0;->a:I

    invoke-virtual {p0, v1}, Leb/j0;->d(I)Leb/n0;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Leb/n0;->K:I

    iget-object v0, p0, Leb/j0;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lts/o;->x(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Navigation destination "

    const-string v3, " cannot be found in the navigation graph "

    invoke-static {v2, v0, v3}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Leb/j0;->c:Leb/r0;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    return-void
.end method
