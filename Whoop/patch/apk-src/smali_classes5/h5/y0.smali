.class public final Lh5/y0;
.super Lh5/c1;
.source "SourceFile"


# static fields
.field public static final e:Landroid/view/animation/PathInterpolator;

.field public static final f:Lh8/a;

.field public static final g:Landroid/view/animation/DecelerateInterpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3f8ccccd    # 1.1f

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v3, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lh5/y0;->e:Landroid/view/animation/PathInterpolator;

    new-instance v0, Lh8/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh8/a;-><init>(I)V

    sput-object v0, Lh5/y0;->f:Lh8/a;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Lh5/y0;->g:Landroid/view/animation/DecelerateInterpolator;

    return-void
.end method

.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lh5/c1;-><init>(ILandroid/view/animation/Interpolator;J)V

    return-void
.end method

.method public static e(Landroid/view/View;Lh5/d1;)V
    .locals 2

    invoke-static {p0}, Lh5/y0;->j(Landroid/view/View;)Landroidx/datastore/preferences/protobuf/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/l;->g(Lh5/d1;)V

    iget v0, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1}, Lh5/y0;->e(Landroid/view/View;Lh5/d1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static f(Landroid/view/View;Lh5/d1;Landroid/view/WindowInsets;Z)V
    .locals 2

    invoke-static {p0}, Lh5/y0;->j(Landroid/view/View;)Landroidx/datastore/preferences/protobuf/l;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iput-object p2, v0, Landroidx/datastore/preferences/protobuf/l;->y:Ljava/lang/Object;

    if-nez p3, :cond_1

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l;->h()V

    iget p3, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    if-nez p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    move p3, v1

    :cond_1
    :goto_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/view/ViewGroup;

    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1, p2, p3}, Lh5/y0;->f(Landroid/view/View;Lh5/d1;Landroid/view/WindowInsets;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static g(Landroid/view/View;Lh5/q1;Ljava/util/List;)V
    .locals 2

    invoke-static {p0}, Lh5/y0;->j(Landroid/view/View;)Landroidx/datastore/preferences/protobuf/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/l;->i(Lh5/q1;Ljava/util/List;)Lh5/q1;

    move-result-object p1

    iget v0, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1, p2}, Lh5/y0;->g(Landroid/view/View;Lh5/q1;Ljava/util/List;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static h(Landroid/view/View;Lh5/d1;Lio/sentry/internal/debugmeta/c;)V
    .locals 2

    invoke-static {p0}, Lh5/y0;->j(Landroid/view/View;)Landroidx/datastore/preferences/protobuf/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/l;->j(Lh5/d1;Lio/sentry/internal/debugmeta/c;)Lio/sentry/internal/debugmeta/c;

    iget v0, v0, Landroidx/datastore/preferences/protobuf/l;->x:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1, p2}, Lh5/y0;->h(Landroid/view/View;Lh5/d1;Lio/sentry/internal/debugmeta/c;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    const v0, 0x7f0a0c31

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method public static j(Landroid/view/View;)Landroidx/datastore/preferences/protobuf/l;
    .locals 1

    const v0, 0x7f0a0c39

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lh5/x0;

    if-eqz v0, :cond_0

    check-cast p0, Lh5/x0;

    iget-object p0, p0, Lh5/x0;->a:Landroidx/datastore/preferences/protobuf/l;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static k(Landroid/view/View;Landroidx/datastore/preferences/protobuf/l;)V
    .locals 3

    const v0, 0x7f0a0c31

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    const v1, 0x7f0a0c39

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    return-void

    :cond_0
    new-instance v2, Lh5/x0;

    invoke-direct {v2, p0, p1}, Lh5/x0;-><init>(Landroid/view/View;Landroidx/datastore/preferences/protobuf/l;)V

    invoke-virtual {p0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-nez v0, :cond_1

    invoke-virtual {p0, v2}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    :cond_1
    return-void
.end method
