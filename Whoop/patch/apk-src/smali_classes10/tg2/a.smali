.class public abstract Ltg2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/design/models/modal/AnyModal;",
        "a",
        "(Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/design/models/modal/AnyModal;",
        "",
        "event",
        "",
        "b",
        "(Ljava/lang/Object;)Z",
        "start-activity_release"
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
.method public static final a(Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/design/models/modal/AnyModal;
    .locals 11

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/AnyModal;->getModal()Lcom/whoop/design/models/modal/Modal;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/modal/BottomSheet;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/whoop/design/models/modal/BottomSheet;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/modal/BottomSheet;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v3, "start-activity-picker-modal"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v2}, Lcom/whoop/design/models/modal/BottomSheet;->getHeight()Lcom/whoop/design/models/modal/BottomSheetHeight;

    move-result-object v1

    sget-object v6, Lcom/whoop/design/models/modal/BottomSheetHeight;->PARTIAL:Lcom/whoop/design/models/modal/BottomSheetHeight;

    if-ne v1, v6, :cond_2

    goto :goto_2

    :cond_2
    const/16 v9, 0x37

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lcom/whoop/design/models/modal/BottomSheet;->copy$default(Lcom/whoop/design/models/modal/BottomSheet;Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;ILjava/lang/Object;)Lcom/whoop/design/models/modal/BottomSheet;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/whoop/design/models/modal/AnyModal;->copy$default(Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/Modal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lcom/whoop/design/models/modal/ModalLifecycleInteractions;ILjava/lang/Object;)Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_2
    return-object p0
.end method

.method public static final b(Ljava/lang/Object;)Z
    .locals 3

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/whoop/design/item/DesignItemInteraction;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    check-cast p0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {p0}, Lcom/whoop/design/item/DesignItemInteraction;->getActionArgument()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lcom/whoop/whoopaction/domain/models/DismissModalAction;

    if-eqz v0, :cond_0

    return v2

    :cond_0
    instance-of v0, p0, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;->getDismissModal()Z

    move-result p0

    return p0

    :cond_1
    return v1

    :cond_2
    instance-of p0, p0, Lcom/whoop/navigation/e;

    if-eqz p0, :cond_3

    return v2

    :cond_3
    return v1
.end method
