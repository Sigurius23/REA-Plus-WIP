.class public final Ly50/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ly50/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;",
        "Lx50/c$c;",
        "b",
        "(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;)Lx50/c$c;",
        "Lu50/b;",
        "domainState",
        "Lx50/c;",
        "a",
        "(Lu50/b;)Lx50/c;",
        "access_release"
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

.method private final b(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;)Lx50/c$c;
    .locals 8

    new-instance v0, Lx50/c$c;

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p1}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->getImage()Lcom/whoop/design/models/items/ImageUrlModel;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ImageUrlModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->getContent()Lcom/whoop/design/models/TitleSubTitleModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/TitleSubTitleModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->getContent()Lcom/whoop/design/models/TitleSubTitleModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/TitleSubTitleModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->getFeaturesList()Lcom/whoop/design/models/items/FeatureListModel;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->getButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->getOmronUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->getNavigateOnSuccess()Lcom/whoop/navigation/e;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lx50/c$c;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lu50/b;)Lx50/c;
    .locals 2

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lu50/b;->e()Lu50/e;

    move-result-object v0

    instance-of v1, v0, Lu50/e$e;

    if-eqz v1, :cond_0

    sget-object p1, Lx50/c$e;->b:Lx50/c$e;

    return-object p1

    :cond_0
    instance-of v1, v0, Lu50/e$d;

    if-eqz v1, :cond_1

    sget-object p1, Lx50/c$d;->b:Lx50/c$d;

    return-object p1

    :cond_1
    instance-of v1, v0, Lu50/e$b;

    if-eqz v1, :cond_2

    sget-object p1, Lx50/c$b;->b:Lx50/c$b;

    return-object p1

    :cond_2
    instance-of v1, v0, Lu50/e$a;

    if-eqz v1, :cond_3

    new-instance p1, Lx50/c$a;

    check-cast v0, Lu50/e$a;

    invoke-virtual {v0}, Lu50/e$a;->a()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-direct {p1, v0}, Lx50/c$a;-><init>(Lcom/whoop/navigation/e;)V

    return-object p1

    :cond_3
    instance-of v0, v0, Lu50/e$c;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lu50/b;->d()Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-direct {p0, p1}, Ly50/a;->b(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;)Lx50/c$c;

    move-result-object p1

    if-eqz p1, :cond_4

    return-object p1

    :cond_4
    sget-object p1, Lx50/c$e;->b:Lx50/c$e;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
