.class public final synthetic Lw20/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw20/q;->w:I

    iput-object p1, p0, Lw20/q;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lw20/b0;I)V
    .locals 0

    .line 2
    const/4 p2, 0x0

    iput p2, p0, Lw20/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw20/q;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lw20/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/management/MembershipManagementFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/membership/management/MembershipManagementFragment;->z(Lcom/whoop/membership/management/MembershipManagementFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lwt2/g;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lzt2/j;->f(Lwt2/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lzt2/e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lzt2/d;->d(Lzt2/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/scheduleprimer/view/SchedulePrimerFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/scheduleprimer/view/SchedulePrimerFragment;->y(Lcom/whoop/advancedlabs/scheduleprimer/view/SchedulePrimerFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lza2/j;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lza2/j;->D(Lza2/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->D(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sanguine/view/SanguineWaitlistBiomarkerListFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/sanguine/view/SanguineWaitlistBiomarkerListFragment;->z(Lcom/whoop/sanguine/view/SanguineWaitlistBiomarkerListFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/access/omronauth/view/OmronAuthFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->B(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;->z(Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Luw1/d$a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lyw1/o;->f(Luw1/d$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Luw1/c$a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lyw1/h;->b(Luw1/c$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->B(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/feedbacksurvey/view/FeedbackSurveyFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/feedbacksurvey/view/FeedbackSurveyFragment;->z(Lcom/whoop/feedbacksurvey/view/FeedbackSurveyFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/entitlements/ui/NotFoundFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/entitlements/ui/NotFoundFragment;->y(Lcom/whoop/entitlements/ui/NotFoundFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, [C

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v1, "$this$DelimitedRangesSequence"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, p2, v1}, Lyb3/r;->h0(Ljava/lang/CharSequence;[CIZ)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object p1, v0

    :goto_0
    return-object p1

    :pswitch_e
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;->E(Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lxz0/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lxz0/e;->k(Lxz0/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/CommunityAddMemberFragment;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, p1, p2}, Lcom/whoop/community/CommunityAddMemberFragment;->G(Lcom/whoop/community/CommunityAddMemberFragment;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lti2/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lxi2/b;->a(Lti2/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->z(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/language/LanguagePrefsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/language/LanguagePrefsFragment;->y(Lcom/whoop/settings/language/LanguagePrefsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/allrecordings/view/AllRecordingsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/allrecordings/view/AllRecordingsFragment;->A(Lcom/whoop/advancedlabs/allrecordings/view/AllRecordingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lx30/e0;

    check-cast p1, Ly00/i;

    check-cast p2, Ljava/lang/String;

    const-string v1, "brand"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "fieldValue"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lx30/e0;->a:Ld0/o2;

    invoke-virtual {p1}, Ly00/i;->b()I

    move-result v1

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-virtual {v0, p1, v2, p2, v1}, Ld0/o2;->j(Ly00/i;Ljava/util/List;Ljava/lang/String;I)Lg40/s3;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lx30/k;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/String;

    const-string v1, "fieldValue"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lx30/k;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Ll40/a;

    invoke-direct {v1, p2, p1}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lso1/e0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lwo1/k0;->d(Lso1/e0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lso1/z;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lwo1/y;->b(Lso1/z;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/streaks/view/StreaksFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/streaks/view/StreaksFragment;->A(Lcom/whoop/streaks/view/StreaksFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lyf/k;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    const-string v1, "key"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "values"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p2

    check-cast v2, Ljava/lang/Iterable;

    const-string p2, ": "

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/16 v7, 0x38

    const-string v3, ";"

    const-string v5, "\r\n"

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/achievements/view/AchievementsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/achievements/view/AchievementsFragment;->z(Lcom/whoop/achievements/view/AchievementsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lw20/q;->x:Ljava/lang/Object;

    check-cast v0, Lw20/b0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ls2/d;->c(Lw20/b0;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
