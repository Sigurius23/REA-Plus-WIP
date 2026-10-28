.class public Llm2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lu92/d;

.field private b:Ltr2/n;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v0

    invoke-virtual {v0}, Le50/b;->e()Lu92/d;

    move-result-object v0

    new-instance v1, Ltr2/o;

    .line 2
    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v2

    invoke-virtual {v2}, Le50/b;->d()Ltr2/n;

    move-result-object v2

    const-string v3, "AddActivityHistory"

    invoke-direct {v1, v2, v3}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, v0, v1}, Llm2/a;-><init>(Lu92/d;Ltr2/n;)V

    return-void
.end method

.method public constructor <init>(Lu92/d;Ltr2/n;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Llm2/a;->a:Lu92/d;

    .line 6
    iput-object p2, p0, Llm2/a;->b:Ltr2/n;

    return-void
.end method

.method private a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llm2/a;->a:Lu92/d;

    const-string v1, "ActivityHistory"

    invoke-virtual {v0, v1}, Lu92/d;->l(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, ":"

    invoke-static {p1, v0, p2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Llm2/a;->b:Ltr2/n;

    const-string v1, "Dropping history item, unrecognized format: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method


# virtual methods
.method public c(Lcom/whoop/service/network/model/SportList;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/model/SportList;",
            ")",
            "Ljava/util/List<",
            "Llm2/b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Llm2/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lce/w;->W(Ljava/util/List;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x2

    if-eq v5, v6, :cond_1

    invoke-direct {p0, v3}, Llm2/a;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "Sleep"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x1

    if-nez v6, :cond_4

    const-string v6, "Sport"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-direct {p0, v3}, Llm2/a;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    aget-object v4, v4, v7

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/whoop/service/network/model/SportList;->getSportForId(I)Lcom/whoop/service/network/model/Sport;

    move-result-object v4

    if-nez v4, :cond_3

    iget-object v4, p0, Llm2/a;->b:Ltr2/n;

    const-string v5, "Dropping history item, couldn\'t find sport: "

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v5, v2, [Lqr2/a$a;

    invoke-interface {v4, v3, v5}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_3
    new-instance v3, Llm2/d;

    invoke-direct {v3, v4}, Llm2/d;-><init>(Lcom/whoop/service/network/model/Sport;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v3, Llm2/c;

    aget-object v4, v4, v7

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-direct {v3, v4}, Llm2/c;-><init>(Z)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v1
.end method

.method public e(Llm2/b;)V
    .locals 4

    instance-of v0, p1, Llm2/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Llm2/d;

    invoke-virtual {p1}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/service/network/model/Sport;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Sport"

    invoke-direct {p0, v0, p1}, Llm2/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Llm2/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v2, 0x4

    if-le p1, v2, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    if-ge v1, v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move-object v0, p1

    :cond_1
    iget-object p1, p0, Llm2/a;->a:Lu92/d;

    const-string v1, "ActivityHistory"

    invoke-virtual {p1, v1, v0}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V

    return-void

    :cond_2
    instance-of v0, p1, Llm2/c;

    if-eqz v0, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, Llm2/a;->b:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Dropping activity, unrecognzied type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
