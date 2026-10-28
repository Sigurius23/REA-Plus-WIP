.class public final Lo0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld1/j;

.field public final b:I

.field public final c:I

.field public final d:Lo0/l;

.field public final e:Lo0/v;

.field public final synthetic f:Ld1/j;


# direct methods
.method public constructor <init>(Ld1/j;IILo0/l;Lo0/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/m;->f:Ld1/j;

    iput-object p1, p0, Lo0/m;->a:Ld1/j;

    iput p2, p0, Lo0/m;->b:I

    iput p3, p0, Lo0/m;->c:I

    iput-object p4, p0, Lo0/m;->d:Lo0/l;

    iput-object p5, p0, Lo0/m;->e:Lo0/v;

    return-void
.end method


# virtual methods
.method public final a(II)J
    .locals 3

    iget-object v0, p0, Lo0/m;->a:Ld1/j;

    iget-object v1, v0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, [I

    const/4 v2, 0x1

    if-ne p2, v2, :cond_0

    aget p1, v1, p1

    goto :goto_0

    :cond_0
    add-int/2addr p2, p1

    sub-int/2addr p2, v2

    iget-object v0, v0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, [I

    aget v2, v0, p2

    aget p2, v1, p2

    add-int/2addr v2, p2

    aget p1, v0, p1

    sub-int p1, v2, p1

    :goto_0
    const/4 p2, 0x0

    if-gez p1, :cond_1

    move p1, p2

    :cond_1
    if-ltz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "width must be >= 0"

    invoke-static {v0}, Ly3/i;->a(Ljava/lang/String;)V

    :goto_1
    const v0, 0x7fffffff

    invoke-static {p1, p1, p2, v0}, Ly3/b;->h(IIII)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b(I)Lo0/q;
    .locals 13

    iget-object v0, p0, Lo0/m;->e:Lo0/v;

    invoke-virtual {v0, p1}, Lo0/v;->b(I)Lfn/f;

    move-result-object v0

    iget v1, v0, Lfn/f;->a:I

    iget-object v2, v0, Lfn/f;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    add-int v5, v1, v3

    iget v6, p0, Lo0/m;->b:I

    if-ne v5, v6, :cond_0

    goto :goto_0

    :cond_0
    iget v5, p0, Lo0/m;->c:I

    move v11, v5

    goto :goto_1

    :cond_1
    :goto_0
    move v11, v4

    :goto_1
    new-array v5, v3, [Lo0/p;

    move v8, v4

    :goto_2
    if-ge v4, v3, :cond_2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo0/c;

    iget-wide v6, v6, Lo0/c;->a:J

    long-to-int v9, v6

    move v12, v11

    invoke-virtual {p0, v8, v9}, Lo0/m;->a(II)J

    move-result-wide v10

    iget-object v6, p0, Lo0/m;->d:Lo0/l;

    add-int v7, v1, v4

    invoke-virtual/range {v6 .. v12}, Lo0/l;->Q(IIIJI)Lo0/p;

    move-result-object v6

    add-int/2addr v8, v9

    aput-object v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    move v11, v12

    goto :goto_2

    :cond_2
    move v12, v11

    iget-object v10, v0, Lfn/f;->b:Ljava/util/List;

    new-instance v6, Lo0/q;

    iget-object v9, p0, Lo0/m;->f:Ld1/j;

    move v7, p1

    move-object v8, v5

    invoke-direct/range {v6 .. v11}, Lo0/q;-><init>(I[Lo0/p;Ld1/j;Ljava/util/List;I)V

    return-object v6
.end method
