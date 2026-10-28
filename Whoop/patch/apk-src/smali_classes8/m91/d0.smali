.class public abstract Lm91/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "a",
        "(Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/whoopaction/domain/models/Action;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "b",
        "(Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/Action;",
        "design_release"
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
.method public static final a(Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    if-nez v0, :cond_1

    instance-of v0, p0, Lcom/whoop/whoopaction/domain/models/StateClearAction;

    if-nez v0, :cond_1

    instance-of v0, p0, Lcom/whoop/whoopaction/domain/models/StatePushAction;

    if-nez v0, :cond_1

    instance-of v0, p0, Lcom/whoop/whoopaction/domain/models/StatePopAction;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    :cond_1
    return-object p0
.end method

.method public static final b(Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/Action;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/navigation/models/GenericInteraction;->getModal()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/navigation/models/GenericInteraction;->getNavigation()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/navigation/models/GenericInteraction;->getDismissEvent()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v0

    invoke-static {p0, v0}, Lsw2/a;->a(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lm91/d0;->a(Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    return-object v1
.end method
