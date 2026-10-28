.class public final Landroidx/health/connect/client/permission/platform/RequestExerciseRouteUpsideDownCake;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Landroidx/health/connect/client/permission/platform/RequestExerciseRouteUpsideDownCake;",
        "Lk/b;",
        "",
        "Lm7/r;",
        "<init>",
        "()V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 1

    check-cast p2, Ljava/lang/String;

    const-string p1, "input"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.health.connect.action.REQUEST_EXERCISE_ROUTE"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "android.health.connect.extra.SESSION_ID"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Session identifier can\'t be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 2

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    const-string v0, "android.health.connect.extra.EXERCISE_ROUTE"

    const-class v1, Landroid/health/connect/datatypes/ExerciseRoute;

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/health/connect/datatypes/ExerciseRoute;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    const-string v0, "HealthConnectClient"

    if-nez p2, :cond_1

    const-string p2, "No route returned."

    invoke-static {v0, p2}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_1
    const-string p1, "Returned a route."

    invoke-static {v0, p1}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2}, Lb3/g1;->I(Landroid/health/connect/datatypes/ExerciseRoute;)Lm7/r;

    move-result-object p1

    return-object p1
.end method
