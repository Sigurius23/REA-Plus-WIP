.class public final Lhr1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lhr1/b;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;",
        "model",
        "Lgr1/s;",
        "c",
        "(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)Lgr1/s;",
        "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;",
        "Lgr1/r;",
        "b",
        "(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;)Lgr1/r;",
        "Lcr1/b$b;",
        "domainResult",
        "Lgr1/q;",
        "a",
        "(Lcr1/b$b;)Lgr1/q;",
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

.method private final b(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;)Lgr1/r;
    .locals 3

    new-instance v0, Lgr1/r;

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;->isEnabled()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lgr1/r;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V

    return-object v0
.end method

.method private final c(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)Lgr1/s;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;->getAutomaticImportControl()Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lhr1/b;->b(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;)Lgr1/r;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;->getAutomaticExportControl()Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Lhr1/b;->b(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;)Lgr1/r;

    move-result-object v1

    :cond_1
    new-instance p1, Lgr1/s;

    invoke-direct {p1, v0, v1}, Lgr1/s;-><init>(Lgr1/r;Lgr1/r;)V

    return-object p1
.end method


# virtual methods
.method public final a(Lcr1/b$b;)Lgr1/q;
    .locals 38

    const-string v0, "domainResult"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcr1/b$b;->a()Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getReportingKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getLearnMoreButton()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;->getText()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getLearnMoreButton()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    move-result-object v9

    if-eqz v9, :cond_1

    invoke-virtual {v9}, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;->getUrl()Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getConnected()Z

    move-result v10

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getConnectedStatus()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getButtonText()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getConnectionUrl()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getDisconnectPopupTitle()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getDisconnectPopupDescription()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getDisconnectPopupPrimaryButton()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getDisconnectPopupSecondaryButton()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getShouldPerformFullOauth()Ljava/lang/Boolean;

    move-result-object v18

    if-eqz v18, :cond_2

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    goto :goto_2

    :cond_2
    const/16 v18, 0x0

    :goto_2
    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getProviderId()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getUpsellCtaTile()Lcom/whoop/design/models/items/CtaTileModel;

    move-result-object v8

    move-object/from16 v20, v0

    if-eqz v8, :cond_3

    invoke-static {}, Lhr1/a;->f()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    invoke-virtual/range {v20 .. v20}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getOverridePrimaryButton()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v8

    move-object/from16 v21, v0

    if-eqz v8, :cond_4

    invoke-static {}, Lhr1/a;->f()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    invoke-virtual/range {v20 .. v20}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getDesignItems()Ljava/util/List;

    move-result-object v8

    move-object/from16 v22, v0

    if-eqz v8, :cond_5

    invoke-static {}, Lhr1/a;->f()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    invoke-virtual/range {v20 .. v20}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getFooterDisclaimer()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v8

    move-object/from16 v23, v0

    if-eqz v8, :cond_6

    invoke-static {}, Lhr1/a;->f()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    goto :goto_6

    :cond_6
    const/4 v0, 0x0

    :goto_6
    invoke-virtual/range {v20 .. v20}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getLastUpdated()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_7

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move-object/from16 v24, v8

    goto :goto_7

    :cond_7
    const/16 v24, 0x0

    :goto_7
    invoke-virtual/range {v20 .. v20}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getDescriptionFootnote()Lcom/whoop/design/models/MarkdownTextModel;

    move-result-object v8

    move-object/from16 v25, v0

    if-eqz v8, :cond_8

    invoke-static {}, Lhr1/a;->f()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    goto :goto_8

    :cond_8
    const/4 v0, 0x0

    :goto_8
    invoke-virtual/range {v20 .. v20}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->getPrivacyControls()Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    move-result-object v8

    move-object/from16 v20, v0

    move-object/from16 v0, p0

    if-eqz v8, :cond_9

    invoke-direct {v0, v8}, Lhr1/b;->c(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)Lgr1/s;

    move-result-object v8

    move-object/from16 v26, v8

    goto :goto_9

    :cond_9
    const/16 v26, 0x0

    :goto_9
    new-instance v32, Lgr1/b;

    move-object/from16 v8, v25

    move-object/from16 v25, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v8

    move-object v8, v1

    move-object/from16 v1, v32

    invoke-direct/range {v1 .. v26}, Lgr1/b;-><init>(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lm91/u;Lm91/u;Ljava/util/List;Lm91/u;Lcom/whoop/design/util/TextResource;Lm91/u;Lgr1/s;)V

    new-instance v27, Lgr1/q;

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0xef

    const/16 v37, 0x0

    invoke-direct/range {v27 .. v37}, Lgr1/q;-><init>(Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v27
.end method
