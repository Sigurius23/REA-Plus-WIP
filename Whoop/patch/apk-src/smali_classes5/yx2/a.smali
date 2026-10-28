.class public final Lyx2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000c2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lyx2/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;",
        "Lay2/a$b;",
        "e",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;)Lay2/a$b;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponse;",
        "Lay2/b;",
        "f",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponse;)Lay2/b;",
        "Lec3/l;",
        "Lxx2/b;",
        "domainStateFlow",
        "Lay2/a;",
        "c",
        "(Lec3/l;)Lec3/l;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "getReducer",
        "()Ljb1/a;",
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

    sput v0, Lyx2/a;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lyv0/h;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Lyx2/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyx2/a;->d(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lyx2/a;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;)Lay2/a$b;
    .locals 0

    invoke-direct {p0, p1}, Lyx2/a;->e(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;)Lay2/a$b;

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

.method private final e(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;)Lay2/a$b;
    .locals 11

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;->getCampaignSection()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponse;

    invoke-direct {p0, v4}, Lyx2/a;->f(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponse;)Lay2/b;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    :goto_1
    move-object v4, v1

    goto :goto_2

    :cond_1
    sget-object v1, Lm83/y;->w:Lm83/y;

    goto :goto_1

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;->getFooterText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;->getFooter()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lyx2/a;->a:Ljb1/a;

    invoke-virtual {v1, v0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    :goto_3
    move-object v6, v0

    goto :goto_4

    :cond_2
    const/4 v0, 0x0

    goto :goto_3

    :goto_4
    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;->getEmptyStateText()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    const-string p1, ""

    :cond_3
    move-object v8, p1

    new-instance v1, Lay2/a$b;

    const/4 v7, 0x0

    const/16 v9, 0x20

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v10}, Lay2/a$b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lm91/u;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final f(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponse;)Lay2/b;
    .locals 3

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponse;->getCampaignResponse()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lyx2/a;->a:Ljb1/a;

    invoke-virtual {v2, p1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_1
    new-instance v2, Lay2/b;

    invoke-direct {v2, v0, v1, p1}, Lay2/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v2
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

    new-instance v0, Lyx2/a$a;

    invoke-direct {v0, p1, p0}, Lyx2/a$a;-><init>(Lec3/l;Lyx2/a;)V

    return-object v0
.end method
