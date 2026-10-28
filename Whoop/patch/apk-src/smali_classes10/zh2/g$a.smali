.class final Lzh2/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzh2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0015\u0008\u0082\u0008\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010\u000f\"\u0004\u0008!\u0010\"R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u0015\u001a\u0004\u0008#\u0010\u0017\"\u0004\u0008$\u0010\u0019R\"\u0010\u0008\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u0010 \u001a\u0004\u0008\u0014\u0010\u000f\"\u0004\u0008%\u0010\"\u00a8\u0006&"
    }
    d2 = {
        "Lzh2/g$a;",
        "",
        "",
        "firstSequence",
        "lastSequence",
        "",
        "gapCount",
        "missingCount",
        "backwardCount",
        "<init>",
        "(JLjava/lang/Long;IJI)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "J",
        "b",
        "()J",
        "setFirstSequence",
        "(J)V",
        "Ljava/lang/Long;",
        "d",
        "()Ljava/lang/Long;",
        "h",
        "(Ljava/lang/Long;)V",
        "c",
        "I",
        "g",
        "(I)V",
        "e",
        "i",
        "f",
        "strap-history-sync_release"
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
.field private a:J

.field private b:Ljava/lang/Long;

.field private c:I

.field private d:J

.field private e:I


# direct methods
.method public constructor <init>(JLjava/lang/Long;IJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lzh2/g$a;->a:J

    .line 3
    iput-object p3, p0, Lzh2/g$a;->b:Ljava/lang/Long;

    .line 4
    iput p4, p0, Lzh2/g$a;->c:I

    .line 5
    iput-wide p5, p0, Lzh2/g$a;->d:J

    .line 6
    iput p7, p0, Lzh2/g$a;->e:I

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/Long;IJIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p8, 0x4

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    move v4, v0

    goto :goto_0

    :cond_1
    move v4, p4

    :goto_0
    and-int/lit8 p3, p8, 0x8

    if-eqz p3, :cond_2

    const-wide/16 p5, 0x0

    :cond_2
    move-wide v5, p5

    and-int/lit8 p3, p8, 0x10

    if-eqz p3, :cond_3

    move v7, v0

    move-wide v1, p1

    move-object v0, p0

    goto :goto_1

    :cond_3
    move v7, p7

    move-object v0, p0

    move-wide v1, p1

    .line 7
    :goto_1
    invoke-direct/range {v0 .. v7}, Lzh2/g$a;-><init>(JLjava/lang/Long;IJI)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lzh2/g$a;->e:I

    return v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lzh2/g$a;->a:J

    return-wide v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lzh2/g$a;->c:I

    return v0
.end method

.method public final d()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lzh2/g$a;->b:Ljava/lang/Long;

    return-object v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lzh2/g$a;->d:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzh2/g$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzh2/g$a;

    iget-wide v3, p0, Lzh2/g$a;->a:J

    iget-wide v5, p1, Lzh2/g$a;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lzh2/g$a;->b:Ljava/lang/Long;

    iget-object v3, p1, Lzh2/g$a;->b:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lzh2/g$a;->c:I

    iget v3, p1, Lzh2/g$a;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lzh2/g$a;->d:J

    iget-wide v5, p1, Lzh2/g$a;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lzh2/g$a;->e:I

    iget p1, p1, Lzh2/g$a;->e:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, Lzh2/g$a;->e:I

    return-void
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Lzh2/g$a;->c:I

    return-void
.end method

.method public final h(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lzh2/g$a;->b:Ljava/lang/Long;

    return-void
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lzh2/g$a;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lzh2/g$a;->b:Ljava/lang/Long;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lzh2/g$a;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Lzh2/g$a;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v1, p0, Lzh2/g$a;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i(J)V
    .locals 0

    iput-wide p1, p0, Lzh2/g$a;->d:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-wide v0, p0, Lzh2/g$a;->a:J

    iget-object v2, p0, Lzh2/g$a;->b:Ljava/lang/Long;

    iget v3, p0, Lzh2/g$a;->c:I

    iget-wide v4, p0, Lzh2/g$a;->d:J

    iget v6, p0, Lzh2/g$a;->e:I

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "RevisionState(firstSequence="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", lastSequence="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", gapCount="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", missingCount="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", backwardCount="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
