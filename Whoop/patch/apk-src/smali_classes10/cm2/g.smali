.class public final Lcm2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bu\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010,\u001a\u0004\u0008 \u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010,\u001a\u0004\u0008.\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u0008/\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\u0017\u0010\u000e\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u00086\u00103\u001a\u0004\u0008$\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u00087\u00108\u001a\u0004\u00082\u00109R\u0017\u0010\u0012\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010:\u001a\u0004\u00087\u0010\u0018R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u00103\u001a\u0004\u00086\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008;\u00103\u001a\u0004\u0008(\u00105\u00a8\u0006<"
    }
    d2 = {
        "Lcm2/g;",
        "",
        "Lorg/joda/time/LocalDateTime;",
        "initialDateTime",
        "Ljava/util/Date;",
        "startDate",
        "",
        "weight",
        "bodyFat",
        "leanBodyMass",
        "Lcm2/j;",
        "metricType",
        "Lcom/whoop/design/util/TextResource;",
        "leanBodyMassSuffix",
        "bodyFatSuffix",
        "Lcm2/n;",
        "replaceDialog",
        "",
        "source",
        "saveTitle",
        "deleteTitle",
        "<init>",
        "(Lorg/joda/time/LocalDateTime;Ljava/util/Date;DLjava/lang/Double;Ljava/lang/Double;Lcm2/j;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcm2/n;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lorg/joda/time/LocalDateTime;",
        "d",
        "()Lorg/joda/time/LocalDateTime;",
        "b",
        "Ljava/util/Date;",
        "j",
        "()Ljava/util/Date;",
        "c",
        "D",
        "k",
        "()D",
        "Ljava/lang/Double;",
        "()Ljava/lang/Double;",
        "e",
        "f",
        "Lcm2/j;",
        "()Lcm2/j;",
        "g",
        "Lcom/whoop/design/util/TextResource;",
        "getLeanBodyMassSuffix",
        "()Lcom/whoop/design/util/TextResource;",
        "h",
        "i",
        "Lcm2/n;",
        "()Lcm2/n;",
        "Ljava/lang/String;",
        "l",
        "trends_release"
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
.field private final a:Lorg/joda/time/LocalDateTime;

.field private final b:Ljava/util/Date;

.field private final c:D

.field private final d:Ljava/lang/Double;

.field private final e:Ljava/lang/Double;

.field private final f:Lcm2/j;

.field private final g:Lcom/whoop/design/util/TextResource;

.field private final h:Lcom/whoop/design/util/TextResource;

.field private final i:Lcm2/n;

.field private final j:Ljava/lang/String;

.field private final k:Lcom/whoop/design/util/TextResource;

.field private final l:Lcom/whoop/design/util/TextResource;


# direct methods
.method public constructor <init>(Lorg/joda/time/LocalDateTime;Ljava/util/Date;DLjava/lang/Double;Ljava/lang/Double;Lcm2/j;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcm2/n;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "initialDateTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricType"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bodyFatSuffix"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcm2/g;->a:Lorg/joda/time/LocalDateTime;

    iput-object p2, p0, Lcm2/g;->b:Ljava/util/Date;

    iput-wide p3, p0, Lcm2/g;->c:D

    iput-object p5, p0, Lcm2/g;->d:Ljava/lang/Double;

    iput-object p6, p0, Lcm2/g;->e:Ljava/lang/Double;

    iput-object p7, p0, Lcm2/g;->f:Lcm2/j;

    iput-object p8, p0, Lcm2/g;->g:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Lcm2/g;->h:Lcom/whoop/design/util/TextResource;

    iput-object p10, p0, Lcm2/g;->i:Lcm2/n;

    iput-object p11, p0, Lcm2/g;->j:Ljava/lang/String;

    iput-object p12, p0, Lcm2/g;->k:Lcom/whoop/design/util/TextResource;

    iput-object p13, p0, Lcm2/g;->l:Lcom/whoop/design/util/TextResource;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcm2/g;->d:Ljava/lang/Double;

    return-object v0
.end method

.method public final b()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcm2/g;->h:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcm2/g;->l:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final d()Lorg/joda/time/LocalDateTime;
    .locals 1

    iget-object v0, p0, Lcm2/g;->a:Lorg/joda/time/LocalDateTime;

    return-object v0
.end method

.method public final e()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcm2/g;->e:Ljava/lang/Double;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcm2/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcm2/g;

    iget-object v1, p0, Lcm2/g;->a:Lorg/joda/time/LocalDateTime;

    iget-object v3, p1, Lcm2/g;->a:Lorg/joda/time/LocalDateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcm2/g;->b:Ljava/util/Date;

    iget-object v3, p1, Lcm2/g;->b:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcm2/g;->c:D

    iget-wide v5, p1, Lcm2/g;->c:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcm2/g;->d:Ljava/lang/Double;

    iget-object v3, p1, Lcm2/g;->d:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcm2/g;->e:Ljava/lang/Double;

    iget-object v3, p1, Lcm2/g;->e:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcm2/g;->f:Lcm2/j;

    iget-object v3, p1, Lcm2/g;->f:Lcm2/j;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcm2/g;->g:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcm2/g;->g:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcm2/g;->h:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcm2/g;->h:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcm2/g;->i:Lcm2/n;

    iget-object v3, p1, Lcm2/g;->i:Lcm2/n;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcm2/g;->j:Ljava/lang/String;

    iget-object v3, p1, Lcm2/g;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcm2/g;->k:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcm2/g;->k:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcm2/g;->l:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lcm2/g;->l:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final f()Lcm2/j;
    .locals 1

    iget-object v0, p0, Lcm2/g;->f:Lcm2/j;

    return-object v0
.end method

.method public final g()Lcm2/n;
    .locals 1

    iget-object v0, p0, Lcm2/g;->i:Lcm2/n;

    return-object v0
.end method

.method public final h()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcm2/g;->k:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcm2/g;->a:Lorg/joda/time/LocalDateTime;

    invoke-virtual {v0}, Lorg/joda/time/LocalDateTime;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcm2/g;->b:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-wide v2, p0, Lcm2/g;->c:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcm2/g;->d:Ljava/lang/Double;

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

    iget-object v2, p0, Lcm2/g;->e:Ljava/lang/Double;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcm2/g;->f:Lcm2/j;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcm2/g;->g:Lcom/whoop/design/util/TextResource;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcm2/g;->h:Lcom/whoop/design/util/TextResource;

    invoke-static {v2, v0, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcm2/g;->i:Lcm2/n;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcm2/n;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcm2/g;->j:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcm2/g;->k:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcm2/g;->l:Lcom/whoop/design/util/TextResource;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcm2/g;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcm2/g;->b:Ljava/util/Date;

    return-object v0
.end method

.method public final k()D
    .locals 2

    iget-wide v0, p0, Lcm2/g;->c:D

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcm2/g;->a:Lorg/joda/time/LocalDateTime;

    iget-object v1, p0, Lcm2/g;->b:Ljava/util/Date;

    iget-wide v2, p0, Lcm2/g;->c:D

    iget-object v4, p0, Lcm2/g;->d:Ljava/lang/Double;

    iget-object v5, p0, Lcm2/g;->e:Ljava/lang/Double;

    iget-object v6, p0, Lcm2/g;->f:Lcm2/j;

    iget-object v7, p0, Lcm2/g;->g:Lcom/whoop/design/util/TextResource;

    iget-object v8, p0, Lcm2/g;->h:Lcom/whoop/design/util/TextResource;

    iget-object v9, p0, Lcm2/g;->i:Lcm2/n;

    iget-object v10, p0, Lcm2/g;->j:Ljava/lang/String;

    iget-object v11, p0, Lcm2/g;->k:Lcom/whoop/design/util/TextResource;

    iget-object v12, p0, Lcm2/g;->l:Lcom/whoop/design/util/TextResource;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "ManualMeasurementViewState(initialDateTime="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", startDate="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", weight="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", bodyFat="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", leanBodyMass="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metricType="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", leanBodyMassSuffix="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bodyFatSuffix="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", replaceDialog="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", source="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", saveTitle="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", deleteTitle="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
