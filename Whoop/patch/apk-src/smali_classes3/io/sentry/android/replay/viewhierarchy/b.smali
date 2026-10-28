.class public abstract Lio/sentry/android/replay/viewhierarchy/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static b:Z

.field public static c:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ll83/i;->y:Ll83/i;

    sget-object v1, Lio/sentry/android/replay/viewhierarchy/a;->w:Lio/sentry/android/replay/viewhierarchy/a;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lio/sentry/android/replay/viewhierarchy/b;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Li3/l;ZLi63/j;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    sget-object v1, Lio/sentry/android/replay/y;->a:Li3/y;

    iget-object v2, p0, Li3/l;->w:La0/v0;

    invoke-virtual {v2, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    check-cast v0, Ljava/lang/String;

    :cond_1
    const-string v1, "unmask"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Li63/j;->e()V

    return v2

    :cond_2
    const-string v1, "mask"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Li63/j;->e()V

    const/4 p0, 0x1

    return p0

    :cond_3
    if-eqz p1, :cond_4

    const-string p0, "android.widget.ImageView"

    goto :goto_1

    :cond_4
    if-eqz p0, :cond_6

    iget-object p0, p0, Li3/l;->w:La0/v0;

    sget-object p1, Li3/u;->A:Li3/y;

    invoke-virtual {p0, p1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    sget-object p1, Li3/k;->j:Li3/y;

    invoke-virtual {p0, p1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    sget-object p1, Li3/u;->E:Li3/y;

    invoke-virtual {p0, p1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    :cond_5
    const-string p0, "android.widget.TextView"

    goto :goto_1

    :cond_6
    const-string p0, "android.view.View"

    :goto_1
    iget-object p1, p2, Li63/j;->c:Ljava/util/Collection;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    return v2

    :cond_7
    iget-object p1, p2, Li63/j;->b:Ljava/io/Serializable;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static b(La3/n0;Lio/sentry/android/replay/viewhierarchy/g;ZLi63/j;Lio/sentry/v0;)V
    .locals 28

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    sget-object v14, Lio/sentry/android/replay/viewhierarchy/b;->a:Ljava/lang/Object;

    invoke-static/range {p0 .. p0}, Lx43/j;->A(La3/n0;)Ljava/util/List;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    move-object v0, v15

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_2d

    invoke-interface {v15, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, La3/n0;

    invoke-virtual {v6}, La3/n0;->Y()Z

    move-result v0

    iget-object v7, v6, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_2b

    invoke-virtual {v6}, La3/n0;->X()Z

    move-result v0

    if-eqz v0, :cond_2b

    if-eqz p2, :cond_1

    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v9, v7, La3/l1;->d:Ljava/lang/Object;

    check-cast v9, Landroidx/compose/ui/node/a;

    invoke-static {v9}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v9

    invoke-direct {v0, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lio/sentry/android/replay/viewhierarchy/b;->c:Ljava/lang/ref/WeakReference;

    :cond_1
    iget-object v0, v7, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    sget-object v7, Lio/sentry/android/replay/viewhierarchy/b;->c:Ljava/lang/ref/WeakReference;

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly2/y;

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    const-string v9, "<this>"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v7, :cond_3

    invoke-static {v0}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v7

    :cond_3
    invoke-interface {v7}, Ly2/y;->n()J

    move-result-wide v9

    const/16 v11, 0x20

    shr-long/2addr v9, v11

    long-to-int v9, v9

    int-to-float v9, v9

    invoke-interface {v7}, Ly2/y;->n()J

    move-result-wide v16

    const-wide v18, 0xffffffffL

    and-long v3, v16, v18

    long-to-int v3, v3

    int-to-float v3, v3

    const/4 v4, 0x1

    invoke-interface {v7, v0, v4}, Ly2/y;->r(Ly2/y;Z)Lh2/c;

    move-result-object v0

    iget v10, v0, Lh2/c;->a:F

    const/16 v16, 0x0

    cmpg-float v17, v10, v16

    if-gez v17, :cond_4

    move/from16 v10, v16

    :cond_4
    cmpl-float v17, v10, v9

    if-lez v17, :cond_5

    move v10, v9

    :cond_5
    move/from16 v17, v11

    iget v11, v0, Lh2/c;->b:F

    cmpg-float v20, v11, v16

    if-gez v20, :cond_6

    move/from16 v11, v16

    :cond_6
    cmpl-float v20, v11, v3

    if-lez v20, :cond_7

    move v11, v3

    :cond_7
    iget v4, v0, Lh2/c;->c:F

    cmpg-float v21, v4, v16

    if-gez v21, :cond_8

    move/from16 v4, v16

    :cond_8
    cmpl-float v21, v4, v9

    if-lez v21, :cond_9

    goto :goto_2

    :cond_9
    move v9, v4

    :goto_2
    iget v0, v0, Lh2/c;->d:F

    cmpg-float v4, v0, v16

    if-gez v4, :cond_a

    goto :goto_3

    :cond_a
    move/from16 v16, v0

    :goto_3
    cmpl-float v0, v16, v3

    if-lez v0, :cond_b

    goto :goto_4

    :cond_b
    move/from16 v3, v16

    :goto_4
    cmpg-float v0, v10, v9

    if-nez v0, :cond_c

    goto :goto_5

    :cond_c
    cmpg-float v0, v11, v3

    if-nez v0, :cond_d

    :goto_5
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    move-object v7, v0

    move-object v11, v1

    move/from16 v21, v5

    goto/16 :goto_6

    :cond_d
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    move/from16 v16, v9

    int-to-long v8, v0

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    move/from16 v21, v5

    int-to-long v4, v0

    shl-long v8, v8, v17

    and-long v4, v4, v18

    or-long/2addr v4, v8

    invoke-interface {v7, v4, v5}, Ly2/y;->E(J)J

    move-result-wide v4

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v8, v0

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    move-object v11, v1

    int-to-long v0, v0

    shl-long v8, v8, v17

    and-long v0, v0, v18

    or-long/2addr v0, v8

    invoke-interface {v7, v0, v1}, Ly2/y;->E(J)J

    move-result-wide v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    move-wide/from16 v23, v0

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    shl-long v8, v8, v17

    and-long v0, v0, v18

    or-long/2addr v0, v8

    invoke-interface {v7, v0, v1}, Ly2/y;->E(J)J

    move-result-wide v0

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    move-wide/from16 v25, v0

    int-to-long v0, v3

    shl-long v8, v8, v17

    and-long v0, v0, v18

    or-long/2addr v0, v8

    invoke-interface {v7, v0, v1}, Ly2/y;->E(J)J

    move-result-wide v0

    shr-long v7, v4, v17

    long-to-int v3, v7

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    shr-long v7, v23, v17

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    shr-long v8, v0, v17

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    shr-long v9, v25, v17

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    move-result v10

    invoke-static {v7, v10}, Ljava/lang/Math;->min(FF)F

    move-result v10

    invoke-static {v3, v10}, Ljava/lang/Math;->min(FF)F

    move-result v10

    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    move-result v7

    invoke-static {v3, v7}, Ljava/lang/Math;->max(FF)F

    move-result v3

    and-long v4, v4, v18

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    and-long v7, v23, v18

    long-to-int v5, v7

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    and-long v0, v0, v18

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    and-long v7, v25, v18

    long-to-int v1, v7

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v7

    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    move-result v7

    invoke-static {v4, v7}, Ljava/lang/Math;->min(FF)F

    move-result v7

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    new-instance v1, Landroid/graphics/Rect;

    float-to-int v4, v10

    float-to-int v5, v7

    float-to-int v3, v3

    float-to-int v0, v0

    invoke-direct {v1, v4, v5, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v7, v1

    :goto_6
    :try_start_0
    invoke-virtual {v6}, La3/n0;->I()Li3/l;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    goto :goto_7

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    if-eqz v1, :cond_28

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v4, 0x0

    invoke-virtual {v0, v6, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li3/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :goto_7
    invoke-static {v6}, Lx43/j;->K(La3/n0;)Z

    move-result v1

    if-nez v1, :cond_f

    if-eqz v0, :cond_e

    sget-object v1, Li3/u;->o:Li3/y;

    iget-object v3, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v3, v1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-lez v1, :cond_f

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-lez v1, :cond_f

    const/4 v10, 0x1

    goto :goto_8

    :cond_f
    const/4 v10, 0x0

    :goto_8
    if-eqz v0, :cond_10

    sget-object v1, Li3/k;->j:Li3/y;

    iget-object v3, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v3, v1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_11

    goto :goto_9

    :cond_10
    const/4 v3, 0x1

    :cond_11
    if-eqz v0, :cond_12

    sget-object v1, Li3/u;->E:Li3/y;

    iget-object v5, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v5, v1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-ne v1, v3, :cond_12

    :goto_9
    move v1, v3

    goto :goto_a

    :cond_12
    const/4 v1, 0x0

    :goto_a
    if-eqz v0, :cond_13

    sget-object v5, Li3/u;->A:Li3/y;

    iget-object v8, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v5}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v5

    if-ne v5, v3, :cond_13

    goto :goto_b

    :cond_13
    if-eqz v1, :cond_21

    :goto_b
    if-eqz v10, :cond_14

    const/4 v3, 0x0

    invoke-static {v0, v3, v12}, Lio/sentry/android/replay/viewhierarchy/b;->a(Li3/l;ZLi63/j;)Z

    move-result v5

    if-eqz v5, :cond_14

    const/4 v9, 0x1

    goto :goto_c

    :cond_14
    const/4 v9, 0x0

    :goto_c
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_16

    sget-object v5, Li3/k;->a:Li3/y;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v5}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v22

    if-nez v22, :cond_15

    move-object/from16 v22, v4

    :cond_15
    move-object/from16 v0, v22

    check-cast v0, Li3/a;

    if-eqz v0, :cond_16

    iget-object v0, v0, Li3/a;->b:Ll83/e;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_16

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    :cond_16
    invoke-static {v3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/r0;

    if-eqz v0, :cond_17

    iget-object v3, v0, Ll3/r0;->a:Ll3/q0;

    if-eqz v3, :cond_17

    iget-object v3, v3, Ll3/q0;->b:Ll3/v0;

    if-eqz v3, :cond_17

    invoke-virtual {v3}, Ll3/v0;->c()J

    move-result-wide v4

    new-instance v3, Li2/x;

    invoke-direct {v3, v4, v5}, Li2/x;-><init>(J)V

    goto :goto_d

    :cond_17
    const/4 v3, 0x0

    :goto_d
    if-eqz v3, :cond_1c

    iget-wide v4, v3, Li2/x;->a:J

    const-wide/16 v16, 0x10

    cmp-long v4, v4, v16

    if-nez v4, :cond_1c

    invoke-virtual {v6}, La3/n0;->D()Ljava/util/List;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_e
    if-ge v5, v4, :cond_1b

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/y0;

    iget-object v8, v8, Ly2/y0;->a:Landroidx/compose/ui/Modifier;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v16

    move/from16 v17, v1

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    move/from16 v16, v2

    const-string v2, "Text"

    move-object/from16 v18, v3

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_1a

    :try_start_2
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "color"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Li2/a0;

    if-eqz v2, :cond_18

    check-cast v1, Li2/a0;

    goto :goto_f

    :cond_18
    const/4 v1, 0x0

    :goto_f
    if-eqz v1, :cond_19

    invoke-interface {v1}, Li2/a0;->a()J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_11

    :catchall_1
    :cond_19
    :goto_10
    const/4 v4, 0x0

    goto :goto_11

    :cond_1a
    add-int/lit8 v5, v5, 0x1

    move/from16 v2, v16

    move/from16 v1, v17

    move-object/from16 v3, v18

    goto :goto_e

    :cond_1b
    move/from16 v17, v1

    move/from16 v16, v2

    const/4 v3, 0x0

    goto :goto_10

    :goto_11
    move-object v1, v4

    goto :goto_12

    :cond_1c
    move/from16 v17, v1

    move/from16 v16, v2

    move-object v1, v3

    const/4 v3, 0x0

    :goto_12
    if-eqz v0, :cond_1d

    iget-object v2, v0, Ll3/r0;->a:Ll3/q0;

    if-eqz v2, :cond_1d

    iget-object v2, v2, Ll3/q0;->b:Ll3/v0;

    if-eqz v2, :cond_1d

    iget-object v2, v2, Ll3/v0;->a:Ll3/m0;

    iget-wide v4, v2, Ll3/m0;->b:J

    new-instance v2, Ly3/o;

    invoke-direct {v2, v4, v5}, Ly3/o;-><init>(J)V

    goto :goto_13

    :cond_1d
    const/4 v2, 0x0

    :goto_13
    sget-wide v4, Ly3/o;->c:J

    if-nez v2, :cond_1e

    goto :goto_14

    :cond_1e
    iget-wide v2, v2, Ly3/o;->a:J

    invoke-static {v2, v3, v4, v5}, Ly3/o;->a(JJ)Z

    move-result v3

    :goto_14
    new-instance v2, Lio/sentry/android/replay/viewhierarchy/f;

    if-eqz v0, :cond_1f

    if-nez v17, :cond_1f

    if-nez v3, :cond_1f

    new-instance v3, Lhm/d;

    const/16 v4, 0xb

    invoke-direct {v3, v0, v4}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    goto :goto_15

    :cond_1f
    const/4 v3, 0x0

    :goto_15
    if-eqz v1, :cond_20

    iget-wide v0, v1, Li2/x;->a:J

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v0

    const/high16 v1, -0x1000000

    or-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_16

    :cond_20
    const/4 v8, 0x0

    :goto_16
    invoke-virtual {v6}, La3/n0;->J()I

    move-result v5

    move-object v1, v6

    invoke-virtual {v1}, La3/n0;->s()I

    move-result v6

    move-object/from16 v4, p1

    move-object/from16 v17, v11

    move-object v11, v7

    iget v7, v4, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    move-object/from16 v18, v1

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v2

    move-object v2, v8

    move-object/from16 v19, v14

    move-object/from16 v27, v17

    const/4 v14, 0x0

    move-object/from16 v8, p1

    invoke-direct/range {v0 .. v11}, Lio/sentry/android/replay/viewhierarchy/f;-><init>(Lhm/d;Ljava/lang/Integer;IIIIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    move-object v4, v8

    goto/16 :goto_1e

    :cond_21
    move-object/from16 v4, p1

    move/from16 v16, v2

    move-object/from16 v18, v6

    move v6, v10

    move-object/from16 v27, v11

    move-object/from16 v19, v14

    const/4 v14, 0x0

    invoke-virtual/range {v18 .. v18}, La3/n0;->D()Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    move v3, v14

    :goto_17
    if-ge v3, v2, :cond_22

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly2/y0;

    iget-object v5, v5, Ly2/y0;->a:Landroidx/compose/ui/Modifier;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "Painter"

    invoke-static {v8, v9, v14}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v8

    if-eqz v8, :cond_23

    :try_start_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "painter"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ln2/a;

    if-eqz v2, :cond_22

    check-cast v1, Ln2/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object v8, v1

    goto :goto_18

    :catchall_2
    :cond_22
    const/4 v8, 0x0

    goto :goto_18

    :cond_23
    add-int/lit8 v3, v3, 0x1

    goto :goto_17

    :goto_18
    if-eqz v8, :cond_26

    if-eqz v6, :cond_24

    const/4 v2, 0x1

    invoke-static {v0, v2, v12}, Lio/sentry/android/replay/viewhierarchy/b;->a(Li3/l;ZLi63/j;)Z

    move-result v0

    if-eqz v0, :cond_24

    const/4 v3, 0x1

    goto :goto_19

    :cond_24
    move v3, v14

    :goto_19
    invoke-virtual/range {v18 .. v18}, La3/n0;->J()I

    move-result v1

    invoke-virtual/range {v18 .. v18}, La3/n0;->s()I

    move-result v2

    move v0, v3

    iget v3, v4, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    if-eqz v0, :cond_25

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v5, "Vector"

    invoke-static {v0, v5, v14}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-nez v5, :cond_25

    const-string v5, "Color"

    invoke-static {v0, v5, v14}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-nez v5, :cond_25

    const-string v5, "Brush"

    invoke-static {v0, v5, v14}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_25

    const/4 v5, 0x1

    goto :goto_1a

    :cond_25
    move v5, v14

    :goto_1a
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/d;

    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/g;-><init>(IIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    goto/16 :goto_1e

    :cond_26
    if-eqz v6, :cond_27

    invoke-static {v0, v14, v12}, Lio/sentry/android/replay/viewhierarchy/b;->a(Li3/l;ZLi63/j;)Z

    move-result v0

    if-eqz v0, :cond_27

    const/4 v5, 0x1

    goto :goto_1b

    :cond_27
    move v5, v14

    :goto_1b
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/c;

    invoke-virtual/range {v18 .. v18}, La3/n0;->J()I

    move-result v1

    invoke-virtual/range {v18 .. v18}, La3/n0;->s()I

    move-result v2

    iget v3, v4, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/g;-><init>(IIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    goto :goto_1e

    :catchall_3
    move-exception v0

    move-object/from16 v4, p1

    move/from16 v16, v2

    move-object/from16 v18, v6

    move-object/from16 v27, v11

    move-object/from16 v19, v14

    const/4 v14, 0x0

    goto :goto_1c

    :cond_28
    move-object/from16 v4, p1

    move/from16 v16, v2

    move-object/from16 v18, v6

    move-object/from16 v27, v11

    move-object/from16 v19, v14

    const/4 v14, 0x0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :catchall_4
    move-exception v0

    :goto_1c
    sget-boolean v1, Lio/sentry/android/replay/viewhierarchy/b;->b:Z

    const/16 v20, 0x1

    if-nez v1, :cond_29

    sput-boolean v20, Lio/sentry/android/replay/viewhierarchy/b;->b:Z

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error retrieving semantics information from Compose tree. Most likely you\'re using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you\'re using a newer version, please open a github issue with the version\nyou\'re using, so we can add support for it."

    new-array v3, v14, [Ljava/lang/Object;

    invoke-interface {v13, v1, v0, v2, v3}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_29
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/c;

    invoke-virtual/range {v18 .. v18}, La3/n0;->J()I

    move-result v1

    invoke-virtual/range {v18 .. v18}, La3/n0;->s()I

    move-result v2

    iget v3, v4, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    invoke-static/range {v18 .. v18}, Lx43/j;->K(La3/n0;)Z

    move-result v5

    if-nez v5, :cond_2a

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v5

    if-lez v5, :cond_2a

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v5

    if-lez v5, :cond_2a

    move/from16 v6, v20

    goto :goto_1d

    :cond_2a
    move v6, v14

    :goto_1d
    const/4 v5, 0x1

    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/g;-><init>(IIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    :goto_1e
    move-object v8, v0

    goto :goto_1f

    :cond_2b
    move-object/from16 v4, p1

    move-object/from16 v27, v1

    move/from16 v16, v2

    move/from16 v21, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v14

    const/4 v14, 0x0

    const/4 v8, 0x0

    :goto_1f
    move-object/from16 v11, v27

    if-eqz v8, :cond_2c

    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v18

    invoke-static {v1, v8, v14, v12, v13}, Lio/sentry/android/replay/viewhierarchy/b;->b(La3/n0;Lio/sentry/android/replay/viewhierarchy/g;ZLi63/j;Lio/sentry/v0;)V

    :cond_2c
    add-int/lit8 v5, v21, 0x1

    move-object v1, v11

    move/from16 v2, v16

    move-object/from16 v14, v19

    goto/16 :goto_0

    :cond_2d
    move-object/from16 v4, p1

    move-object v11, v1

    iput-object v11, v4, Lio/sentry/android/replay/viewhierarchy/g;->g:Ljava/util/ArrayList;

    return-void
.end method
