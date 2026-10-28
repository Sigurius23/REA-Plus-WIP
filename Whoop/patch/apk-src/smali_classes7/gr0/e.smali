.class public abstract Lgr0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgr0/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a;\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a+\u0010\u0010\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u00020\u0014*\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0014*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/design/models/items/FollowerRequestModel;",
        "Lgr0/f;",
        "stage",
        "e",
        "(Lcom/whoop/design/models/items/FollowerRequestModel;Lgr0/f;)Lcom/whoop/design/models/items/FollowerRequestModel;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "",
        "items",
        "",
        "",
        "stages",
        "Lgr0/d;",
        "c",
        "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/util/Map;)Lgr0/d;",
        "model",
        "d",
        "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/FollowerRequestModel;Lgr0/f;)Lgr0/d;",
        "Lcom/whoop/design/models/items/FollowerRequestButtonModel;",
        "performed",
        "",
        "a",
        "(Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/whoopaction/domain/models/Action;)Z",
        "other",
        "b",
        "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;)Z",
        "community-follower-lookup-arch-mini_release"
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
.method private static final a(Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/whoopaction/domain/models/Action;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-static {v1, p1}, Lgr0/e;->b(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;)Z

    move-result v1

    if-ne v1, v2, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p0

    const/4 v1, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/AnyModal;->getModal()Lcom/whoop/design/models/modal/Modal;

    move-result-object p0

    goto :goto_0

    :cond_2
    move-object p0, v1

    :goto_0
    instance-of v3, p0, Lcom/whoop/design/models/modal/DialogModel;

    if-eqz v3, :cond_3

    move-object v1, p0

    check-cast v1, Lcom/whoop/design/models/modal/DialogModel;

    :cond_3
    if-nez v1, :cond_4

    return v0

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/design/models/modal/DialogModel;->getPrimaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DialogButton;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {p0, p1}, Lgr0/e;->b(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;)Z

    move-result p0

    if-ne p0, v2, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method private static final b(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    goto :goto_0

    :cond_1
    move-object p1, v2

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_2

    return v1

    :cond_2
    instance-of v3, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    if-eqz v3, :cond_3

    move-object v2, p0

    check-cast v2, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    :cond_3
    if-nez v2, :cond_4

    return v1

    :cond_4
    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->getRequest()Lcom/whoop/whoopaction/domain/models/Request;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/models/Request;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->getRequest()Lcom/whoop/whoopaction/domain/models/Request;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/whoopaction/domain/models/Request;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->getRequest()Lcom/whoop/whoopaction/domain/models/Request;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/models/Request;->getMethod()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->getRequest()Lcom/whoop/whoopaction/domain/models/Request;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/Request;->getMethod()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v0}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_5

    return v0

    :cond_5
    return v1
.end method

.method public static final c(Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/util/Map;)Lgr0/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/FollowerRequestModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lgr0/f;",
            ">;)",
            "Lgr0/d;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stages"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/FollowerRequestModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgr0/f;

    invoke-static {p0, v0, v1}, Lgr0/e;->d(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/FollowerRequestModel;Lgr0/f;)Lgr0/d;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final d(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/FollowerRequestModel;Lgr0/f;)Lgr0/d;
    .locals 2

    const/4 v0, -0x1

    if-nez p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lgr0/e$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v1, p2

    :goto_0
    const/4 v1, 0x1

    if-eq p2, v0, :cond_3

    if-eq p2, v1, :cond_2

    const/4 p0, 0x2

    if-ne p2, p0, :cond_1

    goto :goto_2

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/design/models/items/FollowerRequestModel;->getSecondaryStartButton()Lcom/whoop/design/models/items/FollowerRequestButtonModel;

    move-result-object p2

    invoke-static {p2, p0}, Lgr0/e;->a(Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/whoopaction/domain/models/Action;)Z

    move-result p0

    if-eqz p0, :cond_6

    new-instance p0, Lgr0/d$c;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/FollowerRequestModel;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lgr0/d$c;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/design/models/items/FollowerRequestModel;->getEndButton()Lcom/whoop/design/models/items/FollowerRequestButtonModel;

    move-result-object p2

    invoke-static {p2, p0}, Lgr0/e;->a(Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/whoopaction/domain/models/Action;)Z

    move-result p2

    if-eqz p2, :cond_4

    new-instance p0, Lgr0/d$a;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/FollowerRequestModel;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lgr0/d$a;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_4
    invoke-virtual {p1}, Lcom/whoop/design/models/items/FollowerRequestModel;->getStartButton()Lcom/whoop/design/models/items/FollowerRequestButtonModel;

    move-result-object p2

    invoke-static {p2, p0}, Lgr0/e;->a(Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/whoopaction/domain/models/Action;)Z

    move-result p0

    if-eqz p0, :cond_6

    new-instance p0, Lgr0/d$b;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/FollowerRequestModel;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/design/models/items/FollowerRequestModel;->getSecondaryStartButton()Lcom/whoop/design/models/items/FollowerRequestButtonModel;

    move-result-object p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    invoke-direct {p0, p2, v1}, Lgr0/d$b;-><init>(Ljava/lang/String;Z)V

    return-object p0

    :cond_6
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final e(Lcom/whoop/design/models/items/FollowerRequestModel;Lgr0/f;)Lcom/whoop/design/models/items/FollowerRequestModel;
    .locals 15

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, -0x1

    if-nez p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    sget-object v2, Lgr0/e$a;->a:[I

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    :goto_0
    if-eq v2, v1, :cond_3

    const/4 v1, 0x1

    if-eq v2, v1, :cond_2

    const/4 v1, 0x2

    if-ne v2, v1, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getTertiaryStartButton()Lcom/whoop/design/models/items/FollowerRequestButtonModel;

    move-result-object v6

    const/16 v13, 0xf9f

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v14}, Lcom/whoop/design/models/items/FollowerRequestModel;->copy$default(Lcom/whoop/design/models/items/FollowerRequestModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/design/models/items/FollowerRequestModel;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getSecondaryStartButton()Lcom/whoop/design/models/items/FollowerRequestButtonModel;

    move-result-object v6

    const/16 v13, 0xf9f

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v14}, Lcom/whoop/design/models/items/FollowerRequestModel;->copy$default(Lcom/whoop/design/models/items/FollowerRequestModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/design/models/items/FollowerRequestModel;

    move-result-object v0

    return-object v0

    :cond_3
    return-object p0
.end method
