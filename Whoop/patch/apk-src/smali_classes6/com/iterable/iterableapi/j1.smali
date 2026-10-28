.class public final Lcom/iterable/iterableapi/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/iterable/iterableapi/e1;

.field public final c:Lorg/json/JSONObject;

.field public final d:Ljava/util/Date;

.field public final e:Ljava/util/Date;

.field public final f:Lcom/iterable/iterableapi/i1;

.field public final g:D

.field public final h:Ljava/lang/Boolean;

.field public final i:Lcom/iterable/iterableapi/h1;

.field public final j:Ljava/lang/Long;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:La3/p;

.field public final q:Z

.field public r:La3/p;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/iterable/iterableapi/e1;Lorg/json/JSONObject;Ljava/util/Date;Ljava/util/Date;Lcom/iterable/iterableapi/i1;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/iterable/iterableapi/h1;Ljava/lang/Long;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/iterable/iterableapi/j1;->k:Z

    iput-boolean v0, p0, Lcom/iterable/iterableapi/j1;->l:Z

    iput-boolean v0, p0, Lcom/iterable/iterableapi/j1;->m:Z

    iput-boolean v0, p0, Lcom/iterable/iterableapi/j1;->n:Z

    iput-boolean v0, p0, Lcom/iterable/iterableapi/j1;->o:Z

    iput-object p1, p0, Lcom/iterable/iterableapi/j1;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/iterable/iterableapi/j1;->b:Lcom/iterable/iterableapi/e1;

    iput-object p3, p0, Lcom/iterable/iterableapi/j1;->c:Lorg/json/JSONObject;

    iput-object p4, p0, Lcom/iterable/iterableapi/j1;->d:Ljava/util/Date;

    iput-object p5, p0, Lcom/iterable/iterableapi/j1;->e:Ljava/util/Date;

    iput-object p6, p0, Lcom/iterable/iterableapi/j1;->f:Lcom/iterable/iterableapi/i1;

    invoke-virtual {p7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    iput-wide p1, p0, Lcom/iterable/iterableapi/j1;->g:D

    if-eqz p8, :cond_1

    invoke-virtual {p8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    if-nez p11, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/iterable/iterableapi/j1;->h:Ljava/lang/Boolean;

    iput-object p9, p0, Lcom/iterable/iterableapi/j1;->i:Lcom/iterable/iterableapi/h1;

    iput-object p10, p0, Lcom/iterable/iterableapi/j1;->j:Ljava/lang/Long;

    iput-boolean p11, p0, Lcom/iterable/iterableapi/j1;->q:Z

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)I
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const-string v1, "displayOption"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "AutoExpand"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const-string v1, "percentage"

    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    return p0

    :cond_1
    return v0
.end method

.method public static b(I)Lorg/json/JSONObject;
    .locals 2

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const/4 v1, -0x1

    if-ne p0, v1, :cond_0

    const-string p0, "displayOption"

    const-string v1, "AutoExpand"

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0

    :cond_0
    const-string v1, "percentage"

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public static c(Landroid/graphics/Rect;)Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iget v1, p0, Landroid/graphics/Rect;->top:I

    invoke-static {v1}, Lcom/iterable/iterableapi/j1;->b(I)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "top"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget v1, p0, Landroid/graphics/Rect;->left:I

    invoke-static {v1}, Lcom/iterable/iterableapi/j1;->b(I)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "left"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget v1, p0, Landroid/graphics/Rect;->bottom:I

    invoke-static {v1}, Lcom/iterable/iterableapi/j1;->b(I)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "bottom"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget p0, p0, Landroid/graphics/Rect;->right:I

    invoke-static {p0}, Lcom/iterable/iterableapi/j1;->b(I)Lorg/json/JSONObject;

    move-result-object p0

    const-string v1, "right"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public static d(Lorg/json/JSONObject;La3/p;)Lcom/iterable/iterableapi/j1;
    .locals 22

    move-object/from16 v0, p0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "messageId"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v2, "campaignId"

    const-wide/16 v5, 0x0

    :try_start_0
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v7, v2, v5

    if-ltz v7, :cond_1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v13, v2

    goto :goto_0

    :catch_0
    :cond_1
    move-object v13, v1

    :goto_0
    const-string v2, "jsonOnly"

    const/4 v15, 0x0

    invoke-virtual {v0, v2, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v14

    const-string v2, "customPayload"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-nez v2, :cond_2

    if-eqz v14, :cond_2

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :cond_2
    const-wide/16 v7, 0x0

    if-eqz v14, :cond_3

    new-instance v16, Lcom/iterable/iterableapi/e1;

    new-instance v18, Landroid/graphics/Rect;

    invoke-direct/range {v18 .. v18}, Landroid/graphics/Rect;-><init>()V

    new-instance v3, Lcom/iterable/iterableapi/g1;

    new-instance v9, Lcom/iterable/iterableapi/f1;

    invoke-direct {v9, v7, v8, v1}, Lcom/iterable/iterableapi/f1;-><init>(DLjava/lang/String;)V

    invoke-direct {v3, v15, v9}, Lcom/iterable/iterableapi/g1;-><init>(ZLcom/iterable/iterableapi/f1;)V

    const-string v17, ""

    const-wide/16 v19, 0x0

    move-object/from16 v21, v3

    invoke-direct/range {v16 .. v21}, Lcom/iterable/iterableapi/e1;-><init>(Ljava/lang/String;Landroid/graphics/Rect;DLcom/iterable/iterableapi/g1;)V

    goto/16 :goto_5

    :cond_3
    const-string v3, "content"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_4

    :goto_1
    return-object v1

    :cond_4
    if-nez v2, :cond_5

    const-string v2, "payload"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    :cond_5
    const-string v9, "html"

    invoke-virtual {v3, v9, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const-string v9, "inAppDisplaySettings"

    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    if-nez v9, :cond_6

    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10, v15, v15, v15, v15}, Landroid/graphics/Rect;-><init>(IIII)V

    :goto_2
    move-object/from16 v18, v10

    goto :goto_3

    :cond_6
    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    const-string v11, "top"

    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    invoke-static {v11}, Lcom/iterable/iterableapi/j1;->a(Lorg/json/JSONObject;)I

    move-result v11

    iput v11, v10, Landroid/graphics/Rect;->top:I

    const-string v11, "left"

    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    invoke-static {v11}, Lcom/iterable/iterableapi/j1;->a(Lorg/json/JSONObject;)I

    move-result v11

    iput v11, v10, Landroid/graphics/Rect;->left:I

    const-string v11, "bottom"

    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    invoke-static {v11}, Lcom/iterable/iterableapi/j1;->a(Lorg/json/JSONObject;)I

    move-result v11

    iput v11, v10, Landroid/graphics/Rect;->bottom:I

    const-string v11, "right"

    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    invoke-static {v11}, Lcom/iterable/iterableapi/j1;->a(Lorg/json/JSONObject;)I

    move-result v11

    iput v11, v10, Landroid/graphics/Rect;->right:I

    goto :goto_2

    :goto_3
    const-string v10, "backgroundAlpha"

    invoke-virtual {v3, v10, v7, v8}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v19

    const-string v3, "shouldAnimate"

    invoke-virtual {v9, v3, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    const-string v10, "bgColor"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    if-eqz v9, :cond_7

    const-string v7, "hex"

    invoke-virtual {v9, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "alpha"

    invoke-virtual {v9, v8}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v8

    goto :goto_4

    :cond_7
    move-wide v8, v7

    move-object v7, v1

    :goto_4
    new-instance v10, Lcom/iterable/iterableapi/g1;

    new-instance v11, Lcom/iterable/iterableapi/f1;

    invoke-direct {v11, v8, v9, v7}, Lcom/iterable/iterableapi/f1;-><init>(DLjava/lang/String;)V

    invoke-direct {v10, v3, v11}, Lcom/iterable/iterableapi/g1;-><init>(ZLcom/iterable/iterableapi/f1;)V

    new-instance v16, Lcom/iterable/iterableapi/e1;

    move-object/from16 v21, v10

    invoke-direct/range {v16 .. v21}, Lcom/iterable/iterableapi/e1;-><init>(Ljava/lang/String;Landroid/graphics/Rect;DLcom/iterable/iterableapi/g1;)V

    :goto_5
    const-string v3, "createdAt"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v7

    cmp-long v3, v7, v5

    if-eqz v3, :cond_8

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v7, v8}, Ljava/util/Date;-><init>(J)V

    move-object v7, v3

    goto :goto_6

    :cond_8
    move-object v7, v1

    :goto_6
    const-string v3, "expiresAt"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v8

    cmp-long v3, v8, v5

    if-eqz v3, :cond_9

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v8, v9}, Ljava/util/Date;-><init>(J)V

    move-object v8, v3

    goto :goto_7

    :cond_9
    move-object v8, v1

    :goto_7
    const-string v3, "trigger"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_a

    new-instance v3, Lcom/iterable/iterableapi/i1;

    invoke-direct {v3}, Lcom/iterable/iterableapi/i1;-><init>()V

    move-object v9, v3

    goto :goto_8

    :cond_a
    new-instance v5, Lcom/iterable/iterableapi/i1;

    invoke-direct {v5, v3}, Lcom/iterable/iterableapi/i1;-><init>(Lorg/json/JSONObject;)V

    move-object v9, v5

    :goto_8
    const-string v3, "priorityLevel"

    const-wide v5, 0x4072c80000000000L    # 300.5

    invoke-virtual {v0, v3, v5, v6}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v5

    const-string v3, "saveToInbox"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    move-object v11, v3

    goto :goto_9

    :cond_b
    move-object v11, v1

    :goto_9
    const-string v3, "inboxMetadata"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_c

    move-object v12, v1

    goto :goto_a

    :cond_c
    const-string v1, "title"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v10, "subtitle"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v12, "icon"

    invoke-virtual {v3, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v12, Lcom/iterable/iterableapi/h1;

    invoke-direct {v12, v1, v10, v3}, Lcom/iterable/iterableapi/h1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_a
    new-instance v3, Lcom/iterable/iterableapi/j1;

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    move-object v6, v2

    move-object/from16 v5, v16

    invoke-direct/range {v3 .. v14}, Lcom/iterable/iterableapi/j1;-><init>(Ljava/lang/String;Lcom/iterable/iterableapi/e1;Lorg/json/JSONObject;Ljava/util/Date;Ljava/util/Date;Lcom/iterable/iterableapi/i1;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/iterable/iterableapi/h1;Ljava/lang/Long;Z)V

    move-object/from16 v1, p1

    iput-object v1, v3, Lcom/iterable/iterableapi/j1;->p:La3/p;

    if-nez v14, :cond_d

    iget-object v1, v5, Lcom/iterable/iterableapi/e1;->a:Ljava/lang/String;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_d

    const/4 v1, 0x1

    iput-boolean v1, v3, Lcom/iterable/iterableapi/j1;->n:Z

    :cond_d
    const-string v1, "processed"

    invoke-virtual {v0, v1, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v3, Lcom/iterable/iterableapi/j1;->k:Z

    const-string v1, "consumed"

    invoke-virtual {v0, v1, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v3, Lcom/iterable/iterableapi/j1;->l:Z

    const-string v1, "read"

    invoke-virtual {v0, v1, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v3, Lcom/iterable/iterableapi/j1;->m:Z

    return-object v3
.end method


# virtual methods
.method public final e()Lcom/iterable/iterableapi/e1;
    .locals 5

    iget-object v0, p0, Lcom/iterable/iterableapi/j1;->b:Lcom/iterable/iterableapi/e1;

    iget-object v1, v0, Lcom/iterable/iterableapi/e1;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lcom/iterable/iterableapi/j1;->q:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/iterable/iterableapi/j1;->p:La3/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/io/File;

    iget-object v1, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    new-instance v3, Ljava/io/File;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v4, "com.iterable.sdk"

    invoke-direct {v3, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    :cond_0
    new-instance v1, Ljava/io/File;

    const-string v4, "IterableInAppFileStorage"

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    iget-object v3, p0, Lcom/iterable/iterableapi/j1;->a:Ljava/lang/String;

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    const-string v3, "index.html"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v1}, Lge3/g;->P(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/iterable/iterableapi/e1;->a:Ljava/lang/String;

    :cond_2
    return-object v0
.end method

.method public final f()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/iterable/iterableapi/j1;->e:Ljava/util/Date;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/iterable/iterableapi/j1;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final h()D
    .locals 2

    iget-wide v0, p0, Lcom/iterable/iterableapi/j1;->g:D

    return-wide v0
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, Lcom/iterable/iterableapi/j1;->f:Lcom/iterable/iterableapi/i1;

    iget v0, v0, Lcom/iterable/iterableapi/i1;->b:I

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/iterable/iterableapi/j1;->n:Z

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/iterable/iterableapi/j1;->l:Z

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lcom/iterable/iterableapi/j1;->h:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/iterable/iterableapi/j1;->q:Z

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/iterable/iterableapi/j1;->o:Z

    return v0
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/iterable/iterableapi/j1;->k:Z

    return v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, Lcom/iterable/iterableapi/j1;->m:Z

    return v0
.end method

.method public final q()Z
    .locals 2

    invoke-virtual {p0}, Lcom/iterable/iterableapi/j1;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/iterable/iterableapi/j1;->f:Lcom/iterable/iterableapi/i1;

    iget v0, v0, Lcom/iterable/iterableapi/i1;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final r()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/iterable/iterableapi/j1;->o:Z

    return-void
.end method

.method public final s()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/iterable/iterableapi/j1;->l:Z

    iget-object v0, p0, Lcom/iterable/iterableapi/j1;->r:La3/p;

    if-eqz v0, :cond_0

    iget-object v0, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/p0;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-nez v2, :cond_0

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    return-void
.end method

.method public final t()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/iterable/iterableapi/j1;->n:Z

    return-void
.end method

.method public final u(La3/p;)V
    .locals 0

    iput-object p1, p0, Lcom/iterable/iterableapi/j1;->r:La3/p;

    return-void
.end method

.method public final v()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/iterable/iterableapi/j1;->k:Z

    iget-object v0, p0, Lcom/iterable/iterableapi/j1;->r:La3/p;

    if-eqz v0, :cond_0

    iget-object v0, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/p0;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-nez v2, :cond_0

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    return-void
.end method

.method public final w(Z)V
    .locals 3

    iput-boolean p1, p0, Lcom/iterable/iterableapi/j1;->m:Z

    iget-object p1, p0, Lcom/iterable/iterableapi/j1;->r:La3/p;

    if-eqz p1, :cond_0

    iget-object p1, p1, La3/p;->z:Ljava/lang/Object;

    check-cast p1, Lcom/iterable/iterableapi/p0;

    const/16 v0, 0x64

    invoke-virtual {p1, v0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v1

    if-nez v1, :cond_0

    const-wide/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    return-void
.end method

.method public final x()Lorg/json/JSONObject;
    .locals 12

    const-string v0, "IterableInAppMessage"

    iget-object v1, p0, Lcom/iterable/iterableapi/j1;->b:Lcom/iterable/iterableapi/e1;

    iget-object v2, v1, Lcom/iterable/iterableapi/e1;->d:Lcom/iterable/iterableapi/g1;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v5, "messageId"

    iget-object v6, p0, Lcom/iterable/iterableapi/j1;->a:Ljava/lang/String;

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v5, p0, Lcom/iterable/iterableapi/j1;->j:Ljava/lang/Long;

    if-eqz v5, :cond_0

    :try_start_1
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-ltz v6, :cond_0

    const-string v6, "campaignId"

    invoke-virtual {v3, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception v1

    goto/16 :goto_3

    :cond_0
    :goto_0
    iget-object v5, p0, Lcom/iterable/iterableapi/j1;->d:Ljava/util/Date;

    if-eqz v5, :cond_1

    const-string v6, "createdAt"

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v6, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    iget-object v5, p0, Lcom/iterable/iterableapi/j1;->e:Ljava/util/Date;

    if-eqz v5, :cond_2

    const-string v6, "expiresAt"

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v6, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    iget-boolean v5, p0, Lcom/iterable/iterableapi/j1;->q:Z

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    :try_start_2
    const-string v7, "jsonOnly"

    invoke-virtual {v3, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_3
    const-string v7, "trigger"

    iget-object v8, p0, Lcom/iterable/iterableapi/j1;->f:Lcom/iterable/iterableapi/i1;

    iget-object v8, v8, Lcom/iterable/iterableapi/i1;->a:Lorg/json/JSONObject;

    invoke-virtual {v3, v7, v8}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v7, "priorityLevel"

    iget-wide v8, p0, Lcom/iterable/iterableapi/j1;->g:D

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v7, v1, Lcom/iterable/iterableapi/e1;->b:Landroid/graphics/Rect;

    invoke-static {v7}, Lcom/iterable/iterableapi/j1;->c(Landroid/graphics/Rect;)Lorg/json/JSONObject;

    move-result-object v7

    const-string v8, "shouldAnimate"

    iget-boolean v9, v2, Lcom/iterable/iterableapi/g1;->w:Z

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-object v8, v2, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v8, Lcom/iterable/iterableapi/f1;

    iget-object v8, v8, Lcom/iterable/iterableapi/f1;->a:Ljava/lang/String;

    if-eqz v8, :cond_4

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    const-string v9, "alpha"

    iget-object v10, v2, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v10, Lcom/iterable/iterableapi/f1;

    iget-wide v10, v10, Lcom/iterable/iterableapi/f1;->b:D

    invoke-virtual {v8, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v9, "hex"

    iget-object v2, v2, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v2, Lcom/iterable/iterableapi/f1;

    iget-object v2, v2, Lcom/iterable/iterableapi/f1;->a:Ljava/lang/String;

    invoke-virtual {v8, v9, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "bgColor"

    invoke-virtual {v7, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    const-string v2, "inAppDisplaySettings"

    invoke-virtual {v4, v2, v7}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-wide v1, v1, Lcom/iterable/iterableapi/e1;->c:D

    const-wide/16 v7, 0x0

    cmpl-double v7, v1, v7

    if-eqz v7, :cond_5

    const-string v7, "backgroundAlpha"

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v4, v7, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    const-string v1, "content"

    invoke-virtual {v3, v1, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "customPayload"

    iget-object v2, p0, Lcom/iterable/iterableapi/j1;->c:Lorg/json/JSONObject;

    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/iterable/iterableapi/j1;->h:Ljava/lang/Boolean;

    if-eqz v1, :cond_7

    const-string v2, "saveToInbox"

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_6

    if-nez v5, :cond_6

    goto :goto_1

    :cond_6
    const/4 v6, 0x0

    :goto_1
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v3, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    iget-object v1, p0, Lcom/iterable/iterableapi/j1;->i:Lcom/iterable/iterableapi/h1;

    if-eqz v1, :cond_8

    const-string v2, "inboxMetadata"

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    const-string v5, "title"

    iget-object v6, v1, Lcom/iterable/iterableapi/h1;->a:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "subtitle"

    iget-object v6, v1, Lcom/iterable/iterableapi/h1;->b:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "icon"

    iget-object v1, v1, Lcom/iterable/iterableapi/h1;->c:Ljava/lang/String;

    invoke-virtual {v4, v5, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    :try_start_4
    const-string v5, "Error while serializing inbox metadata"

    invoke-static {v0, v5, v1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_2
    invoke-virtual {v3, v2, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_8
    const-string v1, "processed"

    iget-boolean v2, p0, Lcom/iterable/iterableapi/j1;->k:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "consumed"

    iget-boolean v2, p0, Lcom/iterable/iterableapi/j1;->l:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "read"

    iget-boolean v2, p0, Lcom/iterable/iterableapi/j1;->m:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    return-object v3

    :goto_3
    const-string v2, "Error while serializing an in-app message"

    invoke-static {v0, v2, v1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object v3
.end method
