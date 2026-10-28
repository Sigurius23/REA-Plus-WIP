.class public final Lcom/whoop/data/remote/domain/dto/StrainDataDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/StrainDataDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/StrainDataDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B)\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nB=\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010\u001cR\"\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u0008/\u0010\u001e\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/StrainDataDto;",
        "",
        "Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;",
        "optimalStrain",
        "",
        "scaledStrain",
        "",
        "Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;",
        "optimalStrainMapping",
        "<init>",
        "(Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/StrainDataDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;",
        "component2",
        "()D",
        "component3",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;)Lcom/whoop/data/remote/domain/dto/StrainDataDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;",
        "getOptimalStrain",
        "D",
        "getScaledStrain",
        "Ljava/util/List;",
        "getOptimalStrainMapping",
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

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/StrainDataDto$Companion;


# instance fields
.field private final optimalStrain:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "optimal_strain"
    .end annotation
.end field

.field private final optimalStrainMapping:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "optimal_strain_mapping"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;",
            ">;"
        }
    .end annotation
.end field

.field private final scaledStrain:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "scaled_strain"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/dto/StrainDataDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/StrainDataDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->Companion:Lcom/whoop/data/remote/domain/dto/StrainDataDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lvw0/a;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lvw0/a;-><init>(I)V

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

    sput-object v2, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/data/remote/domain/dto/StrainDataDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/StrainDataDto$$serializer;

    invoke-virtual {p6}, Lcom/whoop/data/remote/domain/dto/StrainDataDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrain:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;

    iput-wide p3, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->scaledStrain:D

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrainMapping:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;",
            "D",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrain:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;

    .line 4
    iput-wide p2, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->scaledStrain:D

    .line 5
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrainMapping:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/StrainDataDto;Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/StrainDataDto;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrain:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-wide p2, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->scaledStrain:D

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrainMapping:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->copy(Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;)Lcom/whoop/data/remote/domain/dto/StrainDataDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/StrainDataDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto$$serializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrain:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->scaledStrain:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrainMapping:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrain:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->scaledStrain:D

    return-wide v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrainMapping:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;)Lcom/whoop/data/remote/domain/dto/StrainDataDto;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;",
            "D",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;",
            ">;)",
            "Lcom/whoop/data/remote/domain/dto/StrainDataDto;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/data/remote/domain/dto/StrainDataDto;-><init>(Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/StrainDataDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/StrainDataDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrain:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrain:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->scaledStrain:D

    iget-wide v5, p1, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->scaledStrain:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrainMapping:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrainMapping:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getOptimalStrain()Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrain:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;

    return-object v0
.end method

.method public final getOptimalStrainMapping()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrainMapping:Ljava/util/List;

    return-object v0
.end method

.method public final getScaledStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->scaledStrain:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrain:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-wide v3, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->scaledStrain:D

    invoke-static {v0, v2, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrainMapping:Ljava/util/List;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrain:Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;

    iget-wide v1, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->scaledStrain:D

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->optimalStrainMapping:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "StrainDataDto(optimalStrain="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scaledStrain="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", optimalStrainMapping="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
