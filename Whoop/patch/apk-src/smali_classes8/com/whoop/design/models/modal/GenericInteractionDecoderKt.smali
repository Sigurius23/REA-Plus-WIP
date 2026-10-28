.class public final Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0019\u0010\u0008\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "Lad3/c;",
        "json",
        "Lcom/whoop/design/models/modal/DecodedGenericInteraction;",
        "toDecodedGenericInteraction",
        "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;",
        "Lcom/whoop/design/models/modal/ModalLifecycleInteractions;",
        "Lcom/whoop/design/models/modal/ModalLifecycleInteraction;",
        "toModalLifecycleInteraction",
        "(Lcom/whoop/design/models/modal/ModalLifecycleInteractions;Lad3/c;)Lcom/whoop/design/models/modal/ModalLifecycleInteraction;",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "decodeModal",
        "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/AnyModal;",
        "Lcom/whoop/navigation/e;",
        "decodeNavigation",
        "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/navigation/e;",
        "Lj02/s;",
        "decodeDismissEvent",
        "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lj02/s;",
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
.method private static final decodeDismissEvent(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lj02/s;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/navigation/models/GenericInteraction;->getDismissEvent()Lkotlinx/serialization/json/JsonElement;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lcom/whoop/navigation/DismissEventModel;->Companion:Lcom/whoop/navigation/DismissEventModel$a;

    invoke-virtual {v0}, Lcom/whoop/navigation/DismissEventModel$a;->serializer()Lwc3/c;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lsw2/a;->c(Lkotlinx/serialization/json/JsonElement;Lad3/c;Lwc3/c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/navigation/DismissEventModel;

    if-eqz p0, :cond_0

    invoke-static {p0}, Lj02/u;->a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final decodeModal(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/navigation/models/GenericInteraction;->getModal()Lkotlinx/serialization/json/JsonElement;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lcom/whoop/design/models/modal/AnyModal;->Companion:Lcom/whoop/design/models/modal/AnyModal$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/AnyModal$Companion;->serializer()Lwc3/c;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lsw2/a;->c(Lkotlinx/serialization/json/JsonElement;Lad3/c;Lwc3/c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/modal/AnyModal;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final decodeNavigation(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/navigation/e;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/navigation/models/GenericInteraction;->getNavigation()Lkotlinx/serialization/json/JsonElement;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    new-instance v1, Lcom/whoop/navigation/json/a;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v0, v2, v0}, Lcom/whoop/navigation/json/a;-><init>(Ljava/util/Map;Liy1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0, p1, v1}, Lsw2/a;->c(Lkotlinx/serialization/json/JsonElement;Lad3/c;Lwc3/c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/navigation/e;

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static final toDecodedGenericInteraction(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/navigation/models/GenericInteraction;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    new-instance v2, Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    invoke-static {p0, p1}, Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;->decodeModal(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v3

    invoke-static {p0, p1}, Lsw2/a;->a(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v4

    invoke-static {p0, p1}, Lsw2/a;->b(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v5

    invoke-static {p0, p1}, Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;->decodeNavigation(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/navigation/e;

    move-result-object v6

    invoke-static {p0, p1}, Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;->decodeDismissEvent(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lj02/s;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;-><init>(Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/e;Lj02/s;)V

    invoke-virtual {v2}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    return-object v1

    :cond_1
    return-object v2
.end method

.method public static final toModalLifecycleInteraction(Lcom/whoop/design/models/modal/ModalLifecycleInteractions;Lad3/c;)Lcom/whoop/design/models/modal/ModalLifecycleInteraction;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/modal/ModalLifecycleInteraction;

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/ModalLifecycleInteractions;->getOnStart()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;->toDecodedGenericInteraction(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, p0}, Lcom/whoop/design/models/modal/ModalLifecycleInteraction;-><init>(Lcom/whoop/design/models/modal/DecodedGenericInteraction;)V

    return-object v0
.end method
