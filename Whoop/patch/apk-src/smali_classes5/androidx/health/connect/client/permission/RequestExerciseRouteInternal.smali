.class public final Landroidx/health/connect/client/permission/RequestExerciseRouteInternal;
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
        "Landroidx/health/connect/client/permission/RequestExerciseRouteInternal;",
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

    const-string v0, "androidx.health.action.REQUEST_EXERCISE_ROUTE"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "androidx.health.connect.extra.SESSION_ID"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Session identifier can\'t be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 13

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    const-string v0, "android.health.connect.extra.EXERCISE_ROUTE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroidx/health/platform/client/exerciseroute/ExerciseRoute;

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
    const-string v1, "Returned a route."

    invoke-static {v0, v1}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p2, Landroidx/health/platform/client/exerciseroute/ExerciseRoute;->x:Landroidx/health/platform/client/proto/r;

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/r;->r()Landroidx/health/platform/client/proto/w0;

    move-result-object p2

    const-string v0, "protoWrapper.proto.valuesList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/e0;

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/e0;->t()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v5

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v2

    const-string v3, "latitude"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Landroidx/health/platform/client/proto/g0;

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v6

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v2

    const-string v3, "longitude"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Landroidx/health/platform/client/proto/g0;

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v8

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v2

    const-string v3, "altitude"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/health/platform/client/proto/g0;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v2

    sget-object v4, Lr7/s;->y:Lr7/l;

    invoke-static {v2, v3}, Lr7/l;->a(D)Lr7/s;

    move-result-object v2

    move-object v12, v2

    goto :goto_2

    :cond_2
    move-object v12, p1

    :goto_2
    invoke-virtual {v1}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v2

    const-string v3, "horizontal_accuracy"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/health/platform/client/proto/g0;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v2

    sget-object v4, Lr7/s;->y:Lr7/l;

    invoke-static {v2, v3}, Lr7/l;->a(D)Lr7/s;

    move-result-object v2

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object v10, p1

    :goto_3
    invoke-virtual {v1}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v1

    const-string v2, "vertical_accuracy"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/s;->y:Lr7/l;

    invoke-static {v1, v2}, Lr7/l;->a(D)Lr7/s;

    move-result-object v1

    move-object v11, v1

    goto :goto_4

    :cond_4
    move-object v11, p1

    :goto_4
    new-instance v4, Lm7/q;

    const-string v1, "ofEpochMilli(value.startTimeMillis)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v4 .. v12}, Lm7/q;-><init>(Ljava/time/Instant;DDLr7/s;Lr7/s;Lr7/s;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_5
    new-instance p1, Lm7/r;

    invoke-direct {p1, v0}, Lm7/r;-><init>(Ljava/util/ArrayList;)V

    return-object p1
.end method
