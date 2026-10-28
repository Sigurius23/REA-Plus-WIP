.class public final Lcom/whoop/navigation/models/GenericInteraction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/models/GenericInteraction$$serializer;,
        Lcom/whoop/navigation/models/GenericInteraction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221BC\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tBM\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019JL\u0010\u001e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010)\u001a\u0004\u0008+\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008,\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008-\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010)\u001a\u0004\u0008.\u0010\u0019R\u0011\u0010/\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\u0008/\u00100\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "navigation",
        "modal",
        "action",
        "dismissEvent",
        "analyticEvent",
        "<init>",
        "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$navigation_release",
        "(Lcom/whoop/navigation/models/GenericInteraction;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lkotlinx/serialization/json/JsonElement;",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/navigation/models/GenericInteraction;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lkotlinx/serialization/json/JsonElement;",
        "getNavigation",
        "getModal",
        "getAction",
        "getDismissEvent",
        "getAnalyticEvent",
        "isEmpty",
        "()Z",
        "Companion",
        "$serializer",
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

.field public static final Companion:Lcom/whoop/navigation/models/GenericInteraction$Companion;


# instance fields
.field private final action:Lkotlinx/serialization/json/JsonElement;

.field private final analyticEvent:Lkotlinx/serialization/json/JsonElement;

.field private final dismissEvent:Lkotlinx/serialization/json/JsonElement;

.field private final modal:Lkotlinx/serialization/json/JsonElement;

.field private final navigation:Lkotlinx/serialization/json/JsonElement;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/navigation/models/GenericInteraction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/models/GenericInteraction$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/models/GenericInteraction;->Companion:Lcom/whoop/navigation/models/GenericInteraction$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/navigation/models/GenericInteraction;-><init>(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x0

    if-nez p7, :cond_0

    iput-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    return-void
.end method

.method public constructor <init>(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    .line 5
    iput-object p2, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    .line 6
    iput-object p3, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    .line 7
    iput-object p4, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    .line 8
    iput-object p5, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p6, p5

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/navigation/models/GenericInteraction;-><init>(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;ILjava/lang/Object;)Lcom/whoop/navigation/models/GenericInteraction;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/navigation/models/GenericInteraction;->copy(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$navigation_release(Lcom/whoop/navigation/models/GenericInteraction;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lad3/n;->a:Lad3/n;

    iget-object v2, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lad3/n;->a:Lad3/n;

    iget-object v2, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lad3/n;->a:Lad3/n;

    iget-object v2, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lad3/n;->a:Lad3/n;

    iget-object v2, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lad3/n;->a:Lad3/n;

    iget-object p0, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final component2()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final component3()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final component4()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final component5()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final copy(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/navigation/models/GenericInteraction;
    .locals 6

    new-instance v0, Lcom/whoop/navigation/models/GenericInteraction;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/navigation/models/GenericInteraction;-><init>(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v1, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    iget-object v3, p1, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    iget-object v3, p1, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    iget-object v3, p1, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    iget-object v3, p1, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    iget-object p1, p1, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAction()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final getAnalyticEvent()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final getDismissEvent()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final getModal()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final getNavigation()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/navigation/models/GenericInteraction;->navigation:Lkotlinx/serialization/json/JsonElement;

    iget-object v1, p0, Lcom/whoop/navigation/models/GenericInteraction;->modal:Lkotlinx/serialization/json/JsonElement;

    iget-object v2, p0, Lcom/whoop/navigation/models/GenericInteraction;->action:Lkotlinx/serialization/json/JsonElement;

    iget-object v3, p0, Lcom/whoop/navigation/models/GenericInteraction;->dismissEvent:Lkotlinx/serialization/json/JsonElement;

    iget-object v4, p0, Lcom/whoop/navigation/models/GenericInteraction;->analyticEvent:Lkotlinx/serialization/json/JsonElement;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "GenericInteraction(navigation="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", modal="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", action="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dismissEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
