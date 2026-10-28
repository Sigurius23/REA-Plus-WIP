.class public final Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel$$serializer;,
        Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298BC\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\r\u0010\u000eB[\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010#JV\u0010&\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010#J\u0010\u0010)\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010,\u001a\u00020\u00052\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u0008/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00104\u001a\u0004\u00086\u0010#R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00104\u001a\u0004\u00087\u0010#\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;",
        "",
        "",
        "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;",
        "tiles",
        "",
        "showMore",
        "",
        "nextExerciseOffset",
        "",
        "nextEndDate",
        "nextStartDate",
        "analyticsAction",
        "<init>",
        "(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$personal_records_mini_arch_release",
        "(Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Z",
        "component3",
        "()Ljava/lang/Integer;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "component6",
        "copy",
        "(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getTiles",
        "Z",
        "getShowMore",
        "Ljava/lang/Integer;",
        "getNextExerciseOffset",
        "Ljava/lang/String;",
        "getNextEndDate",
        "getNextStartDate",
        "getAnalyticsAction",
        "Companion",
        "$serializer",
        "personal-records-mini-arch_release"
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

.field public static final Companion:Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel$Companion;


# instance fields
.field private final analyticsAction:Ljava/lang/String;

.field private final nextEndDate:Ljava/lang/String;

.field private final nextExerciseOffset:Ljava/lang/Integer;

.field private final nextStartDate:Ljava/lang/String;

.field private final showMore:Z

.field private final tiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->Companion:Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lou1/a;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lou1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel$$serializer;->INSTANCE:Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->tiles:Ljava/util/List;

    iput-boolean p3, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->showMore:Z

    iput-object p4, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextExerciseOffset:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextEndDate:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextStartDate:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    return-void

    :cond_1
    iput-object p7, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;",
            ">;Z",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "tiles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextEndDate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextStartDate"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->tiles:Ljava/util/List;

    .line 4
    iput-boolean p2, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->showMore:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextExerciseOffset:Ljava/lang/Integer;

    .line 6
    iput-object p4, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextEndDate:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextStartDate:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;-><init>(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto$$serializer;->INSTANCE:Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->tiles:Ljava/util/List;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->showMore:Z

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextExerciseOffset:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextEndDate:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextStartDate:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->copy(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$personal_records_mini_arch_release(Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->tiles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->showMore:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextExerciseOffset:Ljava/lang/Integer;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextEndDate:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextStartDate:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->tiles:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->showMore:Z

    return v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextExerciseOffset:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextEndDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextStartDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;",
            ">;Z",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;"
        }
    .end annotation

    const-string v0, "tiles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextEndDate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextStartDate"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;-><init>(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->tiles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->tiles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->showMore:Z

    iget-boolean v3, p1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->showMore:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextExerciseOffset:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextExerciseOffset:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextEndDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextEndDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextStartDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextStartDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAnalyticsAction()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextEndDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextEndDate:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextExerciseOffset()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextExerciseOffset:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNextStartDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextStartDate:Ljava/lang/String;

    return-object v0
.end method

.method public final getShowMore()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->showMore:Z

    return v0
.end method

.method public final getTiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->tiles:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->tiles:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->showMore:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextExerciseOffset:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextEndDate:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextStartDate:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->tiles:Ljava/util/List;

    iget-boolean v1, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->showMore:Z

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextExerciseOffset:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextEndDate:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->nextStartDate:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->analyticsAction:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "PersonalRecordsModel(tiles="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showMore="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", nextExerciseOffset="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", nextEndDate="

    const-string v1, ", nextStartDate="

    invoke-static {v2, v0, v3, v1, v6}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", analyticsAction="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
