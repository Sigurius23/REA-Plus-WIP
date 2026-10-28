.class public Lm52/d;
.super Lm52/c;
.source "SourceFile"


# static fields
.field private static final A:Landroidx/databinding/u;

.field private static final B:Landroid/util/SparseIntArray;


# instance fields
.field private final y:Landroid/widget/LinearLayout;

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lm52/d;->B:Landroid/util/SparseIntArray;

    sget v1, Lk52/d;->i1:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->v0:I

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->j:I

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->M:I

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->z0:I

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->H0:I

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->I0:I

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->E0:I

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->s0:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->t0:I

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->N:I

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->A0:I

    const/16 v2, 0xc

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->B0:I

    const/16 v2, 0xd

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->D0:I

    const/16 v2, 0xe

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->C0:I

    const/16 v2, 0xf

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->d0:I

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->k0:I

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->l0:I

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->g:I

    const/16 v2, 0x13

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->w:I

    const/16 v2, 0x14

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->h:I

    const/16 v2, 0x15

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->h0:I

    const/16 v2, 0x16

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->i:I

    const/16 v2, 0x17

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lk52/d;->y:I

    const/16 v2, 0x18

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/f;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lm52/d;->A:Landroidx/databinding/u;

    sget-object v1, Lm52/d;->B:Landroid/util/SparseIntArray;

    const/16 v2, 0x19

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/a0;->mapBindings(Landroidx/databinding/f;Landroid/view/View;ILandroidx/databinding/u;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lm52/d;-><init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 28

    const/16 v0, 0x13

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    const/16 v0, 0x15

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    const/16 v0, 0x17

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/view/View;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    const/16 v0, 0x14

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/whoop/realtime/presentation/views/RealTimeCell;

    const/16 v0, 0x18

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/whoop/realtime/presentation/views/RealTimeCell;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lcom/whoop/ui/pills/StrokedPillImageButton;

    const/16 v0, 0x10

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Lcom/whoop/realtime/presentation/views/RealTimeCell;

    const/16 v0, 0x16

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Lcom/whoop/realtime/presentation/views/RealTimeCell;

    const/16 v0, 0x11

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;

    const/16 v0, 0x12

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Landroidx/compose/ui/platform/ComposeView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/LinearLayout;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object/from16 v17, v0

    check-cast v17, Lde/hdodenhof/circleimageview/CircleImageView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/widget/LinearLayout;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object/from16 v20, v0

    check-cast v20, Landroid/widget/LinearLayout;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object/from16 v21, v0

    check-cast v21, Landroid/widget/ImageView;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object/from16 v22, v0

    check-cast v22, Landroid/widget/TextView;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object/from16 v23, v0

    check-cast v23, Landroid/widget/TextView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object/from16 v24, v0

    check-cast v24, Landroid/widget/TextView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object/from16 v25, v0

    check-cast v25, Landroid/widget/TextView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object/from16 v26, v0

    check-cast v26, Landroid/widget/TextView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object/from16 v27, v0

    check-cast v27, Landroid/widget/ImageView;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v27}, Lm52/c;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/LinearLayout;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Lcom/whoop/realtime/presentation/views/RealTimeCell;Lcom/whoop/realtime/presentation/views/RealTimeCell;Landroid/widget/TextView;Lcom/whoop/ui/pills/StrokedPillImageButton;Lcom/whoop/realtime/presentation/views/RealTimeCell;Lcom/whoop/realtime/presentation/views/RealTimeCell;Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeView;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/LinearLayout;Lde/hdodenhof/circleimageview/CircleImageView;Lcom/whoop/realtime/presentation/views/RealTimeStrainDial;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lm52/d;->z:J

    const/4 v1, 0x0

    .line 4
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, v0, Lm52/d;->y:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 6
    invoke-virtual {v0, v2}, Landroidx/databinding/a0;->setRootTag(Landroid/view/View;)V

    .line 7
    invoke-virtual {v0}, Lm52/d;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 2

    monitor-enter p0

    const-wide/16 v0, 0x0

    :try_start_0
    iput-wide v0, p0, Lm52/d;->z:J

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lm52/d;->z:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    monitor-enter p0

    const-wide/16 v0, 0x1

    :try_start_0
    iput-wide v0, p0, Lm52/d;->z:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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

    const/4 p1, 0x0

    return p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
