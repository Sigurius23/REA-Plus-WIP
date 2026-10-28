.class public final Lc33/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(II)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lp1/h1;

    invoke-direct {v0, p1}, Lp1/h1;-><init>(I)V

    .line 7
    iput-object v0, p0, Lc33/c;->c:Ljava/lang/Object;

    .line 8
    new-instance v0, Lp1/h1;

    invoke-direct {v0, p2}, Lp1/h1;-><init>(I)V

    .line 9
    iput-object v0, p0, Lc33/c;->b:Ljava/lang/Object;

    .line 10
    new-instance p2, Lp0/f0;

    const/16 v0, 0x5a

    const/16 v1, 0xc8

    invoke-direct {p2, p1, v0, v1}, Lp0/f0;-><init>(III)V

    iput-object p2, p0, Lc33/c;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Lc4/q;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc33/c;->c:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lc33/c;->b:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lc33/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lc93/a;Z)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lc33/c;->a:Z

    iput-object p1, p0, Lc33/c;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 21
    invoke-static {p1}, Ld0/f;->a(F)Ld0/e;

    move-result-object p1

    iput-object p1, p0, Lc33/c;->d:Ljava/lang/Object;

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lc33/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lor/m;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lc33/c;->c:Ljava/lang/Object;

    .line 13
    iput-object p2, p0, Lc33/c;->b:Ljava/lang/Object;

    .line 14
    iput-object p3, p0, Lc33/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lud3/g;Lb9/b;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc33/c;->e:Ljava/lang/Object;

    .line 16
    iput-object p2, p0, Lc33/c;->c:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p2, v0}, Lb9/b;->s(I)Lne3/n0;

    move-result-object p2

    iput-object p2, p0, Lc33/c;->b:Ljava/lang/Object;

    .line 18
    new-instance v0, Lud3/f;

    invoke-direct {v0, p1, p0, p2}, Lud3/f;-><init>(Lud3/g;Lc33/c;Lne3/n0;)V

    .line 19
    iput-object v0, p0, Lc33/c;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lc33/c;->e:Ljava/lang/Object;

    check-cast v0, Lud3/g;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lc33/c;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    iput-boolean v1, p0, Lc33/c;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lc33/c;->b:Ljava/lang/Object;

    check-cast v0, Lne3/n0;

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :try_start_2
    iget-object v0, p0, Lc33/c;->c:Ljava/lang/Object;

    check-cast v0, Lb9/b;

    invoke-virtual {v0}, Lb9/b;->a()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public b()V
    .locals 7

    iget-object v0, p0, Lc33/c;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/google/android/material/tabs/TabLayout;

    iget-object v0, p0, Lc33/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    iget-boolean v2, p0, Lc33/c;->a:Z

    if-nez v2, :cond_2

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v2

    iput-object v2, p0, Lc33/c;->e:Ljava/lang/Object;

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    iput-boolean v2, p0, Lc33/c;->a:Z

    new-instance v2, Lor/n;

    invoke-direct {v2, v1}, Lor/n;-><init>(Lcom/google/android/material/tabs/TabLayout;)V

    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->b(Lhc/h;)V

    new-instance v2, Lor/l;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lor/l;-><init>(Landroid/view/ViewGroup;I)V

    iget-object v3, v1, Lcom/google/android/material/tabs/TabLayout;->o0:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v2, Landroidx/viewpager2/adapter/e;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Landroidx/viewpager2/adapter/e;-><init>(Ljava/lang/Object;I)V

    iget-object v3, p0, Lc33/c;->e:Ljava/lang/Object;

    check-cast v3, Landroidx/recyclerview/widget/i1;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/i1;->registerAdapterDataObserver(Landroidx/recyclerview/widget/k1;)V

    invoke-virtual {p0}, Lc33/c;->f()V

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v2

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/material/tabs/TabLayout;->m(IFZZZ)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "TabLayoutMediator attached before ViewPager2 has an adapter"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "TabLayoutMediator is already attached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Lud3/f;
    .locals 1

    iget-object v0, p0, Lc33/c;->d:Ljava/lang/Object;

    check-cast v0, Lud3/f;

    return-object v0
.end method

.method public d(La3/p0;FJ)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget-object v0, v2, La3/p0;->w:Lk2/b;

    iget-object v3, v1, Lc33/c;->d:Ljava/lang/Object;

    check-cast v3, Ld0/e;

    invoke-virtual {v3}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v4, v3, v4

    if-lez v4, :cond_1

    move-wide/from16 v4, p3

    invoke-static {v3, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v3

    iget-boolean v5, v1, Lc33/c;->a:Z

    if-eqz v5, :cond_0

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v5

    invoke-static {v5, v6}, Lh2/e;->e(J)F

    move-result v10

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v5

    invoke-static {v5, v6}, Lh2/e;->c(J)F

    move-result v11

    iget-object v13, v0, Lk2/b;->x:La3/p;

    invoke-virtual {v13}, La3/p;->A()J

    move-result-wide v14

    invoke-virtual {v13}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->q()V

    :try_start_0
    iget-object v0, v13, La3/p;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Laj/d;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x1

    invoke-virtual/range {v7 .. v12}, Laj/d;->d(FFFFI)V

    const/4 v9, 0x0

    const/16 v10, 0x7c

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move/from16 v5, p2

    invoke-static/range {v2 .. v10}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v13, v14, v15}, Ld;->z(La3/p;J)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v13, v14, v15}, Ld;->z(La3/p;J)V

    throw v0

    :cond_0
    const/4 v9, 0x0

    const/16 v10, 0x7c

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v2, p1

    move/from16 v5, p2

    invoke-static/range {v2 .. v10}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    :cond_1
    return-void
