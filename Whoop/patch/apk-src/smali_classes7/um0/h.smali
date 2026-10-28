.class public abstract Lum0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lum0/d;",
        "Lmm0/b;",
        "d",
        "(Lum0/d;)Lmm0/b;",
        "Lum0/c;",
        "e",
        "(Lmm0/b;)Lum0/c;",
        "",
        "Lum0/f;",
        "f",
        "(Lmm0/b;)Ljava/util/List;",
        "cache_release"
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
.method public static final synthetic a(Lum0/d;)Lmm0/b;
    .locals 0

    invoke-static {p0}, Lum0/h;->d(Lum0/d;)Lmm0/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lmm0/b;)Lum0/c;
    .locals 0

    invoke-static {p0}, Lum0/h;->e(Lmm0/b;)Lum0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lmm0/b;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lum0/h;->f(Lmm0/b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lum0/d;)Lmm0/b;
    .locals 7

    invoke-virtual {p0}, Lum0/d;->a()Lum0/c;

    move-result-object v0

    invoke-virtual {v0}, Lum0/c;->c()Ljava/lang/String;

    move-result-object v2

    sget-object v0, Lne3/l;->z:Lne3/k;

    invoke-virtual {p0}, Lum0/d;->a()Lum0/c;

    move-result-object v0

    invoke-virtual {v0}, Lum0/c;->a()[B

    move-result-object v0

    const v1, -0x499602d2

    invoke-static {v1, v0}, Lne3/k;->c(I[B)Lne3/l;

    move-result-object v3

    invoke-virtual {p0}, Lum0/d;->a()Lum0/c;

    move-result-object v0

    invoke-virtual {v0}, Lum0/c;->b()J

    move-result-wide v4

    invoke-virtual {p0}, Lum0/d;->b()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lum0/f;

    invoke-virtual {v1}, Lum0/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v6

    new-instance v1, Lmm0/b;

    invoke-direct/range {v1 .. v6}, Lmm0/b;-><init>(Ljava/lang/String;Lne3/l;JLjava/util/Set;)V

    return-object v1
.end method

.method private static final e(Lmm0/b;)Lum0/c;
    .locals 5

    new-instance v0, Lum0/c;

    invoke-virtual {p0}, Lmm0/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lmm0/b;->a()Lne3/l;

    move-result-object v2

    invoke-virtual {v2}, Lne3/l;->r()[B

    move-result-object v2

    invoke-virtual {p0}, Lmm0/b;->b()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lum0/c;-><init>(Ljava/lang/String;[BJ)V

    return-object v0
.end method

.method private static final f(Lmm0/b;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmm0/b;",
            ")",
            "Ljava/util/List<",
            "Lum0/f;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lmm0/b;->c()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    new-instance v3, Lum0/f;

    invoke-virtual {p0}, Lmm0/b;->d()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-wide/16 v4, 0x0

    invoke-direct/range {v3 .. v9}, Lum0/f;-><init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method
