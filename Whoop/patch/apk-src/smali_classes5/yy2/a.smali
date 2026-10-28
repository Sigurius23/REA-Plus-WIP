.class public final Lyy2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00102\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lyy2/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;",
        "Lzy2/f$b;",
        "g",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;)Lzy2/f$b;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;",
        "Lzy2/e;",
        "f",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;)Lzy2/e;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;",
        "Lzy2/a;",
        "e",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;)Lzy2/a;",
        "Lec3/l;",
        "Lxy2/b;",
        "domainStateFlow",
        "Lzy2/f;",
        "c",
        "(Lec3/l;)Lec3/l;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "reducer",
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

    sput v0, Lyy2/a;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lyv0/h;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Lyy2/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyy2/a;->d(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lyy2/a;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;)Lzy2/f$b;
    .locals 0

    invoke-direct {p0, p1}, Lyy2/a;->g(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;)Lzy2/f$b;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final e(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;)Lzy2/a;
    .locals 8

    new-instance v0, Lzy2/a;

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;->getTitleDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;->getBodyDisplay()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lzy2/a;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private final f(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;)Lzy2/e;
    .locals 5

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;->getCampaignResponse()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v4, p0, Lyy2/a;->a:Ljb1/a;

    invoke-virtual {v4, v3}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_1
    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;->getEmptyState()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-direct {p0, p1}, Lyy2/a;->e(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;)Lzy2/a;

    move-result-object v1

    :cond_3
    new-instance p1, Lzy2/e;

    invoke-direct {p1, v0, v2, v3, v1}, Lzy2/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lzy2/a;)V

    return-object p1
.end method

.method private final g(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;)Lzy2/f$b;
    .locals 5

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;->getPageTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;->getPageHeaderTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;->getPageHeaderBody()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;->getCampaignSections()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;

    invoke-direct {p0, v4}, Lyy2/a;->f(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;)Lzy2/e;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_1
    new-instance p1, Lzy2/f$b;

    invoke-direct {p1, v0, v1, v2, v3}, Lzy2/f$b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V

    return-object p1
.end method


# virtual methods
.method public final c(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "domainStateFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyy2/a$a;

    invoke-direct {v0, p1, p0}, Lyy2/a$a;-><init>(Lec3/l;Lyy2/a;)V

    return-object v0
.end method
