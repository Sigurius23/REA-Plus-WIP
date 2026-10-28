.class public final Lg6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final p:Lg6/c;

.field public static final q:Lg6/c;

.field public static final r:Lg6/c;

.field public static final s:Lg6/c;

.field public static final t:Lg6/c;

.field public static final u:Lg6/c;


# instance fields
.field public a:F

.field public b:F

.field public c:Z

.field public final d:Lfr/k;

.field public final e:Luf/c0;

.field public f:Z

.field public g:F

.field public h:F

.field public i:J

.field public j:F

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public m:Lg6/g;

.field public n:F

.field public o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg6/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg6/c;-><init>(I)V

    sput-object v0, Lg6/f;->p:Lg6/c;

    new-instance v0, Lg6/c;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lg6/c;-><init>(I)V

    sput-object v0, Lg6/f;->q:Lg6/c;

    new-instance v0, Lg6/c;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lg6/c;-><init>(I)V

    sput-object v0, Lg6/f;->r:Lg6/c;

    new-instance v0, Lg6/c;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lg6/c;-><init>(I)V

    sput-object v0, Lg6/f;->s:Lg6/c;

    new-instance v0, Lg6/c;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lg6/c;-><init>(I)V

    sput-object v0, Lg6/f;->t:Lg6/c;

    new-instance v0, Lg6/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg6/c;-><init>(I)V

    sput-object v0, Lg6/f;->u:Lg6/c;

    return-void
.end method

.method public constructor <init>(Lfr/k;)V
    .locals 5

    sget-object v0, Lfr/k;->Q:Lfr/j;

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 18
    iput v1, p0, Lg6/f;->a:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 19
    iput v1, p0, Lg6/f;->b:F

    const/4 v2, 0x0

    .line 20
    iput-boolean v2, p0, Lg6/f;->c:Z

    .line 21
    iput-boolean v2, p0, Lg6/f;->f:Z

    .line 22
    iput v1, p0, Lg6/f;->g:F

    const v3, -0x800001

    .line 23
    iput v3, p0, Lg6/f;->h:F

    const-wide/16 v3, 0x0

    .line 24
    iput-wide v3, p0, Lg6/f;->i:J

    .line 25
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lg6/f;->k:Ljava/util/ArrayList;

    .line 26
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lg6/f;->l:Ljava/util/ArrayList;

    .line 27
    iput-object p1, p0, Lg6/f;->d:Lfr/k;

    .line 28
    iput-object v0, p0, Lg6/f;->e:Luf/c0;

    .line 29
    sget-object p1, Lg6/f;->r:Lg6/c;

    if-eq v0, p1, :cond_4

    sget-object p1, Lg6/f;->s:Lg6/c;

    if-eq v0, p1, :cond_4

    sget-object p1, Lg6/f;->t:Lg6/c;

    if-ne v0, p1, :cond_0

    goto :goto_1

    .line 30
    :cond_0
    sget-object p1, Lg6/f;->u:Lg6/c;

    const/high16 v3, 0x3b800000    # 0.00390625f

    if-ne v0, p1, :cond_1

    .line 31
    iput v3, p0, Lg6/f;->j:F

    goto :goto_2

    .line 32
    :cond_1
    sget-object p1, Lg6/f;->p:Lg6/c;

    if-eq v0, p1, :cond_3

    sget-object p1, Lg6/f;->q:Lg6/c;

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 33
    iput p1, p0, Lg6/f;->j:F

    goto :goto_2

    .line 34
    :cond_3
    :goto_0
    iput v3, p0, Lg6/f;->j:F

    goto :goto_2

    :cond_4
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 35
    iput p1, p0, Lg6/f;->j:F

    :goto_2
    const/4 p1, 0x0

    .line 36
    iput-object p1, p0, Lg6/f;->m:Lg6/g;

    .line 37
    iput v1, p0, Lg6/f;->n:F

    .line 38
    iput-boolean v2, p0, Lg6/f;->o:Z

    return-void
.end method

