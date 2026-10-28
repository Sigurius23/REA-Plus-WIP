.class public final Lsi0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00010\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lsi0/k;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/archv2/model/template/SingleItemTemplate;",
        "template",
        "",
        "manualRefresh",
        "displayRefreshingSpinner",
        "",
        "",
        "accumulatedState",
        "Lti0/j;",
        "a",
        "(Lcom/whoop/archv2/model/template/SingleItemTemplate;ZZLjava/util/Map;)Lti0/j;",
        "Ljb1/a;",
        "arch-v2_release"
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

    sput v0, Lsi0/k;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsi0/k;->a:Ljb1/a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/archv2/model/template/SingleItemTemplate;ZZLjava/util/Map;)Lti0/j;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/model/template/SingleItemTemplate;",
            "ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lti0/j;"
        }
    .end annotation

    move-object/from16 v0, p4

    const-string v1, "template"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "accumulatedState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->getItem()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v3, p0, Lsi0/k;->a:Ljb1/a;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v3, v1, v0}, Ljb1/a;->j(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/o;

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, v2

    :goto_0
    new-instance v3, Lti0/j;

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->getScreenMetadata()Lcom/whoop/archv2/model/template/MetaData;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Lcom/whoop/archv2/model/template/MetaData;->bind(Ljava/util/Map;)Lcom/whoop/archv2/model/template/MetaData;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/archv2/model/template/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, v2

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->getNavigationBar()Lcom/whoop/design/models/items/NavigationBarModel;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v5, p0, Lsi0/k;->a:Ljb1/a;

    move/from16 v8, p3

    invoke-static {v1, p2, v8, v5}, Lsi0/i;->a(Lcom/whoop/design/models/items/NavigationBarModel;ZZLjb1/a;)Lri0/f;

    move-result-object v1

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, v2

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->getFooter()Lcom/whoop/design/models/items/FooterModel;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, p0, Lsi0/k;->a:Ljb1/a;

    invoke-static {v1, v0, v2}, Lsi0/d;->a(Lcom/whoop/design/models/items/FooterModel;Ljava/util/Map;Ljb1/a;)Lri0/a;

    move-result-object v2

    :cond_3
    move-object v7, v2

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->getHorizontalAlignment()Lcom/whoop/archv2/model/template/HorizontalAlignment;

    move-result-object v8

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->getVerticalAlignment()Lcom/whoop/archv2/model/template/VerticalAlignment;

    move-result-object v9

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->getFillMode()Lcom/whoop/archv2/model/template/FillMode;

    move-result-object v10

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->getPadding()Lcom/whoop/archv2/model/template/TemplatePadding;

    move-result-object v0

    invoke-static {v0}, Lsi0/l;->a(Lcom/whoop/archv2/model/template/TemplatePadding;)Ll0/k1;

    move-result-object v11

    sget-object v0, Lsi0/a;->a:Lsi0/a;

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->getBackground()Lcom/whoop/archv2/model/template/BackgroundModel;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lsi0/a;->b(Lcom/whoop/archv2/model/template/BackgroundModel;Ljava/lang/String;)Lti0/c;

    move-result-object v12

    invoke-direct/range {v3 .. v12}, Lti0/j;-><init>(Lep0/j;Lri0/f;Lm91/o;Lri0/a;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Ll0/k1;Lti0/c;)V

    return-object v3
.end method
