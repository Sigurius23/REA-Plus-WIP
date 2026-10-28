.class public final Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001aQ\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a%\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001aI\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00082\u0006\u0010\u000b\u001a\u00028\u00002\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0008\u0000\u0012\u00028\u00000\u000cj\n\u0012\u0006\u0008\u0000\u0012\u00028\u0000`\rH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001ay\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0011*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0008\u0000\u0012\u00028\u00000\u000cj\n\u0012\u0006\u0008\u0000\u0012\u00028\u0000`\r2\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0081\u0001\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0011*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0008\u0000\u0012\u00028\u00000\u000cj\n\u0012\u0006\u0008\u0000\u0012\u00028\u0000`\r2\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001ac\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0008\u0000\u0012\u00028\u00000\u000cj\n\u0012\u0006\u0008\u0000\u0012\u00028\u0000`\rH\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u001d"
    }
    d2 = {
        "T",
        "",
        "Lkotlin/Function1;",
        "",
        "filter",
        "update",
        "updateIf",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;",
        "",
        "toImmutableList",
        "(Ljava/util/List;)Ljava/util/List;",
        "element",
        "Ljava/util/Comparator;",
        "Lkotlin/Comparator;",
        "comparator",
        "insertSorted",
        "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;",
        "ID",
        "idSelector",
        "upsertSorted",
        "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;",
        "",
        "maxSize",
        "upsertSortedBounded",
        "(Ljava/util/List;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;",
        "other",
        "",
        "mergeSorted",
        "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;)Ljava/util/List;",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final insertSorted(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;TT;",
            "Ljava/util/Comparator<",
            "-TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "comparator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1, v0}, Lwb3/f;->Z(II)V

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_1

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p2, v3, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_0

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_0
    if-lez v3, :cond_2

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    neg-int v2, v1

    :cond_2
    if-ltz v2, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    neg-int v2, v2

    :goto_1
    invoke-interface {p0, v2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final mergeSorted(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/util/Comparator<",
            "-TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "idSelector"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "comparator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const/4 p2, 0x0

    move v1, p2

    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge p2, v2, :cond_4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p3, v2, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    if-gtz v4, :cond_3

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_3
    invoke-interface {p0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p3

    if-ge p2, p3, :cond_5

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_5
    :goto_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-ge v1, p2, :cond_6

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_6
    invoke-static {p0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final toImmutableList(Ljava/util/List;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final updateIf(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "update"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_1

    if-nez v2, :cond_0

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    :cond_0
    invoke-interface {p2, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    return-object p0

    :cond_3
    return-object v2
.end method

.method public static final upsertSorted(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "ID:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;TT;",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/util/Comparator<",
            "-TT;>;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "idSelector"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "comparator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "update"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_1
    if-ltz v2, :cond_3

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p3, p2, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    if-nez p2, :cond_2

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_2
    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-static {p0, p1, p3}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->insertSorted(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_3
    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p0, p1, p3}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->insertSorted(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic upsertSorted$default(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    new-instance p4, Lio/getstream/chat/android/client/internal/state/utils/internal/d;

    const/4 p5, 0x0

    invoke-direct {p4, p1, p5}, Lio/getstream/chat/android/client/internal/state/utils/internal/d;-><init>(Ljava/lang/Object;I)V

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->upsertSorted(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final upsertSorted$lambda$0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static final upsertSortedBounded(Ljava/util/List;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "ID:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;TT;I",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/util/Comparator<",
            "-TT;>;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "idSelector"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "comparator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "update"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p3, p4, p5}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->upsertSorted(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, p2, :cond_0

    invoke-static {p2, p0}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static synthetic upsertSortedBounded$default(Ljava/util/List;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/List;
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    new-instance p5, Lio/getstream/chat/android/client/internal/state/utils/internal/d;

    const/4 p6, 0x0

    invoke-direct {p5, p1, p6}, Lio/getstream/chat/android/client/internal/state/utils/internal/d;-><init>(Ljava/lang/Object;I)V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->upsertSortedBounded(Ljava/util/List;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final upsertSortedBounded$lambda$4(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method
