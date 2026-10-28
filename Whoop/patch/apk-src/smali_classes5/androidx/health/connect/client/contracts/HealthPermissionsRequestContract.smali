.class public final Landroidx/health/connect/client/contracts/HealthPermissionsRequestContract;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroidx/health/connect/client/contracts/HealthPermissionsRequestContract;",
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
.field public final a:Lk/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    const-string v0, "com.google.android.apps.healthdata"

    .line 7
    invoke-direct {p0, v0}, Landroidx/health/connect/client/contracts/HealthPermissionsRequestContract;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 3
    new-instance p1, Landroidx/health/connect/client/permission/platform/HealthDataRequestPermissionsUpsideDownCake;

    invoke-direct {p1}, Landroidx/health/connect/client/permission/platform/HealthDataRequestPermissionsUpsideDownCake;-><init>()V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Landroidx/health/connect/client/permission/HealthDataRequestPermissionsInternal;

    invoke-direct {v0, p1}, Landroidx/health/connect/client/permission/HealthDataRequestPermissionsInternal;-><init>(Ljava/lang/String;)V

    move-object p1, v0

    .line 5
    :goto_0
    iput-object p1, p0, Landroidx/health/connect/client/contracts/HealthPermissionsRequestContract;->a:Lk/b;

    return-void
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 1

    check-cast p2, Ljava/util/Set;

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/health/connect/client/contracts/HealthPermissionsRequestContract;->a:Lk/b;

    invoke-virtual {v0, p1, p2}, Lk/b;->createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "delegate.createIntent(context, input)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/health/connect/client/contracts/HealthPermissionsRequestContract;->a:Lk/b;

    invoke-virtual {v0, p1, p2}, Lk/b;->parseResult(ILandroid/content/Intent;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "delegate.parseResult(resultCode, intent)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method
