.class public final Lcom/iterable/iterableapi/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lorg/json/JSONObject;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public f:Lcom/iterable/iterableapi/n;

.field public final g:Lcom/iterable/iterableapi/f0;

.field public final h:Lcom/iterable/iterableapi/z1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/iterable/iterableapi/f0;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    sget-object v0, Lcom/iterable/iterableapi/n;->w:Lcom/iterable/iterableapi/l;

    iput-object v0, p0, Lcom/iterable/iterableapi/o;->f:Lcom/iterable/iterableapi/n;

    .line 11
    iput-object p1, p0, Lcom/iterable/iterableapi/o;->a:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcom/iterable/iterableapi/o;->b:Ljava/lang/String;

    .line 13
    iput-object p3, p0, Lcom/iterable/iterableapi/o;->c:Lorg/json/JSONObject;

    .line 14
    iput-object p4, p0, Lcom/iterable/iterableapi/o;->d:Ljava/lang/String;

    .line 15
    iput-object p5, p0, Lcom/iterable/iterableapi/o;->e:Ljava/lang/String;

    .line 16
    iput-object p6, p0, Lcom/iterable/iterableapi/o;->g:Lcom/iterable/iterableapi/f0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object p7, Lcom/iterable/iterableapi/n;->w:Lcom/iterable/iterableapi/l;

    iput-object p7, p0, Lcom/iterable/iterableapi/o;->f:Lcom/iterable/iterableapi/n;

    .line 3
    iput-object p1, p0, Lcom/iterable/iterableapi/o;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/iterable/iterableapi/o;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/iterable/iterableapi/o;->c:Lorg/json/JSONObject;

    .line 6
    iput-object p4, p0, Lcom/iterable/iterableapi/o;->d:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/iterable/iterableapi/o;->e:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/iterable/iterableapi/o;->h:Lcom/iterable/iterableapi/z1;

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lcom/iterable/iterableapi/o;
    .locals 10

    const-string v0, "authToken"

    :try_start_0
    const-string v1, "apiKey"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "resourcePath"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "requestType"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, ""

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    move-object v7, v1

    const-string v0, "data"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    new-instance v2, Lcom/iterable/iterableapi/o;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/iterable/iterableapi/o;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    const-string p0, "IterableApiRequest"

    const-string v0, "Failed to create Iterable request from JSON"

    invoke-static {p0, v0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final b()Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "apiKey"

    iget-object v2, p0, Lcom/iterable/iterableapi/o;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "resourcePath"

    iget-object v2, p0, Lcom/iterable/iterableapi/o;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "authToken"

    iget-object v2, p0, Lcom/iterable/iterableapi/o;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "requestType"

    iget-object v2, p0, Lcom/iterable/iterableapi/o;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "data"

    iget-object v2, p0, Lcom/iterable/iterableapi/o;->c:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method
