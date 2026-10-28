.class public final Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto$$serializer;,
        Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B#\u0008\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\tJ\'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001f\u001a\u0004\u0008 \u0010\u0014\u00a8\u0006$"
    }
    d2 = {
        "Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;",
        "",
        "",
        "defaultWakeWindowMinutes",
        "<init>",
        "(I)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$smart_alarm_release",
        "(Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "copy",
        "(I)Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getDefaultWakeWindowMinutes",
        "Companion",
        "$serializer",
        "a",
        "smart-alarm_release"
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

.field public static final Companion:Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto$a;


# instance fields
.field private final defaultWakeWindowMinutes:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "default_wake_window_minutes"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->Companion:Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto$a;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->defaultWakeWindowMinutes:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 3
    sget-object p3, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto$$serializer;->INSTANCE:Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto$$serializer;

    invoke-virtual {p3}, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->defaultWakeWindowMinutes:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;IILjava/lang/Object;)Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->defaultWakeWindowMinutes:I

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->copy(I)Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$smart_alarm_release(Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;Lzc3/c;Lyc3/g;)V
    .locals 1

    const/4 v0, 0x0

    iget p0, p0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->defaultWakeWindowMinutes:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->defaultWakeWindowMinutes:I

    return v0
.end method

.method public final copy(I)Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;
    .locals 1

    new-instance v0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;

    invoke-direct {v0, p1}, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;-><init>(I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;

    iget v1, p0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->defaultWakeWindowMinutes:I

    iget p1, p1, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->defaultWakeWindowMinutes:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getDefaultWakeWindowMinutes()I
    .locals 1

    iget v0, p0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->defaultWakeWindowMinutes:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->defaultWakeWindowMinutes:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;->defaultWakeWindowMinutes:I

    const-string v1, "DefaultWakeWindowDto(defaultWakeWindowMinutes="

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
