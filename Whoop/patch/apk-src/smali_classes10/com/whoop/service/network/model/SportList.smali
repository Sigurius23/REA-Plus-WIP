.class public Lcom/whoop/service/network/model/SportList;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private currentSports:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/Sport;",
            ">;"
        }
    .end annotation
.end field

.field private sportsById:La0/g1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La0/g1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/Sport;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lcom/whoop/service/network/model/SportList;->loadSports(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/service/network/model/Sport;Lcom/whoop/service/network/model/Sport;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/service/network/model/SportList;->lambda$loadSports$0(Lcom/whoop/service/network/model/Sport;Lcom/whoop/service/network/model/Sport;)I

    move-result p0

    return p0
.end method

.method private static synthetic lambda$loadSports$0(Lcom/whoop/service/network/model/Sport;Lcom/whoop/service/network/model/Sport;)I
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/service/network/model/Sport;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/whoop/service/network/model/Sport;->getName()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-interface {v0, p0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private loadSports(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/Sport;",
            ">;)V"
        }
    .end annotation

    new-instance v0, La0/g1;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, La0/g1;-><init>(I)V

    iput-object v0, p0, Lcom/whoop/service/network/model/SportList;->sportsById:La0/g1;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ldb/k0;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Ldb/k0;-><init>(I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/whoop/service/network/model/SportList;->currentSports:Ljava/util/List;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/model/Sport;

    iget-object v1, p0, Lcom/whoop/service/network/model/SportList;->sportsById:La0/g1;

    invoke-virtual {v0}, Lcom/whoop/service/network/model/Sport;->getId()I

    move-result v2

    invoke-virtual {v1, v2, v0}, La0/g1;->f(ILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/service/network/model/Sport;->isCurrent()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/service/network/model/SportList;->currentSports:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public getCurrentSports()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/Sport;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/service/network/model/SportList;->currentSports:Ljava/util/List;

    return-object v0
.end method

.method public getSportForId(I)Lcom/whoop/service/network/model/Sport;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/SportList;->sportsById:La0/g1;

    invoke-virtual {v0, p1}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/service/network/model/Sport;

    return-object p1
.end method
