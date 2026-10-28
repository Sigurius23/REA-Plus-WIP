.class public final Lzt1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lzt1/f;",
        "",
        "<init>",
        "()V",
        "Lxt1/b$d;",
        "state",
        "Lzt1/c$c;",
        "c",
        "(Lxt1/b$d;)Lzt1/c$c;",
        "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;",
        "Lzt1/a;",
        "b",
        "(Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;)Lzt1/a;",
        "Lxt1/b;",
        "Lzt1/c;",
        "a",
        "(Lxt1/b;)Lzt1/c;",
        "labrador_release"
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

.method private final b(Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;)Lzt1/a;
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;->getItems()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;

    new-instance v4, Lzt1/b;

    invoke-virtual {v3}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->getAlertState()Z

    move-result v5

    invoke-virtual {v3}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v3}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->getDescription()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v3}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v6, v7, v3}, Lzt1/b;-><init>(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lzt1/a;

    invoke-direct {p1, v0, v1, v2}, Lzt1/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V

    return-object p1
.end method

.method private final c(Lxt1/b$d;)Lzt1/c$c;
    .locals 14

    invoke-interface {p1}, Lxt1/b$d;->a()Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    move-result-object v0

    sget v1, Lrs1/f;->n:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v1, Lrs1/f;->n0:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    sget v1, Lrs1/f;->e:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->getNextToken()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1}, Lxt1/b$d;->a()Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->getLearnMoreDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v8, Lcom/whoop/navigation/e;

    sget-object v9, Lcom/whoop/navigation/AppScreen$e3;->w:Lcom/whoop/navigation/AppScreen$e3;

    sget-object v10, Lcom/whoop/navigation/LabradorAboutScreenModel;->INSTANCE:Lcom/whoop/navigation/LabradorAboutScreenModel;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v8

    goto :goto_0

    :cond_0
    move-object v6, v0

    :goto_0
    instance-of v8, p1, Lxt1/b$h;

    instance-of v9, p1, Lxt1/b$g;

    invoke-interface {p1}, Lxt1/b$d;->a()Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->getRecords()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;

    invoke-direct {p0, v1}, Lzt1/f;->b(Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;)Lzt1/a;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    instance-of v11, p1, Lxt1/b$b;

    instance-of v12, p1, Lxt1/b$a;

    new-instance v2, Lzt1/c$c;

    invoke-direct/range {v2 .. v12}, Lzt1/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/String;ZZLjava/util/List;ZZ)V

    return-object v2
.end method


# virtual methods
.method public final a(Lxt1/b;)Lzt1/c;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lxt1/b$c;->a:Lxt1/b$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lzt1/c$a;->a:Lzt1/c$a;

    return-object p1

    :cond_0
    instance-of v0, p1, Lxt1/b$e;

    if-eqz v0, :cond_1

    sget-object p1, Lzt1/c$b;->a:Lzt1/c$b;

    return-object p1

    :cond_1
    instance-of v0, p1, Lxt1/b$d;

    if-eqz v0, :cond_2

    check-cast p1, Lxt1/b$d;

    invoke-direct {p0, p1}, Lzt1/f;->c(Lxt1/b$d;)Lzt1/c$c;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
