.class public final Lcom/whoop/ui/teams/LeaderActivityDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;,
        Lcom/whoop/ui/teams/LeaderActivityDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u00029:BC\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBQ\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000b\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001bJR\u0010$\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001bJ\u0010\u0010\'\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010,\u0012\u0004\u0008.\u0010/\u001a\u0004\u0008-\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00082\u0010\u001dR\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u00086\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010,\u001a\u0004\u00087\u0010\u001b\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/ui/teams/LeaderActivityDto;",
        "",
        "",
        "name",
        "",
        "activityId",
        "sportId",
        "",
        "strain",
        "avgStrain",
        "cycleDay",
        "<init>",
        "(Ljava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/ui/teams/LeaderActivityDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "()D",
        "component5",
        "()Ljava/lang/Double;",
        "component6",
        "copy",
        "(Ljava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;)Lcom/whoop/ui/teams/LeaderActivityDto;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getName",
        "getName$annotations",
        "()V",
        "I",
        "getActivityId",
        "getSportId",
        "D",
        "getStrain",
        "Ljava/lang/Double;",
        "getAvgStrain",
        "getCycleDay",
        "Companion",
        "$serializer",
        "a",
        "core_release"
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
.field public static final Companion:Lcom/whoop/ui/teams/LeaderActivityDto$a;


# instance fields
.field private final activityId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "activity_id"
    .end annotation
.end field

.field private final avgStrain:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_strain"
    .end annotation
.end field

.field private final cycleDay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cycle_day"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sport_name"
    .end annotation
.end field

.field private final sportId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sport_id"
    .end annotation
.end field

.field private final strain:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "strain"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/ui/teams/LeaderActivityDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ui/teams/LeaderActivityDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ui/teams/LeaderActivityDto;->Companion:Lcom/whoop/ui/teams/LeaderActivityDto$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0xe

    const/16 v0, 0xe

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;->INSTANCE:Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;

    invoke-virtual {p9}, Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    const/4 v0, 0x0

    if-nez p9, :cond_1

    iput-object v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    :goto_0
    iput p3, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->activityId:I

    iput p4, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->sportId:I

    iput-wide p5, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->strain:D

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    :goto_1
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_3

    iput-object v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    return-void

    :cond_3
    iput-object p8, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->activityId:I

    .line 5
    iput p3, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->sportId:I

    .line 6
    iput-wide p4, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->strain:D

    .line 7
    iput-object p6, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    .line 8
    iput-object p7, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_1

    move-object p6, v0

    :cond_1
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_2

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-wide p5, p4

    move p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p8, p7

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/ui/teams/LeaderActivityDto;-><init>(Ljava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ui/teams/LeaderActivityDto;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->activityId:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->sportId:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-wide p4, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->strain:D

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p6, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget-object p7, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    :cond_5
    move-object p8, p6

    move-object p9, p7

    move-wide p6, p4

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/ui/teams/LeaderActivityDto;->copy(Ljava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;)Lcom/whoop/ui/teams/LeaderActivityDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getName$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sport_name"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/ui/teams/LeaderActivityDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->activityId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->sportId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->strain:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->activityId:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->sportId:I

    return v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->strain:D

    return-wide v0
.end method

.method public final component5()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;)Lcom/whoop/ui/teams/LeaderActivityDto;
    .locals 8

    new-instance v0, Lcom/whoop/ui/teams/LeaderActivityDto;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/whoop/ui/teams/LeaderActivityDto;-><init>(Ljava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/ui/teams/LeaderActivityDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/ui/teams/LeaderActivityDto;

    iget-object v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->activityId:I

    iget v3, p1, Lcom/whoop/ui/teams/LeaderActivityDto;->activityId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->sportId:I

    iget v3, p1, Lcom/whoop/ui/teams/LeaderActivityDto;->sportId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->strain:D

    iget-wide v5, p1, Lcom/whoop/ui/teams/LeaderActivityDto;->strain:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getActivityId()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->activityId:I

    return v0
.end method

.method public final getAvgStrain()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    return-object v0
.end method

.method public final getCycleDay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getSportId()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->sportId:I

    return v0
.end method

.method public final getStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->strain:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->activityId:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->sportId:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-wide v3, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->strain:D

    invoke-static {v0, v2, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->name:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->activityId:I

    iget v2, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->sportId:I

    iget-wide v3, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->strain:D

    iget-object v5, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->avgStrain:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/ui/teams/LeaderActivityDto;->cycleDay:Ljava/lang/String;

    const-string v7, ", activityId="

    const-string v8, ", sportId="

    const-string v9, "LeaderActivityDto(name="

    invoke-static {v1, v9, v0, v7, v8}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", strain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", avgStrain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cycleDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
