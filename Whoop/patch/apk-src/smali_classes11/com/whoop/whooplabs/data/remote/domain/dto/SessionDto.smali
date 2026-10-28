.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\tJ\'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010#\u001a\u0004\u0008$\u0010\u0017\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;",
        "",
        "",
        "campaignSessionId",
        "<init>",
        "(Ljava/lang/Integer;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/whooplabs/data/domain/LabsSession;",
        "toLabsSession",
        "()Lcom/whoop/whooplabs/data/domain/LabsSession;",
        "component1",
        "()Ljava/lang/Integer;",
        "copy",
        "(Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Integer;",
        "getCampaignSessionId",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto$Companion;


# instance fields
.field private final campaignSessionId:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 1
    sget-object p3, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto$$serializer;

    invoke-virtual {p3}, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->campaignSessionId:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->campaignSessionId:Ljava/lang/Integer;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->campaignSessionId:Ljava/lang/Integer;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->copy(Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Lzc3/c;Lyc3/g;)V
    .locals 2

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->campaignSessionId:Ljava/lang/Integer;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->campaignSessionId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    invoke-direct {v0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;-><init>(Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->campaignSessionId:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->campaignSessionId:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getCampaignSessionId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->campaignSessionId:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->campaignSessionId:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toLabsSession()Lcom/whoop/whooplabs/data/domain/LabsSession;
    .locals 2

    new-instance v0, Lcom/whoop/whooplabs/data/domain/LabsSession;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->campaignSessionId:Ljava/lang/Integer;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/domain/LabsSession;-><init>(I)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;->campaignSessionId:Ljava/lang/Integer;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SessionDto(campaignSessionId="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
