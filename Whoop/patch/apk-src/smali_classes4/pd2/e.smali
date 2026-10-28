.class public final Lpd2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpd2/e;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;",
        "bffFeed",
        "Lpd2/d;",
        "c",
        "(Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;)Lpd2/d;",
        "Lec3/l;",
        "Lnd2/b;",
        "domainState",
        "b",
        "(Lec3/l;)Lec3/l;",
        "shepherd_release"
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

.method public static final synthetic a(Lpd2/e;Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;)Lpd2/d;
    .locals 0

    invoke-direct {p0, p1}, Lpd2/e;->c(Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;)Lpd2/d;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;)Lpd2/d;
    .locals 17

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;->getInformationItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/shepherd/feature/about/domain/models/InformationItem;

    new-instance v3, Lpd2/a;

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/about/domain/models/InformationItem;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/about/domain/models/InformationItem;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lpd2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;->getTileItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/shepherd/feature/about/domain/models/TileItem;

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/about/domain/models/TileItem;->getTileLabel()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/about/domain/models/TileItem;->getCaretIcon()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v7, v5

    const/4 v8, 0x0

    :goto_2
    const/4 v10, 0x0

    if-ge v8, v7, :cond_2

    aget-object v11, v5, v8

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_2
    move-object v11, v10

    :goto_3
    if-nez v11, :cond_3

    goto :goto_4

    :cond_3
    move-object v4, v11

    :goto_4
    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/about/domain/models/TileItem;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v4

    sget-object v5, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    move-object v10, v1

    :cond_4
    new-instance v1, Lpd2/f;

    invoke-direct {v1, v2, v3, v10}, Lpd2/f;-><init>(Lcom/whoop/design/util/TextResource;ILcom/whoop/navigation/e;)V

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    new-instance v1, Lpd2/d$a;

    sget-object v0, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;->getAboutTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Lkd1/o$c;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;->getAboutImageUrl()Ljava/lang/String;

    move-result-object v11

    const/16 v15, 0xe

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v10, v5

    invoke-direct/range {v10 .. v16}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;->getManufacturerLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;->getManufacturerAddress()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct/range {v1 .. v9}, Lpd2/d$a;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v1
.end method


# virtual methods
.method public final b(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpd2/e$a;

    invoke-direct {v0, p1, p0}, Lpd2/e$a;-><init>(Lec3/l;Lpd2/e;)V

    return-object v0
.end method
