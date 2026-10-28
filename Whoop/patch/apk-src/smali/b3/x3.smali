.class public abstract Lb3/x3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    sput-object v0, Lb3/x3;->a:Landroid/view/ViewGroup$LayoutParams;

    return-void
.end method

.method public static final a(Lb3/a;Lp1/t;Lx1/b;)Lb3/w3;
    .locals 6

    sget-object v0, Lb3/e2;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    invoke-static {v2, v0, v3}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v0

    sget-object v2, Lb3/b1;->K:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq83/j;

    invoke-static {v2}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v2

    new-instance v4, La6/v;

    const/4 v5, 0x3

    invoke-direct {v4, v0, v3, v5}, La6/v;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v3, v3, v4, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v2, La3/m1;

    const/4 v4, 0x5

    invoke-direct {v2, v0, v4}, La3/m1;-><init>(Ljava/lang/Object;I)V

    sget-object v0, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v4, Lz1/l;->i:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    invoke-static {v2, v4}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    sput-object v2, Lz1/l;->i:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-static {}, Lz1/l;->a()V

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;

    if-eqz v1, :cond_1

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    goto :goto_2

    :cond_1
    :goto_1
    move-object v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    goto :goto_1

    :goto_2
    if-nez v0, :cond_3

    new-instance v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lp1/t;->j()Lq83/j;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/platform/AndroidComposeView;-><init>(Landroid/content/Context;Lq83/j;)V

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    move-result-object v1

    sget-object v2, Lb3/x3;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v1, v2}, Lb3/a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    move-result-object p0

    const v1, 0x7f0a0dcb

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v2, p0, Lb3/w3;

    if-eqz v2, :cond_4

    move-object v3, p0

    check-cast v3, Lb3/w3;

    :cond_4
    if-nez v3, :cond_5

    new-instance v3, Lb3/w3;

    new-instance p0, La3/q2;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v2

    invoke-direct {p0, v2}, Lhb3/a0;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lp1/w;

    invoke-direct {v2, p1, p0}, Lp1/w;-><init>(Lp1/t;Lhb3/a0;)V

    invoke-direct {v3, v0, v2}, Lb3/w3;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Lp1/w;)V

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, v1, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_5
    invoke-virtual {v3, p2}, Lb3/w3;->a(Lc93/m;)V

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getCoroutineContext()Lq83/j;

    move-result-object p0

    invoke-virtual {p1}, Lp1/t;->j()Lq83/j;

    move-result-object p2

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    invoke-virtual {p1}, Lp1/t;->j()Lq83/j;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/AndroidComposeView;->setCoroutineContext(Lq83/j;)V

    :cond_6
    return-object v3
.end method
