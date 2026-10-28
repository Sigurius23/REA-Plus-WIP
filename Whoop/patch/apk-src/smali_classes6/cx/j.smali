.class public final Lcx/j;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcx/j;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "permissionx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final E:Lj/d;

.field public final F:Lj/d;

.field public final G:Lj/d;

.field public final H:Lj/d;

.field public final I:Lj/d;

.field public final J:Lj/d;

.field public final K:Lj/d;

.field public final w:Landroid/os/Handler;

.field public x:Lcx/k;

.field public y:Lcx/b;

.field public final z:Lj/d;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcx/j;->w:Landroid/os/Handler;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;-><init>()V

    new-instance v1, Lcx/e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcx/e;-><init>(Lcx/j;I)V

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    const-string v1, "registerForActivityResult(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcx/j;->z:Lj/d;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    new-instance v2, Lcx/e;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lcx/e;-><init>(Lcx/j;I)V

    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcx/j;->E:Lj/d;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    new-instance v2, Lcx/e;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lcx/e;-><init>(Lcx/j;I)V

    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcx/j;->F:Lj/d;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    new-instance v2, Lcx/e;

    const/4 v3, 0x3

    invoke-direct {v2, p0, v3}, Lcx/e;-><init>(Lcx/j;I)V

    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcx/j;->G:Lj/d;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    new-instance v2, Lcx/e;

    const/4 v3, 0x4

    invoke-direct {v2, p0, v3}, Lcx/e;-><init>(Lcx/j;I)V

    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcx/j;->H:Lj/d;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    new-instance v2, Lcx/e;

    const/4 v3, 0x5

    invoke-direct {v2, p0, v3}, Lcx/e;-><init>(Lcx/j;I)V

    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcx/j;->I:Lj/d;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    new-instance v2, Lcx/e;

    const/4 v3, 0x6

    invoke-direct {v2, p0, v3}, Lcx/e;-><init>(Lcx/j;I)V

    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcx/j;->J:Lj/d;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    new-instance v2, Lcx/e;

    const/4 v3, 0x7

    invoke-direct {v2, p0, v3}, Lcx/e;-><init>(Lcx/j;I)V

    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcx/j;->K:Lj/d;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    new-instance v2, Lcx/e;

    const/16 v3, 0x8

    invoke-direct {v2, p0, v3}, Lcx/e;-><init>(Lcx/j;I)V

    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final A(Lc93/a;)V
    .locals 1

    new-instance v0, Landroidx/fragment/app/m;

    invoke-direct {v0, p1}, Landroidx/fragment/app/m;-><init>(Lc93/a;)V

    iget-object p1, p0, Lcx/j;->w:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final B(Lcx/k;Lcx/m;)V
    .locals 1

    iput-object p1, p0, Lcx/j;->x:Lcx/k;

    iput-object p2, p0, Lcx/j;->y:Lcx/b;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1e

    if-lt p1, p2, :cond_1

    invoke-static {}, Landroid/os/Environment;->isExternalStorageManager()Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "package:"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p2

    if-nez p2, :cond_0

    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :cond_0
    iget-object p2, p0, Lcx/j;->H:Lj/d;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcx/j;->y()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lcx/h;

    invoke-direct {p1, p0}, Lcx/h;-><init>(Lcx/j;)V

    invoke-virtual {p0, p1}, Lcx/j;->A(Lc93/a;)V

    :cond_2
    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroy()V

    invoke-virtual {p0}, Lcx/j;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "pb"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    return-void
.end method

.method public final y()Z
    .locals 2

    iget-object v0, p0, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const-string v0, "PermissionX"

    const-string v1, "PermissionBuilder and ChainTask should not be null at this time, so we can do nothing in this case."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0
.end method

.method public final z()V
    .locals 5

    invoke-virtual {p0}, Lcx/j;->y()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "task"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_0

    check-cast v0, Lcx/a;

    invoke-virtual {v0}, Lcx/a;->a()V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v0, p0, Lcx/j;->x:Lcx/k;

    const-string v3, "pb"

    if-eqz v0, :cond_5

    iget-object v4, v0, Lcx/k;->m:Lax/a;

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_3

    check-cast v0, Lcx/a;

    iget-object v0, v0, Lcx/a;->c:Lcx/c;

    const-string v1, "android.permission.SYSTEM_ALERT_WINDOW"

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    return-void

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_6
    :goto_0
    return-void
.end method
