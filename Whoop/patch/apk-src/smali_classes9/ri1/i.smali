.class public final Lri1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lri1/i;",
        "",
        "<init>",
        "()V",
        "item",
        "",
        "id",
        "",
        "b",
        "(Ljava/lang/Object;Ljava/lang/String;)Z",
        "Lcom/whoop/health/domain/models/HealthTabResponse;",
        "response",
        "a",
        "(Lcom/whoop/health/domain/models/HealthTabResponse;Ljava/lang/String;)Lcom/whoop/health/domain/models/HealthTabResponse;",
        "health_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lri1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lri1/i;

    invoke-direct {v0}, Lri1/i;-><init>()V

    sput-object v0, Lri1/i;->a:Lri1/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 1

    instance-of v0, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    instance-of v0, p1, Lcom/whoop/design/models/items/EntryPointModel;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/whoop/design/models/items/EntryPointModel;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/EntryPointModel;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final a(Lcom/whoop/health/domain/models/HealthTabResponse;Ljava/lang/String;)Lcom/whoop/health/domain/models/HealthTabResponse;
    .locals 8

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/health/domain/models/HealthTabResponse;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/health/domain/models/HealthTabSectionModel;

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HealthTabSectionModel;->getItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/DesignSystemModel;

    sget-object v7, Lri1/i;->a:Lri1/i;

    invoke-direct {v7, v6, p2}, Lri1/i;->b(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v4, v5, v3, v5}, Lcom/whoop/health/domain/models/HealthTabSectionModel;->copy$default(Lcom/whoop/health/domain/models/HealthTabSectionModel;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/health/domain/models/HealthTabSectionModel;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/whoop/health/domain/models/HealthTabResponse;->copy$default(Lcom/whoop/health/domain/models/HealthTabResponse;Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/health/domain/models/HealthTabResponse;

    move-result-object p1

    return-object p1
.end method
