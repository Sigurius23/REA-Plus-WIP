.class public final Lm9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/q;


# static fields
.field public static final J:Lt9/s;


# instance fields
.field public E:Z

.field public F:Lxl/a;

.field public G:J

.field public H:Lt9/e0;

.field public I:[Lu8/p;

.field public final w:Lt9/n;

.field public final x:I

.field public final y:Lu8/p;

.field public final z:Landroid/util/SparseArray;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt9/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm9/c;->J:Lt9/s;

    return-void
.end method

.method public constructor <init>(Lt9/n;ILu8/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/c;->w:Lt9/n;

    iput p2, p0, Lm9/c;->x:I

    iput-object p3, p0, Lm9/c;->y:Lu8/p;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lm9/c;->z:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final a(Lxl/a;JJ)V
    .locals 6

    iput-object p1, p0, Lm9/c;->F:Lxl/a;

    iput-wide p4, p0, Lm9/c;->G:J

    iget-boolean v0, p0, Lm9/c;->E:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v3, 0x0

    iget-object v5, p0, Lm9/c;->w:Lt9/n;

    if-nez v0, :cond_1

    invoke-interface {v5, p0}, Lt9/n;->g(Lt9/q;)V

    cmp-long p1, p2, v1

    if-eqz p1, :cond_0

    invoke-interface {v5, v3, v4, p2, p3}, Lt9/n;->b(JJ)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lm9/c;->E:Z

    return-void

    :cond_1
    cmp-long v0, p2, v1

    if-nez v0, :cond_2

    move-wide p2, v3

    :cond_2
    invoke-interface {v5, v3, v4, p2, p3}, Lt9/n;->b(JJ)V

    const/4 p2, 0x0

    :goto_0
    iget-object p3, p0, Lm9/c;->z:Landroid/util/SparseArray;

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge p2, v0, :cond_5

    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lm9/b;

    if-nez p1, :cond_3

    iget-object v0, p3, Lm9/b;->c:Lt9/m;

    iput-object v0, p3, Lm9/b;->e:Lt9/k0;

    goto :goto_1

    :cond_3
    iput-wide p4, p3, Lm9/b;->f:J

    iget v0, p3, Lm9/b;->a:I

    invoke-virtual {p1, v0}, Lxl/a;->F(I)Lt9/k0;

    move-result-object v0

    iput-object v0, p3, Lm9/b;->e:Lt9/k0;

    iget-object p3, p3, Lm9/b;->d:Lu8/p;

    if-eqz p3, :cond_4

    invoke-interface {v0, p3}, Lt9/k0;->a(Lu8/p;)V

    :cond_4
    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final l()V
    .locals 4

    iget-object v0, p0, Lm9/c;->z:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    new-array v1, v1, [Lu8/p;

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm9/b;

    iget-object v3, v3, Lm9/b;->d:Lu8/p;

    invoke-static {v3}, Lva3/g;->j(Ljava/lang/Object;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lm9/c;->I:[Lu8/p;

    return-void
.end method

.method public final o(II)Lt9/k0;
    .locals 5

    iget-object v0, p0, Lm9/c;->z:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9/b;

    if-nez v1, :cond_4

    iget-object v1, p0, Lm9/c;->I:[Lu8/p;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lva3/g;->i(Z)V

    new-instance v1, Lm9/b;

    iget v2, p0, Lm9/c;->x:I

    if-ne p2, v2, :cond_1

    iget-object v2, p0, Lm9/c;->y:Lu8/p;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-direct {v1, p1, p2, v2}, Lm9/b;-><init>(IILu8/p;)V

    iget-object v2, p0, Lm9/c;->F:Lxl/a;

    iget-wide v3, p0, Lm9/c;->G:J

    if-nez v2, :cond_2

    iget-object p2, v1, Lm9/b;->c:Lt9/m;

    iput-object p2, v1, Lm9/b;->e:Lt9/k0;

    goto :goto_2

    :cond_2
    iput-wide v3, v1, Lm9/b;->f:J

    invoke-virtual {v2, p2}, Lxl/a;->F(I)Lt9/k0;

    move-result-object p2

    iput-object p2, v1, Lm9/b;->e:Lt9/k0;

    iget-object v2, v1, Lm9/b;->d:Lu8/p;

    if-eqz v2, :cond_3

    invoke-interface {p2, v2}, Lt9/k0;->a(Lu8/p;)V

    :cond_3
    :goto_2
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_4
    return-object v1
.end method

.method public final v(Lt9/e0;)V
    .locals 0

    iput-object p1, p0, Lm9/c;->H:Lt9/e0;

    return-void
.end method
