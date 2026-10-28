.class public final Lio/sentry/compose/gestures/ComposeGestureTargetLocator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/internal/gestures/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lio/sentry/compose/gestures/ComposeGestureTargetLocator;",
        "Lio/sentry/internal/gestures/a;",
        "Lio/sentry/v0;",
        "logger",
        "<init>",
        "(Lio/sentry/v0;)V",
        "sentry-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lio/sentry/v0;

.field public volatile b:Lio/sentry/compose/a;

.field public final c:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Lio/sentry/v0;)V
    .locals 2

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;->a:Lio/sentry/v0;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;->c:Lio/sentry/util/a;

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object p1

    const-string v0, "maven:io.sentry:sentry-compose"

    const-string v1, "8.41.0"

    invoke-virtual {p1, v0, v1}, Lio/sentry/l5;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;FFLio/sentry/internal/gestures/b;)Lio/sentry/internal/gestures/c;
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p4

    const-string v3, "targetType"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v0, Landroidx/compose/ui/node/Owner;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    goto/16 :goto_b

    :cond_0
    iget-object v3, v1, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;->b:Lio/sentry/compose/a;

    if-nez v3, :cond_2

    iget-object v3, v1, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;->c:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v3

    :try_start_0
    iget-object v5, v1, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;->b:Lio/sentry/compose/a;

    if-nez v5, :cond_1

    new-instance v5, Lio/sentry/compose/a;

    iget-object v6, v1, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;->a:Lio/sentry/v0;

    invoke-direct {v5, v6}, Lio/sentry/compose/a;-><init>(Lio/sentry/v0;)V

    iput-object v5, v1, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;->b:Lio/sentry/compose/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {v3, v4}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v3, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    :goto_2
    check-cast v0, Landroidx/compose/ui/node/Owner;

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getRoot()La3/n0;

    move-result-object v0

    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    move-object v10, v4

    :cond_3
    :goto_3
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_11

    invoke-virtual {v3}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll83/k;

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    iget-object v6, v5, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, La3/n0;

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v6}, La3/n0;->Y()Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v7, v6, La3/n0;->e0:La3/l1;

    iget-object v7, v7, La3/l1;->d:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/ui/node/a;

    iget-object v8, v0, La3/n0;->e0:La3/l1;

    iget-object v8, v8, La3/l1;->d:Ljava/lang/Object;

    check-cast v8, Landroidx/compose/ui/node/a;

    invoke-static {v7, v8}, Lbi/g;->i(Ly2/y;Ly2/y;)Lh2/c;

    move-result-object v7

    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    invoke-static/range {p3 .. p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    int-to-long v11, v11

    const/16 v13, 0x20

    shl-long/2addr v8, v13

    const-wide v13, 0xffffffffL

    and-long/2addr v11, v13

    or-long/2addr v8, v11

    invoke-virtual {v7, v8, v9}, Lh2/c;->a(J)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v7, v1, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;->b:Lio/sentry/compose/a;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, La3/n0;->D()Ljava/util/List;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v11, 0x0

    move v12, v11

    :goto_4
    if-ge v12, v9, :cond_6

    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly2/y0;

    invoke-virtual {v13}, Ly2/y0;->a()Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v7, v13}, Lio/sentry/compose/a;->a(Landroidx/compose/ui/Modifier;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    :cond_6
    move-object v13, v4

    :goto_5
    if-nez v13, :cond_7

    move-object/from16 v18, v5

    goto :goto_6

    :cond_7
    move-object/from16 v18, v13

    :goto_6
    if-eqz v18, :cond_f

    invoke-virtual {v6}, La3/n0;->D()Ljava/util/List;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    :goto_7
    if-ge v11, v7, :cond_f

    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/y0;

    invoke-virtual {v8}, Ly2/y0;->a()Landroidx/compose/ui/Modifier;

    move-result-object v9

    instance-of v9, v9, Li3/m;

    if-eqz v9, :cond_b

    invoke-virtual {v8}, Ly2/y0;->a()Landroidx/compose/ui/Modifier;

    move-result-object v8

    const-string v9, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Li3/m;

    invoke-interface {v8}, Li3/m;->i()Li3/l;

    move-result-object v8

    invoke-virtual {v8}, Li3/l;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_8
    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li3/y;

    iget-object v9, v9, Li3/y;->a:Ljava/lang/String;

    sget-object v12, Lio/sentry/internal/gestures/b;->SCROLLABLE:Lio/sentry/internal/gestures/b;

    if-ne v2, v12, :cond_9

    const-string v12, "ScrollBy"

    invoke-virtual {v12, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    new-instance v14, Lio/sentry/internal/gestures/c;

    const/16 v17, 0x0

    const-string v19, "jetpack_compose"

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v14 .. v19}, Lio/sentry/internal/gestures/c;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v14

    :cond_9
    sget-object v12, Lio/sentry/internal/gestures/b;->CLICKABLE:Lio/sentry/internal/gestures/b;

    if-ne v2, v12, :cond_8

    const-string v12, "OnClick"

    invoke-virtual {v12, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    move-object/from16 v10, v18

    goto :goto_8

    :cond_a
    move-object/from16 v13, v18

    goto :goto_9

    :cond_b
    invoke-virtual {v8}, Ly2/y0;->a()Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lio/sentry/internal/gestures/b;->CLICKABLE:Lio/sentry/internal/gestures/b;

    if-ne v2, v9, :cond_d

    const-string v9, "androidx.compose.foundation.ClickableElement"

    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    const-string v9, "androidx.compose.foundation.CombinedClickableElement"

    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    :cond_c
    move-object/from16 v10, v18

    move-object v13, v10

    goto :goto_9

    :cond_d
    sget-object v9, Lio/sentry/internal/gestures/b;->SCROLLABLE:Lio/sentry/internal/gestures/b;

    if-ne v2, v9, :cond_a

    const-string v9, "androidx.compose.foundation.ScrollingLayoutElement"

    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    const-string v9, "androidx.compose.foundation.ScrollingContainerElement"

    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    :cond_e
    new-instance v14, Lio/sentry/internal/gestures/c;

    const/16 v17, 0x0

    const-string v19, "jetpack_compose"

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v14 .. v19}, Lio/sentry/internal/gestures/c;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v14

    :goto_9
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v18, v13

    goto/16 :goto_7

    :cond_f
    move-object/from16 v13, v18

    invoke-virtual {v6}, La3/n0;->L()Lr1/c;

    move-result-object v5

    invoke-virtual {v5}, Lr1/c;->f()Ljava/util/List;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La3/n0;

    new-instance v8, Ll83/k;

    invoke-direct {v8, v7, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_10
    invoke-virtual {v3, v6}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_3

    :cond_11
    if-nez v10, :cond_12

    :goto_b
    return-object v4

    :cond_12
    new-instance v6, Lio/sentry/internal/gestures/c;

    const/4 v9, 0x0

    const-string v11, "jetpack_compose"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v6 .. v11}, Lio/sentry/internal/gestures/c;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method
