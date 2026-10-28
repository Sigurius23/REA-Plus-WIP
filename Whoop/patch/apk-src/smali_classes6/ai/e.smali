.class public final Lai/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lrh/t;


# direct methods
.method public constructor <init>(Lrh/t;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lai/e;->a:Lrh/t;

    return-void
.end method

.method public constructor <init>(Lrh/t;Lai/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lai/e;->a:Lrh/t;

    return-void
.end method

.method public static a(Lfi/i;)Landroidx/lifecycle/x;
    .locals 2

    iget-object v0, p0, Lfi/i;->c:Lhi/a;

    instance-of v1, v0, Lhi/a;

    if-eqz v1, :cond_0

    iget-object p0, v0, Lhi/a;->x:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lfi/i;->a:Landroid/content/Context;

    :goto_0
    instance-of v0, p0, Landroidx/lifecycle/g0;

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/lifecycle/g0;

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-nez v0, :cond_2

    const/4 p0, 0x0

    return-object p0

    :cond_2
    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    goto :goto_0
.end method

.method public static c(Lfi/i;Landroid/graphics/Bitmap$Config;)Z
    .locals 0

    invoke-static {p1}, Lx30/s0;->u(Landroid/graphics/Bitmap$Config;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    sget-object p1, Lfi/k;->f:Lf93/a;

    invoke-static {p0, p1}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p0, p0, Lfi/i;->c:Lhi/a;

    instance-of p1, p0, Lhi/a;

    if-eqz p1, :cond_2

    iget-object p0, p0, Lhi/a;->x:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->isHardwareAccelerated()Z

    move-result p0

    if-nez p0, :cond_2

    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public b(Lfi/i;Lai/b;Lgi/i;Lgi/g;)Lai/c;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    iget-object v3, v0, Lfi/i;->j:Lfi/b;

    iget-object v4, v0, Lfi/i;->r:Lgi/d;

    iget-boolean v3, v3, Lfi/b;->w:Z

    if-nez v3, :cond_0

    move-object/from16 v3, p0

    const/16 v16, 0x0

    goto/16 :goto_15

    :cond_0
    move-object/from16 v3, p0

    iget-object v6, v3, Lai/e;->a:Lrh/t;

    iget-object v6, v6, Lrh/t;->a:Lrh/q;

    iget-object v6, v6, Lrh/q;->c:Ll83/p;

    invoke-virtual {v6}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lai/d;

    if-eqz v6, :cond_8

    check-cast v6, Lai/f;

    iget-object v7, v6, Lai/f;->c:Ljava/lang/Object;

    monitor-enter v7

    :try_start_0
    iget-object v8, v6, Lai/f;->a:Lai/k;

    invoke-interface {v8, v1}, Lai/k;->k(Lai/b;)Lai/c;

    move-result-object v8

    const/4 v9, 0x0

    if-nez v8, :cond_5

    iget-object v8, v6, Lai/f;->b:Lai/j;

    iget-object v10, v8, Lai/j;->x:Ljava/lang/Object;

    check-cast v10, Ljava/util/LinkedHashMap;

    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/ArrayList;

    const/4 v11, 0x0

    if-nez v10, :cond_1

    const/16 v16, 0x0

    :goto_0
    move-object v8, v11

    goto :goto_4

    :cond_1
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v12

    move v13, v9

    :goto_1
    if-ge v13, v12, :cond_4

    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lai/i;

    iget-object v15, v14, Lai/i;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v15}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lrh/j;

    if-eqz v15, :cond_2

    const/16 v16, 0x0

    new-instance v5, Lai/c;

    iget-object v14, v14, Lai/i;->b:Ljava/util/Map;

    invoke-direct {v5, v15, v14}, Lai/c;-><init>(Lrh/j;Ljava/util/Map;)V

    goto :goto_2

    :cond_2
    const/16 v16, 0x0

    move-object v5, v11

    :goto_2
    if-eqz v5, :cond_3

    move-object v11, v5

    goto :goto_3

    :cond_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_4
    const/16 v16, 0x0

    :goto_3
    invoke-virtual {v8}, Lai/j;->g()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_5
    const/16 v16, 0x0

    :goto_4
    if-eqz v8, :cond_7

    iget-object v5, v8, Lai/c;->a:Lrh/j;

    invoke-interface {v5}, Lrh/j;->a()Z

    move-result v5

    if-nez v5, :cond_7

    iget-object v5, v6, Lai/f;->c:Ljava/lang/Object;

    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v10, v6, Lai/f;->a:Lai/k;

    invoke-interface {v10, v1}, Lai/k;->t(Lai/b;)Z

    move-result v10

    iget-object v6, v6, Lai/f;->b:Lai/j;

    iget-object v6, v6, Lai/j;->x:Ljava/lang/Object;

    check-cast v6, Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v6, :cond_6

    const/4 v9, 0x1

    :cond_6
    :try_start_2
    monitor-exit v5

    goto :goto_5

    :catchall_1
    move-exception v0

    monitor-exit v5

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_7
    :goto_5
    monitor-exit v7

    goto :goto_7

    :goto_6
    monitor-exit v7

    throw v0

    :cond_8
    const/16 v16, 0x0

    move-object/from16 v8, v16

    :goto_7
    if-eqz v8, :cond_20

    iget-object v5, v8, Lai/c;->a:Lrh/j;

    instance-of v6, v5, Lrh/a;

    if-eqz v6, :cond_9

    move-object v6, v5

    check-cast v6, Lrh/a;

    goto :goto_8

    :cond_9
    move-object/from16 v6, v16

    :goto_8
    const/4 v7, 0x1

    if-nez v6, :cond_a

    move v6, v7

    goto :goto_9

    :cond_a
    iget-object v6, v6, Lrh/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v6

    if-nez v6, :cond_b

    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_b
    invoke-static {v0, v6}, Lai/e;->c(Lfi/i;Landroid/graphics/Bitmap$Config;)Z

    move-result v6

    :goto_9
    if-nez v6, :cond_d

    :cond_c
    const/4 v7, 0x0

    goto/16 :goto_14

    :cond_d
    iget-object v1, v1, Lai/b;->b:Ljava/util/Map;

    const-string v6, "coil#size"

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_e

    invoke-virtual {v2}, Lgi/i;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_14

    :cond_e
    iget-object v1, v8, Lai/c;->b:Ljava/util/Map;

    const-string v6, "coil#is_sampled"

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v6, v1, Ljava/lang/Boolean;

    if-eqz v6, :cond_f

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_a

    :cond_f
    move-object/from16 v1, v16

    :goto_a
    if-eqz v1, :cond_10

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_b

    :cond_10
    const/4 v1, 0x0

    :goto_b
    if-nez v1, :cond_11

    sget-object v1, Lgi/i;->c:Lgi/i;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    sget-object v1, Lgi/d;->x:Lgi/d;

    if-ne v4, v1, :cond_11

    goto/16 :goto_14

    :cond_11
    invoke-interface {v5}, Lrh/j;->getWidth()I

    move-result v1

    invoke-interface {v5}, Lrh/j;->getHeight()I

    move-result v6

    instance-of v5, v5, Lrh/a;

    if-eqz v5, :cond_12

    sget-object v5, Lfi/j;->b:Lf93/a;

    invoke-static {v0, v5}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgi/i;

    goto :goto_c

    :cond_12
    sget-object v0, Lgi/i;->c:Lgi/i;

    :goto_c
    iget-object v5, v2, Lgi/i;->a:Lgi/c;

    instance-of v10, v5, Lgi/a;

    const v11, 0x7fffffff

    if-eqz v10, :cond_13

    check-cast v5, Lgi/a;

    iget v5, v5, Lgi/a;->a:I

    goto :goto_d

    :cond_13
    move v5, v11

    :goto_d
    iget-object v10, v0, Lgi/i;->a:Lgi/c;

    instance-of v12, v10, Lgi/a;

    if-eqz v12, :cond_14

    check-cast v10, Lgi/a;

    iget v10, v10, Lgi/a;->a:I

    goto :goto_e

    :cond_14
    move v10, v11

    :goto_e
    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    move-result v5

    iget-object v2, v2, Lgi/i;->b:Lgi/c;

    instance-of v10, v2, Lgi/a;

    if-eqz v10, :cond_15

    check-cast v2, Lgi/a;

    iget v2, v2, Lgi/a;->a:I

    goto :goto_f

    :cond_15
    move v2, v11

    :goto_f
    iget-object v0, v0, Lgi/i;->b:Lgi/c;

    instance-of v10, v0, Lgi/a;

    if-eqz v10, :cond_16

    check-cast v0, Lgi/a;

    iget v0, v0, Lgi/a;->a:I

    goto :goto_10

    :cond_16
    move v0, v11

    :goto_10
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-double v12, v5

    int-to-double v14, v1

    div-double/2addr v12, v14

    int-to-double v14, v0

    int-to-double v9, v6

    div-double/2addr v14, v9

    if-eq v5, v11, :cond_17

    if-eq v0, v11, :cond_17

    move-object/from16 v9, p4

    goto :goto_11

    :cond_17
    sget-object v9, Lgi/g;->x:Lgi/g;

    :goto_11
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    if-eqz v9, :cond_1a

    if-ne v9, v7, :cond_19

    cmpg-double v9, v12, v14

    if-gez v9, :cond_18

    sub-int/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v0

    goto :goto_13

    :cond_18
    sub-int/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    :goto_12
    move-wide v12, v14

    goto :goto_13

    :cond_19
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1a
    cmpl-double v9, v12, v14

    if-lez v9, :cond_1b

    sub-int/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v0

    goto :goto_13

    :cond_1b
    sub-int/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    goto :goto_12

    :goto_13
    if-gt v0, v7, :cond_1c

    goto :goto_14

    :cond_1c
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    if-eqz v0, :cond_1e

    if-ne v0, v7, :cond_1d

    cmpg-double v0, v12, v4

    if-gtz v0, :cond_c

    goto :goto_14

    :cond_1d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1e
    cmpg-double v0, v12, v4

    if-nez v0, :cond_c

    :cond_1f
    :goto_14
    if-eqz v7, :cond_20

    return-object v8

    :cond_20
    :goto_15
    return-object v16
.end method

.method public d(Lfi/i;Ljava/lang/Object;Lfi/o;Lrh/f;)Lai/b;
    .locals 9

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p4, p1, Lfi/i;->e:Ljava/util/Map;

    iget-object v0, p0, Lai/e;->a:Lrh/t;

    iget-object v0, v0, Lrh/t;->d:Lrh/d;

    iget-object v0, v0, Lrh/d;->c:Ljava/util/List;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x0

    if-ge v3, v1, :cond_4

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll83/k;

    iget-object v6, v5, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, Lyh/a;

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Lj93/d;

    invoke-interface {v5, p2}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>"

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v5, v6, Lyh/a;->a:I

    packed-switch v5, :pswitch_data_0

    move-object v5, p2

    check-cast v5, Lrh/y;

    iget-object v5, v5, Lrh/y;->a:Ljava/lang/String;

    goto/16 :goto_2

    :pswitch_0
    move-object v5, p2

    check-cast v5, Lrh/y;

    iget-object v6, v5, Lrh/y;->c:Ljava/lang/String;

    const-string v7, "file"

    if-eqz v6, :cond_0

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_0
    iget-object v6, v5, Lrh/y;->e:Ljava/lang/String;

    if-eqz v6, :cond_2

    sget-object v6, Lki/l;->a:[Landroid/graphics/Bitmap$Config;

    iget-object v6, v5, Lrh/y;->c:Ljava/lang/String;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-static {v5}, Lrh/o;->h(Lrh/y;)Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "android_asset"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    sget-object v6, Lfi/j;->c:Lf93/a;

    invoke-static {p3, v6}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v5}, Lrh/o;->g(Lrh/y;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    iget-object v7, p3, Lfi/o;->f:Lne3/p;

    sget-object v8, Lne3/e0;->x:Ljava/lang/String;

    invoke-static {v6, v2}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object v6

    invoke-virtual {v7, v6}, Lne3/p;->T(Lne3/e0;)Ln4/f;

    move-result-object v6

    iget-object v6, v6, Ln4/f;->g:Ljava/io/Serializable;

    check-cast v6, Ljava/lang/Long;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v5, 0x2d

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    :goto_1
    move-object v5, v4

    goto :goto_2

    :pswitch_1
    move-object v5, p2

    check-cast v5, Lrh/y;

    iget-object v6, v5, Lrh/y;->c:Ljava/lang/String;

    const-string v7, "android.resource"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v5, 0x3a

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v5, p3, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    sget-object v7, Lki/l;->a:[Landroid/graphics/Bitmap$Config;

    iget v5, v5, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v5, v5, 0x30

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_2
    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_4
    move-object v5, v4

    :goto_3
    if-nez v5, :cond_5

    return-object v4

    :cond_5
    sget-object p2, Lfi/j;->a:Lf93/a;

    invoke-static {p1, p2}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-static {p4}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iget-object p2, p3, Lfi/o;->b:Lgi/i;

    invoke-virtual {p2}, Lgi/i;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "coil#size"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lai/b;

    invoke-direct {p2, v5, p1}, Lai/b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object p2

    :cond_6
    new-instance p1, Lai/b;

    invoke-direct {p1, v5, p4}, Lai/b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(Lfi/i;Lgi/i;)Lfi/o;
    .locals 18

    move-object/from16 v0, p1

    new-instance v1, Lfi/o;

    move-object v2, v1

    iget-object v1, v0, Lfi/i;->a:Landroid/content/Context;

    iget-object v3, v0, Lfi/i;->q:Lgi/g;

    iget-object v4, v0, Lfi/i;->r:Lgi/d;

    iget-object v6, v0, Lfi/i;->f:Lne3/p;

    iget-object v7, v0, Lfi/i;->j:Lfi/b;

    iget-object v8, v0, Lfi/i;->k:Lfi/b;

    iget-object v9, v0, Lfi/i;->l:Lfi/b;

    sget-object v5, Lfi/k;->b:Lf93/a;

    invoke-static {v0, v5}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/graphics/Bitmap$Config;

    sget-object v11, Lfi/k;->g:Lf93/a;

    invoke-static {v0, v11}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    sget-object v13, Lfi/j;->a:Lf93/a;

    invoke-static {v0, v13}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v14

    const/16 v16, 0x0

    if-nez v14, :cond_1

    sget-object v14, Lki/l;->a:[Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v5}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v15, v17

    check-cast v15, Landroid/graphics/Bitmap$Config;

    invoke-static {v14, v15}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    goto :goto_0

    :cond_0
    move/from16 v14, v16

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v14, 0x1

    :goto_1
    invoke-static {v0, v5}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/graphics/Bitmap$Config;

    invoke-static {v15}, Lx30/s0;->u(Landroid/graphics/Bitmap$Config;)Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-static {v0, v5}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v15}, Lai/e;->c(Lfi/i;Landroid/graphics/Bitmap$Config;)Z

    move-result v15

    if-eqz v15, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v15, v16

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v15, 0x1

    :goto_3
    if-eqz v14, :cond_4

    if-eqz v15, :cond_4

    goto :goto_4

    :cond_4
    sget-object v10, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_4
    if-eqz v12, :cond_5

    invoke-static {v0, v13}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_5

    sget-object v12, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    if-eq v10, v12, :cond_5

    const/4 v15, 0x1

    goto :goto_5

    :cond_5
    move/from16 v15, v16

    :goto_5
    iget-object v12, v0, Lfi/i;->u:Lfi/f;

    iget-object v12, v12, Lfi/f;->n:Lrh/i;

    iget-object v12, v12, Lrh/i;->a:Ljava/util/Map;

    iget-object v13, v0, Lfi/i;->s:Lrh/i;

    iget-object v13, v13, Lrh/i;->a:Ljava/util/Map;

    invoke-static {v12, v13}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v12

    invoke-static {v12}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v12

    invoke-static {v0, v5}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/graphics/Bitmap$Config;

    if-eq v10, v13, :cond_7

    if-eqz v10, :cond_6

    invoke-interface {v12, v5, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_6
    invoke-interface {v12, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_6
    invoke-static {v0, v11}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eq v15, v0, :cond_8

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v12, v11, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    new-instance v10, Lrh/i;

    invoke-static {v12}, Lx43/j;->W(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {v10, v0}, Lrh/i;-><init>(Ljava/util/Map;)V

    const/4 v5, 0x0

    move-object v0, v2

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v10}, Lfi/o;-><init>(Landroid/content/Context;Lgi/i;Lgi/g;Lgi/d;Ljava/lang/String;Lne3/p;Lfi/b;Lfi/b;Lfi/b;Lrh/i;)V

    return-object v0
.end method
