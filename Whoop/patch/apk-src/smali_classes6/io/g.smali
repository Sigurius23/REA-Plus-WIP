.class public final Lio/g;
.super Lio/v;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:I

.field public J:Z

.field public K:Z

.field public L:Z

.field public final M:Landroid/util/SparseArray;

.field public final N:Landroid/util/SparseBooleanArray;

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/v;-><init>()V

    .line 2
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lio/g;->M:Landroid/util/SparseArray;

    .line 3
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lio/g;->N:Landroid/util/SparseBooleanArray;

    .line 4
    invoke-virtual {p0}, Lio/g;->g()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    .line 5
    invoke-direct {p0}, Lio/v;-><init>()V

    .line 6
    sget v0, Llo/y;->a:I

    const/16 v1, 0x13

    const/16 v2, 0x17

    if-lt v0, v1, :cond_3

    if-ge v0, v2, :cond_0

    .line 7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 8
    :cond_0
    const-string v1, "captioning"

    .line 9
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/CaptioningManager;

    if-eqz v1, :cond_3

    .line 10
    invoke-virtual {v1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x440

    .line 11
    iput v3, p0, Lio/v;->t:I

    .line 12
    invoke-virtual {v1}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object v1

    if-eqz v1, :cond_3

    const/16 v3, 0x15

    if-lt v0, v3, :cond_2

    .line 13
    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 14
    :cond_2
    invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v1

    .line 15
    :goto_0
    invoke-static {v1}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v1

    iput-object v1, p0, Lio/v;->s:Lzr/g0;

    :cond_3
    :goto_1
    const/4 v1, 0x0

    const/16 v3, 0x11

    if-lt v0, v3, :cond_4

    .line 16
    const-string v4, "display"

    .line 17
    invoke-virtual {p1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/display/DisplayManager;

    if-eqz v4, :cond_4

    .line 18
    invoke-virtual {v4, v1}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object v4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_5

    .line 19
    const-string v4, "window"

    .line 20
    invoke-virtual {p1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/WindowManager;

    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v4

    .line 23
    :cond_5
    invoke-virtual {v4}, Landroid/view/Display;->getDisplayId()I

    move-result v5

    if-nez v5, :cond_a

    invoke-static {p1}, Llo/y;->y(Landroid/content/Context;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v5, 0x1c

    if-ge v0, v5, :cond_6

    .line 24
    const-string v5, "sys.display-size"

    invoke-static {v5}, Llo/y;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    .line 25
    :cond_6
    const-string v5, "vendor.display-size"

    invoke-static {v5}, Llo/y;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 26
    :goto_3
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_9

    .line 27
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    const-string v7, "x"

    const/4 v8, -0x1

    .line 28
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    .line 29
    array-length v7, v6

    const/4 v8, 0x2

    if-ne v7, v8, :cond_7

    .line 30
    aget-object v1, v6, v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v7, 0x1

    .line 31
    aget-object v6, v6, v7

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    if-lez v1, :cond_7

    if-lez v6, :cond_7

    .line 32
    new-instance v7, Landroid/graphics/Point;

    invoke-direct {v7, v1, v6}, Landroid/graphics/Point;-><init>(II)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    .line 33
    :catch_0
    :cond_7
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    const-string v6, "Invalid display size: "

    if-eqz v5, :cond_8

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_8
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 34
    :goto_4
    const-string v5, "Util"

    invoke-static {v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    :cond_9
    const-string v1, "Sony"

    sget-object v5, Llo/y;->c:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Llo/y;->d:Ljava/lang/String;

    const-string v5, "BRAVIA"

    .line 36
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v1, "com.sony.dtv.hardware.panel.qfhd"

    invoke-virtual {p1, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 38
    new-instance p1, Landroid/graphics/Point;

    const/16 v0, 0xf00

    const/16 v1, 0x870

    invoke-direct {p1, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    :goto_5
    move-object v7, p1

    goto :goto_6

    .line 39
    :cond_a
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    if-lt v0, v2, :cond_b

    .line 40
    invoke-virtual {v4}, Landroid/view/Display;->getMode()Landroid/view/Display$Mode;

    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/view/Display$Mode;->getPhysicalWidth()I

    move-result v1

    iput v1, p1, Landroid/graphics/Point;->x:I

    .line 42
    invoke-virtual {v0}, Landroid/view/Display$Mode;->getPhysicalHeight()I

    move-result v0

    iput v0, p1, Landroid/graphics/Point;->y:I

    goto :goto_5

    :cond_b
    if-lt v0, v3, :cond_c

    .line 43
    invoke-virtual {v4, p1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    goto :goto_5

    .line 44
    :cond_c
    invoke-virtual {v4, p1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    goto :goto_5

    .line 45
    :goto_6
    iget p1, v7, Landroid/graphics/Point;->x:I

    iget v0, v7, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, p1, v0}, Lio/g;->f(II)Lio/v;

    .line 46
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lio/g;->M:Landroid/util/SparseArray;

    .line 47
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lio/g;->N:Landroid/util/SparseBooleanArray;

    .line 48
    invoke-virtual {p0}, Lio/g;->g()V

    return-void
.end method

.method public constructor <init>(Lio/f;)V
    .locals 6

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-virtual {p0, p1}, Lio/v;->b(Lio/w;)V

    .line 51
    iget v0, p1, Lio/f;->Z:I

    iput v0, p0, Lio/g;->I:I

    .line 52
    iget-boolean v0, p1, Lio/f;->a0:Z

    iput-boolean v0, p0, Lio/g;->z:Z

    .line 53
    iget-boolean v0, p1, Lio/f;->b0:Z

    iput-boolean v0, p0, Lio/g;->A:Z

    .line 54
    iget-boolean v0, p1, Lio/f;->c0:Z

    iput-boolean v0, p0, Lio/g;->B:Z

    .line 55
    iget-boolean v0, p1, Lio/f;->d0:Z

    iput-boolean v0, p0, Lio/g;->C:Z

    .line 56
    iget-boolean v0, p1, Lio/f;->e0:Z

    iput-boolean v0, p0, Lio/g;->D:Z

    .line 57
    iget-boolean v0, p1, Lio/f;->f0:Z

    iput-boolean v0, p0, Lio/g;->E:Z

    .line 58
    iget-boolean v0, p1, Lio/f;->g0:Z

    iput-boolean v0, p0, Lio/g;->F:Z

    .line 59
    iget-boolean v0, p1, Lio/f;->h0:Z

    iput-boolean v0, p0, Lio/g;->G:Z

    .line 60
    iget-boolean v0, p1, Lio/f;->i0:Z

    iput-boolean v0, p0, Lio/g;->H:Z

    .line 61
    iget-boolean v0, p1, Lio/f;->j0:Z

    iput-boolean v0, p0, Lio/g;->J:Z

    .line 62
    iget-boolean v0, p1, Lio/f;->k0:Z

    iput-boolean v0, p0, Lio/g;->K:Z

    .line 63
    iget-boolean v0, p1, Lio/f;->l0:Z

    iput-boolean v0, p0, Lio/g;->L:Z

    .line 64
    iget-object v0, p1, Lio/f;->m0:Landroid/util/SparseArray;

    .line 65
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    const/4 v2, 0x0

    .line 66
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 67
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    new-instance v4, Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v3, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 68
    :cond_0
    iput-object v1, p0, Lio/g;->M:Landroid/util/SparseArray;

    .line 69
    iget-object p1, p1, Lio/f;->n0:Landroid/util/SparseBooleanArray;

    .line 70
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clone()Landroid/util/SparseBooleanArray;

    move-result-object p1

    iput-object p1, p0, Lio/g;->N:Landroid/util/SparseBooleanArray;

    return-void
.end method


# virtual methods
.method public final a()Lio/w;
    .locals 1

    new-instance v0, Lio/f;

    invoke-direct {v0, p0}, Lio/f;-><init>(Lio/g;)V

    return-object v0
.end method

.method public final c(Ljava/util/Set;)Lio/v;
    .locals 0

    invoke-super {p0, p1}, Lio/v;->c(Ljava/util/Set;)Lio/v;

    return-object p0
.end method

.method public final d()V
    .locals 1

    const/16 v0, 0x2d0

    iput v0, p0, Lio/v;->a:I

    const/16 v0, 0x500

    iput v0, p0, Lio/v;->b:I

    return-void
.end method

.method public final e()V
    .locals 1

    const/16 v0, 0x2d0

    iput v0, p0, Lio/v;->e:I

    const/16 v0, 0x500

    iput v0, p0, Lio/v;->f:I

    return-void
.end method

.method public final f(II)Lio/v;
    .locals 0

    invoke-super {p0, p1, p2}, Lio/v;->f(II)Lio/v;

    return-object p0
.end method

.method public final g()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/g;->z:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lio/g;->A:Z

    iput-boolean v0, p0, Lio/g;->B:Z

    iput-boolean v1, p0, Lio/g;->C:Z

    iput-boolean v0, p0, Lio/g;->D:Z

    iput-boolean v1, p0, Lio/g;->E:Z

    iput-boolean v1, p0, Lio/g;->F:Z

    iput-boolean v1, p0, Lio/g;->G:Z

    iput-boolean v1, p0, Lio/g;->H:Z

    iput v1, p0, Lio/g;->I:I

    iput-boolean v0, p0, Lio/g;->J:Z

    iput-boolean v1, p0, Lio/g;->K:Z

    iput-boolean v0, p0, Lio/g;->L:Z

    return-void
.end method
