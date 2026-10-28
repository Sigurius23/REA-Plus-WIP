.class public final Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tB;\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0008\u0010\rJ\'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010)\u001a\u0004\u0008+\u0010\u001bR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010,\u001a\u0004\u0008-\u0010\u001e\u00a8\u00060"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;",
        "",
        "",
        "offset",
        "limit",
        "",
        "Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;",
        "records",
        "<init>",
        "(IILjava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/domain/model/teams/share/TeamResponse;",
        "toTeamResponse",
        "()Lcom/whoop/domain/model/teams/share/TeamResponse;",
        "component1",
        "()I",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "copy",
        "(IILjava/util/List;)Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
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

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto$Companion;


# instance fields
.field private final limit:I

.field private final offset:I

.field private final records:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->Companion:Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lwr1/f;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lwr1/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v1, 0x2

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto$$serializer;

    invoke-virtual {p5}, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->offset:I

    iput p3, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->limit:I

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->records:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;",
            ">;)V"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->offset:I

    .line 4
    iput p2, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->limit:I

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->records:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;IILjava/util/List;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->offset:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->limit:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->records:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->copy(IILjava/util/List;)Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->offset:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->limit:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->records:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->offset:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->limit:I

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->records:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IILjava/util/List;)Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;",
            ">;)",
            "Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;-><init>(IILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->offset:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->offset:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->limit:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->limit:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->records:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->records:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->limit:I

    return v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->offset:I

    return v0
.end method

.method public final getRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->records:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->offset:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->records:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->offset:I

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->limit:I

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->records:Ljava/util/List;

    const-string v3, ", limit="

    const-string v4, ", records="

    const-string v5, "TeamResponseDto(offset="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toTeamResponse()Lcom/whoop/domain/model/teams/share/TeamResponse;
    .locals 6

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->offset:I

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->limit:I

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->records:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;

    sget-object v5, Lcom/whoop/domain/model/teams/share/SelectTeam;->Companion:Lcom/whoop/domain/model/teams/share/SelectTeam$Companion;

    invoke-virtual {v5, v4}, Lcom/whoop/domain/model/teams/share/SelectTeam$Companion;->fromDto(Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;)Lcom/whoop/domain/model/teams/share/SelectTeam;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/whoop/domain/model/teams/share/TeamResponse;

    invoke-direct {v3, v0, v1, v2}, Lcom/whoop/domain/model/teams/share/TeamResponse;-><init>(IILjava/util/List;)V

    return-object v3
.end method
