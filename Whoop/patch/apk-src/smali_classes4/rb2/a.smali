.class public final Lrb2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lrb2/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/settings/gifthub/domain/models/GiftHubSectionModel;",
        "Lqb2/b;",
        "c",
        "(Lcom/whoop/settings/gifthub/domain/models/GiftHubSectionModel;)Lqb2/b;",
        "Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;",
        "Lqb2/a;",
        "b",
        "(Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;)Lqb2/a;",
        "Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;",
        "Lqb2/c;",
        "d",
        "(Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;)Lqb2/c;",
        "Lnb2/c;",
        "result",
        "Lqb2/e;",
        "a",
        "(Lnb2/c;)Lqb2/e;",
        "settings_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;)Lqb2/a;
    .locals 6

    new-instance v0, Lqb2/a;

    new-instance v1, Ly71/g;

    invoke-virtual {p1}, Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;->getTrackingId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lqb2/a;-><init>(Ly71/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v0
.end method

.method private final c(Lcom/whoop/settings/gifthub/domain/models/GiftHubSectionModel;)Lqb2/b;
    .locals 3

    invoke-virtual {p1}, Lcom/whoop/settings/gifthub/domain/models/GiftHubSectionModel;->getHeader()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/settings/gifthub/domain/models/GiftHubSectionModel;->getItems()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;

    invoke-direct {p0, v2}, Lrb2/a;->b(Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;)Lqb2/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lqb2/b;

    invoke-direct {p1, v0, v1}, Lqb2/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p1
.end method

.method private final d(Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;)Lqb2/c;
    .locals 1

    sget-object v0, Lrb2/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lqb2/c;->HOLIDAY:Lqb2/c;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lqb2/c;->DEFAULT:Lqb2/c;

    return-object p1
.end method


# virtual methods
.method public final a(Lnb2/c;)Lqb2/e;
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lnb2/c;->b()Lnb2/b;

    move-result-object v0

    sget-object v1, Lnb2/b$c;->a:Lnb2/b$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lqb2/e$c;->a:Lqb2/e$c;

    return-object p1

    :cond_0
    instance-of v1, v0, Lnb2/b$b;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lnb2/c;->b()Lnb2/b;

    move-result-object v0

    check-cast v0, Lnb2/b$b;

    invoke-virtual {v0}, Lnb2/b$b;->a()Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;->getHeader()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lnb2/c;->b()Lnb2/b;

    move-result-object v0

    check-cast v0, Lnb2/b$b;

    invoke-virtual {v0}, Lnb2/b$b;->a()Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lnb2/c;->b()Lnb2/b;

    move-result-object v0

    check-cast v0, Lnb2/b$b;

    invoke-virtual {v0}, Lnb2/b$b;->a()Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lnb2/c;->b()Lnb2/b;

    move-result-object v0

    check-cast v0, Lnb2/b$b;

    invoke-virtual {v0}, Lnb2/b$b;->a()Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/settings/gifthub/domain/models/GiftHubSectionModel;

    invoke-direct {p0, v1}, Lrb2/a;->c(Lcom/whoop/settings/gifthub/domain/models/GiftHubSectionModel;)Lqb2/b;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lnb2/c;->b()Lnb2/b;

    move-result-object p1

    check-cast p1, Lnb2/b$b;

    invoke-virtual {p1}, Lnb2/b$b;->a()Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;->getStyle()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/settings/gifthub/domain/models/GiftHubResponseKt;->toGiftHubStyle(Ljava/lang/String;)Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;

    move-result-object p1

    invoke-direct {p0, p1}, Lrb2/a;->d(Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;)Lqb2/c;

    move-result-object v6

    new-instance v1, Lqb2/e$b;

    invoke-direct/range {v1 .. v6}, Lqb2/e$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lqb2/c;)V

    return-object v1

    :cond_2
    sget-object p1, Lnb2/b$a;->a:Lnb2/b$a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lqb2/e$a;->a:Lqb2/e$a;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
