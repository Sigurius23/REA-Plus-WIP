.class public Leq0/g1;
.super Leq0/f1;
.source "SourceFile"


# static fields
.field private static final O:Landroidx/databinding/u;

.field private static final P:Landroid/util/SparseIntArray;


# instance fields
.field private final M:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private N:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Landroidx/databinding/u;

    const/16 v1, 0x27

    invoke-direct {v0, v1}, Landroidx/databinding/u;-><init>(I)V

    sput-object v0, Leq0/g1;->O:Landroidx/databinding/u;

    const-string v1, "layout_team_pick_image"

    const-string v2, "layout_team_pick_logo"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    filled-new-array {v2, v3}, [I

    move-result-object v2

    sget v3, Lxp0/b0;->f0:I

    sget v4, Lxp0/b0;->g0:I

    filled-new-array {v3, v4}, [I

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v2, v3, v1}, Landroidx/databinding/u;->a(I[I[I[Ljava/lang/String;)V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Leq0/g1;->P:Landroid/util/SparseIntArray;

    sget v1, Lxp0/a0;->Z:I

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->V:I

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->q7:I

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->E4:I

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->d5:I

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->D4:I

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->e5:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->X:I

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->c0:I

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->d0:I

    const/16 v2, 0xc

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->e0:I

    const/16 v2, 0xd

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->W:I

    const/16 v2, 0xe

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->u4:I

    const/16 v2, 0xf

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->s4:I

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->x4:I

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->y4:I

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->z4:I

    const/16 v2, 0x13

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->t4:I

    const/16 v2, 0x14

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->B4:I

    const/16 v2, 0x15

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->C4:I

    const/16 v2, 0x16

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->V1:I

    const/16 v2, 0x17

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->a2:I

    const/16 v2, 0x18

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->b2:I

    const/16 v2, 0x19

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->X1:I

    const/16 v2, 0x1a

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->v4:I

    const/16 v2, 0x1b

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->d2:I

    const/16 v2, 0x1c

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->f2:I

    const/16 v2, 0x1d

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->Y1:I

    const/16 v2, 0x1e

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->f7:I

    const/16 v2, 0x1f

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->W1:I

    const/16 v2, 0x20

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->d7:I

    const/16 v2, 0x21

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->e7:I

    const/16 v2, 0x22

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->X5:I

    const/16 v2, 0x23

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->w7:I

    const/16 v2, 0x24

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->Q1:I

    const/16 v2, 0x25

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lxp0/a0;->v7:I

    const/16 v2, 0x26

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/f;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Leq0/g1;->O:Landroidx/databinding/u;

    sget-object v1, Leq0/g1;->P:Landroid/util/SparseIntArray;

    const/16 v2, 0x27

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/a0;->mapBindings(Landroidx/databinding/f;Landroid/view/View;ILandroidx/databinding/u;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Leq0/g1;-><init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 42

    const/4 v0, 0x4

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Lcom/whoop/ui/WhoopZoomageView;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/whoop/ui/pills/StrokedPillButton;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/constraintlayout/widget/Group;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/constraintlayout/helper/widget/Flow;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Leq0/m2;

    const/16 v0, 0x25

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Lcom/whoop/ui/pills/StrokedPillButton;

    const/16 v0, 0x17

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroidx/constraintlayout/helper/widget/Flow;

    const/16 v0, 0x18

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroid/widget/ImageView;

    const/16 v0, 0x19

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Landroid/widget/TextView;

    const/16 v0, 0x20

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/EditText;

    const/16 v0, 0x1a

    aget-object v0, p3, v0

    move-object/from16 v17, v0

    check-cast v17, Landroidx/constraintlayout/widget/Group;

    const/16 v0, 0x1c

    aget-object v0, p3, v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/widget/ImageView;

    const/16 v0, 0x1e

    aget-object v0, p3, v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/widget/EditText;

    const/16 v0, 0x1d

    aget-object v0, p3, v0

    move-object/from16 v20, v0

    check-cast v20, Landroid/widget/TextView;

    const/16 v0, 0x10

    aget-object v0, p3, v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/whoop/ui/WhoopZoomageView;

    const/16 v0, 0x14

    aget-object v0, p3, v0

    move-object/from16 v22, v0

    check-cast v22, Lcom/whoop/ui/pills/StrokedPillButton;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object/from16 v23, v0

    check-cast v23, Landroidx/constraintlayout/widget/Group;

    const/16 v0, 0x11

    aget-object v0, p3, v0

    move-object/from16 v24, v0

    check-cast v24, Landroidx/constraintlayout/helper/widget/Flow;

    const/16 v0, 0x12

    aget-object v0, p3, v0

    move-object/from16 v25, v0

    check-cast v25, Landroid/widget/ImageView;

    const/16 v0, 0x13

    aget-object v0, p3, v0

    move-object/from16 v26, v0

    check-cast v26, Landroid/widget/TextView;

    const/16 v0, 0x1b

    aget-object v0, p3, v0

    move-object/from16 v27, v0

    check-cast v27, Lde/hdodenhof/circleimageview/CircleImageView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object/from16 v28, v0

    check-cast v28, Leq0/o2;

    const/16 v0, 0x16

    aget-object v0, p3, v0

    move-object/from16 v29, v0

    check-cast v29, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v0, 0x15

    aget-object v0, p3, v0

    move-object/from16 v30, v0

    check-cast v30, Landroidx/core/widget/NestedScrollView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object/from16 v31, v0

    check-cast v31, Lcom/whoop/ui/views/ColoredImageView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object/from16 v32, v0

    check-cast v32, Lcom/whoop/ui/WhoopNewToolbar;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object/from16 v33, v0

    check-cast v33, Landroidx/constraintlayout/widget/Group;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object/from16 v34, v0

    check-cast v34, Landroid/widget/TextView;

    const/16 v0, 0x23

    aget-object v0, p3, v0

    move-object/from16 v35, v0

    check-cast v35, Lcom/whoop/ui/pills/StrokedPillButton;

    const/16 v0, 0x21

    aget-object v0, p3, v0

    move-object/from16 v36, v0

    check-cast v36, Landroid/widget/TextView;

    const/16 v0, 0x22

    aget-object v0, p3, v0

    move-object/from16 v37, v0

    check-cast v37, Landroidx/appcompat/widget/SwitchCompat;

    const/16 v0, 0x1f

    aget-object v0, p3, v0

    move-object/from16 v38, v0

    check-cast v38, Landroid/widget/TextView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object/from16 v39, v0

    check-cast v39, Lcom/whoop/ui/ThrobberView;

    const/16 v0, 0x26

    aget-object v0, p3, v0

    move-object/from16 v40, v0

    check-cast v40, Landroid/widget/TextView;

    const/16 v0, 0x24

    aget-object v0, p3, v0

    move-object/from16 v41, v0

    check-cast v41, Lcom/whoop/ui/pills/StrokedPillButton;

    const/4 v3, 0x2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v41}, Leq0/f1;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/whoop/ui/WhoopZoomageView;Lcom/whoop/ui/pills/StrokedPillButton;Landroidx/constraintlayout/widget/Group;Landroidx/constraintlayout/helper/widget/Flow;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Leq0/m2;Lcom/whoop/ui/pills/StrokedPillButton;Landroidx/constraintlayout/helper/widget/Flow;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/EditText;Landroidx/constraintlayout/widget/Group;Landroid/widget/ImageView;Landroid/widget/EditText;Landroid/widget/TextView;Lcom/whoop/ui/WhoopZoomageView;Lcom/whoop/ui/pills/StrokedPillButton;Landroidx/constraintlayout/widget/Group;Landroidx/constraintlayout/helper/widget/Flow;Landroid/widget/ImageView;Landroid/widget/TextView;Lde/hdodenhof/circleimageview/CircleImageView;Leq0/o2;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/core/widget/NestedScrollView;Lcom/whoop/ui/views/ColoredImageView;Lcom/whoop/ui/WhoopNewToolbar;Landroidx/constraintlayout/widget/Group;Landroid/widget/TextView;Lcom/whoop/ui/pills/StrokedPillButton;Landroid/widget/TextView;Landroidx/appcompat/widget/SwitchCompat;Landroid/widget/TextView;Lcom/whoop/ui/ThrobberView;Landroid/widget/TextView;Lcom/whoop/ui/pills/StrokedPillButton;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Leq0/g1;->N:J

    .line 4
    iget-object v1, v0, Leq0/f1;->h:Leq0/m2;

    invoke-virtual {v0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    .line 5
    iget-object v1, v0, Leq0/f1;->y:Leq0/o2;

    invoke-virtual {v0, v1}, Landroidx/databinding/a0;->setContainedBinding(Landroidx/databinding/a0;)V

    const/4 v1, 0x0

    .line 6
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, v0, Leq0/g1;->M:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v2, 0x0

    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 8
    invoke-virtual {v0, v2}, Landroidx/databinding/a0;->setRootTag(Landroid/view/View;)V

    .line 9
    invoke-virtual {v0}, Leq0/g1;->invalidateAll()V

    return-void
.end method

.method private e(Leq0/m2;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/g1;->N:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/g1;->N:J

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

.method private f(Leq0/o2;I)Z
    .locals 2

    sget p1, Lxp0/a;->a:I

    if-ne p2, p1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-wide p1, p0, Leq0/g1;->N:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Leq0/g1;->N:J

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
    iget-wide v0, p0, Leq0/g1;->N:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Leq0/g1;->N:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v4, 0x4

    and-long/2addr v0, v4

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Leq0/f1;->h:Leq0/m2;

    invoke-virtual {p0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lxp0/d0;->T1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Leq0/m2;->c(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Leq0/f1;->h:Leq0/m2;

    invoke-static {v0}, Landroidx/databinding/a0;->executeBindingsOn(Landroidx/databinding/a0;)V

    iget-object v0, p0, Leq0/f1;->y:Leq0/o2;

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
    iget-wide v0, p0, Leq0/g1;->N:J

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

    iget-object v0, p0, Leq0/f1;->h:Leq0/m2;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Leq0/f1;->y:Leq0/o2;

    invoke-virtual {v0}, Landroidx/databinding/a0;->hasPendingBindings()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
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

    const-wide/16 v0, 0x4

    :try_start_0
    iput-wide v0, p0, Leq0/g1;->N:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Leq0/f1;->h:Leq0/m2;

    invoke-virtual {v0}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object v0, p0, Leq0/f1;->y:Leq0/o2;

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

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p2, Leq0/o2;

    invoke-direct {p0, p2, p3}, Leq0/g1;->f(Leq0/o2;I)Z

    move-result p1

    return p1

    :cond_1
    check-cast p2, Leq0/m2;

    invoke-direct {p0, p2, p3}, Leq0/g1;->e(Leq0/m2;I)Z

    move-result p1

    return p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/g0;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/f1;->h:Leq0/m2;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    iget-object v0, p0, Leq0/f1;->y:Leq0/o2;

    invoke-virtual {v0, p1}, Landroidx/databinding/a0;->setLifecycleOwner(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
