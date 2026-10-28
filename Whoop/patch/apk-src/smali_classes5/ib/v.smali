.class public final Lib/v;
.super Lib/u;
.source "SourceFile"


# instance fields
.field public final a:Lib/i;

.field public final b:Z

.field public final c:I


# direct methods
.method public constructor <init>(Lib/a0;ZILib/k;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lib/i;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2, p4}, Lib/i;-><init>(Lib/a0;ILjava/util/concurrent/Executor;Lib/k;)V

    iput-object v0, p0, Lib/v;->a:Lib/i;

    iput-boolean p2, p0, Lib/v;->b:Z

    iput p3, p0, Lib/v;->c:I

    const/4 p1, 0x1

    if-lt p3, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Page size must be non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(IILjava/util/List;)V
    .locals 4

    iget-object v0, p0, Lib/v;->a:Lib/i;

    iget-object v1, v0, Lib/i;->c:Ljava/lang/Object;

    check-cast v1, Lib/a0;

    invoke-virtual {v1}, Lib/j;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lib/l;->e:Lib/l;

    invoke-virtual {v0, p1}, Lib/i;->b(Lib/l;)V

    return-void

    :cond_0
    if-ltz p1, :cond_7

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, p1

    if-gt v1, p2, :cond_6

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_2

    if-gtz p2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Initial result cannot be empty if items are present in data set."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, p1

    if-eq v1, p2, :cond_4

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lib/v;->c:I

    rem-int/2addr v1, v2

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", position "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", totalCount "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", pageSize "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    iget-boolean v1, p0, Lib/v;->b:Z

    if-eqz v1, :cond_5

    sub-int/2addr p2, p1

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr p2, v1

    new-instance v1, Lib/l;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2, p3}, Lib/l;-><init>(IIILjava/util/List;)V

    invoke-virtual {v0, v1}, Lib/i;->b(Lib/l;)V

    return-void

    :cond_5
    new-instance p2, Lib/l;

    invoke-direct {p2, p3, p1}, Lib/l;-><init>(Ljava/util/List;I)V

    invoke-virtual {v0, p2}, Lib/i;->b(Lib/l;)V

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "List size + position too large, last item in list beyond totalCount."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Position must be non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
