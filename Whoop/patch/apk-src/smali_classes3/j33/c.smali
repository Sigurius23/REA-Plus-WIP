.class public final Lj33/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Ljava/lang/Integer;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/Double;

.field public final i:Z


# direct methods
.method public constructor <init>(ZLjava/lang/String;IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Z)V
    .locals 1

    const-string v0, "rid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lj33/c;->a:Z

    iput-object p2, p0, Lj33/c;->b:Ljava/lang/String;

    iput p3, p0, Lj33/c;->c:I

    iput p4, p0, Lj33/c;->d:I

    iput p5, p0, Lj33/c;->e:I

    iput-object p6, p0, Lj33/c;->f:Ljava/lang/Integer;

    iput-object p7, p0, Lj33/c;->g:Ljava/lang/String;

    iput-object p8, p0, Lj33/c;->h:Ljava/lang/Double;

    iput-boolean p9, p0, Lj33/c;->i:Z

    return-void
.end method

.method public static a(Lj33/c;Ljava/lang/String;I)Lj33/c;
    .locals 10

    iget-boolean v1, p0, Lj33/c;->a:Z

    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_0

    iget-object p1, p0, Lj33/c;->b:Ljava/lang/String;

    :cond_0
    move-object v2, p1

    iget v3, p0, Lj33/c;->c:I

    iget v4, p0, Lj33/c;->d:I

    iget v5, p0, Lj33/c;->e:I

    iget-object v6, p0, Lj33/c;->f:Ljava/lang/Integer;

    iget-object v7, p0, Lj33/c;->g:Ljava/lang/String;

    iget-object v8, p0, Lj33/c;->h:Ljava/lang/Double;

    and-int/lit16 p1, p2, 0x100

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lj33/c;->i:Z

    :goto_0
    move v9, p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "rid"

    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj33/c;

    invoke-direct/range {v0 .. v9}, Lj33/c;-><init>(ZLjava/lang/String;IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Z)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lj33/c;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lj33/c;

    iget-boolean v0, p0, Lj33/c;->a:Z

    iget-boolean v1, p1, Lj33/c;->a:Z

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lj33/c;->b:Ljava/lang/String;

    iget-object v1, p1, Lj33/c;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Lj33/c;->c:I

    iget v1, p1, Lj33/c;->c:I

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget v0, p0, Lj33/c;->d:I

    iget v1, p1, Lj33/c;->d:I

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, Lj33/c;->e:I

    iget v1, p1, Lj33/c;->e:I

    if-eq v0, v1, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lj33/c;->f:Ljava/lang/Integer;

    iget-object v1, p1, Lj33/c;->f:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lj33/c;->g:Ljava/lang/String;

    iget-object v1, p1, Lj33/c;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lj33/c;->h:Ljava/lang/Double;

    iget-object v1, p1, Lj33/c;->h:Ljava/lang/Double;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    iget-boolean v0, p0, Lj33/c;->i:Z

    iget-boolean p1, p1, Lj33/c;->i:Z

    if-eq v0, p1, :cond_a

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_a
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-boolean v0, p0, Lj33/c;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lj33/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lj33/c;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lj33/c;->d:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lj33/c;->e:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lj33/c;->f:Ljava/lang/Integer;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lj33/c;->g:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lj33/c;->h:Ljava/lang/Double;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lj33/c;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lj33/c;->g:Ljava/lang/String;

    iget-object v1, p0, Lj33/c;->h:Ljava/lang/Double;

    const-string v2, ", rid="

    const-string v3, ", width="

    const-string v4, "OptimalVideoLayer(active="

    iget-object v5, p0, Lj33/c;->b:Ljava/lang/String;

    iget-boolean v6, p0, Lj33/c;->a:Z

    invoke-static {v4, v2, v5, v3, v6}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", height="

    const-string v4, ", maxBitrate="

    iget v5, p0, Lj33/c;->c:I

    iget v6, p0, Lj33/c;->d:I

    invoke-static {v2, v5, v3, v6, v4}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    iget v3, p0, Lj33/c;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", maxFramerate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lj33/c;->f:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", scalabilityMode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", scaleResolutionDownBy="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", svc="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    iget-boolean v1, p0, Lj33/c;->i:Z

    invoke-static {v2, v1, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
