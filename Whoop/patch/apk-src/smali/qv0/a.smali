.class public final Lqv0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J7\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0004*\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u000c*\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000f2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lqv0/a;",
        "",
        "<init>",
        "()V",
        "",
        "Lcom/whoop/design/models/items/ListItemTileModel;",
        "",
        "selectedFilter",
        "filterTypes",
        "Lm91/u;",
        "c",
        "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;",
        "",
        "b",
        "(Ljava/lang/String;)Z",
        "Lec3/l;",
        "Lnv0/b;",
        "upstream",
        "Lpv0/d;",
        "d",
        "(Lec3/l;)Lec3/l;",
        "content-search_release"
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

.method public static final synthetic a(Lqv0/a;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lqv0/a;->c(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "ALL"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final c(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ListItemTileModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p2}, Lqv0/a;->b(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/models/items/ListItemTileModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ListItemTileModel;->getTileType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p2, v1}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/models/items/ListItemTileModel;

    move-object v3, p3

    check-cast v3, Ljava/lang/Iterable;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ListItemTileModel;->getTileType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lor2/o1;->a(Ljava/lang/Iterable;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    move-object p3, p2

    :cond_4
    const/4 p1, 0x0

    invoke-static {p1, v1, p1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final d(Lec3/l;)Lec3/l;
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

    new-instance v0, Lqv0/a$a;

    invoke-direct {v0, p1, p0}, Lqv0/a$a;-><init>(Lec3/l;Lqv0/a;)V

    return-object v0
.end method
