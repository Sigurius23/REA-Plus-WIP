.class public final Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 &2\u00020\u0001:\u0002\'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B+\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0005\u0010\u000bJ\'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010#\u001a\u0004\u0008$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010#\u001a\u0004\u0008%\u0010\u0016\u00a8\u0006("
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;",
        "",
        "",
        "dateTimeStart",
        "dateTimeEnd",
        "<init>",
        "(JJ)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()J",
        "component2",
        "copy",
        "(JJ)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;",
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
        "getDateTimeStart",
        "getDateTimeEnd",
        "Companion",
        "$serializer",
        "advanced-labs_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$Companion;


# instance fields
.field private final dateTimeEnd:J

.field private final dateTimeStart:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->Companion:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeStart:J

    iput-wide p4, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeEnd:J

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeStart:J

    .line 4
    iput-wide p3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeEnd:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;JJILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeStart:J

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    iget-wide p3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeEnd:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->copy(JJ)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeStart:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeEnd:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeStart:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeEnd:J

    return-wide v0
.end method

.method public final copy(JJ)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;
    .locals 1

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;-><init>(JJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    iget-wide v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeStart:J

    iget-wide v5, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeStart:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeEnd:J

    iget-wide v5, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeEnd:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDateTimeEnd()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeEnd:J

    return-wide v0
.end method

.method public final getDateTimeStart()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeStart:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeStart:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeEnd:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeStart:J

    iget-wide v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->dateTimeEnd:J

    const-string v4, "AppointmentSummaryAddToCalendarDataModel(dateTimeStart="

    const-string v5, ", dateTimeEnd="

    invoke-static {v0, v1, v4, v5}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v2, v3, v1, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
