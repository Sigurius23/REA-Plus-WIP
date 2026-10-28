.class public final synthetic Lmd0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lmd0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmd0/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsRecordingSection;

    invoke-static {p1}, Lmd0/c;->i(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsRecordingSection;)Lld0/b;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;

    invoke-static {p1}, Lmd0/c;->K(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;)Lkf0/k;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/CollectionMethodTileModel;

    invoke-static {p1}, Lmd0/c;->p(Lcom/whoop/advancedlabs/domain/models/CollectionMethodTileModel;)Llf0/p0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/TestTileModel;

    invoke-static {p1}, Lmd0/c;->x(Lcom/whoop/advancedlabs/domain/models/TestTileModel;)Llf0/l2;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/TitleSectionModel;

    invoke-static {p1}, Lmd0/c;->q(Lcom/whoop/advancedlabs/domain/models/TitleSectionModel;)Llf0/o2;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/InsightsSectionHeaderModel;

    invoke-static {p1}, Lmd0/c;->F(Lcom/whoop/advancedlabs/domain/models/InsightsSectionHeaderModel;)Llf0/a1;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;

    invoke-static {p1}, Lmd0/c;->w(Lcom/whoop/advancedlabs/domain/models/SchedulingDatePickerModel;)Lge0/f;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lmd0/c;->s(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/HealthspanImpactCardModel;

    invoke-static {p1}, Lmd0/c;->I(Lcom/whoop/advancedlabs/domain/models/HealthspanImpactCardModel;)Lld0/p;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/RemainingTestsCalloutModel;

    invoke-static {p1}, Lmd0/c;->L(Lcom/whoop/advancedlabs/domain/models/RemainingTestsCalloutModel;)Llf0/w1;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;

    invoke-static {p1}, Lmd0/c;->f(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;)Llf0/m;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/PanelUpsellDrawerModel;

    invoke-static {p1}, Lmd0/c;->k(Lcom/whoop/advancedlabs/domain/models/PanelUpsellDrawerModel;)Lld0/q;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/SpecializedPanelUpsellTileModel;

    invoke-static {p1}, Lmd0/c;->j(Lcom/whoop/advancedlabs/domain/models/SpecializedPanelUpsellTileModel;)Lld0/s;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/PromotionalBiomarkerPieChartModel;

    invoke-static {p1}, Lmd0/c;->e(Lcom/whoop/advancedlabs/domain/models/PromotionalBiomarkerPieChartModel;)Llf0/t1;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;

    invoke-static {p1}, Lmd0/c;->d(Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;)Llf0/a2;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadInfoTileModel;

    invoke-static {p1}, Lmd0/c;->C(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadInfoTileModel;)Lcf0/c;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/WhatsIncludedCardModel;

    invoke-static {p1}, Lmd0/c;->J(Lcom/whoop/advancedlabs/domain/models/WhatsIncludedCardModel;)Llf0/r2;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/ImageSplitContainerModel;

    invoke-static {p1}, Lmd0/c;->E(Lcom/whoop/advancedlabs/domain/models/ImageSplitContainerModel;)Llf0/w0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lmd0/c;->b(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/ChecklistCardModel;

    invoke-static {p1}, Lmd0/c;->o(Lcom/whoop/advancedlabs/domain/models/ChecklistCardModel;)Lld0/m;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/AppointmentInfoCardModel;

    invoke-static {p1}, Lmd0/c;->z(Lcom/whoop/advancedlabs/domain/models/AppointmentInfoCardModel;)Llf0/h;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsRecordData;

    invoke-static {p1}, Lmd0/c;->t(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsRecordData;)Lld0/a;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/SearchableBiomarkersListModel;

    invoke-static {p1}, Lmd0/c;->m(Lcom/whoop/advancedlabs/domain/models/SearchableBiomarkersListModel;)Lld0/r;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;

    invoke-static {p1}, Lmd0/c;->v(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;)Llf0/u;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;

    invoke-static {p1}, Lmd0/c;->a(Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;)Llf0/y;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/LabsTestSelectionModel;

    invoke-static {p1}, Lmd0/c;->g(Lcom/whoop/advancedlabs/domain/models/LabsTestSelectionModel;)Llf0/m1;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/LabsTestListCalloutModel;

    invoke-static {p1}, Lmd0/c;->G(Lcom/whoop/advancedlabs/domain/models/LabsTestListCalloutModel;)Llf0/i1;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/LabsTestItemModel;

    invoke-static {p1}, Lmd0/c;->l(Lcom/whoop/advancedlabs/domain/models/LabsTestItemModel;)Llf0/d1;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;

    invoke-static {p1}, Lmd0/c;->D(Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;)Llf0/j0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lmd0/c;->B(Ljb1/b;)Ll83/a0;

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
