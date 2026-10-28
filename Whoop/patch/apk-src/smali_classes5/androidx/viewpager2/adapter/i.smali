.class public abstract Landroidx/viewpager2/adapter/i;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# static fields
.field private static final GRACE_WINDOW_TIME_MS:J = 0x2710L

.field private static final KEY_PREFIX_FRAGMENT:Ljava/lang/String; = "f#"

.field private static final KEY_PREFIX_STATE:Ljava/lang/String; = "s#"


# instance fields
.field mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

.field final mFragmentManager:Landroidx/fragment/app/o1;

.field private mFragmentMaxLifecycleEnforcer:Landroidx/viewpager2/adapter/g;

.field final mFragments:La0/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La0/y;"
        }
    .end annotation
.end field

.field private mHasStaleFragments:Z

.field mIsInGracePeriod:Z

.field private final mItemIdToViewHolder:La0/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La0/y;"
        }
    .end annotation
.end field

.field final mLifecycle:Landroidx/lifecycle/x;

.field private final mSavedStates:La0/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La0/y;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getChildFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Landroidx/viewpager2/adapter/i;-><init>(Landroidx/fragment/app/o1;Landroidx/lifecycle/x;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/o1;Landroidx/lifecycle/x;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    .line 3
    new-instance v0, La0/y;

    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La0/y;-><init>(Ljava/lang/Object;)V

    .line 5
    iput-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    .line 6
    new-instance v0, La0/y;

    .line 7
    invoke-direct {v0, v1}, La0/y;-><init>(Ljava/lang/Object;)V

    .line 8
    iput-object v0, p0, Landroidx/viewpager2/adapter/i;->mSavedStates:La0/y;

    .line 9
    new-instance v0, La0/y;

    .line 10
    invoke-direct {v0, v1}, La0/y;-><init>(Ljava/lang/Object;)V

    .line 11
    iput-object v0, p0, Landroidx/viewpager2/adapter/i;->mItemIdToViewHolder:La0/y;

    .line 12
    new-instance v0, Landroidx/viewpager2/adapter/c;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, v0, Landroidx/viewpager2/adapter/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    iput-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Landroidx/viewpager2/adapter/i;->mIsInGracePeriod:Z

    .line 17
    iput-boolean v0, p0, Landroidx/viewpager2/adapter/i;->mHasStaleFragments:Z

    .line 18
    iput-object p1, p0, Landroidx/viewpager2/adapter/i;->mFragmentManager:Landroidx/fragment/app/o1;

    .line 19
    iput-object p2, p0, Landroidx/viewpager2/adapter/i;->mLifecycle:Landroidx/lifecycle/x;

    const/4 p1, 0x1

    .line 20
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/i1;->setHasStableIds(Z)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Long;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mItemIdToViewHolder:La0/y;

    invoke-virtual {v2}, La0/y;->i()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mItemIdToViewHolder:La0/y;

    invoke-virtual {v2, v1}, La0/y;->j(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_1

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mItemIdToViewHolder:La0/y;

    invoke-virtual {v0, v1}, La0/y;->f(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Design assumption violated: a ViewHolder can only be bound to one item at a time."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public addViewToContainer(Landroid/view/View;Landroid/widget/FrameLayout;)V
    .locals 2

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Design assumption violated."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(J)V
    .locals 4

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v0, p1, p2}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/m0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_1
    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/adapter/i;->containsItem(J)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/viewpager2/adapter/i;->mSavedStates:La0/y;

    invoke-virtual {v1, p1, p2}, La0/y;->h(J)V

    :cond_2
    invoke-virtual {v0}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v0, p1, p2}, La0/y;->h(J)V

    return-void

    :cond_3
    invoke-virtual {p0}, Landroidx/viewpager2/adapter/i;->shouldDelayFragmentTransactions()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/viewpager2/adapter/i;->mHasStaleFragments:Z

    return-void

    :cond_4
    invoke-virtual {v0}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/adapter/i;->containsItem(J)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v1, Landroidx/viewpager2/adapter/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v1, p0, Landroidx/viewpager2/adapter/i;->mFragmentManager:Landroidx/fragment/app/o1;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/o1;->c0(Landroidx/fragment/app/m0;)Landroidx/fragment/app/l0;

    move-result-object v1

    iget-object v3, p0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Landroidx/viewpager2/adapter/c;->a(Ljava/util/List;)V

    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mSavedStates:La0/y;

    invoke-virtual {v2, p1, p2, v1}, La0/y;->g(JLjava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static {v1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_6
    :goto_0
    iget-object v1, p0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v1, Landroidx/viewpager2/adapter/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_7

    :try_start_0
    iget-object v1, p0, Landroidx/viewpager2/adapter/i;->mFragmentManager:Landroidx/fragment/app/o1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Landroidx/fragment/app/a;

    invoke-direct {v3, v1}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    invoke-virtual {v3, v0}, Landroidx/fragment/app/a;->n(Landroidx/fragment/app/m0;)Landroidx/fragment/app/a;

    invoke-virtual {v3}, Landroidx/fragment/app/a;->l()V

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v0, p1, p2}, La0/y;->h(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Landroidx/viewpager2/adapter/c;->a(Ljava/util/List;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Landroidx/viewpager2/adapter/c;->a(Ljava/util/List;)V

    throw p1

    :cond_7
    invoke-static {v1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method

.method public containsItem(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v0

    int-to-long v0, v0

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract createFragment(I)Landroidx/fragment/app/m0;
.end method

.method public gcFragments()V
    .locals 6

    iget-boolean v0, p0, Landroidx/viewpager2/adapter/i;->mHasStaleFragments:Z

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Landroidx/viewpager2/adapter/i;->shouldDelayFragmentTransactions()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    new-instance v0, La0/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/h;-><init>(I)V

    move v2, v1

    :goto_0
    iget-object v3, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v3}, La0/y;->i()I

    move-result v3

    if-ge v2, v3, :cond_2

    iget-object v3, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v3, v2}, La0/y;->f(I)J

    move-result-wide v3

    invoke-virtual {p0, v3, v4}, Landroidx/viewpager2/adapter/i;->containsItem(J)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0, v5}, La0/h;->add(Ljava/lang/Object;)Z

    iget-object v5, p0, Landroidx/viewpager2/adapter/i;->mItemIdToViewHolder:La0/y;

    invoke-virtual {v5, v3, v4}, La0/y;->h(J)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-boolean v2, p0, Landroidx/viewpager2/adapter/i;->mIsInGracePeriod:Z

    if-nez v2, :cond_7

    iput-boolean v1, p0, Landroidx/viewpager2/adapter/i;->mHasStaleFragments:Z

    :goto_1
    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v2}, La0/y;->i()I

    move-result v2

    if-ge v1, v2, :cond_7

    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v2, v1}, La0/y;->f(I)J

    move-result-wide v2

    iget-object v4, p0, Landroidx/viewpager2/adapter/i;->mItemIdToViewHolder:La0/y;

    invoke-virtual {v4, v2, v3}, La0/y;->b(J)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    iget-object v4, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v4, v2, v3}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/m0;

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Landroidx/fragment/app/m0;->getView()Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, La0/h;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_7
    new-instance v1, La0/b;

    invoke-direct {v1, v0}, La0/b;-><init>(La0/h;)V

    :goto_4
    invoke-virtual {v1}, La0/m;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v1}, La0/m;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Landroidx/viewpager2/adapter/i;->b(J)V

    goto :goto_4

    :cond_8
    :goto_5
    return-void
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragmentMaxLifecycleEnforcer:Landroidx/viewpager2/adapter/g;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/viewpager2/adapter/g;

    invoke-direct {v0, p0}, Landroidx/viewpager2/adapter/g;-><init>(Landroidx/viewpager2/adapter/i;)V

    iput-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragmentMaxLifecycleEnforcer:Landroidx/viewpager2/adapter/g;

    invoke-static {p1}, Landroidx/viewpager2/adapter/g;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object p1

    iput-object p1, v0, Landroidx/viewpager2/adapter/g;->d:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v1, Landroidx/viewpager2/adapter/d;

    invoke-direct {v1, v0}, Landroidx/viewpager2/adapter/d;-><init>(Landroidx/viewpager2/adapter/g;)V

    iput-object v1, v0, Landroidx/viewpager2/adapter/g;->a:Landroidx/viewpager2/adapter/d;

    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->b(Lhc/h;)V

    new-instance p1, Landroidx/viewpager2/adapter/e;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Landroidx/viewpager2/adapter/e;-><init>(Ljava/lang/Object;I)V

    iput-object p1, v0, Landroidx/viewpager2/adapter/g;->b:Landroidx/viewpager2/adapter/e;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/i1;->registerAdapterDataObserver(Landroidx/recyclerview/widget/k1;)V

    new-instance p1, Landroidx/viewpager2/adapter/f;

    invoke-direct {p1, v0}, Landroidx/viewpager2/adapter/f;-><init>(Landroidx/viewpager2/adapter/g;)V

    iput-object p1, v0, Landroidx/viewpager2/adapter/g;->c:Landroidx/viewpager2/adapter/f;

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mLifecycle:Landroidx/lifecycle/x;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/viewpager2/adapter/j;

    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/adapter/i;->onBindViewHolder(Landroidx/viewpager2/adapter/j;I)V

    return-void
