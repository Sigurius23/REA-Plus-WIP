.class public final Lcom/whoop/navigation/HealthMonitorScreenModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/navigation/CommonNavigationScreenModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/HealthMonitorScreenModel$$serializer;,
        Lcom/whoop/navigation/HealthMonitorScreenModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000212B7\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBC\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ@\u0010\u001f\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010$H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010+\u001a\u0004\u0008-\u0010\u001bR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u0008/\u0010\u001e\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/navigation/HealthMonitorScreenModel;",
        "Lcom/whoop/navigation/CommonNavigationScreenModel;",
        "",
        "initialHr",
        "",
        "initialHrZone",
        "source",
        "Lcom/whoop/navigation/AiAction;",
        "aiAction",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$navigation_release",
        "(Lcom/whoop/navigation/HealthMonitorScreenModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/Integer;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Lcom/whoop/navigation/AiAction;",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/HealthMonitorScreenModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Integer;",
        "getInitialHr",
        "Ljava/lang/String;",
        "getInitialHrZone",
        "getSource",
        "Lcom/whoop/navigation/AiAction;",
        "getAiAction",
        "Companion",
        "$serializer",
        "a",
        "navigation_release"
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

.field public static final Companion:Lcom/whoop/navigation/HealthMonitorScreenModel$a;


# instance fields
.field private final aiAction:Lcom/whoop/navigation/AiAction;

.field private final initialHr:Ljava/lang/Integer;

.field private final initialHrZone:Ljava/lang/String;

.field private final source:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/navigation/HealthMonitorScreenModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/HealthMonitorScreenModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/HealthMonitorScreenModel;->Companion:Lcom/whoop/navigation/HealthMonitorScreenModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/HealthMonitorScreenModel;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/navigation/HealthMonitorScreenModel;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x0

    if-nez p6, :cond_0

    iput-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 3
    const-string p2, ""

    .line 4
    iput-object p2, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    :goto_2
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 7
    const-string p3, ""

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/navigation/HealthMonitorScreenModel;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/navigation/HealthMonitorScreenModel;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lcom/whoop/navigation/HealthMonitorScreenModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/navigation/HealthMonitorScreenModel;->copy(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/HealthMonitorScreenModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$navigation_release(Lcom/whoop/navigation/HealthMonitorScreenModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/navigation/AiAction$$serializer;->INSTANCE:Lcom/whoop/navigation/AiAction$$serializer;

    iget-object p0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/HealthMonitorScreenModel;
    .locals 1

    new-instance v0, Lcom/whoop/navigation/HealthMonitorScreenModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/navigation/HealthMonitorScreenModel;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/navigation/HealthMonitorScreenModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/navigation/HealthMonitorScreenModel;

    iget-object v1, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    iget-object p1, p1, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAiAction()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final getInitialHr()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getInitialHrZone()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/navigation/AiAction;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHr:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->initialHrZone:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->source:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/navigation/HealthMonitorScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    const-string v4, ", initialHrZone="

    const-string v5, ", source="

    const-string v6, "HealthMonitorScreenModel(initialHr="

    invoke-static {v6, v4, v0, v1, v5}, Lr80/c;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", aiAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
