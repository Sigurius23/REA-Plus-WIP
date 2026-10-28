.class public Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;
.super Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;
.source "SourceFile"


# static fields
.field private static final sIncludes:Landroidx/databinding/u;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private final mboundView0:Landroidx/coordinatorlayout/widget/CoordinatorLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Landroidx/databinding/u;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Landroidx/databinding/u;-><init>(I)V

    sput-object v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->sIncludes:Landroidx/databinding/u;

    const-string v1, "member_levels_current_view"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    filled-new-array {v2}, [I

    move-result-object v2

    sget v3, Lcom/whoop/profile/R$layout;->member_levels_current_view:I

    filled-new-array {v3}, [I

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v0, v4, v2, v3, v1}, Landroidx/databinding/u;->a(I[I[I[Ljava/lang/String;)V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    sget v1, Lcom/whoop/profile/R$id;->member_levels_toolbar:I

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lcom/whoop/profile/R$id;->pinned_level_title:I

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lcom/whoop/profile/R$id;->progress_level_recyclerview:I

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/f;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->sIncludes:Landroidx/databinding/u;

    sget-object v1, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x6

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/a0;->mapBindings(Landroidx/databinding/f;Landroid/view/View;ILandroidx/databinding/u;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;-><init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 10

    const/4 v0, 0x1

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/whoop/ui/WhoopNewToolbar;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v4, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/google/android/material/appbar/CollapsingToolbarLayout;Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;Lcom/whoop/ui/WhoopNewToolbar;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->collapsingToolbarLayout:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object p1, v1, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    const/4 p1, 0x0

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object p1, v1, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->mboundView0:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p0, v3}, Landroidx/databinding/a0;->setRootTag(Landroid/view/View;)V

    .line 9
    invoke-virtual {p0}, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeCurrentLevelViewContainer(Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;I)Z
    .locals 2

    sget p1, Lcom/whoop/profile/BR;->_all:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->mDirtyFlags:J

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
    iput-wide v0, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->mDirtyFlags:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

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
    iget-wide v0, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->mDirtyFlags:J

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

    iget-object v0, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

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
    iput-wide v0, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->mDirtyFlags:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

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
    check-cast p2, Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    invoke-direct {p0, p2, p3}, Lcom/whoop/profile/databinding/FragmentMemberLevelsBindingImpl;->onChangeCurrentLevelViewContainer(Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;I)Z

    move-result p1

    return p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/g0;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Lcom/whoop/profile/databinding/FragmentMemberLevelsBinding;->currentLevelViewContainer:Lcom/whoop/profile/databinding/MemberLevelsCurrentViewBinding;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
