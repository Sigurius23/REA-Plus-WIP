.class public final Ltw0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\u000c\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00072\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0011\u0010\u0010JW\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00042\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0016\u0008\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0018\u00010\u00072\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Ltw0/a;",
        "",
        "<init>",
        "()V",
        "Lsw0/g;",
        "",
        "category",
        "",
        "Lsw0/i;",
        "a",
        "(Lsw0/g;Ljava/lang/String;)Ljava/util/List;",
        "",
        "d",
        "(Lsw0/g;Ljava/lang/String;)Z",
        "bottomSheet",
        "b",
        "(Lsw0/g;)Ljava/util/List;",
        "c",
        "searchedGroupedToggles",
        "searchedPagedGroupedToggles",
        "performFuzzySearch",
        "Lsw0/j;",
        "removedWeeklyPlanBehaviors",
        "Lkm0/e;",
        "e",
        "(Lsw0/g;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lkm0/e;",
        "custombottomsheet_release"
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

.method private final a(Lsw0/g;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw0/g;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lsw0/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lsw0/g;->g()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    sget-object v1, Lm83/y;->w:Lm83/y;

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, p2}, Ltw0/a;->d(Lsw0/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lsw0/i;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    const/4 v2, 0x0

    invoke-direct {p1, p2, v2, v1, v0}, Lsw0/i;-><init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    return-object v1
.end method

.method private final d(Lsw0/g;Ljava/lang/String;)Z
    .locals 8

    invoke-virtual {p1}, Lsw0/g;->j()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsw0/i;

    invoke-virtual {v2}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsw0/j;

    invoke-virtual {v3}, Lsw0/j;->u()Z

    move-result v3

    if-eqz v3, :cond_2

    return v2

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lsw0/g;->d()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move-object v3, v0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lsw0/j;

    invoke-virtual {v7}, Lsw0/j;->i()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_6
    :goto_3
    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    const/4 v2, 0x1

    move-object v3, v4

    goto :goto_2

    :cond_8
    if-nez v2, :cond_9

    goto :goto_4

    :cond_9
    move-object v0, v3

    :goto_4
    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public static synthetic f(Ltw0/a;Lsw0/g;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lkm0/e;
    .locals 1

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    sget-object p5, Lm83/y;->w:Lm83/y;

    :cond_2
    invoke-virtual/range {p0 .. p5}, Ltw0/a;->e(Lsw0/g;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lkm0/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lsw0/g;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw0/g;",
            ")",
            "Ljava/util/List<",
            "Lsw0/i;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "bottomSheet"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lsw0/g;->j()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v9, 0x2

    const/16 v10, 0xa

    const/4 v11, 0x0

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsw0/i;

    invoke-virtual {v3}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lsw0/j;

    invoke-virtual {v7}, Lsw0/j;->i()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v0}, Lsw0/g;->f()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v8, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-virtual {v0}, Lsw0/g;->k()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v3, Ltw0/a$b;

    invoke-direct {v3}, Ltw0/a$b;-><init>()V

    invoke-static {v4, v3}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0}, Lsw0/g;->i()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lsw0/j;

    invoke-virtual {v0}, Lsw0/g;->i()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v8, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v9, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    move-object v3, v4

    goto :goto_4

    :cond_5
    invoke-virtual {v0}, Lsw0/g;->l()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_6

    check-cast v3, Ljava/lang/Iterable;

    invoke-virtual {v0}, Lsw0/g;->l()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v11, v9, v11}, Lwr2/c;->o(Ljava/lang/Iterable;Ljava/lang/String;Lc93/m;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    :cond_6
    :goto_4
    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_0

    :cond_7
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    new-instance v2, Lsw0/i;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v4, -0x1

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lsw0/i;-><init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-virtual {v0}, Lsw0/g;->j()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lsw0/i;

    invoke-virtual {v4}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lsw0/j;

    invoke-virtual {v8}, Lsw0/j;->i()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v0}, Lsw0/g;->f()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual {v0}, Lsw0/g;->k()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v8}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v12, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    new-instance v5, Ltw0/a$c;

    invoke-direct {v5}, Ltw0/a$c;-><init>()V

    new-instance v7, Ltw0/a$d;

    invoke-direct {v7, v5}, Ltw0/a$d;-><init>(Ljava/util/Comparator;)V

    invoke-static {v6, v7}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, Lsw0/g;->i()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_e

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_b
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lsw0/j;

    invoke-virtual {v0}, Lsw0/g;->i()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v12, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_c

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_c
    invoke-virtual {v8}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v13, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    move-object v15, v6

    goto :goto_9

    :cond_e
    invoke-virtual {v0}, Lsw0/g;->l()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_f

    check-cast v5, Ljava/lang/Iterable;

    invoke-virtual {v0}, Lsw0/g;->l()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v11, v9, v11}, Lwr2/c;->o(Ljava/lang/Iterable;Ljava/lang/String;Lc93/m;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v5

    :cond_f
    move-object v15, v5

    :goto_9
    move-object v5, v15

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_10

    new-instance v12, Lsw0/i;

    invoke-virtual {v4}, Lsw0/i;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v4}, Lsw0/i;->d()I

    move-result v14

    const/16 v17, 0x8

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lsw0/i;-><init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    :cond_11
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual {v0}, Lsw0/g;->f()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Ltw0/a;->a(Lsw0/g;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_12
    move-object/from16 v2, p0

    new-instance v0, Ltw0/a$a;

    invoke-direct {v0}, Ltw0/a$a;-><init>()V

    invoke-static {v1, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lsw0/g;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw0/g;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lsw0/i;",
            ">;>;"
        }
    .end annotation

    const-string v0, "bottomSheet"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lsw0/g;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    const/16 v14, 0xfef

    const/4 v15, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v17, v0

    move-object/from16 v0, v16

    invoke-static/range {v1 .. v15}, Lsw0/g;->b(Lsw0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/g;

    move-result-object v2

    move-object/from16 v1, p0

    invoke-virtual {v1, v2}, Ltw0/a;->b(Lsw0/g;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p1

    move-object v2, v0

    move-object/from16 v0, v17

    goto :goto_0

    :cond_0
    move-object/from16 v1, p0

    move-object v0, v2

    return-object v0
.end method

.method public final e(Lsw0/g;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lkm0/e;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw0/g;",
            "Ljava/util/List<",
            "Lsw0/i;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Lsw0/i;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lsw0/j;",
            ">;)",
            "Lkm0/e;"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p5

    const-string v2, "bottomSheet"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "searchedGroupedToggles"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "removedWeeklyPlanBehaviors"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lsw0/g;->n()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v3}, Lsw0/g;->l()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v3}, Lsw0/g;->m()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v3}, Lsw0/g;->d()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v2, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lsw0/g;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lsw0/i;

    invoke-virtual {v10}, Lsw0/i;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v10}, Lsw0/i;->c()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v13

    if-eqz v13, :cond_1

    invoke-static {}, Ltw0/b;->a()Ljb1/a;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v13

    goto :goto_2

    :cond_1
    const/4 v13, 0x0

    :goto_2
    invoke-virtual {v10}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v10, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lsw0/j;

    invoke-virtual {v15}, Lsw0/j;->q()Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    move-result-object v16

    if-eqz v16, :cond_2

    invoke-static/range {v16 .. v16}, Llb1/q4;->m(Lcom/whoop/design/models/items/GoalSettingsTileTagModel;)Lhy0/h1;

    move-result-object v16

    move-object/from16 v11, v16

    goto :goto_4

    :cond_2
    const/4 v11, 0x0

    :goto_4
    invoke-virtual {v15}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v15}, Lsw0/j;->r()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-virtual {v15}, Lsw0/j;->v()Z

    move-result v20

    invoke-virtual {v15}, Lsw0/j;->k()Ljava/lang/String;

    move-result-object v22

    if-eqz v22, :cond_3

    new-instance v21, Lkd1/o$c;

    const/16 v26, 0xe

    const/16 v27, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v21 .. v27}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_3
    const/16 v21, 0x0

    :goto_5
    invoke-virtual {v15}, Lsw0/j;->p()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v15}, Lsw0/j;->i()Ljava/util/List;

    move-result-object v16

    move-object/from16 v28, v0

    move-object/from16 v0, v16

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v16, v2

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_4
    invoke-virtual {v15}, Lsw0/j;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v15}, Lsw0/j;->t()Z

    move-result v25

    invoke-static {v15, v11}, Ltw0/b;->b(Lsw0/j;Lhy0/h1;)Ljava/util/List;

    move-result-object v27

    new-instance v17, Lkm0/d;

    move-object/from16 v23, v1

    move-object/from16 v26, v11

    invoke-direct/range {v17 .. v27}, Lkm0/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLhy0/h1;Ljava/util/List;)V

    move-object/from16 v0, v17

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p5

    move-object/from16 v2, v16

    move-object/from16 v0, v28

    goto/16 :goto_3

    :cond_5
    move-object/from16 v28, v0

    move-object/from16 v16, v2

    new-instance v0, Lkm0/g;

    invoke-direct {v0, v12, v14, v13}, Lkm0/g;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/u;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p5

    move-object/from16 v0, v28

    goto/16 :goto_1

    :cond_6
    move-object/from16 v16, v2

    if-eqz p3, :cond_e

    move-object/from16 v0, p3

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v2, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lsw0/i;

    invoke-virtual {v11}, Lsw0/i;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v11}, Lsw0/i;->c()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v13

    if-eqz v13, :cond_7

    invoke-static {}, Ltw0/b;->a()Ljb1/a;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v13

    goto :goto_9

    :cond_7
    const/4 v13, 0x0

    :goto_9
    invoke-virtual {v11}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v11, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_b

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lsw0/j;

    invoke-virtual {v15}, Lsw0/j;->q()Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    move-result-object v17

    if-eqz v17, :cond_8

    invoke-static/range {v17 .. v17}, Llb1/q4;->m(Lcom/whoop/design/models/items/GoalSettingsTileTagModel;)Lhy0/h1;

    move-result-object v17

    move-object/from16 v29, v17

    goto :goto_b

    :cond_8
    const/16 v29, 0x0

    :goto_b
    invoke-virtual {v15}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v15}, Lsw0/j;->r()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-virtual {v15}, Lsw0/j;->v()Z

    move-result v21

    invoke-virtual {v15}, Lsw0/j;->k()Ljava/lang/String;

    move-result-object v23

    if-eqz v23, :cond_9

    new-instance v22, Lkd1/o$c;

    const/16 v27, 0xe

    const/16 v28, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v22 .. v28}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_c

    :cond_9
    const/16 v22, 0x0

    :goto_c
    invoke-virtual {v15}, Lsw0/j;->p()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-virtual {v15}, Lsw0/j;->i()Ljava/util/List;

    move-result-object v17

    move-object/from16 p3, v0

    move-object/from16 v0, v17

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v17, v2

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_a
    invoke-virtual {v15}, Lsw0/j;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    invoke-virtual {v15}, Lsw0/j;->t()Z

    move-result v26

    move-object/from16 v0, v29

    invoke-static {v15, v0}, Ltw0/b;->b(Lsw0/j;Lhy0/h1;)Ljava/util/List;

    move-result-object v28

    new-instance v18, Lkm0/d;

    move-object/from16 v27, v0

    move-object/from16 v24, v2

    invoke-direct/range {v18 .. v28}, Lkm0/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLhy0/h1;Ljava/util/List;)V

    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, p1

    move-object/from16 v0, p3

    move-object/from16 v2, v17

    goto/16 :goto_a

    :cond_b
    move-object/from16 p3, v0

    move-object/from16 v17, v2

    new-instance v0, Lkm0/g;

    invoke-direct {v0, v12, v14, v13}, Lkm0/g;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/u;)V

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, p1

    move-object/from16 v0, p3

    goto/16 :goto_8

    :cond_c
    move-object/from16 p3, v0

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, p1

    goto/16 :goto_7

    :cond_d
    :goto_e
    move-object v10, v1

    goto :goto_f

    :cond_e
    sget-object v1, Lm83/y;->w:Lm83/y;

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p1}, Lsw0/g;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lsw0/g;->e()Lsw0/b;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v1, Lkm0/f;

    invoke-virtual {v0}, Lsw0/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lsw0/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lsw0/b;->a()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v0}, Lsw0/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v1, v2, v3, v12, v0}, Lkm0/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object v13, v1

    goto :goto_10

    :cond_f
    const/4 v13, 0x0

    :goto_10
    move-object/from16 v0, p5

    check-cast v0, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsw0/j;

    invoke-virtual {v1}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lsw0/j;->r()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-virtual {v1}, Lsw0/j;->v()Z

    move-result v20

    invoke-virtual {v1}, Lsw0/j;->k()Ljava/lang/String;

    move-result-object v22

    if-eqz v22, :cond_10

    new-instance v21, Lkd1/o$c;

    const/16 v26, 0xe

    const/16 v27, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v21 .. v27}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_12

    :cond_10
    const/16 v21, 0x0

    :goto_12
    invoke-virtual {v1}, Lsw0/j;->p()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v1}, Lsw0/j;->i()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_11
    invoke-virtual {v1}, Lsw0/j;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v1}, Lsw0/j;->t()Z

    move-result v25

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ltw0/b;->b(Lsw0/j;Lhy0/h1;)Ljava/util/List;

    move-result-object v27

    new-instance v17, Lkm0/d;

    const/16 v26, 0x0

    const/16 v28, 0x100

    const/16 v29, 0x0

    move-object/from16 v23, v3

    invoke-direct/range {v17 .. v29}, Lkm0/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLhy0/h1;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_11

    :cond_12
    const/4 v2, 0x0

    invoke-virtual/range {p1 .. p1}, Lsw0/g;->h()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-static {}, Ltw0/b;->a()Ljb1/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    goto :goto_14

    :cond_13
    move-object v0, v2

    :goto_14
    new-instance v3, Lkm0/e;

    const/4 v12, 0x0

    const/16 v17, 0x100

    const/16 v18, 0x0

    move-object/from16 v14, p4

    move-object/from16 v8, v16

    move-object/from16 v16, v0

    invoke-direct/range {v3 .. v18}, Lkm0/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ly81/e;Lkm0/f;Ljava/lang/String;Ljava/util/List;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method
