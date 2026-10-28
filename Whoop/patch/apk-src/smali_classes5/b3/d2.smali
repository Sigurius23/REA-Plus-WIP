.class public final Lb3/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Lat/b;


# instance fields
.field public final a:Landroid/graphics/Rect;

.field public final b:Landroid/graphics/Rect;

.field public final c:Landroid/graphics/Rect;

.field public final d:Lb3/c2;

.field public final e:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lat/b;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lat/b;-><init>(I)V

    sput-object v0, Lb3/d2;->f:Lat/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lb3/d2;->a:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lb3/d2;->b:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lb3/d2;->c:Landroid/graphics/Rect;

    new-instance v0, Lb3/c2;

    new-instance v1, Lab/a;

    invoke-direct {v1, p0}, Lab/a;-><init>(Lb3/d2;)V

    invoke-direct {v0, v1}, Lb3/c2;-><init>(Lab/a;)V

    iput-object v0, p0, Lb3/d2;->d:Lb3/c2;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb3/d2;->e:Ljava/util/ArrayList;

    return-void
.end method

.method public static e(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    add-int/2addr p0, v0

    invoke-virtual {p1, p0, v1, p0, v1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method


# virtual methods
.method public final a(ILandroid/graphics/Rect;Landroid/view/View;Landroid/view/ViewGroup;Ljava/util/ArrayList;)Landroid/view/View;
    .locals 11

    const/16 v0, 0x82

    const/16 v1, 0x42

    const/16 v2, 0x21

    const/16 v3, 0x11

    const/4 v6, 0x2

    const/4 v7, 0x1

    iget-object v8, p0, Lb3/d2;->a:Landroid/graphics/Rect;

    if-eqz p3, :cond_0

    invoke-virtual {p3, v8}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    invoke-virtual {p4, p3, v8}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {v8, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_1
    if-eq p1, v7, :cond_6

    if-eq p1, v6, :cond_4

    if-eq p1, v3, :cond_3

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    if-eq p1, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p4}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p4}, Landroid/view/View;->getScrollX()I

    move-result v9

    invoke-virtual {v8, v9, p2, v9, p2}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_3
    invoke-static {p4, v8}, Lb3/d2;->e(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p4}, Landroid/view/View;->getLayoutDirection()I

    move-result p2

    if-ne p2, v7, :cond_5

    invoke-static {p4, v8}, Lb3/d2;->e(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p4}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p4}, Landroid/view/View;->getScrollX()I

    move-result v9

    invoke-virtual {v8, v9, p2, v9, p2}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_6
    invoke-virtual {p4}, Landroid/view/View;->getLayoutDirection()I

    move-result p2

    if-ne p2, v7, :cond_7

    invoke-virtual {p4}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p4}, Landroid/view/View;->getScrollX()I

    move-result v9

    invoke-virtual {v8, v9, p2, v9, p2}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_7
    invoke-static {p4, v8}, Lb3/d2;->e(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V

    :goto_0
    if-eq p1, v7, :cond_a

    if-eq p1, v6, :cond_a

    if-eq p1, v3, :cond_8

    if-eq p1, v2, :cond_8

    if-eq p1, v1, :cond_8

    if-ne p1, v0, :cond_9

    :cond_8
    move-object v1, p0

    move v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object v3, v8

    goto :goto_1

    :cond_9
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown direction: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :goto_1
    invoke-virtual/range {v1 .. v6}, Lb3/d2;->d(ILandroid/graphics/Rect;Landroid/view/View;Landroid/view/ViewGroup;Ljava/util/ArrayList;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_a
    move-object/from16 v8, p5

    iget-object v9, p0, Lb3/d2;->d:Lb3/c2;

    :try_start_0
    invoke-virtual {v9, v8, p4}, Lb3/c2;->a(Ljava/util/ArrayList;Landroid/view/ViewGroup;)V

    invoke-static {v8, v9}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v10, v9, Lb3/c2;->y:La0/v0;

    invoke-virtual {v10}, La0/v0;->a()V

    iget-object v10, v9, Lb3/c2;->x:La0/w0;

    invoke-virtual {v10}, La0/w0;->b()V

    iget-object v10, v9, Lb3/c2;->z:La0/m0;

    invoke-virtual {v10}, La0/m0;->a()V

    iget-object v9, v9, Lb3/c2;->w:La0/v0;

    invoke-virtual {v9}, La0/v0;->a()V

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x0

    if-ge v9, v6, :cond_b

    return-object v10

    :cond_b
    if-eq p1, v7, :cond_10

    if-eq p1, v6, :cond_d

    if-eq p1, v3, :cond_c

    if-eq p1, v2, :cond_c

    if-eq p1, v1, :cond_c

    if-eq p1, v0, :cond_c

    goto :goto_2

    :cond_c
    iget-object v3, p0, Lb3/d2;->a:Landroid/graphics/Rect;

    move-object v1, p0

    move v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, v8

    invoke-virtual/range {v1 .. v6}, Lb3/d2;->d(ILandroid/graphics/Rect;Landroid/view/View;Landroid/view/ViewGroup;Ljava/util/ArrayList;)Landroid/view/View;

    move-result-object v10

    goto :goto_2

    :cond_d
    if-ge v9, v6, :cond_e

    goto :goto_2

    :cond_e
    if-eqz p3, :cond_f

    invoke-virtual {v8, p3}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_f

    add-int/2addr p1, v7

    if-ge p1, v9, :cond_f

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Landroid/view/View;

    goto :goto_2

    :cond_f
    const/4 p1, 0x0

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Landroid/view/View;

    goto :goto_2

    :cond_10
    if-ge v9, v6, :cond_11

    goto :goto_2

    :cond_11
    if-eqz p3, :cond_12

    invoke-virtual {v8, p3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-lez p1, :cond_12

    sub-int/2addr p1, v7

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Landroid/view/View;

    goto :goto_2

    :cond_12
    add-int/lit8 p1, v9, -0x1

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Landroid/view/View;

    :goto_2
    if-nez v10, :cond_13

    sub-int/2addr v9, v7

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1

    :cond_13
    return-object v10

    :catchall_0
    move-exception v0

    move-object p1, v0

    iget-object p2, v9, Lb3/c2;->y:La0/v0;

    invoke-virtual {p2}, La0/v0;->a()V

    iget-object p2, v9, Lb3/c2;->x:La0/w0;

    invoke-virtual {p2}, La0/w0;->b()V

    iget-object p2, v9, Lb3/c2;->z:La0/m0;

    invoke-virtual {p2}, La0/m0;->a()V

    iget-object p2, v9, Lb3/c2;->w:La0/v0;

    invoke-virtual {p2}, La0/v0;->a()V

    throw p1
.end method

.method public final b(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    if-ne p2, p3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    move-object v2, v0

    :goto_0
    instance-of v3, v1, Landroid/view/ViewGroup;

    if-eqz v3, :cond_4

    if-ne v1, p3, :cond_2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v7, v2

    goto :goto_2

    :cond_2
    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getTouchscreenBlocksFocus()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const-string v4, "android.hardware.touchscreen"

    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object v2, v1

    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_0

    :cond_4
    :goto_1
    move-object v7, p3

    :goto_2
    invoke-static {p2, v7, p1}, Ldp/d;->k(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    move-result-object p3

    const/4 v1, 0x1

    move v2, v1

    move-object v1, p3

    :goto_3
    if-eqz p3, :cond_9

    invoke-virtual {p3}, Landroid/view/View;->isFocusable()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {p3}, Landroid/view/View;->isInTouchMode()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p3}, Landroid/view/View;->isFocusableInTouchMode()Z

    move-result v3

    if-eqz v3, :cond_6

    :cond_5
    move-object v0, p3

    goto :goto_5

    :cond_6
    invoke-static {p3, v7, p1}, Ldp/d;->k(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    move-result-object p3

    xor-int/lit8 v3, v2, 0x1

    if-nez v2, :cond_8

    if-eqz v1, :cond_7

    invoke-static {v1, v7, p1}, Ldp/d;->k(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    goto :goto_4

    :cond_7
    move-object v1, v0

    :goto_4
    if-ne v1, p3, :cond_8

    goto :goto_5

    :cond_8
    move v2, v3

    goto :goto_3

    :cond_9
    :goto_5
    if-eqz v0, :cond_a

    return-object v0

    :cond_a
    iget-object v8, p0, Lb3/d2;->e:Ljava/util/ArrayList;

    :try_start_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v7}, Landroid/view/View;->isInTouchMode()Z

    move-result p3

    invoke-virtual {v7, v8, p1, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_b

    const/4 v5, 0x0

    move-object v3, p0

    move v4, p1

    move-object v6, p2

    invoke-virtual/range {v3 .. v8}, Lb3/d2;->a(ILandroid/graphics/Rect;Landroid/view/View;Landroid/view/ViewGroup;Ljava/util/ArrayList;)Landroid/view/View;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_7

    :cond_b
    :goto_6
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    return-object v0

    :goto_7
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    throw p1
.end method

.method public final c(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/graphics/Rect;I)Landroid/view/View;
    .locals 7

    iget-object v0, p0, Lb3/d2;->a:Landroid/graphics/Rect;

    invoke-virtual {v0, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-object v3, p0, Lb3/d2;->a:Landroid/graphics/Rect;

    iget-object v6, p0, Lb3/d2;->e:Ljava/util/ArrayList;

    :try_start_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p1}, Landroid/view/View;->isInTouchMode()Z

    move-result p2

    invoke-virtual {p1, v6, p3, p2}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, p1

    move v2, p3

    invoke-virtual/range {v1 .. v6}, Lb3/d2;->a(ILandroid/graphics/Rect;Landroid/view/View;Landroid/view/ViewGroup;Ljava/util/ArrayList;)Landroid/view/View;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    const/4 p1, 0x0

    return-object p1

    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    throw p1
.end method

.method public final d(ILandroid/graphics/Rect;Landroid/view/View;Landroid/view/ViewGroup;Ljava/util/ArrayList;)Landroid/view/View;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p4

    iget-object v3, v0, Lb3/d2;->b:Landroid/graphics/Rect;

    move-object/from16 v4, p2

    invoke-virtual {v3, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    const/16 v5, 0x11

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v1, v5, :cond_3

    const/16 v5, 0x21

    if-eq v1, v5, :cond_2

    const/16 v5, 0x42

    if-eq v1, v5, :cond_1

    const/16 v5, 0x82

    if-eq v1, v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v5

    neg-int v5, v5

    sub-int/2addr v5, v7

    invoke-virtual {v3, v6, v5}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v5

    neg-int v5, v5

    sub-int/2addr v5, v7

    invoke-virtual {v3, v5, v6}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v5

    add-int/2addr v5, v7

    invoke-virtual {v3, v6, v5}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_0

    :cond_3
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v5

    add-int/2addr v5, v7

    invoke-virtual {v3, v5, v6}, Landroid/graphics/Rect;->offset(II)V

    :goto_0
    invoke-interface/range {p5 .. p5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v8, 0x0

    :goto_1
    if-ge v6, v5, :cond_6

    move-object/from16 v9, p5

    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    move-object/from16 v11, p3

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_5

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_5

    iget-object v12, v0, Lb3/d2;->c:Landroid/graphics/Rect;

    invoke-virtual {v10, v12}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    invoke-virtual {v2, v10, v12}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v12}, Li2/w0;->J(Landroid/graphics/Rect;)Lh2/c;

    move-result-object v13

    invoke-static {v3}, Li2/w0;->J(Landroid/graphics/Rect;)Lh2/c;

    move-result-object v14

    invoke-static {v4}, Li2/w0;->J(Landroid/graphics/Rect;)Lh2/c;

    move-result-object v15

    invoke-static {v1}, Ljc/x;->v0(I)Lg2/d;

    move-result-object v7

    if-eqz v7, :cond_4

    iget v7, v7, Lg2/d;->a:I

    goto :goto_2

    :cond_4
    const/4 v7, 0x1

    :goto_2
    invoke-static {v13, v14, v15, v7}, Lg2/g;->w(Lh2/c;Lh2/c;Lh2/c;I)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {v3, v12}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    move-object v8, v10

    :cond_5
    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x1

    goto :goto_1

    :cond_6
    return-object v8
.end method
