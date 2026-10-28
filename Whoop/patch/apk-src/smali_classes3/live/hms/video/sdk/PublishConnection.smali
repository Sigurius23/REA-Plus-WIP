.class public final Llive/hms/video/sdk/PublishConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J7\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u000c\"\u0004\u0008\u0014\u0010\u000eR\u001a\u0010\u0008\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u000c\"\u0004\u0008\u0016\u0010\u000e\u00a8\u0006#"
    }
    d2 = {
        "Llive/hms/video/sdk/PublishConnection;",
        "",
        "bytesSent",
        "",
        "availableOutgoingBitrates",
        "",
        "",
        "packetsSent",
        "packetLoss",
        "<init>",
        "(JLjava/util/List;JJ)V",
        "getBytesSent",
        "()J",
        "setBytesSent",
        "(J)V",
        "getAvailableOutgoingBitrates",
        "()Ljava/util/List;",
        "setAvailableOutgoingBitrates",
        "(Ljava/util/List;)V",
        "getPacketsSent",
        "setPacketsSent",
        "getPacketLoss",
        "setPacketLoss",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private availableOutgoingBitrates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private bytesSent:J

.field private packetLoss:J

.field private packetsSent:J


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0xf

    const/4 v9, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Llive/hms/video/sdk/PublishConnection;-><init>(JLjava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JLjava/util/List;JJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;JJ)V"
        }
    .end annotation

    const-string v0, "availableOutgoingBitrates"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Llive/hms/video/sdk/PublishConnection;->bytesSent:J

    .line 4
    iput-object p3, p0, Llive/hms/video/sdk/PublishConnection;->availableOutgoingBitrates:Ljava/util/List;

    .line 5
    iput-wide p4, p0, Llive/hms/video/sdk/PublishConnection;->packetsSent:J

    .line 6
    iput-wide p6, p0, Llive/hms/video/sdk/PublishConnection;->packetLoss:J

    return-void
.end method

.method public synthetic constructor <init>(JLjava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p9, p8, 0x1

    const-wide/16 v0, 0x0

    if-eqz p9, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    .line 7
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-wide p4, v0

    :cond_2
    and-int/lit8 p8, p8, 0x8

    if-eqz p8, :cond_3

    move-wide p7, v0

    :goto_0
    move-wide p5, p4

    move-object p4, p3

    move-wide p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move-wide p7, p6

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p8}, Llive/hms/video/sdk/PublishConnection;-><init>(JLjava/util/List;JJ)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/PublishConnection;JLjava/util/List;JJILjava/lang/Object;)Llive/hms/video/sdk/PublishConnection;
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Llive/hms/video/sdk/PublishConnection;->bytesSent:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Llive/hms/video/sdk/PublishConnection;->availableOutgoingBitrates:Ljava/util/List;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p8, 0x4

    if-eqz p1, :cond_2

    iget-wide p4, p0, Llive/hms/video/sdk/PublishConnection;->packetsSent:J

    :cond_2
    move-wide v4, p4

    and-int/lit8 p1, p8, 0x8

    if-eqz p1, :cond_3

    iget-wide p6, p0, Llive/hms/video/sdk/PublishConnection;->packetLoss:J

    :cond_3
    move-object v0, p0

    move-wide v6, p6

    invoke-virtual/range {v0 .. v7}, Llive/hms/video/sdk/PublishConnection;->copy(JLjava/util/List;JJ)Llive/hms/video/sdk/PublishConnection;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/PublishConnection;->bytesSent:J

    return-wide v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/PublishConnection;->availableOutgoingBitrates:Ljava/util/List;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/PublishConnection;->packetsSent:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/PublishConnection;->packetLoss:J

    return-wide v0
.end method

.method public final copy(JLjava/util/List;JJ)Llive/hms/video/sdk/PublishConnection;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;JJ)",
            "Llive/hms/video/sdk/PublishConnection;"
        }
    .end annotation

    const-string v0, "availableOutgoingBitrates"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/PublishConnection;

    move-wide v2, p1

    move-object v4, p3

    move-wide v5, p4

    move-wide v7, p6

    invoke-direct/range {v1 .. v8}, Llive/hms/video/sdk/PublishConnection;-><init>(JLjava/util/List;JJ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/PublishConnection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/PublishConnection;

    iget-wide v3, p0, Llive/hms/video/sdk/PublishConnection;->bytesSent:J

    iget-wide v5, p1, Llive/hms/video/sdk/PublishConnection;->bytesSent:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/PublishConnection;->availableOutgoingBitrates:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/sdk/PublishConnection;->availableOutgoingBitrates:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Llive/hms/video/sdk/PublishConnection;->packetsSent:J

    iget-wide v5, p1, Llive/hms/video/sdk/PublishConnection;->packetsSent:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Llive/hms/video/sdk/PublishConnection;->packetLoss:J

    iget-wide v5, p1, Llive/hms/video/sdk/PublishConnection;->packetLoss:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAvailableOutgoingBitrates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/PublishConnection;->availableOutgoingBitrates:Ljava/util/List;

    return-object v0
.end method

.method public final getBytesSent()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/PublishConnection;->bytesSent:J

    return-wide v0
.end method

.method public final getPacketLoss()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/PublishConnection;->packetLoss:J

    return-wide v0
.end method

.method public final getPacketsSent()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/PublishConnection;->packetsSent:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Llive/hms/video/sdk/PublishConnection;->bytesSent:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sdk/PublishConnection;->availableOutgoingBitrates:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/sdk/PublishConnection;->packetsSent:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Llive/hms/video/sdk/PublishConnection;->packetLoss:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setAvailableOutgoingBitrates(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/PublishConnection;->availableOutgoingBitrates:Ljava/util/List;

    return-void
.end method

.method public final setBytesSent(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/sdk/PublishConnection;->bytesSent:J

    return-void
.end method

.method public final setPacketLoss(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/sdk/PublishConnection;->packetLoss:J

    return-void
.end method

.method public final setPacketsSent(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/sdk/PublishConnection;->packetsSent:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PublishConnection(bytesSent="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/sdk/PublishConnection;->bytesSent:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", availableOutgoingBitrates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/PublishConnection;->availableOutgoingBitrates:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", packetsSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/sdk/PublishConnection;->packetsSent:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetLoss="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/sdk/PublishConnection;->packetLoss:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
