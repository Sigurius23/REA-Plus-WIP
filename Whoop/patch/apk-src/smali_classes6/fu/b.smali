.class public final Lfu/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:[I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    if-lez p2, :cond_0

    .line 2
    iput p1, p0, Lfu/b;->w:I

    .line 3
    iput p2, p0, Lfu/b;->x:I

    add-int/lit8 p1, p1, 0x1f

    .line 4
    div-int/lit8 p1, p1, 0x20

    iput p1, p0, Lfu/b;->y:I

    mul-int/2addr p1, p2

    .line 5
    new-array p1, p1, [I

    iput-object p1, p0, Lfu/b;->z:[I

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Both dimensions must be greater than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(III[I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Lfu/b;->w:I

    .line 9
    iput p2, p0, Lfu/b;->x:I

    .line 10
    iput p3, p0, Lfu/b;->y:I

    .line 11
    iput-object p4, p0, Lfu/b;->z:[I

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 5

    new-instance v0, Lfu/b;

    iget-object v1, p0, Lfu/b;->z:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iget v2, p0, Lfu/b;->w:I

    iget v3, p0, Lfu/b;->x:I

    iget v4, p0, Lfu/b;->y:I

    invoke-direct {v0, v2, v3, v4, v1}, Lfu/b;-><init>(III[I)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lfu/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lfu/b;

    iget v0, p0, Lfu/b;->w:I

    iget v2, p1, Lfu/b;->w:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lfu/b;->x:I

    iget v2, p1, Lfu/b;->x:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lfu/b;->y:I

    iget v2, p1, Lfu/b;->y:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lfu/b;->z:[I

    iget-object p1, p1, Lfu/b;->z:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lfu/b;->w:I

    mul-int/lit8 v1, v0, 0x1f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lfu/b;->x:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lfu/b;->y:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lfu/b;->z:[I

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([I)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Lfu/b;->w:I

    add-int/lit8 v2, v1, 0x1

    iget v3, p0, Lfu/b;->x:I

    mul-int/2addr v2, v3

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_2

    move v5, v2

    :goto_1
    if-ge v5, v1, :cond_1

    iget v6, p0, Lfu/b;->y:I

    mul-int/2addr v6, v4

    div-int/lit8 v7, v5, 0x20

    add-int/2addr v7, v6

    iget-object v6, p0, Lfu/b;->z:[I

    aget v6, v6, v7

    and-int/lit8 v7, v5, 0x1f

    ushr-int/2addr v6, v7

    and-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_0

    const-string v6, "X "

    goto :goto_2

    :cond_0
    const-string v6, "  "

    :goto_2
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    const-string v5, "\n"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
