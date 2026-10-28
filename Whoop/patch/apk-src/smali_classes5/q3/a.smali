.class public final Lq3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/h;


# instance fields
.field public final a:Ll3/g;

.field public final b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 2
    new-instance v0, Ll3/g;

    invoke-direct {v0, p1}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lq3/a;-><init>(Ll3/g;I)V

    return-void
.end method

.method public constructor <init>(Ll3/g;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/a;->a:Ll3/g;

    iput p2, p0, Lq3/a;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ldn/e;)V
    .locals 5

    iget v0, p1, Ldn/e;->z:I

    iget-object v1, p0, Lq3/a;->a:Ll3/g;

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget v3, p1, Ldn/e;->E:I

    iget-object v4, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1, v0, v3, v4}, Ldn/e;->i(IILjava/lang/String;)V

    goto :goto_0

    :cond_0
    iget v0, p1, Ldn/e;->x:I

    iget v3, p1, Ldn/e;->y:I

    iget-object v4, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1, v0, v3, v4}, Ldn/e;->i(IILjava/lang/String;)V

    :goto_0
    iget v0, p1, Ldn/e;->x:I

    iget v3, p1, Ldn/e;->y:I

    if-ne v0, v3, :cond_1

    move v2, v3

    :cond_1
    iget v0, p0, Lq3/a;->b:I

    if-lez v0, :cond_2

    add-int/2addr v2, v0

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_2
    add-int/2addr v2, v0

    iget-object v0, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v2, v0

    :goto_1
    iget-object v0, p1, Ldn/e;->F:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/p;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, Le93/b;->n(III)I

    move-result v0

    invoke-virtual {p1, v0, v0}, Ldn/e;->k(II)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lq3/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lq3/a;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    check-cast p1, Lq3/a;

    iget-object v3, p1, Lq3/a;->a:Ll3/g;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lq3/a;->b:I

    iget p1, p1, Lq3/a;->b:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lq3/a;->a:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lq3/a;->b:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CommitTextCommand(text=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lq3/a;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', newCursorPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lq3/a;->b:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
