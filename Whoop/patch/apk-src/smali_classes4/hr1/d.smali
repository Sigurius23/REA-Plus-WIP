.class public final Lhr1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lhr1/d;",
        "",
        "<init>",
        "()V",
        "Lcr1/b$e;",
        "domainResult",
        "Lgr1/q;",
        "a",
        "(Lcr1/b$e;)Lgr1/q;",
        "Ljb1/a;",
        "Ljb1/a;",
        "reducer",
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


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lhr1/d;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lhr1/a;->f()Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Lhr1/d;->a:Ljb1/a;

    return-void
.end method


# virtual methods
.method public final a(Lcr1/b$e;)Lgr1/q;
    .locals 23

    move-object/from16 v0, p0

    const-string v1, "domainResult"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcr1/b$e;->a()Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->getIntegrationId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->getHeroImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    iget-object v2, v0, Lhr1/d;->a:Ljb1/a;

    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->getDesignItems()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->getFooterDisclaimer()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    iget-object v9, v0, Lhr1/d;->a:Ljb1/a;

    invoke-virtual {v9, v2}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v8

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->getConnectionUrlBase()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->getConnectionButtonText()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->getSecondaryButton()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v8, v0, Lhr1/d;->a:Ljb1/a;

    invoke-virtual {v8, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v8

    :cond_1
    move-object v11, v8

    new-instance v19, Lgr1/d;

    move-object v8, v2

    move-object/from16 v2, v19

    invoke-direct/range {v2 .. v11}, Lgr1/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/u;Ljava/lang/String;Ljava/lang/String;Lm91/u;)V

    new-instance v12, Lgr1/q;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xbf

    const/16 v22, 0x0

    invoke-direct/range {v12 .. v22}, Lgr1/q;-><init>(Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v12
.end method
