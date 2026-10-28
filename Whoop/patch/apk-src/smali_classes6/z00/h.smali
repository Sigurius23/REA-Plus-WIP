.class public final Lz00/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# static fields
.field public static final w:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "card"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lz00/h;->w:Ljava/util/Set;

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Ly00/m6;
    .locals 22

    move-object/from16 v0, p0

    const-string v1, "object"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "card"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "id"

    if-eqz v3, :cond_0

    new-instance v5, Ly00/m6;

    invoke-static {v4, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Ls6/a;->i(Lorg/json/JSONObject;)Ly00/y6;

    move-result-object v15

    const-string v16, "card"

    const-string v17, "card"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v5 .. v20}, Ly00/m6;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ly00/l6;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Ly00/y6;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Ly00/q6;Ljava/lang/String;)V

    return-object v5

    :cond_0
    const-string v3, "source"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_10

    const-string v1, "type"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "unknown"

    if-nez v1, :cond_1

    move-object v1, v5

    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object/from16 v17, v2

    goto :goto_0

    :cond_2
    move-object/from16 v17, v5

    :goto_0
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    invoke-static {v5}, Ls/s;->m(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v15

    sget-object v5, Lz00/h;->w:Ljava/util/Set;

    invoke-interface {v5, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "owner"

    if-eqz v5, :cond_7

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    move-object v2, v3

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Ls7/a;->p(Lorg/json/JSONObject;)Ly00/l6;

    move-result-object v2

    goto :goto_1

    :cond_4
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Ls6/a;->i(Lorg/json/JSONObject;)Ly00/y6;

    move-result-object v2

    goto :goto_1

    :cond_5
    move-object v2, v3

    :goto_1
    instance-of v5, v2, Ly00/y6;

    if-nez v5, :cond_6

    move-object v2, v3

    :cond_6
    check-cast v2, Ly00/y6;

    :goto_2
    move-object/from16 v16, v2

    goto :goto_3

    :cond_7
    move-object/from16 v16, v3

    :goto_3
    invoke-static {v4, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "amount"

    invoke-static {v2, v0}, Ls/s;->s(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;

    move-result-object v8

    const-string v2, "client_secret"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v9

    const-string v2, "created"

    invoke-static {v2, v0}, Ls/s;->s(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;

    move-result-object v10

    const-string v2, "currency"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v2, "livemode"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_8

    move-object v13, v3

    goto :goto_5

    :cond_8
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-static {v4}, Ls7/a;->p(Lorg/json/JSONObject;)Ly00/l6;

    move-result-object v4

    goto :goto_4

    :cond_9
    move-object v4, v3

    :goto_4
    if-nez v4, :cond_a

    move-object v4, v3

    :cond_a
    move-object v13, v4

    :goto_5
    const-string v4, "source_order"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_b

    new-instance v5, Lz00/g;

    const/4 v6, 0x3

    invoke-direct {v5, v6}, Lz00/g;-><init>(I)V

    invoke-virtual {v5, v4}, Lz00/g;->c(Lorg/json/JSONObject;)Ly00/q6;

    move-result-object v4

    move-object/from16 v20, v4

    goto :goto_6

    :cond_b
    move-object/from16 v20, v3

    :goto_6
    const-string v4, "statement_descriptor"

    invoke-static {v4, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v21

    sget-object v4, Lcom/stripe/android/model/Source$Status;->x:Lt9/p;

    const-string v5, "status"

    invoke-static {v5, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/stripe/android/model/Source$Status;->z:Lt83/b;

    invoke-virtual {v4}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v12, v6

    check-cast v12, Lcom/stripe/android/model/Source$Status;

    iget-object v12, v12, Lcom/stripe/android/model/Source$Status;->w:Ljava/lang/String;

    invoke-virtual {v12, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    goto :goto_7

    :cond_d
    move-object v6, v3

    :goto_7
    move-object v14, v6

    check-cast v14, Lcom/stripe/android/model/Source$Status;

    sget-object v4, Lcom/stripe/android/model/Source$Usage;->x:Lt9/c0;

    const-string v5, "usage"

    invoke-static {v5, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/stripe/android/model/Source$Usage;->z:Lt83/b;

    invoke-virtual {v4}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/stripe/android/model/Source$Usage;

    iget-object v6, v6, Lcom/stripe/android/model/Source$Usage;->w:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    move-object v3, v5

    :cond_f
    move-object/from16 v19, v3

    check-cast v19, Lcom/stripe/android/model/Source$Usage;

    new-instance v6, Ly00/m6;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    move-object/from16 v18, v1

    invoke-direct/range {v6 .. v21}, Ly00/m6;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ly00/l6;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Ly00/y6;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Ly00/q6;Ljava/lang/String;)V

    return-object v6

    :cond_10
    return-object v3
.end method


# virtual methods
.method public final bridge synthetic m(Lorg/json/JSONObject;)Lvy/b;
    .locals 0

    invoke-static {p1}, Lz00/h;->a(Lorg/json/JSONObject;)Ly00/m6;

    move-result-object p1

    return-object p1
.end method
