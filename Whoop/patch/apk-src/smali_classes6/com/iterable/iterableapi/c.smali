.class public final Lcom/iterable/iterableapi/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/iterable/iterableapi/c;->a:Lorg/json/JSONObject;

    return-void

    :cond_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/c;->a:Lorg/json/JSONObject;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/iterable/iterableapi/c;
    .locals 2

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "type"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance p0, Lcom/iterable/iterableapi/c;

    invoke-direct {p0, v0}, Lcom/iterable/iterableapi/c;-><init>(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Lorg/json/JSONObject;)Lcom/iterable/iterableapi/c;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lcom/iterable/iterableapi/c;

    invoke-direct {v0, p0}, Lcom/iterable/iterableapi/c;-><init>(Lorg/json/JSONObject;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 3

    const-string v0, "type"

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/iterable/iterableapi/c;->a:Lorg/json/JSONObject;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
