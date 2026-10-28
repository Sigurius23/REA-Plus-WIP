.class public abstract La12/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001d\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "path",
        "La12/a;",
        "e",
        "(Ljava/lang/String;)La12/a;",
        "url",
        "Ll83/k;",
        "c",
        "(Ljava/lang/String;)Ll83/k;",
        "query",
        "",
        "d",
        "(Ljava/lang/String;)Ljava/util/Map;",
        "",
        "plusIsSpace",
        "a",
        "(Ljava/lang/String;Z)Ljava/lang/String;",
        "network_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final a(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    const/16 v0, 0xb

    const/4 v1, 0x0

    :try_start_0
    invoke-static {v1, v1, v0, p0, p1}, Li63/a;->e(IIILjava/lang/String;Z)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Lio/ktor/http/URLDecodeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, La12/b;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/String;)Ll83/k;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    const-string v0, "?"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ge v2, v1, :cond_0

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    check-cast p0, Ljava/lang/String;

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method private static final d(Ljava/lang/String;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "&"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {p0, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    const-string v2, "="

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x2

    invoke-static {v1, v2, v4}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x1

    invoke-static {v4, v2, v5, v3}, La12/b;->b(Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v5, v4, :cond_2

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_2
    const-string v1, ""

    :goto_1
    check-cast v1, Ljava/lang/String;

    invoke-static {v1, v5}, La12/b;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_3

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    :goto_2
    if-eqz v3, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {v0}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;)La12/a;
    .locals 3

    const-string v0, "path"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, La12/b;->c(Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, La12/b;->d(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    new-instance v2, La12/a;

    invoke-direct {v2, p0, v1, v0}, La12/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v2
.end method
