.class public final Lzx1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lzx1/a;",
        "",
        "<init>",
        "()V",
        "Lwx1/b;",
        "domainResult",
        "Lyx1/f;",
        "a",
        "(Lwx1/b;)Lyx1/f;",
        "membership_release"
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


# virtual methods
.method public final a(Lwx1/b;)Lyx1/f;
    .locals 11

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwx1/b$b;

    if-eqz v0, :cond_0

    new-instance v1, Lyx1/f;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lyx1/f;-><init>(ZZLyx1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lwx1/b$a;

    if-eqz v0, :cond_1

    new-instance v1, Lyx1/f;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lyx1/f;-><init>(ZZLyx1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lwx1/b$c;

    if-eqz v0, :cond_4

    check-cast p1, Lwx1/b$c;

    invoke-virtual {p1}, Lwx1/b$c;->a()Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->getNavbarTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->getAlertTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->getAlertSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->getInstructionsTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->getInstructions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;

    new-instance v8, Lyx1/b;

    invoke-virtual {v7}, Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;->getIcon()Lgz0/m0;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;->getMarkdownText()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v9, v7}, Lyx1/b;-><init>(Lgz0/m0;Ljava/lang/String;)V

    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->getButtons()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    move v7, v6

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v0, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;

    new-instance v8, Lyx1/a;

    invoke-virtual {v7}, Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;->getUrl()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7}, Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;->getFilePath()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v9, v10, v7}, Lyx1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->getFooterText()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->getPolicyCtaText()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {p1}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->getPolicyCtaUrl()Ljava/lang/String;

    move-result-object v9

    new-instance v0, Lyx1/c;

    invoke-direct/range {v0 .. v9}, Lyx1/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    new-instance p1, Lyx1/f;

    const/4 v1, 0x0

    invoke-direct {p1, v1, v1, v0}, Lyx1/f;-><init>(ZZLyx1/c;)V

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
