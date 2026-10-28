.class public final Ll3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/b;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:Lw3/q;

.field public final e:Ll3/e0;

.field public final f:Lw3/i;

.field public final g:I

.field public final h:I

.field public final i:Lw3/s;


# direct methods
.method public constructor <init>(IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Ll3/b0;->a:I

    .line 3
    iput p2, p0, Ll3/b0;->b:I

    .line 4
    iput-wide p3, p0, Ll3/b0;->c:J

    .line 5
    iput-object p5, p0, Ll3/b0;->d:Lw3/q;

    .line 6
    iput-object p6, p0, Ll3/b0;->e:Ll3/e0;

    .line 7
    iput-object p7, p0, Ll3/b0;->f:Lw3/i;

    .line 8
    iput p8, p0, Ll3/b0;->g:I

    .line 9
    iput p9, p0, Ll3/b0;->h:I

    .line 10
    iput-object p10, p0, Ll3/b0;->i:Lw3/s;

    .line 11
    sget-wide p1, Ly3/o;->c:J

    .line 12
    invoke-static {p3, p4, p1, p2}, Ly3/o;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_1

    .line 13
    invoke-static {p3, p4}, Ly3/o;->c(J)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float p1, p1, p2

    if-ltz p1, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "lineHeight can\'t be negative ("

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p3, p4}, Ly3/o;->c(J)F

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-static {p1}, Lr3/a;->c(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public constructor <init>(ILw3/q;I)V
    .locals 11

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    const/high16 p1, -0x80000000

    :cond_0
    move v1, p1

    .line 16
    sget-wide v3, Ly3/o;->c:J

    and-int/lit8 p1, p3, 0x8

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    :cond_1
    move-object v5, p2

    const/4 v8, 0x0

    const/high16 v9, -0x80000000

    const/high16 v2, -0x80000000

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    .line 17
    invoke-direct/range {v0 .. v10}, Ll3/b0;-><init>(IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)V

    return-void
.end method


# virtual methods
.method public final a(Ll3/b0;)Ll3/b0;
    .locals 11

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget v1, p1, Ll3/b0;->a:I

    iget v2, p1, Ll3/b0;->b:I

    iget-wide v3, p1, Ll3/b0;->c:J

    iget-object v5, p1, Ll3/b0;->d:Lw3/q;

    iget-object v6, p1, Ll3/b0;->e:Ll3/e0;

    iget-object v7, p1, Ll3/b0;->f:Lw3/i;

    iget v8, p1, Ll3/b0;->g:I

    iget v9, p1, Ll3/b0;->h:I

    iget-object v10, p1, Ll3/b0;->i:Lw3/s;

    move-object v0, p0

    invoke-static/range {v0 .. v10}, Ll3/c0;->a(Ll3/b0;IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)Ll3/b0;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ll3/b0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ll3/b0;

    iget v0, p1, Ll3/b0;->a:I

    iget v1, p0, Ll3/b0;->a:I

    if-ne v1, v0, :cond_7

    iget v0, p0, Ll3/b0;->b:I

    iget v1, p1, Ll3/b0;->b:I

    if-ne v0, v1, :cond_7

    iget-wide v0, p0, Ll3/b0;->c:J

    iget-wide v2, p1, Ll3/b0;->c:J

    invoke-static {v0, v1, v2, v3}, Ly3/o;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ll3/b0;->d:Lw3/q;

    iget-object v1, p1, Ll3/b0;->d:Lw3/q;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Ll3/b0;->e:Ll3/e0;

    iget-object v1, p1, Ll3/b0;->e:Ll3/e0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Ll3/b0;->f:Lw3/i;

    iget-object v1, p1, Ll3/b0;->f:Lw3/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    iget v0, p0, Ll3/b0;->g:I

    iget v1, p1, Ll3/b0;->g:I

    if-ne v0, v1, :cond_7

    iget v0, p0, Ll3/b0;->h:I

    iget v1, p1, Ll3/b0;->h:I

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Ll3/b0;->i:Lw3/s;

    iget-object p1, p1, Ll3/b0;->i:Lw3/s;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_7
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Ll3/b0;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Ll3/b0;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    sget-object v2, Ly3/o;->b:[Ly3/p;

    iget-wide v2, p0, Ll3/b0;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Ll3/b0;->d:Lw3/q;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lw3/q;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ll3/b0;->e:Ll3/e0;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ll3/e0;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ll3/b0;->f:Lw3/i;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lw3/i;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v3, p0, Ll3/b0;->g:I

    invoke-static {v3, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Ll3/b0;->h:I

    invoke-static {v3, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Ll3/b0;->i:Lw3/s;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lw3/s;->hashCode()I

    move-result v2

    :cond_3
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ParagraphStyle(textAlign="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll3/b0;->a:I

    invoke-static {v1}, Lw3/k;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textDirection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll3/b0;->b:I

    invoke-static {v1}, Lw3/m;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll3/b0;->c:J

    invoke-static {v1, v2}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textIndent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/b0;->d:Lw3/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/b0;->e:Ll3/e0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineHeightStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/b0;->f:Lw3/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineBreak="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll3/b0;->g:I

    invoke-static {v1}, Lw3/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hyphens="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll3/b0;->h:I

    invoke-static {v1}, Lw3/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textMotion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/b0;->i:Lw3/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
