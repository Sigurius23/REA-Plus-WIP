.class public abstract Lqr0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a!\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0001H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u0018\u0010\u0008\u001a\u00020\u0005*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "cards",
        "d",
        "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "c",
        "(Lcom/whoop/design/models/DesignSystemModel;)Z",
        "isGrid",
        "community-highlights-container-arch-mini_release"
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
.method public static final synthetic a(Lcom/whoop/design/models/DesignSystemModel;)Z
    .locals 0

    invoke-static {p0}, Lqr0/a;->c(Lcom/whoop/design/models/DesignSystemModel;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 0

    invoke-static {p0, p1}, Lqr0/a;->d(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/whoop/design/models/DesignSystemModel;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    instance-of p0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;

    return p0
.end method

.method private static final d(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/design/models/DesignSystemModel;"
        }
    .end annotation

    move-object/from16 v0, p0

    instance-of v1, v0, Lcom/whoop/design/models/DesignModelWrapper;

    if-eqz v1, :cond_3

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/models/DesignModelWrapper;

    invoke-virtual {v2}, Lcom/whoop/design/models/DesignModelWrapper;->getModel()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/models/items/DesignItemGridModel;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/whoop/design/models/items/DesignItemGridModel;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-eqz v3, :cond_2

    const/16 v18, 0xff

    const/16 v19, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, p1

    invoke-static/range {v3 .. v19}, Lcom/whoop/design/models/items/DesignItemGridModel;->copy$default(Lcom/whoop/design/models/items/DesignItemGridModel;Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/items/DesignItemGridModel;

    move-result-object v3

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/whoop/design/models/DesignModelWrapper;->copy$default(Lcom/whoop/design/models/DesignModelWrapper;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/DesignModelWrapper;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    return-object v0

    :cond_2
    :goto_2
    return-object v2

    :cond_3
    instance-of v1, v0, Lcom/whoop/design/models/items/DesignItemGridModel;

    if-eqz v1, :cond_4

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/models/items/DesignItemGridModel;

    const/16 v18, 0xff

    const/16 v19, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, p1

    invoke-static/range {v3 .. v19}, Lcom/whoop/design/models/items/DesignItemGridModel;->copy$default(Lcom/whoop/design/models/items/DesignItemGridModel;Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/items/DesignItemGridModel;

    move-result-object v0

    :cond_4
    return-object v0
.end method
