.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B%\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB=\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J4\u0010!\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010$\u001a\u00020#H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001eJ\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u0008.\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00080\u0010 \u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;",
        "",
        "",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;",
        "questions",
        "",
        "sessionId",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;",
        "config",
        "<init>",
        "(Ljava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lvy2/b;",
        "toDomain",
        "()Lvy2/b;",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()I",
        "component3",
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;",
        "copy",
        "(Ljava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getQuestions",
        "I",
        "getSessionId",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;",
        "getConfig",
        "Companion",
        "$serializer",
        "whooplabs_release"
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

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse$Companion;


# instance fields
.field private final config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

.field private final questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;",
            ">;"
        }
    .end annotation
.end field

.field private final sessionId:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldq2/a;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Ldq2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse$$serializer;

    invoke-virtual {p5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->questions:Ljava/util/List;

    iput p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->sessionId:I

    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;",
            ">;I",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;",
            ")V"
        }
    .end annotation

    const-string v0, "questions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->questions:Ljava/util/List;

    .line 4
    iput p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->sessionId:I

    .line 5
    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;Ljava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->questions:Ljava/util/List;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->sessionId:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->copy(Ljava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->questions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->sessionId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$$serializer;

    iget-object p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->questions:Ljava/util/List;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->sessionId:I

    return v0
.end method

.method public final component3()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    return-object v0
.end method

.method public final copy(Ljava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;",
            ">;I",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;",
            ")",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;"
        }
    .end annotation

    const-string v0, "questions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;-><init>(Ljava/util/List;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->questions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->questions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->sessionId:I

    iget v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->sessionId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    return-object v0
.end method

.method public final getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->questions:Ljava/util/List;

    return-object v0
.end method

.method public final getSessionId()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->sessionId:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->questions:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->sessionId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toDomain()Lvy2/b;
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->questions:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningQuestionDto;->toDomain()Lvy2/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->sessionId:I

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;->toDomain()Lvy2/c;

    move-result-object v2

    new-instance v3, Lvy2/b;

    invoke-direct {v3, v1, v0, v2}, Lvy2/b;-><init>(Ljava/util/List;ILvy2/c;)V

    return-object v3
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->questions:Ljava/util/List;

    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->sessionId:I

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CampaignScreeningResponse(questions="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sessionId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", config="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
