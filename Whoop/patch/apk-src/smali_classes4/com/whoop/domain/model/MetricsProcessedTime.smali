.class public final Lcom/whoop/domain/model/MetricsProcessedTime;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/MetricsProcessedTime$$serializer;,
        Lcom/whoop/domain/model/MetricsProcessedTime$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 )2\u00020\u0001:\u0002*)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B#\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010!\u0012\u0004\u0008#\u0010$\u001a\u0004\u0008\"\u0010\u0018R\u0011\u0010(\u001a\u00020%8F\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'\u00a8\u0006+"
    }
    d2 = {
        "Lcom/whoop/domain/model/MetricsProcessedTime;",
        "",
        "",
        "millis",
        "<init>",
        "(J)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IJLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$connectivity_release",
        "(Lcom/whoop/domain/model/MetricsProcessedTime;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "",
        "toString",
        "()Ljava/lang/String;",
        "component1",
        "()J",
        "copy",
        "(J)Lcom/whoop/domain/model/MetricsProcessedTime;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getMillis",
        "getMillis$annotations",
        "()V",
        "Lorg/joda/time/LocalDateTime;",
        "getTime",
        "()Lorg/joda/time/LocalDateTime;",
        "time",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/domain/model/MetricsProcessedTime$Companion;


# instance fields
.field private final millis:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "latestMetricsProcessed"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/domain/model/MetricsProcessedTime$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/MetricsProcessedTime$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/MetricsProcessedTime;->Companion:Lcom/whoop/domain/model/MetricsProcessedTime$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IJLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p4, :cond_0

    .line 1
    sget-object p4, Lcom/whoop/domain/model/MetricsProcessedTime$$serializer;->INSTANCE:Lcom/whoop/domain/model/MetricsProcessedTime$$serializer;

    invoke-virtual {p4}, Lcom/whoop/domain/model/MetricsProcessedTime$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/domain/model/MetricsProcessedTime;->millis:J

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/domain/model/MetricsProcessedTime;->millis:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/MetricsProcessedTime;JILjava/lang/Object;)Lcom/whoop/domain/model/MetricsProcessedTime;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p1, p0, Lcom/whoop/domain/model/MetricsProcessedTime;->millis:J

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/domain/model/MetricsProcessedTime;->copy(J)Lcom/whoop/domain/model/MetricsProcessedTime;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getMillis$annotations()V
    .locals 0
    .annotation runtime Lad3/u;
        names = {
            "latestMetricsProcessed"
        }
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$connectivity_release(Lcom/whoop/domain/model/MetricsProcessedTime;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/domain/model/MetricsProcessedTime;->millis:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/MetricsProcessedTime;->millis:J

    return-wide v0
.end method

.method public final copy(J)Lcom/whoop/domain/model/MetricsProcessedTime;
    .locals 1

    new-instance v0, Lcom/whoop/domain/model/MetricsProcessedTime;

    invoke-direct {v0, p1, p2}, Lcom/whoop/domain/model/MetricsProcessedTime;-><init>(J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/MetricsProcessedTime;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/MetricsProcessedTime;

    iget-wide v3, p0, Lcom/whoop/domain/model/MetricsProcessedTime;->millis:J

    iget-wide v5, p1, Lcom/whoop/domain/model/MetricsProcessedTime;->millis:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMillis()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/MetricsProcessedTime;->millis:J

    return-wide v0
.end method

.method public final getTime()Lorg/joda/time/LocalDateTime;
    .locals 3

    new-instance v0, Lorg/joda/time/LocalDateTime;

    iget-wide v1, p0, Lcom/whoop/domain/model/MetricsProcessedTime;->millis:J

    invoke-direct {v0, v1, v2}, Lorg/joda/time/LocalDateTime;-><init>(J)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/MetricsProcessedTime;->millis:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-wide v0, p0, Lcom/whoop/domain/model/MetricsProcessedTime;->millis:J

    invoke-static {v0, v1}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MetricsProcessedTime(time = "

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
