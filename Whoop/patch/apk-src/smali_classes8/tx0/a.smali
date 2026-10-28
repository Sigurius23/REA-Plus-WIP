.class public final synthetic Ltx0/a;
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
    iput p2, p0, Ltx0/a;->w:I

    iput-object p1, p0, Ltx0/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, Ltx0/a;->w:I

    iput-object p1, p0, Ltx0/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Ltx0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/text/Collator;

    check-cast p1, Lcom/stripe/android/core/model/Country;

    check-cast p2, Lcom/stripe/android/core/model/Country;

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/stripe/android/core/model/Country;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/debug/whoopble/WhoopBleDebugFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/debug/whoopble/WhoopBleDebugFragment;->y(Lcom/whoop/debug/whoopble/WhoopBleDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->B(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->A(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lvq2/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lvq2/g;->a(Lvq2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->B(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;->y(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;->z(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->z(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->y(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;->C(Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Ln6/o;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ls2/h;->d(Ln6/o;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lv20/r;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Lrg/a;->b(Lv20/r;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/nativestore/home/view/NativeStoreFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/nativestore/home/view/NativeStoreFragment;->A(Lcom/whoop/nativestore/home/view/NativeStoreFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/debug/share/ShareDebugFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/debug/share/ShareDebugFragment;->z(Lcom/whoop/debug/share/ShareDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Luq2/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Luq2/h;->b(Luq2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Luq2/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Luq2/g;->e(Luq2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Ll83/h;

    check-cast p1, Lcom/whoop/archv2/feature/domain/p;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, p1, p2}, Lui0/n;->l(Ll83/h;Lcom/whoop/archv2/feature/domain/p;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/archv2/feature/view/GenericFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/archv2/feature/view/GenericFragment;->A(Lcom/whoop/archv2/feature/view/GenericFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, [Lc93/m;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "str"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    :try_start_0
    invoke-interface {v4, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lug/f;
    :try_end_0
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_1

    return-object v4

    :cond_1
    new-instance p2, Laws/smithy/kotlin/runtime/time/ParseException;

    const-string v0, "no alternatives matched"

    invoke-direct {p2, p1, v0, v1}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw p2

    :pswitch_13
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabsjoin/feature/join/view/AdvancedLabsJoinFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabsjoin/feature/join/view/AdvancedLabsJoinFragment;->y(Lcom/whoop/advancedlabsjoin/feature/join/view/AdvancedLabsJoinFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Ltd2/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lud2/b;->a(Ltd2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;->z(Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->J(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lu0/r1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lu0/r1;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_18
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lu0/d1;

    check-cast p1, Lu2/r;

    check-cast p2, Lh2/b;

    iget-wide p1, p2, Lh2/b;->a:J

    invoke-interface {v0, p1, p2}, Lu0/d1;->d(J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_19
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Lu0/n0;->g(Lf1/s1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lf1/a1;

    check-cast p1, Ly1/b;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lf1/c1;->a(Lf1/a1;J)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    :goto_2
    return-object p2

    :pswitch_1b
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Ltz0/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Ltz0/b;->b(Ltz0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Ltx0/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/debug/lottietester/LottieTesterFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/debug/lottietester/LottieTesterFragment;->z(Lcom/whoop/debug/lottietester/LottieTesterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

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
