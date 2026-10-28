.class public Leq0/u1;
.super Leq0/t1;
.source "SourceFile"


# static fields
.field private static final j:Landroidx/databinding/u;

.field private static final k:Landroid/util/SparseIntArray;


# instance fields
.field private final h:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private i:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Landroidx/databinding/u;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Landroidx/databinding/u;-><init>(I)V

    sput-object v0, Leq0/u1;->j:Landroidx/databinding/u;

    const-string v1, "view_team_leaderboard_toggle"

    filled-new-array {v1, v1, v1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x1

    filled-new-array {v4, v2, v3}, [I

    move-result-object v2

    sget v3, Lxp0/b0;->B0:I

    filled-new-array {v3, v3, v3}, [I

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v2, v3, v1}, Landroidx/databinding/u;->a(I[I[I[Ljava/lang/String;)V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Leq0/u1;->k:Landroid/util/SparseIntArray;

    sget v1, Lxp0/a0;->a7:I

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->D1:I

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->C1:I

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->X2:I

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/f;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Leq0/u1;->j:Landroidx/databinding/u;

    sget-object v1, Leq0/u1;->k:Landroid/util/SparseIntArray;

    const/16 v2, 0x8

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/a0;->mapBindings(Landroidx/databinding/f;Landroid/view/View;ILandroidx/databinding/u;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Leq0/u1;-><init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 12

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Leq0/s3;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Leq0/s3;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Leq0/s3;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    const/4 v4, 0x3

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v11}, Leq0/t1;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Leq0/s3;Leq0/s3;Leq0/s3;Landroid/widget/TextView;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Leq0/u1;->i:J

    const/4 p1, 0x0

    .line 4
    aget-object p1, p3, p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, v1, Leq0/u1;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 p2, 0x0

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object p1, v1, Leq0/t1;->d:Leq0/s3;

    invoke-virtual {p0, p1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    .line 7
    iget-object p1, v1, Leq0/t1;->e:Leq0/s3;

    invoke-virtual {p0, p1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    .line 8
    iget-object p1, v1, Leq0/t1;->f:Leq0/s3;

    invoke-virtual {p0, p1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    .line 9
    invoke-virtual {p0, v3}, Landroidx/databinding/a0;->setRootTag(Landroid/view/View;)V

    .line 10
    invoke-virtual {p0}, Leq0/u1;->invalidateAll()V

    return-void
.end method

.method private e(Leq0/s3;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/u1;->i:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/u1;->i:J

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private f(Leq0/s3;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/u1;->i:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/u1;->i:J

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private g(Leq0/s3;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/u1;->i:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/u1;->i:J

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public executeBindings()V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Leq0/u1;->i:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Leq0/u1;->i:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v4, 0x8

    and-long/2addr v0, v4

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Leq0/t1;->d:Leq0/s3;

    invoke-virtual {p0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lxp0/z;->t:I

    invoke-static {v1, v2}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Leq0/s3;->c(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Leq0/t1;->d:Leq0/s3;

    invoke-virtual {p0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lxp0/d0;->c2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Leq0/s3;->d(Ljava/lang/String;)V

    iget-object v0, p0, Leq0/t1;->e:Leq0/s3;

    invoke-virtual {p0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lgy0/a;->X4:I

    invoke-static {v1, v2}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Leq0/s3;->c(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Leq0/t1;->e:Leq0/s3;

    invoke-virtual {p0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lxp0/d0;->d2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Leq0/s3;->d(Ljava/lang/String;)V

    iget-object v0, p0, Leq0/t1;->f:Leq0/s3;

    invoke-virtual {p0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lvu1/c;->g:I

    invoke-static {v1, v2}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Leq0/s3;->c(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Leq0/t1;->f:Leq0/s3;

    invoke-virtual {p0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lxp0/d0;->e2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Leq0/s3;->d(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Leq0/t1;->f:Leq0/s3;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    iget-object v0, p0, Leq0/t1;->d:Leq0/s3;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    iget-object v0, p0, Leq0/t1;->e:Leq0/s3;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Leq0/u1;->i:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Leq0/t1;->f:Leq0/s3;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Leq0/t1;->d:Leq0/s3;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Leq0/t1;->e:Leq0/s3;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    const/4 v0, 0x0

    return v0

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    monitor-enter p0

    const-wide/16 v0, 0x8

    :try_start_0
    iput-wide v0, p0, Leq0/u1;->i:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Leq0/t1;->f:Leq0/s3;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object v0, p0, Leq0/t1;->d:Leq0/s3;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object v0, p0, Leq0/t1;->e:Leq0/s3;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    invoke-virtual {p0}, Landroidx/databinding/a0;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p2, Leq0/s3;

    invoke-direct {p0, p2, p3}, Leq0/u1;->e(Leq0/s3;I)Z

    move-result p1

    return p1

    :cond_1
    check-cast p2, Leq0/s3;

    invoke-direct {p0, p2, p3}, Leq0/u1;->g(Leq0/s3;I)Z

    move-result p1

    return p1

    :cond_2
    check-cast p2, Leq0/s3;

    invoke-direct {p0, p2, p3}, Leq0/u1;->f(Leq0/s3;I)Z

    move-result p1

    return p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/g0;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/t1;->f:Leq0/s3;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/t1;->d:Leq0/s3;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/t1;->e:Leq0/s3;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
