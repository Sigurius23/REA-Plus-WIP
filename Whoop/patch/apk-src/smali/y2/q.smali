.class public final Ly2/q;
.super Landroidx/datastore/preferences/protobuf/l;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lh5/u;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public E:I

.field public F:Lh5/q1;

.field public final G:La0/v0;

.field public final H:Lp1/h1;

.field public final I:La0/q0;

.field public final J:Lz1/p;

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/datastore/preferences/protobuf/l;-><init>(I)V

    new-instance v0, La0/v0;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, La0/v0;-><init>(I)V

    sget-object v1, Ly2/b2;->a:Ly2/a2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ly2/a2;->b:Ly2/c2;

    new-instance v2, Ly2/d2;

    const-string v3, "caption bar"

    invoke-direct {v2, v3}, Ly2/d2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ly2/a2;->c:Ly2/c2;

    new-instance v2, Ly2/d2;

    const-string v3, "display cutout"

    invoke-direct {v2, v3}, Ly2/d2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ly2/a2;->d:Ly2/c2;

    new-instance v2, Ly2/d2;

    const-string v3, "ime"

    invoke-direct {v2, v3}, Ly2/d2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ly2/a2;->e:Ly2/c2;

    new-instance v2, Ly2/d2;

    const-string v3, "mandatory system gestures"

    invoke-direct {v2, v3}, Ly2/d2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ly2/a2;->f:Ly2/c2;

    new-instance v2, Ly2/d2;

    const-string v3, "navigation bars"

    invoke-direct {v2, v3}, Ly2/d2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ly2/a2;->g:Ly2/c2;

    new-instance v2, Ly2/d2;

    const-string v3, "status bars"

    invoke-direct {v2, v3}, Ly2/d2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ly2/a2;->h:Ly2/c2;

    new-instance v2, Ly2/d2;

    const-string v3, "system gestures"

    invoke-direct {v2, v3}, Ly2/d2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ly2/a2;->i:Ly2/c2;

    new-instance v2, Ly2/d2;

    const-string v3, "tappable element"

    invoke-direct {v2, v3}, Ly2/d2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ly2/a2;->j:Ly2/c2;

    new-instance v2, Ly2/d2;

    const-string v3, "waterfall"

    invoke-direct {v2, v3}, Ly2/d2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Ly2/q;->G:La0/v0;

    new-instance v0, Lp1/h1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/h1;-><init>(I)V

    iput-object v0, p0, Ly2/q;->H:Lp1/h1;

    new-instance v0, La0/q0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, La0/q0;-><init>(I)V

    iput-object v0, p0, Ly2/q;->I:La0/q0;

    new-instance v0, Lz1/p;

    invoke-direct {v0}, Lz1/p;-><init>()V

    iput-object v0, p0, Ly2/q;->J:Lz1/p;

    return-void
.end method


