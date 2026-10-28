.class public final synthetic Lh00/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lh00/d0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh00/d0;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lhb1/m;->n()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lh60/f;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lh51/d;->l()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lh51/d;->h()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/privacyconsent/api/DataSharingResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/privacyconsent/api/AccountDataSharingResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lh31/t;->a()Lad3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    const-string v0, "PaymentSheet must be created in the context of an Activity"

    return-object v0

    :pswitch_17
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_18
    const-string v0, "PaymentSheet.FlowController must be created in the context of an Activity"

    return-object v0

    :pswitch_19
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lh01/x;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    sget v0, Lh00/n0;->a:F

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1c
    sget-object v0, Lh00/f0;->a:Lp1/b0;

    const/4 v0, 0x0

    return-object v0

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
