.class public final Lcom/whoop/common/network/model/GarmentItemDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/common/network/model/GarmentItemDto$$serializer;,
        Lcom/whoop/common/network/model/GarmentItemDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008,\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BCBM\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBa\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&Jd\u0010\'\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010-\u001a\u00020\u00042\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010/\u0012\u0004\u00081\u00102\u001a\u0004\u00080\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00103\u0012\u0004\u00085\u00102\u001a\u0004\u00084\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00106\u0012\u0004\u00088\u00102\u001a\u0004\u00087\u0010!R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010/\u0012\u0004\u0008:\u00102\u001a\u0004\u00089\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010/\u0012\u0004\u0008<\u00102\u001a\u0004\u0008;\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010/\u0012\u0004\u0008>\u00102\u001a\u0004\u0008=\u0010\u001dR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010?\u001a\u0004\u0008@\u0010&\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/common/network/model/GarmentItemDto;",
        "",
        "",
        "created_at",
        "",
        "deleted",
        "",
        "id",
        "name",
        "strap_location",
        "updated_at",
        "Lcom/whoop/common/network/model/StrapGenerationSupportInfo;",
        "strapGenerationSupportInfo",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$add_activity_release",
        "(Lcom/whoop/common/network/model/GarmentItemDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/lang/Boolean;",
        "component3",
        "()Ljava/lang/Integer;",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/common/network/model/StrapGenerationSupportInfo;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;)Lcom/whoop/common/network/model/GarmentItemDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCreated_at",
        "getCreated_at$annotations",
        "()V",
        "Ljava/lang/Boolean;",
        "getDeleted",
        "getDeleted$annotations",
        "Ljava/lang/Integer;",
        "getId",
        "getId$annotations",
        "getName",
        "getName$annotations",
        "getStrap_location",
        "getStrap_location$annotations",
        "getUpdated_at",
        "getUpdated_at$annotations",
        "Lcom/whoop/common/network/model/StrapGenerationSupportInfo;",
        "getStrapGenerationSupportInfo",
        "Companion",
        "$serializer",
        "a",
        "add-activity_release"
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

.field public static final Companion:Lcom/whoop/common/network/model/GarmentItemDto$a;


# instance fields
.field private final created_at:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final deleted:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted"
    .end annotation
.end field

.field private final id:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final strapGenerationSupportInfo:Lcom/whoop/common/network/model/StrapGenerationSupportInfo;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "strap_generation_support_info"
    .end annotation
.end field

.field private final strap_location:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "strap_location"
    .end annotation
.end field

.field private final updated_at:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/common/network/model/GarmentItemDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/common/network/model/GarmentItemDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/common/network/model/GarmentItemDto;->Companion:Lcom/whoop/common/network/model/GarmentItemDto$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/common/network/model/GarmentItemDto;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/common/network/model/GarmentItemDto$$serializer;->INSTANCE:Lcom/whoop/common/network/model/GarmentItemDto$$serializer;

    invoke-virtual {p9}, Lcom/whoop/common/network/model/GarmentItemDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->created_at:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/common/network/model/GarmentItemDto;->deleted:Ljava/lang/Boolean;

    iput-object p4, p0, Lcom/whoop/common/network/model/GarmentItemDto;->id:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/whoop/common/network/model/GarmentItemDto;->name:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strap_location:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/common/network/model/GarmentItemDto;->updated_at:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strapGenerationSupportInfo:Lcom/whoop/common/network/model/StrapGenerationSupportInfo;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/common/network/model/GarmentItemDto;->created_at:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->deleted:Ljava/lang/Boolean;

    .line 5
    iput-object p3, p0, Lcom/whoop/common/network/model/GarmentItemDto;->id:Ljava/lang/Integer;

    .line 6
    iput-object p4, p0, Lcom/whoop/common/network/model/GarmentItemDto;->name:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strap_location:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/common/network/model/GarmentItemDto;->updated_at:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strapGenerationSupportInfo:Lcom/whoop/common/network/model/StrapGenerationSupportInfo;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/common/network/model/GarmentItemDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;ILjava/lang/Object;)Lcom/whoop/common/network/model/GarmentItemDto;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/common/network/model/GarmentItemDto;->created_at:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->deleted:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/common/network/model/GarmentItemDto;->id:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/common/network/model/GarmentItemDto;->name:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strap_location:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/common/network/model/GarmentItemDto;->updated_at:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strapGenerationSupportInfo:Lcom/whoop/common/network/model/StrapGenerationSupportInfo;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/common/network/model/GarmentItemDto;->copy(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;)Lcom/whoop/common/network/model/GarmentItemDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCreated_at$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "created_at"
    .end annotation

    return-void
