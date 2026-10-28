.class public final Lh5/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/l;

.field public b:Lh5/q1;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroidx/datastore/preferences/protobuf/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh5/x0;->a:Landroidx/datastore/preferences/protobuf/l;

    sget-object p2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Lh5/i0;->a(Landroid/view/View;)Lh5/q1;

    move-result-object p1

    if-eqz p1, :cond_2

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p2, v0, :cond_0

    new-instance p2, Lh5/g1;

    invoke-direct {p2, p1}, Lh5/g1;-><init>(Lh5/q1;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x1d

    if-lt p2, v0, :cond_1

    new-instance p2, Lh5/f1;

    invoke-direct {p2, p1}, Lh5/f1;-><init>(Lh5/q1;)V

    goto :goto_0

    :cond_1
    new-instance p2, Lh5/e1;

    invoke-direct {p2, p1}, Lh5/e1;-><init>(Lh5/q1;)V

    :goto_0
    invoke-virtual {p2}, Lh5/h1;->b()Lh5/q1;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Lh5/x0;->b:Lh5/q1;

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    invoke-virtual {v6}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static/range {p1 .. p2}, Lh5/q1;->h(Landroid/view/View;Landroid/view/WindowInsets;)Lh5/q1;

    move-result-object v1

    iput-object v1, v0, Lh5/x0;->b:Lh5/q1;

    invoke-static/range {p1 .. p2}, Lh5/y0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_0
    invoke-static/range {p1 .. p2}, Lh5/q1;->h(Landroid/view/View;Landroid/view/WindowInsets;)Lh5/q1;

    move-result-object v3

    iget-object v1, v3, Lh5/q1;->a:Lh5/o1;

    iget-object v2, v0, Lh5/x0;->b:Lh5/q1;

    if-nez v2, :cond_1

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v6}, Lh5/i0;->a(Landroid/view/View;)Lh5/q1;

    move-result-object v2

    iput-object v2, v0, Lh5/x0;->b:Lh5/q1;

    :cond_1
    iget-object v2, v0, Lh5/x0;->b:Lh5/q1;

    if-nez v2, :cond_2

    iput-object v3, v0, Lh5/x0;->b:Lh5/q1;

    invoke-static/range {p1 .. p2}, Lh5/y0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_2
    invoke-static {v6}, Lh5/y0;->j(Landroid/view/View;)Landroidx/datastore/preferences/protobuf/l;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, v2, Landroidx/datastore/preferences/protobuf/l;->y:Ljava/lang/Object;

    check-cast v2, Landroid/view/WindowInsets;

    invoke-static {v2, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static/range {p1 .. p2}, Lh5/y0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_3
    iget-object v2, v0, Lh5/x0;->b:Lh5/q1;

    const/4 v5, 0x1

    const/4 v8, 0x0

    :goto_0
    const/16 v9, 0x100

    if-gt v5, v9, :cond_5

    invoke-virtual {v1, v5}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v9

    iget-object v10, v2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v10, v5}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v10

    invoke-virtual {v9, v10}, Lv4/b;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    or-int/2addr v8, v5

    :cond_4
    shl-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    if-nez v8, :cond_6

    invoke-static/range {p1 .. p2}, Lh5/y0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_6
    iget-object v2, v0, Lh5/x0;->b:Lh5/q1;

    and-int/lit8 v5, v8, 0x8

    if-eqz v5, :cond_8

    const/16 v5, 0x8

    invoke-virtual {v1, v5}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v9

    iget v9, v9, Lv4/b;->d:I

    iget-object v10, v2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v10, v5}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v5

    iget v5, v5, Lv4/b;->d:I

    if-le v9, v5, :cond_7

    sget-object v5, Lh5/y0;->e:Landroid/view/animation/PathInterpolator;

    goto :goto_1

    :cond_7
    sget-object v5, Lh5/y0;->f:Lh8/a;

    goto :goto_1

    :cond_8
    sget-object v5, Lh5/y0;->g:Landroid/view/animation/DecelerateInterpolator;

    :goto_1
    new-instance v9, Lh5/d1;

    const-wide/16 v10, 0xa0

    invoke-direct {v9, v8, v5, v10, v11}, Lh5/d1;-><init>(ILandroid/view/animation/Interpolator;J)V

    iget-object v5, v9, Lh5/d1;->a:Lh5/c1;

    const/4 v10, 0x0

    invoke-virtual {v5, v10}, Lh5/c1;->d(F)V

    const/4 v10, 0x2

    new-array v5, v10, [F

    fill-array-data v5, :array_0

    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v5

    iget-object v11, v9, Lh5/d1;->a:Lh5/c1;

    invoke-virtual {v11}, Lh5/c1;->a()J

    move-result-wide v11

    invoke-virtual {v5, v11, v12}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v11

    invoke-virtual {v1, v8}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v1

    iget-object v5, v2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v5, v8}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v5

    iget v12, v1, Lv4/b;->a:I

    iget v13, v5, Lv4/b;->a:I

    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    move-result v12

    iget v13, v1, Lv4/b;->b:I

    iget v14, v5, Lv4/b;->b:I

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v15

    iget v10, v1, Lv4/b;->c:I

    iget v4, v5, Lv4/b;->c:I

    move-object/from16 v16, v2

    invoke-static {v10, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    move-object/from16 v17, v3

    iget v3, v1, Lv4/b;->d:I

    move/from16 v18, v8

    iget v8, v5, Lv4/b;->d:I

    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v12, v15, v2, v0}, Lv4/b;->b(IIII)Lv4/b;

    move-result-object v0

    iget v1, v1, Lv4/b;->a:I

    iget v2, v5, Lv4/b;->a:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v1, v2, v4, v3}, Lv4/b;->b(IIII)Lv4/b;

    move-result-object v1

    new-instance v8, Lio/sentry/internal/debugmeta/c;

    const/16 v2, 0x11

    invoke-direct {v8, v2, v0, v1}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v6, v9, v7, v0}, Lh5/y0;->f(Landroid/view/View;Lh5/d1;Landroid/view/WindowInsets;Z)V

    new-instance v1, Lh5/v0;

    move-object v2, v9

    move-object/from16 v4, v16

    move-object/from16 v3, v17

    move/from16 v5, v18

    invoke-direct/range {v1 .. v6}, Lh5/v0;-><init>(Lh5/d1;Lh5/q1;Lh5/q1;ILandroid/view/View;)V

    invoke-virtual {v11, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v0, Lbc/p;

    const/4 v1, 0x2

    invoke-direct {v0, v6, v1, v2}, Lbc/p;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    invoke-virtual {v11, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v0, Lh5/w0;

    invoke-direct {v0, v6, v2, v8, v11}, Lh5/w0;-><init>(Landroid/view/View;Lh5/d1;Lio/sentry/internal/debugmeta/c;Landroid/animation/ValueAnimator;)V

    invoke-static {v6, v0}, Lh5/w;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lh5/x0;->b:Lh5/q1;

    invoke-static/range {p1 .. p2}, Lh5/y0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
