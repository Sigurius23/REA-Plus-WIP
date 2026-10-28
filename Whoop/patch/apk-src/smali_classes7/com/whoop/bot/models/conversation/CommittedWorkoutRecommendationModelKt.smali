.class public final Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModelKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/ActionButton;",
        "",
        "recId",
        "Lcm0/a;",
        "toActionButtonState",
        "(Lcom/whoop/bot/models/conversation/ActionButton;Ljava/lang/String;)Lcm0/a;",
        "bot_release"
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
.method public static final toActionButtonState(Lcom/whoop/bot/models/conversation/ActionButton;Ljava/lang/String;)Lcm0/a;
    .locals 23

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/ActionButton;->getType()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/whoop/bot/models/conversation/ActionButtonType;->PRIMARY:Lcom/whoop/bot/models/conversation/ActionButtonType;

    invoke-static {}, Lcom/whoop/bot/models/conversation/ActionButtonType;->values()[Lcom/whoop/bot/models/conversation/ActionButtonType;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const/4 v7, 0x0

    if-ge v6, v4, :cond_1

    aget-object v8, v3, v6

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    move-object v8, v7

    :goto_1
    if-nez v8, :cond_2

    move-object v11, v2

    goto :goto_2

    :cond_2
    move-object v11, v8

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/ActionButton;->getAction()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/whoop/bot/models/conversation/ActionButtonActionType;->NAVIGATE:Lcom/whoop/bot/models/conversation/ActionButtonActionType;

    invoke-static {}, Lcom/whoop/bot/models/conversation/ActionButtonActionType;->values()[Lcom/whoop/bot/models/conversation/ActionButtonActionType;

    move-result-object v3

    array-length v4, v3

    :goto_3
    if-ge v5, v4, :cond_4

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_4
    move-object v6, v7

    :goto_4
    if-nez v6, :cond_5

    move-object v12, v2

    goto :goto_5

    :cond_5
    move-object v12, v6

    :goto_5
    sget-object v0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModelKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_6

    const/4 v2, 0x2

    if-eq v0, v2, :cond_8

    const/4 v2, 0x3

    if-ne v0, v2, :cond_7

    if-eqz p1, :cond_6

    new-instance v13, Lnl0/d$a;

    const/16 v19, 0x18

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v15, p1

    invoke-direct/range {v13 .. v20}, Lnl0/d$a;-><init>(ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v13

    :cond_6
    move-object v14, v7

    goto :goto_6

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8
    new-instance v13, Lnl0/d$l;

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/ActionButton;->getText()Ljava/lang/String;

    move-result-object v14

    const/16 v21, 0x7e

    const/16 v22, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v13 .. v22}, Lnl0/d$l;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;ZLfl0/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v13

    :goto_6
    new-instance v9, Lcm0/a;

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/ActionButton;->getText()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/ActionButton;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v13

    invoke-direct/range {v9 .. v14}, Lcm0/a;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/ActionButtonType;Lcom/whoop/bot/models/conversation/ActionButtonActionType;Lcom/whoop/navigation/e;Lnl0/d;)V

    return-object v9
.end method

.method public static synthetic toActionButtonState$default(Lcom/whoop/bot/models/conversation/ActionButton;Ljava/lang/String;ILjava/lang/Object;)Lcm0/a;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModelKt;->toActionButtonState(Lcom/whoop/bot/models/conversation/ActionButton;Ljava/lang/String;)Lcm0/a;

    move-result-object p0

    return-object p0
.end method
