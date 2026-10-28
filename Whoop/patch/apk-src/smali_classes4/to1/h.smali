.class public final synthetic Lto1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lto1/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lto1/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/design/models/items/HorizontalImpactBarLabeledModel;

    invoke-static {p1}, Lvb1/b;->a(Lcom/whoop/design/models/items/HorizontalImpactBarLabeledModel;)Ly11/q;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    invoke-static {p1}, Lvb1/b;->f(Lcom/whoop/design/models/items/graph/StressGraphingCardModel;)Lk71/c0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/design/models/items/graph/GraphCardCtaModel;

    invoke-static {p1}, Lvb1/b;->c(Lcom/whoop/design/models/items/graph/GraphCardCtaModel;)Lx11/c;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lvb1/b;->e(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Lv61/f;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lv61/a;

    invoke-static {p1}, Lv61/c;->b(Lv61/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lv41/p;->c(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;->a(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lvn1/i;

    invoke-static {p1}, Lun1/g;->j(Lvn1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1}, Lun1/g;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lun1/g;->c(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lvn1/i;

    invoke-static {p1}, Lun1/d;->c(Lvn1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1}, Lun1/d;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lun1/d;->b(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1}, Lum1/d;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lu82/k;->a(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ltb/a;

    invoke-static {p1}, Ltr2/g;->m(Ltb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingTileModel;

    invoke-static {p1}, Lto1/l;->l(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingTileModel;)Lso1/e0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    invoke-static {p1}, Lto1/l;->c(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;)Lf11/e;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lto1/l;->d(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lto1/l;->o(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lto1/l;->u(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalTileModel;

    invoke-static {p1}, Lto1/l;->g(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalTileModel;)Lwo1/g;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TileWithTitleModel;

    invoke-static {p1}, Lto1/l;->t(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TileWithTitleModel;)Lso1/l0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogDataButtonModel;

    invoke-static {p1}, Lto1/l;->f(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogDataButtonModel;)Lso1/s;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciHeaderModel;

    invoke-static {p1}, Lto1/l;->i(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciHeaderModel;)Lso1/y;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciMedicalDisclaimerModel;

    invoke-static {p1}, Lto1/l;->q(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciMedicalDisclaimerModel;)Lso1/z;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsLoaderModel;

    invoke-static {p1}, Lto1/l;->k(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsLoaderModel;)Lso1/m;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalTileModel;

    invoke-static {p1}, Lto1/l;->m(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalTileModel;)Lwo1/g;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;

    invoke-static {p1}, Lto1/l;->h(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;)Lwo1/n0;

    move-result-object p1

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
