.class public Landroidx/media3/ui/LegacyPlayerControlView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic E0:I


# instance fields
.field public final A0:[J

.field public final B0:[Z

.field public C0:J

.field public D0:J

.field public final E:Landroid/view/View;

.field public final F:Landroid/view/View;

.field public final G:Landroid/view/View;

.field public final H:Landroid/view/View;

.field public final I:Landroid/widget/ImageView;

.field public final J:Landroid/widget/ImageView;

.field public final K:Landroid/view/View;

.field public final L:Landroid/widget/TextView;

.field public final M:Landroid/widget/TextView;

.field public final N:Ldb/r0;

.field public final O:Ljava/lang/StringBuilder;

.field public final P:Ljava/util/Formatter;

.field public final Q:Lu8/m0;

.field public final R:Lu8/n0;

.field public final S:Ldb/h;

.field public final T:Ldb/h;

.field public final U:Landroid/graphics/drawable/Drawable;

.field public final V:Landroid/graphics/drawable/Drawable;

.field public final W:Landroid/graphics/drawable/Drawable;

.field public final a0:Ljava/lang/String;

.field public final b0:Ljava/lang/String;

.field public final c0:Ljava/lang/String;

.field public final d0:Landroid/graphics/drawable/Drawable;

.field public final e0:Landroid/graphics/drawable/Drawable;

.field public final f0:F

.field public final g0:F

.field public final h0:Ljava/lang/String;

.field public final i0:Ljava/lang/String;

.field public j0:Lu8/j0;

.field public k0:Z

.field public l0:Z

.field public m0:Z

.field public n0:Z

.field public o0:Z

.field public p0:I

.field public q0:I

.field public r0:I

.field public s0:Z

.field public t0:Z

.field public u0:Z

.field public v0:Z

.field public final w:Ldb/i;

.field public w0:Z

.field public final x:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public x0:J

.field public final y:Landroid/view/View;

.field public y0:[J

.field public final z:Landroid/view/View;

.field public z0:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.ui"

    invoke-static {v0}, Lu8/y;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->m0:Z

    const/16 v2, 0x1388

    iput v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->p0:I

    iput v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r0:I

    const/16 v2, 0xc8

    iput v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->q0:I

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->x0:J

    iput-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->s0:Z

    iput-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->t0:Z

    iput-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->u0:Z

    iput-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->v0:Z

    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->w0:Z

    const v1, 0x7f0d0175

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    sget-object v5, Ldb/i0;->c:[I

    invoke-virtual {v4, p2, v5, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v4

    :try_start_0
    iget v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->p0:I

    const/16 v6, 0x13

    invoke-virtual {v4, v6, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    iput v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->p0:I

    const/4 v5, 0x5

    invoke-virtual {v4, v5, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iget v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r0:I

    const/16 v6, 0x8

    invoke-virtual {v4, v6, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    iput v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r0:I

    iget-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->s0:Z

    const/16 v6, 0x11

    invoke-virtual {v4, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->s0:Z

    iget-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->t0:Z

    const/16 v6, 0xe

    invoke-virtual {v4, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->t0:Z

    iget-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->u0:Z

    const/16 v6, 0x10

    invoke-virtual {v4, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->u0:Z

    iget-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->v0:Z

    const/16 v6, 0xf

    invoke-virtual {v4, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->v0:Z

    iget-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->w0:Z

    const/16 v6, 0x12

    invoke-virtual {v4, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->w0:Z

    iget v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->q0:I

    const/16 v6, 0x14

    invoke-virtual {v4, v6, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    invoke-virtual {p0, v5}, Landroidx/media3/ui/LegacyPlayerControlView;->setTimeBarMinUpdateInterval(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    throw p1

    :cond_0
    :goto_0
    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v4, Lu8/m0;

    invoke-direct {v4}, Lu8/m0;-><init>()V

    iput-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->Q:Lu8/m0;

    new-instance v4, Lu8/n0;

    invoke-direct {v4}, Lu8/n0;-><init>()V

    iput-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->R:Lu8/n0;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->O:Ljava/lang/StringBuilder;

    new-instance v5, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-direct {v5, v4, v6}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->P:Ljava/util/Formatter;

    new-array v4, v0, [J

    iput-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->y0:[J

    new-array v4, v0, [Z

    iput-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->z0:[Z

    new-array v4, v0, [J

    iput-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->A0:[J

    new-array v4, v0, [Z

    iput-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->B0:[Z

    new-instance v4, Ldb/i;

    invoke-direct {v4, p0}, Ldb/i;-><init>(Landroidx/media3/ui/LegacyPlayerControlView;)V

    iput-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->w:Ldb/i;

    new-instance v5, Ldb/h;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v6}, Ldb/h;-><init>(Landroidx/media3/ui/LegacyPlayerControlView;I)V

    iput-object v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->S:Ldb/h;

    new-instance v5, Ldb/h;

    const/4 v6, 0x1

    invoke-direct {v5, p0, v6}, Ldb/h;-><init>(Landroidx/media3/ui/LegacyPlayerControlView;I)V

    iput-object v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->T:Ldb/h;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    invoke-virtual {v5, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 v1, 0x40000

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    const v1, 0x7f0a0471

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ldb/r0;

    const v6, 0x7f0a0472

    invoke-virtual {p0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    if-eqz v5, :cond_1

    iput-object v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->N:Ldb/r0;

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    new-instance v5, Ldb/f;

    invoke-direct {v5, p1, p2, v0}, Ldb/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {v5, v1}, Landroid/view/View;->setId(I)V

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    invoke-virtual {v5, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    invoke-virtual {p2, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p2, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {p2, v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iput-object v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->N:Ldb/r0;

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->N:Ldb/r0;

    :goto_1
    const p2, 0x7f0a045b

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->L:Landroid/widget/TextView;

    const p2, 0x7f0a046f

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->M:Landroid/widget/TextView;

    iget-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->N:Ldb/r0;

    if-eqz p2, :cond_3

    check-cast p2, Ldb/f;

    iget-object p2, p2, Ldb/f;->a0:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    :cond_3
    const p2, 0x7f0a046c

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->E:Landroid/view/View;

    if-eqz p2, :cond_4

    invoke-virtual {p2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    const p2, 0x7f0a046b

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->F:Landroid/view/View;

    if-eqz p2, :cond_5

    invoke-virtual {p2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    const p2, 0x7f0a0470

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->y:Landroid/view/View;

    if-eqz p2, :cond_6

    invoke-virtual {p2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    const p2, 0x7f0a0467

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->z:Landroid/view/View;

    if-eqz p2, :cond_7

    invoke-virtual {p2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    const p2, 0x7f0a0474

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->H:Landroid/view/View;

    if-eqz p2, :cond_8

    invoke-virtual {p2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    const p2, 0x7f0a045f

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->G:Landroid/view/View;

    if-eqz p2, :cond_9

    invoke-virtual {p2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    const p2, 0x7f0a0473

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->I:Landroid/widget/ImageView;

    if-eqz p2, :cond_a

    invoke-virtual {p2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_a
    const p2, 0x7f0a0478

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->J:Landroid/widget/ImageView;

    if-eqz p2, :cond_b

    invoke-virtual {p2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    const p2, 0x7f0a0480

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->K:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/media3/ui/LegacyPlayerControlView;->setShowVrButton(Z)V

    invoke-virtual {p0, p2, v0, v0}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0b0017

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    iput v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->f0:F

    const v0, 0x7f0b0016

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v1

    iput v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->g0:F

    const v0, 0x7f08042e

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->U:Landroid/graphics/drawable/Drawable;

    const v0, 0x7f08042f

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->V:Landroid/graphics/drawable/Drawable;

    const v0, 0x7f08042d

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->W:Landroid/graphics/drawable/Drawable;

    const v0, 0x7f080432

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->d0:Landroid/graphics/drawable/Drawable;

    const v0, 0x7f080431

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->e0:Landroid/graphics/drawable/Drawable;

    const p1, 0x7f1404b4

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->a0:Ljava/lang/String;

    const p1, 0x7f1404b5

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->b0:Ljava/lang/String;

    const p1, 0x7f1404b3

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->c0:Ljava/lang/String;

    const p1, 0x7f1404bb

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->h0:Ljava/lang/String;

    const p1, 0x7f1404ba

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->i0:Ljava/lang/String;

    iput-wide v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->D0:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->S:Ldb/h;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->T:Ldb/h;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->x0:J

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    const/4 v0, 0x0

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_2
    return-void
.end method

.method public final b()V
    .locals 5

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->T:Ldb/h;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->p0:I

    if-lez v1, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iget v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->p0:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->x0:J

    iget-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->k0:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->x0:J

    return-void
.end method

.method public final c()Z
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

.method public final d()V
    .locals 3

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    iget-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->m0:Z

    invoke-static {v0, v1}, Lx8/t;->S(Lu8/j0;Z)Z

    move-result v0

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    iget-object v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->E:Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    return-void

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->F:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_1
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 11

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    if-eqz v1, :cond_9

    const/16 v2, 0x58

    const/16 v3, 0x57

    const/16 v4, 0x7f

    const/16 v5, 0x7e

    const/16 v6, 0x4f

    const/16 v7, 0x55

    const/16 v8, 0x59

    const/16 v9, 0x5a

    if-eq v0, v9, :cond_0

    if-eq v0, v8, :cond_0

    if-eq v0, v7, :cond_0

    if-eq v0, v6, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v3, :cond_0

    if-ne v0, v2, :cond_9

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v10

    if-nez v10, :cond_a

    if-ne v0, v9, :cond_1

    move-object p1, v1

    check-cast p1, Lb9/f0;

    invoke-virtual {p1}, Lb9/f0;->i0()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_a

    check-cast v1, La2/a;

    invoke-virtual {v1}, La2/a;->G()V

    goto :goto_0

    :cond_1
    if-ne v0, v8, :cond_2

    check-cast v1, La2/a;

    invoke-virtual {v1}, La2/a;->F()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    if-nez p1, :cond_a

    if-eq v0, v6, :cond_7

    if-eq v0, v7, :cond_7

    if-eq v0, v3, :cond_6

    if-eq v0, v2, :cond_5

    if-eq v0, v5, :cond_4

    if-eq v0, v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v1}, Lx8/t;->B(Lu8/j0;)Z

    goto :goto_0

    :cond_4
    invoke-static {v1}, Lx8/t;->C(Lu8/j0;)Z

    goto :goto_0

    :cond_5
    check-cast v1, La2/a;

    invoke-virtual {v1}, La2/a;->M()V

    goto :goto_0

    :cond_6
    check-cast v1, La2/a;

    invoke-virtual {v1}, La2/a;->J()V

    goto :goto_0

    :cond_7
    iget-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->m0:Z

    invoke-static {v1, p1}, Lx8/t;->S(Lu8/j0;Z)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {v1}, Lx8/t;->C(Lu8/j0;)Z

    goto :goto_0

    :cond_8
    invoke-static {v1}, Lx8/t;->B(Lu8/j0;)Z

    goto :goto_0

    :cond_9
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_b

    :cond_a
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_b
    const/4 p1, 0x0

    return p1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->T:Ldb/h;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->b()V

    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final e()V
    .locals 2

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->c()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->h()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->g()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->j()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->k()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->l()V

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    iget-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->m0:Z

    invoke-static {v0, v1}, Lx8/t;->S(Lu8/j0;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->E:Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->F:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->d()V

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    const/4 v0, 0x0

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_4
    :goto_1
    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->b()V

    return-void
.end method

.method public final f(Landroid/view/View;ZZ)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p3}, Landroid/view/View;->setEnabled(Z)V

    if-eqz p3, :cond_1

    iget p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->f0:F

    goto :goto_0

    :cond_1
    iget p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->g0:F

    :goto_0
    invoke-virtual {p1, p3}, Landroid/view/View;->setAlpha(F)V

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    goto :goto_1

    :cond_2
    const/16 p2, 0x8

    :goto_1
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final g()V
    .locals 7

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->k0:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

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
    iget-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->u0:Z

    iget-object v6, p0, Landroidx/media3/ui/LegacyPlayerControlView;->y:Landroid/view/View;

    invoke-virtual {p0, v6, v5, v2}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    iget-boolean v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->s0:Z

    iget-object v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->H:Landroid/view/View;

    invoke-virtual {p0, v5, v2, v3}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    iget-boolean v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->t0:Z

    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->G:Landroid/view/View;

    invoke-virtual {p0, v3, v2, v4}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    iget-boolean v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->v0:Z

    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->z:Landroid/view/View;

    invoke-virtual {p0, v3, v2, v0}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->N:Ldb/r0;

    if-eqz v0, :cond_2

    check-cast v0, Ldb/f;

    invoke-virtual {v0, v1}, Ldb/f;->setEnabled(Z)V

    :cond_2
    :goto_1
    return-void
.end method

.method public getPlayer()Lu8/j0;
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    return-object v0
.end method

.method public getRepeatToggleModes()I
    .locals 1

    iget v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r0:I

    return v0
.end method

.method public getShowShuffleButton()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->w0:Z

    return v0
.end method

.method public getShowTimeoutMs()I
    .locals 1

    iget v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->p0:I

    return v0
.end method

.method public getShowVrButton()Z
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h()V
    .locals 9

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->c()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->k0:Z

    if-nez v0, :cond_0

    goto/16 :goto_8

    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    iget-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->m0:Z

    invoke-static {v0, v1}, Lx8/t;->S(Lu8/j0;Z)Z

    move-result v0

    const/16 v1, 0x8

    iget-object v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->E:Landroid/view/View;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    if-nez v0, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_0

    :cond_1
    move v5, v4

    :goto_0
    if-nez v0, :cond_2

    invoke-virtual {v2}, Landroid/view/View;->isAccessibilityFocused()Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v3

    goto :goto_1

    :cond_2
    move v6, v4

    :goto_1
    if-eqz v0, :cond_3

    move v7, v4

    goto :goto_2

    :cond_3
    move v7, v1

    :goto_2
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_4
    move v5, v4

    move v6, v5

    :goto_3
    iget-object v7, p0, Landroidx/media3/ui/LegacyPlayerControlView;->F:Landroid/view/View;

    if-eqz v7, :cond_8

    if-eqz v0, :cond_5

    invoke-virtual {v7}, Landroid/view/View;->isFocused()Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v3

    goto :goto_4

    :cond_5
    move v8, v4

    :goto_4
    or-int/2addr v5, v8

    if-eqz v0, :cond_6

    invoke-virtual {v7}, Landroid/view/View;->isAccessibilityFocused()Z

    move-result v8

    if-eqz v8, :cond_6

    goto :goto_5

    :cond_6
    move v3, v4

    :goto_5
    or-int/2addr v6, v3

    if-eqz v0, :cond_7

    goto :goto_6

    :cond_7
    move v1, v4

    :goto_6
    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    if-eqz v5, :cond_a

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    iget-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->m0:Z

    invoke-static {v0, v1}, Lx8/t;->S(Lu8/j0;Z)Z

    move-result v0

    if-eqz v0, :cond_9

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    goto :goto_7

    :cond_9
    if-nez v0, :cond_a

    if-eqz v7, :cond_a

    invoke-virtual {v7}, Landroid/view/View;->requestFocus()Z

    :cond_a
    :goto_7
    if-eqz v6, :cond_b

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->d()V

    :cond_b
    :goto_8
    return-void
.end method

.method public final i()V
    .locals 15

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->c()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->k0:Z

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    if-eqz v0, :cond_1

    iget-wide v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->C0:J

    move-object v3, v0

    check-cast v3, Lb9/f0;

    invoke-virtual {v3}, Lb9/f0;->L0()V

    iget-object v4, v3, Lb9/f0;->I0:Lb9/c1;

    invoke-virtual {v3, v4}, Lb9/f0;->W(Lb9/c1;)J

    move-result-wide v4

    add-long/2addr v4, v1

    iget-wide v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->C0:J

    invoke-virtual {v3}, Lb9/f0;->V()J

    move-result-wide v6

    add-long/2addr v6, v1

    goto :goto_0

    :cond_1
    const-wide/16 v4, 0x0

    move-wide v6, v4

    :goto_0
    iget-wide v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->D0:J

    cmp-long v1, v4, v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    iput-wide v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->D0:J

    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->M:Landroid/widget/TextView;

    if-eqz v3, :cond_3

    iget-boolean v8, p0, Landroidx/media3/ui/LegacyPlayerControlView;->o0:Z

    if-nez v8, :cond_3

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->O:Ljava/lang/StringBuilder;

    iget-object v8, p0, Landroidx/media3/ui/LegacyPlayerControlView;->P:Ljava/util/Formatter;

    invoke-static {v1, v8, v4, v5}, Lx8/t;->y(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->N:Ldb/r0;

    if-eqz v1, :cond_4

    move-object v3, v1

    check-cast v3, Ldb/f;

    invoke-virtual {v3, v4, v5}, Ldb/f;->setPosition(J)V

    invoke-virtual {v3, v6, v7}, Ldb/f;->setBufferedPosition(J)V

    :cond_4
    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->S:Ldb/h;

    invoke-virtual {p0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    if-nez v0, :cond_5

    move v6, v2

    goto :goto_2

    :cond_5
    move-object v6, v0

    check-cast v6, Lb9/f0;

    invoke-virtual {v6}, Lb9/f0;->i0()I

    move-result v6

    :goto_2
    const-wide/16 v7, 0x3e8

    if-eqz v0, :cond_8

    move-object v9, v0

    check-cast v9, La2/a;

    check-cast v9, Lb9/f0;

    invoke-virtual {v9}, Lb9/f0;->i0()I

    move-result v10

    const/4 v11, 0x3

    if-ne v10, v11, :cond_8

    invoke-virtual {v9}, Lb9/f0;->g0()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-virtual {v9}, Lb9/f0;->L0()V

    iget-object v9, v9, Lb9/f0;->I0:Lb9/c1;

    iget v9, v9, Lb9/c1;->n:I

    if-nez v9, :cond_8

    if-eqz v1, :cond_6

    check-cast v1, Ldb/f;

    invoke-virtual {v1}, Ldb/f;->getPreferredUpdateDelay()J

    move-result-wide v1

    goto :goto_3

    :cond_6
    move-wide v1, v7

    :goto_3
    rem-long/2addr v4, v7

    sub-long v4, v7, v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->h0()Lu8/e0;

    move-result-object v0

    iget v0, v0, Lu8/e0;->a:F

    const/4 v4, 0x0

    cmpl-float v4, v0, v4

    if-lez v4, :cond_7

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-long v7, v1

    :cond_7
    move-wide v9, v7

    iget v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->q0:I

    int-to-long v11, v0

    const-wide/16 v13, 0x3e8

    invoke-static/range {v9 .. v14}, Lx8/t;->h(JJJ)J

    move-result-wide v0

    invoke-virtual {p0, v3, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_8
    const/4 v0, 0x4

    if-eq v6, v0, :cond_9

    if-eq v6, v2, :cond_9

    invoke-virtual {p0, v3, v7, v8}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_9
    :goto_4
    return-void
.end method

.method public final j()V
    .locals 6

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->k0:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->I:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r0:I

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {p0, v0, v2, v2}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    return-void

    :cond_1
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->a0:Ljava/lang/String;

    iget-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->U:Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x1

    if-nez v1, :cond_2

    invoke-virtual {p0, v0, v5, v2}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    invoke-virtual {p0, v0, v5, v5}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget v1, v1, Lb9/f0;->h0:I

    if-eqz v1, :cond_5

    if-eq v1, v5, :cond_4

    const/4 v3, 0x2

    if-eq v1, v3, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->W:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->c0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_4
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->V:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->b0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_5
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final k()V
    .locals 6

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->k0:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->J:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    iget-boolean v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->w0:Z

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-virtual {p0, v0, v3, v3}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    return-void

    :cond_1
    iget-object v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->i0:Ljava/lang/String;

    iget-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->e0:Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x1

    if-nez v1, :cond_2

    invoke-virtual {p0, v0, v5, v3}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    invoke-virtual {p0, v0, v5, v5}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget-boolean v3, v1, Lb9/f0;->i0:Z

    if-eqz v3, :cond_3

    iget-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->d0:Landroid/graphics/drawable/Drawable;

    :cond_3
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget-boolean v1, v1, Lb9/f0;->i0:Z

    if-eqz v1, :cond_4

    iget-object v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->h0:Ljava/lang/String;

    :cond_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final l()V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-boolean v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->l0:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    iget-object v7, v0, Landroidx/media3/ui/LegacyPlayerControlView;->R:Lu8/n0;

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v2, :cond_4

    move-object v2, v1

    check-cast v2, Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v2

    invoke-virtual {v2}, Lu8/o0;->o()I

    move-result v10

    const/16 v11, 0x64

    if-le v10, v11, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lu8/o0;->o()I

    move-result v10

    move v11, v8

    :goto_0
    if-ge v11, v10, :cond_3

    invoke-virtual {v2, v11, v7, v5, v6}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v12

    iget-wide v12, v12, Lu8/n0;->m:J

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
    iput-boolean v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->n0:Z

    iput-wide v5, v0, Landroidx/media3/ui/LegacyPlayerControlView;->C0:J

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v2

    invoke-virtual {v2}, Lu8/o0;->p()Z

    move-result v10

    if-nez v10, :cond_13

    invoke-virtual {v1}, Lb9/f0;->Z()I

    move-result v1

    iget-boolean v10, v0, Landroidx/media3/ui/LegacyPlayerControlView;->n0:Z

    if-eqz v10, :cond_5

    move v11, v8

    goto :goto_3

    :cond_5
    move v11, v1

    :goto_3
    if-eqz v10, :cond_6

    invoke-virtual {v2}, Lu8/o0;->o()I

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

    invoke-static {v12, v13}, Lx8/t;->U(J)J

    move-result-wide v3

    iput-wide v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->C0:J

    :cond_7
    invoke-virtual {v2, v11, v7}, Lu8/o0;->n(ILu8/n0;)V

    iget-wide v3, v7, Lu8/n0;->m:J

    cmp-long v3, v3, v15

    if-nez v3, :cond_9

    iget-boolean v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->n0:Z

    xor-int/2addr v1, v9

    invoke-static {v1}, Lva3/g;->i(Z)V

    :cond_8
    move v2, v9

    goto/16 :goto_d

    :cond_9
    iget v3, v7, Lu8/n0;->n:I

    :goto_6
    iget v4, v7, Lu8/n0;->o:I

    if-gt v3, v4, :cond_12

    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->Q:Lu8/m0;

    invoke-virtual {v2, v3, v4, v8}, Lu8/o0;->f(ILu8/m0;Z)Lu8/m0;

    move-wide/from16 v17, v5

    iget-object v5, v4, Lu8/m0;->g:Lu8/b;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v5, v5, Lu8/b;->a:I

    move v6, v8

    :goto_7
    if-ge v6, v5, :cond_11

    invoke-virtual {v4, v6}, Lu8/m0;->d(I)J

    iget-wide v8, v4, Lu8/m0;->e:J

    cmp-long v20, v8, v17

    if-ltz v20, :cond_10

    iget-object v15, v0, Landroidx/media3/ui/LegacyPlayerControlView;->y0:[J

    move/from16 v16, v1

    array-length v1, v15

    if-ne v14, v1, :cond_b

    array-length v1, v15

    if-nez v1, :cond_a

    const/4 v1, 0x1

    goto :goto_8

    :cond_a
    array-length v1, v15

    mul-int/lit8 v1, v1, 0x2

    :goto_8
    invoke-static {v15, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v15

    iput-object v15, v0, Landroidx/media3/ui/LegacyPlayerControlView;->y0:[J

    iget-object v15, v0, Landroidx/media3/ui/LegacyPlayerControlView;->z0:[Z

    invoke-static {v15, v1}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v1

    iput-object v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->z0:[Z

    :cond_b
    iget-object v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->y0:[J

    add-long/2addr v8, v12

    invoke-static {v8, v9}, Lx8/t;->U(J)J

    move-result-wide v8

    aput-wide v8, v1, v14

    iget-object v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->z0:[Z

    iget-object v8, v4, Lu8/m0;->g:Lu8/b;

    invoke-virtual {v8, v6}, Lu8/b;->a(I)Lu8/a;

    move-result-object v8

    iget v9, v8, Lu8/a;->a:I

    const/4 v15, -0x1

    if-ne v9, v15, :cond_c

    move-object/from16 v21, v1

    move-object/from16 v22, v2

    const/4 v2, 0x1

    const/16 v19, 0x1

    goto :goto_b

    :cond_c
    const/4 v15, 0x0

    :goto_9
    if-ge v15, v9, :cond_f

    move-object/from16 v21, v1

    iget-object v1, v8, Lu8/a;->e:[I

    aget v1, v1, v15

    move-object/from16 v22, v2

    const/4 v2, 0x1

    if-eqz v1, :cond_e

    if-ne v1, v2, :cond_d

    goto :goto_a

    :cond_d
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    goto :goto_9

    :cond_e
    :goto_a
    move/from16 v19, v2

    goto :goto_b

    :cond_f
    move-object/from16 v21, v1

    move-object/from16 v22, v2

    const/4 v2, 0x1

    const/16 v19, 0x0

    :goto_b
    xor-int/lit8 v1, v19, 0x1

    aput-boolean v1, v21, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_c

    :cond_10
    move/from16 v16, v1

    move-object/from16 v22, v2

    const/4 v2, 0x1

    :goto_c
    add-int/lit8 v6, v6, 0x1

    move v9, v2

    move/from16 v1, v16

    move-object/from16 v2, v22

    const/4 v8, 0x0

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_7

    :cond_11
    move/from16 v16, v1

    move-object/from16 v22, v2

    move v2, v9

    add-int/lit8 v3, v3, 0x1

    move-wide/from16 v5, v17

    move-object/from16 v2, v22

    const/4 v8, 0x0

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_6

    :cond_12
    move/from16 v16, v1

    move-object/from16 v22, v2

    move-wide/from16 v17, v5

    move v2, v9

    iget-wide v3, v7, Lu8/n0;->m:J

    add-long/2addr v12, v3

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, v22

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    goto/16 :goto_5

    :goto_d
    move-wide v5, v12

    goto :goto_e

    :cond_13
    move-wide/from16 v17, v5

    move v2, v9

    const/4 v14, 0x0

    :goto_e
    invoke-static {v5, v6}, Lx8/t;->U(J)J

    move-result-wide v3

    iget-object v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->L:Landroid/widget/TextView;

    if-eqz v1, :cond_14

    iget-object v5, v0, Landroidx/media3/ui/LegacyPlayerControlView;->O:Ljava/lang/StringBuilder;

    iget-object v6, v0, Landroidx/media3/ui/LegacyPlayerControlView;->P:Ljava/util/Formatter;

    invoke-static {v5, v6, v3, v4}, Lx8/t;->y(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_14
    iget-object v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->N:Ldb/r0;

    if-eqz v1, :cond_18

    check-cast v1, Ldb/f;

    invoke-virtual {v1, v3, v4}, Ldb/f;->setDuration(J)V

    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->A0:[J

    array-length v4, v3

    add-int v5, v14, v4

    iget-object v6, v0, Landroidx/media3/ui/LegacyPlayerControlView;->y0:[J

    array-length v7, v6

    if-le v5, v7, :cond_15

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v6

    iput-object v6, v0, Landroidx/media3/ui/LegacyPlayerControlView;->y0:[J

    iget-object v6, v0, Landroidx/media3/ui/LegacyPlayerControlView;->z0:[Z

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v6

    iput-object v6, v0, Landroidx/media3/ui/LegacyPlayerControlView;->z0:[Z

    :cond_15
    iget-object v6, v0, Landroidx/media3/ui/LegacyPlayerControlView;->y0:[J

    const/4 v7, 0x0

    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->B0:[Z

    iget-object v6, v0, Landroidx/media3/ui/LegacyPlayerControlView;->z0:[Z

    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->y0:[J

    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->z0:[Z

    if-eqz v5, :cond_17

    if-eqz v3, :cond_16

    if-eqz v4, :cond_16

    goto :goto_f

    :cond_16
    move v8, v7

    goto :goto_10

    :cond_17
    :goto_f
    move v8, v2

    :goto_10
    invoke-static {v8}, Lva3/g;->d(Z)V

    iput v5, v1, Ldb/f;->p0:I

    iput-object v3, v1, Ldb/f;->q0:[J

    iput-object v4, v1, Ldb/f;->r0:[Z

    invoke-virtual {v1}, Ldb/f;->e()V

    :cond_18
    invoke-virtual {v0}, Landroidx/media3/ui/LegacyPlayerControlView;->i()V

    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->k0:Z

    iget-wide v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->x0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->a()V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->T:Ldb/h;

    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->b()V

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->h()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->g()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->j()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->k()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->l()V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->k0:Z

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->S:Ldb/h;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->T:Ldb/h;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setPlayer(Lu8/j0;)V
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
    invoke-static {v0}, Lva3/g;->i(Z)V

    if-eqz p1, :cond_1

    move-object v0, p1

    check-cast v0, Lb9/f0;

    iget-object v0, v0, Lb9/f0;->U:Landroid/os/Looper;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    :cond_1
    move v2, v3

    :cond_2
    invoke-static {v2}, Lva3/g;->d(Z)V

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    if-ne v0, p1, :cond_3

    return-void

    :cond_3
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->w:Ldb/i;

    if-eqz v0, :cond_4

    check-cast v0, Lb9/f0;

    invoke-virtual {v0, v1}, Lb9/f0;->s0(Lu8/h0;)V

    :cond_4
    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    if-eqz p1, :cond_5

    check-cast p1, Lb9/f0;

    invoke-virtual {p1, v1}, Lb9/f0;->Q(Lu8/h0;)V

    :cond_5
    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->h()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->g()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->j()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->k()V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->l()V

    return-void
.end method

.method public setProgressUpdateListener(Ldb/j;)V
    .locals 0

    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 3

    iput p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r0:I

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    if-eqz v0, :cond_2

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget v0, v0, Lb9/f0;->h0:I

    if-nez p1, :cond_0

    if-eqz v0, :cond_0

    iget-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    const/4 v0, 0x0

    check-cast p1, Lb9/f0;

    invoke-virtual {p1, v0}, Lb9/f0;->B0(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne p1, v2, :cond_1

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    check-cast p1, Lb9/f0;

    invoke-virtual {p1, v2}, Lb9/f0;->B0(I)V

    goto :goto_0

    :cond_1
    if-ne p1, v1, :cond_2

    if-ne v0, v2, :cond_2

    iget-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    check-cast p1, Lb9/f0;

    invoke-virtual {p1, v1}, Lb9/f0;->B0(I)V

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->j()V

    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->t0:Z

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->g()V

    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->l0:Z

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->l()V

    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->v0:Z

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->g()V

    return-void
.end method

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->m0:Z

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->h()V

    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->u0:Z

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->g()V

    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->s0:Z

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->g()V

    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->w0:Z

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->k()V

    return-void
.end method

.method public setShowTimeoutMs(I)V
    .locals 0

    iput p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->p0:I

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->b()V

    :cond_0
    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->K:Landroid/view/View;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .locals 2

    const/16 v0, 0x10

    const/16 v1, 0x3e8

    invoke-static {p1, v0, v1}, Lx8/t;->g(III)I

    move-result p1

    iput p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->q0:I

    return-void
.end method

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->K:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->getShowVrButton()Z

    move-result v1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, v0, v1, p1}, Landroidx/media3/ui/LegacyPlayerControlView;->f(Landroid/view/View;ZZ)V

    :cond_1
    return-void
.end method
