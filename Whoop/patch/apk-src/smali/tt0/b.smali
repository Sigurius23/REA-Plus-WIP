.class public abstract Ltt0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a+\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a+\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "T",
        "",
        "other",
        "",
        "a",
        "(Ljava/util/List;Ljava/util/List;)Z",
        "Lec3/l;",
        "Lkotlin/time/Duration;",
        "windowDuration",
        "c",
        "(Lec3/l;J)Lec3/l;",
        "",
        "",
        "startIndex",
        "",
        "b",
        "([BI)Ljava/lang/String;",
        "connectivity-core_release"
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
.method public static final a(Ljava/util/List;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Ljava/util/List<",
            "+TT;>;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final b([BI)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    array-length v1, p0

    move v2, p1

    :goto_0
    if-ge v2, v1, :cond_1

    aget-byte v3, p0, v2

    if-nez v3, :cond_0

    move v0, v2

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    new-instance v1, Ljava/lang/String;

    sub-int/2addr v0, p1

    sget-object v2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, p0, p1, v0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v1
.end method

.method public static final c(Lec3/l;J)Lec3/l;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lec3/l;",
            "J)",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "$this$throttleFirst"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lkotlin/jvm/internal/g0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object v0

    invoke-virtual {v0}, Lbc3/l1;->complete()Z

    iput-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v0, Ltt0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v3, v1}, Ltt0/b$a;-><init>(Lkotlin/jvm/internal/g0;Lq83/d;)V

    new-instance v2, Lec3/y;

    invoke-direct {v2, p0, v0}, Lec3/y;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance v1, Ltt0/b$b;

    const/4 v6, 0x0

    move-wide v4, p1

    invoke-direct/range {v1 .. v6}, Ltt0/b$b;-><init>(Lec3/l;Lkotlin/jvm/internal/g0;JLq83/d;)V

    new-instance p0, Lec3/s1;

    invoke-direct {p0, v1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p0
.end method
