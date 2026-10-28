.class final Lqy2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008!\u0008\u0082\u0008\u0018\u00002\u00020\u0001BA\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010\u000fR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001f\u001a\u0004\u0008\"\u0010\u000fR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008\n\u0010%R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u001f\u001a\u0004\u0008\'\u0010\u000fR\u0011\u0010(\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010%R\u0013\u0010)\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u000f\u00a8\u0006*"
    }
    d2 = {
        "Lqy2/a;",
        "",
        "",
        "bpReading",
        "min",
        "max",
        "",
        "tooLowText",
        "tooHighText",
        "",
        "isRequired",
        "requiredText",
        "<init>",
        "(Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/Integer;",
        "getBpReading",
        "()Ljava/lang/Integer;",
        "b",
        "I",
        "getMin",
        "c",
        "getMax",
        "d",
        "Ljava/lang/String;",
        "getTooLowText",
        "e",
        "getTooHighText",
        "f",
        "Z",
        "()Z",
        "g",
        "getRequiredText",
        "hasMetRequirements",
        "bpReadingError",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/lang/Integer;

.field private final b:I

.field private final c:I

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Z

.field private final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "tooLowText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tooHighText"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requiredText"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqy2/a;->a:Ljava/lang/Integer;

    iput p2, p0, Lqy2/a;->b:I

    iput p3, p0, Lqy2/a;->c:I

    iput-object p4, p0, Lqy2/a;->d:Ljava/lang/String;

    iput-object p5, p0, Lqy2/a;->e:Ljava/lang/String;

    iput-boolean p6, p0, Lqy2/a;->f:Z

    iput-object p7, p0, Lqy2/a;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lqy2/a;->a:Ljava/lang/Integer;

    if-nez v0, :cond_0

    iget-boolean v1, p0, Lqy2/a;->f:Z

    if-eqz v1, :cond_0

    iget-object v0, p0, Lqy2/a;->g:Ljava/lang/String;

    return-object v0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lqy2/a;->b:I

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lqy2/a;->d:Ljava/lang/String;

    return-object v0

    :cond_1
    iget-object v0, p0, Lqy2/a;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lqy2/a;->c:I

    if-le v0, v1, :cond_2

    iget-object v0, p0, Lqy2/a;->e:Ljava/lang/String;

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lqy2/a;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqy2/a;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lqy2/a;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lqy2/a;->f:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lqy2/a;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lqy2/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lqy2/a;

    iget-object v1, p0, Lqy2/a;->a:Ljava/lang/Integer;

    iget-object v3, p1, Lqy2/a;->a:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lqy2/a;->b:I

    iget v3, p1, Lqy2/a;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lqy2/a;->c:I

    iget v3, p1, Lqy2/a;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lqy2/a;->d:Ljava/lang/String;

    iget-object v3, p1, Lqy2/a;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lqy2/a;->e:Ljava/lang/String;

    iget-object v3, p1, Lqy2/a;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lqy2/a;->f:Z

    iget-boolean v3, p1, Lqy2/a;->f:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lqy2/a;->g:Ljava/lang/String;

    iget-object p1, p1, Lqy2/a;->g:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lqy2/a;->a:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lqy2/a;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lqy2/a;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lqy2/a;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lqy2/a;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lqy2/a;->f:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lqy2/a;->g:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lqy2/a;->a:Ljava/lang/Integer;

    iget v1, p0, Lqy2/a;->b:I

    iget v2, p0, Lqy2/a;->c:I

    iget-object v3, p0, Lqy2/a;->d:Ljava/lang/String;

    iget-object v4, p0, Lqy2/a;->e:Ljava/lang/String;

    iget-boolean v5, p0, Lqy2/a;->f:Z

    iget-object v6, p0, Lqy2/a;->g:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "BpReadingValidation(bpReading="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", min="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", max="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tooLowText="

    const-string v1, ", tooHighText="

    invoke-static {v2, v0, v3, v1, v7}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", isRequired="

    const-string v1, ", requiredText="

    invoke-static {v7, v4, v0, v5, v1}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v6, v0, v7}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
