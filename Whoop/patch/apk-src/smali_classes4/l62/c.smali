.class public final Ll62/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo02/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ll62/c;",
        "Lo02/d;",
        "Lu92/d;",
        "sharedPreferences",
        "<init>",
        "(Lu92/d;)V",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "navigationScreenModel",
        "Lj02/m0;",
        "c",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;",
        "a",
        "Lu92/d;",
        "refer-a-friend_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lu92/d;


# direct methods
.method public constructor <init>(Lu92/d;)V
    .locals 1

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll62/c;->a:Lu92/d;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;
    .locals 0

    invoke-virtual {p0, p1}, Ll62/c;->c(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge b(Ljava/util/List;Ljava/util/Map;)Lo02/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo02/d;",
            ">;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lkotlin/jvm/functions/Function1;",
            ">;)",
            "Lo02/d;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lo02/d;->b(Ljava/util/List;Ljava/util/Map;)Lo02/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "navigationScreenModel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lcom/whoop/navigation/ReferAFriendScreenModel;

    const/4 v3, 0x0

    const-string v4, ""

    const-string v5, "Refer_Friend_Message"

    if-eqz v2, :cond_4

    check-cast v1, Lcom/whoop/navigation/ReferAFriendScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ReferAFriendScreenModel;->getShareMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_1

    iget-object v2, v0, Ll62/c;->a:Lu92/d;

    invoke-virtual {v2, v5}, Lu92/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    move-object v6, v4

    goto :goto_1

    :cond_1
    move-object v6, v2

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/navigation/ReferAFriendScreenModel;->getSource()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/navigation/ReferAFriendScreenModel;->getCheckoutOrigin()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->values()[Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    move-result-object v4

    array-length v5, v4

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v5, :cond_3

    aget-object v9, v4, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    move-object v8, v9

    goto :goto_3

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_3
    move-object v8, v3

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/navigation/ReferAFriendScreenModel;->getAnalyticsProperties()Ljava/util/Map;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/ReferAFriendScreenModel;->getDisableDefaultOpenSheetAnalytic()Ljava/lang/Boolean;

    move-result-object v10

    new-instance v5, Lj02/m0$b4;

    invoke-direct/range {v5 .. v10}, Lj02/m0$b4;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;Ljava/util/Map;Ljava/lang/Boolean;)V

    return-object v5

    :cond_4
    instance-of v2, v1, Lcom/whoop/navigation/ReferAFriendHubScreenModel;

    if-eqz v2, :cond_a

    check-cast v1, Lcom/whoop/navigation/ReferAFriendHubScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ReferAFriendHubScreenModel;->getResolveServerSide()Z

    move-result v2

    if-eqz v2, :cond_5

    new-instance v6, Lj02/m0$m1;

    new-instance v7, Lcom/whoop/navigation/models/ApiRequest;

    sget-object v2, Ll62/f;->WEARABLE:Ll62/f;

    invoke-virtual {v1}, Lcom/whoop/navigation/ReferAFriendHubScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll62/d;->a(Ll62/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/whoop/navigation/GenericCachePolicy;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/GenericCachePolicy;-><init>(ZLjava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x3fc

    const/16 v18, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v6 .. v18}, Lj02/m0$m1;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/navigation/ReferAFriendHubScreenModel;->getShareMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_6

    move-object v3, v2

    :cond_6
    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    move-object v4, v3

    goto :goto_5

    :cond_8
    :goto_4
    iget-object v2, v0, Ll62/c;->a:Lu92/d;

    invoke-virtual {v2, v5}, Lu92/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_9

    goto :goto_5

    :cond_9
    move-object v4, v2

    :goto_5
    new-instance v2, Lj02/m0$a4;

    invoke-virtual {v1}, Lcom/whoop/navigation/ReferAFriendHubScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/ReferAFriendHubScreenModel;->getGraphId()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v2, v4, v3, v1}, Lj02/m0$a4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v2

    :cond_a
    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1
.end method
