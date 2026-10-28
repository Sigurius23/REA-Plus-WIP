.class public final Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse$$serializer;,
        Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B\'\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010\u001cR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u0008/\u0010\u001e\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;",
        "",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "initialPregnancyScreen",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;",
        "congratulationsScreen",
        "",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;",
        "screens",
        "<init>",
        "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "component2",
        "()Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;",
        "component3",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "getInitialPregnancyScreen",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;",
        "getCongratulationsScreen",
        "Ljava/util/List;",
        "getScreens",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse$Companion;


# instance fields
.field private final congratulationsScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;

.field private final initialPregnancyScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

.field private final screens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lgp1/a;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lgp1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lgp1/a;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lgp1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x3

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v1, v3, v2

    const/4 v1, 0x2

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse$$serializer;

    invoke-virtual {p5}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->initialPregnancyScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->congratulationsScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->screens:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;",
            ">;)V"
        }
    .end annotation

    const-string v0, "congratulationsScreen"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screens"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->initialPregnancyScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->congratulationsScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->screens:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId"

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lzn1/a;->a:Lzn1/a;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->initialPregnancyScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->congratulationsScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->screens:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->copy(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->initialPregnancyScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen$$serializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->congratulationsScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->screens:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->initialPregnancyScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-object v0
.end method

.method public final component2()Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->congratulationsScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->screens:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;",
            ">;)",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;"
        }
    .end annotation

    const-string v0, "congratulationsScreen"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screens"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->initialPregnancyScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->initialPregnancyScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->congratulationsScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->congratulationsScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->screens:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->screens:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCongratulationsScreen()Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->congratulationsScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;

    return-object v0
.end method

.method public final getInitialPregnancyScreen()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->initialPregnancyScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-object v0
.end method

.method public final getScreens()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->screens:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->initialPregnancyScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->congratulationsScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->screens:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->initialPregnancyScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->congratulationsScreen:Lcom/whoop/hormonalinsights/postpartum/domain/models/CongratulationsScreen;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;->screens:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PostPartumResponse(initialPregnancyScreen="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", congratulationsScreen="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", screens="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
