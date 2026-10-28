.class public abstract Lb72/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/sage/design/sagemeter/SageGaugeModel;",
        "model",
        "",
        "isContinuousDial",
        "Lb72/e;",
        "a",
        "(Lcom/whoop/sage/design/sagemeter/SageGaugeModel;Z)Lb72/e;",
        "sage_release"
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
.method public static final a(Lcom/whoop/sage/design/sagemeter/SageGaugeModel;Z)Lb72/e;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->getGaugeLastUpdatedDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->getGaugeSubtextDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->getGaugeLastUpdatedDisplayStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lb72/f;->DATA_PRESENT:Lb72/f;

    invoke-static {}, Lb72/f;->values()[Lb72/f;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    :goto_1
    if-nez v7, :cond_2

    move-object v4, v1

    goto :goto_2

    :cond_2
    move-object v4, v7

    :goto_2
    new-instance v5, Lb72/d;

    invoke-virtual {p0}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->getGaugeLeftSubtext()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;->getSubtextTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->getGaugeLeftSubtext()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;->getSubtextValueDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->getGaugeLeftSubtext()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;->getSubtextUnitsDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v0, v1, v6}, Lb72/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Lb72/d;

    invoke-virtual {p0}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->getGaugeRightSubtext()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;->getSubtextTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->getGaugeRightSubtext()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;->getSubtextValueDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->getGaugeRightSubtext()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;->getSubtextUnitsDisplay()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v0, v1, v7}, Lb72/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->getGaugeFillPercentage()Ljava/lang/Float;

    move-result-object v7

    new-instance v1, Lb72/e;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v11, 0xc0

    const/4 v12, 0x0

    move v10, p1

    invoke-direct/range {v1 .. v12}, Lb72/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lb72/f;Lb72/d;Lb72/d;Ljava/lang/Float;ZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
