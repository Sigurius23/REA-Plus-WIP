.class public final Lcom/iterable/iterableapi/u1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    .line 14
    const-string v0, "itbl"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/iterable/iterableapi/u1;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3
    const-string p1, "campaignId"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/iterable/iterableapi/u1;->a:I

    .line 4
    const-string p1, "templateId"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/iterable/iterableapi/u1;->b:I

    .line 5
    const-string p1, "messageId"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/iterable/iterableapi/u1;->d:Ljava/lang/Object;

    .line 6
    const-string p1, "isGhostPush"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/iterable/iterableapi/u1;->c:Z

    .line 7
    const-string p1, "defaultAction"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Lcom/iterable/iterableapi/c;->b(Lorg/json/JSONObject;)Lcom/iterable/iterableapi/c;

    move-result-object p1

    iput-object p1, p0, Lcom/iterable/iterableapi/u1;->e:Ljava/lang/Object;

    .line 8
    const-string p1, "actionButtons"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/iterable/iterableapi/u1;->f:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 12
    iget-object v2, p0, Lcom/iterable/iterableapi/u1;->f:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    new-instance v3, Lcom/iterable/iterableapi/t1;

    invoke-direct {v3, v1}, Lcom/iterable/iterableapi/t1;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    return-void

    .line 13
    :goto_1
    const-string v0, "IterableNoticationData"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lp0/y0;Ljava/util/List;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/u1;->f:Ljava/lang/Object;

    .line 16
    iput-object p2, p0, Lcom/iterable/iterableapi/u1;->d:Ljava/lang/Object;

    .line 17
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ljava/util/List;

    iput-object p1, p0, Lcom/iterable/iterableapi/u1;->e:Ljava/lang/Object;

    .line 18
    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 19
    const-string p1, "NestedPrefetchController shouldn\'t be created with no states"

    .line 20
    invoke-static {p1}, Lk0/a;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/iterable/iterableapi/t1;
    .locals 3

    iget-object v0, p0, Lcom/iterable/iterableapi/u1;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/iterable/iterableapi/t1;

    iget-object v2, v1, Lcom/iterable/iterableapi/t1;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/iterable/iterableapi/u1;->a:I

    return v0
.end method

.method public c()Lcom/iterable/iterableapi/c;
    .locals 1

    iget-object v0, p0, Lcom/iterable/iterableapi/u1;->e:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/c;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/iterable/iterableapi/u1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/iterable/iterableapi/u1;->b:I

    return v0
.end method
