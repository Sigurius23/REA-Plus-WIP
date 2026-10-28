.class public abstract Lur0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "",
        "",
        "accumulatedState",
        "b",
        "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;",
        "community-moments_release"
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
.method public static final synthetic a(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 0

    invoke-static {p0, p1}, Lur0/d;->b(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/DesignSystemModel;"
        }
    .end annotation

    instance-of v0, p0, Lcom/whoop/design/models/WithGeneratedBindings;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    instance-of v0, p1, Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v0, :cond_2

    move-object v1, p1

    check-cast v1, Lcom/whoop/design/models/DesignSystemModel;

    :cond_2
    if-nez v1, :cond_3

    return-object p0

    :cond_3
    return-object v1
.end method
