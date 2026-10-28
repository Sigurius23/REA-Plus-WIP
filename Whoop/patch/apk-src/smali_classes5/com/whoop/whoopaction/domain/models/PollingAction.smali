.class public final Lcom/whoop/whoopaction/domain/models/PollingAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/whoopaction/domain/models/Action;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;,
        Lcom/whoop/whoopaction/domain/models/PollingAction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<;B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBK\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JH\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010(\u001a\u00020\'H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00103\u001a\u0004\u00084\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00086\u0010 R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u00088\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008:\u0010$\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/PollingAction;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "Lcom/whoop/whoopaction/domain/models/Request;",
        "request",
        "",
        "frequencyMillis",
        "timeoutMillis",
        "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;",
        "pollingTreatment",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "onTimeout",
        "<init>",
        "(Lcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whoop_action_release",
        "(Lcom/whoop/whoopaction/domain/models/PollingAction;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/whoopaction/domain/models/Request;",
        "component2",
        "()J",
        "component3",
        "()Ljava/lang/Long;",
        "component4",
        "()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;",
        "component5",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "copy",
        "(Lcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/PollingAction;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/whoopaction/domain/models/Request;",
        "getRequest",
        "J",
        "getFrequencyMillis",
        "Ljava/lang/Long;",
        "getTimeoutMillis",
        "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;",
        "getPollingTreatment",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getOnTimeout",
        "Companion",
        "$serializer",
        "whoop-action_release"
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

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/PollingAction$Companion;


# instance fields
.field private final frequencyMillis:J

.field private final onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

.field private final pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

.field private final request:Lcom/whoop/whoopaction/domain/models/Request;

.field private final timeoutMillis:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whoopaction/domain/models/PollingAction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/PollingAction$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/PollingAction;->Companion:Lcom/whoop/whoopaction/domain/models/PollingAction$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whoopaction/domain/models/PollingAction;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;

    invoke-virtual {p8}, Lcom/whoop/whoopaction/domain/models/PollingAction$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    iput-wide p3, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->frequencyMillis:J

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    :goto_1
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    return-void

    :cond_3
    iput-object p7, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    .line 4
    iput-wide p2, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->frequencyMillis:J

    .line 5
    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

    .line 6
    iput-object p5, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    .line 7
    iput-object p6, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_2

    move-object p7, v0

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move-wide p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p7, p6

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/whoop/whoopaction/domain/models/PollingAction;-><init>(Lcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whoopaction/domain/models/PollingAction;Lcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/PollingAction;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-wide p2, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->frequencyMillis:J

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p4, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p5, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget-object p6, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_4
    move-object p7, p5

    move-object p8, p6

    move-object p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/whoopaction/domain/models/PollingAction;->copy(Lcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/PollingAction;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$whoop_action_release(Lcom/whoop/whoopaction/domain/models/PollingAction;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/whoopaction/domain/models/Request$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/Request$$serializer;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->frequencyMillis:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/whoopaction/domain/models/LoadingTreatment$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/LoadingTreatment$$serializer;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/whoopaction/domain/models/Request;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->frequencyMillis:J

    return-wide v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(Lcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/PollingAction;
    .locals 8

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whoopaction/domain/models/PollingAction;

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/whoopaction/domain/models/PollingAction;-><init>(Lcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whoopaction/domain/models/PollingAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whoopaction/domain/models/PollingAction;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/PollingAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->frequencyMillis:J

    iget-wide v5, p1, Lcom/whoop/whoopaction/domain/models/PollingAction;->frequencyMillis:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getFrequencyMillis()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->frequencyMillis:J

    return-wide v0
.end method

.method public final getOnTimeout()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getPollingTreatment()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    return-object v0
.end method

.method public final getRequest()Lcom/whoop/whoopaction/domain/models/Request;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    return-object v0
.end method

.method public final getTimeoutMillis()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    invoke-virtual {v0}, Lcom/whoop/whoopaction/domain/models/Request;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->frequencyMillis:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

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

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/LoadingTreatment;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    iget-wide v1, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->frequencyMillis:J

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->timeoutMillis:Ljava/lang/Long;

    iget-object v4, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->pollingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    iget-object v5, p0, Lcom/whoop/whoopaction/domain/models/PollingAction;->onTimeout:Lcom/whoop/navigation/models/GenericInteraction;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "PollingAction(request="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", frequencyMillis="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", timeoutMillis="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollingTreatment="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onTimeout="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
