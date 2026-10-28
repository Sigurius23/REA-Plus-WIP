.class public final Ll3/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll3/g;

.field public final b:Ll3/v0;

.field public final c:Ljava/util/List;

.field public final d:I

.field public final e:Z

.field public final f:I

.field public final g:Ly3/c;

.field public final h:Ly3/m;

.field public final i:Lp3/h;

.field public final j:J


# direct methods
.method public constructor <init>(Ll3/g;Ll3/v0;Ljava/util/List;IZILy3/c;Ly3/m;Lp3/h;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/q0;->a:Ll3/g;

    iput-object p2, p0, Ll3/q0;->b:Ll3/v0;

    iput-object p3, p0, Ll3/q0;->c:Ljava/util/List;

    iput p4, p0, Ll3/q0;->d:I

    iput-boolean p5, p0, Ll3/q0;->e:Z

    iput p6, p0, Ll3/q0;->f:I

    iput-object p7, p0, Ll3/q0;->g:Ly3/c;

    iput-object p8, p0, Ll3/q0;->h:Ly3/m;

    iput-object p9, p0, Ll3/q0;->i:Lp3/h;

    iput-wide p10, p0, Ll3/q0;->j:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Ll3/q0;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Ll3/q0;

    iget-object v0, p1, Ll3/q0;->a:Ll3/g;

    iget-object v1, p0, Ll3/q0;->a:Ll3/g;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ll3/q0;->b:Ll3/v0;

    iget-object v1, p1, Ll3/q0;->b:Ll3/v0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Ll3/q0;->c:Ljava/util/List;

    iget-object v1, p1, Ll3/q0;->c:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget v0, p0, Ll3/q0;->d:I

    iget v1, p1, Ll3/q0;->d:I

    if-eq v0, v1, :cond_5

    goto :goto_1

    :cond_5
    iget-boolean v0, p0, Ll3/q0;->e:Z

    iget-boolean v1, p1, Ll3/q0;->e:Z

    if-eq v0, v1, :cond_6

    goto :goto_1

    :cond_6
    iget v0, p0, Ll3/q0;->f:I

    iget v1, p1, Ll3/q0;->f:I

    if-ne v0, v1, :cond_b

    iget-object v0, p0, Ll3/q0;->g:Ly3/c;

    iget-object v1, p1, Ll3/q0;->g:Ly3/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    iget-object v0, p0, Ll3/q0;->h:Ly3/m;

    iget-object v1, p1, Ll3/q0;->h:Ly3/m;

    if-eq v0, v1, :cond_8

    goto :goto_1

    :cond_8
    iget-object v0, p0, Ll3/q0;->i:Lp3/h;

    iget-object v1, p1, Ll3/q0;->i:Lp3/h;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_1

    :cond_9
    iget-wide v0, p0, Ll3/q0;->j:J

    iget-wide v2, p1, Ll3/q0;->j:J

    invoke-static {v0, v1, v2, v3}, Ly3/a;->c(JJ)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_1

    :cond_a
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_b
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Ll3/q0;->a:Ll3/g;

    invoke-virtual {v0}, Ll3/g;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ll3/q0;->b:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Ll3/q0;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v2, p0, Ll3/q0;->d:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ll3/q0;->e:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Ll3/q0;->f:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Ll3/q0;->g:Ly3/c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ll3/q0;->h:Ly3/m;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ll3/q0;->i:Lp3/h;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v0, p0, Ll3/q0;->j:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TextLayoutInput(text="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll3/q0;->a:Ll3/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/q0;->b:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeholders="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/q0;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxLines="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll3/q0;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", softWrap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll3/q0;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", overflow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll3/q0;->f:I

    invoke-static {v1}, Lv63/c;->m(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", density="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/q0;->g:Ly3/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", layoutDirection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/q0;->h:Ly3/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontFamilyResolver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/q0;->i:Lp3/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", constraints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll3/q0;->j:J

    invoke-static {v1, v2}, Ly3/a;->l(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
