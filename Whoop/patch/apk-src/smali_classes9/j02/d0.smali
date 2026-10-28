.class public final synthetic Lj02/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lj02/d0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lj02/d0;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/navigation/UpcycleLandingScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/navigation/UniversalCheckoutPayload;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/navigation/StartActivityScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/navigation/ShepherdSettingsModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/navigation/ShepherdRegistrationModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/navigation/ShepherdOnboardingModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/navigation/ShepherdHistoryModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/navigation/ShepherdAboutModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/navigation/SanguineWaitlistBiomarkersScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/navigation/SageOnboardingScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/navigation/ReturnsScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/navigation/ReferAFriendScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/navigation/ReactivationUpsellScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/navigation/PrivacyScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/navigation/PopUpToModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/navigation/PairDeviceScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/navigation/MyAccountScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/navigation/MenuScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/navigation/MembershipManagementScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/navigation/MembershipAndBillingScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/navigation/LegacyProCheckoutScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/navigation/LanguageSettingsScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/navigation/LabradorResultsModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/navigation/LabradorRegistrationModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/navigation/LabradorOnboardingModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/navigation/LabradorDeviceLocationModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/navigation/LabradorAboutScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/navigation/IntegrationsDisclaimerScreenModel;->a()Lwc3/c;

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
