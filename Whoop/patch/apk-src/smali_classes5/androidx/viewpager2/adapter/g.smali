.class public final Landroidx/viewpager2/adapter/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroidx/viewpager2/adapter/d;

.field public b:Landroidx/viewpager2/adapter/e;

.field public c:Landroidx/viewpager2/adapter/f;

.field public d:Landroidx/viewpager2/widget/ViewPager2;

.field public e:J

.field public final synthetic f:Landroidx/viewpager2/adapter/i;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/adapter/i;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/viewpager2/adapter/g;->f:Landroidx/viewpager2/adapter/i;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroidx/viewpager2/adapter/g;->e:J

    return-void
.end method

.method public static a(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/viewpager2/widget/ViewPager2;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of v0, p0, Landroidx/viewpager2/widget/ViewPager2;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected ViewPager2 instance. Got: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b(Z)V
    .locals 11

    iget-object v0, p0, Landroidx/viewpager2/adapter/g;->f:Landroidx/viewpager2/adapter/i;

    invoke-virtual {v0}, Landroidx/viewpager2/adapter/i;->shouldDelayFragmentTransactions()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-object v1, p0, Landroidx/viewpager2/adapter/g;->d:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getScrollState()I

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_6

    :cond_1
    iget-object v1, v0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v1}, La0/y;->e()Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_6

    :cond_2
    iget-object v1, p0, Landroidx/viewpager2/adapter/g;->d:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_3

    goto/16 :goto_6

    :cond_3
    invoke-virtual {v0, v1}, Landroidx/viewpager2/adapter/i;->getItemId(I)J

    move-result-wide v1

    iget-wide v3, p0, Landroidx/viewpager2/adapter/g;->e:J

    cmp-long v3, v1, v3

    if-nez v3, :cond_4

    if-nez p1, :cond_4

    goto/16 :goto_6

    :cond_4
    iget-object p1, v0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {p1, v1, v2}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/m0;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_6

    :cond_5
    iput-wide v1, p0, Landroidx/viewpager2/adapter/g;->e:J

    iget-object p1, v0, Landroidx/viewpager2/adapter/i;->mFragmentManager:Landroidx/fragment/app/o1;

    invoke-static {p1, p1}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v2

    :goto_0
    iget-object v5, v0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v5}, La0/y;->i()I

    move-result v5

    if-ge v4, v5, :cond_a

    iget-object v5, v0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v5, v4}, La0/y;->f(I)J

    move-result-wide v5

    iget-object v7, v0, Landroidx/viewpager2/adapter/i;->mFragments:La0/y;

    invoke-virtual {v7, v4}, La0/y;->j(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/m0;

    invoke-virtual {v7}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_3

    :cond_6
    iget-wide v8, p0, Landroidx/viewpager2/adapter/g;->e:J

    cmp-long v8, v5, v8

    if-eqz v8, :cond_8

    sget-object v8, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {p1, v7, v8}, Landroidx/fragment/app/a;->g(Landroidx/fragment/app/m0;Landroidx/lifecycle/w;)Landroidx/fragment/app/a;

    iget-object v8, v0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iget-object v8, v8, Landroidx/viewpager2/adapter/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_7

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    invoke-static {v8}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_8
    move-object v3, v7

    :goto_1
    iget-wide v8, p0, Landroidx/viewpager2/adapter/g;->e:J

    cmp-long v5, v5, v8

    if-nez v5, :cond_9

    const/4 v5, 0x1

    goto :goto_2

    :cond_9
    move v5, v2

    :goto_2
    invoke-virtual {v7, v5}, Landroidx/fragment/app/m0;->setMenuVisibility(Z)V

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_a
    if-eqz v3, :cond_c

    sget-object v2, Landroidx/lifecycle/w;->E:Landroidx/lifecycle/w;

    invoke-virtual {p1, v3, v2}, Landroidx/fragment/app/a;->g(Landroidx/fragment/app/m0;Landroidx/lifecycle/w;)Landroidx/fragment/app/a;

    iget-object v2, v0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v2, Landroidx/viewpager2/adapter/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_b

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_b
    invoke-static {v2}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_c
    :goto_4
    iget-object v2, p1, Landroidx/fragment/app/c2;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_d

    invoke-virtual {p1}, Landroidx/fragment/app/a;->l()V

    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iget-object v2, v0, Landroidx/viewpager2/adapter/i;->mFragmentEventDispatcher:Landroidx/viewpager2/adapter/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Landroidx/viewpager2/adapter/c;->a(Ljava/util/List;)V

    goto :goto_5

    :cond_d
    :goto_6
    return-void
.end method
