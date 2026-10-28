.class public interface abstract Lcom/whoop/membership/dunning/domain/api/DunningApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0004\u00a8\u0006\u0007\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/membership/dunning/domain/api/DunningApi;",
        "",
        "Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;",
        "fetchPaymentsOptionsDunningBottomSheet",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;",
        "fetchCycleDataDunningBottomSheet",
        "membership_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract fetchCycleDataDunningBottomSheet(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/membership-service/v1/dunning/cycle-data-bottom-sheet"
    .end annotation
.end method

.method public abstract fetchPaymentsOptionsDunningBottomSheet(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/membership-service/v1/dunning/payment-options-bottom-sheet"
    .end annotation
.end method
