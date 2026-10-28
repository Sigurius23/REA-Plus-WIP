.class public abstract Lk80/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroid/os/Bundle;",
        "Lk80/j;",
        "a",
        "(Landroid/os/Bundle;)Lk80/j;",
        "activation_release"
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
.method public static final a(Landroid/os/Bundle;)Lk80/j;
    .locals 8

    const/4 v0, 0x0

    if-nez p0, :cond_0

    new-instance p0, Lk80/j;

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lk80/j;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_0
    const-string v1, "startScreen"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    sget-object v2, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->START_SCREEN:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    invoke-static {}, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->values()[Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v0, v6

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, v0

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v2, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->START_SCREEN:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    :goto_3
    const-string v0, "source"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lk80/j;

    invoke-direct {v0, v2, p0}, Lk80/j;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/lang/String;)V

    return-object v0
.end method
