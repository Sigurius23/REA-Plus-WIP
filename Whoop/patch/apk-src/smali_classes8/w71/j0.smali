.class public abstract Lw71/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a7\u0010\r\u001a\u00020\u0006*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a;\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lw71/k0;",
        "",
        "answeredYes",
        "",
        "b",
        "(Lw71/k0;Z)Ljava/lang/Object;",
        "Lcom/whoop/whoopaction/domain/models/StateUpdateAction;",
        "e",
        "(Lw71/k0;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;",
        "",
        "magnitudeInputValue",
        "",
        "timeInputValue",
        "f",
        "(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;",
        "includeLabels",
        "Lkotlinx/serialization/json/JsonObject;",
        "c",
        "(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Z)Lkotlinx/serialization/json/JsonObject;",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Lw71/k0;Z)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lw71/j0;->b(Lw71/k0;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lw71/k0;Z)Ljava/lang/Object;
    .locals 6

    if-eqz p1, :cond_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lw71/j0;->g(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object p0

    return-object p0

    :cond_0
    move-object v0, p0

    invoke-virtual {v0}, Lw71/k0;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    if-nez p0, :cond_1

    invoke-static {v0}, Lw71/j0;->e(Lw71/k0;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method private static final c(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Z)Lkotlinx/serialization/json/JsonObject;
    .locals 3

    new-instance v0, Lad3/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lad3/z;-><init>(I)V

    invoke-virtual {p0}, Lw71/k0;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v1

    const-string v2, "behavior_tracker_id"

    invoke-virtual {v0, v2, v1}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    if-eqz p1, :cond_0

    const-string v1, "answered_yes"

    invoke-static {p1}, Lad3/m;->a(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-static {p1}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    const-string p2, "magnitude_input_value"

    invoke-virtual {v0, p2, p1}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    :cond_1
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    const-string p2, "time_input_value"

    invoke-virtual {v0, p2, p1}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    :cond_2
    if-eqz p4, :cond_4

    invoke-virtual {p0}, Lw71/k0;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string p2, "magnitude_input_label"

    invoke-static {p1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    :cond_3
    invoke-virtual {p0}, Lw71/k0;->g()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string p2, "time_input_label"

    invoke-static {p1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    :cond_4
    invoke-virtual {p0}, Lw71/k0;->i()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0}, Lad3/m;->a(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    const-string p1, "is_suggested"

    invoke-virtual {v0, p1, p0}, Lad3/z;->u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {v0}, Lad3/z;->e()Lkotlinx/serialization/json/JsonObject;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;ZILjava/lang/Object;)Lkotlinx/serialization/json/JsonObject;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lw71/j0;->c(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Z)Lkotlinx/serialization/json/JsonObject;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lw71/k0;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;
    .locals 5

    new-instance v0, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-virtual {p0}, Lw71/k0;->f()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v2, v2, v2, v3}, Lw71/j0;->c(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Z)Lkotlinx/serialization/json/JsonObject;

    move-result-object p0

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    const/4 v1, 0x2

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final f(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;
    .locals 9

    new-instance v0, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-virtual {p0}, Lw71/k0;->f()Ljava/lang/String;

    move-result-object v1

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v2 .. v8}, Lw71/j0;->d(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;ZILjava/lang/Object;)Lkotlinx/serialization/json/JsonObject;

    move-result-object p0

    new-instance p1, Ll83/k;

    invoke-direct {p1, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    const/4 p1, 0x2

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic g(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    invoke-virtual {p0}, Lw71/k0;->a()Ljava/lang/Boolean;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    invoke-virtual {p0}, Lw71/k0;->e()Ljava/lang/Double;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    invoke-virtual {p0}, Lw71/k0;->h()Ljava/lang/Long;

    move-result-object p3

    :cond_2
    invoke-static {p0, p1, p2, p3}, Lw71/j0;->f(Lw71/k0;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object p0

    return-object p0
.end method
