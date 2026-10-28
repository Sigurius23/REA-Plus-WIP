.class public final Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsScreenPreview$$inlined$WhoopPreviewTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/bot/settings/CoachSettingsScreenKt;->CoachSettingsScreenPreview(Landroidx/compose/runtime/Composer;I)V
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


# instance fields
.field final synthetic $coachingModeState$inlined:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

.field final synthetic $concisenessState$inlined:Lcom/whoop/bot/settings/CoachSettingsConciseState;

.field final synthetic $displayState$inlined:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

.field final synthetic $recommendedActivitiesState$inlined:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;


# direct methods
.method public constructor <init>(Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;Lcom/whoop/bot/settings/CoachSettingsConciseState;Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsScreenPreview$$inlined$WhoopPreviewTheme$1;->$displayState$inlined:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    iput-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsScreenPreview$$inlined$WhoopPreviewTheme$1;->$coachingModeState$inlined:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

    iput-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsScreenPreview$$inlined$WhoopPreviewTheme$1;->$concisenessState$inlined:Lcom/whoop/bot/settings/CoachSettingsConciseState;

    iput-object p4, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsScreenPreview$$inlined$WhoopPreviewTheme$1;->$recommendedActivitiesState$inlined:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

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

    invoke-virtual {p0, p1, p2}, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsScreenPreview$$inlined$WhoopPreviewTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 11

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
    and-int/2addr p2, v3

    move-object v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, -0x611d1ce7

    .line 2
    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    new-instance v3, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsScreenPreview$$inlined$WhoopPreviewTheme$1;->$displayState$inlined:Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    iget-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsScreenPreview$$inlined$WhoopPreviewTheme$1;->$coachingModeState$inlined:Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsScreenPreview$$inlined$WhoopPreviewTheme$1;->$concisenessState$inlined:Lcom/whoop/bot/settings/CoachSettingsConciseState;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsScreenPreview$$inlined$WhoopPreviewTheme$1;->$recommendedActivitiesState$inlined:Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    invoke-direct {v3, p1, p2, v0, v1}, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;-><init>(Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;Lcom/whoop/bot/settings/CoachSettingsConciseState;Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;)V

    const/4 v9, 0x0

    const/16 v10, 0x1e

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->CoachSettingsScreen(Lcom/whoop/bot/settings/CoachSettingsViewState;Leb/u0;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    .line 3
    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    return-void

    .line 4
    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method
