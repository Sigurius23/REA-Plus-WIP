.class public final Lcom/whoop/profile/view/ProfileScreenContentKt$PreviewProfileContentArea$$inlined$WhoopPreviewTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/ProfileScreenContentKt;->PreviewProfileContentArea(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $profileInfoTileItems$inlined:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/profile/view/ProfileScreenContentKt$PreviewProfileContentArea$$inlined$WhoopPreviewTheme$1;->$profileInfoTileItems$inlined:Ljava/util/List;

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

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/ProfileScreenContentKt$PreviewProfileContentArea$$inlined$WhoopPreviewTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 v5, p2, 0x1

    move-object/from16 v9, p1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    const v1, -0x662957ef

    .line 2
    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    .line 3
    sget-object v1, Lcom/whoop/profile/samples/ProfileSamples;->INSTANCE:Lcom/whoop/profile/samples/ProfileSamples;

    invoke-virtual {v1}, Lcom/whoop/profile/samples/ProfileSamples;->getSampleProfileViewState()Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object v10

    .line 4
    new-instance v5, Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    .line 5
    new-instance v6, Lcom/whoop/profile/presentation/ProfileViewState$ComponentItem;

    .line 6
    new-instance v7, Lm91/o;

    .line 7
    new-instance v11, Lc41/e5;

    .line 8
    iget-object v8, v0, Lcom/whoop/profile/view/ProfileScreenContentKt$PreviewProfileContentArea$$inlined$WhoopPreviewTheme$1;->$profileInfoTileItems$inlined:Ljava/util/List;

    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Lc41/r4;

    sget-object v14, Lc41/m4;->DOUBLE:Lc41/m4;

    const/16 v25, 0xffd

    const/16 v26, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v12 .. v26}, Lc41/r4;->b(Lc41/r4;Ljava/lang/String;Lc41/m4;Lcom/whoop/design/util/TextResource;Lkd1/o;Lm91/u;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lc41/h4;ILjava/lang/Object;)Lc41/r4;

    move-result-object v12

    .line 9
    iget-object v8, v0, Lcom/whoop/profile/view/ProfileScreenContentKt$PreviewProfileContentArea$$inlined$WhoopPreviewTheme$1;->$profileInfoTileItems$inlined:Ljava/util/List;

    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lc41/r4;

    const/16 v26, 0xffd

    const/16 v27, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    const/16 v25, 0x0

    invoke-static/range {v13 .. v27}, Lc41/r4;->b(Lc41/r4;Ljava/lang/String;Lc41/m4;Lcom/whoop/design/util/TextResource;Lkd1/o;Lm91/u;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lc41/h4;ILjava/lang/Object;)Lc41/r4;

    move-result-object v13

    const/4 v15, 0x4

    const/4 v14, 0x0

    .line 10
    invoke-direct/range {v11 .. v16}, Lc41/e5;-><init>(Lm91/u;Lm91/u;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    .line 11
    invoke-direct {v7, v11, v3, v4, v3}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    new-instance v8, Lm91/o;

    invoke-static {}, Lcom/whoop/profile/view/components/StreaksTileKt;->getSampleStreaksTileWithStreak()Lcom/whoop/profile/view/components/StreaksTileViewState;

    move-result-object v11

    invoke-direct {v8, v11, v3, v4, v3}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    new-instance v11, Lm91/o;

    invoke-static {}, Lcom/whoop/profile/view/components/ReferralsTileKt;->getSampleReferralsTileWithActiveReferrals()Lcom/whoop/profile/view/components/ReferralsTileViewState;

    move-result-object v12

    invoke-direct {v11, v12, v3, v4, v3}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v7, v8, v11}, [Lm91/o;

    move-result-object v7

    .line 14
    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 15
    invoke-direct {v6, v7, v3, v4, v3}, Lcom/whoop/profile/presentation/ProfileViewState$ComponentItem;-><init>(Ljava/util/List;Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    invoke-static {v6}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 17
    invoke-direct {v5, v3}, Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;-><init>(Ljava/util/List;)V

    .line 18
    invoke-virtual {v1}, Lcom/whoop/profile/samples/ProfileSamples;->getSampleProfileViewStateMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v15

    const/16 v17, 0xf

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v5

    .line 19
    invoke-static/range {v10 .. v18}, Lcom/whoop/profile/presentation/ProfileViewState;->copy$default(Lcom/whoop/profile/presentation/ProfileViewState;Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILjava/lang/Object;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object v6

    .line 20
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    .line 21
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_1

    .line 22
    sget-object v1, Lcom/whoop/profile/view/ProfileScreenContentKt$PreviewProfileContentArea$1$1$1;->INSTANCE:Lcom/whoop/profile/view/ProfileScreenContentKt$PreviewProfileContentArea$1$1$1;

    .line 23
    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 24
    :cond_1
    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/16 v10, 0x180

    const/4 v11, 0x2

    const/4 v7, 0x0

    .line 25
    invoke-static/range {v6 .. v11}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen(Lcom/whoop/profile/presentation/ProfileViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 26
    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    return-void

    .line 27
    :cond_2
    invoke-virtual {v9}, Lp1/q;->X()V

    return-void
.end method
