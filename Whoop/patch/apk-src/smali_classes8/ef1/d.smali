.class public final Lef1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00042\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lef1/d;",
        "",
        "<init>",
        "()V",
        "Lef1/c$b;",
        "screenState",
        "Ld61/a;",
        "event",
        "",
        "timeSegmentIndex",
        "b",
        "(Lef1/c$b;Ld61/a;I)Lef1/c$b;",
        "Lef1/a$d;",
        "currentViewState",
        "modifiedState",
        "Lef1/f;",
        "a",
        "(Lef1/a$d;Lef1/c$b;Lef1/c$b;)Lef1/f;",
        "exercise-progress-mini-arch_release"
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

.method private final b(Lef1/c$b;Ld61/a;I)Lef1/c$b;
    .locals 19

    invoke-interface/range {p2 .. p2}, Ld61/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

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

    check-cast v2, Lcz0/s;

    invoke-virtual {v2}, Lcz0/s;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lef1/c$b;->f()Ljava/util/Map;

    move-result-object v0

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lef1/c$c;

    if-nez v2, :cond_1

    return-object p1

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v1, 0x1

    if-ltz v1, :cond_7

    check-cast v4, La71/a;

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :goto_2
    move-object v7, v1

    goto :goto_3

    :cond_2
    invoke-virtual {v4}, La71/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    goto :goto_2

    :goto_3
    invoke-virtual {v4}, La71/a;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget-object v10, Lv41/j0;->NONE:Lv41/j0;

    invoke-virtual {v4}, La71/a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v4}, La71/a;->f()Ly81/e;

    move-result-object v13

    invoke-virtual {v4}, La71/a;->c()Lhy0/h1;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lhy0/h1;->t()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_5

    :cond_3
    :goto_4
    move-object v14, v1

    goto :goto_6

    :cond_4
    :goto_5
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    goto :goto_4

    :goto_6
    invoke-virtual {v4}, La71/a;->c()Lhy0/h1;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lhy0/h1;->v()Ly81/e;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_8

    :cond_5
    :goto_7
    move-object v15, v1

    goto :goto_9

    :cond_6
    :goto_8
    sget-object v1, Lef1/d$a;->w:Lef1/d$a;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    goto :goto_7

    :goto_9
    sget-object v11, Lv41/l0;->NONE:Lv41/l0;

    new-instance v6, Lv41/m;

    const/16 v17, 0x200

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v6 .. v18}, Lv41/m;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lv41/j0;Lv41/l0;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lv41/k0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v5

    goto :goto_1

    :cond_7
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_8
    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lef1/c$c;->b(Lef1/c$c;Ljava/util/List;Li11/f;Lm91/u;Ljava/util/List;Ls01/d;ILjava/lang/Object;)Lef1/c$c;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lef1/c$b;->f()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v7, 0xe

    const/4 v8, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, Lef1/c$b;->b(Lef1/c$b;Ljava/util/Map;Lo51/f;Lo51/e;Ljava/lang/Integer;ILjava/lang/Object;)Lef1/c$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Lef1/a$d;Lef1/c$b;Lef1/c$b;)Lef1/f;
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentViewState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lef1/a$d;->a()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ld61/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lef1/a$d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld61/a;

    instance-of v2, v0, Ld61/a$c;

    if-nez v2, :cond_3

    instance-of v2, v0, Ld61/a$a;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    instance-of p1, v0, Ld61/a$b;

    if-eqz p1, :cond_2

    new-instance p1, Lef1/f;

    const/4 p2, 0x0

    invoke-direct {p1, v1, p2}, Lef1/f;-><init>(Lef1/c$b;Z)V

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    if-nez p3, :cond_4

    goto :goto_1

    :cond_4
    move-object p2, p3

    :goto_1
    invoke-virtual {p1}, Lef1/a$d;->b()I

    move-result p1

    invoke-direct {p0, p2, v0, p1}, Lef1/d;->b(Lef1/c$b;Ld61/a;I)Lef1/c$b;

    move-result-object p1

    new-instance p2, Lef1/f;

    const/4 p3, 0x1

    invoke-direct {p2, p1, p3}, Lef1/f;-><init>(Lef1/c$b;Z)V

    return-object p2
.end method
