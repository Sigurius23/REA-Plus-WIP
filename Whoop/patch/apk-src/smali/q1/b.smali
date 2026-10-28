.class public final Lq1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp1/q;

.field public b:Lq1/a;

.field public c:Z

.field public final d:La3/x;

.field public e:Z

.field public f:I

.field public g:I

.field public final h:Ljava/util/ArrayList;

.field public i:I

.field public j:I

.field public k:I

.field public l:I


# direct methods
.method public constructor <init>(Lp1/q;Lq1/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq1/b;->a:Lp1/q;

    iput-object p2, p0, Lq1/b;->b:Lq1/a;

    new-instance p1, La3/x;

    invoke-direct {p1}, La3/x;-><init>()V

    iput-object p1, p0, Lq1/b;->d:La3/x;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lq1/b;->e:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lq1/b;->h:Ljava/util/ArrayList;

    const/4 p1, -0x1

    iput p1, p0, Lq1/b;->i:I

    iput p1, p0, Lq1/b;->j:I

    iput p1, p0, Lq1/b;->k:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    invoke-virtual {p0}, Lq1/b;->c()V

    iget-object v0, p0, Lq1/b;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    iget v0, p0, Lq1/b;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lq1/b;->g:I

    return-void
.end method

.method public final b()V
    .locals 7

    iget v0, p0, Lq1/b;->g:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    iget-object v2, p0, Lq1/b;->b:Lq1/a;

    iget-object v2, v2, Lq1/a;->a:Lq1/l0;

    sget-object v3, Lq1/h0;->d:Lq1/h0;

    invoke-virtual {v2, v3}, Lq1/l0;->g0(Lq1/j0;)V

    iget-object v3, v2, Lq1/l0;->c:[I

    iget v4, v2, Lq1/l0;->d:I

    iget-object v5, v2, Lq1/l0;->a:[Lq1/j0;

    iget v2, v2, Lq1/l0;->b:I

    add-int/lit8 v2, v2, -0x1

    aget-object v2, v5, v2

    iget v2, v2, Lq1/j0;->b:I

    sub-int/2addr v4, v2

    aput v0, v3, v4

    iput v1, p0, Lq1/b;->g:I

    :cond_0
    iget-object v0, p0, Lq1/b;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lq1/b;->b:Lq1/a;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v4, v3, [Ljava/lang/Object;

    move v5, v1

    :goto_0
    if-ge v5, v3, :cond_1

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, v2, Lq1/a;->a:Lq1/l0;

    sget-object v3, Lq1/k;->d:Lq1/k;

    invoke-virtual {v2, v3}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v2, v1, v4}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_3
    return-void
.end method

.method public final c()V
    .locals 8

    iget v0, p0, Lq1/b;->l:I

    if-lez v0, :cond_1

    iget v1, p0, Lq1/b;->i:I

    const/4 v2, -0x1

    if-ltz v1, :cond_0

    invoke-virtual {p0}, Lq1/b;->b()V

    iget-object v3, p0, Lq1/b;->b:Lq1/a;

    iget-object v3, v3, Lq1/a;->a:Lq1/l0;

    sget-object v4, Lq1/z;->d:Lq1/z;

    invoke-virtual {v3, v4}, Lq1/l0;->g0(Lq1/j0;)V

    iget v4, v3, Lq1/l0;->d:I

    iget-object v5, v3, Lq1/l0;->a:[Lq1/j0;

    iget v6, v3, Lq1/l0;->b:I

    add-int/lit8 v6, v6, -0x1

    aget-object v5, v5, v6

    iget v5, v5, Lq1/j0;->b:I

    sub-int/2addr v4, v5

    iget-object v3, v3, Lq1/l0;->c:[I

    aput v1, v3, v4

    add-int/lit8 v4, v4, 0x1

    aput v0, v3, v4

    iput v2, p0, Lq1/b;->i:I

    goto :goto_0

    :cond_0
    iget v1, p0, Lq1/b;->k:I

    iget v3, p0, Lq1/b;->j:I

    invoke-virtual {p0}, Lq1/b;->b()V

    iget-object v4, p0, Lq1/b;->b:Lq1/a;

    iget-object v4, v4, Lq1/a;->a:Lq1/l0;

    sget-object v5, Lq1/v;->d:Lq1/v;

    invoke-virtual {v4, v5}, Lq1/l0;->g0(Lq1/j0;)V

    iget v5, v4, Lq1/l0;->d:I

    iget-object v6, v4, Lq1/l0;->a:[Lq1/j0;

    iget v7, v4, Lq1/l0;->b:I

    add-int/lit8 v7, v7, -0x1

    aget-object v6, v6, v7

    iget v6, v6, Lq1/j0;->b:I

    sub-int/2addr v5, v6

    iget-object v4, v4, Lq1/l0;->c:[I

    add-int/lit8 v6, v5, 0x1

    aput v1, v4, v6

    aput v3, v4, v5

    add-int/lit8 v5, v5, 0x2

    aput v0, v4, v5

    iput v2, p0, Lq1/b;->j:I

    iput v2, p0, Lq1/b;->k:I

    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lq1/b;->l:I

    :cond_1
    return-void
.end method

.method public final d(Z)V
    .locals 5

    iget-object v0, p0, Lq1/b;->a:Lp1/q;

    if-eqz p1, :cond_0

    iget-object p1, v0, Lp1/q;->G:Lp1/e2;

    iget p1, p1, Lp1/e2;->i:I

    goto :goto_0

    :cond_0
    iget-object p1, v0, Lp1/q;->G:Lp1/e2;

    iget p1, p1, Lp1/e2;->g:I

    :goto_0
    iget v0, p0, Lq1/b;->f:I

    sub-int v0, p1, v0

    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "Tried to seek backward"

    invoke-static {v1}, Lp1/r;->c(Ljava/lang/String;)V

    :goto_1
    if-lez v0, :cond_2

    iget-object v1, p0, Lq1/b;->b:Lq1/a;

    iget-object v1, v1, Lq1/a;->a:Lq1/l0;

    sget-object v2, Lq1/d;->d:Lq1/d;

    invoke-virtual {v1, v2}, Lq1/l0;->g0(Lq1/j0;)V

    iget-object v2, v1, Lq1/l0;->c:[I

    iget v3, v1, Lq1/l0;->d:I

    iget-object v4, v1, Lq1/l0;->a:[Lq1/j0;

    iget v1, v1, Lq1/l0;->b:I

    add-int/lit8 v1, v1, -0x1

    aget-object v1, v4, v1

    iget v1, v1, Lq1/j0;->b:I

    sub-int/2addr v3, v1

    aput v0, v2, v3

    iput p1, p0, Lq1/b;->f:I

    :cond_2
    return-void
.end method

.method public final e(II)V
    .locals 2

    if-lez p2, :cond_3

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid remove index "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_1
    iget v0, p0, Lq1/b;->i:I

    if-ne v0, p1, :cond_2

    iget p1, p0, Lq1/b;->l:I

    add-int/2addr p1, p2

    iput p1, p0, Lq1/b;->l:I

    return-void

    :cond_2
    invoke-virtual {p0}, Lq1/b;->c()V

    iput p1, p0, Lq1/b;->i:I

    iput p2, p0, Lq1/b;->l:I

    :cond_3
    return-void
.end method
