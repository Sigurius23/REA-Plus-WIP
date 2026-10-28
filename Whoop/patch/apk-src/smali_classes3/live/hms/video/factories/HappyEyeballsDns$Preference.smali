.class final Llive/hms/video/factories/HappyEyeballsDns$Preference;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/factories/HappyEyeballsDns;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Preference"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Llive/hms/video/factories/HappyEyeballsDns$Preference;",
        "",
        "preferIpv6",
        "",
        "decidedAtMs",
        "",
        "<init>",
        "(ZJ)V",
        "getPreferIpv6",
        "()Z",
        "getDecidedAtMs",
        "()J",
        "component1",
        "component2",
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
.field private final decidedAtMs:J

.field private final preferIpv6:Z


# direct methods
.method public constructor <init>(ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->preferIpv6:Z

    iput-wide p2, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->decidedAtMs:J

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/factories/HappyEyeballsDns$Preference;ZJILjava/lang/Object;)Llive/hms/video/factories/HappyEyeballsDns$Preference;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->preferIpv6:Z

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->decidedAtMs:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/factories/HappyEyeballsDns$Preference;->copy(ZJ)Llive/hms/video/factories/HappyEyeballsDns$Preference;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->preferIpv6:Z

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->decidedAtMs:J

    return-wide v0
.end method

.method public final copy(ZJ)Llive/hms/video/factories/HappyEyeballsDns$Preference;
    .locals 1

    new-instance v0, Llive/hms/video/factories/HappyEyeballsDns$Preference;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/factories/HappyEyeballsDns$Preference;-><init>(ZJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/factories/HappyEyeballsDns$Preference;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/factories/HappyEyeballsDns$Preference;

    iget-boolean v1, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->preferIpv6:Z

    iget-boolean v3, p1, Llive/hms/video/factories/HappyEyeballsDns$Preference;->preferIpv6:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->decidedAtMs:J

    iget-wide v5, p1, Llive/hms/video/factories/HappyEyeballsDns$Preference;->decidedAtMs:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDecidedAtMs()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->decidedAtMs:J

    return-wide v0
.end method

.method public final getPreferIpv6()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->preferIpv6:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->preferIpv6:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->decidedAtMs:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Preference(preferIpv6="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->preferIpv6:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", decidedAtMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/factories/HappyEyeballsDns$Preference;->decidedAtMs:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
