.class public final Landroidx/health/connect/client/contracts/ExerciseRouteRequestContract;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Landroidx/health/connect/client/contracts/ExerciseRouteRequestContract;",
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


# instance fields
.field public final a:Lk/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/health/connect/client/permission/platform/RequestExerciseRouteUpsideDownCake;

    invoke-direct {v0}, Landroidx/health/connect/client/permission/platform/RequestExerciseRouteUpsideDownCake;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/health/connect/client/permission/RequestExerciseRouteInternal;

    invoke-direct {v0}, Landroidx/health/connect/client/permission/RequestExerciseRouteInternal;-><init>()V

    :goto_0
    iput-object v0, p0, Landroidx/health/connect/client/contracts/ExerciseRouteRequestContract;->a:Lk/b;

    return-void
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 1

    check-cast p2, Ljava/lang/String;

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/health/connect/client/contracts/ExerciseRouteRequestContract;->a:Lk/b;

    invoke-virtual {v0, p1, p2}, Lk/b;->createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "delegate.createIntent(context, input)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/health/connect/client/contracts/ExerciseRouteRequestContract;->a:Lk/b;

    invoke-virtual {v0, p1, p2}, Lk/b;->parseResult(ILandroid/content/Intent;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm7/r;

    return-object p1
.end method
