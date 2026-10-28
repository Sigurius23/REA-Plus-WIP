.class public final Lcom/whoop/ai/chat/models/TurnFeedback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ai/chat/models/TurnFeedback$$serializer;,
        Lcom/whoop/ai/chat/models/TurnFeedback$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 -2\u00020\u0001:\u0002./B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB9\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0010\u0010!\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u0008,\u0010\u001d\u00a8\u00060"
    }
    d2 = {
        "Lcom/whoop/ai/chat/models/TurnFeedback;",
        "",
        "",
        "turnId",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "typeSelected",
        "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
        "feedback",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/ai/chat/models/TurnFeedback;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "component3",
        "()Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)Lcom/whoop/ai/chat/models/TurnFeedback;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTurnId",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "getTypeSelected",
        "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
        "getFeedback",
        "Companion",
        "$serializer",
        "a",
        "bot_release"
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

.field public static final Companion:Lcom/whoop/ai/chat/models/TurnFeedback$a;


# instance fields
.field private final feedback:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

.field private final turnId:Ljava/lang/String;

.field private final typeSelected:Lcom/whoop/bot/models/feedback/AiFeedbackType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/ai/chat/models/TurnFeedback$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ai/chat/models/TurnFeedback$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ai/chat/models/TurnFeedback;->Companion:Lcom/whoop/ai/chat/models/TurnFeedback$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ai/chat/models/TurnFeedback;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lxa1/a;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lxa1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/ai/chat/models/TurnFeedback;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/ai/chat/models/TurnFeedback$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/TurnFeedback$$serializer;

    invoke-virtual {p5}, Lcom/whoop/ai/chat/models/TurnFeedback$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->turnId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->typeSelected:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iput-object p4, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->feedback:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V
    .locals 1

    const-string v0, "turnId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeSelected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->turnId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->typeSelected:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    .line 5
    iput-object p3, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->feedback:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->Companion:Lcom/whoop/bot/models/feedback/AiFeedbackType$Companion;

    invoke-virtual {v0}, Lcom/whoop/bot/models/feedback/AiFeedbackType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/ai/chat/models/TurnFeedback;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/ai/chat/models/TurnFeedback;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/ai/chat/models/TurnFeedback;Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ILjava/lang/Object;)Lcom/whoop/ai/chat/models/TurnFeedback;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->turnId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->typeSelected:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->feedback:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/ai/chat/models/TurnFeedback;->copy(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)Lcom/whoop/ai/chat/models/TurnFeedback;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/ai/chat/models/TurnFeedback;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/ai/chat/models/TurnFeedback;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->turnId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->typeSelected:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/bot/models/feedback/AiMessageFeedback$$serializer;->INSTANCE:Lcom/whoop/bot/models/feedback/AiMessageFeedback$$serializer;

    iget-object p0, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->feedback:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->turnId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/bot/models/feedback/AiFeedbackType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->typeSelected:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    return-object v0
.end method

.method public final component3()Lcom/whoop/bot/models/feedback/AiMessageFeedback;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->feedback:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)Lcom/whoop/ai/chat/models/TurnFeedback;
    .locals 1

    const-string v0, "turnId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeSelected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/ai/chat/models/TurnFeedback;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/ai/chat/models/TurnFeedback;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/ai/chat/models/TurnFeedback;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/ai/chat/models/TurnFeedback;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->turnId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/TurnFeedback;->turnId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->typeSelected:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/TurnFeedback;->typeSelected:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->feedback:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    iget-object p1, p1, Lcom/whoop/ai/chat/models/TurnFeedback;->feedback:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getFeedback()Lcom/whoop/bot/models/feedback/AiMessageFeedback;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->feedback:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    return-object v0
.end method

.method public final getTurnId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->turnId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeSelected()Lcom/whoop/bot/models/feedback/AiFeedbackType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->typeSelected:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->turnId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->typeSelected:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->feedback:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    invoke-virtual {v0}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->turnId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->typeSelected:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/TurnFeedback;->feedback:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "TurnFeedback(turnId="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", typeSelected="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", feedback="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
