.class public final Lyh2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0086\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001c\u001a\u0004\u0008\u001f\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001c\u001a\u0004\u0008 \u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001c\u001a\u0004\u0008\"\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010#\u001a\u0004\u0008\u001b\u0010$R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010%\u001a\u0004\u0008!\u0010\u0013\u00a8\u0006&"
    }
    d2 = {
        "Lyh2/b;",
        "",
        "Ljava/io/File;",
        "exportedFile",
        "",
        "newestTimestamp",
        "oldestTimestamp",
        "recordCount",
        "versionId",
        "Loh2/d;",
        "historyHeartDataVersion",
        "",
        "packetRevision",
        "<init>",
        "(Ljava/io/File;JJJJLoh2/d;I)V",
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
        "Ljava/io/File;",
        "()Ljava/io/File;",
        "b",
        "J",
        "c",
        "()J",
        "d",
        "f",
        "e",
        "g",
        "Loh2/d;",
        "()Loh2/d;",
        "I",
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
.field private final a:Ljava/io/File;

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J

.field private final f:Loh2/d;

.field private final g:I


# direct methods
.method public constructor <init>(Ljava/io/File;JJJJLoh2/d;I)V
    .locals 1

    const-string v0, "exportedFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "historyHeartDataVersion"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyh2/b;->a:Ljava/io/File;

    iput-wide p2, p0, Lyh2/b;->b:J

    iput-wide p4, p0, Lyh2/b;->c:J

    iput-wide p6, p0, Lyh2/b;->d:J

    iput-wide p8, p0, Lyh2/b;->e:J

    iput-object p10, p0, Lyh2/b;->f:Loh2/d;

    iput p11, p0, Lyh2/b;->g:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lyh2/b;->a:Ljava/io/File;

    return-object v0
.end method

.method public final b()Loh2/d;
    .locals 1

    iget-object v0, p0, Lyh2/b;->f:Loh2/d;

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lyh2/b;->b:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lyh2/b;->c:J

    return-wide v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lyh2/b;->g:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lyh2/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lyh2/b;

    iget-object v1, p0, Lyh2/b;->a:Ljava/io/File;

    iget-object v3, p1, Lyh2/b;->a:Ljava/io/File;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lyh2/b;->b:J

    iget-wide v5, p1, Lyh2/b;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lyh2/b;->c:J

    iget-wide v5, p1, Lyh2/b;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lyh2/b;->d:J

    iget-wide v5, p1, Lyh2/b;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lyh2/b;->e:J

    iget-wide v5, p1, Lyh2/b;->e:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lyh2/b;->f:Loh2/d;

    iget-object v3, p1, Lyh2/b;->f:Loh2/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lyh2/b;->g:I

    iget p1, p1, Lyh2/b;->g:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lyh2/b;->d:J

    return-wide v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, Lyh2/b;->e:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lyh2/b;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lyh2/b;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lyh2/b;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lyh2/b;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lyh2/b;->e:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Lyh2/b;->f:Loh2/d;

    invoke-virtual {v2}, Loh2/d;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lyh2/b;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, Lyh2/b;->c:J

    invoke-static {v0, v1}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lyh2/b;->b:J

    invoke-static {v1, v2}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lyh2/b;->g:I

    iget-wide v3, p0, Lyh2/b;->d:J

    iget-object v5, p0, Lyh2/b;->a:Ljava/io/File;

    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v5

    const-string v7, " => "

    const-string v8, " - "

    const-string v9, "R"

    invoke-static {v2, v9, v7, v0, v8}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " records, size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
