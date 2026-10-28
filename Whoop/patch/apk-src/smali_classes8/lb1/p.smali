.class public abstract Llb1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0000*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "",
        "",
        "max",
        "Lkd1/o;",
        "c",
        "(Ljava/util/List;I)Ljava/util/List;",
        "design-models_release"
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
.method public static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Llb1/p;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)Lkd1/o;
    .locals 0

    invoke-static {p0}, Llb1/p;->f(Ljava/lang/String;)Lkd1/o;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/util/List;I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I)",
            "Ljava/util/List<",
            "Lkd1/o;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p0

    new-instance v0, Llb1/m;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {p0, v0}, Lxb3/k;->B(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p0

    invoke-static {p0, p1}, Lxb3/k;->D(Lxb3/i;I)Lxb3/i;

    move-result-object p0

    new-instance p1, Llb1/m;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Llb1/m;-><init>(I)V

    invoke-static {p0, p1}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object p0

    invoke-static {p0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object p0

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;IILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x3

    :cond_0
    invoke-static {p0, p1}, Llb1/p;->c(Ljava/util/List;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "url"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final f(Ljava/lang/String;)Lkd1/o;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object p0

    return-object p0
.end method
