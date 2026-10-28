.class public final Lcom/whoop/activitysession/PauseSegment;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activitysession/PauseSegment$$serializer;,
        Lcom/whoop/activitysession/PauseSegment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B-\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0005\u0010\u000bJ\'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010$\u001a\u0004\u0008%\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010&\u001a\u0004\u0008\'\u0010\u0018\u00a8\u0006+"
    }
    d2 = {
        "Lcom/whoop/activitysession/PauseSegment;",
        "",
        "",
        "startTimeMs",
        "endTimeMs",
        "<init>",
        "(JLjava/lang/Long;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IJLjava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$activity_session_release",
        "(Lcom/whoop/activitysession/PauseSegment;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()J",
        "component2",
        "()Ljava/lang/Long;",
        "copy",
        "(JLjava/lang/Long;)Lcom/whoop/activitysession/PauseSegment;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getStartTimeMs",
        "Ljava/lang/Long;",
        "getEndTimeMs",
        "Companion",
        "$serializer",
        "a",
        "activity-session_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/activitysession/PauseSegment$a;


# instance fields
.field private final endTimeMs:Ljava/lang/Long;

.field private final startTimeMs:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/activitysession/PauseSegment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/activitysession/PauseSegment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/activitysession/PauseSegment;->Companion:Lcom/whoop/activitysession/PauseSegment$a;

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/activitysession/PauseSegment$$serializer;->INSTANCE:Lcom/whoop/activitysession/PauseSegment$$serializer;

    invoke-virtual {p5}, Lcom/whoop/activitysession/PauseSegment$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/activitysession/PauseSegment;->startTimeMs:J

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    return-void

    :cond_1
    iput-object p4, p0, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(JLjava/lang/Long;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/activitysession/PauseSegment;->startTimeMs:J

    .line 4
    iput-object p3, p0, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/activitysession/PauseSegment;-><init>(JLjava/lang/Long;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/activitysession/PauseSegment;JLjava/lang/Long;ILjava/lang/Object;)Lcom/whoop/activitysession/PauseSegment;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-wide p1, p0, Lcom/whoop/activitysession/PauseSegment;->startTimeMs:J

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/activitysession/PauseSegment;->copy(JLjava/lang/Long;)Lcom/whoop/activitysession/PauseSegment;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$activity_session_release(Lcom/whoop/activitysession/PauseSegment;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/activitysession/PauseSegment;->startTimeMs:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object p0, p0, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/activitysession/PauseSegment;->startTimeMs:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(JLjava/lang/Long;)Lcom/whoop/activitysession/PauseSegment;
    .locals 1

    new-instance v0, Lcom/whoop/activitysession/PauseSegment;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/activitysession/PauseSegment;-><init>(JLjava/lang/Long;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/activitysession/PauseSegment;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/activitysession/PauseSegment;

    iget-wide v3, p0, Lcom/whoop/activitysession/PauseSegment;->startTimeMs:J

    iget-wide v5, p1, Lcom/whoop/activitysession/PauseSegment;->startTimeMs:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    iget-object p1, p1, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getEndTimeMs()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    return-object v0
.end method

.method public final getStartTimeMs()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/activitysession/PauseSegment;->startTimeMs:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/whoop/activitysession/PauseSegment;->startTimeMs:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lcom/whoop/activitysession/PauseSegment;->startTimeMs:J

    iget-object v2, p0, Lcom/whoop/activitysession/PauseSegment;->endTimeMs:Ljava/lang/Long;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PauseSegment(startTimeMs="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", endTimeMs="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
