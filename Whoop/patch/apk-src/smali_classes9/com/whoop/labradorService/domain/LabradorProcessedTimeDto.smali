.class public final Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto$$serializer;,
        Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0081\u0008\u0018\u0000 %2\u00020\u0001:\u0002&\'B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010!\u0012\u0004\u0008#\u0010$\u001a\u0004\u0008\"\u0010\u0015\u00a8\u0006("
    }
    d2 = {
        "Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;",
        "",
        "",
        "millis",
        "<init>",
        "(Ljava/lang/Long;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$labrador_service_release",
        "(Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/Long;",
        "copy",
        "(Ljava/lang/Long;)Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Long;",
        "getMillis",
        "getMillis$annotations",
        "()V",
        "Companion",
        "$serializer",
        "a",
        "labrador-service_release"
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
.field public static final Companion:Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto$a;


# instance fields
.field private final millis:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "latest_metrics_processed"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->Companion:Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 1
    sget-object p3, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto$$serializer;->INSTANCE:Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto$$serializer;

    invoke-virtual {p3}, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->millis:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->millis:Ljava/lang/Long;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->millis:Ljava/lang/Long;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->copy(Ljava/lang/Long;)Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getMillis$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "latest_metrics_processed"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$labrador_service_release(Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;Lzc3/c;Lyc3/g;)V
    .locals 2

    sget-object v0, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object p0, p0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->millis:Ljava/lang/Long;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->millis:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Ljava/lang/Long;)Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;
    .locals 1

    new-instance v0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;

    invoke-direct {v0, p1}, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;-><init>(Ljava/lang/Long;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;

    iget-object v1, p0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->millis:Ljava/lang/Long;

    iget-object p1, p1, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->millis:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMillis()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->millis:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->millis:Ljava/lang/Long;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;->millis:Ljava/lang/Long;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "LabradorProcessedTimeDto(millis="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
