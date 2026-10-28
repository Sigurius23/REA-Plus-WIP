.class public final Llg/c;
.super Llg/d;
.source "SourceFile"


# instance fields
.field public final E:I

.field public final x:Lkg/d;

.field public final y:Llg/c;

.field public final z:Z


# direct methods
.method public constructor <init>(Lkg/d;Llg/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llg/c;->x:Lkg/d;

    iput-object p2, p0, Llg/c;->y:Llg/c;

    iput-boolean p3, p0, Llg/c;->z:Z

    if-eqz p2, :cond_0

    iget p1, p2, Llg/c;->E:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Llg/c;->E:I

    return-void
.end method

.method public static r0(Llg/c;)Llg/c;
    .locals 3

    iget-object v0, p0, Llg/c;->x:Lkg/d;

    iget-object p0, p0, Llg/c;->y:Llg/c;

    new-instance v1, Llg/c;

    const/4 v2, 0x1

    invoke-direct {v1, v0, p0, v2}, Llg/c;-><init>(Lkg/d;Llg/c;Z)V

    return-object v1
.end method


# virtual methods
.method public final Q()I
    .locals 1

    iget v0, p0, Llg/c;->E:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Llg/c;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Llg/c;

    iget-object v0, p0, Llg/c;->x:Lkg/d;

    iget-object v1, p1, Llg/c;->x:Lkg/d;

    invoke-virtual {v0, v1}, Lkg/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Llg/c;->y:Llg/c;

    iget-object v1, p1, Llg/c;->y:Llg/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, Llg/c;->z:Z

    iget-boolean p1, p1, Llg/c;->z:Z

    if-eq v0, p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Llg/c;->x:Lkg/d;

    invoke-virtual {v0}, Lkg/d;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llg/c;->y:Llg/c;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Llg/c;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Llg/c;->z:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OpenTag(name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llg/c;->x:Lkg/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llg/c;->y:Llg/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", seenChildren="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llg/c;->z:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
