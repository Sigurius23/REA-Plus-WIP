.class public abstract Lhr1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "event",
        "Lcom/whoop/navigation/e;",
        "l",
        "(Ljava/lang/Object;)Lcom/whoop/navigation/e;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "f",
        "()Ljb1/a;",
        "integrationsDesignItemReducer",
        "integrations_release"
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
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhb1/h;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lhb1/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lhr1/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/keyinfotile/KeyInfoTileModel;)Llr1/d;
    .locals 0

    invoke-static {p0}, Lhr1/a;->i(Lcom/whoop/design/models/items/keyinfotile/KeyInfoTileModel;)Llr1/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lhr1/a;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lhr1/a;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/models/items/secondaryactionbutton/SecondaryActionButtonModel;)Lny0/h0;
    .locals 0

    invoke-static {p0}, Lhr1/a;->k(Lcom/whoop/design/models/items/secondaryactionbutton/SecondaryActionButtonModel;)Lny0/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;)Lr01/c;
    .locals 0

    invoke-static {p0}, Lhr1/a;->j(Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;)Lr01/c;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Ljb1/a;
    .locals 1

    sget-object v0, Lhr1/a;->a:Ljb1/a;

    return-object v0
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lny0/h;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lhr1/a$a;

    invoke-direct {v1}, Lhr1/a$a;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lhb1/h;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lhb1/h;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhb1/h;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lhb1/h;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/keyinfotile/KeyInfoTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lhr1/a$b;

    invoke-direct {v3, v0}, Lhr1/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lhb1/h;

    const/16 v2, 0x15

    invoke-direct {v0, v2}, Lhb1/h;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lhr1/a$c;

    invoke-direct {v3, v0}, Lhr1/a$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lhb1/h;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Lhb1/h;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/secondaryactionbutton/SecondaryActionButtonModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lhr1/a$d;

    invoke-direct {v2, v0}, Lhr1/a$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/items/keyinfotile/KeyInfoTileModel;)Llr1/d;
    .locals 6

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/keyinfotile/KeyInfoTileModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/keyinfotile/KeyInfoTileModel;->getItems()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/keyinfotile/KeyInfoItemModel;

    new-instance v3, Llr1/a;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/keyinfotile/KeyInfoItemModel;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/design/models/items/keyinfotile/KeyInfoItemModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v5, Lgz0/m0;->INTEGRATIONS:Lgz0/m0;

    invoke-static {v2, v5}, Lgz0/n0;->c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Llr1/a;-><init>(Ljava/lang/String;Lgz0/m0;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Llr1/d;

    invoke-direct {p0, v0, v1}, Llr1/d;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;)Lr01/c;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;->getButton()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v3, Lhr1/a;->a:Ljb1/a;

    invoke-virtual {v3, p0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance v3, Lr01/c;

    invoke-direct {v3, v0, v1, v2, p0}, Lr01/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;)V

    return-object v3
.end method

.method private static final k(Lcom/whoop/design/models/items/secondaryactionbutton/SecondaryActionButtonModel;)Lny0/h0;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lny0/h0;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/secondaryactionbutton/SecondaryActionButtonModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/secondaryactionbutton/SecondaryActionButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    invoke-static {v0, v3}, Lgz0/n0;->c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/secondaryactionbutton/SecondaryActionButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lny0/h0;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final l(Ljava/lang/Object;)Lcom/whoop/navigation/e;
    .locals 1

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/navigation/e;

    return-object p0

    :cond_0
    instance-of v0, p0, Lny0/h;

    if-eqz v0, :cond_1

    check-cast p0, Lny0/h;

    invoke-virtual {p0}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lk11/e$b;

    if-eqz v0, :cond_2

    check-cast p0, Lk11/e$b;

    invoke-virtual {p0}, Lk11/e$b;->b()Lcom/whoop/navigation/e;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method
