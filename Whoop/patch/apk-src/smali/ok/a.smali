.class public final Lok/a;
.super Lal/a;
.source "SourceFile"


# instance fields
.field public final E:Ljava/util/Set;

.field public final F:Ljava/util/Set;

.field public final G:Ljava/util/Set;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 2

    sget-object v0, Lok/c;->y:Lok/c;

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lal/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lhg3/i;->U(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lok/a;->y:Ljava/lang/String;

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    iput-object v0, p0, Lok/a;->z:Ljava/util/Set;

    iput-object v0, p0, Lok/a;->E:Ljava/util/Set;

    iput-object v0, p0, Lok/a;->F:Ljava/util/Set;

    iput-object v0, p0, Lok/a;->G:Ljava/util/Set;

    const-string v0, "events_with_invalid_fields"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "response.getJSONObject(\"\u2026nts_with_invalid_fields\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lhg3/i;->A(Lorg/json/JSONObject;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lok/a;->z:Ljava/util/Set;

    :cond_0
    const-string v0, "events_with_missing_fields"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "response.getJSONObject(\"\u2026nts_with_missing_fields\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lhg3/i;->A(Lorg/json/JSONObject;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lok/a;->E:Ljava/util/Set;

    :cond_1
    const-string v0, "silenced_devices"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const-string v1, "response.getJSONArray(\"silenced_devices\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lok/a;->G:Ljava/util/Set;

    :cond_2
    const-string v0, "silenced_events"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const-string v0, "response.getJSONArray(\"silenced_events\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lhg3/i;->q0(Lorg/json/JSONArray;)[I

    move-result-object p1

    invoke-static {p1}, Lm83/n;->a1([I)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lok/a;->F:Ljava/util/Set;

    :cond_3
    return-void
.end method
