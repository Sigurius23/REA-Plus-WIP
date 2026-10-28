.class public abstract Luk0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00020\u0000\"\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001f\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00072\n\u0010\u0006\u001a\u00020\u0000\"\u00020\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "",
        "values",
        "",
        "b",
        "([J)Ljava/lang/String;",
        "vals",
        "",
        "a",
        "([J)[Ljava/lang/String;",
        "connectivity-data-packets-model_release"
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
.method public static final varargs a([J)[Ljava/lang/String;
    .locals 6

    const-string v0, "vals"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-wide v4, p0, v3

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-array p0, v2, [Ljava/lang/String;

    invoke-interface {v0, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static final varargs b([J)Ljava/lang/String;
    .locals 6

    const-string v0, "values"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p0

    invoke-static {p0}, Luk0/c;->a([J)[Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "."

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
