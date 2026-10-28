.class public abstract Lio0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio0/q$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;",
        "Lio0/v;",
        "type",
        "Lcom/whoop/design/models/items/form/FormTextFieldModel;",
        "a",
        "(Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;Lio0/v;)Lcom/whoop/design/models/items/form/FormTextFieldModel;",
        "clinician-in-the-loop_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;Lio0/v;)Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio0/q$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->getPhoneNumber()Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-result-object p0

    return-object p0

    :pswitch_1
    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->getCountry()Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-result-object p0

    return-object p0

    :pswitch_2
    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->getZipCode()Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-result-object p0

    return-object p0

    :pswitch_3
    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->getState()Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-result-object p0

    return-object p0

    :pswitch_4
    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->getCity()Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-result-object p0

    return-object p0

    :pswitch_5
    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->getAddressLine2()Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-result-object p0

    return-object p0

    :pswitch_6
    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->getAddressLine1()Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-result-object p0

    return-object p0

    :pswitch_7
    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->getDateOfBirth()Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-result-object p0

    return-object p0

    :pswitch_8
    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->getLastName()Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-result-object p0

    return-object p0

    :pswitch_9
    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->getFirstName()Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
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
