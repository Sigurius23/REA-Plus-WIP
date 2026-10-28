.class public interface abstract Lcom/whoop/activation/domain/models/ActivationFlowStepModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activation/domain/models/ActivationFlowStepModel$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0004R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "getNavigationBarText",
        "()Ljava/lang/String;",
        "navigationBarText",
        "getMobileScreenName",
        "mobileScreenName",
        "getAnalyticsName",
        "analyticsName",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "getProgressCircle",
        "()Lcom/whoop/design/models/ProgressButtonModel;",
        "progressCircle",
        "",
        "getFooterButtons",
        "()Ljava/util/List;",
        "footerButtons",
        "Lcom/whoop/activation/domain/models/FooterAlignment;",
        "getFooterAlignment",
        "()Lcom/whoop/activation/domain/models/FooterAlignment;",
        "footerAlignment",
        "activation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic access$getFooterAlignment$jd(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;)Lcom/whoop/activation/domain/models/FooterAlignment;
    .locals 0

    invoke-super {p0}, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;->getFooterAlignment()Lcom/whoop/activation/domain/models/FooterAlignment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract getAnalyticsName()Ljava/lang/String;
.end method

.method public getFooterAlignment()Lcom/whoop/activation/domain/models/FooterAlignment;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract getFooterButtons()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getMobileScreenName()Ljava/lang/String;
.end method

.method public abstract getNavigationBarText()Ljava/lang/String;
.end method

.method public abstract getProgressCircle()Lcom/whoop/design/models/ProgressButtonModel;
.end method
