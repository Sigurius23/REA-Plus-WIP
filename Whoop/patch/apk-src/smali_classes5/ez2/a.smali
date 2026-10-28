.class public final Lez2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lez2/a;",
        "",
        "Ljb1/a;",
        "designReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/whooplabs/data/domain/DwlLanding;",
        "Lhz2/d$b;",
        "g",
        "(Lcom/whoop/whooplabs/data/domain/DwlLanding;)Lhz2/d$b;",
        "Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;",
        "Lhz2/b;",
        "e",
        "(Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;)Lhz2/b;",
        "Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;",
        "Lhz2/a;",
        "d",
        "(Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;)Lhz2/a;",
        "Lcom/whoop/whooplabs/data/domain/DwlImpactSection;",
        "Lhz2/c;",
        "f",
        "(Lcom/whoop/whooplabs/data/domain/DwlImpactSection;)Lhz2/c;",
        "Ldz2/b;",
        "domainState",
        "Lhz2/d;",
        "c",
        "(Ldz2/b;)Lhz2/d;",
        "a",
        "Ljb1/a;",
        "whooplabs_release"
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

    sput v0, Lez2/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lez2/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Lev2/b;

    const/16 p2, 0xb

    invoke-direct {p1, p2}, Lev2/b;-><init>(I)V

    invoke-static {p1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lez2/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lez2/a;->b(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final d(Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;)Lhz2/a;
    .locals 7

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lkd1/o$c;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;->getBody()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object p1

    new-instance v2, Lhz2/a;

    invoke-direct {v2, v0, v1, p1}, Lhz2/a;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v2
.end method

.method private final e(Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;)Lhz2/b;
    .locals 4

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;->getItems()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, p0, Lez2/a;->a:Ljb1/a;

    invoke-virtual {v3, v2}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;->getEmptyState()Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, Lez2/a;->d(Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;)Lhz2/a;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    new-instance v3, Lhz2/b;

    invoke-direct {v3, v0, v1, v2, p1}, Lhz2/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lhz2/a;)V

    return-object v3
.end method

.method private final f(Lcom/whoop/whooplabs/data/domain/DwlImpactSection;)Lhz2/c;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlImpactSection;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlImpactSection;->getItems()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, Lez2/a;->a:Ljb1/a;

    invoke-virtual {v1, p1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_1
    new-instance v1, Lhz2/c;

    invoke-direct {v1, v0, p1}, Lhz2/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v1
.end method

.method private final g(Lcom/whoop/whooplabs/data/domain/DwlLanding;)Lhz2/d$b;
    .locals 10

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlLanding;->getToolbarTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlLanding;->getHeaderTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlLanding;->getHeaderBody()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlLanding;->getPageBackgroundImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlLanding;->getCampaignSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;

    invoke-direct {p0, v1}, Lez2/a;->e(Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;)Lhz2/b;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlLanding;->getImpactSection()Lcom/whoop/whooplabs/data/domain/DwlImpactSection;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Lez2/a;->f(Lcom/whoop/whooplabs/data/domain/DwlImpactSection;)Lhz2/c;

    move-result-object v0

    move-object v7, v0

    goto :goto_1

    :cond_1
    move-object v7, v1

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlLanding;->getFooterText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v8

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/DwlLanding;->getFooter()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lez2/a;->a:Ljb1/a;

    invoke-virtual {v0, p1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    :cond_2
    move-object v9, v1

    new-instance v1, Lhz2/d$b;

    invoke-direct/range {v1 .. v9}, Lhz2/d$b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lhz2/c;Lcom/whoop/design/util/TextResource;Lm91/u;)V

    return-object v1
.end method


# virtual methods
.method public final c(Ldz2/b;)Lhz2/d;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ldz2/b$c;->a:Ldz2/b$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lhz2/d$c;->a:Lhz2/d$c;

    return-object p1

    :cond_0
    sget-object v0, Ldz2/b$a;->a:Ldz2/b$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lhz2/d$a;->a:Lhz2/d$a;

    return-object p1

    :cond_1
    instance-of v0, p1, Ldz2/b$b;

    if-eqz v0, :cond_2

    check-cast p1, Ldz2/b$b;

    invoke-virtual {p1}, Ldz2/b$b;->a()Lcom/whoop/whooplabs/data/domain/DwlLanding;

    move-result-object p1

    invoke-direct {p0, p1}, Lez2/a;->g(Lcom/whoop/whooplabs/data/domain/DwlLanding;)Lhz2/d$b;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
