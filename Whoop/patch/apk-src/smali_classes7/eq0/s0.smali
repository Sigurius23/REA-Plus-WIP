.class public Leq0/s0;
.super Leq0/r0;
.source "SourceFile"


# static fields
.field private static final Q:Landroidx/databinding/u;

.field private static final R:Landroid/util/SparseIntArray;


# instance fields
.field private final O:Landroid/widget/FrameLayout;

.field private P:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Landroidx/databinding/u;

    const/16 v1, 0x29

    invoke-direct {v0, v1}, Landroidx/databinding/u;-><init>(I)V

    sput-object v0, Leq0/s0;->Q:Landroidx/databinding/u;

    const-string v1, "community_landing_rank_settings"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x8

    filled-new-array {v2}, [I

    move-result-object v2

    sget v3, Lxp0/b0;->s:I

    filled-new-array {v3}, [I

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v0, v4, v2, v3, v1}, Landroidx/databinding/u;->a(I[I[I[Ljava/lang/String;)V

    const-string v1, "fragment_community_landing_toolbarv1"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    filled-new-array {v2}, [I

    move-result-object v2

    sget v3, Lxp0/b0;->F:I

    filled-new-array {v3}, [I

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v0, v4, v2, v3, v1}, Landroidx/databinding/u;->a(I[I[I[Ljava/lang/String;)V

    const-string v1, "view_create_team_and_invite_code_button_layoutv1"

    const-string v2, "member_story_layout"

    const-string v3, "view_create_team_and_invite_code_prompt_cardv1"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    const/4 v3, 0x7

    const/4 v4, 0x5

    filled-new-array {v4, v2, v3}, [I

    move-result-object v2

    sget v3, Lxp0/b0;->y0:I

    sget v4, Lxp0/b0;->x0:I

    sget v5, Lxp0/b0;->n0:I

    filled-new-array {v3, v4, v5}, [I

    move-result-object v3

    const/4 v4, 0x3

    invoke-virtual {v0, v4, v2, v3, v1}, Landroidx/databinding/u;->a(I[I[I[Ljava/lang/String;)V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Leq0/s0;->R:Landroid/util/SparseIntArray;

    sget v1, Lxp0/a0;->S0:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->T0:I

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->j5:I

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->i5:I

    const/16 v2, 0xc

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->h5:I

    const/16 v2, 0xd

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->d1:I

    const/16 v2, 0xe

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->Q0:I

    const/16 v2, 0xf

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->v2:I

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->g2:I

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->B5:I

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->R5:I

    const/16 v2, 0x13

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->u2:I

    const/16 v2, 0x14

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->D0:I

    const/16 v2, 0x15

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->t2:I

    const/16 v2, 0x16

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->z2:I

    const/16 v2, 0x17

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->y2:I

    const/16 v2, 0x18

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->x5:I

    const/16 v2, 0x19

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->N:I

    const/16 v2, 0x1a

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->M:I

    const/16 v2, 0x1b

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->z5:I

    const/16 v2, 0x1c

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->y5:I

    const/16 v2, 0x1d

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->Q7:I

    const/16 v2, 0x1e

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->C5:I

    const/16 v2, 0x1f

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->D5:I

    const/16 v2, 0x20

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->J7:I

    const/16 v2, 0x21

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->h7:I

    const/16 v2, 0x22

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->g7:I

    const/16 v2, 0x23

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->f1:I

    const/16 v2, 0x24

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->B1:I

    const/16 v2, 0x25

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->E1:I

    const/16 v2, 0x26

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->s2:I

    const/16 v2, 0x27

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->r2:I

    const/16 v2, 0x28

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/f;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Leq0/s0;->Q:Landroidx/databinding/u;

    sget-object v1, Leq0/s0;->R:Landroid/util/SparseIntArray;

    const/16 v2, 0x29

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/a0;->mapBindings(Landroidx/databinding/f;Landroid/view/View;ILandroidx/databinding/u;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Leq0/s0;-><init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 44

    const/16 v0, 0x1b

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    const/16 v0, 0x1a

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Leq0/o3;

    const/16 v0, 0x15

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroidx/core/widget/NestedScrollView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Leq0/v0;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/RelativeLayout;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Leq0/z;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Lcom/whoop/ui/ThrobberView;

    const/16 v0, 0x24

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/whoop/ui/ThrobberView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object/from16 v17, v0

    check-cast v17, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v0, 0x25

    aget-object v0, p3, v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/widget/LinearLayout;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object/from16 v19, v0

    check-cast v19, Leq0/m3;

    const/16 v0, 0x26

    aget-object v0, p3, v0

    move-object/from16 v20, v0

    check-cast v20, Landroid/widget/TextView;

    const/16 v0, 0x11

    aget-object v0, p3, v0

    move-object/from16 v21, v0

    check-cast v21, Landroidx/compose/ui/platform/ComposeView;

    const/16 v0, 0x28

    aget-object v0, p3, v0

    move-object/from16 v22, v0

    check-cast v22, Landroid/widget/TextView;

    const/16 v0, 0x27

    aget-object v0, p3, v0

    move-object/from16 v23, v0

    check-cast v23, Landroid/widget/LinearLayout;

    const/16 v0, 0x16

    aget-object v0, p3, v0

    move-object/from16 v24, v0

    check-cast v24, Landroid/widget/LinearLayout;

    const/16 v0, 0x14

    aget-object v0, p3, v0

    move-object/from16 v25, v0

    check-cast v25, Landroid/widget/LinearLayout;

    const/16 v0, 0x10

    aget-object v0, p3, v0

    move-object/from16 v26, v0

    check-cast v26, Landroidx/compose/ui/platform/ComposeView;

    const/16 v0, 0x17

    aget-object v0, p3, v0

    move-object/from16 v27, v0

    check-cast v27, Landroidx/core/widget/NestedScrollView;

    const/16 v0, 0x18

    aget-object v0, p3, v0

    move-object/from16 v28, v0

    check-cast v28, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object/from16 v29, v0

    check-cast v29, Leq0/w2;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object/from16 v30, v0

    check-cast v30, Landroid/widget/TextView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object/from16 v31, v0

    check-cast v31, Landroid/widget/TextView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object/from16 v32, v0

    check-cast v32, Landroid/widget/ImageView;

    const/16 v0, 0x19

    aget-object v0, p3, v0

    move-object/from16 v33, v0

    check-cast v33, Landroid/widget/TextView;

    const/16 v0, 0x1c

    aget-object v0, p3, v0

    move-object/from16 v34, v0

    check-cast v34, Landroid/widget/LinearLayout;

    const/16 v0, 0x1d

    aget-object v0, p3, v0

    move-object/from16 v35, v0

    check-cast v35, Landroidx/recyclerview/widget/RecyclerView;

    const/16 v0, 0x12

    aget-object v0, p3, v0

    move-object/from16 v36, v0

    check-cast v36, Landroidx/compose/ui/platform/ComposeView;

    const/16 v0, 0x20

    aget-object v0, p3, v0

    move-object/from16 v37, v0

    check-cast v37, Landroid/widget/TextView;

    const/16 v0, 0x1f

    aget-object v0, p3, v0

    move-object/from16 v38, v0

    check-cast v38, Landroid/widget/LinearLayout;

    const/16 v0, 0x13

    aget-object v0, p3, v0

    move-object/from16 v39, v0

    check-cast v39, Landroid/widget/TextView;

    const/16 v0, 0x22

    aget-object v0, p3, v0

    move-object/from16 v40, v0

    check-cast v40, Landroid/widget/RelativeLayout;

    const/16 v0, 0x23

    aget-object v0, p3, v0

    move-object/from16 v41, v0

    check-cast v41, Landroidx/recyclerview/widget/RecyclerView;

    const/16 v0, 0x21

    aget-object v0, p3, v0

    move-object/from16 v42, v0

    check-cast v42, Landroid/widget/LinearLayout;

    const/16 v0, 0x1e

    aget-object v0, p3, v0

    move-object/from16 v43, v0

    check-cast v43, Landroid/widget/TextView;

    const/4 v3, 0x5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v43}, Leq0/r0;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/TextView;Leq0/o3;Landroid/widget/LinearLayout;Landroidx/core/widget/NestedScrollView;Leq0/v0;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/RelativeLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Leq0/z;Lcom/whoop/ui/ThrobberView;Lcom/whoop/ui/ThrobberView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Leq0/m3;Landroid/widget/TextView;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroidx/compose/ui/platform/ComposeView;Landroidx/core/widget/NestedScrollView;Landroidx/recyclerview/widget/RecyclerView;Leq0/w2;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Leq0/s0;->P:J

    .line 4
    iget-object v1, v0, Leq0/r0;->c:Leq0/o3;

    invoke-virtual {v0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    .line 5
    iget-object v1, v0, Leq0/r0;->f:Leq0/v0;

    invoke-virtual {v0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    .line 6
    iget-object v1, v0, Leq0/r0;->g:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object v1, v0, Leq0/r0;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object v1, v0, Leq0/r0;->k:Leq0/z;

    invoke-virtual {v0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    .line 9
    iget-object v1, v0, Leq0/r0;->n:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object v1, v0, Leq0/r0;->p:Leq0/m3;

    invoke-virtual {v0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    const/4 v1, 0x0

    .line 11
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/FrameLayout;

    iput-object v1, v0, Leq0/s0;->O:Landroid/widget/FrameLayout;

    .line 12
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object v1, v0, Leq0/r0;->z:Leq0/w2;

    invoke-virtual {v0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    move-object/from16 v2, p2

    .line 14
    invoke-virtual {v0, v2}, Landroidx/databinding/a0;->setRootTag(Landroid/view/View;)V

    .line 15
    invoke-virtual {v0}, Leq0/s0;->invalidateAll()V

    return-void
.end method

.method private e(Leq0/o3;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/s0;->P:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/s0;->P:J

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

.method private f(Leq0/v0;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/s0;->P:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/s0;->P:J

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

.method private g(Leq0/z;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/s0;->P:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/s0;->P:J

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

.method private h(Leq0/m3;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/s0;->P:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/s0;->P:J

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

.method private i(Leq0/w2;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/s0;->P:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/s0;->P:J

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
    iput-wide v0, p0, Leq0/s0;->P:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Leq0/r0;->f:Leq0/v0;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    iget-object v0, p0, Leq0/r0;->c:Leq0/o3;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    iget-object v0, p0, Leq0/r0;->p:Leq0/m3;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    iget-object v0, p0, Leq0/r0;->z:Leq0/w2;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    iget-object v0, p0, Leq0/r0;->k:Leq0/z;

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
    iget-wide v0, p0, Leq0/s0;->P:J

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

    iget-object v0, p0, Leq0/r0;->f:Leq0/v0;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Leq0/r0;->c:Leq0/o3;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Leq0/r0;->p:Leq0/m3;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, Leq0/r0;->z:Leq0/w2;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, Leq0/r0;->k:Leq0/z;

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
    iput-wide v0, p0, Leq0/s0;->P:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Leq0/r0;->f:Leq0/v0;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object v0, p0, Leq0/r0;->c:Leq0/o3;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object v0, p0, Leq0/r0;->p:Leq0/m3;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object v0, p0, Leq0/r0;->z:Leq0/w2;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object v0, p0, Leq0/r0;->k:Leq0/z;

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
    check-cast p2, Leq0/m3;

    invoke-direct {p0, p2, p3}, Leq0/s0;->h(Leq0/m3;I)Z

    move-result p1

    return p1

    :cond_1
    check-cast p2, Leq0/o3;

    invoke-direct {p0, p2, p3}, Leq0/s0;->e(Leq0/o3;I)Z

    move-result p1

    return p1

    :cond_2
    check-cast p2, Leq0/v0;

    invoke-direct {p0, p2, p3}, Leq0/s0;->f(Leq0/v0;I)Z

    move-result p1

    return p1

    :cond_3
    check-cast p2, Leq0/w2;

    invoke-direct {p0, p2, p3}, Leq0/s0;->i(Leq0/w2;I)Z

    move-result p1

    return p1

    :cond_4
    check-cast p2, Leq0/z;

    invoke-direct {p0, p2, p3}, Leq0/s0;->g(Leq0/z;I)Z

    move-result p1

    return p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/g0;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/r0;->f:Leq0/v0;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/r0;->c:Leq0/o3;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/r0;->p:Leq0/m3;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/r0;->z:Leq0/w2;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/r0;->k:Leq0/z;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
