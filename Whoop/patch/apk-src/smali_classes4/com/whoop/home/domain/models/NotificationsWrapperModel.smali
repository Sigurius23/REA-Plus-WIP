.class public final Lcom/whoop/home/domain/models/NotificationsWrapperModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/home/domain/models/NotificationsWrapperModel$$serializer;,
        Lcom/whoop/home/domain/models/NotificationsWrapperModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B3\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ<\u0010 \u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010.\u001a\u0004\u0008/\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u00080\u0010\u001e\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/NotificationsWrapperModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/home/domain/models/NotificationsCenterModel;",
        "architectureMiniComponent",
        "Lcom/whoop/design/models/items/AiChatEntryModel;",
        "chatEntryPoint",
        "",
        "replayText",
        "replayIcon",
        "<init>",
        "(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$home_release",
        "(Lcom/whoop/home/domain/models/NotificationsWrapperModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/home/domain/models/NotificationsCenterModel;",
        "component2",
        "()Lcom/whoop/design/models/items/AiChatEntryModel;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "copy",
        "(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/home/domain/models/NotificationsWrapperModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/home/domain/models/NotificationsCenterModel;",
        "getArchitectureMiniComponent",
        "Lcom/whoop/design/models/items/AiChatEntryModel;",
        "getChatEntryPoint",
        "Ljava/lang/String;",
        "getReplayText",
        "getReplayIcon",
        "Companion",
        "$serializer",
        "home_release"
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

.field public static final Companion:Lcom/whoop/home/domain/models/NotificationsWrapperModel$Companion;


# instance fields
.field private final architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

.field private final chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

.field private final replayIcon:Ljava/lang/String;

.field private final replayText:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/home/domain/models/NotificationsWrapperModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/home/domain/models/NotificationsWrapperModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->Companion:Lcom/whoop/home/domain/models/NotificationsWrapperModel$Companion;

    sget v0, Lcom/whoop/design/models/items/AiChatEntryModel;->$stable:I

    sput v0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lyc2/a;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lyc2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->$childSerializers:[Ll83/h;

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

    invoke-direct/range {v0 .. v6}, Lcom/whoop/home/domain/models/NotificationsWrapperModel;-><init>(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x0

    if-nez p6, :cond_0

    iput-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    const-string p3, ""

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    :goto_2
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "replayText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replayIcon"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    .line 5
    iput-object p2, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    .line 6
    iput-object p3, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    .line 8
    const-string v0, ""

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/home/domain/models/NotificationsWrapperModel;-><init>(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lkotlinx/serialization/internal/ObjectSerializer;

    sget-object v1, Lcom/whoop/home/domain/models/NotificationsCenterModel;->INSTANCE:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    const-string v3, "com.whoop.home.domain.models.NotificationsCenterModel"

    invoke-direct {v0, v3, v1, v2}, Lkotlinx/serialization/internal/ObjectSerializer;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/home/domain/models/NotificationsWrapperModel;Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/home/domain/models/NotificationsWrapperModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->copy(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/home/domain/models/NotificationsWrapperModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$home_release(Lcom/whoop/home/domain/models/NotificationsWrapperModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/design/models/items/AiChatEntryModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AiChatEntryModel$$serializer;

    iget-object v2, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :goto_2
    iget-object v1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    :goto_3
    iget-object p0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/home/domain/models/NotificationsCenterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/AiChatEntryModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/home/domain/models/NotificationsWrapperModel;
    .locals 1

    const-string v0, "replayText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replayIcon"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/home/domain/models/NotificationsWrapperModel;-><init>(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/home/domain/models/NotificationsWrapperModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/home/domain/models/NotificationsWrapperModel;

    iget-object v1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    iget-object v3, p1, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    iget-object v3, p1, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getArchitectureMiniComponent()Lcom/whoop/home/domain/models/NotificationsCenterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    return-object v0
.end method

.method public final getChatEntryPoint()Lcom/whoop/design/models/items/AiChatEntryModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    return-object v0
.end method

.method public final getReplayIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getReplayText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/design/models/items/AiChatEntryModel;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->architectureMiniComponent:Lcom/whoop/home/domain/models/NotificationsCenterModel;

    iget-object v1, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->chatEntryPoint:Lcom/whoop/design/models/items/AiChatEntryModel;

    iget-object v2, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayText:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/home/domain/models/NotificationsWrapperModel;->replayIcon:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "NotificationsWrapperModel(architectureMiniComponent="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", chatEntryPoint="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", replayText="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", replayIcon="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
