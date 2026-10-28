.class public final synthetic Lu91/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu91/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lu91/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/helpcenter/data/network/model/CallSectionDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lui1/a;->l()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lui1/a;->b()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lui0/r;->d()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lui0/p;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lui0/n;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lui0/n;->b()Lp1/a1;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lui0/c;->b()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lui0/c;->c()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lui0/c;->f()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lug2/d;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyStickyModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Luf0/j;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Luf0/g;->d()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_13
    const-string v0, "operation failed"

    return-object v0

    :pswitch_14
    const-string v0, "operation completed successfully"

    return-object v0

    :pswitch_15
    const-string v0, "operation started"

    return-object v0

    :pswitch_16
    invoke-static {}, Luc1/a;->b()Ljb1/a;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->G()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/design/models/celebration/TextOverlayStyle;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/design/models/celebration/SlotOptionsModel$UnknownOptionsModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

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
