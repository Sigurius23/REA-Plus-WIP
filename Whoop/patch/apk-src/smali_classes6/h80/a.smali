.class public abstract Lh80/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;",
        "",
        "a",
        "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;)Ljava/lang/String;",
        "activation_release"
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
.method public static final a(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;

    if-eqz p0, :cond_0

    const-string p0, "20_dollar_discount"

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
