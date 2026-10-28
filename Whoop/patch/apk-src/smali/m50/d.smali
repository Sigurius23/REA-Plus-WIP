.class public final Lm50/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bo\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010\u0017R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008&\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010)\u001a\u0004\u0008#\u0010+R\u0017\u0010\u000c\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010$\u001a\u0004\u0008.\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010$\u001a\u0004\u0008\u001f\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010/\u001a\u0004\u0008,\u00100R\u0017\u0010\u0010\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010$\u001a\u0004\u00081\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010$\u001a\u0004\u00082\u0010\u0017R\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010 \u001a\u0004\u0008-\u0010\"\u00a8\u00063"
    }
    d2 = {
        "Lm50/d;",
        "Lm91/u;",
        "",
        "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;",
        "segments",
        "",
        "label",
        "",
        "circumferenceInCentimeters",
        "Li93/j;",
        "inchesRange",
        "centimetersRange",
        "inchesLabel",
        "centimetersLabel",
        "Lcom/whoop/domain/model/UnitSystem;",
        "defaultUnitSystem",
        "stateUpdateCircumferenceKey",
        "stateUpdateUnitKey",
        "Lk50/c;",
        "foreignMeasurements",
        "<init>",
        "(Ljava/util/List;Ljava/lang/String;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
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
        "Ljava/util/List;",
        "j",
        "()Ljava/util/List;",
        "b",
        "Ljava/lang/String;",
        "i",
        "c",
        "I",
        "d",
        "Li93/j;",
        "h",
        "()Li93/j;",
        "e",
        "f",
        "g",
        "Lcom/whoop/domain/model/UnitSystem;",
        "()Lcom/whoop/domain/model/UnitSystem;",
        "k",
        "l",
        "access_release"
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
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:Li93/j;

.field private final e:Li93/j;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Lcom/whoop/domain/model/UnitSystem;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk50/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;",
            ">;",
            "Ljava/lang/String;",
            "I",
            "Li93/j;",
            "Li93/j;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/domain/model/UnitSystem;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lk50/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "segments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inchesRange"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "centimetersRange"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inchesLabel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "centimetersLabel"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultUnitSystem"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateUpdateCircumferenceKey"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "foreignMeasurements"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm50/d;->a:Ljava/util/List;

    iput-object p2, p0, Lm50/d;->b:Ljava/lang/String;

    iput p3, p0, Lm50/d;->c:I

    iput-object p4, p0, Lm50/d;->d:Li93/j;

    iput-object p5, p0, Lm50/d;->e:Li93/j;

    iput-object p6, p0, Lm50/d;->f:Ljava/lang/String;

    iput-object p7, p0, Lm50/d;->g:Ljava/lang/String;

    iput-object p8, p0, Lm50/d;->h:Lcom/whoop/domain/model/UnitSystem;

    iput-object p9, p0, Lm50/d;->i:Ljava/lang/String;

    iput-object p10, p0, Lm50/d;->j:Ljava/lang/String;

    iput-object p11, p0, Lm50/d;->k:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm50/d;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Li93/j;
    .locals 1

    iget-object v0, p0, Lm50/d;->e:Li93/j;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lm50/d;->c:I

    return v0
.end method

.method public final e()Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    iget-object v0, p0, Lm50/d;->h:Lcom/whoop/domain/model/UnitSystem;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm50/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm50/d;

    iget-object v1, p0, Lm50/d;->a:Ljava/util/List;

    iget-object v3, p1, Lm50/d;->a:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm50/d;->b:Ljava/lang/String;

    iget-object v3, p1, Lm50/d;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lm50/d;->c:I

    iget v3, p1, Lm50/d;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lm50/d;->d:Li93/j;

    iget-object v3, p1, Lm50/d;->d:Li93/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lm50/d;->e:Li93/j;

    iget-object v3, p1, Lm50/d;->e:Li93/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lm50/d;->f:Ljava/lang/String;

    iget-object v3, p1, Lm50/d;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lm50/d;->g:Ljava/lang/String;

    iget-object v3, p1, Lm50/d;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lm50/d;->h:Lcom/whoop/domain/model/UnitSystem;

    iget-object v3, p1, Lm50/d;->h:Lcom/whoop/domain/model/UnitSystem;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lm50/d;->i:Ljava/lang/String;

    iget-object v3, p1, Lm50/d;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lm50/d;->j:Ljava/lang/String;

    iget-object v3, p1, Lm50/d;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lm50/d;->k:Ljava/util/List;

    iget-object p1, p1, Lm50/d;->k:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk50/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm50/d;->k:Ljava/util/List;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm50/d;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Li93/j;
    .locals 1

    iget-object v0, p0, Lm50/d;->d:Li93/j;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lm50/d;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm50/d;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lm50/d;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lm50/d;->d:Li93/j;

    invoke-virtual {v2}, Li93/j;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lm50/d;->e:Li93/j;

    invoke-virtual {v0}, Li93/j;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm50/d;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lm50/d;->g:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lm50/d;->h:Lcom/whoop/domain/model/UnitSystem;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lm50/d;->i:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lm50/d;->j:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lm50/d;->k:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm50/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm50/d;->a:Ljava/util/List;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm50/d;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm50/d;->j:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lm50/d;->a:Ljava/util/List;

    iget-object v1, p0, Lm50/d;->b:Ljava/lang/String;

    iget v2, p0, Lm50/d;->c:I

    iget-object v3, p0, Lm50/d;->d:Li93/j;

    iget-object v4, p0, Lm50/d;->e:Li93/j;

    iget-object v5, p0, Lm50/d;->f:Ljava/lang/String;

    iget-object v6, p0, Lm50/d;->g:Ljava/lang/String;

    iget-object v7, p0, Lm50/d;->h:Lcom/whoop/domain/model/UnitSystem;

    iget-object v8, p0, Lm50/d;->i:Ljava/lang/String;

    iget-object v9, p0, Lm50/d;->j:Ljava/lang/String;

    iget-object v10, p0, Lm50/d;->k:Ljava/util/List;

    const-string v11, ", label="

    const-string v12, ", circumferenceInCentimeters="

    const-string v13, "CircumferenceViewState(segments="

    invoke-static {v13, v11, v1, v12, v0}, Lnh3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", inchesRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", centimetersRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inchesLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", centimetersLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", defaultUnitSystem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stateUpdateCircumferenceKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", stateUpdateUnitKey="

    const-string v2, ", foreignMeasurements="

    invoke-static {v0, v8, v1, v9, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v10, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
