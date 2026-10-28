.class public final Lq41/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/n;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/n<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001c\u001a\u0004\u0008#\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\u0013R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010%\u001a\u0004\u0008\'\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010%\u001a\u0004\u0008(\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001c\u001a\u0004\u0008)\u0010\u001eR\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008\u001f\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010+\u001a\u0004\u0008\u001b\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010%\u001a\u0004\u0008-\u0010\u0013R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010\u0013\u00a8\u00060"
    }
    d2 = {
        "Lq41/c;",
        "Lm91/n;",
        "",
        "",
        "lowerBound",
        "centerBound",
        "upperBound",
        "startLabel",
        "centerLabel",
        "endLabel",
        "sliderValue",
        "",
        "barThickness",
        "Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;",
        "barStyle",
        "stateUpdateKey",
        "<init>",
        "(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;Ljava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "F",
        "g",
        "()F",
        "b",
        "Ljava/lang/Float;",
        "c",
        "()Ljava/lang/Float;",
        "k",
        "d",
        "Ljava/lang/String;",
        "i",
        "e",
        "f",
        "h",
        "I",
        "Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;",
        "()Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;",
        "j",
        "getId",
        "id",
        "design_release"
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
.field private final a:F

.field private final b:Ljava/lang/Float;

.field private final c:F

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:F

.field private final h:I

.field private final i:Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

.field private final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;Ljava/lang/String;)V
    .locals 1

    const-string v0, "startLabel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endLabel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barStyle"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lq41/c;->a:F

    iput-object p2, p0, Lq41/c;->b:Ljava/lang/Float;

    iput p3, p0, Lq41/c;->c:F

    iput-object p4, p0, Lq41/c;->d:Ljava/lang/String;

    iput-object p5, p0, Lq41/c;->e:Ljava/lang/String;

    iput-object p6, p0, Lq41/c;->f:Ljava/lang/String;

    iput p7, p0, Lq41/c;->g:F

    iput p8, p0, Lq41/c;->h:I

    iput-object p9, p0, Lq41/c;->i:Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

    iput-object p10, p0, Lq41/c;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;
    .locals 1

    iget-object v0, p0, Lq41/c;->i:Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lq41/c;->h:I

    return v0
.end method

.method public final c()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lq41/c;->b:Ljava/lang/Float;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq41/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lq41/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lq41/c;

    iget v1, p0, Lq41/c;->a:F

    iget v3, p1, Lq41/c;->a:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lq41/c;->b:Ljava/lang/Float;

    iget-object v3, p1, Lq41/c;->b:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lq41/c;->c:F

    iget v3, p1, Lq41/c;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lq41/c;->d:Ljava/lang/String;

    iget-object v3, p1, Lq41/c;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lq41/c;->e:Ljava/lang/String;

    iget-object v3, p1, Lq41/c;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lq41/c;->f:Ljava/lang/String;

    iget-object v3, p1, Lq41/c;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lq41/c;->g:F

    iget v3, p1, Lq41/c;->g:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lq41/c;->h:I

    iget v3, p1, Lq41/c;->h:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lq41/c;->i:Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

    iget-object v3, p1, Lq41/c;->i:Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lq41/c;->j:Ljava/lang/String;

    iget-object p1, p1, Lq41/c;->j:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq41/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Lq41/c;->a:F

    return v0
.end method

.method public bridge synthetic getId()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq41/c;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lq41/c;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final h()F
    .locals 1

    iget v0, p0, Lq41/c;->g:F

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lq41/c;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lq41/c;->b:Ljava/lang/Float;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lq41/c;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lq41/c;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lq41/c;->e:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lq41/c;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lq41/c;->g:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lq41/c;->h:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lq41/c;->i:Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lq41/c;->j:Ljava/lang/String;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v2, v3

    return v2
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq41/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq41/c;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final k()F
    .locals 1

    iget v0, p0, Lq41/c;->c:F

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget v0, p0, Lq41/c;->a:F

    iget-object v1, p0, Lq41/c;->b:Ljava/lang/Float;

    iget v2, p0, Lq41/c;->c:F

    iget-object v3, p0, Lq41/c;->d:Ljava/lang/String;

    iget-object v4, p0, Lq41/c;->e:Ljava/lang/String;

    iget-object v5, p0, Lq41/c;->f:Ljava/lang/String;

    iget v6, p0, Lq41/c;->g:F

    iget v7, p0, Lq41/c;->h:I

    iget-object v8, p0, Lq41/c;->i:Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

    iget-object v9, p0, Lq41/c;->j:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "TriLabelSliderItemViewState(lowerBound="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", centerBound="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", upperBound="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", startLabel="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", centerLabel="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", endLabel="

    const-string v1, ", sliderValue="

    invoke-static {v10, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", barThickness="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", barStyle="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stateUpdateKey="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