.end method

.method public final onBindViewHolder(Landroidx/viewpager2/adapter/j;I)V
    .locals 7

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o2;->getItemId()J

    move-result-wide v0

    .line 3
    iget-object v2, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    check-cast v2, Landroid/widget/FrameLayout;

    .line 4
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    .line 5
    invoke-virtual {p0, v2}, Landroidx/viewpager2/adapter/i;->a(I)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v4, v4, v0

    if-eqz v4, :cond_0

    .line 7
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {p0, v4, v5}, Landroidx/viewpager2/adapter/i;->b(J)V

    .line 8
    iget-object v4, p0, Landroidx/viewpager2/adapter/i;->mItemIdToViewHolder:La0/y;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, La0/y;->h(J)V

    .line 9
    :cond_0
    iget-object v3, p0, Landroidx/viewpager2/adapter/i;->mItemIdToViewHolder:La0/y;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v0, v1, v2}, La0/y;->g(JLjava/lang/Object;)V

    .line 10
    invoke-virtual {p0, p2}, Landroidx/viewpager2/adapter/i;->getItemId(I)J

    move-result-wide v0

    .line 11
    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v2, v0, v1}, La0/y;->b(J)Z

    move-result v2

    if-nez v2, :cond_1

    .line 12
    invoke-virtual {p0, p2}, Landroidx/viewpager2/adapter/i;->createFragment(I)Landroidx/fragment/app/m0;

    move-result-object p2

    .line 13
    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mSavedStates:La0/y;

    invoke-virtual {v2, v0, v1}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/l0;

    invoke-virtual {p2, v2}, Landroidx/fragment/app/m0;->setInitialSavedState(Landroidx/fragment/app/l0;)V

    .line 14
    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v2, v0, v1, p2}, La0/y;->g(JLjava/lang/Object;)V

    .line 15
    :cond_1
    iget-object p2, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    check-cast p2, Landroid/widget/FrameLayout;

    .line 16
    invoke-virtual {p2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 17
    invoke-virtual {p0, p1}, Landroidx/viewpager2/adapter/i;->placeFragmentInViewHolder(Landroidx/viewpager2/adapter/j;)V

    .line 18
    :cond_2
    invoke-virtual {p0}, Landroidx/viewpager2/adapter/i;->gcFragments()V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/adapter/i;->onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/viewpager2/adapter/j;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/viewpager2/adapter/j;
    .locals 1

    .line 2
    sget p2, Landroidx/viewpager2/adapter/j;->a:I

    .line 3
    new-instance p2, Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 4
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p1, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setId(I)V

    const/4 p1, 0x0

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 7
    new-instance p1, Landroidx/viewpager2/adapter/j;

    .line 8
    invoke-direct {p1, p2}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    return-object p1
.end method

.method public onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragmentMaxLifecycleEnforcer:Landroidx/viewpager2/adapter/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/viewpager2/adapter/g;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object p1

    iget-object v1, v0, Landroidx/viewpager2/adapter/g;->a:Landroidx/viewpager2/adapter/d;

    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->y:Landroidx/viewpager2/adapter/d;

    iget-object p1, p1, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, v0, Landroidx/viewpager2/adapter/g;->f:Landroidx/viewpager2/adapter/i;

    iget-object v1, v0, Landroidx/viewpager2/adapter/g;->b:Landroidx/viewpager2/adapter/e;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/i1;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/k1;)V

    iget-object p1, p1, Landroidx/viewpager2/adapter/i;->mLifecycle:Landroidx/lifecycle/x;

    iget-object v1, v0, Landroidx/viewpager2/adapter/g;->c:Landroidx/viewpager2/adapter/f;

    invoke-virtual {p1, v1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    const/4 p1, 0x0

    iput-object p1, v0, Landroidx/viewpager2/adapter/g;->d:Landroidx/viewpager2/widget/ViewPager2;

    iput-object p1, p0, Landroidx/viewpager2/adapter/i;->mFragmentMaxLifecycleEnforcer:Landroidx/viewpager2/adapter/g;

    return-void
.end method

.method public bridge synthetic onFailedToRecycleView(Landroidx/recyclerview/widget/o2;)Z
    .locals 0

    .line 2
    check-cast p1, Landroidx/viewpager2/adapter/j;

    invoke-virtual {p0, p1}, Landroidx/viewpager2/adapter/i;->onFailedToRecycleView(Landroidx/viewpager2/adapter/j;)Z

    move-result p1

    return p1
.end method

.method public final onFailedToRecycleView(Landroidx/viewpager2/adapter/j;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic onViewAttachedToWindow(Landroidx/recyclerview/widget/o2;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/viewpager2/adapter/j;

    invoke-virtual {p0, p1}, Landroidx/viewpager2/adapter/i;->onViewAttachedToWindow(Landroidx/viewpager2/adapter/j;)V

    return-void
.end method

.method public final onViewAttachedToWindow(Landroidx/viewpager2/adapter/j;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/viewpager2/adapter/i;->placeFragmentInViewHolder(Landroidx/viewpager2/adapter/j;)V

    .line 3
    invoke-virtual {p0}, Landroidx/viewpager2/adapter/i;->gcFragments()V

    return-void
.end method

.method public bridge synthetic onViewRecycled(Landroidx/recyclerview/widget/o2;)V
    .locals 0

    .line 7
    check-cast p1, Landroidx/viewpager2/adapter/j;

    invoke-virtual {p0, p1}, Landroidx/viewpager2/adapter/i;->onViewRecycled(Landroidx/viewpager2/adapter/j;)V

    return-void
.end method

.method public final onViewRecycled(Landroidx/viewpager2/adapter/j;)V
    .locals 3

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    .line 2
    check-cast p1, Landroid/widget/FrameLayout;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    .line 4
    invoke-virtual {p0, p1}, Landroidx/viewpager2/adapter/i;->a(I)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/viewpager2/adapter/i;->b(J)V

    .line 6
    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mItemIdToViewHolder:La0/y;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, La0/y;->h(J)V

    :cond_0
    return-void
.end method

.method public placeFragmentInViewHolder(Landroidx/viewpager2/adapter/j;)V
    .locals 8

    const-string v0, "f"

    iget-object v1, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o2;->getItemId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/m0;

    const-string v2, "Design assumption violated."

    if-eqz v1, :cond_9

    iget-object v3, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    check-cast v3, Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getView()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v5

    if-nez v5, :cond_1

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {v1}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-nez v4, :cond_2

    iget-object p1, p0, Landroidx/viewpager2/adapter/i;->mFragmentManager:Landroidx/fragment/app/o1;

    new-instance v0, Landroidx/viewpager2/adapter/a;

    invoke-direct {v0, p0, v1, v3}, Landroidx/viewpager2/adapter/a;-><init>(Landroidx/viewpager2/adapter/i;Landroidx/fragment/app/m0;Landroid/widget/FrameLayout;)V

    invoke-virtual {p1, v0, v5}, Landroidx/fragment/app/o1;->X(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V

    return-void

    :cond_2
    invoke-virtual {v1}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eq p1, v3, :cond_7

    invoke-virtual {p0, v4, v3}, Landroidx/viewpager2/adapter/i;->addViewToContainer(Landroid/view/View;Landroid/widget/FrameLayout;)V

    return-void

    :cond_3
    invoke-virtual {v1}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v4, v3}, Landroidx/viewpager2/adapter/i;->addViewToContainer(Landroid/view/View;Landroid/widget/FrameLayout;)V

    return-void

    :cond_4
    invoke-virtual {p0}, Landroidx/viewpager2/adapter/i;->shouldDelayFragmentTransactions()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mFragmentManager:Landroidx/fragment/app/o1;

    new-instance v4, Landroidx/viewpager2/adapter/a;

    invoke-direct {v4, p0, v1, v3}, Landroidx/viewpager2/adapter/a;-><init>(Landroidx/viewpager2/adapter/i;Landroidx/fragment/app/m0;Landroid/widget/FrameLayout;)V

    invoke-virtual {v2, v4, v5}, Landroidx/fragment/app/o1;->X(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V

    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v2, Landroidx/viewpager2/adapter/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_5

    :try_start_0
    invoke-virtual {v1, v5}, Landroidx/fragment/app/m0;->setMenuVisibility(Z)V

    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mFragmentManager:Landroidx/fragment/app/o1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Landroidx/fragment/app/a;

    invoke-direct {v4, v2}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o2;->getItemId()J

    move-result-wide v6

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {v4, v5, v1, p1, v0}, Landroidx/fragment/app/a;->d(ILandroidx/fragment/app/m0;Ljava/lang/String;I)V

    sget-object p1, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {v4, v1, p1}, Landroidx/fragment/app/a;->g(Landroidx/fragment/app/m0;Landroidx/lifecycle/w;)Landroidx/fragment/app/a;

    invoke-virtual {v4}, Landroidx/fragment/app/a;->l()V

    iget-object p1, p0, Landroidx/viewpager2/adapter/i;->mFragmentMaxLifecycleEnforcer:Landroidx/viewpager2/adapter/g;

    invoke-virtual {p1, v5}, Landroidx/viewpager2/adapter/g;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Landroidx/viewpager2/adapter/c;->a(Ljava/util/List;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Landroidx/viewpager2/adapter/c;->a(Ljava/util/List;)V

    throw p1

    :cond_5
    invoke-static {v2}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_6
    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragmentManager:Landroidx/fragment/app/o1;

    iget-boolean v0, v0, Landroidx/fragment/app/o1;->L:Z

    if-eqz v0, :cond_8

    :cond_7
    return-void

    :cond_8
    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mLifecycle:Landroidx/lifecycle/x;

    new-instance v1, Landroidx/lifecycle/c1;

    invoke-direct {v1, p0, p1}, Landroidx/lifecycle/c1;-><init>(Landroidx/viewpager2/adapter/i;Landroidx/viewpager2/adapter/j;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public registerFragmentTransactionCallback(Landroidx/viewpager2/adapter/h;)V
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    iget-object v0, v0, Landroidx/viewpager2/adapter/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final restoreState(Landroid/os/Parcelable;)V
    .locals 8

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mSavedStates:La0/y;

    invoke-virtual {v0}, La0/y;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v0}, La0/y;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/os/Bundle;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_0
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "f#"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v3, :cond_4

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    iget-object v4, p0, Landroidx/viewpager2/adapter/i;->mFragmentManager:Landroidx/fragment/app/o1;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    iget-object v7, v4, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/a2;

    invoke-virtual {v7, v5}, Landroidx/fragment/app/a2;->b(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v7

    if-eqz v7, :cond_3

    move-object v6, v7

    :goto_1
    iget-object v1, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v1, v2, v3, v6}, La0/y;->g(JLjava/lang/Object;)V

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment no longer exists for key "

    const-string v2, ": unique id "

    invoke-static {v0, v1, v2, v5}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Landroidx/fragment/app/o1;->l0(Ljava/lang/RuntimeException;)V

    throw v6

    :cond_4
    const-string v2, "s#"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v3, :cond_5

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/l0;

    invoke-virtual {p0, v2, v3}, Landroidx/viewpager2/adapter/i;->containsItem(J)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Landroidx/viewpager2/adapter/i;->mSavedStates:La0/y;

    invoke-virtual {v4, v2, v3, v1}, La0/y;->g(JLjava/lang/Object;)V

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unexpected key in savedState: "

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    iget-object p1, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {p1}, La0/y;->e()Z

    move-result p1

    if-nez p1, :cond_7

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/viewpager2/adapter/i;->mHasStaleFragments:Z

    iput-boolean p1, p0, Landroidx/viewpager2/adapter/i;->mIsInGracePeriod:Z

    invoke-virtual {p0}, Landroidx/viewpager2/adapter/i;->gcFragments()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Landroidx/viewpager2/adapter/b;

    invoke-direct {v0, p0}, Landroidx/viewpager2/adapter/b;-><init>(Landroidx/viewpager2/adapter/i;)V

    iget-object v1, p0, Landroidx/viewpager2/adapter/i;->mLifecycle:Landroidx/lifecycle/x;

    new-instance v2, Landroidx/lifecycle/c1;

    invoke-direct {v2, p1, v0}, Landroidx/lifecycle/c1;-><init>(Landroid/os/Handler;Landroidx/viewpager2/adapter/b;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    const-wide/16 v1, 0x2710

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_7
    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Expected the adapter to be \'fresh\' while restoring state."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final saveState()Landroid/os/Parcelable;
    .locals 7

    new-instance v0, Landroid/os/Bundle;

    iget-object v1, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v1}, La0/y;->i()I

    move-result v1

    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mSavedStates:La0/y;

    invoke-virtual {v2}, La0/y;->i()I

    move-result v2

    add-int/2addr v2, v1

    invoke-direct {v0, v2}, Landroid/os/Bundle;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v3}, La0/y;->i()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v3, v2}, La0/y;->f(I)J

    move-result-wide v3

    iget-object v5, p0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v5, v3, v4}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/m0;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "f#"

    invoke-static {v3, v4, v6}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Landroidx/viewpager2/adapter/i;->mFragmentManager:Landroidx/fragment/app/o1;

    invoke-virtual {v4, v0, v3, v5}, Landroidx/fragment/app/o1;->W(Landroid/os/Bundle;Ljava/lang/String;Landroidx/fragment/app/m0;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mSavedStates:La0/y;

    invoke-virtual {v2}, La0/y;->i()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Landroidx/viewpager2/adapter/i;->mSavedStates:La0/y;

    invoke-virtual {v2, v1}, La0/y;->f(I)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Landroidx/viewpager2/adapter/i;->containsItem(J)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "s#"

    invoke-static {v2, v3, v4}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Landroidx/viewpager2/adapter/i;->mSavedStates:La0/y;

    invoke-virtual {v5, v2, v3}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public final setHasStableIds(Z)V
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public shouldDelayFragmentTransactions()Z
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragmentManager:Landroidx/fragment/app/o1;

    invoke-virtual {v0}, Landroidx/fragment/app/o1;->Q()Z

    move-result v0

    return v0
.end method

.method public unregisterFragmentTransactionCallback(Landroidx/viewpager2/adapter/h;)V
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    iget-object v0, v0, Landroidx/viewpager2/adapter/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
