.class public abstract Lyk1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "b",
        "(Ljava/lang/Object;)Lcom/whoop/whoopaction/domain/models/Action;",
        "",
        "a",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "help-center_release"
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
.method public static final a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyk1/a;->b(Ljava/lang/Object;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    instance-of v0, p0, Lcom/whoop/whoopaction/domain/models/OSAction;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/whoopaction/domain/models/OSAction;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/models/OSAction;->getParameters()Lcom/whoop/whoopaction/domain/models/OSActionParameters;

    move-result-object p0

    goto :goto_1

    :cond_1
    move-object p0, v1

    :goto_1
    instance-of v0, p0, Lcom/whoop/whoopaction/domain/models/DialPhoneNumberParameters;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/whoop/whoopaction/domain/models/DialPhoneNumberParameters;

    goto :goto_2

    :cond_2
    move-object p0, v1

    :goto_2
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/models/DialPhoneNumberParameters;->getPhoneNumber()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v1
.end method

.method public static final b(Ljava/lang/Object;)Lcom/whoop/whoopaction/domain/models/Action;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lny0/h;

    if-eqz v0, :cond_0

    check-cast p0, Lny0/h;

    invoke-virtual {p0}, Lny0/h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/whoop/design/item/DesignItemInteraction;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {p0}, Lcom/whoop/design/item/DesignItemInteraction;->getActionArgument()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lyk1/a;->b(Ljava/lang/Object;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1

    :cond_2
    instance-of v0, p0, Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v0, :cond_3

    check-cast p0, Lcom/whoop/whoopaction/domain/models/Action;

    return-object p0

    :cond_3
    return-object v1
.end method
