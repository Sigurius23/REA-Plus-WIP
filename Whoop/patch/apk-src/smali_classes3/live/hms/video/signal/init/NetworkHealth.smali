.class public final Llive/hms/video/signal/init/NetworkHealth;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007H\u00c6\u0003J3\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001b"
    }
    d2 = {
        "Llive/hms/video/signal/init/NetworkHealth;",
        "",
        "timeout",
        "",
        "url",
        "",
        "scoreMap",
        "Ljava/util/SortedMap;",
        "",
        "Llive/hms/video/signal/init/RangeLimits;",
        "<init>",
        "(JLjava/lang/String;Ljava/util/SortedMap;)V",
        "getTimeout",
        "()J",
        "getUrl",
        "()Ljava/lang/String;",
        "getScoreMap",
        "()Ljava/util/SortedMap;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final scoreMap:Ljava/util/SortedMap;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "scoreMap"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/SortedMap<",
            "Ljava/lang/Integer;",
            "Llive/hms/video/signal/init/RangeLimits;",
            ">;"
        }
    .end annotation
.end field

.field private final timeout:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timeout"
    .end annotation
.end field

.field private final url:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "url"
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/util/SortedMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/SortedMap<",
            "Ljava/lang/Integer;",
            "Llive/hms/video/signal/init/RangeLimits;",
            ">;)V"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scoreMap"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/signal/init/NetworkHealth;->timeout:J

    iput-object p3, p0, Llive/hms/video/signal/init/NetworkHealth;->url:Ljava/lang/String;

    iput-object p4, p0, Llive/hms/video/signal/init/NetworkHealth;->scoreMap:Ljava/util/SortedMap;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/init/NetworkHealth;JLjava/lang/String;Ljava/util/SortedMap;ILjava/lang/Object;)Llive/hms/video/signal/init/NetworkHealth;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Llive/hms/video/signal/init/NetworkHealth;->timeout:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p3, p0, Llive/hms/video/signal/init/NetworkHealth;->url:Ljava/lang/String;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Llive/hms/video/signal/init/NetworkHealth;->scoreMap:Ljava/util/SortedMap;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/signal/init/NetworkHealth;->copy(JLjava/lang/String;Ljava/util/SortedMap;)Llive/hms/video/signal/init/NetworkHealth;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/signal/init/NetworkHealth;->timeout:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/NetworkHealth;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/SortedMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedMap<",
            "Ljava/lang/Integer;",
            "Llive/hms/video/signal/init/RangeLimits;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/init/NetworkHealth;->scoreMap:Ljava/util/SortedMap;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/util/SortedMap;)Llive/hms/video/signal/init/NetworkHealth;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/SortedMap<",
            "Ljava/lang/Integer;",
            "Llive/hms/video/signal/init/RangeLimits;",
            ">;)",
            "Llive/hms/video/signal/init/NetworkHealth;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scoreMap"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/signal/init/NetworkHealth;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/signal/init/NetworkHealth;-><init>(JLjava/lang/String;Ljava/util/SortedMap;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/init/NetworkHealth;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/init/NetworkHealth;

    iget-wide v3, p0, Llive/hms/video/signal/init/NetworkHealth;->timeout:J

    iget-wide v5, p1, Llive/hms/video/signal/init/NetworkHealth;->timeout:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/signal/init/NetworkHealth;->url:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/init/NetworkHealth;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/signal/init/NetworkHealth;->scoreMap:Ljava/util/SortedMap;

    iget-object p1, p1, Llive/hms/video/signal/init/NetworkHealth;->scoreMap:Ljava/util/SortedMap;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getScoreMap()Ljava/util/SortedMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedMap<",
            "Ljava/lang/Integer;",
            "Llive/hms/video/signal/init/RangeLimits;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/init/NetworkHealth;->scoreMap:Ljava/util/SortedMap;

    return-object v0
.end method

.method public final getTimeout()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/signal/init/NetworkHealth;->timeout:J

    return-wide v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/NetworkHealth;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Llive/hms/video/signal/init/NetworkHealth;->timeout:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/signal/init/NetworkHealth;->url:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/signal/init/NetworkHealth;->scoreMap:Ljava/util/SortedMap;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NetworkHealth(timeout="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/signal/init/NetworkHealth;->timeout:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/NetworkHealth;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", scoreMap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/NetworkHealth;->scoreMap:Ljava/util/SortedMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
