.class public final Lb3/h0;
.super Lh5/b;
.source "SourceFile"


# static fields
.field public static final Q:La0/f0;


# instance fields
.field public A:Z

.field public B:Lb3/e0;

.field public C:La0/g0;

.field public final D:La0/h0;

.field public final E:La0/e0;

.field public final F:La0/e0;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ls/m2;

.field public final J:La0/g0;

.field public K:Lb3/w2;

.field public L:Z

.field public final M:La0/e0;

.field public final N:Landroidx/lifecycle/z0;

.field public final O:Ljava/util/ArrayList;

.field public final P:Lb3/g0;

.field public final d:Landroidx/compose/ui/platform/AndroidComposeView;

.field public e:I

.field public final f:Lb3/g0;

.field public final g:Landroid/view/accessibility/AccessibilityManager;

.field public h:J

.field public final i:Lb3/a0;

.field public final j:Lb3/b0;

.field public k:Ljava/util/List;

.field public final l:Landroid/os/Handler;

.field public final m:Lb3/d0;

.field public n:I

.field public o:I

.field public p:Li5/f;

.field public q:Li5/f;

.field public r:Z

.field public final s:La0/g0;

.field public final t:La0/g0;

.field public final u:La0/g1;

.field public final v:La0/g1;

.field public w:I

.field public x:Ljava/lang/Integer;

.field public final y:La0/h;

