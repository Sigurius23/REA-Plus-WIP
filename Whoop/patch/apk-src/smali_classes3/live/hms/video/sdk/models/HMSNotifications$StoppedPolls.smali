.class public final Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StoppedPolls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J3\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u001b"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;",
        "",
        "pollId",
        "",
        "stoppedBy",
        "stoppedAt",
        "",
        "duration",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;JJ)V",
        "getPollId",
        "()Ljava/lang/String;",
        "getStoppedBy",
        "getStoppedAt",
        "()J",
        "getDuration",
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
.field private final duration:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "duration"
    .end annotation
.end field

.field private final pollId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll_id"
    .end annotation
.end field

.field private final stoppedAt:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stopped_at"
    .end annotation
.end field

.field private final stoppedBy:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stopped_by"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 1

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->pollId:Ljava/lang/String;

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedBy:Ljava/lang/String;

    iput-wide p3, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedAt:J

    iput-wide p5, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->duration:J

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->pollId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedBy:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-wide p3, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedAt:J

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    iget-wide p5, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->duration:J

    :cond_3
    move-wide p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->copy(Ljava/lang/String;Ljava/lang/String;JJ)Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedBy:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedAt:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->duration:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;JJ)Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;
    .locals 8

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide v6, p5

    invoke-direct/range {v1 .. v7}, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;-><init>(Ljava/lang/String;Ljava/lang/String;JJ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->pollId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->pollId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedBy:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedBy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedAt:J

    iget-wide v5, p1, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedAt:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->duration:J

    iget-wide v5, p1, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->duration:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDuration()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->duration:J

    return-wide v0
.end method

.method public final getPollId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final getStoppedAt()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedAt:J

    return-wide v0
.end method

.method public final getStoppedBy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedBy:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->pollId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedBy:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v2, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedAt:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->duration:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StoppedPolls(pollId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->pollId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", stoppedBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedBy:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", stoppedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->stoppedAt:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;->duration:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
