.class public final Lhr1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lhr1/c;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;",
        "model",
        "Lgr1/a;",
        "b",
        "(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;)Lgr1/a;",
        "Lgr1/e;",
        "c",
        "(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;)Lgr1/e;",
        "Lcr1/b$d;",
        "domainResult",
        "Lgr1/q;",
        "a",
        "(Lcr1/b$d;)Lgr1/q;",
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

.method private final b(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;)Lgr1/a;
    .locals 16

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->isWhoopBuilt()Z

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getIntegrationId3P()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getSectionTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getCtaTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getConnected()Z

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getConnectedStatusDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getCtaConnectionUrl()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getCtaDeepLinkUrl()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getInfoCallout()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lhr1/a;->f()Ljb1/a;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    :goto_0
    move-object v10, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getBottomDescriptionText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getShowConnectedStatusIcon()Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getCanShowDisconnectModal()Ljava/lang/Boolean;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getCtaButtonStyle()Lny0/p;

    move-result-object v14

    invoke-direct/range {p0 .. p1}, Lhr1/c;->c(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;)Lgr1/e;

    move-result-object v15

    new-instance v0, Lgr1/a;

    invoke-direct/range {v0 .. v15}, Lgr1/a;-><init>(Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lcom/whoop/design/util/TextResource;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Lgr1/e;)V

    return-object v0
.end method

.method private final c(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;)Lgr1/e;
    .locals 4

    new-instance v0, Lgr1/e;

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getDisconnectPopupTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget v1, Lzq1/b;->e:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getDisconnectPopupDescription()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    sget v2, Lzq1/b;->d:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getDisconnectPopupPrimaryButtonTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    sget v3, Lzq1/b;->c:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->getDisconnectPopupSecondaryButtonTitle()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    sget p1, Lzq1/b;->b:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    :goto_3
    invoke-direct {v0, v1, v2, v3, p1}, Lgr1/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lcr1/b$d;)Lgr1/q;
    .locals 25

    const-string v0, "domainResult"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcr1/b$d;->a()Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->getReportingKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->getProviderId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->getDescriptionFootnote()Lcom/whoop/design/models/MarkdownTextModel;

    move-result-object v1

    const/4 v9, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lhr1/a;->f()Ljb1/a;

    move-result-object v10

    invoke-virtual {v10, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v9

    :goto_0
    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->getLearnMoreButton()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    move-result-object v10

    if-eqz v10, :cond_1

    invoke-virtual {v10}, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;->getText()Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_1
    move-object v10, v9

    :goto_1
    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->getLearnMoreButton()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    move-result-object v11

    if-eqz v11, :cond_2

    invoke-virtual {v11}, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;->getUrl()Ljava/lang/String;

    move-result-object v9

    :cond_2
    move-object v11, v9

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->getConnectionSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v0, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v12, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;

    move-object/from16 v13, p0

    invoke-direct {v13, v9}, Lhr1/c;->b(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;)Lgr1/a;

    move-result-object v9

    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    move-object/from16 v13, p0

    new-instance v20, Lgr1/c;

    move-object v9, v1

    move-object/from16 v1, v20

    invoke-direct/range {v1 .. v12}, Lgr1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lm91/u;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V

    new-instance v14, Lgr1/q;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0xdf

    const/16 v24, 0x0

    invoke-direct/range {v14 .. v24}, Lgr1/q;-><init>(Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v14
.end method