.method public constructor <init>(Lg6/e;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lg6/f;->a:F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 3
    iput v0, p0, Lg6/f;->b:F

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lg6/f;->c:Z

    .line 5
    iput-boolean v1, p0, Lg6/f;->f:Z

    .line 6
    iput v0, p0, Lg6/f;->g:F

    const v2, -0x800001

    .line 7
    iput v2, p0, Lg6/f;->h:F

    const-wide/16 v2, 0x0

    .line 8
    iput-wide v2, p0, Lg6/f;->i:J

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lg6/f;->k:Ljava/util/ArrayList;

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lg6/f;->l:Ljava/util/ArrayList;

    const/4 v2, 0x0

    .line 11
    iput-object v2, p0, Lg6/f;->d:Lfr/k;

    .line 12
    new-instance v3, Lg6/d;

    invoke-direct {v3, p1}, Lg6/d;-><init>(Lg6/e;)V

    iput-object v3, p0, Lg6/f;->e:Luf/c0;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 13
    iput p1, p0, Lg6/f;->j:F

    .line 14
    iput-object v2, p0, Lg6/f;->m:Lg6/g;

    .line 15
    iput v0, p0, Lg6/f;->n:F

    .line 16
    iput-boolean v1, p0, Lg6/f;->o:Z

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 5

    iget-boolean v0, p0, Lg6/f;->f:Z

    if-eqz v0, :cond_0

    iput p1, p0, Lg6/f;->n:F

    return-void

    :cond_0
    iget-object v0, p0, Lg6/f;->m:Lg6/g;

    if-nez v0, :cond_1

    new-instance v0, Lg6/g;

    invoke-direct {v0, p1}, Lg6/g;-><init>(F)V

    iput-object v0, p0, Lg6/f;->m:Lg6/g;

    :cond_1
    iget-object v0, p0, Lg6/f;->m:Lg6/g;

    float-to-double v1, p1

    iput-wide v1, v0, Lg6/g;->i:D

    double-to-float p1, v1

    float-to-double v1, p1

    iget p1, p0, Lg6/f;->g:F

    float-to-double v3, p1

    cmpl-double p1, v1, v3

    if-gtz p1, :cond_a

    iget p1, p0, Lg6/f;->h:F

    float-to-double v3, p1

    cmpg-double p1, v1, v3

    if-ltz p1, :cond_9

    iget p1, p0, Lg6/f;->j:F

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float/2addr p1, v1

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v1

    iput-wide v1, v0, Lg6/g;->d:D

    const-wide v3, 0x404f400000000000L    # 62.5

    mul-double/2addr v1, v3

    iput-wide v1, v0, Lg6/g;->e:D

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne p1, v0, :cond_8

    iget-boolean p1, p0, Lg6/f;->f:Z

    if-nez p1, :cond_7

    if-nez p1, :cond_7

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg6/f;->f:Z

    iget-boolean p1, p0, Lg6/f;->c:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lg6/f;->e:Luf/c0;

    iget-object v0, p0, Lg6/f;->d:Lfr/k;

    invoke-virtual {p1, v0}, Luf/c0;->X(Lfr/k;)F

    move-result p1

    iput p1, p0, Lg6/f;->b:F

    :cond_2
    iget p1, p0, Lg6/f;->b:F

    iget v0, p0, Lg6/f;->g:F

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_6

    iget v0, p0, Lg6/f;->h:F

    cmpg-float p1, p1, v0

    if-ltz p1, :cond_6

    sget-object p1, Lg6/b;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v0, Lg6/b;

    invoke-direct {v0}, Lg6/b;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg6/b;

    iget-object v0, p1, Lg6/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p1, Lg6/b;->d:La33/d;

    if-nez v1, :cond_4

    new-instance v1, La33/d;

    iget-object v2, p1, Lg6/b;->c:Le10/k0;

    invoke-direct {v1, v2}, La33/d;-><init>(Le10/k0;)V

    iput-object v1, p1, Lg6/b;->d:La33/d;

    :cond_4
    iget-object p1, p1, Lg6/b;->d:La33/d;

    iget-object v1, p1, La33/d;->y:Ljava/lang/Object;

    check-cast v1, Landroid/view/Choreographer;

    iget-object p1, p1, La33/d;->z:Ljava/lang/Object;

    check-cast p1, Lg6/a;

    invoke-virtual {v1, p1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    :cond_5
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Starting value need to be in between min value and max value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    return-void

    :cond_8
    new-instance p1, Landroid/util/AndroidRuntimeException;

    const-string v0, "Animations may only be started on the main thread"

    invoke-direct {p1, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Final position of the spring cannot be less than the min value."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Final position of the spring cannot be greater than the max value."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(F)V
    .locals 7

    iget-object v0, p0, Lg6/f;->e:Luf/c0;

    iget-object v1, p0, Lg6/f;->d:Lfr/k;

    invoke-virtual {v0, v1, p1}, Luf/c0;->k0(Lfr/k;F)V

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lg6/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc/t;

    iget v1, p0, Lg6/f;->b:F

    iget-object v2, v0, Lbc/t;->g:Lbc/c0;

    iget-wide v3, v2, Lbc/w;->X:J

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    float-to-double v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    const-wide/16 v5, -0x1

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    iget-wide v5, v0, Lbc/t;->a:J

    invoke-virtual {v2, v3, v4, v5, v6}, Lbc/c0;->G(JJ)V

    iput-wide v3, v0, Lbc/t;->a:J

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_1
    if-ltz p1, :cond_3

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_2
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lg6/f;->m:Lg6/g;

    iget-wide v0, v0, Lg6/g;->b:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lg6/f;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg6/f;->o:Z

    :cond_0
    return-void

    :cond_1
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Animations may only be started on the main thread"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Spring animations can only come to an end when there is damping"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
