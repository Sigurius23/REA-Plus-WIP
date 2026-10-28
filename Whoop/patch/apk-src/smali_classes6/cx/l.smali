.class public final Lcx/l;
.super Lcx/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcx/k;I)V
    .locals 0

    iput p2, p0, Lcx/l;->e:I

    invoke-direct {p0, p1}, Lcx/a;-><init>(Lcx/k;)V

    return-void
.end method


# virtual methods
.method public final m()V
    .locals 6

    iget v0, p0, Lcx/l;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcx/a;->a:Lcx/k;

    iget-object v1, v0, Lcx/k;->d:Ljava/util/LinkedHashSet;

    const-string v2, "android.permission.WRITE_SETTINGS"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lcx/k;->d()I

    move-result v3

    const/16 v4, 0x17

    if-lt v3, v4, :cond_2

    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v1

    invoke-static {v1}, Landroid/provider/Settings$System;->canWrite(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcx/k;->m:Lax/a;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_0

    :cond_1
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v0, v0, Lcx/k;->m:Lax/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lcx/a;->c:Lcx/c;

    invoke-interface {v0, v2, v1}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    goto :goto_0

    :cond_2
    iget-object v0, v0, Lcx/k;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcx/a;->a()V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcx/a;->a:Lcx/k;

    iget-object v1, v0, Lcx/k;->d:Ljava/util/LinkedHashSet;

    const-string v2, "android.permission.SYSTEM_ALERT_WINDOW"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lcx/k;->d()I

    move-result v3

    const/16 v4, 0x17

    if-lt v3, v4, :cond_6

    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v1

    invoke-static {v1}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_1

    :cond_4
    iget-object v1, v0, Lcx/k;->m:Lax/a;

    if-nez v1, :cond_5

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_1

    :cond_5
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v0, v0, Lcx/k;->m:Lax/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lcx/a;->c:Lcx/c;

    invoke-interface {v0, v2, v1}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    goto :goto_1

    :cond_6
    iget-object v0, v0, Lcx/k;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lcx/a;->a()V

    :goto_1
    return-void

    :pswitch_1
    iget-object v0, p0, Lcx/a;->a:Lcx/k;

    iget-object v1, v0, Lcx/k;->d:Ljava/util/LinkedHashSet;

    const-string v2, "android.permission.POST_NOTIFICATIONS"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_3

    :cond_8
    iget-object v1, v0, Lcx/k;->m:Lax/a;

    if-nez v1, :cond_9

    goto :goto_2

    :cond_9
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v0, v0, Lcx/k;->m:Lax/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lcx/a;->c:Lcx/c;

    invoke-interface {v0, v2, v1}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    goto :goto_3

    :cond_a
    :goto_2
    invoke-virtual {p0}, Lcx/a;->a()V

    :goto_3
    return-void

    :pswitch_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcx/a;->a:Lcx/k;

    iget-object v2, v1, Lcx/k;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v5

    invoke-static {v5, v4}, Ls4/d;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_b

    iget-object v5, v1, Lcx/k;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_b
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_c
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_5

    :cond_d
    invoke-virtual {v1, v2, p0}, Lcx/k;->f(Ljava/util/HashSet;Lcx/l;)V

    :goto_5
    return-void

    :pswitch_3
    iget-object v0, p0, Lcx/a;->a:Lcx/k;

    iget-object v1, v0, Lcx/k;->d:Ljava/util/LinkedHashSet;

    const-string v2, "android.permission.REQUEST_INSTALL_PACKAGES"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {v0}, Lcx/k;->d()I

    move-result v1

    const/16 v3, 0x1a

    if-lt v1, v3, :cond_10

    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/pm/PackageManager;->canRequestPackageInstalls()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_6

    :cond_e
    iget-object v1, v0, Lcx/k;->m:Lax/a;

    if-nez v1, :cond_f

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_6

    :cond_f
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v0, v0, Lcx/k;->m:Lax/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lcx/a;->c:Lcx/c;

    invoke-interface {v0, v2, v1}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    goto :goto_6

    :cond_10
    invoke-virtual {p0}, Lcx/a;->a()V

    :goto_6
    return-void

    :pswitch_4
    iget-object v0, p0, Lcx/a;->a:Lcx/k;

    iget-object v1, v0, Lcx/k;->d:Ljava/util/LinkedHashSet;

    const-string v2, "android.permission.BODY_SENSORS_BACKGROUND"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_14

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-ge v3, v4, :cond_11

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, v0, Lcx/k;->e:Ljava/util/LinkedHashSet;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_7

    :cond_11
    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v1

    invoke-static {v1, v2}, Ls4/d;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_7

    :cond_12
    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v1

    const-string v3, "android.permission.BODY_SENSORS"

    invoke-static {v1, v3}, Ls4/d;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_14

    iget-object v1, v0, Lcx/k;->m:Lax/a;

    if-nez v1, :cond_13

    invoke-virtual {v0}, Lcx/k;->c()Lcx/j;

    move-result-object v1

    iput-object v0, v1, Lcx/j;->x:Lcx/k;

    iput-object p0, v1, Lcx/j;->y:Lcx/b;

    iget-object v0, v1, Lcx/j;->K:Lj/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_7

    :cond_13
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v0, v0, Lcx/k;->m:Lax/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lcx/a;->c:Lcx/c;

    invoke-interface {v0, v2, v1}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    goto :goto_7

    :cond_14
    invoke-virtual {p0}, Lcx/a;->a()V

    :goto_7
    return-void

    :pswitch_5
    iget-object v0, p0, Lcx/a;->a:Lcx/k;

    iget-object v1, v0, Lcx/k;->d:Ljava/util/LinkedHashSet;

    const-string v2, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-ge v3, v4, :cond_15

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, v0, Lcx/k;->e:Ljava/util/LinkedHashSet;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_8

    :cond_15
    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v1

    invoke-static {v1, v2}, Ls4/d;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual {p0}, Lcx/a;->a()V

    goto :goto_8

    :cond_16
    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v1

    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v1, v3}, Ls4/d;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v3

    const-string v4, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v3, v4}, Ls4/d;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-nez v1, :cond_17

    if-eqz v3, :cond_19

    :cond_17
    iget-object v1, v0, Lcx/k;->m:Lax/a;

    if-nez v1, :cond_18

    invoke-virtual {v0}, Lcx/k;->c()Lcx/j;

    move-result-object v1

    iput-object v0, v1, Lcx/j;->x:Lcx/k;

    iput-object p0, v1, Lcx/j;->y:Lcx/b;

    iget-object v0, v1, Lcx/j;->E:Lj/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_8

    :cond_18
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v0, v0, Lcx/k;->m:Lax/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lcx/a;->c:Lcx/c;

    invoke-interface {v0, v2, v1}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    goto :goto_8

    :cond_19
    invoke-virtual {p0}, Lcx/a;->a()V

    :goto_8
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Ljava/util/List;)V
    .locals 3

    iget v0, p0, Lcx/l;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lcx/a;->a:Lcx/k;

    invoke-virtual {p1}, Lcx/k;->c()Lcx/j;

    move-result-object v0

    iput-object p1, v0, Lcx/j;->x:Lcx/k;

    iput-object p0, v0, Lcx/j;->y:Lcx/b;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/provider/Settings$System;->canWrite(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.settings.action.MANAGE_WRITE_SETTINGS"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "package:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v0, v0, Lcx/j;->G:Lj/d;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcx/j;->y()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lcx/g;

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1}, Lcx/g;-><init>(Lcx/j;I)V

    invoke-virtual {v0, p1}, Lcx/j;->A(Lc93/a;)V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object p1, p0, Lcx/a;->a:Lcx/k;

    invoke-virtual {p1}, Lcx/k;->c()Lcx/j;

    move-result-object v0

    iput-object p1, v0, Lcx/j;->x:Lcx/k;

    iput-object p0, v0, Lcx/j;->y:Lcx/b;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_2

    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "package:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v0, v0, Lcx/j;->F:Lj/d;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcx/j;->z()V

    :goto_1
    return-void

    :pswitch_1
    iget-object p1, p0, Lcx/a;->a:Lcx/k;

    invoke-virtual {p1}, Lcx/k;->c()Lcx/j;

    move-result-object v0

    iput-object p1, v0, Lcx/j;->x:Lcx/k;

    iput-object p0, v0, Lcx/j;->y:Lcx/b;

    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.settings.APP_NOTIFICATION_SETTINGS"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.provider.extra.APP_PACKAGE"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, v0, Lcx/j;->J:Lj/d;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :pswitch_2
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcx/a;->a:Lcx/k;

    iget-object v2, v1, Lcx/k;->f:Ljava/util/LinkedHashSet;

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v1, v0, p0}, Lcx/k;->f(Ljava/util/HashSet;Lcx/l;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lcx/a;->a()V

    :goto_2
    return-void

    :pswitch_3
    iget-object p1, p0, Lcx/a;->a:Lcx/k;

    invoke-virtual {p1}, Lcx/k;->c()Lcx/j;

    move-result-object v0

    iput-object p1, v0, Lcx/j;->x:Lcx/k;

    iput-object p0, v0, Lcx/j;->y:Lcx/b;

    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.settings.MANAGE_UNKNOWN_APP_SOURCES"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "package:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v0, v0, Lcx/j;->I:Lj/d;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :pswitch_4
    iget-object p1, p0, Lcx/a;->a:Lcx/k;

    invoke-virtual {p1}, Lcx/k;->c()Lcx/j;

    move-result-object v0

    iput-object p1, v0, Lcx/j;->x:Lcx/k;

    iput-object p0, v0, Lcx/j;->y:Lcx/b;

    iget-object p1, v0, Lcx/j;->K:Lj/d;

    const-string v0, "android.permission.BODY_SENSORS_BACKGROUND"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :pswitch_5
    iget-object p1, p0, Lcx/a;->a:Lcx/k;

    invoke-virtual {p1}, Lcx/k;->c()Lcx/j;

    move-result-object v0

    iput-object p1, v0, Lcx/j;->x:Lcx/k;

    iput-object p0, v0, Lcx/j;->y:Lcx/b;

    iget-object p1, v0, Lcx/j;->E:Lj/d;

    const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
