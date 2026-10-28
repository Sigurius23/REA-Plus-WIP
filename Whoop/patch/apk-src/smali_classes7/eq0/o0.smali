.class public Leq0/o0;
.super Leq0/n0;
.source "SourceFile"


# static fields
.field private static final n:Landroidx/databinding/u;

.field private static final o:Landroid/util/SparseIntArray;


# instance fields
.field private final k:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field private final l:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private m:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Landroidx/databinding/u;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Landroidx/databinding/u;-><init>(I)V

    sput-object v0, Leq0/o0;->n:Landroidx/databinding/u;

    const-string v1, "message_actions"

    const-string v2, "chat_report_settings"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    const/4 v3, 0x6

    filled-new-array {v2, v3}, [I

    move-result-object v2

    sget v3, Lxp0/b0;->o0:I

    sget v4, Lxp0/b0;->n:I

    filled-new-array {v3, v4}, [I

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v2, v3, v1}, Landroidx/databinding/u;->a(I[I[I[Ljava/lang/String;)V

    const-string v1, "compose_message_menu"

    const-string v2, "chat_try_again"

    const-string v3, "compose_messages"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    const/4 v3, 0x4

    const/4 v4, 0x2

    filled-new-array {v4, v2, v3}, [I

    move-result-object v2

    sget v3, Lxp0/b0;->w:I

    sget v4, Lxp0/b0;->v:I

    sget v5, Lxp0/b0;->p:I

    filled-new-array {v3, v4, v5}, [I

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v0, v4, v2, v3, v1}, Landroidx/databinding/u;->a(I[I[I[Ljava/lang/String;)V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Leq0/o0;->o:Landroid/util/SparseIntArray;

    sget v1, Lxp0/a0;->O4:I

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->B7:I

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->C7:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->w0:I

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->x7:I

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/f;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Leq0/o0;->n:Landroidx/databinding/u;

    sget-object v1, Leq0/o0;->o:Landroid/util/SparseIntArray;

    const/16 v2, 0xc

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/a0;->mapBindings(Landroidx/databinding/f;Landroid/view/View;ILandroidx/databinding/u;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Leq0/o0;-><init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 14

    const/16 v0, 0xa

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Lcom/whoop/ui/ThrobberView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Leq0/y2;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Leq0/t;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Leq0/f0;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Leq0/d0;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/view/View;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Leq0/x;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/ImageView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    const/4 v3, 0x5

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v13}, Leq0/n0;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/whoop/ui/ThrobberView;Leq0/y2;Leq0/t;Leq0/f0;Leq0/d0;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Landroid/view/View;Leq0/x;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Leq0/o0;->m:J

    .line 4
    iget-object v1, p0, Leq0/n0;->b:Leq0/y2;

    invoke-virtual {p0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    .line 5
    iget-object v1, p0, Leq0/n0;->c:Leq0/t;

    invoke-virtual {p0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    .line 6
    iget-object v1, p0, Leq0/n0;->d:Leq0/f0;

    invoke-virtual {p0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    .line 7
    iget-object v1, p0, Leq0/n0;->e:Leq0/d0;

    invoke-virtual {p0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    const/4 v1, 0x0

    .line 8
    aget-object v1, p3, v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object v1, p0, Leq0/o0;->k:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 10
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, p0, Leq0/o0;->l:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 11
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 12
    iget-object v1, p0, Leq0/n0;->h:Leq0/x;

    invoke-virtual {p0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    move-object/from16 v2, p2

    .line 13
    invoke-virtual {p0, v2}, Landroidx/databinding/a0;->setRootTag(Landroid/view/View;)V

    .line 14
    invoke-virtual {p0}, Leq0/o0;->invalidateAll()V

    return-void
.end method

.method private e(Leq0/y2;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/o0;->m:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/o0;->m:J

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

.method private f(Leq0/t;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/o0;->m:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/o0;->m:J

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

.method private g(Leq0/f0;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/o0;->m:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/o0;->m:J

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

.method private h(Leq0/d0;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/o0;->m:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/o0;->m:J

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

.method private i(Leq0/x;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/o0;->m:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/o0;->m:J

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
    iput-wide v0, p0, Leq0/o0;->m:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Leq0/n0;->d:Leq0/f0;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    iget-object v0, p0, Leq0/n0;->e:Leq0/d0;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    iget-object v0, p0, Leq0/n0;->h:Leq0/x;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    iget-object v0, p0, Leq0/n0;->b:Leq0/y2;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    iget-object v0, p0, Leq0/n0;->c:Leq0/t;

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
    iget-wide v0, p0, Leq0/o0;->m:J

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

    iget-object v0, p0, Leq0/n0;->d:Leq0/f0;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Leq0/n0;->e:Leq0/d0;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Leq0/n0;->h:Leq0/x;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, Leq0/n0;->b:Leq0/y2;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, Leq0/n0;->c:Leq0/t;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_5

    return v1

    :cond_5
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

    const-wide/16 v0, 0x20

    :try_start_0
    iput-wide v0, p0, Leq0/o0;->m:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Leq0/n0;->d:Leq0/f0;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object v0, p0, Leq0/n0;->e:Leq0/d0;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object v0, p0, Leq0/n0;->h:Leq0/x;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object v0, p0, Leq0/n0;->b:Leq0/y2;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object v0, p0, Leq0/n0;->c:Leq0/t;

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

    if-eqz p1, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p2, Leq0/t;

    invoke-direct {p0, p2, p3}, Leq0/o0;->f(Leq0/t;I)Z

    move-result p1

    return p1

    :cond_1
    check-cast p2, Leq0/x;

    invoke-direct {p0, p2, p3}, Leq0/o0;->i(Leq0/x;I)Z

    move-result p1

    return p1

    :cond_2
    check-cast p2, Leq0/y2;

    invoke-direct {p0, p2, p3}, Leq0/o0;->e(Leq0/y2;I)Z

    move-result p1

    return p1

    :cond_3
    check-cast p2, Leq0/f0;

    invoke-direct {p0, p2, p3}, Leq0/o0;->g(Leq0/f0;I)Z

    move-result p1

    return p1

    :cond_4
    check-cast p2, Leq0/d0;

    invoke-direct {p0, p2, p3}, Leq0/o0;->h(Leq0/d0;I)Z

    move-result p1

    return p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/g0;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/n0;->d:Leq0/f0;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/n0;->e:Leq0/d0;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/n0;->h:Leq0/x;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/n0;->b:Leq0/y2;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/n0;->c:Leq0/t;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
