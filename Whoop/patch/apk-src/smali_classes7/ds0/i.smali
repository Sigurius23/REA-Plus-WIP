.class public abstract Lds0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/design/models/modal/AnyModal;",
        "",
        "a",
        "(Lcom/whoop/design/models/modal/AnyModal;)Z",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "Lad3/c;",
        "json",
        "b",
        "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/AnyModal;",
        "community-reactions-arch-mini_release"
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
.method public static final a(Lcom/whoop/design/models/modal/AnyModal;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/AnyModal;->getModal()Lcom/whoop/design/models/modal/Modal;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/design/models/modal/FullScreenContentModal;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/AnyModal;->getModal()Lcom/whoop/design/models/modal/Modal;

    move-result-object p0

    instance-of p0, p0, Lcom/whoop/design/models/modal/UnknownModal;

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;->toDecodedGenericInteraction(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    move-result-object p0

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lds0/i;->a(Lcom/whoop/design/models/modal/AnyModal;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method
