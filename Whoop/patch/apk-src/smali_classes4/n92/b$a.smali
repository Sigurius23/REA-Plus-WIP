.class public final Ln92/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln92/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J%\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0011\u0010\u0008J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Ln92/b$a;",
        "",
        "<init>",
        "()V",
        "",
        "type",
        "",
        "e",
        "(Ljava/lang/String;)Z",
        "Lcom/whoop/domain/model/WhoopUriParser;",
        "whoopUriParser",
        "",
        "c",
        "(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/util/List;",
        "actionData",
        "g",
        "(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/lang/String;",
        "d",
        "Lcom/iterable/iterableapi/d;",
        "actionContext",
        "b",
        "(Lcom/iterable/iterableapi/d;)Ljava/lang/String;",
        "f",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "",
        "COMMUNITY_GATED_ACTIONS",
        "Ljava/util/Set;",
        "app_prodStandardRelease"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ln92/b$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Ln92/b$a;Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Ln92/b$a;->c(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/domain/model/WhoopUriParser;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p1}, Ln92/b$a;->e(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x6

    if-eqz v0, :cond_3

    invoke-interface {p2, p1}, Lcom/whoop/domain/model/WhoopUriParser;->parse(Ljava/lang/String;)Lcom/whoop/domain/model/WhoopUri;

    move-result-object p1

    invoke-interface {p1}, Lcom/whoop/domain/model/WhoopUri;->getQuery()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v0, "&"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "="

    invoke-static {v1, v2, v1}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_1
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object p2

    invoke-interface {p1}, Lcom/whoop/domain/model/WhoopUri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    invoke-virtual {p2, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_2
    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p2, v0}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    invoke-static {p2}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    return-object p1

    :cond_3
    const-string p2, "action://"

    invoke-static {p1, p2}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "|"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final e(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "https://"

    invoke-static {p1, v1, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1

    :cond_0
    return v0
.end method


# virtual methods
.method public final b(Lcom/iterable/iterableapi/d;)Ljava/lang/String;
    .locals 1

    const-string v0, "actionContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p1, Lcom/iterable/iterableapi/d;->a:I

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const-string p1, "embedded"

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string p1, "in_app"

    return-object p1

    :cond_2
    const-string p1, "app_link"

    return-object p1

    :cond_3
    const-string p1, "push"

    return-object p1
.end method

.method public final d(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "action://"

    invoke-static {p1, v1, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "actionData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const-string v1, ":"

    invoke-static {p1, v1, v0}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {p1, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    return-object v2
.end method

.method public final g(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/lang/String;
    .locals 2

    const-string v0, "whoopUriParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ln92/b$a;->e(Ljava/lang/String;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    move-object p1, v1

    :cond_0
    invoke-direct {p0, p1, p2}, Ln92/b$a;->c(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, Ln92/b$a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p1, :cond_2

    move-object p1, v1

    :cond_2
    invoke-direct {p0, p1, p2}, Ln92/b$a;->c(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_3
    const-string p1, "unknown"

    return-object p1
.end method
