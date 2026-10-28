.class public final Ljo/s;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final X0:[F


# instance fields
.field public A0:I

.field public B0:[J

.field public C0:[Z

.field public final D0:[J

.field public final E:Landroid/view/View;

.field public final E0:[Z

.field public final F:Landroid/view/View;

.field public F0:J

.field public final G:Landroid/view/View;

.field public final G0:Ldb/c0;

.field public final H:Landroid/widget/TextView;

.field public final H0:Landroid/content/res/Resources;

.field public final I:Landroid/widget/TextView;

.field public final I0:Landroidx/recyclerview/widget/RecyclerView;

.field public final J:Landroid/widget/ImageView;

.field public final J0:Ldb/r;

.field public final K:Landroid/widget/ImageView;

.field public final K0:Ldb/o;

.field public final L:Landroid/view/View;

.field public final L0:Landroid/widget/PopupWindow;

.field public final M:Landroid/widget/TextView;

.field public M0:Z

.field public final N:Landroid/widget/TextView;

.field public final N0:I

.field public final O:Ljo/a0;

.field public final O0:Ljo/k;

.field public final P:Ljava/lang/StringBuilder;

.field public final P0:Ljo/k;

.field public final Q:Ljava/util/Formatter;

.field public final Q0:Ldb/g;

.field public final R:Lrm/m1;

.field public final R0:Landroid/widget/ImageView;

.field public final S:Lrm/n1;

.field public final S0:Landroid/widget/ImageView;

.field public final T:Lio/sentry/c7;

.field public final T0:Landroid/widget/ImageView;

.field public final U:Landroid/graphics/drawable/Drawable;

.field public final U0:Landroid/view/View;

.field public final V:Landroid/graphics/drawable/Drawable;

.field public final V0:Landroid/view/View;

.field public final W:Landroid/graphics/drawable/Drawable;

.field public final W0:Landroid/view/View;

.field public final a0:Ljava/lang/String;

.field public final b0:Ljava/lang/String;

.field public final c0:Ljava/lang/String;

.field public final d0:Landroid/graphics/drawable/Drawable;

.field public final e0:Landroid/graphics/drawable/Drawable;

.field public final f0:F

.field public final g0:F

.field public final h0:Ljava/lang/String;

.field public final i0:Ljava/lang/String;

.field public final j0:Landroid/graphics/drawable/Drawable;

.field public final k0:Landroid/graphics/drawable/Drawable;

.field public final l0:Ljava/lang/String;

.field public final m0:Ljava/lang/String;

.field public final n0:Landroid/graphics/drawable/Drawable;

.field public final o0:Landroid/graphics/drawable/Drawable;

.field public final p0:Ljava/lang/String;

.field public final q0:Ljava/lang/String;

.field public r0:Lrm/b1;

.field public s0:Ljo/m;

.field public t0:Z

.field public u0:Z

.field public v0:Z

.field public final w:Ljo/l;

.field public w0:Z

.field public final x:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public x0:Z

.field public final y:Landroid/view/View;

.field public y0:I

.field public final z:Landroid/view/View;

.field public z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.ui"

    invoke-static {v0}, Lrm/a0;->a(Ljava/lang/String;)V

    const/4 v0, 0x7

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Ljo/s;->X0:[F

    return-void

    :array_0
    .array-data 4
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f800000    # 1.0f
        0x3fa00000    # 1.25f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v4, 0x1388

    iput v4, v0, Ljo/s;->y0:I

    iput v3, v0, Ljo/s;->A0:I

    const/16 v4, 0xc8

    iput v4, v0, Ljo/s;->z0:I

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    const v5, 0x7f0d017d

    invoke-virtual {v4, v5, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 v4, 0x40000

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    new-instance v4, Ljo/l;

    invoke-direct {v4, v0}, Ljo/l;-><init>(Ljo/s;)V

    iput-object v4, v0, Ljo/s;->w:Ljo/l;

    new-instance v5, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v5, v0, Ljo/s;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v5, Lrm/m1;

    invoke-direct {v5}, Lrm/m1;-><init>()V

    iput-object v5, v0, Ljo/s;->R:Lrm/m1;

    new-instance v5, Lrm/n1;

    invoke-direct {v5}, Lrm/n1;-><init>()V

    iput-object v5, v0, Ljo/s;->S:Lrm/n1;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v5, v0, Ljo/s;->P:Ljava/lang/StringBuilder;

    new-instance v6, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    invoke-direct {v6, v5, v7}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v6, v0, Ljo/s;->Q:Ljava/util/Formatter;

    new-array v5, v3, [J

    iput-object v5, v0, Ljo/s;->B0:[J

    new-array v5, v3, [Z

    iput-object v5, v0, Ljo/s;->C0:[Z

    new-array v5, v3, [J

    iput-object v5, v0, Ljo/s;->D0:[J

    new-array v5, v3, [Z

    iput-object v5, v0, Ljo/s;->E0:[Z

    new-instance v5, Lio/sentry/c7;

    const/16 v6, 0x12

    invoke-direct {v5, v0, v6}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    iput-object v5, v0, Ljo/s;->T:Lio/sentry/c7;

    const v5, 0x7f0a045b

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v0, Ljo/s;->M:Landroid/widget/TextView;

    const v5, 0x7f0a046f

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v0, Ljo/s;->N:Landroid/widget/TextView;

    const v5, 0x7f0a047b

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, v0, Ljo/s;->R0:Landroid/widget/ImageView;

    if-eqz v5, :cond_0

    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    const v6, 0x7f0a0461

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, v0, Ljo/s;->S0:Landroid/widget/ImageView;

    new-instance v7, Lb30/k3;

    const/16 v8, 0x1d

    invoke-direct {v7, v0, v8}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    const/16 v8, 0x8

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    const v6, 0x7f0a0466

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, v0, Ljo/s;->T0:Landroid/widget/ImageView;

    new-instance v7, Lb30/k3;

    const/16 v9, 0x1d

    invoke-direct {v7, v0, v9}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    const v6, 0x7f0a0476

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v0, Ljo/s;->U0:Landroid/view/View;

    if-eqz v6, :cond_3

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    const v6, 0x7f0a046e

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v0, Ljo/s;->V0:Landroid/view/View;

    if-eqz v6, :cond_4

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    const v6, 0x7f0a0451

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v0, Ljo/s;->W0:Landroid/view/View;

    if-eqz v6, :cond_5

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    const v6, 0x7f0a0471

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ljo/a0;

    const v8, 0x7f0a0472

    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    if-eqz v7, :cond_6

    iput-object v7, v0, Ljo/s;->O:Ljo/a0;

    goto :goto_2

    :cond_6
    if-eqz v8, :cond_7

    new-instance v7, Ljo/e;

    invoke-direct {v7, v1}, Ljo/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {v7, v6}, Landroid/view/View;->setId(I)V

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v9

    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {v6, v7, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iput-object v7, v0, Ljo/s;->O:Ljo/a0;

    goto :goto_2

    :cond_7
    iput-object v2, v0, Ljo/s;->O:Ljo/a0;

    :goto_2
    iget-object v6, v0, Ljo/s;->O:Ljo/a0;

    if-eqz v6, :cond_8

    check-cast v6, Ljo/e;

    iget-object v6, v6, Ljo/e;->a0:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v6, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    :cond_8
    const v6, 0x7f0a046d

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v0, Ljo/s;->E:Landroid/view/View;

    if-eqz v6, :cond_9

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    const v6, 0x7f0a0470

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v0, Ljo/s;->y:Landroid/view/View;

    if-eqz v6, :cond_a

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_a
    const v7, 0x7f0a0467

    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    iput-object v7, v0, Ljo/s;->z:Landroid/view/View;

    if-eqz v7, :cond_b

    invoke-virtual {v7, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    const v8, 0x7f090006

    invoke-static {v1, v8}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v8

    const v9, 0x7f0a0474

    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    if-nez v9, :cond_c

    const v10, 0x7f0a0475

    invoke-virtual {v0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    goto :goto_3

    :cond_c
    move-object v10, v2

    :goto_3
    iput-object v10, v0, Ljo/s;->I:Landroid/widget/TextView;

    if-eqz v10, :cond_d

    invoke-virtual {v10, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_d
    if-nez v9, :cond_e

    move-object v9, v10

    :cond_e
    iput-object v9, v0, Ljo/s;->G:Landroid/view/View;

    if-eqz v9, :cond_f

    invoke-virtual {v9, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_f
    const v10, 0x7f0a045f

    invoke-virtual {v0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    if-nez v10, :cond_10

    const v11, 0x7f0a0460

    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    goto :goto_4

    :cond_10
    move-object v11, v2

    :goto_4
    iput-object v11, v0, Ljo/s;->H:Landroid/widget/TextView;

    if-eqz v11, :cond_11

    invoke-virtual {v11, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_11
    if-nez v10, :cond_12

    move-object v10, v11

    :cond_12
    iput-object v10, v0, Ljo/s;->F:Landroid/view/View;

    if-eqz v10, :cond_13

    invoke-virtual {v10, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_13
    const v8, 0x7f0a0473

    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/ImageView;

    iput-object v8, v0, Ljo/s;->J:Landroid/widget/ImageView;

    if-eqz v8, :cond_14

    invoke-virtual {v8, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_14
    const v11, 0x7f0a0478

    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/ImageView;

    iput-object v11, v0, Ljo/s;->K:Landroid/widget/ImageView;

    if-eqz v11, :cond_15

    invoke-virtual {v11, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_15
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    iput-object v12, v0, Ljo/s;->H0:Landroid/content/res/Resources;

    const v13, 0x7f0b0017

    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v13

    int-to-float v13, v13

    const/high16 v14, 0x42c80000    # 100.0f

    div-float/2addr v13, v14

    iput v13, v0, Ljo/s;->f0:F

    const v13, 0x7f0b0016

    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v13

    int-to-float v13, v13

    div-float/2addr v13, v14

    iput v13, v0, Ljo/s;->g0:F

    const v13, 0x7f0a0480

    invoke-virtual {v0, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    iput-object v13, v0, Ljo/s;->L:Landroid/view/View;

    if-eqz v13, :cond_16

    invoke-virtual {v0, v13, v3}, Ljo/s;->j(Landroid/view/View;Z)V

    :cond_16
    new-instance v14, Ldb/c0;

    invoke-direct {v14, v0}, Ldb/c0;-><init>(Ljo/s;)V

    iput-object v14, v0, Ljo/s;->G0:Ldb/c0;

    const/4 v15, 0x1

    iput-boolean v15, v14, Ldb/c0;->w:Z

    const v3, 0x7f1404b1

    invoke-virtual {v12, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v15, 0x7f080451

    invoke-virtual {v12, v15}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v15

    const v2, 0x7f1404d2

    invoke-virtual {v12, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v3, v2}, [Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f08043d

    invoke-virtual {v12, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    filled-new-array {v15, v3}, [Landroid/graphics/drawable/Drawable;

    move-result-object v3

    new-instance v15, Ldb/r;

    invoke-direct {v15, v0, v2, v3}, Ldb/r;-><init>(Ljo/s;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V

    iput-object v15, v0, Ljo/s;->J0:Ldb/r;

    const v2, 0x7f0700d0

    invoke-virtual {v12, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, v0, Ljo/s;->N0:I

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0d017f

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v1, v0, Ljo/s;->I0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v15}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/u1;)V

    new-instance v2, Landroid/widget/PopupWindow;

    const/4 v15, -0x2

    invoke-direct {v2, v1, v15, v15, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v2, v0, Ljo/s;->L0:Landroid/widget/PopupWindow;

    sget v1, Llo/y;->a:I

    const/16 v15, 0x17

    if-ge v1, v15, :cond_17

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v15, 0x0

    invoke-direct {v1, v15}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_17
    invoke-virtual {v2, v4}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iput-boolean v3, v0, Ljo/s;->M0:Z

    new-instance v1, Ldb/g;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ldb/g;-><init>(Landroid/content/res/Resources;I)V

    iput-object v1, v0, Ljo/s;->Q0:Ldb/g;

    const v1, 0x7f080453

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->j0:Landroid/graphics/drawable/Drawable;

    const v1, 0x7f080452

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->k0:Landroid/graphics/drawable/Drawable;

    const v1, 0x7f1404a6

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->l0:Ljava/lang/String;

    const v1, 0x7f1404a5

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->m0:Ljava/lang/String;

    new-instance v1, Ljo/k;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Ljo/k;-><init>(Ljo/s;I)V

    iput-object v1, v0, Ljo/s;->O0:Ljo/k;

    new-instance v1, Ljo/k;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ljo/k;-><init>(Ljo/s;I)V

    iput-object v1, v0, Ljo/s;->P0:Ljo/k;

    new-instance v1, Ldb/o;

    const v2, 0x7f030003

    invoke-virtual {v12, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljo/s;->X0:[F

    const/4 v4, 0x1

    invoke-direct {v1, v0, v2, v3, v4}, Ldb/o;-><init>(Landroid/widget/FrameLayout;[Ljava/lang/String;[FI)V

    iput-object v1, v0, Ljo/s;->K0:Ldb/o;

    const v1, 0x7f080441

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->n0:Landroid/graphics/drawable/Drawable;

    const v1, 0x7f080440

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->o0:Landroid/graphics/drawable/Drawable;

    const v1, 0x7f080449

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->U:Landroid/graphics/drawable/Drawable;

    const v1, 0x7f08044a

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->V:Landroid/graphics/drawable/Drawable;

    const v1, 0x7f080448

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->W:Landroid/graphics/drawable/Drawable;

    const v1, 0x7f08044e

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->d0:Landroid/graphics/drawable/Drawable;

    const v1, 0x7f08044d

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->e0:Landroid/graphics/drawable/Drawable;

    const v1, 0x7f1404aa

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->p0:Ljava/lang/String;

    const v1, 0x7f1404a9

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->q0:Ljava/lang/String;

    const v1, 0x7f1404b4

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->a0:Ljava/lang/String;

    const v1, 0x7f1404b5

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->b0:Ljava/lang/String;

    const v1, 0x7f1404b3

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->c0:Ljava/lang/String;

    const v1, 0x7f1404bb

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->h0:Ljava/lang/String;

    const v1, 0x7f1404ba

    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljo/s;->i0:Ljava/lang/String;

    const v1, 0x7f0a0453

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    const/4 v3, 0x1

    invoke-virtual {v14, v1, v3}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {v14, v10, v3}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {v14, v9, v3}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {v14, v6, v3}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {v14, v7, v3}, Ldb/c0;->j(Landroid/view/View;Z)V

    const/4 v15, 0x0

    invoke-virtual {v14, v11, v15}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {v14, v5, v15}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {v14, v13, v15}, Ldb/c0;->j(Landroid/view/View;Z)V

    iget v1, v0, Ljo/s;->A0:I

    if-eqz v1, :cond_18

    goto :goto_5

    :cond_18
    move v3, v15

    :goto_5
    invoke-virtual {v14, v8, v3}, Ldb/c0;->j(Landroid/view/View;Z)V

    new-instance v1, Ldb/k;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, Ldb/k;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public static a(Ljo/s;)V
    .locals 6

    iget-object v0, p0, Ljo/s;->q0:Ljava/lang/String;

    iget-object v1, p0, Ljo/s;->o0:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Ljo/s;->p0:Ljava/lang/String;

    iget-object v3, p0, Ljo/s;->n0:Landroid/graphics/drawable/Drawable;

    iget-object v4, p0, Ljo/s;->s0:Ljo/m;

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    iget-boolean v4, p0, Ljo/s;->t0:Z

    xor-int/lit8 v5, v4, 0x1

    iput-boolean v5, p0, Ljo/s;->t0:Z

    iget-object v5, p0, Ljo/s;->S0:Landroid/widget/ImageView;

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    if-nez v4, :cond_2

    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v5, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v5, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object v4, p0, Ljo/s;->T0:Landroid/widget/ImageView;

    iget-boolean v5, p0, Ljo/s;->t0:Z

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    if-eqz v5, :cond_4

    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_1
    iget-object v0, p0, Ljo/s;->s0:Ljo/m;

    if-eqz v0, :cond_5

    iget-boolean p0, p0, Ljo/s;->t0:Z

    check-cast v0, Lbs2/e;

    iget-object v1, v0, Lbs2/e;->w:Lc93/a;

    iget-object v0, v0, Lbs2/e;->x:Lc93/a;

    invoke-static {v1, v0, p0}, Lbs2/f;->a(Lc93/a;Lc93/a;Z)V

    :cond_5
    :goto_2
    return-void
.end method

.method public static synthetic b(Ljo/s;F)V
    .locals 0

    invoke-direct {p0, p1}, Ljo/s;->setPlaybackSpeed(F)V

    return-void
.end method

.method private setPlaybackSpeed(F)V
    .locals 11

    iget-object v0, p0, Ljo/s;->r0:Lrm/b1;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->B0()V

    iget-object v0, v1, Lrm/u;->K0:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->n:Lrm/w0;

    new-instance v2, Lrm/w0;

    iget v0, v0, Lrm/w0;->x:F

    invoke-direct {v2, p1, v0}, Lrm/w0;-><init>(FF)V

    invoke-virtual {v1}, Lrm/u;->B0()V

    iget-object p1, v1, Lrm/u;->K0:Lrm/v0;

    iget-object p1, p1, Lrm/v0;->n:Lrm/w0;

    invoke-virtual {p1, v2}, Lrm/w0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object p1, v1, Lrm/u;->K0:Lrm/v0;

    invoke-virtual {p1, v2}, Lrm/v0;->f(Lrm/w0;)Lrm/v0;

    move-result-object p1

    iget v0, v1, Lrm/u;->i0:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v1, Lrm/u;->i0:I

    iget-object v0, v1, Lrm/u;->L:Lrm/z;

    iget-object v0, v0, Lrm/z;->H:Llo/v;

    const/4 v3, 0x4

    invoke-virtual {v0, v3, v2}, Llo/v;->a(ILjava/lang/Object;)Llo/u;

    move-result-object v0

    invoke-virtual {v0}, Llo/u;->b()V

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x5

    move-object v2, p1

    invoke-virtual/range {v1 .. v10}, Lrm/u;->z0(Lrm/v0;IIZZIJI)V

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/KeyEvent;)Z
    .locals 13

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    iget-object v1, p0, Ljo/s;->r0:Lrm/b1;

    const/4 v2, 0x0

    if-eqz v1, :cond_f

    const/16 v3, 0x58

    const/16 v4, 0x57

    const/16 v5, 0x7f

    const/16 v6, 0x7e

    const/16 v7, 0x4f

    const/16 v8, 0x55

    const/16 v9, 0x59

    const/16 v10, 0x5a

    if-eq v0, v10, :cond_0

    if-eq v0, v9, :cond_0

    if-eq v0, v8, :cond_0

    if-eq v0, v7, :cond_0

    if-eq v0, v6, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-ne v0, v3, :cond_f

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v11

    const/4 v12, 0x1

    if-nez v11, :cond_e

    const/4 v11, 0x4

    if-ne v0, v10, :cond_1

    move-object p1, v1

    check-cast p1, Lrm/u;

    invoke-virtual {p1}, Lrm/u;->e0()I

    move-result p1

    if-eq p1, v11, :cond_e

    check-cast v1, La2/a;

    move-object p1, v1

    check-cast p1, Lrm/u;

    invoke-virtual {p1}, Lrm/u;->B0()V

    iget-wide v2, p1, Lrm/u;->W:J

    invoke-virtual {v1, v2, v3}, La2/a;->L(J)V

    goto/16 :goto_3

    :cond_1
    if-ne v0, v9, :cond_2

    check-cast v1, La2/a;

    move-object p1, v1

    check-cast p1, Lrm/u;

    invoke-virtual {p1}, Lrm/u;->B0()V

    iget-wide v2, p1, Lrm/u;->V:J

    neg-long v2, v2

    invoke-virtual {v1, v2, v3}, La2/a;->L(J)V

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    if-nez p1, :cond_e

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v0, v7, :cond_9

    if-eq v0, v8, :cond_9

    if-eq v0, v4, :cond_8

    if-eq v0, v3, :cond_7

    if-eq v0, v6, :cond_4

    if-eq v0, v5, :cond_3

    goto :goto_3

    :cond_3
    check-cast v1, La2/a;

    check-cast v1, Lrm/u;

    invoke-virtual {v1, v2}, Lrm/u;->t0(Z)V

    goto :goto_3

    :cond_4
    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->e0()I

    move-result p1

    if-ne p1, v12, :cond_5

    invoke-virtual {v1}, Lrm/u;->m0()V

    goto :goto_0

    :cond_5
    if-ne p1, v11, :cond_6

    invoke-virtual {v1}, Lrm/u;->Y()I

    move-result p1

    invoke-virtual {v1, p1, v9, v10}, Lrm/u;->q0(IJ)V

    :cond_6
    :goto_0
    invoke-virtual {v1, v12}, Lrm/u;->t0(Z)V

    goto :goto_3

    :cond_7
    check-cast v1, La2/a;

    invoke-virtual {v1}, La2/a;->M()V

    goto :goto_3

    :cond_8
    check-cast v1, La2/a;

    invoke-virtual {v1}, La2/a;->J()V

    goto :goto_3

    :cond_9
    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->e0()I

    move-result p1

    if-eq p1, v12, :cond_b

    if-eq p1, v11, :cond_b

    invoke-virtual {v1}, Lrm/u;->d0()Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_1

    :cond_a
    invoke-virtual {v1, v2}, Lrm/u;->t0(Z)V

    goto :goto_3

    :cond_b
    :goto_1
    invoke-virtual {v1}, Lrm/u;->e0()I

    move-result p1

    if-ne p1, v12, :cond_c

    invoke-virtual {v1}, Lrm/u;->m0()V

    goto :goto_2

    :cond_c
    if-ne p1, v11, :cond_d

    invoke-virtual {v1}, Lrm/u;->Y()I

    move-result p1

    invoke-virtual {v1, p1, v9, v10}, Lrm/u;->q0(IJ)V

    :cond_d
    :goto_2
    invoke-virtual {v1, v12}, Lrm/u;->t0(Z)V

    :cond_e
    :goto_3
    return v12

    :cond_f
    return v2
.end method

.method public final d(Landroidx/recyclerview/widget/i1;)V
    .locals 3

    iget-object v0, p0, Ljo/s;->I0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    invoke-virtual {p0}, Ljo/s;->p()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ljo/s;->M0:Z

    iget-object p1, p0, Ljo/s;->L0:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljo/s;->M0:Z

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Ljo/s;->N0:I

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v2

    neg-int v2, v2

    sub-int/2addr v2, v1

    invoke-virtual {p1, p0, v0, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p0, p1}, Ljo/s;->c(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final e(Lrm/q1;I)Lzr/w0;
    .locals 24

    move-object/from16 v0, p1

    const-string v1, "initialCapacity"

    const/4 v2, 0x4

    invoke-static {v2, v1}, Lzr/q;->c(ILjava/lang/String;)V

    new-array v1, v2, [Ljava/lang/Object;

    iget-object v3, v0, Lrm/q1;->w:Lzr/g0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v5, v7, :cond_1e

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lrm/p1;

    iget v8, v7, Lrm/p1;->y:I

    move/from16 v9, p2

    if-eq v8, v9, :cond_0

    :goto_1
    move-object/from16 v12, p0

    move-object/from16 v17, v3

    goto/16 :goto_16

    :cond_0
    iget-object v8, v7, Lrm/p1;->w:Lsn/w0;

    const/4 v10, 0x0

    :goto_2
    iget v11, v8, Lsn/w0;->w:I

    if-ge v10, v11, :cond_1d

    iget-object v11, v7, Lrm/p1;->x:[I

    aget v11, v11, v10

    if-eq v11, v2, :cond_1

    move-object/from16 v12, p0

    move-object/from16 v17, v3

    move-object/from16 v19, v7

    move-object/from16 v16, v8

    goto/16 :goto_15

    :cond_1
    iget-object v11, v8, Lsn/w0;->y:[Lrm/c0;

    aget-object v11, v11, v10

    move-object/from16 v12, p0

    iget-object v13, v12, Ljo/s;->Q0:Ldb/g;

    iget-object v14, v13, Ldb/g;->b:Landroid/content/res/Resources;

    iget-object v15, v13, Ldb/g;->b:Landroid/content/res/Resources;

    iget-object v2, v11, Lrm/c0;->L:Ljava/lang/String;

    iget v4, v11, Lrm/c0;->H:I

    move-object/from16 v16, v2

    iget v2, v11, Lrm/c0;->Y:I

    move-object/from16 v17, v3

    iget v3, v11, Lrm/c0;->R:I

    move/from16 v18, v6

    iget v6, v11, Lrm/c0;->Q:I

    move-object/from16 v19, v7

    iget-object v7, v11, Lrm/c0;->I:Ljava/lang/String;

    move-object/from16 v20, v7

    invoke-static/range {v16 .. v16}, Llo/m;->g(Ljava/lang/String;)I

    move-result v7

    move-object/from16 v16, v8

    const/4 v8, -0x1

    if-eq v7, v8, :cond_2

    goto :goto_9

    :cond_2
    if-nez v20, :cond_4

    :cond_3
    const/16 v22, 0x0

    goto :goto_4

    :cond_4
    invoke-static/range {v20 .. v20}, Llo/y;->F(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    array-length v9, v7

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v9, :cond_3

    aget-object v22, v7, v8

    invoke-static/range {v22 .. v22}, Llo/m;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    if-eqz v22, :cond_5

    invoke-static/range {v22 .. v22}, Llo/m;->j(Ljava/lang/String;)Z

    move-result v23

    if-eqz v23, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :goto_4
    if-eqz v22, :cond_7

    :cond_6
    :goto_5
    const/4 v7, 0x2

    goto :goto_9

    :cond_7
    if-nez v20, :cond_9

    :cond_8
    const/4 v7, 0x0

    goto :goto_7

    :cond_9
    invoke-static/range {v20 .. v20}, Llo/y;->F(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_6
    if-ge v9, v8, :cond_8

    aget-object v20, v7, v9

    invoke-static/range {v20 .. v20}, Llo/m;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    if-eqz v20, :cond_a

    invoke-static/range {v20 .. v20}, Llo/m;->h(Ljava/lang/String;)Z

    move-result v22

    if-eqz v22, :cond_a

    move-object/from16 v7, v20

    goto :goto_7

    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    :goto_7
    if-eqz v7, :cond_c

    :cond_b
    :goto_8
    const/4 v7, 0x1

    goto :goto_9

    :cond_c
    const/4 v7, -0x1

    if-ne v6, v7, :cond_6

    if-eq v3, v7, :cond_d

    goto :goto_5

    :cond_d
    if-ne v2, v7, :cond_b

    iget v8, v11, Lrm/c0;->Z:I

    if-eq v8, v7, :cond_e

    goto :goto_8

    :cond_e
    const/4 v7, -0x1

    :goto_9
    const v9, 0x7f1404c9

    const-string v20, ""

    const/4 v8, 0x2

    const v21, 0x49742400    # 1000000.0f

    if-ne v7, v8, :cond_12

    invoke-virtual {v13, v11}, Ldb/g;->c(Lrm/c0;)Ljava/lang/String;

    move-result-object v2

    const/4 v7, -0x1

    if-eq v6, v7, :cond_10

    if-ne v3, v7, :cond_f

    goto :goto_a

    :cond_f
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v6, v3}, [Ljava/lang/Object;

    move-result-object v3

    const v6, 0x7f1404cb

    invoke-virtual {v14, v6, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_b

    :cond_10
    :goto_a
    move-object/from16 v3, v20

    :goto_b
    if-ne v4, v7, :cond_11

    :goto_c
    move-object/from16 v4, v20

    goto :goto_d

    :cond_11
    int-to-float v4, v4

    div-float v4, v4, v21

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v15, v9, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    goto :goto_c

    :goto_d
    filled-new-array {v2, v3, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_13

    :cond_12
    const/4 v3, 0x1

    if-ne v7, v3, :cond_1a

    invoke-virtual {v13, v11}, Ldb/g;->a(Lrm/c0;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, -0x1

    if-eq v2, v7, :cond_18

    if-ge v2, v3, :cond_13

    goto :goto_f

    :cond_13
    if-eq v2, v3, :cond_17

    const/4 v8, 0x2

    if-eq v2, v8, :cond_16

    const/4 v3, 0x6

    if-eq v2, v3, :cond_15

    const/4 v3, 0x7

    if-eq v2, v3, :cond_15

    const/16 v3, 0x8

    if-eq v2, v3, :cond_14

    const v2, 0x7f1404d6

    invoke-virtual {v14, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_e
    const/4 v7, -0x1

    goto :goto_10

    :cond_14
    const v2, 0x7f1404d8

    invoke-virtual {v14, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_e

    :cond_15
    const v2, 0x7f1404d7

    invoke-virtual {v14, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_e

    :cond_16
    const v2, 0x7f1404d5

    invoke-virtual {v14, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_e

    :cond_17
    const v2, 0x7f1404ca

    invoke-virtual {v14, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_e

    :cond_18
    :goto_f
    move-object/from16 v2, v20

    goto :goto_e

    :goto_10
    if-ne v4, v7, :cond_19

    :goto_11
    move-object/from16 v3, v20

    goto :goto_12

    :cond_19
    int-to-float v3, v4

    div-float v3, v3, v21

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v15, v9, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    goto :goto_11

    :goto_12
    filled-new-array {v6, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_13

    :cond_1a
    invoke-virtual {v13, v11}, Ldb/g;->a(Lrm/c0;)Ljava/lang/String;

    move-result-object v2

    :goto_13
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_1b

    const v2, 0x7f1404d9

    invoke-virtual {v14, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_1b
    new-instance v3, Ljo/q;

    invoke-direct {v3, v0, v5, v10, v2}, Ljo/q;-><init>(Lrm/q1;IILjava/lang/String;)V

    array-length v2, v1

    add-int/lit8 v6, v18, 0x1

    invoke-static {v2, v6}, Lzr/a0;->e(II)I

    move-result v2

    array-length v4, v1

    if-gt v2, v4, :cond_1c

    goto :goto_14

    :cond_1c
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    :goto_14
    aput-object v3, v1, v18

    :goto_15
    add-int/lit8 v10, v10, 0x1

    move/from16 v9, p2

    move-object/from16 v8, v16

    move-object/from16 v3, v17

    move-object/from16 v7, v19

    const/4 v2, 0x4

    goto/16 :goto_2

    :cond_1d
    move/from16 v18, v6

    goto/16 :goto_1

    :goto_16
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v3, v17

    const/4 v2, 0x4

    goto/16 :goto_0

    :cond_1e
    move-object/from16 v12, p0

    invoke-static {v6, v1}, Lzr/g0;->j(I[Ljava/lang/Object;)Lzr/w0;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget v1, v0, Ldb/c0;->t:I

    const/4 v2, 0x3

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ldb/c0;->h()V

    iget-boolean v1, v0, Ldb/c0;->w:Z

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Ldb/c0;->k(I)V

    return-void

    :cond_1
    iget v1, v0, Ldb/c0;->t:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    iget-object v0, v0, Ldb/c0;->m:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :cond_2
    iget-object v0, v0, Ldb/c0;->n:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    :cond_3
    :goto_0
    return-void
.end method

.method public final g()Z
    .locals 2

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget v1, v0, Ldb/c0;->t:I

    if-nez v1, :cond_0

    iget-object v0, v0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v0, Ljo/s;

    invoke-virtual {v0}, Ljo/s;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPlayer()Lrm/b1;
    .locals 1

    iget-object v0, p0, Ljo/s;->r0:Lrm/b1;

    return-object v0
.end method

.method public getRepeatToggleModes()I
    .locals 1

    iget v0, p0, Ljo/s;->A0:I

    return v0
.end method

.method public getShowShuffleButton()Z
    .locals 2

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, p0, Ljo/s;->K:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ldb/c0;->b(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public getShowSubtitleButton()Z
    .locals 2

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, p0, Ljo/s;->R0:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ldb/c0;->b(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public getShowTimeoutMs()I
    .locals 1

    iget v0, p0, Ljo/s;->y0:I

    return v0
.end method

.method public getShowVrButton()Z
    .locals 2

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, p0, Ljo/s;->L:Landroid/view/View;

    invoke-virtual {v0, v1}, Ldb/c0;->b(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public final h()Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final i()V
    .locals 0

    invoke-virtual {p0}, Ljo/s;->l()V

    invoke-virtual {p0}, Ljo/s;->k()V

    invoke-virtual {p0}, Ljo/s;->o()V

    invoke-virtual {p0}, Ljo/s;->q()V

    invoke-virtual {p0}, Ljo/s;->s()V

    invoke-virtual {p0}, Ljo/s;->m()V

    invoke-virtual {p0}, Ljo/s;->r()V

    return-void
.end method

.method public final j(Landroid/view/View;Z)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    if-eqz p2, :cond_1

    iget p2, p0, Ljo/s;->f0:F

    goto :goto_0

    :cond_1
    iget p2, p0, Ljo/s;->g0:F

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final k()V
    .locals 12

    invoke-virtual {p0}, Ljo/s;->h()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Ljo/s;->u0:Z

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Ljo/s;->r0:Lrm/b1;

    if-eqz v0, :cond_1

    check-cast v0, La2/a;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, La2/a;->A(I)Z

    move-result v1

    const/4 v2, 0x7

    invoke-virtual {v0, v2}, La2/a;->A(I)Z

    move-result v2

    const/16 v3, 0xb

    invoke-virtual {v0, v3}, La2/a;->A(I)Z

    move-result v3

    const/16 v4, 0xc

    invoke-virtual {v0, v4}, La2/a;->A(I)Z

    move-result v4

    const/16 v5, 0x9

    invoke-virtual {v0, v5}, La2/a;->A(I)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    move v0, v1

    move v2, v0

    move v3, v2

    move v4, v3

    :goto_0
    iget-object v5, p0, Ljo/s;->H0:Landroid/content/res/Resources;

    iget-object v6, p0, Ljo/s;->G:Landroid/view/View;

    const-wide/16 v7, 0x3e8

    if-eqz v3, :cond_4

    iget-object v9, p0, Ljo/s;->r0:Lrm/b1;

    if-eqz v9, :cond_2

    check-cast v9, Lrm/u;

    invoke-virtual {v9}, Lrm/u;->B0()V

    iget-wide v9, v9, Lrm/u;->V:J

    goto :goto_1

    :cond_2
    const-wide/16 v9, 0x1388

    :goto_1
    div-long/2addr v9, v7

    long-to-int v9, v9

    iget-object v10, p0, Ljo/s;->I:Landroid/widget/TextView;

    if-eqz v10, :cond_3

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    if-eqz v6, :cond_4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    const v11, 0x7f120006

    invoke-virtual {v5, v11, v9, v10}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_4
    iget-object v9, p0, Ljo/s;->F:Landroid/view/View;

    if-eqz v4, :cond_7

    iget-object v10, p0, Ljo/s;->r0:Lrm/b1;

    if-eqz v10, :cond_5

    check-cast v10, Lrm/u;

    invoke-virtual {v10}, Lrm/u;->B0()V

    iget-wide v10, v10, Lrm/u;->W:J

    goto :goto_2

    :cond_5
    const-wide/16 v10, 0x3a98

    :goto_2
    div-long/2addr v10, v7

    long-to-int v7, v10

    iget-object v8, p0, Ljo/s;->H:Landroid/widget/TextView;

    if-eqz v8, :cond_6

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    if-eqz v9, :cond_7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    const v10, 0x7f120005

    invoke-virtual {v5, v10, v7, v8}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_7
    iget-object v5, p0, Ljo/s;->y:Landroid/view/View;

    invoke-virtual {p0, v5, v2}, Ljo/s;->j(Landroid/view/View;Z)V

    invoke-virtual {p0, v6, v3}, Ljo/s;->j(Landroid/view/View;Z)V

    invoke-virtual {p0, v9, v4}, Ljo/s;->j(Landroid/view/View;Z)V

    iget-object v2, p0, Ljo/s;->z:Landroid/view/View;

    invoke-virtual {p0, v2, v0}, Ljo/s;->j(Landroid/view/View;Z)V

    iget-object v0, p0, Ljo/s;->O:Ljo/a0;

    if-eqz v0, :cond_8

    check-cast v0, Ljo/e;

    invoke-virtual {v0, v1}, Ljo/e;->setEnabled(Z)V

    :cond_8
    :goto_3
    return-void
.end method

.method public final l()V
    .locals 4

    invoke-virtual {p0}, Ljo/s;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ljo/s;->u0:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljo/s;->E:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v1, p0, Ljo/s;->r0:Lrm/b1;

    iget-object v2, p0, Ljo/s;->H0:Landroid/content/res/Resources;

    if-eqz v1, :cond_1

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->e0()I

    move-result v1

    const/4 v3, 0x4

    if-eq v1, v3, :cond_1

    iget-object v1, p0, Ljo/s;->r0:Lrm/b1;

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->e0()I

    move-result v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    iget-object v1, p0, Ljo/s;->r0:Lrm/b1;

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->d0()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    const v3, 0x7f080445

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const v1, 0x7f1404af

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    const v3, 0x7f080446

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const v1, 0x7f1404b0

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final m()V
    .locals 8

    iget-object v0, p0, Ljo/s;->r0:Lrm/b1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-object v0, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->n:Lrm/w0;

    iget v0, v0, Lrm/w0;->w:F

    const/4 v1, 0x0

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    move v3, v1

    move v4, v3

    :goto_0
    iget-object v5, p0, Ljo/s;->K0:Ldb/o;

    iget-object v6, v5, Ldb/o;->c:[F

    array-length v7, v6

    if-ge v3, v7, :cond_2

    aget v5, v6, v3

    sub-float v5, v0, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpg-float v6, v5, v2

    if-gez v6, :cond_1

    move v4, v3

    move v2, v5

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iput v4, v5, Ldb/o;->d:I

    iget-object v0, v5, Ldb/o;->b:[Ljava/lang/String;

    aget-object v0, v0, v4

    iget-object v2, p0, Ljo/s;->J0:Ldb/r;

    iget-object v2, v2, Ldb/r;->c:[Ljava/lang/String;

    aput-object v0, v2, v1

    return-void
.end method

.method public final n()V
    .locals 13

    invoke-virtual {p0}, Ljo/s;->h()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-boolean v0, p0, Ljo/s;->u0:Z

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Ljo/s;->r0:Lrm/b1;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_5

    iget-wide v3, p0, Ljo/s;->F0:J

    move-object v5, v0

    check-cast v5, Lrm/u;

    invoke-virtual {v5}, Lrm/u;->V()J

    move-result-wide v6

    add-long/2addr v6, v3

    iget-wide v3, p0, Ljo/s;->F0:J

    invoke-virtual {v5}, Lrm/u;->B0()V

    iget-object v8, v5, Lrm/u;->K0:Lrm/v0;

    iget-object v8, v8, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v8}, Lrm/o1;->p()Z

    move-result v8

    if-eqz v8, :cond_1

    iget-wide v1, v5, Lrm/u;->M0:J

    goto :goto_1

    :cond_1
    iget-object v8, v5, Lrm/u;->K0:Lrm/v0;

    iget-object v9, v8, Lrm/v0;->k:Lsn/v;

    iget-wide v9, v9, Lsn/t;->d:J

    iget-object v11, v8, Lrm/v0;->b:Lsn/v;

    iget-wide v11, v11, Lsn/t;->d:J

    cmp-long v9, v9, v11

    if-eqz v9, :cond_2

    iget-object v8, v8, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v5}, Lrm/u;->Y()I

    move-result v9

    iget-object v5, v5, La2/a;->x:Ljava/lang/Object;

    check-cast v5, Lrm/n1;

    invoke-virtual {v8, v9, v5, v1, v2}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v1

    iget-wide v1, v1, Lrm/n1;->N:J

    invoke-static {v1, v2}, Llo/y;->G(J)J

    move-result-wide v1

    goto :goto_1

    :cond_2
    iget-wide v1, v8, Lrm/v0;->q:J

    iget-object v8, v5, Lrm/u;->K0:Lrm/v0;

    iget-object v8, v8, Lrm/v0;->k:Lsn/v;

    invoke-virtual {v8}, Lsn/t;->a()Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object v1, v5, Lrm/u;->K0:Lrm/v0;

    iget-object v2, v1, Lrm/v0;->a:Lrm/o1;

    iget-object v1, v1, Lrm/v0;->k:Lsn/v;

    iget-object v1, v1, Lsn/t;->a:Ljava/lang/Object;

    iget-object v8, v5, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v2, v1, v8}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v1

    iget-object v2, v5, Lrm/u;->K0:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->k:Lsn/v;

    iget v2, v2, Lsn/t;->b:I

    invoke-virtual {v1, v2}, Lrm/m1;->d(I)J

    move-result-wide v8

    const-wide/high16 v10, -0x8000000000000000L

    cmp-long v2, v8, v10

    if-nez v2, :cond_3

    iget-wide v1, v1, Lrm/m1;->z:J

    goto :goto_0

    :cond_3
    move-wide v1, v8

    :cond_4
    :goto_0
    iget-object v8, v5, Lrm/u;->K0:Lrm/v0;

    iget-object v9, v8, Lrm/v0;->a:Lrm/o1;

    iget-object v8, v8, Lrm/v0;->k:Lsn/v;

    iget-object v8, v8, Lsn/t;->a:Ljava/lang/Object;

    iget-object v5, v5, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v9, v8, v5}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget-wide v8, v5, Lrm/m1;->E:J

    add-long/2addr v1, v8

    invoke-static {v1, v2}, Llo/y;->G(J)J

    move-result-wide v1

    :goto_1
    add-long/2addr v1, v3

    move-wide v3, v1

    move-wide v1, v6

    goto :goto_2

    :cond_5
    move-wide v3, v1

    :goto_2
    iget-object v5, p0, Ljo/s;->N:Landroid/widget/TextView;

    if-eqz v5, :cond_6

    iget-boolean v6, p0, Ljo/s;->x0:Z

    if-nez v6, :cond_6

    iget-object v6, p0, Ljo/s;->P:Ljava/lang/StringBuilder;

    iget-object v7, p0, Ljo/s;->Q:Ljava/util/Formatter;

    invoke-static {v6, v7, v1, v2}, Llo/y;->u(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    iget-object v5, p0, Ljo/s;->O:Ljo/a0;

    if-eqz v5, :cond_7

    check-cast v5, Ljo/e;

    invoke-virtual {v5, v1, v2}, Ljo/e;->setPosition(J)V

    iget-object v5, p0, Ljo/s;->O:Ljo/a0;

    check-cast v5, Ljo/e;

    invoke-virtual {v5, v3, v4}, Ljo/e;->setBufferedPosition(J)V

    :cond_7
    iget-object v3, p0, Ljo/s;->T:Lio/sentry/c7;

    invoke-virtual {p0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v3, 0x1

    if-nez v0, :cond_8

    move v4, v3

    goto :goto_3

    :cond_8
    move-object v4, v0

    check-cast v4, Lrm/u;

    invoke-virtual {v4}, Lrm/u;->e0()I

    move-result v4

    :goto_3
    const-wide/16 v5, 0x3e8

    if-eqz v0, :cond_b

    move-object v7, v0

    check-cast v7, La2/a;

    check-cast v7, Lrm/u;

    invoke-virtual {v7}, Lrm/u;->e0()I

    move-result v8

    const/4 v9, 0x3

    if-ne v8, v9, :cond_b

    invoke-virtual {v7}, Lrm/u;->d0()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v7}, Lrm/u;->B0()V

    iget-object v7, v7, Lrm/u;->K0:Lrm/v0;

    iget v7, v7, Lrm/v0;->m:I

    if-nez v7, :cond_b

    iget-object v3, p0, Ljo/s;->O:Ljo/a0;

    if-eqz v3, :cond_9

    check-cast v3, Ljo/e;

    invoke-virtual {v3}, Ljo/e;->getPreferredUpdateDelay()J

    move-result-wide v3

    goto :goto_4

    :cond_9
    move-wide v3, v5

    :goto_4
    rem-long/2addr v1, v5

    sub-long v1, v5, v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-object v0, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->n:Lrm/w0;

    iget v0, v0, Lrm/w0;->w:F

    const/4 v3, 0x0

    cmpl-float v3, v0, v3

    if-lez v3, :cond_a

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-long v5, v1

    :cond_a
    move-wide v7, v5

    iget v0, p0, Ljo/s;->z0:I

    int-to-long v9, v0

    const-wide/16 v11, 0x3e8

    invoke-static/range {v7 .. v12}, Llo/y;->i(JJJ)J

    move-result-wide v0

    iget-object v2, p0, Ljo/s;->T:Lio/sentry/c7;

    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_b
    const/4 v0, 0x4

    if-eq v4, v0, :cond_c

    if-eq v4, v3, :cond_c

    iget-object v0, p0, Ljo/s;->T:Lio/sentry/c7;

    invoke-virtual {p0, v0, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_c
    :goto_5
    return-void
.end method

.method public final o()V
    .locals 5

    invoke-virtual {p0}, Ljo/s;->h()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Ljo/s;->u0:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Ljo/s;->J:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Ljo/s;->A0:I

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {p0, v0, v2}, Ljo/s;->j(Landroid/view/View;Z)V

    return-void

    :cond_1
    iget-object v1, p0, Ljo/s;->r0:Lrm/b1;

    iget-object v3, p0, Ljo/s;->a0:Ljava/lang/String;

    iget-object v4, p0, Ljo/s;->U:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_2

    invoke-virtual {p0, v0, v2}, Ljo/s;->j(Landroid/view/View;Z)V

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2}, Ljo/s;->j(Landroid/view/View;Z)V

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->B0()V

    iget v1, v1, Lrm/u;->g0:I

    if-eqz v1, :cond_5

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Ljo/s;->W:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Ljo/s;->c0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_4
    iget-object v1, p0, Ljo/s;->V:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Ljo/s;->b0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_5
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, v0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v1, Ljo/s;

    iget-object v2, v0, Ldb/c0;->D:Landroid/view/View$OnLayoutChangeListener;

    check-cast v2, Ldb/k;

    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Ljo/s;->u0:Z

    invoke-virtual {p0}, Ljo/s;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ldb/c0;->i()V

    :cond_0
    invoke-virtual {p0}, Ljo/s;->i()V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, v0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v1, Ljo/s;

    iget-object v2, v0, Ldb/c0;->D:Landroid/view/View$OnLayoutChangeListener;

    check-cast v2, Ldb/k;

    invoke-virtual {v1, v2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const/4 v1, 0x0

    iput-boolean v1, p0, Ljo/s;->u0:Z

    iget-object v1, p0, Ljo/s;->T:Lio/sentry/c7;

    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v0}, Ldb/c0;->h()V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    move-object p1, p0

    iget-object v0, p1, Ljo/s;->G0:Ldb/c0;

    iget-object v0, v0, Ldb/c0;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {v0, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method public final p()V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Ljo/s;->I0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v2, p0, Ljo/s;->N0:I

    mul-int/lit8 v3, v2, 0x2

    sub-int/2addr v0, v3

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v3, p0, Ljo/s;->L0:Landroid/widget/PopupWindow;

    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v0, v2

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    return-void
.end method

.method public final q()V
    .locals 5

    invoke-virtual {p0}, Ljo/s;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Ljo/s;->u0:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Ljo/s;->K:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ljo/s;->r0:Lrm/b1;

    iget-object v2, p0, Ljo/s;->G0:Ldb/c0;

    invoke-virtual {v2, v0}, Ldb/c0;->b(Landroid/view/View;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-virtual {p0, v0, v3}, Ljo/s;->j(Landroid/view/View;Z)V

    return-void

    :cond_1
    iget-object v2, p0, Ljo/s;->i0:Ljava/lang/String;

    iget-object v4, p0, Ljo/s;->e0:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_2

    invoke-virtual {p0, v0, v3}, Ljo/s;->j(Landroid/view/View;Z)V

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    const/4 v3, 0x1

    invoke-virtual {p0, v0, v3}, Ljo/s;->j(Landroid/view/View;Z)V

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->B0()V

    iget-boolean v3, v1, Lrm/u;->h0:Z

    if-eqz v3, :cond_3

    iget-object v4, p0, Ljo/s;->d0:Landroid/graphics/drawable/Drawable;

    :cond_3
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, Lrm/u;->B0()V

    iget-boolean v1, v1, Lrm/u;->h0:Z

    if-eqz v1, :cond_4

    iget-object v2, p0, Ljo/s;->h0:Ljava/lang/String;

    :cond_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final r()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Ljo/s;->r0:Lrm/b1;

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-boolean v2, v0, Ljo/s;->v0:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    iget-object v7, v0, Ljo/s;->S:Lrm/n1;

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v2, :cond_4

    move-object v2, v1

    check-cast v2, Lrm/u;

    invoke-virtual {v2}, Lrm/u;->b0()Lrm/o1;

    move-result-object v2

    invoke-virtual {v2}, Lrm/o1;->o()I

    move-result v10

    const/16 v11, 0x64

    if-le v10, v11, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lrm/o1;->o()I

    move-result v10

    move v11, v8

    :goto_0
    if-ge v11, v10, :cond_3

    invoke-virtual {v2, v11, v7, v5, v6}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v12

    iget-wide v12, v12, Lrm/n1;->N:J

    cmp-long v12, v12, v3

    if-nez v12, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_3
    move v2, v9

    goto :goto_2

    :cond_4
    :goto_1
    move v2, v8

    :goto_2
    iput-boolean v2, v0, Ljo/s;->w0:Z

    iput-wide v5, v0, Ljo/s;->F0:J

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->b0()Lrm/o1;

    move-result-object v2

    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v10

    if-nez v10, :cond_15

    invoke-virtual {v1}, Lrm/u;->Y()I

    move-result v1

    iget-boolean v10, v0, Ljo/s;->w0:Z

    if-eqz v10, :cond_5

    move v11, v8

    goto :goto_3

    :cond_5
    move v11, v1

    :goto_3
    if-eqz v10, :cond_6

    invoke-virtual {v2}, Lrm/o1;->o()I

    move-result v10

    sub-int/2addr v10, v9

    goto :goto_4

    :cond_6
    move v10, v1

    :goto_4
    move-wide v12, v5

    move v14, v8

    :goto_5
    if-gt v11, v10, :cond_8

    move-wide v15, v3

    if-ne v11, v1, :cond_7

    invoke-static {v12, v13}, Llo/y;->G(J)J

    move-result-wide v3

    iput-wide v3, v0, Ljo/s;->F0:J

    :cond_7
    invoke-virtual {v2, v11, v7}, Lrm/o1;->n(ILrm/n1;)V

    iget-wide v3, v7, Lrm/n1;->N:J

    cmp-long v3, v3, v15

    if-nez v3, :cond_9

    iget-boolean v1, v0, Ljo/s;->w0:Z

    xor-int/2addr v1, v9

    invoke-static {v1}, Llo/a;->i(Z)V

    :cond_8
    move v2, v9

    goto/16 :goto_d

    :cond_9
    iget v3, v7, Lrm/n1;->O:I

    :goto_6
    iget v4, v7, Lrm/n1;->P:I

    if-gt v3, v4, :cond_14

    iget-object v4, v0, Ljo/s;->R:Lrm/m1;

    invoke-virtual {v2, v3, v4, v8}, Lrm/o1;->f(ILrm/m1;Z)Lrm/m1;

    move-wide/from16 v17, v5

    iget-object v5, v4, Lrm/m1;->G:Ltn/b;

    iget v6, v5, Ltn/b;->z:I

    iget v5, v5, Ltn/b;->w:I

    :goto_7
    if-ge v6, v5, :cond_13

    invoke-virtual {v4, v6}, Lrm/m1;->d(I)J

    move-result-wide v19

    const-wide/high16 v21, -0x8000000000000000L

    cmp-long v21, v19, v21

    if-nez v21, :cond_c

    iget-wide v8, v4, Lrm/m1;->z:J

    cmp-long v19, v8, v15

    if-nez v19, :cond_b

    :cond_a
    move/from16 v16, v1

    move-object/from16 v24, v2

    const/4 v2, 0x1

    goto/16 :goto_c

    :cond_b
    move-wide/from16 v19, v8

    :cond_c
    iget-wide v8, v4, Lrm/m1;->E:J

    add-long v19, v19, v8

    cmp-long v8, v19, v17

    if-ltz v8, :cond_a

    iget-object v8, v0, Ljo/s;->B0:[J

    array-length v9, v8

    if-ne v14, v9, :cond_e

    array-length v9, v8

    if-nez v9, :cond_d

    const/4 v9, 0x1

    goto :goto_8

    :cond_d
    array-length v9, v8

    mul-int/lit8 v9, v9, 0x2

    :goto_8
    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v8

    iput-object v8, v0, Ljo/s;->B0:[J

    iget-object v8, v0, Ljo/s;->C0:[Z

    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v8

    iput-object v8, v0, Ljo/s;->C0:[Z

    :cond_e
    iget-object v8, v0, Ljo/s;->B0:[J

    add-long v19, v12, v19

    invoke-static/range {v19 .. v20}, Llo/y;->G(J)J

    move-result-wide v19

    aput-wide v19, v8, v14

    iget-object v8, v0, Ljo/s;->C0:[Z

    iget-object v9, v4, Lrm/m1;->G:Ltn/b;

    invoke-virtual {v9, v6}, Ltn/b;->a(I)Ltn/a;

    move-result-object v9

    iget v15, v9, Ltn/a;->x:I

    move/from16 v16, v1

    const/4 v1, -0x1

    if-ne v15, v1, :cond_f

    move-object/from16 v24, v2

    const/4 v2, 0x1

    const/16 v22, 0x1

    goto :goto_b

    :cond_f
    const/4 v1, 0x0

    :goto_9
    if-ge v1, v15, :cond_12

    move/from16 v23, v1

    iget-object v1, v9, Ltn/a;->z:[I

    aget v1, v1, v23

    move-object/from16 v24, v2

    const/4 v2, 0x1

    if-eqz v1, :cond_11

    if-ne v1, v2, :cond_10

    goto :goto_a

    :cond_10
    add-int/lit8 v1, v23, 0x1

    move-object/from16 v2, v24

    goto :goto_9

    :cond_11
    :goto_a
    move/from16 v22, v2

    goto :goto_b

    :cond_12
    move-object/from16 v24, v2

    const/4 v2, 0x1

    const/16 v22, 0x0

    :goto_b
    xor-int/lit8 v1, v22, 0x1

    aput-boolean v1, v8, v14

    add-int/lit8 v14, v14, 0x1

    :goto_c
    add-int/lit8 v6, v6, 0x1

    move v9, v2

    move/from16 v1, v16

    move-object/from16 v2, v24

    const/4 v8, 0x0

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_7

    :cond_13
    move/from16 v16, v1

    move-object/from16 v24, v2

    move v2, v9

    add-int/lit8 v3, v3, 0x1

    move-wide/from16 v5, v17

    move-object/from16 v2, v24

    const/4 v8, 0x0

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_6

    :cond_14
    move/from16 v16, v1

    move-object/from16 v24, v2

    move-wide/from16 v17, v5

    move v2, v9

    iget-wide v3, v7, Lrm/n1;->N:J

    add-long/2addr v12, v3

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, v24

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    goto/16 :goto_5

    :goto_d
    move-wide v5, v12

    goto :goto_e

    :cond_15
    move-wide/from16 v17, v5

    move v2, v9

    const/4 v14, 0x0

    :goto_e
    invoke-static {v5, v6}, Llo/y;->G(J)J

    move-result-wide v3

    iget-object v1, v0, Ljo/s;->M:Landroid/widget/TextView;

    if-eqz v1, :cond_16

    iget-object v5, v0, Ljo/s;->P:Ljava/lang/StringBuilder;

    iget-object v6, v0, Ljo/s;->Q:Ljava/util/Formatter;

    invoke-static {v5, v6, v3, v4}, Llo/y;->u(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_16
    iget-object v1, v0, Ljo/s;->O:Ljo/a0;

    if-eqz v1, :cond_1a

    check-cast v1, Ljo/e;

    invoke-virtual {v1, v3, v4}, Ljo/e;->setDuration(J)V

    iget-object v3, v0, Ljo/s;->D0:[J

    array-length v4, v3

    add-int v5, v14, v4

    iget-object v6, v0, Ljo/s;->B0:[J

    array-length v7, v6

    if-le v5, v7, :cond_17

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v6

    iput-object v6, v0, Ljo/s;->B0:[J

    iget-object v6, v0, Ljo/s;->C0:[Z

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v6

    iput-object v6, v0, Ljo/s;->C0:[Z

    :cond_17
    iget-object v6, v0, Ljo/s;->B0:[J

    const/4 v7, 0x0

    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v0, Ljo/s;->E0:[Z

    iget-object v6, v0, Ljo/s;->C0:[Z

    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v0, Ljo/s;->B0:[J

    iget-object v4, v0, Ljo/s;->C0:[Z

    if-eqz v5, :cond_19

    if-eqz v3, :cond_18

    if-eqz v4, :cond_18

    goto :goto_f

    :cond_18
    move v8, v7

    goto :goto_10

    :cond_19
    :goto_f
    move v8, v2

    :goto_10
    invoke-static {v8}, Llo/a;->e(Z)V

    iput v5, v1, Ljo/e;->p0:I

    iput-object v3, v1, Ljo/e;->q0:[J

    iput-object v4, v1, Ljo/e;->r0:[Z

    invoke-virtual {v1}, Ljo/e;->e()V

    :cond_1a
    invoke-virtual {v0}, Ljo/s;->n()V

    return-void
.end method

.method public final s()V
    .locals 11

    iget-object v0, p0, Ljo/s;->O0:Ljo/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Ldb/v;->b:Ljava/util/List;

    iget-object v2, p0, Ljo/s;->P0:Ljo/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v2, Ldb/v;->b:Ljava/util/List;

    iget-object v1, p0, Ljo/s;->r0:Lrm/b1;

    iget-object v3, p0, Ljo/s;->R0:Landroid/widget/ImageView;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_6

    const/16 v6, 0x1e

    check-cast v1, La2/a;

    invoke-virtual {v1, v6}, La2/a;->A(I)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Ljo/s;->r0:Lrm/b1;

    const/16 v6, 0x1d

    check-cast v1, La2/a;

    invoke-virtual {v1, v6}, La2/a;->A(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v1, p0, Ljo/s;->r0:Lrm/b1;

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->B0()V

    iget-object v1, v1, Lrm/u;->K0:Lrm/v0;

    iget-object v1, v1, Lrm/v0;->i:Lio/x;

    iget-object v1, v1, Lio/x;->d:Lrm/q1;

    invoke-virtual {p0, v1, v5}, Ljo/s;->e(Lrm/q1;I)Lzr/w0;

    move-result-object v6

    iput-object v6, v2, Ldb/v;->b:Ljava/util/List;

    iget-object v7, v2, Ljo/k;->e:Ljo/s;

    iget-object v8, v7, Ljo/s;->r0:Lrm/b1;

    iget-object v9, v7, Ljo/s;->J0:Ldb/r;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v8, Lrm/u;

    invoke-virtual {v8}, Lrm/u;->g0()Lio/f;

    move-result-object v8

    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v6, 0x7f1404d1

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v6, v9, Ldb/r;->c:[Ljava/lang/String;

    aput-object v2, v6, v5

    goto :goto_1

    :cond_1
    iget-object v8, v8, Lio/w;->X:Lio/u;

    invoke-virtual {v2, v8}, Ljo/k;->f(Lio/u;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v6, 0x7f1404d0

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v6, v9, Ldb/r;->c:[Ljava/lang/String;

    aput-object v2, v6, v5

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_0
    iget v7, v6, Lzr/w0;->z:I

    if-ge v2, v7, :cond_4

    invoke-virtual {v6, v2}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljo/q;

    iget-object v8, v7, Ljo/q;->a:Lrm/p1;

    iget v10, v7, Ljo/q;->b:I

    iget-object v8, v8, Lrm/p1;->z:[Z

    aget-boolean v8, v8, v10

    if-eqz v8, :cond_3

    iget-object v2, v7, Ljo/q;->c:Ljava/lang/String;

    iget-object v6, v9, Ldb/r;->c:[Ljava/lang/String;

    aput-object v2, v6, v5

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    iget-object v2, p0, Ljo/s;->G0:Ldb/c0;

    invoke-virtual {v2, v3}, Ldb/c0;->b(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Ljo/s;->e(Lrm/q1;I)Lzr/w0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljo/k;->g(Ljava/util/List;)V

    goto :goto_2

    :cond_5
    sget-object v1, Lzr/w0;->E:Lzr/w0;

    invoke-virtual {v0, v1}, Ljo/k;->g(Ljava/util/List;)V

    :cond_6
    :goto_2
    invoke-virtual {v0}, Ldb/v;->getItemCount()I

    move-result v0

    if-lez v0, :cond_7

    move v4, v5

    :cond_7
    invoke-virtual {p0, v3, v4}, Ljo/s;->j(Landroid/view/View;Z)V

    return-void
.end method

.method public setAnimationEnabled(Z)V
    .locals 1

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iput-boolean p1, v0, Ldb/c0;->w:Z

    return-void
.end method

.method public setOnFullScreenModeChangedListener(Ljo/m;)V
    .locals 5

    iput-object p1, p0, Ljo/s;->s0:Ljo/m;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const/16 v3, 0x8

    iget-object v4, p0, Ljo/s;->S0:Landroid/widget/ImageView;

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    move v1, v0

    :goto_2
    iget-object p1, p0, Ljo/s;->T0:Landroid/widget/ImageView;

    if-nez p1, :cond_4

    return-void

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_5
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public setPlayer(Lrm/b1;)V
    .locals 4

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Llo/a;->i(Z)V

    if-eqz p1, :cond_1

    move-object v0, p1

    check-cast v0, Lrm/u;

    iget-object v0, v0, Lrm/u;->T:Landroid/os/Looper;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    :cond_1
    move v2, v3

    :cond_2
    invoke-static {v2}, Llo/a;->e(Z)V

    iget-object v0, p0, Ljo/s;->r0:Lrm/b1;

    if-ne v0, p1, :cond_3

    return-void

    :cond_3
    iget-object v1, p0, Ljo/s;->w:Ljo/l;

    if-eqz v0, :cond_4

    check-cast v0, Lrm/u;

    invoke-virtual {v0, v1}, Lrm/u;->o0(Lrm/z0;)V

    :cond_4
    iput-object p1, p0, Ljo/s;->r0:Lrm/b1;

    if-eqz p1, :cond_5

    check-cast p1, Lrm/u;

    invoke-virtual {p1, v1}, Lrm/u;->Q(Lrm/z0;)V

    :cond_5
    invoke-virtual {p0}, Ljo/s;->i()V

    return-void
.end method

.method public setProgressUpdateListener(Ljo/n;)V
    .locals 0

    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 4

    iput p1, p0, Ljo/s;->A0:I

    iget-object v0, p0, Ljo/s;->r0:Lrm/b1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget v0, v0, Lrm/u;->g0:I

    if-nez p1, :cond_0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljo/s;->r0:Lrm/b1;

    check-cast v0, Lrm/u;

    invoke-virtual {v0, v1}, Lrm/u;->u0(I)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    if-ne p1, v2, :cond_1

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Ljo/s;->r0:Lrm/b1;

    check-cast v0, Lrm/u;

    invoke-virtual {v0, v2}, Lrm/u;->u0(I)V

    goto :goto_0

    :cond_1
    if-ne p1, v3, :cond_2

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Ljo/s;->r0:Lrm/b1;

    check-cast v0, Lrm/u;

    invoke-virtual {v0, v3}, Lrm/u;->u0(I)V

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    move v1, v2

    :cond_3
    iget-object p1, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v0, p0, Ljo/s;->J:Landroid/widget/ImageView;

    invoke-virtual {p1, v0, v1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ljo/s;->o()V

    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 2

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, p0, Ljo/s;->F:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ljo/s;->k()V

    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 0

    iput-boolean p1, p0, Ljo/s;->v0:Z

    invoke-virtual {p0}, Ljo/s;->r()V

    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 2

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, p0, Ljo/s;->z:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ljo/s;->k()V

    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 2

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, p0, Ljo/s;->y:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ljo/s;->k()V

    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 2

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, p0, Ljo/s;->G:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ljo/s;->k()V

    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 2

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, p0, Ljo/s;->K:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ljo/s;->q()V

    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .locals 2

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, p0, Ljo/s;->R0:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    return-void
.end method

.method public setShowTimeoutMs(I)V
    .locals 0

    iput p1, p0, Ljo/s;->y0:I

    invoke-virtual {p0}, Ljo/s;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ljo/s;->G0:Ldb/c0;

    invoke-virtual {p1}, Ldb/c0;->i()V

    :cond_0
    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 2

    iget-object v0, p0, Ljo/s;->G0:Ldb/c0;

    iget-object v1, p0, Ljo/s;->L:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    return-void
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .locals 2

    const/16 v0, 0x10

    const/16 v1, 0x3e8

    invoke-static {p1, v0, v1}, Llo/y;->h(III)I

    move-result p1

    iput p1, p0, Ljo/s;->z0:I

    return-void
.end method

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Ljo/s;->L:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, v0, p1}, Ljo/s;->j(Landroid/view/View;Z)V

    :cond_1
    return-void
.end method
