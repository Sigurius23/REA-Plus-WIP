.class public final Lcom/whoop/domain/model/haptics/StoredAlarm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/domain/model/haptics/StoredAlarm;",
        "",
        "strapAlarmIdentifiable",
        "Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;",
        "hapticsPattern",
        "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;",
        "alarmTimeMillis",
        "",
        "<init>",
        "(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)V",
        "getStrapAlarmIdentifiable",
        "()Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;",
        "getHapticsPattern",
        "()Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;",
        "getAlarmTimeMillis",
        "()J",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "connectivity_release"
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
.field private final alarmTimeMillis:J

.field private final hapticsPattern:Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

.field private final strapAlarmIdentifiable:Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;


# direct methods
.method public constructor <init>(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)V
    .locals 1

    const-string v0, "strapAlarmIdentifiable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hapticsPattern"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->strapAlarmIdentifiable:Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;

    iput-object p2, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->hapticsPattern:Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    iput-wide p3, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->alarmTimeMillis:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/haptics/StoredAlarm;Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;JILjava/lang/Object;)Lcom/whoop/domain/model/haptics/StoredAlarm;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->strapAlarmIdentifiable:Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->hapticsPattern:Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-wide p3, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->alarmTimeMillis:J

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/domain/model/haptics/StoredAlarm;->copy(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)Lcom/whoop/domain/model/haptics/StoredAlarm;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->strapAlarmIdentifiable:Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;

    return-object v0
.end method

.method public final component2()Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->hapticsPattern:Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->alarmTimeMillis:J

    return-wide v0
.end method

.method public final copy(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)Lcom/whoop/domain/model/haptics/StoredAlarm;
    .locals 1

    const-string v0, "strapAlarmIdentifiable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hapticsPattern"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/domain/model/haptics/StoredAlarm;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/domain/model/haptics/StoredAlarm;-><init>(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/haptics/StoredAlarm;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/haptics/StoredAlarm;

    iget-object v1, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->strapAlarmIdentifiable:Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;

    iget-object v3, p1, Lcom/whoop/domain/model/haptics/StoredAlarm;->strapAlarmIdentifiable:Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->hapticsPattern:Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    iget-object v3, p1, Lcom/whoop/domain/model/haptics/StoredAlarm;->hapticsPattern:Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->alarmTimeMillis:J

    iget-wide v5, p1, Lcom/whoop/domain/model/haptics/StoredAlarm;->alarmTimeMillis:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAlarmTimeMillis()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->alarmTimeMillis:J

    return-wide v0
.end method

.method public final getHapticsPattern()Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->hapticsPattern:Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    return-object v0
.end method

.method public final getStrapAlarmIdentifiable()Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->strapAlarmIdentifiable:Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->strapAlarmIdentifiable:Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;

    invoke-virtual {v0}, Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->hapticsPattern:Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    invoke-virtual {v1}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->alarmTimeMillis:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->strapAlarmIdentifiable:Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;

    iget-object v1, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->hapticsPattern:Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    iget-wide v2, p0, Lcom/whoop/domain/model/haptics/StoredAlarm;->alarmTimeMillis:J

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "StoredAlarm(strapAlarmIdentifiable="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hapticsPattern="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", alarmTimeMillis="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v3, v0, v4}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
