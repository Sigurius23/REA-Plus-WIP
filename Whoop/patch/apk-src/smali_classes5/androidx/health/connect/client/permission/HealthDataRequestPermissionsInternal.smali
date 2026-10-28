.class public final Landroidx/health/connect/client/permission/HealthDataRequestPermissionsInternal;
.super Lk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0008\u0001\u0018\u00002\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroidx/health/connect/client/permission/HealthDataRequestPermissionsInternal;",
        "Lk/b;",
        "",
        "",
        "connect-client_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "com.google.android.apps.healthdata"

    iput-object v0, p0, Landroidx/health/connect/client/permission/HealthDataRequestPermissionsInternal;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Landroidx/health/connect/client/permission/HealthDataRequestPermissionsInternal;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 3

    check-cast p2, Ljava/util/Set;

    const-string p1, "input"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p1, p2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    move-object p1, p2

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p1

    sget-object v0, Lk7/a;->x:Lk7/a;

    invoke-static {p1, v0}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lxb3/s;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    move-object v1, p1

    check-cast v1, Lo63/h;

    invoke-virtual {v1}, Lo63/h;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lo63/h;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Requesting "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " permissions."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "HealthConnectClient"

    invoke-static {p2, p1}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-string p2, "androidx.health.ACTION_REQUEST_PERMISSIONS"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p2, "requested_permissions_string"

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    iget-object p2, p0, Landroidx/health/connect/client/permission/HealthDataRequestPermissionsInternal;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "At least one permission is required!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getSynchronousResult(Landroid/content/Context;Ljava/lang/Object;)Lk/a;
    .locals 1

    check-cast p2, Ljava/util/Set;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "input"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 1

    if-eqz p2, :cond_0

    const-string p1, "granted_permissions_string"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p1

    sget-object p2, Lk7/a;->y:Lk7/a;

    invoke-static {p1, p2}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object p1

    invoke-static {p1}, Lxb3/k;->F(Lxb3/i;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lm83/a0;->w:Lm83/a0;

    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Granted "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " permissions."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "HealthConnectClient"

    invoke-static {v0, p2}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method
