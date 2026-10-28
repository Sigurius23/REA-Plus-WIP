.class public final synthetic Lqv1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lqv1/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqv1/e;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/ActivationFlowCreatePasswordStep;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/activation/domain/models/steps/ActivationFlowCreatePasswordStep;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->r()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->d()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/profile/domain/edit/models/CountryOption;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lr41/h;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lr41/h;->m()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lr41/h;->k()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lr21/f;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lqy0/f;->k()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lqx2/a;->g()Ltr2/n;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/membership/comunityraf/RafItem;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/membership/comunityraf/CommunityRafModel;->a()Lwc3/c;

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
