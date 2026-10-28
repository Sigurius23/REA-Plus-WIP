.class public final Lcom/whoop/activation/domain/models/steps/PaymentOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;,
        Lcom/whoop/activation/domain/models/steps/PaymentOptions$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBc\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JZ\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00062\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00081\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00082\u0010\u001eR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010\"R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00085\u0010\"R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00106\u001a\u0004\u00087\u0010%\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/activation/domain/models/steps/PaymentOptions;",
        "",
        "",
        "title",
        "existingLabel",
        "alternateLabel",
        "",
        "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;",
        "textEntries",
        "Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;",
        "acceptedPaymentTypes",
        "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;",
        "errorMessages",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$activation_release",
        "(Lcom/whoop/activation/domain/models/steps/PaymentOptions;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "()Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;)Lcom/whoop/activation/domain/models/steps/PaymentOptions;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getExistingLabel",
        "getAlternateLabel",
        "Ljava/util/List;",
        "getTextEntries",
        "getAcceptedPaymentTypes",
        "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;",
        "getErrorMessages",
        "Companion",
        "$serializer",
        "activation_release"
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

.field public static final Companion:Lcom/whoop/activation/domain/models/steps/PaymentOptions$Companion;


# instance fields
.field private final acceptedPaymentTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;",
            ">;"
        }
    .end annotation
.end field

.field private final alternateLabel:Ljava/lang/String;

.field private final errorMessages:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

.field private final existingLabel:Ljava/lang/String;

.field private final textEntries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/activation/domain/models/steps/PaymentOptions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/activation/domain/models/steps/PaymentOptions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->Companion:Lcom/whoop/activation/domain/models/steps/PaymentOptions$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lr70/a;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Lr70/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lr70/a;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Lr70/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x6

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v2, v3, v4

    const/4 v2, 0x4

    aput-object v0, v3, v2

    const/4 v0, 0x5

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;

    invoke-virtual {p8}, Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->existingLabel:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->alternateLabel:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->textEntries:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->acceptedPaymentTypes:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->errorMessages:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;",
            ">;",
            "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alternateLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textEntries"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptedPaymentTypes"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessages"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->existingLabel:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->alternateLabel:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->textEntries:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->acceptedPaymentTypes:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->errorMessages:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;ILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/PaymentOptions;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->existingLabel:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->alternateLabel:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->textEntries:Ljava/util/List;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->acceptedPaymentTypes:Ljava/util/List;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->errorMessages:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;)Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$activation_release(Lcom/whoop/activation/domain/models/steps/PaymentOptions;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->existingLabel:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->alternateLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->textEntries:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->acceptedPaymentTypes:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages$$serializer;

    iget-object p0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->errorMessages:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->existingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->alternateLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->textEntries:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->acceptedPaymentTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->errorMessages:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;)Lcom/whoop/activation/domain/models/steps/PaymentOptions;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;",
            ">;",
            "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;",
            ")",
            "Lcom/whoop/activation/domain/models/steps/PaymentOptions;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alternateLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textEntries"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptedPaymentTypes"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessages"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->existingLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->existingLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->alternateLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->alternateLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->textEntries:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->textEntries:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->acceptedPaymentTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->acceptedPaymentTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->errorMessages:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    iget-object p1, p1, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->errorMessages:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAcceptedPaymentTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->acceptedPaymentTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getAlternateLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->alternateLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorMessages()Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->errorMessages:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    return-object v0
.end method

.method public final getExistingLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->existingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextEntries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->textEntries:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->existingLabel:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->alternateLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->textEntries:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->acceptedPaymentTypes:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->errorMessages:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->existingLabel:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->alternateLabel:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->textEntries:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->acceptedPaymentTypes:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->errorMessages:Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;

    const-string v6, ", existingLabel="

    const-string v7, ", alternateLabel="

    const-string v8, "PaymentOptions(title="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", textEntries="

    const-string v6, ", acceptedPaymentTypes="

    invoke-static {v2, v1, v6, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorMessages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