# virtual methods
.method public final K(Lh5/q1;)V
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    sget-object v2, Landroidx/compose/ui/layout/c;->a:La0/g0;

    iget-object v3, v2, La0/s;->b:[I

    iget-object v4, v2, La0/s;->c:[Ljava/lang/Object;

    iget-object v2, v2, La0/s;->a:[J

    array-length v5, v2

    add-int/lit8 v5, v5, -0x2

    const-wide/16 v16, 0x80

    const-wide/16 v18, 0xff

    const/16 v8, 0x8

    const/16 v20, 0x0

    if-ltz v5, :cond_4

    move/from16 v10, v20

    move/from16 v22, v10

    move/from16 v23, v22

    const/16 v21, 0x7

    const/16 v24, 0x10

    const/16 v25, 0x20

    :goto_0
    aget-wide v11, v2, v10

    const/16 v26, 0x30

    const-wide v27, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    not-long v13, v11

    shl-long v13, v13, v21

    and-long/2addr v13, v11

    and-long v13, v13, v27

    cmp-long v13, v13, v27

    if-eqz v13, :cond_3

    sub-int v13, v10, v5

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    rsub-int/lit8 v13, v13, 0x8

    move/from16 v14, v20

    :goto_1
    if-ge v14, v13, :cond_2

    and-long v29, v11, v18

    cmp-long v15, v29, v16

    if-gez v15, :cond_0

    shl-int/lit8 v15, v10, 0x3

    add-int/2addr v15, v14

    const/16 v29, 0x1

    aget v9, v3, v15

    aget-object v15, v4, v15

    check-cast v15, Ly2/b2;

    move/from16 v30, v8

    iget-object v8, v0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v8, v9}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v8

    iget v9, v8, Lv4/b;->a:I

    int-to-long v6, v9

    shl-long v6, v6, v26

    iget v9, v8, Lv4/b;->b:I

    move-object/from16 v32, v2

    move-object/from16 v31, v3

    int-to-long v2, v9

    shl-long v2, v2, v25

    or-long/2addr v2, v6

    iget v6, v8, Lv4/b;->c:I

    int-to-long v6, v6

    shl-long v6, v6, v24

    or-long/2addr v2, v6

    iget v6, v8, Lv4/b;->d:I

    int-to-long v6, v6

    or-long/2addr v2, v6

    iget-object v6, v1, Ly2/q;->G:La0/v0;

    invoke-virtual {v6, v15}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v6, Ly2/d2;

    iget-wide v7, v6, Ly2/d2;->h:J

    invoke-static {v2, v3, v7, v8}, Ly2/q1;->g(JJ)Z

    move-result v7

    if-nez v7, :cond_1

    iput-wide v2, v6, Ly2/d2;->h:J

    const-wide/16 v6, 0x0

    invoke-static {v2, v3, v6, v7}, Ly2/q1;->g(JJ)Z

    move-result v2

    move/from16 v22, v29

    if-nez v2, :cond_1

    move/from16 v23, v22

    goto :goto_2

    :cond_0
    move-object/from16 v32, v2

    move-object/from16 v31, v3

    move/from16 v30, v8

    const/16 v29, 0x1

    :cond_1
    :goto_2
    shr-long v11, v11, v30

    add-int/lit8 v14, v14, 0x1

    move/from16 v8, v30

    move-object/from16 v3, v31

    move-object/from16 v2, v32

    goto :goto_1

    :cond_2
    move-object/from16 v32, v2

    move-object/from16 v31, v3

    move v2, v8

    const/16 v29, 0x1

    if-ne v13, v2, :cond_5

    goto :goto_3

    :cond_3
    move-object/from16 v32, v2

    move-object/from16 v31, v3

    const/16 v29, 0x1

    :goto_3
    if-eq v10, v5, :cond_5

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v3, v31

    move-object/from16 v2, v32

    const/16 v8, 0x8

    goto/16 :goto_0

    :cond_4
    const/16 v21, 0x7

    const/16 v24, 0x10

    const/16 v25, 0x20

    const/16 v26, 0x30

    const-wide v27, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v29, 0x1

    move/from16 v22, v20

    move/from16 v23, v22

    :cond_5
    sget-object v2, Landroidx/compose/ui/layout/c;->c:La0/g0;

    iget-object v3, v2, La0/s;->b:[I

    iget-object v4, v2, La0/s;->c:[Ljava/lang/Object;

    iget-object v2, v2, La0/s;->a:[J

    array-length v5, v2

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_b

    move/from16 v6, v20

    :goto_4
    aget-wide v7, v2, v6

    not-long v9, v7

    shl-long v9, v9, v21

    and-long/2addr v9, v7

    and-long v9, v9, v27

    cmp-long v9, v9, v27

    if-eqz v9, :cond_a

    sub-int v9, v6, v5

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v30, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move/from16 v10, v20

    :goto_5
    if-ge v10, v9, :cond_9

    and-long v11, v7, v18

    cmp-long v11, v11, v16

    if-gez v11, :cond_8

    shl-int/lit8 v11, v6, 0x3

    add-int/2addr v11, v10

    aget v12, v3, v11

    aget-object v11, v4, v11

    check-cast v11, Ly2/b2;

    iget-object v13, v1, Ly2/q;->G:La0/v0;

    invoke-virtual {v13, v11}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v11, Ly2/d2;

    const/16 v13, 0x8

    if-eq v12, v13, :cond_6

    iget-object v13, v0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v13, v12}, Lh5/o1;->h(I)Lv4/b;

    move-result-object v13

    iget v14, v13, Lv4/b;->a:I

    int-to-long v14, v14

    shl-long v14, v14, v26

    move-object/from16 v31, v2

    iget v2, v13, Lv4/b;->b:I

    move-object/from16 v32, v3

    int-to-long v2, v2

    shl-long v2, v2, v25

    or-long/2addr v2, v14

    iget v14, v13, Lv4/b;->c:I

    int-to-long v14, v14

    shl-long v14, v14, v24

    or-long/2addr v2, v14

    iget v13, v13, Lv4/b;->d:I

    int-to-long v13, v13

    or-long/2addr v2, v13

    iget-wide v13, v11, Ly2/d2;->i:J

    invoke-static {v13, v14, v2, v3}, Ly2/q1;->g(JJ)Z

    move-result v13

    if-nez v13, :cond_7

    iput-wide v2, v11, Ly2/d2;->i:J

    const-wide/16 v13, 0x0

    invoke-static {v2, v3, v13, v14}, Ly2/q1;->g(JJ)Z

    move-result v2

    move/from16 v22, v29

    if-nez v2, :cond_7

    move/from16 v23, v22

    goto :goto_6

    :cond_6
    move-object/from16 v31, v2

    move-object/from16 v32, v3

    :cond_7
    :goto_6
    iget-object v2, v0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v2, v12}, Lh5/o1;->q(I)Z

    move-result v2

    iget-object v3, v11, Ly2/d2;->a:Lp1/k1;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v3, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :goto_7
    const/16 v2, 0x8

    goto :goto_8

    :cond_8
    move-object/from16 v31, v2

    move-object/from16 v32, v3

    goto :goto_7

    :goto_8
    shr-long/2addr v7, v2

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v31

    move-object/from16 v3, v32

    goto :goto_5

    :cond_9
    move-object/from16 v31, v2

    move-object/from16 v32, v3

    const/16 v2, 0x8

    if-ne v9, v2, :cond_b

    goto :goto_9

    :cond_a
    move-object/from16 v31, v2

    move-object/from16 v32, v3

    const/16 v2, 0x8

    :goto_9
    if-eq v6, v5, :cond_b

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v2, v31

    move-object/from16 v3, v32

    goto/16 :goto_4

    :cond_b
    iget-object v0, v0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v0}, Lh5/o1;->f()Lh5/h;

    move-result-object v0

    if-nez v0, :cond_c

    const-wide/16 v2, 0x0

    goto :goto_a

    :cond_c
    invoke-virtual {v0}, Lh5/h;->a()Lv4/b;

    move-result-object v2

    iget v3, v2, Lv4/b;->a:I

    int-to-long v3, v3

    shl-long v3, v3, v26

    iget v5, v2, Lv4/b;->b:I

    int-to-long v5, v5

    shl-long v5, v5, v25

    or-long/2addr v3, v5

    iget v5, v2, Lv4/b;->c:I

    int-to-long v5, v5

    shl-long v5, v5, v24

    or-long/2addr v3, v5

    iget v2, v2, Lv4/b;->d:I

    int-to-long v5, v2

    or-long v2, v3, v5

    :goto_a
    iget-object v4, v1, Ly2/q;->G:La0/v0;

    sget-object v5, Ly2/b2;->a:Ly2/a2;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Ly2/a2;->j:Ly2/c2;

    invoke-virtual {v4, v5}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v4, Ly2/d2;

    iget-wide v5, v4, Ly2/d2;->h:J

    invoke-static {v5, v6, v2, v3}, Ly2/q1;->g(JJ)Z

    move-result v5

    if-nez v5, :cond_d

    iput-wide v2, v4, Ly2/d2;->h:J

    iput-wide v2, v4, Ly2/d2;->i:J

    const-wide/16 v6, 0x0

    invoke-static {v2, v3, v6, v7}, Ly2/q1;->g(JJ)Z

    move-result v2

    move/from16 v22, v29

    if-nez v2, :cond_d

    move/from16 v23, v22

    :cond_d
    if-nez v0, :cond_e

    const-wide/16 v6, 0x0

    goto :goto_b

    :cond_e
    iget-object v2, v0, Lh5/h;->a:Landroid/view/DisplayCutout;

    invoke-virtual {v2}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    move-result v2

    iget-object v3, v0, Lh5/h;->a:Landroid/view/DisplayCutout;

    invoke-virtual {v3}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    move-result v3

    iget-object v4, v0, Lh5/h;->a:Landroid/view/DisplayCutout;

    invoke-virtual {v4}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result v4

    iget-object v5, v0, Lh5/h;->a:Landroid/view/DisplayCutout;

    invoke-virtual {v5}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result v5

    int-to-long v6, v2

    shl-long v6, v6, v26

    int-to-long v2, v3

    shl-long v2, v2, v25

    or-long/2addr v2, v6

    int-to-long v6, v4

    shl-long v6, v6, v24

    or-long/2addr v2, v6

    int-to-long v4, v5

    or-long v6, v2, v4

    :goto_b
    iget-object v2, v1, Ly2/q;->G:La0/v0;

    sget-object v3, Ly2/a2;->c:Ly2/c2;

    invoke-virtual {v2, v3}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Ly2/d2;

    iget-wide v3, v2, Ly2/d2;->h:J

    invoke-static {v6, v7, v3, v4}, Ly2/q1;->g(JJ)Z

    move-result v3

    if-nez v3, :cond_f

    iput-wide v6, v2, Ly2/d2;->h:J

    iput-wide v6, v2, Ly2/d2;->i:J

    const-wide/16 v13, 0x0

    invoke-static {v6, v7, v13, v14}, Ly2/q1;->g(JJ)Z

    move-result v2

    move/from16 v22, v29

    if-nez v2, :cond_f

    move/from16 v23, v22

    :cond_f
    if-nez v0, :cond_10

    iget-object v0, v1, Ly2/q;->I:La0/q0;

    iget v2, v0, La0/q0;->b:I

    if-lez v2, :cond_15

    invoke-virtual {v0}, La0/q0;->c()V

    iget-object v0, v1, Ly2/q;->J:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->clear()V

    move/from16 v22, v29

    goto/16 :goto_f

    :cond_10
    iget-object v0, v0, Lh5/h;->a:Landroid/view/DisplayCutout;

    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getBoundingRects()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, v1, Ly2/q;->I:La0/q0;

    iget v4, v3, La0/q0;->b:I

    if-ge v2, v4, :cond_11

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    iget-object v4, v1, Ly2/q;->I:La0/q0;

    iget v4, v4, La0/q0;->b:I

    invoke-virtual {v3, v2, v4}, La0/q0;->k(II)V

    iget-object v2, v1, Ly2/q;->J:Lz1/p;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    iget-object v4, v1, Ly2/q;->J:Lz1/p;

    invoke-virtual {v4}, Lz1/p;->size()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lz1/p;->y0(II)V

    move/from16 v22, v29

    goto :goto_d

    :cond_11
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, v1, Ly2/q;->I:La0/q0;

    iget v3, v3, La0/q0;->b:I

    sub-int/2addr v2, v3

    move/from16 v3, v20

    :goto_c
    if-ge v3, v2, :cond_12

    iget-object v4, v1, Ly2/q;->I:La0/q0;

    iget v5, v4, La0/q0;->b:I

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v4, v5}, La0/q0;->a(Ljava/lang/Object;)V

    iget-object v4, v1, Ly2/q;->J:Lz1/p;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "display cutout rect "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v1, Ly2/q;->I:La0/q0;

    iget v6, v6, La0/q0;->b:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ly2/p;

    invoke-direct {v6, v5}, Ly2/p;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Lz1/p;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    move/from16 v22, v29

    goto :goto_c

    :cond_12
    :goto_d
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    move/from16 v4, v20

    :goto_e
    if-ge v4, v3, :cond_14

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Rect;

    iget-object v6, v1, Ly2/q;->I:La0/q0;

    invoke-virtual {v6, v4}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp1/c1;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    invoke-interface {v6, v5}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    move/from16 v22, v29

    :cond_13
    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    :cond_14
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    move/from16 v23, v29

    :cond_15
    :goto_f
    if-nez v23, :cond_16

    iget-object v0, v1, Ly2/q;->H:Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    if-eqz v0, :cond_18

    :cond_16
    if-eqz v22, :cond_18

    iget-object v0, v1, Ly2/q;->H:Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Lp1/h1;->y(I)V

    sget-object v2, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lz1/l;->j:Lz1/a;

    iget-object v0, v0, Lz1/b;->h:La0/w0;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, La0/w0;->h()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v3, v29

    if-ne v0, v3, :cond_17

    move v9, v3

    goto :goto_10

    :cond_17
    move/from16 v9, v20

    :goto_10
    monitor-exit v2

    if-eqz v9, :cond_18

    invoke-static {}, Lz1/l;->a()V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_18
    return-void
.end method

.method public final g(Lh5/d1;)V
    .locals 5

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly2/q;->z:Z

    iget-object p1, p1, Lh5/d1;->a:Lh5/c1;

    invoke-virtual {p1}, Lh5/c1;->c()I

    move-result p1

    iget v1, p0, Ly2/q;->E:I

    not-int v2, p1

    and-int/2addr v1, v2

    iput v1, p0, Ly2/q;->E:I

    const/4 v1, 0x0

    iput-object v1, p0, Ly2/q;->F:Lh5/q1;

    sget-object v1, Landroidx/compose/ui/layout/c;->c:La0/g0;

    invoke-virtual {v1, p1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/b2;

    if-eqz p1, :cond_1

    iget-object v1, p0, Ly2/q;->G:La0/v0;

    invoke-virtual {v1, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Ly2/d2;

    iget-object v1, p1, Ly2/d2;->c:Lp1/g1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/g1;->y(F)V

    const/high16 v1, 0x3f800000    # 1.0f

    iget-object v3, p1, Ly2/d2;->e:Lp1/g1;

    invoke-virtual {v3, v1}, Lp1/g1;->y(F)V

    const-wide/16 v3, 0x0

    iget-object v1, p1, Ly2/d2;->d:Lp1/i1;

    invoke-virtual {v1, v3, v4}, Lp1/i1;->y(J)V

    iget-object v1, p1, Ly2/d2;->c:Lp1/g1;

    invoke-virtual {v1, v2}, Lp1/g1;->y(F)V

    iget-object v1, p1, Ly2/d2;->b:Lp1/k1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const-wide/16 v1, -0x1

    iput-wide v1, p1, Ly2/d2;->j:J

    iput-wide v1, p1, Ly2/d2;->k:J

    iget-object p1, p0, Ly2/q;->H:Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-virtual {p1, v1}, Lp1/h1;->y(I)V

    sget-object p1, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sget-object v1, Lz1/l;->j:Lz1/a;

    iget-object v1, v1, Lz1/b;->h:La0/w0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, La0/w0;->h()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, v2, :cond_0

    move v0, v2

    :cond_0
    monitor-exit p1

    if-eqz v0, :cond_1

    invoke-static {}, Lz1/l;->a()V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0

    :cond_1
    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly2/q;->z:Z

    return-void
.end method

.method public final i(Lh5/q1;Ljava/util/List;)Lh5/q1;
    .locals 6

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh5/d1;

    iget-object v3, v2, Lh5/d1;->a:Lh5/c1;

    invoke-virtual {v3}, Lh5/c1;->c()I

    move-result v3

    sget-object v4, Landroidx/compose/ui/layout/c;->c:La0/g0;

    invoke-virtual {v4, v3}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/b2;

    if-eqz v3, :cond_0

    iget-object v4, p0, Ly2/q;->G:La0/v0;

    invoke-virtual {v4, v3}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Ly2/d2;

    iget-object v4, v3, Ly2/d2;->b:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v2, v2, Lh5/d1;->a:Lh5/c1;

    invoke-virtual {v2}, Lh5/c1;->b()F

    move-result v4

    iget-object v5, v3, Ly2/d2;->c:Lp1/g1;

    invoke-virtual {v5, v4}, Lp1/g1;->y(F)V

    const/4 v4, 0x0

    iget-object v5, v3, Ly2/d2;->e:Lp1/g1;

    invoke-virtual {v5, v4}, Lp1/g1;->y(F)V

    invoke-virtual {v2}, Lh5/c1;->a()J

    move-result-wide v4

    iget-object v2, v3, Ly2/d2;->d:Lp1/i1;

    invoke-virtual {v2, v4, v5}, Lp1/i1;->y(J)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ly2/q;->K(Lh5/q1;)V

    return-object p1
.end method

.method public final j(Lh5/d1;Lio/sentry/internal/debugmeta/c;)Lio/sentry/internal/debugmeta/c;
    .locals 8

    iget-object v0, p0, Ly2/q;->F:Lh5/q1;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ly2/q;->z:Z

    const/4 v2, 0x0

    iput-object v2, p0, Ly2/q;->F:Lh5/q1;

    iget-object v2, p1, Lh5/d1;->a:Lh5/c1;

    invoke-virtual {v2}, Lh5/c1;->a()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    if-eqz v0, :cond_1

    iget-object v2, p1, Lh5/d1;->a:Lh5/c1;

    invoke-virtual {v2}, Lh5/c1;->c()I

    move-result v2

    iget v3, p0, Ly2/q;->E:I

    or-int/2addr v3, v2

    iput v3, p0, Ly2/q;->E:I

    sget-object v3, Landroidx/compose/ui/layout/c;->c:La0/g0;

    invoke-virtual {v3, v2}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/b2;

    if-eqz v3, :cond_1

    iget-object v4, p0, Ly2/q;->G:La0/v0;

    invoke-virtual {v4, v3}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Ly2/d2;

    iget-object v0, v0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v0, v2}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v0

    iget v2, v0, Lv4/b;->a:I

    int-to-long v4, v2

    const/16 v2, 0x30

    shl-long/2addr v4, v2

    iget v2, v0, Lv4/b;->b:I

    int-to-long v6, v2

    const/16 v2, 0x20

    shl-long/2addr v6, v2

    or-long/2addr v4, v6

    iget v2, v0, Lv4/b;->c:I

    int-to-long v6, v2

    const/16 v2, 0x10

    shl-long/2addr v6, v2

    or-long/2addr v4, v6

    iget v0, v0, Lv4/b;->d:I

    int-to-long v6, v0

    or-long/2addr v4, v6

    iget-wide v6, v3, Ly2/d2;->h:J

    invoke-static {v4, v5, v6, v7}, Ly2/q1;->g(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    iput-wide v6, v3, Ly2/d2;->j:J

    iput-wide v4, v3, Ly2/d2;->k:J

    iget-object v0, v3, Ly2/d2;->b:Lp1/k1;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object p1, p1, Lh5/d1;->a:Lh5/c1;

    invoke-virtual {p1}, Lh5/c1;->b()F

    move-result v0

    iget-object v2, v3, Ly2/d2;->c:Lp1/g1;

    invoke-virtual {v2, v0}, Lp1/g1;->y(F)V

    const/4 v0, 0x0

    iget-object v2, v3, Ly2/d2;->e:Lp1/g1;

    invoke-virtual {v2, v0}, Lp1/g1;->y(F)V

    invoke-virtual {p1}, Lh5/c1;->a()J

    move-result-wide v4

    iget-object p1, v3, Ly2/d2;->d:Lp1/i1;

    invoke-virtual {p1, v4, v5}, Lp1/i1;->y(J)V

    iget-object p1, p0, Ly2/q;->H:Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result v0

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-virtual {p1, v0}, Lp1/h1;->y(I)V

    sget-object p1, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sget-object v0, Lz1/l;->j:Lz1/a;

    iget-object v0, v0, Lz1/b;->h:La0/w0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La0/w0;->h()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    monitor-exit p1

    if-eqz v1, :cond_1

    invoke-static {}, Lz1/l;->a()V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_1
    return-object p2
.end method

.method public final o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 2

    iget-boolean v0, p0, Ly2/q;->z:Z

    if-eqz v0, :cond_0

    iput-object p2, p0, Ly2/q;->F:Lh5/q1;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_1

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-object p2

    :cond_0
    iget p1, p0, Ly2/q;->E:I

    if-nez p1, :cond_1

    invoke-virtual {p0, p2}, Ly2/q;->K(Lh5/q1;)V

    :cond_1
    return-object p2
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1, p0}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    invoke-static {p1, p0}, Lh5/p0;->q(Landroid/view/View;Landroidx/datastore/preferences/protobuf/l;)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1, v2}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    invoke-static {p1, v2}, Lh5/p0;->q(Landroid/view/View;Landroidx/datastore/preferences/protobuf/l;)V

    return-void
.end method

.method public final run()V
    .locals 1

    iget-boolean v0, p0, Ly2/q;->z:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Ly2/q;->E:I

    iput-boolean v0, p0, Ly2/q;->z:Z

    iget-object v0, p0, Ly2/q;->F:Lh5/q1;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Ly2/q;->K(Lh5/q1;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ly2/q;->F:Lh5/q1;

    :cond_0
    return-void
.end method