.field public final z:Ldc3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x20

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sget-object v2, La0/r;->a:La0/f0;

    new-instance v2, La0/f0;

    invoke-direct {v2, v0}, La0/f0;-><init>(I)V

    iget v3, v2, La0/f0;->b:I

    if-ltz v3, :cond_1

    add-int/lit8 v4, v3, 0x20

    invoke-virtual {v2, v4}, La0/f0;->b(I)V

    iget-object v5, v2, La0/f0;->a:[I

    iget v6, v2, La0/f0;->b:I

    if-eq v3, v6, :cond_0

    invoke-static {v4, v3, v5, v5, v6}, Lm83/n;->e0(II[I[II)V

    :cond_0
    const/4 v4, 0x0

    const/16 v6, 0xc

    invoke-static {v3, v4, v1, v5, v6}, Lm83/n;->j0(II[I[II)V

    iget v1, v2, La0/f0;->b:I

    add-int/2addr v1, v0

    iput v1, v2, La0/f0;->b:I

    sput-object v2, Lb3/h0;->Q:La0/f0;

    return-void

    :cond_1
    const-string v0, ""

    invoke-static {v0}, Lug/m;->Q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    nop

    :array_0
    .array-data 4
        0x7f0a001b
        0x7f0a001c
        0x7f0a0027
        0x7f0a0032
        0x7f0a0035
        0x7f0a0036
        0x7f0a0037
        0x7f0a0038
        0x7f0a0039
        0x7f0a003a
        0x7f0a001d
        0x7f0a001e
        0x7f0a001f
        0x7f0a0020
        0x7f0a0021
        0x7f0a0022
        0x7f0a0023
        0x7f0a0024
        0x7f0a0025
        0x7f0a0026
        0x7f0a0028
        0x7f0a0029
        0x7f0a002a
        0x7f0a002b
        0x7f0a002c
        0x7f0a002d
        0x7f0a002e
        0x7f0a002f
        0x7f0a0030
        0x7f0a0031
        0x7f0a0033
        0x7f0a0034
    .end array-data
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 7

    invoke-direct {p0}, Lh5/b;-><init>()V

    iput-object p1, p0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    const/high16 v0, -0x80000000

    iput v0, p0, Lb3/h0;->e:I

    new-instance v1, Lb3/g0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lb3/g0;-><init>(Lb3/h0;I)V

    iput-object v1, p0, Lb3/h0;->f:Lb3/g0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "accessibility"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    iput-object v1, p0, Lb3/h0;->g:Landroid/view/accessibility/AccessibilityManager;

    const-wide/16 v3, 0x64

    iput-wide v3, p0, Lb3/h0;->h:J

    new-instance v3, Lb3/a0;

    invoke-direct {v3, p0}, Lb3/a0;-><init>(Lb3/h0;)V

    iput-object v3, p0, Lb3/h0;->i:Lb3/a0;

    new-instance v3, Lb3/b0;

    invoke-direct {v3, p0}, Lb3/b0;-><init>(Lb3/h0;)V

    iput-object v3, p0, Lb3/h0;->j:Lb3/b0;

    const/4 v3, -0x1

    invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lb3/h0;->k:Ljava/util/List;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lb3/h0;->l:Landroid/os/Handler;

    new-instance v1, Lb3/d0;

    invoke-direct {v1, p0}, Lb3/d0;-><init>(Lb3/h0;)V

    iput-object v1, p0, Lb3/h0;->m:Lb3/d0;

    iput v0, p0, Lb3/h0;->n:I

    iput v0, p0, Lb3/h0;->o:I

    new-instance v0, La0/g0;

    invoke-direct {v0}, La0/g0;-><init>()V

    iput-object v0, p0, Lb3/h0;->s:La0/g0;

    new-instance v0, La0/g0;

    invoke-direct {v0}, La0/g0;-><init>()V

    iput-object v0, p0, Lb3/h0;->t:La0/g0;

    new-instance v0, La0/g1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/g1;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb3/h0;->u:La0/g1;

    new-instance v0, La0/g1;

    invoke-direct {v0, v1}, La0/g1;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb3/h0;->v:La0/g1;

    iput v3, p0, Lb3/h0;->w:I

    new-instance v0, La0/h;

    invoke-direct {v0, v2}, La0/h;-><init>(I)V

    iput-object v0, p0, Lb3/h0;->y:La0/h;

    const/4 v0, 0x6

    const/4 v3, 0x1

    invoke-static {v3, v0, v1}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v0

    iput-object v0, p0, Lb3/h0;->z:Ldc3/h;

    iput-boolean v3, p0, Lb3/h0;->A:Z

    sget-object v0, La0/t;->a:La0/g0;

    const-string v1, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lb3/h0;->C:La0/g0;

    new-instance v4, La0/h0;

    invoke-direct {v4}, La0/h0;-><init>()V

    iput-object v4, p0, Lb3/h0;->D:La0/h0;

    new-instance v4, La0/e0;

    invoke-direct {v4}, La0/e0;-><init>()V

    iput-object v4, p0, Lb3/h0;->E:La0/e0;

    new-instance v4, La0/e0;

    invoke-direct {v4}, La0/e0;-><init>()V

    iput-object v4, p0, Lb3/h0;->F:La0/e0;

    const-string v4, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"

    iput-object v4, p0, Lb3/h0;->G:Ljava/lang/String;

    const-string v4, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"

    iput-object v4, p0, Lb3/h0;->H:Ljava/lang/String;

    new-instance v4, Ls/m2;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Ls/m2;-><init>(I)V

    iput-object v4, p0, Lb3/h0;->I:Ls/m2;

    new-instance v4, La0/g0;

    invoke-direct {v4}, La0/g0;-><init>()V

    iput-object v4, p0, Lb3/h0;->J:La0/g0;

    new-instance v4, Lb3/w2;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v6

    invoke-virtual {v6}, Li3/r;->a()Li3/p;

    move-result-object v6

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v6, v0}, Lb3/w2;-><init>(Li3/p;La0/s;)V

    iput-object v4, p0, Lb3/h0;->K:Lb3/w2;

    sget v0, La0/p;->a:I

    new-instance v0, La0/e0;

    invoke-direct {v0}, La0/e0;-><init>()V

    iput-object v0, p0, Lb3/h0;->M:La0/e0;

    new-instance v0, Lb3/c0;

    invoke-direct {v0, p0, v2}, Lb3/c0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    new-instance p1, Landroidx/lifecycle/z0;

    invoke-direct {p1, p0, v5}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lb3/h0;->N:Landroidx/lifecycle/z0;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb3/h0;->O:Ljava/util/ArrayList;

    new-instance p1, Lb3/g0;

    invoke-direct {p1, p0, v3}, Lb3/g0;-><init>(Lb3/h0;I)V

    iput-object p1, p0, Lb3/h0;->P:Lb3/g0;

    return-void
.end method

.method public static synthetic E(Lb3/h0;IILjava/lang/Integer;I)V
    .locals 1

    and-int/lit8 p4, p4, 0x4

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p3, v0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lb3/h0;->D(IILjava/lang/Integer;Ljava/util/List;)Z

    return-void
.end method

.method public static L(Li2/p0;)Landroid/graphics/Rect;
    .locals 4

    instance-of v0, p0, Li2/n0;

    if-nez v0, :cond_1

    instance-of v0, p0, Li2/o0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Li2/p0;->a()Lh2/c;

    move-result-object p0

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p0, Lh2/c;->a:F

    float-to-int v1, v1

    iget v2, p0, Lh2/c;->b:F

    float-to-int v2, v2

    iget v3, p0, Lh2/c;->c:F

    float-to-int v3, v3

    iget p0, p0, Lh2/c;->d:F

    float-to-int p0, p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public static M(Li2/p0;)[F
    .locals 13

    instance-of v0, p0, Li2/o0;

    if-eqz v0, :cond_0

    check-cast p0, Li2/o0;

    iget-object p0, p0, Li2/o0;->a:Lh2/d;

    iget-wide v0, p0, Lh2/d;->h:J

    iget-wide v2, p0, Lh2/d;->g:J

    iget-wide v4, p0, Lh2/d;->f:J

    iget-wide v6, p0, Lh2/d;->e:J

    const/16 p0, 0x20

    shr-long v8, v6, p0

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    const-wide v9, 0xffffffffL

    and-long/2addr v6, v9

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    shr-long v11, v4, p0

    long-to-int v7, v11

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    and-long/2addr v4, v9

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    shr-long v11, v2, p0

    long-to-int v5, v11

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    and-long/2addr v2, v9

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    shr-long v11, v0, p0

    long-to-int p0, v11

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    and-long/2addr v0, v9

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/16 v1, 0x8

    new-array v1, v1, [F

    const/4 v3, 0x0

    aput v8, v1, v3

    const/4 v3, 0x1

    aput v6, v1, v3

    const/4 v3, 0x2

    aput v7, v1, v3

    const/4 v3, 0x3

    aput v4, v1, v3

    const/4 v3, 0x4

    aput v5, v1, v3

    const/4 v3, 0x5

    aput v2, v1, v3

    const/4 v2, 0x6

    aput p0, v1, v2

    const/4 p0, 0x7

    aput v0, v1, p0

    return-object v1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static N(Li2/p0;)Landroid/graphics/Region;
    .locals 6

    instance-of v0, p0, Li2/m0;

    if-eqz v0, :cond_1

    new-instance v0, Landroid/graphics/Region;

    check-cast p0, Li2/m0;

    invoke-virtual {p0}, Li2/m0;->a()Lh2/c;

    move-result-object v1

    new-instance v2, Landroid/graphics/Rect;

    iget v3, v1, Lh2/c;->a:F

    float-to-int v3, v3

    iget v4, v1, Lh2/c;->b:F

    float-to-int v4, v4

    iget v5, v1, Lh2/c;->c:F

    float-to-int v5, v5

    iget v1, v1, Lh2/c;->d:F

    float-to-int v1, v1

    invoke-direct {v2, v3, v4, v5, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-direct {v0, v2}, Landroid/graphics/Region;-><init>(Landroid/graphics/Rect;)V

    new-instance v1, Landroid/graphics/Region;

    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    iget-object p0, p0, Li2/m0;->a:Li2/s0;

    instance-of v2, p0, Li2/j;

    if-eqz v2, :cond_0

    check-cast p0, Li2/j;

    iget-object p0, p0, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v1, p0, v0}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    return-object v1

    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Unable to obtain android.graphics.Path"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const v1, 0x186a0

    if-gt v0, v1, :cond_1

    :goto_0
    return-object p0

    :cond_1
    const v0, 0x1869f

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_2

    move v1, v0

    :cond_2
    const/4 v0, 0x0

    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static u(Li3/p;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Li3/p;->d:Li3/l;

    iget-object v1, p0, Li3/l;->w:La0/v0;

    sget-object v2, Li3/u;->a:Li3/y;

    invoke-virtual {v1, v2}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, v2}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    const-string v1, ","

    const/16 v2, 0x3e

    invoke-static {v2, v1, p0, v0}, La4/b;->b(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Li3/u;->E:Li3/y;

    invoke-virtual {v1, p0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, p0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_2

    move-object p0, v0

    :cond_2
    check-cast p0, Ll3/g;

    if-eqz p0, :cond_5

    iget-object p0, p0, Ll3/g;->x:Ljava/lang/String;

    return-object p0

    :cond_3
    sget-object p0, Li3/u;->A:Li3/y;

    invoke-virtual {v1, p0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_4

    move-object p0, v0

    :cond_4
    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_5

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll3/g;

    if-eqz p0, :cond_5

    iget-object p0, p0, Ll3/g;->x:Ljava/lang/String;

    return-object p0

    :cond_5
    :goto_0
    return-object v0
.end method

.method public static final x(Li3/j;F)Z
    .locals 3

    iget-object v0, p0, Li3/j;->a:Lc93/a;

    const/4 v1, 0x0

    cmpg-float v2, p1, v1

    if-gez v2, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    cmpl-float v2, v2, v1

    if-gtz v2, :cond_1

    :cond_0
    cmpl-float p1, p1, v1

    if-lez p1, :cond_2

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object p0, p0, Li3/j;->b:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    cmpg-float p0, p1, p0

    if-gez p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static final y(Li3/j;)Z
    .locals 3

    iget-object v0, p0, Li3/j;->a:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    iget-object p0, p0, Li3/j;->b:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    const/4 p0, 0x0

    return p0
.end method

.method public static final z(Li3/j;)Z
    .locals 2

    iget-object v0, p0, Li3/j;->a:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object p0, p0, Li3/j;->b:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    cmpg-float p0, v1, p0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final A(I)I
    .locals 1

    iget-object v0, p0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v0

    invoke-virtual {v0}, Li3/r;->a()Li3/p;

    move-result-object v0

    iget v0, v0, Li3/p;->g:I

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    :cond_0
    return p1
.end method

.method public final B(Li3/p;Lb3/w2;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget-object v3, La0/u;->a:[I

    new-instance v3, La0/h0;

    invoke-direct {v3}, La0/h0;-><init>()V

    const/4 v4, 0x4

    invoke-static {v4, v1}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v5

    iget-object v6, v1, Li3/p;->c:La3/n0;

    move-object v7, v5

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    if-ge v9, v7, :cond_2

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li3/p;

    invoke-virtual {v0}, Lb3/h0;->t()La0/s;

    move-result-object v11

    iget v10, v10, Li3/p;->g:I

    invoke-virtual {v11, v10}, La0/s;->a(I)Z

    move-result v11

    if-eqz v11, :cond_1

    iget-object v11, v2, Lb3/w2;->b:La0/h0;

    invoke-virtual {v11, v10}, La0/h0;->b(I)Z

    move-result v11

    if-nez v11, :cond_0

    invoke-virtual {v0, v6}, Lb3/h0;->w(La3/n0;)V

    return-void

    :cond_0
    invoke-virtual {v3, v10}, La0/h0;->a(I)Z

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    iget-object v2, v2, Lb3/w2;->b:La0/h0;

    iget-object v5, v2, La0/h0;->b:[I

    iget-object v2, v2, La0/h0;->a:[J

    array-length v7, v2

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_6

    move v9, v8

    :goto_1
    aget-wide v10, v2, v9

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_5

    sub-int v12, v9, v7

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    move v14, v8

    :goto_2
    if-ge v14, v12, :cond_4

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_3

    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v14

    aget v15, v5, v15

    invoke-virtual {v3, v15}, La0/h0;->b(I)Z

    move-result v15

    if-nez v15, :cond_3

    invoke-virtual {v0, v6}, Lb3/h0;->w(La3/n0;)V

    return-void

    :cond_3
    shr-long/2addr v10, v13

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :cond_4
    if-ne v12, v13, :cond_6

    :cond_5
    if-eq v9, v7, :cond_6

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_6
    invoke-static {v4, v1}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_3
    if-ge v8, v2, :cond_8

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li3/p;

    iget-object v4, v0, Lb3/h0;->J:La0/g0;

    iget v5, v3, Li3/p;->g:I

    invoke-virtual {v4, v5}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb3/w2;

    if-eqz v4, :cond_7

    invoke-virtual {v0}, Lb3/h0;->t()La0/s;

    move-result-object v5

    iget v6, v3, Li3/p;->g:I

    invoke-virtual {v5, v6}, La0/s;->a(I)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {v0, v3, v4}, Lb3/h0;->B(Li3/p;Lb3/w2;)V

    :cond_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_8
    return-void
.end method

.method public final C(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    invoke-virtual {p0}, Lb3/h0;->v()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v2, 0x800

    if-eq v0, v2, :cond_1

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const v2, 0x8000

    if-ne v0, v2, :cond_2

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lb3/h0;->r:Z

    :cond_2
    :try_start_0
    iget-object v0, p0, Lb3/h0;->f:Lb3/g0;

    invoke-virtual {v0, p1}, Lb3/g0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Lb3/h0;->r:Z

    return p1

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Lb3/h0;->r:Z

    throw p1
.end method

.method public final D(IILjava/lang/Integer;Ljava/util/List;)Z
    .locals 1

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_3

    invoke-virtual {p0}, Lb3/h0;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lb3/h0;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    :cond_1
    if-eqz p4, :cond_2

    const/4 p2, 0x0

    const/16 p3, 0x3e

    const-string v0, ","

    invoke-static {p3, v0, p4, p2}, La4/b;->b(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {p0, p1}, Lb3/h0;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final F(IILjava/lang/String;)V
    .locals 1

    invoke-virtual {p0, p1}, Lb3/h0;->A(I)I

    move-result p1

    const/16 v0, 0x20

    invoke-virtual {p0, p1, v0}, Lb3/h0;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0, p1}, Lb3/h0;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    return-void
.end method

.method public final G(I)V
    .locals 5

    iget-object v0, p0, Lb3/h0;->B:Lb3/e0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lb3/e0;->d()Li3/p;

    move-result-object v1

    iget v1, v1, Li3/p;->g:I

    if-eq p1, v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    invoke-virtual {v0}, Lb3/e0;->f()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    cmp-long p1, v1, v3

    if-gtz p1, :cond_1

    invoke-virtual {v0}, Lb3/e0;->d()Li3/p;

    move-result-object p1

    iget p1, p1, Li3/p;->g:I

    invoke-virtual {p0, p1}, Lb3/h0;->A(I)I

    move-result p1

    const/high16 v1, 0x20000

    invoke-virtual {p0, p1, v1}, Lb3/h0;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    invoke-virtual {v0}, Lb3/e0;->b()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {v0}, Lb3/e0;->e()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    invoke-virtual {v0}, Lb3/e0;->a()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setAction(I)V

    invoke-virtual {v0}, Lb3/e0;->c()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setMovementGranularity(I)V

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lb3/e0;->d()Li3/p;

    move-result-object v0

    invoke-static {v0}, Lb3/h0;->u(Li3/p;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, Lb3/h0;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lb3/h0;->B:Lb3/e0;

    return-void
.end method

.method public final H(La0/s;)V
    .locals 59

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    const/16 v1, 0x40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    iget-object v9, v0, Lb3/h0;->O:Ljava/util/ArrayList;

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    iget-object v10, v6, La0/s;->b:[I

    iget-object v11, v6, La0/s;->a:[J

    array-length v1, v11

    const/4 v12, 0x2

    add-int/lit8 v13, v1, -0x2

    const/4 v14, 0x0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-ltz v13, :cond_51

    move v15, v14

    :goto_0
    aget-wide v3, v11, v15

    move/from16 v16, v12

    move/from16 v17, v13

    not-long v12, v3

    const/16 v18, 0x7

    shl-long v12, v12, v18

    and-long/2addr v12, v3

    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v12, v12, v19

    cmp-long v1, v12, v19

    if-eqz v1, :cond_50

    sub-int v1, v15, v17

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v13, v1, 0x8

    move-wide/from16 v21, v3

    move v1, v14

    :goto_1
    if-ge v1, v13, :cond_4f

    const-wide/16 v23, 0xff

    and-long v3, v21, v23

    const-wide/16 v25, 0x80

    cmp-long v3, v3, v25

    if-gez v3, :cond_4e

    shl-int/lit8 v3, v15, 0x3

    add-int/2addr v3, v1

    aget v3, v10, v3

    iget-object v4, v0, Lb3/h0;->J:La0/g0;

    invoke-virtual {v4, v3}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb3/w2;

    if-nez v4, :cond_0

    goto/16 :goto_29

    :cond_0
    iget-object v4, v4, Lb3/w2;->a:Li3/l;

    iget-object v5, v4, Li3/l;->w:La0/v0;

    invoke-virtual {v6, v3}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v14, v27

    check-cast v14, Li3/q;

    move/from16 v27, v12

    if-eqz v14, :cond_1

    iget-object v14, v14, Li3/q;->a:Li3/p;

    goto :goto_2

    :cond_1
    const/4 v14, 0x0

    :goto_2
    if-eqz v14, :cond_4d

    iget-object v12, v14, Li3/p;->c:La3/n0;

    iget-object v6, v14, Li3/p;->d:Li3/l;

    move-object/from16 v29, v10

    iget v10, v14, Li3/p;->g:I

    move-object/from16 v30, v11

    iget-object v11, v6, Li3/l;->w:La0/v0;

    move/from16 v31, v15

    iget-object v15, v11, La0/v0;->b:[Ljava/lang/Object;

    move-object/from16 v32, v15

    iget-object v15, v11, La0/v0;->c:[Ljava/lang/Object;

    move-object/from16 v33, v15

    iget-object v15, v11, La0/v0;->a:[J

    move/from16 v34, v1

    array-length v1, v15

    add-int/lit8 v1, v1, -0x2

    move-object/from16 v35, v15

    if-ltz v1, :cond_47

    move-object/from16 v40, v12

    move/from16 v39, v13

    const/4 v15, 0x0

    const/16 v38, 0x0

    :goto_3
    aget-wide v12, v35, v15

    move-object/from16 v41, v14

    move/from16 v42, v15

    not-long v14, v12

    shl-long v14, v14, v18

    and-long/2addr v14, v12

    and-long v14, v14, v19

    cmp-long v14, v14, v19

    if-eqz v14, :cond_46

    sub-int v15, v42, v1

    not-int v14, v15

    ushr-int/lit8 v14, v14, 0x1f

    rsub-int/lit8 v14, v14, 0x8

    const/4 v15, 0x0

    :goto_4
    if-ge v15, v14, :cond_45

    and-long v43, v12, v23

    cmp-long v43, v43, v25

    if-gez v43, :cond_44

    shl-int/lit8 v43, v42, 0x3

    add-int v43, v43, v15

    aget-object v44, v32, v43

    move/from16 v45, v1

    aget-object v1, v33, v43

    move-object/from16 v43, v4

    move-object/from16 v4, v44

    check-cast v4, Li3/y;

    move-wide/from16 v46, v12

    sget-object v12, Li3/u;->t:Li3/y;

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    sget-object v13, Li3/u;->u:Li3/y;

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    goto :goto_5

    :cond_2
    const/16 v44, 0x0

    goto :goto_7

    :cond_3
    :goto_5
    invoke-static {v8, v3}, Lb3/o0;->g(Ljava/util/ArrayList;I)Lb3/v2;

    move-result-object v13

    if-eqz v13, :cond_4

    const/16 v44, 0x0

    goto :goto_6

    :cond_4
    new-instance v13, Lb3/v2;

    invoke-direct {v13, v9, v3}, Lb3/v2;-><init>(Ljava/util/ArrayList;I)V

    const/16 v44, 0x1

    :goto_6
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_7
    if-nez v44, :cond_6

    invoke-virtual {v5, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_5

    const/4 v13, 0x0

    :cond_5
    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    move-object v13, v2

    move-object v2, v5

    move-object/from16 v44, v6

    move-object/from16 v48, v8

    move/from16 v28, v15

    move/from16 v12, v27

    goto/16 :goto_9

    :cond_6
    sget-object v13, Li3/u;->d:Li3/y;

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v44

    if-eqz v44, :cond_8

    const-string v4, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v5, v13}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    move/from16 v4, v27

    invoke-virtual {v0, v3, v4, v1}, Lb3/h0;->F(IILjava/lang/String;)V

    :cond_7
    move-object v13, v2

    move-object v2, v5

    move-object/from16 v44, v6

    move-object/from16 v48, v8

    move/from16 v28, v15

    move-object/from16 v8, v40

    const/16 v12, 0x8

    :goto_8
    move v15, v3

    move/from16 v3, v45

    goto/16 :goto_25

    :cond_8
    sget-object v13, Li3/u;->b:Li3/y;

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_9

    sget-object v13, Li3/u;->I:Li3/y;

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    :cond_9
    move-object v13, v2

    move-object v2, v5

    move-object/from16 v44, v6

    move-object/from16 v48, v8

    move/from16 v28, v15

    move-object/from16 v8, v40

    move v15, v3

    move/from16 v3, v45

    goto/16 :goto_24

    :cond_a
    sget-object v13, Li3/u;->c:Li3/y;

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-virtual {v0, v3}, Lb3/h0;->A(I)I

    move-result v1

    const/16 v4, 0x800

    const/16 v12, 0x8

    invoke-static {v0, v1, v4, v7, v12}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    invoke-virtual {v0, v3}, Lb3/h0;->A(I)I

    move-result v1

    invoke-static {v0, v1, v4, v2, v12}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    move-object v13, v2

    move-object v2, v5

    move-object/from16 v44, v6

    move-object/from16 v48, v8

    move/from16 v28, v15

    :goto_9
    move-object/from16 v8, v40

    goto :goto_8

    :cond_b
    sget-object v13, Li3/u;->H:Li3/y;

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v44

    move-object/from16 v48, v8

    const/4 v8, 0x4

    if-eqz v44, :cond_18

    sget-object v1, Li3/u;->x:Li3/y;

    invoke-virtual {v11, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_c

    const/4 v1, 0x0

    :cond_c
    check-cast v1, Li3/i;

    if-nez v1, :cond_e

    :cond_d
    const/4 v1, 0x0

    goto :goto_a

    :cond_e
    iget v1, v1, Li3/i;->a:I

    if-ne v1, v8, :cond_d

    const/4 v1, 0x1

    :goto_a
    if-eqz v1, :cond_17

    invoke-virtual {v11, v13}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_f

    const/4 v1, 0x0

    :cond_f
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual {v0, v3}, Lb3/h0;->A(I)I

    move-result v1

    invoke-virtual {v0, v1, v8}, Lb3/h0;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    new-instance v4, Li3/p;

    move-object/from16 v13, v41

    iget-object v8, v13, Li3/p;->a:Lb2/v;

    move-object/from16 v12, v40

    const/4 v13, 0x1

    invoke-direct {v4, v8, v13, v12, v6}, Li3/p;-><init>(Lb2/v;ZLa3/n0;Li3/l;)V

    invoke-virtual {v4}, Li3/p;->k()Li3/l;

    move-result-object v8

    sget-object v13, Li3/u;->a:Li3/y;

    iget-object v8, v8, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v13}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_10

    const/4 v8, 0x0

    :cond_10
    check-cast v8, Ljava/util/List;

    const/16 v13, 0x3e

    move-object/from16 v40, v4

    const-string v4, ","

    move-object/from16 v44, v12

    const/4 v12, 0x0

    if-eqz v8, :cond_11

    invoke-static {v13, v4, v8, v12}, La4/b;->b(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v8

    move-object v12, v8

    :cond_11
    invoke-virtual/range {v40 .. v40}, Li3/p;->k()Li3/l;

    move-result-object v8

    sget-object v13, Li3/u;->A:Li3/y;

    iget-object v8, v8, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v13}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_12

    const/4 v8, 0x0

    :cond_12
    check-cast v8, Ljava/util/List;

    move/from16 v28, v15

    const/4 v13, 0x0

    if-eqz v8, :cond_13

    const/16 v15, 0x3e

    invoke-static {v15, v4, v8, v13}, La4/b;->b(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v4

    goto :goto_b

    :cond_13
    move-object v4, v13

    :goto_b
    if-eqz v12, :cond_14

    invoke-virtual {v1, v12}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_14
    if-eqz v4, :cond_15

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    invoke-virtual {v0, v1}, Lb3/h0;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    const/16 v15, 0x800

    goto :goto_c

    :cond_16
    move/from16 v28, v15

    move-object/from16 v44, v40

    const/4 v13, 0x0

    invoke-virtual {v0, v3}, Lb3/h0;->A(I)I

    move-result v1

    const/16 v4, 0x8

    const/16 v15, 0x800

    invoke-static {v0, v1, v15, v2, v4}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    goto :goto_c

    :cond_17
    move/from16 v28, v15

    move-object/from16 v44, v40

    const/16 v4, 0x8

    const/4 v13, 0x0

    const/16 v15, 0x800

    invoke-virtual {v0, v3}, Lb3/h0;->A(I)I

    move-result v1

    invoke-static {v0, v1, v15, v7, v4}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    invoke-virtual {v0, v3}, Lb3/h0;->A(I)I

    move-result v1

    invoke-static {v0, v1, v15, v2, v4}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    :goto_c
    move-object v13, v2

    move v15, v3

    move-object v2, v5

    move-object/from16 v8, v44

    move/from16 v3, v45

    const/16 v12, 0x8

    :goto_d
    move-object/from16 v44, v6

    goto/16 :goto_25

    :cond_18
    move/from16 v36, v8

    move/from16 v28, v15

    move-object/from16 v8, v40

    const/16 v15, 0x800

    sget-object v13, Li3/u;->a:Li3/y;

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1a

    invoke-virtual {v0, v3}, Lb3/h0;->A(I)I

    move-result v4

    invoke-static/range {v36 .. v36}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const-string v13, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0, v4, v15, v12, v1}, Lb3/h0;->D(IILjava/lang/Integer;Ljava/util/List;)Z

    move-object v13, v2

    move v15, v3

    move-object v2, v5

    move-object/from16 v44, v6

    move/from16 v3, v45

    :cond_19
    :goto_e
    const/16 v12, 0x8

    goto/16 :goto_25

    :cond_1a
    sget-object v13, Li3/u;->E:Li3/y;

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    const-wide v49, 0xffffffffL

    const/16 v44, 0x20

    const-string v51, ""

    if-eqz v15, :cond_2b

    sget-object v1, Li3/k;->j:Li3/y;

    invoke-virtual {v11, v1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-virtual {v5, v13}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_1b

    const/4 v12, 0x0

    :cond_1b
    check-cast v12, Ll3/g;

    if-eqz v12, :cond_1c

    goto :goto_f

    :cond_1c
    move-object/from16 v12, v51

    :goto_f
    invoke-virtual {v11, v13}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1d

    const/4 v1, 0x0

    :cond_1d
    check-cast v1, Ll3/g;

    if-eqz v1, :cond_1e

    goto :goto_10

    :cond_1e
    move-object/from16 v1, v51

    :goto_10
    invoke-static {v1}, Lb3/h0;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v13

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v15

    move-object/from16 v52, v2

    if-le v13, v15, :cond_1f

    move v2, v15

    goto :goto_11

    :cond_1f
    move v2, v13

    :goto_11
    move/from16 v51, v13

    const/4 v13, 0x0

    :goto_12
    move/from16 v53, v2

    if-ge v13, v2, :cond_21

    invoke-interface {v12, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    move/from16 v54, v15

    invoke-interface {v1, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15

    if-eq v2, v15, :cond_20

    goto :goto_13

    :cond_20
    add-int/lit8 v13, v13, 0x1

    move/from16 v2, v53

    move/from16 v15, v54

    goto :goto_12

    :cond_21
    move/from16 v54, v15

    :goto_13
    const/4 v2, 0x0

    :goto_14
    sub-int v15, v53, v13

    if-ge v2, v15, :cond_23

    add-int/lit8 v15, v51, -0x1

    sub-int/2addr v15, v2

    invoke-interface {v12, v15}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15

    add-int/lit8 v55, v54, -0x1

    move/from16 v56, v2

    sub-int v2, v55, v56

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-eq v15, v2, :cond_22

    goto :goto_15

    :cond_22
    add-int/lit8 v2, v56, 0x1

    goto :goto_14

    :cond_23
    move/from16 v56, v2

    :goto_15
    sub-int v1, v51, v56

    sub-int/2addr v1, v13

    sub-int v15, v54, v56

    sub-int/2addr v15, v13

    sget-object v2, Li3/u;->J:Li3/y;

    invoke-virtual {v5, v2}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v51

    invoke-virtual {v11, v2}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v2

    move/from16 v53, v2

    sget-object v2, Li3/u;->E:Li3/y;

    invoke-virtual {v5, v2}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_24

    if-nez v51, :cond_24

    if-eqz v53, :cond_24

    const/16 v55, 0x1

    goto :goto_16

    :cond_24
    const/16 v55, 0x0

    :goto_16
    if-eqz v2, :cond_25

    if-eqz v51, :cond_25

    if-nez v53, :cond_25

    const/16 v51, 0x1

    goto :goto_17

    :cond_25
    const/16 v51, 0x0

    :goto_17
    if-nez v55, :cond_26

    if-eqz v51, :cond_27

    :cond_26
    move-object/from16 v53, v5

    goto :goto_18

    :cond_27
    invoke-virtual {v0, v3}, Lb3/h0;->A(I)I

    move-result v2

    move-object/from16 v53, v5

    const/16 v5, 0x10

    invoke-virtual {v0, v2, v5}, Lb3/h0;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v2

    invoke-virtual {v2, v13}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityRecord;->setRemovedCount(I)V

    invoke-virtual {v2, v15}, Landroid/view/accessibility/AccessibilityRecord;->setAddedCount(I)V

    invoke-virtual {v2, v12}, Landroid/view/accessibility/AccessibilityRecord;->setBeforeText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v1, v2

    move v15, v3

    move-object/from16 v2, v52

    goto :goto_19

    :goto_18
    invoke-virtual {v0, v3}, Lb3/h0;->A(I)I

    move-result v1

    invoke-static/range {v54 .. v54}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move v5, v3

    move-object/from16 v3, v52

    move v15, v5

    move-object v5, v4

    move-object v4, v2

    move-object/from16 v2, v52

    invoke-virtual/range {v0 .. v5}, Lb3/h0;->q(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    :goto_19
    const-string v3, "android.widget.EditText"

    invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v1}, Lb3/h0;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    if-nez v55, :cond_28

    if-eqz v51, :cond_29

    :cond_28
    sget-object v3, Li3/u;->F:Li3/y;

    invoke-virtual {v6, v3}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll3/u0;

    iget-wide v3, v3, Ll3/u0;->a:J

    shr-long v12, v3, v44

    long-to-int v5, v12

    invoke-virtual {v1, v5}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    and-long v3, v3, v49

    long-to-int v3, v3

    invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    invoke-virtual {v0, v1}, Lb3/h0;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    :cond_29
    move-object v13, v2

    :goto_1a
    move-object/from16 v44, v6

    move/from16 v3, v45

    move-object/from16 v2, v53

    goto/16 :goto_e

    :cond_2a
    move v15, v3

    move-object/from16 v53, v5

    invoke-virtual {v0, v15}, Lb3/h0;->A(I)I

    move-result v1

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0x800

    const/16 v12, 0x8

    invoke-static {v0, v1, v4, v3, v12}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    move-object v13, v2

    move-object/from16 v44, v6

    move/from16 v3, v45

    move-object/from16 v2, v53

    goto/16 :goto_25

    :cond_2b
    move v15, v3

    move-object/from16 v53, v5

    sget-object v3, Li3/u;->F:Li3/y;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-virtual {v11, v13}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_2c

    const/4 v12, 0x0

    :cond_2c
    check-cast v12, Ll3/g;

    if-eqz v12, :cond_2e

    iget-object v1, v12, Ll3/g;->x:Ljava/lang/String;

    if-nez v1, :cond_2d

    goto :goto_1b

    :cond_2d
    move-object/from16 v51, v1

    :cond_2e
    :goto_1b
    invoke-virtual {v6, v3}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/u0;

    iget-wide v3, v1, Ll3/u0;->a:J

    invoke-virtual {v0, v15}, Lb3/h0;->A(I)I

    move-result v1

    shr-long v12, v3, v44

    long-to-int v5, v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    and-long v3, v3, v49

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual/range {v51 .. v51}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static/range {v51 .. v51}, Lb3/h0;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v12

    move-object v13, v2

    move-object v2, v5

    move-object v5, v12

    invoke-virtual/range {v0 .. v5}, Lb3/h0;->q(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb3/h0;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    invoke-virtual {v0, v10}, Lb3/h0;->G(I)V

    goto :goto_1a

    :cond_2f
    move-object v13, v2

    move/from16 v3, v45

    move-object/from16 v2, v53

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_30

    sget-object v5, Li3/u;->u:Li3/y;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_31

    :cond_30
    move-object/from16 v44, v6

    goto/16 :goto_23

    :cond_31
    sget-object v5, Li3/u;->k:Li3/y;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_33

    const-string v4, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_32

    invoke-virtual {v0, v10}, Lb3/h0;->A(I)I

    move-result v1

    const/16 v4, 0x8

    invoke-virtual {v0, v1, v4}, Lb3/h0;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb3/h0;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    goto :goto_1c

    :cond_32
    const/16 v4, 0x8

    :goto_1c
    invoke-virtual {v0, v10}, Lb3/h0;->A(I)I

    move-result v1

    const/16 v5, 0x800

    invoke-static {v0, v1, v5, v13, v4}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    move v12, v4

    goto/16 :goto_d

    :cond_33
    sget-object v5, Li3/k;->w:Li3/y;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3a

    invoke-virtual {v6, v5}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v2, v5}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_34

    const/4 v12, 0x0

    :cond_34
    check-cast v12, Ljava/util/List;

    if-eqz v12, :cond_38

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move-object/from16 v44, v6

    const/4 v6, 0x0

    :goto_1d
    if-ge v6, v5, :cond_35

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v38

    move-object/from16 v45, v1

    move-object/from16 v1, v38

    check-cast v1, Li3/d;

    iget-object v1, v1, Li3/d;->a:Ljava/lang/String;

    invoke-interface {v4, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, v45

    goto :goto_1d

    :cond_35
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    move-object v5, v12

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_1e
    if-ge v6, v5, :cond_36

    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v38

    move/from16 v45, v5

    move-object/from16 v5, v38

    check-cast v5, Li3/d;

    iget-object v5, v5, Li3/d;->a:Ljava/lang/String;

    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    move/from16 v5, v45

    goto :goto_1e

    :cond_36
    invoke-interface {v4, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v5

    if-eqz v5, :cond_39

    invoke-interface {v1, v4}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_37

    goto :goto_1f

    :cond_37
    const/16 v38, 0x0

    goto/16 :goto_e

    :cond_38
    move-object/from16 v45, v1

    move-object/from16 v44, v6

    move-object/from16 v1, v45

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_19

    :cond_39
    :goto_1f
    const/16 v38, 0x1

    goto/16 :goto_e

    :cond_3a
    move-object/from16 v44, v6

    instance-of v5, v1, Li3/a;

    if-eqz v5, :cond_39

    check-cast v1, Li3/a;

    invoke-virtual {v2, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_3b

    const/4 v12, 0x0

    :cond_3b
    if-ne v1, v12, :cond_3c

    goto :goto_21

    :cond_3c
    instance-of v4, v12, Li3/a;

    if-nez v4, :cond_3d

    goto :goto_20

    :cond_3d
    iget-object v4, v1, Li3/a;->a:Ljava/lang/String;

    check-cast v12, Li3/a;

    iget-object v5, v12, Li3/a;->b:Ll83/e;

    iget-object v6, v12, Li3/a;->a:Ljava/lang/String;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3e

    goto :goto_20

    :cond_3e
    iget-object v1, v1, Li3/a;->b:Ll83/e;

    if-nez v1, :cond_3f

    if-eqz v5, :cond_3f

    goto :goto_20

    :cond_3f
    if-eqz v1, :cond_40

    if-nez v5, :cond_40

    :goto_20
    const/4 v1, 0x0

    goto :goto_22

    :cond_40
    :goto_21
    const/4 v1, 0x1

    :goto_22
    if-nez v1, :cond_37

    goto :goto_1f

    :goto_23
    invoke-virtual {v0, v8}, Lb3/h0;->w(La3/n0;)V

    invoke-static {v9, v15}, Lb3/o0;->g(Ljava/util/ArrayList;I)Lb3/v2;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v11, v12}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_41

    const/4 v12, 0x0

    :cond_41
    check-cast v12, Li3/j;

    invoke-virtual {v1, v12}, Lb3/v2;->b(Li3/j;)V

    sget-object v4, Li3/u;->u:Li3/y;

    invoke-virtual {v11, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_42

    const/4 v12, 0x0

    :cond_42
    check-cast v12, Li3/j;

    invoke-virtual {v1, v12}, Lb3/v2;->c(Li3/j;)V

    invoke-virtual {v1}, Lb3/v2;->U()Z

    move-result v4

    if-nez v4, :cond_43

    goto/16 :goto_e

    :cond_43
    iget-object v4, v0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()La3/c2;

    move-result-object v4

    new-instance v5, La3/z0;

    const/4 v6, 0x3

    invoke-direct {v5, v6, v1, v0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v6, v0, Lb3/h0;->P:Lb3/g0;

    invoke-virtual {v4, v1, v6, v5}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    goto/16 :goto_e

    :goto_24
    invoke-virtual {v0, v15}, Lb3/h0;->A(I)I

    move-result v1

    const/16 v4, 0x800

    const/16 v12, 0x8

    invoke-static {v0, v1, v4, v7, v12}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    invoke-virtual {v0, v15}, Lb3/h0;->A(I)I

    move-result v1

    invoke-static {v0, v1, v4, v13, v12}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    goto :goto_25

    :cond_44
    move-object/from16 v43, v4

    move-object/from16 v44, v6

    move-object/from16 v48, v8

    move-wide/from16 v46, v12

    move/from16 v28, v15

    move/from16 v12, v27

    move-object/from16 v8, v40

    move-object v13, v2

    move v15, v3

    move-object v2, v5

    move v3, v1

    :goto_25
    shr-long v4, v46, v12

    add-int/lit8 v1, v28, 0x1

    move v6, v15

    move v15, v1

    move v1, v3

    move v3, v6

    move-object/from16 v40, v8

    move/from16 v27, v12

    move-object/from16 v6, v44

    move-object/from16 v8, v48

    move-wide/from16 v57, v4

    move-object v5, v2

    move-object v2, v13

    move-object/from16 v4, v43

    move-wide/from16 v12, v57

    goto/16 :goto_4

    :cond_45
    move-object v13, v2

    move v15, v3

    move-object/from16 v43, v4

    move-object v2, v5

    move-object/from16 v44, v6

    move-object/from16 v48, v8

    move/from16 v12, v27

    move-object/from16 v8, v40

    move v3, v1

    if-ne v14, v12, :cond_48

    :goto_26
    move/from16 v1, v42

    goto :goto_27

    :cond_46
    move-object v13, v2

    move v15, v3

    move-object/from16 v43, v4

    move-object v2, v5

    move-object/from16 v44, v6

    move-object/from16 v48, v8

    move-object/from16 v8, v40

    move v3, v1

    goto :goto_26

    :goto_27
    if-eq v1, v3, :cond_48

    add-int/lit8 v1, v1, 0x1

    move v4, v15

    move v15, v1

    move v1, v3

    move v3, v4

    move-object v5, v2

    move-object/from16 v40, v8

    move-object v2, v13

    move-object/from16 v14, v41

    move-object/from16 v4, v43

    move-object/from16 v6, v44

    move-object/from16 v8, v48

    const/16 v27, 0x8

    goto/16 :goto_3

    :cond_47
    move v15, v3

    move-object/from16 v43, v4

    move-object/from16 v48, v8

    move/from16 v39, v13

    move-object/from16 v41, v14

    move-object v13, v2

    const/16 v38, 0x0

    :cond_48
    if-nez v38, :cond_4b

    invoke-virtual/range {v43 .. v43}, Li3/l;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_49
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-virtual/range {v41 .. v41}, Li3/p;->k()Li3/l;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li3/y;

    iget-object v3, v3, Li3/l;->w:La0/v0;

    invoke-virtual {v3, v2}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_49

    const/16 v37, 0x1

    goto :goto_28

    :cond_4a
    const/16 v37, 0x0

    :goto_28
    move/from16 v38, v37

    :cond_4b
    if-eqz v38, :cond_4c

    invoke-virtual {v0, v15}, Lb3/h0;->A(I)I

    move-result v1

    const/16 v4, 0x800

    const/16 v12, 0x8

    invoke-static {v0, v1, v4, v13, v12}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    goto :goto_2a

    :cond_4c
    const/16 v12, 0x8

    goto :goto_2a

    :cond_4d
    const-string v1, "no value for specified key"

    invoke-static {v1}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v1

    throw v1

    :cond_4e
    :goto_29
    move/from16 v34, v1

    move-object/from16 v48, v8

    move-object/from16 v29, v10

    move-object/from16 v30, v11

    move/from16 v39, v13

    move/from16 v31, v15

    move-object v13, v2

    :goto_2a
    shr-long v21, v21, v12

    add-int/lit8 v1, v34, 0x1

    move-object/from16 v6, p1

    move-object v2, v13

    move-object/from16 v10, v29

    move-object/from16 v11, v30

    move/from16 v15, v31

    move/from16 v13, v39

    move-object/from16 v8, v48

    const/4 v14, 0x0

    goto/16 :goto_1

    :cond_4f
    move-object/from16 v48, v8

    move-object/from16 v29, v10

    move-object/from16 v30, v11

    move v1, v13

    move/from16 v31, v15

    move-object v13, v2

    if-ne v1, v12, :cond_51

    move/from16 v14, v31

    :goto_2b
    move/from16 v1, v17

    goto :goto_2c

    :cond_50
    move-object v13, v2

    move-object/from16 v48, v8

    move-object/from16 v29, v10

    move-object/from16 v30, v11

    move v14, v15

    goto :goto_2b

    :goto_2c
    if-eq v14, v1, :cond_51

    add-int/lit8 v15, v14, 0x1

    move-object/from16 v6, p1

    move-object v2, v13

    move/from16 v12, v16

    move-object/from16 v10, v29

    move-object/from16 v11, v30

    move-object/from16 v8, v48

    const/4 v14, 0x0

    move v13, v1

    goto/16 :goto_0

    :cond_51
    return-void
.end method

.method public final I(La3/n0;La0/h0;)V
    .locals 5

    invoke-virtual {p1}, La3/n0;->X()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v0

    invoke-virtual {v0}, Lb3/h1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-object v0, p1, La3/n0;->e0:La3/l1;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, La3/l1;->j(I)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_4

    iget-object v0, p1, La3/n0;->e0:La3/l1;

    invoke-virtual {v0, v1}, La3/l1;->j(I)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p1

    goto :goto_0

    :cond_4
    move-object p1, v2

    :goto_1
    if-eqz p1, :cond_a

    invoke-virtual {p1}, La3/n0;->I()Li3/l;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    iget-boolean v0, v0, Li3/l;->y:Z

    const/4 v3, 0x1

    if-nez v0, :cond_8

    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object v0

    :goto_2
    if-eqz v0, :cond_7

    invoke-virtual {v0}, La3/n0;->I()Li3/l;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-boolean v4, v4, Li3/l;->y:Z

    if-ne v4, v3, :cond_6

    move-object v2, v0

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    goto :goto_2

    :cond_7
    :goto_3
    if-eqz v2, :cond_8

    move-object p1, v2

    :cond_8
    iget p1, p1, La3/n0;->x:I

    invoke-virtual {p2, p1}, La0/h0;->a(I)Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {p0, p1}, Lb3/h0;->A(I)I

    move-result p1

    const/16 p2, 0x800

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0, p1, p2, v0, v1}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    :cond_a
    :goto_4
    return-void
.end method

.method public final J(La3/n0;)V
    .locals 3

    invoke-virtual {p1}, La3/n0;->X()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v0

    invoke-virtual {v0}, Lb3/h1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget p1, p1, La3/n0;->x:I

    iget-object v0, p0, Lb3/h0;->s:La0/g0;

    invoke-virtual {v0, p1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li3/j;

    iget-object v1, p0, Lb3/h0;->t:La0/g0;

    invoke-virtual {v1, p1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li3/j;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    :goto_0
    return-void

    :cond_2
    const/16 v2, 0x1000

    invoke-virtual {p0, p1, v2}, Lb3/h0;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    if-eqz v0, :cond_3

    iget-object v2, v0, Li3/j;->a:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setScrollX(I)V

    iget-object v0, v0, Li3/j;->b:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollX(I)V

    :cond_3
    if-eqz v1, :cond_4

    iget-object v0, v1, Li3/j;->a:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollY(I)V

    iget-object v0, v1, Li3/j;->b:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollY(I)V

    :cond_4
    invoke-virtual {p0, p1}, Lb3/h0;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    return-void
.end method

.method public final K(Li3/p;IIZ)Z
    .locals 10

    iget-object v0, p1, Li3/p;->d:Li3/l;

    iget v1, p1, Li3/p;->g:I

    sget-object v2, Li3/k;->i:Li3/y;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v2}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lb3/o0;->a(Li3/p;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Li3/p;->d:Li3/l;

    invoke-virtual {p1, v2}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li3/a;

    iget-object p1, p1, Li3/a;->b:Ll83/e;

    check-cast p1, Lkotlin/jvm/functions/Function3;

    if-eqz p1, :cond_2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-interface {p1, p2, p3, p4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    if-ne p2, p3, :cond_1

    iget p4, p0, Lb3/h0;->w:I

    if-ne p3, p4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lb3/h0;->u(Li3/p;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_3

    :cond_2
    :goto_0
    return v3

    :cond_3
    if-ltz p2, :cond_4

    if-ne p2, p3, :cond_4

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result p1

    if-gt p3, p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 p2, -0x1

    :goto_1
    iput p2, p0, Lb3/h0;->w:I

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result p1

    const/4 p2, 0x1

    if-lez p1, :cond_5

    move v3, p2

    :cond_5
    invoke-virtual {p0, v1}, Lb3/h0;->A(I)I

    move-result v5

    const/4 p1, 0x0

    if-eqz v3, :cond_6

    iget p3, p0, Lb3/h0;->w:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    move-object v6, p3

    goto :goto_2

    :cond_6
    move-object v6, p1

    :goto_2
    if-eqz v3, :cond_7

    iget p3, p0, Lb3/h0;->w:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    move-object v7, p3

    goto :goto_3

    :cond_7
    move-object v7, p1

    :goto_3
    if-eqz v3, :cond_8

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_8
    move-object v4, p0

    move-object v8, p1

    invoke-virtual/range {v4 .. v9}, Lb3/h0;->q(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb3/h0;->C(Landroid/view/accessibility/AccessibilityEvent;)Z

    invoke-virtual {p0, v1}, Lb3/h0;->G(I)V

    return p2
.end method

.method public final P()V
    .locals 32

    move-object/from16 v0, p0

    new-instance v1, La0/h0;

    invoke-direct {v1}, La0/h0;-><init>()V

    iget-object v2, v0, Lb3/h0;->D:La0/h0;

    iget-object v3, v2, La0/h0;->b:[I

    iget-object v4, v2, La0/h0;->a:[J

    array-length v5, v4

    add-int/lit8 v5, v5, -0x2

    iget-object v6, v0, Lb3/h0;->J:La0/g0;

    const/16 v14, 0x8

    if-ltz v5, :cond_8

    const/4 v7, 0x0

    const-wide/16 v16, 0x80

    const-wide/16 v18, 0xff

    :goto_0
    aget-wide v9, v4, v7

    const/4 v8, 0x7

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    not-long v11, v9

    shl-long/2addr v11, v8

    and-long/2addr v11, v9

    and-long v11, v11, v20

    cmp-long v11, v11, v20

    if-eqz v11, :cond_7

    sub-int v11, v7, v5

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    rsub-int/lit8 v11, v11, 0x8

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_6

    and-long v22, v9, v18

    cmp-long v13, v22, v16

    if-gez v13, :cond_4

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget v13, v3, v13

    move/from16 v22, v8

    invoke-virtual {v0}, Lb3/h0;->t()La0/s;

    move-result-object v8

    invoke-virtual {v8, v13}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li3/q;

    const/16 v23, 0x0

    if-eqz v8, :cond_0

    iget-object v8, v8, Li3/q;->a:Li3/p;

    goto :goto_2

    :cond_0
    move-object/from16 v8, v23

    :goto_2
    if-eqz v8, :cond_1

    iget-object v8, v8, Li3/p;->d:Li3/l;

    sget-object v15, Li3/u;->d:Li3/y;

    iget-object v8, v8, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v15}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_1
    invoke-virtual {v1, v13}, La0/h0;->a(I)Z

    invoke-virtual {v6, v13}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lb3/w2;

    if-eqz v8, :cond_3

    iget-object v8, v8, Lb3/w2;->a:Li3/l;

    sget-object v15, Li3/u;->d:Li3/y;

    iget-object v8, v8, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v15}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_2

    goto :goto_3

    :cond_2
    move-object/from16 v23, v8

    :goto_3
    check-cast v23, Ljava/lang/String;

    :cond_3
    move-object/from16 v8, v23

    const/16 v15, 0x20

    invoke-virtual {v0, v13, v15, v8}, Lb3/h0;->F(IILjava/lang/String;)V

    goto :goto_4

    :cond_4
    move/from16 v22, v8

    :cond_5
    :goto_4
    shr-long/2addr v9, v14

    add-int/lit8 v12, v12, 0x1

    move/from16 v8, v22

    goto :goto_1

    :cond_6
    move/from16 v22, v8

    if-ne v11, v14, :cond_9

    goto :goto_5

    :cond_7
    move/from16 v22, v8

    :goto_5
    if-eq v7, v5, :cond_9

    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    :cond_8
    const-wide/16 v16, 0x80

    const-wide/16 v18, 0xff

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v22, 0x7

    :cond_9
    iget-object v3, v1, La0/h0;->b:[I

    iget-object v1, v1, La0/h0;->a:[J

    array-length v4, v1

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_11

    const/4 v5, 0x0

    :goto_6
    aget-wide v7, v1, v5

    not-long v9, v7

    shl-long v9, v9, v22

    and-long/2addr v9, v7

    and-long v9, v9, v20

    cmp-long v9, v9, v20

    if-eqz v9, :cond_10

    sub-int v9, v5, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    rsub-int/lit8 v9, v9, 0x8

    const/4 v10, 0x0

    :goto_7
    if-ge v10, v9, :cond_f

    and-long v11, v7, v18

    cmp-long v11, v11, v16

    if-gez v11, :cond_d

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget v11, v3, v11

    invoke-static {v11}, Ljava/lang/Integer;->hashCode(I)I

    move-result v12

    const v13, -0x3361d2af    # -8.293031E7f

    mul-int/2addr v12, v13

    shl-int/lit8 v13, v12, 0x10

    xor-int/2addr v12, v13

    and-int/lit8 v13, v12, 0x7f

    iget v15, v2, La0/h0;->c:I

    ushr-int/lit8 v12, v12, 0x7

    and-int/2addr v12, v15

    move/from16 v24, v14

    const/16 v23, 0x0

    :goto_8
    iget-object v14, v2, La0/h0;->a:[J

    shr-int/lit8 v25, v12, 0x3

    and-int/lit8 v26, v12, 0x7

    move-object/from16 v27, v1

    shl-int/lit8 v1, v26, 0x3

    aget-wide v28, v14, v25

    ushr-long v28, v28, v1

    add-int/lit8 v25, v25, 0x1

    aget-wide v25, v14, v25

    rsub-int/lit8 v14, v1, 0x40

    shl-long v25, v25, v14

    move-wide/from16 v30, v7

    int-to-long v7, v1

    neg-long v7, v7

    const/16 v1, 0x3f

    shr-long/2addr v7, v1

    and-long v7, v25, v7

    or-long v7, v28, v7

    move v1, v15

    int-to-long v14, v13

    const-wide v25, 0x101010101010101L

    mul-long v14, v14, v25

    xor-long/2addr v14, v7

    sub-long v25, v14, v25

    not-long v14, v14

    and-long v14, v25, v14

    and-long v14, v14, v20

    :goto_9
    const-wide/16 v25, 0x0

    cmp-long v28, v14, v25

    if-eqz v28, :cond_b

    invoke-static {v14, v15}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v25

    shr-int/lit8 v25, v25, 0x3

    add-int v25, v12, v25

    and-int v25, v25, v1

    move/from16 v28, v1

    iget-object v1, v2, La0/h0;->b:[I

    aget v1, v1, v25

    if-ne v1, v11, :cond_a

    :goto_a
    move/from16 v1, v25

    goto :goto_b

    :cond_a
    const-wide/16 v25, 0x1

    sub-long v25, v14, v25

    and-long v14, v14, v25

    move/from16 v1, v28

    goto :goto_9

    :cond_b
    move/from16 v28, v1

    not-long v14, v7

    const/4 v1, 0x6

    shl-long/2addr v14, v1

    and-long/2addr v7, v14

    and-long v7, v7, v20

    cmp-long v1, v7, v25

    if-eqz v1, :cond_c

    const/16 v25, -0x1

    goto :goto_a

    :goto_b
    if-ltz v1, :cond_e

    invoke-virtual {v2, v1}, La0/h0;->f(I)V

    goto :goto_c

    :cond_c
    add-int/lit8 v23, v23, 0x8

    add-int v12, v12, v23

    and-int v12, v12, v28

    move-object/from16 v1, v27

    move/from16 v15, v28

    move-wide/from16 v7, v30

    goto :goto_8

    :cond_d
    move-object/from16 v27, v1

    move-wide/from16 v30, v7

    move/from16 v24, v14

    :cond_e
    :goto_c
    shr-long v7, v30, v24

    add-int/lit8 v10, v10, 0x1

    move/from16 v14, v24

    move-object/from16 v1, v27

    goto/16 :goto_7

    :cond_f
    move-object/from16 v27, v1

    move v1, v14

    if-ne v9, v1, :cond_11

    goto :goto_d

    :cond_10
    move-object/from16 v27, v1

    :goto_d
    if-eq v5, v4, :cond_11

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v1, v27

    const/16 v14, 0x8

    goto/16 :goto_6

    :cond_11
    invoke-virtual {v6}, La0/g0;->c()V

    invoke-virtual {v0}, Lb3/h0;->t()La0/s;

    move-result-object v1

    iget-object v3, v1, La0/s;->b:[I

    iget-object v4, v1, La0/s;->c:[Ljava/lang/Object;

    iget-object v1, v1, La0/s;->a:[J

    array-length v5, v1

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_16

    const/4 v7, 0x0

    :goto_e
    aget-wide v8, v1, v7

    not-long v10, v8

    shl-long v10, v10, v22

    and-long/2addr v10, v8

    and-long v10, v10, v20

    cmp-long v10, v10, v20

    if-eqz v10, :cond_15

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v24, 0x8

    rsub-int/lit8 v14, v10, 0x8

    const/4 v10, 0x0

    :goto_f
    if-ge v10, v14, :cond_14

    and-long v11, v8, v18

    cmp-long v11, v11, v16

    if-gez v11, :cond_13

    shl-int/lit8 v11, v7, 0x3

    add-int/2addr v11, v10

    aget v12, v3, v11

    aget-object v11, v4, v11

    check-cast v11, Li3/q;

    iget-object v11, v11, Li3/q;->a:Li3/p;

    iget-object v13, v11, Li3/p;->d:Li3/l;

    sget-object v15, Li3/u;->d:Li3/y;

    iget-object v13, v13, Li3/l;->w:La0/v0;

    invoke-virtual {v13, v15}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_12

    invoke-virtual {v2, v12}, La0/h0;->a(I)Z

    move-result v13

    if-eqz v13, :cond_12

    iget-object v13, v11, Li3/p;->d:Li3/l;

    invoke-virtual {v13, v15}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    const/16 v15, 0x10

    invoke-virtual {v0, v12, v15, v13}, Lb3/h0;->F(IILjava/lang/String;)V

    :cond_12
    new-instance v13, Lb3/w2;

    invoke-virtual {v0}, Lb3/h0;->t()La0/s;

    move-result-object v15

    invoke-direct {v13, v11, v15}, Lb3/w2;-><init>(Li3/p;La0/s;)V

    invoke-virtual {v6, v12, v13}, La0/g0;->h(ILjava/lang/Object;)V

    :cond_13
    const/16 v11, 0x8

    shr-long/2addr v8, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_f

    :cond_14
    const/16 v11, 0x8

    if-ne v14, v11, :cond_16

    goto :goto_10

    :cond_15
    const/16 v11, 0x8

    :goto_10
    if-eq v7, v5, :cond_16

    add-int/lit8 v7, v7, 0x1

    goto :goto_e

    :cond_16
    new-instance v1, Lb3/w2;

    iget-object v2, v0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v2

    invoke-virtual {v2}, Li3/r;->a()Li3/p;

    move-result-object v2

    invoke-virtual {v0}, Lb3/h0;->t()La0/s;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lb3/w2;-><init>(Li3/p;La0/s;)V

    iput-object v1, v0, Lb3/h0;->K:Lb3/w2;

    return-void
.end method

.method public final b(Landroid/view/View;)Lad3/z;
    .locals 0

    iget-object p1, p0, Lb3/h0;->m:Lb3/d0;

    return-object p1
.end method

.method public final j(ILi5/f;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p2

    move-object/from16 v4, p4

    iget-object v3, v3, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Lb3/h0;->t()La0/s;

    move-result-object v5

    invoke-virtual {v5, v1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li3/q;

    if-eqz v5, :cond_1b

    iget-object v5, v5, Li3/q;->a:Li3/p;

    if-nez v5, :cond_0

    goto/16 :goto_c

    :cond_0
    iget-object v6, v5, Li3/p;->d:Li3/l;

    iget-object v7, v6, Li3/l;->w:La0/v0;

    invoke-static {v5}, Lb3/h0;->u(Li3/p;)Ljava/lang/String;

    move-result-object v8

    iget-object v9, v0, Lb3/h0;->G:Ljava/lang/String;

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/4 v10, -0x1

    if-eqz v9, :cond_1

    iget-object v4, v0, Lb3/h0;->E:La0/e0;

    invoke-virtual {v4, v1}, La0/e0;->d(I)I

    move-result v1

    if-eq v1, v10, :cond_1b

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-void

    :cond_1
    iget-object v9, v0, Lb3/h0;->H:Ljava/lang/String;

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    iget-object v4, v0, Lb3/h0;->F:La0/e0;

    invoke-virtual {v4, v1}, La0/e0;->d(I)I

    move-result v1

    if-eq v1, v10, :cond_1b

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-void

    :cond_2
    sget-object v1, Li3/k;->a:Li3/y;

    invoke-virtual {v7, v1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    const/4 v9, 0x0

    if-eqz v1, :cond_d

    if-eqz v4, :cond_d

    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"

    invoke-virtual {v4, v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const-string v7, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"

    invoke-virtual {v4, v7, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    if-lez v4, :cond_c

    if-ltz v1, :cond_c

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v7

    goto :goto_0

    :cond_3
    const v7, 0x7fffffff

    :goto_0
    if-lt v1, v7, :cond_4

    goto/16 :goto_6

    :cond_4
    invoke-static {v6}, Lb3/o0;->l(Li3/l;)Ll3/r0;

    move-result-object v6

    if-nez v6, :cond_5

    goto/16 :goto_c

    :cond_5
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v4, :cond_b

    add-int v10, v1, v8

    iget-object v12, v6, Ll3/r0;->a:Ll3/q0;

    iget-object v12, v12, Ll3/q0;->a:Ll3/g;

    iget-object v12, v12, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    if-lt v10, v12, :cond_6

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v15, v3

    move/from16 p4, v4

    goto/16 :goto_5

    :cond_6
    invoke-virtual {v6, v10}, Ll3/r0;->b(I)Lh2/c;

    move-result-object v10

    invoke-virtual {v5}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v12

    const-wide/16 v13, 0x0

    if-eqz v12, :cond_8

    invoke-virtual {v12}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v15

    iget-boolean v15, v15, Lb2/v;->N:Z

    if-eqz v15, :cond_7

    goto :goto_2

    :cond_7
    move-object v12, v9

    :goto_2
    if-eqz v12, :cond_8

    invoke-virtual {v12, v13, v14}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide v13

    :cond_8
    invoke-virtual {v10, v13, v14}, Lh2/c;->l(J)Lh2/c;

    move-result-object v10

    invoke-virtual {v5}, Li3/p;->g()Lh2/c;

    move-result-object v12

    invoke-virtual {v10, v12}, Lh2/c;->j(Lh2/c;)Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-virtual {v10, v12}, Lh2/c;->h(Lh2/c;)Lh2/c;

    move-result-object v10

    goto :goto_3

    :cond_9
    move-object v10, v9

    :goto_3
    if-eqz v10, :cond_a

    iget v12, v10, Lh2/c;->a:F

    iget v13, v10, Lh2/c;->b:F

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v14, v12

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v12, v12

    const/16 v16, 0x20

    shl-long v14, v14, v16

    const-wide v17, 0xffffffffL

    and-long v12, v12, v17

    or-long/2addr v12, v14

    iget-object v14, v0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v14, v12, v13}, Landroidx/compose/ui/platform/AndroidComposeView;->v(J)J

    move-result-wide v12

    iget v15, v10, Lh2/c;->c:F

    iget v10, v10, Lh2/c;->d:F

    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v15

    move/from16 p2, v10

    int-to-long v9, v15

    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v15

    move-wide/from16 v19, v12

    int-to-long v11, v15

    shl-long v9, v9, v16

    and-long v11, v11, v17

    or-long/2addr v9, v11

    invoke-virtual {v14, v9, v10}, Landroidx/compose/ui/platform/AndroidComposeView;->v(J)J

    move-result-wide v9

    new-instance v11, Landroid/graphics/RectF;

    shr-long v12, v19, v16

    long-to-int v12, v12

    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    shr-long v14, v9, v16

    long-to-int v14, v14

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v15

    invoke-static {v13, v15}, Ljava/lang/Math;->min(FF)F

    move-result v13

    move-object v15, v3

    move/from16 p4, v4

    and-long v3, v19, v17

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    and-long v9, v9, v17

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    invoke-static {v4, v10}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    invoke-static {v10, v12}, Ljava/lang/Math;->max(FF)F

    move-result v10

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-static {v3, v9}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-direct {v11, v13, v4, v10, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto :goto_4

    :cond_a
    move-object v15, v3

    move/from16 p4, v4

    const/4 v11, 0x0

    :goto_4
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_5
    add-int/lit8 v8, v8, 0x1

    move/from16 v4, p4

    move-object v3, v15

    const/4 v9, 0x0

    goto/16 :goto_1

    :cond_b
    move-object v15, v3

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Landroid/graphics/RectF;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Landroid/os/Parcelable;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    return-void

    :cond_c
    :goto_6
    const-string v1, "AccessibilityDelegate"

    const-string v2, "Invalid arguments for accessibility character locations"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_d
    move-object v15, v3

    sget-object v1, Li3/u;->y:Li3/y;

    invoke-virtual {v7, v1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    if-eqz v4, :cond_f

    const-string v3, "androidx.compose.ui.semantics.testTag"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-virtual {v7, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_e

    const/4 v9, 0x0

    goto :goto_7

    :cond_e
    move-object v9, v1

    :goto_7
    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_1b

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1, v2, v9}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void

    :cond_f
    const-string v1, "androidx.compose.ui.semantics.id"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    iget v3, v5, Li3/p;->g:I

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-void

    :cond_10
    const-string v1, "androidx.compose.ui.semantics.shapeType"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "androidx.compose.ui.semantics.shapeRegion"

    const-string v6, "androidx.compose.ui.semantics.shapeCorners"

    const-string v8, "androidx.compose.ui.semantics.shapeRect"

    if-eqz v3, :cond_15

    sget-object v2, Li3/u;->O:Li3/y;

    invoke-virtual {v7, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_11

    const/4 v9, 0x0

    goto :goto_8

    :cond_11
    move-object v9, v2

    :goto_8
    check-cast v9, Li2/a1;

    if-eqz v9, :cond_1b

    invoke-virtual {v0, v9, v5}, Lb3/h0;->p(Li2/a1;Li3/p;)Li2/p0;

    move-result-object v2

    instance-of v3, v2, Li2/n0;

    if-eqz v3, :cond_12

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v1, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v2}, Lb3/h0;->L(Li2/p0;)Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v1, v8, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void

    :cond_12
    instance-of v3, v2, Li2/o0;

    if-eqz v3, :cond_13

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v1, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v2}, Lb3/h0;->L(Li2/p0;)Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v1, v8, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v2}, Lb3/h0;->M(Li2/p0;)[F

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    return-void

    :cond_13
    instance-of v3, v2, Li2/m0;

    if-eqz v3, :cond_14

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    const/4 v5, 0x2

    invoke-virtual {v3, v1, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v2}, Lb3/h0;->N(Li2/p0;)Landroid/graphics/Region;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void

    :cond_14
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_15
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    sget-object v1, Li3/u;->O:Li3/y;

    invoke-virtual {v7, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_16

    const/4 v9, 0x0

    goto :goto_9

    :cond_16
    move-object v9, v1

    :goto_9
    check-cast v9, Li2/a1;

    if-eqz v9, :cond_1b

    invoke-virtual {v0, v9, v5}, Lb3/h0;->p(Li2/a1;Li3/p;)Li2/p0;

    move-result-object v1

    invoke-static {v1}, Lb3/h0;->L(Li2/p0;)Landroid/graphics/Rect;

    move-result-object v1

    if-eqz v1, :cond_1b

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v2, v8, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void

    :cond_17
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    sget-object v1, Li3/u;->O:Li3/y;

    invoke-virtual {v7, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_18

    const/4 v9, 0x0

    goto :goto_a

    :cond_18
    move-object v9, v1

    :goto_a
    check-cast v9, Li2/a1;

    if-eqz v9, :cond_1b

    invoke-virtual {v0, v9, v5}, Lb3/h0;->p(Li2/a1;Li3/p;)Li2/p0;

    move-result-object v1

    invoke-static {v1}, Lb3/h0;->M(Li2/p0;)[F

    move-result-object v1

    if-eqz v1, :cond_1b

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v2, v6, v1}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    return-void

    :cond_19
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b

    sget-object v1, Li3/u;->O:Li3/y;

    invoke-virtual {v7, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1a

    const/4 v9, 0x0

    goto :goto_b

    :cond_1a
    move-object v9, v1

    :goto_b
    check-cast v9, Li2/a1;

    if-eqz v9, :cond_1b

    invoke-virtual {v0, v9, v5}, Lb3/h0;->p(Li2/a1;Li3/p;)Li2/p0;

    move-result-object v1

    invoke-static {v1}, Lb3/h0;->N(Li2/p0;)Landroid/graphics/Region;

    move-result-object v1

    if-eqz v1, :cond_1b

    invoke-virtual {v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v2, v4, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_1b
    :goto_c
    return-void
.end method

.method public final k(Li3/q;)Landroid/graphics/Rect;
    .locals 11

    iget-object p1, p1, Li3/q;->b:Ly3/k;

    iget v0, p1, Ly3/k;->a:I

    int-to-float v0, v0

    iget v1, p1, Ly3/k;->b:I

    int-to-float v1, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v2, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    const-wide v5, 0xffffffffL

    and-long/2addr v0, v5

    or-long/2addr v0, v2

    iget-object v2, p0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v2, v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->v(J)J

    move-result-wide v0

    iget v3, p1, Ly3/k;->c:I

    int-to-float v3, v3

    iget p1, p1, Ly3/k;->d:I

    int-to-float p1, p1

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v7, v3

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v9, p1

    shl-long/2addr v7, v4

    and-long/2addr v9, v5

    or-long/2addr v7, v9

    invoke-virtual {v2, v7, v8}, Landroidx/compose/ui/platform/AndroidComposeView;->v(J)J

    move-result-wide v2

    new-instance p1, Landroid/graphics/Rect;

    shr-long v7, v0, v4

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    shr-long v9, v2, v4

    long-to-int v4, v9

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    move-result v8

    float-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    move-result-wide v8

    double-to-float v8, v8

    float-to-int v8, v8

    and-long/2addr v0, v5

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    and-long/2addr v2, v5

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v1

    float-to-double v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    double-to-float v1, v5

    float-to-int v1, v1

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-float v0, v4

    float-to-int v0, v0

    invoke-direct {p1, v8, v1, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1
.end method

.method public final l(Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lb3/f0;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lb3/f0;

    iget v3, v2, Lb3/f0;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lb3/f0;->E:I

    goto :goto_0

    :cond_0
    new-instance v2, Lb3/f0;

    invoke-direct {v2, v1, v0}, Lb3/f0;-><init>(Lb3/h0;Ls83/c;)V

    :goto_0
    iget-object v0, v2, Lb3/f0;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lb3/f0;->E:I

    const/4 v5, 0x2

    iget-object v6, v1, Lb3/h0;->y:La0/h;

    const/4 v7, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v4, v2, Lb3/f0;->x:Ldc3/c;

    iget-object v8, v2, Lb3/f0;->w:La0/h0;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v0, v5

    move-object v9, v6

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    move-object v9, v6

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Lb3/f0;->x:Ldc3/c;

    iget-object v8, v2, Lb3/f0;->w:La0/h0;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    new-instance v0, La0/h0;

    invoke-direct {v0}, La0/h0;-><init>()V

    iget-object v4, v1, Lb3/h0;->z:Ldc3/h;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, Ldc3/c;

    invoke-direct {v8, v4}, Ldc3/c;-><init>(Ldc3/h;)V

    :goto_1
    iput-object v0, v2, Lb3/f0;->w:La0/h0;

    iput-object v8, v2, Lb3/f0;->x:Ldc3/c;

    iput v7, v2, Lb3/f0;->E:I

    invoke-virtual {v8, v2}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    goto/16 :goto_6

    :cond_4
    move-object v15, v8

    move-object v8, v0

    move-object v0, v4

    move-object v4, v15

    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v4}, Ldc3/c;->c()Ljava/lang/Object;

    invoke-virtual {v1}, Lb3/h0;->v()Z

    move-result v0

    if-eqz v0, :cond_7

    iget v0, v6, La0/h;->y:I

    const/4 v9, 0x0

    move v10, v9

    :goto_3
    if-ge v10, v0, :cond_5

    iget-object v11, v6, La0/h;->x:[Ljava/lang/Object;

    aget-object v11, v11, v10

    check-cast v11, La3/n0;

    invoke-virtual {v1, v11, v8}, Lb3/h0;->I(La3/n0;La0/h0;)V

    invoke-virtual {v1, v11}, Lb3/h0;->J(La3/n0;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_5
    iput v9, v8, La0/h0;->d:I

    iget-object v0, v8, La0/h0;->a:[J

    sget-object v9, La0/d1;->a:[J

    if-eq v0, v9, :cond_6

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    invoke-static {v0, v9, v10}, Lm83/n;->p0([JJ)V

    iget-object v0, v8, La0/h0;->a:[J

    iget v9, v8, La0/h0;->c:I

    shr-int/lit8 v10, v9, 0x3

    and-int/lit8 v9, v9, 0x7

    shl-int/lit8 v9, v9, 0x3

    aget-wide v11, v0, v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-wide/16 v13, 0xff

    shl-long/2addr v13, v9

    move-object v9, v6

    not-long v5, v13

    and-long/2addr v5, v11

    or-long/2addr v5, v13

    :try_start_3
    aput-wide v5, v0, v10

    goto :goto_4

    :cond_6
    move-object v9, v6

    :goto_4
    iget v0, v8, La0/h0;->c:I

    invoke-static {v0}, La0/d1;->a(I)I

    move-result v0

    iget v5, v8, La0/h0;->d:I

    sub-int/2addr v0, v5

    iput v0, v8, La0/h0;->e:I

    iget-boolean v0, v1, Lb3/h0;->L:Z

    if-nez v0, :cond_8

    iput-boolean v7, v1, Lb3/h0;->L:Z

    iget-object v0, v1, Lb3/h0;->l:Landroid/os/Handler;

    iget-object v5, v1, Lb3/h0;->N:Landroidx/lifecycle/z0;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_8

    :cond_7
    move-object v9, v6

    :cond_8
    :goto_5
    invoke-virtual {v9}, La0/h;->clear()V

    iget-object v0, v1, Lb3/h0;->s:La0/g0;

    invoke-virtual {v0}, La0/g0;->c()V

    iget-object v0, v1, Lb3/h0;->t:La0/g0;

    invoke-virtual {v0}, La0/g0;->c()V

    iget-wide v5, v1, Lb3/h0;->h:J

    iput-object v8, v2, Lb3/f0;->w:La0/h0;

    iput-object v4, v2, Lb3/f0;->x:Ldc3/c;

    const/4 v0, 0x2

    iput v0, v2, Lb3/f0;->E:I

    invoke-static {v5, v6, v2}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v5, v3, :cond_9

    :goto_6
    return-object v3

    :cond_9
    :goto_7
    move v5, v0

    move-object v0, v8

    move-object v6, v9

    move-object v8, v4

    goto/16 :goto_1

    :cond_a
    move-object v9, v6

    invoke-virtual {v9}, La0/h;->clear()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_8
    invoke-virtual {v9}, La0/h;->clear()V

    throw v0
.end method

.method public final m(IJZ)Z
    .locals 22

    move-wide/from16 v0, p2

    move/from16 v2, p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    :cond_0
    const/16 v16, 0x0

    goto/16 :goto_a

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lb3/h0;->t()La0/s;

    move-result-object v3

    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {v0, v1, v5, v6}, Lh2/b;->c(JJ)Z

    move-result v5

    if-nez v5, :cond_0

    const-wide v5, 0x7fffffff7fffffffL

    and-long/2addr v5, v0

    const-wide v7, 0x7fffff007fffffL

    add-long/2addr v5, v7

    const-wide v7, -0x7fffffff80000000L    # -1.0609978955E-314

    and-long/2addr v5, v7

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    if-nez v5, :cond_0

    const/4 v5, 0x1

    if-ne v2, v5, :cond_2

    sget-object v2, Li3/u;->u:Li3/y;

    goto :goto_0

    :cond_2
    if-nez v2, :cond_11

    sget-object v2, Li3/u;->t:Li3/y;

    :goto_0
    iget-object v6, v3, La0/s;->c:[Ljava/lang/Object;

    iget-object v3, v3, La0/s;->a:[J

    array-length v7, v3

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    aget-wide v10, v3, v8

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_f

    sub-int v12, v8, v7

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v12, :cond_d

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_b

    shl-int/lit8 v15, v8, 0x3

    add-int/2addr v15, v14

    aget-object v15, v6, v15

    check-cast v15, Li3/q;

    const/16 v16, 0x0

    iget-object v4, v15, Li3/q;->b:Ly3/k;

    iget v5, v4, Ly3/k;->a:I

    int-to-float v5, v5

    move/from16 p4, v13

    iget v13, v4, Ly3/k;->b:I

    int-to-float v13, v13

    iget v0, v4, Ly3/k;->c:I

    int-to-float v0, v0

    iget v1, v4, Ly3/k;->d:I

    int-to-float v1, v1

    const/16 v4, 0x20

    move/from16 v18, v0

    move/from16 v19, v1

    shr-long v0, p2, v4

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const-wide v20, 0xffffffffL

    move v4, v0

    and-long v0, p2, v20

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    cmpl-float v1, v4, v5

    if-ltz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    move/from16 v1, v16

    :goto_3
    cmpg-float v4, v4, v18

    if-gez v4, :cond_4

    const/4 v4, 0x1

    goto :goto_4

    :cond_4
    move/from16 v4, v16

    :goto_4
    and-int/2addr v1, v4

    cmpl-float v4, v0, v13

    if-ltz v4, :cond_5

    const/4 v4, 0x1

    goto :goto_5

    :cond_5
    move/from16 v4, v16

    :goto_5
    and-int/2addr v1, v4

    cmpg-float v0, v0, v19

    if-gez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_6

    :cond_6
    move/from16 v0, v16

    :goto_6
    and-int/2addr v0, v1

    if-nez v0, :cond_7

    goto :goto_8

    :cond_7
    iget-object v0, v15, Li3/q;->a:Li3/p;

    iget-object v0, v0, Li3/p;->d:Li3/l;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8

    const/4 v0, 0x0

    :cond_8
    check-cast v0, Li3/j;

    if-nez v0, :cond_9

    goto :goto_8

    :cond_9
    iget-object v1, v0, Li3/j;->a:Lc93/a;

    if-gez p1, :cond_a

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_c

    :goto_7
    const/4 v9, 0x1

    goto :goto_8

    :cond_a
    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v0, v0, Li3/j;->b:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    cmpg-float v0, v1, v0

    if-gez v0, :cond_c

    goto :goto_7

    :cond_b
    move/from16 p4, v13

    const/16 v16, 0x0

    :cond_c
    :goto_8
    shr-long v10, v10, p4

    add-int/lit8 v14, v14, 0x1

    move-wide/from16 v0, p2

    move/from16 v13, p4

    const/4 v5, 0x1

    goto/16 :goto_2

    :cond_d
    move v0, v13

    const/16 v16, 0x0

    if-ne v12, v0, :cond_e

    goto :goto_9

    :cond_e
    return v9

    :cond_f
    const/16 v16, 0x0

    :goto_9
    if-eq v8, v7, :cond_10

    add-int/lit8 v8, v8, 0x1

    move-wide/from16 v0, p2

    const/4 v5, 0x1

    goto/16 :goto_1

    :cond_10
    return v9

    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :goto_a
    return v16
.end method

.method public final n()V
    .locals 2

    const-string v0, "sendAccessibilitySemanticsStructureChangeEvents"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lb3/h0;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v0

    invoke-virtual {v0}, Li3/r;->a()Li3/p;

    move-result-object v0

    iget-object v1, p0, Lb3/h0;->K:Lb3/w2;

    invoke-virtual {p0, v0, v1}, Lb3/h0;->B(Li3/p;Lb3/w2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v0, "sendSemanticsPropertyChangeEvents"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1
    invoke-virtual {p0}, Lb3/h0;->t()La0/s;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb3/h0;->H(La0/s;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v0, "updateSemanticsNodesCopyAndPanes"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_2
    invoke-virtual {p0}, Lb3/h0;->P()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_1
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :catchall_2
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method

.method public final o(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 2

    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    const-string v0, "android.view.View"

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    invoke-virtual {p0}, Lb3/h0;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb3/h0;->t()La0/s;

    move-result-object v0

    invoke-virtual {v0, p1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li3/q;

    if-eqz p1, :cond_1

    iget-object p1, p1, Li3/q;->a:Li3/p;

    iget-object v0, p1, Li3/p;->d:Li3/l;

    sget-object v1, Li3/u;->J:Li3/y;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    iget-object p1, p1, Li3/p;->d:Li3/l;

    sget-object v0, Li3/u;->n:Li3/y;

    iget-object p1, p1, Li3/l;->w:La0/v0;

    invoke-virtual {p1, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p2, p1}, Lx30/s0;->F(Landroid/view/accessibility/AccessibilityEvent;Z)V

    :cond_1
    return-object p2
.end method

.method public final p(Li2/a1;Li3/p;)Li2/p0;
    .locals 3

    invoke-virtual {p2}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-wide v0, v0, Ly2/j1;->y:J

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1}, Lv63/b;->l(J)J

    move-result-wide v0

    iget-object p2, p2, Li3/p;->c:La3/n0;

    iget-object p2, p2, La3/n0;->Y:Ly3/m;

    iget-object v2, p0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Ly3/c;

    move-result-object v2

    invoke-interface {p1, v0, v1, p2, v2}, Li2/a1;->a(JLy3/m;Ly3/c;)Li2/p0;

    move-result-object p1

    return-object p1
.end method

.method public final q(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    const/16 v0, 0x2000

    invoke-virtual {p0, p1, v0}, Lb3/h0;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_1
    if-eqz p4, :cond_2

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    :cond_2
    if-eqz p5, :cond_3

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object p1
.end method

.method public final r(Li3/p;)I
    .locals 4

    iget-object v0, p1, Li3/p;->d:Li3/l;

    iget-object p1, p1, Li3/p;->d:Li3/l;

    sget-object v1, Li3/u;->a:Li3/y;

    sget-object v1, Li3/u;->a:Li3/y;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Li3/u;->F:Li3/y;

    iget-object v1, p1, Li3/l;->w:La0/v0;

    invoke-virtual {v1, v0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll3/u0;

    iget-wide v0, p1, Ll3/u0;->a:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    return p1

    :cond_0
    iget p1, p0, Lb3/h0;->w:I

    return p1
.end method

.method public final s(Li3/p;)I
    .locals 2

    iget-object v0, p1, Li3/p;->d:Li3/l;

    iget-object p1, p1, Li3/p;->d:Li3/l;

    sget-object v1, Li3/u;->a:Li3/y;

    sget-object v1, Li3/u;->a:Li3/y;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Li3/u;->F:Li3/y;

    iget-object v1, p1, Li3/l;->w:La0/v0;

    invoke-virtual {v1, v0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll3/u0;

    iget-wide v0, p1, Ll3/u0;->a:J

    const/16 p1, 0x20

    shr-long/2addr v0, p1

    long-to-int p1, v0

    return p1

    :cond_0
    iget p1, p0, Lb3/h0;->w:I

    return p1
.end method

.method public final t()La0/s;
    .locals 7

    iget-boolean v0, p0, Lb3/h0;->A:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb3/h0;->A:Z

    iget-object v0, p0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v1

    invoke-static {v1}, Li3/s;->b(Li3/r;)La0/g0;

    move-result-object v1

    iput-object v1, p0, Lb3/h0;->C:La0/g0;

    invoke-virtual {p0}, Lb3/h0;->v()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lb3/h0;->C:La0/g0;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v2, p0, Lb3/h0;->E:La0/e0;

    invoke-virtual {v2}, La0/e0;->a()V

    iget-object v3, p0, Lb3/h0;->F:La0/e0;

    invoke-virtual {v3}, La0/e0;->a()V

    const/4 v4, -0x1

    invoke-virtual {v1, v4}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li3/q;

    if-eqz v4, :cond_0

    iget-object v4, v4, Li3/q;->a:Li3/p;

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v5, La0/a1;

    const/16 v6, 0x8

    invoke-direct {v5, v1, v6}, La0/a1;-><init>(Ljava/lang/Object;I)V

    new-instance v1, La0/a1;

    const/16 v6, 0x9

    invoke-direct {v1, v0, v6}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v4, v5, v1, v0}, Li3/b0;->b(Li3/p;La0/a1;La0/a1;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    const/4 v4, 0x1

    if-gt v4, v1, :cond_1

    :goto_1
    add-int/lit8 v5, v4, -0x1

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li3/p;

    iget v5, v5, Li3/p;->g:I

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li3/p;

    iget v6, v6, Li3/p;->g:I

    invoke-virtual {v2, v5, v6}, La0/e0;->f(II)V

    invoke-virtual {v3, v6, v5}, La0/e0;->f(II)V

    if-eq v4, v1, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lb3/h0;->C:La0/g0;

    return-object v0
.end method

.method public final v()Z
    .locals 1

    iget-object v0, p0, Lb3/h0;->g:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb3/h0;->k:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final w(La3/n0;)V
    .locals 1

    iget-object v0, p0, Lb3/h0;->y:La0/h;

    invoke-virtual {v0, p1}, La0/h;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb3/h0;->z:Ldc3/h;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p1, v0}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
