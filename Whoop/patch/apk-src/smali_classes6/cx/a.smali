.class public abstract Lcx/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcx/b;


# instance fields
.field public final a:Lcx/k;

.field public b:Lcx/a;

.field public final c:Lcx/c;

.field public final d:Lcx/d;


# direct methods
.method public constructor <init>(Lcx/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcx/a;->a:Lcx/k;

    new-instance p1, Lcx/c;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcx/a;->c:Lcx/c;

    new-instance p1, Lcx/d;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcx/a;->d:Lcx/d;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, Lcx/a;->a:Lcx/k;

    iget-object v1, v0, Lcx/k;->d:Ljava/util/LinkedHashSet;

    iget-object v2, v0, Lcx/k;->f:Ljava/util/LinkedHashSet;

    iget-object v3, p0, Lcx/a;->b:Lcx/a;

    if-eqz v3, :cond_0

    invoke-interface {v3}, Lcx/b;->m()V

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_13

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v0, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v4, v0, Lcx/k;->h:Ljava/util/LinkedHashSet;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v4, v0, Lcx/k;->e:Ljava/util/LinkedHashSet;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const-string v4, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v5

    invoke-static {v5, v4}, Ls4/d;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    const-string v4, "android.permission.SYSTEM_ALERT_WINDOW"

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    const/16 v6, 0x17

    if-eqz v5, :cond_4

    invoke-virtual {v0}, Lcx/k;->d()I

    move-result v5

    if-lt v5, v6, :cond_4

    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v5

    invoke-static {v5}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    const-string v4, "android.permission.WRITE_SETTINGS"

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v0}, Lcx/k;->d()I

    move-result v5

    if-lt v5, v6, :cond_6

    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v5

    invoke-static {v5}, Landroid/provider/Settings$System;->canWrite(Landroid/content/Context;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_3
    const-string v4, "android.permission.MANAGE_EXTERNAL_STORAGE"

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1e

    if-lt v5, v6, :cond_7

    invoke-static {}, Landroid/os/Environment;->isExternalStorageManager()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    :goto_4
    const-string v4, "android.permission.REQUEST_INSTALL_PACKAGES"

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v0}, Lcx/k;->d()I

    move-result v5

    const/16 v6, 0x1a

    if-lt v5, v6, :cond_a

    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/pm/PackageManager;->canRequestPackageInstalls()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_5
    const-string v4, "android.permission.POST_NOTIFICATIONS"

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v5

    invoke-static {v5}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    :goto_6
    const-string v4, "android.permission.BODY_SENSORS_BACKGROUND"

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v1

    invoke-static {v1, v4}, Ls4/d;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_e
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    :goto_7
    iget-object v1, v0, Lcx/k;->l:Lax/c;

    if-eqz v1, :cond_10

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, v4, v5, v3}, Lax/c;->a(ZLjava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_10
    invoke-virtual {v0}, Lcx/k;->b()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v2, "InvisibleFragment"

    invoke-virtual {v1, v2}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v0}, Lcx/k;->b()Landroidx/fragment/app/o1;

    move-result-object v2

    new-instance v3, Landroidx/fragment/app/a;

    invoke-direct {v3, v2}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    invoke-virtual {v3, v1}, Landroidx/fragment/app/a;->n(Landroidx/fragment/app/m0;)Landroidx/fragment/app/a;

    iget-boolean v1, v3, Landroidx/fragment/app/c2;->i:Z

    if-nez v1, :cond_11

    const/4 v1, 0x0

    iput-boolean v1, v3, Landroidx/fragment/app/c2;->j:Z

    iget-object v1, v3, Landroidx/fragment/app/a;->t:Landroidx/fragment/app/o1;

    const/4 v2, 0x1

    invoke-virtual {v1, v3, v2}, Landroidx/fragment/app/o1;->A(Landroidx/fragment/app/a;Z)V

    goto :goto_8

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This transaction is already being added to the back stack"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    :goto_8
    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v1

    iget v0, v0, Lcx/k;->b:I

    invoke-virtual {v1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    :cond_13
    return-void
.end method
