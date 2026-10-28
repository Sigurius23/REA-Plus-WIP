.class public final Lhr1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhr1/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lhr1/e;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/integrations/domain/models/IntegrationSectionModel;",
        "Lgr1/l;",
        "e",
        "(Lcom/whoop/integrations/domain/models/IntegrationSectionModel;)Lgr1/l;",
        "Lcom/whoop/integrations/domain/models/IntegrationTabModel;",
        "Lgr1/g;",
        "d",
        "(Lcom/whoop/integrations/domain/models/IntegrationTabModel;)Lgr1/g;",
        "",
        "connected",
        "connectedFrom3P",
        "Lkd1/o;",
        "b",
        "(ZLjava/lang/Boolean;)Lkd1/o;",
        "Ly81/e;",
        "a",
        "(ZLjava/lang/Boolean;)Ly81/e;",
        "Lcr1/b$f;",
        "domainResult",
        "Lgr1/q;",
        "c",
        "(Lcr1/b$f;)Lgr1/q;",
        "integrations_release"
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

.method private final a(ZLjava/lang/Boolean;)Ly81/e;
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    if-eqz p1, :cond_0

    sget-object p1, Lhr1/e$b;->w:Lhr1/e$b;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p1, Lhr1/e$c;->w:Lhr1/e$c;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_2
    if-nez p1, :cond_4

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    :goto_0
    sget-object p1, Lhr1/e$d;->w:Lhr1/e$d;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1
.end method

.method private final b(ZLjava/lang/Boolean;)Lkd1/o;
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    if-eqz p1, :cond_0

    new-instance p1, Lkd1/o$a;

    sget p2, Lzq1/a;->a:I

    invoke-direct {p1, p2}, Lkd1/o$a;-><init>(I)V

    return-object p1

    :cond_0
    return-object v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance p1, Lkd1/o$a;

    sget p2, Lzq1/a;->a:I

    invoke-direct {p1, p2}, Lkd1/o$a;-><init>(I)V

    return-object p1

    :cond_2
    if-nez p1, :cond_4

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    :goto_0
    new-instance p1, Lkd1/o$a;

    sget p2, Lzq1/a;->c:I

    invoke-direct {p1, p2}, Lkd1/o$a;-><init>(I)V

    return-object p1
.end method

.method private final d(Lcom/whoop/integrations/domain/models/IntegrationTabModel;)Lgr1/g;
    .locals 13

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getDisplayType()Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;

    move-result-object v0

    sget-object v1, Lhr1/e$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    new-instance v2, Lgr1/j;

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getReportingKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getIconImage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getScreenName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getConnected()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_0
    move v8, v1

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getConnectedFrom3P()Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getConnected()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getConnectedFrom3P()Ljava/lang/Boolean;

    move-result-object v10

    invoke-direct {p0, v0, v10}, Lhr1/e;->b(ZLjava/lang/Boolean;)Lkd1/o;

    move-result-object v10

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getConnected()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getConnectedFrom3P()Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lhr1/e;->a(ZLjava/lang/Boolean;)Ly81/e;

    move-result-object v11

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getDetailsUrl()Ljava/lang/String;

    move-result-object v12

    invoke-direct/range {v2 .. v12}, Lgr1/j;-><init>(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/Boolean;Lkd1/o;Ly81/e;Ljava/lang/String;)V

    return-object v2

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance v0, Lgr1/i;

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getReportingKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getIconImage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getScreenName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getConnected()Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getConnectedFrom3P()Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getDetailsUrl()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lgr1/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-object v0

    :cond_5
    new-instance v1, Lgr1/h;

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getReportingKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getIconImage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getScreenName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getCtaText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getBannerImage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v9

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getConnected()Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->getConnectedFrom3P()Ljava/lang/Boolean;

    move-result-object v11

    invoke-direct/range {v1 .. v11}, Lgr1/h;-><init>(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method private final e(Lcom/whoop/integrations/domain/models/IntegrationSectionModel;)Lgr1/l;
    .locals 3

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationSectionModel;->getSectionTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationSectionModel;->getTabs()Ljava/util/List;

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

    check-cast v2, Lcom/whoop/integrations/domain/models/IntegrationTabModel;

    invoke-direct {p0, v2}, Lhr1/e;->d(Lcom/whoop/integrations/domain/models/IntegrationTabModel;)Lgr1/g;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lgr1/l;

    invoke-direct {p1, v0, v1}, Lgr1/l;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object p1
.end method


# virtual methods
.method public final c(Lcr1/b$f;)Lgr1/q;
    .locals 13

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcr1/b$f;->a()Lcom/whoop/integrations/domain/models/IntegrationsDiscoveryComponentsModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationsDiscoveryComponentsModel;->getIntegrations()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/integrations/domain/models/IntegrationSectionModel;

    invoke-direct {p0, v1}, Lhr1/e;->e(Lcom/whoop/integrations/domain/models/IntegrationSectionModel;)Lgr1/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v6, Lgr1/f;

    invoke-direct {v6, v0}, Lgr1/f;-><init>(Ljava/util/List;)V

    new-instance v2, Lgr1/q;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xf7

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v12}, Lgr1/q;-><init>(Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
