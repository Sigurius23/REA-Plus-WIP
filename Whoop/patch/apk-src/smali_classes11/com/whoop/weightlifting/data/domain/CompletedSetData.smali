.class public final Lcom/whoop/weightlifting/data/domain/CompletedSetData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/domain/CompletedSetData$$serializer;,
        Lcom/whoop/weightlifting/data/domain/CompletedSetData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBI\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJB\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\'\u001a\u00020&H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010,\u001a\u00020\u00042\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010.\u0012\u0004\u00080\u00101\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u0008\u0005\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00084\u0010 R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u00086\u0010\"R\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00102\u001a\u0004\u00087\u0010\u001e\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/CompletedSetData;",
        "",
        "Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
        "during",
        "",
        "isExerciseTrackable",
        "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "strapLocation",
        "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "strapLaterality",
        "wasEditedAfterCompletion",
        "<init>",
        "(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/domain/CompletedSetData;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
        "component2",
        "()Z",
        "component3",
        "()Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "component4",
        "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "component5",
        "copy",
        "(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)Lcom/whoop/weightlifting/data/domain/CompletedSetData;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
        "getDuring",
        "getDuring$annotations",
        "()V",
        "Z",
        "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "getStrapLocation",
        "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "getStrapLaterality",
        "getWasEditedAfterCompletion",
        "Companion",
        "$serializer",
        "weightlifting_release"
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weightlifting/data/domain/CompletedSetData$Companion;


# instance fields
.field private final during:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

.field private final isExerciseTrackable:Z

.field private final strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

.field private final strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

.field private final wasEditedAfterCompletion:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/weightlifting/data/domain/CompletedSetData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/domain/CompletedSetData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->Companion:Lcom/whoop/weightlifting/data/domain/CompletedSetData$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljp1/p;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Ljp1/p;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ljp1/p;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Ljp1/p;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v2, v3, v4

    const/4 v2, 0x3

    aput-object v0, v3, v2

    const/4 v0, 0x4

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/weightlifting/data/domain/CompletedSetData$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/CompletedSetData$$serializer;

    invoke-virtual {p7}, Lcom/whoop/weightlifting/data/domain/CompletedSetData$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->during:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    iput-boolean p3, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->isExerciseTrackable:Z

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    iput-object p5, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    return-void

    :cond_1
    iput-boolean p6, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V
    .locals 1

    const-string v0, "during"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLocation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLaterality"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->during:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    .line 4
    iput-boolean p2, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->isExerciseTrackable:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    .line 6
    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;-><init>(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.weightlifting.data.domain.StrapLocation"

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/StrapLocation;->values()[Lcom/whoop/weightlifting/data/domain/StrapLocation;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.weightlifting.data.domain.StrapLaterality"

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/StrapLaterality;->values()[Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/domain/CompletedSetData;Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/CompletedSetData;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->during:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->isExerciseTrackable:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->copy(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDuring$annotations()V
    .locals 0
    .annotation runtime Lwc3/i;
        with = Llu2/a;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/domain/CompletedSetData;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->$childSerializers:[Ll83/h;

    sget-object v1, Llu2/a;->a:Llu2/a;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->during:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->isExerciseTrackable:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    if-eqz v1, :cond_1

    :goto_0
    iget-boolean p0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/data/remote/domain/dto/DateTimeRange;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->during:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->isExerciseTrackable:Z

    return v0
.end method

.method public final component3()Lcom/whoop/weightlifting/data/domain/StrapLocation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    return-object v0
.end method

.method public final component4()Lcom/whoop/weightlifting/data/domain/StrapLaterality;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    return v0
.end method

.method public final copy(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)Lcom/whoop/weightlifting/data/domain/CompletedSetData;
    .locals 7

    const-string v0, "during"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLocation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLaterality"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;-><init>(Lcom/whoop/data/remote/domain/dto/DateTimeRange;ZLcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->during:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->during:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->isExerciseTrackable:Z

    iget-boolean v3, p1, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->isExerciseTrackable:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    iget-boolean p1, p1, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDuring()Lcom/whoop/data/remote/domain/dto/DateTimeRange;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->during:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    return-object v0
.end method

.method public final getStrapLaterality()Lcom/whoop/weightlifting/data/domain/StrapLaterality;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    return-object v0
.end method

.method public final getStrapLocation()Lcom/whoop/weightlifting/data/domain/StrapLocation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    return-object v0
.end method

.method public final getWasEditedAfterCompletion()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->during:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->isExerciseTrackable:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isExerciseTrackable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->isExerciseTrackable:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->during:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->isExerciseTrackable:Z

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    iget-boolean v4, p0, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->wasEditedAfterCompletion:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "CompletedSetData(during="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isExerciseTrackable="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", strapLocation="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", strapLaterality="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", wasEditedAfterCompletion="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
