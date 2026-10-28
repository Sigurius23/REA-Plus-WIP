.class public final Lwy/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 3

    if-eqz p0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v1

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    move-object v2, v0

    check-cast v2, Li93/i;

    iget-boolean v2, v2, Li93/i;->y:Z

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static b(Lorg/json/JSONObject;)Lqy/f;
    .locals 11

    :try_start_0
    const-string v0, "error"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v0, "charge"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "code"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "decline_code"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "message"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "param"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "type"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "doc_url"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "extra_fields"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "keys(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lxb3/k;->n(Ljava/util/Iterator;)Lxb3/i;

    move-result-object v0

    new-instance v1, Luo1/b;

    const/16 v9, 0x16

    invoke-direct {v1, p0, v9}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object p0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, p0, Lxb3/s;->a:Lxb3/i;

    invoke-interface {v1}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    iget-object v9, p0, Lxb3/s;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v9, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll83/k;

    iget-object v10, v9, Ll83/k;->w:Ljava/lang/Object;

    iget-object v9, v9, Ll83/k;->x:Ljava/lang/Object;

    invoke-interface {v0, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm83/g0;->c0(Ljava/util/LinkedHashMap;)Ljava/util/Map;

    move-result-object p0

    :goto_1
    move-object v9, p0

    goto :goto_2

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :goto_2
    new-instance v1, Lqy/f;

    invoke-direct/range {v1 .. v9}, Lqy/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_3
    new-instance v2, Lqy/f;

    const-string v4, "An improperly formatted error response was found."

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v10}, Lqy/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    instance-of p0, v1, Ll83/m;

    if-eqz p0, :cond_2

    move-object v1, v2

    :cond_2
    check-cast v1, Lqy/f;

    return-object v1
.end method


# virtual methods
.method public bridge synthetic m(Lorg/json/JSONObject;)Lvy/b;
    .locals 0

    invoke-static {p1}, Lwy/a;->b(Lorg/json/JSONObject;)Lqy/f;

    move-result-object p1

    return-object p1
.end method
