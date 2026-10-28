.class public final Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000243B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J>\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010&\u001a\u00020%H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u001a\u0010*\u001a\u00020\u00022\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u0008/\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u00080\u0010\u001fR\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00082\u0010\"\u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;",
        "",
        "",
        "hasData",
        "",
        "offset",
        "limit",
        "",
        "Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;",
        "records",
        "<init>",
        "(ZIILjava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/domain/model/teams/WidgetCollectionResponse;",
        "toWidgetCollectionResponse",
        "()Lcom/whoop/domain/model/teams/WidgetCollectionResponse;",
        "component1",
        "()Z",
        "component2",
        "()I",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "copy",
        "(ZIILjava/util/List;)Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getHasData",
        "I",
        "getOffset",
        "getLimit",
        "Ljava/util/List;",
        "getRecords",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto$Companion;


# instance fields
.field private final hasData:Z

.field private final limit:I

.field private final offset:I

.field private final records:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->Companion:Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lwr1/f;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lwr1/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v1, 0x3

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IZIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto$$serializer;

    invoke-virtual {p6}, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->hasData:Z

    iput p3, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->offset:I

    iput p4, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->limit:I

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->records:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(ZIILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;",
            ">;)V"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->hasData:Z

    .line 4
    iput p2, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->offset:I

    .line 5
    iput p3, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->limit:I

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->records:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;ZIILjava/util/List;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->hasData:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->offset:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->limit:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->records:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->copy(ZIILjava/util/List;)Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->hasData:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->offset:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->limit:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->records:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->hasData:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->offset:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->limit:I

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->records:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ZIILjava/util/List;)Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;",
            ">;)",
            "Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;-><init>(ZIILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->hasData:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->hasData:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->offset:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->offset:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->limit:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->limit:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->records:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->records:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHasData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->hasData:Z

    return v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->limit:I

    return v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->offset:I

    return v0
.end method

.method public final getRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->records:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->hasData:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->offset:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->records:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->hasData:Z

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->offset:I

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->limit:I

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->records:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "WidgetResponseDto(hasData="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", offset="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", limit="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", records="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toWidgetCollectionResponse()Lcom/whoop/domain/model/teams/WidgetCollectionResponse;
    .locals 7

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->hasData:Z

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->offset:I

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->limit:I

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->records:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;

    sget-object v6, Lcom/whoop/domain/model/teams/Widget;->Companion:Lcom/whoop/domain/model/teams/Widget$Companion;

    invoke-virtual {v6, v5}, Lcom/whoop/domain/model/teams/Widget$Companion;->fromDto(Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;)Lcom/whoop/domain/model/teams/Widget;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;-><init>(ZIILjava/util/List;)V

    return-object v4
.end method
