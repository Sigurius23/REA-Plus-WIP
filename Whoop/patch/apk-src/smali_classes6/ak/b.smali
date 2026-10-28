.class public final Lak/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lak/c;


# instance fields
.field public volatile a:Lio/sentry/internal/debugmeta/c;

.field public final b:Lfk/a;


# direct methods
.method public constructor <init>(Lfk/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/b;->b:Lfk/a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ll83/k;)Lxj/b;
    .locals 13

    iget-object v0, p0, Lak/b;->a:Lio/sentry/internal/debugmeta/c;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lak/b;->a:Lio/sentry/internal/debugmeta/c;

    if-nez v0, :cond_0

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    iget-object v1, p0, Lak/b;->b:Lfk/a;

    invoke-direct {v0, v1}, Lio/sentry/internal/debugmeta/c;-><init>(Lfk/a;)V

    iput-object v0, p0, Lak/b;->a:Lio/sentry/internal/debugmeta/c;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    instance-of v0, p1, Landroidx/compose/ui/node/Owner;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    goto/16 :goto_b

    :cond_2
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    check-cast p1, Landroidx/compose/ui/node/Owner;

    invoke-interface {p1}, Landroidx/compose/ui/node/Owner;->getRoot()La3/n0;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    move-object p1, v1

    move-object v6, p1

    :goto_3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_11

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La3/n0;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, La3/n0;->Y()Z

    move-result v3

    if-eqz v3, :cond_10

    iget-object v3, p0, Lak/b;->a:Lio/sentry/internal/debugmeta/c;

    iget-object v4, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    iget-object v5, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    iget-object v7, v3, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/reflect/Field;

    if-nez v7, :cond_4

    :goto_4
    move-object v3, v1

    goto :goto_5

    :cond_4
    :try_start_1
    invoke-virtual {v7, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La3/r0;

    if-nez v7, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7}, Ly2/q1;->f(Ly2/y;)Lh2/c;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    iget-object v3, v3, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v3, Lfk/a;

    const-string v7, "Could not fetch position for LayoutNode"

    invoke-interface {v3, v7}, Lfk/a;->warn(Ljava/lang/String;)V

    goto :goto_4

    :goto_5
    if-nez v3, :cond_6

    goto/16 :goto_a

    :cond_6
    iget v7, v3, Lh2/c;->a:F

    cmpl-float v7, v4, v7

    if-ltz v7, :cond_10

    iget v7, v3, Lh2/c;->c:F

    cmpg-float v4, v4, v7

    if-gtz v4, :cond_10

    iget v4, v3, Lh2/c;->b:F

    cmpl-float v4, v5, v4

    if-ltz v4, :cond_10

    iget v3, v3, Lh2/c;->d:F

    cmpg-float v3, v5, v3

    if-gtz v3, :cond_10

    invoke-virtual {v2}, La3/n0;->D()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_7
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly2/y0;

    iget-object v5, v5, Ly2/y0;->a:Landroidx/compose/ui/Modifier;

    instance-of v7, v5, Lb3/j2;

    if-eqz v7, :cond_7

    move-object v7, v5

    check-cast v7, Lb3/j2;

    const-string v8, "testTag"

    invoke-interface {v7}, Lb3/j2;->getNameFallback()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v7}, Lb3/j2;->getInspectableElements()Lxb3/i;

    move-result-object v8

    invoke-interface {v8}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lb3/c3;

    const-string v10, "tag"

    iget-object v11, v9, Lb3/c3;->a:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    iget-object p1, v9, Lb3/c3;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    goto :goto_8

    :cond_9
    const-string v8, "semantics"

    invoke-interface {v7}, Lb3/j2;->getNameFallback()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v7}, Lb3/j2;->getInspectableElements()Lxb3/i;

    move-result-object v8

    invoke-interface {v8}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_a
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lb3/c3;

    const-string v10, "properties"

    iget-object v11, v9, Lb3/c3;->a:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    iget-object v9, v9, Lb3/c3;->b:Ljava/lang/Object;

    instance-of v10, v9, Ljava/util/LinkedHashMap;

    if-eqz v10, :cond_a

    check-cast v9, Ljava/util/LinkedHashMap;

    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    const-string v11, "TestTag"

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_7

    :cond_c
    :goto_8
    const-string v8, "clickable"

    invoke-interface {v7}, Lb3/j2;->getNameFallback()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_e

    :cond_d
    :goto_9
    move v4, v8

    goto/16 :goto_6

    :cond_e
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v5

    const-string v7, "androidx.compose.foundation.ClickableElement"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    const-string v7, "androidx.compose.foundation.CombinedClickableElement"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_9

    :cond_f
    if-eqz v4, :cond_10

    move-object v6, p1

    :cond_10
    :goto_a
    invoke-virtual {v2}, La3/n0;->L()Lr1/c;

    move-result-object v2

    invoke-virtual {v2}, Lr1/c;->f()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_3

    :cond_11
    if-nez v6, :cond_12

    :goto_b
    return-object v1

    :cond_12
    new-instance v2, Lxj/b;

    const-string v8, "jetpack_compose"

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lxj/b;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method
