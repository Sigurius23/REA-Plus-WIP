.class public final Llive/hms/video/media/settings/HMSLogSettings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Llive/hms/video/media/settings/HMSLogSettings;",
        "",
        "maxDirSizeInBytes",
        "",
        "isLogStorageEnabled",
        "",
        "level",
        "Llive/hms/video/utils/HMSLogger$LogLevel;",
        "<init>",
        "(JZLlive/hms/video/utils/HMSLogger$LogLevel;)V",
        "getMaxDirSizeInBytes",
        "()J",
        "()Z",
        "getLevel",
        "()Llive/hms/video/utils/HMSLogger$LogLevel;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
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
.field private final isLogStorageEnabled:Z

.field private final level:Llive/hms/video/utils/HMSLogger$LogLevel;

.field private final maxDirSizeInBytes:J


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/4 v5, 0x7

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Llive/hms/video/media/settings/HMSLogSettings;-><init>(JZLlive/hms/video/utils/HMSLogger$LogLevel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JZLlive/hms/video/utils/HMSLogger$LogLevel;)V
    .locals 1

    const-string v0, "level"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Llive/hms/video/media/settings/HMSLogSettings;->maxDirSizeInBytes:J

    .line 4
    iput-boolean p3, p0, Llive/hms/video/media/settings/HMSLogSettings;->isLogStorageEnabled:Z

    .line 5
    iput-object p4, p0, Llive/hms/video/media/settings/HMSLogSettings;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    return-void
.end method

.method public synthetic constructor <init>(JZLlive/hms/video/utils/HMSLogger$LogLevel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-wide/32 p1, 0xf4240

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    .line 6
    sget-object p4, Llive/hms/video/utils/HMSLogger$LogLevel;->DEBUG:Llive/hms/video/utils/HMSLogger$LogLevel;

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/media/settings/HMSLogSettings;-><init>(JZLlive/hms/video/utils/HMSLogger$LogLevel;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/media/settings/HMSLogSettings;JZLlive/hms/video/utils/HMSLogger$LogLevel;ILjava/lang/Object;)Llive/hms/video/media/settings/HMSLogSettings;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Llive/hms/video/media/settings/HMSLogSettings;->maxDirSizeInBytes:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p3, p0, Llive/hms/video/media/settings/HMSLogSettings;->isLogStorageEnabled:Z

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Llive/hms/video/media/settings/HMSLogSettings;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/media/settings/HMSLogSettings;->copy(JZLlive/hms/video/utils/HMSLogger$LogLevel;)Llive/hms/video/media/settings/HMSLogSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/media/settings/HMSLogSettings;->maxDirSizeInBytes:J

    return-wide v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSLogSettings;->isLogStorageEnabled:Z

    return v0
.end method

.method public final component3()Llive/hms/video/utils/HMSLogger$LogLevel;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSLogSettings;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    return-object v0
.end method

.method public final copy(JZLlive/hms/video/utils/HMSLogger$LogLevel;)Llive/hms/video/media/settings/HMSLogSettings;
    .locals 1

    const-string v0, "level"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/media/settings/HMSLogSettings;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/media/settings/HMSLogSettings;-><init>(JZLlive/hms/video/utils/HMSLogger$LogLevel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/media/settings/HMSLogSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/media/settings/HMSLogSettings;

    iget-wide v3, p0, Llive/hms/video/media/settings/HMSLogSettings;->maxDirSizeInBytes:J

    iget-wide v5, p1, Llive/hms/video/media/settings/HMSLogSettings;->maxDirSizeInBytes:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Llive/hms/video/media/settings/HMSLogSettings;->isLogStorageEnabled:Z

    iget-boolean v3, p1, Llive/hms/video/media/settings/HMSLogSettings;->isLogStorageEnabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/media/settings/HMSLogSettings;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    iget-object p1, p1, Llive/hms/video/media/settings/HMSLogSettings;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getLevel()Llive/hms/video/utils/HMSLogger$LogLevel;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/settings/HMSLogSettings;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    return-object v0
.end method

.method public final getMaxDirSizeInBytes()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/media/settings/HMSLogSettings;->maxDirSizeInBytes:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Llive/hms/video/media/settings/HMSLogSettings;->maxDirSizeInBytes:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Llive/hms/video/media/settings/HMSLogSettings;->isLogStorageEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/media/settings/HMSLogSettings;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isLogStorageEnabled()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/settings/HMSLogSettings;->isLogStorageEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSLogSettings(maxDirSizeInBytes="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/media/settings/HMSLogSettings;->maxDirSizeInBytes:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", isLogStorageEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/media/settings/HMSLogSettings;->isLogStorageEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", level="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/media/settings/HMSLogSettings;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
