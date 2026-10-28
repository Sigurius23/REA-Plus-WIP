.class public final Lok/g;
.super Lal/a;
.source "SourceFile"


# instance fields
.field public final y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 2

    sget-object v0, Lok/c;->F:Lok/c;

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lal/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lhg3/i;->U(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lok/g;->y:Ljava/lang/String;

    const-string v0, "exceeded_daily_quota_users"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->keySet()Ljava/util/Set;

    move-result-object v0

    const-string v1, "response.getJSONObject(\"\u2026ly_quota_users\").keySet()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    const-string v0, "exceeded_daily_quota_devices"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->keySet()Ljava/util/Set;

    move-result-object v0

    const-string v1, "response.getJSONObject(\"\u2026_quota_devices\").keySet()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    const-string v0, "throttled_events"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const-string v1, "response.getJSONArray(\"throttled_events\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lhg3/i;->q0(Lorg/json/JSONArray;)[I

    move-result-object v0

    invoke-static {v0}, Lm83/n;->a1([I)Ljava/util/Set;

    :cond_2
    const-string v0, "throttled_users"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->keySet()Ljava/util/Set;

    move-result-object v0

    const-string v1, "response.getJSONObject(\"throttled_users\").keySet()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    const-string v0, "throttled_devices"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->keySet()Ljava/util/Set;

    move-result-object p1

    const-string v0, "response.getJSONObject(\"\u2026ottled_devices\").keySet()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final H0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lok/g;->y:Ljava/lang/String;

    return-object v0
.end method
