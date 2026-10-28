.class public final Lxj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a(Landroid/view/View;Ll83/k;Ljava/util/List;Lfk/a;)Lxj/b;
    .locals 5

    new-instance v0, Lm83/m;

    invoke-direct {v0}, Lm83/m;-><init>()V

    invoke-virtual {v0, p0}, Lm83/m;->addLast(Ljava/lang/Object;)V

    const/4 p0, 0x0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    :try_start_0
    invoke-virtual {v0}, Lm83/m;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_1

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Landroid/view/ViewGroup;

    new-instance v3, Lh5/r0;

    invoke-direct {v3, v2}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    :try_start_1
    move-object v2, p2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_2

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_5

    :cond_2
    :goto_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lak/c;

    invoke-interface {v3, v1, p1}, Lak/c;->a(Landroid/view/View;Ll83/k;)Lxj/b;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v3, :cond_3

    const/4 p0, 0x1

    goto :goto_4

    :cond_3
    const/4 v3, 0x0

    move v4, v3

    move-object v3, p0

    move p0, v4

    :goto_4
    if-eqz p0, :cond_4

    move-object p0, v3

    goto :goto_0

    :cond_4
    move-object p0, v3

    goto :goto_3

    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error while locating target in view hierarchy: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p3, v1}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    const-string v1, "Unable to get view from queue"

    invoke-interface {p3, v1}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    return-object p0
.end method
