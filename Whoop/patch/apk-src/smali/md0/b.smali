.class public final synthetic Lmd0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lmd0/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lmd0/b;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lnm1/h;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    invoke-static {p1}, Lnb1/a;->b(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lnb1/a;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/util/List;

    new-instance v0, Ln0/u;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, v1, p1}, Ln0/u;-><init>(II)V

    return-object v0

    :pswitch_4
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lmu0/e;->v(Ltb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;

    invoke-static {p1}, Lmr0/a;->b(Lcom/whoop/communityhighlights/domain/models/ArchMiniCommunityHighlightsModel;)Lnr0/g;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;

    invoke-static {p1}, Lmr0/a;->e(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;)Lnr0/j;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lmr0/a;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lmr0/a;->c(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lmr0/a;->d(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;

    invoke-static {p1}, Lmo0/b;->e(Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;)Llo0/e0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/clinicianintheloop/domain/models/VisitDetailItemModel;

    invoke-static {p1}, Lmo0/b;->g(Lcom/whoop/clinicianintheloop/domain/models/VisitDetailItemModel;)Llo0/v0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/clinicianintheloop/domain/models/SchedulingOverviewCardModel;

    invoke-static {p1}, Lmo0/b;->d(Lcom/whoop/clinicianintheloop/domain/models/SchedulingOverviewCardModel;)Llo0/n0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lcom/whoop/clinicianintheloop/domain/models/AppointmentConfirmationCardModel;

    invoke-static {p1}, Lmo0/b;->i(Lcom/whoop/clinicianintheloop/domain/models/AppointmentConfirmationCardModel;)Llo0/b;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/clinicianintheloop/domain/models/AppointmentSummaryFieldModel;

    invoke-static {p1}, Lmo0/b;->b(Lcom/whoop/clinicianintheloop/domain/models/AppointmentSummaryFieldModel;)Llo0/d;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;

    invoke-static {p1}, Lmo0/b;->a(Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;)Llo0/e;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;

    invoke-static {p1}, Lmo0/b;->j(Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;)Llo0/f;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lmo0/b;->h(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lmo0/b;->c(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;

    invoke-static {p1}, Lmo0/b;->f(Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;)Llo0/a;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lmo0/b;->k(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lmf1/a;->a(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCtaTileModel;

    invoke-static {p1}, Lmd0/c;->H(Lcom/whoop/advancedlabs/domain/models/ClinicalReportCtaTileModel;)Llf0/m0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;

    invoke-static {p1}, Lmd0/c;->h(Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;)Llf0/f0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    invoke-static {p1}, Lmd0/c;->y(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;)Lld0/d;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lmd0/c;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lmd0/c;->r(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lmd0/c;->A(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/advancedlabs/feature/galleri/models/HorizontalImagePagerModel;

    invoke-static {p1}, Lmd0/c;->n(Lcom/whoop/advancedlabs/feature/galleri/models/HorizontalImagePagerModel;)Lfc0/h;

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
