.class public abstract Lmo0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;",
        "Llo0/a;",
        "a",
        "(Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;)Llo0/a;",
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
.method public static final a(Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;)Llo0/a;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llo0/a;

    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;->isSelected()Z

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;->getSelectedColor()Ly81/f;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;->getSelectedBorderColor()Ly81/f;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Llo0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZLy81/f;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method
