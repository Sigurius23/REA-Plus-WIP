.class public final Lcom/whoop/design/models/DesignSystemModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "unwrap",
        "Lcom/whoop/design/models/DesignSystemModel;",
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
.method public static final unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/whoop/design/models/DesignModelWrapper;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/design/models/DesignModelWrapper;

    invoke-virtual {p0}, Lcom/whoop/design/models/DesignModelWrapper;->getModel()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    :cond_0
    return-object p0
.end method
