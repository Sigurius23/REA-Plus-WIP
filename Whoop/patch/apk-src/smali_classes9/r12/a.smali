.class public final synthetic Lr12/a;
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

    iput p2, p0, Lr12/a;->w:I

    iput-object p1, p0, Lr12/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lr12/a;->w:I

    const/4 v3, 0x3

    const-string v4, "viewModel"

    const-string v5, "$this$doWithCardWidgetViewModel"

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    iget-object v9, v0, Lr12/a;->x:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v9, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->A(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v9, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move-object/from16 v2, p2

    check-cast v2, Lcom/whoop/domain/model/UnitSystem;

    invoke-static {v9, v1, v2}, Ltc1/a;->c(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object v1

    return-object v1

    :pswitch_1
    check-cast v9, Lt20/w;

    check-cast v1, Lt20/g;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const-string v3, "state"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lt20/g;->z:Lt20/b;

    if-eqz v3, :cond_0

    iget-boolean v4, v3, Lt20/b;->G:Z

    invoke-virtual {v9, v4, v2}, Lt20/w;->g(ZZ)Lzy/c;

    move-result-object v7

    :cond_0
    move-object v14, v7

    if-eqz v3, :cond_1

    if-eqz v14, :cond_1

    iget-object v9, v3, Lt20/b;->w:Lt20/f;

    iget-object v10, v3, Lt20/b;->x:Ljava/lang/String;

    iget-object v11, v3, Lt20/b;->y:Ljava/lang/String;

    iget-object v12, v3, Lt20/b;->z:Ljava/lang/String;

    iget-object v13, v3, Lt20/b;->E:Ljava/lang/String;

    iget-boolean v15, v3, Lt20/b;->G:Z

    iget-boolean v2, v3, Lt20/b;->H:Z

    const-string v3, "resultIdentifier"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lt20/b;

    move/from16 v16, v2

    invoke-direct/range {v8 .. v16}, Lt20/b;-><init>(Lt20/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzy/c;ZZ)V

    const/16 v2, 0x17

    invoke-static {v1, v6, v8, v2}, Lt20/g;->b(Lt20/g;ZLt20/b;I)Lt20/g;

    move-result-object v1

    :cond_1
    return-object v1

    :pswitch_2
    check-cast v9, Ld30/f0;

    move-object/from16 v16, v1

    check-cast v16, Lzy/c;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v9, Ld30/f0;->h:Ljava/lang/Object;

    check-cast v1, Lt10/e;

    iget-object v2, v1, Lt10/e;->f:Lec3/h2;

    :cond_2
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lt10/j;

    const/4 v15, 0x0

    const/16 v17, 0x3f

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v17}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v8

    :pswitch_3
    check-cast v9, Lcom/whoop/debug/localservice/DebugLocalServiceFragment;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lcom/whoop/debug/localservice/DebugLocalServiceFragment;->y(Lcom/whoop/debug/localservice/DebugLocalServiceFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    check-cast v9, Lcom/whoop/healthconnect/view/HealthConnectFragment;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lcom/whoop/healthconnect/view/HealthConnectFragment;->C(Lcom/whoop/healthconnect/view/HealthConnectFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    check-cast v9, Lsi0/e;

    check-cast v1, Lcom/whoop/archv2/model/template/ScreenTemplate;

    move-object/from16 v2, p2

    check-cast v2, Ljava/util/Map;

    invoke-static {v9, v1, v2}, Lsi0/e;->a(Lsi0/e;Lcom/whoop/archv2/model/template/ScreenTemplate;Ljava/util/Map;)Lti0/a;

    move-result-object v1

    return-object v1

    :pswitch_6
    check-cast v9, Lcom/whoop/educationModels/PodcastPlayer;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lse1/a;->b(Lcom/whoop/educationModels/PodcastPlayer;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    check-cast v9, Lsc3/s;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, v9, Lsc3/s;->b:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqc3/l0;

    iget-object v5, v4, Lqc3/l0;->a:Lsc3/r;

    iget-object v5, v5, Lsc3/r;->a:Lkotlin/jvm/internal/q;

    invoke-interface {v5, v1}, Lj93/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    iget-object v4, v4, Lqc3/l0;->a:Lsc3/r;

    if-eq v2, v5, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    move v5, v6

    :goto_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lsc3/r;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    return-object v8

    :pswitch_8
    check-cast v9, Lcom/whoop/advancedlabs/feature/marketingconsent/view/MarketingConsentFragment;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lcom/whoop/advancedlabs/feature/marketingconsent/view/MarketingConsentFragment;->z(Lcom/whoop/advancedlabs/feature/marketingconsent/view/MarketingConsentFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_9
    check-cast v9, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->A(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    check-cast v9, Ls51/h;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Ls51/g;->c(Ls51/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    check-cast v9, Ls50/d;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Ls50/c;->c(Ls50/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    check-cast v9, Lcom/stripe/android/view/CardNumberEditText;

    check-cast v1, Landroidx/lifecycle/g0;

    move-object/from16 v2, p2

    check-cast v2, Ls40/d0;

    sget v6, Lcom/stripe/android/view/CardNumberEditText;->p0:I

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v2, Ls40/d0;->E:Lec3/h2;

    sget-object v4, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    invoke-static {v1}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v4

    new-instance v5, Ln43/a;

    invoke-direct {v5, v1, v2, v7, v9}, Ln43/a;-><init>(Landroidx/lifecycle/g0;Lec3/l;Lq83/d;Lcom/stripe/android/view/CardNumberEditText;)V

    invoke-static {v4, v7, v7, v5, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v8

    :pswitch_d
    check-cast v9, Lcom/stripe/android/view/CardMultilineWidget;

    check-cast v1, Landroidx/lifecycle/g0;

    move-object/from16 v2, p2

    check-cast v2, Ls40/d0;

    sget-object v10, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v9, Lcom/stripe/android/view/CardMultilineWidget;->U:Ljava/lang/String;

    if-eqz v4, :cond_5

    iget-object v5, v2, Ls40/d0;->F:Ljava/lang/String;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    iget-object v4, v9, Lcom/stripe/android/view/CardMultilineWidget;->U:Ljava/lang/String;

    iput-object v4, v2, Ls40/d0;->F:Ljava/lang/String;

    invoke-static {v2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v4

    iget-object v5, v2, Ls40/d0;->y:Lbc3/z;

    new-instance v10, Ls40/c0;

    invoke-direct {v10, v2, v7, v6}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v6, 0x2

    invoke-static {v4, v5, v7, v10, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_5
    iget-object v2, v2, Ls40/d0;->E:Lec3/h2;

    sget-object v4, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    invoke-static {v1}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v4

    new-instance v5, Ln43/a;

    invoke-direct {v5, v1, v2, v7, v9}, Ln43/a;-><init>(Landroidx/lifecycle/g0;Lec3/l;Lq83/d;Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-static {v4, v7, v7, v5, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v8

    :pswitch_e
    check-cast v9, Lrx0/c;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lrx0/e;->b(Lrx0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_f
    check-cast v9, Lcom/whoop/debug/jsonplayground/JsonPlaygroundResultFragment;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundResultFragment;->z(Lcom/whoop/debug/jsonplayground/JsonPlaygroundResultFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_10
    check-cast v9, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->y(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_11
    check-cast v9, Lcom/whoop/contentsearch/view/ContentSearchFragment;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->z(Lcom/whoop/contentsearch/view/ContentSearchFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    check-cast v9, Lcom/whoop/labrador/LabradorResultsFragment;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lcom/whoop/labrador/LabradorResultsFragment;->C(Lcom/whoop/labrador/LabradorResultsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_13
    check-cast v9, Lrq2/k0;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lrq2/n0;->a(Lrq2/k0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_14
    check-cast v9, Lv41/r0;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lrq2/c0;->c(Lv41/r0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_15
    check-cast v9, Lrq2/s;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lrq2/v;->b(Lrq2/s;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    check-cast v9, Lrp2/b;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lrp2/d;->c(Lrp2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    check-cast v9, Leb/u0;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lrm2/e;->z(Leb/u0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    check-cast v9, Lld1/c;

    check-cast v1, Ljava/lang/String;

    move-object/from16 v2, p2

    check-cast v2, Lvn1/a;

    invoke-static {v9, v1, v2}, Lrm1/i;->i(Lld1/c;Ljava/lang/String;Lvn1/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_19
    check-cast v9, Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;->G(Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    check-cast v9, Lkotlin/jvm/internal/k0;

    check-cast v1, Ljava/lang/String;

    move-object/from16 v2, p2

    check-cast v2, Ljava/util/List;

    const-string v3, "key"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "values"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v9, v1, v3}, Lkotlin/jvm/internal/k0;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    return-object v8

    :pswitch_1b
    check-cast v9, Lm62/m;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lr62/b;->a(Lm62/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    check-cast v9, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v1, v2}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->B(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

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
