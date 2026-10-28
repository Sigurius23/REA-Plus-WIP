.class public Lvz2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lvz2/h;",
        ">;"
    }
.end annotation


# instance fields
.field private final w:I

.field private final x:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lvz2/h;->w:I

    iput p2, p0, Lvz2/h;->x:I

    return-void
.end method


# virtual methods
.method public a(Lvz2/h;)I
    .locals 2

    iget v0, p0, Lvz2/h;->w:I

    iget v1, p0, Lvz2/h;->x:I

    mul-int/2addr v0, v1

    iget v1, p1, Lvz2/h;->w:I

    iget p1, p1, Lvz2/h;->x:I

    mul-int/2addr v1, p1

    sub-int/2addr v0, v1

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lvz2/h;->x:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lvz2/h;->w:I

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lvz2/h;

    invoke-virtual {p0, p1}, Lvz2/h;->a(Lvz2/h;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lvz2/h;

    if-eqz v2, :cond_2

    check-cast p1, Lvz2/h;

    iget v2, p0, Lvz2/h;->w:I

    iget v3, p1, Lvz2/h;->w:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lvz2/h;->x:I

    iget p1, p1, Lvz2/h;->x:I

    if-ne v2, p1, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lvz2/h;->x:I

    iget v1, p0, Lvz2/h;->w:I

    shl-int/lit8 v2, v1, 0x10

    ushr-int/lit8 v1, v1, 0x10

    or-int/2addr v1, v2

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lvz2/h;->w:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lvz2/h;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
