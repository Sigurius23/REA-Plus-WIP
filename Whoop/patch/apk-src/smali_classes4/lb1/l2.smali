.class public abstract Llb1/l2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/IntegrationUpsellModel;",
        "model",
        "Lk21/d;",
        "d",
        "(Lcom/whoop/design/models/items/IntegrationUpsellModel;)Lk21/d;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "integrationUpsellModelMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/t1;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/l2;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/l2;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/IntegrationUpsellModel;)Lk21/d;
    .locals 0

    invoke-static {p0}, Llb1/l2;->f(Lcom/whoop/design/models/items/IntegrationUpsellModel;)Lk21/d;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/l2;->a:Llb1/y0;

    return-object v0
.end method

.method public static final d(Lcom/whoop/design/models/items/IntegrationUpsellModel;)Lk21/d;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/IntegrationUpsellModel;->getImage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkd1/r;->a(Ljava/lang/String;)Lkd1/o;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/IntegrationUpsellModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/IntegrationUpsellModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/IntegrationUpsellModel;->getPrimaryButton()Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;->getColor()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v7, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_1

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_1
    move-object v11, v1

    :goto_1
    if-nez v11, :cond_2

    goto :goto_2

    :cond_2
    move-object v7, v11

    :goto_2
    if-nez v7, :cond_4

    :cond_3
    sget-object v7, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_4
    new-instance v0, Lk21/a;

    invoke-direct {v0, v5, v6, v7}, Lk21/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly81/e;)V

    move-object v5, v0

    goto :goto_3

    :cond_5
    move-object v5, v1

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/IntegrationUpsellModel;->getSecondaryButton()Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v6, Lk21/a;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    sget-object v8, Ly81/f;->RECOVERY:Ly81/f;

    invoke-direct {v6, v7, v0, v8}, Lk21/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly81/e;)V

    goto :goto_4

    :cond_6
    move-object v6, v1

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/IntegrationUpsellModel;->getCardButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object p0

    if-eqz p0, :cond_7

    const/4 v0, 0x1

    invoke-static {p0, v1, v0, v1}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v1

    :cond_7
    move-object v7, v1

    new-instance v1, Lk21/d;

    invoke-direct/range {v1 .. v7}, Lk21/d;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lk21/a;Lk21/a;Lny0/h;)V

    return-object v1
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t1;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/IntegrationUpsellModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/l2$a;

    invoke-direct {v2, v0}, Llb1/l2$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/IntegrationUpsellModel;)Lk21/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/l2;->d(Lcom/whoop/design/models/items/IntegrationUpsellModel;)Lk21/d;

    move-result-object p0

    return-object p0
.end method
