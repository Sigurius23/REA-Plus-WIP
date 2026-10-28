.class public abstract Llb1/k4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ShippingProgressBarModel;",
        "Lsz0/b1;",
        "a",
        "(Lcom/whoop/design/models/items/ShippingProgressBarModel;)Lsz0/b1;",
        "design-models_release"
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
.method public static final a(Lcom/whoop/design/models/items/ShippingProgressBarModel;)Lsz0/b1;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lsz0/b1;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ShippingProgressBarModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ShippingProgressBarModel;->getProgressPercentage()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ShippingProgressBarModel;->getLeadingSubtext()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ShippingProgressBarModel;->getTrailingSubtext()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ShippingProgressBarModel;->getIcon()Lgz0/m0;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ShippingProgressBarModel;->getLeadingIcon()Lgz0/m0;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ShippingProgressBarModel;->getHideProgressBar()Z

    move-result v8

    invoke-direct/range {v1 .. v8}, Lsz0/b1;-><init>(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Z)V

    return-object v1
.end method
