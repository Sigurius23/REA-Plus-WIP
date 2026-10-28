.class public final Lbe2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lbe2/e;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;",
        "bffFeed",
        "Lbe2/d;",
        "c",
        "(Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;)Lbe2/d;",
        "Lec3/l;",
        "Lzd2/b;",
        "upstream",
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

.method public static final synthetic a(Lbe2/e;Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;)Lbe2/d;
    .locals 0

    invoke-direct {p0, p1}, Lbe2/e;->c(Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;)Lbe2/d;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;)Lbe2/d;
    .locals 14

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;->getRegulatoryInfo()Ljava/util/List;

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

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/shepherd/feature/registration/domain/models/RegulatoryInformationResponse;

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/registration/domain/models/RegulatoryInformationResponse;->getSectionTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/registration/domain/models/RegulatoryInformationResponse;->getRegulatoryLinks()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ljava/lang/String;

    new-instance v7, Lkd1/o$c;

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v2, Lbe2/a;

    invoke-direct {v2, v3, v4}, Lbe2/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->CARET_BACKWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_3
    if-nez v5, :cond_4

    goto :goto_4

    :cond_4
    move-object v1, v5

    :goto_4
    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;->getPageTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;->getHeaderTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v1, Lbe2/d$a;

    invoke-direct/range {v1 .. v6}, Lbe2/d$a;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

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

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbe2/e$a;

    invoke-direct {v0, p1, p0}, Lbe2/e$a;-><init>(Lec3/l;Lbe2/e;)V

    return-object v0
.end method
