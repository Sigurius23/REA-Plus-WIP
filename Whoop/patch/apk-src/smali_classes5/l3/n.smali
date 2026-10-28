.class public final Ll3/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll3/q0;


# direct methods
.method public constructor <init>(Ll3/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/n;->a:Ll3/q0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Ll3/n;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v0, p0, Ll3/n;->a:Ll3/q0;

    iget-object v1, v0, Ll3/q0;->a:Ll3/g;

    check-cast p1, Ll3/n;

    iget-object p1, p1, Ll3/n;->a:Ll3/q0;

    iget-object v2, p1, Ll3/q0;->a:Ll3/g;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, v0, Ll3/q0;->b:Ll3/v0;

    iget-object v2, p1, Ll3/q0;->b:Ll3/v0;

    invoke-virtual {v1, v2}, Ll3/v0;->d(Ll3/v0;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v1, v0, Ll3/q0;->c:Ljava/util/List;

    iget-object v2, p1, Ll3/q0;->c:Ljava/util/List;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    iget v1, v0, Ll3/q0;->d:I

    iget v2, p1, Ll3/q0;->d:I

    if-eq v1, v2, :cond_5

    goto :goto_1

    :cond_5
    iget-boolean v1, v0, Ll3/q0;->e:Z

    iget-boolean v2, p1, Ll3/q0;->e:Z

    if-eq v1, v2, :cond_6

    goto :goto_1

    :cond_6
    iget v1, v0, Ll3/q0;->f:I

    iget v2, p1, Ll3/q0;->f:I

    if-ne v1, v2, :cond_b

    iget-object v1, v0, Ll3/q0;->g:Ly3/c;

    iget-object v2, p1, Ll3/q0;->g:Ly3/c;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_1

    :cond_7
    iget-object v1, v0, Ll3/q0;->h:Ly3/m;

    iget-object v2, p1, Ll3/q0;->h:Ly3/m;

    if-eq v1, v2, :cond_8

    goto :goto_1

    :cond_8
    iget-object v1, v0, Ll3/q0;->i:Lp3/h;

    iget-object v2, p1, Ll3/q0;->i:Lp3/h;

    if-eq v1, v2, :cond_9

    goto :goto_1

    :cond_9
    iget-wide v0, v0, Ll3/q0;->j:J

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
    .locals 10

    iget-object v0, p0, Ll3/n;->a:Ll3/q0;

    iget-object v1, v0, Ll3/q0;->a:Ll3/g;

    invoke-virtual {v1}, Ll3/g;->hashCode()I

    move-result v1

    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, v0, Ll3/q0;->b:Ll3/v0;

    iget-object v4, v3, Ll3/v0;->a:Ll3/m0;

    iget-wide v5, v4, Ll3/m0;->b:J

    sget-object v7, Ly3/o;->b:[Ly3/p;

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    mul-int/2addr v5, v2

    iget-object v6, v4, Ll3/m0;->c:Lp3/r;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    iget v6, v6, Lp3/r;->w:I

    goto :goto_0

    :cond_0
    move v6, v7

    :goto_0
    add-int/2addr v5, v6

    mul-int/2addr v5, v2

    iget-object v6, v4, Ll3/m0;->d:Lp3/n;

    if-eqz v6, :cond_1

    iget v6, v6, Lp3/n;->a:I

    invoke-static {v6}, Ljava/lang/Integer;->hashCode(I)I

    move-result v6

    goto :goto_1

    :cond_1
    move v6, v7

    :goto_1
    add-int/2addr v5, v6

    mul-int/2addr v5, v2

    iget-object v6, v4, Ll3/m0;->e:Lp3/o;

    if-eqz v6, :cond_2

    iget v6, v6, Lp3/o;->a:I

    invoke-static {v6}, Ljava/lang/Integer;->hashCode(I)I

    move-result v6

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    add-int/2addr v5, v6

    mul-int/2addr v5, v2

    iget-object v6, v4, Ll3/m0;->f:Lp3/i;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_3

    :cond_3
    move v6, v7

    :goto_3
    add-int/2addr v5, v6

    mul-int/2addr v5, v2

    iget-object v6, v4, Ll3/m0;->g:Ljava/lang/String;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    goto :goto_4

    :cond_4
    move v6, v7

    :goto_4
    add-int/2addr v5, v6

    mul-int/2addr v5, v2

    iget-wide v8, v4, Ll3/m0;->h:J

    invoke-static {v5, v8, v9, v2}, Ld;->e(IJI)I

    move-result v5

    iget-object v6, v4, Ll3/m0;->i:Lw3/a;

    if-eqz v6, :cond_5

    iget v6, v6, Lw3/a;->a:F

    invoke-static {v6}, Ljava/lang/Float;->hashCode(F)I

    move-result v6

    goto :goto_5

    :cond_5
    move v6, v7

    :goto_5
    add-int/2addr v5, v6

    mul-int/2addr v5, v2

    iget-object v6, v4, Ll3/m0;->j:Lw3/p;

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lw3/p;->hashCode()I

    move-result v6

    goto :goto_6

    :cond_6
    move v6, v7

    :goto_6
    add-int/2addr v5, v6

    mul-int/2addr v5, v2

    iget-object v6, v4, Ll3/m0;->k:Ls3/b;

    if-eqz v6, :cond_7

    iget-object v6, v6, Ls3/b;->w:Ljava/util/List;

    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_7

    :cond_7
    move v6, v7

    :goto_7
    add-int/2addr v5, v6

    mul-int/2addr v5, v2

    iget-wide v8, v4, Ll3/m0;->l:J

    sget v6, Li2/x;->o:I

    invoke-static {v5, v8, v9, v2}, Ld;->e(IJI)I

    move-result v5

    iget-object v4, v4, Ll3/m0;->o:Ll3/f0;

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_8

    :cond_8
    move v4, v7

    :goto_8
    add-int/2addr v5, v4

    mul-int/2addr v5, v2

    iget-object v4, v3, Ll3/v0;->b:Ll3/b0;

    invoke-virtual {v4}, Ll3/b0;->hashCode()I

    move-result v4

    add-int/2addr v4, v5

    mul-int/2addr v4, v2

    iget-object v3, v3, Ll3/v0;->c:Ll3/g0;

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ll3/g0;->hashCode()I

    move-result v7

    :cond_9
    add-int/2addr v4, v7

    add-int/2addr v4, v1

    mul-int/2addr v4, v2

    iget-object v1, v0, Ll3/q0;->c:Ljava/util/List;

    invoke-static {v4, v2, v1}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget v3, v0, Ll3/q0;->d:I

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, v0, Ll3/q0;->e:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget v3, v0, Ll3/q0;->f:I

    invoke-static {v3, v1, v2}, Ld;->b(III)I

    move-result v1

    iget-object v3, v0, Ll3/q0;->g:Ly3/c;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v1

    mul-int/2addr v3, v2

    iget-object v1, v0, Ll3/q0;->h:Ly3/m;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, v0, Ll3/q0;->i:Lp3/h;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v1

    mul-int/2addr v3, v2

    iget-wide v0, v0, Ll3/q0;->j:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    add-int/2addr v0, v3

    return v0
.end method
