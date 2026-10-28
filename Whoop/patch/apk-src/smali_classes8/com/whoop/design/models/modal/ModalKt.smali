.class public final Lcom/whoop/design/models/modal/ModalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "eraseToAny",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "Lcom/whoop/design/models/modal/Modal;",
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
.method public static final eraseToAny(Lcom/whoop/design/models/modal/Modal;)Lcom/whoop/design/models/modal/AnyModal;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/modal/AnyModal;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/modal/AnyModal;-><init>(Lcom/whoop/design/models/modal/Modal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lcom/whoop/design/models/modal/ModalLifecycleInteractions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
