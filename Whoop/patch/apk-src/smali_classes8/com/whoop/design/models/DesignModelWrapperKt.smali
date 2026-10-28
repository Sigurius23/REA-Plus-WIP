.class public final Lcom/whoop/design/models/DesignModelWrapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "applyBindings",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "bindings",
        "",
        "",
        "accumulatedState",
        "",
        "design-models_release"
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
.method public static final synthetic access$applyBindings(Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/analytics/AnalyticEventModel;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/design/models/DesignModelWrapperKt;->applyBindings(Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    return-object p0
.end method

.method private static final applyBindings(Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/analytics/AnalyticEventModel;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/analytics/AnalyticEventModel;"
        }
    .end annotation

    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/AnalyticEventModel;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/AnalyticEventModel;->getCategory()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/AnalyticEventModel;->getSource()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/AnalyticEventModel;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/AnalyticEventModel;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/AnalyticEventModel;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v8, v0

    move-object v9, v1

    move-object v10, v2

    move-object v11, v3

    move-object v12, v4

    move-object v13, v5

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object/from16 v2, p2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_1

    check-cast v0, Ljava/lang/String;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "value"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    move-object v13, v0

    goto :goto_0

    :sswitch_1
    const-string v3, "label"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    move-object v12, v0

    goto :goto_0

    :sswitch_2
    const-string v3, "category"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    move-object v9, v0

    goto :goto_0

    :sswitch_3
    const-string v3, "name"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    move-object v8, v0

    goto :goto_0

    :sswitch_4
    const-string v3, "source"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    move-object v10, v0

    goto :goto_0

    :sswitch_5
    const-string v3, "action"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_8
    move-object v11, v0

    goto :goto_0

    :cond_9
    const/16 v15, 0x40

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object/from16 v7, p0

    invoke-static/range {v7 .. v16}, Lcom/whoop/analytics/AnalyticEventModel;->copy$default(Lcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x54d081ca -> :sswitch_5
        -0x356f97e5 -> :sswitch_4
        0x337a8b -> :sswitch_3
        0x302bcfe -> :sswitch_2
        0x61f7ef4 -> :sswitch_1
        0x6ac9171 -> :sswitch_0
    .end sparse-switch
.end method