.end method

.method public e(Lj0/h;Lbc3/c0;)V
    .locals 7

    iget-object v0, p0, Lc33/c;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    instance-of v1, p1, Lj0/f;

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lj0/g;

    if-eqz v1, :cond_1

    check-cast p1, Lj0/g;

    iget-object p1, p1, Lj0/g;->a:Lj0/f;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lj0/d;

    if-eqz v1, :cond_2

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of v1, p1, Lj0/e;

    if-eqz v1, :cond_3

    check-cast p1, Lj0/e;

    iget-object p1, p1, Lj0/e;->a:Lj0/d;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    instance-of v1, p1, Lj0/b;

    if-eqz v1, :cond_4

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    instance-of v1, p1, Lj0/c;

    if-eqz v1, :cond_5

    check-cast p1, Lj0/c;

    iget-object p1, p1, Lj0/c;->a:Lj0/b;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    instance-of v1, p1, Lj0/a;

    if-eqz v1, :cond_10

    check-cast p1, Lj0/a;

    iget-object p1, p1, Lj0/a;->a:Lj0/b;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_0
    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj0/h;

    iget-object v0, p0, Lc33/c;->e:Ljava/lang/Object;

    check-cast v0, Lj0/h;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz p1, :cond_c

    iget-object v3, p0, Lc33/c;->c:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk1/b;

    instance-of v4, p1, Lj0/f;

    if-eqz v4, :cond_6

    iget v3, v3, Lk1/b;->c:F

    goto :goto_1

    :cond_6
    instance-of v5, p1, Lj0/d;

    if-eqz v5, :cond_7

    iget v3, v3, Lk1/b;->b:F

    goto :goto_1

    :cond_7
    instance-of v5, p1, Lj0/b;

    if-eqz v5, :cond_8

    iget v3, v3, Lk1/b;->a:F

    goto :goto_1

    :cond_8
    const/4 v3, 0x0

    :goto_1
    sget-object v5, Lk1/f;->a:Ld0/e2;

    if-eqz v4, :cond_9

    goto :goto_2

    :cond_9
    instance-of v4, p1, Lj0/d;

    const/16 v6, 0x2d

    if-eqz v4, :cond_a

    new-instance v5, Ld0/e2;

    sget-object v4, Ld0/b0;->c:Lb23/h;

    invoke-direct {v5, v6, v4, v1}, Ld0/e2;-><init>(ILd0/z;I)V

    goto :goto_2

    :cond_a
    instance-of v4, p1, Lj0/b;

    if-eqz v4, :cond_b

    new-instance v5, Ld0/e2;

    sget-object v4, Ld0/b0;->c:Lb23/h;

    invoke-direct {v5, v6, v4, v1}, Ld0/e2;-><init>(ILd0/z;I)V

    :cond_b
    :goto_2
    new-instance v1, Ld0/x1;

    invoke-direct {v1, p0, v3, v5, v2}, Ld0/x1;-><init>(Lc33/c;FLd0/l;Lq83/d;)V

    invoke-static {p2, v2, v2, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_4

    :cond_c
    iget-object v3, p0, Lc33/c;->e:Ljava/lang/Object;

    check-cast v3, Lj0/h;

    sget-object v4, Lk1/f;->a:Ld0/e2;

    instance-of v5, v3, Lj0/f;

    if-eqz v5, :cond_d

    goto :goto_3

    :cond_d
    instance-of v5, v3, Lj0/d;

    if-eqz v5, :cond_e

    goto :goto_3

    :cond_e
    instance-of v3, v3, Lj0/b;

    if-eqz v3, :cond_f

    new-instance v4, Ld0/e2;

    const/16 v3, 0x96

    sget-object v5, Ld0/b0;->c:Lb23/h;

    invoke-direct {v4, v3, v5, v1}, Ld0/e2;-><init>(ILd0/z;I)V

    :cond_f
    :goto_3
    new-instance v1, Lh20/i0;

    const/16 v3, 0xf

    invoke-direct {v1, p0, v4, v2, v3}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p2, v2, v2, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_4
    iput-object p1, p0, Lc33/c;->e:Ljava/lang/Object;

    :cond_10
    return-void
.end method

.method public f()V
    .locals 6

    iget-object v0, p0, Lc33/c;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->j()V

    iget-object v1, p0, Lc33/c;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/recyclerview/widget/i1;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->h()Lor/h;

    move-result-object v4

    iget-object v5, p0, Lc33/c;->d:Ljava/lang/Object;

    check-cast v5, Lor/m;

    invoke-interface {v5, v4, v3}, Lor/m;->f(Lor/h;I)V

    invoke-virtual {v0, v4, v2}, Lcom/google/android/material/tabs/TabLayout;->a(Lor/h;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-lez v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    iget-object v3, p0, Lc33/c;->b:Ljava/lang/Object;

    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v3}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v3

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result v3

    if-eq v1, v3, :cond_1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->g(I)Lor/h;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/tabs/TabLayout;->k(Lor/h;Z)V

    :cond_1
    return-void
.end method

.method public g(II)V
    .locals 2

    int-to-float v0, p1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Index should be non-negative"

    invoke-static {v0}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lc33/c;->c:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0, p1}, Lp1/h1;->y(I)V

    iget-object v0, p0, Lc33/c;->e:Ljava/lang/Object;

    check-cast v0, Lp0/f0;

    invoke-virtual {v0, p1}, Lp0/f0;->a(I)V

    iget-object p1, p0, Lc33/c;->b:Ljava/lang/Object;

    check-cast p1, Lp1/h1;

    invoke-virtual {p1, p2}, Lp1/h1;->y(I)V

    return-void
.end method
