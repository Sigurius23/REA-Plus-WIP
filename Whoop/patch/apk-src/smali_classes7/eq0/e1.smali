.class public Leq0/e1;
.super Leq0/d1;
.source "SourceFile"


# static fields
.field private static final l:Landroidx/databinding/u;

.field private static final m:Landroid/util/SparseIntArray;


# instance fields
.field private final j:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private k:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Landroidx/databinding/u;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Landroidx/databinding/u;-><init>(I)V

    sput-object v0, Leq0/e1;->l:Landroidx/databinding/u;

    const-string v1, "layout_global_share_error_state"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    filled-new-array {v2}, [I

    move-result-object v2

    sget v3, Lxp0/b0;->d0:I

    filled-new-array {v3}, [I

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v2, v3, v1}, Landroidx/databinding/u;->a(I[I[I[Ljava/lang/String;)V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Leq0/e1;->m:Landroid/util/SparseIntArray;

    sget v1, Lxp0/a0;->L7:I

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->N6:I

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->O7:I

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->P7:I

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->L2:I

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->J2:I

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->K2:I

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->v6:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/f;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Leq0/e1;->l:Landroidx/databinding/u;

    sget-object v1, Leq0/e1;->m:Landroid/util/SparseIntArray;

    const/16 v2, 0xa

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/a0;->mapBindings(Landroidx/databinding/f;Landroid/view/View;ILandroidx/databinding/u;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Leq0/e1;-><init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 13

    const/4 v0, 0x1

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Leq0/i2;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/whoop/ui/pills/StrokedPillButton;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/whoop/ui/pills/StrokedPillButton;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/whoop/ui/ThrobberView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroidx/fragment/app/FragmentContainerView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroidx/viewpager2/widget/ViewPager2;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Lcom/google/android/material/tabs/TabLayout;

    const/4 v3, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v12}, Leq0/d1;-><init>(Ljava/lang/Object;Landroid/view/View;ILeq0/i2;Lcom/whoop/ui/pills/StrokedPillButton;Lcom/whoop/ui/pills/StrokedPillButton;Lcom/whoop/ui/ThrobberView;Landroidx/fragment/app/FragmentContainerView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/TabLayout;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Leq0/e1;->k:J

    .line 4
    iget-object v1, p0, Leq0/d1;->a:Leq0/i2;

    invoke-virtual {p0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    const/4 v1, 0x0

    .line 5
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, p0, Leq0/e1;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p0, p2}, Landroidx/databinding/a0;->setRootTag(Landroid/view/View;)V

    .line 8
    invoke-virtual {p0}, Leq0/e1;->invalidateAll()V

    return-void
.end method

.method private e(Leq0/i2;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/e1;->k:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/e1;->k:J

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
    .locals 2

    monitor-enter p0

    const-wide/16 v0, 0x0

    :try_start_0
    iput-wide v0, p0, Leq0/e1;->k:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Leq0/d1;->a:Leq0/i2;

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
    iget-wide v0, p0, Leq0/e1;->k:J

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

    iget-object v0, p0, Leq0/d1;->a:Leq0/i2;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
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

    const-wide/16 v0, 0x2

    :try_start_0
    iput-wide v0, p0, Leq0/e1;->k:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Leq0/d1;->a:Leq0/i2;

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
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p2, Leq0/i2;

    invoke-direct {p0, p2, p3}, Leq0/e1;->e(Leq0/i2;I)Z

    move-result p1

    return p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/g0;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/d1;->a:Leq0/i2;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
