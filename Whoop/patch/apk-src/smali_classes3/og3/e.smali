.class public final Log3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# instance fields
.field public final w:Ljg3/e;

.field public final x:Ljg3/p;

.field public final y:Ljg3/p;


# direct methods
.method public constructor <init>(JLjg3/p;Ljg3/p;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    invoke-static {p1, p2, v0, p3}, Ljg3/e;->u0(JILjg3/p;)Ljg3/e;

    move-result-object p1

    iput-object p1, p0, Log3/e;->w:Ljg3/e;

    .line 7
    iput-object p3, p0, Log3/e;->x:Ljg3/p;

    .line 8
    iput-object p4, p0, Log3/e;->y:Ljg3/p;

    return-void
.end method

.method public constructor <init>(Ljg3/e;Ljg3/p;Ljg3/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Log3/e;->w:Ljg3/e;

    .line 3
    iput-object p2, p0, Log3/e;->x:Ljg3/p;

    .line 4
    iput-object p3, p0, Log3/e;->y:Ljg3/p;

    return-void
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Log3/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Log3/a;-><init>(BLjava/io/Serializable;)V

    return-object v0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 6

    check-cast p1, Log3/e;

    iget-object v0, p0, Log3/e;->x:Ljg3/p;

    iget-object v1, p0, Log3/e;->w:Ljg3/e;

    invoke-virtual {v1, v0}, Lkg3/b;->o0(Ljg3/p;)J

    move-result-wide v2

    iget-object v0, v1, Ljg3/e;->G:Ljg3/f;

    iget v0, v0, Ljg3/f;->I:I

    int-to-long v0, v0

    invoke-static {v2, v3, v0, v1}, Ljg3/c;->q0(JJ)Ljg3/c;

    move-result-object v0

    iget-object v1, p1, Log3/e;->w:Ljg3/e;

    iget-object p1, p1, Log3/e;->x:Ljg3/p;

    invoke-virtual {v1, p1}, Lkg3/b;->o0(Ljg3/p;)J

    move-result-wide v2

    iget-object p1, v1, Ljg3/e;->G:Ljg3/f;

    iget p1, p1, Ljg3/f;->I:I

    int-to-long v4, p1

    invoke-static {v2, v3, v4, v5}, Ljg3/c;->q0(JJ)Ljg3/c;

    move-result-object p1

    iget-wide v1, v0, Ljg3/c;->F:J

    iget-wide v3, p1, Ljg3/c;->F:J

    invoke-static {v1, v2, v3, v4}, Lcom/squareup/wire/n;->q(JJ)I

    move-result v1

    if-eqz v1, :cond_0

    return v1

    :cond_0
    iget v0, v0, Ljg3/c;->G:I

    iget p1, p1, Ljg3/c;->G:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Log3/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Log3/e;

    iget-object v1, p0, Log3/e;->w:Ljg3/e;

    iget-object v3, p1, Log3/e;->w:Ljg3/e;

    invoke-virtual {v1, v3}, Ljg3/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Log3/e;->x:Ljg3/p;

    iget-object v3, p1, Log3/e;->x:Ljg3/p;

    invoke-virtual {v1, v3}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Log3/e;->y:Ljg3/p;

    iget-object p1, p1, Log3/e;->y:Ljg3/p;

    invoke-virtual {v1, p1}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Log3/e;->w:Ljg3/e;

    invoke-virtual {v0}, Ljg3/e;->hashCode()I

    move-result v0

    iget-object v1, p0, Log3/e;->x:Ljg3/p;

    iget v1, v1, Ljg3/p;->x:I

    xor-int/2addr v0, v1

    iget-object v1, p0, Log3/e;->y:Ljg3/p;

    iget v1, v1, Ljg3/p;->x:I

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Transition["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Log3/e;->y:Ljg3/p;

    iget v2, v1, Ljg3/p;->x:I

    iget-object v3, p0, Log3/e;->x:Ljg3/p;

    iget v4, v3, Ljg3/p;->x:I

    if-le v2, v4, :cond_0

    const-string v2, "Gap"

    goto :goto_0

    :cond_0
    const-string v2, "Overlap"

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Log3/e;->w:Ljg3/e;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
