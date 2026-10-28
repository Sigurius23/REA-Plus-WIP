.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000232B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J4\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010*\u001a\u00020\u00192\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001dR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u0008/\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00100\u001a\u0004\u00081\u0010!\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;",
        "",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;",
        "config",
        "",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
        "steps",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;",
        "session",
        "<init>",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "",
        "isStrapRequired",
        "()Z",
        "component1",
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;",
        "copy",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;",
        "getConfig",
        "Ljava/util/List;",
        "getSteps",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;",
        "getSession",
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

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse$Companion;


# instance fields
.field private final config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

.field private final session:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

.field private final steps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldx2/a;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ldx2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse$$serializer;

    invoke-virtual {p5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->steps:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
            ">;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;",
            ")V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "steps"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    .line 4
    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->steps:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->steps:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->copy(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->steps:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse$$serializer;

    iget-object p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->steps:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

    return-object v0
.end method

.method public final copy(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
            ">;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;",
            ")",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "steps"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->steps:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->steps:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    return-object v0
.end method

.method public final getSession()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

    return-object v0
.end method

.method public final getSteps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->steps:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->steps:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isStrapRequired()Z
    .locals 7

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->getDataTypes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "toLowerCase(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "raw_data"

    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "ppg_data"

    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "imu_data"

    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "labrador"

    invoke-static {v1, v3, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    :goto_0
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->config:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->steps:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->session:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CampaignStepsScreenResponse(config="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", steps="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", session="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
