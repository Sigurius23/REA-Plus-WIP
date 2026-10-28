.class public final Lvt0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0015\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0019\u001a\u0004\u0008\u001c\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001d\u001a\u0004\u0008\u001b\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lvt0/b;",
        "",
        "",
        "version",
        "",
        "newestTimestamp",
        "oldestTimestamp",
        "packetCount",
        "Ljava/io/File;",
        "outputFile",
        "<init>",
        "(IJJJLjava/io/File;)V",
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
        "I",
        "e",
        "b",
        "J",
        "()J",
        "c",
        "d",
        "Ljava/io/File;",
        "()Ljava/io/File;",
        "connectivity-data-packets_release"
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
.field private final a:I

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:Ljava/io/File;


# direct methods
.method public constructor <init>(IJJJLjava/io/File;)V
    .locals 1

    const-string v0, "outputFile"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lvt0/b;->a:I

    iput-wide p2, p0, Lvt0/b;->b:J

    iput-wide p4, p0, Lvt0/b;->c:J

    iput-wide p6, p0, Lvt0/b;->d:J

    iput-object p8, p0, Lvt0/b;->e:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lvt0/b;->b:J

    return-wide v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lvt0/b;->c:J

    return-wide v0
.end method

.method public final c()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lvt0/b;->e:Ljava/io/File;

    return-object v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lvt0/b;->d:J

    return-wide v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lvt0/b;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvt0/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvt0/b;

    iget v1, p0, Lvt0/b;->a:I

    iget v3, p1, Lvt0/b;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lvt0/b;->b:J

    iget-wide v5, p1, Lvt0/b;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lvt0/b;->c:J

    iget-wide v5, p1, Lvt0/b;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lvt0/b;->d:J

    iget-wide v5, p1, Lvt0/b;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lvt0/b;->e:Ljava/io/File;

    iget-object p1, p1, Lvt0/b;->e:Ljava/io/File;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lvt0/b;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lvt0/b;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lvt0/b;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lvt0/b;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Lvt0/b;->e:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lvt0/b;->a:I

    iget-wide v1, p0, Lvt0/b;->b:J

    iget-wide v3, p0, Lvt0/b;->c:J

    iget-wide v5, p0, Lvt0/b;->d:J

    iget-object v7, p0, Lvt0/b;->e:Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "DataPacketUploadModel(version="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", newestTimestamp="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", oldestTimestamp="

    const-string v1, ", packetCount="

    invoke-static {v8, v0, v3, v4, v1}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", outputFile="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
