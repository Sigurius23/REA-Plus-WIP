.class public final Lo9/i;
.super Lu8/s0;
.source "SourceFile"


# instance fields
.field public final A:Z

.field public final B:Landroid/util/SparseArray;

.field public final C:Landroid/util/SparseBooleanArray;

.field public final u:Z

.field public final v:Z

.field public final w:Z

.field public final x:Z

.field public final y:Z

.field public final z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Lu8/s0;-><init>()V

    .line 18
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lo9/i;->B:Landroid/util/SparseArray;

    .line 19
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lo9/i;->C:Landroid/util/SparseBooleanArray;

    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lo9/i;->u:Z

    .line 21
    iput-boolean v0, p0, Lo9/i;->v:Z

    .line 22
    iput-boolean v0, p0, Lo9/i;->w:Z

    .line 23
    iput-boolean v0, p0, Lo9/i;->x:Z

    .line 24
    iput-boolean v0, p0, Lo9/i;->y:Z

    .line 25
    iput-boolean v0, p0, Lo9/i;->z:Z

    .line 26
    iput-boolean v0, p0, Lo9/i;->A:Z

    return-void
.end method

.method public constructor <init>(Lo9/j;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lu8/s0;->b(Lu8/t0;)V

    .line 3
    iget-boolean v0, p1, Lo9/j;->u:Z

    iput-boolean v0, p0, Lo9/i;->u:Z

    .line 4
    iget-boolean v0, p1, Lo9/j;->v:Z

    iput-boolean v0, p0, Lo9/i;->v:Z

    .line 5
    iget-boolean v0, p1, Lo9/j;->w:Z

    iput-boolean v0, p0, Lo9/i;->w:Z

    .line 6
    iget-boolean v0, p1, Lo9/j;->x:Z

    iput-boolean v0, p0, Lo9/i;->x:Z

    .line 7
    iget-boolean v0, p1, Lo9/j;->y:Z

    iput-boolean v0, p0, Lo9/i;->y:Z

    .line 8
    iget-boolean v0, p1, Lo9/j;->z:Z

    iput-boolean v0, p0, Lo9/i;->z:Z

    .line 9
    iget-boolean v0, p1, Lo9/j;->A:Z

    iput-boolean v0, p0, Lo9/i;->A:Z

    .line 10
    iget-object v0, p1, Lo9/j;->B:Landroid/util/SparseArray;

    .line 11
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    const/4 v2, 0x0

    .line 12
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 13
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

    .line 14
    :cond_0
    iput-object v1, p0, Lo9/i;->B:Landroid/util/SparseArray;

    .line 15
    iget-object p1, p1, Lo9/j;->C:Landroid/util/SparseBooleanArray;

    .line 16
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clone()Landroid/util/SparseBooleanArray;

    move-result-object p1

    iput-object p1, p0, Lo9/i;->C:Landroid/util/SparseBooleanArray;

    return-void
.end method


# virtual methods
.method public final c([Ljava/lang/String;)Lu8/s0;
    .locals 0

    invoke-super {p0, p1}, Lu8/s0;->c([Ljava/lang/String;)Lu8/s0;

    return-object p0
.end method

.method public final d(I)V
    .locals 1

    iget-object v0, p0, Lu8/s0;->t:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method
