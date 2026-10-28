.class public final Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@BW\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rBk\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0017Jp\u0010\u001c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\'\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001\u00a2\u0006\u0004\u0008+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010.\u0012\u0004\u00080\u00101\u001a\u0004\u0008/\u0010\u0013R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010.\u0012\u0004\u00083\u00101\u001a\u0004\u00082\u0010\u0013R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010.\u0012\u0004\u00085\u00101\u001a\u0004\u00084\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u00087\u0010\u0017R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00106\u0012\u0004\u00089\u00101\u001a\u0004\u00088\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00106\u0012\u0004\u0008;\u00101\u001a\u0004\u0008:\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00106\u0012\u0004\u0008=\u00101\u001a\u0004\u0008<\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u00106\u0012\u0004\u0008?\u00101\u001a\u0004\u0008>\u0010\u0017\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;",
        "",
        "",
        "levelId",
        "minExperience",
        "maxExperience",
        "",
        "tier",
        "badgeUrl",
        "miniBadgeUrl",
        "createdDateTime",
        "updatedDateTime",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/Integer;",
        "component2",
        "component3",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/Integer;",
        "getLevelId",
        "getLevelId$annotations",
        "()V",
        "getMinExperience",
        "getMinExperience$annotations",
        "getMaxExperience",
        "getMaxExperience$annotations",
        "Ljava/lang/String;",
        "getTier",
        "getBadgeUrl",
        "getBadgeUrl$annotations",
        "getMiniBadgeUrl",
        "getMiniBadgeUrl$annotations",
        "getCreatedDateTime",
        "getCreatedDateTime$annotations",
        "getUpdatedDateTime",
        "getUpdatedDateTime$annotations",
        "Companion",
        "$serializer",
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto$Companion;


# instance fields
.field private final badgeUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "badge"
    .end annotation
.end field

.field private final createdDateTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final levelId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "level"
    .end annotation
.end field

.field private final maxExperience:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "maximum_experience"
    .end annotation
.end field

.field private final minExperience:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "minimum_experience"
    .end annotation
.end field

.field private final miniBadgeUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "mini_badge"
    .end annotation
.end field

.field private final tier:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tier"
    .end annotation
.end field

.field private final updatedDateTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->Companion:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto$$serializer;

    invoke-virtual {p10}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->levelId:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->minExperience:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->maxExperience:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->tier:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->badgeUrl:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->miniBadgeUrl:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->createdDateTime:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->updatedDateTime:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->levelId:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->minExperience:Ljava/lang/Integer;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->maxExperience:Ljava/lang/Integer;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->tier:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->badgeUrl:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->miniBadgeUrl:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->createdDateTime:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->updatedDateTime:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->levelId:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->minExperience:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->maxExperience:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->tier:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->badgeUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->miniBadgeUrl:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->createdDateTime:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->updatedDateTime:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBadgeUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "badge"
    .end annotation

    return-void
.end method

.method public static synthetic getCreatedDateTime$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "created_at"
    .end annotation

    return-void
.end method

.method public static synthetic getLevelId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "level"
    .end annotation

    return-void
.end method

.method public static synthetic getMaxExperience$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "maximum_experience"
    .end annotation

    return-void
.end method

.method public static synthetic getMinExperience$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "minimum_experience"
    .end annotation

    return-void
.end method

.method public static synthetic getMiniBadgeUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "mini_badge"
    .end annotation

    return-void
.end method

.method public static synthetic getUpdatedDateTime$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "updated_at"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->levelId:Ljava/lang/Integer;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->minExperience:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->maxExperience:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->tier:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->badgeUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->miniBadgeUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->createdDateTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->updatedDateTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->levelId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->minExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->maxExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->tier:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->badgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->miniBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->createdDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->updatedDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;
    .locals 9

    new-instance v0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->levelId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->levelId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->minExperience:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->minExperience:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->maxExperience:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->maxExperience:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->tier:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->tier:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->badgeUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->badgeUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->miniBadgeUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->miniBadgeUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->createdDateTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->createdDateTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->updatedDateTime:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->updatedDateTime:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBadgeUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->badgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedDateTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->createdDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getLevelId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->levelId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMaxExperience()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->maxExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMinExperience()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->minExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMiniBadgeUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->miniBadgeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getTier()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->tier:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedDateTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->updatedDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->levelId:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->minExperience:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->maxExperience:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->tier:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->badgeUrl:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->miniBadgeUrl:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->createdDateTime:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->updatedDateTime:Ljava/lang/String;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->levelId:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->minExperience:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->maxExperience:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->tier:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->badgeUrl:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->miniBadgeUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->createdDateTime:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->updatedDateTime:Ljava/lang/String;

    const-string v8, ", minExperience="

    const-string v9, ", maxExperience="

    const-string v10, "MemberLevelDto(levelId="

    invoke-static {v10, v0, v8, v1, v9}, Lvl/b;->l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tier="

    const-string v8, ", badgeUrl="

    invoke-static {v2, v1, v3, v8, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", miniBadgeUrl="

    const-string v2, ", createdDateTime="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", updatedDateTime="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
