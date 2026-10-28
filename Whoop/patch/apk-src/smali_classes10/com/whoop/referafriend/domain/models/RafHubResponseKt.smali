.class public final Lcom/whoop/referafriend/domain/models/RafHubResponseKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001d\u0010\u000c\u001a\u00020\u000b*\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/referafriend/domain/models/RafHubResponse;",
        "Lcom/whoop/referafriend/domain/models/RafHubDomainState;",
        "toRafHubDomainState",
        "(Lcom/whoop/referafriend/domain/models/RafHubResponse;)Lcom/whoop/referafriend/domain/models/RafHubDomainState;",
        "Lcom/whoop/referafriend/domain/models/RafHubType$Trials;",
        "Lj62/h;",
        "toTrialsRafHubDomainState",
        "(Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)Lj62/h;",
        "Lcom/whoop/referafriend/domain/models/TrialsItemModel;",
        "",
        "isShared",
        "Lj62/g;",
        "toTrialsItemDomainState",
        "(Lcom/whoop/referafriend/domain/models/TrialsItemModel;Z)Lj62/g;",
        "refer-a-friend_release"
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
.method public static final toRafHubDomainState(Lcom/whoop/referafriend/domain/models/RafHubResponse;)Lcom/whoop/referafriend/domain/models/RafHubDomainState;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/RafHubResponse;->getBasic()Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/RafHubResponse;->getFull()Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/RafHubResponse;->getTrials()Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lcom/whoop/referafriend/domain/models/RafHubResponseKt;->toTrialsRafHubDomainState(Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)Lj62/h;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, p0}, Lcom/whoop/referafriend/domain/models/RafHubDomainState;-><init>(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lj62/h;)V

    return-object v0
.end method

.method private static final toTrialsItemDomainState(Lcom/whoop/referafriend/domain/models/TrialsItemModel;Z)Lj62/g;
    .locals 7

    new-instance v0, Lj62/g;

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/TrialsItemModel;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/TrialsItemModel;->getShareCtaText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/TrialsItemModel;->getSharedText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/TrialsItemModel;->getShareMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/TrialsItemModel;->getBottomCtaText()Ljava/lang/String;

    move-result-object v5

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lj62/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static synthetic toTrialsItemDomainState$default(Lcom/whoop/referafriend/domain/models/TrialsItemModel;ZILjava/lang/Object;)Lj62/g;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lcom/whoop/referafriend/domain/models/RafHubResponseKt;->toTrialsItemDomainState(Lcom/whoop/referafriend/domain/models/TrialsItemModel;Z)Lj62/g;

    move-result-object p0

    return-object p0
.end method

.method private static final toTrialsRafHubDomainState(Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)Lj62/h;
    .locals 7

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->getTrialItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/referafriend/domain/models/TrialsItemModel;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v6, v4, v5}, Lcom/whoop/referafriend/domain/models/RafHubResponseKt;->toTrialsItemDomainState$default(Lcom/whoop/referafriend/domain/models/TrialsItemModel;ZILjava/lang/Object;)Lj62/g;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->getTutorialContent()Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->getSkipCtaText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->getContinueCtaText()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Lj62/h;

    invoke-direct/range {v0 .. v5}, Lj62/h;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
