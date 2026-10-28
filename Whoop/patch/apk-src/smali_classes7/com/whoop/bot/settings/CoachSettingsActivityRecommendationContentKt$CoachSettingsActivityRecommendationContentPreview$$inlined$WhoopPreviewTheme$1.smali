.class public final Lcom/whoop/bot/settings/CoachSettingsActivityRecommendationContentKt$CoachSettingsActivityRecommendationContentPreview$$inlined$WhoopPreviewTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/bot/settings/CoachSettingsActivityRecommendationContentKt;->CoachSettingsActivityRecommendationContentPreview(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/whoop/bot/settings/CoachSettingsActivityRecommendationContentKt$CoachSettingsActivityRecommendationContentPreview$$inlined$WhoopPreviewTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 15

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x4b224780    # 1.0635136E7f

    .line 2
    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    .line 3
    new-instance v3, Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    .line 4
    const-string v0, "Activity Recommendations"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    .line 5
    const-string v12, "WHOOP_COACH_RECOMMENDED_ACTIVITIES"

    move-object v7, v3

    invoke-direct/range {v7 .. v14}, Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/settings/RecommendedActivitiesMode;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v8, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 6
    invoke-static/range {v3 .. v8}, Lcom/whoop/bot/settings/CoachSettingsActivityRecommendationContentKt;->CoachSettingsActivityRecommendationContent(Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 7
    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    return-void

    .line 8
    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    return-void
.end method