.end method

.method public static synthetic getDeleted$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "deleted"
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getName$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "name"
    .end annotation

    return-void
.end method

.method public static synthetic getStrap_location$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "strap_location"
    .end annotation

    return-void
.end method

.method public static synthetic getUpdated_at$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "updated_at"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$add_activity_release(Lcom/whoop/common/network/model/GarmentItemDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/common/network/model/GarmentItemDto;->created_at:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->deleted:Ljava/lang/Boolean;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->id:Ljava/lang/Integer;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strap_location:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->updated_at:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/common/network/model/StrapGenerationSupportInfo$$serializer;->INSTANCE:Lcom/whoop/common/network/model/StrapGenerationSupportInfo$$serializer;

    iget-object p0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strapGenerationSupportInfo:Lcom/whoop/common/network/model/StrapGenerationSupportInfo;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->created_at:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->deleted:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strap_location:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->updated_at:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/common/network/model/StrapGenerationSupportInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strapGenerationSupportInfo:Lcom/whoop/common/network/model/StrapGenerationSupportInfo;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;)Lcom/whoop/common/network/model/GarmentItemDto;
    .locals 8

    new-instance v0, Lcom/whoop/common/network/model/GarmentItemDto;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/whoop/common/network/model/GarmentItemDto;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/common/network/model/GarmentItemDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/common/network/model/GarmentItemDto;

    iget-object v1, p0, Lcom/whoop/common/network/model/GarmentItemDto;->created_at:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/common/network/model/GarmentItemDto;->created_at:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/common/network/model/GarmentItemDto;->deleted:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/common/network/model/GarmentItemDto;->deleted:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/common/network/model/GarmentItemDto;->id:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/common/network/model/GarmentItemDto;->id:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/common/network/model/GarmentItemDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/common/network/model/GarmentItemDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strap_location:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/common/network/model/GarmentItemDto;->strap_location:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/common/network/model/GarmentItemDto;->updated_at:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/common/network/model/GarmentItemDto;->updated_at:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strapGenerationSupportInfo:Lcom/whoop/common/network/model/StrapGenerationSupportInfo;

    iget-object p1, p1, Lcom/whoop/common/network/model/GarmentItemDto;->strapGenerationSupportInfo:Lcom/whoop/common/network/model/StrapGenerationSupportInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCreated_at()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->created_at:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleted()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->deleted:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getStrapGenerationSupportInfo()Lcom/whoop/common/network/model/StrapGenerationSupportInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strapGenerationSupportInfo:Lcom/whoop/common/network/model/StrapGenerationSupportInfo;

    return-object v0
.end method

.method public final getStrap_location()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strap_location:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdated_at()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->updated_at:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->created_at:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->deleted:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->id:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->name:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strap_location:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->updated_at:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strapGenerationSupportInfo:Lcom/whoop/common/network/model/StrapGenerationSupportInfo;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/common/network/model/StrapGenerationSupportInfo;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/common/network/model/GarmentItemDto;->created_at:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/common/network/model/GarmentItemDto;->deleted:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/whoop/common/network/model/GarmentItemDto;->id:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/whoop/common/network/model/GarmentItemDto;->name:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strap_location:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/common/network/model/GarmentItemDto;->updated_at:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/common/network/model/GarmentItemDto;->strapGenerationSupportInfo:Lcom/whoop/common/network/model/StrapGenerationSupportInfo;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "GarmentItemDto(created_at="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", deleted="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    const-string v1, ", strap_location="

    invoke-static {v2, v0, v3, v1, v7}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", updated_at="

    const-string v1, ", strapGenerationSupportInfo="

    invoke-static {v7, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
