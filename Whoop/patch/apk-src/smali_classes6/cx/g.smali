.class public final Lcx/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcx/j;


# direct methods
.method public synthetic constructor <init>(Lcx/j;I)V
    .locals 0

    iput p2, p0, Lcx/g;->w:I

    iput-object p1, p0, Lcx/g;->x:Lcx/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lcx/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcx/g;->x:Lcx/j;

    invoke-virtual {v0}, Lcx/j;->y()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcx/g;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lcx/g;-><init>(Lcx/j;I)V

    invoke-virtual {v0, v1}, Lcx/j;->A(Lc93/a;)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcx/g;->x:Lcx/j;

    invoke-virtual {v0}, Lcx/j;->z()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcx/g;->x:Lcx/j;

    invoke-virtual {v0}, Lcx/j;->y()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lcx/g;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lcx/g;-><init>(Lcx/j;I)V

    invoke-virtual {v0, v1}, Lcx/j;->A(Lc93/a;)V

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcx/g;->x:Lcx/j;

    invoke-virtual {v0}, Lcx/j;->y()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lcx/h;

    invoke-direct {v1, v0}, Lcx/h;-><init>(Lcx/j;)V

    invoke-virtual {v0, v1}, Lcx/j;->A(Lc93/a;)V

    :cond_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcx/g;->x:Lcx/j;

    invoke-virtual {v0}, Lcx/j;->y()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lcx/g;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcx/g;-><init>(Lcx/j;I)V

    invoke-virtual {v0, v1}, Lcx/j;->A(Lc93/a;)V

    :cond_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lcx/g;->x:Lcx/j;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/provider/Settings$System;->canWrite(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "task"

    if-eqz v1, :cond_5

    iget-object v0, v0, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_4

    check-cast v0, Lcx/a;

    invoke-virtual {v0}, Lcx/a;->a()V

    goto :goto_0

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    iget-object v1, v0, Lcx/j;->x:Lcx/k;

    if-eqz v1, :cond_8

    iget-object v1, v1, Lcx/k;->m:Lax/a;

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, v0, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_7

    check-cast v0, Lcx/a;

    iget-object v0, v0, Lcx/a;->c:Lcx/c;

    const-string v2, "android.permission.WRITE_SETTINGS"

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_8
    const-string v0, "pb"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :pswitch_5
    iget-object v0, p0, Lcx/g;->x:Lcx/j;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "task"

    if-eqz v1, :cond_a

    iget-object v0, v0, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_9

    check-cast v0, Lcx/a;

    invoke-virtual {v0}, Lcx/a;->a()V

    goto :goto_1

    :cond_9
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_a
    iget-object v1, v0, Lcx/j;->x:Lcx/k;

    if-eqz v1, :cond_d

    iget-object v1, v1, Lcx/k;->m:Lax/a;

    if-nez v1, :cond_b

    goto :goto_1

    :cond_b
    iget-object v0, v0, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_c

    check-cast v0, Lcx/a;

    iget-object v0, v0, Lcx/a;->c:Lcx/c;

    const-string v2, "android.permission.POST_NOTIFICATIONS"

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_c
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_d
    const-string v0, "pb"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :pswitch_6
    iget-object v0, p0, Lcx/g;->x:Lcx/j;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/pm/PackageManager;->canRequestPackageInstalls()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "task"

    if-eqz v1, :cond_f

    iget-object v0, v0, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_e

    check-cast v0, Lcx/a;

    invoke-virtual {v0}, Lcx/a;->a()V

    goto :goto_2

    :cond_e
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_f
    iget-object v1, v0, Lcx/j;->x:Lcx/k;

    if-eqz v1, :cond_12

    iget-object v1, v1, Lcx/k;->m:Lax/a;

    if-nez v1, :cond_10

    goto :goto_2

    :cond_10
    iget-object v0, v0, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_11

    check-cast v0, Lcx/a;

    iget-object v0, v0, Lcx/a;->c:Lcx/c;

    const-string v2, "android.permission.REQUEST_INSTALL_PACKAGES"

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_11
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_12
    const-string v0, "pb"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
