.class public final Lyl0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0081\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u000c2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0019\u0010\u0012R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u0010\u00a8\u0006\u001e"
    }
    d2 = {
        "Lyl0/a;",
        "",
        "",
        "min",
        "max",
        "",
        "decimalPlaces",
        "",
        "unit",
        "<init>",
        "(DDILjava/lang/String;)V",
        "value",
        "",
        "a",
        "(D)Z",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "D",
        "d",
        "()D",
        "b",
        "c",
        "I",
        "Ljava/lang/String;",
        "e",
        "bot_release"
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
.field private final a:D

.field private final b:D

.field private final c:I

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(DDILjava/lang/String;)V
    .locals 1

    const-string v0, "unit"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lyl0/a;->a:D

    .line 3
    iput-wide p3, p0, Lyl0/a;->b:D

    .line 4
    iput p5, p0, Lyl0/a;->c:I

    .line 5
    iput-object p6, p0, Lyl0/a;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(DDILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    and-int/lit8 p5, p7, 0x8

    if-eqz p5, :cond_1

    .line 6
    const-string p6, ""

    :cond_1
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object v6, p6

    .line 7
    invoke-direct/range {v0 .. v6}, Lyl0/a;-><init>(DDILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(D)Z
    .locals 4

    iget-wide v0, p0, Lyl0/a;->a:D

    iget-wide v2, p0, Lyl0/a;->b:D

    cmpg-double v2, p1, v2

    if-gtz v2, :cond_0

    cmpg-double v0, v0, p1

    if-gtz v0, :cond_0

    iget v0, p0, Lyl0/a;->c:I

    invoke-static {p1, p2, v0}, Llb1/v2;->b(DI)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lyl0/a;->c:I

    return v0
.end method

.method public final c()D
    .locals 2

    iget-wide v0, p0, Lyl0/a;->b:D

    return-wide v0
.end method

.method public final d()D
    .locals 2

    iget-wide v0, p0, Lyl0/a;->a:D

    return-wide v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyl0/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lyl0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lyl0/a;

    iget-wide v3, p0, Lyl0/a;->a:D

    iget-wide v5, p1, Lyl0/a;->a:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lyl0/a;->b:D

    iget-wide v5, p1, Lyl0/a;->b:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lyl0/a;->c:I

    iget v3, p1, Lyl0/a;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lyl0/a;->d:Ljava/lang/String;

    iget-object p1, p1, Lyl0/a;->d:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lyl0/a;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lyl0/a;->b:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget v2, p0, Lyl0/a;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lyl0/a;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lyl0/a;->a:D

    iget-wide v2, p0, Lyl0/a;->b:D

    iget v4, p0, Lyl0/a;->c:I

    iget-object v5, p0, Lyl0/a;->d:Ljava/lang/String;

    const-string v6, "JournalEntryMagnitudeConfig(min="

    const-string v7, ", max="

    invoke-static {v6, v0, v1, v7}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", decimalPlaces="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", unit="

    const-string v2, ")"

    invoke-static {v0, v1, v5, v2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
