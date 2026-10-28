.class public abstract Lot2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;",
        "model",
        "Ly81/e;",
        "a",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ly81/e;",
        "weekly-plan_release"
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
.method public static final a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ly81/e;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Lm83/y;->w:Lm83/y;

    if-nez v0, :cond_1

    move-object v0, v2

    :cond_1
    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getStyle()Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    move-result-object p0

    invoke-static {p0}, Llb1/v1;->a(Lcom/whoop/design/models/items/GoalSettingsTileStyle;)Ly81/e;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    return-object p0

    :cond_5
    :goto_2
    sget-object p0, Lot2/d$a;->w:Lot2/d$a;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0
.end method
