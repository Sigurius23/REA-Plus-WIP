.class public final Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010#\u001a\u0004\u0008$\u0010\u0018\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;",
        "",
        "",
        "alarmTriggered",
        "<init>",
        "(Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTrigger;",
        "toPollingSmartAlarmTrigger",
        "()Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTrigger;",
        "component1",
        "()Ljava/lang/Boolean;",
        "copy",
        "(Ljava/lang/Boolean;)Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Boolean;",
        "getAlarmTriggered",
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto$Companion;


# instance fields
.field private final alarmTriggered:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alarm_triggered"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->Companion:Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 1
    sget-object p3, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto$$serializer;

    invoke-virtual {p3}, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->alarmTriggered:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->alarmTriggered:Ljava/lang/Boolean;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->alarmTriggered:Ljava/lang/Boolean;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->copy(Ljava/lang/Boolean;)Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;Lzc3/c;Lyc3/g;)V
    .locals 2

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->alarmTriggered:Ljava/lang/Boolean;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->alarmTriggered:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/Boolean;)Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;
    .locals 1

    new-instance v0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;

    invoke-direct {v0, p1}, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;-><init>(Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->alarmTriggered:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->alarmTriggered:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getAlarmTriggered()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->alarmTriggered:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->alarmTriggered:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toPollingSmartAlarmTrigger()Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTrigger;
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTrigger;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->alarmTriggered:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTrigger;-><init>(Z)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;->alarmTriggered:Ljava/lang/Boolean;

    const-string v1, "PollingSmartAlarmTriggerDto(alarmTriggered="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Lte0/d;->j(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
