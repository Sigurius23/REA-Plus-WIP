.class public Lii0/l;
.super Lii0/k;
.source "SourceFile"


# static fields
.field private static final w:Landroidx/databinding/u;

.field private static final x:Landroid/util/SparseIntArray;


# instance fields
.field private final u:Landroid/widget/ScrollView;

.field private v:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lii0/l;->x:Landroid/util/SparseIntArray;

    sget v1, Lhi0/e;->k1:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->e0:I

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->m0:I

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->f0:I

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->n0:I

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->g0:I

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->o0:I

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->v0:I

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->A0:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->u0:I

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->t0:I

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->z0:I

    const/16 v2, 0xc

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->x0:I

    const/16 v2, 0xd

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->y0:I

    const/16 v2, 0xe

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->l0:I

    const/16 v2, 0xf

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->k0:I

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->i0:I

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->j0:I

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->h0:I

    const/16 v2, 0x13

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    sget v1, Lhi0/e;->w0:I

    const/16 v2, 0x14

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/f;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lii0/l;->w:Landroidx/databinding/u;

    sget-object v1, Lii0/l;->x:Landroid/util/SparseIntArray;

    const/16 v2, 0x15

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/a0;->mapBindings(Landroidx/databinding/f;Landroid/view/View;ILandroidx/databinding/u;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lii0/l;-><init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/f;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 24

    const/4 v0, 0x2

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    const/16 v0, 0x13

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/whoop/ui/views/AdvancedSettingsItemView;

    const/16 v0, 0x11

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/whoop/ui/views/AdvancedSettingsItemView;

    const/16 v0, 0x12

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/whoop/ui/views/AdvancedSettingsItemView;

    const/16 v0, 0x10

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Lcom/whoop/ui/views/AdvancedSettingsItemView;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lcom/whoop/ui/views/AdvancedSettingsItemView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/ImageView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Lcom/whoop/ui/views/AdvancedSettingsItemView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/whoop/ui/views/AdvancedSettingsItemView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/TextView;

    const/16 v0, 0x14

    aget-object v0, p3, v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/whoop/ui/views/AdvancedSettingsItemView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object/from16 v19, v0

    check-cast v19, Lcom/whoop/ui/views/AdvancedSettingsItemView;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/whoop/ui/views/AdvancedSettingsItemView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/whoop/ui/views/AdvancedSettingsItemView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object/from16 v22, v0

    check-cast v22, Landroidx/constraintlayout/widget/Barrier;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object/from16 v23, v0

    check-cast v23, Landroidx/compose/ui/platform/ComposeView;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v23}, Lii0/k;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/whoop/ui/views/AdvancedSettingsItemView;Lcom/whoop/ui/views/AdvancedSettingsItemView;Lcom/whoop/ui/views/AdvancedSettingsItemView;Lcom/whoop/ui/views/AdvancedSettingsItemView;Lcom/whoop/ui/views/AdvancedSettingsItemView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/whoop/ui/views/AdvancedSettingsItemView;Lcom/whoop/ui/views/AdvancedSettingsItemView;Landroid/widget/TextView;Lcom/whoop/ui/views/AdvancedSettingsItemView;Lcom/whoop/ui/views/AdvancedSettingsItemView;Lcom/whoop/ui/views/AdvancedSettingsItemView;Lcom/whoop/ui/views/AdvancedSettingsItemView;Landroidx/constraintlayout/widget/Barrier;Landroidx/compose/ui/platform/ComposeView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lii0/l;->v:J

    const/4 v1, 0x0

    .line 4
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/ScrollView;

    iput-object v1, v0, Lii0/l;->u:Landroid/widget/ScrollView;

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 6
    invoke-virtual {v0, v2}, Landroidx/databinding/a0;->setRootTag(Landroid/view/View;)V

    .line 7
    invoke-virtual {v0}, Lii0/l;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 2

    monitor-enter p0

    const-wide/16 v0, 0x0

    :try_start_0
    iput-wide v0, p0, Lii0/l;->v:J

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
    iget-wide v0, p0, Lii0/l;->v:J

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
    iput-wide v0, p0, Lii0/l;->v:J

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
