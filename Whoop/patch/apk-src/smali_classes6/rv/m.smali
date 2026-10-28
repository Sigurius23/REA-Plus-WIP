.class public final Lrv/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lev/j;
.implements Lev/m;
.implements Lev/b;
.implements Lev/a;


# instance fields
.field public E:Z

.field public F:Lcom/mapbox/geojson/Point;

.field public final G:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final H:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final I:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final J:Lo52/q;

.field public final K:Lrv/k;

.field public final L:Lrv/l;

.field public M:Ltv/c;

.field public w:Lev/i;

.field public x:Ljava/lang/ref/WeakReference;

.field public y:Lrv/r;

.field public z:Lm63/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lrv/m;->G:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lrv/m;->H:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lrv/m;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Lo52/q;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lo52/q;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lrv/m;->J:Lo52/q;

    new-instance v0, Lrv/k;

    invoke-direct {v0, p0}, Lrv/k;-><init>(Lrv/m;)V

    iput-object v0, p0, Lrv/m;->K:Lrv/k;

    new-instance v0, Lrv/l;

    invoke-direct {v0, p0}, Lrv/l;-><init>(Lrv/m;)V

    iput-object v0, p0, Lrv/m;->L:Lrv/l;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b(Lcom/mapbox/maps/Style;)V
    .locals 2

    iget-object v0, p0, Lrv/m;->y:Lrv/r;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lrv/r;->n:Lrv/p;

    invoke-interface {v1, p1}, Lrv/p;->Z(Lcom/mapbox/maps/Style;)V

    iget-object v0, v0, Lrv/r;->d:Lq30/w0;

    iput-object p1, v0, Lq30/w0;->y:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final e(Landroid/content/Context;Landroid/util/AttributeSet;F)V
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lrv/m;->x:Ljava/lang/ref/WeakReference;

    sget-object v2, Lm83/y;->w:Lm83/y;

    sget-object v3, Lrv/u;->a:[I

    const/4 v4, 0x0

    move-object/from16 v5, p2

    invoke-virtual {v0, v5, v3, v4, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v3

    const-string v5, "context.obtainStyledAttr\u2026ble.mapbox_MapView, 0, 0)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0x5b

    :try_start_0
    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    const/16 v6, 0x36

    const/4 v7, -0x1

    invoke-virtual {v3, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    const/high16 v9, 0x3f800000    # 1.0f

    if-eqz v6, :cond_5

    const/4 v7, 0x1

    if-eq v6, v7, :cond_2

    new-instance v10, Lev/c;

    sget-object v2, Lcom/mapbox/maps/ImageHolder;->Companion:Lcom/mapbox/maps/ImageHolder$Companion;

    const v4, 0x7f080627

    invoke-virtual {v2, v4}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v11

    const v4, 0x7f08062b

    if-eqz v5, :cond_0

    const v6, 0x7f080626

    invoke-virtual {v2, v6}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v6

    :goto_0
    move-object v12, v6

    goto :goto_1

    :cond_0
    invoke-virtual {v2, v4}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v6

    goto :goto_0

    :goto_1
    if-eqz v5, :cond_1

    invoke-virtual {v2, v4}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v2

    :goto_2
    move-object v13, v2

    goto :goto_3

    :cond_1
    const v4, 0x7f080628

    invoke-virtual {v2, v4}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v2

    goto :goto_2

    :goto_3
    const/4 v14, 0x0

    const/16 v15, 0x18

    invoke-direct/range {v10 .. v15}, Lev/c;-><init>(Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Ljava/lang/String;I)V

    goto/16 :goto_c

    :cond_2
    const/16 v6, 0x56

    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_4

    const/16 v6, 0x59

    const/4 v10, 0x0

    invoke-virtual {v3, v6, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/16 v12, 0x58

    invoke-virtual {v3, v12, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v12

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    filled-new-array {v6, v12}, [Ljava/lang/Float;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/16 v6, 0x47

    invoke-virtual {v3, v6, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v13

    const/16 v6, 0x50

    invoke-virtual {v3, v6, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/16 v14, 0x51

    invoke-virtual {v3, v14, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    const/16 v15, 0x52

    invoke-virtual {v3, v15, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v15

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    filled-new-array {v6, v14, v15}, [Ljava/lang/Float;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v6, 0x4e

    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v15

    const/16 v6, 0x54

    invoke-virtual {v3, v6, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/16 v8, 0x53

    invoke-virtual {v3, v8, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    const/16 v4, 0x55

    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v6, v8, v4}, [Ljava/lang/Float;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/16 v6, 0x4b

    invoke-virtual {v3, v6, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/16 v8, 0x4c

    invoke-virtual {v3, v8, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    const/16 v10, 0x4d

    const/high16 v9, 0x42b40000    # 90.0f

    invoke-virtual {v3, v10, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    filled-new-array {v6, v8, v9}, [Ljava/lang/Float;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/16 v8, 0x3d

    invoke-virtual {v3, v8, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    const/16 v9, 0x49

    invoke-virtual {v3, v9, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v19

    const/4 v9, 0x2

    invoke-static {v9}, Le4/p;->f(I)[I

    move-result-object v10

    move/from16 v20, v9

    const/16 v9, 0x4f

    invoke-virtual {v3, v9, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    aget v9, v10, v9

    const/16 v10, 0x45

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v3, v10, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    const/16 v10, 0x46

    invoke-virtual {v3, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v22

    const/16 v10, 0x48

    invoke-virtual {v3, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v23

    const/16 v10, 0x4a

    invoke-virtual {v3, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v24

    const-string v10, "#ffffff"

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    const/16 v0, 0x3e

    invoke-virtual {v3, v0, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v25

    const/16 v0, 0x3f

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v26

    const/16 v0, 0x40

    const/4 v10, 0x0

    invoke-virtual {v3, v0, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v27

    const/16 v0, 0x41

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v28
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v10, 0x3c

    move-object/from16 v17, v2

    const/4 v2, 0x0

    :try_start_2
    invoke-virtual {v3, v10, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v10

    invoke-virtual {v0, v10}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    const-string v2, "typedArray.resources.get\u2026k3DMaterialOverrides, 0))"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object/from16 v29, v0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_e

    :catch_0
    move-object/from16 v17, v2

    :catch_1
    move-object/from16 v29, v17

    :goto_4
    :try_start_3
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/16 v2, 0x57

    const/4 v10, 0x0

    invoke-virtual {v3, v2, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    const-string v2, "typedArray.resources.get\u2026nPuck3DNodeOverrides, 0))"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v30, v2

    goto :goto_5

    :catch_2
    move-object/from16 v30, v17

    :goto_5
    :try_start_4
    invoke-static/range {v20 .. v20}, Le4/p;->f(I)[I

    move-result-object v0

    const/16 v2, 0x44

    const/4 v10, 0x1

    invoke-virtual {v3, v2, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    aget v31, v0, v2

    const/16 v0, 0x42

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    const-string v0, "default"

    :cond_3
    move-object/from16 v32, v0

    const/16 v0, 0x43

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v33

    new-instance v10, Lev/d;

    move-object/from16 v16, v4

    move-object/from16 v17, v6

    move/from16 v21, v7

    move/from16 v18, v8

    move/from16 v20, v9

    invoke-direct/range {v10 .. v33}, Lev/d;-><init>(Ljava/lang/String;Ljava/util/List;FLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZIFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;FLjava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_c

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "model-uri must be specified in order to use 3d location puck."

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const/16 v0, 0x3b

    invoke-virtual {v3, v0, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-eq v0, v7, :cond_6

    goto :goto_6

    :cond_6
    const/4 v2, 0x0

    :goto_6
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v2, Lcom/mapbox/maps/ImageHolder;->Companion:Lcom/mapbox/maps/ImageHolder$Companion;

    invoke-virtual {v2, v0}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v0

    goto :goto_7

    :cond_7
    const/4 v0, 0x0

    :goto_7
    const/16 v2, 0x37

    invoke-virtual {v3, v2, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-eq v2, v7, :cond_8

    goto :goto_8

    :cond_8
    const/4 v4, 0x0

    :goto_8
    if-eqz v4, :cond_9

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget-object v4, Lcom/mapbox/maps/ImageHolder;->Companion:Lcom/mapbox/maps/ImageHolder$Companion;

    invoke-virtual {v4, v2}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v2

    move-object v8, v2

    goto :goto_9

    :cond_9
    const/4 v8, 0x0

    :goto_9
    const/16 v2, 0x3a

    invoke-virtual {v3, v2, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-eq v2, v7, :cond_a

    goto :goto_a

    :cond_a
    const/4 v4, 0x0

    :goto_a
    if-eqz v4, :cond_b

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget-object v4, Lcom/mapbox/maps/ImageHolder;->Companion:Lcom/mapbox/maps/ImageHolder$Companion;

    invoke-virtual {v4, v2}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v2

    move-object v9, v2

    goto :goto_b

    :cond_b
    const/4 v9, 0x0

    :goto_b
    const/16 v2, 0x39

    invoke-virtual {v3, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    const/16 v2, 0x38

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v3, v2, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v11

    new-instance v6, Lev/c;

    move-object v7, v0

    invoke-direct/range {v6 .. v11}, Lev/c;-><init>(Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Ljava/lang/String;F)V

    move-object v10, v6

    :goto_c
    new-instance v0, Ltv/a;

    move/from16 v2, p3

    invoke-direct {v0, v3, v2, v5}, Ltv/a;-><init>(Landroid/content/res/TypedArray;FZ)V

    new-instance v2, Ltv/b;

    invoke-direct {v2, v10}, Ltv/b;-><init>(Lev/e;)V

    invoke-virtual {v0, v2}, Ltv/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ltv/b;->a()Ltv/c;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    iput-object v0, v1, Lrv/m;->M:Ltv/c;

    invoke-virtual {v1}, Lrv/m;->i()Ltv/c;

    move-result-object v0

    iget-boolean v0, v0, Ltv/c;->w:Z

    if-eqz v0, :cond_d

    iget-object v0, v1, Lrv/m;->z:Lm63/d;

    if-nez v0, :cond_d

    new-instance v0, Lm63/d;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context.applicationContext"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2}, Lm63/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lrv/m;->i()Ltv/c;

    move-result-object v2

    iget-object v3, v2, Ltv/c;->K:Lev/r;

    iget-boolean v2, v2, Ltv/c;->J:Z

    if-eqz v2, :cond_c

    move-object v8, v3

    goto :goto_d

    :cond_c
    const/4 v8, 0x0

    :goto_d
    iget-object v2, v0, Lm63/d;->E:Ljava/lang/Object;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2, v8}, Lec3/h2;->j(Ljava/lang/Object;)V

    iput-object v0, v1, Lrv/m;->z:Lm63/d;

    :cond_d
    return-void

    :goto_e
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method public final f(Lev/i;)V
    .locals 0

    iput-object p1, p0, Lrv/m;->w:Lev/i;

    return-void
.end method

.method public final h()V
    .locals 15

    invoke-virtual {p0}, Lrv/m;->i()Ltv/c;

    move-result-object v0

    iget-boolean v0, v0, Ltv/c;->w:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Lrv/m;->w:Lev/i;

    const-string v1, "delegateProvider"

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    iget-object v0, v0, Lev/i;->f:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    iget-object v3, p0, Lrv/m;->y:Lrv/r;

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v3, Lrv/r;->n:Lrv/p;

    invoke-interface {v3}, Lrv/p;->f()Z

    move-result v3

    if-ne v3, v4, :cond_0

    iget-boolean v3, p0, Lrv/m;->E:Z

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v3, p0, Lrv/m;->y:Lrv/r;

    if-nez v3, :cond_3

    new-instance v5, Lrv/r;

    invoke-virtual {p0}, Lrv/m;->i()Ltv/c;

    move-result-object v6

    iget-object v7, p0, Lrv/m;->x:Ljava/lang/ref/WeakReference;

    if-eqz v7, :cond_2

    iget-object v8, p0, Lrv/m;->w:Lev/i;

    if-eqz v8, :cond_1

    new-instance v9, Lq30/w0;

    invoke-virtual {p0}, Lrv/m;->i()Ltv/c;

    move-result-object v1

    iget-object v1, v1, Ltv/c;->H:Ljava/lang/String;

    invoke-virtual {p0}, Lrv/m;->i()Ltv/c;

    move-result-object v3

    iget-object v3, v3, Ltv/c;->I:Ljava/lang/String;

    const-string v10, "style"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-direct {v9, v10, v11}, Lq30/w0;-><init>(IB)V

    iput-object v0, v9, Lq30/w0;->y:Ljava/lang/Object;

    iput-object v1, v9, Lq30/w0;->x:Ljava/lang/Object;

    iput-object v3, v9, Lq30/w0;->z:Ljava/lang/Object;

    new-instance v10, Lq/f;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxStyleManager;->getPixelRatio()F

    move-result v1

    const-string v3, "indicatorPositionChangedListener"

    iget-object v11, p0, Lrv/m;->J:Lo52/q;

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "indicatorBearingChangedListener"

    iget-object v12, p0, Lrv/m;->K:Lrv/k;

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "indicatorAccuracyRadiusChangedListener"

    iget-object v13, p0, Lrv/m;->L:Lrv/l;

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0xa

    const/4 v14, 0x0

    invoke-direct {v10, v3, v14}, Lq/f;-><init>(IZ)V

    new-instance v3, Lsv/e;

    invoke-direct {v3, v12}, Lsv/e;-><init>(Lrv/k;)V

    iput-object v3, v10, Lq/f;->x:Ljava/lang/Object;

    new-instance v3, Lsv/f;

    invoke-direct {v3, v11}, Lsv/f;-><init>(Lo52/q;)V

    iput-object v3, v10, Lq/f;->y:Ljava/lang/Object;

    new-instance v3, Lsv/b;

    invoke-direct {v3, v13}, Lsv/b;-><init>(Lrv/l;)V

    iput-object v3, v10, Lq/f;->z:Ljava/lang/Object;

    new-instance v3, Lsv/g;

    invoke-direct {v3, v1}, Lsv/g;-><init>(F)V

    iput-object v3, v10, Lq/f;->E:Ljava/lang/Object;

    invoke-direct/range {v5 .. v10}, Lrv/r;-><init>(Ltv/c;Ljava/lang/ref/WeakReference;Lev/i;Lq30/w0;Lq/f;)V

    iput-object v5, p0, Lrv/m;->y:Lrv/r;

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    const-string v0, "weakContext"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    :goto_0
    iget-object v1, p0, Lrv/m;->y:Lrv/r;

    if-eqz v1, :cond_4

    invoke-virtual {v1, v0}, Lrv/r;->c(Lcom/mapbox/maps/MapboxMap;)V

    :cond_4
    iget-object v0, p0, Lrv/m;->y:Lrv/r;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lrv/r;->e:Lq/f;

    iget-object v0, v0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lsv/g;

    iget-boolean v1, v0, Lsv/d;->z:Z

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lsv/g;->d()V

    :cond_5
    iget-object v0, p0, Lrv/m;->z:Lm63/d;

    if-eqz v0, :cond_7

    iget-object v1, v0, Lm63/d;->z:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/common/location/LocationError;

    if-eqz v1, :cond_6

    iget-object v0, p0, Lrv/m;->y:Lrv/r;

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Location error: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LocationPuckManager"

    invoke-static {v1, v0}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    iget-object v1, v0, Lm63/d;->H:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object v3

    iget-object v5, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v5, Lbc3/w1;

    invoke-static {v3, v5}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v3

    invoke-static {v3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v3

    new-instance v5, Lay/u;

    const/16 v6, 0x15

    invoke-direct {v5, v0, p0, v2, v6}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {v3, v2, v2, v5, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_7

    invoke-interface {v0, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_7
    :goto_1
    iput-boolean v4, p0, Lrv/m;->E:Z

    return-void

    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_9
    :goto_2
    return-void
.end method

.method public final i()Ltv/c;
    .locals 1

    iget-object v0, p0, Lrv/m;->M:Ltv/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "internalSettings"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final initialize()V
    .locals 0

    return-void
.end method

.method public final j(Lkotlin/jvm/functions/Function1;)V
    .locals 5

    invoke-virtual {p0}, Lrv/m;->i()Ltv/c;

    move-result-object v0

    new-instance v1, Ltv/b;

    iget-object v2, v0, Ltv/c;->M:Lev/e;

    invoke-direct {v1, v2}, Ltv/b;-><init>(Lev/e;)V

    iget-boolean v3, v0, Ltv/c;->w:Z

    iput-boolean v3, v1, Ltv/b;->b:Z

    iget-boolean v3, v0, Ltv/c;->x:Z

    iput-boolean v3, v1, Ltv/b;->c:Z

    iget v3, v0, Ltv/c;->y:I

    iput v3, v1, Ltv/b;->d:I

    iget v3, v0, Ltv/c;->z:F

    iput v3, v1, Ltv/b;->e:F

    iget-boolean v3, v0, Ltv/c;->E:Z

    iput-boolean v3, v1, Ltv/b;->f:Z

    iget v3, v0, Ltv/c;->F:I

    iput v3, v1, Ltv/b;->g:I

    iget v3, v0, Ltv/c;->G:I

    iput v3, v1, Ltv/b;->h:I

    iget-object v3, v0, Ltv/c;->H:Ljava/lang/String;

    iput-object v3, v1, Ltv/b;->i:Ljava/lang/String;

    iget-object v3, v0, Ltv/c;->I:Ljava/lang/String;

    iput-object v3, v1, Ltv/b;->j:Ljava/lang/String;

    iget-boolean v3, v0, Ltv/c;->J:Z

    iput-boolean v3, v1, Ltv/b;->k:Z

    iget-object v3, v0, Ltv/c;->K:Lev/r;

    const-string v4, "puckBearing"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v1, Ltv/b;->l:Lev/r;

    iget-object v0, v0, Ltv/c;->L:Ljava/lang/String;

    iput-object v0, v1, Ltv/b;->m:Ljava/lang/String;

    iput-object v2, v1, Ltv/b;->a:Lev/e;

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ltv/b;->a()Ltv/c;

    move-result-object p1

    iput-object p1, p0, Lrv/m;->M:Ltv/c;

    invoke-virtual {p0}, Lrv/m;->i()Ltv/c;

    move-result-object p1

    iget-boolean p1, p1, Ltv/c;->w:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lrv/m;->E:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lrv/m;->x:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lrv/m;->z:Lm63/d;

    if-nez v1, :cond_0

    new-instance v1, Lm63/d;

    invoke-direct {v1, p1}, Lm63/d;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lrv/m;->z:Lm63/d;

    :cond_0
    invoke-virtual {p0}, Lrv/m;->h()V

    goto :goto_0

    :cond_1
    const-string p1, "weakContext"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lrv/m;->i()Ltv/c;

    move-result-object p1

    iget-boolean p1, p1, Ltv/c;->w:Z

    if-eqz p1, :cond_7

    iget-object p1, p0, Lrv/m;->y:Lrv/r;

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lrv/m;->i()Ltv/c;

    move-result-object v1

    iput-object v1, p1, Lrv/r;->a:Ltv/c;

    iget-object v2, p1, Lrv/r;->d:Lq30/w0;

    iget-object v3, v1, Ltv/c;->H:Ljava/lang/String;

    iput-object v3, v2, Lq30/w0;->x:Ljava/lang/Object;

    iget-object v3, v1, Ltv/c;->I:Ljava/lang/String;

    iput-object v3, v2, Lq30/w0;->z:Ljava/lang/Object;

    iget-object v2, p1, Lrv/r;->n:Lrv/p;

    invoke-interface {v2}, Lrv/p;->b0()V

    iget-object v2, p1, Lrv/r;->n:Lrv/p;

    invoke-interface {v2}, Lrv/p;->X()V

    invoke-virtual {p1, v1}, Lrv/r;->b(Ltv/c;)Lrv/p;

    move-result-object v2

    iput-object v2, p1, Lrv/r;->n:Lrv/p;

    iget-object v1, v1, Ltv/c;->L:Ljava/lang/String;

    invoke-interface {v2, v1}, Lrv/p;->V(Ljava/lang/String;)V

    iget-object v1, p1, Lrv/r;->c:Lev/i;

    iget-object v1, v1, Lev/i;->f:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p1, v1}, Lrv/r;->c(Lcom/mapbox/maps/MapboxMap;)V

    :cond_3
    iget-object p1, p0, Lrv/m;->z:Lm63/d;

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lrv/m;->i()Ltv/c;

    move-result-object v1

    iget-object v2, v1, Ltv/c;->K:Lev/r;

    iget-boolean v1, v1, Ltv/c;->J:Z

    if-eqz v1, :cond_5

    move-object v0, v2

    :cond_5
    iget-object p1, p1, Lm63/d;->E:Ljava/lang/Object;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_6
    return-void

    :cond_7
    iget-object p1, p0, Lrv/m;->y:Lrv/r;

    if-eqz p1, :cond_8

    const/4 v1, 0x1

    iput-boolean v1, p1, Lrv/r;->f:Z

    iget-object v1, p1, Lrv/r;->n:Lrv/p;

    invoke-interface {v1}, Lrv/p;->f0()V

    iget-object v1, p1, Lrv/r;->e:Lq/f;

    iget-object v2, v1, Lq/f;->x:Ljava/lang/Object;

    check-cast v2, Lsv/e;

    invoke-virtual {v2}, Lsv/d;->b()V

    iget-object v2, v1, Lq/f;->y:Ljava/lang/Object;

    check-cast v2, Lsv/f;

    invoke-virtual {v2}, Lsv/d;->b()V

    iget-object v2, v1, Lq/f;->E:Ljava/lang/Object;

    check-cast v2, Lsv/g;

    invoke-virtual {v2}, Lsv/d;->b()V

    iget-object v1, v1, Lq/f;->z:Ljava/lang/Object;

    check-cast v1, Lsv/b;

    invoke-virtual {v1}, Lsv/d;->b()V

    iget-object v1, p1, Lrv/r;->n:Lrv/p;

    invoke-interface {v1}, Lrv/p;->b0()V

    iget-object p1, p1, Lrv/r;->n:Lrv/p;

    invoke-interface {p1}, Lrv/p;->X()V

    :cond_8
    iput-object v0, p0, Lrv/m;->y:Lrv/r;

    iget-object p1, p0, Lrv/m;->z:Lm63/d;

    if-eqz p1, :cond_9

    iget-object p1, p1, Lm63/d;->H:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    if-eqz p1, :cond_9

    invoke-interface {p1, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_9
    const/4 p1, 0x0

    iput-boolean p1, p0, Lrv/m;->E:Z

    return-void
.end method

.method public final onStart()V
    .locals 0

    invoke-virtual {p0}, Lrv/m;->h()V

    return-void
.end method

.method public final onStop()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrv/m;->E:Z

    iget-object v0, p0, Lrv/m;->y:Lrv/r;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lrv/r;->e:Lq/f;

    iget-object v1, v0, Lq/f;->x:Ljava/lang/Object;

    check-cast v1, Lsv/e;

    invoke-virtual {v1}, Lsv/d;->b()V

    iget-object v1, v0, Lq/f;->y:Ljava/lang/Object;

    check-cast v1, Lsv/f;

    invoke-virtual {v1}, Lsv/d;->b()V

    iget-object v1, v0, Lq/f;->E:Ljava/lang/Object;

    check-cast v1, Lsv/g;

    invoke-virtual {v1}, Lsv/d;->b()V

    iget-object v0, v0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lsv/b;

    invoke-virtual {v0}, Lsv/d;->b()V

    :cond_0
    iget-object v0, p0, Lrv/m;->z:Lm63/d;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm63/d;->H:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    return-void
.end method
